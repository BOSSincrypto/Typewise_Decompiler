package x2;

import kotlin.jvm.internal.o;
import kotlin.random.Random;

/* renamed from: x2.a  reason: case insensitive filesystem */
public abstract class C0936a extends Random {
    public abstract java.util.Random a();

    public int nextBits(int i4) {
        return C0938c.f(a().nextInt(), i4);
    }

    public boolean nextBoolean() {
        return a().nextBoolean();
    }

    public byte[] nextBytes(byte[] bArr) {
        o.e(bArr, "array");
        a().nextBytes(bArr);
        return bArr;
    }

    public double nextDouble() {
        return a().nextDouble();
    }

    public float nextFloat() {
        return a().nextFloat();
    }

    public int nextInt() {
        return a().nextInt();
    }

    public long nextLong() {
        return a().nextLong();
    }

    public int nextInt(int i4) {
        return a().nextInt(i4);
    }
}
