package c1;

import X0.b;
import androidx.core.util.d;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p1.k;

class q implements n {

    /* renamed from: a  reason: collision with root package name */
    private final List f7584a;

    /* renamed from: b  reason: collision with root package name */
    private final d f7585b;

    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: a  reason: collision with root package name */
        private final List f7586a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.util.d f7587b;

        /* renamed from: c  reason: collision with root package name */
        private int f7588c = 0;

        /* renamed from: d  reason: collision with root package name */
        private Priority f7589d;

        /* renamed from: e  reason: collision with root package name */
        private d.a f7590e;

        /* renamed from: f  reason: collision with root package name */
        private List f7591f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f7592g;

        a(List list, androidx.core.util.d dVar) {
            this.f7587b = dVar;
            k.c(list);
            this.f7586a = list;
        }

        private void g() {
            if (!this.f7592g) {
                if (this.f7588c < this.f7586a.size() - 1) {
                    this.f7588c++;
                    f(this.f7589d, this.f7590e);
                    return;
                }
                k.d(this.f7591f);
                this.f7590e.c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f7591f)));
            }
        }

        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f7586a.get(0)).a();
        }

        public void b() {
            List list = this.f7591f;
            if (list != null) {
                this.f7587b.a(list);
            }
            this.f7591f = null;
            for (com.bumptech.glide.load.data.d b4 : this.f7586a) {
                b4.b();
            }
        }

        public void c(Exception exc) {
            ((List) k.d(this.f7591f)).add(exc);
            g();
        }

        public void cancel() {
            this.f7592g = true;
            for (com.bumptech.glide.load.data.d cancel : this.f7586a) {
                cancel.cancel();
            }
        }

        public void d(Object obj) {
            if (obj != null) {
                this.f7590e.d(obj);
            } else {
                g();
            }
        }

        public DataSource e() {
            return ((com.bumptech.glide.load.data.d) this.f7586a.get(0)).e();
        }

        public void f(Priority priority, d.a aVar) {
            this.f7589d = priority;
            this.f7590e = aVar;
            this.f7591f = (List) this.f7587b.b();
            ((com.bumptech.glide.load.data.d) this.f7586a.get(this.f7588c)).f(priority, this);
            if (this.f7592g) {
                cancel();
            }
        }
    }

    q(List list, androidx.core.util.d dVar) {
        this.f7584a = list;
        this.f7585b = dVar;
    }

    public n.a a(Object obj, int i4, int i5, X0.d dVar) {
        n.a a4;
        int size = this.f7584a.size();
        ArrayList arrayList = new ArrayList(size);
        b bVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            n nVar = (n) this.f7584a.get(i6);
            if (nVar.b(obj) && (a4 = nVar.a(obj, i4, i5, dVar)) != null) {
                bVar = a4.f7577a;
                arrayList.add(a4.f7579c);
            }
        }
        if (arrayList.isEmpty() || bVar == null) {
            return null;
        }
        return new n.a(bVar, new a(arrayList, this.f7585b));
    }

    public boolean b(Object obj) {
        for (n b4 : this.f7584a) {
            if (b4.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f7584a.toArray()) + '}';
    }
}
