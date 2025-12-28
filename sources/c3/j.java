package c3;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.o;

class j implements w {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f7668a;

    /* renamed from: b  reason: collision with root package name */
    private final x f7669b;

    public j(InputStream inputStream, x xVar) {
        o.e(inputStream, "input");
        o.e(xVar, "timeout");
        this.f7668a = inputStream;
        this.f7669b = xVar;
    }

    public long N(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 == 0) {
            return 0;
        }
        if (i4 >= 0) {
            try {
                this.f7669b.f();
                r z02 = bVar.z0(1);
                int read = this.f7668a.read(z02.f7683a, z02.f7685c, (int) Math.min(j4, (long) (8192 - z02.f7685c)));
                if (read != -1) {
                    z02.f7685c += read;
                    long j5 = (long) read;
                    bVar.v0(bVar.w0() + j5);
                    return j5;
                } else if (z02.f7684b != z02.f7685c) {
                    return -1;
                } else {
                    bVar.f7648a = z02.b();
                    t.b(z02);
                    return -1;
                }
            } catch (AssertionError e4) {
                if (k.c(e4)) {
                    throw new IOException(e4);
                }
                throw e4;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
    }

    public void close() {
        this.f7668a.close();
    }

    public x d() {
        return this.f7669b;
    }

    public String toString() {
        return "source(" + this.f7668a + ')';
    }
}
