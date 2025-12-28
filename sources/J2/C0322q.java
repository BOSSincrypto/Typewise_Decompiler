package J2;

import F2.b;
import H2.f;
import I2.c;
import I2.d;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: J2.q  reason: case insensitive filesystem */
public abstract class C0322q extends C0290a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f727a;

    public /* synthetic */ C0322q(b bVar, i iVar) {
        this(bVar);
    }

    public abstract f a();

    public void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        int j4 = j(obj);
        f a4 = a();
        d x3 = fVar.x(a4, j4);
        Iterator i4 = i(obj);
        for (int i5 = 0; i5 < j4; i5++) {
            x3.f(a(), i5, this.f727a, i4.next());
        }
        x3.c(a4);
    }

    /* access modifiers changed from: protected */
    public final void l(c cVar, Object obj, int i4, int i5) {
        o.e(cVar, "decoder");
        if (i5 >= 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                m(cVar, i4 + i6, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
    }

    /* access modifiers changed from: protected */
    public void m(c cVar, int i4, Object obj, boolean z3) {
        o.e(cVar, "decoder");
        s(obj, i4, c.a.c(cVar, a(), i4, this.f727a, (Object) null, 8, (Object) null));
    }

    /* access modifiers changed from: protected */
    public abstract void s(Object obj, int i4, Object obj2);

    private C0322q(b bVar) {
        super((i) null);
        this.f727a = bVar;
    }
}
