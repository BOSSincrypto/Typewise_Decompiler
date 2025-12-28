package com.getcapacitor;

import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.activity.result.a;
import com.getcapacitor.BridgeWebChromeClient;

public final /* synthetic */ class p implements BridgeWebChromeClient.ActivityResultListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uri f11392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f11393b;

    public /* synthetic */ p(Uri uri, ValueCallback valueCallback) {
        this.f11392a = uri;
        this.f11393b = valueCallback;
    }

    public final void onActivityResult(a aVar) {
        BridgeWebChromeClient.lambda$showImageCapturePicker$13(this.f11392a, this.f11393b, aVar);
    }
}
