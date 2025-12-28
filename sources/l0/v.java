package l0;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.e;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import t.C0897a;
import z2.d;

public final class v {

    /* renamed from: u  reason: collision with root package name */
    public static final a f14467u = new a((i) null);

    /* renamed from: v  reason: collision with root package name */
    private static final String f14468v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0897a f14469w = new u();

    /* renamed from: a  reason: collision with root package name */
    public final String f14470a;

    /* renamed from: b  reason: collision with root package name */
    public WorkInfo.State f14471b;

    /* renamed from: c  reason: collision with root package name */
    public String f14472c;

    /* renamed from: d  reason: collision with root package name */
    public String f14473d;

    /* renamed from: e  reason: collision with root package name */
    public e f14474e;

    /* renamed from: f  reason: collision with root package name */
    public e f14475f;

    /* renamed from: g  reason: collision with root package name */
    public long f14476g;

    /* renamed from: h  reason: collision with root package name */
    public long f14477h;

    /* renamed from: i  reason: collision with root package name */
    public long f14478i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.b f14479j;

    /* renamed from: k  reason: collision with root package name */
    public int f14480k;

    /* renamed from: l  reason: collision with root package name */
    public BackoffPolicy f14481l;

    /* renamed from: m  reason: collision with root package name */
    public long f14482m;

    /* renamed from: n  reason: collision with root package name */
    public long f14483n;

    /* renamed from: o  reason: collision with root package name */
    public long f14484o;

    /* renamed from: p  reason: collision with root package name */
    public long f14485p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14486q;

    /* renamed from: r  reason: collision with root package name */
    public OutOfQuotaPolicy f14487r;

    /* renamed from: s  reason: collision with root package name */
    private int f14488s;

    /* renamed from: t  reason: collision with root package name */
    private final int f14489t;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f14490a;

        /* renamed from: b  reason: collision with root package name */
        public WorkInfo.State f14491b;

        public b(String str, WorkInfo.State state) {
            o.e(str, "id");
            o.e(state, "state");
            this.f14490a = str;
            this.f14491b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.a(this.f14490a, bVar.f14490a) && this.f14491b == bVar.f14491b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f14490a.hashCode() * 31) + this.f14491b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f14490a + ", state=" + this.f14491b + ')';
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f14492a;

        /* renamed from: b  reason: collision with root package name */
        private WorkInfo.State f14493b;

        /* renamed from: c  reason: collision with root package name */
        private e f14494c;

        /* renamed from: d  reason: collision with root package name */
        private int f14495d;

        /* renamed from: e  reason: collision with root package name */
        private final int f14496e;

        /* renamed from: f  reason: collision with root package name */
        private List f14497f;

        /* renamed from: g  reason: collision with root package name */
        private List f14498g;

        public c(String str, WorkInfo.State state, e eVar, int i4, int i5, List list, List list2) {
            o.e(str, "id");
            o.e(state, "state");
            o.e(eVar, "output");
            o.e(list, "tags");
            o.e(list2, "progress");
            this.f14492a = str;
            this.f14493b = state;
            this.f14494c = eVar;
            this.f14495d = i4;
            this.f14496e = i5;
            this.f14497f = list;
            this.f14498g = list2;
        }

