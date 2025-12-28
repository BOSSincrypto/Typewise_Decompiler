package c1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import o1.C0839b;

public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7566a;

    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f7567a;

        public a(Context context) {
            this.f7567a = context;
        }

        public n c(r rVar) {
            return new l(this.f7567a);
        }
    }

    private static class b implements d {

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f7568c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f7569a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f7570b;

        b(Context context, Uri uri) {
            this.f7569a = context;
            this.f7570b = uri;
        }

        public Class a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            Cursor query = this.f7569a.getContentResolver().query(this.f7570b, f7568c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f7570b));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public l(Context context) {
        this.f7566a = context;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(uri), new b(this.f7566a, uri));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return Y0.b.b(uri);
    }
}
