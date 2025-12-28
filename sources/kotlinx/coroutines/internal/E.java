package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.A0;

final class E {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f14144a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f14145b;

    /* renamed from: c  reason: collision with root package name */
    private final A0[] f14146c;

    /* renamed from: d  reason: collision with root package name */
    private int f14147d;

    public E(CoroutineContext coroutineContext, int i4) {
        this.f14144a = coroutineContext;
        this.f14145b = new Object[i4];
        this.f14146c = new A0[i4];
    }

    public final void a(A0 a02, Object obj) {
        Object[] objArr = this.f14145b;
        int i4 = this.f14147d;
        objArr[i4] = obj;
        A0[] a0Arr = this.f14146c;
        this.f14147d = i4 + 1;
        a0Arr[i4] = a02;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f14146c.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                A0 a02 = this.f14146c[length];
                o.b(a02);
                a02.D(coroutineContext, this.f14145b[length]);
                if (i4 >= 0) {
                    length = i4;
                } else {
                    return;
                }
            }
        }
    }
}
