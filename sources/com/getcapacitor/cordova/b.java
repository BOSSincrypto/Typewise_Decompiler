package com.getcapacitor.cordova;

import android.webkit.ValueCallback;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MockCordovaWebViewImpl f11372a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11373b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f11374c;

    public /* synthetic */ b(MockCordovaWebViewImpl mockCordovaWebViewImpl, String str, ValueCallback valueCallback) {
        this.f11372a = mockCordovaWebViewImpl;
        this.f11373b = str;
        this.f11374c = valueCallback;
    }

    public final void run() {
        this.f11372a.lambda$eval$0(this.f11373b, this.f11374c);
    }
}
