package d1;

import X0.d;
import Y0.b;
import Y0.c;
import android.content.Context;
import android.net.Uri;
import c1.n;
import c1.o;
import c1.r;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import o1.C0839b;

/* renamed from: d1.c  reason: case insensitive filesystem */
public class C0638c implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13537a;

    /* renamed from: d1.c$a */
    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13538a;

        public a(Context context) {
            this.f13538a = context;
        }

        public n c(r rVar) {
            return new C0638c(this.f13538a);
        }
    }

    public C0638c(Context context) {
        this.f13537a = context.getApplicationContext();
    }

    private boolean e(d dVar) {
        Long l4 = (Long) dVar.c(VideoDecoder.f11103d);
        if (l4 == null || l4.longValue() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, d dVar) {
        if (!b.d(i4, i5) || !e(dVar)) {
            return null;
        }
        return new n.a(new C0839b(uri), c.g(this.f13537a, uri));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return b.c(uri);
    }
}
