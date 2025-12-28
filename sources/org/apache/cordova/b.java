package org.apache.cordova;

import java.util.function.BiConsumer;

public final /* synthetic */ class b implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15697a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15698b;

    public /* synthetic */ b(String str, Object obj) {
        this.f15697a = str;
        this.f15698b = obj;
    }

    public final void accept(Object obj, Object obj2) {
        PluginManager.lambda$postMessage$0(this.f15697a, this.f15698b, (String) obj, (CordovaPlugin) obj2);
    }
}
