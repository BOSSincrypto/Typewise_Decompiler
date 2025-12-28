package com.ibm.icu.impl;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.g;
import com.ibm.icu.util.UResourceBundle;
import com.ibm.icu.util.UResourceTypeMismatchException;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

abstract class f extends ICUResourceBundle {

    /* renamed from: i  reason: collision with root package name */
    protected int f12684i;

    static class a extends c {
        a(f fVar, String str, int i4) {
            super(fVar, str, i4);
            this.f12685j = this.f12542b.f12565e.z(i4);
        }

        public String[] s() {
            return y();
        }

        public int t() {
            return 8;
        }

        /* access modifiers changed from: protected */
        public UResourceBundle v(int i4, HashMap hashMap, UResourceBundle uResourceBundle) {
            return x0(i4, Integer.toString(i4), hashMap, uResourceBundle);
        }

        /* access modifiers changed from: protected */
        public UResourceBundle w(String str, HashMap hashMap, UResourceBundle uResourceBundle) {
            return x0(Integer.parseInt(str), str, hashMap, uResourceBundle);
        }

        /* access modifiers changed from: protected */
        public String[] y() {
            g gVar = this.f12542b.f12565e;
            int a4 = this.f12685j.a();
            String[] strArr = new String[a4];
            int i4 = 0;
            while (i4 < a4) {
                String N3 = gVar.N(this.f12685j.f(gVar, i4));
                if (N3 != null) {
                    strArr[i4] = N3;
                    i4++;
                } else {
                    throw new UResourceTypeMismatchException("");
                }
            }
            return strArr;
        }
    }

    private static final class b extends f {
        b(f fVar, String str, int i4) {
            super(fVar, str, i4);
        }

        public int t() {
            return 1;
        }
    }

    static abstract class c extends f {

        /* renamed from: j  reason: collision with root package name */
        protected g.e f12685j;

        c(f fVar, String str, int i4) {
            super(fVar, str, i4);
        }

        public int p() {
            return this.f12685j.a();
        }

        public String r(int i4) {
            int f4 = this.f12685j.f(this.f12542b.f12565e, i4);
            if (f4 != -1) {
                String N3 = this.f12542b.f12565e.N(f4);
                if (N3 != null) {
                    return N3;
                }
                return super.r(i4);
            }
            throw new IndexOutOfBoundsException();
        }

        /* access modifiers changed from: protected */
        public UResourceBundle x0(int i4, String str, HashMap hashMap, UResourceBundle uResourceBundle) {
            int y02 = y0(i4);
            if (y02 != -1) {
                return v0(str, y02, hashMap, uResourceBundle);
            }
            throw new IndexOutOfBoundsException();
        }

        /* access modifiers changed from: protected */
        public int y0(int i4) {
            return this.f12685j.f(this.f12542b.f12565e, i4);
        }

        c(ICUResourceBundle.h hVar) {
            super(hVar);
        }
    }

    private static final class d extends f {
        d(f fVar, String str, int i4) {
            super(fVar, str, i4);
        }

        public int i() {
            return g.a(this.f12684i);
        }

        public int t() {
            return 7;
        }
    }

    private static final class e extends f {
        e(f fVar, String str, int i4) {
            super(fVar, str, i4);
        }

        public int[] j() {
            return this.f12542b.f12565e.F(this.f12684i);
        }

        public int t() {
            return 14;
        }
    }

    /* renamed from: com.ibm.icu.impl.f$f  reason: collision with other inner class name */
    private static final class C0175f extends f {

        /* renamed from: j  reason: collision with root package name */
        private String f12686j;

        C0175f(f fVar, String str, int i4) {
            super(fVar, str, i4);
            String N3 = this.f12542b.f12565e.N(i4);
            if (N3.length() < 12 || CacheValue.a()) {
                this.f12686j = N3;
            }
        }

