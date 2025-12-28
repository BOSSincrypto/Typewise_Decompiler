package kotlinx.coroutines.flow;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.C0750n;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.internal.y;
import l2.q;

public class SharedFlowImpl extends kotlinx.coroutines.flow.internal.a implements j, c, h {

    /* renamed from: d  reason: collision with root package name */
    private final int f14088d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f14089e;

    /* renamed from: f  reason: collision with root package name */
    private final BufferOverflow f14090f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f14091g;

    /* renamed from: h  reason: collision with root package name */
    private long f14092h;

    /* renamed from: i  reason: collision with root package name */
    private long f14093i;

    /* renamed from: j  reason: collision with root package name */
    private int f14094j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f14095k;

    private static final class a implements Q {

        /* renamed from: a  reason: collision with root package name */
        public final SharedFlowImpl f14096a;

        /* renamed from: b  reason: collision with root package name */
        public long f14097b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f14098c;

        /* renamed from: d  reason: collision with root package name */
        public final c f14099d;

        public a(SharedFlowImpl sharedFlowImpl, long j4, Object obj, c cVar) {
            this.f14096a = sharedFlowImpl;
            this.f14097b = j4;
            this.f14098c = obj;
            this.f14099d = cVar;
        }

        public void d() {
            this.f14096a.w(this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14100a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f14100a = iArr;
        }
    }

    public SharedFlowImpl(int i4, int i5, BufferOverflow bufferOverflow) {
        this.f14088d = i4;
        this.f14089e = i5;
        this.f14090f = bufferOverflow;
    }

    private final void C() {
        Object[] objArr = this.f14091g;
        o.b(objArr);
        o.g(objArr, I(), (Object) null);
        this.f14094j--;
        long I3 = I() + 1;
        if (this.f14092h < I3) {
            this.f14092h = I3;
        }
        if (this.f14093i < I3) {
            z(I3);
        }
    }

    static /* synthetic */ Object D(SharedFlowImpl sharedFlowImpl, Object obj, c cVar) {
        if (sharedFlowImpl.d(obj)) {
            return q.f14567a;
        }
        Object E3 = sharedFlowImpl.E(obj, cVar);
        if (E3 == kotlin.coroutines.intrinsics.a.f()) {
            return E3;
        }
        return q.f14567a;
    }

