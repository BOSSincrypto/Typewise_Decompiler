package org.apache.cordova.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import org.apache.cordova.CordovaBridge;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;
import org.apache.cordova.ICordovaCookieManager;
import org.apache.cordova.LOG;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginManager;

public class SystemWebViewEngine implements CordovaWebViewEngine {
    public static final String TAG = "SystemWebViewEngine";
    protected CordovaBridge bridge;
    protected CordovaWebViewEngine.Client client;
    protected final SystemCookieManager cookieManager;

    /* renamed from: cordova  reason: collision with root package name */
    protected CordovaInterface f15700cordova;
    protected NativeToJsMessageQueue nativeToJsMessageQueue;
    protected CordovaWebView parentWebView;
    protected PluginManager pluginManager;
    protected CordovaPreferences preferences;
    private BroadcastReceiver receiver;
    protected CordovaResourceApi resourceApi;
    protected final SystemWebView webView;

    public SystemWebViewEngine(Context context, CordovaPreferences cordovaPreferences) {
        this(new SystemWebView(context), cordovaPreferences);
    }

    private void enableRemoteDebugging() {
        try {
            WebView.setWebContentsDebuggingEnabled(true);
        } catch (IllegalArgumentException e4) {
            LOG.d(TAG, "You have one job! To turn on Remote Web Debugging! YOU HAVE FAILED! ");
            e4.printStackTrace();
        }
    }

    private static void exposeJsInterface(WebView webView2, CordovaBridge cordovaBridge) {
        webView2.addJavascriptInterface(new SystemExposedJsApi(cordovaBridge), "_cordovaNative");
    }

    private void initWebViewSettings() {
        this.webView.setInitialScale(0);
        this.webView.setVerticalScrollBarEnabled(false);
        final WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        String str = Build.MANUFACTURER;
        LOG.d(TAG, "CordovaWebView is running on device made by: " + str);
        settings.setSaveFormData(false);
        if (this.preferences.getBoolean("AndroidInsecureFileModeEnabled", false)) {
            LOG.d(TAG, "Enabled insecure file access");
            settings.setAllowFileAccess(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        String path = this.webView.getContext().getApplicationContext().getDir("database", 0).getPath();
        settings.setDatabaseEnabled(true);
        if ((this.webView.getContext().getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            enableRemoteDebugging();
        }
        settings.setGeolocationDatabasePath(path);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        String userAgentString = settings.getUserAgentString();
        String string = this.preferences.getString("OverrideUserAgent", (String) null);
        if (string != null) {
            settings.setUserAgentString(string);
        } else {
            String string2 = this.preferences.getString("AppendUserAgent", (String) null);
            if (string2 != null) {
                settings.setUserAgentString(userAgentString + " " + string2);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        if (this.receiver == null) {
            this.receiver = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    settings.getUserAgentString();
                }
            };
            this.webView.getContext().registerReceiver(this.receiver, intentFilter);
        }
    }

    public boolean canGoBack() {
        return this.webView.canGoBack();
    }

    public void clearCache() {
        this.webView.clearCache(true);
    }

    public void clearHistory() {
        this.webView.clearHistory();
    }

    public void destroy() {
        this.webView.chromeClient.destroyLastDialog();
        this.webView.destroy();
        if (this.receiver != null) {
            try {
                this.webView.getContext().unregisterReceiver(this.receiver);
            } catch (Exception e4) {
                LOG.e(TAG, "Error unregistering configuration receiver: " + e4.getMessage(), (Throwable) e4);
            }
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.webView.evaluateJavascript(str, valueCallback);
    }

    public ICordovaCookieManager getCookieManager() {
        return this.cookieManager;
    }

    public CordovaWebView getCordovaWebView() {
        return this.parentWebView;
    }

    public String getUrl() {
        return this.webView.getUrl();
    }

    public View getView() {
        return this.webView;
    }

    public boolean goBack() {
        if (!this.webView.canGoBack()) {
            return false;
        }
        this.webView.goBack();
        return true;
    }

    public void init(CordovaWebView cordovaWebView, CordovaInterface cordovaInterface, CordovaWebViewEngine.Client client2, CordovaResourceApi cordovaResourceApi, PluginManager pluginManager2, NativeToJsMessageQueue nativeToJsMessageQueue2) {
        if (this.f15700cordova == null) {
            if (this.preferences == null) {
                this.preferences = cordovaWebView.getPreferences();
            }
            this.parentWebView = cordovaWebView;
            this.f15700cordova = cordovaInterface;
            this.client = client2;
            this.resourceApi = cordovaResourceApi;
            this.pluginManager = pluginManager2;
            this.nativeToJsMessageQueue = nativeToJsMessageQueue2;
            this.webView.init(this, cordovaInterface);
            initWebViewSettings();
            nativeToJsMessageQueue2.addBridgeMode(new NativeToJsMessageQueue.OnlineEventsBridgeMode(new NativeToJsMessageQueue.OnlineEventsBridgeMode.OnlineEventsBridgeModeDelegate() {
                public void runOnUiThread(Runnable runnable) {
                    SystemWebViewEngine.this.f15700cordova.getActivity().runOnUiThread(runnable);
                }

                public void setNetworkAvailable(boolean z3) {
                    SystemWebView systemWebView = SystemWebViewEngine.this.webView;
                    if (systemWebView != null) {
                        systemWebView.setNetworkAvailable(z3);
                    }
                }
            }));
            nativeToJsMessageQueue2.addBridgeMode(new NativeToJsMessageQueue.EvalBridgeMode(this, cordovaInterface));
            CordovaBridge cordovaBridge = new CordovaBridge(pluginManager2, nativeToJsMessageQueue2);
            this.bridge = cordovaBridge;
            exposeJsInterface(this.webView, cordovaBridge);
            return;
        }
        throw new IllegalStateException();
    }

    public void loadUrl(String str, boolean z3) {
        this.webView.loadUrl(str);
    }

    public void setPaused(boolean z3) {
        if (z3) {
            this.webView.onPause();
            this.webView.pauseTimers();
            return;
        }
        this.webView.onResume();
        this.webView.resumeTimers();
    }

    public void stopLoading() {
        this.webView.stopLoading();
    }

    public SystemWebViewEngine(SystemWebView systemWebView) {
        this(systemWebView, (CordovaPreferences) null);
    }

    public SystemWebViewEngine(SystemWebView systemWebView, CordovaPreferences cordovaPreferences) {
        this.preferences = cordovaPreferences;
        this.webView = systemWebView;
        this.cookieManager = new SystemCookieManager(systemWebView);
    }
}
