package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsResult;

public final /* synthetic */ class w implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f11401a;

    public /* synthetic */ w(JsResult jsResult) {
        this.f11401a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        BridgeWebChromeClient.lambda$onJsConfirm$7(this.f11401a, dialogInterface);
    }
}
