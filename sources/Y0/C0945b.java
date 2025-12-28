package y0;

import E0.s;
import ch.icoaching.typewise.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.l;

/* renamed from: y0.b  reason: case insensitive filesystem */
public abstract class C0945b {

    /* renamed from: a  reason: collision with root package name */
    private static final Regex f16454a = new Regex(".*alpha([-]?\\d.\\d*)");

    public static final float a(String str, float f4) {
        o.e(str, "strDeclaration");
        l find$default = Regex.find$default(f16454a, str, 0, 2, (Object) null);
        if (find$default != null) {
            f4 = Float.parseFloat((String) find$default.a().get(1));
        }
        if (f4 == 0.0f) {
            e.l(e.f8233a, "PythonUtils", "*** Attention, alpha = 0.0. Is this the desired behaviour?", (Throwable) null, 4, (Object) null);
        }
        return f4;
    }

    public static /* synthetic */ float b(String str, float f4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = 1.0f;
        }
        return a(str, f4);
    }

    public static final String c(String str, List list) {
        o.e(str, "key");
        o.e(list, "splits");
        String str2 = str + "=";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (kotlin.text.o.G(str3, str2, false, 2, (Object) null)) {
                return s.o(str3, str2.length(), (Integer) null, 2, (Object) null);
            }
        }
        throw new Exception("File is not abiding to 2022 naming convention, not found key '" + str + "'.");
    }
}
