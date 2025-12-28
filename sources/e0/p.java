package E0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final a f385c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private float f386a;

    /* renamed from: b  reason: collision with root package name */
    private float f387b;

    public static final class a {
        private a() {
        }

        public final float a(p pVar, p pVar2) {
            o.e(pVar, "p1");
            o.e(pVar2, "p2");
            return (float) Math.sqrt((double) (((pVar.a() - pVar2.a()) * (pVar.a() - pVar2.a())) + ((pVar.b() - pVar2.b()) * (pVar.b() - pVar2.b()))));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public p(float f4, float f5) {
        this.f386a = f4;
        this.f387b = f5;
    }

    public final float a() {
        return this.f386a;
    }

    public final float b() {
        return this.f387b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.compare(this.f386a, pVar.f386a) == 0 && Float.compare(this.f387b, pVar.f387b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f386a) * 31) + Float.floatToIntBits(this.f387b);
    }

    public String toString() {
        float f4 = this.f386a;
        float f5 = this.f387b;
        return "Point(" + f4 + ", " + f5 + ")";
    }
}
