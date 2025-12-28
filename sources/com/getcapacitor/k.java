package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsResult;

public final /* synthetic */ class k implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f11382a;

    public /* synthetic */ k(JsResult jsResult) {
        this.f11382a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        BridgeWebChromeClient.lambda$onJsAlert$4(this.f11382a, dialogInterface);
    }
}
