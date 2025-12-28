package com.ibm.icu.impl;

import Y1.s;
import com.ibm.icu.impl.j;
import com.ibm.icu.text.b;
import java.nio.ByteBuffer;

public final class i {

    /* renamed from: f  reason: collision with root package name */
    private static Y1.c f12731f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final h f12732g = new h();

    /* renamed from: a  reason: collision with root package name */
    public final j f12733a;

    /* renamed from: b  reason: collision with root package name */
    public final b f12734b;

    /* renamed from: c  reason: collision with root package name */
    public final c f12735c;

    /* renamed from: d  reason: collision with root package name */
    public final d f12736d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12737e;

    static class a extends s {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public i a(String str, ByteBuffer byteBuffer) {
            j jVar;
            if (byteBuffer == null) {
                j jVar2 = new j();
                jVar = jVar2.f0(str + ".nrm");
            } else {
                jVar = new j().g0(byteBuffer);
            }
            return new i(jVar, (a) null);
        }
    }

    public static final class b extends j {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f12738b;

        public b(j jVar, boolean z3) {
            super(jVar);
            this.f12738b = z3;
        }

        public boolean g(int i4) {
            return this.f12744a.I(i4);
        }

        public boolean h(int i4) {
            return this.f12744a.P(i4, this.f12738b);
        }

        public boolean i(CharSequence charSequence) {
            return this.f12744a.e(charSequence, 0, charSequence.length(), this.f12738b, false, new j.d(this.f12744a, new StringBuilder(), 5));
        }

        public b.t m(CharSequence charSequence) {
            int g4 = this.f12744a.g(charSequence, 0, charSequence.length(), this.f12738b, false);
            if ((g4 & 1) != 0) {
                return com.ibm.icu.text.b.f13092A;
            }
            if ((g4 >>> 1) == charSequence.length()) {
                return com.ibm.icu.text.b.f13106z;
            }
            return com.ibm.icu.text.b.f13105y;
        }

        public int n(CharSequence charSequence) {
            return this.f12744a.g(charSequence, 0, charSequence.length(), this.f12738b, true) >>> 1;
        }

        public int o(int i4) {
            j jVar = this.f12744a;
            return jVar.v(jVar.B(i4));
        }

        /* access modifiers changed from: protected */
        public void p(CharSequence charSequence, j.d dVar) {
            this.f12744a.e(charSequence, 0, charSequence.length(), this.f12738b, true, dVar);
        }

        /* access modifiers changed from: protected */
        public void q(CharSequence charSequence, boolean z3, j.d dVar) {
            this.f12744a.f(charSequence, z3, this.f12738b, dVar);
        }
    }

    public static final class c extends j {
        public c(j jVar) {
            super(jVar);
        }

        public boolean g(int i4) {
            return this.f12744a.L(i4);
        }

        public boolean h(int i4) {
            return this.f12744a.S(i4);
        }

        public int n(CharSequence charSequence) {
            return this.f12744a.h(charSequence, 0, charSequence.length(), (j.d) null);
        }

        public int o(int i4) {
            j jVar = this.f12744a;
            return jVar.U(jVar.B(i4)) ? 1 : 0;
        }

        /* access modifiers changed from: protected */
        public void p(CharSequence charSequence, j.d dVar) {
            this.f12744a.h(charSequence, 0, charSequence.length(), dVar);
        }

        /* access modifiers changed from: protected */
        public void q(CharSequence charSequence, boolean z3, j.d dVar) {
            this.f12744a.j(charSequence, z3, dVar);
        }
    }

    public static final class d extends j {
        public d(j jVar) {
            super(jVar);
        }

        public boolean g(int i4) {
            return this.f12744a.M(i4);
        }

        public boolean h(int i4) {
            return this.f12744a.W(i4);
        }

        public int n(CharSequence charSequence) {
            return this.f12744a.h0(charSequence, 0, charSequence.length(), (j.d) null);
        }

        public int o(int i4) {
            j jVar = this.f12744a;
            return jVar.U(jVar.B(i4)) ? 1 : 0;
        }

        /* access modifiers changed from: protected */
        public void p(CharSequence charSequence, j.d dVar) {
            this.f12744a.h0(charSequence, 0, charSequence.length(), dVar);
        }

        /* access modifiers changed from: protected */
        public void q(CharSequence charSequence, boolean z3, j.d dVar) {
            this.f12744a.i0(charSequence, z3, dVar);
        }
    }

