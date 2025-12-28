package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f5027a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5028b;

    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    class C0075a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f5029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f5030b;

        C0075a(g.c cVar, Typeface typeface) {
            this.f5029a = cVar;
            this.f5030b = typeface;
        }

        public void run() {
            this.f5029a.b(this.f5030b);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f5032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5033b;

        b(g.c cVar, int i4) {
            this.f5032a = cVar;
            this.f5033b = i4;
        }

        public void run() {
            this.f5032a.a(this.f5033b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f5027a = cVar;
        this.f5028b = handler;
    }

    private void a(int i4) {
        this.f5028b.post(new b(this.f5027a, i4));
    }

    private void c(Typeface typeface) {
        this.f5028b.post(new C0075a(this.f5027a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f5056a);
        } else {
            a(eVar.f5057b);
        }
    }
}
