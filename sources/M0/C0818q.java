package m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.m;

/* renamed from: m0.q  reason: case insensitive filesystem */
public abstract class C0818q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14616a = m.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z3) {
        int i4;
        String str;
        String str2 = "disabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z3) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i4, 1);
            m e4 = m.e();
            String str3 = f14616a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (z3) {
                str = "enabled";
            } else {
                str = str2;
            }
            sb.append(str);
            e4.a(str3, sb.toString());
        } catch (Exception e5) {
            m e6 = m.e();
            String str4 = f14616a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z3) {
                str2 = "enabled";
            }
            sb2.append(str2);
            e6.b(str4, sb2.toString(), e5);
        }
    }
}