        public String q() {
            String str = this.f12686j;
            if (str != null) {
                return str;
            }
            return this.f12542b.f12565e.N(this.f12684i);
        }

        public int t() {
            return 0;
        }
    }

    protected f(f fVar, String str, int i4) {
        super(fVar, str);
        this.f12684i = i4;
    }

    /* access modifiers changed from: protected */
    public final ICUResourceBundle v0(String str, int i4, HashMap hashMap, UResourceBundle uResourceBundle) {
        int c4 = g.c(i4);
        if (c4 == 14) {
            return new e(this, str, i4);
        }
        switch (c4) {
            case 0:
            case 6:
                return new C0175f(this, str, i4);
            case 1:
                return new b(this, str, i4);
            case 2:
            case 4:
            case 5:
                return new g(this, str, i4);
            case 3:
                return ICUResourceBundle.X(this, (String[]) null, 0, str, i4, hashMap, uResourceBundle);
            case 7:
                return new d(this, str, i4);
            case 8:
            case 9:
                return new a(this, str, i4);
            default:
                throw new IllegalStateException("The resource type is unknown");
        }
    }

    public int w0() {
        return this.f12684i;
    }

    static class g extends c {
        g(f fVar, String str, int i4) {
            super(fVar, str, i4);
            this.f12685j = this.f12542b.f12565e.P(i4);
        }

        /* access modifiers changed from: protected */
        public Object handleGetObject(String str) {
            g gVar = this.f12542b.f12565e;
            int h4 = ((g.n) this.f12685j).h(gVar, str);
            if (h4 >= 0) {
                int f4 = this.f12685j.f(gVar, h4);
                String N3 = gVar.N(f4);
                if (N3 != null) {
                    return N3;
                }
                g.d z3 = gVar.z(f4);
                if (z3 != null) {
                    int a4 = z3.a();
                    String[] strArr = new String[a4];
                    int i4 = 0;
                    while (i4 != a4) {
                        String N4 = gVar.N(z3.f(gVar, i4));
                        if (N4 != null) {
                            strArr[i4] = N4;
                            i4++;
                        }
                    }
                    return strArr;
                }
            }
            return super.handleGetObject(str);
        }

        /* access modifiers changed from: protected */
        public Set handleKeySet() {
            g gVar = this.f12542b.f12565e;
            TreeSet treeSet = new TreeSet();
            g.n nVar = (g.n) this.f12685j;
            for (int i4 = 0; i4 < nVar.a(); i4++) {
                treeSet.add(nVar.i(gVar, i4));
            }
            return treeSet;
        }

        public int t() {
            return 2;
        }

        /* access modifiers changed from: protected */
        public UResourceBundle v(int i4, HashMap hashMap, UResourceBundle uResourceBundle) {
            String i5 = ((g.n) this.f12685j).i(this.f12542b.f12565e, i4);
            if (i5 != null) {
                return v0(i5, y0(i4), hashMap, uResourceBundle);
            }
            throw new IndexOutOfBoundsException();
        }

        /* access modifiers changed from: protected */
        public UResourceBundle w(String str, HashMap hashMap, UResourceBundle uResourceBundle) {
            int h4 = ((g.n) this.f12685j).h(this.f12542b.f12565e, str);
            if (h4 < 0) {
                return null;
            }
            return v0(str, y0(h4), hashMap, uResourceBundle);
        }

        /* access modifiers changed from: package-private */
        public String z0(String str) {
            g gVar = this.f12542b.f12565e;
            int h4 = ((g.n) this.f12685j).h(gVar, str);
            if (h4 < 0) {
                return null;
            }
            return gVar.N(this.f12685j.f(gVar, h4));
        }

        g(ICUResourceBundle.h hVar, int i4) {
            super(hVar);
            this.f12685j = hVar.f12565e.P(i4);
        }
    }

    f(ICUResourceBundle.h hVar) {
        super(hVar);
        this.f12684i = hVar.f12565e.M();
    }
}
