package androidx.work;

import android.net.Uri;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final C0114b f7128i = new C0114b((i) null);

    /* renamed from: j  reason: collision with root package name */
    public static final b f7129j = new b((NetworkType) null, false, false, false, false, 0, 0, (Set) null, 255, (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final NetworkType f7130a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7131b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7132c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7133d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7134e;

    /* renamed from: f  reason: collision with root package name */
    private final long f7135f;

    /* renamed from: g  reason: collision with root package name */
    private final long f7136g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f7137h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7138a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7139b;

        /* renamed from: c  reason: collision with root package name */
        private NetworkType f7140c = NetworkType.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        private boolean f7141d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f7142e;

        /* renamed from: f  reason: collision with root package name */
        private long f7143f = -1;

        /* renamed from: g  reason: collision with root package name */
        private long f7144g = -1;

        /* renamed from: h  reason: collision with root package name */
        private Set f7145h = new LinkedHashSet();

        public final b a() {
            Set set;
            long j4;
            long j5;
            if (Build.VERSION.SDK_INT >= 24) {
                set = C0718m.F0(this.f7145h);
                j5 = this.f7143f;
                j4 = this.f7144g;
            } else {
                set = L.e();
                j5 = -1;
                j4 = -1;
            }
            return new b(this.f7140c, this.f7138a, this.f7139b, this.f7141d, this.f7142e, j5, j4, set);
        }

        public final a b(NetworkType networkType) {
            o.e(networkType, "networkType");
            this.f7140c = networkType;
            return this;
        }

        public final a c(boolean z3) {
            this.f7141d = z3;
            return this;
        }

        public final a d(boolean z3) {
            this.f7138a = z3;
            return this;
        }

        public final a e(boolean z3) {
            this.f7139b = z3;
            return this;
        }

        public final a f(boolean z3) {
            this.f7142e = z3;
            return this;
        }
    }

    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    public static final class C0114b {
        public /* synthetic */ C0114b(i iVar) {
            this();
        }

        private C0114b() {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f7146a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f7147b;

        public c(Uri uri, boolean z3) {
            o.e(uri, "uri");
            this.f7146a = uri;
            this.f7147b = z3;
        }

        public final Uri a() {
            return this.f7146a;
        }

        public final boolean b() {
            return this.f7147b;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!o.a(c.class, cls)) {
                return false;
            }
            o.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            if (o.a(this.f7146a, cVar.f7146a) && this.f7147b == cVar.f7147b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f7146a.hashCode() * 31) + c.a(this.f7147b);
        }
    }

    public b(NetworkType networkType, boolean z3, boolean z4, boolean z5, boolean z6, long j4, long j5, Set set) {
        o.e(networkType, "requiredNetworkType");
        o.e(set, "contentUriTriggers");
        this.f7130a = networkType;
        this.f7131b = z3;
        this.f7132c = z4;
        this.f7133d = z5;
        this.f7134e = z6;
        this.f7135f = j4;
        this.f7136g = j5;
        this.f7137h = set;
    }

    public final long a() {
        return this.f7136g;
    }

    public final long b() {
        return this.f7135f;
    }

    public final Set c() {
        return this.f7137h;
    }

    public final NetworkType d() {
        return this.f7130a;
    }

    public final boolean e() {
        return !this.f7137h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!o.a(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7131b == bVar.f7131b && this.f7132c == bVar.f7132c && this.f7133d == bVar.f7133d && this.f7134e == bVar.f7134e && this.f7135f == bVar.f7135f && this.f7136g == bVar.f7136g && this.f7130a == bVar.f7130a) {
            return o.a(this.f7137h, bVar.f7137h);
        }
        return false;
    }

    public final boolean f() {
        return this.f7133d;
    }

    public final boolean g() {
        return this.f7131b;
    }

    public final boolean h() {
        return this.f7132c;
    }

    public int hashCode() {
        long j4 = this.f7135f;
        long j5 = this.f7136g;
        return (((((((((((((this.f7130a.hashCode() * 31) + (this.f7131b ? 1 : 0)) * 31) + (this.f7132c ? 1 : 0)) * 31) + (this.f7133d ? 1 : 0)) * 31) + (this.f7134e ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f7137h.hashCode();
    }

    public final boolean i() {
        return this.f7134e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(androidx.work.NetworkType r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, kotlin.jvm.internal.i r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = kotlin.collections.L.e()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.<init>(androidx.work.NetworkType, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(androidx.work.b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.e(r13, r0)
            boolean r3 = r13.f7131b
            boolean r4 = r13.f7132c
            androidx.work.NetworkType r2 = r13.f7130a
            boolean r5 = r13.f7133d
            boolean r6 = r13.f7134e
            java.util.Set r11 = r13.f7137h
            long r7 = r13.f7135f
            long r9 = r13.f7136g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.<init>(androidx.work.b):void");
    }
}
