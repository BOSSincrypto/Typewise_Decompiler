package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14187e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14188f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f14189g;

    /* renamed from: h  reason: collision with root package name */
    public static final y f14190h = new y("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f14191a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14192b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14193c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f14194d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a(long j4) {
            return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j4, int i4) {
            return d(j4, 1073741823) | ((long) i4);
        }

        public final long c(long j4, int i4) {
            return d(j4, 1152921503533105152L) | (((long) i4) << 30);
        }

        public final long d(long j4, long j5) {
            return j4 & (~j5);
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f14195a;

        public b(int i4) {
            this.f14195a = i4;
        }
    }

    static {
        Class<o> cls = o.class;
        f14188f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f14189g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public o(int i4, boolean z3) {
        this.f14191a = i4;
        this.f14192b = z3;
        int i5 = i4 - 1;
        this.f14193c = i5;
        this.f14194d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i4 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final o b(long j4) {
        o oVar = new o(this.f14191a * 2, this.f14192b);
        int i4 = (int) (1073741823 & j4);
        int i5 = (int) ((1152921503533105152L & j4) >> 30);
        while (true) {
            int i6 = this.f14193c;
            if ((i4 & i6) != (i5 & i6)) {
                Object obj = this.f14194d.get(i6 & i4);
                if (obj == null) {
                    obj = new b(i4);
                }
                oVar.f14194d.set(oVar.f14193c & i4, obj);
                i4++;
            } else {
                oVar._state = f14187e.d(j4, 1152921504606846976L);
                return oVar;
            }
        }
    }

    private final o c(long j4) {
        while (true) {
            o oVar = (o) this._next;
            if (oVar != null) {
                return oVar;
            }
            androidx.concurrent.futures.b.a(f14188f, this, (Object) null, b(j4));
        }
    }

    private final o e(int i4, Object obj) {
        Object obj2 = this.f14194d.get(this.f14193c & i4);
        if (!(obj2 instanceof b) || ((b) obj2).f14195a != i4) {
            return null;
        }
        this.f14194d.set(i4 & this.f14193c, obj);
        return this;
    }

    private final long h() {
        long j4;
        long j5;
        do {
            j4 = this._state;
            if ((j4 & 1152921504606846976L) != 0) {
                return j4;
            }
            j5 = j4 | 1152921504606846976L;
        } while (!f14189g.compareAndSet(this, j4, j5));
        return j5;
    }

    private final o k(int i4, int i5) {
        long j4;
        int i6;
        do {
            j4 = this._state;
            i6 = (int) (1073741823 & j4);
            if ((1152921504606846976L & j4) != 0) {
                return i();
            }
        } while (!f14189g.compareAndSet(this, j4, f14187e.b(j4, i5)));
        this.f14194d.set(i6 & this.f14193c, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[LOOP:1: B:19:0x0066->B:22:0x0077, LOOP_START, PHI: r0 
      PHI: (r0v12 kotlinx.coroutines.internal.o) = (r0v11 kotlinx.coroutines.internal.o), (r0v14 kotlinx.coroutines.internal.o) binds: [B:18:0x005e, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r12) {
        /*
            r11 = this;
        L_0x0000:
            long r2 = r11._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            kotlinx.coroutines.internal.o$a r12 = f14187e
            int r12 = r12.a(r2)
            return r12
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r8 = (int) r4
            int r9 = r11.f14193c
            int r1 = r8 + 2
            r1 = r1 & r9
            r4 = r0 & r9
            r5 = 1
            if (r1 != r4) goto L_0x002c
            return r5
        L_0x002c:
            boolean r1 = r11.f14192b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r11.f14194d
            r10 = r8 & r9
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L_0x004b
            int r1 = r11.f14191a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L_0x004a
            int r8 = r8 - r0
            r0 = r8 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L_0x0000
        L_0x004a:
            return r5
        L_0x004b:
            int r0 = r8 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f14189g
            kotlinx.coroutines.internal.o$a r4 = f14187e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.f14194d
            r1 = r8 & r9
            r0.set(r1, r12)
            r0 = r11
        L_0x0066:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0079
            kotlinx.coroutines.internal.o r0 = r0.i()
            kotlinx.coroutines.internal.o r0 = r0.e(r8, r12)
            if (r0 != 0) goto L_0x0066
        L_0x0079:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j4;
        do {
            j4 = this._state;
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!f14189g.compareAndSet(this, j4, j4 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j4 = this._state;
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final boolean g() {
        long j4 = this._state;
        if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    public final o i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j4 = this._state;
            if ((1152921504606846976L & j4) != 0) {
                return f14190h;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = this.f14193c;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) == (i4 & i5)) {
                return null;
            }
            Object obj = this.f14194d.get(i5 & i4);
            if (obj == null) {
                if (this.f14192b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i6 = (i4 + 1) & 1073741823;
                if (f14189g.compareAndSet(this, j4, f14187e.b(j4, i6))) {
                    this.f14194d.set(this.f14193c & i4, (Object) null);
                    return obj;
                } else if (this.f14192b) {
                    o oVar = this;
                    do {
                        oVar = oVar.k(i4, i6);
                    } while (oVar != null);
                    return obj;
                }
            }
        }
    }
}
