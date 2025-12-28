package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.B;
import java.util.Map;
import java.util.WeakHashMap;

public class r extends C0402a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f6691d;

    /* renamed from: e  reason: collision with root package name */
    private final a f6692e;

    public static class a extends C0402a {

        /* renamed from: d  reason: collision with root package name */
        final r f6693d;

        /* renamed from: e  reason: collision with root package name */
        private Map f6694e = new WeakHashMap();

        public a(r rVar) {
            this.f6693d = rVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        public B b(View view) {
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, A a4) {
            if (this.f6693d.o() || this.f6693d.f6691d.getLayoutManager() == null) {
                super.g(view, a4);
                return;
            }
            this.f6693d.f6691d.getLayoutManager().Y0(view, a4);
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                aVar.g(view, a4);
            } else {
                super.g(view, a4);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0402a aVar = (C0402a) this.f6694e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i4, Bundle bundle) {
            if (this.f6693d.o() || this.f6693d.f6691d.getLayoutManager() == null) {
                return super.j(view, i4, bundle);
            }
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i4, bundle)) {
                    return true;
                }
            } else if (super.j(view, i4, bundle)) {
                return true;
            }
            return this.f6693d.f6691d.getLayoutManager().s1(view, i4, bundle);
        }

        public void l(View view, int i4) {
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                aVar.l(view, i4);
            } else {
                super.l(view, i4);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C0402a aVar = (C0402a) this.f6694e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public C0402a n(View view) {
            return (C0402a) this.f6694e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            C0402a l4 = P.l(view);
            if (l4 != null && l4 != this) {
                this.f6694e.put(view, l4);
            }
        }
    }

    public r(RecyclerView recyclerView) {
        this.f6691d = recyclerView;
        C0402a n4 = n();
        if (n4 == null || !(n4 instanceof a)) {
            this.f6692e = new a(this);
        } else {
            this.f6692e = (a) n4;
        }
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U0(accessibilityEvent);
            }
        }
    }

    public void g(View view, A a4) {
        super.g(view, a4);
        if (!o() && this.f6691d.getLayoutManager() != null) {
            this.f6691d.getLayoutManager().W0(a4);
        }
    }

    public boolean j(View view, int i4, Bundle bundle) {
        if (super.j(view, i4, bundle)) {
            return true;
        }
        if (o() || this.f6691d.getLayoutManager() == null) {
            return false;
        }
        return this.f6691d.getLayoutManager().q1(i4, bundle);
    }

    public C0402a n() {
        return this.f6692e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f6691d.t0();
    }
}
