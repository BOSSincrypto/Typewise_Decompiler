package a2;

import java.nio.BufferOverflowException;
import java.util.Arrays;

/* renamed from: a2.c  reason: case insensitive filesystem */
public final class C0361c {

    /* renamed from: a  reason: collision with root package name */
    private char[] f2266a = new char[100];

    /* renamed from: b  reason: collision with root package name */
    private int f2267b;

    /* renamed from: c  reason: collision with root package name */
    private int f2268c;

    /* renamed from: d  reason: collision with root package name */
    private int f2269d;

    /* renamed from: a2.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final char[] f2270a;

        /* renamed from: b  reason: collision with root package name */
        private int f2271b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2272c;

        /* renamed from: d  reason: collision with root package name */
        private int f2273d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f2274e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f2275f;

        /* renamed from: g  reason: collision with root package name */
        private int f2276g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2277h;

        /* renamed from: i  reason: collision with root package name */
        private int f2278i;

        /* renamed from: j  reason: collision with root package name */
        private int f2279j;

        /* renamed from: k  reason: collision with root package name */
        private int f2280k;

        /* renamed from: l  reason: collision with root package name */
        private int f2281l;

        /* renamed from: m  reason: collision with root package name */
        private int f2282m;

        private boolean d(boolean z3) {
            char c4;
            int i4 = this.f2276g;
            if (i4 > 0) {
                j();
            } else if (i4 >= 0 || this.f2273d <= 0) {
                this.f2276g = 1;
            } else {
                this.f2271b++;
                this.f2276g = 1;
                return true;
            }
            int i5 = this.f2273d;
            if (i5 >= 1) {
                if (i5 > 1) {
                    this.f2273d = i5 - 1;
                    return true;
                }
                this.f2273d = 0;
            }
            int i6 = this.f2271b;
            if (i6 >= this.f2272c) {
                return e();
            }
            char[] cArr = this.f2270a;
            this.f2271b = i6 + 1;
            char c5 = cArr[i6];
            if (c5 <= 4095) {
                this.f2277h = false;
                this.f2278i = c5 + 1;
                while (true) {
                    int i7 = this.f2271b;
                    if (i7 >= this.f2272c || (c5 = this.f2270a[i7]) > 4095) {
                        this.f2279j = this.f2278i;
                    } else {
                        this.f2271b = i7 + 1;
                        this.f2278i += c5 + 1;
                    }
                }
                this.f2279j = this.f2278i;
                if (!z3) {
                    return true;
                }
                j();
                int i8 = this.f2271b;
                if (i8 >= this.f2272c) {
                    return e();
                }
                this.f2271b = i8 + 1;
            }
            this.f2277h = true;
            if (c5 <= 28671) {
                int i9 = c5 >> 12;
                int i10 = (c5 >> 9) & 7;
                int i11 = (c5 & 511) + 1;
                if (this.f2275f) {
                    this.f2278i = i9 * i11;
                    this.f2279j = i11 * i10;
                } else {
                    this.f2278i = i9;
                    this.f2279j = i10;
                    if (i11 > 1) {
                        this.f2273d = i11;
                    }
                    return true;
                }
            } else {
                this.f2278i = g((c5 >> 6) & 63);
                this.f2279j = g(c5 & '?');
                if (!this.f2275f) {
                    return true;
                }
            }
            while (true) {
                int i12 = this.f2271b;
                if (i12 >= this.f2272c || (c4 = this.f2270a[i12]) <= 4095) {
                    return true;
                }
                this.f2271b = i12 + 1;
                if (c4 <= 28671) {
                    int i13 = (c4 & 511) + 1;
                    this.f2278i += (c4 >> 12) * i13;
                    this.f2279j += ((c4 >> 9) & 7) * i13;
                } else {
                    this.f2278i += g((c4 >> 6) & 63);
                    this.f2279j += g(c4 & '?');
                }
            }
            return true;
        }

        private boolean e() {
            this.f2276g = 0;
            this.f2277h = false;
            this.f2279j = 0;
            this.f2278i = 0;
            return false;
        }

        private int g(int i4) {
            if (i4 < 61) {
                return i4;
            }
            if (i4 < 62) {
                char[] cArr = this.f2270a;
                int i5 = this.f2271b;
                this.f2271b = i5 + 1;
                return cArr[i5] & 32767;
            }
            char[] cArr2 = this.f2270a;
            int i6 = this.f2271b;
            char c4 = ((i4 & 1) << 30) | ((cArr2[i6] & 32767) << 15) | (cArr2[i6 + 1] & 32767);
            this.f2271b = i6 + 2;
            return c4;
        }

        private void j() {
            this.f2280k += this.f2278i;
            if (this.f2277h) {
                this.f2281l += this.f2279j;
            }
            this.f2282m += this.f2279j;
        }

        public boolean a() {
            return this.f2277h;
        }

        public int b() {
            return this.f2279j;
        }

        public boolean c() {
            return d(this.f2274e);
        }

        public int f() {
            return this.f2278i;
        }

        public int h() {
            return this.f2281l;
        }

