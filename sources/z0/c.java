package Z0;

import java.util.Queue;
import p1.l;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f2148a = l.e(20);

    c() {
    }

    /* access modifiers changed from: package-private */
    public abstract m a();

    /* access modifiers changed from: package-private */
    public m b() {
        m mVar = (m) this.f2148a.poll();
        if (mVar == null) {
            return a();
        }
        return mVar;
    }

    public void c(m mVar) {
        if (this.f2148a.size() < 20) {
            this.f2148a.offer(mVar);
        }
    }
}
