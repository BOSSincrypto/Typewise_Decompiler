package c3;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.o;

public final class h implements w {

    /* renamed from: a  reason: collision with root package name */
    private byte f7659a;

    /* renamed from: b  reason: collision with root package name */
    private final q f7660b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f7661c;

    /* renamed from: d  reason: collision with root package name */
    private final i f7662d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f7663e = new CRC32();

    public h(w wVar) {
        o.e(wVar, "source");
        q qVar = new q(wVar);
        this.f7660b = qVar;
        Inflater inflater = new Inflater(true);
        this.f7661c = inflater;
        this.f7662d = new i(qVar, inflater);
    }

    private final void a(String str, int i4, int i5) {
        if (i5 != i4) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i4)}, 3));
            o.d(format, "format(this, *args)");
            throw new IOException(format);
        }
    }

    private final void e() {
        boolean z3;
        this.f7660b.d0(10);
        byte G3 = this.f7660b.f7680b.G(3);
        if (((G3 >> 1) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            h(this.f7660b.f7680b, 0, 10);
        }
        a("ID1ID2", 8075, this.f7660b.readShort());
        this.f7660b.b(8);
        if (((G3 >> 2) & 1) == 1) {
            this.f7660b.d0(2);
            if (z3) {
                h(this.f7660b.f7680b, 0, 2);
            }
            long q02 = (long) this.f7660b.f7680b.q0();
            this.f7660b.d0(q02);
            if (z3) {
                h(this.f7660b.f7680b, 0, q02);
            }
            this.f7660b.b(q02);
        }
        if (((G3 >> 3) & 1) == 1) {
            long a4 = this.f7660b.a((byte) 0);
            if (a4 != -1) {
                if (z3) {
                    h(this.f7660b.f7680b, 0, a4 + 1);
                }
                this.f7660b.b(a4 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((G3 >> 4) & 1) == 1) {
            long a5 = this.f7660b.a((byte) 0);
            if (a5 != -1) {
                if (z3) {
                    h(this.f7660b.f7680b, 0, a5 + 1);
                }
                this.f7660b.b(a5 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z3) {
            a("FHCRC", this.f7660b.h(), (short) ((int) this.f7663e.getValue()));
            this.f7663e.reset();
        }
    }

    private final void f() {
        a("CRC", this.f7660b.f(), (int) this.f7663e.getValue());
        a("ISIZE", this.f7660b.f(), (int) this.f7661c.getBytesWritten());
    }

    private final void h(C0500b bVar, long j4, long j5) {
        r rVar = bVar.f7648a;
        o.b(rVar);
        while (true) {
            int i4 = rVar.f7685c;
            int i5 = rVar.f7684b;
            if (j4 < ((long) (i4 - i5))) {
                break;
            }
            j4 -= (long) (i4 - i5);
            rVar = rVar.f7688f;
            o.b(rVar);
        }
        while (j5 > 0) {
            int i6 = (int) (((long) rVar.f7684b) + j4);
            int min = (int) Math.min((long) (rVar.f7685c - i6), j5);
            this.f7663e.update(rVar.f7683a, i6, min);
            j5 -= (long) min;
            rVar = rVar.f7688f;
            o.b(rVar);
            j4 = 0;
        }
    }

    public long N(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (i4 == 0) {
            return 0;
        } else {
            if (this.f7659a == 0) {
                e();
                this.f7659a = 1;
            }
            if (this.f7659a == 1) {
                long w02 = bVar.w0();
                long N3 = this.f7662d.N(bVar, j4);
                if (N3 != -1) {
                    h(bVar, w02, N3);
                    return N3;
                }
                this.f7659a = 2;
            }
            if (this.f7659a == 2) {
                f();
                this.f7659a = 3;
                if (!this.f7660b.H()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f7662d.close();
    }

    public x d() {
        return this.f7660b.d();
    }
}
