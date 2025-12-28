package com.bumptech.glide;

import Z0.d;
import a1.h;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.F;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.request.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.C0704a;
import m1.f;
import p1.k;
import p1.l;

public class b implements ComponentCallbacks2 {

    /* renamed from: k  reason: collision with root package name */
    private static volatile b f10722k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f10723l;

    /* renamed from: a  reason: collision with root package name */
    private final i f10724a;

    /* renamed from: b  reason: collision with root package name */
    private final d f10725b;

    /* renamed from: c  reason: collision with root package name */
    private final h f10726c;

    /* renamed from: d  reason: collision with root package name */
    private final d f10727d;

    /* renamed from: e  reason: collision with root package name */
    private final Z0.b f10728e;

    /* renamed from: f  reason: collision with root package name */
    private final r f10729f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bumptech.glide.manager.d f10730g;

    /* renamed from: h  reason: collision with root package name */
    private final List f10731h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final a f10732i;

    /* renamed from: j  reason: collision with root package name */
    private MemoryCategory f10733j = MemoryCategory.NORMAL;

    public interface a {
        e a();
    }

    b(Context context, i iVar, h hVar, d dVar, Z0.b bVar, r rVar, com.bumptech.glide.manager.d dVar2, int i4, a aVar, Map map, List list, List list2, C0704a aVar2, e eVar) {
        this.f10724a = iVar;
        this.f10725b = dVar;
        Z0.b bVar2 = bVar;
        this.f10728e = bVar2;
        this.f10726c = hVar;
        this.f10729f = rVar;
        this.f10730g = dVar2;
        a aVar3 = aVar;
        this.f10732i = aVar3;
        this.f10727d = new d(context, bVar2, g.d(this, list2, aVar2), new f(), aVar3, map, list, iVar, eVar, i4);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f10723l) {
            f10723l = true;
            try {
                m(context, generatedAppGlideModule);
            } finally {
                f10723l = false;
            }
        } else {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
    }

    public static b c(Context context) {
        if (f10722k == null) {
            GeneratedAppGlideModule d4 = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f10722k == null) {
                        a(context, d4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10722k;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e4) {
            q(e4);
        } catch (IllegalAccessException e5) {
            q(e5);
        } catch (NoSuchMethodException e6) {
            q(e6);
        } catch (InvocationTargetException e7) {
            q(e7);
        }
        return null;
    }

    private static r l(Context context) {
        k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        r.b bVar;
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new k1.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = emptyList.iterator();
            if (it.hasNext()) {
                F.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                F.a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        if (generatedAppGlideModule != null) {
            bVar = generatedAppGlideModule.e();
        } else {
            bVar = null;
        }
        cVar.b(bVar);
        Iterator it3 = emptyList.iterator();
        if (!it3.hasNext()) {
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.b(applicationContext, cVar);
            }
            b a4 = cVar.a(applicationContext, emptyList, generatedAppGlideModule);
            applicationContext.registerComponentCallbacks(a4);
            f10722k = a4;
            return;
        }
        F.a(it3.next());
        throw null;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static i t(Context context) {
        return l(context).l(context);
    }

    public static i u(View view) {
        return l(view.getContext()).m(view);
    }

    public void b() {
        l.a();
        this.f10726c.b();
        this.f10725b.b();
        this.f10728e.b();
    }

    public Z0.b e() {
        return this.f10728e;
    }

    public d f() {
        return this.f10725b;
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.manager.d g() {
        return this.f10730g;
    }

    public Context h() {
        return this.f10727d.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    public d i() {
        return this.f10727d;
    }

    public Registry j() {
        return this.f10727d.i();
    }

    public r k() {
        return this.f10729f;
    }

    /* access modifiers changed from: package-private */
    public void o(i iVar) {
        synchronized (this.f10731h) {
            try {
                if (!this.f10731h.contains(iVar)) {
                    this.f10731h.add(iVar);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        b();
    }

    public void onTrimMemory(int i4) {
        r(i4);
    }

    /* access modifiers changed from: package-private */
    public boolean p(m1.h hVar) {
        synchronized (this.f10731h) {
            try {
                for (i z3 : this.f10731h) {
                    if (z3.z(hVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i4) {
        l.a();
        synchronized (this.f10731h) {
            try {
                for (i onTrimMemory : this.f10731h) {
                    onTrimMemory.onTrimMemory(i4);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f10726c.a(i4);
        this.f10725b.a(i4);
        this.f10728e.a(i4);
    }

    /* access modifiers changed from: package-private */
    public void s(i iVar) {
        synchronized (this.f10731h) {
            try {
                if (this.f10731h.contains(iVar)) {
                    this.f10731h.remove(iVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
