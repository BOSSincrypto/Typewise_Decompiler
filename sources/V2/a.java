package V2;

import c3.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.s;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0029a f1619c = new C0029a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f1620a;

    /* renamed from: b  reason: collision with root package name */
    private long f1621b = 262144;

    /* renamed from: V2.a$a  reason: collision with other inner class name */
    public static final class C0029a {
        public /* synthetic */ C0029a(i iVar) {
            this();
        }

        private C0029a() {
        }
    }

    public a(d dVar) {
        o.e(dVar, "source");
        this.f1620a = dVar;
    }

    public final s a() {
        s.a aVar = new s.a();
        while (true) {
            String b4 = b();
            if (b4.length() == 0) {
                return aVar.f();
            }
            aVar.c(b4);
        }
    }

    public final String b() {
        String T3 = this.f1620a.T(this.f1621b);
        this.f1621b -= (long) T3.length();
        return T3;
    }
}
