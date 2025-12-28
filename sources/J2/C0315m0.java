package J2;

import A2.c;
import H2.f;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* renamed from: J2.m0  reason: case insensitive filesystem */
public abstract class C0315m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f[] f719a = new f[0];

    public static final Set a(f fVar) {
        o.e(fVar, "<this>");
        if (fVar instanceof C0314m) {
            return ((C0314m) fVar).f();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int d4 = fVar.d();
        for (int i4 = 0; i4 < d4; i4++) {
            hashSet.add(fVar.e(i4));
        }
        return hashSet;
    }

    public static final f[] b(List list) {
        f[] fVarArr;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            list = null;
        }
        if (list == null || (fVarArr = (f[]) list.toArray(new f[0])) == null) {
            return f719a;
        }
        return fVarArr;
    }

    public static final String c(c cVar) {
        o.e(cVar, "<this>");
        String b4 = cVar.b();
        if (b4 == null) {
            b4 = "<local class name not available>";
        }
        return d(b4);
    }

    public static final String d(String str) {
        o.e(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }
}
