package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsResult;

public final /* synthetic */ class v implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsResult f11400a;

    public /* synthetic */ v(JsResult jsResult) {
        this.f11400a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i4) {
        BridgeWebChromeClient.lambda$onJsConfirm$6(this.f11400a, dialogInterface, i4);
    }
}
