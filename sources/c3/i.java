package c3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.o;

public final class i implements w {

    /* renamed from: a  reason: collision with root package name */
    private final d f7664a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f7665b;

    /* renamed from: c  reason: collision with root package name */
    private int f7666c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7667d;

    public i(d dVar, Inflater inflater) {
        o.e(dVar, "source");
        o.e(inflater, "inflater");
        this.f7664a = dVar;
        this.f7665b = inflater;
    }

    private final void f() {
        int i4 = this.f7666c;
        if (i4 != 0) {
            int remaining = i4 - this.f7665b.getRemaining();
            this.f7666c -= remaining;
            this.f7664a.b((long) remaining);
        }
    }

    public long N(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        do {
            long a4 = a(bVar, j4);
            if (a4 > 0) {
                return a4;
            }
            if (this.f7665b.finished() || this.f7665b.needsDictionary()) {
                return -1;
            }
        } while (!this.f7664a.H());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (this.f7667d) {
            throw new IllegalStateException("closed");
        } else if (i4 == 0) {
            return 0;
        } else {
            try {
                r z02 = bVar.z0(1);
                e();
                int inflate = this.f7665b.inflate(z02.f7683a, z02.f7685c, (int) Math.min(j4, (long) (8192 - z02.f7685c)));
                f();
                if (inflate > 0) {
                    z02.f7685c += inflate;
                    long j5 = (long) inflate;
                    bVar.v0(bVar.w0() + j5);
                    return j5;
                }
                if (z02.f7684b == z02.f7685c) {
                    bVar.f7648a = z02.b();
                    t.b(z02);
                }
                return 0;
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
    }

    public void close() {
        if (!this.f7667d) {
            this.f7665b.end();
            this.f7667d = true;
            this.f7664a.close();
        }
    }

    public x d() {
        return this.f7664a.d();
    }

    public final boolean e() {
        if (!this.f7665b.needsInput()) {
            return false;
        }
        if (this.f7664a.H()) {
            return true;
        }
        r rVar = this.f7664a.c().f7648a;
        o.b(rVar);
        int i4 = rVar.f7685c;
        int i5 = rVar.f7684b;
        int i6 = i4 - i5;
        this.f7666c = i6;
        this.f7665b.setInput(rVar.f7683a, i5, i6);
        return false;
    }
}
