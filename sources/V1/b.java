package V1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i4, parcel, parcel2, i5)) {
            return true;
        }
        return v(i4, parcel, parcel2, i5);
    }

    /* access modifiers changed from: protected */
    public abstract boolean v(int i4, Parcel parcel, Parcel parcel2, int i5);
}
