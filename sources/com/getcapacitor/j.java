package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsResult;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f11381a;

    public /* synthetic */ j(JsResult jsResult) {
        this.f11381a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i4) {
        BridgeWebChromeClient.lambda$onJsAlert$3(this.f11381a, dialogInterface, i4);
    }
}
