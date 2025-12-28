package com.ibm.icu.impl.breakiter;

import a2.i;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.a;
import java.text.CharacterIterator;

class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f12640a;

    public c(CharSequence charSequence) {
        this.f12640a = charSequence;
    }

    public int b(CharacterIterator characterIterator, int i4, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int k4;
        i d4 = i.d(characterIterator);
        a aVar = new a(this.f12640a, 0);
        int k5 = d4.k();
        if (k5 == -1) {
            return 0;
        }
        BytesTrie.Result o4 = aVar.o(k5);
        int i6 = 1;
        int i7 = 0;
        while (true) {
            if (!o4.hasValue()) {
                if (o4 == BytesTrie.Result.NO_MATCH) {
                    break;
                }
            } else {
                if (i7 < i5) {
                    if (iArr3 != null) {
                        iArr3[i7] = aVar.p();
                    }
                    iArr[i7] = i6;
                    i7++;
                }
                if (o4 == BytesTrie.Result.FINAL_VALUE) {
                    break;
                }
            }
            if (i6 >= i4 || (k4 = d4.k()) == -1) {
                break;
            }
            i6++;
            o4 = aVar.t(k4);
        }
        iArr2[0] = i7;
        return i6;
    }
}
