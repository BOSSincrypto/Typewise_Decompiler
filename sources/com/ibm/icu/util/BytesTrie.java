package com.ibm.icu.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class BytesTrie implements Cloneable, Iterable {

    /* renamed from: e  reason: collision with root package name */
    private static Result[] f13136e = {Result.INTERMEDIATE_VALUE, Result.FINAL_VALUE};

    /* renamed from: a  reason: collision with root package name */
    private byte[] f13137a;

    /* renamed from: b  reason: collision with root package name */
    private int f13138b;

    /* renamed from: c  reason: collision with root package name */
    private int f13139c;

    /* renamed from: d  reason: collision with root package name */
    private int f13140d;

    public enum Result {
        NO_MATCH,
        NO_VALUE,
        FINAL_VALUE,
        INTERMEDIATE_VALUE;

        public boolean hasNext() {
            if ((ordinal() & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean hasValue() {
            if (ordinal() >= 2) {
                return true;
            }
            return false;
        }

        public boolean matches() {
            if (this != NO_MATCH) {
                return true;
            }
            return false;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f13142a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f13143b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f13144c;

        /* access modifiers changed from: private */
        public void e(byte b4) {
            i(this.f13144c + 1);
            byte[] bArr = this.f13143b;
            int i4 = this.f13144c;
            this.f13144c = i4 + 1;
            bArr[i4] = b4;
        }

        /* access modifiers changed from: private */
        public void f(byte[] bArr, int i4, int i5) {
            i(this.f13144c + i5);
            System.arraycopy(bArr, i4, this.f13143b, this.f13144c, i5);
            this.f13144c += i5;
        }

        private void i(int i4) {
            byte[] bArr = this.f13143b;
            if (bArr.length < i4) {
                byte[] bArr2 = new byte[Math.min(bArr.length * 2, i4 * 2)];
                System.arraycopy(this.f13143b, 0, bArr2, 0, this.f13144c);
                this.f13143b = bArr2;
            }
        }

        /* access modifiers changed from: private */
        public void j(int i4) {
            this.f13144c = i4;
        }

        public byte g(int i4) {
            return this.f13143b[i4];
        }

        public int h() {
            return this.f13144c;
        }

        private b(int i4) {
            this.f13143b = new byte[i4];
        }
    }

    public static final class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f13145a;

        /* renamed from: b  reason: collision with root package name */
        private int f13146b;

        /* renamed from: c  reason: collision with root package name */
        private int f13147c;

        /* renamed from: d  reason: collision with root package name */
        private int f13148d;

        /* renamed from: e  reason: collision with root package name */
        private int f13149e;

        /* renamed from: f  reason: collision with root package name */
        private int f13150f;

        /* renamed from: g  reason: collision with root package name */
        private b f13151g;

        /* renamed from: h  reason: collision with root package name */
        private ArrayList f13152h;

        private int a(int i4, int i5) {
            boolean z3;
            while (i5 > 5) {
                int i6 = i4 + 1;
                int i7 = i5 >> 1;
                this.f13152h.add(Long.valueOf((((long) BytesTrie.u(this.f13145a, i6)) << 32) | ((long) ((i5 - i7) << 16)) | ((long) this.f13151g.f13144c)));
                i4 = BytesTrie.o(this.f13145a, i6);
                i5 = i7;
            }
            byte[] bArr = this.f13145a;
            int i8 = i4 + 1;
            byte b4 = bArr[i4];
            int i9 = i4 + 2;
            byte b5 = bArr[i8];
            byte b6 = b5 & 255;
            if ((b5 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int d4 = BytesTrie.r(bArr, i9, b6 >> 1);
            int b7 = BytesTrie.v(i9, b6);
            this.f13152h.add(Long.valueOf((((long) b7) << 32) | ((long) ((i5 - 1) << 16)) | ((long) this.f13151g.f13144c)));
            this.f13151g.e(b4);
            if (!z3) {
                return b7 + d4;
            }
            this.f13146b = -1;
            this.f13151g.f13142a = d4;
            return -1;
        }

        private b c() {
            this.f13146b = -1;
            b bVar = this.f13151g;
            bVar.f13142a = -1;
            return bVar;
        }

        /* renamed from: b */
        public b next() {
            int i4;
            int i5;
            int i6 = this.f13146b;
            boolean z3 = true;
            if (i6 < 0) {
                if (!this.f13152h.isEmpty()) {
                    ArrayList arrayList = this.f13152h;
                    long longValue = ((Long) arrayList.remove(arrayList.size() - 1)).longValue();
                    int i7 = (int) longValue;
                    int i8 = (int) (longValue >> 32);
                    this.f13151g.j(65535 & i7);
                    int i9 = i7 >>> 16;
                    if (i9 > 1) {
                        i6 = a(i8, i9);
                        if (i6 < 0) {
                            return this.f13151g;
                        }
                    } else {
                        this.f13151g.e(this.f13145a[i8]);
                        i6 = i8 + 1;
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            if (this.f13148d >= 0) {
                return c();
            }
            while (true) {
                byte[] bArr = this.f13145a;
                int i10 = i4 + 1;
                byte b4 = bArr[i4];
                byte b5 = b4 & 255;
                if (b5 >= 32) {
                    if ((b4 & 1) == 0) {
                        z3 = false;
                    }
                    this.f13151g.f13142a = BytesTrie.r(bArr, i10, b5 >> 1);
                    if (z3 || (this.f13150f > 0 && this.f13151g.f13144c == this.f13150f)) {
                        this.f13146b = -1;
                    } else {
                        this.f13146b = BytesTrie.v(i10, b5);
                    }
                    return this.f13151g;
                } else if (this.f13150f > 0 && this.f13151g.f13144c == this.f13150f) {
                    return c();
                } else {
                    if (b5 < 16) {
                        if (b5 == 0) {
                            b5 = this.f13145a[i10] & 255;
                            i10 = i4 + 2;
                        }
                        i4 = a(i10, b5 + 1);
                        if (i4 < 0) {
                            return this.f13151g;
                        }
                    } else {
                        int i11 = b5 - 15;
                        if (this.f13150f <= 0 || this.f13151g.f13144c + i11 <= (i5 = this.f13150f)) {
                            this.f13151g.f(this.f13145a, i10, i11);
                            i4 = i10 + i11;
                        } else {
                            b bVar = this.f13151g;
                            bVar.f(this.f13145a, i10, i5 - bVar.f13144c);
                            return c();
                        }
                    }
                }
            }
        }

        public boolean hasNext() {
            if (this.f13146b >= 0 || !this.f13152h.isEmpty()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(byte[] bArr, int i4, int i5, int i6) {
            this.f13152h = new ArrayList();
            this.f13145a = bArr;
            this.f13147c = i4;
            this.f13146b = i4;
            this.f13149e = i5;
            this.f13148d = i5;
            this.f13150f = i6;
            b bVar = new b(i6 == 0 ? 32 : i6);
            this.f13151g = bVar;
            int i7 = this.f13148d;
            if (i7 >= 0) {
                int i8 = i7 + 1;
                int i9 = this.f13150f;
                if (i9 > 0 && i8 > i9) {
                    i8 = i9;
                }
                bVar.f(this.f13145a, this.f13146b, i8);
                this.f13146b += i8;
                this.f13148d -= i8;
            }
        }
    }

    public BytesTrie(byte[] bArr, int i4) {
        this.f13137a = bArr;
        this.f13138b = i4;
        this.f13139c = i4;
        this.f13140d = -1;
    }

    private Result g(int i4, int i5, int i6) {
        Result result;
        int i7;
        if (i5 == 0) {
            i5 = this.f13137a[i4] & 255;
            i4++;
        }
        int i8 = i5 + 1;
        while (i8 > 5) {
            byte[] bArr = this.f13137a;
            int i9 = r7 + 1;
            if (i6 < (bArr[r7] & 255)) {
                i8 >>= 1;
                r7 = o(bArr, i9);
            } else {
                i8 -= i8 >> 1;
                r7 = u(bArr, i9);
            }
        }
        do {
            byte[] bArr2 = this.f13137a;
            int i10 = r7 + 1;
            if (i6 == (bArr2[r7] & 255)) {
                byte b4 = bArr2[i10];
                byte b5 = b4 & 255;
                if ((b4 & 1) != 0) {
                    result = Result.FINAL_VALUE;
                } else {
                    int i11 = r7 + 2;
                    int i12 = b5 >> 1;
                    if (i12 < 81) {
                        i7 = i12 - 16;
                    } else if (i12 < 108) {
                        i7 = ((i12 - 81) << 8) | (bArr2[i11] & 255);
                        i11 = r7 + 3;
                    } else if (i12 < 126) {
                        i7 = (bArr2[r7 + 3] & 255) | ((bArr2[i11] & 255) << 8) | ((i12 - 108) << 16);
                        i11 = r7 + 4;
                    } else if (i12 == 126) {
                        i7 = (bArr2[r7 + 4] & 255) | ((bArr2[i11] & 255) << 16) | ((bArr2[r7 + 3] & 255) << 8);
                        i11 = r7 + 5;
                    } else {
                        i7 = (bArr2[r7 + 5] & 255) | (bArr2[i11] << 24) | ((bArr2[r7 + 3] & 255) << 16) | ((bArr2[r7 + 4] & 255) << 8);
                        i11 = r7 + 6;
                    }
                    i10 = i11 + i7;
                    byte b6 = bArr2[i10];
                    if ((b6 & 255) >= 32) {
                        result = f13136e[b6 & 1];
                    } else {
                        result = Result.NO_VALUE;
                    }
                }
                this.f13139c = i10;
                return result;
            }
            i8--;
            r7 = w(bArr2, i10);
        } while (i8 > 1);
        byte[] bArr3 = this.f13137a;
        int i13 = r7 + 1;
        if (i6 == (bArr3[r7] & 255)) {
            this.f13139c = i13;
            byte b7 = bArr3[i13];
            if ((b7 & 255) >= 32) {
                return f13136e[b7 & 1];
            }
            return Result.NO_VALUE;
        }
        x();
        return Result.NO_MATCH;
    }

    public static int o(byte[] bArr, int i4) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4] & 255;
        if (b4 >= 192) {
            if (b4 < 240) {
                b4 = ((b4 - 192) << 8) | (bArr[i5] & 255);
                i5 = i4 + 2;
            } else if (b4 < 254) {
                b4 = ((bArr[i5] & 255) << 8) | ((b4 - 240) << 16) | (bArr[i4 + 2] & 255);
                i5 = i4 + 3;
            } else if (b4 == 254) {
                b4 = ((bArr[i5] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255);
                i5 = i4 + 4;
            } else {
                b4 = (bArr[i5] << 24) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 8) | (bArr[i4 + 4] & 255);
                i5 = i4 + 5;
            }
        }
        return i5 + b4;
    }

    private Result q(int i4, int i5) {
        while (true) {
            byte[] bArr = this.f13137a;
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            byte b5 = b4 & 255;
            if (b5 < 16) {
                return g(i6, b5, i5);
            }
            if (b5 < 32) {
                int i7 = i4 + 2;
                if (i5 == (bArr[i6] & 255)) {
                    int i8 = b5 - 17;
                    this.f13140d = i8;
                    this.f13139c = i7;
                    if (i8 < 0) {
                        byte b6 = bArr[i7];
                        if ((b6 & 255) >= 32) {
                            return f13136e[b6 & 1];
                        }
                    }
                    return Result.NO_VALUE;
                }
            } else if ((b4 & 1) != 0) {
                break;
            } else {
                i4 = v(i6, b5);
            }
        }
        x();
        return Result.NO_MATCH;
    }

    /* access modifiers changed from: private */
    public static int r(byte[] bArr, int i4, int i5) {
        int i6;
        byte b4;
        if (i5 < 81) {
            return i5 - 16;
        }
        if (i5 < 108) {
            i6 = (i5 - 81) << 8;
            b4 = bArr[i4];
        } else if (i5 < 126) {
            i6 = ((i5 - 108) << 16) | ((bArr[i4] & 255) << 8);
            b4 = bArr[i4 + 1];
        } else if (i5 == 126) {
            i6 = ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8);
            b4 = bArr[i4 + 2];
        } else {
            i6 = (bArr[i4] << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
            b4 = bArr[i4 + 3];
        }
        return i6 | (b4 & 255);
    }

    /* access modifiers changed from: private */
    public static int u(byte[] bArr, int i4) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        byte b5 = b4 & 255;
        if (b5 < 192) {
            return i5;
        }
        if (b5 < 240) {
            return i4 + 2;
        }
        if (b5 < 254) {
            return i4 + 3;
        }
        return i5 + (b4 & 1) + 3;
    }

    /* access modifiers changed from: private */
    public static int v(int i4, int i5) {
        if (i5 < 162) {
            return i4;
        }
        if (i5 < 216) {
            return i4 + 1;
        }
        return i5 < 252 ? i4 + 2 : i4 + ((i5 >> 1) & 1) + 3;
    }

    private static int w(byte[] bArr, int i4) {
        return v(i4 + 1, bArr[i4] & 255);
    }

    private void x() {
        this.f13139c = -1;
    }

    /* renamed from: i */
    public BytesTrie clone() {
        return (BytesTrie) super.clone();
    }

    public Result j(int i4) {
        this.f13140d = -1;
        if (i4 < 0) {
            i4 += 256;
        }
        return q(this.f13138b, i4);
    }

    public long k() {
        return (((long) this.f13140d) << 32) | ((long) this.f13139c);
    }

    public int l() {
        int i4 = this.f13139c;
        byte[] bArr = this.f13137a;
        return r(bArr, i4 + 1, (bArr[i4] & 255) >> 1);
    }

    /* renamed from: n */
    public c iterator() {
        return new c(this.f13137a, this.f13139c, this.f13140d, 0);
    }

    public Result p(int i4) {
        int i5 = this.f13139c;
        if (i5 < 0) {
            return Result.NO_MATCH;
        }
        if (i4 < 0) {
            i4 += 256;
        }
        int i6 = this.f13140d;
        if (i6 < 0) {
            return q(i5, i4);
        }
        byte[] bArr = this.f13137a;
        int i7 = i5 + 1;
        if (i4 == (bArr[i5] & 255)) {
            int i8 = i6 - 1;
            this.f13140d = i8;
            this.f13139c = i7;
            if (i8 < 0) {
                byte b4 = bArr[i7];
                if ((b4 & 255) >= 32) {
                    return f13136e[b4 & 1];
                }
            }
            return Result.NO_VALUE;
        }
        x();
        return Result.NO_MATCH;
    }

    public BytesTrie s() {
        this.f13139c = this.f13138b;
        this.f13140d = -1;
        return this;
    }

    public BytesTrie t(long j4) {
        this.f13140d = (int) (j4 >> 32);
        this.f13139c = (int) j4;
        return this;
    }

    public BytesTrie(BytesTrie bytesTrie) {
        this.f13137a = bytesTrie.f13137a;
        this.f13138b = bytesTrie.f13138b;
        this.f13139c = bytesTrie.f13139c;
        this.f13140d = bytesTrie.f13140d;
    }
}
