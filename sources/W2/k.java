package W2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f1903c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private int f1904a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f1905b = new int[10];

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i4) {
        return this.f1905b[i4];
    }

    public final int b() {
        if ((this.f1904a & 2) != 0) {
            return this.f1905b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f1904a & Uuid.SIZE_BITS) != 0) {
            return this.f1905b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f1904a & 16) != 0) {
            return this.f1905b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i4) {
        if ((this.f1904a & 32) != 0) {
            return this.f1905b[5];
        }
        return i4;
    }

    public final boolean f(int i4) {
        if (((1 << i4) & this.f1904a) != 0) {
            return true;
        }
        return false;
    }

    public final void g(k kVar) {
        o.e(kVar, "other");
        int i4 = 0;
        while (i4 < 10) {
            int i5 = i4 + 1;
            if (kVar.f(i4)) {
                h(i4, kVar.a(i4));
            }
            i4 = i5;
        }
    }

    public final k h(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.f1905b;
            if (i4 < iArr.length) {
                this.f1904a = (1 << i4) | this.f1904a;
                iArr[i4] = i5;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f1904a);
    }
}
