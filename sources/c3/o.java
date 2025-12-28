package c3;

import java.io.OutputStream;

final class o implements u {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f7674a;

    /* renamed from: b  reason: collision with root package name */
    private final x f7675b;

    public o(OutputStream outputStream, x xVar) {
        kotlin.jvm.internal.o.e(outputStream, "out");
        kotlin.jvm.internal.o.e(xVar, "timeout");
        this.f7674a = outputStream;
        this.f7675b = xVar;
    }

    public void close() {
        this.f7674a.close();
    }

    public x d() {
        return this.f7675b;
    }

    public void flush() {
        this.f7674a.flush();
    }

    public String toString() {
        return "sink(" + this.f7674a + ')';
    }

    public void z(C0500b bVar, long j4) {
        kotlin.jvm.internal.o.e(bVar, "source");
        B.b(bVar.w0(), 0, j4);
        while (j4 > 0) {
            this.f7675b.f();
            r rVar = bVar.f7648a;
            kotlin.jvm.internal.o.b(rVar);
            int min = (int) Math.min(j4, (long) (rVar.f7685c - rVar.f7684b));
            this.f7674a.write(rVar.f7683a, rVar.f7684b, min);
            rVar.f7684b += min;
            long j5 = (long) min;
            j4 -= j5;
            bVar.v0(bVar.w0() - j5);
            if (rVar.f7684b == rVar.f7685c) {
                bVar.f7648a = rVar.b();
                t.b(rVar);
            }
        }
    }
}
