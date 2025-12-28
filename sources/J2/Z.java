package J2;

import F2.b;
import H2.e;
import H2.f;
import I2.c;
import I2.d;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import z2.C0973a;

public abstract class Z extends C0290a {

    /* renamed from: a  reason: collision with root package name */
    private final b f684a;

    /* renamed from: b  reason: collision with root package name */
    private final b f685b;

    public /* synthetic */ Z(b bVar, b bVar2, i iVar) {
        this(bVar, bVar2);
    }

    public abstract f a();

    public void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        int j4 = j(obj);
        f a4 = a();
        d x3 = fVar.x(a4, j4);
        Iterator i4 = i(obj);
        int i5 = 0;
        while (i4.hasNext()) {
            Map.Entry entry = (Map.Entry) i4.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i6 = i5 + 1;
            x3.f(a(), i5, r(), key);
            i5 += 2;
            x3.f(a(), i6, s(), value);
        }
        x3.c(a4);
    }

    public final b r() {
        return this.f684a;
    }

    public final b s() {
        return this.f685b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void l(c cVar, Map map, int i4, int i5) {
        o.e(cVar, "decoder");
        o.e(map, "builder");
        if (i5 >= 0) {
            C0973a i6 = z2.d.i(z2.d.j(0, i5 * 2), 2);
            int b4 = i6.b();
            int c4 = i6.c();
            int d4 = i6.d();
            if ((d4 > 0 && b4 <= c4) || (d4 < 0 && c4 <= b4)) {
                while (true) {
                    m(cVar, i4 + b4, map, false);
                    if (b4 != c4) {
                        b4 += d4;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void m(c cVar, int i4, Map map, boolean z3) {
        int i5;
        Object obj;
        o.e(cVar, "decoder");
        o.e(map, "builder");
        Object c4 = c.a.c(cVar, a(), i4, this.f684a, (Object) null, 8, (Object) null);
        if (z3) {
            i5 = cVar.e(a());
            if (i5 != i4 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i4 + ", returned index for value: " + i5).toString());
            }
        } else {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (!map.containsKey(c4) || (this.f685b.a().c() instanceof e)) {
            obj = c.a.c(cVar, a(), i6, this.f685b, (Object) null, 8, (Object) null);
        } else {
            obj = cVar.E(a(), i6, this.f685b, D.i(map, c4));
        }
        map.put(c4, obj);
    }

    private Z(b bVar, b bVar2) {
        super((i) null);
        this.f684a = bVar;
        this.f685b = bVar2;
    }
}
