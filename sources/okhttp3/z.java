package okhttp3;

import Q2.d;
import c3.c;
import java.nio.charset.Charset;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.C0724d;
import okhttp3.v;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15608a = new a((i) null);

    public static final class a {

        /* renamed from: okhttp3.z$a$a  reason: collision with other inner class name */
        public static final class C0217a extends z {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f15609b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f15610c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ byte[] f15611d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f15612e;

            C0217a(v vVar, int i4, byte[] bArr, int i5) {
                this.f15609b = vVar;
                this.f15610c = i4;
                this.f15611d = bArr;
                this.f15612e = i5;
            }

            public long a() {
                return (long) this.f15610c;
            }

            public v b() {
                return this.f15609b;
            }

            public void g(c cVar) {
                o.e(cVar, "sink");
                cVar.g(this.f15611d, this.f15612e, this.f15610c);
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ z f(a aVar, v vVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                i4 = 0;
            }
            if ((i6 & 8) != 0) {
                i5 = bArr.length;
            }
            return aVar.d(vVar, bArr, i4, i5);
        }

        public static /* synthetic */ z g(a aVar, byte[] bArr, v vVar, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                vVar = null;
            }
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return aVar.e(bArr, vVar, i4, i5);
        }

        public final z a(String str, v vVar) {
            o.e(str, "<this>");
            Charset charset = C0724d.f13927b;
            if (vVar != null) {
                Charset d4 = v.d(vVar, (Charset) null, 1, (Object) null);
                if (d4 == null) {
                    v.a aVar = v.f15509e;
                    vVar = aVar.b(vVar + "; charset=utf-8");
                } else {
                    charset = d4;
                }
            }
            byte[] bytes = str.getBytes(charset);
            o.d(bytes, "this as java.lang.String).getBytes(charset)");
            return e(bytes, vVar, 0, bytes.length);
        }

        public final z b(v vVar, String str) {
            o.e(str, "content");
            return a(str, vVar);
        }

        public final z c(v vVar, byte[] bArr) {
            o.e(bArr, "content");
            return f(this, vVar, bArr, 0, 0, 12, (Object) null);
        }

        public final z d(v vVar, byte[] bArr, int i4, int i5) {
            o.e(bArr, "content");
            return e(bArr, vVar, i4, i5);
        }

        public final z e(byte[] bArr, v vVar, int i4, int i5) {
            o.e(bArr, "<this>");
            d.l((long) bArr.length, (long) i4, (long) i5);
            return new C0217a(vVar, i5, bArr, i4);
        }

        private a() {
        }
    }

    public static final z c(v vVar, String str) {
        return f15608a.b(vVar, str);
    }

    public static final z d(v vVar, byte[] bArr) {
        return f15608a.c(vVar, bArr);
    }

    public abstract long a();

    public abstract v b();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void g(c cVar);
}
