package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r.c;
import s.C0889a;
import s.C0890b;

public class n extends Lifecycle {

    /* renamed from: j  reason: collision with root package name */
    public static final a f6059j = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6060b;

    /* renamed from: c  reason: collision with root package name */
    private C0889a f6061c;

    /* renamed from: d  reason: collision with root package name */
    private Lifecycle.State f6062d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f6063e;

    /* renamed from: f  reason: collision with root package name */
    private int f6064f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6065g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6066h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f6067i;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Lifecycle.State a(Lifecycle.State state, Lifecycle.State state2) {
            o.e(state, "state1");
            if (state2 == null || state2.compareTo(state) >= 0) {
                return state;
            }
            return state2;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Lifecycle.State f6068a;

        /* renamed from: b  reason: collision with root package name */
        private C0461k f6069b;

        public b(C0462l lVar, Lifecycle.State state) {
            o.e(state, "initialState");
            o.b(lVar);
            this.f6069b = p.f(lVar);
            this.f6068a = state;
        }

        public final void a(m mVar, Lifecycle.Event event) {
            o.e(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.f6068a = n.f6059j.a(this.f6068a, targetState);
            C0461k kVar = this.f6069b;
            o.b(mVar);
            kVar.c(mVar, event);
            this.f6068a = targetState;
        }

        public final Lifecycle.State b() {
            return this.f6068a;
        }
    }

    private n(m mVar, boolean z3) {
        this.f6060b = z3;
        this.f6061c = new C0889a();
        this.f6062d = Lifecycle.State.INITIALIZED;
        this.f6067i = new ArrayList();
        this.f6063e = new WeakReference(mVar);
    }

    private final void d(m mVar) {
        Iterator a4 = this.f6061c.a();
        o.d(a4, "observerMap.descendingIterator()");
        while (a4.hasNext() && !this.f6066h) {
            Map.Entry entry = (Map.Entry) a4.next();
            o.d(entry, "next()");
            C0462l lVar = (C0462l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f6062d) > 0 && !this.f6066h && this.f6061c.contains(lVar)) {
                Lifecycle.Event a5 = Lifecycle.Event.Companion.a(bVar.b());
                if (a5 != null) {
                    m(a5.getTargetState());
                    bVar.a(mVar, a5);
                    l();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    private final Lifecycle.State e(C0462l lVar) {
        Lifecycle.State state;
        b bVar;
        Map.Entry i4 = this.f6061c.i(lVar);
        Lifecycle.State state2 = null;
        if (i4 == null || (bVar = (b) i4.getValue()) == null) {
            state = null;
        } else {
            state = bVar.b();
        }
        if (!this.f6067i.isEmpty()) {
            ArrayList arrayList = this.f6067i;
            state2 = (Lifecycle.State) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f6059j;
        return aVar.a(aVar.a(this.f6062d, state), state2);
    }

    private final void f(String str) {
        if (this.f6060b && !c.g().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void g(m mVar) {
        C0890b.d d4 = this.f6061c.d();
        o.d(d4, "observerMap.iteratorWithAdditions()");
        while (d4.hasNext() && !this.f6066h) {
            Map.Entry entry = (Map.Entry) d4.next();
            C0462l lVar = (C0462l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f6062d) < 0 && !this.f6066h && this.f6061c.contains(lVar)) {
                m(bVar.b());
                Lifecycle.Event c4 = Lifecycle.Event.Companion.c(bVar.b());
                if (c4 != null) {
                    bVar.a(mVar, c4);
                    l();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean i() {
        if (this.f6061c.size() == 0) {
            return true;
        }
        Map.Entry b4 = this.f6061c.b();
        o.b(b4);
        Lifecycle.State b5 = ((b) b4.getValue()).b();
        Map.Entry e4 = this.f6061c.e();
        o.b(e4);
        Lifecycle.State b6 = ((b) e4.getValue()).b();
        if (b5 == b6 && this.f6062d == b6) {
            return true;
        }
        return false;
    }

    private final void k(Lifecycle.State state) {
        Lifecycle.State state2 = this.f6062d;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                throw new IllegalStateException(("no event down from " + this.f6062d + " in component " + this.f6063e.get()).toString());
            }
            this.f6062d = state;
            if (this.f6065g || this.f6064f != 0) {
                this.f6066h = true;
                return;
            }
            this.f6065g = true;
            o();
            this.f6065g = false;
            if (this.f6062d == Lifecycle.State.DESTROYED) {
                this.f6061c = new C0889a();
            }
        }
    }

    private final void l() {
        ArrayList arrayList = this.f6067i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(Lifecycle.State state) {
        this.f6067i.add(state);
    }

    private final void o() {
        m mVar = (m) this.f6063e.get();
        if (mVar != null) {
            while (!i()) {
                this.f6066h = false;
                Lifecycle.State state = this.f6062d;
                Map.Entry b4 = this.f6061c.b();
                o.b(b4);
                if (state.compareTo(((b) b4.getValue()).b()) < 0) {
                    d(mVar);
                }
                Map.Entry e4 = this.f6061c.e();
                if (!this.f6066h && e4 != null && this.f6062d.compareTo(((b) e4.getValue()).b()) > 0) {
                    g(mVar);
                }
            }
            this.f6066h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public void a(C0462l lVar) {
        m mVar;
        boolean z3;
        o.e(lVar, "observer");
        f("addObserver");
        Lifecycle.State state = this.f6062d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(lVar, state2);
        if (((b) this.f6061c.g(lVar, bVar)) == null && (mVar = (m) this.f6063e.get()) != null) {
            if (this.f6064f != 0 || this.f6065g) {
                z3 = true;
            } else {
                z3 = false;
            }
            Lifecycle.State e4 = e(lVar);
            this.f6064f++;
            while (bVar.b().compareTo(e4) < 0 && this.f6061c.contains(lVar)) {
                m(bVar.b());
                Lifecycle.Event c4 = Lifecycle.Event.Companion.c(bVar.b());
                if (c4 != null) {
                    bVar.a(mVar, c4);
                    l();
                    e4 = e(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
            if (!z3) {
                o();
            }
            this.f6064f--;
        }
    }

    public Lifecycle.State b() {
        return this.f6062d;
    }

    public void c(C0462l lVar) {
        o.e(lVar, "observer");
        f("removeObserver");
        this.f6061c.h(lVar);
    }

    public void h(Lifecycle.Event event) {
        o.e(event, "event");
        f("handleLifecycleEvent");
        k(event.getTargetState());
    }

    public void j(Lifecycle.State state) {
        o.e(state, "state");
        f("markState");
        n(state);
    }

    public void n(Lifecycle.State state) {
        o.e(state, "state");
        f("setCurrentState");
        k(state);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(m mVar) {
        this(mVar, true);
        o.e(mVar, "provider");
    }
}
