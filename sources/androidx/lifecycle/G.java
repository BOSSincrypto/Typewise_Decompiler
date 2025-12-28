package androidx.lifecycle;

import U.a;
import androidx.lifecycle.F;
import kotlin.jvm.internal.o;

public abstract /* synthetic */ class G {
    public static E a(F.b bVar, Class cls) {
        o.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static E b(F.b bVar, Class cls, a aVar) {
        o.e(cls, "modelClass");
        o.e(aVar, "extras");
        return bVar.a(cls);
    }
}
