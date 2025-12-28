package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class Z extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f3490c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList f3491d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f3492a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f3493b;

    private Z(Context context) {
        super(context);
        if (m0.c()) {
            m0 m0Var = new m0(this, context.getResources());
            this.f3492a = m0Var;
            Resources.Theme newTheme = m0Var.newTheme();
            this.f3493b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f3492a = new b0(this, context.getResources());
        this.f3493b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof Z) || (context.getResources() instanceof b0) || (context.getResources() instanceof m0)) {
            return false;
        }
        return m0.c();
    }

    public static Context b(Context context) {
        Z z3;
        if (!a(context)) {
            return context;
        }
        synchronized (f3490c) {
            try {
                ArrayList arrayList = f3491d;
                if (arrayList == null) {
                    f3491d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f3491d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f3491d.remove(size);
                        }
                    }
                    for (int size2 = f3491d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f3491d.get(size2);
                        if (weakReference2 != null) {
                            z3 = (Z) weakReference2.get();
                        } else {
                            z3 = null;
                        }
                        if (z3 != null && z3.getBaseContext() == context) {
                            return z3;
                        }
                    }
                }
                Z z4 = new Z(context);
                f3491d.add(new WeakReference(z4));
                return z4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AssetManager getAssets() {
        return this.f3492a.getAssets();
    }

    public Resources getResources() {
        return this.f3492a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3493b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    public void setTheme(int i4) {
        Resources.Theme theme = this.f3493b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
