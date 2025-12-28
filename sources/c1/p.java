package c1;

import androidx.core.util.d;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final r f7580a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7581b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map f7582a = new HashMap();

        /* renamed from: c1.p$a$a  reason: collision with other inner class name */
        private static class C0126a {

            /* renamed from: a  reason: collision with root package name */
            final List f7583a;

            public C0126a(List list) {
                this.f7583a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f7582a.clear();
        }

        public List b(Class cls) {
            C0126a aVar = (C0126a) this.f7582a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f7583a;
        }

        public void c(Class cls, List list) {
            if (((C0126a) this.f7582a.put(cls, new C0126a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public p(d dVar) {
        this(new r(dVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List b4;
        b4 = this.f7581b.b(cls);
        if (b4 == null) {
            b4 = Collections.unmodifiableList(this.f7580a.e(cls));
            this.f7581b.c(cls, b4);
        }
        return b4;
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f7580a.b(cls, cls2, oVar);
        this.f7581b.a();
    }

    public synchronized List c(Class cls) {
        return this.f7580a.g(cls);
    }

    public List d(Object obj) {
        List e4 = e(b(obj));
        if (!e4.isEmpty()) {
            int size = e4.size();
            List emptyList = Collections.emptyList();
            boolean z3 = true;
            for (int i4 = 0; i4 < size; i4++) {
                n nVar = (n) e4.get(i4);
                if (nVar.b(obj)) {
                    if (z3) {
                        emptyList = new ArrayList(size - i4);
                        z3 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(obj, (List<n>) e4);
        }
        throw new Registry.NoModelLoaderAvailableException(obj);
    }

    private p(r rVar) {
        this.f7581b = new a();
        this.f7580a = rVar;
    }
}
