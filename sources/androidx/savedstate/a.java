package androidx.savedstate;

import Y.d;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import s.C0890b;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f6902g = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0890b f6903a = new C0890b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6904b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6905c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6906d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f6907e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6908f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0110a {
        void a(d dVar);
    }

    private static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle a();
    }

    /* access modifiers changed from: private */
    public static final void d(a aVar, m mVar, Lifecycle.Event event) {
        o.e(aVar, "this$0");
        o.e(mVar, "<anonymous parameter 0>");
        o.e(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            aVar.f6908f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            aVar.f6908f = false;
        }
    }

    public final Bundle b(String str) {
        Bundle bundle;
        o.e(str, "key");
        if (this.f6906d) {
            Bundle bundle2 = this.f6905c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f6905c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f6905c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f6905c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final c c(String str) {
        o.e(str, "key");
        Iterator it = this.f6903a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o.d(entry, "components");
            c cVar = (c) entry.getValue();
            if (o.a((String) entry.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(Lifecycle lifecycle) {
        o.e(lifecycle, "lifecycle");
        if (!this.f6904b) {
            lifecycle.a(new Y.b(this));
            this.f6904b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    public final void f(Bundle bundle) {
        Bundle bundle2;
        if (!this.f6904b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        } else if (!this.f6906d) {
            if (bundle != null) {
                bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            } else {
                bundle2 = null;
            }
            this.f6905c = bundle2;
            this.f6906d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
    }

    public final void g(Bundle bundle) {
        o.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f6905c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0890b.d d4 = this.f6903a.d();
        o.d(d4, "this.components.iteratorWithAdditions()");
        while (d4.hasNext()) {
            Map.Entry entry = (Map.Entry) d4.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        o.e(str, "key");
        o.e(cVar, "provider");
        if (((c) this.f6903a.g(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class cls) {
        o.e(cls, "clazz");
        if (this.f6908f) {
            Recreator.b bVar = this.f6907e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f6907e = bVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                Recreator.b bVar2 = this.f6907e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    o.d(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
