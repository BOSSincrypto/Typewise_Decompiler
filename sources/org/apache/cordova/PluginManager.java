package org.apache.cordova;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.cordova.PluginResult;
import org.json.JSONException;

public class PluginManager {
    private static String DEFAULT_HOSTNAME = "localhost";
    private static String SCHEME_HTTPS = "https";
    private static final int SLOW_EXEC_WARNING_THRESHOLD;
    private static String TAG = "PluginManager";
    private final CordovaWebView app;
    private final CordovaInterface ctx;
    private final Map<String, PluginEntry> entryMap = Collections.synchronizedMap(new LinkedHashMap());
    private boolean isInitialized;
    private CordovaPlugin permissionRequester;
    private final Map<String, CordovaPlugin> pluginMap = Collections.synchronizedMap(new LinkedHashMap());

    static {
        int i4;
        if (Debug.isDebuggerConnected()) {
            i4 = 60;
        } else {
            i4 = 16;
        }
        SLOW_EXEC_WARNING_THRESHOLD = i4;
    }

    public PluginManager(CordovaWebView cordovaWebView, CordovaInterface cordovaInterface, Collection<PluginEntry> collection) {
        this.ctx = cordovaInterface;
        this.app = cordovaWebView;
        setPluginEntries(collection);
    }

