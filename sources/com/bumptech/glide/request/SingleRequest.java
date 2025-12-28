package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.appcompat.app.F;
import com.bumptech.glide.Priority;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import m1.g;
import m1.h;
import n1.C0829c;
import p1.l;
import q1.C0865b;
import q1.C0866c;

public final class SingleRequest implements c, g, f {

    /* renamed from: D  reason: collision with root package name */
    private static final boolean f11237D = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A  reason: collision with root package name */
    private int f11238A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f11239B;

    /* renamed from: C  reason: collision with root package name */
    private RuntimeException f11240C;

    /* renamed from: a  reason: collision with root package name */
    private int f11241a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11242b;

    /* renamed from: c  reason: collision with root package name */
    private final C0866c f11243c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11244d;

    /* renamed from: e  reason: collision with root package name */
    private final RequestCoordinator f11245e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f11246f;

    /* renamed from: g  reason: collision with root package name */
    private final d f11247g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f11248h;

    /* renamed from: i  reason: collision with root package name */
    private final Class f11249i;

    /* renamed from: j  reason: collision with root package name */
    private final a f11250j;

    /* renamed from: k  reason: collision with root package name */
    private final int f11251k;

    /* renamed from: l  reason: collision with root package name */
    private final int f11252l;

    /* renamed from: m  reason: collision with root package name */
    private final Priority f11253m;

    /* renamed from: n  reason: collision with root package name */
    private final h f11254n;

    /* renamed from: o  reason: collision with root package name */
    private final List f11255o;

    /* renamed from: p  reason: collision with root package name */
    private final C0829c f11256p;

    /* renamed from: q  reason: collision with root package name */
    private final Executor f11257q;

    /* renamed from: r  reason: collision with root package name */
    private s f11258r;

    /* renamed from: s  reason: collision with root package name */
    private i.d f11259s;

    /* renamed from: t  reason: collision with root package name */
    private long f11260t;

    /* renamed from: u  reason: collision with root package name */
    private volatile i f11261u;

    /* renamed from: v  reason: collision with root package name */
    private Status f11262v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f11263w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f11264x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f11265y;

