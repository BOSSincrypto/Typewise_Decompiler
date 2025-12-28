package kotlinx.coroutines.internal;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14183a = new y("CONDITION_FALSE");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f14184b = new y("LIST_EMPTY");

    public static final Object a() {
        return f14183a;
    }

    public static final Object b() {
        return f14184b;
    }

    public static final LockFreeLinkedListNode c(Object obj) {
        u uVar;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar == null || (lockFreeLinkedListNode = uVar.f14198a) == null) {
            return (LockFreeLinkedListNode) obj;
        }
        return lockFreeLinkedListNode;
    }
}
