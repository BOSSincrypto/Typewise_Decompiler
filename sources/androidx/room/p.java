package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.i;
import androidx.room.j;
import androidx.room.m;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f6844a;

    /* renamed from: b  reason: collision with root package name */
    private final m f6845b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6846c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6847d;

    /* renamed from: e  reason: collision with root package name */
    private int f6848e;

    /* renamed from: f  reason: collision with root package name */
    public m.c f6849f;

    /* renamed from: g  reason: collision with root package name */
    private j f6850g;

    /* renamed from: h  reason: collision with root package name */
    private final i f6851h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f6852i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final ServiceConnection f6853j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f6854k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f6855l;

    public static final class a extends m.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f6856b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, String[] strArr) {
            super(strArr);
            this.f6856b = pVar;
        }

        public boolean b() {
            return true;
        }

        public void c(Set set) {
            o.e(set, "tables");
            if (!this.f6856b.j().get()) {
                try {
                    j h4 = this.f6856b.h();
                    if (h4 != null) {
                        int c4 = this.f6856b.c();
                        Object[] array = set.toArray(new String[0]);
                        o.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        h4.m(c4, (String[]) array);
                    }
                } catch (RemoteException e4) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e4);
                }
            }
        }
    }

    public static final class b extends i.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f6857d;

        b(p pVar) {
            this.f6857d = pVar;
        }

        /* access modifiers changed from: private */
        public static final void x(p pVar, String[] strArr) {
            o.e(pVar, "this$0");
            o.e(strArr, "$tables");
            pVar.e().j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public void g(String[] strArr) {
            o.e(strArr, "tables");
            this.f6857d.d().execute(new q(this.f6857d, strArr));
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f6858a;

        c(p pVar) {
            this.f6858a = pVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o.e(componentName, "name");
            o.e(iBinder, "service");
            this.f6858a.m(j.a.v(iBinder));
            this.f6858a.d().execute(this.f6858a.i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            o.e(componentName, "name");
            this.f6858a.d().execute(this.f6858a.g());
            this.f6858a.m((j) null);
        }
    }

    public p(Context context, String str, Intent intent, m mVar, Executor executor) {
        o.e(context, "context");
        o.e(str, "name");
        o.e(intent, "serviceIntent");
        o.e(mVar, "invalidationTracker");
        o.e(executor, "executor");
        this.f6844a = str;
        this.f6845b = mVar;
        this.f6846c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f6847d = applicationContext;
        c cVar = new c(this);
        this.f6853j = cVar;
        this.f6854k = new n(this);
        this.f6855l = new o(this);
        Object[] array = mVar.h().keySet().toArray(new String[0]);
        o.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* access modifiers changed from: private */
    public static final void k(p pVar) {
        o.e(pVar, "this$0");
        pVar.f6845b.m(pVar.f());
    }

    /* access modifiers changed from: private */
    public static final void n(p pVar) {
        o.e(pVar, "this$0");
        try {
            j jVar = pVar.f6850g;
            if (jVar != null) {
                pVar.f6848e = jVar.j(pVar.f6851h, pVar.f6844a);
                pVar.f6845b.b(pVar.f());
            }
        } catch (RemoteException e4) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e4);
        }
    }

    public final int c() {
        return this.f6848e;
    }

    public final Executor d() {
        return this.f6846c;
    }

    public final m e() {
        return this.f6845b;
    }

    public final m.c f() {
        m.c cVar = this.f6849f;
        if (cVar != null) {
            return cVar;
        }
        o.p("observer");
        return null;
    }

    public final Runnable g() {
        return this.f6855l;
    }

    public final j h() {
        return this.f6850g;
    }

    public final Runnable i() {
        return this.f6854k;
    }

    public final AtomicBoolean j() {
        return this.f6852i;
    }

    public final void l(m.c cVar) {
        o.e(cVar, "<set-?>");
        this.f6849f = cVar;
    }

    public final void m(j jVar) {
        this.f6850g = jVar;
    }
}
