package ch.icoaching.wrio.appnomix.controller;

import ch.icoaching.wrio.appnomix.data.network.c;
import kotlin.jvm.internal.o;
import l2.q;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9238a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static a f9239b;

    private e() {
    }

    public final a a() {
        if (f9239b == null) {
            synchronized (this) {
                try {
                    if (f9239b == null) {
                        f9239b = new a(c.f9246a.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVar = f9239b;
        o.b(aVar);
        return aVar;
    }
}
