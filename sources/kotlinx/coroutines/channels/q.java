package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.y;

public interface q {
    void h(Object obj);

    Object o();

    y s(Object obj, LockFreeLinkedListNode.c cVar);
}
