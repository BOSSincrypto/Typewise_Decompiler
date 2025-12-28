package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class d {

    /* renamed from: h  reason: collision with root package name */
    private static final Executor f6508h = new c();

    /* renamed from: a  reason: collision with root package name */
    private final n f6509a;

    /* renamed from: b  reason: collision with root package name */
    final c f6510b;

    /* renamed from: c  reason: collision with root package name */
    Executor f6511c;

    /* renamed from: d  reason: collision with root package name */
    private final List f6512d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List f6513e;

    /* renamed from: f  reason: collision with root package name */
    private List f6514f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    int f6515g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f6516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f6517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6518c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f6519d;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        class C0105a extends h.b {
            C0105a() {
            }

            public boolean a(int i4, int i5) {
                Object obj = a.this.f6516a.get(i4);
                Object obj2 = a.this.f6517b.get(i5);
                if (obj != null && obj2 != null) {
                    return d.this.f6510b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean b(int i4, int i5) {
                Object obj = a.this.f6516a.get(i4);
                Object obj2 = a.this.f6517b.get(i5);
                if (obj != null && obj2 != null) {
                    return d.this.f6510b.b().b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            public Object c(int i4, int i5) {
                Object obj = a.this.f6516a.get(i4);
                Object obj2 = a.this.f6517b.get(i5);
                if (obj != null && obj2 != null) {
                    return d.this.f6510b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            public int d() {
                return a.this.f6517b.size();
            }

            public int e() {
                return a.this.f6516a.size();
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.e f6522a;

            b(h.e eVar) {
                this.f6522a = eVar;
            }

            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f6515g == aVar.f6518c) {
                    dVar.c(aVar.f6517b, this.f6522a, aVar.f6519d);
                }
            }
        }

        a(List list, List list2, int i4, Runnable runnable) {
            this.f6516a = list;
            this.f6517b = list2;
            this.f6518c = i4;
            this.f6519d = runnable;
        }

        public void run() {
            d.this.f6511c.execute(new b(h.b(new C0105a())));
        }
    }

    public interface b {
        void a(List list, List list2);
    }

    private static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final Handler f6524a = new Handler(Looper.getMainLooper());

        c() {
        }

        public void execute(Runnable runnable) {
            this.f6524a.post(runnable);
        }
    }

    public d(n nVar, c cVar) {
        this.f6509a = nVar;
        this.f6510b = cVar;
        if (cVar.c() != null) {
            this.f6511c = cVar.c();
        } else {
            this.f6511c = f6508h;
        }
    }

    private void d(List list, Runnable runnable) {
        for (b a4 : this.f6512d) {
            a4.a(list, this.f6514f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b bVar) {
        this.f6512d.add(bVar);
    }

    public List b() {
        return this.f6514f;
    }

    /* access modifiers changed from: package-private */
    public void c(List list, h.e eVar, Runnable runnable) {
        List list2 = this.f6514f;
        this.f6513e = list;
        this.f6514f = Collections.unmodifiableList(list);
        eVar.b(this.f6509a);
        d(list2, runnable);
    }

    public void e(List list) {
        f(list, (Runnable) null);
    }

    public void f(List list, Runnable runnable) {
        int i4 = this.f6515g + 1;
        this.f6515g = i4;
        List list2 = this.f6513e;
        if (list != list2) {
            List list3 = this.f6514f;
            if (list == null) {
                int size = list2.size();
                this.f6513e = null;
                this.f6514f = Collections.emptyList();
                this.f6509a.a(0, size);
                d(list3, runnable);
            } else if (list2 == null) {
                this.f6513e = list;
                this.f6514f = Collections.unmodifiableList(list);
                this.f6509a.c(0, list.size());
                d(list3, runnable);
            } else {
                this.f6510b.a().execute(new a(list2, list, i4, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
