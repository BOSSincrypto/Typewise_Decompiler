package c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.C0707b;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class n extends C0707b implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public static final a f7671c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final ByteString[] f7672a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f7673b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private final void a(long j4, C0500b bVar, int i4, List list, int i5, int i6, List list2) {
            int i7;
            int i8;
            int i9;
            int i10;
            C0500b bVar2;
            C0500b bVar3 = bVar;
            int i11 = i4;
            List list3 = list;
            int i12 = i5;
            int i13 = i6;
            List list4 = list2;
            if (i12 < i13) {
                int i14 = i12;
                while (i14 < i13) {
                    if (((ByteString) list3.get(i14)).size() >= i11) {
                        i14++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                ByteString byteString = (ByteString) list.get(i5);
                ByteString byteString2 = (ByteString) list3.get(i13 - 1);
                int i15 = -1;
                if (i11 == byteString.size()) {
                    int intValue = ((Number) list4.get(i12)).intValue();
                    int i16 = i12 + 1;
                    i7 = i16;
                    i8 = intValue;
                    byteString = (ByteString) list3.get(i16);
                } else {
                    i7 = i12;
                    i8 = -1;
                }
                if (byteString.getByte(i11) != byteString2.getByte(i11)) {
                    int i17 = 1;
                    for (int i18 = i7 + 1; i18 < i13; i18++) {
                        if (((ByteString) list3.get(i18 - 1)).getByte(i11) != ((ByteString) list3.get(i18)).getByte(i11)) {
                            i17++;
                        }
                    }
                    long c4 = j4 + c(bVar3) + ((long) 2) + ((long) (i17 * 2));
                    bVar3.w(i17);
                    bVar3.w(i8);
                    for (int i19 = i7; i19 < i13; i19++) {
                        byte b4 = ((ByteString) list3.get(i19)).getByte(i11);
                        if (i19 == i7 || b4 != ((ByteString) list3.get(i19 - 1)).getByte(i11)) {
                            bVar3.w(b4 & 255);
                        }
                    }
                    C0500b bVar4 = new C0500b();
                    while (i7 < i13) {
                        byte b5 = ((ByteString) list3.get(i7)).getByte(i11);
                        int i20 = i7 + 1;
                        int i21 = i20;
                        while (true) {
                            if (i21 >= i13) {
                                i9 = i13;
                                break;
                            } else if (b5 != ((ByteString) list3.get(i21)).getByte(i11)) {
                                i9 = i21;
                                break;
                            } else {
                                i21++;
                            }
                        }
                        if (i20 == i9 && i11 + 1 == ((ByteString) list3.get(i7)).size()) {
                            bVar3.w(((Number) list4.get(i7)).intValue());
                            i10 = i9;
                            bVar2 = bVar4;
                        } else {
                            bVar3.w(((int) (c4 + c(bVar4))) * i15);
                            i10 = i9;
                            bVar2 = bVar4;
                            a(c4, bVar4, i11 + 1, list, i7, i9, list2);
                        }
                        bVar4 = bVar2;
                        i7 = i10;
                        i15 = -1;
                    }
                    bVar3.D0(bVar4);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i22 = 0;
                int i23 = i11;
                while (i23 < min && byteString.getByte(i23) == byteString2.getByte(i23)) {
                    i22++;
                    i23++;
                }
                long c5 = j4 + c(bVar3) + ((long) 2) + ((long) i22) + 1;
                bVar3.w(-i22);
                bVar3.w(i8);
                int i24 = i22 + i11;
                while (i11 < i24) {
                    bVar3.w(byteString.getByte(i11) & 255);
                    i11++;
                }
                if (i7 + 1 != i13) {
                    C0500b bVar5 = new C0500b();
                    bVar3.w(((int) (c(bVar5) + c5)) * -1);
                    a(c5, bVar5, i24, list, i7, i6, list2);
                    bVar3.D0(bVar5);
                } else if (i24 == ((ByteString) list3.get(i7)).size()) {
                    bVar3.w(((Number) list4.get(i7)).intValue());
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        static /* synthetic */ void b(a aVar, long j4, C0500b bVar, int i4, List list, int i5, int i6, List list2, int i7, Object obj) {
            long j5;
            int i8;
            int i9;
            int i10;
            if ((i7 & 1) != 0) {
                j5 = 0;
            } else {
                j5 = j4;
            }
            if ((i7 & 4) != 0) {
                i8 = 0;
            } else {
                i8 = i4;
            }
            if ((i7 & 16) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i7 & 32) != 0) {
                i10 = list.size();
            } else {
                i10 = i6;
            }
            aVar.a(j5, bVar, i8, list, i9, i10, list2);
        }

        private final long c(C0500b bVar) {
            return bVar.w0() / ((long) 4);
        }

        public final n d(ByteString... byteStringArr) {
            ByteString[] byteStringArr2 = byteStringArr;
            o.e(byteStringArr2, "byteStrings");
            int i4 = 0;
            if (byteStringArr2.length == 0) {
                return new n(new ByteString[0], new int[]{0, -1}, (i) null);
            }
            List d02 = C0713h.d0(byteStringArr);
            C0718m.w(d02);
            ArrayList arrayList = new ArrayList(byteStringArr2.length);
            for (ByteString byteString : byteStringArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List o4 = C0718m.o(Arrays.copyOf(numArr, numArr.length));
                int length = byteStringArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    o4.set(C0718m.i(d02, byteStringArr2[i5], 0, 0, 6, (Object) null), Integer.valueOf(i6));
                    i5++;
                    i6++;
                }
                if (((ByteString) d02.get(0)).size() > 0) {
                    int i7 = 0;
                    while (i7 < d02.size()) {
                        ByteString byteString2 = (ByteString) d02.get(i7);
                        int i8 = i7 + 1;
                        int i9 = i8;
                        while (i9 < d02.size()) {
                            ByteString byteString3 = (ByteString) d02.get(i9);
                            if (!byteString3.startsWith(byteString2)) {
                                continue;
                                break;
                            } else if (byteString3.size() == byteString2.size()) {
                                throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                            } else if (((Number) o4.get(i9)).intValue() > ((Number) o4.get(i7)).intValue()) {
                                d02.remove(i9);
                                o4.remove(i9);
                            } else {
                                i9++;
                            }
                        }
                        i7 = i8;
                    }
                    C0500b bVar = new C0500b();
                    b(this, 0, bVar, 0, d02, 0, 0, o4, 53, (Object) null);
                    int[] iArr = new int[((int) c(bVar))];
                    while (!bVar.H()) {
                        iArr[i4] = bVar.readInt();
                        i4++;
                    }
                    Object[] copyOf = Arrays.copyOf(byteStringArr2, byteStringArr2.length);
                    o.d(copyOf, "copyOf(this, size)");
                    return new n((ByteString[]) copyOf, iArr, (i) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        private a() {
        }
    }

    public /* synthetic */ n(ByteString[] byteStringArr, int[] iArr, i iVar) {
        this(byteStringArr, iArr);
    }

    public /* bridge */ boolean b(ByteString byteString) {
        return super.contains(byteString);
    }

    /* renamed from: c */
    public ByteString get(int i4) {
        return this.f7672a[i4];
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ByteString)) {
            return false;
        }
        return b((ByteString) obj);
    }

    public final ByteString[] d() {
        return this.f7672a;
    }

    public final int[] e() {
        return this.f7673b;
    }

    public /* bridge */ int f(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public /* bridge */ int g(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    public int getSize() {
        return this.f7672a.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return f((ByteString) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return g((ByteString) obj);
    }

    private n(ByteString[] byteStringArr, int[] iArr) {
        this.f7672a = byteStringArr;
        this.f7673b = iArr;
    }
}
