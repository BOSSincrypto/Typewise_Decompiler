package com.ibm.icu.util;

import com.ibm.icu.util.CodePointMap;
import java.nio.ByteBuffer;
import kotlin.uuid.Uuid;

public abstract class CodePointTrie extends CodePointMap {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f13159a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f13160b;

    /* renamed from: c  reason: collision with root package name */
    protected final e f13161c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f13162d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f13163e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13164f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13165g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13166h;

    public enum Type {
        FAST,
        SMALL
    }

    public enum ValueWidth {
        BITS_16,
        BITS_32,
        BITS_8
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13169a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ibm.icu.util.CodePointTrie$ValueWidth[] r0 = com.ibm.icu.util.CodePointTrie.ValueWidth.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13169a = r0
                com.ibm.icu.util.CodePointTrie$ValueWidth r1 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_16     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13169a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.util.CodePointTrie$ValueWidth r1 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13169a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ibm.icu.util.CodePointTrie$ValueWidth r1 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_8     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.CodePointTrie.a.<clinit>():void");
        }
    }

    private static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        char[] f13170a;

        b(char[] cArr) {
            super((a) null);
            this.f13170a = cArr;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f13170a.length;
        }

        /* access modifiers changed from: package-private */
        public int b(int i4) {
            return this.f13170a[i4];
        }
    }

    private static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        int[] f13171a;

        c(int[] iArr) {
            super((a) null);
            this.f13171a = iArr;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f13171a.length;
        }

        /* access modifiers changed from: package-private */
        public int b(int i4) {
            return this.f13171a[i4];
        }
    }

    private static final class d extends e {

        /* renamed from: a  reason: collision with root package name */
        byte[] f13172a;

        d(byte[] bArr) {
            super((a) null);
            this.f13172a = bArr;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f13172a.length;
        }

        /* access modifiers changed from: package-private */
        public int b(int i4) {
            return this.f13172a[i4] & 255;
        }
    }

    private static abstract class e {
        private e() {
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract int b(int i4);

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static final class f extends i {

        /* renamed from: i  reason: collision with root package name */
        private final char[] f13173i;

        f(char[] cArr, char[] cArr2, int i4, int i5, int i6) {
            super(cArr, new b(cArr2), i4, i5, i6, (a) null);
            this.f13173i = cArr2;
        }

        public static f q(ByteBuffer byteBuffer) {
            return (f) CodePointTrie.i(Type.FAST, ValueWidth.BITS_16, byteBuffer);
        }

        public final int j(int i4) {
            return this.f13173i[d(i4)];
        }

        public final int p(int i4) {
            return this.f13173i[g(i4)];
        }

        public final int r(int i4) {
            return this.f13173i[o(Type.FAST, i4)];
        }
    }

    public static final class g extends i {

        /* renamed from: i  reason: collision with root package name */
        private final int[] f13174i;

        g(char[] cArr, int[] iArr, int i4, int i5, int i6) {
            super(cArr, new c(iArr), i4, i5, i6, (a) null);
            this.f13174i = iArr;
        }

        public final int j(int i4) {
            return this.f13174i[d(i4)];
        }
    }

    public static final class h extends i {

        /* renamed from: i  reason: collision with root package name */
        private final byte[] f13175i;

        h(char[] cArr, byte[] bArr, int i4, int i5, int i6) {
            super(cArr, new d(bArr), i4, i5, i6, (a) null);
            this.f13175i = bArr;
        }

        public static h p(ByteBuffer byteBuffer) {
            return (h) CodePointTrie.i(Type.FAST, ValueWidth.BITS_8, byteBuffer);
        }

        public final int j(int i4) {
            return this.f13175i[d(i4)] & 255;
        }
    }

    public static abstract class i extends CodePointTrie {
        /* synthetic */ i(char[] cArr, e eVar, int i4, int i5, int i6, a aVar) {
            this(cArr, eVar, i4, i5, i6);
        }

        /* access modifiers changed from: protected */
        public final int d(int i4) {
            if (i4 >= 0) {
                if (i4 <= 65535) {
                    return g(i4);
                }
                if (i4 <= 1114111) {
                    return o(Type.FAST, i4);
                }
            }
            return this.f13162d - 1;
        }

        public final Type k() {
            return Type.FAST;
        }

        private i(char[] cArr, e eVar, int i4, int i5, int i6) {
            super(cArr, eVar, i4, i5, i6, (a) null);
        }
    }

    public static final class j extends m {
        j(char[] cArr, char[] cArr2, int i4, int i5, int i6) {
            super(cArr, new b(cArr2), i4, i5, i6, (a) null);
        }
    }

    public static final class k extends m {
        k(char[] cArr, int[] iArr, int i4, int i5, int i6) {
            super(cArr, new c(iArr), i4, i5, i6, (a) null);
        }
    }

    public static final class l extends m {
        l(char[] cArr, byte[] bArr, int i4, int i5, int i6) {
            super(cArr, new d(bArr), i4, i5, i6, (a) null);
        }
    }

    public static abstract class m extends CodePointTrie {
        /* synthetic */ m(char[] cArr, e eVar, int i4, int i5, int i6, a aVar) {
            this(cArr, eVar, i4, i5, i6);
        }

        /* access modifiers changed from: protected */
        public final int d(int i4) {
            if (i4 >= 0) {
                if (i4 <= 4095) {
                    return g(i4);
                }
                if (i4 <= 1114111) {
                    return o(Type.SMALL, i4);
                }
            }
            return this.f13162d - 1;
        }

        public final Type k() {
            return Type.SMALL;
        }

        private m(char[] cArr, e eVar, int i4, int i5, int i6) {
            super(cArr, eVar, i4, i5, i6, (a) null);
        }
    }

    /* synthetic */ CodePointTrie(char[] cArr, e eVar, int i4, int i5, int i6, a aVar) {
        this(cArr, eVar, i4, i5, i6);
    }

    /* JADX WARNING: type inference failed for: r13v7, types: [com.ibm.icu.util.CodePointTrie] */
    /* JADX WARNING: type inference failed for: r13v10, types: [com.ibm.icu.util.CodePointTrie] */
    /* JADX WARNING: type inference failed for: r13v14, types: [com.ibm.icu.util.CodePointTrie] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.ibm.icu.util.CodePointTrie$j] */
    /* JADX WARNING: type inference failed for: r4v13, types: [com.ibm.icu.util.CodePointTrie$f] */
    /* JADX WARNING: type inference failed for: r4v14, types: [com.ibm.icu.util.CodePointTrie$k] */
    /* JADX WARNING: type inference failed for: r4v15, types: [com.ibm.icu.util.CodePointTrie$g] */
    /* JADX WARNING: type inference failed for: r4v16, types: [com.ibm.icu.util.CodePointTrie$l] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.ibm.icu.util.CodePointTrie$h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa A[Catch:{ all -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011c A[SYNTHETIC, Splitter:B:77:0x011c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ibm.icu.util.CodePointTrie i(com.ibm.icu.util.CodePointTrie.Type r13, com.ibm.icu.util.CodePointTrie.ValueWidth r14, java.nio.ByteBuffer r15) {
        /*
            java.nio.ByteOrder r0 = r15.order()
            int r1 = r15.remaining()     // Catch:{ all -> 0x0023 }
            r2 = 16
            if (r1 < r2) goto L_0x0134
            int r1 = r15.getInt()     // Catch:{ all -> 0x0023 }
            r2 = 862548564(0x33697254, float:5.435352E-8)
            if (r1 == r2) goto L_0x0026
            r2 = 1416784179(0x54726933, float:4.16458814E12)
            if (r1 != r2) goto L_0x001b
            goto L_0x002f
        L_0x001b:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "Buffer does not contain a serialized CodePointTrie"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r13 = move-exception
            goto L_0x013c
        L_0x0026:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0023 }
            if (r0 != r1) goto L_0x002c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0023 }
        L_0x002c:
            r15.order(r1)     // Catch:{ all -> 0x0023 }
        L_0x002f:
            char r1 = r15.getChar()     // Catch:{ all -> 0x0023 }
            char r2 = r15.getChar()     // Catch:{ all -> 0x0023 }
            char r3 = r15.getChar()     // Catch:{ all -> 0x0023 }
            char r8 = r15.getChar()     // Catch:{ all -> 0x0023 }
            char r4 = r15.getChar()     // Catch:{ all -> 0x0023 }
            char r5 = r15.getChar()     // Catch:{ all -> 0x0023 }
            int r6 = r1 >> 6
            r7 = 3
            r6 = r6 & r7
            r9 = 1
            if (r6 == 0) goto L_0x005b
            if (r6 != r9) goto L_0x0053
            com.ibm.icu.util.CodePointTrie$Type r6 = com.ibm.icu.util.CodePointTrie.Type.SMALL     // Catch:{ all -> 0x0023 }
            goto L_0x005d
        L_0x0053:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "CodePointTrie data header has an unsupported type"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x005b:
            com.ibm.icu.util.CodePointTrie$Type r6 = com.ibm.icu.util.CodePointTrie.Type.FAST     // Catch:{ all -> 0x0023 }
        L_0x005d:
            r10 = r1 & 7
            r11 = 2
            if (r10 == 0) goto L_0x0074
            if (r10 == r9) goto L_0x0071
            if (r10 != r11) goto L_0x0069
            com.ibm.icu.util.CodePointTrie$ValueWidth r10 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_8     // Catch:{ all -> 0x0023 }
            goto L_0x0076
        L_0x0069:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "CodePointTrie data header has an unsupported value width"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x0071:
            com.ibm.icu.util.CodePointTrie$ValueWidth r10 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_32     // Catch:{ all -> 0x0023 }
            goto L_0x0076
        L_0x0074:
            com.ibm.icu.util.CodePointTrie$ValueWidth r10 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_16     // Catch:{ all -> 0x0023 }
        L_0x0076:
            r12 = r1 & 56
            if (r12 != 0) goto L_0x012c
            if (r13 != 0) goto L_0x007d
            r13 = r6
        L_0x007d:
            if (r14 != 0) goto L_0x0080
            r14 = r10
        L_0x0080:
            if (r13 != r6) goto L_0x0124
            if (r14 != r10) goto L_0x0124
            r6 = 61440(0xf000, float:8.6096E-41)
            r6 = r6 & r1
            int r6 = r6 << 4
            r3 = r3 | r6
            r1 = r1 & 3840(0xf00, float:5.381E-42)
            int r1 = r1 << 8
            r1 = r1 | r4
            int r10 = r5 << 9
            int r4 = r2 * 2
            com.ibm.icu.util.CodePointTrie$ValueWidth r5 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_16     // Catch:{ all -> 0x0023 }
            if (r14 != r5) goto L_0x009c
            int r5 = r3 * 2
        L_0x009a:
            int r4 = r4 + r5
            goto L_0x00a4
        L_0x009c:
            com.ibm.icu.util.CodePointTrie$ValueWidth r5 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_32     // Catch:{ all -> 0x0023 }
            if (r14 != r5) goto L_0x00a3
            int r5 = r3 * 4
            goto L_0x009a
        L_0x00a3:
            int r4 = r4 + r3
        L_0x00a4:
            int r5 = r15.remaining()     // Catch:{ all -> 0x0023 }
            if (r5 < r4) goto L_0x011c
            r4 = 0
            char[] r5 = com.ibm.icu.impl.d.i(r15, r2, r4)     // Catch:{ all -> 0x0023 }
            int[] r2 = com.ibm.icu.util.CodePointTrie.a.f13169a     // Catch:{ all -> 0x0023 }
            int r14 = r14.ordinal()     // Catch:{ all -> 0x0023 }
            r14 = r2[r14]     // Catch:{ all -> 0x0023 }
            if (r14 == r9) goto L_0x00ff
            if (r14 == r11) goto L_0x00e2
            if (r14 != r7) goto L_0x00da
            byte[] r6 = com.ibm.icu.impl.d.h(r15, r3, r4)     // Catch:{ all -> 0x0023 }
            com.ibm.icu.util.CodePointTrie$Type r14 = com.ibm.icu.util.CodePointTrie.Type.FAST     // Catch:{ all -> 0x0023 }
            if (r13 != r14) goto L_0x00ce
            com.ibm.icu.util.CodePointTrie$h r13 = new com.ibm.icu.util.CodePointTrie$h     // Catch:{ all -> 0x0023 }
            r4 = r13
            r7 = r10
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0023 }
            goto L_0x00d6
        L_0x00ce:
            com.ibm.icu.util.CodePointTrie$l r13 = new com.ibm.icu.util.CodePointTrie$l     // Catch:{ all -> 0x0023 }
            r4 = r13
            r7 = r10
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0023 }
        L_0x00d6:
            r15.order(r0)
            return r13
        L_0x00da:
            java.lang.AssertionError r13 = new java.lang.AssertionError     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "should be unreachable"
            r13.<init>(r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x00e2:
            int[] r6 = com.ibm.icu.impl.d.n(r15, r3, r4)     // Catch:{ all -> 0x0023 }
            com.ibm.icu.util.CodePointTrie$Type r14 = com.ibm.icu.util.CodePointTrie.Type.FAST     // Catch:{ all -> 0x0023 }
            if (r13 != r14) goto L_0x00f3
            com.ibm.icu.util.CodePointTrie$g r13 = new com.ibm.icu.util.CodePointTrie$g     // Catch:{ all -> 0x0023 }
            r4 = r13
            r7 = r10
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0023 }
            goto L_0x00fb
        L_0x00f3:
            com.ibm.icu.util.CodePointTrie$k r13 = new com.ibm.icu.util.CodePointTrie$k     // Catch:{ all -> 0x0023 }
            r4 = r13
            r7 = r10
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0023 }
        L_0x00fb:
            r15.order(r0)
            return r13
        L_0x00ff:
            char[] r6 = com.ibm.icu.impl.d.i(r15, r3, r4)     // Catch:{ all -> 0x0023 }
            com.ibm.icu.util.CodePointTrie$Type r14 = com.ibm.icu.util.CodePointTrie.Type.FAST     // Catch:{ all -> 0x0023 }
            if (r13 != r14) goto L_0x0110
            com.ibm.icu.util.CodePointTrie$f r13 = new com.ibm.icu.util.CodePointTrie$f     // Catch:{ all -> 0x0023 }
            r4 = r13
            r7 = r10
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0023 }
            goto L_0x0118
        L_0x0110:
            com.ibm.icu.util.CodePointTrie$j r13 = new com.ibm.icu.util.CodePointTrie$j     // Catch:{ all -> 0x0023 }
            r4 = r13
            r7 = r10
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0023 }
        L_0x0118:
            r15.order(r0)
            return r13
        L_0x011c:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "Buffer too short for the CodePointTrie data"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x0124:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "CodePointTrie data header has a different type or value width than required"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x012c:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "CodePointTrie data header has unsupported options"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x0134:
            com.ibm.icu.util.ICUUncheckedIOException r13 = new com.ibm.icu.util.ICUUncheckedIOException     // Catch:{ all -> 0x0023 }
            java.lang.String r14 = "Buffer too short for a CodePointTrie header"
            r13.<init>((java.lang.String) r14)     // Catch:{ all -> 0x0023 }
            throw r13     // Catch:{ all -> 0x0023 }
        L_0x013c:
            r15.order(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.CodePointTrie.i(com.ibm.icu.util.CodePointTrie$Type, com.ibm.icu.util.CodePointTrie$ValueWidth, java.nio.ByteBuffer):com.ibm.icu.util.CodePointTrie");
    }

    private final int l(Type type, int i4) {
        int i5;
        char c4;
        int i6 = i4 >> 14;
        if (type == Type.FAST) {
            i5 = i6 + 1020;
        } else {
            i5 = i6 + 64;
        }
        char[] cArr = this.f13160b;
        char c5 = cArr[cArr[i5] + ((i4 >> 9) & 31)];
        int i7 = i4 >> 4;
        char c6 = i7 & 31;
        if ((32768 & c5) == 0) {
            c4 = cArr[c5 + c6];
        } else {
            int i8 = (c5 & 32767) + (i7 & 24) + (c6 >> 3);
            int i9 = i7 & 7;
            c4 = cArr[i8 + 1 + i9] | ((cArr[i8] << ((i9 * 2) + 2)) & 0);
        }
        return c4 + (i4 & 15);
    }

    private static final int n(int i4, int i5, int i6, CodePointMap.d dVar) {
        if (i4 == i5) {
            return i6;
        }
        if (dVar != null) {
            return dVar.a(i4);
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        r3.h(r1, r10 - 1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0128, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0164 A[EDGE_INSN: B:105:0x0164->B:88:0x0164 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0151 A[LOOP:2: B:74:0x0134->B:81:0x0151, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0156 A[EDGE_INSN: B:101:0x0156->B:82:0x0156 ?: BREAK  
    EDGE_INSN: B:102:0x0156->B:82:0x0156 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018b A[LOOP:1: B:45:0x00a4->B:97:0x018b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r24, com.ibm.icu.util.CodePointMap.d r25, com.ibm.icu.util.CodePointMap.b r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            if (r1 < 0) goto L_0x000f
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 >= r1) goto L_0x0012
        L_0x000f:
            r1 = 0
            goto L_0x0193
        L_0x0012:
            int r6 = r0.f13163e
            r7 = 1
            if (r1 < r6) goto L_0x002b
            int r4 = r0.f13162d
            int r4 = r4 + -2
            com.ibm.icu.util.CodePointTrie$e r6 = r0.f13161c
            int r4 = r6.b(r4)
            if (r2 == 0) goto L_0x0027
            int r4 = r2.a(r4)
        L_0x0027:
            r3.h(r1, r5, r4)
            return r7
        L_0x002b:
            int r6 = r0.f13166h
            if (r2 == 0) goto L_0x0033
            int r6 = r2.a(r6)
        L_0x0033:
            com.ibm.icu.util.CodePointTrie$Type r8 = r23.k()
            r10 = r1
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = -1
            r15 = 0
        L_0x003d:
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r10 > r5) goto L_0x005b
            com.ibm.icu.util.CodePointTrie$Type r5 = com.ibm.icu.util.CodePointTrie.Type.FAST
            if (r8 == r5) goto L_0x004a
            r4 = 4095(0xfff, float:5.738E-42)
            if (r10 > r4) goto L_0x005b
        L_0x004a:
            int r4 = r10 >> 6
            r16 = 64
            if (r8 != r5) goto L_0x0053
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x0055
        L_0x0053:
            r5 = r16
        L_0x0055:
            r9 = r5
            r7 = r16
            r5 = r4
            r4 = 0
            goto L_0x00a4
        L_0x005b:
            int r4 = r10 >> 14
            com.ibm.icu.util.CodePointTrie$Type r5 = com.ibm.icu.util.CodePointTrie.Type.FAST
            if (r8 != r5) goto L_0x0064
            int r4 = r4 + 1020
            goto L_0x0066
        L_0x0064:
            int r4 = r4 + 64
        L_0x0066:
            char[] r5 = r0.f13160b
            char r4 = r5[r4]
            int r16 = r10 >> 9
            r16 = r16 & 31
            int r4 = r4 + r16
            char r4 = r5[r4]
            if (r4 != r11) goto L_0x0080
            int r5 = r10 - r1
            r9 = 512(0x200, float:7.175E-43)
            if (r5 < r9) goto L_0x0080
            int r10 = r10 + 512
        L_0x007c:
            r18 = r8
            goto L_0x0164
        L_0x0080:
            int r5 = r0.f13164f
            if (r4 != r5) goto L_0x009a
            if (r12 == 0) goto L_0x008d
            if (r6 == r13) goto L_0x0091
            int r10 = r10 - r7
            r3.h(r1, r10, r13)
            return r7
        L_0x008d:
            int r15 = r0.f13166h
            r13 = r6
            r12 = r7
        L_0x0091:
            int r14 = r0.f13165g
            int r10 = r10 + 512
            r5 = r10 & -512(0xfffffffffffffe00, float:NaN)
            r11 = r4
            r10 = r5
            goto L_0x007c
        L_0x009a:
            int r5 = r10 >> 4
            r5 = r5 & 31
            r9 = 32
            r11 = 16
            r7 = r11
            r11 = r4
        L_0x00a4:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r4 & r18
            if (r18 != 0) goto L_0x00b6
            r18 = r8
            char[] r8 = r0.f13160b
            int r19 = r4 + r5
            char r8 = r8[r19]
            r20 = r4
            goto L_0x00db
        L_0x00b6:
            r18 = r8
            r8 = r4 & 32767(0x7fff, float:4.5916E-41)
            r19 = r5 & -8
            int r8 = r8 + r19
            int r19 = r5 >> 3
            int r8 = r8 + r19
            r19 = r5 & 7
            r20 = r4
            char[] r4 = r0.f13160b
            int r21 = r8 + 1
            char r8 = r4[r8]
            int r22 = r19 * 2
            int r22 = r22 + 2
            int r8 = r8 << r22
            r22 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r22
            int r21 = r21 + r19
            char r4 = r4[r21]
            r8 = r8 | r4
        L_0x00db:
            if (r8 != r14) goto L_0x00e6
            int r4 = r10 - r1
            if (r4 < r7) goto L_0x00e6
            int r10 = r10 + r7
            r19 = r7
            goto L_0x0160
        L_0x00e6:
            int r4 = r7 + -1
            int r14 = r0.f13165g
            if (r8 != r14) goto L_0x0103
            if (r12 == 0) goto L_0x00f6
            if (r6 == r13) goto L_0x00fa
            r14 = 1
            int r10 = r10 - r14
            r3.h(r1, r10, r13)
            return r14
        L_0x00f6:
            int r15 = r0.f13166h
            r13 = r6
            r12 = 1
        L_0x00fa:
            int r10 = r10 + r7
            int r4 = ~r4
            r4 = r4 & r10
            r10 = r4
            r19 = r7
        L_0x0100:
            r14 = r8
            goto L_0x0160
        L_0x0103:
            r14 = r10 & r4
            int r14 = r14 + r8
            r19 = r7
            com.ibm.icu.util.CodePointTrie$e r7 = r0.f13161c
            int r7 = r7.b(r14)
            if (r12 == 0) goto L_0x0129
            if (r7 == r15) goto L_0x0120
            if (r2 == 0) goto L_0x011c
            int r15 = r0.f13166h
            int r15 = n(r7, r15, r6, r2)
            if (r15 == r13) goto L_0x011f
        L_0x011c:
            r17 = 1
            goto L_0x0123
        L_0x011f:
            r15 = r7
        L_0x0120:
            r17 = 1
            goto L_0x0134
        L_0x0123:
            int r10 = r10 + -1
            r3.h(r1, r10, r13)
            return r17
        L_0x0129:
            r17 = 1
            int r12 = r0.f13166h
            int r13 = n(r7, r12, r6, r2)
            r15 = r7
            r12 = r17
        L_0x0134:
            int r7 = r10 + 1
            r21 = r7 & r4
            if (r21 == 0) goto L_0x015e
            r21 = r4
            com.ibm.icu.util.CodePointTrie$e r4 = r0.f13161c
            int r14 = r14 + 1
            int r4 = r4.b(r14)
            if (r4 == r15) goto L_0x015a
            if (r2 == 0) goto L_0x0156
            int r15 = r0.f13166h
            int r15 = n(r4, r15, r6, r2)
            if (r15 == r13) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            r15 = r4
            r10 = r7
            r4 = r21
            goto L_0x0134
        L_0x0156:
            r3.h(r1, r10, r13)
            return r17
        L_0x015a:
            r10 = r7
            r4 = r21
            goto L_0x0120
        L_0x015e:
            r10 = r7
            goto L_0x0100
        L_0x0160:
            int r5 = r5 + 1
            if (r5 < r9) goto L_0x018b
        L_0x0164:
            int r4 = r0.f13163e
            if (r10 < r4) goto L_0x0186
            int r4 = r0.f13162d
            int r4 = r4 + -2
            com.ibm.icu.util.CodePointTrie$e r5 = r0.f13161c
            int r4 = r5.b(r4)
            int r5 = r0.f13166h
            int r2 = n(r4, r5, r6, r2)
            if (r2 == r13) goto L_0x017e
            r4 = -1
            int r5 = r10 + -1
            goto L_0x0181
        L_0x017e:
            r5 = 1114111(0x10ffff, float:1.561202E-39)
        L_0x0181:
            r3.h(r1, r5, r13)
            r7 = 1
            return r7
        L_0x0186:
            r8 = r18
            r7 = 1
            goto L_0x003d
        L_0x018b:
            r8 = r18
            r7 = r19
            r4 = r20
            goto L_0x00a4
        L_0x0193:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.CodePointTrie.c(int, com.ibm.icu.util.CodePointMap$d, com.ibm.icu.util.CodePointMap$b):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract int d(int i4);

    /* access modifiers changed from: protected */
    public final int g(int i4) {
        return this.f13160b[i4 >> 6] + (i4 & '?');
    }

    public int j(int i4) {
        return this.f13161c.b(d(i4));
    }

    public abstract Type k();

    /* access modifiers changed from: protected */
    public final int o(Type type, int i4) {
        if (i4 >= this.f13163e) {
            return this.f13162d - 2;
        }
        return l(type, i4);
    }

    private CodePointTrie(char[] cArr, e eVar, int i4, int i5, int i6) {
        this.f13159a = new int[Uuid.SIZE_BITS];
        this.f13160b = cArr;
        this.f13161c = eVar;
        this.f13162d = eVar.a();
        this.f13163e = i4;
        this.f13164f = i5;
        this.f13165g = i6;
        for (int i7 = 0; i7 < 128; i7++) {
            this.f13159a[i7] = eVar.b(i7);
        }
        int i8 = this.f13162d;
        this.f13166h = eVar.b(i6 >= i8 ? i8 - 2 : i6);
    }
}
