package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import p2.C0853b;
import x2.C0938c;

public abstract class Random {
    public static final Default Default = new Default((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Random f13913a = C0853b.f15887a.b();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(i iVar) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        public int nextBits(int i4) {
            return Random.f13913a.nextBits(i4);
        }

        public boolean nextBoolean() {
            return Random.f13913a.nextBoolean();
        }

        public byte[] nextBytes(byte[] bArr) {
            o.e(bArr, "array");
            return Random.f13913a.nextBytes(bArr);
        }

        public double nextDouble() {
            return Random.f13913a.nextDouble();
        }

        public float nextFloat() {
            return Random.f13913a.nextFloat();
        }

        public int nextInt() {
            return Random.f13913a.nextInt();
        }

        public long nextLong() {
            return Random.f13913a.nextLong();
        }

        private Default() {
        }

        public byte[] nextBytes(int i4) {
            return Random.f13913a.nextBytes(i4);
        }

        public double nextDouble(double d4) {
            return Random.f13913a.nextDouble(d4);
        }

        public int nextInt(int i4) {
            return Random.f13913a.nextInt(i4);
        }

        public long nextLong(long j4) {
            return Random.f13913a.nextLong(j4);
        }

        public byte[] nextBytes(byte[] bArr, int i4, int i5) {
            o.e(bArr, "array");
            return Random.f13913a.nextBytes(bArr, i4, i5);
        }

        public double nextDouble(double d4, double d5) {
            return Random.f13913a.nextDouble(d4, d5);
        }

        public int nextInt(int i4, int i5) {
            return Random.f13913a.nextInt(i4, i5);
        }

        public long nextLong(long j4, long j5) {
            return Random.f13913a.nextLong(j4, j5);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return random.nextBytes(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i4);

    public abstract boolean nextBoolean();

    public abstract byte[] nextBytes(byte[] bArr);

    public byte[] nextBytes(byte[] bArr, int i4, int i5) {
        o.e(bArr, "array");
        if (i4 < 0 || i4 > bArr.length || i5 < 0 || i5 > bArr.length) {
            throw new IllegalArgumentException(("fromIndex (" + i4 + ") or toIndex (" + i5 + ") are out of range: 0.." + bArr.length + '.').toString());
        } else if (i4 <= i5) {
            int i6 = (i5 - i4) / 4;
            for (int i7 = 0; i7 < i6; i7++) {
                int nextInt = nextInt();
                bArr[i4] = (byte) nextInt;
                bArr[i4 + 1] = (byte) (nextInt >>> 8);
                bArr[i4 + 2] = (byte) (nextInt >>> 16);
                bArr[i4 + 3] = (byte) (nextInt >>> 24);
                i4 += 4;
            }
            int i8 = i5 - i4;
            int nextBits = nextBits(i8 * 8);
            for (int i9 = 0; i9 < i8; i9++) {
                bArr[i4 + i9] = (byte) (nextBits >>> (i9 * 8));
            }
            return bArr;
        } else {
            throw new IllegalArgumentException(("fromIndex (" + i4 + ") must be not greater than toIndex (" + i5 + ").").toString());
        }
    }

    public abstract double nextDouble();

    public double nextDouble(double d4) {
        return nextDouble(0.0d, d4);
    }

    public abstract float nextFloat();

    public abstract int nextInt();

    public abstract int nextInt(int i4);

    public int nextInt(int i4, int i5) {
        int i6;
        int nextInt;
        int i7;
        C0938c.c(i4, i5);
        int i8 = i5 - i4;
        if (i8 > 0 || i8 == Integer.MIN_VALUE) {
            if (((-i8) & i8) == i8) {
                i6 = nextBits(C0938c.e(i8));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i7 = nextInt % i8;
                } while ((nextInt - i7) + (i8 - 1) < 0);
                i6 = i7;
            }
            return i4 + i6;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (i4 <= nextInt2 && nextInt2 < i5) {
                return nextInt2;
            }
        }
    }

    public abstract long nextLong();

    public long nextLong(long j4) {
        return nextLong(0, j4);
    }

    public double nextDouble(double d4, double d5) {
        double d6;
        C0938c.b(d4, d5);
        double d7 = d5 - d4;
        if (!Double.isInfinite(d7) || Double.isInfinite(d4) || Double.isNaN(d4) || Double.isInfinite(d5) || Double.isNaN(d5)) {
            d6 = d4 + (nextDouble() * d7);
        } else {
            double d8 = (double) 2;
            double nextDouble = nextDouble() * ((d5 / d8) - (d4 / d8));
            d6 = d4 + nextDouble + nextDouble;
        }
        return d6 >= d5 ? Math.nextAfter(d5, Double.NEGATIVE_INFINITY) : d6;
    }

    public long nextLong(long j4, long j5) {
        long j6;
        long nextLong;
        long j7;
        int nextInt;
        C0938c.d(j4, j5);
        long j8 = j5 - j4;
        if (j8 > 0) {
            if (((-j8) & j8) == j8) {
                int i4 = (int) j8;
                int i5 = (int) (j8 >>> 32);
                if (i4 != 0) {
                    nextInt = nextBits(C0938c.e(i4));
                } else if (i5 == 1) {
                    nextInt = nextInt();
                } else {
                    j6 = (((long) nextBits(C0938c.e(i5))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                j6 = ((long) nextInt) & 4294967295L;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j7 = nextLong % j8;
                } while ((nextLong - j7) + (j8 - 1) < 0);
                j6 = j7;
            }
            return j4 + j6;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (j4 <= nextLong2 && nextLong2 < j5) {
                return nextLong2;
            }
        }
    }

    public byte[] nextBytes(int i4) {
        return nextBytes(new byte[i4]);
    }
}
