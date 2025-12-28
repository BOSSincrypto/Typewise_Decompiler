package androidx.lifecycle;

import androidx.lifecycle.C0452b;
import androidx.lifecycle.Lifecycle;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6037a;

    /* renamed from: b  reason: collision with root package name */
    private final C0452b.a f6038b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f6037a = obj;
        this.f6038b = C0452b.f6050c.c(obj.getClass());
    }

    public void c(m mVar, Lifecycle.Event event) {
        this.f6038b.a(mVar, event, this.f6037a);
    }
}
