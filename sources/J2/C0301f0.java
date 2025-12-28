package J2;

import F2.b;
import H2.f;
import I2.e;
import kotlin.jvm.internal.o;

/* renamed from: J2.f0  reason: case insensitive filesystem */
public final class C0301f0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f698a;

    /* renamed from: b  reason: collision with root package name */
    private final f f699b;

    public C0301f0(b bVar) {
        o.e(bVar, "serializer");
        this.f698a = bVar;
        this.f699b = new B0(bVar.a());
    }

    public f a() {
        return this.f699b;
    }

    public Object b(e eVar) {
        o.e(eVar, "decoder");
        if (eVar.j()) {
            return eVar.w(this.f698a);
        }
        return eVar.A();
    }

    public void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        if (obj != null) {
            fVar.E();
            fVar.k(this.f698a, obj);
            return;
        }
        fVar.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0301f0.class != obj.getClass() || !o.a(this.f698a, ((C0301f0) obj).f698a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f698a.hashCode();
    }
}
