package kotlinx.coroutines.channels;

import kotlinx.coroutines.C0749m;
import kotlinx.coroutines.F;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.y;

public final class j extends s implements q {

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f14070d;

    public j(Throwable th) {
        this.f14070d = th;
    }

    public void R() {
    }

    public void T(j jVar) {
    }

    public y U(LockFreeLinkedListNode.c cVar) {
        y yVar = C0749m.f14209a;
        if (cVar != null) {
            cVar.d();
        }
        return yVar;
    }

    /* renamed from: W */
    public j o() {
        return this;
    }

    /* renamed from: X */
    public j S() {
        return this;
    }

    public final Throwable Y() {
        Throwable th = this.f14070d;
        if (th == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return th;
    }

    public final Throwable Z() {
        Throwable th = this.f14070d;
        if (th == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return th;
    }

    public void h(Object obj) {
    }

    public y s(Object obj, LockFreeLinkedListNode.c cVar) {
        y yVar = C0749m.f14209a;
        if (cVar != null) {
            cVar.d();
        }
        return yVar;
    }

    public String toString() {
        return "Closed@" + F.b(this) + '[' + this.f14070d + ']';
    }
}
