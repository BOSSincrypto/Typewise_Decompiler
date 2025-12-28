package t1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import v1.C0922a;
import w1.C0929a;
import w1.b;

/* renamed from: t1.a  reason: case insensitive filesystem */
public final class C0899a extends C0929a {
    public static final Parcelable.Creator<C0899a> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final C0899a f16363e = new C0899a(0);

    /* renamed from: a  reason: collision with root package name */
    final int f16364a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16365b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f16366c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16367d;

    C0899a(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.f16364a = i4;
        this.f16365b = i5;
        this.f16366c = pendingIntent;
        this.f16367d = str;
    }

    static String w(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i4) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i4 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0899a)) {
            return false;
        }
        C0899a aVar = (C0899a) obj;
        if (this.f16365b != aVar.f16365b || !C0922a.a(this.f16366c, aVar.f16366c) || !C0922a.a(this.f16367d, aVar.f16367d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0922a.b(Integer.valueOf(this.f16365b), this.f16366c, this.f16367d);
    }

    public int t() {
        return this.f16365b;
    }

    public String toString() {
        C0922a.C0246a c4 = C0922a.c(this);
        c4.a("statusCode", w(this.f16365b));
        c4.a("resolution", this.f16366c);
        c4.a("message", this.f16367d);
        return c4.toString();
    }

    public String u() {
        return this.f16367d;
    }

    public PendingIntent v() {
        return this.f16366c;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = b.a(parcel);
        b.c(parcel, 1, this.f16364a);
        b.c(parcel, 2, t());
        b.d(parcel, 3, v(), i4, false);
        b.e(parcel, 4, u(), false);
        b.b(parcel, a4);
    }

    public C0899a(int i4) {
        this(i4, (PendingIntent) null, (String) null);
    }

    public C0899a(int i4, PendingIntent pendingIntent, String str) {
        this(1, i4, pendingIntent, str);
    }
}
