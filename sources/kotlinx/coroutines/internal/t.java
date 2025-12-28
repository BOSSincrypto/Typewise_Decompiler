package kotlinx.coroutines.internal;

import kotlinx.coroutines.F;

public abstract class t {
    public abstract C0744d a();

    public final boolean b(t tVar) {
        C0744d a4;
        C0744d a5 = a();
        if (a5 == null || (a4 = tVar.a()) == null || a5.g() >= a4.g()) {
            return false;
        }
        return true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return F.a(this) + '@' + F.b(this);
    }
}