    private final Object E(Object obj, c cVar) {
        c[] cVarArr;
        a aVar;
        C0748l lVar = new C0748l(kotlin.coroutines.intrinsics.a.d(cVar), 1);
        lVar.z();
        c[] cVarArr2 = kotlinx.coroutines.flow.internal.b.f14118a;
        synchronized (this) {
            try {
                if (O(obj)) {
                    Result.a aVar2 = Result.Companion;
                    lVar.resumeWith(Result.m1constructorimpl(q.f14567a));
                    cVarArr = G(cVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, ((long) M()) + I(), obj, lVar);
                    F(aVar3);
                    this.f14095k = this.f14095k + 1;
                    if (this.f14089e == 0) {
                        cVarArr2 = G(cVarArr2);
                    }
                    cVarArr = cVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            C0750n.a(lVar, aVar);
        }
        for (c cVar2 : cVarArr) {
            if (cVar2 != null) {
                Result.a aVar4 = Result.Companion;
                cVar2.resumeWith(Result.m1constructorimpl(q.f14567a));
            }
        }
        Object v3 = lVar.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            f.c(cVar);
        }
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            return v3;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void F(Object obj) {
        int M3 = M();
        Object[] objArr = this.f14091g;
        if (objArr == null) {
            objArr = N((Object[]) null, 0, 2);
        } else if (M3 >= objArr.length) {
            objArr = N(objArr, M3, objArr.length * 2);
        }
        o.g(objArr, I() + ((long) M3), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (kotlinx.coroutines.flow.p) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.c[] G(kotlin.coroutines.c[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f14116b
            if (r1 == 0) goto L_0x0047
            kotlinx.coroutines.flow.internal.c[] r1 = r10.f14115a
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            kotlinx.coroutines.flow.p r4 = (kotlinx.coroutines.flow.p) r4
            kotlin.coroutines.c r5 = r4.f14135b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.Q(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.o.d(r11, r6)
        L_0x0039:
            r6 = r11
            kotlin.coroutines.c[] r6 = (kotlin.coroutines.c[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f14135b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            kotlin.coroutines.c[] r11 = (kotlin.coroutines.c[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.G(kotlin.coroutines.c[]):kotlin.coroutines.c[]");
    }

    private final long H() {
        return I() + ((long) this.f14094j);
    }

    /* access modifiers changed from: private */
    public final long I() {
        return Math.min(this.f14093i, this.f14092h);
    }

    private final Object J(long j4) {
        Object[] objArr = this.f14091g;
        o.b(objArr);
        Object c4 = o.f(objArr, j4);
        if (c4 instanceof a) {
            return ((a) c4).f14098c;
        }
        return c4;
    }

    private final long K() {
        return I() + ((long) this.f14094j) + ((long) this.f14095k);
    }

    private final int L() {
        return (int) ((I() + ((long) this.f14094j)) - this.f14092h);
    }

    /* access modifiers changed from: private */
    public final int M() {
        return this.f14094j + this.f14095k;
    }

    private final Object[] N(Object[] objArr, int i4, int i5) {
        if (i5 > 0) {
            Object[] objArr2 = new Object[i5];
            this.f14091g = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long I3 = I();
            for (int i6 = 0; i6 < i4; i6++) {
                long j4 = ((long) i6) + I3;
                o.g(objArr2, j4, o.f(objArr, j4));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* access modifiers changed from: private */
    public final boolean O(Object obj) {
        if (j() == 0) {
            return P(obj);
        }
        if (this.f14094j >= this.f14089e && this.f14093i <= this.f14092h) {
            int i4 = b.f14100a[this.f14090f.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 == 2) {
                return true;
            }
        }
        F(obj);
        int i5 = this.f14094j + 1;
        this.f14094j = i5;
        if (i5 > this.f14089e) {
            C();
        }
        if (L() > this.f14088d) {
            S(this.f14092h + 1, this.f14093i, H(), K());
        }
        return true;
    }

    private final boolean P(Object obj) {
        if (this.f14088d == 0) {
            return true;
        }
        F(obj);
        int i4 = this.f14094j + 1;
        this.f14094j = i4;
        if (i4 > this.f14088d) {
            C();
        }
        this.f14093i = I() + ((long) this.f14094j);
        return true;
    }

    /* access modifiers changed from: private */
    public final long Q(p pVar) {
        long j4 = pVar.f14134a;
        if (j4 < H()) {
            return j4;
        }
        if (this.f14089e <= 0 && j4 <= I() && this.f14095k != 0) {
            return j4;
        }
        return -1;
    }

    private final Object R(p pVar) {
        Object obj;
        c[] cVarArr = kotlinx.coroutines.flow.internal.b.f14118a;
        synchronized (this) {
            try {
                long Q3 = Q(pVar);
                if (Q3 < 0) {
                    obj = o.f14133a;
                } else {
                    long j4 = pVar.f14134a;
                    Object J3 = J(Q3);
                    pVar.f14134a = Q3 + 1;
                    Object obj2 = J3;
                    cVarArr = T(j4);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m1constructorimpl(q.f14567a));
            }
        }
        return obj;
    }

    private final void S(long j4, long j5, long j6, long j7) {
        long min = Math.min(j5, j4);
        for (long I3 = I(); I3 < min; I3++) {
            Object[] objArr = this.f14091g;
            o.b(objArr);
            o.g(objArr, I3, (Object) null);
        }
        this.f14092h = j4;
        this.f14093i = j5;
        this.f14094j = (int) (j6 - min);
        this.f14095k = (int) (j7 - j6);
    }

    private final Object v(p pVar, c cVar) {
        C0748l lVar = new C0748l(kotlin.coroutines.intrinsics.a.d(cVar), 1);
        lVar.z();
        synchronized (this) {
            try {
                if (Q(pVar) < 0) {
                    pVar.f14135b = lVar;
                } else {
                    Result.a aVar = Result.Companion;
                    lVar.resumeWith(Result.m1constructorimpl(q.f14567a));
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object v3 = lVar.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            f.c(cVar);
        }
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            return v3;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void w(a aVar) {
        synchronized (this) {
            if (aVar.f14097b >= I()) {
                Object[] objArr = this.f14091g;
                o.b(objArr);
                if (o.f(objArr, aVar.f14097b) == aVar) {
                    o.g(objArr, aVar.f14097b, o.f14133a);
                    x();
                    q qVar = q.f14567a;
                }
            }
        }
    }

    private final void x() {
        if (this.f14089e != 0 || this.f14095k > 1) {
            Object[] objArr = this.f14091g;
            o.b(objArr);
            while (this.f14095k > 0 && o.f(objArr, (I() + ((long) M())) - 1) == o.f14133a) {
                this.f14095k--;
                o.g(objArr, I() + ((long) M()), (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: kotlinx.coroutines.flow.p} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab A[EDGE_INSN: B:48:0x00ab->B:38:0x00ab ?: BREAK  , SYNTHETIC] */
    static /* synthetic */ java.lang.Object y(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.d r9, kotlin.coroutines.c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L_0x0077
            r8 = 1
            if (r2 == r8) goto L_0x0061
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.g0 r8 = (kotlinx.coroutines.g0) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.p) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.d r2 = (kotlinx.coroutines.flow.d) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
            kotlin.f.b(r10)     // Catch:{ all -> 0x0042 }
        L_0x003e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x008f
        L_0x0042:
            r8 = move-exception
            goto L_0x00c4
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.g0 r8 = (kotlinx.coroutines.g0) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.p) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.d r2 = (kotlinx.coroutines.flow.d) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
            kotlin.f.b(r10)     // Catch:{ all -> 0x0042 }
            goto L_0x0092
        L_0x0061:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.p) r9
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.d r8 = (kotlinx.coroutines.flow.d) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r2 = (kotlinx.coroutines.flow.SharedFlowImpl) r2
            kotlin.f.b(r10)     // Catch:{ all -> 0x0074 }
            r10 = r8
            r8 = r2
            goto L_0x0083
        L_0x0074:
            r8 = move-exception
            r5 = r2
            goto L_0x00c4
        L_0x0077:
            kotlin.f.b(r10)
            kotlinx.coroutines.flow.internal.c r10 = r8.f()
            kotlinx.coroutines.flow.p r10 = (kotlinx.coroutines.flow.p) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0083:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch:{ all -> 0x00c1 }
            kotlinx.coroutines.g0$b r5 = kotlinx.coroutines.g0.f14139t     // Catch:{ all -> 0x00c1 }
            kotlin.coroutines.CoroutineContext$a r2 = r2.get(r5)     // Catch:{ all -> 0x00c1 }
            kotlinx.coroutines.g0 r2 = (kotlinx.coroutines.g0) r2     // Catch:{ all -> 0x00c1 }
        L_0x008f:
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0092:
            java.lang.Object r10 = r5.R(r9)     // Catch:{ all -> 0x0042 }
            kotlinx.coroutines.internal.y r6 = kotlinx.coroutines.flow.o.f14133a     // Catch:{ all -> 0x0042 }
            if (r10 != r6) goto L_0x00ab
            r0.L$0 = r5     // Catch:{ all -> 0x0042 }
            r0.L$1 = r2     // Catch:{ all -> 0x0042 }
            r0.L$2 = r9     // Catch:{ all -> 0x0042 }
            r0.L$3 = r8     // Catch:{ all -> 0x0042 }
            r0.label = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r10 = r5.v(r9, r0)     // Catch:{ all -> 0x0042 }
            if (r10 != r1) goto L_0x0092
            return r1
        L_0x00ab:
            if (r8 == 0) goto L_0x00b0
            kotlinx.coroutines.j0.f(r8)     // Catch:{ all -> 0x0042 }
        L_0x00b0:
            r0.L$0 = r5     // Catch:{ all -> 0x0042 }
            r0.L$1 = r2     // Catch:{ all -> 0x0042 }
            r0.L$2 = r9     // Catch:{ all -> 0x0042 }
            r0.L$3 = r8     // Catch:{ all -> 0x0042 }
            r0.label = r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x0042 }
            if (r10 != r1) goto L_0x003e
            return r1
        L_0x00c1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        L_0x00c4:
            r5.i(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.y(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }

    private final void z(long j4) {
        kotlinx.coroutines.flow.internal.c[] e4;
        if (!(this.f14116b == 0 || (e4 = this.f14115a) == null)) {
            for (kotlinx.coroutines.flow.internal.c cVar : e4) {
                if (cVar != null) {
                    p pVar = (p) cVar;
                    long j5 = pVar.f14134a;
                    if (j5 >= 0 && j5 < j4) {
                        pVar.f14134a = j4;
                    }
                }
            }
        }
        this.f14093i = j4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public p g() {
        return new p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public p[] h(int i4) {
        return new p[i4];
    }

    public final c[] T(long j4) {
        int i4;
        long j5;
        long j6;
        long j7;
        boolean z3;
        long j8;
        kotlinx.coroutines.flow.internal.c[] e4;
        if (j4 > this.f14093i) {
            return kotlinx.coroutines.flow.internal.b.f14118a;
        }
        long I3 = I();
        long j9 = ((long) this.f14094j) + I3;
        if (this.f14089e == 0 && this.f14095k > 0) {
            j9++;
        }
        if (!(this.f14116b == 0 || (e4 = this.f14115a) == null)) {
            for (kotlinx.coroutines.flow.internal.c cVar : e4) {
                if (cVar != null) {
                    long j10 = ((p) cVar).f14134a;
                    if (j10 >= 0 && j10 < j9) {
                        j9 = j10;
                    }
                }
            }
        }
        if (j9 <= this.f14093i) {
            return kotlinx.coroutines.flow.internal.b.f14118a;
        }
        long H3 = H();
        if (j() > 0) {
            i4 = Math.min(this.f14095k, this.f14089e - ((int) (H3 - j9)));
        } else {
            i4 = this.f14095k;
        }
        c[] cVarArr = kotlinx.coroutines.flow.internal.b.f14118a;
        long j11 = ((long) this.f14095k) + H3;
        if (i4 > 0) {
            cVarArr = new c[i4];
            Object[] objArr = this.f14091g;
            o.b(objArr);
            long j12 = H3;
            int i5 = 0;
            while (true) {
                if (H3 >= j11) {
                    j6 = j9;
                    j5 = j11;
                    break;
                }
                Object c4 = o.f(objArr, H3);
                j6 = j9;
                y yVar = o.f14133a;
                if (c4 == yVar) {
                    j5 = j11;
                    j8 = 1;
                } else if (c4 != null) {
                    a aVar = (a) c4;
                    int i6 = i5 + 1;
                    j5 = j11;
                    cVarArr[i5] = aVar.f14099d;
                    o.g(objArr, H3, yVar);
                    o.g(objArr, j12, aVar.f14098c);
                    j8 = 1;
                    j12++;
                    if (i6 >= i4) {
                        break;
                    }
                    i5 = i6;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                H3 += j8;
                j9 = j6;
                j11 = j5;
            }
            H3 = j12;
        } else {
            j6 = j9;
            j5 = j11;
        }
        int i7 = (int) (H3 - I3);
        if (j() == 0) {
            j7 = H3;
        } else {
            j7 = j6;
        }
        long max = Math.max(this.f14092h, H3 - ((long) Math.min(this.f14088d, i7)));
        if (this.f14089e == 0 && max < j5) {
            Object[] objArr2 = this.f14091g;
            o.b(objArr2);
            if (o.a(o.f(objArr2, max), o.f14133a)) {
                H3++;
                max++;
            }
        }
        S(max, j7, H3, j5);
        x();
        if (cVarArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return G(cVarArr);
        }
        return cVarArr;
    }

    public final long U() {
        long j4 = this.f14092h;
        if (j4 < this.f14093i) {
            this.f14093i = j4;
        }
        return j4;
    }

    public Object a(d dVar, c cVar) {
        return y(this, dVar, cVar);
    }

    public c b(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        return o.e(this, coroutineContext, i4, bufferOverflow);
    }

    public boolean d(Object obj) {
        int i4;
        boolean z3;
        c[] cVarArr = kotlinx.coroutines.flow.internal.b.f14118a;
        synchronized (this) {
            if (O(obj)) {
                cVarArr = G(cVarArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m1constructorimpl(q.f14567a));
            }
        }
        return z3;
    }

    public Object emit(Object obj, c cVar) {
        return D(this, obj, cVar);
    }
}
