package z2;

import kotlin.collections.B;
import kotlin.jvm.internal.i;
import p2.C0854c;
import v2.C0925a;

/* renamed from: z2.a  reason: case insensitive filesystem */
public class C0973a implements Iterable, C0925a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0252a f16742d = new C0252a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f16743a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16744b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16745c;

    /* renamed from: z2.a$a  reason: collision with other inner class name */
    public static final class C0252a {
        public /* synthetic */ C0252a(i iVar) {
            this();
        }

        public final C0973a a(int i4, int i5, int i6) {
            return new C0973a(i4, i5, i6);
        }

        private C0252a() {
        }
    }

    public C0973a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i6 != Integer.MIN_VALUE) {
            this.f16743a = i4;
            this.f16744b = C0854c.b(i4, i5, i6);
            this.f16745c = i6;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int b() {
        return this.f16743a;
    }

    public final int c() {
        return this.f16744b;
    }

    public final int d() {
        return this.f16745c;
    }

    /* renamed from: e */
    public B iterator() {
        return new b(this.f16743a, this.f16744b, this.f16745c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0973a) {
            if (!isEmpty() || !((C0973a) obj).isEmpty()) {
                C0973a aVar = (C0973a) obj;
                if (!(this.f16743a == aVar.f16743a && this.f16744b == aVar.f16744b && this.f16745c == aVar.f16745c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f16743a * 31) + this.f16744b) * 31) + this.f16745c;
    }

    public boolean isEmpty() {
        if (this.f16745c > 0) {
            if (this.f16743a <= this.f16744b) {
                return false;
            }
        } else if (this.f16743a >= this.f16744b) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f16745c > 0) {
            sb = new StringBuilder();
            sb.append(this.f16743a);
            sb.append("..");
            sb.append(this.f16744b);
            sb.append(" step ");
            i4 = this.f16745c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f16743a);
            sb.append(" downTo ");
            sb.append(this.f16744b);
            sb.append(" step ");
            i4 = -this.f16745c;
        }
        sb.append(i4);
        return sb.toString();
    }
}
