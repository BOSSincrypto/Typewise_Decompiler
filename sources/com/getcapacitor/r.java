package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f11396a;

    public /* synthetic */ r(JsPromptResult jsPromptResult) {
        this.f11396a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i4) {
        BridgeWebChromeClient.lambda$onJsPrompt$9(this.f11396a, dialogInterface, i4);
    }
}
