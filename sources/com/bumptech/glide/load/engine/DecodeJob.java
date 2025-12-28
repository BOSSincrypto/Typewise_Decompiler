package com.bumptech.glide.load.engine;

import a1.C0355a;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.e;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.resource.bitmap.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q1.C0864a;
import q1.C0865b;
import q1.C0866c;

class DecodeJob implements e.a, Runnable, Comparable, C0864a.f {

    /* renamed from: A  reason: collision with root package name */
    private Thread f10849A;

    /* renamed from: B  reason: collision with root package name */
    private X0.b f10850B;

    /* renamed from: C  reason: collision with root package name */
    private X0.b f10851C;

    /* renamed from: D  reason: collision with root package name */
    private Object f10852D;

    /* renamed from: E  reason: collision with root package name */
    private DataSource f10853E;

    /* renamed from: F  reason: collision with root package name */
    private com.bumptech.glide.load.data.d f10854F;

    /* renamed from: G  reason: collision with root package name */
    private volatile e f10855G;

    /* renamed from: H  reason: collision with root package name */
    private volatile boolean f10856H;

    /* renamed from: I  reason: collision with root package name */
    private volatile boolean f10857I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f10858J;

    /* renamed from: a  reason: collision with root package name */
    private final f f10859a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final List f10860b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C0866c f10861c = C0866c.a();

    /* renamed from: d  reason: collision with root package name */
    private final e f10862d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.core.util.d f10863e;

    /* renamed from: f  reason: collision with root package name */
    private final d f10864f = new d();

    /* renamed from: g  reason: collision with root package name */
    private final f f10865g = new f();

    /* renamed from: h  reason: collision with root package name */
    private com.bumptech.glide.d f10866h;

    /* renamed from: i  reason: collision with root package name */
    private X0.b f10867i;

    /* renamed from: j  reason: collision with root package name */
    private Priority f10868j;

    /* renamed from: k  reason: collision with root package name */
    private l f10869k;

    /* renamed from: l  reason: collision with root package name */
    private int f10870l;

    /* renamed from: m  reason: collision with root package name */
    private int f10871m;

    /* renamed from: n  reason: collision with root package name */
    private h f10872n;

    /* renamed from: o  reason: collision with root package name */
    private X0.d f10873o;

    /* renamed from: p  reason: collision with root package name */
    private b f10874p;

    /* renamed from: q  reason: collision with root package name */
    private int f10875q;

    /* renamed from: v  reason: collision with root package name */
    private Stage f10876v;

    /* renamed from: w  reason: collision with root package name */
    private RunReason f10877w;

    /* renamed from: x  reason: collision with root package name */
    private long f10878x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10879y;

    /* renamed from: z  reason: collision with root package name */
    private Object f10880z;

