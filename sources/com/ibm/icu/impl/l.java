package com.ibm.icu.impl;

import a2.C0359a;
import a2.C0362d;
import a2.i;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.StringTrieBuilder;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.b;
import java.text.CharacterIterator;
import java.util.HashSet;
import java.util.Iterator;

public class l extends C0359a {

    /* renamed from: f  reason: collision with root package name */
    private C0359a f12802f;

    /* renamed from: g  reason: collision with root package name */
    private i f12803g;

    /* renamed from: h  reason: collision with root package name */
    private com.ibm.icu.util.a f12804h;

    /* renamed from: i  reason: collision with root package name */
    private com.ibm.icu.util.a f12805i;

    public static class a extends C0362d {

        /* renamed from: a  reason: collision with root package name */
        private HashSet f12806a = new HashSet();

        public a(ULocale uLocale) {
            ICUResourceBundle V3 = ICUResourceBundle.g0("com/ibm/icu/impl/data/icudt71b/brkitr", uLocale, ICUResourceBundle.OpenType.LOCALE_ROOT).V("exceptions/SentenceBreak");
            if (V3 != null) {
                int p4 = V3.p();
                for (int i4 = 0; i4 < p4; i4++) {
                    this.f12806a.add(((ICUResourceBundle) V3.b(i4)).q());
                }
            }
        }

        public C0359a b(C0359a aVar) {
            boolean z3;
            com.ibm.icu.util.a aVar2;
            boolean z4;
            int i4;
            C0359a aVar3 = aVar;
            if (this.f12806a.isEmpty()) {
                return aVar3;
            }
            b bVar = new b();
            b bVar2 = new b();
            int size = this.f12806a.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            Iterator it = this.f12806a.iterator();
            int i5 = 0;
            while (true) {
                z3 = true;
                if (!it.hasNext()) {
                    break;
                }
                charSequenceArr[i5] = (CharSequence) it.next();
                iArr[i5] = 0;
                i5++;
            }
            int i6 = 0;
            int i7 = 0;
            while (i6 < size) {
                String charSequence = charSequenceArr[i6].toString();
                int indexOf = charSequence.indexOf(46);
                if (indexOf <= -1 || (i4 = indexOf + 1) == charSequence.length()) {
                    z4 = z3;
                } else {
                    int i8 = -1;
                    for (int i9 = 0; i9 < size; i9++) {
                        if (i9 != i6 && charSequence.regionMatches(0, charSequenceArr[i9].toString(), 0, i4)) {
                            int i10 = iArr[i9];
                            if (i10 == 0) {
                                iArr[i9] = 3;
                            } else if ((i10 & 1) != 0) {
                                i8 = i9;
                            }
                        }
                    }
                    if (i8 == -1 && iArr[i6] == 0) {
                        StringBuilder sb = new StringBuilder(charSequence.substring(0, i4));
                        sb.reverse();
                        z4 = true;
                        bVar.q(sb, 1);
                        i7++;
                        iArr[i6] = 3;
                    } else {
                        z4 = true;
                    }
                }
                i6++;
                z3 = z4;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                String charSequence2 = charSequenceArr[i12].toString();
                if (iArr[i12] == 0) {
                    bVar.q(new StringBuilder(charSequence2).reverse(), 2);
                    i7++;
                } else {
                    bVar2.q(charSequence2, 2);
                    i11++;
                }
            }
            com.ibm.icu.util.a aVar4 = null;
            if (i7 > 0) {
                aVar2 = bVar.r(StringTrieBuilder.Option.FAST);
            } else {
                aVar2 = null;
            }
            if (i11 > 0) {
                aVar4 = bVar2.r(StringTrieBuilder.Option.FAST);
            }
            return new l(aVar3, aVar4, aVar2);
        }
    }

    public l(C0359a aVar, com.ibm.icu.util.a aVar2, com.ibm.icu.util.a aVar3) {
        this.f12802f = aVar;
        this.f12805i = aVar2;
        this.f12804h = aVar3;
    }

    private final boolean v(int i4) {
        com.ibm.icu.util.a aVar;
        BytesTrie.Result t4;
        this.f12803g.o(i4);
        this.f12804h.x();
        if (this.f12803g.n() != 32) {
            this.f12803g.k();
        }
        int i5 = -1;
        int i6 = -1;
        do {
            int n4 = this.f12803g.n();
            if (n4 < 0) {
                break;
            }
            t4 = this.f12804h.t(n4);
            if (t4.hasValue()) {
                i5 = this.f12803g.b();
                i6 = this.f12804h.p();
            }
        } while (t4.hasNext());
        this.f12804h.x();
        if (i5 < 0) {
            return false;
        }
        if (i6 == 2) {
            return true;
        }
        if (i6 != 1 || (aVar = this.f12805i) == null) {
            return false;
        }
        aVar.x();
        BytesTrie.Result result = BytesTrie.Result.INTERMEDIATE_VALUE;
        this.f12803g.o(i5);
        do {
            int k4 = this.f12803g.k();
            if (k4 == -1) {
                break;
            }
            result = this.f12805i.t(k4);
        } while (result.hasNext());
        this.f12805i.x();
        if (result.matches()) {
            return true;
        }
        return false;
    }

    private final int w(int i4) {
        if (!(i4 == -1 || this.f12804h == null)) {
            y();
            int g4 = this.f12803g.g();
            while (i4 != -1 && i4 != g4 && v(i4)) {
                i4 = this.f12802f.o();
            }
        }
        return i4;
    }

    private final int x(int i4) {
        if (!(i4 == 0 || i4 == -1 || this.f12804h == null)) {
            y();
            while (i4 != -1 && i4 != 0 && v(i4)) {
                i4 = this.f12802f.r();
            }
        }
        return i4;
    }

    private final void y() {
        this.f12803g = i.d((CharacterIterator) this.f12802f.l().clone());
    }

    public int b() {
        return this.f12802f.b();
    }

    public int c(int i4) {
        return w(this.f12802f.c(i4));
    }

    public Object clone() {
        l lVar = (l) super.clone();
        try {
            C0359a aVar = this.f12802f;
            if (aVar != null) {
                lVar.f12802f = (C0359a) aVar.clone();
            }
            i iVar = this.f12803g;
            if (iVar != null) {
                lVar.f12803g = (i) iVar.clone();
            }
            com.ibm.icu.util.a aVar2 = this.f12804h;
            if (aVar2 != null) {
                lVar.f12804h = aVar2.clone();
            }
            com.ibm.icu.util.a aVar3 = this.f12805i;
            if (aVar3 != null) {
                lVar.f12805i = aVar3.clone();
            }
            return lVar;
        } catch (CloneNotSupportedException e4) {
            throw new ICUCloneNotSupportedException((Throwable) e4);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f12802f.equals(lVar.f12802f) || !this.f12803g.equals(lVar.f12803g) || !this.f12804h.equals(lVar.f12804h) || !this.f12805i.equals(lVar.f12805i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f12805i.hashCode() * 39) + (this.f12804h.hashCode() * 11) + this.f12802f.hashCode();
    }

    public CharacterIterator l() {
        return this.f12802f.l();
    }

    public int o() {
        return w(this.f12802f.o());
    }

    public int p(int i4) {
        return w(this.f12802f.p(i4));
    }

    public int q(int i4) {
        return x(this.f12802f.q(i4));
    }

    public int r() {
        return x(this.f12802f.r());
    }

    public void u(CharacterIterator characterIterator) {
        this.f12802f.u(characterIterator);
    }
}
