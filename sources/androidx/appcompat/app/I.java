package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.b;
import java.util.Calendar;

class I {

    /* renamed from: d  reason: collision with root package name */
    private static I f2558d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2559a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f2560b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2561c = new a();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f2562a;

        /* renamed from: b  reason: collision with root package name */
        long f2563b;

        a() {
        }
    }

    I(Context context, LocationManager locationManager) {
        this.f2559a = context;
        this.f2560b = locationManager;
    }

    static I a(Context context) {
        if (f2558d == null) {
            Context applicationContext = context.getApplicationContext();
            f2558d = new I(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2558d;
    }

    private Location b() {
        Location location;
        Location location2 = null;
        if (b.b(this.f2559a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (b.b(this.f2559a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    private Location c(String str) {
        try {
            if (this.f2560b.isProviderEnabled(str)) {
                return this.f2560b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        if (this.f2561c.f2563b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    private void f(Location location) {
        long j4;
        a aVar = this.f2561c;
        long currentTimeMillis = System.currentTimeMillis();
        H b4 = H.b();
        H h4 = b4;
        h4.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        h4.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z3 = true;
        if (b4.f2557c != 1) {
            z3 = false;
        }
        boolean z4 = z3;
        long j5 = b4.f2556b;
        long j6 = b4.f2555a;
        long j7 = j6;
        double latitude = location.getLatitude();
        long j8 = j5;
        b4.a(currentTimeMillis + 86400000, latitude, location.getLongitude());
        long j9 = b4.f2556b;
        if (j8 == -1 || j7 == -1) {
            j4 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j7) {
                if (currentTimeMillis > j8) {
                    j9 = j7;
                } else {
                    j9 = j8;
                }
            }
            j4 = j9 + 60000;
        }
        aVar.f2562a = z4;
        aVar.f2563b = j4;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f2561c;
        if (e()) {
            return aVar.f2562a;
        }
        Location b4 = b();
        if (b4 != null) {
            f(b4);
            return aVar.f2562a;
        }
        int i4 = Calendar.getInstance().get(11);
        if (i4 < 6 || i4 >= 22) {
            return true;
        }
        return false;
    }
}
