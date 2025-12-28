package com.ibm.icu.util;

import com.ibm.icu.util.StringTrieBuilder;
import java.nio.CharBuffer;

public final class b extends StringTrieBuilder {

    /* renamed from: f  reason: collision with root package name */
    private final char[] f13296f = new char[3];

    /* renamed from: g  reason: collision with root package name */
    private char[] f13297g;

    /* renamed from: h  reason: collision with root package name */
    private int f13298h;

    private void t(StringTrieBuilder.Option option) {
        if (this.f13297g == null) {
            this.f13297g = new char[1024];
        }
        d(option);
    }

    private void u(int i4) {
        char[] cArr = this.f13297g;
        if (i4 > cArr.length) {
            int length = cArr.length;
            do {
                length *= 2;
            } while (length <= i4);
            char[] cArr2 = new char[length];
            char[] cArr3 = this.f13297g;
            int length2 = cArr3.length;
            int i5 = this.f13298h;
            System.arraycopy(cArr3, length2 - i5, cArr2, length - i5, i5);
            this.f13297g = cArr2;
        }
    }

    private int v(char[] cArr, int i4) {
        int i5 = this.f13298h + i4;
        u(i5);
        this.f13298h = i5;
        char[] cArr2 = this.f13297g;
        System.arraycopy(cArr, 0, cArr2, cArr2.length - i5, i4);
        return this.f13298h;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return 5;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 16;
    }

    /* access modifiers changed from: protected */
    public int h() {
        return 48;
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        return true;
    }

    /* access modifiers changed from: protected */
    public int l(int i4) {
        int i5 = this.f13298h + 1;
        u(i5);
        this.f13298h = i5;
        char[] cArr = this.f13297g;
        cArr[cArr.length - i5] = (char) i4;
        return i5;
    }

    /* access modifiers changed from: protected */
    public int m(int i4, int i5) {
        int i6 = this.f13298h + i5;
        u(i6);
        this.f13298h = i6;
        int length = this.f13297g.length - i6;
        while (i5 > 0) {
            this.f13297g[length] = this.f13215b.charAt(i4);
            i5--;
            length++;
            i4++;
        }
        return this.f13298h;
    }

    /* access modifiers changed from: protected */
    public int n(int i4) {
        int i5 = this.f13298h - i4;
        if (i5 <= 64511) {
            return l(i5);
        }
        int i6 = 1;
        if (i5 <= 67043327) {
            this.f13296f[0] = (char) ((i5 >> 16) + 64512);
        } else {
            char[] cArr = this.f13296f;
            cArr[0] = 65535;
            cArr[1] = (char) (i5 >> 16);
            i6 = 2;
        }
        char[] cArr2 = this.f13296f;
        cArr2[i6] = (char) i5;
        return v(cArr2, i6 + 1);
    }

    /* access modifiers changed from: protected */
    public int o(int i4, boolean z3) {
        char c4 = 32768;
        if (i4 < 0 || i4 > 16383) {
            int i5 = 2;
            if (i4 < 0 || i4 > 1073676287) {
                char[] cArr = this.f13296f;
                cArr[0] = 32767;
                cArr[1] = (char) (i4 >> 16);
                cArr[2] = (char) i4;
                i5 = 3;
            } else {
                char[] cArr2 = this.f13296f;
                cArr2[0] = (char) ((i4 >> 16) + 16384);
                cArr2[1] = (char) i4;
            }
            char[] cArr3 = this.f13296f;
            char c5 = cArr3[0];
            if (!z3) {
                c4 = 0;
            }
            cArr3[0] = (char) (c5 | c4);
            return v(cArr3, i5);
        }
        if (!z3) {
            c4 = 0;
        }
        return l(i4 | c4);
    }

    /* access modifiers changed from: protected */
    public int p(boolean z3, int i4, int i5) {
        if (!z3) {
            return l(i5);
        }
        int i6 = 2;
        if (i4 < 0 || i4 > 16646143) {
            char[] cArr = this.f13296f;
            cArr[0] = 32704;
            cArr[1] = (char) (i4 >> 16);
            cArr[2] = (char) i4;
            i6 = 3;
        } else if (i4 <= 255) {
            this.f13296f[0] = (char) ((i4 + 1) << 6);
            i6 = 1;
        } else {
            char[] cArr2 = this.f13296f;
            cArr2[0] = (char) ((32704 & (i4 >> 10)) + 16448);
            cArr2[1] = (char) i4;
        }
        char[] cArr3 = this.f13296f;
        cArr3[0] = (char) (((char) i5) | cArr3[0]);
        return v(cArr3, i6);
    }

    public b q(CharSequence charSequence, int i4) {
        c(charSequence, i4);
        return this;
    }

    public a r(StringTrieBuilder.Option option) {
        return new a(s(option), 0);
    }

    public CharSequence s(StringTrieBuilder.Option option) {
        t(option);
        char[] cArr = this.f13297g;
        int length = cArr.length;
        int i4 = this.f13298h;
        return CharBuffer.wrap(cArr, length - i4, i4);
    }
}
