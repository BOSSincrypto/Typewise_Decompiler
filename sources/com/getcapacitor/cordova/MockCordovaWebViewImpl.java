package com.getcapacitor.cordova;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;
import org.apache.cordova.ICordovaCookieManager;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;

public class MockCordovaWebViewImpl implements CordovaWebView {
    private Context context;
    private CapacitorCordovaCookieManager cookieManager;

    /* renamed from: cordova  reason: collision with root package name */
    private CordovaInterface f11370cordova;
    private boolean hasPausedEver;
    private NativeToJsMessageQueue nativeToJsMessageQueue;
    private PluginManager pluginManager;
    private CordovaPreferences preferences;
    private CordovaResourceApi resourceApi;
    private WebView webView;

    public static class CapacitorEvalBridgeMode extends NativeToJsMessageQueue.BridgeMode {

        /* renamed from: cordova  reason: collision with root package name */
        private final CordovaInterface f11371cordova;
        private final WebView webView;

        public CapacitorEvalBridgeMode(WebView webView2, CordovaInterface cordovaInterface) {
            this.webView = webView2;
            this.f11371cordova = cordovaInterface;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onNativeToJsMessageAvailable$0(NativeToJsMessageQueue nativeToJsMessageQueue) {
            String popAndEncodeAsJs = nativeToJsMessageQueue.popAndEncodeAsJs();
            if (popAndEncodeAsJs != null) {
                this.webView.evaluateJavascript(popAndEncodeAsJs, (ValueCallback) null);
            }
        }

        public void onNativeToJsMessageAvailable(NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f11371cordova.getActivity().runOnUiThread(new c(this, nativeToJsMessageQueue));
        }
    }

    public MockCordovaWebViewImpl(Context context2) {
        this.context = context2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$eval$0(String str, ValueCallback valueCallback) {
        this.webView.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$triggerDocumentEvent$1(String str) {
    }

    public boolean backHistory() {
        return false;
    }

    public boolean canGoBack() {
        return false;
    }

    public void clearCache() {
    }

    public void clearHistory() {
    }

    public void eval(String str, ValueCallback<String> valueCallback) {
        new Handler(this.context.getMainLooper()).post(new b(this, str, valueCallback));
    }

    public Context getContext() {
        return this.webView.getContext();
    }

    public ICordovaCookieManager getCookieManager() {
        return this.cookieManager;
    }

    public CordovaWebViewEngine getEngine() {
        return null;
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
        return this.webView.getUrl();
    }

    public View getView() {
        return this.webView;
    }

    public void handleDestroy() {
        if (isInitialized()) {
            this.pluginManager.onDestroy();
        }
    }

    public void handlePause(boolean z3) {
        if (isInitialized()) {
            this.hasPausedEver = true;
            this.pluginManager.onPause(z3);
            triggerDocumentEvent("pause");
            if (!z3) {
                setPaused(true);
            }
        }
    }

    public void handleResume(boolean z3) {
        if (isInitialized()) {
            setPaused(false);
            this.pluginManager.onResume(z3);
            if (this.hasPausedEver) {
                triggerDocumentEvent("resume");
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
    }

    public void init(CordovaInterface cordovaInterface, List<PluginEntry> list, CordovaPreferences cordovaPreferences) {
        this.f11370cordova = cordovaInterface;
        this.preferences = cordovaPreferences;
        this.pluginManager = new PluginManager(this, this.f11370cordova, list);
        this.resourceApi = new CordovaResourceApi(this.context, this.pluginManager);
        this.pluginManager.init();
    }

    public boolean isButtonPlumbedToJs(int i4) {
        return false;
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return false;
    }

    public boolean isInitialized() {
        if (this.f11370cordova != null) {
            return true;
        }
        return false;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z3) {
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.webView.loadUrl(str);
        }
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

    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public void showWebPage(String str, boolean z3, boolean z4, Map<String, Object> map) {
    }

    public void stopLoading() {
    }

    public void triggerDocumentEvent(String str) {
        eval("window.Capacitor.triggerEvent('" + str + "', 'document');", new a());
    }

    @Deprecated
    public void clearCache(boolean z3) {
    }

    public void init(CordovaInterface cordovaInterface, List<PluginEntry> list, CordovaPreferences cordovaPreferences, WebView webView2) {
        this.f11370cordova = cordovaInterface;
        this.webView = webView2;
        this.preferences = cordovaPreferences;
        this.pluginManager = new PluginManager(this, this.f11370cordova, list);
        this.resourceApi = new CordovaResourceApi(this.context, this.pluginManager);
        NativeToJsMessageQueue nativeToJsMessageQueue2 = new NativeToJsMessageQueue();
        this.nativeToJsMessageQueue = nativeToJsMessageQueue2;
        nativeToJsMessageQueue2.addBridgeMode(new CapacitorEvalBridgeMode(webView2, this.f11370cordova));
        this.nativeToJsMessageQueue.setBridgeMode(0);
        this.cookieManager = new CapacitorCordovaCookieManager(webView2);
        this.pluginManager.init();
    }
}
