package com.getcapacitor.cordova;

import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import org.apache.cordova.NativeToJsMessageQueue;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MockCordovaWebViewImpl.CapacitorEvalBridgeMode f11375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NativeToJsMessageQueue f11376b;

    public /* synthetic */ c(MockCordovaWebViewImpl.CapacitorEvalBridgeMode capacitorEvalBridgeMode, NativeToJsMessageQueue nativeToJsMessageQueue) {
        this.f11375a = capacitorEvalBridgeMode;
        this.f11376b = nativeToJsMessageQueue;
    }

    public final void run() {
        this.f11375a.lambda$onNativeToJsMessageAvailable$0(this.f11376b);
    }
}
