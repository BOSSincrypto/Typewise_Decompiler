package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.i;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* renamed from: androidx.room.j$a$a  reason: collision with other inner class name */
        private static class C0109a implements j {

            /* renamed from: d  reason: collision with root package name */
            private IBinder f6809d;

            C0109a(IBinder iBinder) {
                this.f6809d = iBinder;
            }

            public IBinder asBinder() {
                return this.f6809d;
            }

            public int j(i iVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(iVar);
                    obtain.writeString(str);
                    this.f6809d.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void m(int i4, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i4);
                    obtain.writeStringArray(strArr);
                    this.f6809d.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static j v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                return new C0109a(iBinder);
            }
            return (j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i4 != 1598968902) {
                if (i4 == 1) {
                    int j4 = j(i.a.v(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(j4);
                } else if (i4 == 2) {
                    t(i.a.v(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                } else if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                } else {
                    m(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    int j(i iVar, String str);

    void m(int i4, String[] strArr);

    void t(i iVar, int i4);
}
