package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private final n f5984a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5985b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f5986c;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final n f5987a;

        /* renamed from: b  reason: collision with root package name */
        private final Lifecycle.Event f5988b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5989c;

        public a(n nVar, Lifecycle.Event event) {
            o.e(nVar, "registry");
            o.e(event, "event");
            this.f5987a = nVar;
            this.f5988b = event;
        }

        public void run() {
            if (!this.f5989c) {
                this.f5987a.h(this.f5988b);
                this.f5989c = true;
            }
        }
    }

    public D(m mVar) {
        o.e(mVar, "provider");
        this.f5984a = new n(mVar);
    }

    private final void f(Lifecycle.Event event) {
        a aVar = this.f5986c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f5984a, event);
        this.f5986c = aVar2;
        Handler handler = this.f5985b;
        o.b(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    public Lifecycle a() {
        return this.f5984a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }
}
