package kotlinx.coroutines.internal;

public class k extends LockFreeLinkedListNode {
    public boolean L() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean M() {
        return ((Boolean) S()).booleanValue();
    }

    public final boolean R() {
        if (G() == this) {
            return true;
        }
        return false;
    }

    public final Void S() {
        throw new IllegalStateException("head cannot be removed");
    }
}
