package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.h;
import androidx.fragment.app.q;
import androidx.fragment.app.y;
import com.bumptech.glide.c;
import com.bumptech.glide.e;
import com.bumptech.glide.i;
import com.bumptech.glide.load.resource.bitmap.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p1.k;
import p1.l;
import y.C0939a;

public class r implements Handler.Callback {

    /* renamed from: k  reason: collision with root package name */
    private static final b f11187k = new a();

    /* renamed from: a  reason: collision with root package name */
    private volatile i f11188a;

    /* renamed from: b  reason: collision with root package name */
    final Map f11189b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map f11190c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Handler f11191d;

    /* renamed from: e  reason: collision with root package name */
    private final b f11192e;

    /* renamed from: f  reason: collision with root package name */
    private final C0939a f11193f = new C0939a();

    /* renamed from: g  reason: collision with root package name */
    private final C0939a f11194g = new C0939a();

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f11195h = new Bundle();

    /* renamed from: i  reason: collision with root package name */
    private final k f11196i;

    /* renamed from: j  reason: collision with root package name */
    private final n f11197j;

    class a implements b {
        a() {
        }

        public i a(com.bumptech.glide.b bVar, l lVar, s sVar, Context context) {
            return new i(bVar, lVar, sVar, context);
        }
    }

    public interface b {
        i a(com.bumptech.glide.b bVar, l lVar, s sVar, Context context);
    }

