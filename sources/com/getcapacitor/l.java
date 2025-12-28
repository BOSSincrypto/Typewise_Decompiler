package com.getcapacitor;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.getcapacitor.BridgeWebChromeClient;

public final /* synthetic */ class l implements BridgeWebChromeClient.PermissionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BridgeWebChromeClient f11383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f11384b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WebChromeClient.FileChooserParams f11385c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f11386d;

    public /* synthetic */ l(BridgeWebChromeClient bridgeWebChromeClient, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z3) {
        this.f11383a = bridgeWebChromeClient;
        this.f11384b = valueCallback;
        this.f11385c = fileChooserParams;
        this.f11386d = z3;
    }

    public final void onPermissionSelect(Boolean bool) {
        this.f11383a.lambda$onShowFileChooser$12(this.f11384b, this.f11385c, this.f11386d, bool);
    }
}
