package kotlinx.coroutines.internal;

import kotlin.collections.C0713h;

/* renamed from: kotlinx.coroutines.internal.a  reason: case insensitive filesystem */
public class C0741a {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f14163a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f14164b;

    /* renamed from: c  reason: collision with root package name */
    private int f14165c;

    private final void b() {
        Object[] objArr = this.f14163a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        C0713h.g(objArr, objArr3, 0, this.f14164b, 0, 10, (Object) null);
        Object[] objArr4 = this.f14163a;
        int length2 = objArr4.length;
        int i4 = this.f14164b;
        C0713h.g(objArr4, objArr2, length2 - i4, 0, i4, 4, (Object) null);
        this.f14163a = objArr3;
        this.f14164b = 0;
        this.f14165c = length;
    }

    public final void a(Object obj) {
        Object[] objArr = this.f14163a;
        int i4 = this.f14165c;
        objArr[i4] = obj;
        int length = (objArr.length - 1) & (i4 + 1);
        this.f14165c = length;
        if (length == this.f14164b) {
            b();
        }
    }

    public final boolean c() {
        if (this.f14164b == this.f14165c) {
            return true;
        }
        return false;
    }

    public final Object d() {
        int i4 = this.f14164b;
        if (i4 == this.f14165c) {
            return null;
        }
        Object[] objArr = this.f14163a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f14164b = (i4 + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
