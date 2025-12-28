package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract /* synthetic */ class m {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i4, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }
}
