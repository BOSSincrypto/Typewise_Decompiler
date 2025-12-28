package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import n.i;

public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    private static Configuration f2739f;

    /* renamed from: a  reason: collision with root package name */
    private int f2740a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f2741b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f2742c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f2743d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f2744e;

    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i4) {
        super(context);
        this.f2740a = i4;
    }

    private Resources b() {
        if (this.f2744e == null) {
            Configuration configuration = this.f2743d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f2744e = super.getResources();
            } else {
                this.f2744e = a.a(this, this.f2743d).getResources();
            }
        }
        return this.f2744e;
    }

    private void d() {
        boolean z3;
        if (this.f2741b == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f2741b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2741b.setTo(theme);
            }
        }
        f(this.f2741b, this.f2740a, z3);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f2739f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f2739f = configuration2;
        }
        return configuration.equals(f2739f);
    }

    public void a(Configuration configuration) {
        if (this.f2744e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f2743d == null) {
            this.f2743d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f2740a;
    }

    /* access modifiers changed from: protected */
    public void f(Resources.Theme theme, int i4, boolean z3) {
        theme.applyStyle(i4, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2742c == null) {
            this.f2742c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2742c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2741b;
        if (theme != null) {
            return theme;
        }
        if (this.f2740a == 0) {
            this.f2740a = i.f14838d;
        }
        d();
        return this.f2741b;
    }

    public void setTheme(int i4) {
        if (this.f2740a != i4) {
            this.f2740a = i4;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f2741b = theme;
    }
}
