package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.C0749m;
import kotlinx.coroutines.F;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.y;
import l2.q;

public class u extends s {

    /* renamed from: d  reason: collision with root package name */
    private final Object f14073d;

    /* renamed from: e  reason: collision with root package name */
    public final C0747k f14074e;

    public u(Object obj, C0747k kVar) {
        this.f14073d = obj;
        this.f14074e = kVar;
    }

    public void R() {
        this.f14074e.w(C0749m.f14209a);
    }

    public Object S() {
        return this.f14073d;
    }

    public void T(j jVar) {
        C0747k kVar = this.f14074e;
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m1constructorimpl(f.a(jVar.Z())));
    }

    public y U(LockFreeLinkedListNode.c cVar) {
        LockFreeLinkedListNode.a aVar;
        C0747k kVar = this.f14074e;
        q qVar = q.f14567a;
        if (cVar != null) {
            aVar = cVar.f14155c;
        } else {
            aVar = null;
        }
        if (kVar.c(qVar, aVar) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.d();
        }
        return C0749m.f14209a;
    }

    public String toString() {
        return F.a(this) + '@' + F.b(this) + '(' + S() + ')';
    }
}
