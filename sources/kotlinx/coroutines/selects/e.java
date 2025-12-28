package kotlinx.coroutines.selects;

import kotlinx.coroutines.internal.y;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14290a = new y("NOT_SELECTED");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f14291b = new y("ALREADY_SELECTED");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14292c = new y("UNDECIDED");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Object f14293d = new y("RESUMED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f f14294e = new f();

    public static final Object d() {
        return f14291b;
    }

    public static final Object e() {
        return f14290a;
    }
}
