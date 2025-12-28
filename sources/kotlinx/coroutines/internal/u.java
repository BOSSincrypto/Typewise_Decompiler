package kotlinx.coroutines.internal;

final class u {

    /* renamed from: a  reason: collision with root package name */
    public final LockFreeLinkedListNode f14198a;

    public u(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f14198a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f14198a + ']';
    }
}
