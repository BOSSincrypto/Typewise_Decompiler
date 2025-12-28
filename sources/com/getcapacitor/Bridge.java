package com.getcapacitor;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.activity.result.b;
import androidx.activity.result.c;
import androidx.appcompat.app.C0370d;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.getcapacitor.ServerPath;
import com.getcapacitor.android.R;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import com.getcapacitor.plugin.CapacitorCookies;
import com.getcapacitor.plugin.CapacitorHttp;
import com.getcapacitor.util.HostMask;
import com.getcapacitor.util.PermissionHelper;
import com.getcapacitor.util.WebColor;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m.C0796a;
import org.apache.cordova.ConfigXmlParser;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.PluginManager;
import org.json.JSONException;

public class Bridge {
    private static final String BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY = "capacitorLastActivityPluginMethod";
    private static final String BUNDLE_LAST_PLUGIN_ID_KEY = "capacitorLastActivityPluginId";
    private static final String BUNDLE_PLUGIN_CALL_BUNDLE_KEY = "capacitorLastPluginCallBundle";
    private static final String BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY = "capacitorLastPluginCallOptions";
    public static final String CAPACITOR_CONTENT_START = "/_capacitor_content_";
    public static final String CAPACITOR_FILE_START = "/_capacitor_file_";
    public static final String CAPACITOR_HTTPS_SCHEME = "https";
    public static final String CAPACITOR_HTTP_SCHEME = "http";
    public static final int DEFAULT_ANDROID_WEBVIEW_VERSION = 60;
    public static final String DEFAULT_WEB_ASSET_DIR = "public";
    private static final String LAST_BINARY_VERSION_CODE = "lastBinaryVersionCode";
    private static final String LAST_BINARY_VERSION_NAME = "lastBinaryVersionName";
    private static final String MINIMUM_ANDROID_WEBVIEW_ERROR = "System WebView is not supported";
    public static final int MINIMUM_ANDROID_WEBVIEW_VERSION = 55;
    private static final String PERMISSION_PREFS_NAME = "PluginPermStates";
    private static final String PREFS_NAME = "CapacitorSettings";
    private Set<String> allowedOriginRules;
    private App app;
    private HostMask appAllowNavigationMask;
    private String appUrl;
    private String appUrlConfig;
    private ArrayList<String> authorities;
    private CapConfig config;
    private final C0370d context;
    public final MockCordovaInterfaceImpl cordovaInterface;
    private CordovaWebView cordovaWebView;
    private final Fragment fragment;
    private final HandlerThread handlerThread;
    private final List<Class<? extends Plugin>> initialPlugins;
    private Uri intentUri;
    private WebViewLocalServer localServer;
    private String localUrl;
    private final MessageHandler msgHandler;
    private PluginCall pluginCallForLastActivity;
    private final List<Plugin> pluginInstances;
    private Map<String, PluginHandle> plugins;
    private CordovaPreferences preferences;
    private RouteProcessor routeProcessor;
    private Map<String, PluginCall> savedCalls;
    private Map<String, LinkedList<String>> savedPermissionCallIds;
    private ServerPath serverPath;
    private Handler taskHandler;
    private final WebView webView;
    private BridgeWebViewClient webViewClient;
    private List<WebViewListener> webViewListeners;

    private JSInjector getJSInjector() {
        try {
            String globalJS = JSExport.getGlobalJS(this.context, this.config.isLoggingEnabled(), isDevMode());
            String bridgeJS = JSExport.getBridgeJS(this.context);
            String pluginJS = JSExport.getPluginJS(this.plugins.values());
            String cordovaJS = JSExport.getCordovaJS(this.context);
            String cordovaPluginJS = JSExport.getCordovaPluginJS(this.context);
            String cordovaPluginsFileJS = JSExport.getCordovaPluginsFileJS(this.context);
            return new JSInjector(globalJS, bridgeJS, pluginJS, cordovaJS, cordovaPluginJS, cordovaPluginsFileJS, "window.WEBVIEW_SERVER_URL = '" + this.localUrl + "';");
        } catch (Exception e4) {
            Logger.error("Unable to export Capacitor JS. App will not function!", e4);
            return null;
        }
    }

    private String getLegacyPluginName(Class<? extends Plugin> cls) {
        NativePlugin nativePlugin = (NativePlugin) cls.getAnnotation(NativePlugin.class);
        if (nativePlugin != null) {
            return nativePlugin.name();
        }
        Logger.error("Plugin doesn't have the @CapacitorPlugin annotation. Please add it");
        return null;
    }