    /* renamed from: z  reason: collision with root package name */
    private int f11266z;

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, d dVar, Object obj, Object obj2, Class cls, a aVar, int i4, int i5, Priority priority, h hVar, d dVar2, List list, RequestCoordinator requestCoordinator, i iVar, C0829c cVar, Executor executor) {
        String str;
        if (f11237D) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f11242b = str;
        this.f11243c = C0866c.a();
        this.f11244d = obj;
        this.f11246f = context;
        this.f11247g = dVar;
        this.f11248h = obj2;
        this.f11249i = cls;
        this.f11250j = aVar;
        this.f11251k = i4;
        this.f11252l = i5;
        this.f11253m = priority;
        this.f11254n = hVar;
        this.f11255o = list;
        this.f11245e = requestCoordinator;
        this.f11261u = iVar;
        this.f11256p = cVar;
        this.f11257q = executor;
        this.f11262v = Status.PENDING;
        if (this.f11240C == null && dVar.g().a(c.C0159c.class)) {
            this.f11240C = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(GlideException glideException, int i4) {
        this.f11243c.c();
        synchronized (this.f11244d) {
            try {
                glideException.setOrigin(this.f11240C);
                int h4 = this.f11247g.h();
                if (h4 <= i4) {
                    Log.w("Glide", "Load failed for [" + this.f11248h + "] with dimensions [" + this.f11266z + "x" + this.f11238A + "]", glideException);
                    if (h4 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f11259s = null;
                this.f11262v = Status.FAILED;
                x();
                this.f11239B = true;
                List list = this.f11255o;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        F.a(it.next());
                        t();
                        throw null;
                    }
                }
                C();
                this.f11239B = false;
                C0865b.f("GlideRequest", this.f11241a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void B(s sVar, Object obj, DataSource dataSource, boolean z3) {
        boolean t4 = t();
        this.f11262v = Status.COMPLETE;
        this.f11258r = sVar;
        if (this.f11247g.h() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(dataSource);
            sb.append(" for ");
            sb.append(this.f11248h);
            sb.append(" with size [");
            sb.append(this.f11266z);
            sb.append("x");
            sb.append(this.f11238A);
            sb.append("] in ");
            sb.append(p1.g.a(this.f11260t));
            sb.append(" ms");
        }
        y();
        this.f11239B = true;
        try {
            List list = this.f11255o;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    F.a(it.next());
                    throw null;
                }
            }
            this.f11254n.h(obj, this.f11256p.a(dataSource, t4));
            this.f11239B = false;
            C0865b.f("GlideRequest", this.f11241a);
        } catch (Throwable th) {
            this.f11239B = false;
            throw th;
        }
    }

    private void C() {
        Drawable drawable;
        if (m()) {
            if (this.f11248h == null) {
                drawable = r();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                drawable = q();
            }
            if (drawable == null) {
                drawable = s();
            }
            this.f11254n.b(drawable);
        }
    }

    private void j() {
        if (this.f11239B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean l() {
        RequestCoordinator requestCoordinator = this.f11245e;
        if (requestCoordinator == null || requestCoordinator.l(this)) {
            return true;
        }
        return false;
    }

    private boolean m() {
        RequestCoordinator requestCoordinator = this.f11245e;
        if (requestCoordinator == null || requestCoordinator.c(this)) {
            return true;
        }
        return false;
    }

    private boolean n() {
        RequestCoordinator requestCoordinator = this.f11245e;
        if (requestCoordinator == null || requestCoordinator.f(this)) {
            return true;
        }
        return false;
    }

    private void o() {
        j();
        this.f11243c.c();
        this.f11254n.f(this);
        i.d dVar = this.f11259s;
        if (dVar != null) {
            dVar.a();
            this.f11259s = null;
        }
    }

    private void p(Object obj) {
        List<Object> list = this.f11255o;
        if (list != null) {
            for (Object a4 : list) {
                F.a(a4);
            }
        }
    }

    private Drawable q() {
        if (this.f11263w == null) {
            Drawable n4 = this.f11250j.n();
            this.f11263w = n4;
            if (n4 == null && this.f11250j.l() > 0) {
                this.f11263w = u(this.f11250j.l());
            }
        }
        return this.f11263w;
    }

    private Drawable r() {
        if (this.f11265y == null) {
            Drawable o4 = this.f11250j.o();
            this.f11265y = o4;
            if (o4 == null && this.f11250j.p() > 0) {
                this.f11265y = u(this.f11250j.p());
            }
        }
        return this.f11265y;
    }

    private Drawable s() {
        if (this.f11264x == null) {
            Drawable u3 = this.f11250j.u();
            this.f11264x = u3;
            if (u3 == null && this.f11250j.v() > 0) {
                this.f11264x = u(this.f11250j.v());
            }
        }
        return this.f11264x;
    }

    private boolean t() {
        RequestCoordinator requestCoordinator = this.f11245e;
        if (requestCoordinator == null || !requestCoordinator.g().b()) {
            return true;
        }
        return false;
    }

    private Drawable u(int i4) {
        Resources.Theme theme;
        if (this.f11250j.A() != null) {
            theme = this.f11250j.A();
        } else {
            theme = this.f11246f.getTheme();
        }
        return g1.i.a(this.f11246f, i4, theme);
    }

    private void v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f11242b);
    }

    private static int w(int i4, float f4) {
        if (i4 == Integer.MIN_VALUE) {
            return i4;
        }
        return Math.round(f4 * ((float) i4));
    }

    private void x() {
        RequestCoordinator requestCoordinator = this.f11245e;
        if (requestCoordinator != null) {
            requestCoordinator.a(this);
        }
    }

    private void y() {
        RequestCoordinator requestCoordinator = this.f11245e;
        if (requestCoordinator != null) {
            requestCoordinator.j(this);
        }
    }

    public static SingleRequest z(Context context, d dVar, Object obj, Object obj2, Class cls, a aVar, int i4, int i5, Priority priority, h hVar, d dVar2, List list, RequestCoordinator requestCoordinator, i iVar, C0829c cVar, Executor executor) {
        return new SingleRequest(context, dVar, obj, obj2, cls, aVar, i4, i5, priority, hVar, dVar2, list, requestCoordinator, iVar, cVar, executor);
    }

    public void a(GlideException glideException) {
        A(glideException, 5);
    }

    public boolean b() {
        boolean z3;
        synchronized (this.f11244d) {
            if (this.f11262v == Status.COMPLETE) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public void c(s sVar, DataSource dataSource, boolean z3) {
        Object obj;
        String str;
        this.f11243c.c();
        s sVar2 = null;
        try {
            synchronized (this.f11244d) {
                try {
                    this.f11259s = null;
                    if (sVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f11249i + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = sVar.get();
                    if (obj2 != null) {
                        if (this.f11249i.isAssignableFrom(obj2.getClass())) {
                            if (!n()) {
                                try {
                                    this.f11258r = null;
                                    this.f11262v = Status.COMPLETE;
                                    C0865b.f("GlideRequest", this.f11241a);
                                    this.f11261u.k(sVar);
                                    return;
                                } catch (Throwable th) {
                                    sVar2 = sVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                B(sVar, obj2, dataSource, z3);
                                return;
                            }
                        }
                    }
                    this.f11258r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f11249i);
                    sb.append(" but instead got ");
                    if (obj2 != null) {
                        obj = obj2.getClass();
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    sb.append("{");
                    sb.append(obj2);
                    sb.append("} inside Resource{");
                    sb.append(sVar);
                    sb.append("}.");
                    if (obj2 != null) {
                        str = "";
                    } else {
                        str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                    }
                    sb.append(str);
                    a(new GlideException(sb.toString()));
                    this.f11261u.k(sVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (sVar2 != null) {
                this.f11261u.k(sVar2);
            }
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r5.f11261u.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11244d
            monitor-enter(r0)
            r5.j()     // Catch:{ all -> 0x0013 }
            q1.c r1 = r5.f11243c     // Catch:{ all -> 0x0013 }
            r1.c()     // Catch:{ all -> 0x0013 }
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f11262v     // Catch:{ all -> 0x0013 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x0013 }
            if (r1 != r2) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x0042
        L_0x0015:
            r5.o()     // Catch:{ all -> 0x0013 }
            com.bumptech.glide.load.engine.s r1 = r5.f11258r     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r1 == 0) goto L_0x0020
            r5.f11258r = r3     // Catch:{ all -> 0x0013 }
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            boolean r3 = r5.l()     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0030
            m1.h r3 = r5.f11254n     // Catch:{ all -> 0x0013 }
            android.graphics.drawable.Drawable r4 = r5.s()     // Catch:{ all -> 0x0013 }
            r3.j(r4)     // Catch:{ all -> 0x0013 }
        L_0x0030:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.f11241a     // Catch:{ all -> 0x0013 }
            q1.C0865b.f(r3, r4)     // Catch:{ all -> 0x0013 }
            r5.f11262v = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0041
            com.bumptech.glide.load.engine.i r0 = r5.f11261u
            r0.k(r1)
        L_0x0041:
            return
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    public boolean d(c cVar) {
        int i4;
        int i5;
        Object obj;
        Class cls;
        a aVar;
        Priority priority;
        int i6;
        int i7;
        int i8;
        Object obj2;
        Class cls2;
        a aVar2;
        Priority priority2;
        int i9;
        c cVar2 = cVar;
        if (!(cVar2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f11244d) {
            try {
                i4 = this.f11251k;
                i5 = this.f11252l;
                obj = this.f11248h;
                cls = this.f11249i;
                aVar = this.f11250j;
                priority = this.f11253m;
                List list = this.f11255o;
                if (list != null) {
                    i6 = list.size();
                } else {
                    i6 = 0;
                }
            } finally {
                while (true) {
                }
            }
        }
        SingleRequest singleRequest = (SingleRequest) cVar2;
        synchronized (singleRequest.f11244d) {
            try {
                i7 = singleRequest.f11251k;
                i8 = singleRequest.f11252l;
                obj2 = singleRequest.f11248h;
                cls2 = singleRequest.f11249i;
                aVar2 = singleRequest.f11250j;
                priority2 = singleRequest.f11253m;
                List list2 = singleRequest.f11255o;
                if (list2 != null) {
                    i9 = list2.size();
                } else {
                    i9 = 0;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i4 == i7 && i5 == i8 && l.b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && i6 == i9) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z3;
        synchronized (this.f11244d) {
            if (this.f11262v == Status.CLEARED) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public Object f() {
        this.f11243c.c();
        return this.f11244d;
    }

    public void g(int i4, int i5) {
        Object obj;
        this.f11243c.c();
        Object obj2 = this.f11244d;
        synchronized (obj2) {
            try {
                boolean z3 = f11237D;
                if (z3) {
                    v("Got onSizeReady in " + p1.g.a(this.f11260t));
                }
                if (this.f11262v == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.f11262v = status;
                    float z4 = this.f11250j.z();
                    this.f11266z = w(i4, z4);
                    this.f11238A = w(i5, z4);
                    if (z3) {
                        v("finished setup for calling load in " + p1.g.a(this.f11260t));
                    }
                    Status status2 = status;
                    boolean z5 = z3;
                    Status status3 = status2;
                    obj = obj2;
                    try {
                        this.f11259s = this.f11261u.f(this.f11247g, this.f11248h, this.f11250j.y(), this.f11266z, this.f11238A, this.f11250j.x(), this.f11249i, this.f11253m, this.f11250j.k(), this.f11250j.B(), this.f11250j.L(), this.f11250j.H(), this.f11250j.r(), this.f11250j.F(), this.f11250j.D(), this.f11250j.C(), this.f11250j.q(), this, this.f11257q);
                        if (this.f11262v != status3) {
                            this.f11259s = null;
                        }
                        if (z5) {
                            v("finished onSizeReady in " + p1.g.a(this.f11260t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.f11244d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11244d
            monitor-enter(r0)
            r5.j()     // Catch:{ all -> 0x0028 }
            q1.c r1 = r5.f11243c     // Catch:{ all -> 0x0028 }
            r1.c()     // Catch:{ all -> 0x0028 }
            long r1 = p1.g.b()     // Catch:{ all -> 0x0028 }
            r5.f11260t = r1     // Catch:{ all -> 0x0028 }
            java.lang.Object r1 = r5.f11248h     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0040
            int r1 = r5.f11251k     // Catch:{ all -> 0x0028 }
            int r2 = r5.f11252l     // Catch:{ all -> 0x0028 }
            boolean r1 = p1.l.s(r1, r2)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002b
            int r1 = r5.f11251k     // Catch:{ all -> 0x0028 }
            r5.f11266z = r1     // Catch:{ all -> 0x0028 }
            int r1 = r5.f11252l     // Catch:{ all -> 0x0028 }
            r5.f11238A = r1     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x00b7
        L_0x002b:
            android.graphics.drawable.Drawable r1 = r5.r()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0033
            r1 = 5
            goto L_0x0034
        L_0x0033:
            r1 = 3
        L_0x0034:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x0028 }
            r5.A(r2, r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0040:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f11262v     // Catch:{ all -> 0x0028 }
            com.bumptech.glide.request.SingleRequest$Status r3 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x0028 }
            if (r2 == r3) goto L_0x00af
            com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x0028 }
            if (r2 != r4) goto L_0x0054
            com.bumptech.glide.load.engine.s r1 = r5.f11258r     // Catch:{ all -> 0x0028 }
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5.c(r1, r2, r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0054:
            r5.p(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "GlideRequest"
            int r1 = q1.C0865b.b(r1)     // Catch:{ all -> 0x0028 }
            r5.f11241a = r1     // Catch:{ all -> 0x0028 }
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x0028 }
            r5.f11262v = r1     // Catch:{ all -> 0x0028 }
            int r2 = r5.f11251k     // Catch:{ all -> 0x0028 }
            int r4 = r5.f11252l     // Catch:{ all -> 0x0028 }
            boolean r2 = p1.l.s(r2, r4)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0075
            int r2 = r5.f11251k     // Catch:{ all -> 0x0028 }
            int r4 = r5.f11252l     // Catch:{ all -> 0x0028 }
            r5.g(r2, r4)     // Catch:{ all -> 0x0028 }
            goto L_0x007a
        L_0x0075:
            m1.h r2 = r5.f11254n     // Catch:{ all -> 0x0028 }
            r2.d(r5)     // Catch:{ all -> 0x0028 }
        L_0x007a:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f11262v     // Catch:{ all -> 0x0028 }
            if (r2 == r3) goto L_0x0080
            if (r2 != r1) goto L_0x008f
        L_0x0080:
            boolean r1 = r5.m()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x008f
            m1.h r1 = r5.f11254n     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r2 = r5.s()     // Catch:{ all -> 0x0028 }
            r1.g(r2)     // Catch:{ all -> 0x0028 }
        L_0x008f:
            boolean r1 = f11237D     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r1.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            long r2 = r5.f11260t     // Catch:{ all -> 0x0028 }
            double r2 = p1.g.a(r2)     // Catch:{ all -> 0x0028 }
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0028 }
            r5.v(r1)     // Catch:{ all -> 0x0028 }
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x00af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.i():void");
    }

    public boolean isRunning() {
        boolean z3;
        synchronized (this.f11244d) {
            try {
                Status status = this.f11262v;
                if (status != Status.RUNNING) {
                    if (status != Status.WAITING_FOR_SIZE) {
                        z3 = false;
                    }
                }
                z3 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public boolean k() {
        boolean z3;
        synchronized (this.f11244d) {
            if (this.f11262v == Status.COMPLETE) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f11244d) {
            obj = this.f11248h;
            cls = this.f11249i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
