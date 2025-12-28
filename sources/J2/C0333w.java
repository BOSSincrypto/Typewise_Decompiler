package J2;

import H2.f;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.p;

/* renamed from: J2.w  reason: case insensitive filesystem */
public final class C0333w {

    /* renamed from: e  reason: collision with root package name */
    private static final a f750e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f751f = new long[0];

    /* renamed from: a  reason: collision with root package name */
    private final f f752a;

    /* renamed from: b  reason: collision with root package name */
    private final p f753b;

    /* renamed from: c  reason: collision with root package name */
    private long f754c;

    /* renamed from: d  reason: collision with root package name */
    private final long[] f755d;

    /* renamed from: J2.w$a */
    private static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public C0333w(f fVar, p pVar) {
        o.e(fVar, "descriptor");
        o.e(pVar, "readIfAbsent");
        this.f752a = fVar;
        this.f753b = pVar;
        int d4 = fVar.d();
        long j4 = 0;
        if (d4 <= 64) {
            this.f754c = d4 != 64 ? -1 << d4 : j4;
            this.f755d = f751f;
            return;
        }
        this.f754c = 0;
        this.f755d = e(d4);
    }

    private final void b(int i4) {
        int i5 = (i4 >>> 6) - 1;
        long[] jArr = this.f755d;
        jArr[i5] = jArr[i5] | (1 << (i4 & 63));
    }

    private final int c() {
        int length = this.f755d.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            int i6 = i5 * 64;
            long j4 = this.f755d[i4];
            while (j4 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                j4 |= 1 << numberOfTrailingZeros;
                int i7 = numberOfTrailingZeros + i6;
                if (((Boolean) this.f753b.invoke(this.f752a, Integer.valueOf(i7))).booleanValue()) {
                    this.f755d[i4] = j4;
                    return i7;
                }
            }
            this.f755d[i4] = j4;
            i4 = i5;
        }
        return -1;
    }

    private final long[] e(int i4) {
        long[] jArr = new long[((i4 - 1) >>> 6)];
        if ((i4 & 63) != 0) {
            jArr[C0713h.C(jArr)] = -1 << i4;
        }
        return jArr;
    }

    public final void a(int i4) {
        if (i4 < 64) {
            this.f754c |= 1 << i4;
        } else {
            b(i4);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int d4 = this.f752a.d();
        do {
            long j4 = this.f754c;
            if (j4 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                this.f754c |= 1 << numberOfTrailingZeros;
            } else if (d4 > 64) {
                return c();
            } else {
                return -1;
            }
        } while (!((Boolean) this.f753b.invoke(this.f752a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
