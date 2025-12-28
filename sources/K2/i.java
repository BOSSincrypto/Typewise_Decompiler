package K2;

import G2.a;
import H2.f;
import J2.H;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.M;
import kotlinx.serialization.json.internal.P;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final f f855a = H.a("kotlinx.serialization.json.JsonUnquotedLiteral", a.E(u.f13912a));

    public static final D a(String str) {
        if (str == null) {
            return y.INSTANCE;
        }
        return new u(str, true, (f) null, 4, (kotlin.jvm.internal.i) null);
    }

    private static final Void b(h hVar, String str) {
        throw new IllegalArgumentException("Element " + r.b(hVar.getClass()) + " is not a " + str);
    }

    public static final Boolean c(D d4) {
        o.e(d4, "<this>");
        return P.d(d4.b());
    }

    public static final String d(D d4) {
        o.e(d4, "<this>");
        if (d4 instanceof y) {
            return null;
        }
        return d4.b();
    }

    public static final double e(D d4) {
        o.e(d4, "<this>");
        return Double.parseDouble(d4.b());
    }

    public static final float f(D d4) {
        o.e(d4, "<this>");
        return Float.parseFloat(d4.b());
    }

    public static final int g(D d4) {
        o.e(d4, "<this>");
        try {
            long m4 = new M(d4.b()).m();
            if (-2147483648L <= m4 && m4 <= 2147483647L) {
                return (int) m4;
            }
            throw new NumberFormatException(d4.b() + " is not an Int");
        } catch (JsonDecodingException e4) {
            throw new NumberFormatException(e4.getMessage());
        }
    }

    public static final D h(h hVar) {
        D d4;
        o.e(hVar, "<this>");
        if (hVar instanceof D) {
            d4 = (D) hVar;
        } else {
            d4 = null;
        }
        if (d4 != null) {
            return d4;
        }
        b(hVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final f i() {
        return f855a;
    }

    public static final long j(D d4) {
        o.e(d4, "<this>");
        try {
            return new M(d4.b()).m();
        } catch (JsonDecodingException e4) {
            throw new NumberFormatException(e4.getMessage());
        }
    }
}
