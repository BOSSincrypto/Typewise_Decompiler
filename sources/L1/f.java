package l1;

import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List f14542a = new ArrayList();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f14543a;

        /* renamed from: b  reason: collision with root package name */
        final X0.f f14544b;

        a(Class cls, X0.f fVar) {
            this.f14543a = cls;
            this.f14544b = fVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class cls) {
            return this.f14543a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, X0.f fVar) {
        this.f14542a.add(new a(cls, fVar));
    }

    public synchronized X0.f b(Class cls) {
        int size = this.f14542a.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) this.f14542a.get(i4);
            if (aVar.a(cls)) {
                return aVar.f14544b;
            }
        }
        return null;
    }
}
