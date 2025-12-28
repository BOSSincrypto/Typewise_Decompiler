package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

public abstract class m extends RecyclerView.Adapter {

    /* renamed from: d  reason: collision with root package name */
    final d f6681d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f6682e;

    class a implements d.b {
        a() {
        }

        public void a(List list, List list2) {
            m.this.B(list, list2);
        }
    }

    protected m(h.f fVar) {
        a aVar = new a();
        this.f6682e = aVar;
        d dVar = new d(new b(this), new c.a(fVar).a());
        this.f6681d = dVar;
        dVar.a(aVar);
    }

    /* access modifiers changed from: protected */
    public Object A(int i4) {
        return this.f6681d.b().get(i4);
    }

    public void B(List list, List list2) {
    }

    public void C(List list) {
        this.f6681d.e(list);
    }

    public void D(List list, Runnable runnable) {
        this.f6681d.f(list, runnable);
    }

    public int d() {
        return this.f6681d.b().size();
    }

    public List z() {
        return this.f6681d.b();
    }
}
