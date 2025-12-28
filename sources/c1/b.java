package c1;

import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o1.C0839b;

public class b implements n {

    /* renamed from: a  reason: collision with root package name */
    private final C0125b f7522a;

    public static class a implements o {

        /* renamed from: c1.b$a$a  reason: collision with other inner class name */
        class C0124a implements C0125b {
            C0124a() {
            }

            public Class a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public n c(r rVar) {
            return new b(new C0124a());
        }
    }

    /* renamed from: c1.b$b  reason: collision with other inner class name */
    public interface C0125b {
        Class a();

        Object b(byte[] bArr);
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f7524a;

        /* renamed from: b  reason: collision with root package name */
        private final C0125b f7525b;

        c(byte[] bArr, C0125b bVar) {
            this.f7524a = bArr;
            this.f7525b = bVar;
        }

        public Class a() {
            return this.f7525b.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            aVar.d(this.f7525b.b(this.f7524a));
        }
    }

    public static class d implements o {

        class a implements C0125b {
            a() {
            }

            public Class a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public n c(r rVar) {
            return new b(new a());
        }
    }

    public b(C0125b bVar) {
        this.f7522a = bVar;
    }

    /* renamed from: c */
    public n.a a(byte[] bArr, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(bArr), new c(bArr, this.f7522a));
    }

    /* renamed from: d */
    public boolean b(byte[] bArr) {
        return true;
    }
}
