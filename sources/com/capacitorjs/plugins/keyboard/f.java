package com.capacitorjs.plugins.keyboard;

import com.getcapacitor.PluginCall;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyboardPlugin f11315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PluginCall f11316b;

    public /* synthetic */ f(KeyboardPlugin keyboardPlugin, PluginCall pluginCall) {
        this.f11315a = keyboardPlugin;
        this.f11316b = pluginCall;
    }

    public final void run() {
        this.f11315a.lambda$hide$3(this.f11316b);
    }
}
