package U2;

import c3.d;
import kotlin.jvm.internal.o;
import okhttp3.B;
import okhttp3.v;

public final class h extends B {

    /* renamed from: b  reason: collision with root package name */
    private final String f1525b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1526c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1527d;

    public h(String str, long j4, d dVar) {
        o.e(dVar, "source");
        this.f1525b = str;
        this.f1526c = j4;
        this.f1527d = dVar;
    }

    public long e() {
        return this.f1526c;
    }

    public v f() {
        String str = this.f1525b;
        if (str == null) {
            return null;
        }
        return v.f15509e.b(str);
    }

    public d m() {
        return this.f1527d;
    }
}
