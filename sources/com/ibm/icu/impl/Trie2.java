package com.ibm.icu.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.uuid.Uuid;

public abstract class Trie2 implements Iterable {

    /* renamed from: n  reason: collision with root package name */
    private static f f12567n = new a();

    /* renamed from: a  reason: collision with root package name */
    e f12568a;

    /* renamed from: b  reason: collision with root package name */
    char[] f12569b;

    /* renamed from: c  reason: collision with root package name */
    int f12570c;

    /* renamed from: d  reason: collision with root package name */
    int[] f12571d;

    /* renamed from: e  reason: collision with root package name */
    int f12572e;

    /* renamed from: f  reason: collision with root package name */
    int f12573f;

    /* renamed from: g  reason: collision with root package name */
    int f12574g;

    /* renamed from: h  reason: collision with root package name */
    int f12575h;

    /* renamed from: i  reason: collision with root package name */
    int f12576i;

    /* renamed from: j  reason: collision with root package name */
    int f12577j;

    /* renamed from: k  reason: collision with root package name */
    int f12578k;

    /* renamed from: l  reason: collision with root package name */
    int f12579l;

    /* renamed from: m  reason: collision with root package name */
    int f12580m;

    enum ValueWidth {
        BITS_16,
        BITS_32
    }

    static class a implements f {
        a() {
        }

