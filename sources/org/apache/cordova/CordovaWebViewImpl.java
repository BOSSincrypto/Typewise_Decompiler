package org.apache.cordova;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.cordova.CordovaWebViewEngine;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.json.JSONException;
import org.json.JSONObject;

public class CordovaWebViewImpl implements CordovaWebView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "CordovaWebViewImpl";
    private CoreAndroid appPlugin;
    /* access modifiers changed from: private */
    public Set<Integer> boundKeyCodes = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: cordova  reason: collision with root package name */
    public CordovaInterface f15694cordova;
    protected final CordovaWebViewEngine engine;
    private EngineClient engineClient = new EngineClient();
    private boolean hasPausedEver;
    /* access modifiers changed from: private */
    public int loadUrlTimeout = 0;
    String loadedUrl;
    /* access modifiers changed from: private */
    public View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private NativeToJsMessageQueue nativeToJsMessageQueue;
    /* access modifiers changed from: private */
    public PluginManager pluginManager;
    private CordovaPreferences preferences;
    private CordovaResourceApi resourceApi;

    protected class EngineClient implements CordovaWebViewEngine.Client {
        protected EngineClient() {
        }

        public void clearLoadTimeoutTimer() {
            CordovaWebViewImpl.access$108(CordovaWebViewImpl.this);
        }

        public Boolean onDispatchKeyEvent(KeyEvent keyEvent) {
            boolean z3;
            String str;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (keyEvent.getAction() == 0) {
                if (z3 && CordovaWebViewImpl.this.mCustomView != null) {
                    return Boolean.TRUE;
                }
                if (CordovaWebViewImpl.this.boundKeyCodes.contains(Integer.valueOf(keyCode))) {
                    return Boolean.TRUE;
                }
                if (z3) {
                    return Boolean.valueOf(CordovaWebViewImpl.this.engine.canGoBack());
                }
            } else if (keyEvent.getAction() == 1) {
                if (z3 && CordovaWebViewImpl.this.mCustomView != null) {
                    CordovaWebViewImpl.this.hideCustomView();
                    return Boolean.TRUE;
                } else if (CordovaWebViewImpl.this.boundKeyCodes.contains(Integer.valueOf(keyCode))) {
                    if (keyCode == 4) {
                        str = "backbutton";
                    } else if (keyCode == 82) {
                        str = "menubutton";
                    } else if (keyCode == 84) {
                        str = "searchbutton";
                    } else if (keyCode == 24) {
                        str = "volumeupbutton";
                    } else if (keyCode != 25) {
                        str = null;
                    } else {
                        str = "volumedownbutton";
                    }
                    if (str != null) {
                        CordovaWebViewImpl.this.sendJavascriptEvent(str);
                        return Boolean.TRUE;
                    }
                } else if (z3) {
                    return Boolean.valueOf(CordovaWebViewImpl.this.engine.goBack());
                }
            }
            return null;
        }

        public boolean onNavigationAttempt(String str) {
            if (CordovaWebViewImpl.this.pluginManager.onOverrideUrlLoading(str)) {
                return true;
            }
            if (CordovaWebViewImpl.this.pluginManager.shouldAllowNavigation(str)) {
                return false;
            }
            if (CordovaWebViewImpl.this.pluginManager.shouldOpenExternalUrl(str).booleanValue()) {
                CordovaWebViewImpl.this.showWebPage(str, true, false, (Map<String, Object>) null);
                return true;
            }
            LOG.w(CordovaWebViewImpl.TAG, "Blocked (possibly sub-frame) navigation to non-allowed URL: " + str);
            return true;
        }

        public void onPageFinishedLoading(String str) {
            LOG.d(CordovaWebViewImpl.TAG, "onPageFinished(" + str + ")");
            clearLoadTimeoutTimer();
            CordovaWebViewImpl.this.pluginManager.postMessage("onPageFinished", str);
            if (CordovaWebViewImpl.this.engine.getView().getVisibility() != 0) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            if (CordovaWebViewImpl.this.f15694cordova.getActivity() != null) {
                                CordovaWebViewImpl.this.f15694cordova.getActivity().runOnUiThread(new Runnable() {
                                    public void run() {
                                        CordovaWebViewImpl.this.pluginManager.postMessage("spinner", "stop");
                                    }
                                });
                            } else {
                                LOG.d(CordovaWebViewImpl.TAG, "Cordova activity does not exist.");
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                }).start();
            }
            if (str.equals("about:blank")) {
                CordovaWebViewImpl.this.pluginManager.postMessage("exit", (Object) null);
            }
        }

        public void onPageStarted(String str) {
            LOG.d(CordovaWebViewImpl.TAG, "onPageDidNavigate(" + str + ")");
            CordovaWebViewImpl.this.boundKeyCodes.clear();
            CordovaWebViewImpl.this.pluginManager.onReset();
            CordovaWebViewImpl.this.pluginManager.postMessage("onPageStarted", str);
        }

        public void onReceivedError(int i4, String str, String str2) {
            clearLoadTimeoutTimer();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", i4);
                jSONObject.put("description", str);
                jSONObject.put("url", str2);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            CordovaWebViewImpl.this.pluginManager.postMessage("onReceivedError", jSONObject);
        }
    }

    private static class WrapperView extends FrameLayout {
        private final CordovaWebViewEngine engine;

        public WrapperView(Context context, CordovaWebViewEngine cordovaWebViewEngine) {
            super(context);
            this.engine = cordovaWebViewEngine;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean dispatchKeyEvent = this.engine.getView().dispatchKeyEvent(keyEvent);
            if (!dispatchKeyEvent) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return dispatchKeyEvent;
        }
    }

    public CordovaWebViewImpl(CordovaWebViewEngine cordovaWebViewEngine) {
        this.engine = cordovaWebViewEngine;
    }

    static /* synthetic */ int access$108(CordovaWebViewImpl cordovaWebViewImpl) {
        int i4 = cordovaWebViewImpl.loadUrlTimeout;
        cordovaWebViewImpl.loadUrlTimeout = i4 + 1;
        return i4;
    }

    public static CordovaWebViewEngine createEngine(Context context, CordovaPreferences cordovaPreferences) {
        try {
            return (CordovaWebViewEngine) Class.forName(cordovaPreferences.getString("webview", SystemWebViewEngine.class.getCanonicalName())).getConstructor(new Class[]{Context.class, CordovaPreferences.class}).newInstance(new Object[]{context, cordovaPreferences});
        } catch (Exception e4) {
            throw new RuntimeException("Failed to create webview. ", e4);
        }
    }

    /* access modifiers changed from: private */
    public void sendJavascriptEvent(String str) {
        if (this.appPlugin == null) {
            this.appPlugin = (CoreAndroid) this.pluginManager.getPlugin(CoreAndroid.PLUGIN_NAME);
        }
        CoreAndroid coreAndroid = this.appPlugin;
        if (coreAndroid == null) {
            LOG.w(TAG, "Unable to fire event without existing plugin");
        } else {
            coreAndroid.fireJavascriptEvent(str);
        }
    }

    public boolean backHistory() {
        return this.engine.goBack();
    }

    public boolean canGoBack() {
        return this.engine.canGoBack();
    }

    public void clearCache() {
        this.engine.clearCache();
    }

    public void clearHistory() {
        this.engine.clearHistory();
    }

    public Context getContext() {
        return this.engine.getView().getContext();
    }

    public ICordovaCookieManager getCookieManager() {
        return this.engine.getCookieManager();
    }

    public CordovaWebViewEngine getEngine() {
        return this.engine;
    }

    public PluginManager getPluginManager() {
        return this.pluginManager;
    }

    public CordovaPreferences getPreferences() {
        return this.preferences;
    }

    public CordovaResourceApi getResourceApi() {
        return this.resourceApi;
    }

    public String getUrl() {
        return this.engine.getUrl();
    }

    public View getView() {
        return this.engine.getView();
    }

    public void handleDestroy() {
        if (isInitialized()) {
            this.loadUrlTimeout++;
            this.pluginManager.onDestroy();
            loadUrl("about:blank");
            this.engine.destroy();
            hideCustomView();
        }
    }

    public void handlePause(boolean z3) {
        if (isInitialized()) {
            this.hasPausedEver = true;
            this.pluginManager.onPause(z3);
            sendJavascriptEvent("pause");
            if (!z3) {
                this.engine.setPaused(true);
            }
        }
    }

    public void handleResume(boolean z3) {
        if (isInitialized()) {
            this.engine.setPaused(false);
            this.pluginManager.onResume(z3);
            if (this.hasPausedEver) {
                sendJavascriptEvent("resume");
            }
        }
    }

    public void handleStart() {
        if (isInitialized()) {
            this.pluginManager.onStart();
        }
    }

    public void handleStop() {
        if (isInitialized()) {
            this.pluginManager.onStop();
        }
    }

    @Deprecated
    public void hideCustomView() {
        if (this.mCustomView != null) {
            LOG.d(TAG, "Hiding Custom View");
            this.mCustomView.setVisibility(8);
            ((ViewGroup) this.engine.getView().getParent()).removeView(this.mCustomView);
            this.mCustomView = null;
            this.mCustomViewCallback.onCustomViewHidden();
            this.engine.getView().setVisibility(0);
            this.engine.getView().requestFocus();
        }
    }

    public void init(CordovaInterface cordovaInterface) {
        init(cordovaInterface, new ArrayList(), new CordovaPreferences());
    }

    public boolean isButtonPlumbedToJs(int i4) {
        return this.boundKeyCodes.contains(Integer.valueOf(i4));
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        if (this.mCustomView != null) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        if (this.f15694cordova != null) {
            return true;
        }
        return false;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(final String str, boolean z3) {
        LOG.d(TAG, ">>> loadUrl(" + str + ")");
        boolean z4 = false;
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.engine.loadUrl(str, false);
            return;
        }
        if (z3 || this.loadedUrl == null) {
            z4 = true;
        }
        final boolean z5 = z4;
        if (z5) {
            if (this.loadedUrl != null) {
                this.appPlugin = null;
                this.pluginManager.init();
            }
            this.loadedUrl = str;
        }
        final int i4 = this.loadUrlTimeout;
        final int integer = this.preferences.getInteger("LoadUrlTimeoutValue", 20000);
        final AnonymousClass1 r02 = new Runnable() {
            public void run() {
                CordovaWebViewImpl.this.stopLoading();
                LOG.e(CordovaWebViewImpl.TAG, "CordovaWebView: TIMEOUT ERROR!");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errorCode", -6);
                    jSONObject.put("description", "The connection to the server was unsuccessful.");
                    jSONObject.put("url", str);
                } catch (JSONException unused) {
                }
                CordovaWebViewImpl.this.pluginManager.postMessage("onReceivedError", jSONObject);
            }
        };
        final AnonymousClass2 r6 = new Runnable() {
            public void run() {
                try {
                    synchronized (this) {
                        wait((long) integer);
                    }
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
                if (CordovaWebViewImpl.this.loadUrlTimeout == i4 && CordovaWebViewImpl.this.f15694cordova.getActivity() != null) {
                    CordovaWebViewImpl.this.f15694cordova.getActivity().runOnUiThread(r02);
                } else if (CordovaWebViewImpl.this.f15694cordova.getActivity() == null) {
                    LOG.d(CordovaWebViewImpl.TAG, "Cordova activity does not exist.");
                }
            }
        };
        if (this.f15694cordova.getActivity() != null) {
            final String str2 = str;
            this.f15694cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    if (integer > 0) {
                        CordovaWebViewImpl.this.f15694cordova.getThreadPool().execute(r6);
                    }
                    CordovaWebViewImpl.this.engine.loadUrl(str2, z5);
                }
            });
            return;
        }
        LOG.d(TAG, "Cordova activity does not exist.");
    }

    public void onNewIntent(Intent intent) {
        PluginManager pluginManager2 = this.pluginManager;
        if (pluginManager2 != null) {
            pluginManager2.onNewIntent(intent);
        }
    }

    public Object postMessage(String str, Object obj) {
        return this.pluginManager.postMessage(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        this.nativeToJsMessageQueue.addJavaScript(str);
    }

    public void sendPluginResult(PluginResult pluginResult, String str) {
        this.nativeToJsMessageQueue.addPluginResult(pluginResult, str);
    }

    public void setButtonPlumbedToJs(int i4, boolean z3) {
        if (i4 != 4 && i4 != 82 && i4 != 24 && i4 != 25) {
            throw new IllegalArgumentException("Unsupported keycode: " + i4);
        } else if (z3) {
            this.boundKeyCodes.add(Integer.valueOf(i4));
        } else {
            this.boundKeyCodes.remove(Integer.valueOf(i4));
        }
    }

    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        LOG.d(TAG, "showing Custom View");
        if (this.mCustomView != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        WrapperView wrapperView = new WrapperView(getContext(), this.engine);
        wrapperView.addView(view);
        this.mCustomView = wrapperView;
        this.mCustomViewCallback = customViewCallback;
        ViewGroup viewGroup = (ViewGroup) this.engine.getView().getParent();
        viewGroup.addView(wrapperView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.engine.getView().setVisibility(8);
        viewGroup.setVisibility(0);
        viewGroup.bringToFront();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        showWebPage(r2.getStringExtra("browser_fallback_url"), r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        org.apache.cordova.LOG.e(TAG, "Error parsing url " + r8, (java.lang.Throwable) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076 A[Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }, ExcHandler: URISyntaxException (r9v2 'e' java.net.URISyntaxException A[CUSTOM_DECLARE, Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }]), Splitter:B:15:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showWebPage(java.lang.String r8, boolean r9, boolean r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r7 = this;
            java.lang.String r0 = "intent://"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r8
            r4 = 1
            r3[r4] = r1
            r1 = 2
            r3[r1] = r2
            java.lang.String r1 = "CordovaWebViewImpl"
            java.lang.String r2 = "showWebPage(%s, %b, %b, HashMap)"
            org.apache.cordova.LOG.d((java.lang.String) r1, (java.lang.String) r2, (java.lang.Object[]) r3)
            if (r10 == 0) goto L_0x0024
            org.apache.cordova.CordovaWebViewEngine r2 = r7.engine
            r2.clearHistory()
        L_0x0024:
            if (r9 != 0) goto L_0x0047
            org.apache.cordova.PluginManager r9 = r7.pluginManager
            boolean r9 = r9.shouldAllowNavigation(r8)
            if (r9 == 0) goto L_0x0032
            r7.loadUrlIntoView(r8, r4)
            return
        L_0x0032:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "showWebPage: Refusing to load URL into webview since it is not in the <allow-navigation> allow list. URL="
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            org.apache.cordova.LOG.w((java.lang.String) r1, (java.lang.String) r8)
            return
        L_0x0047:
            org.apache.cordova.PluginManager r2 = r7.pluginManager
            java.lang.Boolean r2 = r2.shouldOpenExternalUrl(r8)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0068
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "showWebPage: Refusing to send intent for URL since it is not in the <allow-intent> allow list. URL="
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            org.apache.cordova.LOG.w((java.lang.String) r1, (java.lang.String) r8)
            return
        L_0x0068:
            r2 = 0
            boolean r3 = r8.startsWith(r0)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            if (r3 == 0) goto L_0x0079
            android.content.Intent r2 = android.content.Intent.parseUri(r8, r4)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            goto L_0x00a8
        L_0x0074:
            r3 = move-exception
            goto L_0x00c0
        L_0x0076:
            r9 = move-exception
            goto L_0x00ed
        L_0x0079:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            java.lang.String r2 = "android.intent.category.BROWSABLE"
            r3.addCategory(r2)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            java.lang.String r4 = "file"
            java.lang.String r5 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            boolean r4 = r4.equals(r5)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            if (r4 == 0) goto L_0x00a4
            org.apache.cordova.CordovaResourceApi r4 = r7.resourceApi     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            java.lang.String r4 = r4.getMimeType(r2)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            r3.setDataAndType(r2, r4)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
            goto L_0x00a7
        L_0x009f:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x00c0
        L_0x00a4:
            r3.setData(r2)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x009f }
        L_0x00a7:
            r2 = r3
        L_0x00a8:
            org.apache.cordova.CordovaInterface r3 = r7.f15694cordova     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            androidx.appcompat.app.d r3 = r3.getActivity()     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            if (r3 == 0) goto L_0x00ba
            org.apache.cordova.CordovaInterface r3 = r7.f15694cordova     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            androidx.appcompat.app.d r3 = r3.getActivity()     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            r3.startActivity(r2)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            goto L_0x0101
        L_0x00ba:
            java.lang.String r3 = "Cordova activity does not exist."
            org.apache.cordova.LOG.d(r1, r3)     // Catch:{ URISyntaxException -> 0x0076, ActivityNotFoundException -> 0x0074 }
            goto L_0x0101
        L_0x00c0:
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x00d8
            if (r2 == 0) goto L_0x00d8
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r4 = r2.getStringExtra(r0)
            if (r4 == 0) goto L_0x00d8
            java.lang.String r8 = r2.getStringExtra(r0)
            r7.showWebPage(r8, r9, r10, r11)
            goto L_0x0101
        L_0x00d8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Error loading url "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            org.apache.cordova.LOG.e((java.lang.String) r1, (java.lang.String) r8, (java.lang.Throwable) r3)
            goto L_0x0101
        L_0x00ed:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Error parsing url "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            org.apache.cordova.LOG.e((java.lang.String) r1, (java.lang.String) r8, (java.lang.Throwable) r9)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.CordovaWebViewImpl.showWebPage(java.lang.String, boolean, boolean, java.util.Map):void");
    }

    public void stopLoading() {
        this.loadUrlTimeout++;
    }

    @Deprecated
    public void clearCache(boolean z3) {
        this.engine.clearCache();
    }

    public void init(CordovaInterface cordovaInterface, List<PluginEntry> list, CordovaPreferences cordovaPreferences) {
        if (this.f15694cordova == null) {
            this.f15694cordova = cordovaInterface;
            this.preferences = cordovaPreferences;
            this.pluginManager = new PluginManager(this, this.f15694cordova, list);
            this.resourceApi = new CordovaResourceApi(this.engine.getView().getContext(), this.pluginManager);
            NativeToJsMessageQueue nativeToJsMessageQueue2 = new NativeToJsMessageQueue();
            this.nativeToJsMessageQueue = nativeToJsMessageQueue2;
            nativeToJsMessageQueue2.addBridgeMode(new NativeToJsMessageQueue.NoOpBridgeMode());
            this.nativeToJsMessageQueue.addBridgeMode(new NativeToJsMessageQueue.LoadUrlBridgeMode(this.engine, cordovaInterface));
            if (cordovaPreferences.getBoolean("DisallowOverscroll", false)) {
                this.engine.getView().setOverScrollMode(2);
            }
            this.engine.init(this, cordovaInterface, this.engineClient, this.resourceApi, this.pluginManager, this.nativeToJsMessageQueue);
            this.pluginManager.addService(CoreAndroid.PLUGIN_NAME, "org.apache.cordova.CoreAndroid");
            this.pluginManager.init();
            return;
        }
        throw new IllegalStateException();
    }
}
