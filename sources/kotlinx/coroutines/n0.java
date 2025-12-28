package kotlinx.coroutines;

import kotlinx.coroutines.internal.y;

public abstract class n0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final y f14218a = new y("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final y f14219b = new y("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final y f14220c = new y("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final y f14221d = new y("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final y f14222e = new y("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final T f14223f = new T(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final T f14224g = new T(true);

    public static final Object g(Object obj) {
        if (obj instanceof C0729b0) {
            return new C0731c0((C0729b0) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        C0731c0 c0Var;
        C0729b0 b0Var;
        if (obj instanceof C0731c0) {
            c0Var = (C0731c0) obj;
        } else {
            c0Var = null;
        }
        if (c0Var == null || (b0Var = c0Var.f14032a) == null) {
            return obj;
        }
        return b0Var;
    }
}
