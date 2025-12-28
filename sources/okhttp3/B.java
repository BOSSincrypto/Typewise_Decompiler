package okhttp3;

import c3.C0500b;
import c3.d;
import java.io.Closeable;
import java.nio.charset.Charset;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.C0724d;

public abstract class B implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15139a = new a((i) null);

    public static final class a {

        /* renamed from: okhttp3.B$a$a  reason: collision with other inner class name */
        public static final class C0210a extends B {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f15140b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f15141c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d f15142d;

            C0210a(v vVar, long j4, d dVar) {
                this.f15140b = vVar;
                this.f15141c = j4;
                this.f15142d = dVar;
            }

            public long e() {
                return this.f15141c;
            }

            public v f() {
                return this.f15140b;
            }

            public d m() {
                return this.f15142d;
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ B d(a aVar, byte[] bArr, v vVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                vVar = null;
            }
            return aVar.c(bArr, vVar);
        }

        public final B a(d dVar, v vVar, long j4) {
            o.e(dVar, "<this>");
            return new C0210a(vVar, j4, dVar);
        }

        public final B b(v vVar, long j4, d dVar) {
            o.e(dVar, "content");
            return a(dVar, vVar, j4);
        }

        public final B c(byte[] bArr, v vVar) {
            o.e(bArr, "<this>");
            return a(new C0500b().O(bArr), vVar, (long) bArr.length);
        }

        private a() {
        }
    }

    private final Charset a() {
        Charset charset;
        v f4 = f();
        if (f4 == null) {
            charset = null;
        } else {
            charset = f4.c(C0724d.f13927b);
        }
        if (charset == null) {
            return C0724d.f13927b;
        }
        return charset;
    }

    public static final B h(v vVar, long j4, d dVar) {
        return f15139a.b(vVar, j4, dVar);
    }

    public void close() {
        Q2.d.m(m());
    }

    public abstract long e();

    public abstract v f();

    public abstract d m();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        s2.C0896b.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String o() {
        /*
            r3 = this;
            c3.d r0 = r3.m()
            java.nio.charset.Charset r1 = r3.a()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = Q2.d.I(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.n0(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            s2.C0896b.a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            s2.C0896b.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.B.o():java.lang.String");
    }
}
