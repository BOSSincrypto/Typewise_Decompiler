package com.capacitorjs.plugins.statusbar;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.util.WebColor;
import java.util.Locale;
import r1.C0871a;
import r1.C0872b;
import r1.c;
import r1.d;
import r1.e;

@CapacitorPlugin(name = "StatusBar")
public class StatusBarPlugin extends Plugin {
    private StatusBar implementation;

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$2(PluginCall pluginCall) {
        this.implementation.hide();
        pluginCall.resolve();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setBackgroundColor$1(String str, PluginCall pluginCall) {
        try {
            this.implementation.setBackgroundColor(WebColor.parseColor(str.toUpperCase(Locale.ROOT)));
            pluginCall.resolve();
        } catch (IllegalArgumentException unused) {
            pluginCall.reject("Invalid color provided. Must be a hex string (ex: #ff0000");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setOverlaysWebView$4(Boolean bool, PluginCall pluginCall) {
        this.implementation.setOverlaysWebView(bool);
        pluginCall.resolve();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setStyle$0(String str, PluginCall pluginCall) {
        this.implementation.setStyle(str);
        pluginCall.resolve();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$show$3(PluginCall pluginCall) {
        this.implementation.show();
        pluginCall.resolve();
    }

    @PluginMethod
    public void getInfo(PluginCall pluginCall) {
        StatusBarInfo info = this.implementation.getInfo();
        JSObject jSObject = new JSObject();
        jSObject.put("visible", info.isVisible());
        jSObject.put("style", info.getStyle());
        jSObject.put("color", info.getColor());
        jSObject.put("overlays", info.isOverlays());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void hide(PluginCall pluginCall) {
        getBridge().executeOnMainThread(new c(this, pluginCall));
    }

    public void load() {
        this.implementation = new StatusBar(getActivity());
    }

    @PluginMethod
    public void setBackgroundColor(PluginCall pluginCall) {
        String string = pluginCall.getString("color");
        if (string == null) {
            pluginCall.reject("Color must be provided");
        } else {
            getBridge().executeOnMainThread(new C0872b(this, string, pluginCall));
        }
    }

    @PluginMethod
    public void setOverlaysWebView(PluginCall pluginCall) {
        getBridge().executeOnMainThread(new e(this, pluginCall.getBoolean("overlay", Boolean.TRUE), pluginCall));
    }

    @PluginMethod
    public void setStyle(PluginCall pluginCall) {
        String string = pluginCall.getString("style");
        if (string == null) {
            pluginCall.reject("Style must be provided");
        } else {
            getBridge().executeOnMainThread(new d(this, string, pluginCall));
        }
    }

    @PluginMethod
    public void show(PluginCall pluginCall) {
        getBridge().executeOnMainThread(new C0871a(this, pluginCall));
    }
}
