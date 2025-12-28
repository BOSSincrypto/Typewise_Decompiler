package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* renamed from: androidx.room.i$a$a  reason: collision with other inner class name */
        private static class C0108a implements i {

            /* renamed from: d  reason: collision with root package name */
            private IBinder f6808d;

            C0108a(IBinder iBinder) {
                this.f6808d = iBinder;
            }

            public IBinder asBinder() {
                return this.f6808d;
            }

            public void g(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f6808d.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static i v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof i)) {
                return new C0108a(iBinder);
            }
            return (i) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            } else {
                g(parcel.createStringArray());
                return true;
            }
        }
    }

    void g(String[] strArr);
}
