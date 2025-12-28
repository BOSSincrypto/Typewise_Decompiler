package com.getcapacitor;

import android.webkit.ValueCallback;
import androidx.activity.result.a;
import com.getcapacitor.BridgeWebChromeClient;

public final /* synthetic */ class x implements BridgeWebChromeClient.ActivityResultListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f11402a;

    public /* synthetic */ x(ValueCallback valueCallback) {
        this.f11402a = valueCallback;
    }

    public final void onActivityResult(a aVar) {
        BridgeWebChromeClient.lambda$showFilePicker$15(this.f11402a, aVar);
    }
}
