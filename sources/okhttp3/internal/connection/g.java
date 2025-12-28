package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;
import okhttp3.C;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Set f15404a = new LinkedHashSet();

    public final synchronized void a(C c4) {
        o.e(c4, "route");
        this.f15404a.remove(c4);
    }

    public final synchronized void b(C c4) {
        o.e(c4, "failedRoute");
        this.f15404a.add(c4);
    }

    public final synchronized boolean c(C c4) {
        o.e(c4, "route");
        return this.f15404a.contains(c4);
    }
}
