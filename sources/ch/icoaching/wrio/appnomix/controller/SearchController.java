package ch.icoaching.wrio.appnomix.controller;

import H0.b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.appnomix.data.network.c;
import ch.icoaching.wrio.appnomix.data.network.g;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Regex;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.g0;
import l2.q;

public final class SearchController {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9209a;

    /* renamed from: b  reason: collision with root package name */
    private final D f9210b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9211c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a f9212d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineDispatcher f9213e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final CoroutineDispatcher f9214f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final g f9215g = c.f9246a.h();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public K0.c f9216h;

    /* renamed from: i  reason: collision with root package name */
    private int f9217i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9218j;

    /* renamed from: k  reason: collision with root package name */
    private String f9219k = "";
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public j f9220l = o.b(1, 0, (BufferOverflow) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public k f9221m = r.a(new g(false, false));

    /* renamed from: n  reason: collision with root package name */
    private g0 f9222n;

    /* renamed from: o  reason: collision with root package name */
    private g0 f9223o;

    /* renamed from: p  reason: collision with root package name */
    private g0 f9224p;

    /* renamed from: q  reason: collision with root package name */
    private final Regex f9225q = new Regex("(^www|.*://)");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Map f9226r = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Map f9227s = new LinkedHashMap();

    public interface a {
        void a();

        void b();

        void c(String str, String str2);

        void d(SearchSuggestion searchSuggestion);
    }

    public SearchController(Context context, D d4, b bVar, a aVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        kotlin.jvm.internal.o.e(context, "applicationContext");
        kotlin.jvm.internal.o.e(d4, "serviceScope");
        kotlin.jvm.internal.o.e(bVar, "appnomixSharedPreferences");
        kotlin.jvm.internal.o.e(aVar, "onSearchEventListener");
        kotlin.jvm.internal.o.e(coroutineDispatcher, "ioDispatcher");
        kotlin.jvm.internal.o.e(coroutineDispatcher2, "mainDispatcher");
        this.f9209a = context;
        this.f9210b = d4;
        this.f9211c = bVar;
        this.f9212d = aVar;
        this.f9213e = coroutineDispatcher;
        this.f9214f = coroutineDispatcher2;
    }

    /* access modifiers changed from: private */
    public final Object l(kotlin.coroutines.c cVar) {
        if (this.f9216h != null) {
            return q.f14567a;
        }
        Object e4 = C0738g.e(this.f9213e, new SearchController$delaySubmittingToSearchViewIfNull$2((kotlin.coroutines.c<? super SearchController$delaySubmittingToSearchViewIfNull$2>) null), cVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q o(SearchController searchController, String str) {
        kotlin.jvm.internal.o.e(str, "productUrl");
        searchController.f9212d.c(str, searchController.f9219k);
        return q.f14567a;
    }

    public static /* synthetic */ void s(SearchController searchController, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        searchController.r(z3);
    }

    private final boolean x(String str) {
        return this.f9225q.matches(str);
    }

    public final String m() {
        return this.f9219k;
    }

    public final K0.c n(LayoutInflater layoutInflater) {
        kotlin.jvm.internal.o.e(layoutInflater, "layoutInflater");
        if (this.f9216h == null) {
            Context context = layoutInflater.getContext();
            kotlin.jvm.internal.o.d(context, "getContext(...)");
            K0.c cVar = new K0.c(context);
            cVar.setSearchViewHeight(this.f9217i);
            cVar.Z();
            cVar.setOnSearchSuggestionsClicked(new SearchController$getSearchView$1(this.f9212d));
            cVar.setOnProductSuggestionsClicked(new f(this));
            this.f9216h = cVar;
        }
        K0.c cVar2 = this.f9216h;
        kotlin.jvm.internal.o.b(cVar2);
        return cVar2;
    }

    public final boolean p() {
        K0.c cVar = this.f9216h;
        if (cVar == null || cVar.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void q(String str) {
        kotlin.jvm.internal.o.e(str, "newText");
        boolean x3 = x(str);
        Objects.toString(I.b(str, (Integer) null, 1, (Object) null));
        if (!this.f9218j || x3) {
            this.f9212d.a();
        } else {
            this.f9220l.d(str);
        }
    }

    public final void r(boolean z3) {
        if (z3) {
            this.f9216h = null;
            g0 g0Var = this.f9222n;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            g0 g0Var2 = this.f9223o;
            if (g0Var2 != null) {
                g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
            }
            g0 g0Var3 = this.f9224p;
            if (g0Var3 != null) {
                g0.a.a(g0Var3, (CancellationException) null, 1, (Object) null);
            }
        }
        this.f9226r.clear();
        this.f9227s.clear();
    }

    public final void t(int i4) {
        this.f9217i = i4;
    }

    public final void u(String str) {
        kotlin.jvm.internal.o.e(str, "sessionId");
        g gVar = this.f9215g;
        gVar.getClass();
        kotlin.jvm.internal.o.e(str, "sessionId");
        gVar.f9255c = str;
    }

    public final void v(String str) {
        kotlin.jvm.internal.o.e(str, "userId");
        g gVar = this.f9215g;
        gVar.getClass();
        kotlin.jvm.internal.o.e(str, "userId");
        gVar.f9254b = str;
    }

    public final boolean w(EditorInfo editorInfo) {
        boolean z3;
        boolean z4;
        kotlin.jvm.internal.o.e(editorInfo, "editorInfo");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long n4 = this.f9211c.n();
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.googlequicksearchbox");
        if (n4 == 0 || elapsedRealtime - n4 > 604800000) {
            List<ResolveInfo> queryIntentActivities = this.f9209a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 131072);
            kotlin.jvm.internal.o.d(queryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.packageName;
                kotlin.jvm.internal.o.d(str, "packageName");
                arrayList.add(str);
            }
            this.f9211c.k(arrayList);
            this.f9211c.o(elapsedRealtime);
        } else {
            arrayList.addAll(this.f9211c.l());
        }
        boolean z5 = false;
        if ((editorInfo.imeOptions & 255) == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((editorInfo.inputType & 4080) == 16) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.o.a((String) it.next(), editorInfo.packageName)) {
                    if ((z3 || z4) && this.f9211c.h()) {
                        z5 = true;
                    }
                }
            }
        }
        this.f9218j = z5;
        this.f9219k = editorInfo.packageName;
        return z5;
    }

    public final void y() {
        this.f9220l = o.b(1, 0, (BufferOverflow) null, 6, (Object) null);
        this.f9221m = r.a(new g(false, false));
        this.f9222n = C0739h.d(this.f9210b, (CoroutineContext) null, (CoroutineStart) null, new SearchController$subscribeToTextChanges$1(this, (kotlin.coroutines.c<? super SearchController$subscribeToTextChanges$1>) null), 3, (Object) null);
        this.f9223o = C0739h.d(this.f9210b, (CoroutineContext) null, (CoroutineStart) null, new SearchController$subscribeToTextChanges$2(this, (kotlin.coroutines.c<? super SearchController$subscribeToTextChanges$2>) null), 3, (Object) null);
        this.f9224p = C0739h.d(this.f9210b, (CoroutineContext) null, (CoroutineStart) null, new SearchController$subscribeToTextChanges$3(this, (kotlin.coroutines.c<? super SearchController$subscribeToTextChanges$3>) null), 3, (Object) null);
    }
}
