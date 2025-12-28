package androidx.work;

import android.os.Build;
import androidx.work.impl.C0470d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final Executor f7100a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f7101b;

    /* renamed from: c  reason: collision with root package name */
    final v f7102c;

    /* renamed from: d  reason: collision with root package name */
    final j f7103d;

    /* renamed from: e  reason: collision with root package name */
    final s f7104e;

    /* renamed from: f  reason: collision with root package name */
    final androidx.core.util.a f7105f;

    /* renamed from: g  reason: collision with root package name */
    final androidx.core.util.a f7106g;

    /* renamed from: h  reason: collision with root package name */
    final String f7107h;

    /* renamed from: i  reason: collision with root package name */
    final int f7108i;

    /* renamed from: j  reason: collision with root package name */
    final int f7109j;

    /* renamed from: k  reason: collision with root package name */
    final int f7110k;

    /* renamed from: l  reason: collision with root package name */
    final int f7111l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f7112m;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    class C0113a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7113a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f7114b;

        C0113a(boolean z3) {
            this.f7114b = z3;
        }

        public Thread newThread(Runnable runnable) {
            String str;
            if (this.f7114b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f7113a.incrementAndGet());
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        Executor f7116a;

        /* renamed from: b  reason: collision with root package name */
        v f7117b;

        /* renamed from: c  reason: collision with root package name */
        j f7118c;

        /* renamed from: d  reason: collision with root package name */
        Executor f7119d;

        /* renamed from: e  reason: collision with root package name */
        s f7120e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.util.a f7121f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.util.a f7122g;

        /* renamed from: h  reason: collision with root package name */
        String f7123h;

        /* renamed from: i  reason: collision with root package name */
        int f7124i = 4;

        /* renamed from: j  reason: collision with root package name */
        int f7125j = 0;

        /* renamed from: k  reason: collision with root package name */
        int f7126k = Integer.MAX_VALUE;

        /* renamed from: l  reason: collision with root package name */
        int f7127l = 20;

        public a a() {
            return new a(this);
        }

        public b b(v vVar) {
            this.f7117b = vVar;
            return this;
        }
    }

    public interface c {
        a a();
    }

    a(b bVar) {
        Executor executor = bVar.f7116a;
        if (executor == null) {
            this.f7100a = a(false);
        } else {
            this.f7100a = executor;
        }
        Executor executor2 = bVar.f7119d;
        if (executor2 == null) {
            this.f7112m = true;
            this.f7101b = a(true);
        } else {
            this.f7112m = false;
            this.f7101b = executor2;
        }
        v vVar = bVar.f7117b;
        if (vVar == null) {
            this.f7102c = v.c();
        } else {
            this.f7102c = vVar;
        }
        j jVar = bVar.f7118c;
        if (jVar == null) {
            this.f7103d = j.c();
        } else {
            this.f7103d = jVar;
        }
        s sVar = bVar.f7120e;
        if (sVar == null) {
            this.f7104e = new C0470d();
        } else {
            this.f7104e = sVar;
        }
        this.f7108i = bVar.f7124i;
        this.f7109j = bVar.f7125j;
        this.f7110k = bVar.f7126k;
        this.f7111l = bVar.f7127l;
        this.f7105f = bVar.f7121f;
        this.f7106g = bVar.f7122g;
        this.f7107h = bVar.f7123h;
    }

    private Executor a(boolean z3) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z3));
    }

    private ThreadFactory b(boolean z3) {
        return new C0113a(z3);
    }

    public String c() {
        return this.f7107h;
    }

    public Executor d() {
        return this.f7100a;
    }

    public androidx.core.util.a e() {
        return this.f7105f;
    }

    public j f() {
        return this.f7103d;
    }

    public int g() {
        return this.f7110k;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f7111l / 2;
        }
        return this.f7111l;
    }

    public int i() {
        return this.f7109j;
    }

    public int j() {
        return this.f7108i;
    }

    public s k() {
        return this.f7104e;
    }

    public androidx.core.util.a l() {
        return this.f7106g;
    }

    public Executor m() {
        return this.f7101b;
    }

    public v n() {
        return this.f7102c;
    }
}
