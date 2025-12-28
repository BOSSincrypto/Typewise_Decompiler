package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.random.Random;
import m.C0796a;

public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private final Map f2390a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Map f2391b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f2392c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    ArrayList f2393d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    final transient Map f2394e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    final Map f2395f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Bundle f2396g = new Bundle();

    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0796a f2402b;

        a(String str, C0796a aVar) {
            this.f2401a = str;
            this.f2402b = aVar;
        }

        public void b(Object obj, androidx.core.app.c cVar) {
            Integer num = (Integer) ActivityResultRegistry.this.f2391b.get(this.f2401a);
            if (num != null) {
                ActivityResultRegistry.this.f2393d.add(this.f2401a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f2402b, obj, cVar);
                } catch (Exception e4) {
                    ActivityResultRegistry.this.f2393d.remove(this.f2401a);
                    throw e4;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f2402b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            ActivityResultRegistry.this.l(this.f2401a);
        }
    }

    class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0796a f2405b;

        b(String str, C0796a aVar) {
            this.f2404a = str;
            this.f2405b = aVar;
        }

        public void b(Object obj, androidx.core.app.c cVar) {
            Integer num = (Integer) ActivityResultRegistry.this.f2391b.get(this.f2404a);
            if (num != null) {
                ActivityResultRegistry.this.f2393d.add(this.f2404a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f2405b, obj, cVar);
                } catch (Exception e4) {
                    ActivityResultRegistry.this.f2393d.remove(this.f2404a);
                    throw e4;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f2405b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            ActivityResultRegistry.this.l(this.f2404a);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final b f2407a;

        /* renamed from: b  reason: collision with root package name */
        final C0796a f2408b;

        c(b bVar, C0796a aVar) {
            this.f2407a = bVar;
            this.f2408b = aVar;
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final Lifecycle f2409a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList f2410b = new ArrayList();

        d(Lifecycle lifecycle) {
            this.f2409a = lifecycle;
        }

        /* access modifiers changed from: package-private */
        public void a(C0461k kVar) {
            this.f2409a.a(kVar);
            this.f2410b.add(kVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Iterator it = this.f2410b.iterator();
            while (it.hasNext()) {
                this.f2409a.c((C0461k) it.next());
            }
            this.f2410b.clear();
        }
    }

    private void a(int i4, String str) {
        this.f2390a.put(Integer.valueOf(i4), str);
        this.f2391b.put(str, Integer.valueOf(i4));
    }

    private void d(String str, int i4, Intent intent, c cVar) {
        if (cVar == null || cVar.f2407a == null || !this.f2393d.contains(str)) {
            this.f2395f.remove(str);
            this.f2396g.putParcelable(str, new a(i4, intent));
            return;
        }
        cVar.f2407a.a(cVar.f2408b.c(i4, intent));
        this.f2393d.remove(str);
    }

    private int e() {
        int nextInt = Random.Default.nextInt(2147418112);
        while (true) {
            int i4 = nextInt + 65536;
            if (!this.f2390a.containsKey(Integer.valueOf(i4))) {
                return i4;
            }
            nextInt = Random.Default.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (((Integer) this.f2391b.get(str)) == null) {
            a(e(), str);
        }
    }

    public final boolean b(int i4, int i5, Intent intent) {
        String str = (String) this.f2390a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        d(str, i5, intent, (c) this.f2394e.get(str));
        return true;
    }

    public final boolean c(int i4, Object obj) {
        b bVar;
        String str = (String) this.f2390a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f2394e.get(str);
        if (cVar == null || (bVar = cVar.f2407a) == null) {
            this.f2396g.remove(str);
            this.f2395f.put(str, obj);
            return true;
        } else if (!this.f2393d.remove(str)) {
            return true;
        } else {
            bVar.a(obj);
            return true;
        }
    }

    public abstract void f(int i4, C0796a aVar, Object obj, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f2393d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f2396g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                    String str = stringArrayList.get(i4);
                    if (this.f2391b.containsKey(str)) {
                        Integer num = (Integer) this.f2391b.remove(str);
                        if (!this.f2396g.containsKey(str)) {
                            this.f2390a.remove(num);
                        }
                    }
                    a(integerArrayList.get(i4).intValue(), stringArrayList.get(i4));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f2391b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f2391b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f2393d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f2396g.clone());
    }

    public final c i(final String str, m mVar, final C0796a aVar, final b bVar) {
        Lifecycle lifecycle = mVar.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            k(str);
            d dVar = (d) this.f2392c.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new C0461k() {
                public void c(m mVar, Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f2394e.put(str, new c(bVar, aVar));
                        if (ActivityResultRegistry.this.f2395f.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f2395f.get(str);
                            ActivityResultRegistry.this.f2395f.remove(str);
                            bVar.a(obj);
                        }
                        a aVar = (a) ActivityResultRegistry.this.f2396g.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f2396g.remove(str);
                            bVar.a(aVar.c(aVar.u(), aVar.t()));
                        }
                    } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f2394e.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f2392c.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + mVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final c j(String str, C0796a aVar, b bVar) {
        k(str);
        this.f2394e.put(str, new c(bVar, aVar));
        if (this.f2395f.containsKey(str)) {
            Object obj = this.f2395f.get(str);
            this.f2395f.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f2396g.getParcelable(str);
        if (aVar2 != null) {
            this.f2396g.remove(str);
            bVar.a(aVar.c(aVar2.u(), aVar2.t()));
        }
        return new b(str, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void l(String str) {
        Integer num;
        if (!this.f2393d.contains(str) && (num = (Integer) this.f2391b.remove(str)) != null) {
            this.f2390a.remove(num);
        }
        this.f2394e.remove(str);
        if (this.f2395f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f2395f.get(str));
            this.f2395f.remove(str);
        }
        if (this.f2396g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f2396g.getParcelable(str));
            this.f2396g.remove(str);
        }
        d dVar = (d) this.f2392c.get(str);
        if (dVar != null) {
            dVar.b();
            this.f2392c.remove(str);
        }
    }
}
