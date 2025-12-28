package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.F;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.u  reason: case insensitive filesystem */
public class C0440u {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f5367a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f5368b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Map f5369c = new HashMap();

    /* renamed from: androidx.core.view.u$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lifecycle f5370a;

        /* renamed from: b  reason: collision with root package name */
        private C0461k f5371b;

        a(Lifecycle lifecycle, C0461k kVar) {
            this.f5370a = lifecycle;
            this.f5371b = kVar;
            lifecycle.a(kVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f5370a.c(this.f5371b);
            this.f5371b = null;
        }
    }

    public C0440u(Runnable runnable) {
        this.f5367a = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(C0442w wVar, m mVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(wVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Lifecycle.State state, C0442w wVar, m mVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            c(wVar);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            l(wVar);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f5368b.remove(wVar);
            this.f5367a.run();
        }
    }

    public void c(C0442w wVar) {
        this.f5368b.add(wVar);
        this.f5367a.run();
    }

    public void d(C0442w wVar, m mVar) {
        c(wVar);
        Lifecycle lifecycle = mVar.getLifecycle();
        a aVar = (a) this.f5369c.remove(wVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f5369c.put(wVar, new a(lifecycle, new C0439t(this, wVar)));
    }

    public void e(C0442w wVar, m mVar, Lifecycle.State state) {
        Lifecycle lifecycle = mVar.getLifecycle();
        a aVar = (a) this.f5369c.remove(wVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f5369c.put(wVar, new a(lifecycle, new C0438s(this, state, wVar)));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f5368b.iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        }
    }

    public void i(Menu menu) {
        Iterator it = this.f5368b.iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it = this.f5368b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        F.a(it.next());
        throw null;
    }

    public void k(Menu menu) {
        Iterator it = this.f5368b.iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        }
    }

    public void l(C0442w wVar) {
        this.f5368b.remove(wVar);
        a aVar = (a) this.f5369c.remove(wVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f5367a.run();
    }
}
