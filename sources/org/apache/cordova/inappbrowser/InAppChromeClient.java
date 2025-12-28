package org.apache.cordova.inappbrowser;

import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class InAppChromeClient extends WebChromeClient {
    private String LOG_TAG = "InAppChromeClient";
    private long MAX_QUOTA = 104857600;
    private CordovaWebView webView;

    public InAppChromeClient(CordovaWebView cordovaWebView) {
        this.webView = cordovaWebView;
    }

    public boolean onCreateWindow(final WebView webView2, boolean z3, boolean z4, Message message) {
        AnonymousClass1 r22 = new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                webView2.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView2.loadUrl(str);
                return true;
            }
        };
        WebView webView3 = new WebView(webView2.getContext());
        webView3.setWebViewClient(r22);
        ((WebView.WebViewTransport) message.obj).setWebView(webView3);
        message.sendToTarget();
        return true;
    }

    public void onExceededDatabaseQuota(String str, String str2, long j4, long j5, long j6, WebStorage.QuotaUpdater quotaUpdater) {
        LOG.d(this.LOG_TAG, "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j6));
        quotaUpdater.updateQuota(this.MAX_QUOTA);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
    }

    public boolean onJsPrompt(WebView webView2, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        PluginResult pluginResult;
        if (str3 == null || !str3.startsWith("gap")) {
            return false;
        }
        if (str3.startsWith("gap-iab://")) {
            String substring = str3.substring(10);
            if (substring.matches("^InAppBrowser[0-9]{1,10}$")) {
                if (str2 == null || str2.length() == 0) {
                    pluginResult = new PluginResult(PluginResult.Status.OK, new JSONArray());
                } else {
                    try {
                        pluginResult = new PluginResult(PluginResult.Status.OK, new JSONArray(str2));
                    } catch (JSONException e4) {
                        pluginResult = new PluginResult(PluginResult.Status.JSON_EXCEPTION, e4.getMessage());
                    }
                }
                this.webView.sendPluginResult(pluginResult, substring);
                jsPromptResult.confirm("");
                return true;
            }
            String str4 = this.LOG_TAG;
            LOG.w(str4, "InAppBrowser callback called with invalid callbackId : " + substring);
            jsPromptResult.cancel();
            return true;
        }
        String str5 = this.LOG_TAG;
        LOG.w(str5, "InAppBrowser does not support Cordova API calls: " + str + " " + str3);
        jsPromptResult.cancel();
        return true;
    }
}
