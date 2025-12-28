package kotlinx.coroutines;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import l2.q;

final class v0 extends C0734e {

    /* renamed from: a  reason: collision with root package name */
    private final LockFreeLinkedListNode f14317a;

    public v0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f14317a = lockFreeLinkedListNode;
    }

    public void a(Throwable th) {
        this.f14317a.M();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return q.f14567a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f14317a + ']';
    }
}
