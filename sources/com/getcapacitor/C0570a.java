package com.getcapacitor;

/* renamed from: com.getcapacitor.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0570a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bridge f11363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PluginHandle f11364b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11365c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PluginCall f11366d;

    public /* synthetic */ C0570a(Bridge bridge, PluginHandle pluginHandle, String str, PluginCall pluginCall) {
        this.f11363a = bridge;
        this.f11364b = pluginHandle;
        this.f11365c = str;
        this.f11366d = pluginCall;
    }

    public final void run() {
        this.f11363a.lambda$callPluginMethod$0(this.f11364b, this.f11365c, this.f11366d);
    }
}
