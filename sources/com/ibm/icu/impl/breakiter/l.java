package com.ibm.icu.impl.breakiter;

import Y1.d;
import Z1.c;
import com.ibm.icu.impl.breakiter.e;
import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;

public final class l implements i {

    /* renamed from: a  reason: collision with root package name */
    volatile UnicodeSet f12669a = new UnicodeSet();

    public int a(CharacterIterator characterIterator, int i4, int i5, e.a aVar, boolean z3) {
        UnicodeSet unicodeSet = this.f12669a;
        int a4 = d.a(characterIterator);
        while (characterIterator.getIndex() < i5 && unicodeSet.S(a4)) {
            d.b(characterIterator);
            a4 = d.a(characterIterator);
        }
        return 0;
    }

    public boolean b(int i4) {
        return this.f12669a.S(i4);
    }

    public void c(int i4) {
        UnicodeSet unicodeSet = this.f12669a;
        if (!unicodeSet.S(i4)) {
            int h4 = c.h(i4, 4106);
            UnicodeSet unicodeSet2 = new UnicodeSet();
            unicodeSet2.z(4106, h4);
            unicodeSet2.q(unicodeSet);
            this.f12669a = unicodeSet2;
        }
    }
}
