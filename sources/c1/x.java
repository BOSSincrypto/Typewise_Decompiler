package c1;

import android.content.ContentResolver;
import android.net.Uri;
import c1.n;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o1.C0839b;

public class x implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f7616b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));

    /* renamed from: a  reason: collision with root package name */
    private final c f7617a;

    public static final class a implements o, c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f7618a;

        public a(ContentResolver contentResolver) {
            this.f7618a = contentResolver;
        }

        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f7618a, uri);
        }

        public n c(r rVar) {
            return new x(this);
        }
    }

    public static class b implements o, c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f7619a;

        public b(ContentResolver contentResolver) {
            this.f7619a = contentResolver;
        }

        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new i(this.f7619a, uri);
        }

        public n c(r rVar) {
            return new x(this);
        }
    }

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public static class d implements o, c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f7620a;

        public d(ContentResolver contentResolver) {
            this.f7620a = contentResolver;
        }

        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new n(this.f7620a, uri);
        }

        public n c(r rVar) {
            return new x(this);
        }
    }

    public x(c cVar) {
        this.f7617a = cVar;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(uri), this.f7617a.a(uri));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return f7616b.contains(uri.getScheme());
    }
}
