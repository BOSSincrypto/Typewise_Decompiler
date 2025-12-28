package org.apache.cordova.engine;

import android.webkit.JavascriptInterface;
import org.apache.cordova.CordovaBridge;
import org.apache.cordova.ExposedJsApi;

class SystemExposedJsApi implements ExposedJsApi {
    private final CordovaBridge bridge;

    SystemExposedJsApi(CordovaBridge cordovaBridge) {
        this.bridge = cordovaBridge;
    }

    @JavascriptInterface
    public String exec(int i4, String str, String str2, String str3, String str4) {
        return this.bridge.jsExec(i4, str, str2, str3, str4);
    }

    @JavascriptInterface
    public String retrieveJsMessages(int i4, boolean z3) {
        return this.bridge.jsRetrieveJsMessages(i4, z3);
    }

    @JavascriptInterface
    public void setNativeToJsBridgeMode(int i4, int i5) {
        this.bridge.jsSetNativeToJsBridgeMode(i4, i5);
    }
}
