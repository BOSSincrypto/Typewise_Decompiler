package V1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    public final void b(String str, Bundle bundle, h hVar) {
        Parcel v3 = v();
        v3.writeString(str);
        c.c(v3, bundle);
        c.d(v3, hVar);
        w(2, v3);
    }
}
