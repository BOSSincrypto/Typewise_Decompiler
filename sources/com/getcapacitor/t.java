package com.getcapacitor;

import android.webkit.PermissionRequest;
import com.getcapacitor.BridgeWebChromeClient;

public final /* synthetic */ class t implements BridgeWebChromeClient.PermissionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PermissionRequest f11398a;

    public /* synthetic */ t(PermissionRequest permissionRequest) {
        this.f11398a = permissionRequest;
    }

    public final void onPermissionSelect(Boolean bool) {
        BridgeWebChromeClient.lambda$onPermissionRequest$2(this.f11398a, bool);
    }
}
