package V1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: d  reason: collision with root package name */
    private final IBinder f1588d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1589e = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f1588d = iBinder;
    }

    public final IBinder asBinder() {
        return this.f1588d;
    }

    /* access modifiers changed from: protected */
    public final Parcel v() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1589e);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void w(int i4, Parcel parcel) {
        try {
            this.f1588d.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
