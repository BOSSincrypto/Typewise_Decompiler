package X;

import Z.g;
import androidx.room.Index$Order;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1907e = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f1908a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f1909b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f1910c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f1911d;

    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0037a f1912h = new C0037a((i) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f1913a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1914b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1915c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1916d;

        /* renamed from: e  reason: collision with root package name */
        public final String f1917e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1918f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1919g;

        /* renamed from: X.e$a$a  reason: collision with other inner class name */
        public static final class C0037a {
            public /* synthetic */ C0037a(i iVar) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < str.length()) {
                    char charAt = str.charAt(i4);
                    int i7 = i6 + 1;
                    if (i6 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i5++;
                    } else if (charAt == ')' && i5 - 1 == 0 && i6 != str.length() - 1) {
                        return false;
                    }
                    i4++;
                    i6 = i7;
                }
                if (i5 == 0) {
                    return true;
                }
                return false;
            }

            public final boolean b(String str, String str2) {
                o.e(str, "current");
                if (o.a(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return o.a(kotlin.text.o.M0(substring).toString(), str2);
            }

            private C0037a() {
            }
        }

        public a(String str, String str2, boolean z3, int i4, String str3, int i5) {
            o.e(str, "name");
            o.e(str2, "type");
            this.f1913a = str;
            this.f1914b = str2;
            this.f1915c = z3;
            this.f1916d = i4;
            this.f1917e = str3;
            this.f1918f = i5;
            this.f1919g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            o.d(locale, "US");
            String upperCase = str.toUpperCase(locale);
            o.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (kotlin.text.o.L(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (kotlin.text.o.L(upperCase, "CHAR", false, 2, (Object) null) || kotlin.text.o.L(upperCase, "CLOB", false, 2, (Object) null) || kotlin.text.o.L(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (kotlin.text.o.L(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            if (kotlin.text.o.L(upperCase, "REAL", false, 2, (Object) null) || kotlin.text.o.L(upperCase, "FLOA", false, 2, (Object) null) || kotlin.text.o.L(upperCase, "DOUB", false, 2, (Object) null)) {
                return 4;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f1916d != ((a) obj).f1916d) {
                return false;
            }
            a aVar = (a) obj;
            if (!o.a(this.f1913a, aVar.f1913a) || this.f1915c != aVar.f1915c) {
                return false;
            }
            if (this.f1918f == 1 && aVar.f1918f == 2 && (str3 = this.f1917e) != null && !f1912h.b(str3, aVar.f1917e)) {
                return false;
            }
            if (this.f1918f == 2 && aVar.f1918f == 1 && (str2 = aVar.f1917e) != null && !f1912h.b(str2, this.f1917e)) {
                return false;
            }
            int i4 = this.f1918f;
            if (i4 != 0 && i4 == aVar.f1918f && ((str = this.f1917e) == null ? aVar.f1917e != null : !f1912h.b(str, aVar.f1917e))) {
                return false;
            }
            if (this.f1919g == aVar.f1919g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i4;
            int hashCode = ((this.f1913a.hashCode() * 31) + this.f1919g) * 31;
            if (this.f1915c) {
                i4 = 1231;
            } else {
                i4 = 1237;
            }
            return ((hashCode + i4) * 31) + this.f1916d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f1913a);
            sb.append("', type='");
            sb.append(this.f1914b);
            sb.append("', affinity='");
            sb.append(this.f1919g);
            sb.append("', notNull=");
            sb.append(this.f1915c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f1916d);
            sb.append(", defaultValue='");
            String str = this.f1917e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final e a(g gVar, String str) {
            o.e(gVar, "database");
            o.e(str, "tableName");
            return f.f(gVar, str);
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f1920a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1921b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1922c;

        /* renamed from: d  reason: collision with root package name */
        public final List f1923d;

        /* renamed from: e  reason: collision with root package name */
        public final List f1924e;

        public c(String str, String str2, String str3, List list, List list2) {
            o.e(str, "referenceTable");
            o.e(str2, "onDelete");
            o.e(str3, "onUpdate");
            o.e(list, "columnNames");
            o.e(list2, "referenceColumnNames");
            this.f1920a = str;
            this.f1921b = str2;
            this.f1922c = str3;
            this.f1923d = list;
            this.f1924e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.a(this.f1920a, cVar.f1920a) && o.a(this.f1921b, cVar.f1921b) && o.a(this.f1922c, cVar.f1922c) && o.a(this.f1923d, cVar.f1923d)) {
                return o.a(this.f1924e, cVar.f1924e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f1920a.hashCode() * 31) + this.f1921b.hashCode()) * 31) + this.f1922c.hashCode()) * 31) + this.f1923d.hashCode()) * 31) + this.f1924e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f1920a + "', onDelete='" + this.f1921b + " +', onUpdate='" + this.f1922c + "', columnNames=" + this.f1923d + ", referenceColumnNames=" + this.f1924e + '}';
        }
    }

    public static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final int f1925a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1926b;

        /* renamed from: c  reason: collision with root package name */
        private final String f1927c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1928d;

        public d(int i4, int i5, String str, String str2) {
            o.e(str, "from");
            o.e(str2, "to");
            this.f1925a = i4;
            this.f1926b = i5;
            this.f1927c = str;
            this.f1928d = str2;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            o.e(dVar, "other");
            int i4 = this.f1925a - dVar.f1925a;
            if (i4 == 0) {
                return this.f1926b - dVar.f1926b;
            }
            return i4;
        }

        public final String b() {
            return this.f1927c;
        }

        public final int c() {
            return this.f1925a;
        }

        public final String d() {
            return this.f1928d;
        }
    }

    /* renamed from: X.e$e  reason: collision with other inner class name */
    public static final class C0038e {

        /* renamed from: e  reason: collision with root package name */
        public static final a f1929e = new a((i) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f1930a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1931b;

        /* renamed from: c  reason: collision with root package name */
        public final List f1932c;

        /* renamed from: d  reason: collision with root package name */
        public List f1933d;

        /* renamed from: X.e$e$a */
        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            private a() {
            }
        }

        public C0038e(String str, boolean z3, List list, List list2) {
            o.e(str, "name");
            o.e(list, "columns");
            o.e(list2, "orders");
            this.f1930a = str;
            this.f1931b = z3;
            this.f1932c = list;
            this.f1933d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(Index$Order.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f1933d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0038e)) {
                return false;
            }
            C0038e eVar = (C0038e) obj;
            if (this.f1931b != eVar.f1931b || !o.a(this.f1932c, eVar.f1932c) || !o.a(this.f1933d, eVar.f1933d)) {
                return false;
            }
            if (kotlin.text.o.G(this.f1930a, "index_", false, 2, (Object) null)) {
                return kotlin.text.o.G(eVar.f1930a, "index_", false, 2, (Object) null);
            }
            return o.a(this.f1930a, eVar.f1930a);
        }

        public int hashCode() {
            int i4;
            if (kotlin.text.o.G(this.f1930a, "index_", false, 2, (Object) null)) {
                i4 = -1184239155;
            } else {
                i4 = this.f1930a.hashCode();
            }
            return (((((i4 * 31) + (this.f1931b ? 1 : 0)) * 31) + this.f1932c.hashCode()) * 31) + this.f1933d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f1930a + "', unique=" + this.f1931b + ", columns=" + this.f1932c + ", orders=" + this.f1933d + "'}";
        }
    }

    public e(String str, Map map, Set set, Set set2) {
        o.e(str, "name");
        o.e(map, "columns");
        o.e(set, "foreignKeys");
        this.f1908a = str;
        this.f1909b = map;
        this.f1910c = set;
        this.f1911d = set2;
    }

    public static final e a(g gVar, String str) {
        return f1907e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!o.a(this.f1908a, eVar.f1908a) || !o.a(this.f1909b, eVar.f1909b) || !o.a(this.f1910c, eVar.f1910c)) {
            return false;
        }
        Set set2 = this.f1911d;
        if (set2 == null || (set = eVar.f1911d) == null) {
            return true;
        }
        return o.a(set2, set);
    }

    public int hashCode() {
        return (((this.f1908a.hashCode() * 31) + this.f1909b.hashCode()) * 31) + this.f1910c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f1908a + "', columns=" + this.f1909b + ", foreignKeys=" + this.f1910c + ", indices=" + this.f1911d + '}';
    }
}
