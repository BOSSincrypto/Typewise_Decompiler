package E0;

import kotlin.jvm.internal.o;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Object f388a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f389b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f390c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f391d;

    public r(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f388a = obj;
        this.f389b = obj2;
        this.f390c = obj3;
        this.f391d = obj4;
    }

    public final Object a() {
        return this.f388a;
    }

    public final Object b() {
        return this.f389b;
    }

    public final Object c() {
        return this.f390c;
    }

    public final Object d() {
        return this.f391d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (o.a(this.f388a, rVar.f388a) && o.a(this.f389b, rVar.f389b) && o.a(this.f390c, rVar.f390c) && o.a(this.f391d, rVar.f391d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        Object obj = this.f388a;
        int i7 = 0;
        if (obj == null) {
            i4 = 0;
        } else {
            i4 = obj.hashCode();
        }
        int i8 = i4 * 31;
        Object obj2 = this.f389b;
        if (obj2 == null) {
            i5 = 0;
        } else {
            i5 = obj2.hashCode();
        }
        int i9 = (i8 + i5) * 31;
        Object obj3 = this.f390c;
        if (obj3 == null) {
            i6 = 0;
        } else {
            i6 = obj3.hashCode();
        }
        int i10 = (i9 + i6) * 31;
        Object obj4 = this.f391d;
        if (obj4 != null) {
            i7 = obj4.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        Object obj = this.f388a;
        Object obj2 = this.f389b;
        Object obj3 = this.f390c;
        Object obj4 = this.f391d;
        return "(" + obj + ", " + obj2 + ", " + obj3 + ", " + obj4 + ")";
    }
}
