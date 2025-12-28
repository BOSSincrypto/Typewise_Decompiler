package D0;

import android.content.Context;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* renamed from: D0.b  reason: case insensitive filesystem */
public final class C0266b implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f262a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f263b;

    public C0266b(Context context, f0 f0Var) {
        o.e(context, "context");
        o.e(f0Var, "urls");
        this.f262a = context;
        this.f263b = f0Var;
    }

    public String a() {
        return "resources";
    }

    public final ByteBuffer b(String str) {
        o.e(str, "path");
        return this.f263b.a(this.f262a, str);
    }
}
