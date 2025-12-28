package Y0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f1980a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1981b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f1982c;

    static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f1983b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f1984a;

        a(ContentResolver contentResolver) {
            this.f1984a = contentResolver;
        }

        public Cursor a(Uri uri) {
            return this.f1984a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f1983b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, (String) null);
        }
    }

    static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f1985b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f1986a;

        b(ContentResolver contentResolver) {
            this.f1986a = contentResolver;
        }

        public Cursor a(Uri uri) {
            return this.f1986a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f1985b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, (String) null);
        }
    }

    c(Uri uri, e eVar) {
        this.f1980a = uri;
        this.f1981b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c d(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        int i4;
        InputStream d4 = this.f1981b.d(this.f1980a);
        if (d4 != null) {
            i4 = this.f1981b.a(this.f1980a);
        } else {
            i4 = -1;
        }
        if (i4 != -1) {
            return new g(d4, i4);
        }
        return d4;
    }

    public Class a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f1982c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    public DataSource e() {
        return DataSource.LOCAL;
    }

    public void f(Priority priority, d.a aVar) {
        try {
            InputStream h4 = h();
            this.f1982c = h4;
            aVar.d(h4);
        } catch (FileNotFoundException e4) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e4);
        }
    }
}
