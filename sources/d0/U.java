package D0;

import E0.s;
import ch.icoaching.typewise.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import u2.l;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public static final U f249a = new U();

    /* renamed from: b  reason: collision with root package name */
    private static final Regex f250b = new Regex("(.*filtprob)(\\d.\\d*)");

    /* renamed from: c  reason: collision with root package name */
    private static final Regex f251c = new Regex("(.*filtshorter)(\\d*)");

    /* renamed from: d  reason: collision with root package name */
    private static final Regex f252d = new Regex("(.*filtscore)(\\d.\\d*)");

    /* renamed from: e  reason: collision with root package name */
    private static final Regex f253e = new Regex("(.*alpha)([-]?\\d.\\d*)");

    private U() {
    }

    public static /* synthetic */ int a(U u3, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        return u3.b(str, i4);
    }

    public final int b(String str, int i4) {
        o.e(str, "inferenceStringDeclaration");
        if (!kotlin.text.o.L(str, "multiword", false, 2, (Object) null)) {
            if (kotlin.text.o.L(str, "greedy", false, 2, (Object) null)) {
                e.l(e.f8233a, "InferenceSettingsHelpers", "extractNumberOfMultiwordsFromInferenceStringDeclaration() :: Using only one word in the inference for greedy decoding, is this correct?", (Throwable) null, 4, (Object) null);
            }
            return i4;
        }
        String str2 = (String) kotlin.text.o.t0(s.o(str, kotlin.text.o.V(str, "multiword", 0, false, 6, (Object) null) + 9, (Integer) null, 2, (Object) null), new String[]{"-"}, false, 0, 6, (Object) null).get(0);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < str2.length(); i5++) {
            char charAt = str2.charAt(i5);
            if (Character.isDigit(charAt)) {
                arrayList.add(Character.valueOf(charAt));
            }
        }
        try {
            return Integer.parseInt(C0718m.Z(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        } catch (Exception e4) {
            throw new IllegalArgumentException("Incorrect number of desired words for multi-word inference.\nInference declaration string: " + str, e4);
        }
    }

    public final boolean c(String str) {
        o.e(str, "stringDeclaration");
        return kotlin.text.o.L(str, "filtafternames", false, 2, (Object) null);
    }

    public final Float d(String str) {
        List a4;
        String str2;
        o.e(str, "stringDeclaration");
        kotlin.text.l find$default = Regex.find$default(f250b, str, 0, 2, (Object) null);
        if (find$default == null || (a4 = find$default.a()) == null || (str2 = (String) a4.get(2)) == null) {
            return null;
        }
        return kotlin.text.o.k(str2);
    }

    public final boolean e(String str) {
        o.e(str, "inferenceStringDeclaration");
        return kotlin.text.o.L(str, "filtrepeatedwords", false, 2, (Object) null);
    }

    public final Integer f(String str) {
        List a4;
        String str2;
        o.e(str, "stringDeclaration");
        kotlin.text.l find$default = Regex.find$default(f251c, str, 0, 2, (Object) null);
        if (find$default == null || (a4 = find$default.a()) == null || (str2 = (String) a4.get(2)) == null) {
            return null;
        }
        return kotlin.text.o.m(str2);
    }

    public final Float g(String str) {
        List a4;
        String str2;
        o.e(str, "stringDeclaration");
        kotlin.text.l find$default = Regex.find$default(f252d, str, 0, 2, (Object) null);
        if (find$default == null || (a4 = find$default.a()) == null || (str2 = (String) a4.get(2)) == null) {
            return null;
        }
        return kotlin.text.o.k(str2);
    }
}
