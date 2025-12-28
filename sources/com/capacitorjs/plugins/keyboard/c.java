package com.capacitorjs.plugins.keyboard;

import com.getcapacitor.PluginCall;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyboardPlugin f11311a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PluginCall f11312b;

    public /* synthetic */ c(KeyboardPlugin keyboardPlugin, PluginCall pluginCall) {
        this.f11311a = keyboardPlugin;
        this.f11312b = pluginCall;
    }

    public final void run() {
        this.f11311a.lambda$show$2(this.f11312b);
    }
}
