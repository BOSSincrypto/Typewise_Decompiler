package U1;

import V1.i;
import android.app.PendingIntent;
import android.os.Bundle;
import y1.C0951e;

final class k extends j {

    /* renamed from: g  reason: collision with root package name */
    final String f1501g;

    k(l lVar, C0951e eVar, String str) {
        super(lVar, new i("OnRequestInstallCallback"), eVar);
        this.f1501g = str;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f1499e.c(new d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
