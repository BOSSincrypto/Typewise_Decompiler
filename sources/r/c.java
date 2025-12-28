package r;

import java.util.concurrent.Executor;

public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f15971c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f15972d = new C0868a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f15973e = new b();

    /* renamed from: a  reason: collision with root package name */
    private e f15974a;

    /* renamed from: b  reason: collision with root package name */
    private final e f15975b;

    private c() {
        d dVar = new d();
        this.f15975b = dVar;
        this.f15974a = dVar;
    }

    public static Executor f() {
        return f15973e;
    }

    public static c g() {
        if (f15971c != null) {
            return f15971c;
        }
        synchronized (c.class) {
            try {
                if (f15971c == null) {
                    f15971c = new c();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f15971c;
    }

    public void a(Runnable runnable) {
        this.f15974a.a(runnable);
    }

    public boolean b() {
        return this.f15974a.b();
    }

    public void c(Runnable runnable) {
        this.f15974a.c(runnable);
    }
}
