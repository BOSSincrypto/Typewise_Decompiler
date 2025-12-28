package com.getcapacitor;

import android.webkit.ValueCallback;

/* renamed from: com.getcapacitor.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0571b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bridge f11367a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11368b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f11369c;

    public /* synthetic */ C0571b(Bridge bridge, String str, ValueCallback valueCallback) {
        this.f11367a = bridge;
        this.f11368b = str;
        this.f11369c = valueCallback;
    }

    public final void run() {
        this.f11367a.lambda$eval$1(this.f11368b, this.f11369c);
    }
}
