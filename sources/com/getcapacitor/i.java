package com.getcapacitor;

import android.webkit.ValueCallback;
import androidx.activity.result.a;
import com.getcapacitor.BridgeWebChromeClient;

public final /* synthetic */ class i implements BridgeWebChromeClient.ActivityResultListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f11380a;

    public /* synthetic */ i(ValueCallback valueCallback) {
        this.f11380a = valueCallback;
    }

    public final void onActivityResult(a aVar) {
        BridgeWebChromeClient.lambda$showVideoCapturePicker$14(this.f11380a, aVar);
    }
}
