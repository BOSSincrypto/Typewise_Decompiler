package com.ibm.icu.util;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class StringTrieBuilder {

    /* renamed from: a  reason: collision with root package name */
    private State f13214a = State.ADDING;

    /* renamed from: b  reason: collision with root package name */
    protected StringBuilder f13215b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    private h f13216c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f13217d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private j f13218e = new j();

    public enum Option {
        FAST,
        SMALL
    }

    private enum State {
        ADDING,
        BUILDING_FAST,
        BUILDING_SMALL,
        BUILT
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13221a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ibm.icu.util.StringTrieBuilder$State[] r0 = com.ibm.icu.util.StringTrieBuilder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13221a = r0
                com.ibm.icu.util.StringTrieBuilder$State r1 = com.ibm.icu.util.StringTrieBuilder.State.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13221a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.util.StringTrieBuilder$State r1 = com.ibm.icu.util.StringTrieBuilder.State.BUILDING_FAST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13221a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ibm.icu.util.StringTrieBuilder$State r1 = com.ibm.icu.util.StringTrieBuilder.State.BUILDING_SMALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13221a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ibm.icu.util.StringTrieBuilder$State r1 = com.ibm.icu.util.StringTrieBuilder.State.BUILT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.StringTrieBuilder.a.<clinit>():void");
        }
    }

    private static final class b extends j {

        /* renamed from: d  reason: collision with root package name */
        private int f13222d;

        /* renamed from: e  reason: collision with root package name */
        private h f13223e;

        public b(int i4, h hVar) {
            this.f13222d = i4;
            this.f13223e = hVar;
        }

        public int c(int i4) {
            if (this.f13238a != 0) {
                return i4;
            }
            int c4 = this.f13223e.c(i4);
            this.f13238a = c4;
            return c4;
        }

        public void e(StringTrieBuilder stringTrieBuilder) {
            this.f13223e.e(stringTrieBuilder);
            if (this.f13222d <= stringTrieBuilder.h()) {
                this.f13238a = stringTrieBuilder.p(this.f13242b, this.f13243c, this.f13222d - 1);
                return;
            }
            stringTrieBuilder.l(this.f13222d - 1);
            this.f13238a = stringTrieBuilder.p(this.f13242b, this.f13243c, 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f13222d == bVar.f13222d && this.f13223e == bVar.f13223e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f13222d + 248302782) * 37) + this.f13223e.hashCode();
        }
    }

    private static abstract class c extends h {

        /* renamed from: b  reason: collision with root package name */
        protected int f13224b;

        /* renamed from: c  reason: collision with root package name */
        protected int f13225c;

        public int hashCode() {
            return this.f13224b;
        }
    }

    private static final class d extends j {

        /* renamed from: d  reason: collision with root package name */
        private StringBuilder f13226d = new StringBuilder();

        /* renamed from: e  reason: collision with root package name */
        private ArrayList f13227e = new ArrayList();

        private int k(char c4) {
            int length = this.f13226d.length();
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                char charAt = this.f13226d.charAt(i5);
                if (c4 < charAt) {
                    length = i5;
                } else if (c4 == charAt) {
                    return i5;
                } else {
                    i4 = i5 + 1;
                }
            }
            return i4;
        }

        private h l(StringTrieBuilder stringTrieBuilder, int i4, int i5) {
            int i6 = i5 - i4;
            if (i6 > stringTrieBuilder.f()) {
                int i7 = (i6 / 2) + i4;
                return stringTrieBuilder.k(new i(this.f13226d.charAt(i7), l(stringTrieBuilder, i4, i7), l(stringTrieBuilder, i7, i5)));
            }
            g gVar = new g(i6);
            do {
                char charAt = this.f13226d.charAt(i4);
                h hVar = (h) this.f13227e.get(i4);
                if (hVar.getClass() == j.class) {
                    gVar.g(charAt, ((j) hVar).f13243c);
                } else {
                    gVar.h(charAt, hVar.d(stringTrieBuilder));
                }
                i4++;
            } while (i4 < i5);
            return stringTrieBuilder.k(gVar);
        }

        public h a(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i4, int i5) {
            if (i4 != charSequence.length()) {
                int i6 = i4 + 1;
                char charAt = charSequence.charAt(i4);
                int k4 = k(charAt);
                if (k4 >= this.f13226d.length() || charAt != this.f13226d.charAt(k4)) {
                    this.f13226d.insert(k4, charAt);
                    this.f13227e.add(k4, stringTrieBuilder.e(charSequence, i6, i5));
                } else {
                    ArrayList arrayList = this.f13227e;
                    arrayList.set(k4, ((h) arrayList.get(k4)).a(stringTrieBuilder, charSequence, i6, i5));
                }
                return this;
            } else if (!this.f13242b) {
                i(i5);
                return this;
            } else {
                throw new IllegalArgumentException("Duplicate string.");
            }
        }

        public h d(StringTrieBuilder stringTrieBuilder) {
            j bVar = new b(this.f13226d.length(), l(stringTrieBuilder, 0, this.f13226d.length()));
            if (this.f13242b) {
                if (stringTrieBuilder.i()) {
                    bVar.i(this.f13243c);
                } else {
                    bVar = new e(this.f13243c, stringTrieBuilder.k(bVar));
                }
            }
            return stringTrieBuilder.k(bVar);
        }

        public void j(char c4, h hVar) {
            int k4 = k(c4);
            this.f13226d.insert(k4, c4);
            this.f13227e.add(k4, hVar);
        }
    }

    private static final class e extends j {

        /* renamed from: d  reason: collision with root package name */
        private h f13228d;

        public e(int i4, h hVar) {
            this.f13228d = hVar;
            i(i4);
        }

        public int c(int i4) {
            if (this.f13238a != 0) {
                return i4;
            }
            int c4 = this.f13228d.c(i4);
            this.f13238a = c4;
            return c4;
        }

        public void e(StringTrieBuilder stringTrieBuilder) {
            this.f13228d.e(stringTrieBuilder);
            this.f13238a = stringTrieBuilder.o(this.f13243c, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            if (this.f13228d == ((e) obj).f13228d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f13243c + 82767594) * 37) + this.f13228d.hashCode();
        }
    }

    private static final class f extends j {

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f13229d;

        /* renamed from: e  reason: collision with root package name */
        private int f13230e;

        /* renamed from: f  reason: collision with root package name */
        private int f13231f;

        /* renamed from: g  reason: collision with root package name */
        private h f13232g;

        /* renamed from: h  reason: collision with root package name */
        private int f13233h;

        public f(CharSequence charSequence, int i4, int i5, h hVar) {
            this.f13229d = charSequence;
            this.f13230e = i4;
            this.f13231f = i5;
            this.f13232g = hVar;
        }

        private void j() {
            int hashCode = ((this.f13231f + 124151391) * 37) + this.f13232g.hashCode();
            this.f13233h = hashCode;
            if (this.f13242b) {
                this.f13233h = (hashCode * 37) + this.f13243c;
            }
            int i4 = this.f13230e;
            int i5 = this.f13231f + i4;
            while (i4 < i5) {
                this.f13233h = (this.f13233h * 37) + this.f13229d.charAt(i4);
                i4++;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.ibm.icu.util.StringTrieBuilder$d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.ibm.icu.util.StringTrieBuilder$f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.ibm.icu.util.StringTrieBuilder$f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.ibm.icu.util.StringTrieBuilder$f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.ibm.icu.util.StringTrieBuilder$f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ibm.icu.util.StringTrieBuilder.h a(com.ibm.icu.util.StringTrieBuilder r10, java.lang.CharSequence r11, int r12, int r13) {
            /*
                r9 = this;
                int r0 = r11.length()
                if (r12 != r0) goto L_0x0016
                boolean r10 = r9.f13242b
                if (r10 != 0) goto L_0x000e
                r9.i(r13)
                return r9
            L_0x000e:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r11 = "Duplicate string."
                r10.<init>(r11)
                throw r10
            L_0x0016:
                int r0 = r9.f13230e
                int r1 = r9.f13231f
                int r1 = r1 + r0
            L_0x001b:
                if (r0 >= r1) goto L_0x00ad
                int r2 = r11.length()
                if (r12 != r2) goto L_0x003b
                int r10 = r9.f13230e
                int r10 = r0 - r10
                com.ibm.icu.util.StringTrieBuilder$f r11 = new com.ibm.icu.util.StringTrieBuilder$f
                java.lang.CharSequence r12 = r9.f13229d
                int r1 = r9.f13231f
                int r1 = r1 - r10
                com.ibm.icu.util.StringTrieBuilder$h r2 = r9.f13232g
                r11.<init>(r12, r0, r1, r2)
                r11.i(r13)
                r9.f13231f = r10
                r9.f13232g = r11
                return r9
            L_0x003b:
                java.lang.CharSequence r2 = r9.f13229d
                char r2 = r2.charAt(r0)
                char r3 = r11.charAt(r12)
                if (r2 == r3) goto L_0x00a7
                com.ibm.icu.util.StringTrieBuilder$d r4 = new com.ibm.icu.util.StringTrieBuilder$d
                r4.<init>()
                int r5 = r9.f13230e
                if (r0 != r5) goto L_0x0072
                boolean r0 = r9.f13242b
                if (r0 == 0) goto L_0x005e
                int r0 = r9.f13243c
                r4.i(r0)
                r0 = 0
                r9.f13243c = r0
                r9.f13242b = r0
            L_0x005e:
                int r0 = r9.f13230e
                int r0 = r0 + 1
                r9.f13230e = r0
                int r0 = r9.f13231f
                int r0 = r0 + -1
                r9.f13231f = r0
                if (r0 <= 0) goto L_0x006e
                r0 = r9
                goto L_0x0070
            L_0x006e:
                com.ibm.icu.util.StringTrieBuilder$h r0 = r9.f13232g
            L_0x0070:
                r1 = r4
                goto L_0x009a
            L_0x0072:
                int r1 = r1 + -1
                if (r0 != r1) goto L_0x0082
                int r0 = r9.f13231f
                int r0 = r0 + -1
                r9.f13231f = r0
                com.ibm.icu.util.StringTrieBuilder$h r0 = r9.f13232g
                r9.f13232g = r4
                r1 = r9
                goto L_0x009a
            L_0x0082:
                int r1 = r0 - r5
                int r0 = r0 + 1
                com.ibm.icu.util.StringTrieBuilder$f r5 = new com.ibm.icu.util.StringTrieBuilder$f
                java.lang.CharSequence r6 = r9.f13229d
                int r7 = r9.f13231f
                int r8 = r1 + 1
                int r7 = r7 - r8
                com.ibm.icu.util.StringTrieBuilder$h r8 = r9.f13232g
                r5.<init>(r6, r0, r7, r8)
                r9.f13231f = r1
                r9.f13232g = r4
                r1 = r9
                r0 = r5
            L_0x009a:
                int r12 = r12 + 1
                com.ibm.icu.util.StringTrieBuilder$j r10 = r10.e(r11, r12, r13)
                r4.j(r2, r0)
                r4.j(r3, r10)
                return r1
            L_0x00a7:
                int r0 = r0 + 1
                int r12 = r12 + 1
                goto L_0x001b
            L_0x00ad:
                com.ibm.icu.util.StringTrieBuilder$h r0 = r9.f13232g
                com.ibm.icu.util.StringTrieBuilder$h r10 = r0.a(r10, r11, r12, r13)
                r9.f13232g = r10
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.StringTrieBuilder.f.a(com.ibm.icu.util.StringTrieBuilder, java.lang.CharSequence, int, int):com.ibm.icu.util.StringTrieBuilder$h");
        }

        public int c(int i4) {
            if (this.f13238a != 0) {
                return i4;
            }
            int c4 = this.f13232g.c(i4);
            this.f13238a = c4;
            return c4;
        }

        public h d(StringTrieBuilder stringTrieBuilder) {
            h hVar;
            this.f13232g = this.f13232g.d(stringTrieBuilder);
            int g4 = stringTrieBuilder.g();
            while (true) {
                int i4 = this.f13231f;
                if (i4 <= g4) {
                    break;
                }
                this.f13231f = i4 - g4;
                f fVar = new f(this.f13229d, (this.f13230e + i4) - g4, g4, this.f13232g);
                fVar.j();
                this.f13232g = stringTrieBuilder.k(fVar);
            }
            if (!this.f13242b || stringTrieBuilder.i()) {
                j();
                hVar = this;
            } else {
                int i5 = this.f13243c;
                this.f13243c = 0;
                this.f13242b = false;
                j();
                hVar = new e(i5, stringTrieBuilder.k(this));
            }
            return stringTrieBuilder.k(hVar);
        }

        public void e(StringTrieBuilder stringTrieBuilder) {
            this.f13232g.e(stringTrieBuilder);
            stringTrieBuilder.m(this.f13230e, this.f13231f);
            this.f13238a = stringTrieBuilder.p(this.f13242b, this.f13243c, (stringTrieBuilder.h() + this.f13231f) - 1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            f fVar = (f) obj;
            int i4 = this.f13231f;
            if (i4 != fVar.f13231f || this.f13232g != fVar.f13232g) {
                return false;
            }
            int i5 = this.f13230e;
            int i6 = fVar.f13230e;
            int i7 = i4 + i5;
            while (i5 < i7) {
                if (this.f13229d.charAt(i5) != this.f13229d.charAt(i6)) {
                    return false;
                }
                i5++;
                i6++;
            }
            return true;
        }

        public int hashCode() {
            return this.f13233h;
        }
    }

    private static final class g extends c {

        /* renamed from: d  reason: collision with root package name */
        private h[] f13234d;

        /* renamed from: e  reason: collision with root package name */
        private int f13235e;

        /* renamed from: f  reason: collision with root package name */
        private int[] f13236f;

        /* renamed from: g  reason: collision with root package name */
        private char[] f13237g;

        public g(int i4) {
            this.f13224b = 165535188 + i4;
            this.f13234d = new h[i4];
            this.f13236f = new int[i4];
            this.f13237g = new char[i4];
        }

        public int c(int i4) {
            if (this.f13238a == 0) {
                this.f13225c = i4;
                int i5 = this.f13235e;
                int i6 = 0;
                while (true) {
                    i5--;
                    h hVar = this.f13234d[i5];
                    if (hVar != null) {
                        i4 = hVar.c(i4 - i6);
                    }
                    if (i5 <= 0) {
                        break;
                    }
                    i6 = 1;
                }
                this.f13238a = i4;
            }
            return i4;
        }

        public void e(StringTrieBuilder stringTrieBuilder) {
            int i4;
            boolean z3;
            int i5;
            int i6 = this.f13235e - 1;
            h hVar = this.f13234d[i6];
            if (hVar == null) {
                i4 = this.f13225c;
            } else {
                i4 = hVar.b();
            }
            do {
                i6--;
                h hVar2 = this.f13234d[i6];
                if (hVar2 != null) {
                    hVar2.f(this.f13225c, i4, stringTrieBuilder);
                    continue;
                }
            } while (i6 > 0);
            int i7 = this.f13235e - 1;
            if (hVar == null) {
                stringTrieBuilder.o(this.f13236f[i7], true);
            } else {
                hVar.e(stringTrieBuilder);
            }
            this.f13238a = stringTrieBuilder.l(this.f13237g[i7]);
            while (true) {
                i7--;
                if (i7 >= 0) {
                    h hVar3 = this.f13234d[i7];
                    if (hVar3 == null) {
                        i5 = this.f13236f[i7];
                        z3 = true;
                    } else {
                        i5 = this.f13238a - hVar3.b();
                        z3 = false;
                    }
                    stringTrieBuilder.o(i5, z3);
                    this.f13238a = stringTrieBuilder.l(this.f13237g[i7]);
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            for (int i4 = 0; i4 < this.f13235e; i4++) {
                if (this.f13237g[i4] != gVar.f13237g[i4] || this.f13236f[i4] != gVar.f13236f[i4] || this.f13234d[i4] != gVar.f13234d[i4]) {
                    return false;
                }
            }
            return true;
        }

        public void g(int i4, int i5) {
            char[] cArr = this.f13237g;
            int i6 = this.f13235e;
            cArr[i6] = (char) i4;
            this.f13234d[i6] = null;
            this.f13236f[i6] = i5;
            this.f13235e = i6 + 1;
            this.f13224b = (((this.f13224b * 37) + i4) * 37) + i5;
        }

        public void h(int i4, h hVar) {
            char[] cArr = this.f13237g;
            int i5 = this.f13235e;
            cArr[i5] = (char) i4;
            this.f13234d[i5] = hVar;
            this.f13236f[i5] = 0;
            this.f13235e = i5 + 1;
            this.f13224b = (((this.f13224b * 37) + i4) * 37) + hVar.hashCode();
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    private static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        protected int f13238a = 0;

        public h a(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i4, int i5) {
            return this;
        }

        public final int b() {
            return this.f13238a;
        }

        public int c(int i4) {
            if (this.f13238a == 0) {
                this.f13238a = i4;
            }
            return i4;
        }

        public h d(StringTrieBuilder stringTrieBuilder) {
            return this;
        }

        public abstract void e(StringTrieBuilder stringTrieBuilder);

        public boolean equals(Object obj) {
            if (this == obj || getClass() == obj.getClass()) {
                return true;
            }
            return false;
        }

        public final void f(int i4, int i5, StringTrieBuilder stringTrieBuilder) {
            int i6 = this.f13238a;
            if (i6 >= 0) {
                return;
            }
            if (i6 < i5 || i4 < i6) {
                e(stringTrieBuilder);
            }
        }

        public abstract int hashCode();
    }

    private static final class i extends c {

        /* renamed from: d  reason: collision with root package name */
        private char f13239d;

        /* renamed from: e  reason: collision with root package name */
        private h f13240e;

        /* renamed from: f  reason: collision with root package name */
        private h f13241f;

        public i(char c4, h hVar, h hVar2) {
            this.f13224b = ((((21833 + c4) * 37) + hVar.hashCode()) * 37) + hVar2.hashCode();
            this.f13239d = c4;
            this.f13240e = hVar;
            this.f13241f = hVar2;
        }

        public int c(int i4) {
            if (this.f13238a != 0) {
                return i4;
            }
            this.f13225c = i4;
            int c4 = this.f13240e.c(this.f13241f.c(i4) - 1);
            this.f13238a = c4;
            return c4;
        }

        public void e(StringTrieBuilder stringTrieBuilder) {
            this.f13240e.f(this.f13225c, this.f13241f.b(), stringTrieBuilder);
            this.f13241f.e(stringTrieBuilder);
            stringTrieBuilder.n(this.f13240e.b());
            this.f13238a = stringTrieBuilder.l(this.f13239d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            i iVar = (i) obj;
            if (this.f13239d == iVar.f13239d && this.f13240e == iVar.f13240e && this.f13241f == iVar.f13241f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    private static class j extends h {

        /* renamed from: b  reason: collision with root package name */
        protected boolean f13242b;

        /* renamed from: c  reason: collision with root package name */
        protected int f13243c;

        public j() {
        }

        /* access modifiers changed from: private */
        public void h(int i4) {
            this.f13242b = true;
            this.f13243c = i4;
        }

        public h a(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i4, int i5) {
            if (i4 != charSequence.length()) {
                j a4 = stringTrieBuilder.e(charSequence, i4, i5);
                a4.i(this.f13243c);
                return a4;
            }
            throw new IllegalArgumentException("Duplicate string.");
        }

        public void e(StringTrieBuilder stringTrieBuilder) {
            this.f13238a = stringTrieBuilder.o(this.f13243c, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            j jVar = (j) obj;
            boolean z3 = this.f13242b;
            if (z3 != jVar.f13242b || (z3 && this.f13243c != jVar.f13243c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f13242b) {
                return 41383797 + this.f13243c;
            }
            return 1118481;
        }

        public final void i(int i4) {
            this.f13242b = true;
            this.f13243c = i4;
        }

        public j(int i4) {
            this.f13242b = true;
            this.f13243c = i4;
        }
    }

    protected StringTrieBuilder() {
    }

    /* access modifiers changed from: private */
    public j e(CharSequence charSequence, int i4, int i5) {
        j j4 = j(i5);
        if (i4 >= charSequence.length()) {
            return j4;
        }
        int length = this.f13215b.length();
        this.f13215b.append(charSequence, i4, charSequence.length());
        return new f(this.f13215b, length, charSequence.length() - i4, j4);
    }

    private final j j(int i4) {
        this.f13218e.h(i4);
        h hVar = (h) this.f13217d.get(this.f13218e);
        if (hVar != null) {
            return (j) hVar;
        }
        j jVar = new j(i4);
        h hVar2 = (h) this.f13217d.put(jVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: private */
    public final h k(h hVar) {
        if (this.f13214a == State.BUILDING_FAST) {
            return hVar;
        }
        h hVar2 = (h) this.f13217d.get(hVar);
        if (hVar2 != null) {
            return hVar2;
        }
        h hVar3 = (h) this.f13217d.put(hVar, hVar);
        return hVar;
    }

    /* access modifiers changed from: protected */
    public void c(CharSequence charSequence, int i4) {
        if (this.f13214a != State.ADDING) {
            throw new IllegalStateException("Cannot add (string, value) pairs after build().");
        } else if (charSequence.length() <= 65535) {
            h hVar = this.f13216c;
            if (hVar == null) {
                this.f13216c = e(charSequence, 0, i4);
            } else {
                this.f13216c = hVar.a(this, charSequence, 0, i4);
            }
        } else {
            throw new IndexOutOfBoundsException("The maximum string length is 0xffff.");
        }
    }

    /* access modifiers changed from: protected */
    public final void d(Option option) {
        int i4 = a.f13221a[this.f13214a.ordinal()];
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                throw new IllegalStateException("Builder failed and must be clear()ed.");
            } else if (i4 == 4) {
                return;
            }
        } else if (this.f13216c == null) {
            throw new IndexOutOfBoundsException("No (string, value) pairs were added.");
        } else if (option == Option.FAST) {
            this.f13214a = State.BUILDING_FAST;
        } else {
            this.f13214a = State.BUILDING_SMALL;
        }
        h d4 = this.f13216c.d(this);
        this.f13216c = d4;
        d4.c(-1);
        this.f13216c.e(this);
        this.f13214a = State.BUILT;
    }

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract int g();

    /* access modifiers changed from: protected */
    public abstract int h();

    /* access modifiers changed from: protected */
    public abstract boolean i();

    /* access modifiers changed from: protected */
    public abstract int l(int i4);

    /* access modifiers changed from: protected */
    public abstract int m(int i4, int i5);

    /* access modifiers changed from: protected */
    public abstract int n(int i4);

    /* access modifiers changed from: protected */
    public abstract int o(int i4, boolean z3);

    /* access modifiers changed from: protected */
    public abstract int p(boolean z3, int i4, int i5);
}