        public int i() {
            return this.f2280k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{ src[");
            sb.append(this.f2280k);
            sb.append("..");
            sb.append(this.f2280k + this.f2278i);
            if (this.f2277h) {
                sb.append("] ⇝ dest[");
            } else {
                sb.append("] ≡ dest[");
            }
            sb.append(this.f2282m);
            sb.append("..");
            sb.append(this.f2282m + this.f2279j);
            if (this.f2277h) {
                sb.append("], repl[");
                sb.append(this.f2281l);
                sb.append("..");
                sb.append(this.f2281l + this.f2279j);
                sb.append("] }");
            } else {
                sb.append("] (no-change) }");
            }
            return sb.toString();
        }

        private b(char[] cArr, int i4, boolean z3, boolean z4) {
            this.f2270a = cArr;
            this.f2272c = i4;
            this.f2274e = z3;
            this.f2275f = z4;
        }
    }

    private void c(int i4) {
        if (this.f2267b < this.f2266a.length || e()) {
            char[] cArr = this.f2266a;
            int i5 = this.f2267b;
            this.f2267b = i5 + 1;
            cArr[i5] = (char) i4;
        }
    }

    private boolean e() {
        int i4;
        char[] cArr = this.f2266a;
        if (cArr.length == 100) {
            i4 = 2000;
        } else if (cArr.length == Integer.MAX_VALUE) {
            throw new BufferOverflowException();
        } else if (cArr.length >= 1073741823) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = cArr.length * 2;
        }
        if (i4 - cArr.length >= 5) {
            this.f2266a = Arrays.copyOf(cArr, i4);
            return true;
        }
        throw new BufferOverflowException();
    }

    private int g() {
        int i4 = this.f2267b;
        if (i4 > 0) {
            return this.f2266a[i4 - 1];
        }
        return 65535;
    }

    private void j(int i4) {
        this.f2266a[this.f2267b - 1] = (char) i4;
    }

    public void a(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException("addReplace(" + i4 + ", " + i5 + "): both lengths must be non-negative");
        } else if (i4 != 0 || i5 != 0) {
            this.f2269d++;
            int i10 = i5 - i4;
            if (i10 != 0) {
                if ((i10 <= 0 || (i9 = this.f2268c) < 0 || i10 <= Integer.MAX_VALUE - i9) && (i10 >= 0 || (i8 = this.f2268c) >= 0 || i10 >= Integer.MIN_VALUE - i8)) {
                    this.f2268c += i10;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            if (i4 > 0 && i4 <= 6 && i5 <= 7) {
                int i11 = (i4 << 12) | (i5 << 9);
                int g4 = g();
                if (4095 >= g4 || g4 >= 28671 || (g4 & -512) != i11 || (g4 & 511) >= 511) {
                    c(i11);
                } else {
                    j(g4 + 1);
                }
            } else if (i4 < 61 && i5 < 61) {
                c((i4 << 6) | 28672 | i5);
            } else if (this.f2266a.length - this.f2267b >= 5 || e()) {
                int i12 = this.f2267b;
                int i13 = i12 + 1;
                if (i4 < 61) {
                    i6 = (i4 << 6) | 28672;
                } else if (i4 <= 32767) {
                    this.f2266a[i13] = (char) (i4 | 32768);
                    i6 = 32576;
                    i13 = i12 + 2;
                } else {
                    char[] cArr = this.f2266a;
                    cArr[i13] = (char) ((i4 >> 15) | 32768);
                    i13 = i12 + 3;
                    cArr[i12 + 2] = (char) (i4 | 32768);
                    i6 = (((i4 >> 30) + 62) << 6) | 28672;
                }
                if (i5 < 61) {
                    i7 = i6 | i5;
                } else if (i5 <= 32767) {
                    i7 = i6 | 61;
                    this.f2266a[i13] = (char) (i5 | 32768);
                    i13++;
                } else {
                    i7 = i6 | ((i5 >> 30) + 62);
                    char[] cArr2 = this.f2266a;
                    int i14 = i13 + 1;
                    cArr2[i13] = (char) ((i5 >> 15) | 32768);
                    i13 += 2;
                    cArr2[i14] = (char) (i5 | 32768);
                }
                this.f2266a[i12] = (char) i7;
                this.f2267b = i13;
            }
        }
    }

    public void b(int i4) {
        if (i4 >= 0) {
            int g4 = g();
            if (g4 < 4095) {
                int i5 = 4095 - g4;
                if (i5 >= i4) {
                    j(g4 + i4);
                    return;
                } else {
                    j(4095);
                    i4 -= i5;
                }
            }
            while (i4 >= 4096) {
                c(4095);
                i4 -= 4096;
            }
            if (i4 > 0) {
                c(i4 - 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("addUnchanged(" + i4 + "): length must not be negative");
    }

    public b d() {
        return new b(this.f2266a, this.f2267b, false, true);
    }

    public boolean f() {
        if (this.f2269d != 0) {
            return true;
        }
        return false;
    }

    public int h() {
        return this.f2268c;
    }

    public void i() {
        this.f2269d = 0;
        this.f2268c = 0;
        this.f2267b = 0;
    }
}
