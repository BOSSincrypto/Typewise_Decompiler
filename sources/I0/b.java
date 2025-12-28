package I0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.icoaching.wrio.logging.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

public final class b implements H0.b {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f581a;

    public b(Context context) {
        o.e(context, "applicationContext");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        o.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f581a = defaultSharedPreferences;
    }

    public void a(boolean z3) {
        this.f581a.edit().putBoolean("appnomix_aiassistant", z3).apply();
    }

    public long g() {
        if (!this.f581a.contains("install_date")) {
            return 0;
        }
        try {
            return this.f581a.getLong("install_date", 0);
        } catch (ClassCastException unused) {
            return (long) this.f581a.getInt("install_date", 0);
        }
    }

    public boolean h() {
        if (this.f581a.contains("appnomix_mode")) {
            return this.f581a.getBoolean("appnomix_mode", false);
        }
        return false;
    }

    public boolean i() {
        if (this.f581a.contains("secondAppnomixBannerClosed")) {
            return this.f581a.getBoolean("secondAppnomixBannerClosed", false);
        }
        return false;
    }

    public void j(long j4) {
        this.f581a.edit().putLong("firstAppnomixBannerShownTime", j4).apply();
    }

    public void k(List list) {
        o.e(list, "browserPackageNames");
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        this.f581a.edit().putString("browser_package_names", sb.toString()).apply();
    }

    public List l() {
        String str = "";
        if (this.f581a.contains("browser_package_names")) {
            str = this.f581a.getString("browser_package_names", str);
            o.b(str);
        }
        return kotlin.text.o.s0(str, new char[]{','}, false, 0, 6, (Object) null);
    }

    public long m() {
        if (this.f581a.contains("firstAppnomixBannerShownTime")) {
            return this.f581a.getLong("firstAppnomixBannerShownTime", 0);
        }
        return 0;
    }

    public long n() {
        if (this.f581a.contains("last_browser_check_date")) {
            return this.f581a.getLong("last_browser_check_date", 0);
        }
        return 0;
    }

    public void o(long j4) {
        this.f581a.edit().putLong("last_browser_check_date", j4).apply();
    }

    public void p(boolean z3) {
        this.f581a.edit().putBoolean("secondAppnomixBannerClosed", z3).apply();
    }

    public boolean q() {
        if (this.f581a.contains("firstAppnomixBannerClosed")) {
            return this.f581a.getBoolean("firstAppnomixBannerClosed", false);
        }
        return false;
    }

    public void r(boolean z3) {
        this.f581a.edit().putBoolean("firstAppnomixBannerClosed", z3).apply();
    }

    public boolean s() {
        boolean z3;
        boolean z4 = false;
        if (this.f581a.contains("appnomix_aiassistant")) {
            z3 = this.f581a.getBoolean("appnomix_aiassistant", false);
        } else {
            z3 = false;
        }
        boolean h4 = h();
        if (z3 && h4) {
            z4 = true;
        }
        Log.d(Log.f10572a, "AppnomixSharedPreferences", "isAppnomixAIAssistantEnabled :: [" + z3 + ", " + h4 + "] => " + z4, (Throwable) null, 4, (Object) null);
        return z4;
    }
}
