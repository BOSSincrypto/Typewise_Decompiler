package g1;

import X0.c;
import X0.d;
import X0.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.s;
import java.util.List;
import p1.k;

public class l implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final c f13609b = c.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a  reason: collision with root package name */
    private final Context f13610a;

    public l(Context context) {
        this.f13610a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f13610a.getPackageName())) {
            return this.f13610a;
        }
        try {
            return this.f13610a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            if (str.contains(this.f13610a.getPackageName())) {
                return this.f13610a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e4);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e4);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public s a(Uri uri, int i4, int i5, d dVar) {
        Resources.Theme theme;
        Drawable drawable;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d4 = d(uri, authority);
            int g4 = g(d4, uri);
            if (((String) k.d(authority)).equals(this.f13610a.getPackageName())) {
                theme = (Resources.Theme) dVar.c(f13609b);
            } else {
                theme = null;
            }
            if (theme == null) {
                drawable = i.b(this.f13610a, d4, g4);
            } else {
                drawable = i.a(this.f13610a, g4, theme);
            }
            return k.f(drawable);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: h */
    public boolean b(Uri uri, d dVar) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("android.resource")) {
            return false;
        }
        return true;
    }
}
