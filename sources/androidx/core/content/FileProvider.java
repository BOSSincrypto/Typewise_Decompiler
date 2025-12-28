package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.uuid.Uuid;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f4891d = {"_display_name", "_size"};

    /* renamed from: e  reason: collision with root package name */
    private static final File f4892e = new File("/");

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap f4893f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private b f4894a;

    /* renamed from: b  reason: collision with root package name */
    private int f4895b = 0;

    /* renamed from: c  reason: collision with root package name */
    private String f4896c;

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f4897a;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap f4898b = new HashMap();

        c(String str) {
            this.f4897a = str;
        }

        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f4898b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        public Uri b(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f4898b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f4897a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f4898b.put(str, file.getCanonicalFile());
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e4);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i4) {
        String[] strArr2 = new String[i4];
        System.arraycopy(strArr, 0, strArr2, 0, i4);
        return strArr2;
    }

    static XmlResourceParser d(Context context, String str, ProviderInfo providerInfo, int i4) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i4 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i4);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    private b e() {
        b bVar;
        synchronized (this) {
            try {
                if (this.f4894a == null) {
                    this.f4894a = f(getContext(), this.f4896c, this.f4895b);
                }
                bVar = this.f4894a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private static b f(Context context, String str, int i4) {
        b bVar;
        HashMap hashMap = f4893f;
        synchronized (hashMap) {
            try {
                bVar = (b) hashMap.get(str);
                if (bVar == null) {
                    bVar = i(context, str, i4);
                    hashMap.put(str, bVar);
                }
            } catch (IOException e4) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
            } catch (XmlPullParserException e5) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri g(Context context, String str, File file) {
        return f(context, str, 0).b(file);
    }

    private static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b i(Context context, String str, int i4) {
        c cVar = new c(str);
        XmlResourceParser d4 = d(context, str, context.getPackageManager().resolveContentProvider(str, Uuid.SIZE_BITS), i4);
        while (true) {
            int next = d4.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d4.getName();
                File file = null;
                String attributeValue = d4.getAttributeValue((String) null, "name");
                String attributeValue2 = d4.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = f4892e;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] f4 = a.f(context, (String) null);
                    if (f4.length > 0) {
                        file = f4[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] e4 = a.e(context);
                    if (e4.length > 0) {
                        file = e4[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a4 = a.a(context);
                    if (a4.length > 0) {
                        file = a4[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f4896c = providerInfo.authority.split(";")[0];
            HashMap hashMap = f4893f;
            synchronized (hashMap) {
                hashMap.remove(this.f4896c);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return e().a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File a4 = e().a(uri);
        int lastIndexOf = a4.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a4.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(e().a(uri), h(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i4;
        String str3;
        File a4 = e().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f4891d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i5] = "_display_name";
                i4 = i5 + 1;
                if (queryParameter == null) {
                    str3 = a4.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i5] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i5] = "_size";
                i4 = i5 + 1;
                objArr[i5] = Long.valueOf(a4.length());
            }
            i5 = i4;
        }
        String[] c4 = c(strArr3, i5);
        Object[] b4 = b(objArr, i5);
        MatrixCursor matrixCursor = new MatrixCursor(c4, 1);
        matrixCursor.addRow(b4);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