    private void initWebView() {
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (this.config.isMixedContentAllowed()) {
            settings.setMixedContentMode(0);
        }
        String appendedUserAgentString = this.config.getAppendedUserAgentString();
        if (appendedUserAgentString != null) {
            settings.setUserAgentString(settings.getUserAgentString() + " " + appendedUserAgentString);
        }
        String overriddenUserAgentString = this.config.getOverriddenUserAgentString();
        if (overriddenUserAgentString != null) {
            settings.setUserAgentString(overriddenUserAgentString);
        }
        String backgroundColor = this.config.getBackgroundColor();
        if (backgroundColor != null) {
            try {
                this.webView.setBackgroundColor(WebColor.parseColor(backgroundColor));
            } catch (IllegalArgumentException unused) {
                Logger.debug("WebView background color not applied");
            }
        }
        if (this.config.isInitialFocus()) {
            this.webView.requestFocusFromTouch();
        }
        WebView.setWebContentsDebuggingEnabled(this.config.isWebContentsDebuggingEnabled());
        this.appUrlConfig = getServerUrl();
        String host = getHost();
        this.authorities.add(host);
        String scheme = getScheme();
        String str = scheme + "://" + host;
        this.localUrl = str;
        if (this.appUrlConfig != null) {
            try {
                this.authorities.add(new URL(this.appUrlConfig).getAuthority());
                String str2 = this.appUrlConfig;
                this.localUrl = str2;
                this.appUrl = str2;
            } catch (Exception e4) {
                Logger.error("Provided server url is invalid: " + e4.getMessage());
                return;
            }
        } else {
            this.appUrl = str;
            if (!scheme.equals(CAPACITOR_HTTP_SCHEME) && !scheme.equals(CAPACITOR_HTTPS_SCHEME)) {
                this.appUrl += "/";
            }
        }
        String startPath = this.config.getStartPath();
        if (startPath != null && !startPath.trim().isEmpty()) {
            this.appUrl += startPath;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isNewBinary() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "CapWebViewSettings"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "lastBinaryVersionCode"
            r4 = 0
            java.lang.String r5 = r1.getString(r2, r4)
            java.lang.String r6 = "lastBinaryVersionName"
            java.lang.String r4 = r1.getString(r6, r4)
            android.content.Context r7 = r10.getContext()     // Catch:{ Exception -> 0x003c }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ Exception -> 0x003c }
            android.content.Context r8 = r10.getContext()     // Catch:{ Exception -> 0x003c }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x003c }
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r3)     // Catch:{ Exception -> 0x003c }
            long r8 = androidx.core.content.pm.a.a(r7)     // Catch:{ Exception -> 0x003c }
            int r8 = (int) r8     // Catch:{ Exception -> 0x003c }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ Exception -> 0x003c }
            java.lang.String r7 = r7.versionName     // Catch:{ Exception -> 0x003a }
            goto L_0x0044
        L_0x003a:
            r7 = move-exception
            goto L_0x003e
        L_0x003c:
            r7 = move-exception
            r8 = r0
        L_0x003e:
            java.lang.String r9 = "Unable to get package info"
            com.getcapacitor.Logger.error(r9, r7)
            r7 = r0
        L_0x0044:
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0052
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return r3
        L_0x0052:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r2, r8)
            r1.putString(r6, r7)
            java.lang.String r2 = "serverBasePath"
            r1.putString(r2, r0)
            r1.apply()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getcapacitor.Bridge.isNewBinary():boolean");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callPluginMethod$0(PluginHandle pluginHandle, String str, PluginCall pluginCall) {
        try {
            pluginHandle.invoke(str, pluginCall);
            if (pluginCall.isKeptAlive()) {
                saveCall(pluginCall);
            }
        } catch (InvalidPluginMethodException | PluginLoadException e4) {
            Logger.error("Unable to execute plugin method", e4);
        } catch (Exception e5) {
            Logger.error("Serious error executing plugin", e5);
            throw new RuntimeException(e5);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$eval$1(String str, ValueCallback valueCallback) {
        this.webView.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$6() {
        this.webView.loadUrl(this.appUrl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setServerAssetPath$5() {
        this.webView.loadUrl(this.appUrl);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setServerBasePath$4() {
        this.webView.loadUrl(this.appUrl);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$triggerJSEvent$2(String str) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$triggerJSEvent$3(String str) {
    }

    private void loadWebView() {
        String string;
        WebViewLocalServer webViewLocalServer = new WebViewLocalServer(this.context, this, getJSInjector(), this.authorities, this.config.isHTML5Mode());
        this.localServer = webViewLocalServer;
        webViewLocalServer.hostAssets(DEFAULT_WEB_ASSET_DIR);
        Logger.debug("Loading app at " + this.appUrl);
        this.webView.setWebChromeClient(new BridgeWebChromeClient(this));
        this.webView.setWebViewClient(this.webViewClient);
        if (!isDeployDisabled() && !isNewBinary() && (string = getContext().getSharedPreferences(com.getcapacitor.plugin.WebView.WEBVIEW_PREFS_NAME, 0).getString(com.getcapacitor.plugin.WebView.CAP_SERVER_PATH, (String) null)) != null && !string.isEmpty() && new File(string).exists()) {
            setServerBasePath(string);
        }
        if (!isMinimumWebViewInstalled()) {
            String errorUrl = getErrorUrl();
            if (errorUrl != null) {
                this.webView.loadUrl(errorUrl);
                return;
            }
            Logger.error(MINIMUM_ANDROID_WEBVIEW_ERROR);
        }
        ServerPath serverPath2 = this.serverPath;
        if (serverPath2 == null) {
            this.webView.loadUrl(this.appUrl);
        } else if (serverPath2.getType() == ServerPath.PathType.ASSET_PATH) {
            setServerAssetPath(this.serverPath.getPath());
        } else {
            setServerBasePath(this.serverPath.getPath());
        }
    }

    private void logInvalidPluginException(Class<? extends Plugin> cls) {
        Logger.error("NativePlugin " + cls.getName() + " is invalid. Ensure the @CapacitorPlugin annotation exists on the plugin class and the class extends Plugin");
    }

    private void logPluginLoadException(Class<? extends Plugin> cls, Exception exc) {
        Logger.error("NativePlugin " + cls.getName() + " failed to load", exc);
    }

    private String pluginId(Class<? extends Plugin> cls) {
        String pluginName = pluginName(cls);
        String simpleName = cls.getSimpleName();
        if (pluginName == null) {
            return null;
        }
        if (pluginName.equals("")) {
            pluginName = simpleName;
        }
        Logger.debug("Registering plugin instance: " + pluginName);
        return pluginName;
    }

    private String pluginName(Class<? extends Plugin> cls) {
        CapacitorPlugin capacitorPlugin = (CapacitorPlugin) cls.getAnnotation(CapacitorPlugin.class);
        if (capacitorPlugin == null) {
            return getLegacyPluginName(cls);
        }
        return capacitorPlugin.name();
    }

    private void registerAllPlugins() {
        registerPlugin(CapacitorCookies.class);
        registerPlugin(com.getcapacitor.plugin.WebView.class);
        registerPlugin(CapacitorHttp.class);
        for (Class<? extends Plugin> registerPlugin : this.initialPlugins) {
            registerPlugin(registerPlugin);
        }
        for (Plugin registerPluginInstance : this.pluginInstances) {
            registerPluginInstance(registerPluginInstance);
        }
    }

    private void setAllowedOriginRules() {
        String[] allowNavigation = this.config.getAllowNavigation();
        String host = getHost();
        String scheme = getScheme();
        this.allowedOriginRules.add(scheme + "://" + host);
        if (getServerUrl() != null) {
            this.allowedOriginRules.add(getServerUrl());
        }
        if (allowNavigation != null) {
            for (String str : allowNavigation) {
                if (!str.startsWith(CAPACITOR_HTTP_SCHEME)) {
                    this.allowedOriginRules.add("https://" + str);
                } else {
                    this.allowedOriginRules.add(str);
                }
            }
            this.authorities.addAll(Arrays.asList(allowNavigation));
        }
        this.appAllowNavigationMask = HostMask.Parser.parse(allowNavigation);
    }

    public void addWebViewListener(WebViewListener webViewListener) {
        this.webViewListeners.add(webViewListener);
    }

    public void callPluginMethod(String str, String str2, PluginCall pluginCall) {
        try {
            PluginHandle plugin = getPlugin(str);
            if (plugin == null) {
                Logger.error("unable to find plugin : " + str);
                pluginCall.errorCallback("unable to find plugin : " + str);
                return;
            }
            if (Logger.shouldLog()) {
                Logger.verbose("callback: " + pluginCall.getCallbackId() + ", pluginId: " + plugin.getId() + ", methodName: " + str2 + ", methodData: " + pluginCall.getData().toString());
            }
            this.taskHandler.post(new C0570a(this, plugin, str2, pluginCall));
        } catch (Exception e4) {
            String tags = Logger.tags("callPluginMethod");
            Logger.error(tags, "error : " + e4, (Throwable) null);
            pluginCall.errorCallback(e4.toString());
        }
    }

    public void eval(String str, ValueCallback<String> valueCallback) {
        new Handler(this.context.getMainLooper()).post(new C0571b(this, str, valueCallback));
    }

    public void execute(Runnable runnable) {
        this.taskHandler.post(runnable);
    }

    public void executeOnMainThread(Runnable runnable) {
        new Handler(this.context.getMainLooper()).post(runnable);
    }

    public C0370d getActivity() {
        return this.context;
    }

    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }

    public App getApp() {
        return this.app;
    }

    public HostMask getAppAllowNavigationMask() {
        return this.appAllowNavigationMask;
    }

    public String getAppUrl() {
        return this.appUrl;
    }

    public CapConfig getConfig() {
        return this.config;
    }

    public Context getContext() {
        return this.context;
    }

    public String getErrorUrl() {
        String errorPath = this.config.getErrorPath();
        if (errorPath == null || errorPath.trim().isEmpty()) {
            return null;
        }
        String host = getHost();
        return (getScheme() + "://" + host) + "/" + errorPath;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    public String getHost() {
        return this.config.getHostname();
    }

    public Uri getIntentUri() {
        return this.intentUri;
    }

    public WebViewLocalServer getLocalServer() {
        return this.localServer;
    }

    public String getLocalUrl() {
        return this.localUrl;
    }

    /* access modifiers changed from: protected */
    public PluginCall getPermissionCall(String str) {
        String str2;
        LinkedList linkedList = this.savedPermissionCallIds.get(str);
        if (linkedList != null) {
            str2 = (String) linkedList.poll();
        } else {
            str2 = null;
        }
        return getSavedCall(str2);
    }

    /* access modifiers changed from: protected */
    public Map<String, PermissionState> getPermissionStates(Plugin plugin) {
        String str;
        PermissionState permissionState;
        HashMap hashMap = new HashMap();
        for (Permission permission : plugin.getPluginHandle().getPluginAnnotation().permissions()) {
            if (permission.strings().length == 0 || (permission.strings().length == 1 && permission.strings()[0].isEmpty())) {
                String alias = permission.alias();
                if (!alias.isEmpty() && ((PermissionState) hashMap.get(alias)) == null) {
                    hashMap.put(alias, PermissionState.GRANTED);
                }
            } else {
                for (String str2 : permission.strings()) {
                    if (permission.alias().isEmpty()) {
                        str = str2;
                    } else {
                        str = permission.alias();
                    }
                    if (a.a(getContext(), str2) == 0) {
                        permissionState = PermissionState.GRANTED;
                    } else {
                        PermissionState permissionState2 = PermissionState.PROMPT;
                        String string = getContext().getSharedPreferences(PERMISSION_PREFS_NAME, 0).getString(str2, (String) null);
                        if (string != null) {
                            permissionState = PermissionState.byState(string);
                        } else {
                            permissionState = permissionState2;
                        }
                    }
                    PermissionState permissionState3 = (PermissionState) hashMap.get(str);
                    if (permissionState3 == null || permissionState3 == PermissionState.GRANTED) {
                        hashMap.put(str, permissionState);
                    }
                }
            }
        }
        return hashMap;
    }

    public PluginHandle getPlugin(String str) {
        return this.plugins.get(str);
    }

    /* access modifiers changed from: package-private */
    public PluginCall getPluginCallForLastActivity() {
        PluginCall pluginCall = this.pluginCallForLastActivity;
        this.pluginCallForLastActivity = null;
        return pluginCall;
    }

    @Deprecated
    public PluginHandle getPluginWithRequestCode(int i4) {
        for (PluginHandle next : this.plugins.values()) {
            CapacitorPlugin pluginAnnotation = next.getPluginAnnotation();
            int i5 = 0;
            if (pluginAnnotation == null) {
                NativePlugin legacyPluginAnnotation = next.getLegacyPluginAnnotation();
                if (legacyPluginAnnotation == null) {
                    continue;
                } else if (legacyPluginAnnotation.permissionRequestCode() == i4) {
                    return next;
                } else {
                    int[] requestCodes = legacyPluginAnnotation.requestCodes();
                    int length = requestCodes.length;
                    while (i5 < length) {
                        if (requestCodes[i5] == i4) {
                            return next;
                        }
                        i5++;
                    }
                    continue;
                }
            } else {
                int[] requestCodes2 = pluginAnnotation.requestCodes();
                int length2 = requestCodes2.length;
                while (i5 < length2) {
                    if (requestCodes2[i5] == i4) {
                        return next;
                    }
                    i5++;
                }
                continue;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public RouteProcessor getRouteProcessor() {
        return this.routeProcessor;
    }

    public PluginCall getSavedCall(String str) {
        if (str == null) {
            return null;
        }
        return this.savedCalls.get(str);
    }

    public String getScheme() {
        return this.config.getAndroidScheme();
    }

    public String getServerBasePath() {
        return this.localServer.getBasePath();
    }

    /* access modifiers changed from: package-private */
    public ServerPath getServerPath() {
        return this.serverPath;
    }

    public String getServerUrl() {
        return this.config.getServerUrl();
    }

    public WebView getWebView() {
        return this.webView;
    }

    public BridgeWebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    /* access modifiers changed from: package-private */
    public List<WebViewListener> getWebViewListeners() {
        return this.webViewListeners;
    }

    public void handleAppUrlLoadError(Exception exc) {
        if (exc instanceof SocketTimeoutException) {
            Logger.error("Unable to load app. Ensure the server is running at " + this.appUrl + ", or modify the appUrl setting in capacitor.config.json (make sure to npx cap copy after to commit changes).", exc);
        }
    }

    public boolean isDeployDisabled() {
        return this.preferences.getBoolean("DisableDeploy", false);
    }

    public boolean isDevMode() {
        if ((getActivity().getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isMinimumWebViewInstalled() {
        PackageManager packageManager = getContext().getPackageManager();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            String str = "com.google.android.webview";
            if (i4 >= 24) {
                str = "com.android.chrome";
            }
            try {
                if (Integer.parseInt(packageManager.getPackageInfo(str, 0).versionName.split("\\.")[0]) >= this.config.getMinWebViewVersion()) {
                    return true;
                }
                return false;
            } catch (Exception e4) {
                Logger.warn("Unable to get package info for 'com.google.android.webview'" + e4.toString());
                try {
                    if (Integer.parseInt(packageManager.getPackageInfo("com.android.webview", 0).versionName.split("\\.")[0]) >= this.config.getMinWebViewVersion()) {
                        return true;
                    }
                    return false;
                } catch (Exception e5) {
                    Logger.warn("Unable to get package info for 'com.android.webview'" + e5.toString());
                    return false;
                }
            }
        } else if (Integer.parseInt(WebView.getCurrentWebViewPackage().versionName.split("\\.")[0]) >= this.config.getMinWebViewVersion()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean launchIntent(Uri uri) {
        Boolean shouldOverrideLoad;
        for (Map.Entry<String, PluginHandle> value : this.plugins.entrySet()) {
            Plugin instance = ((PluginHandle) value.getValue()).getInstance();
            if (instance != null && (shouldOverrideLoad = instance.shouldOverrideLoad(uri)) != null) {
                return shouldOverrideLoad.booleanValue();
            }
        }
        Uri parse = Uri.parse(this.appUrl);
        if ((parse.getHost().equals(uri.getHost()) && uri.getScheme().equals(parse.getScheme())) || this.appAllowNavigationMask.matches(uri.getHost())) {
            return false;
        }
        try {
            getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            return true;
        }
    }

    public void logToJs(String str, String str2) {
        eval("window.Capacitor.logJs(\"" + str + "\", \"" + str2 + "\")", (ValueCallback<String>) null);
    }

    /* access modifiers changed from: package-private */
    public boolean onActivityResult(int i4, int i5, Intent intent) {
        PluginHandle pluginWithRequestCode = getPluginWithRequestCode(i4);
        if (pluginWithRequestCode == null || pluginWithRequestCode.getInstance() == null) {
            Logger.debug("Unable to find a Capacitor plugin to handle requestCode, trying Cordova plugins " + i4);
            return this.cordovaInterface.onActivityResult(i4, i5, intent);
        }
        if (pluginWithRequestCode.getInstance().getSavedCall() == null && this.pluginCallForLastActivity != null) {
            pluginWithRequestCode.getInstance().saveCall(this.pluginCallForLastActivity);
        }
        pluginWithRequestCode.getInstance().handleOnActivityResult(i4, i5, intent);
        this.pluginCallForLastActivity = null;
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnConfigurationChanged(configuration);
        }
    }

    public void onDestroy() {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnDestroy();
        }
        this.handlerThread.quitSafely();
        CordovaWebView cordovaWebView2 = this.cordovaWebView;
        if (cordovaWebView2 != null) {
            cordovaWebView2.handleDestroy();
        }
    }

    public void onDetachedFromWindow() {
        this.webView.removeAllViews();
        this.webView.destroy();
    }

    public void onNewIntent(Intent intent) {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnNewIntent(intent);
        }
        CordovaWebView cordovaWebView2 = this.cordovaWebView;
        if (cordovaWebView2 != null) {
            cordovaWebView2.onNewIntent(intent);
        }
    }

    public void onPause() {
        boolean z3;
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnPause();
        }
        if (this.cordovaWebView != null) {
            if (shouldKeepRunning() || this.cordovaInterface.getActivityResultCallback() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.cordovaWebView.handlePause(z3);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        PluginHandle pluginWithRequestCode = getPluginWithRequestCode(i4);
        if (pluginWithRequestCode == null) {
            Logger.debug("Unable to find a Capacitor plugin to handle permission requestCode, trying Cordova plugins " + i4);
            try {
                return this.cordovaInterface.handlePermissionResult(i4, strArr, iArr);
            } catch (JSONException e4) {
                Logger.debug("Error on Cordova plugin permissions request " + e4.getMessage());
                return false;
            }
        } else if (pluginWithRequestCode.getPluginAnnotation() != null) {
            return false;
        } else {
            pluginWithRequestCode.getInstance().handleRequestPermissionsResult(i4, strArr, iArr);
            return true;
        }
    }

    public void onRestart() {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnRestart();
        }
    }

    public void onResume() {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnResume();
        }
        CordovaWebView cordovaWebView2 = this.cordovaWebView;
        if (cordovaWebView2 != null) {
            cordovaWebView2.handleResume(shouldKeepRunning());
        }
    }

    public void onStart() {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnStart();
        }
        CordovaWebView cordovaWebView2 = this.cordovaWebView;
        if (cordovaWebView2 != null) {
            cordovaWebView2.handleStart();
        }
    }

    public void onStop() {
        for (PluginHandle instance : this.plugins.values()) {
            instance.getInstance().handleOnStop();
        }
        CordovaWebView cordovaWebView2 = this.cordovaWebView;
        if (cordovaWebView2 != null) {
            cordovaWebView2.handleStop();
        }
    }

    public <I, O> c registerForActivityResult(C0796a aVar, b bVar) {
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            return fragment2.registerForActivityResult(aVar, bVar);
        }
        return this.context.registerForActivityResult(aVar, bVar);
    }

    public void registerPlugin(Class<? extends Plugin> cls) {
        String pluginId = pluginId(cls);
        if (pluginId != null) {
            try {
                this.plugins.put(pluginId, new PluginHandle(this, cls));
            } catch (InvalidPluginException unused) {
                logInvalidPluginException(cls);
            } catch (PluginLoadException e4) {
                logPluginLoadException(cls, e4);
            }
        }
    }

    public void registerPluginInstance(Plugin plugin) {
        Class<?> cls = plugin.getClass();
        String pluginId = pluginId(cls);
        if (pluginId != null) {
            try {
                this.plugins.put(pluginId, new PluginHandle(this, plugin));
            } catch (InvalidPluginException unused) {
                logInvalidPluginException(cls);
            }
        }
    }

    public void registerPluginInstances(Plugin[] pluginArr) {
        for (Plugin registerPluginInstance : pluginArr) {
            registerPluginInstance(registerPluginInstance);
        }
    }

    public void registerPlugins(Class<? extends Plugin>[] clsArr) {
        for (Class<? extends Plugin> registerPlugin : clsArr) {
            registerPlugin(registerPlugin);
        }
    }

    public void releaseCall(PluginCall pluginCall) {
        releaseCall(pluginCall.getCallbackId());
    }

    public void reload() {
        this.webView.post(new f(this));
    }

    public void removeWebViewListener(WebViewListener webViewListener) {
        this.webViewListeners.remove(webViewListener);
    }

    public void reset() {
        this.savedCalls = new HashMap();
    }

    public void restoreInstanceState(Bundle bundle) {
        String string = bundle.getString(BUNDLE_LAST_PLUGIN_ID_KEY);
        String string2 = bundle.getString(BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY);
        String string3 = bundle.getString(BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY);
        if (string != null) {
            if (string3 != null) {
                try {
                    this.pluginCallForLastActivity = new PluginCall(this.msgHandler, string, PluginCall.CALLBACK_ID_DANGLING, string2, new JSObject(string3));
                } catch (JSONException e4) {
                    Logger.error("Unable to restore plugin call, unable to parse persisted JSON object", e4);
                }
            }
            Bundle bundle2 = bundle.getBundle(BUNDLE_PLUGIN_CALL_BUNDLE_KEY);
            PluginHandle plugin = getPlugin(string);
            if (bundle2 == null || plugin == null) {
                Logger.error("Unable to restore last plugin call");
            } else {
                plugin.getInstance().restoreState(bundle2);
            }
        }
    }

    public void saveCall(PluginCall pluginCall) {
        this.savedCalls.put(pluginCall.getCallbackId(), pluginCall);
    }

    public void saveInstanceState(Bundle bundle) {
        PluginHandle plugin;
        Logger.debug("Saving instance state!");
        PluginCall pluginCall = this.pluginCallForLastActivity;
        if (pluginCall != null && (plugin = getPlugin(pluginCall.getPluginId())) != null) {
            Bundle saveInstanceState = plugin.getInstance().saveInstanceState();
            if (saveInstanceState != null) {
                bundle.putString(BUNDLE_LAST_PLUGIN_ID_KEY, pluginCall.getPluginId());
                bundle.putString(BUNDLE_LAST_PLUGIN_CALL_METHOD_NAME_KEY, pluginCall.getMethodName());
                bundle.putString(BUNDLE_PLUGIN_CALL_OPTIONS_SAVED_KEY, pluginCall.getData().toString());
                bundle.putBundle(BUNDLE_PLUGIN_CALL_BUNDLE_KEY, saveInstanceState);
                return;
            }
            Logger.error("Couldn't save last " + pluginCall.getPluginId() + "'s Plugin " + pluginCall.getMethodName() + " call");
        }
    }

    /* access modifiers changed from: protected */
    public void savePermissionCall(PluginCall pluginCall) {
        if (pluginCall != null) {
            if (!this.savedPermissionCallIds.containsKey(pluginCall.getPluginId())) {
                this.savedPermissionCallIds.put(pluginCall.getPluginId(), new LinkedList());
            }
            this.savedPermissionCallIds.get(pluginCall.getPluginId()).add(pluginCall.getCallbackId());
            saveCall(pluginCall);
        }
    }

    /* access modifiers changed from: protected */
    public void setCordovaWebView(CordovaWebView cordovaWebView2) {
        this.cordovaWebView = cordovaWebView2;
    }

    /* access modifiers changed from: package-private */
    public void setPluginCallForLastActivity(PluginCall pluginCall) {
        this.pluginCallForLastActivity = pluginCall;
    }

    /* access modifiers changed from: package-private */
    public void setRouteProcessor(RouteProcessor routeProcessor2) {
        this.routeProcessor = routeProcessor2;
    }

    public void setServerAssetPath(String str) {
        this.localServer.hostAssets(str);
        this.webView.post(new g(this));
    }

    public void setServerBasePath(String str) {
        this.localServer.hostFiles(str);
        this.webView.post(new C0573d(this));
    }

    public void setWebViewClient(BridgeWebViewClient bridgeWebViewClient) {
        this.webViewClient = bridgeWebViewClient;
        this.webView.setWebViewClient(bridgeWebViewClient);
    }

    /* access modifiers changed from: package-private */
    public void setWebViewListeners(List<WebViewListener> list) {
        this.webViewListeners = list;
    }

    public boolean shouldKeepRunning() {
        return this.preferences.getBoolean("KeepRunning", true);
    }

    @Deprecated
    public void startActivityForPluginWithResult(PluginCall pluginCall, Intent intent, int i4) {
        Logger.debug("Starting activity for result");
        this.pluginCallForLastActivity = pluginCall;
        getActivity().startActivityForResult(intent, i4);
    }

    public void triggerDocumentJSEvent(String str) {
        triggerJSEvent(str, "document");
    }

    public void triggerJSEvent(String str, String str2) {
        eval("window.Capacitor.triggerEvent(\"" + str + "\", \"" + str2 + "\")", new C0572c());
    }

    public void triggerWindowJSEvent(String str) {
        triggerJSEvent(str, "window");
    }

    /* access modifiers changed from: protected */
    public boolean validatePermissions(Plugin plugin, PluginCall pluginCall, Map<String, Boolean> map) {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(PERMISSION_PREFS_NAME, 0);
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (!((Boolean) next.getValue()).booleanValue()) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (androidx.core.app.b.u(getActivity(), str)) {
                    edit.putString(str, PermissionState.PROMPT_WITH_RATIONALE.toString());
                } else {
                    edit.putString(str, PermissionState.DENIED.toString());
                }
                edit.apply();
            } else if (sharedPreferences.getString(str, (String) null) != null) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.remove(str);
                edit2.apply();
            }
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        if (PermissionHelper.hasDefinedPermissions(getContext(), strArr)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing the following permissions in AndroidManifest.xml:\n");
        for (String str2 : PermissionHelper.getUndefinedPermissions(getContext(), strArr)) {
            sb.append(str2 + "\n");
        }
        pluginCall.reject(sb.toString());
        return false;
    }

    @Deprecated
    public Bridge(C0370d dVar, WebView webView2, List<Class<? extends Plugin>> list, MockCordovaInterfaceImpl mockCordovaInterfaceImpl, PluginManager pluginManager, CordovaPreferences cordovaPreferences, CapConfig capConfig) {
        this(dVar, (ServerPath) null, (Fragment) null, webView2, list, new ArrayList(), mockCordovaInterfaceImpl, pluginManager, cordovaPreferences, capConfig);
    }

    public void logToJs(String str) {
        logToJs(str, "log");
    }

    public void releaseCall(String str) {
        this.savedCalls.remove(str);
    }

    public void triggerDocumentJSEvent(String str, String str2) {
        triggerJSEvent(str, "document", str2);
    }

    public void triggerJSEvent(String str, String str2, String str3) {
        eval("window.Capacitor.triggerEvent(\"" + str + "\", \"" + str2 + "\", " + str3 + ")", new e());
    }

    public void triggerWindowJSEvent(String str, String str2) {
        triggerJSEvent(str, "window", str2);
    }

    private Bridge(C0370d dVar, ServerPath serverPath2, Fragment fragment2, WebView webView2, List<Class<? extends Plugin>> list, List<Plugin> list2, MockCordovaInterfaceImpl mockCordovaInterfaceImpl, PluginManager pluginManager, CordovaPreferences cordovaPreferences, CapConfig capConfig) {
        this.allowedOriginRules = new HashSet();
        this.authorities = new ArrayList<>();
        HandlerThread handlerThread2 = new HandlerThread("CapacitorPlugins");
        this.handlerThread = handlerThread2;
        this.taskHandler = null;
        this.plugins = new HashMap();
        this.savedCalls = new HashMap();
        this.savedPermissionCallIds = new HashMap();
        this.webViewListeners = new ArrayList();
        this.app = new App();
        this.serverPath = serverPath2;
        this.context = dVar;
        this.fragment = fragment2;
        this.webView = webView2;
        this.webViewClient = new BridgeWebViewClient(this);
        this.initialPlugins = list;
        this.pluginInstances = list2;
        this.cordovaInterface = mockCordovaInterfaceImpl;
        this.preferences = cordovaPreferences;
        handlerThread2.start();
        this.taskHandler = new Handler(handlerThread2.getLooper());
        capConfig = capConfig == null ? CapConfig.loadDefault(getActivity()) : capConfig;
        this.config = capConfig;
        Logger.init(capConfig);
        initWebView();
        setAllowedOriginRules();
        this.msgHandler = new MessageHandler(this, webView2, pluginManager);
        this.intentUri = dVar.getIntent().getData();
        registerAllPlugins();
        loadWebView();
    }

    public static class Builder {
        private C0370d activity;
        private CapConfig config = null;
        private Fragment fragment;
        private Bundle instanceState = null;
        private List<Plugin> pluginInstances = new ArrayList();
        private List<Class<? extends Plugin>> plugins = new ArrayList();
        private RouteProcessor routeProcessor;
        private ServerPath serverPath;
        private final List<WebViewListener> webViewListeners = new ArrayList();

        public Builder(C0370d dVar) {
            this.activity = dVar;
        }

        public Builder addPlugin(Class<? extends Plugin> cls) {
            this.plugins.add(cls);
            return this;
        }

        public Builder addPluginInstance(Plugin plugin) {
            this.pluginInstances.add(plugin);
            return this;
        }

        public Builder addPluginInstances(List<Plugin> list) {
            this.pluginInstances.addAll(list);
            return this;
        }

        public Builder addPlugins(List<Class<? extends Plugin>> list) {
            for (Class<? extends Plugin> addPlugin : list) {
                addPlugin(addPlugin);
            }
            return this;
        }

        public Builder addWebViewListener(WebViewListener webViewListener) {
            this.webViewListeners.add(webViewListener);
            return this;
        }

        public Builder addWebViewListeners(List<WebViewListener> list) {
            for (WebViewListener addWebViewListener : list) {
                addWebViewListener(addWebViewListener);
            }
            return this;
        }

        public Bridge create() {
            View findViewById;
            ConfigXmlParser configXmlParser = new ConfigXmlParser();
            configXmlParser.parse(this.activity.getApplicationContext());
            CordovaPreferences preferences = configXmlParser.getPreferences();
            preferences.setPreferencesBundle(this.activity.getIntent().getExtras());
            ArrayList<PluginEntry> pluginEntries = configXmlParser.getPluginEntries();
            MockCordovaInterfaceImpl mockCordovaInterfaceImpl = new MockCordovaInterfaceImpl(this.activity);
            Bundle bundle = this.instanceState;
            if (bundle != null) {
                mockCordovaInterfaceImpl.restoreInstanceState(bundle);
            }
            Fragment fragment2 = this.fragment;
            if (fragment2 != null) {
                findViewById = fragment2.getView().findViewById(R.id.webview);
            } else {
                findViewById = this.activity.findViewById(R.id.webview);
            }
            WebView webView = (WebView) findViewById;
            MockCordovaWebViewImpl mockCordovaWebViewImpl = new MockCordovaWebViewImpl(this.activity.getApplicationContext());
            mockCordovaWebViewImpl.init(mockCordovaInterfaceImpl, pluginEntries, preferences, webView);
            PluginManager pluginManager = mockCordovaWebViewImpl.getPluginManager();
            mockCordovaInterfaceImpl.onCordovaInit(pluginManager);
            Bridge bridge = new Bridge(this.activity, this.serverPath, this.fragment, webView, this.plugins, this.pluginInstances, mockCordovaInterfaceImpl, pluginManager, preferences, this.config);
            if (webView instanceof CapacitorWebView) {
                ((CapacitorWebView) webView).setBridge(bridge);
            }
            bridge.setCordovaWebView(mockCordovaWebViewImpl);
            bridge.setWebViewListeners(this.webViewListeners);
            bridge.setRouteProcessor(this.routeProcessor);
            Bundle bundle2 = this.instanceState;
            if (bundle2 != null) {
                bridge.restoreInstanceState(bundle2);
            }
            return bridge;
        }

        public Builder setConfig(CapConfig capConfig) {
            this.config = capConfig;
            return this;
        }

        public Builder setInstanceState(Bundle bundle) {
            this.instanceState = bundle;
            return this;
        }

        public Builder setPlugins(List<Class<? extends Plugin>> list) {
            this.plugins = list;
            return this;
        }

        public Builder setRouteProcessor(RouteProcessor routeProcessor2) {
            this.routeProcessor = routeProcessor2;
            return this;
        }

        public Builder setServerPath(ServerPath serverPath2) {
            this.serverPath = serverPath2;
            return this;
        }

        public Builder(Fragment fragment2) {
            this.activity = (C0370d) fragment2.getActivity();
            this.fragment = fragment2;
        }
    }
}
