package okhttp3;

import Q2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.g;
import p2.C0854c;
import v2.C0925a;

public final class s implements Iterable, C0925a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f15485b = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String[] f15486a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f15487a = new ArrayList(20);

        public final a a(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            b bVar = s.f15485b;
            bVar.d(str);
            bVar.e(str2, str);
            d(str, str2);
            return this;
        }

        public final a b(s sVar) {
            o.e(sVar, "headers");
            int size = sVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                d(sVar.c(i4), sVar.f(i4));
            }
            return this;
        }

        public final a c(String str) {
            o.e(str, "line");
            int U3 = kotlin.text.o.U(str, ':', 1, false, 4, (Object) null);
            if (U3 != -1) {
                String substring = str.substring(0, U3);
                o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(U3 + 1);
                o.d(substring2, "this as java.lang.String).substring(startIndex)");
                d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                o.d(substring3, "this as java.lang.String).substring(startIndex)");
                d("", substring3);
            } else {
                d("", str);
            }
            return this;
        }

        public final a d(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            g().add(str);
            g().add(kotlin.text.o.M0(str2).toString());
            return this;
        }

        public final a e(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            s.f15485b.d(str);
            d(str, str2);
            return this;
        }

        public final s f() {
            Object[] array = this.f15487a.toArray(new String[0]);
            if (array != null) {
                return new s((String[]) array, (i) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final List g() {
            return this.f15487a;
        }

        public final a h(String str) {
            o.e(str, "name");
            int i4 = 0;
            while (i4 < g().size()) {
                if (kotlin.text.o.v(str, (String) g().get(i4), true)) {
                    g().remove(i4);
                    g().remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        public final a i(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            b bVar = s.f15485b;
            bVar.d(str);
            bVar.e(str2, str);
            h(str);
            d(str, str2);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    char charAt = str.charAt(i4);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i4), str).toString());
                    }
                    i4 = i5;
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }

        /* access modifiers changed from: private */
        public final void e(String str, String str2) {
            String str3;
            int length = str.length();
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                char charAt = str.charAt(i4);
                if (charAt == 9 || (' ' <= charAt && charAt < 127)) {
                    i4 = i5;
                } else {
                    String t4 = d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i4), str2);
                    if (d.G(str2)) {
                        str3 = "";
                    } else {
                        str3 = o.k(": ", str);
                    }
                    throw new IllegalArgumentException(o.k(t4, str3).toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int b4 = C0854c.b(length, 0, -2);
            if (b4 > length) {
                return null;
            }
            while (true) {
                int i4 = length - 2;
                if (kotlin.text.o.v(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == b4) {
                    return null;
                }
                length = i4;
            }
        }

        public final s g(String... strArr) {
            o.e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = i5 + 1;
                    String str = strArr2[i5];
                    if (str != null) {
                        strArr2[i5] = kotlin.text.o.M0(str).toString();
                        i5 = i6;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int b4 = C0854c.b(0, strArr2.length - 1, 2);
                if (b4 >= 0) {
                    while (true) {
                        int i7 = i4 + 2;
                        String str2 = strArr2[i4];
                        String str3 = strArr2[i4 + 1];
                        d(str2);
                        e(str3, str2);
                        if (i4 == b4) {
                            break;
                        }
                        i4 = i7;
                    }
                }
                return new s(strArr2, (i) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }

        private b() {
        }
    }

    public /* synthetic */ s(String[] strArr, i iVar) {
        this(strArr);
    }

    public static final s e(String... strArr) {
        return f15485b.g(strArr);
    }

    public final String b(String str) {
        o.e(str, "name");
        return f15485b.f(this.f15486a, str);
    }

    public final String c(int i4) {
        return this.f15486a[i4 * 2];
    }

    public final a d() {
        a aVar = new a();
        C0718m.A(aVar.g(), this.f15486a);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s) || !Arrays.equals(this.f15486a, ((s) obj).f15486a)) {
            return false;
        }
        return true;
    }

    public final String f(int i4) {
        return this.f15486a[(i4 * 2) + 1];
    }

    public final List g(String str) {
        o.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            if (kotlin.text.o.v(str, c(i4), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i4));
            }
            i4 = i5;
        }
        if (arrayList == null) {
            return C0718m.j();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        o.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15486a);
    }

    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i4 = 0; i4 < size; i4++) {
            pairArr[i4] = g.a(c(i4), f(i4));
        }
        return kotlin.jvm.internal.b.a(pairArr);
    }

    public final int size() {
        return this.f15486a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            String c4 = c(i4);
            String f4 = f(i4);
            sb.append(c4);
            sb.append(": ");
            if (d.G(c4)) {
                f4 = "██";
            }
            sb.append(f4);
            sb.append("\n");
            i4 = i5;
        }
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private s(String[] strArr) {
        this.f15486a = strArr;
    }
}
