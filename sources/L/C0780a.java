package l;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: l.a  reason: case insensitive filesystem */
public final class C0780a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f14421a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f14422b;

    public final void a(C0781b bVar) {
        o.e(bVar, "listener");
        Context context = this.f14422b;
        if (context != null) {
            bVar.a(context);
        }
        this.f14421a.add(bVar);
    }

    public final void b() {
        this.f14422b = null;
    }

    public final void c(Context context) {
        o.e(context, "context");
        this.f14422b = context;
        for (C0781b a4 : this.f14421a) {
            a4.a(context);
        }
    }

    public final Context d() {
        return this.f14422b;
    }

    public final void e(C0781b bVar) {
        o.e(bVar, "listener");
        this.f14421a.remove(bVar);
    }
}
