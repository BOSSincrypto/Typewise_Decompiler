package ch.icoaching.typewise;

import android.util.Log;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f8233a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8234b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f8235c;

    /* renamed from: d  reason: collision with root package name */
    private static final a f8236d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static WeakReference f8237e;

    public static final class a implements d {

        /* renamed from: ch.icoaching.typewise.e$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0140a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f8238a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    ch.icoaching.typewise.Priority[] r0 = ch.icoaching.typewise.Priority.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ch.icoaching.typewise.Priority r1 = ch.icoaching.typewise.Priority.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ch.icoaching.typewise.Priority r1 = ch.icoaching.typewise.Priority.DEBUG     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    ch.icoaching.typewise.Priority r1 = ch.icoaching.typewise.Priority.INFO     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    ch.icoaching.typewise.Priority r1 = ch.icoaching.typewise.Priority.WARN     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    ch.icoaching.typewise.Priority r1 = ch.icoaching.typewise.Priority.ERROR     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f8238a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.e.a.C0140a.<clinit>():void");
            }
        }

        a() {
        }

        public void a(Priority priority, String str, Object obj, Throwable th) {
            o.e(priority, "priority");
            o.e(str, "tag");
            o.e(obj, "message");
            int i4 = C0140a.f8238a[priority.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                obj.toString();
            } else if (i4 == 4) {
                Log.w(str, obj.toString(), th);
            } else if (i4 == 5) {
                Log.e(str, obj.toString(), th);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private e() {
    }

    public static /* synthetic */ void b(e eVar, String str, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        eVar.a(str, obj, th);
    }

    public static /* synthetic */ void d(e eVar, String str, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        eVar.c(str, obj, th);
    }

    public static /* synthetic */ void f(e eVar, String str, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        eVar.e(str, obj, th);
    }

    public static /* synthetic */ void j(e eVar, String str, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        eVar.i(str, obj, th);
    }

    public static /* synthetic */ void l(e eVar, String str, Object obj, Throwable th, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        eVar.k(str, obj, th);
    }

    public final void a(String str, Object obj, Throwable th) {
        d dVar;
        o.e(str, "tag");
        o.e(obj, "message");
        if (f8235c) {
            WeakReference weakReference = f8237e;
            if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
                dVar = f8236d;
            }
            Priority priority = Priority.DEBUG;
            dVar.a(priority, "TW-AC-LIB:" + str, obj, th);
        }
    }

    public final void c(String str, Object obj, Throwable th) {
        d dVar;
        o.e(str, "tag");
        o.e(obj, "message");
        if (f8235c || f8234b) {
            WeakReference weakReference = f8237e;
            if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
                dVar = f8236d;
            }
            Priority priority = Priority.ERROR;
            dVar.a(priority, "TW-AC-LIB:" + str, obj, th);
        }
    }

    public final void e(String str, Object obj, Throwable th) {
        d dVar;
        o.e(str, "tag");
        o.e(obj, "message");
        if (f8235c || f8234b) {
            WeakReference weakReference = f8237e;
            if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
                dVar = f8236d;
            }
            Priority priority = Priority.INFO;
            dVar.a(priority, "TW-AC-LIB:" + str, obj, th);
        }
    }

    public final void g(boolean z3) {
        f8235c = z3;
    }

    public final void h(d dVar) {
        WeakReference weakReference = f8237e;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (dVar == null) {
            f8237e = null;
        } else {
            f8237e = new WeakReference(dVar);
        }
    }

    public final void i(String str, Object obj, Throwable th) {
        d dVar;
        o.e(str, "tag");
        o.e(obj, "message");
        if (f8235c) {
            WeakReference weakReference = f8237e;
            if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
                dVar = f8236d;
            }
            Priority priority = Priority.VERBOSE;
            dVar.a(priority, "TW-AC-LIB:" + str, obj, th);
        }
    }

    public final void k(String str, Object obj, Throwable th) {
        d dVar;
        o.e(str, "tag");
        o.e(obj, "message");
        if (f8235c || f8234b) {
            WeakReference weakReference = f8237e;
            if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
                dVar = f8236d;
            }
            Priority priority = Priority.WARN;
            dVar.a(priority, "TW-AC-LIB:" + str, obj, th);
        }
    }
}
