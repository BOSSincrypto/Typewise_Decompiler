package Y1;

import Y1.l;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ULocale;
import java.util.Set;

public abstract class i extends l {

    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        protected final String f2006c;

        public a() {
            this("com/ibm/icu/impl/data/icudt71b");
        }

        /* access modifiers changed from: protected */
        public Set b() {
            return ICUResourceBundle.j0(this.f2006c, e());
        }

        /* access modifiers changed from: protected */
        public ClassLoader e() {
            return f.c(getClass());
        }

        public String toString() {
            return super.toString() + ", bundle: " + this.f2006c;
        }

        public a(String str) {
            super(true);
            this.f2006c = str;
        }
    }

    public static class b extends l.c {

        /* renamed from: b  reason: collision with root package name */
        private int f2007b;

        /* renamed from: c  reason: collision with root package name */
        private int f2008c;

        /* renamed from: d  reason: collision with root package name */
        private String f2009d;

        /* renamed from: e  reason: collision with root package name */
        private String f2010e;

        /* renamed from: f  reason: collision with root package name */
        private String f2011f;

        protected b(String str, String str2, String str3, int i4) {
            super(str);
            String str4;
            this.f2007b = i4;
            if (str2 == null || str2.equalsIgnoreCase("root")) {
                this.f2009d = "";
                this.f2010e = null;
            } else {
                int indexOf = str2.indexOf(64);
                if (indexOf != 4 || !str2.regionMatches(true, 0, "root", 0, 4)) {
                    this.f2009d = str2;
                    this.f2008c = indexOf;
                    if (str3 == null || str2.equals(str3)) {
                        this.f2010e = "";
                    } else {
                        this.f2010e = str3;
                    }
                } else {
                    this.f2009d = str2.substring(4);
                    this.f2008c = 0;
                    this.f2010e = null;
                }
            }
            int i5 = this.f2008c;
            if (i5 == -1) {
                str4 = this.f2009d;
            } else {
                str4 = this.f2009d.substring(0, i5);
            }
            this.f2011f = str4;
        }

        public static b e(ULocale uLocale, String str, int i4) {
            if (uLocale == null) {
                return null;
            }
            String name = uLocale.getName();
            return new b(name, name, str, i4);
        }

        public String a() {
            return this.f2009d;
        }

        public String b() {
            String c4 = c();
            if (c4 == null) {
                return c4;
            }
            StringBuilder sb = new StringBuilder();
            if (this.f2007b != -1) {
                sb.append(h());
            }
            sb.append('/');
            sb.append(c4);
            int i4 = this.f2008c;
            if (i4 != -1) {
                String str = this.f2009d;
                sb.append(str.substring(i4, str.length()));
            }
            return sb.toString();
        }

        public String c() {
            return this.f2011f;
        }

        public boolean d() {
            int lastIndexOf = this.f2011f.lastIndexOf(95);
            if (lastIndexOf != -1) {
                while (true) {
                    int i4 = lastIndexOf - 1;
                    if (i4 < 0 || this.f2011f.charAt(i4) != '_') {
                        this.f2011f = this.f2011f.substring(0, lastIndexOf);
                    } else {
                        lastIndexOf = i4;
                    }
                }
                this.f2011f = this.f2011f.substring(0, lastIndexOf);
                return true;
            }
            String str = this.f2010e;
            if (str != null) {
                this.f2011f = str;
                if (str.length() == 0) {
                    this.f2010e = null;
                } else {
                    this.f2010e = "";
                }
                return true;
            }
            this.f2011f = null;
            return false;
        }

        public ULocale f() {
            if (this.f2008c == -1) {
                return new ULocale(this.f2011f);
            }
            return new ULocale(this.f2011f + this.f2009d.substring(this.f2008c));
        }

        public int g() {
            return this.f2007b;
        }

        public String h() {
            if (this.f2007b == -1) {
                return null;
            }
            return Integer.toString(g());
        }
    }

    public static abstract class c implements l.b {

        /* renamed from: a  reason: collision with root package name */
        protected final String f2012a = null;

        /* renamed from: b  reason: collision with root package name */
        protected final boolean f2013b;

        protected c(boolean z3) {
            this.f2013b = z3;
        }

        public Object a(l.c cVar, l lVar) {
            if (!d(cVar)) {
                return null;
            }
            b bVar = (b) cVar;
            return c(bVar.f(), bVar.g(), lVar);
        }

        /* access modifiers changed from: protected */
        public abstract Set b();

        /* access modifiers changed from: protected */
        public abstract Object c(ULocale uLocale, int i4, l lVar);

        /* access modifiers changed from: protected */
        public boolean d(l.c cVar) {
            if (cVar == null) {
                return false;
            }
            return b().contains(cVar.c());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            if (this.f2012a != null) {
                sb.append(", name: ");
                sb.append(this.f2012a);
            }
            sb.append(", visible: ");
            sb.append(this.f2013b);
            return sb.toString();
        }
    }

    public i(String str) {
        super(str);
    }

    public l.c k(ULocale uLocale, int i4) {
        return b.e(uLocale, m(), i4);
    }

    public Object l(ULocale uLocale, int i4, ULocale[] uLocaleArr) {
        l.c k4 = k(uLocale, i4);
        if (uLocaleArr == null) {
            return d(k4);
        }
        String[] strArr = new String[1];
        Object e4 = e(k4, strArr);
        if (e4 != null) {
            int indexOf = strArr[0].indexOf("/");
            if (indexOf >= 0) {
                strArr[0] = strArr[0].substring(indexOf + 1);
            }
            uLocaleArr[0] = new ULocale(strArr[0]);
        }
        return e4;
    }

    public abstract String m();
}
