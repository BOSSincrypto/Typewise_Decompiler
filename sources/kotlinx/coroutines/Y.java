package kotlinx.coroutines;

import kotlinx.coroutines.internal.y;

public abstract class Y {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final y f14019a = new y("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final y f14020b = new y("CLOSED_EMPTY");

    public static final long c(long j4) {
        if (j4 <= 0) {
            return 0;
        }
        if (j4 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j4;
    }
}
