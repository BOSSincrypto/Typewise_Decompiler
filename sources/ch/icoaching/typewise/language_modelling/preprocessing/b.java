package ch.icoaching.typewise.language_modelling.preprocessing;

import D0.Q;
import D0.h0;
import ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public abstract class b {
    public static final Object a(h0.e eVar, Q q4, c cVar) {
        Object obj;
        String d4 = eVar.d();
        if (o.a(d4, "character")) {
            if (eVar.e() != null && eVar.f() != null) {
                PreprocessingCharTW.Companion companion = PreprocessingCharTW.f8767z;
                String h4 = eVar.h();
                o.b(h4);
                String k4 = eVar.k();
                o.b(k4);
                String i4 = eVar.i();
                o.b(i4);
                String j4 = eVar.j();
                o.b(j4);
                String a4 = eVar.a();
                o.b(a4);
                String g4 = eVar.g();
                o.b(g4);
                obj = companion.b(d4, h4, k4, i4, j4, a4, g4, eVar.e().booleanValue(), eVar.f().booleanValue(), q4, cVar);
                if (obj == a.f()) {
                    return obj;
                }
            } else if (eVar.e() != null && eVar.f() == null) {
                PreprocessingCharTW.Companion companion2 = PreprocessingCharTW.f8767z;
                String h5 = eVar.h();
                o.b(h5);
                String k5 = eVar.k();
                o.b(k5);
                String i5 = eVar.i();
                o.b(i5);
                String j5 = eVar.j();
                o.b(j5);
                String a5 = eVar.a();
                o.b(a5);
                String g5 = eVar.g();
                o.b(g5);
                obj = PreprocessingCharTW.Companion.a(companion2, d4, h5, k5, i5, j5, a5, g5, eVar.e().booleanValue(), false, q4, cVar, 256, (Object) null);
                if (obj == a.f()) {
                    return obj;
                }
            } else if (eVar.e() != null || eVar.f() == null) {
                PreprocessingCharTW.Companion companion3 = PreprocessingCharTW.f8767z;
                String h6 = eVar.h();
                o.b(h6);
                String k6 = eVar.k();
                o.b(k6);
                String i6 = eVar.i();
                o.b(i6);
                String j6 = eVar.j();
                o.b(j6);
                String a6 = eVar.a();
                o.b(a6);
                String g6 = eVar.g();
                o.b(g6);
                obj = PreprocessingCharTW.Companion.a(companion3, d4, h6, k6, i6, j6, a6, g6, false, false, q4, cVar, 384, (Object) null);
                if (obj == a.f()) {
                    return obj;
                }
            } else {
                PreprocessingCharTW.Companion companion4 = PreprocessingCharTW.f8767z;
                String h7 = eVar.h();
                o.b(h7);
                String k7 = eVar.k();
                o.b(k7);
                String i7 = eVar.i();
                o.b(i7);
                String j7 = eVar.j();
                o.b(j7);
                String a7 = eVar.a();
                o.b(a7);
                String g7 = eVar.g();
                o.b(g7);
                obj = PreprocessingCharTW.Companion.a(companion4, d4, h7, k7, i7, j7, a7, g7, false, eVar.f().booleanValue(), q4, cVar, Uuid.SIZE_BITS, (Object) null);
                if (obj == a.f()) {
                    return obj;
                }
            }
            return (a) obj;
        }
        throw new Exception("Unknown level (class) of preprocessing '" + d4 + "', please declare it correctly in the preprocessing part of the config.json.");
    }
}
