package androidx.work;

import android.content.Context;
import androidx.work.l;

public abstract class Worker extends l {

    /* renamed from: e  reason: collision with root package name */
    androidx.work.impl.utils.futures.a f7082e;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.f7082e.p(Worker.this.q());
            } catch (Throwable th) {
                Worker.this.f7082e.q(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f7084a;

        b(androidx.work.impl.utils.futures.a aVar) {
            this.f7084a = aVar;
        }

        public void run() {
            try {
                this.f7084a.p(Worker.this.r());
            } catch (Throwable th) {
                this.f7084a.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public X1.a d() {
        androidx.work.impl.utils.futures.a t4 = androidx.work.impl.utils.futures.a.t();
        b().execute(new b(t4));
        return t4;
    }

    public final X1.a o() {
        this.f7082e = androidx.work.impl.utils.futures.a.t();
        b().execute(new a());
        return this.f7082e;
    }

    public abstract l.a q();

    public g r() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