    private static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C0177i f12739a = new C0177i("nfc", (a) null);
    }

    private static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C0177i f12740a = new C0177i("nfkc", (a) null);
    }

    private static final class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C0177i f12741a = new C0177i("nfkc_cf", (a) null);
    }

    public static final class h extends com.ibm.icu.text.c {
        public StringBuilder a(StringBuilder sb, CharSequence charSequence) {
            if (sb != charSequence) {
                sb.append(charSequence);
                return sb;
            }
            throw new IllegalArgumentException();
        }

        public boolean g(int i4) {
            return true;
        }

        public boolean i(CharSequence charSequence) {
            return true;
        }

        public StringBuilder k(CharSequence charSequence, StringBuilder sb) {
            if (sb != charSequence) {
                sb.setLength(0);
                sb.append(charSequence);
                return sb;
            }
            throw new IllegalArgumentException();
        }

        public StringBuilder l(StringBuilder sb, CharSequence charSequence) {
            if (sb != charSequence) {
                sb.append(charSequence);
                return sb;
            }
            throw new IllegalArgumentException();
        }

        public b.t m(CharSequence charSequence) {
            return com.ibm.icu.text.b.f13106z;
        }

        public int n(CharSequence charSequence) {
            return charSequence.length();
        }
    }

    /* renamed from: com.ibm.icu.impl.i$i  reason: collision with other inner class name */
    private static final class C0177i {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i f12742a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public RuntimeException f12743b;

        /* synthetic */ C0177i(String str, a aVar) {
            this(str);
        }

        private C0177i(String str) {
            try {
                j jVar = new j();
                this.f12742a = new i(jVar.f0(str + ".nrm"), (a) null);
            } catch (RuntimeException e4) {
                this.f12743b = e4;
            }
        }
    }

    public static abstract class j extends com.ibm.icu.text.c {

        /* renamed from: a  reason: collision with root package name */
        public final j f12744a;

        public j(j jVar) {
            this.f12744a = jVar;
        }

        public StringBuilder a(StringBuilder sb, CharSequence charSequence) {
            return r(sb, charSequence, false);
        }

        public int b(int i4) {
            j jVar = this.f12744a;
            return jVar.q(jVar.B(i4));
        }

        public boolean i(CharSequence charSequence) {
            if (charSequence.length() == n(charSequence)) {
                return true;
            }
            return false;
        }

        public StringBuilder k(CharSequence charSequence, StringBuilder sb) {
            if (sb != charSequence) {
                sb.setLength(0);
                p(charSequence, new j.d(this.f12744a, sb, charSequence.length()));
                return sb;
            }
            throw new IllegalArgumentException();
        }

        public StringBuilder l(StringBuilder sb, CharSequence charSequence) {
            return r(sb, charSequence, true);
        }

        public b.t m(CharSequence charSequence) {
            if (i(charSequence)) {
                return com.ibm.icu.text.b.f13106z;
            }
            return com.ibm.icu.text.b.f13105y;
        }

        public abstract int o(int i4);

        /* access modifiers changed from: protected */
        public abstract void p(CharSequence charSequence, j.d dVar);

        /* access modifiers changed from: protected */
        public abstract void q(CharSequence charSequence, boolean z3, j.d dVar);

        public StringBuilder r(StringBuilder sb, CharSequence charSequence, boolean z3) {
            if (sb != charSequence) {
                q(charSequence, z3, new j.d(this.f12744a, sb, sb.length() + charSequence.length()));
                return sb;
            }
            throw new IllegalArgumentException();
        }
    }

    /* synthetic */ i(j jVar, a aVar) {
        this(jVar);
    }

    public static com.ibm.icu.text.c a() {
        return d().f12736d;
    }

    private static i b(C0177i iVar) {
        if (iVar.f12743b == null) {
            return iVar.f12742a;
        }
        throw iVar.f12743b;
    }

    public static j c(int i4) {
        if (i4 == 0) {
            return d().f12735c;
        }
        if (i4 == 1) {
            return e().f12735c;
        }
        if (i4 == 2) {
            return d().f12734b;
        }
        if (i4 != 3) {
            return null;
        }
        return e().f12734b;
    }

    public static i d() {
        return b(e.f12739a);
    }

    public static i e() {
        return b(f.f12740a);
    }

    public static i f() {
        return b(g.f12741a);
    }

    private i(j jVar) {
        this.f12733a = jVar;
        this.f12734b = new b(jVar, false);
        this.f12735c = new c(jVar);
        this.f12736d = new d(jVar);
        this.f12737e = new b(jVar, true);
    }
}
