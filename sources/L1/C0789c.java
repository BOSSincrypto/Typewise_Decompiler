package l1;

import androidx.core.util.d;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p1.j;
import y.C0939a;

/* renamed from: l1.c  reason: case insensitive filesystem */
public class C0789c {

    /* renamed from: c  reason: collision with root package name */
    private static final q f14532c;

    /* renamed from: a  reason: collision with root package name */
    private final C0939a f14533a = new C0939a();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f14534b = new AtomicReference();

    static {
        Class<Object> cls = Object.class;
        Class<Object> cls2 = Object.class;
        Class<Object> cls3 = Object.class;
        f14532c = new q(cls, cls2, cls3, Collections.singletonList(new g(Object.class, Object.class, Object.class, Collections.emptyList(), new j1.g(), (d) null)), (d) null);
    }

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f14534b.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public q a(Class cls, Class cls2, Class cls3) {
        q qVar;
        j b4 = b(cls, cls2, cls3);
        synchronized (this.f14533a) {
            qVar = (q) this.f14533a.get(b4);
        }
        this.f14534b.set(b4);
        return qVar;
    }

    public boolean c(q qVar) {
        return f14532c.equals(qVar);
    }

    public void d(Class cls, Class cls2, Class cls3, q qVar) {
        synchronized (this.f14533a) {
            C0939a aVar = this.f14533a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f14532c;
            }
            aVar.put(jVar, qVar);
        }
    }
}
