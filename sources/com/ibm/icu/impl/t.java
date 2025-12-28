package com.ibm.icu.impl;

public abstract class t {
    static int a(String str, byte[] bArr, int i4, int i5) {
        int length = str.length();
        byte b4 = 1;
        while (b4 != 0) {
            b4 = bArr[i5];
            i5++;
            if (b4 == 0) {
                break;
            } else if (i4 == length || str.charAt(i4) != ((char) (b4 & 255))) {
                return -1;
            } else {
                i4++;
            }
        }
        return i4;
    }

    public static boolean b(int i4) {
        if ((i4 & 65534) == 65534) {
            return true;
        }
        return i4 >= 64976 && i4 <= 65007;
    }

    static int c(byte[] bArr, int i4, int i5, byte b4) {
        int i6 = 0;
        while (i6 < i5) {
            if (bArr[i4 + i6] == b4) {
                return i6 + 1;
            }
            i6++;
        }
        return i6;
    }

    static int d(byte[] bArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            byte b4 = 1;
            while (b4 != 0) {
                b4 = bArr[i4];
                i4++;
            }
        }
        return i4;
    }

    static int e(char c4, char c5) {
        return (c4 << 16) | c5;
    }
}
