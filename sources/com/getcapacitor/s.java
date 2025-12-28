package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

public final /* synthetic */ class s implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsPromptResult f11397a;

    public /* synthetic */ s(JsPromptResult jsPromptResult) {
        this.f11397a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        BridgeWebChromeClient.lambda$onJsPrompt$10(this.f11397a, dialogInterface);
    }
}
