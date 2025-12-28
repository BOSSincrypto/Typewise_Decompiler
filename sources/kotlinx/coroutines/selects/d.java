package kotlinx.coroutines.selects;

import kotlin.coroutines.c;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.internal.C0742b;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

public interface d {
    c e();

    void k(Throwable th);

    Object m(C0742b bVar);

    Object n(LockFreeLinkedListNode.c cVar);

    boolean q();

    void t(Q q4);

    boolean v();
}
