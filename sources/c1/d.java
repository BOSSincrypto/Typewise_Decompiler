package c1;

import android.util.Log;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o1.C0839b;
import p1.C0851a;

public class d implements n {

    private static final class a implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final File f7527a;

        a(File file) {
            this.f7527a = file;
        }

        public Class a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            try {
                aVar.d(C0851a.a(this.f7527a));
            } catch (IOException e4) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e4);
            }
        }
    }

    public static class b implements o {
        public n c(r rVar) {
            return new d();
        }
    }

    /* renamed from: c */
    public n.a a(File file, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(file), new a(file));
    }

    /* renamed from: d */
    public boolean b(File file) {
        return true;
    }
}
