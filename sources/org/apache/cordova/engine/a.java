package org.apache.cordova.engine;

import android.webkit.WebResourceResponse;
import f0.d;

public final /* synthetic */ class a implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SystemWebViewClient f15701a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SystemWebViewEngine f15702b;

    public /* synthetic */ a(SystemWebViewClient systemWebViewClient, SystemWebViewEngine systemWebViewEngine) {
        this.f15701a = systemWebViewClient;
        this.f15702b = systemWebViewEngine;
    }

    public final WebResourceResponse a(String str) {
        return this.f15701a.lambda$new$0(this.f15702b, str);
    }
}
