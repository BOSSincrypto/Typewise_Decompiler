package c1;

import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import o1.C0839b;

public class w implements n {

    /* renamed from: a  reason: collision with root package name */
    private static final w f7613a = new w();

    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private static final a f7614a = new a();

        public static a a() {
            return f7614a;
        }

        public n c(r rVar) {
            return w.c();
        }
    }

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7615a;

        b(Object obj) {
            this.f7615a = obj;
        }

        public Class a() {
            return this.f7615a.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            aVar.d(this.f7615a);
        }
    }

    public static w c() {
        return f7613a;
    }

    public n.a a(Object obj, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(obj), new b(obj));
    }

    public boolean b(Object obj) {
        return true;
    }
}
