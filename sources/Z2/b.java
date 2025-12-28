package z2;

import java.util.NoSuchElementException;
import kotlin.collections.B;

public final class b extends B {

    /* renamed from: a  reason: collision with root package name */
    private final int f16746a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16747b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16748c;

    /* renamed from: d  reason: collision with root package name */
    private int f16749d;

    public b(int i4, int i5, int i6) {
        this.f16746a = i6;
        this.f16747b = i5;
        boolean z3 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z3 = true;
        }
        this.f16748c = z3;
        this.f16749d = !z3 ? i5 : i4;
    }

    public int b() {
        int i4 = this.f16749d;
        if (i4 != this.f16747b) {
            this.f16749d = this.f16746a + i4;
        } else if (this.f16748c) {
            this.f16748c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i4;
    }

    public boolean hasNext() {
        return this.f16748c;
    }
}