        public int a(int i4) {
            return i4;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12582a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ibm.icu.impl.Trie2$ValueWidth[] r0 = com.ibm.icu.impl.Trie2.ValueWidth.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12582a = r0
                com.ibm.icu.impl.Trie2$ValueWidth r1 = com.ibm.icu.impl.Trie2.ValueWidth.BITS_16     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12582a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.impl.Trie2$ValueWidth r1 = com.ibm.icu.impl.Trie2.ValueWidth.BITS_32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.Trie2.b.<clinit>():void");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f12583a;

        /* renamed from: b  reason: collision with root package name */
        public int f12584b;

        /* renamed from: c  reason: collision with root package name */
        public int f12585c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12586d;

        public boolean equals(Object obj) {
            if (obj == null || !obj.getClass().equals(getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f12583a == cVar.f12583a && this.f12584b == cVar.f12584b && this.f12585c == cVar.f12585c && this.f12586d == cVar.f12586d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Trie2.h(Trie2.i(Trie2.j(Trie2.j(Trie2.k(), this.f12583a), this.f12584b), this.f12585c), this.f12586d ? 1 : 0);
        }
    }

    class d implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private f f12587a;

        /* renamed from: b  reason: collision with root package name */
        private c f12588b = new c();

        /* renamed from: c  reason: collision with root package name */
        private int f12589c;

        /* renamed from: d  reason: collision with root package name */
        private int f12590d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12591e = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12592f;

        d(f fVar) {
            this.f12587a = fVar;
            this.f12589c = 0;
            this.f12590d = 1114112;
            this.f12592f = true;
        }

        private int b(char c4) {
            int i4;
            int g4;
            if (c4 >= 56319) {
                return 56319;
            }
            int g5 = Trie2.this.g(c4);
            char c5 = c4;
            do {
                i4 = c5 + 1;
                if (i4 > 56319) {
                    break;
                }
                g4 = Trie2.this.g((char) i4);
                c5 = i4;
            } while (g4 == g5);
            return i4 - 1;
        }

        /* renamed from: a */
        public c next() {
            int i4;
            int i5;
            if (hasNext()) {
                if (this.f12589c >= this.f12590d) {
                    this.f12591e = false;
                    this.f12589c = 55296;
                }
                if (this.f12591e) {
                    int f4 = Trie2.this.f(this.f12589c);
                    i4 = this.f12587a.a(f4);
                    i5 = Trie2.this.m(this.f12589c, this.f12590d, f4);
                    while (i5 < this.f12590d - 1) {
                        int i6 = i5 + 1;
                        int f5 = Trie2.this.f(i6);
                        if (this.f12587a.a(f5) != i4) {
                            break;
                        }
                        i5 = Trie2.this.m(i6, this.f12590d, f5);
                    }
                } else {
                    i4 = this.f12587a.a(Trie2.this.g((char) this.f12589c));
                    int b4 = b((char) this.f12589c);
                    while (i5 < 56319) {
                        char c4 = (char) (i5 + 1);
                        if (this.f12587a.a(Trie2.this.g(c4)) != i4) {
                            break;
                        }
                        b4 = b(c4);
                    }
                }
                c cVar = this.f12588b;
                cVar.f12583a = this.f12589c;
                cVar.f12584b = i5;
                cVar.f12585c = i4;
                cVar.f12586d = !this.f12591e;
                this.f12589c = i5 + 1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if ((!this.f12591e || (!this.f12592f && this.f12589c >= this.f12590d)) && this.f12589c >= 56320) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        int f12594a;

        /* renamed from: b  reason: collision with root package name */
        int f12595b;

        /* renamed from: c  reason: collision with root package name */
        int f12596c;

        /* renamed from: d  reason: collision with root package name */
        int f12597d;

        /* renamed from: e  reason: collision with root package name */
        int f12598e;

        /* renamed from: f  reason: collision with root package name */
        int f12599f;

        /* renamed from: g  reason: collision with root package name */
        int f12600g;

        e() {
        }
    }

    public interface f {
        int a(int i4);
    }

    public static Trie2 e(ByteBuffer byteBuffer) {
        Trie2 trie2;
        ValueWidth valueWidth;
        ByteOrder order = byteBuffer.order();
        try {
            e eVar = new e();
            int i4 = byteBuffer.getInt();
            eVar.f12594a = i4;
            if (i4 == 845771348) {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                if (order == byteOrder) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                eVar.f12594a = 1416784178;
            } else if (i4 != 1416784178) {
                throw new IllegalArgumentException("Buffer does not contain a serialized UTrie2");
            }
            eVar.f12595b = byteBuffer.getChar();
            eVar.f12596c = byteBuffer.getChar();
            eVar.f12597d = byteBuffer.getChar();
            eVar.f12598e = byteBuffer.getChar();
            eVar.f12599f = byteBuffer.getChar();
            eVar.f12600g = byteBuffer.getChar();
            int i5 = eVar.f12595b;
            if ((i5 & 15) <= 1) {
                if ((i5 & 15) == 0) {
                    valueWidth = ValueWidth.BITS_16;
                    trie2 = new m();
                } else {
                    valueWidth = ValueWidth.BITS_32;
                    trie2 = new n();
                }
                trie2.f12568a = eVar;
                int i6 = eVar.f12596c;
                trie2.f12572e = i6;
                int i7 = eVar.f12597d << 2;
                trie2.f12573f = i7;
                trie2.f12574g = eVar.f12598e;
                trie2.f12579l = eVar.f12599f;
                trie2.f12577j = eVar.f12600g << 11;
                int i8 = i7 - 4;
                trie2.f12578k = i8;
                ValueWidth valueWidth2 = ValueWidth.BITS_16;
                if (valueWidth == valueWidth2) {
                    trie2.f12578k = i8 + i6;
                }
                if (valueWidth == valueWidth2) {
                    i6 += i7;
                }
                trie2.f12569b = d.i(byteBuffer, i6, 0);
                if (valueWidth == valueWidth2) {
                    trie2.f12570c = trie2.f12572e;
                } else {
                    trie2.f12571d = d.n(byteBuffer, trie2.f12573f, 0);
                }
                int i9 = b.f12582a[valueWidth.ordinal()];
                if (i9 == 1) {
                    trie2.f12571d = null;
                    char[] cArr = trie2.f12569b;
                    trie2.f12575h = cArr[trie2.f12579l];
                    trie2.f12576i = cArr[trie2.f12570c + Uuid.SIZE_BITS];
                } else if (i9 == 2) {
                    trie2.f12570c = 0;
                    int[] iArr = trie2.f12571d;
                    trie2.f12575h = iArr[trie2.f12579l];
                    trie2.f12576i = iArr[128];
                } else {
                    throw new IllegalArgumentException("UTrie2 serialized format error.");
                }
                return trie2;
            }
            throw new IllegalArgumentException("UTrie2 serialized format error.");
        } finally {
            byteBuffer.order(order);
        }
    }

    /* access modifiers changed from: private */
    public static int h(int i4, int i5) {
        return (i4 * 16777619) ^ i5;
    }

    /* access modifiers changed from: private */
    public static int i(int i4, int i5) {
        return h(h(h(h(i4, i5 & 255), (i5 >> 8) & 255), (i5 >> 16) & 255), (i5 >> 24) & 255);
    }

    /* access modifiers changed from: private */
    public static int j(int i4, int i5) {
        return h(h(h(i4, i5 & 255), (i5 >> 8) & 255), i5 >> 16);
    }

    /* access modifiers changed from: private */
    public static int k() {
        return -2128831035;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ibm.icu.impl.Trie2
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.ibm.icu.impl.Trie2 r6 = (com.ibm.icu.impl.Trie2) r6
            java.util.Iterator r0 = r6.iterator()
            java.util.Iterator r2 = r5.iterator()
        L_0x0010:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()
            com.ibm.icu.impl.Trie2$c r3 = (com.ibm.icu.impl.Trie2.c) r3
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.Object r4 = r0.next()
            com.ibm.icu.impl.Trie2$c r4 = (com.ibm.icu.impl.Trie2.c) r4
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0010
            return r1
        L_0x0030:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0037
            return r1
        L_0x0037:
            int r0 = r5.f12576i
            int r2 = r6.f12576i
            if (r0 != r2) goto L_0x0046
            int r0 = r5.f12575h
            int r6 = r6.f12575h
            if (r0 == r6) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r6 = 1
            return r6
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.Trie2.equals(java.lang.Object):boolean");
    }

    public abstract int f(int i4);

    public abstract int g(char c4);

    public int hashCode() {
        if (this.f12580m == 0) {
            int k4 = k();
            Iterator it = iterator();
            while (it.hasNext()) {
                k4 = i(k4, ((c) it.next()).hashCode());
            }
            if (k4 == 0) {
                k4 = 1;
            }
            this.f12580m = k4;
        }
        return this.f12580m;
    }

    public Iterator iterator() {
        return l(f12567n);
    }

    public Iterator l(f fVar) {
        return new d(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract int m(int i4, int i5, int i6);
}
