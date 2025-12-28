package kotlinx.serialization.json.internal;

import H2.f;
import K2.C0341a;
import K2.C0342b;
import K2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

final class F extends C0764c {

    /* renamed from: g  reason: collision with root package name */
    private final C0342b f14337g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14338h = z0().size();

    /* renamed from: i  reason: collision with root package name */
    private int f14339i = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F(C0341a aVar, C0342b bVar) {
        super(aVar, bVar, (String) null, 4, (i) null);
        o.e(aVar, "json");
        o.e(bVar, "value");
        this.f14337g = bVar;
    }

    /* renamed from: C0 */
    public C0342b z0() {
        return this.f14337g;
    }

    public int e(f fVar) {
        o.e(fVar, "descriptor");
        int i4 = this.f14339i;
        if (i4 >= this.f14338h - 1) {
            return -1;
        }
        int i5 = i4 + 1;
        this.f14339i = i5;
        return i5;
    }

    /* access modifiers changed from: protected */
    public String f0(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return String.valueOf(i4);
    }

    /* access modifiers changed from: protected */
    public h l0(String str) {
        o.e(str, "tag");
        return z0().get(Integer.parseInt(str));
    }
}
