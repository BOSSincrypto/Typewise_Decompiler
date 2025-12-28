package h2;

import ch.icoaching.typewise.word_lists.b;
import ch.icoaching.typewise.word_lists.d;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import u0.C0903a;

public final class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final p f13652a;

    public t(p pVar) {
        o.e(pVar, "mainDictionaryDao");
        this.f13652a = pVar;
    }

    public int a(String str) {
        o.e(str, "language");
        return this.f13652a.a(str);
    }

    public String b(String str, int i4) {
        o.e(str, "language");
        return this.f13652a.s(i4, str);
    }

    public d c(String str, String str2) {
        boolean z3;
        boolean z4;
        boolean z5;
        o.e(str, "language");
        o.e(str2, "word");
        C0903a v3 = this.f13652a.v(str2, str);
        if (v3 == null) {
            return null;
        }
        int a4 = v3.a();
        if (v3.b() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (v3.d() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (v3.c() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new d(a4, z3, z4, z5, v3.f());
    }

    public boolean d(String str, String str2) {
        o.e(str, "language");
        o.e(str2, "word");
        return this.f13652a.o(str2, str);
    }

    public Pair e(String str, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        o.e(str, "language");
        C0903a m4 = this.f13652a.m(i4, str);
        String e4 = m4.e();
        int a4 = m4.a();
        if (m4.b() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m4.d() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (m4.c() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new Pair(e4, new d(a4, z3, z4, z5, m4.f()));
    }
}
