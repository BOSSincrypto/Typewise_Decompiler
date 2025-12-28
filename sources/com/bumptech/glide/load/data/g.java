package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f10831c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f10832d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f10833e;

    /* renamed from: a  reason: collision with root package name */
    private final byte f10834a;

    /* renamed from: b  reason: collision with root package name */
    private int f10835b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f10831c = bArr;
        int length = bArr.length;
        f10832d = length;
        f10833e = length + 2;
    }

    public g(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 < -1 || i4 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i4);
        }
        this.f10834a = (byte) i4;
    }

    public void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i4;
        int i5;
        int i6 = this.f10835b;
        if (i6 < 2 || i6 > (i5 = f10833e)) {
            i4 = super.read();
        } else if (i6 == i5) {
            i4 = this.f10834a;
        } else {
            i4 = f10831c[i6 - 2] & 255;
        }
        if (i4 != -1) {
            this.f10835b++;
        }
        return i4;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j4) {
        long skip = super.skip(j4);
        if (skip > 0) {
            this.f10835b = (int) (((long) this.f10835b) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i4, int i5) {
        int i6;
        int i7 = this.f10835b;
        int i8 = f10833e;
        if (i7 > i8) {
            i6 = super.read(bArr, i4, i5);
        } else if (i7 == i8) {
            bArr[i4] = this.f10834a;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i4, 2 - i7);
        } else {
            int min = Math.min(i8 - i7, i5);
            System.arraycopy(f10831c, this.f10835b - 2, bArr, i4, min);
            i6 = min;
        }
        if (i6 > 0) {
            this.f10835b += i6;
        }
        return i6;
    }
}
