package ch.icoaching.wrio;

import M2.b;
import N2.f;
import android.app.Application;
import androidx.work.a;
import ch.icoaching.typewise.Priority;
import ch.icoaching.typewise.d;
import ch.icoaching.typewise.e;
import ch.icoaching.wrio.data.i;
import ch.icoaching.wrio.logging.Log;
import java.lang.Thread;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;

public abstract class TypewiseApplication extends Application implements a.c {

    /* renamed from: a  reason: collision with root package name */
    public D f9050a;

    /* renamed from: b  reason: collision with root package name */
    public CoroutineDispatcher f9051b;

    /* renamed from: c  reason: collision with root package name */
    public i f9052c;

    /* renamed from: d  reason: collision with root package name */
    public f f9053d;

    /* renamed from: e  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f9054e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f9055f;

    /* renamed from: g  reason: collision with root package name */
    private final d f9056g = new a();

    public static final class a implements d {

        /* renamed from: ch.icoaching.wrio.TypewiseApplication$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0148a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9057a;

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
                    f9057a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.TypewiseApplication.a.C0148a.<clinit>():void");
            }
        }

        a() {
        }

        public void a(Priority priority, String str, Object obj, Throwable th) {
            o.e(priority, "priority");
            o.e(str, "tag");
            o.e(obj, "message");
            int i4 = C0148a.f9057a[priority.ordinal()];
            if (i4 == 1) {
                Log.f10572a.m(str, obj.toString(), th);
            } else if (i4 == 2) {
                Log.f10572a.c(str, obj.toString(), th);
            } else if (i4 == 3) {
                Log.f10572a.h(str, obj.toString(), th);
            } else if (i4 == 4) {
                Log.f10572a.o(str, obj.toString(), th);
            } else if (i4 == 5) {
                Log.f10572a.e(str, obj.toString(), th);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void j() {
        H0.a aVar = H0.a.f529a;
        b bVar = b.f944a;
        aVar.a(this, bVar.a());
        M2.a.f941a.b(this, I0.a.f579a.b());
        n(bVar.a());
        o(bVar.b());
        p(ch.icoaching.wrio.data.f.f9502a.l());
        q(M2.d.f949a.a());
    }

    private final void k() {
        Log.f10572a.j(this, f(), g());
        e eVar = e.f8233a;
        eVar.g(true);
        eVar.h(this.f9056g);
        l();
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(h().d(), new TypewiseApplication$initialiseLogging$1(this, (c<? super TypewiseApplication$initialiseLogging$1>) null)), f());
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(h().a(), new TypewiseApplication$initialiseLogging$2(this, (c<? super TypewiseApplication$initialiseLogging$2>) null)), f());
    }

    /* access modifiers changed from: private */
    public final void l() {
        boolean c4 = h().c();
        Log.f10572a.l(c4);
        if (c4) {
            this.f9054e = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new L(this));
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this.f9054e);
        this.f9054e = null;
    }

    /* access modifiers changed from: private */
    public static final void m(TypewiseApplication typewiseApplication, Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        o.e(thread, "t");
        o.e(th, "e");
        try {
            Log log = Log.f10572a;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            log.e("UncaughtException", message, th);
            uncaughtExceptionHandler = typewiseApplication.f9054e;
            if (uncaughtExceptionHandler == null) {
                System.exit(1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            uncaughtExceptionHandler = typewiseApplication.f9054e;
            if (uncaughtExceptionHandler == null) {
                System.exit(1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = typewiseApplication.f9054e;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
                throw th2;
            } else {
                System.exit(1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public androidx.work.a a() {
        if (this.f9053d == null) {
            j();
        }
        androidx.work.a a4 = new a.b().b(i()).a();
        o.d(a4, "build(...)");
        return a4;
    }

    public final D f() {
        D d4 = this.f9050a;
        if (d4 != null) {
            return d4;
        }
        o.p("applicationCoroutineScope");
        return null;
    }

    public final CoroutineDispatcher g() {
        CoroutineDispatcher coroutineDispatcher = this.f9051b;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        o.p("ioDispatcher");
        return null;
    }

    public final i h() {
        i iVar = this.f9052c;
        if (iVar != null) {
            return iVar;
        }
        o.p("otherSettings");
        return null;
    }

    public final f i() {
        f fVar = this.f9053d;
        if (fVar != null) {
            return fVar;
        }
        o.p("workerFactory");
        return null;
    }

    public final void n(D d4) {
        o.e(d4, "<set-?>");
        this.f9050a = d4;
    }

    public final void o(CoroutineDispatcher coroutineDispatcher) {
        o.e(coroutineDispatcher, "<set-?>");
        this.f9051b = coroutineDispatcher;
    }

    public void onCreate() {
        j();
        super.onCreate();
        k();
    }

    public final void p(i iVar) {
        o.e(iVar, "<set-?>");
        this.f9052c = iVar;
    }

    public final void q(f fVar) {
        o.e(fVar, "<set-?>");
        this.f9053d = fVar;
    }
}
