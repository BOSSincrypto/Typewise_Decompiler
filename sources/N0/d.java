package n0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m0.t;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final t f15067a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f15068b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f15069c = new a();

    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            d.this.f15068b.post(runnable);
        }
    }

    public d(Executor executor) {
        this.f15067a = new t(executor);
    }

    public Executor a() {
        return this.f15069c;
    }

    public /* synthetic */ void c(Runnable runnable) {
        C0826b.a(this, runnable);
    }

    /* renamed from: d */
    public t b() {
        return this.f15067a;
    }
}
