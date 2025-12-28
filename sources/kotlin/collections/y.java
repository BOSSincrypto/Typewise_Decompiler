package kotlin.collections;

import kotlin.jvm.internal.o;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final int f13867a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f13868b;

    public y(int i4, Object obj) {
        this.f13867a = i4;
        this.f13868b = obj;
    }

    public final int a() {
        return this.f13867a;
    }

    public final Object b() {
        return this.f13868b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f13867a == yVar.f13867a && o.a(this.f13868b, yVar.f13868b);
    }

    public int hashCode() {
        int i4 = this.f13867a * 31;
        Object obj = this.f13868b;
        return i4 + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f13867a + ", value=" + this.f13868b + ')';
    }
}
