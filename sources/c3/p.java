package c3;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class p implements c {

    /* renamed from: a  reason: collision with root package name */
    public final u f7676a;

    /* renamed from: b  reason: collision with root package name */
    public final C0500b f7677b = new C0500b();

    /* renamed from: c  reason: collision with root package name */
    public boolean f7678c;

    public p(u uVar) {
        o.e(uVar, "sink");
        this.f7676a = uVar;
    }

    public c I(int i4) {
        if (!this.f7678c) {
            this.f7677b.I(i4);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public c O(byte[] bArr) {
        o.e(bArr, "source");
        if (!this.f7678c) {
            this.f7677b.O(bArr);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public c P(ByteString byteString) {
        o.e(byteString, "byteString");
        if (!this.f7678c) {
            this.f7677b.P(byteString);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public c a() {
        if (!this.f7678c) {
            long y3 = this.f7677b.y();
            if (y3 > 0) {
                this.f7676a.z(this.f7677b, y3);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C0500b c() {
        return this.f7677b;
    }

    public void close() {
        if (!this.f7678c) {
            try {
                if (this.f7677b.w0() > 0) {
                    u uVar = this.f7676a;
                    C0500b bVar = this.f7677b;
                    uVar.z(bVar, bVar.w0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f7676a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f7678c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public x d() {
        return this.f7676a.d();
    }

    public c f0(String str) {
        o.e(str, "string");
        if (!this.f7678c) {
            this.f7677b.f0(str);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public void flush() {
        if (!this.f7678c) {
            if (this.f7677b.w0() > 0) {
                u uVar = this.f7676a;
                C0500b bVar = this.f7677b;
                uVar.z(bVar, bVar.w0());
            }
            this.f7676a.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public c g(byte[] bArr, int i4, int i5) {
        o.e(bArr, "source");
        if (!this.f7678c) {
            this.f7677b.g(bArr, i4, i5);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public c h0(long j4) {
        if (!this.f7678c) {
            this.f7677b.h0(j4);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f7678c;
    }

    public c k(long j4) {
        if (!this.f7678c) {
            this.f7677b.k(j4);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public c r(int i4) {
        if (!this.f7678c) {
            this.f7677b.r(i4);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f7676a + ')';
    }

    public c w(int i4) {
        if (!this.f7678c) {
            this.f7677b.w(i4);
            return a();
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) {
        o.e(byteBuffer, "source");
        if (!this.f7678c) {
            int write = this.f7677b.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public void z(C0500b bVar, long j4) {
        o.e(bVar, "source");
        if (!this.f7678c) {
            this.f7677b.z(bVar, j4);
            a();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
