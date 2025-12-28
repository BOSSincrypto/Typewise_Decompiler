package c1;

import android.content.res.AssetManager;
import android.net.Uri;
import c1.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import o1.C0839b;

/* renamed from: c1.a  reason: case insensitive filesystem */
public class C0494a implements n {

    /* renamed from: c  reason: collision with root package name */
    private static final int f7517c = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f7518a;

    /* renamed from: b  reason: collision with root package name */
    private final C0123a f7519b;

    /* renamed from: c1.a$a  reason: collision with other inner class name */
    public interface C0123a {
        d a(AssetManager assetManager, String str);
    }

    /* renamed from: c1.a$b */
    public static class b implements o, C0123a {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f7520a;

        public b(AssetManager assetManager) {
            this.f7520a = assetManager;
        }

        public d a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public n c(r rVar) {
            return new C0494a(this.f7520a, this);
        }
    }

    /* renamed from: c1.a$c */
    public static class c implements o, C0123a {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f7521a;

        public c(AssetManager assetManager) {
            this.f7521a = assetManager;
        }

        public d a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        public n c(r rVar) {
            return new C0494a(this.f7521a, this);
        }
    }

    public C0494a(AssetManager assetManager, C0123a aVar) {
        this.f7518a = assetManager;
        this.f7519b = aVar;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(uri), this.f7519b.a(this.f7518a, uri.toString().substring(f7517c)));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
