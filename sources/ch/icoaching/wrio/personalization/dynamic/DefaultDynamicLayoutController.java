package ch.icoaching.wrio.personalization.dynamic;

import android.graphics.PointF;
import c.C0489b;
import ch.icoaching.wrio.C0552p;
import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.input.c;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.t;
import ch.icoaching.wrio.logging.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;

public final class DefaultDynamicLayoutController implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final B f10589a;

    /* renamed from: b  reason: collision with root package name */
    private final c f10590b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0489b f10591c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final b f10592d;

    /* renamed from: e  reason: collision with root package name */
    private final D f10593e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final CoroutineDispatcher f10594f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final CoroutineDispatcher f10595g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f10596h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10597i;

    /* renamed from: j  reason: collision with root package name */
    private M0.c f10598j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public List f10599k;

    public DefaultDynamicLayoutController(B b4, c cVar, C0489b bVar, b bVar2, D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        o.e(b4, "keyboardController");
        o.e(cVar, "inputConnectionController");
        o.e(bVar, "databaseHandler");
        o.e(bVar2, "keyboardSettings");
        o.e(d4, "serviceScope");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(coroutineDispatcher2, "mainDispatcher");
        this.f10589a = b4;
        this.f10590b = cVar;
        this.f10591c = bVar;
        this.f10592d = bVar2;
        this.f10593e = d4;
        this.f10594f = coroutineDispatcher;
        this.f10595g = coroutineDispatcher2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: M0.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final M0.b g(java.util.List r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "left_space"
            boolean r0 = kotlin.jvm.internal.o.a(r6, r0)
            r1 = 32
            r2 = 0
            if (r0 == 0) goto L_0x0026
            java.util.Iterator r5 = r5.iterator()
        L_0x000f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0023
            java.lang.Object r6 = r5.next()
            r0 = r6
            M0.b r0 = (M0.b) r0
            char r0 = r0.a()
            if (r0 != r1) goto L_0x000f
            r2 = r6
        L_0x0023:
            M0.b r2 = (M0.b) r2
            goto L_0x006b
        L_0x0026:
            java.lang.String r0 = "right_space"
            boolean r0 = kotlin.jvm.internal.o.a(r6, r0)
            if (r0 == 0) goto L_0x004d
            int r6 = r5.size()
            java.util.ListIterator r5 = r5.listIterator(r6)
        L_0x0036:
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x004a
            java.lang.Object r6 = r5.previous()
            r0 = r6
            M0.b r0 = (M0.b) r0
            char r0 = r0.a()
            if (r0 != r1) goto L_0x0036
            r2 = r6
        L_0x004a:
            M0.b r2 = (M0.b) r2
            goto L_0x006b
        L_0x004d:
            java.util.Iterator r5 = r5.iterator()
        L_0x0051:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r5.next()
            r1 = r0
            M0.b r1 = (M0.b) r1
            char r1 = r1.a()
            char r3 = kotlin.text.o.S0(r6)
            if (r1 != r3) goto L_0x0051
            r2 = r0
        L_0x0069:
            M0.b r2 = (M0.b) r2
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController.g(java.util.List, java.lang.String):M0.b");
    }

    private final t h(int i4) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultDynamicLayoutController", "Creating default dynamic offset " + i4, (Throwable) null, 4, (Object) null);
        return new t(i4, this.f10597i, 50, new PointF(0.0f, 0.0f));
    }

    private final t i(M0.b bVar, t tVar, List list) {
        double d4 = ((double) bVar.d()) / 3.0d;
        int f4 = tVar.f();
        float f5 = tVar.e().x * ((float) tVar.f());
        float f6 = tVar.e().y * ((float) tVar.f());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PointF pointF = (PointF) it.next();
            f4++;
            f5 += pointF.x - bVar.b().x;
            f6 += pointF.y - bVar.b().y;
        }
        float f7 = (float) f4;
        float f8 = f5 / f7;
        float f9 = f6 / f7;
        float sqrt = (float) Math.sqrt((double) ((f8 * f8) + (f9 * f9)));
        double d5 = (double) sqrt;
        if (d5 > d4) {
            float f10 = (float) (d4 / d5);
            f8 *= f10;
            f9 *= f10;
            Log log = Log.f10572a;
            Log.d(log, "DefaultDynamicLayoutController", "calculateDynamicOffset() :: Offset needs to be modified " + sqrt + ' ' + d4, (Throwable) null, 4, (Object) null);
        }
        return new t(bVar.c(), tVar.d(), f4, new PointF(C0552p.b(f8), C0552p.b(f9)));
    }

    private final void l(Map map, String str, PointF pointF) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            o.b(obj);
            ((List) obj).add(pointF);
            return;
        }
        map.put(str, C0718m.o(pointF));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: M0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: M0.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ac, code lost:
        if (r8 == null) goto L_0x01ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r14 = this;
            ch.icoaching.wrio.input.c r0 = r14.f10590b
            ch.icoaching.wrio.util.Pair r0 = r0.e()
            F r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            S r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            kotlin.jvm.internal.o.b(r1)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0019
            goto L_0x0241
        L_0x0019:
            kotlin.jvm.internal.o.b(r0)
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0028
            goto L_0x0241
        L_0x0028:
            java.util.Iterator r2 = r0.iterator()
        L_0x002c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0241
            java.lang.Object r3 = r2.next()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            if (r3 != 0) goto L_0x003b
            goto L_0x002c
        L_0x003b:
            M0.c r2 = r14.f10598j
            if (r2 != 0) goto L_0x0041
            goto L_0x0241
        L_0x0041:
            boolean r2 = r14.f10596h
            if (r2 == 0) goto L_0x0052
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
            r7 = 4
            r8 = 0
            java.lang.String r4 = "DefaultDynamicLayoutController"
            java.lang.String r5 = "tryCalculatingDynamicOffsets() :: Already recalculating dynamic offsets"
            r6 = 0
            ch.icoaching.wrio.logging.Log.d(r3, r4, r5, r6, r7, r8)
            return
        L_0x0052:
            r2 = 1
            r14.f10596h = r2
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
            r7 = 4
            r8 = 0
            java.lang.String r4 = "DefaultDynamicLayoutController"
            java.lang.String r5 = "tryCalculatingDynamicOffsets() :: calculating dynamic offset"
            r6 = 0
            ch.icoaching.wrio.logging.Log.d(r3, r4, r5, r6, r7, r8)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r3 = r1.length()
            r4 = 0
        L_0x006b:
            r5 = 0
            if (r4 >= r3) goto L_0x0114
            char r6 = r1.charAt(r4)
            java.lang.Object r7 = r0.get(r4)
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            if (r7 == 0) goto L_0x0110
            char r6 = java.lang.Character.toLowerCase(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            boolean r8 = kotlin.text.o.X(r6)
            if (r8 == 0) goto L_0x010d
            ch.icoaching.wrio.data.b r8 = r14.f10592d
            ch.icoaching.wrio.keyboard.KeyboardLayoutType r8 = r8.C()
            ch.icoaching.wrio.keyboard.KeyboardLayoutType r9 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.RECTANGLE
            if (r8 == r9) goto L_0x0110
            M0.c r8 = r14.f10598j
            if (r8 == 0) goto L_0x00bc
            java.util.List r8 = r8.b()
            if (r8 == 0) goto L_0x00bc
            java.util.Iterator r8 = r8.iterator()
        L_0x00a0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b8
            java.lang.Object r9 = r8.next()
            r10 = r9
            M0.b r10 = (M0.b) r10
            char r10 = r10.a()
            char r11 = kotlin.text.o.S0(r6)
            if (r10 != r11) goto L_0x00a0
            goto L_0x00b9
        L_0x00b8:
            r9 = r5
        L_0x00b9:
            M0.b r9 = (M0.b) r9
            goto L_0x00bd
        L_0x00bc:
            r9 = r5
        L_0x00bd:
            M0.c r8 = r14.f10598j
            if (r8 == 0) goto L_0x00e9
            java.util.List r8 = r8.b()
            if (r8 == 0) goto L_0x00e9
            int r10 = r8.size()
            java.util.ListIterator r8 = r8.listIterator(r10)
        L_0x00cf:
            boolean r10 = r8.hasPrevious()
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r8.previous()
            r11 = r10
            M0.b r11 = (M0.b) r11
            char r11 = r11.a()
            char r12 = kotlin.text.o.S0(r6)
            if (r11 != r12) goto L_0x00cf
            r5 = r10
        L_0x00e7:
            M0.b r5 = (M0.b) r5
        L_0x00e9:
            if (r9 == 0) goto L_0x0110
            if (r5 == 0) goto L_0x0110
            android.graphics.PointF r6 = r9.b()
            float r6 = ch.icoaching.wrio.C0559x.a(r7, r6)
            android.graphics.PointF r5 = r5.b()
            float r5 = ch.icoaching.wrio.C0559x.a(r7, r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0107
            java.lang.String r5 = "left_space"
            r14.l(r2, r5, r7)
            goto L_0x0110
        L_0x0107:
            java.lang.String r5 = "right_space"
            r14.l(r2, r5, r7)
            goto L_0x0110
        L_0x010d:
            r14.l(r2, r6, r7)
        L_0x0110:
            int r4 = r4 + 1
            goto L_0x006b
        L_0x0114:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            M0.c r1 = r14.f10598j
            kotlin.jvm.internal.o.b(r1)
            java.util.List r1 = r1.b()
            java.util.List r3 = r14.f10599k
            if (r3 == 0) goto L_0x0148
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x012f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0149
            java.lang.Object r6 = r3.next()
            r7 = r6
            ch.icoaching.wrio.keyboard.t r7 = (ch.icoaching.wrio.keyboard.t) r7
            boolean r7 = r7.d()
            boolean r8 = r14.f10597i
            if (r7 != r8) goto L_0x012f
            r4.add(r6)
            goto L_0x012f
        L_0x0148:
            r4 = r5
        L_0x0149:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0151:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f1
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            M0.b r7 = r14.g(r1, r6)
            if (r7 != 0) goto L_0x018b
            ch.icoaching.wrio.logging.Log r8 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "tryCalculatingDynamicOffsets() :: No dynamic center for key "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r10 = r3.toString()
            r12 = 4
            r13 = 0
            java.lang.String r9 = "DefaultDynamicLayoutController"
            r11 = 0
            ch.icoaching.wrio.logging.Log.d(r8, r9, r10, r11, r12, r13)
            goto L_0x0151
        L_0x018b:
            if (r4 == 0) goto L_0x01ae
            java.util.Iterator r6 = r4.iterator()
        L_0x0191:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01a9
            java.lang.Object r8 = r6.next()
            r9 = r8
            ch.icoaching.wrio.keyboard.t r9 = (ch.icoaching.wrio.keyboard.t) r9
            int r9 = r9.c()
            int r10 = r7.c()
            if (r9 != r10) goto L_0x0191
            goto L_0x01aa
        L_0x01a9:
            r8 = r5
        L_0x01aa:
            ch.icoaching.wrio.keyboard.t r8 = (ch.icoaching.wrio.keyboard.t) r8
            if (r8 != 0) goto L_0x01b6
        L_0x01ae:
            int r6 = r7.c()
            ch.icoaching.wrio.keyboard.t r8 = r14.h(r6)
        L_0x01b6:
            java.util.Iterator r6 = r0.iterator()
        L_0x01ba:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01da
            java.lang.Object r9 = r6.next()
            r10 = r9
            ch.icoaching.wrio.keyboard.t r10 = (ch.icoaching.wrio.keyboard.t) r10
            boolean r11 = r10.d()
            boolean r12 = r14.f10597i
            if (r11 != r12) goto L_0x01ba
            int r10 = r10.c()
            int r11 = r8.c()
            if (r10 != r11) goto L_0x01ba
            goto L_0x01db
        L_0x01da:
            r9 = r5
        L_0x01db:
            ch.icoaching.wrio.keyboard.t r9 = (ch.icoaching.wrio.keyboard.t) r9
            if (r9 == 0) goto L_0x01e8
            ch.icoaching.wrio.keyboard.t r3 = r14.i(r7, r9, r3)
            r0.add(r3)
            goto L_0x0151
        L_0x01e8:
            ch.icoaching.wrio.keyboard.t r3 = r14.i(r7, r8, r3)
            r0.add(r3)
            goto L_0x0151
        L_0x01f1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C0718m.t(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0200:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0233
            java.lang.Object r3 = r2.next()
            r4 = r3
            ch.icoaching.wrio.keyboard.t r4 = (ch.icoaching.wrio.keyboard.t) r4
            android.graphics.PointF r8 = new android.graphics.PointF
            android.graphics.PointF r3 = r4.e()
            float r3 = r3.x
            float r3 = ch.icoaching.wrio.C0552p.c(r3)
            android.graphics.PointF r5 = r4.e()
            float r5 = r5.y
            float r5 = ch.icoaching.wrio.C0552p.c(r5)
            r8.<init>(r3, r5)
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            ch.icoaching.wrio.keyboard.t r3 = ch.icoaching.wrio.keyboard.t.b(r4, r5, r6, r7, r8, r9, r10)
            r1.add(r3)
            goto L_0x0200
        L_0x0233:
            r14.f10599k = r1
            c.b r1 = r14.f10591c
            ch.icoaching.wrio.data.b r2 = r14.f10592d
            ch.icoaching.wrio.keyboard.KeyboardLayoutType r2 = r2.C()
            r1.b0(r0, r2)
            return
        L_0x0241:
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
            r7 = 4
            r8 = 0
            java.lang.String r4 = "DefaultDynamicLayoutController"
            java.lang.String r5 = "tryCalculatingDynamicOffsets() :: No data available for recalculating dynamic offsets"
            r6 = 0
            ch.icoaching.wrio.logging.Log.d(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController.a():void");
    }

    public void b() {
        this.f10596h = false;
    }

    public void c() {
        Log.d(Log.f10572a, "DefaultDynamicLayoutController", "loadDynamicOffsets()", (Throwable) null, 4, (Object) null);
        g0 unused = C0739h.d(this.f10593e, (CoroutineContext) null, (CoroutineStart) null, new DefaultDynamicLayoutController$loadDynamicOffsets$1(this, (kotlin.coroutines.c<? super DefaultDynamicLayoutController$loadDynamicOffsets$1>) null), 3, (Object) null);
    }

    public Object d(kotlin.coroutines.c cVar) {
        this.f10591c.p0();
        return q.f14567a;
    }

    public void e(M0.c cVar) {
        o.e(cVar, "keyCentres");
        this.f10598j = cVar;
    }

    public void f(boolean z3) {
        this.f10597i = z3;
    }

    public void c(boolean z3) {
        this.f10589a.c(z3);
    }
}