    public r(b bVar, e eVar) {
        bVar = bVar == null ? f11187k : bVar;
        this.f11192e = bVar;
        this.f11191d = new Handler(Looper.getMainLooper(), this);
        this.f11197j = new n(bVar);
        this.f11196i = b(eVar);
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(e eVar) {
        if (!x.f11147h || !x.f11146g) {
            return new g();
        }
        if (eVar.a(c.d.class)) {
            return new i();
        }
        return new j();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private void d(FragmentManager fragmentManager, C0939a aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        e(fragmentManager, aVar);
    }

    private void e(FragmentManager fragmentManager, C0939a aVar) {
        Fragment fragment;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            this.f11195h.putInt("key", i4);
            try {
                fragment = fragmentManager.getFragment(this.f11195h, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), aVar);
                }
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private static void f(Collection collection, Map map) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) it.next();
                if (!(fragment == null || fragment.getView() == null)) {
                    map.put(fragment.getView(), fragment);
                    f(fragment.getChildFragmentManager().p0(), map);
                }
            }
        }
    }

    private Fragment g(View view, Activity activity) {
        this.f11194g.clear();
        d(activity.getFragmentManager(), this.f11194g);
        View findViewById = activity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (Fragment) this.f11194g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f11194g.clear();
        return fragment;
    }

    private androidx.fragment.app.Fragment h(View view, h hVar) {
        this.f11193f.clear();
        f(hVar.getSupportFragmentManager().p0(), this.f11193f);
        View findViewById = hVar.findViewById(16908290);
        androidx.fragment.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (androidx.fragment.app.Fragment) this.f11193f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f11193f.clear();
        return fragment;
    }

    private i i(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z3) {
        p r4 = r(fragmentManager, fragment);
        i e4 = r4.e();
        if (e4 == null) {
            e4 = this.f11192e.a(com.bumptech.glide.b.c(context), r4.c(), r4.f(), context);
            if (z3) {
                e4.a();
            }
            r4.k(e4);
        }
        return e4;
    }

    private i p(Context context) {
        if (this.f11188a == null) {
            synchronized (this) {
                try {
                    if (this.f11188a == null) {
                        this.f11188a = this.f11192e.a(com.bumptech.glide.b.c(context.getApplicationContext()), new b(), new h(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f11188a;
    }

    private p r(FragmentManager fragmentManager, Fragment fragment) {
        p pVar = (p) this.f11189b.get(fragmentManager);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = (p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (pVar2 == null) {
            pVar2 = new p();
            pVar2.j(fragment);
            this.f11189b.put(fragmentManager, pVar2);
            fragmentManager.beginTransaction().add(pVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f11191d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return pVar2;
    }

    private v t(q qVar, androidx.fragment.app.Fragment fragment) {
        v vVar = (v) this.f11190c.get(qVar);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = (v) qVar.e0("com.bumptech.glide.manager");
        if (vVar2 == null) {
            vVar2 = new v();
            vVar2.q(fragment);
            this.f11190c.put(qVar, vVar2);
            qVar.l().d(vVar2, "com.bumptech.glide.manager").g();
            this.f11191d.obtainMessage(2, qVar).sendToTarget();
        }
        return vVar2;
    }

    private static boolean u(Context context) {
        Activity c4 = c(context);
        if (c4 == null || !c4.isFinishing()) {
            return true;
        }
        return false;
    }

    private boolean v(FragmentManager fragmentManager, boolean z3) {
        p pVar = (p) this.f11189b.get(fragmentManager);
        p pVar2 = (p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (pVar2 == pVar) {
            return true;
        }
        if (pVar2 != null && pVar2.e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + pVar2 + " New: " + pVar);
        } else if (z3 || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                if (fragmentManager.isDestroyed()) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            pVar.c().a();
            return true;
        } else {
            FragmentTransaction add = fragmentManager.beginTransaction().add(pVar, "com.bumptech.glide.manager");
            if (pVar2 != null) {
                add.remove(pVar2);
            }
            add.commitAllowingStateLoss();
            this.f11191d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            Log.isLoggable("RMRetriever", 3);
            return false;
        }
    }

    private boolean w(q qVar, boolean z3) {
        v vVar = (v) this.f11190c.get(qVar);
        v vVar2 = (v) qVar.e0("com.bumptech.glide.manager");
        if (vVar2 == vVar) {
            return true;
        }
        if (vVar2 != null && vVar2.l() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + vVar2 + " New: " + vVar);
        } else if (z3 || qVar.C0()) {
            if (qVar.C0()) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            vVar.j().a();
            return true;
        } else {
            y d4 = qVar.l().d(vVar, "com.bumptech.glide.manager");
            if (vVar2 != null) {
                d4.l(vVar2);
            }
            d4.i();
            this.f11191d.obtainMessage(2, 1, 0, qVar).sendToTarget();
            Log.isLoggable("RMRetriever", 3);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: androidx.fragment.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.arg1
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            int r3 = r8.what
            r4 = 0
            if (r3 == r1) goto L_0x0026
            r5 = 2
            if (r3 == r5) goto L_0x0014
            r1 = r2
            r8 = r4
            goto L_0x003b
        L_0x0014:
            java.lang.Object r8 = r8.obj
            androidx.fragment.app.q r8 = (androidx.fragment.app.q) r8
            boolean r0 = r7.w(r8, r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map r0 = r7.f11190c
            java.lang.Object r4 = r0.remove(r8)
        L_0x0024:
            r2 = r1
            goto L_0x003b
        L_0x0026:
            java.lang.Object r8 = r8.obj
            android.app.FragmentManager r8 = (android.app.FragmentManager) r8
            boolean r0 = r7.v(r8, r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map r0 = r7.f11189b
            java.lang.Object r4 = r0.remove(r8)
            goto L_0x0024
        L_0x0037:
            r8 = r4
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x003b:
            r0 = 5
            java.lang.String r3 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x005c
            if (r1 == 0) goto L_0x005c
            if (r4 != 0) goto L_0x005c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            android.util.Log.w(r3, r8)
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.r.handleMessage(android.os.Message):boolean");
    }

    public i j(Activity activity) {
        if (l.p()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof h) {
            return o((h) activity);
        }
        a(activity);
        this.f11196i.a(activity);
        return i(activity, activity.getFragmentManager(), (Fragment) null, u(activity));
    }

    public i k(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (l.p()) {
            return l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f11196i.a(fragment.getActivity());
            }
            return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    public i l(Context context) {
        if (context != null) {
            if (l.q() && !(context instanceof Application)) {
                if (context instanceof h) {
                    return o((h) context);
                }
                if (context instanceof Activity) {
                    return j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return l(contextWrapper.getBaseContext());
                    }
                }
            }
            return p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public i m(View view) {
        if (l.p()) {
            return l(view.getContext().getApplicationContext());
        }
        k.d(view);
        k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c4 = c(view.getContext());
        if (c4 == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (c4 instanceof h) {
            h hVar = (h) c4;
            androidx.fragment.app.Fragment h4 = h(view, hVar);
            if (h4 != null) {
                return n(h4);
            }
            return o(hVar);
        }
        Fragment g4 = g(view, c4);
        if (g4 == null) {
            return j(c4);
        }
        return k(g4);
    }

    public i n(androidx.fragment.app.Fragment fragment) {
        k.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (l.p()) {
            return l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f11196i.a(fragment.getActivity());
        }
        q childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f11197j.b(context, com.bumptech.glide.b.c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    public i o(h hVar) {
        if (l.p()) {
            return l(hVar.getApplicationContext());
        }
        a(hVar);
        this.f11196i.a(hVar);
        boolean u3 = u(hVar);
        return this.f11197j.b(hVar, com.bumptech.glide.b.c(hVar.getApplicationContext()), hVar.getLifecycle(), hVar.getSupportFragmentManager(), u3);
    }

    /* access modifiers changed from: package-private */
    public p q(Activity activity) {
        return r(activity.getFragmentManager(), (Fragment) null);
    }

    /* access modifiers changed from: package-private */
    public v s(q qVar) {
        return t(qVar, (androidx.fragment.app.Fragment) null);
    }
}
