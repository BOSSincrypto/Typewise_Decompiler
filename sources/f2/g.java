package F2;

import I2.c;
import I2.f;
import J2.C0292b;
import J2.C0294c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;

public abstract class g {
    public static final a a(C0292b bVar, c cVar, String str) {
        o.e(bVar, "<this>");
        o.e(cVar, "decoder");
        a h4 = bVar.h(cVar, str);
        if (h4 != null) {
            return h4;
        }
        C0294c.b(str, bVar.j());
        throw new KotlinNothingValueException();
    }

    public static final n b(C0292b bVar, f fVar, Object obj) {
        o.e(bVar, "<this>");
        o.e(fVar, "encoder");
        o.e(obj, "value");
        n i4 = bVar.i(fVar, obj);
        if (i4 != null) {
            return i4;
        }
        C0294c.a(r.b(obj.getClass()), bVar.j());
        throw new KotlinNothingValueException();
    }
}
