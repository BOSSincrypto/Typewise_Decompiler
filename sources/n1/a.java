package N1;

import android.graphics.Typeface;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f994a;

    /* renamed from: b  reason: collision with root package name */
    private final C0016a f995b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f996c;

    /* renamed from: N1.a$a  reason: collision with other inner class name */
    public interface C0016a {
        void a(Typeface typeface);
    }

    public a(C0016a aVar, Typeface typeface) {
        this.f994a = typeface;
        this.f995b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.f996c) {
            this.f995b.a(typeface);
        }
    }

    public void a(int i4) {
        d(this.f994a);
    }

    public void b(Typeface typeface, boolean z3) {
        d(typeface);
    }

    public void c() {
        this.f996c = true;
    }
}
