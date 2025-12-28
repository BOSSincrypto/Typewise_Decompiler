package ch.icoaching.wrio.appnomix.controller;

import H0.b;
import H0.g;
import J0.c;
import android.content.Context;
import android.view.LayoutInflater;
import ch.icoaching.wrio.logging.Log;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9233a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9234b;

    /* renamed from: c  reason: collision with root package name */
    private c f9235c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9236d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9237e;

    public d(Context context, b bVar) {
        o.e(context, "context");
        o.e(bVar, "appnomixSharedPreferences");
        this.f9233a = context;
        this.f9234b = bVar;
    }

    private final c c(LayoutInflater layoutInflater) {
        int i4;
        if (this.f9235c == null) {
            Log.d(Log.f10572a, "AppnomixBannerController", "getBannerForDisplay() :: Creating banner view", (Throwable) null, 4, (Object) null);
            Context context = layoutInflater.getContext();
            o.d(context, "getContext(...)");
            this.f9235c = new c(context);
        }
        this.f9237e = false;
        this.f9236d = false;
        if (j()) {
            Log.d(Log.f10572a, "AppnomixBannerController", "getBannerForDisplay() :: Creating first banner view", (Throwable) null, 4, (Object) null);
            this.f9237e = true;
            this.f9234b.j(System.currentTimeMillis());
            i4 = g.first_appnomix_banner_text;
        } else {
            Log.d(Log.f10572a, "AppnomixBannerController", "getBannerForDisplay() :: Creating second banner view", (Throwable) null, 4, (Object) null);
            this.f9236d = true;
            i4 = g.second_appnomix_banner_text;
        }
        c cVar = this.f9235c;
        if (cVar != null) {
            String string = this.f9233a.getString(i4);
            o.d(string, "getString(...)");
            cVar.setBannerText$typewise_sdk_appnomix_2_4_40_219__remoteRelease(string);
        }
        c cVar2 = this.f9235c;
        o.b(cVar2);
        return cVar2;
    }

    private final boolean d() {
        if (!this.f9234b.q() || System.currentTimeMillis() - this.f9234b.m() <= 518400000 || this.f9234b.i()) {
            return false;
        }
        return true;
    }

    private final boolean e() {
        if (this.f9234b.q() || System.currentTimeMillis() - this.f9234b.m() <= 518400000) {
            return false;
        }
        return true;
    }

    private final boolean f() {
        if (this.f9234b.m() != 0) {
            return true;
        }
        return false;
    }

    private final boolean g() {
        if (Math.floor((((double) System.currentTimeMillis()) - (((double) this.f9234b.g()) * 1000.0d)) / ((double) 86400000)) < 7.0d) {
            return true;
        }
        return false;
    }

    private final boolean i() {
        if (g() || this.f9234b.h() || (f() && !e() && !d())) {
            return false;
        }
        return true;
    }

    private final boolean j() {
        boolean z3;
        if (System.currentTimeMillis() - this.f9234b.m() < 518400000) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean q4 = this.f9234b.q();
        if (!f() || (z3 && !q4)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final q l(d dVar, C0906a aVar) {
        dVar.f9234b.r(true);
        dVar.f9234b.p(true);
        aVar.invoke();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q m(d dVar, C0906a aVar) {
        if (dVar.f9237e) {
            Log.d(Log.f10572a, "AppnomixBannerController", "onBannerClosed() : first banner", (Throwable) null, 4, (Object) null);
            dVar.f9234b.r(true);
        } else {
            Log.d(Log.f10572a, "AppnomixBannerController", "onBannerClosed() : second banner", (Throwable) null, 4, (Object) null);
            dVar.f9234b.r(true);
            dVar.f9234b.p(true);
        }
        aVar.invoke();
        return q.f14567a;
    }

    public final void h(int i4, int i5) {
        c cVar = this.f9235c;
        if (cVar != null) {
            cVar.G(i4, i5);
        }
    }

    public final boolean k(LayoutInflater layoutInflater, int i4, int i5, C0906a aVar, C0906a aVar2, C0906a aVar3, l lVar) {
        o.e(layoutInflater, "layoutInflater");
        o.e(aVar, "isSubscriptionActive");
        o.e(aVar2, "onBannerClick");
        o.e(aVar3, "onBannerCloseClick");
        o.e(lVar, "onDisplayBannerCallback");
        if (!this.f9234b.h()) {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                Log.d(Log.f10572a, "AppnomixBannerController", "showBannerIfNecessary() :: Not setting up search and banner controllers - app is not free", (Throwable) null, 4, (Object) null);
                return false;
            } else if (i()) {
                Log.d(Log.f10572a, "AppnomixBannerController", "showBannerIfNecessary() :: Display Appnomix banner", (Throwable) null, 4, (Object) null);
                c c4 = c(layoutInflater);
                h(i4, i5);
                c cVar = this.f9235c;
                if (cVar != null) {
                    cVar.setOnBannerClicked$typewise_sdk_appnomix_2_4_40_219__remoteRelease(new b(this, aVar2));
                }
                c cVar2 = this.f9235c;
                if (cVar2 != null) {
                    cVar2.setOnBannerClosed$typewise_sdk_appnomix_2_4_40_219__remoteRelease(new c(this, aVar3));
                }
                lVar.invoke(c4);
                return true;
            }
        }
        return false;
    }
}
