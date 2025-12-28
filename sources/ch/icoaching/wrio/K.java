package ch.icoaching.wrio;

import java.util.List;
import kotlin.collections.C0718m;

public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    private static final List f9038a;

    /* renamed from: b  reason: collision with root package name */
    private static final List f9039b;

    static {
        Double valueOf = Double.valueOf(0.4d);
        Double valueOf2 = Double.valueOf(0.7d);
        Double valueOf3 = Double.valueOf(1.0d);
        f9038a = C0718m.m(valueOf, valueOf2, valueOf3);
        f9039b = C0718m.m(valueOf, valueOf2, valueOf3);
    }

    public static final List a() {
        return f9038a;
    }

    public static final List b() {
        return f9039b;
    }
}
