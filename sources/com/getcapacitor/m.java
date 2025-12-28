package com.getcapacitor;

import android.webkit.GeolocationPermissions;
import com.getcapacitor.BridgeWebChromeClient;

public final /* synthetic */ class m implements BridgeWebChromeClient.PermissionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BridgeWebChromeClient f11387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GeolocationPermissions.Callback f11388b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11389c;

    public /* synthetic */ m(BridgeWebChromeClient bridgeWebChromeClient, GeolocationPermissions.Callback callback, String str) {
        this.f11387a = bridgeWebChromeClient;
        this.f11388b = callback;
        this.f11389c = str;
    }

    public final void onPermissionSelect(Boolean bool) {
        this.f11387a.lambda$onGeolocationPermissionsShowPrompt$11(this.f11388b, this.f11389c, bool);
    }
}
