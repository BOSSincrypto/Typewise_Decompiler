package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class h {

    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f5065a;

        /* renamed from: b  reason: collision with root package name */
        private int f5066b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        private static class C0076a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f5067a;

            C0076a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f5067a = i4;
            }

            public void run() {
                Process.setThreadPriority(this.f5067a);
                super.run();
            }
        }

        a(String str, int i4) {
            this.f5065a = str;
            this.f5066b = i4;
        }

        public Thread newThread(Runnable runnable) {
            return new C0076a(runnable, this.f5065a, this.f5066b);
        }
    }

    private static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable f5068a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.core.util.a f5069b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f5070c;

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f5071a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f5072b;

            a(androidx.core.util.a aVar, Object obj) {
                this.f5071a = aVar;
                this.f5072b = obj;
            }

            public void run() {
                this.f5071a.accept(this.f5072b);
            }
        }

        b(Handler handler, Callable callable, androidx.core.util.a aVar) {
            this.f5068a = callable;
            this.f5069b = aVar;
            this.f5070c = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f5068a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f5070c.post(new a(this.f5069b, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i4, int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, androidx.core.util.a aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i4) {
        try {
            return executorService.submit(callable).get((long) i4, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e4) {
            throw new RuntimeException(e4);
        } catch (InterruptedException e5) {
            throw e5;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
