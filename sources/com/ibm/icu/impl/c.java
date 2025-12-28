package com.ibm.icu.impl;

import com.ibm.icu.impl.d;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.a;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final b f12670c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final c f12671d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f12672e = {0, 1, 2, 3, 4, -1, -1, 5, 6, -1, -1, -1, -1, -1, 6};

    /* renamed from: a  reason: collision with root package name */
    private CodePointTrie.h f12673a = null;

    /* renamed from: b  reason: collision with root package name */
    private String[] f12674b = new String[6];

    private static final class b implements d.b {
        private b() {
        }

        public boolean a(byte[] bArr) {
            if (bArr[0] == 1) {
                return true;
            }
            return false;
        }
    }

    private c() {
        ByteBuffer o4 = d.o("uemoji.icu");
        try {
            d.t(o4, 1164799850, f12670c);
            int position = o4.position();
            int i4 = o4.getInt();
            int i5 = i4 / 4;
            if (i5 > 9) {
                int[] iArr = new int[i5];
                iArr[0] = i4;
                for (int i6 = 1; i6 < i5; i6++) {
                    iArr[i6] = o4.getInt();
                }
                int i7 = iArr[0];
                int i8 = iArr[1];
                this.f12673a = CodePointTrie.h.p(o4);
                d.u(o4, i8 - (o4.position() - position));
                int i9 = 4;
                d.u(o4, iArr[4] - i8);
                while (i9 <= 9) {
                    int i10 = iArr[i9];
                    int i11 = i9 + 1;
                    int i12 = iArr[i11];
                    if (i12 > i10) {
                        this.f12674b[c(i9)] = d.p(o4, (i12 - i10) / 2, 0);
                    }
                    i9 = i11;
                }
                return;
            }
            throw new ICUUncheckedIOException("Emoji properties data: not enough indexes");
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    private static int c(int i4) {
        return i4 - 4;
    }

    public UnicodeSet a(UnicodeSet unicodeSet) {
        CodePointMap.b bVar = new CodePointMap.b();
        for (int i4 = 0; this.f12673a.c(i4, (CodePointMap.d) null, bVar); i4 = bVar.f() + 1) {
            unicodeSet.l(i4);
        }
        return unicodeSet;
    }

    public void b(int i4, UnicodeSet unicodeSet) {
        int i5;
        if (i4 >= 65 && 71 >= i4) {
            if (i4 == 71) {
                i5 = 70;
                i4 = 65;
            } else {
                i5 = i4;
            }
            while (i4 <= i5) {
                String str = this.f12674b[i4 - 65];
                if (str != null) {
                    a.c q4 = new com.ibm.icu.util.a(str, 0).iterator();
                    while (q4.hasNext()) {
                        unicodeSet.o(((a.b) q4.next()).f13284a);
                    }
                }
                i4++;
            }
        }
    }

    public boolean d(int i4, int i5) {
        byte b4;
        if (i5 < 57 || 71 < i5 || (b4 = f12672e[i5 - 57]) < 0 || ((this.f12673a.j(i4) >> b4) & 1) == 0) {
            return false;
        }
        return true;
    }
}
