package com.getcapacitor;

import android.webkit.ValueCallback;
import android.webkit.WebView;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f11403a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11404b;

    public /* synthetic */ z(WebView webView, String str) {
        this.f11403a = webView;
        this.f11404b = str;
    }

    public final void run() {
        this.f11403a.evaluateJavascript(this.f11404b, (ValueCallback) null);
    }
}
