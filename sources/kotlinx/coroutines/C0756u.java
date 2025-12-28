package kotlinx.coroutines;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;

/* renamed from: kotlinx.coroutines.u  reason: case insensitive filesystem */
final class C0756u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14310a;

    /* renamed from: b  reason: collision with root package name */
    public final C0740i f14311b;

    /* renamed from: c  reason: collision with root package name */
    public final l f14312c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14313d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f14314e;

    public C0756u(Object obj, C0740i iVar, l lVar, Object obj2, Throwable th) {
        this.f14310a = obj;
        this.f14311b = iVar;
        this.f14312c = lVar;
        this.f14313d = obj2;
        this.f14314e = th;
    }

    public static /* synthetic */ C0756u b(C0756u uVar, Object obj, C0740i iVar, l lVar, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = uVar.f14310a;
        }
        if ((i4 & 2) != 0) {
            iVar = uVar.f14311b;
        }
        C0740i iVar2 = iVar;
        if ((i4 & 4) != 0) {
            lVar = uVar.f14312c;
        }
        l lVar2 = lVar;
        if ((i4 & 8) != 0) {
            obj2 = uVar.f14313d;
        }
        Object obj4 = obj2;
        if ((i4 & 16) != 0) {
            th = uVar.f14314e;
        }
        return uVar.a(obj, iVar2, lVar2, obj4, th);
    }

    public final C0756u a(Object obj, C0740i iVar, l lVar, Object obj2, Throwable th) {
        return new C0756u(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        if (this.f14314e != null) {
            return true;
        }
        return false;
    }

    public final void d(C0748l lVar, Throwable th) {
        C0740i iVar = this.f14311b;
        if (iVar != null) {
            lVar.m(iVar, th);
        }
        l lVar2 = this.f14312c;
        if (lVar2 != null) {
            lVar.o(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0756u)) {
            return false;
        }
        C0756u uVar = (C0756u) obj;
        return o.a(this.f14310a, uVar.f14310a) && o.a(this.f14311b, uVar.f14311b) && o.a(this.f14312c, uVar.f14312c) && o.a(this.f14313d, uVar.f14313d) && o.a(this.f14314e, uVar.f14314e);
    }

    public int hashCode() {
        Object obj = this.f14310a;
        int i4 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0740i iVar = this.f14311b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.f14312c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f14313d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f14314e;
        if (th != null) {
            i4 = th.hashCode();
        }
        return hashCode4 + i4;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f14310a + ", cancelHandler=" + this.f14311b + ", onCancellation=" + this.f14312c + ", idempotentResume=" + this.f14313d + ", cancelCause=" + this.f14314e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0756u(Object obj, C0740i iVar, l lVar, Object obj2, Throwable th, int i4, i iVar2) {
        this(obj, (i4 & 2) != 0 ? null : iVar, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
