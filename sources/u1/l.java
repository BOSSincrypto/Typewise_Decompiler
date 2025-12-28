package U1;

import V1.i;
import V1.o;
import V1.t;
import V1.v;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewException;
import y1.C0950d;
import y1.C0951e;
import y1.C0953g;

public final class l {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final i f1502c = new i("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    t f1503a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f1504b;

    public l(Context context) {
        this.f1504b = context.getPackageName();
        if (v.a(context)) {
            Context context2 = context;
            this.f1503a = new t(context2, f1502c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), h.f1495a, (o) null, (byte[]) null);
        }
    }

    public final C0950d a() {
        i iVar = f1502c;
        iVar.d("requestInAppReview (%s)", this.f1504b);
        if (this.f1503a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return C0953g.a(new ReviewException(-1));
        }
        C0951e eVar = new C0951e();
        this.f1503a.p(new i(this, eVar, eVar), eVar);
        return eVar.a();
    }
}
