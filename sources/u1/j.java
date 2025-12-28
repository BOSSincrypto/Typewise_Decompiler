package U1;

import V1.g;
import V1.i;
import V1.t;
import android.os.Bundle;
import y1.C0951e;

abstract class j extends g {

    /* renamed from: d  reason: collision with root package name */
    final i f1498d;

    /* renamed from: e  reason: collision with root package name */
    final C0951e f1499e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l f1500f;

    j(l lVar, i iVar, C0951e eVar) {
        this.f1500f = lVar;
        this.f1498d = iVar;
        this.f1499e = eVar;
    }

    public void e(Bundle bundle) {
        t tVar = this.f1500f.f1503a;
        if (tVar != null) {
            tVar.r(this.f1499e);
        }
        this.f1498d.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
