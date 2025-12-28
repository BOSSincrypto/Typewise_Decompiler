package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class j extends o {

    /* renamed from: b  reason: collision with root package name */
    private static Class f4982b;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor f4983c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f4984d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f4985e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f4986f;

    j() {
    }

    private static boolean h(Object obj, String str, int i4, boolean z3) {
        k();
        try {
            return ((Boolean) f4984d.invoke(obj, new Object[]{str, Integer.valueOf(i4), Boolean.valueOf(z3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance(f4982b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4985e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f4986f) {
            f4986f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e4) {
                Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
                method2 = null;
                cls = null;
                method = null;
            }
            f4983c = constructor;
            f4982b = cls;
            f4984d = method;
            f4985e = method2;
        }
    }

    private static Object l() {
        k();
        try {
            return f4983c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i4) {
        Object l4 = l();
        e.d[] a4 = cVar.a();
        int length = a4.length;
        int i5 = 0;
        while (i5 < length) {
            e.d dVar = a4[i5];
            File e4 = p.e(context);
            if (e4 == null) {
                return null;
            }
            try {
                if (!p.c(e4, resources, dVar.b())) {
                    e4.delete();
                    return null;
                } else if (!h(l4, e4.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    e4.delete();
                    i5++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e4.delete();
            }
        }
        return i(l4);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b g4 = g(bVarArr, i4);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(g4.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File j4 = j(openFileDescriptor);
            if (j4 != null) {
                if (j4.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(j4);
                    openFileDescriptor.close();
                    return createFromFile;
                }
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c4 = super.c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c4;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
        throw th;
    }
}
