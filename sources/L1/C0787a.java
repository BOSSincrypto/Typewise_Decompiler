package l1;

import X0.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l1.a  reason: case insensitive filesystem */
public class C0787a {

    /* renamed from: a  reason: collision with root package name */
    private final List f14528a = new ArrayList();

    /* renamed from: l1.a$a  reason: collision with other inner class name */
    private static final class C0205a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f14529a;

        /* renamed from: b  reason: collision with root package name */
        final a f14530b;

        C0205a(Class cls, a aVar) {
            this.f14529a = cls;
            this.f14530b = aVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class cls) {
            return this.f14529a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, a aVar) {
        this.f14528a.add(new C0205a(cls, aVar));
    }

    public synchronized a b(Class cls) {
        for (C0205a aVar : this.f14528a) {
            if (aVar.a(cls)) {
                return aVar.f14530b;
            }
        }
        return null;
    }
}