    private enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10883a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10884b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f10885c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10885c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10885c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10884b = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f10884b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f10884b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f10884b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f10884b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10883a = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f10883a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f10883a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.a.<clinit>():void");
        }
    }

    interface b {
        void a(GlideException glideException);

        void c(s sVar, DataSource dataSource, boolean z3);

        void d(DecodeJob decodeJob);
    }

    private final class c implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final DataSource f10886a;

        c(DataSource dataSource) {
            this.f10886a = dataSource;
        }

        public s a(s sVar) {
            return DecodeJob.this.v(this.f10886a, sVar);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private X0.b f10888a;

        /* renamed from: b  reason: collision with root package name */
        private X0.f f10889b;

        /* renamed from: c  reason: collision with root package name */
        private r f10890c;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f10888a = null;
            this.f10889b = null;
            this.f10890c = null;
        }

        /* access modifiers changed from: package-private */
        public void b(e eVar, X0.d dVar) {
            C0865b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f10888a, new d(this.f10889b, this.f10890c, dVar));
            } finally {
                this.f10890c.h();
                C0865b.e();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f10890c != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d(X0.b bVar, X0.f fVar, r rVar) {
            this.f10888a = bVar;
            this.f10889b = fVar;
            this.f10890c = rVar;
        }
    }

    interface e {
        C0355a a();
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10891a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10892b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10893c;

        f() {
        }

        private boolean a(boolean z3) {
            if ((this.f10893c || z3 || this.f10892b) && this.f10891a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            this.f10892b = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            this.f10893c = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean d(boolean z3) {
            this.f10891a = true;
            return a(z3);
        }

        /* access modifiers changed from: package-private */
        public synchronized void e() {
            this.f10892b = false;
            this.f10891a = false;
            this.f10893c = false;
        }
    }

    DecodeJob(e eVar, androidx.core.util.d dVar) {
        this.f10862d = eVar;
        this.f10863e = dVar;
    }

    private s A(Object obj, DataSource dataSource, q qVar) {
        X0.d l4 = l(dataSource);
        com.bumptech.glide.load.data.e l5 = this.f10866h.i().l(obj);
        try {
            return qVar.a(l5, l4, this.f10870l, this.f10871m, new c(dataSource));
        } finally {
            l5.b();
        }
    }

    private void B() {
        int i4 = a.f10883a[this.f10877w.ordinal()];
        if (i4 == 1) {
            this.f10876v = k(Stage.INITIALIZE);
            this.f10855G = j();
            z();
        } else if (i4 == 2) {
            z();
        } else if (i4 == 3) {
            i();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f10877w);
        }
    }

    private void C() {
        Throwable th;
        this.f10861c.c();
        if (this.f10856H) {
            if (this.f10860b.isEmpty()) {
                th = null;
            } else {
                List list = this.f10860b;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f10856H = true;
    }

    private s g(com.bumptech.glide.load.data.d dVar, Object obj, DataSource dataSource) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long b4 = p1.g.b();
            s h4 = h(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                o("Decoded result " + h4, b4);
            }
            return h4;
        } finally {
            dVar.b();
        }
    }

    private s h(Object obj, DataSource dataSource) {
        return A(obj, dataSource, this.f10859a.h(obj.getClass()));
    }

    private void i() {
        s sVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j4 = this.f10878x;
            p("Retrieved data", j4, "data: " + this.f10852D + ", cache key: " + this.f10850B + ", fetcher: " + this.f10854F);
        }
        try {
            sVar = g(this.f10854F, this.f10852D, this.f10853E);
        } catch (GlideException e4) {
            e4.setLoggingDetails(this.f10851C, this.f10853E);
            this.f10860b.add(e4);
            sVar = null;
        }
        if (sVar != null) {
            r(sVar, this.f10853E, this.f10858J);
        } else {
            z();
        }
    }

    private e j() {
        int i4 = a.f10884b[this.f10876v.ordinal()];
        if (i4 == 1) {
            return new t(this.f10859a, this);
        }
        if (i4 == 2) {
            return new b(this.f10859a, this);
        }
        if (i4 == 3) {
            return new w(this.f10859a, this);
        }
        if (i4 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f10876v);
    }

    private Stage k(Stage stage) {
        int i4 = a.f10884b[stage.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    return Stage.FINISHED;
                }
                if (i4 != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                } else if (this.f10872n.b()) {
                    return Stage.RESOURCE_CACHE;
                } else {
                    return k(Stage.RESOURCE_CACHE);
                }
            } else if (this.f10879y) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f10872n.a()) {
            return Stage.DATA_CACHE;
        } else {
            return k(Stage.DATA_CACHE);
        }
    }

    private X0.d l(DataSource dataSource) {
        boolean z3;
        X0.d dVar = this.f10873o;
        if (Build.VERSION.SDK_INT < 26) {
            return dVar;
        }
        if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.f10859a.x()) {
            z3 = true;
        } else {
            z3 = false;
        }
        X0.c cVar = s.f11132j;
        Boolean bool = (Boolean) dVar.c(cVar);
        if (bool != null && (!bool.booleanValue() || z3)) {
            return dVar;
        }
        X0.d dVar2 = new X0.d();
        dVar2.d(this.f10873o);
        dVar2.e(cVar, Boolean.valueOf(z3));
        return dVar2;
    }

    private int m() {
        return this.f10868j.ordinal();
    }

    private void o(String str, long j4) {
        p(str, j4, (String) null);
    }

    private void p(String str, long j4, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(p1.g.a(j4));
        sb.append(", load key: ");
        sb.append(this.f10869k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    private void q(s sVar, DataSource dataSource, boolean z3) {
        C();
        this.f10874p.c(sVar, dataSource, z3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.bumptech.glide.load.engine.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.bumptech.glide.load.engine.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.bumptech.glide.load.engine.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.bumptech.glide.load.engine.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.bumptech.glide.load.engine.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(com.bumptech.glide.load.engine.s r2, com.bumptech.glide.load.DataSource r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "DecodeJob.notifyEncodeAndRelease"
            q1.C0865b.a(r0)
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.o     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0012
            r0 = r2
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.o) r0     // Catch:{ all -> 0x0010 }
            r0.b()     // Catch:{ all -> 0x0010 }
            goto L_0x0012
        L_0x0010:
            r2 = move-exception
            goto L_0x004e
        L_0x0012:
            com.bumptech.glide.load.engine.DecodeJob$d r0 = r1.f10864f     // Catch:{ all -> 0x0010 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0020
            com.bumptech.glide.load.engine.r r2 = com.bumptech.glide.load.engine.r.f(r2)     // Catch:{ all -> 0x0010 }
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r1.q(r2, r3, r4)     // Catch:{ all -> 0x0010 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE     // Catch:{ all -> 0x0010 }
            r1.f10876v = r2     // Catch:{ all -> 0x0010 }
            com.bumptech.glide.load.engine.DecodeJob$d r2 = r1.f10864f     // Catch:{ all -> 0x003a }
            boolean r2 = r2.c()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x003c
            com.bumptech.glide.load.engine.DecodeJob$d r2 = r1.f10864f     // Catch:{ all -> 0x003a }
            com.bumptech.glide.load.engine.DecodeJob$e r3 = r1.f10862d     // Catch:{ all -> 0x003a }
            X0.d r4 = r1.f10873o     // Catch:{ all -> 0x003a }
            r2.b(r3, r4)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r2 = move-exception
            goto L_0x0048
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.h()     // Catch:{ all -> 0x0010 }
        L_0x0041:
            r1.t()     // Catch:{ all -> 0x0010 }
            q1.C0865b.e()
            return
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.h()     // Catch:{ all -> 0x0010 }
        L_0x004d:
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x004e:
            q1.C0865b.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.r(com.bumptech.glide.load.engine.s, com.bumptech.glide.load.DataSource, boolean):void");
    }

    private void s() {
        C();
        this.f10874p.a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f10860b)));
        u();
    }

    private void t() {
        if (this.f10865g.b()) {
            x();
        }
    }

    private void u() {
        if (this.f10865g.c()) {
            x();
        }
    }

    private void x() {
        this.f10865g.e();
        this.f10864f.a();
        this.f10859a.a();
        this.f10856H = false;
        this.f10866h = null;
        this.f10867i = null;
        this.f10873o = null;
        this.f10868j = null;
        this.f10869k = null;
        this.f10874p = null;
        this.f10876v = null;
        this.f10855G = null;
        this.f10849A = null;
        this.f10850B = null;
        this.f10852D = null;
        this.f10853E = null;
        this.f10854F = null;
        this.f10878x = 0;
        this.f10857I = false;
        this.f10880z = null;
        this.f10860b.clear();
        this.f10863e.a(this);
    }

    private void y(RunReason runReason) {
        this.f10877w = runReason;
        this.f10874p.d(this);
    }

    private void z() {
        this.f10849A = Thread.currentThread();
        this.f10878x = p1.g.b();
        boolean z3 = false;
        while (!this.f10857I && this.f10855G != null && !(z3 = this.f10855G.b())) {
            this.f10876v = k(this.f10876v);
            this.f10855G = j();
            if (this.f10876v == Stage.SOURCE) {
                y(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f10876v == Stage.FINISHED || this.f10857I) && !z3) {
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        Stage k4 = k(Stage.INITIALIZE);
        if (k4 == Stage.RESOURCE_CACHE || k4 == Stage.DATA_CACHE) {
            return true;
        }
        return false;
    }

    public void a() {
        y(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    public C0866c b() {
        return this.f10861c;
    }

    public void c(X0.b bVar, Object obj, com.bumptech.glide.load.data.d dVar, DataSource dataSource, X0.b bVar2) {
        this.f10850B = bVar;
        this.f10852D = obj;
        this.f10854F = dVar;
        this.f10853E = dataSource;
        this.f10851C = bVar2;
        boolean z3 = false;
        if (bVar != this.f10859a.c().get(0)) {
            z3 = true;
        }
        this.f10858J = z3;
        if (Thread.currentThread() != this.f10849A) {
            y(RunReason.DECODE_DATA);
            return;
        }
        C0865b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            C0865b.e();
        }
    }

    public void d(X0.b bVar, Exception exc, com.bumptech.glide.load.data.d dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(bVar, dataSource, dVar.a());
        this.f10860b.add(glideException);
        if (Thread.currentThread() != this.f10849A) {
            y(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            z();
        }
    }

    public void e() {
        this.f10857I = true;
        e eVar = this.f10855G;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* renamed from: f */
    public int compareTo(DecodeJob decodeJob) {
        int m4 = m() - decodeJob.m();
        if (m4 == 0) {
            return this.f10875q - decodeJob.f10875q;
        }
        return m4;
    }

    /* access modifiers changed from: package-private */
    public DecodeJob n(com.bumptech.glide.d dVar, Object obj, l lVar, X0.b bVar, int i4, int i5, Class cls, Class cls2, Priority priority, h hVar, Map map, boolean z3, boolean z4, boolean z5, X0.d dVar2, b bVar2, int i6) {
        this.f10859a.v(dVar, obj, bVar, i4, i5, hVar, cls, cls2, priority, dVar2, map, z3, z4, this.f10862d);
        this.f10866h = dVar;
        this.f10867i = bVar;
        this.f10868j = priority;
        this.f10869k = lVar;
        this.f10870l = i4;
        this.f10871m = i5;
        this.f10872n = hVar;
        this.f10879y = z5;
        this.f10873o = dVar2;
        this.f10874p = bVar2;
        this.f10875q = i6;
        this.f10877w = RunReason.INITIALIZE;
        this.f10880z = obj;
        return this;
    }

    public void run() {
        C0865b.c("DecodeJob#run(reason=%s, model=%s)", this.f10877w, this.f10880z);
        com.bumptech.glide.load.data.d dVar = this.f10854F;
        try {
            if (this.f10857I) {
                s();
                if (dVar != null) {
                    dVar.b();
                }
                C0865b.e();
                return;
            }
            B();
            if (dVar != null) {
                dVar.b();
            }
            C0865b.e();
        } catch (CallbackException e4) {
            throw e4;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            C0865b.e();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.u} */
    /* JADX WARNING: type inference failed for: r12v5, types: [X0.b] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bumptech.glide.load.engine.s v(com.bumptech.glide.load.DataSource r12, com.bumptech.glide.load.engine.s r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.f r0 = r11.f10859a
            X0.g r0 = r0.s(r8)
            com.bumptech.glide.d r2 = r11.f10866h
            int r3 = r11.f10870l
            int r4 = r11.f10871m
            com.bumptech.glide.load.engine.s r2 = r0.a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.d()
        L_0x002b:
            com.bumptech.glide.load.engine.f r13 = r11.f10859a
            boolean r13 = r13.w(r0)
            if (r13 == 0) goto L_0x0041
            com.bumptech.glide.load.engine.f r13 = r11.f10859a
            X0.f r1 = r13.n(r0)
            X0.d r13 = r11.f10873o
            com.bumptech.glide.load.EncodeStrategy r13 = r1.b(r13)
        L_0x003f:
            r10 = r1
            goto L_0x0044
        L_0x0041:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
            goto L_0x003f
        L_0x0044:
            com.bumptech.glide.load.engine.f r1 = r11.f10859a
            X0.b r2 = r11.f10850B
            boolean r1 = r1.y(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.engine.h r3 = r11.f10872n
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00a6
            int[] r12 = com.bumptech.glide.load.engine.DecodeJob.a.f10885c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0093
            r1 = 2
            if (r12 != r1) goto L_0x007c
            com.bumptech.glide.load.engine.u r12 = new com.bumptech.glide.load.engine.u
            com.bumptech.glide.load.engine.f r13 = r11.f10859a
            Z0.b r2 = r13.b()
            X0.b r3 = r11.f10850B
            X0.b r4 = r11.f10867i
            int r5 = r11.f10870l
            int r6 = r11.f10871m
            X0.d r9 = r11.f10873o
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009c
        L_0x007c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0093:
            com.bumptech.glide.load.engine.c r12 = new com.bumptech.glide.load.engine.c
            X0.b r13 = r11.f10850B
            X0.b r1 = r11.f10867i
            r12.<init>(r13, r1)
        L_0x009c:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.r.f(r0)
            com.bumptech.glide.load.engine.DecodeJob$d r13 = r11.f10864f
            r13.d(r12, r10, r0)
            goto L_0x00b4
        L_0x00a6:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.v(com.bumptech.glide.load.DataSource, com.bumptech.glide.load.engine.s):com.bumptech.glide.load.engine.s");
    }

    /* access modifiers changed from: package-private */
    public void w(boolean z3) {
        if (this.f10865g.d(z3)) {
            x();
        }
    }
}
