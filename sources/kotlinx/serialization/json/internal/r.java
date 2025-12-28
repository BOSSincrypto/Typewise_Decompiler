package kotlinx.serialization.json.internal;

import K2.C0341a;
import kotlin.jvm.internal.o;

public final class r extends C0769h {

    /* renamed from: c  reason: collision with root package name */
    private final C0341a f14398c;

    /* renamed from: d  reason: collision with root package name */
    private int f14399d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(v vVar, C0341a aVar) {
        super(vVar);
        o.e(vVar, "writer");
        o.e(aVar, "json");
        this.f14398c = aVar;
    }

    public void b() {
        o(true);
        this.f14399d++;
    }

    public void c() {
        o(false);
        k("\n");
        int i4 = this.f14399d;
        for (int i5 = 0; i5 < i4; i5++) {
            k(this.f14398c.d().n());
        }
    }

    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    public void p() {
        f(' ');
    }

    public void q() {
        this.f14399d--;
    }
}
