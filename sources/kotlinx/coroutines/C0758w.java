package kotlinx.coroutines;

import kotlin.jvm.internal.o;
import u2.l;

/* renamed from: kotlinx.coroutines.w  reason: case insensitive filesystem */
public final class C0758w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14318a;

    /* renamed from: b  reason: collision with root package name */
    public final l f14319b;

    public C0758w(Object obj, l lVar) {
        this.f14318a = obj;
        this.f14319b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0758w)) {
            return false;
        }
        C0758w wVar = (C0758w) obj;
        return o.a(this.f14318a, wVar.f14318a) && o.a(this.f14319b, wVar.f14319b);
    }

    public int hashCode() {
        Object obj = this.f14318a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f14319b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f14318a + ", onCancellation=" + this.f14319b + ')';
    }
}