    private String getLaunchUrlPrefix() {
        if (this.app.getPreferences().getBoolean("AndroidInsecureFileModeEnabled", false)) {
            return "file://";
        }
        String lowerCase = this.app.getPreferences().getString("scheme", SCHEME_HTTPS).toLowerCase();
        String string = this.app.getPreferences().getString("hostname", DEFAULT_HOSTNAME);
        return lowerCase + "://" + string + '/';
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A[Catch:{ Exception -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[Catch:{ Exception -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.cordova.CordovaPlugin instantiatePlugin(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0012
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x0010 }
            if (r1 != 0) goto L_0x0012
            java.lang.Class r1 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r1 = move-exception
            goto L_0x0029
        L_0x0012:
            r1 = r0
        L_0x0013:
            if (r1 == 0) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            java.lang.Class<org.apache.cordova.CordovaPlugin> r3 = org.apache.cordova.CordovaPlugin.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0010 }
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0047
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x0010 }
            org.apache.cordova.CordovaPlugin r1 = (org.apache.cordova.CordovaPlugin) r1     // Catch:{ Exception -> 0x0010 }
            r0 = r1
            goto L_0x0047
        L_0x0029:
            r1.printStackTrace()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error adding plugin "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.println(r5)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.PluginManager.instantiatePlugin(java.lang.String):org.apache.cordova.CordovaPlugin");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$postMessage$0(String str, Object obj, String str2, CordovaPlugin cordovaPlugin) {
        if (cordovaPlugin != null) {
            cordovaPlugin.onMessage(str, obj);
        }
    }

    private void startupPlugins() {
        synchronized (this.entryMap) {
            try {
                for (PluginEntry next : this.entryMap.values()) {
                    if (next.onload) {
                        getPlugin(next.service);
                    } else {
                        String str = TAG;
                        LOG.d(str, "startupPlugins: put - " + next.service);
                        this.pluginMap.put(next.service, (Object) null);
                    }
                }
            } finally {
            }
        }
    }

    public void addService(String str, String str2) {
        addService(new PluginEntry(str, str2, false));
    }

    public void exec(String str, String str2, String str3, String str4) {
        CordovaPlugin plugin = getPlugin(str);
        if (plugin == null) {
            String str5 = TAG;
            LOG.d(str5, "exec() call to unknown plugin: " + str);
            this.app.sendPluginResult(new PluginResult(PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION), str3);
            return;
        }
        CallbackContext callbackContext = new CallbackContext(str3, this.app);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean execute = plugin.execute(str2, str4, callbackContext);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 > ((long) SLOW_EXEC_WARNING_THRESHOLD)) {
                String str6 = TAG;
                LOG.w(str6, "THREAD WARNING: exec() call to " + str + "." + str2 + " blocked the main thread for " + currentTimeMillis2 + "ms. Plugin should use CordovaInterface.getThreadPool().");
            }
            if (!execute) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.INVALID_ACTION));
            }
        } catch (JSONException unused) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
        } catch (Exception e4) {
            LOG.e(TAG, "Uncaught exception from plugin", (Throwable) e4);
            callbackContext.error(e4.getMessage());
        }
    }

    public CordovaPlugin getPlugin(String str) {
        CordovaPlugin cordovaPlugin = this.pluginMap.get(str);
        if (cordovaPlugin == null) {
            PluginEntry pluginEntry = this.entryMap.get(str);
            if (pluginEntry == null) {
                return null;
            }
            CordovaPlugin cordovaPlugin2 = pluginEntry.plugin;
            if (cordovaPlugin2 != null) {
                cordovaPlugin = cordovaPlugin2;
            } else {
                cordovaPlugin = instantiatePlugin(pluginEntry.pluginClass);
            }
            CordovaInterface cordovaInterface = this.ctx;
            CordovaWebView cordovaWebView = this.app;
            cordovaPlugin.privateInitialize(str, cordovaInterface, cordovaWebView, cordovaWebView.getPreferences());
            String str2 = TAG;
            LOG.d(str2, "getPlugin - put: " + str);
            this.pluginMap.put(str, cordovaPlugin);
        }
        return cordovaPlugin;
    }

    public Collection<PluginEntry> getPluginEntries() {
        return this.entryMap.values();
    }

    public ArrayList<CordovaPluginPathHandler> getPluginPathHandlers() {
        ArrayList<CordovaPluginPathHandler> arrayList = new ArrayList<>();
        for (CordovaPlugin next : this.pluginMap.values()) {
            if (!(next == null || next.getPathHandler() == null)) {
                arrayList.add(next.getPathHandler());
            }
        }
        return arrayList;
    }

    public void init() {
        LOG.d(TAG, "init()");
        this.isInitialized = true;
        onPause(false);
        onDestroy();
        this.pluginMap.clear();
        startupPlugins();
    }

    public void onConfigurationChanged(Configuration configuration) {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onConfigurationChanged(configuration);
                    }
                }
            } finally {
            }
        }
    }

    public void onDestroy() {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onDestroy();
                    }
                }
            } finally {
            }
        }
    }

    public void onNewIntent(Intent intent) {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onNewIntent(intent);
                    }
                }
            } finally {
            }
        }
    }

    public boolean onOverrideUrlLoading(String str) {
        synchronized (this.entryMap) {
            try {
                for (PluginEntry pluginEntry : this.entryMap.values()) {
                    CordovaPlugin cordovaPlugin = this.pluginMap.get(pluginEntry.service);
                    if (cordovaPlugin != null && cordovaPlugin.onOverrideUrlLoading(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onPause(boolean z3) {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onPause(z3);
                    }
                }
            } finally {
            }
        }
    }

    public boolean onReceivedClientCertRequest(CordovaWebView cordovaWebView, ICordovaClientCertRequest iCordovaClientCertRequest) {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null && next.onReceivedClientCertRequest(this.app, iCordovaClientCertRequest)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean onReceivedHttpAuthRequest(CordovaWebView cordovaWebView, ICordovaHttpAuthHandler iCordovaHttpAuthHandler, String str, String str2) {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null && next.onReceivedHttpAuthRequest(this.app, iCordovaHttpAuthHandler, str, str2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onReset() {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onReset();
                    }
                }
            } finally {
            }
        }
    }

    public void onResume(boolean z3) {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onResume(z3);
                    }
                }
            } finally {
            }
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState;
        Bundle bundle = new Bundle();
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (!(next == null || (onSaveInstanceState = next.onSaveInstanceState()) == null)) {
                        bundle.putBundle(next.getServiceName(), onSaveInstanceState);
                    }
                }
            } finally {
            }
        }
        return bundle;
    }

    public void onStart() {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onStart();
                    }
                }
            } finally {
            }
        }
    }

    public void onStop() {
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null) {
                        next.onStop();
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        return r3.ctx.onMessage(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object postMessage(java.lang.String r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "postMessage: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.d(r0, r1)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x002a }
            r2 = 24
            if (r1 < r2) goto L_0x002c
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch:{ all -> 0x002a }
            org.apache.cordova.b r2 = new org.apache.cordova.b     // Catch:{ all -> 0x002a }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x002a }
            r1.forEach(r2)     // Catch:{ all -> 0x002a }
            goto L_0x004c
        L_0x002a:
            r4 = move-exception
            goto L_0x0054
        L_0x002c:
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch:{ all -> 0x002a }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x002a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002a }
        L_0x0036:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002a }
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r2.onMessage(r4, r5)     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0036
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            org.apache.cordova.CordovaInterface r0 = r3.ctx
            java.lang.Object r4 = r0.onMessage(r4, r5)
            return r4
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.PluginManager.postMessage(java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public Uri remapUri(Uri uri) {
        Uri remapUri;
        synchronized (this.pluginMap) {
            try {
                for (CordovaPlugin next : this.pluginMap.values()) {
                    if (next != null && (remapUri = next.remapUri(uri)) != null) {
                        return remapUri;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPluginEntries(Collection<PluginEntry> collection) {
        if (this.isInitialized) {
            onPause(false);
            onDestroy();
            this.pluginMap.clear();
            this.entryMap.clear();
        }
        for (PluginEntry addService : collection) {
            addService(addService);
        }
        if (this.isInitialized) {
            startupPlugins();
        }
    }

    public boolean shouldAllowBridgeAccess(String str) {
        Boolean shouldAllowBridgeAccess;
        synchronized (this.entryMap) {
            try {
                for (PluginEntry pluginEntry : this.entryMap.values()) {
                    CordovaPlugin cordovaPlugin = this.pluginMap.get(pluginEntry.service);
                    if (cordovaPlugin != null && (shouldAllowBridgeAccess = cordovaPlugin.shouldAllowBridgeAccess(str)) != null) {
                        boolean booleanValue = shouldAllowBridgeAccess.booleanValue();
                        return booleanValue;
                    }
                }
                return str.startsWith(getLaunchUrlPrefix());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r5.startsWith(getLaunchUrlPrefix()) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r5.startsWith("about:blank") == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldAllowNavigation(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r4.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r4.entryMap     // Catch:{ all -> 0x0031 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0031 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0031 }
        L_0x000d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0031 }
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch:{ all -> 0x0031 }
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r4.pluginMap     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.service     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0031 }
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x000d
            java.lang.Boolean r2 = r2.shouldAllowNavigation(r5)     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x000d
            boolean r5 = r2.booleanValue()     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r5
        L_0x0031:
            r5 = move-exception
            goto L_0x004b
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r4.getLaunchUrlPrefix()
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "about:blank"
            boolean r5 = r5.startsWith(r0)
            if (r5 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r5 = 0
            goto L_0x004a
        L_0x0049:
            r5 = 1
        L_0x004a:
            return r5
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.PluginManager.shouldAllowNavigation(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r5.startsWith("blob:") != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r5.startsWith("data:") != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r5.startsWith("about:blank") == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r5.startsWith("https://ssl.gstatic.com/accessibility/javascript/android/") == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r5.startsWith("file://") == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        return !r5.contains("/app_webview/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldAllowRequest(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r4.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r4.entryMap     // Catch:{ all -> 0x0031 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0031 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0031 }
        L_0x000d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0031 }
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch:{ all -> 0x0031 }
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r4.pluginMap     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.service     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0031 }
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x000d
            java.lang.Boolean r2 = r2.shouldAllowRequest(r5)     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x000d
            boolean r5 = r2.booleanValue()     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r5
        L_0x0031:
            r5 = move-exception
            goto L_0x006a
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = "blob:"
            boolean r0 = r5.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "data:"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "about:blank"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x004e
            goto L_0x0069
        L_0x004e:
            java.lang.String r0 = "https://ssl.gstatic.com/accessibility/javascript/android/"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0057
            return r1
        L_0x0057:
            java.lang.String r0 = "file://"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "/app_webview/"
            boolean r5 = r5.contains(r0)
            r5 = r5 ^ r1
            return r5
        L_0x0067:
            r5 = 0
            return r5
        L_0x0069:
            return r1
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.PluginManager.shouldAllowRequest(java.lang.String):boolean");
    }

    public Boolean shouldOpenExternalUrl(String str) {
        Boolean shouldOpenExternalUrl;
        synchronized (this.entryMap) {
            try {
                for (PluginEntry pluginEntry : this.entryMap.values()) {
                    CordovaPlugin cordovaPlugin = this.pluginMap.get(pluginEntry.service);
                    if (cordovaPlugin != null && (shouldOpenExternalUrl = cordovaPlugin.shouldOpenExternalUrl(str)) != null) {
                        return shouldOpenExternalUrl;
                    }
                }
                return Boolean.FALSE;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void addService(PluginEntry pluginEntry) {
        this.entryMap.put(pluginEntry.service, pluginEntry);
        CordovaPlugin cordovaPlugin = pluginEntry.plugin;
        if (cordovaPlugin != null) {
            String str = pluginEntry.service;
            CordovaInterface cordovaInterface = this.ctx;
            CordovaWebView cordovaWebView = this.app;
            cordovaPlugin.privateInitialize(str, cordovaInterface, cordovaWebView, cordovaWebView.getPreferences());
            String str2 = TAG;
            LOG.d(str2, "addService: put - " + pluginEntry.service);
            this.pluginMap.put(pluginEntry.service, pluginEntry.plugin);
        }
    }
}
