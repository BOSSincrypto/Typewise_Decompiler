package k;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k.a  reason: case insensitive filesystem */
public interface C0692a extends IInterface {

    /* renamed from: c  reason: collision with root package name */
    public static final String f13778c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: k.a$a  reason: collision with other inner class name */
    public static abstract class C0196a extends Binder implements C0692a {

        /* renamed from: k.a$a$a  reason: collision with other inner class name */
        private static class C0197a implements C0692a {

            /* renamed from: d  reason: collision with root package name */
            private IBinder f13779d;

            C0197a(IBinder iBinder) {
                this.f13779d = iBinder;
            }

            public IBinder asBinder() {
                return this.f13779d;
            }

            public void q(String str, int i4, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0692a.f13778c);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f13779d.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static C0692a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0692a.f13778c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0692a)) {
                return new C0197a(iBinder);
            }
            return (C0692a) queryLocalInterface;
        }
    }

    /* renamed from: k.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i4) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i4);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void q(String str, int i4, String str2, Notification notification);
}
