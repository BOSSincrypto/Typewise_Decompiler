package d1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import c1.n;
import c1.o;
import c1.r;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o1.C0839b;

/* renamed from: d1.d  reason: case insensitive filesystem */
public final class C0639d implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13539a;

    /* renamed from: b  reason: collision with root package name */
    private final n f13540b;

    /* renamed from: c  reason: collision with root package name */
    private final n f13541c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f13542d;

    /* renamed from: d1.d$a */
    private static abstract class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13543a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f13544b;

        a(Context context, Class cls) {
            this.f13543a = context;
            this.f13544b = cls;
        }

        public final n c(r rVar) {
            return new C0639d(this.f13543a, rVar.d(File.class, this.f13544b), rVar.d(Uri.class, this.f13544b), this.f13544b);
        }
    }

    /* renamed from: d1.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: d1.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: d1.d$d  reason: collision with other inner class name */
    private static final class C0186d implements d {

        /* renamed from: k  reason: collision with root package name */
        private static final String[] f13545k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f13546a;

        /* renamed from: b  reason: collision with root package name */
        private final n f13547b;

        /* renamed from: c  reason: collision with root package name */
        private final n f13548c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f13549d;

        /* renamed from: e  reason: collision with root package name */
        private final int f13550e;

        /* renamed from: f  reason: collision with root package name */
        private final int f13551f;

        /* renamed from: g  reason: collision with root package name */
        private final X0.d f13552g;

        /* renamed from: h  reason: collision with root package name */
        private final Class f13553h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f13554i;

        /* renamed from: j  reason: collision with root package name */
        private volatile d f13555j;

        C0186d(Context context, n nVar, n nVar2, Uri uri, int i4, int i5, X0.d dVar, Class cls) {
            this.f13546a = context.getApplicationContext();
            this.f13547b = nVar;
            this.f13548c = nVar2;
            this.f13549d = uri;
            this.f13550e = i4;
            this.f13551f = i5;
            this.f13552g = dVar;
            this.f13553h = cls;
        }

        private n.a c() {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f13547b.a(h(this.f13549d), this.f13550e, this.f13551f, this.f13552g);
            }
            if (g()) {
                uri = MediaStore.setRequireOriginal(this.f13549d);
            } else {
                uri = this.f13549d;
            }
            return this.f13548c.a(uri, this.f13550e, this.f13551f, this.f13552g);
        }

        private d d() {
            n.a c4 = c();
            if (c4 != null) {
                return c4.f7579c;
            }
            return null;
        }

        private boolean g() {
            if (this.f13546a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f13546a.getContentResolver().query(uri, f13545k, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        public Class a() {
            return this.f13553h;
        }

        public void b() {
            d dVar = this.f13555j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public void cancel() {
            this.f13554i = true;
            d dVar = this.f13555j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public DataSource e() {
            return DataSource.LOCAL;
        }

        public void f(Priority priority, d.a aVar) {
            try {
                d d4 = d();
                if (d4 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f13549d));
                    return;
                }
                this.f13555j = d4;
                if (this.f13554i) {
                    cancel();
                } else {
                    d4.f(priority, aVar);
                }
            } catch (FileNotFoundException e4) {
                aVar.c(e4);
            }
        }
    }

    C0639d(Context context, n nVar, n nVar2, Class cls) {
        this.f13539a = context.getApplicationContext();
        this.f13540b = nVar;
        this.f13541c = nVar2;
        this.f13542d = cls;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, X0.d dVar) {
        return new n.a(new C0839b(uri), new C0186d(this.f13539a, this.f13540b, this.f13541c, uri, i4, i5, dVar, this.f13542d));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        if (Build.VERSION.SDK_INT < 29 || !Y0.b.b(uri)) {
            return false;
        }
        return true;
    }
}
