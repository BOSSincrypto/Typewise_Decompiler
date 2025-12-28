package c1;

import androidx.core.util.d;
import c1.n;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p1.k;

public class r {

    /* renamed from: e  reason: collision with root package name */
    private static final c f7593e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final n f7594f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List f7595a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7596b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f7597c;

    /* renamed from: d  reason: collision with root package name */
    private final d f7598d;

    private static class a implements n {
        a() {
        }

        public n.a a(Object obj, int i4, int i5, X0.d dVar) {
            return null;
        }

        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Class f7599a;

        /* renamed from: b  reason: collision with root package name */
        final Class f7600b;

        /* renamed from: c  reason: collision with root package name */
        final o f7601c;

        public b(Class cls, Class cls2, o oVar) {
            this.f7599a = cls;
            this.f7600b = cls2;
            this.f7601c = oVar;
        }

        public boolean a(Class cls) {
            return this.f7599a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            if (!a(cls) || !this.f7600b.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }
    }

    static class c {
        c() {
        }

        public q a(List list, d dVar) {
            return new q(list, dVar);
        }
    }

    public r(d dVar) {
        this(dVar, f7593e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z3) {
        int i4;
        b bVar = new b(cls, cls2, oVar);
        List list = this.f7595a;
        if (z3) {
            i4 = list.size();
        } else {
            i4 = 0;
        }
        list.add(i4, bVar);
    }

    private n c(b bVar) {
        return (n) k.d(bVar.f7601c.c(this));
    }

    private static n f() {
        return f7594f;
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z3 = false;
            for (b bVar : this.f7595a) {
                if (this.f7597c.contains(bVar)) {
                    z3 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f7597c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f7597c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f7596b.a(arrayList, this.f7598d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z3) {
                return f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f7597c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f7595a) {
                if (!this.f7597c.contains(bVar)) {
                    if (bVar.a(cls)) {
                        this.f7597c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f7597c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f7597c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f7595a) {
            if (!arrayList.contains(bVar.f7600b) && bVar.a(cls)) {
                arrayList.add(bVar.f7600b);
            }
        }
        return arrayList;
    }

    r(d dVar, c cVar) {
        this.f7595a = new ArrayList();
        this.f7597c = new HashSet();
        this.f7598d = dVar;
        this.f7596b = cVar;
    }
}
