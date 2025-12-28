package y2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.o;
import x2.C0936a;

/* renamed from: y2.a  reason: case insensitive filesystem */
public final class C0965a extends C0936a {
    public Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        o.d(current, "current(...)");
        return current;
    }

    public double nextDouble(double d4) {
        return ThreadLocalRandom.current().nextDouble(d4);
    }

    public int nextInt(int i4, int i5) {
        return ThreadLocalRandom.current().nextInt(i4, i5);
    }

    public long nextLong(long j4) {
        return ThreadLocalRandom.current().nextLong(j4);
    }

    public long nextLong(long j4, long j5) {
        return ThreadLocalRandom.current().nextLong(j4, j5);
    }
}
