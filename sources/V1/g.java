package V1;

import android.os.Bundle;
import android.os.Parcel;

public abstract class g extends b implements h {
    public g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        c.b(parcel);
        e((Bundle) c.a(parcel, Bundle.CREATOR));
        return true;
    }
}
