package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.F;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* synthetic */ class LockFreeLinkedListNode$toString$1 extends PropertyReference0Impl {
    LockFreeLinkedListNode$toString$1(Object obj) {
        super(obj, F.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    public Object get() {
        return F.a(this.receiver);
    }
}
