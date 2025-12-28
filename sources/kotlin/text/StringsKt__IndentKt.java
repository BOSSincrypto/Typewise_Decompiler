package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.l;

abstract class StringsKt__IndentKt extends p {
    private static final l b(String str) {
        if (str.length() == 0) {
            return StringsKt__IndentKt$getIndentFunction$1.INSTANCE;
        }
        return new StringsKt__IndentKt$getIndentFunction$2(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (!C0721a.d(str.charAt(i4))) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return str.length();
        }
        return i4;
    }

    public static final String d(String str, String str2) {
        int i4;
        String str3;
        o.e(str, "<this>");
        o.e(str2, "newIndent");
        List e02 = StringsKt__StringsKt.e0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : e02) {
            if (!o.X((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C0718m.t(arrayList, 10));
        for (String c4 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c4)));
        }
        Integer num = (Integer) C0718m.g0(arrayList2);
        int i5 = 0;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        int length = str.length() + (str2.length() * e02.size());
        l b4 = b(str2);
        int l4 = C0718m.l(e02);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : e02) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                C0718m.s();
            }
            String str4 = (String) next2;
            if ((i5 == 0 || i5 == l4) && o.X(str4)) {
                str4 = null;
            } else {
                String Q02 = o.Q0(str4, i4);
                if (!(Q02 == null || (str3 = (String) b4.invoke(Q02)) == null)) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i5 = i6;
        }
        String sb = ((StringBuilder) C0718m.X(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
        o.d(sb, "toString(...)");
        return sb;
    }

    public static final String e(String str, String str2, String str3) {
        int i4;
        String str4;
        o.e(str, "<this>");
        o.e(str2, "newIndent");
        o.e(str3, "marginPrefix");
        if (!o.X(str3)) {
            List e02 = StringsKt__StringsKt.e0(str);
            int length = str.length() + (str2.length() * e02.size());
            l b4 = b(str2);
            int l4 = C0718m.l(e02);
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            for (Object next : e02) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    C0718m.s();
                }
                String str5 = (String) next;
                String str6 = null;
                if ((i5 == 0 || i5 == l4) && o.X(str5)) {
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length2) {
                            i4 = -1;
                            break;
                        } else if (!C0721a.d(str5.charAt(i7))) {
                            i4 = i7;
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i4 != -1) {
                        int i8 = i4;
                        if (o.F(str5, str3, i4, false, 4, (Object) null)) {
                            o.c(str5, "null cannot be cast to non-null type java.lang.String");
                            str6 = str5.substring(i8 + str3.length());
                            o.d(str6, "substring(...)");
                        }
                    }
                    if (!(str6 == null || (str4 = (String) b4.invoke(str6)) == null)) {
                        str5 = str4;
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i5 = i6;
            }
            String sb = ((StringBuilder) C0718m.X(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
            o.d(sb, "toString(...)");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static String f(String str) {
        o.e(str, "<this>");
        return d(str, "");
    }

    public static String g(String str, String str2) {
        o.e(str, "<this>");
        o.e(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "|";
        }
        return o.g(str, str2);
    }
}
