package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.app.F;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.b;
import com.bumptech.glide.request.c;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import m1.i;
import p1.k;
import p1.l;

public class h extends com.bumptech.glide.request.a implements Cloneable {

    /* renamed from: S  reason: collision with root package name */
    protected static final e f10769S = ((e) ((e) ((e) new e().i(com.bumptech.glide.load.engine.h.f10948c)).V(Priority.LOW)).c0(true));

    /* renamed from: E  reason: collision with root package name */
    private final Context f10770E;

    /* renamed from: F  reason: collision with root package name */
    private final i f10771F;

    /* renamed from: G  reason: collision with root package name */
    private final Class f10772G;

    /* renamed from: H  reason: collision with root package name */
    private final b f10773H;

    /* renamed from: I  reason: collision with root package name */
    private final d f10774I;

    /* renamed from: J  reason: collision with root package name */
    private j f10775J;

    /* renamed from: K  reason: collision with root package name */
    private Object f10776K;

    /* renamed from: L  reason: collision with root package name */
    private List f10777L;

    /* renamed from: M  reason: collision with root package name */
    private h f10778M;

    /* renamed from: N  reason: collision with root package name */
    private h f10779N;

    /* renamed from: O  reason: collision with root package name */
    private Float f10780O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f10781P = true;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f10782Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f10783R;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10784a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10785b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.Priority[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10785b = r0
                r1 = 1
                com.bumptech.glide.Priority r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10785b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.Priority r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10785b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.Priority r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f10785b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.Priority r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10784a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f10784a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f10784a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f10784a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10784a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f10784a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f10784a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f10784a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.h.a.<clinit>():void");
        }
    }

    protected h(b bVar, i iVar, Class cls, Context context) {
        this.f10773H = bVar;
        this.f10771F = iVar;
        this.f10772G = cls;
        this.f10770E = context;
        this.f10775J = iVar.r(cls);
        this.f10774I = bVar.i();
        p0(iVar.p());
        b(iVar.q());
    }

    private c k0(m1.h hVar, d dVar, com.bumptech.glide.request.a aVar, Executor executor) {
        return l0(new Object(), hVar, dVar, (RequestCoordinator) null, this.f10775J, aVar.w(), aVar.t(), aVar.s(), aVar, executor);
    }

    private c l0(Object obj, m1.h hVar, d dVar, RequestCoordinator requestCoordinator, j jVar, Priority priority, int i4, int i5, com.bumptech.glide.request.a aVar, Executor executor) {
        b bVar;
        b bVar2;
        if (this.f10779N != null) {
            bVar2 = new b(obj, requestCoordinator);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = requestCoordinator;
        }
        c m02 = m0(obj, hVar, dVar, bVar2, jVar, priority, i4, i5, aVar, executor);
        if (bVar == null) {
            return m02;
        }
        int t4 = this.f10779N.t();
        int s4 = this.f10779N.s();
        if (l.s(i4, i5) && !this.f10779N.N()) {
            t4 = aVar.t();
            s4 = aVar.s();
        }
        h hVar2 = this.f10779N;
        b bVar3 = bVar;
        bVar3.q(m02, hVar2.l0(obj, hVar, dVar, bVar3, hVar2.f10775J, hVar2.w(), t4, s4, this.f10779N, executor));
        return bVar3;
    }

    private c m0(Object obj, m1.h hVar, d dVar, RequestCoordinator requestCoordinator, j jVar, Priority priority, int i4, int i5, com.bumptech.glide.request.a aVar, Executor executor) {
        j jVar2;
        Priority o02;
        Object obj2 = obj;
        RequestCoordinator requestCoordinator2 = requestCoordinator;
        Priority priority2 = priority;
        h hVar2 = this.f10778M;
        if (hVar2 != null) {
            if (!this.f10783R) {
                j jVar3 = hVar2.f10775J;
                if (hVar2.f10781P) {
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar3;
                }
                if (hVar2.G()) {
                    o02 = this.f10778M.w();
                } else {
                    o02 = o0(priority2);
                }
                Priority priority3 = o02;
                int t4 = this.f10778M.t();
                int s4 = this.f10778M.s();
                if (l.s(i4, i5) && !this.f10778M.N()) {
                    t4 = aVar.t();
                    s4 = aVar.s();
                }
                int i6 = s4;
                g gVar = new g(obj2, requestCoordinator2);
                Object obj3 = obj;
                m1.h hVar3 = hVar;
                d dVar2 = dVar;
                g gVar2 = gVar;
                c y02 = y0(obj3, hVar3, dVar2, aVar, gVar, jVar, priority, i4, i5, executor);
                this.f10783R = true;
                h hVar4 = this.f10778M;
                c l02 = hVar4.l0(obj3, hVar3, dVar2, gVar2, jVar2, priority3, t4, i6, hVar4, executor);
                this.f10783R = false;
                gVar2.p(y02, l02);
                return gVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f10780O == null) {
            return y0(obj, hVar, dVar, aVar, requestCoordinator, jVar, priority, i4, i5, executor);
        } else {
            g gVar3 = new g(obj2, requestCoordinator2);
            m1.h hVar5 = hVar;
            d dVar3 = dVar;
            g gVar4 = gVar3;
            j jVar4 = jVar;
            int i7 = i4;
            int i8 = i5;
            Executor executor2 = executor;
            gVar3.p(y0(obj, hVar5, dVar3, aVar, gVar4, jVar4, priority, i7, i8, executor2), y0(obj, hVar5, dVar3, aVar.clone().b0(this.f10780O.floatValue()), gVar4, jVar4, o0(priority2), i7, i8, executor2));
            return gVar3;
        }
    }

    private Priority o0(Priority priority) {
        int i4 = a.f10785b[priority.ordinal()];
        if (i4 == 1) {
            return Priority.NORMAL;
        }
        if (i4 == 2) {
            return Priority.HIGH;
        }
        if (i4 == 3 || i4 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + w());
    }

    private void p0(List list) {
        for (Object a4 : list) {
            F.a(a4);
            i0((d) null);
        }
    }

    private m1.h r0(m1.h hVar, d dVar, com.bumptech.glide.request.a aVar, Executor executor) {
        k.d(hVar);
        if (this.f10782Q) {
            c k02 = k0(hVar, dVar, aVar, executor);
            c i4 = hVar.i();
            if (!k02.d(i4) || u0(aVar, i4)) {
                this.f10771F.o(hVar);
                hVar.k(k02);
                this.f10771F.y(hVar, k02);
                return hVar;
            }
            if (!((c) k.d(i4)).isRunning()) {
                i4.i();
            }
            return hVar;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean u0(com.bumptech.glide.request.a aVar, c cVar) {
        if (aVar.F() || !cVar.k()) {
            return false;
        }
        return true;
    }

    private h x0(Object obj) {
        if (E()) {
            return d().x0(obj);
        }
        this.f10776K = obj;
        this.f10782Q = true;
        return (h) Y();
    }

    private c y0(Object obj, m1.h hVar, d dVar, com.bumptech.glide.request.a aVar, RequestCoordinator requestCoordinator, j jVar, Priority priority, int i4, int i5, Executor executor) {
        Context context = this.f10770E;
        d dVar2 = this.f10774I;
        return SingleRequest.z(context, dVar2, obj, this.f10776K, this.f10772G, aVar, i4, i5, priority, hVar, dVar, this.f10777L, requestCoordinator, dVar2.f(), jVar.c(), executor);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!super.equals(hVar) || !Objects.equals(this.f10772G, hVar.f10772G) || !this.f10775J.equals(hVar.f10775J) || !Objects.equals(this.f10776K, hVar.f10776K) || !Objects.equals(this.f10777L, hVar.f10777L) || !Objects.equals(this.f10778M, hVar.f10778M) || !Objects.equals(this.f10779N, hVar.f10779N) || !Objects.equals(this.f10780O, hVar.f10780O) || this.f10781P != hVar.f10781P || this.f10782Q != hVar.f10782Q) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return l.o(this.f10782Q, l.o(this.f10781P, l.n(this.f10780O, l.n(this.f10779N, l.n(this.f10778M, l.n(this.f10777L, l.n(this.f10776K, l.n(this.f10775J, l.n(this.f10772G, super.hashCode())))))))));
    }

    public h i0(d dVar) {
        if (E()) {
            return d().i0(dVar);
        }
        if (dVar != null) {
            if (this.f10777L == null) {
                this.f10777L = new ArrayList();
            }
            this.f10777L.add(dVar);
        }
        return (h) Y();
    }

    /* renamed from: j0 */
    public h b(com.bumptech.glide.request.a aVar) {
        k.d(aVar);
        return (h) super.b(aVar);
    }

    /* renamed from: n0 */
    public h d() {
        h hVar = (h) super.clone();
        hVar.f10775J = hVar.f10775J.clone();
        if (hVar.f10777L != null) {
            hVar.f10777L = new ArrayList(hVar.f10777L);
        }
        h hVar2 = hVar.f10778M;
        if (hVar2 != null) {
            hVar.f10778M = hVar2.d();
        }
        h hVar3 = hVar.f10779N;
        if (hVar3 != null) {
            hVar.f10779N = hVar3.d();
        }
        return hVar;
    }

    public m1.h q0(m1.h hVar) {
        return s0(hVar, (d) null, p1.e.b());
    }

    /* access modifiers changed from: package-private */
    public m1.h s0(m1.h hVar, d dVar, Executor executor) {
        return r0(hVar, dVar, this, executor);
    }

    public i t0(ImageView imageView) {
        com.bumptech.glide.request.a aVar;
        l.a();
        k.d(imageView);
        if (!M() && K() && imageView.getScaleType() != null) {
            switch (a.f10784a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().P();
                    break;
                case 2:
                    aVar = clone().Q();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().R();
                    break;
                case 6:
                    aVar = clone().Q();
                    break;
            }
        }
        aVar = this;
        return (i) r0(this.f10774I.a(imageView, this.f10772G), (d) null, aVar, p1.e.b());
    }

    public h v0(Object obj) {
        return x0(obj);
    }

    public h w0(String str) {
        return x0(str);
    }
}
