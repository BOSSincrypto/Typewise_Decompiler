package com.capacitorjs.plugins.keyboard;

import com.getcapacitor.PluginCall;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyboardPlugin f11317a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PluginCall f11318b;

    public /* synthetic */ g(KeyboardPlugin keyboardPlugin, PluginCall pluginCall) {
        this.f11317a = keyboardPlugin;
        this.f11318b = pluginCall;
    }

    public final void run() {
        this.f11317a.lambda$show$1(this.f11318b);
    }
}
