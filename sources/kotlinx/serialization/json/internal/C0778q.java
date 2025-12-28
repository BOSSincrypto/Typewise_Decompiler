package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.o;
import l2.h;
import l2.j;
import l2.l;

/* renamed from: kotlinx.serialization.json.internal.q  reason: case insensitive filesystem */
public final class C0778q extends C0769h {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14397c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0778q(v vVar, boolean z3) {
        super(vVar);
        o.e(vVar, "writer");
        this.f14397c = z3;
    }

    public void e(byte b4) {
        boolean z3 = this.f14397c;
        String e4 = h.e(h.b(b4));
        if (z3) {
            n(e4);
        } else {
            k(e4);
        }
    }

    public void i(int i4) {
        boolean z3 = this.f14397c;
        int b4 = j.b(i4);
        if (z3) {
            n(Long.toString(((long) b4) & 4294967295L, 10));
        } else {
            k(Long.toString(((long) b4) & 4294967295L, 10));
        }
    }

    public void j(long j4) {
        boolean z3 = this.f14397c;
        long b4 = l.b(j4);
        if (z3) {
            n(C0776o.a(b4, 10));
        } else {
            k(C0777p.a(b4, 10));
        }
    }

    public void l(short s4) {
        boolean z3 = this.f14397c;
        String e4 = l2.o.e(l2.o.b(s4));
        if (z3) {
            n(e4);
        } else {
            k(e4);
        }
    }
}
