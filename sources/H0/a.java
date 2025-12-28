package H0;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f529a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Application f530b;

    /* renamed from: c  reason: collision with root package name */
    private static D f531c;

    private a() {
    }

    public final void a(Application application, D d4) {
        o.e(application, "_application");
        o.e(d4, "_applicationCoroutineScope");
        if (f530b == null) {
            synchronized (this) {
                try {
                    if (f530b == null) {
                        f530b = application;
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (f531c == null) {
            synchronized (this) {
                try {
                    if (f531c == null) {
                        f531c = d4;
                    }
                    q qVar2 = q.f14567a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final Context b() {
        Application application = f530b;
        if (application == null) {
            o.p("application");
            application = null;
        }
        Context applicationContext = application.getApplicationContext();
        o.d(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }
}
