package Y;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1976d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f1977a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f1978b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1979c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a(d dVar) {
            o.e(dVar, "owner");
            return new c(dVar, (i) null);
        }

        private a() {
        }
    }

    public /* synthetic */ c(d dVar, i iVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f1976d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f1978b;
    }

    public final void c() {
        Lifecycle lifecycle = this.f1977a.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.INITIALIZED) {
            lifecycle.a(new Recreator(this.f1977a));
            this.f1978b.e(lifecycle);
            this.f1979c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void d(Bundle bundle) {
        if (!this.f1979c) {
            c();
        }
        Lifecycle lifecycle = this.f1977a.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            this.f1978b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        o.e(bundle, "outBundle");
        this.f1978b.g(bundle);
    }

    private c(d dVar) {
        this.f1977a = dVar;
        this.f1978b = new androidx.savedstate.a();
    }
}
