package com.ibm.icu.impl;

public class n extends Trie2 {
    n() {
    }

    public final int f(int i4) {
        if (i4 >= 0) {
            if (i4 < 55296 || (i4 > 56319 && i4 <= 65535)) {
                return this.f12571d[(this.f12569b[i4 >> 5] << 2) + (i4 & 31)];
            } else if (i4 <= 65535) {
                return this.f12571d[(this.f12569b[((i4 - 55296) >> 5) + 2048] << 2) + (i4 & 31)];
            } else if (i4 < this.f12577j) {
                char[] cArr = this.f12569b;
                return this.f12571d[(cArr[cArr[(i4 >> 11) + 2080] + ((i4 >> 5) & '?')] << 2) + (i4 & 31)];
            } else if (i4 <= 1114111) {
                return this.f12571d[this.f12578k];
            }
        }
        return this.f12576i;
    }

    public int g(char c4) {
        return this.f12571d[(this.f12569b[c4 >> 5] << 2) + (c4 & 31)];
    }

    /* access modifiers changed from: package-private */
    public int m(int i4, int i5, int i6) {
        char c4;
        int i7;
        char c5;
        loop0:
        while (true) {
            if (i4 >= i5) {
                break;
            }
            if (i4 < 55296 || (i4 > 56319 && i4 <= 65535)) {
                i7 = this.f12569b[i4 >> 5] << 2;
                c4 = 0;
            } else {
                if (i4 < 65535) {
                    c4 = 2048;
                    c5 = this.f12569b[((i4 - 55296) >> 5) + 2048];
                } else if (i4 < this.f12577j) {
                    char[] cArr = this.f12569b;
                    c4 = cArr[(i4 >> 11) + 2080];
                    c5 = cArr[((i4 >> 5) & '?') + c4];
                } else if (i6 == this.f12571d[this.f12578k]) {
                    i4 = i5;
                }
                i7 = c5 << 2;
            }
            if (c4 == this.f12574g) {
                if (i6 != this.f12575h) {
                    break;
                }
                i4 += 2048;
            } else if (i7 != this.f12579l) {
                int i8 = (i4 & 31) + i7;
                int i9 = i7 + 32;
                for (int i10 = i8; i10 < i9; i10++) {
                    if (this.f12571d[i10] != i6) {
                        i4 += i10 - i8;
                        break loop0;
                    }
                }
                i4 += i9 - i8;
            } else if (i6 != this.f12575h) {
                break;
            } else {
                i4 += 32;
            }
        }
        if (i4 <= i5) {
            i5 = i4;
        }
        return i5 - 1;
    }
}
