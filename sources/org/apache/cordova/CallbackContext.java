package org.apache.cordova;

import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

public class CallbackContext {
    private static final String LOG_TAG = "CordovaPlugin";
    private String callbackId;
    private int changingThreads;
    protected boolean finished;
    private CordovaWebView webView;

    public CallbackContext(String str, CordovaWebView cordovaWebView) {
        this.callbackId = str;
        this.webView = cordovaWebView;
    }

    public void error(JSONObject jSONObject) {
        sendPluginResult(new PluginResult(PluginResult.Status.ERROR, jSONObject));
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public boolean isChangingThreads() {
        if (this.changingThreads > 0) {
            return true;
        }
        return false;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public void sendPluginResult(PluginResult pluginResult) {
        synchronized (this) {
            try {
                if (this.finished) {
                    LOG.w(LOG_TAG, "Attempted to send a second callback for ID: " + this.callbackId + "\nResult was: " + pluginResult.getMessage());
                    return;
                }
                this.finished = !pluginResult.getKeepCallback();
                this.webView.sendPluginResult(pluginResult, this.callbackId);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void success(JSONObject jSONObject) {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, jSONObject));
    }

    public void error(String str) {
        sendPluginResult(new PluginResult(PluginResult.Status.ERROR, str));
    }

    public void success(String str) {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, str));
    }

    public void error(int i4) {
        sendPluginResult(new PluginResult(PluginResult.Status.ERROR, i4));
    }

    public void success(JSONArray jSONArray) {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, jSONArray));
    }

    public void success(byte[] bArr) {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, bArr));
    }

    public void success(int i4) {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, i4));
    }

    public void success() {
        sendPluginResult(new PluginResult(PluginResult.Status.OK));
    }
}
