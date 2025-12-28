package androidx.core.util;

public class f extends e {

    /* renamed from: c  reason: collision with root package name */
    private final Object f5159c = new Object();

    public f(int i4) {
        super(i4);
    }

    public boolean a(Object obj) {
        boolean a4;
        synchronized (this.f5159c) {
            a4 = super.a(obj);
        }
        return a4;
    }

    public Object b() {
        Object b4;
        synchronized (this.f5159c) {
            b4 = super.b();
        }
        return b4;
    }
}
