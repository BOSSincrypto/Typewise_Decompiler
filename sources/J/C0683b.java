package j;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j.b  reason: case insensitive filesystem */
public interface C0683b extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f13737b = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: j.b$a */
    public static abstract class a extends Binder implements C0683b {

        /* renamed from: j.b$a$a  reason: collision with other inner class name */
        private static class C0194a implements C0683b {

            /* renamed from: d  reason: collision with root package name */
            private IBinder f13738d;

            C0194a(IBinder iBinder) {
                this.f13738d = iBinder;
            }

            public IBinder asBinder() {
                return this.f13738d;
            }

            public boolean c(C0682a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0683b.f13737b);
                    obtain.writeStrongInterface(aVar);
                    boolean z3 = false;
                    this.f13738d.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean n(C0682a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0683b.f13737b);
                    obtain.writeStrongInterface(aVar);
                    boolean z3 = false;
                    C0195b.b(obtain, bundle, 0);
                    this.f13738d.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean p(long j4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0683b.f13737b);
                    obtain.writeLong(j4);
                    boolean z3 = false;
                    this.f13738d.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static C0683b v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0683b.f13737b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0683b)) {
                return new C0194a(iBinder);
            }
            return (C0683b) queryLocalInterface;
        }
    }

    /* renamed from: j.b$b  reason: collision with other inner class name */
    public static class C0195b {
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

    boolean c(C0682a aVar);

    boolean n(C0682a aVar, Bundle bundle);

    boolean p(long j4);
}
