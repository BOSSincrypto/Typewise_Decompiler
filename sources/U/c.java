package U;

import androidx.lifecycle.F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import t2.C0900a;
import u2.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List f1486a = new ArrayList();

    public final void a(A2.c cVar, l lVar) {
        o.e(cVar, "clazz");
        o.e(lVar, "initializer");
        this.f1486a.add(new f(C0900a.a(cVar), lVar));
    }

    public final F.b b() {
        f[] fVarArr = (f[]) this.f1486a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
