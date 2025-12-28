package i3;

import android.content.Context;
import android.view.LayoutInflater;
import ch.icoaching.wrio.data.i;
import ch.icoaching.wrio.logging.Log;
import g.C0653d;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final i f13734a;

    /* renamed from: b  reason: collision with root package name */
    private C0653d f13735b;

    public c(i iVar) {
        o.e(iVar, "otherSettings");
        this.f13734a = iVar;
    }

    /* access modifiers changed from: private */
    public static final q c(c cVar, C0906a aVar) {
        cVar.f13734a.f(true);
        aVar.invoke();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q e(c cVar, C0906a aVar) {
        cVar.f13734a.f(true);
        aVar.invoke();
        return q.f14567a;
    }

    public final boolean d(LayoutInflater layoutInflater, C0906a aVar, C0906a aVar2, C0906a aVar3, l lVar) {
        o.e(layoutInflater, "layoutInflater");
        o.e(aVar, "isSubscriptionActive");
        o.e(aVar2, "onBannerClick");
        o.e(aVar3, "onBannerCloseClick");
        o.e(lVar, "onDisplayBannerCallback");
        if (this.f13734a.b()) {
            Log.d(Log.f10572a, "UnlockAIAssistantBannerController", "showBannerIfNecessary() :: Banner already closed by user", (Throwable) null, 4, (Object) null);
            return false;
        }
        long g4 = this.f13734a.g();
        if (g4 > 0) {
            int floor = (int) ((float) Math.floor((double) (((float) (System.currentTimeMillis() - (g4 * ((long) 1000)))) / ((float) 86400000))));
            if (this.f13734a.e() && !((Boolean) aVar.invoke()).booleanValue() && floor >= 3) {
                if (this.f13735b == null) {
                    Log.d(Log.f10572a, "UnlockAIAssistantBannerController", "showBannerIfNecessary() :: Creating banner view", (Throwable) null, 4, (Object) null);
                    Context context = layoutInflater.getContext();
                    o.d(context, "getContext(...)");
                    this.f13735b = new C0653d(context);
                }
                Log.d(Log.f10572a, "UnlockAIAssistantBannerController", "showBannerIfNecessary() :: Display banner", (Throwable) null, 4, (Object) null);
                C0653d dVar = this.f13735b;
                o.b(dVar);
                dVar.setOnClicked$typewise_sdk_2_4_40_219__typewiseRemoteRelease(new a(this, aVar2));
                dVar.setOnClosed$typewise_sdk_2_4_40_219__typewiseRemoteRelease(new b(this, aVar3));
                lVar.invoke(dVar);
                return true;
            }
        }
        return false;
    }
}
