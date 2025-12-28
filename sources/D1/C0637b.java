package d1;

import X0.d;
import Y0.b;
import Y0.c;
import android.content.Context;
import android.net.Uri;
import c1.n;
import c1.o;
import c1.r;
import o1.C0839b;

/* renamed from: d1.b  reason: case insensitive filesystem */
public class C0637b implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13535a;

    /* renamed from: d1.b$a */
    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13536a;

        public a(Context context) {
            this.f13536a = context;
        }

        public n c(r rVar) {
            return new C0637b(this.f13536a);
        }
    }

    public C0637b(Context context) {
        this.f13535a = context.getApplicationContext();
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, d dVar) {
        if (b.d(i4, i5)) {
            return new n.a(new C0839b(uri), c.d(this.f13535a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return b.a(uri);
    }
}
