package c1;

import X0.d;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import c1.n;
import java.io.InputStream;

public class s implements n {

    /* renamed from: a  reason: collision with root package name */
    private final n f7602a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f7603b;

    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f7604a;

        public a(Resources resources) {
            this.f7604a = resources;
        }

        public n c(r rVar) {
            return new s(this.f7604a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f7605a;

        public b(Resources resources) {
            this.f7605a = resources;
        }

        public n c(r rVar) {
            return new s(this.f7605a, rVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f7606a;

        public c(Resources resources) {
            this.f7606a = resources;
        }

        public n c(r rVar) {
            return new s(this.f7606a, w.c());
        }
    }

    public s(Resources resources, n nVar) {
        this.f7603b = resources;
        this.f7602a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f7603b.getResourcePackageName(num.intValue()) + '/' + this.f7603b.getResourceTypeName(num.intValue()) + '/' + this.f7603b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e4) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e4);
            return null;
        }
    }

    /* renamed from: c */
    public n.a a(Integer num, int i4, int i5, d dVar) {
        Uri d4 = d(num);
        if (d4 == null) {
            return null;
        }
        return this.f7602a.a(d4, i4, i5, dVar);
    }

    /* renamed from: e */
    public boolean b(Integer num) {
        return true;
    }
}
