package b1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b1.a  reason: case insensitive filesystem */
public final class C0481a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private static final long f7458b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f7459c;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f7460a;

    /* renamed from: b1.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f7461a;

        /* renamed from: b  reason: collision with root package name */
        private int f7462b;

        /* renamed from: c  reason: collision with root package name */
        private int f7463c;

        /* renamed from: d  reason: collision with root package name */
        private final ThreadFactory f7464d = new c();

        /* renamed from: e  reason: collision with root package name */
        private e f7465e = e.f7479d;

        /* renamed from: f  reason: collision with root package name */
        private String f7466f;

        /* renamed from: g  reason: collision with root package name */
        private long f7467g;

        b(boolean z3) {
            this.f7461a = z3;
        }

        public C0481a a() {
            if (!TextUtils.isEmpty(this.f7466f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f7462b, this.f7463c, this.f7467g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f7464d, this.f7466f, this.f7465e, this.f7461a));
                if (this.f7467g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C0481a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f7466f);
        }

        public b b(String str) {
            this.f7466f = str;
            return this;
        }

        public b c(int i4) {
            this.f7462b = i4;
            this.f7463c = i4;
            return this;
        }
    }

    /* renamed from: b1.a$c */
    private static final class c implements ThreadFactory {

        /* renamed from: b1.a$c$a  reason: collision with other inner class name */
        class C0120a extends Thread {
            C0120a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C0120a(runnable);
        }
    }

    /* renamed from: b1.a$d */
    private static final class d implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadFactory f7469a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7470b;

        /* renamed from: c  reason: collision with root package name */
        final e f7471c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f7472d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicInteger f7473e = new AtomicInteger();

        /* renamed from: b1.a$d$a  reason: collision with other inner class name */
        class C0121a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f7474a;

            C0121a(Runnable runnable) {
                this.f7474a = runnable;
            }

            public void run() {
                if (d.this.f7472d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f7474a.run();
                } catch (Throwable th) {
                    d.this.f7471c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z3) {
            this.f7469a = threadFactory;
            this.f7470b = str;
            this.f7471c = eVar;
            this.f7472d = z3;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f7469a.newThread(new C0121a(runnable));
            newThread.setName("glide-" + this.f7470b + "-thread-" + this.f7473e.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: b1.a$e */
    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7476a = new C0122a();

        /* renamed from: b  reason: collision with root package name */
        public static final e f7477b;

        /* renamed from: c  reason: collision with root package name */
        public static final e f7478c = new c();

        /* renamed from: d  reason: collision with root package name */
        public static final e f7479d;

        /* renamed from: b1.a$e$a  reason: collision with other inner class name */
        class C0122a implements e {
            C0122a() {
            }

            public void a(Throwable th) {
            }
        }

        /* renamed from: b1.a$e$b */
        class b implements e {
            b() {
            }

            public void a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: b1.a$e$c */
        class c implements e {
            c() {
            }

            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f7477b = bVar;
            f7479d = bVar;
        }

        void a(Throwable th);
    }

    C0481a(ExecutorService executorService) {
        this.f7460a = executorService;
    }

    static int a() {
        if (b() >= 4) {
            return 2;
        }
        return 1;
    }

    public static int b() {
        if (f7459c == 0) {
            f7459c = Math.min(4, C0482b.a());
        }
        return f7459c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static C0481a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static C0481a g() {
        return e().a();
    }

    public static b h() {
        return new b(false).c(b()).b("source");
    }

    public static C0481a i() {
        return h().a();
    }

    public static C0481a j() {
        return new C0481a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f7458b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f7479d, false)));
    }

    public boolean awaitTermination(long j4, TimeUnit timeUnit) {
        return this.f7460a.awaitTermination(j4, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f7460a.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f7460a.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f7460a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f7460a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f7460a.isTerminated();
    }

    public void shutdown() {
        this.f7460a.shutdown();
    }

    public List shutdownNow() {
        return this.f7460a.shutdownNow();
    }

    public Future submit(Runnable runnable) {
        return this.f7460a.submit(runnable);
    }

    public String toString() {
        return this.f7460a.toString();
    }

    public List invokeAll(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f7460a.invokeAll(collection, j4, timeUnit);
    }

    public Object invokeAny(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f7460a.invokeAny(collection, j4, timeUnit);
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.f7460a.submit(runnable, obj);
    }

    public Future submit(Callable callable) {
        return this.f7460a.submit(callable);
    }
}
