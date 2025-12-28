package kotlinx.coroutines.internal;

import B2.h;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.q0;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f14196a;

    /* renamed from: b  reason: collision with root package name */
    public static final q0 f14197b;

    static {
        q qVar = new q();
        f14196a = qVar;
        z.e("kotlinx.coroutines.fast.service.loader", true);
        f14197b = qVar.a();
    }

    private q() {
    }

    private final q0 a() {
        Object obj;
        Class<p> cls = p.class;
        try {
            List o4 = h.o(h.c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator it = o4.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c4 = ((p) obj).c();
                    do {
                        Object next = it.next();
                        int c5 = ((p) next).c();
                        if (c4 < c5) {
                            obj = next;
                            c4 = c5;
                        }
                    } while (it.hasNext());
                }
            }
            p pVar = (p) obj;
            if (pVar != null) {
                q0 e4 = r.e(pVar, o4);
                if (e4 != null) {
                    return e4;
                }
            }
            r.b((Throwable) null, (String) null, 3, (Object) null);
            return null;
        } catch (Throwable th) {
            r.b(th, (String) null, 2, (Object) null);
            return null;
        }
    }
}
