package c1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o1.C0839b;

public class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final d f7544a;

    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final d f7545a;

        public a(d dVar) {
            this.f7545a = dVar;
        }

        public final n c(r rVar) {
            return new g(this.f7545a);
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            public Class a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a  reason: collision with root package name */
        private final File f7546a;

        /* renamed from: b  reason: collision with root package name */
        private final d f7547b;

        /* renamed from: c  reason: collision with root package name */
        private Object f7548c;

        c(File file, d dVar) {
            this.f7546a = file;
            this.f7547b = dVar;
        }

        public Class a() {
            return this.f7547b.a();
        }

        public void b() {
            Object obj = this.f7548c;
            if (obj != null) {
                try {
                    this.f7547b.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            try {
                Object c4 = this.f7547b.c(this.f7546a);
                this.f7548c = c4;
                aVar.d(c4);
            } catch (FileNotFoundException e4) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e4);
            }
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
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
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f7544a = dVar;
    }

    /* renamed from: c */
    public n.a a(File file, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(file), new c(file, this.f7544a));
    }

    /* renamed from: d */
    public boolean b(File file) {
        return true;
    }
}
