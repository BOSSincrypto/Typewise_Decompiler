package m0;

import androidx.work.impl.F;
import java.util.List;

public abstract class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.a f14628a = androidx.work.impl.utils.futures.a.t();

    class a extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F f14629b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f14630c;

        a(F f4, String str) {
            this.f14629b = f4;
            this.f14630c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public List c() {
            return (List) l0.v.f14469w.a(this.f14629b.u().J().t(this.f14630c));
        }
    }

    public static v a(F f4, String str) {
        return new a(f4, str);
    }

    public X1.a b() {
        return this.f14628a;
    }

    /* access modifiers changed from: package-private */
    public abstract Object c();

    public void run() {
        try {
            this.f14628a.p(c());
        } catch (Throwable th) {
            this.f14628a.q(th);
        }
    }
}
