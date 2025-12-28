package com.getcapacitor;

public final /* synthetic */ class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MessageHandler f11353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11354b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11355c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f11356d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f11357e;

    public /* synthetic */ A(MessageHandler messageHandler, String str, String str2, String str3, String str4) {
        this.f11353a = messageHandler;
        this.f11354b = str;
        this.f11355c = str2;
        this.f11356d = str3;
        this.f11357e = str4;
    }

    public final void run() {
        this.f11353a.lambda$callCordovaPluginMethod$2(this.f11354b, this.f11355c, this.f11356d, this.f11357e);
    }
}
