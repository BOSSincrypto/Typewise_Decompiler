package kotlinx.serialization.json.internal;

import H2.f;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import z2.d;

public abstract class x {
    public static final JsonDecodingException a(Number number, String str, String str2) {
        o.e(number, "value");
        o.e(str, "key");
        o.e(str2, "output");
        return d(-1, l(number, str, str2));
    }

    public static final JsonEncodingException b(Number number, String str) {
        o.e(number, "value");
        o.e(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + j(str, 0, 1, (Object) null));
    }

    public static final JsonEncodingException c(f fVar) {
        o.e(fVar, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + fVar.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException d(int i4, String str) {
        o.e(str, "message");
        if (i4 >= 0) {
            str = "Unexpected JSON token at offset " + i4 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException e(int i4, String str, CharSequence charSequence) {
        o.e(str, "message");
        o.e(charSequence, "input");
        return d(i4, str + "\nJSON input: " + i(charSequence, i4));
    }

    public static final JsonDecodingException f(String str, String str2) {
        o.e(str, "key");
        o.e(str2, "input");
        return d(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + j(str2, 0, 1, (Object) null));
    }

    public static final Void g(C0762a aVar, String str) {
        o.e(aVar, "<this>");
        o.e(str, "entity");
        aVar.w("Trailing comma before the end of JSON " + str, aVar.f14379a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void h(C0762a aVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "object";
        }
        return g(aVar, str);
    }

    public static final CharSequence i(CharSequence charSequence, int i4) {
        String str;
        o.e(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i4 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return str2 + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i5 = i4 - 30;
        int i6 = i4 + 30;
        if (i5 <= 0) {
            str = "";
        } else {
            str = str2;
        }
        if (i6 >= charSequence.length()) {
            str2 = "";
        }
        return str + charSequence.subSequence(d.b(i5, 0), d.d(i6, charSequence.length())).toString() + str2;
    }

    public static /* synthetic */ CharSequence j(CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -1;
        }
        return i(charSequence, i4);
    }

    public static final Void k(C0762a aVar, Number number) {
        o.e(aVar, "<this>");
        o.e(number, "result");
        C0762a.x(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    private static final String l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + j(str2, 0, 1, (Object) null);
    }
}
