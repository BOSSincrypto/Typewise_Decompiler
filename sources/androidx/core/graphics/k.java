package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class k extends o {

    /* renamed from: b  reason: collision with root package name */
    private static final Class f4987b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor f4988c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f4989d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f4990e;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            method2 = null;
            cls = null;
            method = null;
        }
        f4988c = constructor;
        f4987b = cls;
        f4989d = method;
        f4990e = method2;
    }

    k() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z3) {
        try {
            return ((Boolean) f4989d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4987b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4990e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f4989d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    private static Object k() {
        try {
            return f4988c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i4) {
        Object k4 = k();
        if (k4 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b4 = p.b(context, resources, dVar.b());
            if (b4 == null || !h(k4, b4, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(k4);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Object k4 = k();
        if (k4 == null) {
            return null;
        }
        y.g gVar = new y.g();
        for (g.b bVar : bVarArr) {
            Uri d4 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d4);
            if (byteBuffer == null) {
                byteBuffer = p.f(context, cancellationSignal, d4);
                gVar.put(d4, byteBuffer);
            }
            if (byteBuffer == null || !h(k4, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i5 = i(k4);
        if (i5 == null) {
            return null;
        }
        return Typeface.create(i5, i4);
    }
}
