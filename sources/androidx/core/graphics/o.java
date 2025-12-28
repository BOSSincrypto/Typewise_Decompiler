package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap f4998a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        /* renamed from: c */
        public int a(g.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    o() {
    }

    private static Object e(Object[] objArr, int i4, b bVar) {
        int i5;
        boolean z3;
        if ((i4 & 1) == 0) {
            i5 = 400;
        } else {
            i5 = 700;
        }
        if ((i4 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return f(objArr, i5, z3, bVar);
    }

    private static Object f(Object[] objArr, int i4, boolean z3, b bVar) {
        int i5;
        Object obj = null;
        int i6 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(bVar.a(obj2) - i4) * 2;
            if (bVar.b(obj2) == z3) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            int i7 = abs + i5;
            if (obj == null || i6 > i7) {
                obj = obj2;
                i6 = i7;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i4);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4);

    /* access modifiers changed from: protected */
    public Typeface c(Context context, InputStream inputStream) {
        File e4 = p.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (!p.d(e4, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e4.getPath());
            e4.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i4, String str, int i5) {
        File e4 = p.e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (!p.c(e4, resources, i4)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e4.getPath());
            e4.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e4.delete();
        }
    }

    /* access modifiers changed from: protected */
    public g.b g(g.b[] bVarArr, int i4) {
        return (g.b) e(bVarArr, i4, new a());
    }
}
