package P2;

import M2.a;
import android.content.Context;
import ch.icoaching.wrio.X;
import ch.icoaching.wrio.data.f;
import ch.icoaching.wrio.keyboard.B;
import kotlin.jvm.internal.o;
import l2.q;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f1191a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static p f1192b;

    /* renamed from: c  reason: collision with root package name */
    private static C0350d f1193c;

    private w() {
    }

    private final C0350d b() {
        if (f1193c == null) {
            synchronized (this) {
                try {
                    if (f1193c == null) {
                        f1193c = new C0350d();
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0350d dVar = f1193c;
        o.b(dVar);
        return dVar;
    }

    public final void a() {
        f1192b = null;
        f1193c = null;
    }

    public final p c() {
        if (f1192b == null) {
            synchronized (this) {
                try {
                    if (f1192b == null) {
                        Context a4 = a.f941a.a();
                        B k4 = X.f9083a.k();
                        f fVar = f.f9502a;
                        f1192b = new p(a4, k4, fVar.j(), fVar.k(), f1191a.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        p pVar = f1192b;
        o.b(pVar);
        return pVar;
    }
}
