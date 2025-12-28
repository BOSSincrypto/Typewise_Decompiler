package M2;

import H0.b;
import android.content.Context;
import ch.icoaching.wrio.TypewiseApplication;
import kotlin.jvm.internal.o;
import l2.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f941a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static volatile TypewiseApplication f942b;

    /* renamed from: c  reason: collision with root package name */
    private static b f943c;

    private a() {
    }

    public final Context a() {
        TypewiseApplication typewiseApplication = f942b;
        if (typewiseApplication == null) {
            o.p("application");
            typewiseApplication = null;
        }
        Context applicationContext = typewiseApplication.getApplicationContext();
        o.d(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public final void b(TypewiseApplication typewiseApplication, b bVar) {
        o.e(typewiseApplication, "_application");
        o.e(bVar, "_appnomixSharedPreferences");
        if (f942b == null) {
            synchronized (this) {
                f942b = typewiseApplication;
                q qVar = q.f14567a;
            }
        }
        if (f943c == null) {
            synchronized (this) {
                try {
                    if (f943c == null) {
                        f943c = bVar;
                    }
                    q qVar2 = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final b c() {
        b bVar = f943c;
        if (bVar != null) {
            return bVar;
        }
        o.p("appnomixSharedPreferences");
        return null;
    }
}
