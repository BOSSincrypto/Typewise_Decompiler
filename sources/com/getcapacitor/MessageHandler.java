package com.getcapacitor;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import f0.C0647a;
import f0.b;
import f0.e;
import f0.f;
import org.apache.cordova.PluginManager;

public class MessageHandler {
    private Bridge bridge;
    private PluginManager cordovaPluginManager;
    private C0647a javaScriptReplyProxy;
    private WebView webView;

    public MessageHandler(Bridge bridge2, WebView webView2, PluginManager pluginManager) {
        this.bridge = bridge2;
        this.webView = webView2;
        this.cordovaPluginManager = pluginManager;
        if (!f.a("WEB_MESSAGE_LISTENER") || bridge2.getConfig().isUsingLegacyBridge()) {
            webView2.addJavascriptInterface(this, "androidBridge");
            return;
        }
        try {
            e.a(webView2, "androidBridge", bridge2.getAllowedOriginRules(), new B(this));
        } catch (Exception unused) {
            webView2.addJavascriptInterface(this, "androidBridge");
        }
    }

    private void callCordovaPluginMethod(String str, String str2, String str3, String str4) {
        this.bridge.execute(new A(this, str2, str3, str, str4));
    }

    private void callPluginMethod(String str, String str2, String str3, JSObject jSObject) {
        this.bridge.callPluginMethod(str2, str3, new PluginCall(this, str2, str, str3, jSObject));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callCordovaPluginMethod$2(String str, String str2, String str3, String str4) {
        this.cordovaPluginManager.exec(str, str2, str3, str4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(WebView webView2, b bVar, Uri uri, boolean z3, C0647a aVar) {
        if (z3) {
            postMessage(bVar.a());
            this.javaScriptReplyProxy = aVar;
            return;
        }
        Logger.warn("Plugin execution is allowed in Main Frame only");
    }

    private void legacySendResponseMessage(PluginResult pluginResult) {
        WebView webView2 = this.webView;
        webView2.post(new z(webView2, "window.Capacitor.fromNative(" + pluginResult.toString() + ")"));
    }

    @JavascriptInterface
    public void postMessage(String str) {
        boolean z3;
        boolean z4;
        try {
            JSObject jSObject = new JSObject(str);
            String string = jSObject.getString("type");
            boolean z5 = false;
            if (string != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || !string.equals("cordova")) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3 && string.equals("js.error")) {
                z5 = true;
            }
            String string2 = jSObject.getString("callbackId");
            if (z4) {
                String string3 = jSObject.getString("service");
                String string4 = jSObject.getString("action");
                String string5 = jSObject.getString("actionArgs");
                Logger.verbose(Logger.tags("Plugin"), "To native (Cordova plugin): callbackId: " + string2 + ", service: " + string3 + ", action: " + string4 + ", actionArgs: " + string5);
                callCordovaPluginMethod(string2, string3, string4, string5);
            } else if (z5) {
                Logger.error("JavaScript Error: " + str);
            } else {
                String string6 = jSObject.getString("pluginId");
                String string7 = jSObject.getString("methodName");
                JSObject jSObject2 = jSObject.getJSObject("options", new JSObject());
                Logger.verbose(Logger.tags("Plugin"), "To native (Capacitor plugin): callbackId: " + string2 + ", pluginId: " + string6 + ", methodName: " + string7);
                callPluginMethod(string2, string6, string7, jSObject2);
            }
        } catch (Exception e4) {
            Logger.error("Post message error:", e4);
        }
    }

    public void sendResponseMessage(PluginCall pluginCall, PluginResult pluginResult, PluginResult pluginResult2) {
        C0647a aVar;
        try {
            PluginResult pluginResult3 = new PluginResult();
            pluginResult3.put("save", pluginCall.isKeptAlive());
            pluginResult3.put("callbackId", (Object) pluginCall.getCallbackId());
            pluginResult3.put("pluginId", (Object) pluginCall.getPluginId());
            pluginResult3.put("methodName", (Object) pluginCall.getMethodName());
            if (pluginResult2 != null) {
                pluginResult3.put("success", false);
                pluginResult3.put("error", pluginResult2);
                Logger.debug("Sending plugin error: " + pluginResult3.toString());
            } else {
                pluginResult3.put("success", true);
                if (pluginResult != null) {
                    pluginResult3.put("data", pluginResult);
                }
            }
            if (pluginCall.getCallbackId().equals(PluginCall.CALLBACK_ID_DANGLING)) {
                this.bridge.getApp().fireRestoredResult(pluginResult3);
            } else if (this.bridge.getConfig().isUsingLegacyBridge()) {
                legacySendResponseMessage(pluginResult3);
            } else if (!f.a("WEB_MESSAGE_LISTENER") || (aVar = this.javaScriptReplyProxy) == null) {
                legacySendResponseMessage(pluginResult3);
            } else {
                aVar.a(pluginResult3.toString());
            }
        } catch (Exception e4) {
            Logger.error("sendResponseMessage: error: " + e4);
        }
        if (!pluginCall.isKeptAlive()) {
            pluginCall.release(this.bridge);
        }
    }
}
