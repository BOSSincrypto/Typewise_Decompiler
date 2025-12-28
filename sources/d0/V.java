package D0;

import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    private final String f254a;

    /* renamed from: b  reason: collision with root package name */
    private final String f255b;

    public V(String str, String str2) {
        o.e(str, "kind");
        o.e(str2, "uniqueIdentifier");
        this.f254a = str;
        this.f255b = str2;
    }

    public abstract Object a(String str, c cVar);

    public abstract Object b(c cVar);

    public final String c() {
        return this.f255b;
    }

    public abstract String d();
}
