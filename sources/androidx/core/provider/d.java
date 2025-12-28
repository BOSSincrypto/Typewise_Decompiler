package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator f5035a = new c();

    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals((byte[]) list.get(i4), (byte[]) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        if (eVar.b() != null) {
            return eVar.b();
        }
        return e.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f4 = f(context.getPackageManager(), eVar, context.getResources());
        if (f4 == null) {
            return g.a.a(1, (g.b[]) null);
        }
        return g.a.a(0, h(context, eVar, f4.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        String e4 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e4, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e4);
        } else if (resolveContentProvider.packageName.equals(eVar.f())) {
            List b4 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b4, f5035a);
            List d4 = d(eVar, resources);
            for (int i4 = 0; i4 < d4.size(); i4++) {
                ArrayList arrayList = new ArrayList((Collection) d4.get(i4));
                Collections.sort(arrayList, f5035a);
                if (c(b4, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e4 + ", but package was not " + eVar.f());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            byte b5 = bArr2[i4];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        int i4;
        int i5;
        Uri uri;
        int i6;
        boolean z3;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            Uri uri2 = build;
            Cursor a4 = a.a(context.getContentResolver(), uri2, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, (String) null, cancellationSignal);
            if (a4 != null && a4.getCount() > 0) {
                int columnIndex = a4.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = a4.getColumnIndex("_id");
                int columnIndex3 = a4.getColumnIndex("file_id");
                int columnIndex4 = a4.getColumnIndex("font_ttc_index");
                int columnIndex5 = a4.getColumnIndex("font_weight");
                int columnIndex6 = a4.getColumnIndex("font_italic");
                while (a4.moveToNext()) {
                    if (columnIndex != -1) {
                        i4 = a4.getInt(columnIndex);
                    } else {
                        i4 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i5 = a4.getInt(columnIndex4);
                    } else {
                        i5 = 0;
                    }
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, a4.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, a4.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i6 = a4.getInt(columnIndex5);
                    } else {
                        i6 = 400;
                    }
                    if (columnIndex6 != -1) {
                        z3 = true;
                        if (a4.getInt(columnIndex6) == 1) {
                            arrayList2.add(g.b.a(uri, i5, i6, z3, i4));
                        }
                    }
                    z3 = false;
                    arrayList2.add(g.b.a(uri, i5, i6, z3, i4));
                }
                arrayList = arrayList2;
            }
            if (a4 != null) {
                a4.close();
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
