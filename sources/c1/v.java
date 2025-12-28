package c1;

import X0.d;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import c1.n;
import java.io.File;
import java.io.InputStream;

public class v implements n {

    /* renamed from: a  reason: collision with root package name */
    private final n f7612a;

    public static final class a implements o {
        public n c(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o {
        public n c(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o {
        public n c(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }
    }

    public v(n nVar) {
        this.f7612a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return f(str);
        }
        return parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public n.a a(String str, int i4, int i5, d dVar) {
        Uri e4 = e(str);
        if (e4 == null || !this.f7612a.b(e4)) {
            return null;
        }
        return this.f7612a.a(e4, i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(String str) {
        return true;
    }
}
