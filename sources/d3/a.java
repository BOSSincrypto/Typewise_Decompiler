package d3;

import c3.A;
import c3.C0500b;
import c3.n;
import c3.r;
import kotlin.jvm.internal.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f13558a = A.a("0123456789abcdef");

    public static final byte[] a() {
        return f13558a;
    }

    public static final String b(C0500b bVar, long j4) {
        o.e(bVar, "<this>");
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (bVar.G(j5) == ((byte) 13)) {
                String t02 = bVar.t0(j5);
                bVar.b(2);
                return t02;
            }
        }
        String t03 = bVar.t0(j4);
        bVar.b(1);
        return t03;
    }

    public static final int c(C0500b bVar, n nVar, boolean z3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        r rVar;
        int i7;
        C0500b bVar2 = bVar;
        o.e(bVar2, "<this>");
        o.e(nVar, "options");
        r rVar2 = bVar2.f7648a;
        if (rVar2 != null) {
            byte[] bArr = rVar2.f7683a;
            int i8 = rVar2.f7684b;
            int i9 = rVar2.f7685c;
            int[] e4 = nVar.e();
            r rVar3 = rVar2;
            int i10 = -1;
            int i11 = 0;
            loop0:
            while (true) {
                int i12 = i11 + 1;
                int i13 = e4[i11];
                int i14 = i11 + 2;
                int i15 = e4[i12];
                if (i15 != -1) {
                    i10 = i15;
                }
                if (rVar3 == null) {
                    break;
                }
                if (i13 < 0) {
                    int i16 = i14 + (i13 * -1);
                    while (true) {
                        int i17 = i8 + 1;
                        int i18 = i14 + 1;
                        if ((bArr[i8] & 255) != e4[i14]) {
                            return i10;
                        }
                        if (i18 == i16) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i17 == i9) {
                            o.b(rVar3);
                            r rVar4 = rVar3.f7688f;
                            o.b(rVar4);
                            i7 = rVar4.f7684b;
                            byte[] bArr2 = rVar4.f7683a;
                            i6 = rVar4.f7685c;
                            if (rVar4 == rVar2) {
                                if (!z4) {
                                    break loop0;
                                }
                                bArr = bArr2;
                                rVar = null;
                            } else {
                                byte[] bArr3 = bArr2;
                                rVar = rVar4;
                                bArr = bArr3;
                            }
                        } else {
                            rVar = rVar3;
                            i6 = i9;
                            i7 = i17;
                        }
                        if (z4) {
                            i5 = e4[i18];
                            i4 = i7;
                            i9 = i6;
                            rVar3 = rVar;
                            break;
                        }
                        i8 = i7;
                        i9 = i6;
                        rVar3 = rVar;
                        i14 = i18;
                    }
                } else {
                    i4 = i8 + 1;
                    byte b4 = bArr[i8] & 255;
                    int i19 = i14 + i13;
                    while (i14 != i19) {
                        if (b4 == e4[i14]) {
                            i5 = e4[i14 + i13];
                            if (i4 == i9) {
                                rVar3 = rVar3.f7688f;
                                o.b(rVar3);
                                i4 = rVar3.f7684b;
                                bArr = rVar3.f7683a;
                                i9 = rVar3.f7685c;
                                if (rVar3 == rVar2) {
                                    rVar3 = null;
                                }
                            }
                        } else {
                            i14++;
                        }
                    }
                    return i10;
                }
                if (i5 >= 0) {
                    return i5;
                }
                i11 = -i5;
                i8 = i4;
            }
            if (z3) {
                return -2;
            }
            return i10;
        } else if (z3) {
            return -2;
        } else {
            return -1;
        }
    }

    public static /* synthetic */ int d(C0500b bVar, n nVar, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return c(bVar, nVar, z3);
    }
}
