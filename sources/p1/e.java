package p1;

import java.util.concurrent.Executor;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f15865a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f15866b = new b();

    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            l.t(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f15866b;
    }

    public static Executor b() {
        return f15865a;
    }
}
