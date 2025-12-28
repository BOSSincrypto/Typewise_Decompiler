package j1;

import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List f13754a = new ArrayList();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Class f13755a;

        /* renamed from: b  reason: collision with root package name */
        final Class f13756b;

        /* renamed from: c  reason: collision with root package name */
        final e f13757c;

        a(Class cls, Class cls2, e eVar) {
            this.f13755a = cls;
            this.f13756b = cls2;
            this.f13757c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            if (!this.f13755a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f13756b)) {
                return false;
            }
            return true;
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f13754a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f13757c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f13754a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f13756b)) {
                arrayList.add(aVar.f13756b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f13754a.add(new a(cls, cls2, eVar));
    }
}
