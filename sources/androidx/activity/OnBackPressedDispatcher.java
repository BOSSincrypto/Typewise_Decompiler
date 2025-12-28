package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import com.getcapacitor.PluginMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C0712g;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f2344a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.core.util.a f2345b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0712g f2346c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public o f2347d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedCallback f2348e;

    /* renamed from: f  reason: collision with root package name */
    private OnBackInvokedDispatcher f2349f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2350g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2351h;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/k;", "Landroidx/activity/c;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/activity/o;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/o;)V", "Landroidx/lifecycle/m;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Ll2/q;", "c", "(Landroidx/lifecycle/m;Landroidx/lifecycle/Lifecycle$Event;)V", "cancel", "()V", "a", "Landroidx/lifecycle/Lifecycle;", "b", "Landroidx/activity/o;", "Landroidx/activity/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements C0461k, c {

        /* renamed from: a  reason: collision with root package name */
        private final Lifecycle f2352a;

        /* renamed from: b  reason: collision with root package name */
        private final o f2353b;

        /* renamed from: c  reason: collision with root package name */
        private c f2354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f2355d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, o oVar) {
            o.e(lifecycle, "lifecycle");
            o.e(oVar, "onBackPressedCallback");
            this.f2355d = onBackPressedDispatcher;
            this.f2352a = lifecycle;
            this.f2353b = oVar;
            lifecycle.a(this);
        }

        public void c(m mVar, Lifecycle.Event event) {
            o.e(mVar, "source");
            o.e(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.f2354c = this.f2355d.i(this.f2353b);
            } else if (event == Lifecycle.Event.ON_STOP) {
                c cVar = this.f2354c;
                if (cVar != null) {
                    cVar.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f2352a.c(this);
            this.f2353b.removeCancellable(this);
            c cVar = this.f2354c;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f2354c = null;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2356a = new a();

        private a() {
        }

        /* access modifiers changed from: private */
        public static final void c(C0906a aVar) {
            o.e(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(C0906a aVar) {
            o.e(aVar, "onBackInvoked");
            return new p(aVar);
        }

        public final void d(Object obj, int i4, Object obj2) {
            o.e(obj, "dispatcher");
            o.e(obj2, PluginMethod.RETURN_CALLBACK);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            o.e(obj, "dispatcher");
            o.e(obj2, PluginMethod.RETURN_CALLBACK);
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2357a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f2358a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f2359b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C0906a f2360c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C0906a f2361d;

            a(l lVar, l lVar2, C0906a aVar, C0906a aVar2) {
                this.f2358a = lVar;
                this.f2359b = lVar2;
                this.f2360c = aVar;
                this.f2361d = aVar2;
            }

            public void onBackCancelled() {
                this.f2361d.invoke();
            }

            public void onBackInvoked() {
                this.f2360c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                o.e(backEvent, "backEvent");
                this.f2359b.invoke(new b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                o.e(backEvent, "backEvent");
                this.f2358a.invoke(new b(backEvent));
            }
        }

        private b() {
        }

        public final OnBackInvokedCallback a(l lVar, l lVar2, C0906a aVar, C0906a aVar2) {
            o.e(lVar, "onBackStarted");
            o.e(lVar2, "onBackProgressed");
            o.e(aVar, "onBackInvoked");
            o.e(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class c implements c {

        /* renamed from: a  reason: collision with root package name */
        private final o f2362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f2363b;

        public c(OnBackPressedDispatcher onBackPressedDispatcher, o oVar) {
            o.e(oVar, "onBackPressedCallback");
            this.f2363b = onBackPressedDispatcher;
            this.f2362a = oVar;
        }

        public void cancel() {
            this.f2363b.f2346c.remove(this.f2362a);
            if (o.a(this.f2363b.f2347d, this.f2362a)) {
                this.f2362a.handleOnBackCancelled();
                this.f2363b.f2347d = null;
            }
            this.f2362a.removeCancellable(this);
            C0906a enabledChangedCallback$activity_release = this.f2362a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f2362a.setEnabledChangedCallback$activity_release((C0906a) null);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, androidx.core.util.a aVar) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f2344a = runnable;
        this.f2345b = aVar;
        this.f2346c = new C0712g();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                onBackInvokedCallback = b.f2357a.a(new l(this) {
                    final /* synthetic */ OnBackPressedDispatcher this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((b) obj);
                        return q.f14567a;
                    }

                    public final void invoke(b bVar) {
                        o.e(bVar, "backEvent");
                        this.this$0.m(bVar);
                    }
                }, new l(this) {
                    final /* synthetic */ OnBackPressedDispatcher this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((b) obj);
                        return q.f14567a;
                    }

                    public final void invoke(b bVar) {
                        o.e(bVar, "backEvent");
                        this.this$0.l(bVar);
                    }
                }, new C0906a(this) {
                    final /* synthetic */ OnBackPressedDispatcher this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        this.this$0.k();
                    }
                }, new C0906a(this) {
                    final /* synthetic */ OnBackPressedDispatcher this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        this.this$0.j();
                    }
                });
            } else {
                onBackInvokedCallback = a.f2356a.b(new C0906a(this) {
                    final /* synthetic */ OnBackPressedDispatcher this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        this.this$0.k();
                    }
                });
            }
            this.f2348e = onBackInvokedCallback;
        }
    }

    /* access modifiers changed from: private */
    public final void j() {
        Object obj;
        C0712g gVar = this.f2346c;
        ListIterator listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((o) obj).isEnabled()) {
                break;
            }
        }
        o oVar = (o) obj;
        this.f2347d = null;
        if (oVar != null) {
            oVar.handleOnBackCancelled();
        }
    }

    /* access modifiers changed from: private */
    public final void l(b bVar) {
        Object obj;
        C0712g gVar = this.f2346c;
        ListIterator listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((o) obj).isEnabled()) {
                break;
            }
        }
        o oVar = (o) obj;
        if (oVar != null) {
            oVar.handleOnBackProgressed(bVar);
        }
    }

    /* access modifiers changed from: private */
    public final void m(b bVar) {
        Object obj;
        C0712g gVar = this.f2346c;
        ListIterator listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((o) obj).isEnabled()) {
                break;
            }
        }
        o oVar = (o) obj;
        this.f2347d = oVar;
        if (oVar != null) {
            oVar.handleOnBackStarted(bVar);
        }
    }

    private final void o(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2349f;
        OnBackInvokedCallback onBackInvokedCallback = this.f2348e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z3 && !this.f2350g) {
                a.f2356a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f2350g = true;
            } else if (!z3 && this.f2350g) {
                a.f2356a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f2350g = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void p() {
        boolean z3 = this.f2351h;
        C0712g gVar = this.f2346c;
        boolean z4 = false;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            Iterator it = gVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((o) it.next()).isEnabled()) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f2351h = z4;
        if (z4 != z3) {
            androidx.core.util.a aVar = this.f2345b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z4));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z4);
            }
        }
    }

    public final void h(m mVar, o oVar) {
        o.e(mVar, "owner");
        o.e(oVar, "onBackPressedCallback");
        Lifecycle lifecycle = mVar.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            oVar.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, oVar));
            p();
            oVar.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
        }
    }

    public final c i(o oVar) {
        o.e(oVar, "onBackPressedCallback");
        this.f2346c.add(oVar);
        c cVar = new c(this, oVar);
        oVar.addCancellable(cVar);
        p();
        oVar.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return cVar;
    }

    public final void k() {
        Object obj;
        C0712g gVar = this.f2346c;
        ListIterator listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((o) obj).isEnabled()) {
                break;
            }
        }
        o oVar = (o) obj;
        this.f2347d = null;
        if (oVar != null) {
            oVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f2344a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        o.e(onBackInvokedDispatcher, "invoker");
        this.f2349f = onBackInvokedDispatcher;
        o(this.f2351h);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, (androidx.core.util.a) null);
    }
}
