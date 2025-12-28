package com.capacitorjs.plugins.app;

import com.getcapacitor.App;

public final /* synthetic */ class a implements App.AppStatusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppPlugin f11307a;

    public /* synthetic */ a(AppPlugin appPlugin) {
        this.f11307a = appPlugin;
    }

    public final void onAppStatusChanged(Boolean bool) {
        this.f11307a.lambda$load$0(bool);
    }
}
