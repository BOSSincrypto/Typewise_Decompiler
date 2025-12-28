package com.capacitorjs.plugins.app;

import com.getcapacitor.App;
import com.getcapacitor.PluginResult;

public final /* synthetic */ class b implements App.AppRestoredListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppPlugin f11308a;

    public /* synthetic */ b(AppPlugin appPlugin) {
        this.f11308a = appPlugin;
    }

    public final void onAppRestored(PluginResult pluginResult) {
        this.f11308a.lambda$load$1(pluginResult);
    }
}
