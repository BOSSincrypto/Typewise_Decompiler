package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;
import y.C0943e;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final o f4979a;

    /* renamed from: b  reason: collision with root package name */
    private static final C0943e f4980b = new C0943e(16);

    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f4981a;

        public a(h.e eVar) {
            this.f4981a = eVar;
        }

        public void a(int i4) {
            h.e eVar = this.f4981a;
            if (eVar != null) {
                eVar.f(i4);
            }
        }

        public void b(Typeface typeface) {
            h.e eVar = this.f4981a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f4979a = new n();
        } else if (i4 >= 28) {
            f4979a = new m();
        } else if (i4 >= 26) {
            f4979a = new l();
        } else if (i4 < 24 || !k.j()) {
            f4979a = new j();
        } else {
            f4979a = new k();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        return f4979a.b(context, cancellationSignal, bVarArr, i4);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i4, String str, int i5, int i6, h.e eVar, Handler handler, boolean z3) {
        Typeface typeface;
        boolean z4;
        int i7;
        e.b bVar2 = bVar;
        h.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof e.C0071e) {
            e.C0071e eVar3 = (e.C0071e) bVar2;
            Typeface g4 = g(eVar3.c());
            if (g4 != null) {
                if (eVar2 != null) {
                    eVar2.d(g4, handler2);
                }
                return g4;
            }
            if (!z3 ? eVar2 != null : eVar3.a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3) {
                i7 = eVar3.d();
            } else {
                i7 = -1;
            }
            typeface = g.c(context, eVar3.b(), i6, z4, i7, h.e.e(handler), new a(eVar2));
            Resources resources2 = resources;
            int i8 = i6;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f4979a.a(context, (e.c) bVar2, resources, i6);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.d(typeface, handler2);
                } else {
                    eVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f4980b.d(e(resources, i4, str, i5, i6), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i4, String str, int i5, int i6) {
        Typeface d4 = f4979a.d(context, resources, i4, str, i6);
        if (d4 != null) {
            f4980b.d(e(resources, i4, str, i5, i6), d4);
        }
        return d4;
    }

    private static String e(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    public static Typeface f(Resources resources, int i4, String str, int i5, int i6) {
        return (Typeface) f4980b.c(e(resources, i4, str, i5, i6));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
