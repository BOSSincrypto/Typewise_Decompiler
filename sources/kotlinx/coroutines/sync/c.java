package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.y;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final y f14304a = new y("LOCK_FAIL");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final y f14305b = new y("UNLOCK_FAIL");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final y f14306c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final y f14307d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final a f14308e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a f14309f;

    static {
        y yVar = new y("LOCKED");
        f14306c = yVar;
        y yVar2 = new y("UNLOCKED");
        f14307d = yVar2;
        f14308e = new a(yVar);
        f14309f = new a(yVar2);
    }

    public static final b a(boolean z3) {
        return new MutexImpl(z3);
    }

    public static /* synthetic */ b b(boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return a(z3);
    }
}
