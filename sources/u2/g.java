package U2;

import java.util.List;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.i;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.u;
import okhttp3.y;

public final class g implements u.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f1516a;

    /* renamed from: b  reason: collision with root package name */
    private final List f1517b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1518c;

    /* renamed from: d  reason: collision with root package name */
    private final c f1519d;

    /* renamed from: e  reason: collision with root package name */
    private final y f1520e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1521f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1522g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1523h;

    /* renamed from: i  reason: collision with root package name */
    private int f1524i;

    public g(e eVar, List list, int i4, c cVar, y yVar, int i5, int i6, int i7) {
        o.e(eVar, "call");
        o.e(list, "interceptors");
        o.e(yVar, "request");
        this.f1516a = eVar;
        this.f1517b = list;
        this.f1518c = i4;
        this.f1519d = cVar;
        this.f1520e = yVar;
        this.f1521f = i5;
        this.f1522g = i6;
        this.f1523h = i7;
    }

    public static /* synthetic */ g e(g gVar, int i4, c cVar, y yVar, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = gVar.f1518c;
        }
        if ((i8 & 2) != 0) {
            cVar = gVar.f1519d;
        }
        c cVar2 = cVar;
        if ((i8 & 4) != 0) {
            yVar = gVar.f1520e;
        }
        y yVar2 = yVar;
        if ((i8 & 8) != 0) {
            i5 = gVar.f1521f;
        }
        int i9 = i5;
        if ((i8 & 16) != 0) {
            i6 = gVar.f1522g;
        }
        int i10 = i6;
        if ((i8 & 32) != 0) {
            i7 = gVar.f1523h;
        }
        return gVar.d(i4, cVar2, yVar2, i9, i10, i7);
    }

    public y a() {
        return this.f1520e;
    }

    public A b(y yVar) {
        o.e(yVar, "request");
        if (this.f1518c < this.f1517b.size()) {
            this.f1524i++;
            c cVar = this.f1519d;
            if (cVar != null) {
                if (!cVar.j().g(yVar.j())) {
                    throw new IllegalStateException(("network interceptor " + this.f1517b.get(this.f1518c - 1) + " must retain the same host and port").toString());
                } else if (this.f1524i != 1) {
                    throw new IllegalStateException(("network interceptor " + this.f1517b.get(this.f1518c - 1) + " must call proceed() exactly once").toString());
                }
            }
            g e4 = e(this, this.f1518c + 1, (c) null, yVar, 0, 0, 0, 58, (Object) null);
            u uVar = (u) this.f1517b.get(this.f1518c);
            A a4 = uVar.a(e4);
            if (a4 == null) {
                throw new NullPointerException("interceptor " + uVar + " returned null");
            } else if (this.f1519d != null && this.f1518c + 1 < this.f1517b.size() && e4.f1524i != 1) {
                throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
            } else if (a4.a() != null) {
                return a4;
            } else {
                throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public i c() {
        c cVar = this.f1519d;
        if (cVar == null) {
            return null;
        }
        return cVar.h();
    }

    public okhttp3.e call() {
        return this.f1516a;
    }

    public final g d(int i4, c cVar, y yVar, int i5, int i6, int i7) {
        o.e(yVar, "request");
        return new g(this.f1516a, this.f1517b, i4, cVar, yVar, i5, i6, i7);
    }

    public final e f() {
        return this.f1516a;
    }

    public final int g() {
        return this.f1521f;
    }

    public final c h() {
        return this.f1519d;
    }

    public final int i() {
        return this.f1522g;
    }

    public final y j() {
        return this.f1520e;
    }

    public final int k() {
        return this.f1523h;
    }

    public int l() {
        return this.f1522g;
    }
}
