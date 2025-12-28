package W0;

import W0.a;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

public class e implements a {

    /* renamed from: u  reason: collision with root package name */
    private static final String f1677u = "e";

    /* renamed from: a  reason: collision with root package name */
    private int[] f1678a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f1679b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0031a f1680c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f1681d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f1682e;

    /* renamed from: f  reason: collision with root package name */
    private short[] f1683f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f1684g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f1685h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f1686i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f1687j;

    /* renamed from: k  reason: collision with root package name */
    private int f1688k;

    /* renamed from: l  reason: collision with root package name */
    private c f1689l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f1690m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1691n;

    /* renamed from: o  reason: collision with root package name */
    private int f1692o;

    /* renamed from: p  reason: collision with root package name */
    private int f1693p;

    /* renamed from: q  reason: collision with root package name */
    private int f1694q;

    /* renamed from: r  reason: collision with root package name */
    private int f1695r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f1696s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap.Config f1697t;

    public e(a.C0031a aVar, c cVar, ByteBuffer byteBuffer, int i4) {
        this(aVar);
        q(cVar, byteBuffer, i4);
    }

    private int i(int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i4; i12 < this.f1693p + i4; i12++) {
            byte[] bArr = this.f1686i;
            if (i12 >= bArr.length || i12 >= i5) {
                break;
            }
            int i13 = this.f1678a[bArr[i12] & 255];
            if (i13 != 0) {
                i7 += (i13 >> 24) & 255;
                i8 += (i13 >> 16) & 255;
                i9 += (i13 >> 8) & 255;
                i10 += i13 & 255;
                i11++;
            }
        }
        int i14 = i4 + i6;
        for (int i15 = i14; i15 < this.f1693p + i14; i15++) {
            byte[] bArr2 = this.f1686i;
            if (i15 >= bArr2.length || i15 >= i5) {
                break;
            }
            int i16 = this.f1678a[bArr2[i15] & 255];
            if (i16 != 0) {
                i7 += (i16 >> 24) & 255;
                i8 += (i16 >> 16) & 255;
                i9 += (i16 >> 8) & 255;
                i10 += i16 & 255;
                i11++;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        return ((i7 / i11) << 24) | ((i8 / i11) << 16) | ((i9 / i11) << 8) | (i10 / i11);
    }

    private void j(b bVar) {
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        int i8;
        b bVar2 = bVar;
        int[] iArr = this.f1687j;
        int i9 = bVar2.f1652d;
        int i10 = this.f1693p;
        int i11 = i9 / i10;
        int i12 = bVar2.f1650b / i10;
        int i13 = bVar2.f1651c / i10;
        int i14 = bVar2.f1649a / i10;
        if (this.f1688k == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i15 = this.f1695r;
        int i16 = this.f1694q;
        byte[] bArr = this.f1686i;
        int[] iArr2 = this.f1678a;
        Boolean bool = this.f1696s;
        int i17 = 8;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1;
        while (i19 < i11) {
            Boolean bool2 = bool;
            if (bVar2.f1653e) {
                if (i18 >= i11) {
                    int i21 = i20 + 1;
                    i4 = i11;
                    if (i21 == 2) {
                        i18 = 4;
                    } else if (i21 == 3) {
                        i17 = 4;
                        i20 = i21;
                        i18 = 2;
                    } else if (i21 == 4) {
                        i20 = i21;
                        i18 = 1;
                        i17 = 2;
                    }
                    i20 = i21;
                } else {
                    i4 = i11;
                }
                i5 = i18 + i17;
            } else {
                i4 = i11;
                i5 = i18;
                i18 = i19;
            }
            int i22 = i18 + i12;
            if (i10 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i22 < i16) {
                int i23 = i22 * i15;
                int i24 = i23 + i14;
                int i25 = i24 + i13;
                int i26 = i23 + i15;
                if (i26 < i25) {
                    i25 = i26;
                }
                i6 = i5;
                int i27 = i19 * i10 * bVar2.f1651c;
                if (z5) {
                    int i28 = i24;
                    while (i28 < i25) {
                        int i29 = i12;
                        int i30 = iArr2[bArr[i27] & 255];
                        if (i30 != 0) {
                            iArr[i28] = i30;
                        } else if (z3 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i27 += i10;
                        i28++;
                        i12 = i29;
                    }
                } else {
                    i8 = i12;
                    int i31 = ((i25 - i24) * i10) + i27;
                    int i32 = i24;
                    while (true) {
                        i7 = i13;
                        if (i32 >= i25) {
                            break;
                        }
                        int i33 = i(i27, i31, bVar2.f1651c);
                        if (i33 != 0) {
                            iArr[i32] = i33;
                        } else if (z3 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i27 += i10;
                        i32++;
                        i13 = i7;
                    }
                    bool = bool2;
                    i19++;
                    i12 = i8;
                    i11 = i4;
                    i13 = i7;
                    i18 = i6;
                }
            } else {
                i6 = i5;
            }
            i8 = i12;
            i7 = i13;
            bool = bool2;
            i19++;
            i12 = i8;
            i11 = i4;
            i13 = i7;
            i18 = i6;
        }
        Boolean bool3 = bool;
        if (this.f1696s == null) {
            if (bool3 == null) {
                z4 = false;
            } else {
                z4 = bool3.booleanValue();
            }
            this.f1696s = Boolean.valueOf(z4);
        }
    }

    private void k(b bVar) {
        boolean z3;
        boolean z4;
        b bVar2 = bVar;
        int[] iArr = this.f1687j;
        int i4 = bVar2.f1652d;
        int i5 = bVar2.f1650b;
        int i6 = bVar2.f1651c;
        int i7 = bVar2.f1649a;
        if (this.f1688k == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i8 = this.f1695r;
        byte[] bArr = this.f1686i;
        int[] iArr2 = this.f1678a;
        int i9 = 0;
        byte b4 = -1;
        while (i9 < i4) {
            int i10 = (i9 + i5) * i8;
            int i11 = i10 + i7;
            int i12 = i11 + i6;
            int i13 = i10 + i8;
            if (i13 < i12) {
                i12 = i13;
            }
            int i14 = bVar2.f1651c * i9;
            int i15 = i11;
            while (i15 < i12) {
                byte b5 = bArr[i14];
                int i16 = i4;
                byte b6 = b5 & 255;
                if (b6 != b4) {
                    int i17 = iArr2[b6];
                    if (i17 != 0) {
                        iArr[i15] = i17;
                    } else {
                        b4 = b5;
                    }
                }
                i14++;
                i15++;
                b bVar3 = bVar;
                i4 = i16;
            }
            int i18 = i4;
            i9++;
            bVar2 = bVar;
        }
        Boolean bool = this.f1696s;
        if ((bool == null || !bool.booleanValue()) && (this.f1696s != null || !z3 || b4 == -1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f1696s = Boolean.valueOf(z4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(W0.b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f1681d
            int r3 = r1.f1658j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0017
            W0.c r1 = r0.f1689l
            int r2 = r1.f1665f
            int r1 = r1.f1666g
        L_0x0015:
            int r2 = r2 * r1
            goto L_0x001c
        L_0x0017:
            int r2 = r1.f1651c
            int r1 = r1.f1652d
            goto L_0x0015
        L_0x001c:
            byte[] r1 = r0.f1686i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            W0.a$a r1 = r0.f1680c
            byte[] r1 = r1.c(r2)
            r0.f1686i = r1
        L_0x002b:
            byte[] r1 = r0.f1686i
            short[] r3 = r0.f1683f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f1683f = r3
        L_0x0037:
            short[] r3 = r0.f1683f
            byte[] r5 = r0.f1684g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f1684g = r5
        L_0x0041:
            byte[] r5 = r0.f1684g
            byte[] r6 = r0.f1685h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f1685h = r6
        L_0x004d:
            byte[] r6 = r0.f1685h
            int r7 = r28.p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f1682e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r24 = r15
        L_0x0083:
            if (r13 >= r2) goto L_0x0090
            if (r16 != 0) goto L_0x0097
            int r16 = r28.o()
            if (r16 > 0) goto L_0x0095
            r3 = 3
            r0.f1692o = r3
        L_0x0090:
            r13 = r20
            r0 = 0
            goto L_0x014f
        L_0x0095:
            r17 = 0
        L_0x0097:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00b1:
            if (r4 < r15) goto L_0x0139
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c5
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00b1
        L_0x00c5:
            if (r11 != r10) goto L_0x00dc
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00dc:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00f0
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00b1
        L_0x00f0:
            if (r11 < r8) goto L_0x00f9
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00fa
        L_0x00f9:
            r7 = r11
        L_0x00fa:
            if (r7 < r9) goto L_0x0105
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00fa
        L_0x0105:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x010c:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0119
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x010c
        L_0x0119:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x0130
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x0130
            if (r8 >= r6) goto L_0x0130
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x0130:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00b1
        L_0x0139:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014f:
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.e.l(W0.b):void");
    }

    private Bitmap n() {
        Bitmap.Config config;
        Boolean bool = this.f1696s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f1697t;
        }
        Bitmap a4 = this.f1680c.a(this.f1695r, this.f1694q, config);
        a4.setHasAlpha(true);
        return a4;
    }

    private int o() {
        int p4 = p();
        if (p4 <= 0) {
            return p4;
        }
        ByteBuffer byteBuffer = this.f1681d;
        byteBuffer.get(this.f1682e, 0, Math.min(p4, byteBuffer.remaining()));
        return p4;
    }

    private int p() {
        return this.f1681d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i4;
        int i5;
        Bitmap bitmap;
        int[] iArr = this.f1687j;
        int i6 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f1690m;
            if (bitmap2 != null) {
                this.f1680c.f(bitmap2);
            }
            this.f1690m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f1655g == 3 && this.f1690m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i5 = bVar2.f1655g) > 0) {
            if (i5 == 2) {
                if (!bVar.f1654f) {
                    c cVar = this.f1689l;
                    int i7 = cVar.f1671l;
                    if (bVar.f1659k == null || cVar.f1669j != bVar.f1656h) {
                        i6 = i7;
                    }
                }
                int i8 = bVar2.f1652d;
                int i9 = this.f1693p;
                int i10 = i8 / i9;
                int i11 = bVar2.f1650b / i9;
                int i12 = bVar2.f1651c / i9;
                int i13 = bVar2.f1649a / i9;
                int i14 = this.f1695r;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr[i18] = i6;
                    }
                    i15 += this.f1695r;
                }
            } else if (i5 == 3 && (bitmap = this.f1690m) != null) {
                int i19 = this.f1695r;
                bitmap.getPixels(iArr, 0, i19, 0, 0, i19, this.f1694q);
            }
        }
        l(bVar);
        if (bVar.f1653e || this.f1693p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f1691n && ((i4 = bVar.f1655g) == 0 || i4 == 1)) {
            if (this.f1690m == null) {
                this.f1690m = n();
            }
            Bitmap bitmap3 = this.f1690m;
            int i20 = this.f1695r;
            bitmap3.setPixels(iArr, 0, i20, 0, 0, i20, this.f1694q);
        }
        Bitmap n4 = n();
        int i21 = this.f1695r;
        n4.setPixels(iArr, 0, i21, 0, 0, i21, this.f1694q);
        return n4;
    }

    public int a() {
        return this.f1688k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b A[Catch:{ all -> 0x000e }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c2 A[Catch:{ all -> 0x000e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap b() {
        /*
            r8 = this;
            monitor-enter(r8)
            W0.c r0 = r8.f1689l     // Catch:{ all -> 0x000e }
            int r0 = r0.f1662c     // Catch:{ all -> 0x000e }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x0011
            int r0 = r8.f1688k     // Catch:{ all -> 0x000e }
            if (r0 >= 0) goto L_0x0036
            goto L_0x0011
        L_0x000e:
            r0 = move-exception
            goto L_0x00d3
        L_0x0011:
            java.lang.String r0 = f1677u     // Catch:{ all -> 0x000e }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r0.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x000e }
            W0.c r3 = r8.f1689l     // Catch:{ all -> 0x000e }
            int r3 = r3.f1662c     // Catch:{ all -> 0x000e }
            r0.append(r3)     // Catch:{ all -> 0x000e }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x000e }
            int r3 = r8.f1688k     // Catch:{ all -> 0x000e }
            r0.append(r3)     // Catch:{ all -> 0x000e }
        L_0x0034:
            r8.f1692o = r2     // Catch:{ all -> 0x000e }
        L_0x0036:
            int r0 = r8.f1692o     // Catch:{ all -> 0x000e }
            r3 = 0
            if (r0 == r2) goto L_0x00ba
            r4 = 2
            if (r0 != r4) goto L_0x0040
            goto L_0x00ba
        L_0x0040:
            r0 = 0
            r8.f1692o = r0     // Catch:{ all -> 0x000e }
            byte[] r5 = r8.f1682e     // Catch:{ all -> 0x000e }
            if (r5 != 0) goto L_0x0051
            W0.a$a r5 = r8.f1680c     // Catch:{ all -> 0x000e }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.c(r6)     // Catch:{ all -> 0x000e }
            r8.f1682e = r5     // Catch:{ all -> 0x000e }
        L_0x0051:
            W0.c r5 = r8.f1689l     // Catch:{ all -> 0x000e }
            java.util.List r5 = r5.f1664e     // Catch:{ all -> 0x000e }
            int r6 = r8.f1688k     // Catch:{ all -> 0x000e }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x000e }
            W0.b r5 = (W0.b) r5     // Catch:{ all -> 0x000e }
            int r6 = r8.f1688k     // Catch:{ all -> 0x000e }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x006d
            W0.c r7 = r8.f1689l     // Catch:{ all -> 0x000e }
            java.util.List r7 = r7.f1664e     // Catch:{ all -> 0x000e }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x000e }
            W0.b r6 = (W0.b) r6     // Catch:{ all -> 0x000e }
            goto L_0x006e
        L_0x006d:
            r6 = r3
        L_0x006e:
            int[] r7 = r5.f1659k     // Catch:{ all -> 0x000e }
            if (r7 == 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            W0.c r7 = r8.f1689l     // Catch:{ all -> 0x000e }
            int[] r7 = r7.f1660a     // Catch:{ all -> 0x000e }
        L_0x0077:
            r8.f1678a = r7     // Catch:{ all -> 0x000e }
            if (r7 != 0) goto L_0x0096
            java.lang.String r0 = f1677u     // Catch:{ all -> 0x000e }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0092
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r0.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x000e }
            int r1 = r8.f1688k     // Catch:{ all -> 0x000e }
            r0.append(r1)     // Catch:{ all -> 0x000e }
        L_0x0092:
            r8.f1692o = r2     // Catch:{ all -> 0x000e }
            monitor-exit(r8)
            return r3
        L_0x0096:
            boolean r1 = r5.f1654f     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x00b4
            int[] r1 = r8.f1679b     // Catch:{ all -> 0x000e }
            int r2 = r7.length     // Catch:{ all -> 0x000e }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x000e }
            int[] r1 = r8.f1679b     // Catch:{ all -> 0x000e }
            r8.f1678a = r1     // Catch:{ all -> 0x000e }
            int r2 = r5.f1656h     // Catch:{ all -> 0x000e }
            r1[r2] = r0     // Catch:{ all -> 0x000e }
            int r0 = r5.f1655g     // Catch:{ all -> 0x000e }
            if (r0 != r4) goto L_0x00b4
            int r0 = r8.f1688k     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x00b4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x000e }
            r8.f1696s = r0     // Catch:{ all -> 0x000e }
        L_0x00b4:
            android.graphics.Bitmap r0 = r8.r(r5, r6)     // Catch:{ all -> 0x000e }
            monitor-exit(r8)
            return r0
        L_0x00ba:
            java.lang.String r0 = f1677u     // Catch:{ all -> 0x000e }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r0.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x000e }
            int r1 = r8.f1692o     // Catch:{ all -> 0x000e }
            r0.append(r1)     // Catch:{ all -> 0x000e }
        L_0x00d1:
            monitor-exit(r8)
            return r3
        L_0x00d3:
            monitor-exit(r8)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.e.b():android.graphics.Bitmap");
    }

    public void c() {
        this.f1688k = (this.f1688k + 1) % this.f1689l.f1662c;
    }

    public void clear() {
        this.f1689l = null;
        byte[] bArr = this.f1686i;
        if (bArr != null) {
            this.f1680c.b(bArr);
        }
        int[] iArr = this.f1687j;
        if (iArr != null) {
            this.f1680c.d(iArr);
        }
        Bitmap bitmap = this.f1690m;
        if (bitmap != null) {
            this.f1680c.f(bitmap);
        }
        this.f1690m = null;
        this.f1681d = null;
        this.f1696s = null;
        byte[] bArr2 = this.f1682e;
        if (bArr2 != null) {
            this.f1680c.b(bArr2);
        }
    }

    public int d() {
        return this.f1689l.f1662c;
    }

    public int e() {
        int i4;
        if (this.f1689l.f1662c <= 0 || (i4 = this.f1688k) < 0) {
            return 0;
        }
        return m(i4);
    }

    public int f() {
        return this.f1681d.limit() + this.f1686i.length + (this.f1687j.length * 4);
    }

    public void g(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f1697t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public ByteBuffer getData() {
        return this.f1681d;
    }

    public void h() {
        this.f1688k = -1;
    }

    public int m(int i4) {
        if (i4 >= 0) {
            c cVar = this.f1689l;
            if (i4 < cVar.f1662c) {
                return ((b) cVar.f1664e.get(i4)).f1657i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i4) {
        if (i4 > 0) {
            try {
                int highestOneBit = Integer.highestOneBit(i4);
                this.f1692o = 0;
                this.f1689l = cVar;
                this.f1688k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f1681d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f1681d.order(ByteOrder.LITTLE_ENDIAN);
                this.f1691n = false;
                Iterator it = cVar.f1664e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f1655g == 3) {
                            this.f1691n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f1693p = highestOneBit;
                int i5 = cVar.f1665f;
                this.f1695r = i5 / highestOneBit;
                int i6 = cVar.f1666g;
                this.f1694q = i6 / highestOneBit;
                this.f1686i = this.f1680c.c(i5 * i6);
                this.f1687j = this.f1680c.e(this.f1695r * this.f1694q);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
        }
    }

    public e(a.C0031a aVar) {
        this.f1679b = new int[256];
        this.f1697t = Bitmap.Config.ARGB_8888;
        this.f1680c = aVar;
        this.f1689l = new c();
    }
}
