package j;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j.a  reason: case insensitive filesystem */
public interface C0682a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13736a = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: j.a$a  reason: collision with other inner class name */
    public static abstract class C0193a extends Binder implements C0682a {
        public C0193a() {
            attachInterface(this, C0682a.f13736a);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            boolean z3;
            String str = C0682a.f13736a;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i4) {
                case 2:
                    i(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    d(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    o((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    l(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    int readInt = parcel.readInt();
                    Uri uri = (Uri) b.c(parcel, Uri.CREATOR);
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    r(readInt, uri, z3, (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle k4 = k(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, k4, 1);
                    break;
                case 8:
                    a(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 9:
                    h((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 10:
                    f(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 11:
                    s((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 12:
                    u((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                default:
                    return super.onTransact(i4, parcel, parcel2, i5);
            }
            return true;
        }
    }

    /* renamed from: j.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i4) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i4);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void a(int i4, int i5, Bundle bundle);

    void d(String str, Bundle bundle);

    void f(int i4, int i5, int i6, int i7, int i8, Bundle bundle);

    void h(Bundle bundle);

    void i(int i4, Bundle bundle);

    Bundle k(String str, Bundle bundle);

    void l(String str, Bundle bundle);

    void o(Bundle bundle);

    void r(int i4, Uri uri, boolean z3, Bundle bundle);

    void s(Bundle bundle);

    void u(Bundle bundle);
}
