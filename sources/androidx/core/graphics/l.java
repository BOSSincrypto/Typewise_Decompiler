package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class l extends j {

    /* renamed from: g  reason: collision with root package name */
    protected final Class f4991g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor f4992h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f4993i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f4994j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f4995k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f4996l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f4997m;

    public l() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls;
        try {
            cls = v();
            constructor = w(cls);
            method5 = s(cls);
            method4 = t(cls);
            method3 = x(cls);
            method2 = r(cls);
            method = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e4.getClass().getName(), e4);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4991g = cls;
        this.f4992h = constructor;
        this.f4993i = method5;
        this.f4994j = method4;
        this.f4995k = method3;
        this.f4996l = method2;
        this.f4997m = method;
    }

    private Object l() {
        try {
            return this.f4992h.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f4996l.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4993i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f4994j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f4995k.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f4993i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f4993i != null) {
            return true;
        }
        return false;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i4) {
        if (!q()) {
            return super.a(context, cVar, resources, i4);
        }
        Object l4 = l();
        if (l4 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!n(context, l4, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(l4);
                return null;
            }
        }
        if (!p(l4)) {
            return null;
        }
        return i(l4);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Typeface i5;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b g4 = g(bVarArr, i4);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(g4.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g4.e()).setItalic(g4.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map h4 = p.h(context, bVarArr, cancellationSignal);
            Object l4 = l();
            if (l4 == null) {
                return null;
            }
            boolean z3 = false;
            for (g.b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) h4.get(bVar.d());
                if (byteBuffer != null) {
                    if (!o(l4, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        m(l4);
                        return null;
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                m(l4);
                return null;
            } else if (p(l4) && (i5 = i(l4)) != null) {
                return Typeface.create(i5, i4);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface d(Context context, Resources resources, int i4, String str, int i5) {
        if (!q()) {
            return super.d(context, resources, i4, str, i5);
        }
        Object l4 = l();
        if (l4 == null) {
            return null;
        }
        if (!n(context, l4, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m(l4);
            return null;
        } else if (!p(l4)) {
            return null;
        } else {
            return i(l4);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4991g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4997m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method r(Class cls) {
        return cls.getMethod("abortCreation", (Class[]) null);
    }

    /* access modifiers changed from: protected */
    public Method s(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor w(Class cls) {
        return cls.getConstructor((Class[]) null);
    }

    /* access modifiers changed from: protected */
    public Method x(Class cls) {
        return cls.getMethod("freeze", (Class[]) null);
    }
}
