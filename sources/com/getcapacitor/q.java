package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

public final /* synthetic */ class q implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f11394a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f11395b;

    public /* synthetic */ q(EditText editText, JsPromptResult jsPromptResult) {
        this.f11394a = editText;
        this.f11395b = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i4) {
        BridgeWebChromeClient.lambda$onJsPrompt$8(this.f11394a, this.f11395b, dialogInterface, i4);
    }
}
