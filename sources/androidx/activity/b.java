package androidx.activity;

import kotlin.jvm.internal.i;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f2365e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f2366a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2367b;

    /* renamed from: c  reason: collision with root package name */
    private final float f2368c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2369d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public b(float f4, float f5, float f6, int i4) {
        this.f2366a = f4;
        this.f2367b = f5;
        this.f2368c = f6;
        this.f2369d = i4;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f2366a + ", touchY=" + this.f2367b + ", progress=" + this.f2368c + ", swipeEdge=" + this.f2369d + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.window.BackEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.o.e(r5, r0)
            androidx.activity.a r0 = androidx.activity.a.f2364a
            float r1 = r0.d(r5)
            float r2 = r0.e(r5)
            float r3 = r0.b(r5)
            int r5 = r0.c(r5)
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.<init>(android.window.BackEvent):void");
    }
}
