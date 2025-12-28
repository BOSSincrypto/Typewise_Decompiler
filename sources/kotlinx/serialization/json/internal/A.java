package kotlinx.serialization.json.internal;

import H2.f;
import H2.n;
import java.util.Arrays;
import kotlin.jvm.internal.o;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f14326a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    private int[] f14327b;

    /* renamed from: c  reason: collision with root package name */
    private int f14328c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14329a = new a();

        private a() {
        }
    }

    public A() {
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = -1;
        }
        this.f14327b = iArr;
        this.f14328c = -1;
    }

    private final void e() {
        int i4 = this.f14328c * 2;
        Object[] copyOf = Arrays.copyOf(this.f14326a, i4);
        o.d(copyOf, "copyOf(...)");
        this.f14326a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f14327b, i4);
        o.d(copyOf2, "copyOf(...)");
        this.f14327b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i4 = this.f14328c + 1;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = this.f14326a[i5];
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!o.a(fVar.c(), n.b.f576a)) {
                    int i6 = this.f14327b[i5];
                    if (i6 >= 0) {
                        sb.append(".");
                        sb.append(fVar.e(i6));
                    }
                } else if (this.f14327b[i5] != -1) {
                    sb.append("[");
                    sb.append(this.f14327b[i5]);
                    sb.append("]");
                }
            } else if (obj != a.f14329a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public final void b() {
        int i4 = this.f14328c;
        int[] iArr = this.f14327b;
        if (iArr[i4] == -2) {
            iArr[i4] = -1;
            this.f14328c = i4 - 1;
        }
        int i5 = this.f14328c;
        if (i5 != -1) {
            this.f14328c = i5 - 1;
        }
    }

    public final void c(f fVar) {
        o.e(fVar, "sd");
        int i4 = this.f14328c + 1;
        this.f14328c = i4;
        if (i4 == this.f14326a.length) {
            e();
        }
        this.f14326a[i4] = fVar;
    }

    public final void d() {
        int[] iArr = this.f14327b;
        int i4 = this.f14328c;
        if (iArr[i4] == -2) {
            this.f14326a[i4] = a.f14329a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f14327b;
        int i4 = this.f14328c;
        if (iArr[i4] != -2) {
            int i5 = i4 + 1;
            this.f14328c = i5;
            if (i5 == this.f14326a.length) {
                e();
            }
        }
        Object[] objArr = this.f14326a;
        int i6 = this.f14328c;
        objArr[i6] = obj;
        this.f14327b[i6] = -2;
    }

    public final void g(int i4) {
        this.f14327b[this.f14328c] = i4;
    }

    public String toString() {
        return a();
    }
}
