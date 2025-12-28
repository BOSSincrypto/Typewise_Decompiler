package Y0;

import Z0.b;
import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class e {

    /* renamed from: f  reason: collision with root package name */
    private static final a f1987f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final a f1988a;

    /* renamed from: b  reason: collision with root package name */
    private final d f1989b;

    /* renamed from: c  reason: collision with root package name */
    private final b f1990c;

    /* renamed from: d  reason: collision with root package name */
    private final ContentResolver f1991d;

    /* renamed from: e  reason: collision with root package name */
    private final List f1992e;

    e(List list, d dVar, b bVar, ContentResolver contentResolver) {
        this(list, f1987f, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x002d A[Catch:{ all -> 0x0018 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            Y0.d r1 = r4.f1989b     // Catch:{ SecurityException -> 0x0023, all -> 0x0021 }
            android.database.Cursor r1 = r1.a(r5)     // Catch:{ SecurityException -> 0x0023, all -> 0x0021 }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0024 }
            if (r2 == 0) goto L_0x001b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SecurityException -> 0x0024 }
            r1.close()
            return r5
        L_0x0018:
            r5 = move-exception
            r0 = r1
            goto L_0x0040
        L_0x001b:
            if (r1 == 0) goto L_0x0020
            r1.close()
        L_0x0020:
            return r0
        L_0x0021:
            r5 = move-exception
            goto L_0x0040
        L_0x0023:
            r1 = r0
        L_0x0024:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x003a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r2.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch:{ all -> 0x0018 }
            r2.append(r5)     // Catch:{ all -> 0x0018 }
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()
        L_0x003f:
            return r0
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()
        L_0x0045:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        if (!this.f1988a.a(file) || 0 >= this.f1988a.c(file)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f1991d.openInputStream(uri);
            int b4 = a.b(this.f1992e, openInputStream, this.f1990c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b4;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream d(Uri uri) {
        String b4 = b(uri);
        if (TextUtils.isEmpty(b4)) {
            return null;
        }
        File b5 = this.f1988a.b(b4);
        if (!c(b5)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b5);
        try {
            return this.f1991d.openInputStream(fromFile);
        } catch (NullPointerException e4) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e4));
        }
    }

    e(List list, a aVar, d dVar, b bVar, ContentResolver contentResolver) {
        this.f1988a = aVar;
        this.f1989b = dVar;
        this.f1990c = bVar;
        this.f1991d = contentResolver;
        this.f1992e = list;
    }
}
