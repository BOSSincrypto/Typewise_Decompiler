package l1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List f14537a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map f14538b = new HashMap();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f14539a;

        /* renamed from: b  reason: collision with root package name */
        final Class f14540b;

        /* renamed from: c  reason: collision with root package name */
        final X0.e f14541c;

        public a(Class cls, Class cls2, X0.e eVar) {
            this.f14539a = cls;
            this.f14540b = cls2;
            this.f14541c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            if (!this.f14539a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f14540b)) {
                return false;
            }
            return true;
        }
    }

    private synchronized List c(String str) {
        List list;
        try {
            if (!this.f14537a.contains(str)) {
                this.f14537a.add(str);
            }
            list = (List) this.f14538b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f14538b.put(str, list);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return list;
    }

    public synchronized void a(String str, X0.e eVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, eVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f14537a) {
            List<a> list = (List) this.f14538b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f14541c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f14537a) {
            List<a> list = (List) this.f14538b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f14540b)) {
                        arrayList.add(aVar.f14540b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList<>(this.f14537a);
            this.f14537a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f14537a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f14537a.add(str);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
