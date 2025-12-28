package l1;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p1.j;
import y.C0939a;

/* renamed from: l1.d  reason: case insensitive filesystem */
public class C0790d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f14535a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    private final C0939a f14536b = new C0939a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f14535a.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f14536b) {
            list = (List) this.f14536b.get(jVar);
        }
        this.f14535a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f14536b) {
            this.f14536b.put(new j(cls, cls2, cls3), list);
        }
    }
}
