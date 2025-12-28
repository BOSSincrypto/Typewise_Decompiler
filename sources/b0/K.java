package B0;

import K2.C0341a;
import android.content.Context;
import kotlin.jvm.internal.o;
import t0.c;

public final class K implements z {

    /* renamed from: a  reason: collision with root package name */
    private final Context f75a;

    /* renamed from: b  reason: collision with root package name */
    private final H f76b;

    public K(Context context, H h4) {
        o.e(context, "context");
        o.e(h4, "urls");
        this.f75a = context;
        this.f76b = h4;
    }

    public J a() {
        String b4 = this.f76b.b(this.f75a);
        C0341a c4 = c.f16361a.c();
        c4.a();
        return (J) c4.c(J.f69c.serializer(), b4);
    }
}
