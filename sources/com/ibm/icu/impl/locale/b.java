package com.ibm.icu.impl.locale;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    private static final C0179b f12833f = new C0179b();

    /* renamed from: g  reason: collision with root package name */
    public static final b f12834g = a("", "", "", "");

    /* renamed from: a  reason: collision with root package name */
    private String f12835a;

    /* renamed from: b  reason: collision with root package name */
    private String f12836b;

    /* renamed from: c  reason: collision with root package name */
    private String f12837c;

    /* renamed from: d  reason: collision with root package name */
    private String f12838d;

    /* renamed from: e  reason: collision with root package name */
    private volatile transient int f12839e;

    /* renamed from: com.ibm.icu.impl.locale.b$b  reason: collision with other inner class name */
    private static class C0179b extends i {
        /* access modifiers changed from: protected */
        /* renamed from: e */
        public b b(c cVar) {
            return new b(cVar.f12840a, cVar.f12841b, cVar.f12842c, cVar.f12843d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public c d(c cVar) {
            return c.f(cVar);
        }
    }

    private static class c implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f12840a = "";
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f12841b = "";
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f12842c = "";
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f12843d = "";

        /* renamed from: e  reason: collision with root package name */
        private volatile int f12844e;

        public c(String str, String str2, String str3, String str4) {
            if (str != null) {
                this.f12840a = str;
            }
            if (str2 != null) {
                this.f12841b = str2;
            }
            if (str3 != null) {
                this.f12842c = str3;
            }
            if (str4 != null) {
                this.f12843d = str4;
            }
        }

        public static c f(c cVar) {
            return new c(a.j(cVar.f12840a).intern(), a.k(cVar.f12841b).intern(), a.m(cVar.f12842c).intern(), a.m(cVar.f12843d).intern());
        }

        /* renamed from: e */
        public int compareTo(c cVar) {
            int a4 = a.a(this.f12840a, cVar.f12840a);
            if (a4 != 0) {
                return a4;
            }
            int a5 = a.a(this.f12841b, cVar.f12841b);
            if (a5 != 0) {
                return a5;
            }
            int a6 = a.a(this.f12842c, cVar.f12842c);
            if (a6 == 0) {
                return a.a(this.f12843d, cVar.f12843d);
            }
            return a6;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (!a.b(cVar.f12840a, this.f12840a) || !a.b(cVar.f12841b, this.f12841b) || !a.b(cVar.f12842c, this.f12842c) || !a.b(cVar.f12843d, this.f12843d)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i4 = this.f12844e;
            if (i4 == 0) {
                for (int i5 = 0; i5 < this.f12840a.length(); i5++) {
                    i4 = (i4 * 31) + a.i(this.f12840a.charAt(i5));
                }
                for (int i6 = 0; i6 < this.f12841b.length(); i6++) {
                    i4 = (i4 * 31) + a.i(this.f12841b.charAt(i6));
                }
                for (int i7 = 0; i7 < this.f12842c.length(); i7++) {
                    i4 = (i4 * 31) + a.i(this.f12842c.charAt(i7));
                }
                for (int i8 = 0; i8 < this.f12843d.length(); i8++) {
                    i4 = (i4 * 31) + a.i(this.f12843d.charAt(i8));
                }
                this.f12844e = i4;
            }
            return i4;
        }
    }

    public static b a(String str, String str2, String str3, String str4) {
        return (b) f12833f.c(new c(str, str2, str3, str4));
    }

    public String b() {
        return this.f12835a;
    }

    public String c() {
        return this.f12837c;
    }

    public String d() {
        return this.f12836b;
    }

    public String e() {
        return this.f12838d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (hashCode() != bVar.hashCode() || !this.f12835a.equals(bVar.f12835a) || !this.f12836b.equals(bVar.f12836b) || !this.f12837c.equals(bVar.f12837c) || !this.f12838d.equals(bVar.f12838d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i4 = this.f12839e;
        if (i4 == 0) {
            for (int i5 = 0; i5 < this.f12835a.length(); i5++) {
                i4 = (i4 * 31) + this.f12835a.charAt(i5);
            }
            for (int i6 = 0; i6 < this.f12836b.length(); i6++) {
                i4 = (i4 * 31) + this.f12836b.charAt(i6);
            }
            for (int i7 = 0; i7 < this.f12837c.length(); i7++) {
                i4 = (i4 * 31) + this.f12837c.charAt(i7);
            }
            for (int i8 = 0; i8 < this.f12838d.length(); i8++) {
                i4 = (i4 * 31) + this.f12838d.charAt(i8);
            }
            this.f12839e = i4;
        }
        return i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f12835a.length() > 0) {
            sb.append("language=");
            sb.append(this.f12835a);
        }
        if (this.f12836b.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("script=");
            sb.append(this.f12836b);
        }
        if (this.f12837c.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("region=");
            sb.append(this.f12837c);
        }
        if (this.f12838d.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("variant=");
            sb.append(this.f12838d);
        }
        return sb.toString();
    }

    private b(String str, String str2, String str3, String str4) {
        this.f12835a = "";
        this.f12836b = "";
        this.f12837c = "";
        this.f12838d = "";
        this.f12839e = 0;
        if (str != null) {
            this.f12835a = a.j(str).intern();
        }
        if (str2 != null) {
            this.f12836b = a.k(str2).intern();
        }
        if (str3 != null) {
            this.f12837c = a.m(str3).intern();
        }
        if (str4 != null) {
            this.f12838d = a.m(str4).intern();
        }
    }
}
