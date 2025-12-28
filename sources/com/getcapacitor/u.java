package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsResult;

public final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f11399a;

    public /* synthetic */ u(JsResult jsResult) {
        this.f11399a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i4) {
        BridgeWebChromeClient.lambda$onJsConfirm$5(this.f11399a, dialogInterface, i4);
    }
}
