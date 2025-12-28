package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.o;

/* renamed from: kotlinx.serialization.json.internal.i  reason: case insensitive filesystem */
public final class C0770i extends C0769h {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14396c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0770i(v vVar, boolean z3) {
        super(vVar);
        o.e(vVar, "writer");
        this.f14396c = z3;
    }

    public void n(String str) {
        o.e(str, "value");
        if (this.f14396c) {
            super.n(str);
        } else {
            super.k(str);
        }
    }
}
