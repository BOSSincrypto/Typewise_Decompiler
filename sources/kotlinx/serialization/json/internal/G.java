package kotlinx.serialization.json.internal;

import H2.f;
import K2.B;
import K2.C0341a;
import K2.h;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

final class G extends E {

    /* renamed from: k  reason: collision with root package name */
    private final B f14340k;

    /* renamed from: l  reason: collision with root package name */
    private final List f14341l;

    /* renamed from: m  reason: collision with root package name */
    private final int f14342m;

    /* renamed from: n  reason: collision with root package name */
    private int f14343n = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(C0341a aVar, B b4) {
        super(aVar, b4, (String) null, (f) null, 12, (i) null);
        o.e(aVar, "json");
        o.e(b4, "value");
        this.f14340k = b4;
        List B02 = C0718m.B0(z0().keySet());
        this.f14341l = B02;
        this.f14342m = B02.size() * 2;
    }

    /* renamed from: E0 */
    public B z0() {
        return this.f14340k;
    }

    public void c(f fVar) {
        o.e(fVar, "descriptor");
    }

    public int e(f fVar) {
        o.e(fVar, "descriptor");
        int i4 = this.f14343n;
        if (i4 >= this.f14342m - 1) {
            return -1;
        }
        int i5 = i4 + 1;
        this.f14343n = i5;
        return i5;
    }

    /* access modifiers changed from: protected */
    public String f0(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return (String) this.f14341l.get(i4 / 2);
    }

    /* access modifiers changed from: protected */
    public h l0(String str) {
        o.e(str, "tag");
        if (this.f14343n % 2 == 0) {
            return K2.i.a(str);
        }
        return (h) D.i(z0(), str);
    }
}
