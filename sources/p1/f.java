package p1;

public abstract class f {

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private volatile Object f15867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f15868b;

        a(b bVar) {
            this.f15868b = bVar;
        }

        public Object get() {
            if (this.f15867a == null) {
                synchronized (this) {
                    try {
                        if (this.f15867a == null) {
                            this.f15867a = k.d(this.f15868b.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f15867a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
