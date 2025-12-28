package U;

import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import kotlin.jvm.internal.o;

public final class b implements F.b {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f1485a;

    public b(f... fVarArr) {
        o.e(fVarArr, "initializers");
        this.f1485a = fVarArr;
    }

    public /* synthetic */ E a(Class cls) {
        return G.a(this, cls);
    }

    public E b(Class cls, a aVar) {
        o.e(cls, "modelClass");
        o.e(aVar, "extras");
        E e4 = null;
        for (f fVar : this.f1485a) {
            if (o.a(fVar.a(), cls)) {
                Object invoke = fVar.b().invoke(aVar);
                if (invoke instanceof E) {
                    e4 = (E) invoke;
                } else {
                    e4 = null;
                }
            }
        }
        if (e4 != null) {
            return e4;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
