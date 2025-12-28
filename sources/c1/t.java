package c1;

import X0.d;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import c1.n;
import java.io.InputStream;
import java.util.List;

public final class t implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7607a;

    /* renamed from: b  reason: collision with root package name */
    private final n f7608b;

    private static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7609a;

        a(Context context) {
            this.f7609a = context;
        }

        public n c(r rVar) {
            return new t(this.f7609a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    private static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7610a;

        b(Context context) {
            this.f7610a = context;
        }

        public n c(r rVar) {
            return new t(this.f7610a, rVar.d(Integer.class, InputStream.class));
        }
    }

    t(Context context, n nVar) {
        this.f7607a = context.getApplicationContext();
        this.f7608b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i4, int i5, d dVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f7608b.a(Integer.valueOf(parseInt), i4, i5, dVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e4) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e4);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i4, int i5, d dVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.f7607a.getResources().getIdentifier(str, pathSegments.get(0), this.f7607a.getPackageName());
        if (identifier != 0) {
            return this.f7608b.a(Integer.valueOf(identifier), i4, i5, dVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, d dVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i4, i5, dVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i4, i5, dVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        if (!"android.resource".equals(uri.getScheme()) || !this.f7607a.getPackageName().equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }
}
