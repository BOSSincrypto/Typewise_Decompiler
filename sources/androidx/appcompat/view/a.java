package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import n.C0823b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f2736a;

    private a(Context context) {
        this.f2736a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        if (this.f2736a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.f2736a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f2736a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 > 480 && i5 > 640) {
            return 4;
        }
        if (i4 >= 360) {
            return 3;
        }
        return 2;
    }

    public boolean e() {
        return this.f2736a.getResources().getBoolean(C0823b.f14694a);
    }

    public boolean f() {
        return true;
    }
}
