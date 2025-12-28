package ch.icoaching.typewise;

import B0.m;
import ch.icoaching.typewise.autocorrection.a;
import ch.icoaching.typewise.autocorrection.scripts.PointCorrection;
import ch.icoaching.typewise.language_modelling.inference.b;
import java.util.Map;
import kotlin.collections.D;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g0;
import r0.C0870b;

public final class Autocorrection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f7747a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f7748b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public m f7749c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public PointCorrection f7750d;

    /* renamed from: e  reason: collision with root package name */
    private C0870b f7751e;

    /* renamed from: f  reason: collision with root package name */
    private float f7752f;

    /* renamed from: g  reason: collision with root package name */
    private Map f7753g = D.h();

    /* renamed from: h  reason: collision with root package name */
    private String f7754h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f7755i;

    public Autocorrection(a aVar, a aVar2) {
        o.e(aVar, "aiLibrary");
        o.e(aVar2, "autocorrectionDatabaseRepository");
        this.f7747a = aVar;
        this.f7748b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r16, java.util.List r17, kotlin.coroutines.c r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof ch.icoaching.typewise.Autocorrection$correct$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.Autocorrection$correct$1 r2 = (ch.icoaching.typewise.Autocorrection$correct$1) r2
            int r3 = r2.f7759d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f7759d = r3
        L_0x0015:
            r8 = r2
            goto L_0x001d
        L_0x0017:
            ch.icoaching.typewise.Autocorrection$correct$1 r2 = new ch.icoaching.typewise.Autocorrection$correct$1
            r2.<init>(r15, r1)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r1 = r8.f7757b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r8.f7759d
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r2 = r8.f7756a
            ch.icoaching.typewise.Autocorrection r2 = (ch.icoaching.typewise.Autocorrection) r2
            kotlin.f.b(r1)
            goto L_0x00ad
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.f.b(r1)
            r1 = 60
            r3 = r16
            r5 = r17
            E0.k r1 = E0.n.a(r3, r5, r1)
            java.lang.String r5 = r1.a()
            java.util.List r1 = r1.b()
            ch.icoaching.typewise.e r3 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "correct() :: '"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = "' | "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r11 = r6.toString()
            r13 = 4
            r14 = 0
            java.lang.String r10 = "Autocorrection"
            r12 = 0
            r9 = r3
            ch.icoaching.typewise.e.b(r9, r10, r11, r12, r13, r14)
            boolean r6 = r0.f7755i
            r7 = 0
            if (r6 != 0) goto L_0x007a
            return r7
        L_0x007a:
            int r6 = r5.length()
            if (r6 != 0) goto L_0x008e
            r0.f7751e = r7
            r13 = 4
            r14 = 0
            java.lang.String r10 = "Autocorrection"
            java.lang.String r11 = "correct() :: Input is empty. Not running autocorrection."
            r12 = 0
            r9 = r3
            ch.icoaching.typewise.e.b(r9, r10, r11, r12, r13, r14)
            return r7
        L_0x008e:
            java.util.List r1 = E0.q.a(r5, r1)
            B0.m r3 = r0.f7749c
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = "completeCorrection"
            kotlin.jvm.internal.o.p(r3)
            r3 = r7
        L_0x009c:
            r0.b r6 = r0.f7751e
            r8.f7756a = r0
            r8.f7759d = r4
            r7 = 0
            r4 = r5
            r5 = r1
            java.lang.Object r1 = r3.b(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L_0x00ac
            return r2
        L_0x00ac:
            r2 = r0
        L_0x00ad:
            r0.b r1 = (r0.C0870b) r1
            r2.f7751e = r1
            ch.icoaching.typewise.e r3 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "correct() :: result: '"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "'"
            r2.append(r4)
            java.lang.String r5 = r2.toString()
            r7 = 4
            r8 = 0
            java.lang.String r4 = "Autocorrection"
            r6 = 0
            ch.icoaching.typewise.e.b(r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.Autocorrection.f(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public final void g(boolean z3, b bVar) {
        String str = this.f7754h;
        if (str != null) {
            h(str, this.f7752f, this.f7753g, z3, bVar);
        }
    }

    public final void h(String str, float f4, Map map, boolean z3, b bVar) {
        o.e(str, "language");
        o.e(map, "keyCenters");
        e eVar = e.f8233a;
        e.f(eVar, "Autocorrection", "Autocorrection initialization started.", (Throwable) null, 4, (Object) null);
        e.b(eVar, "Autocorrection", "reinitialize() :: " + str + " | " + f4 + " | " + z3 + " | " + map, (Throwable) null, 4, (Object) null);
        this.f7754h = str;
        this.f7752f = f4;
        this.f7753g = map;
        g0 unused = C0739h.d(this.f7747a.c(), (CoroutineContext) null, (CoroutineStart) null, new Autocorrection$reinitialize$1(this, str, map, f4, z3, bVar, (c) null), 3, (Object) null);
    }

    public final String i(String str) {
        o.e(str, "word");
        if (!this.f7755i) {
            return str;
        }
        PointCorrection pointCorrection = this.f7750d;
        if (pointCorrection == null) {
            o.p("pointCorrection");
            pointCorrection = null;
        }
        return pointCorrection.I(str);
    }
}
