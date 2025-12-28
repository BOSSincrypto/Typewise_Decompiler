package k0;

import android.content.Context;
import androidx.work.m;
import i0.C0677a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.q;
import n0.c;

/* renamed from: k0.h  reason: case insensitive filesystem */
public abstract class C0700h {

    /* renamed from: a  reason: collision with root package name */
    private final c f13787a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f13788b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f13789c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet f13790d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private Object f13791e;

    protected C0700h(Context context, c cVar) {
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
        this.f13787a = cVar;
        Context applicationContext = context.getApplicationContext();
        o.d(applicationContext, "context.applicationContext");
        this.f13788b = applicationContext;
    }

    /* access modifiers changed from: private */
    public static final void b(List list, C0700h hVar) {
        o.e(list, "$listenersList");
        o.e(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0677a) it.next()).a(hVar.f13791e);
        }
    }

    public final void c(C0677a aVar) {
        o.e(aVar, "listener");
        synchronized (this.f13789c) {
            try {
                if (this.f13790d.add(aVar)) {
                    if (this.f13790d.size() == 1) {
                        this.f13791e = e();
                        m e4 = m.e();
                        String a4 = C0701i.f13792a;
                        e4.a(a4, getClass().getSimpleName() + ": initial state = " + this.f13791e);
                        h();
                    }
                    aVar.a(this.f13791e);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Context d() {
        return this.f13788b;
    }

    public abstract Object e();

    public final void f(C0677a aVar) {
        o.e(aVar, "listener");
        synchronized (this.f13789c) {
            try {
                if (this.f13790d.remove(aVar) && this.f13790d.isEmpty()) {
                    i();
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f13789c) {
            Object obj2 = this.f13791e;
            if (obj2 == null || !o.a(obj2, obj)) {
                this.f13791e = obj;
                this.f13787a.a().execute(new C0699g(C0718m.B0(this.f13790d), this));
                q qVar = q.f14567a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
