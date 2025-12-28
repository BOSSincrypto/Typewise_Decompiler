package J2;

import F2.b;
import I2.c;
import I2.e;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: J2.a  reason: case insensitive filesystem */
public abstract class C0290a implements b {
    public /* synthetic */ C0290a(i iVar) {
        this();
    }

    public static /* synthetic */ void n(C0290a aVar, c cVar, int i4, Object obj, boolean z3, int i5, Object obj2) {
        if (obj2 == null) {
            if ((i5 & 8) != 0) {
                z3 = true;
            }
            aVar.m(cVar, i4, obj, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int o(c cVar, Object obj) {
        int o4 = cVar.o(a());
        h(obj, o4);
        return o4;
    }

    public Object b(e eVar) {
        o.e(eVar, "decoder");
        return k(eVar, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object f();

    /* access modifiers changed from: protected */
    public abstract int g(Object obj);

    /* access modifiers changed from: protected */
    public abstract void h(Object obj, int i4);

    /* access modifiers changed from: protected */
    public abstract Iterator i(Object obj);

    /* access modifiers changed from: protected */
    public abstract int j(Object obj);

    public final Object k(e eVar, Object obj) {
        Object obj2;
        o.e(eVar, "decoder");
        if (obj == null || (obj2 = p(obj)) == null) {
            obj2 = f();
        }
        int g4 = g(obj2);
        c d4 = eVar.d(a());
        if (!d4.p()) {
            while (true) {
                int e4 = d4.e(a());
                if (e4 == -1) {
                    break;
                }
                n(this, d4, g4 + e4, obj2, false, 8, (Object) null);
            }
        } else {
            l(d4, obj2, g4, o(d4, obj2));
        }
        d4.c(a());
        return q(obj2);
    }

    /* access modifiers changed from: protected */
    public abstract void l(c cVar, Object obj, int i4, int i5);

    /* access modifiers changed from: protected */
    public abstract void m(c cVar, int i4, Object obj, boolean z3);

    /* access modifiers changed from: protected */
    public abstract Object p(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object q(Object obj);

    private C0290a() {
    }
}
