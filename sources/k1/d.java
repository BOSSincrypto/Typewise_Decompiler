package k1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.uuid.Uuid;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13803a;

    public d(Context context) {
        this.f13803a = context;
    }

    private ApplicationInfo a() {
        return this.f13803a.getPackageManager().getApplicationInfo(this.f13803a.getPackageName(), Uuid.SIZE_BITS);
    }

    private static b c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (InstantiationException e4) {
                d(cls, e4);
            } catch (IllegalAccessException e5) {
                d(cls, e5);
            } catch (NoSuchMethodException e6) {
                d(cls, e6);
            } catch (InvocationTargetException e7) {
                d(cls, e7);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e8) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e8);
        }
    }

    private static void d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List b() {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo a4 = a();
            if (a4 != null) {
                if (a4.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Got app info metadata: ");
                        sb.append(a4.metaData);
                    }
                    for (String next : a4.metaData.keySet()) {
                        if ("GlideModule".equals(a4.metaData.get(next))) {
                            c(next);
                            arrayList.add((Object) null);
                            if (Log.isLoggable("ManifestParser", 3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Loaded Glide module: ");
                                sb2.append(next);
                            }
                        }
                    }
                    Log.isLoggable("ManifestParser", 3);
                    return arrayList;
                }
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e4);
        }
    }
}