        public final WorkInfo a() {
            e eVar;
            if (!this.f14498g.isEmpty()) {
                eVar = (e) this.f14498g.get(0);
            } else {
                eVar = e.f7150c;
            }
            return new WorkInfo(UUID.fromString(this.f14492a), this.f14493b, this.f14494c, this.f14497f, eVar, this.f14495d, this.f14496e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.a(this.f14492a, cVar.f14492a) && this.f14493b == cVar.f14493b && o.a(this.f14494c, cVar.f14494c) && this.f14495d == cVar.f14495d && this.f14496e == cVar.f14496e && o.a(this.f14497f, cVar.f14497f) && o.a(this.f14498g, cVar.f14498g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.f14492a.hashCode() * 31) + this.f14493b.hashCode()) * 31) + this.f14494c.hashCode()) * 31) + this.f14495d) * 31) + this.f14496e) * 31) + this.f14497f.hashCode()) * 31) + this.f14498g.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f14492a + ", state=" + this.f14493b + ", output=" + this.f14494c + ", runAttemptCount=" + this.f14495d + ", generation=" + this.f14496e + ", tags=" + this.f14497f + ", progress=" + this.f14498g + ')';
        }
    }

    static {
        String i4 = m.i("WorkSpec");
        o.d(i4, "tagWithPrefix(\"WorkSpec\")");
        f14468v = i4;
    }

    public v(String str, WorkInfo.State state, String str2, String str3, e eVar, e eVar2, long j4, long j5, long j6, androidx.work.b bVar, int i4, BackoffPolicy backoffPolicy, long j7, long j8, long j9, long j10, boolean z3, OutOfQuotaPolicy outOfQuotaPolicy, int i5, int i6) {
        e eVar3 = eVar2;
        androidx.work.b bVar2 = bVar;
        BackoffPolicy backoffPolicy2 = backoffPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = outOfQuotaPolicy;
        o.e(str, "id");
        o.e(state, "state");
        o.e(str2, "workerClassName");
        o.e(eVar, "input");
        o.e(eVar3, "output");
        o.e(bVar2, "constraints");
        o.e(backoffPolicy2, "backoffPolicy");
        o.e(outOfQuotaPolicy2, "outOfQuotaPolicy");
        this.f14470a = str;
        this.f14471b = state;
        this.f14472c = str2;
        this.f14473d = str3;
        this.f14474e = eVar;
        this.f14475f = eVar3;
        this.f14476g = j4;
        this.f14477h = j5;
        this.f14478i = j6;
        this.f14479j = bVar2;
        this.f14480k = i4;
        this.f14481l = backoffPolicy2;
        this.f14482m = j7;
        this.f14483n = j8;
        this.f14484o = j9;
        this.f14485p = j10;
        this.f14486q = z3;
        this.f14487r = outOfQuotaPolicy2;
        this.f14488s = i5;
        this.f14489t = i6;
    }

    /* access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        Iterable<c> iterable = list;
        ArrayList arrayList = new ArrayList(C0718m.t(iterable, 10));
        for (c a4 : iterable) {
            arrayList.add(a4.a());
        }
        return arrayList;
    }

    public static /* synthetic */ v e(v vVar, String str, WorkInfo.State state, String str2, String str3, e eVar, e eVar2, long j4, long j5, long j6, androidx.work.b bVar, int i4, BackoffPolicy backoffPolicy, long j7, long j8, long j9, long j10, boolean z3, OutOfQuotaPolicy outOfQuotaPolicy, int i5, int i6, int i7, Object obj) {
        v vVar2 = vVar;
        int i8 = i7;
        return vVar.d((i8 & 1) != 0 ? vVar2.f14470a : str, (i8 & 2) != 0 ? vVar2.f14471b : state, (i8 & 4) != 0 ? vVar2.f14472c : str2, (i8 & 8) != 0 ? vVar2.f14473d : str3, (i8 & 16) != 0 ? vVar2.f14474e : eVar, (i8 & 32) != 0 ? vVar2.f14475f : eVar2, (i8 & 64) != 0 ? vVar2.f14476g : j4, (i8 & Uuid.SIZE_BITS) != 0 ? vVar2.f14477h : j5, (i8 & 256) != 0 ? vVar2.f14478i : j6, (i8 & 512) != 0 ? vVar2.f14479j : bVar, (i8 & 1024) != 0 ? vVar2.f14480k : i4, (i8 & 2048) != 0 ? vVar2.f14481l : backoffPolicy, (i8 & 4096) != 0 ? vVar2.f14482m : j7, (i8 & 8192) != 0 ? vVar2.f14483n : j8, (i8 & 16384) != 0 ? vVar2.f14484o : j9, (i8 & 32768) != 0 ? vVar2.f14485p : j10, (i8 & 65536) != 0 ? vVar2.f14486q : z3, (131072 & i8) != 0 ? vVar2.f14487r : outOfQuotaPolicy, (i8 & 262144) != 0 ? vVar2.f14488s : i5, (i8 & 524288) != 0 ? vVar2.f14489t : i6);
    }

    public final long c() {
        long j4;
        if (i()) {
            if (this.f14481l == BackoffPolicy.LINEAR) {
                j4 = this.f14482m * ((long) this.f14480k);
            } else {
                j4 = (long) Math.scalb((float) this.f14482m, this.f14480k - 1);
            }
            return this.f14483n + d.e(j4, 18000000);
        }
        long j5 = 0;
        if (j()) {
            int i4 = this.f14488s;
            long j6 = this.f14483n;
            if (i4 == 0) {
                j6 += this.f14476g;
            }
            long j7 = this.f14478i;
            long j8 = this.f14477h;
            if (j7 != j8) {
                if (i4 == 0) {
                    j5 = ((long) -1) * j7;
                }
                j6 += j8;
            } else if (i4 != 0) {
                j5 = j8;
            }
            return j6 + j5;
        }
        long j9 = this.f14483n;
        if (j9 == 0) {
            j9 = System.currentTimeMillis();
        }
        return j9 + this.f14476g;
    }

    public final v d(String str, WorkInfo.State state, String str2, String str3, e eVar, e eVar2, long j4, long j5, long j6, androidx.work.b bVar, int i4, BackoffPolicy backoffPolicy, long j7, long j8, long j9, long j10, boolean z3, OutOfQuotaPolicy outOfQuotaPolicy, int i5, int i6) {
        String str4 = str;
        o.e(str4, "id");
        o.e(state, "state");
        o.e(str2, "workerClassName");
        o.e(eVar, "input");
        o.e(eVar2, "output");
        o.e(bVar, "constraints");
        o.e(backoffPolicy, "backoffPolicy");
        o.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new v(str4, state, str2, str3, eVar, eVar2, j4, j5, j6, bVar, i4, backoffPolicy, j7, j8, j9, j10, z3, outOfQuotaPolicy, i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (o.a(this.f14470a, vVar.f14470a) && this.f14471b == vVar.f14471b && o.a(this.f14472c, vVar.f14472c) && o.a(this.f14473d, vVar.f14473d) && o.a(this.f14474e, vVar.f14474e) && o.a(this.f14475f, vVar.f14475f) && this.f14476g == vVar.f14476g && this.f14477h == vVar.f14477h && this.f14478i == vVar.f14478i && o.a(this.f14479j, vVar.f14479j) && this.f14480k == vVar.f14480k && this.f14481l == vVar.f14481l && this.f14482m == vVar.f14482m && this.f14483n == vVar.f14483n && this.f14484o == vVar.f14484o && this.f14485p == vVar.f14485p && this.f14486q == vVar.f14486q && this.f14487r == vVar.f14487r && this.f14488s == vVar.f14488s && this.f14489t == vVar.f14489t) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f14489t;
    }

    public final int g() {
        return this.f14488s;
    }

    public final boolean h() {
        return !o.a(androidx.work.b.f7129j, this.f14479j);
    }

    public int hashCode() {
        int i4;
        int hashCode = ((((this.f14470a.hashCode() * 31) + this.f14471b.hashCode()) * 31) + this.f14472c.hashCode()) * 31;
        String str = this.f14473d;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int hashCode2 = (((((((((((((((((((((((((hashCode + i4) * 31) + this.f14474e.hashCode()) * 31) + this.f14475f.hashCode()) * 31) + t.a(this.f14476g)) * 31) + t.a(this.f14477h)) * 31) + t.a(this.f14478i)) * 31) + this.f14479j.hashCode()) * 31) + this.f14480k) * 31) + this.f14481l.hashCode()) * 31) + t.a(this.f14482m)) * 31) + t.a(this.f14483n)) * 31) + t.a(this.f14484o)) * 31) + t.a(this.f14485p)) * 31;
        boolean z3 = this.f14486q;
        if (z3) {
            z3 = true;
        }
        return ((((((hashCode2 + (z3 ? 1 : 0)) * 31) + this.f14487r.hashCode()) * 31) + this.f14488s) * 31) + this.f14489t;
    }

    public final boolean i() {
        if (this.f14471b != WorkInfo.State.ENQUEUED || this.f14480k <= 0) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.f14477h != 0) {
            return true;
        }
        return false;
    }

    public final void k(long j4) {
        if (j4 > 18000000) {
            m.e().k(f14468v, "Backoff delay duration exceeds maximum value");
        }
        if (j4 < 10000) {
            m.e().k(f14468v, "Backoff delay duration less than minimum value");
        }
        this.f14482m = d.g(j4, 10000, 18000000);
    }

    public final void l(long j4, long j5) {
        if (j4 < 900000) {
            m.e().k(f14468v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f14477h = d.c(j4, 900000);
        if (j5 < 300000) {
            m.e().k(f14468v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j5 > this.f14477h) {
            m e4 = m.e();
            String str = f14468v;
            e4.k(str, "Flex duration greater than interval duration; Changed to " + j4);
        }
        this.f14478i = d.g(j5, 300000, this.f14477h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f14470a + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ v(java.lang.String r31, androidx.work.WorkInfo.State r32, java.lang.String r33, java.lang.String r34, androidx.work.e r35, androidx.work.e r36, long r37, long r39, long r41, androidx.work.b r43, int r44, androidx.work.BackoffPolicy r45, long r46, long r48, long r50, long r52, boolean r54, androidx.work.OutOfQuotaPolicy r55, int r56, int r57, int r58, kotlin.jvm.internal.i r59) {
        /*
            r30 = this;
            r0 = r58
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x0022
            androidx.work.e r1 = androidx.work.e.f7150c
            kotlin.jvm.internal.o.d(r1, r2)
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r35
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002f
            androidx.work.e r1 = androidx.work.e.f7150c
            kotlin.jvm.internal.o.d(r1, r2)
            r8 = r1
            goto L_0x0031
        L_0x002f:
            r8 = r36
        L_0x0031:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r9 = r2
            goto L_0x003b
        L_0x0039:
            r9 = r37
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r39
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r41
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0053
            androidx.work.b r1 = androidx.work.b.f7129j
            r15 = r1
            goto L_0x0055
        L_0x0053:
            r15 = r43
        L_0x0055:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005d
            r16 = r5
            goto L_0x005f
        L_0x005d:
            r16 = r44
        L_0x005f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0068
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.EXPONENTIAL
            r17 = r1
            goto L_0x006a
        L_0x0068:
            r17 = r45
        L_0x006a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0071
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0073
        L_0x0071:
            r18 = r46
        L_0x0073:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007a
            r20 = r2
            goto L_0x007c
        L_0x007a:
            r20 = r48
        L_0x007c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0083
            r22 = r2
            goto L_0x0085
        L_0x0083:
            r22 = r50
        L_0x0085:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            r1 = -1
            r24 = r1
            goto L_0x0092
        L_0x0090:
            r24 = r52
        L_0x0092:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            r26 = r5
            goto L_0x009c
        L_0x009a:
            r26 = r54
        L_0x009c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            androidx.work.OutOfQuotaPolicy r1 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r27 = r1
            goto L_0x00a8
        L_0x00a6:
            r27 = r55
        L_0x00a8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b0
            r28 = r5
            goto L_0x00b2
        L_0x00b0:
            r28 = r56
        L_0x00b2:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00ba
            r29 = r5
            goto L_0x00bc
        L_0x00ba:
            r29 = r57
        L_0x00bc:
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.e, androidx.work.e, long, long, long, androidx.work.b, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, int, kotlin.jvm.internal.i):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(String str, String str2) {
        this(str, (WorkInfo.State) null, str2, (String) null, (e) null, (e) null, 0, 0, 0, (androidx.work.b) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 1048570, (i) null);
        o.e(str, "id");
        o.e(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(java.lang.String r34, l0.v r35) {
        /*
            r33 = this;
            r0 = r35
            r1 = r33
            r2 = r34
            java.lang.String r3 = "newId"
            r4 = r34
            kotlin.jvm.internal.o.e(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.o.e(r0, r3)
            java.lang.String r4 = r0.f14472c
            androidx.work.WorkInfo$State r3 = r0.f14471b
            java.lang.String r5 = r0.f14473d
            androidx.work.e r7 = new androidx.work.e
            r6 = r7
            androidx.work.e r8 = r0.f14474e
            r7.<init>((androidx.work.e) r8)
            androidx.work.e r8 = new androidx.work.e
            r7 = r8
            androidx.work.e r9 = r0.f14475f
            r8.<init>((androidx.work.e) r9)
            long r8 = r0.f14476g
            long r10 = r0.f14477h
            long r12 = r0.f14478i
            androidx.work.b r15 = new androidx.work.b
            r14 = r15
            r31 = r1
            androidx.work.b r1 = r0.f14479j
            r15.<init>(r1)
            int r15 = r0.f14480k
            androidx.work.BackoffPolicy r1 = r0.f14481l
            r16 = r1
            r32 = r2
            long r1 = r0.f14482m
            r17 = r1
            long r1 = r0.f14483n
            r19 = r1
            long r1 = r0.f14484o
            r21 = r1
            long r1 = r0.f14485p
            r23 = r1
            boolean r1 = r0.f14486q
            r25 = r1
            androidx.work.OutOfQuotaPolicy r1 = r0.f14487r
            r26 = r1
            int r0 = r0.f14488s
            r27 = r0
            r29 = 524288(0x80000, float:7.34684E-40)
            r30 = 0
            r28 = 0
            r1 = r31
            r2 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v.<init>(java.lang.String, l0.v):void");
    }
}
