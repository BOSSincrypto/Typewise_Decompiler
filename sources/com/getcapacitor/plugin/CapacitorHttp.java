package com.getcapacitor.plugin;

import android.webkit.JavascriptInterface;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.plugin.util.HttpRequestHandler;
import com.silkimen.http.HttpRequest;

@CapacitorPlugin(permissions = {@Permission(alias = "HttpWrite", strings = {"android.permission.WRITE_EXTERNAL_STORAGE"}), @Permission(alias = "HttpRead", strings = {"android.permission.READ_EXTERNAL_STORAGE"})})
public class CapacitorHttp extends Plugin {
    private void http(final PluginCall pluginCall, final String str) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    pluginCall.resolve(HttpRequestHandler.request(pluginCall, str, CapacitorHttp.this.getBridge()));
                } catch (Exception e4) {
                    pluginCall.reject(e4.getLocalizedMessage(), e4.getClass().getSimpleName(), e4);
                }
            }
        }).start();
    }

    @PluginMethod
    public void delete(PluginCall pluginCall) {
        http(pluginCall, HttpRequest.METHOD_DELETE);
    }

    @PluginMethod
    public void get(PluginCall pluginCall) {
        http(pluginCall, HttpRequest.METHOD_GET);
    }

    @JavascriptInterface
    public boolean isEnabled() {
        return getBridge().getConfig().getPluginConfiguration("CapacitorHttp").getBoolean("enabled", false);
    }

    public void load() {
        this.bridge.getWebView().addJavascriptInterface(this, "CapacitorHttpAndroidInterface");
        super.load();
    }

    @PluginMethod
    public void patch(PluginCall pluginCall) {
        http(pluginCall, "PATCH");
    }

    @PluginMethod
    public void post(PluginCall pluginCall) {
        http(pluginCall, HttpRequest.METHOD_POST);
    }

    @PluginMethod
    public void put(PluginCall pluginCall) {
        http(pluginCall, HttpRequest.METHOD_PUT);
    }

    @PluginMethod
    public void request(PluginCall pluginCall) {
        http(pluginCall, (String) null);
    }
}
