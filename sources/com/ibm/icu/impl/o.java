package com.ibm.icu.impl;

import com.ibm.icu.impl.Trie2;
import com.ibm.icu.impl.d;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUUncheckedIOException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static final o f12924f;

    /* renamed from: a  reason: collision with root package name */
    private int[] f12925a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f12926b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f12927c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f12928d;

    /* renamed from: e  reason: collision with root package name */
    private m f12929e;

    private static final class b implements d.b {
        private b() {
        }

        public boolean a(byte[] bArr) {
            if (bArr[0] == 2) {
                return true;
            }
            return false;
        }
    }

    static {
        try {
            f12924f = new o();
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    private o() {
        m(d.l("ubidi.icu"));
    }

    private static final int c(int i4) {
        return i4 & 31;
    }

    private static final boolean d(int i4, int i5) {
        return ((i4 >> i5) & 1) != 0;
    }

    private static final int h(int i4) {
        return i4 & 2097151;
    }

    private void m(ByteBuffer byteBuffer) {
        d.s(byteBuffer, 1114195049, new b());
        int i4 = byteBuffer.getInt();
        if (i4 >= 16) {
            int[] iArr = new int[i4];
            this.f12925a = iArr;
            iArr[0] = i4;
            for (int i5 = 1; i5 < i4; i5++) {
                this.f12925a[i5] = byteBuffer.getInt();
            }
            m n4 = m.n(byteBuffer);
            this.f12929e = n4;
            int i6 = this.f12925a[2];
            int o4 = n4.o();
            if (o4 <= i6) {
                d.u(byteBuffer, i6 - o4);
                int i7 = this.f12925a[3];
                if (i7 > 0) {
                    this.f12926b = d.n(byteBuffer, i7, 0);
                }
                int[] iArr2 = this.f12925a;
                byte[] bArr = new byte[(iArr2[5] - iArr2[4])];
                this.f12927c = bArr;
                byteBuffer.get(bArr);
                int[] iArr3 = this.f12925a;
                byte[] bArr2 = new byte[(iArr3[7] - iArr3[6])];
                this.f12928d = bArr2;
                byteBuffer.get(bArr2);
                return;
            }
            throw new IOException("ubidi.icu: not enough bytes for the trie");
        }
        throw new IOException("indexes[0] too small in ubidi.icu");
    }

    public final void a(UnicodeSet unicodeSet) {
        Iterator it = this.f12929e.iterator();
        while (it.hasNext()) {
            Trie2.c cVar = (Trie2.c) it.next();
            if (cVar.f12586d) {
                break;
            }
            unicodeSet.l(cVar.f12583a);
        }
        int i4 = this.f12925a[3];
        for (int i5 = 0; i5 < i4; i5++) {
            int h4 = h(this.f12926b[i5]);
            unicodeSet.n(h4, h4 + 1);
        }
        int[] iArr = this.f12925a;
        int i6 = iArr[4];
        int i7 = iArr[5];
        byte[] bArr = this.f12927c;
        while (true) {
            int i8 = i7 - i6;
            byte b4 = 0;
            for (int i9 = 0; i9 < i8; i9++) {
                byte b5 = bArr[i9];
                if (b5 != b4) {
                    unicodeSet.l(i6);
                    b4 = b5;
                }
                i6++;
            }
            if (b4 != 0) {
                unicodeSet.l(i7);
            }
            int[] iArr2 = this.f12925a;
            if (i7 == iArr2[5]) {
                int i10 = iArr2[6];
                int i11 = iArr2[7];
                bArr = this.f12928d;
                int i12 = i11;
                i6 = i10;
                i7 = i12;
            } else {
                return;
            }
        }
    }

    public final int b(int i4) {
        return c(this.f12929e.f(i4));
    }

    public final int e(int i4) {
        byte b4;
        int[] iArr = this.f12925a;
        int i5 = iArr[4];
        int i6 = iArr[5];
        if (i5 > i4 || i4 >= i6) {
            int i7 = iArr[6];
            int i8 = iArr[7];
            if (i7 > i4 || i4 >= i8) {
                return 0;
            }
            b4 = this.f12928d[i4 - i7];
        } else {
            b4 = this.f12927c[i4 - i5];
        }
        return b4 & 255;
    }

    public final int f(int i4) {
        return (this.f12929e.f(i4) & 224) >> 5;
    }

    public final int g(int i4) {
        int i5 = this.f12925a[15];
        if (i4 == 4096) {
            return i5 & 31;
        }
        if (i4 == 4117) {
            return (i5 & 768) >> 8;
        }
        if (i4 == 4102) {
            return (16711680 & i5) >> 16;
        }
        if (i4 != 4103) {
            return -1;
        }
        return (i5 & 224) >> 5;
    }

    public final int i(int i4) {
        return (this.f12929e.f(i4) & 768) >> 8;
    }

    public final boolean j(int i4) {
        return d(this.f12929e.f(i4), 11);
    }

    public final boolean k(int i4) {
        return d(this.f12929e.f(i4), 10);
    }

    public final boolean l(int i4) {
        return d(this.f12929e.f(i4), 12);
    }
}
