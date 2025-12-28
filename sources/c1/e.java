package c1;

import android.util.Base64;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import o1.C0839b;

public final class e implements n {

    /* renamed from: a  reason: collision with root package name */
    private final a f7528a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    private static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f7529a;

        /* renamed from: b  reason: collision with root package name */
        private final a f7530b;

        /* renamed from: c  reason: collision with root package name */
        private Object f7531c;

        b(String str, a aVar) {
            this.f7529a = str;
            this.f7530b = aVar;
        }

        public Class a() {
            return this.f7530b.a();
        }

        public void b() {
            try {
                this.f7530b.b(this.f7531c);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            try {
                Object c4 = this.f7530b.c(this.f7529a);
                this.f7531c = c4;
                aVar.d(c4);
            } catch (IllegalArgumentException e4) {
                aVar.c(e4);
            }
        }
    }

    public static final class c implements o {

        /* renamed from: a  reason: collision with root package name */
        private final a f7532a = new a();

        class a implements a {
            a() {
            }

            public Class a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public n c(r rVar) {
            return new e(this.f7532a);
        }
    }

    public e(a aVar) {
        this.f7528a = aVar;
    }

    public n.a a(Object obj, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(obj), new b(obj.toString(), this.f7528a));
    }

    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
