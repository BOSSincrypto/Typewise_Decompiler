package androidx.savedstate;

import Y.d;
import android.os.Bundle;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/k;", "LY/d;", "owner", "<init>", "(LY/d;)V", "", "className", "Ll2/q;", "e", "(Ljava/lang/String;)V", "Landroidx/lifecycle/m;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "c", "(Landroidx/lifecycle/m;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "LY/d;", "b", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements C0461k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6899b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f6900a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set f6901a = new LinkedHashSet();

        public b(a aVar) {
            o.e(aVar, "registry");
            aVar.h("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f6901a));
            return bundle;
        }

        public final void b(String str) {
            o.e(str, "className");
            this.f6901a.add(str);
        }
    }

    public Recreator(d dVar) {
        o.e(dVar, "owner");
        this.f6900a = dVar;
    }

    private final void e(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.C0110a.class);
            o.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    o.d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.C0110a) newInstance).a(this.f6900a);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }

    public void c(m mVar, Lifecycle.Event event) {
        o.e(mVar, "source");
        o.e(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            mVar.getLifecycle().c(this);
            Bundle b4 = this.f6900a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b4 != null) {
                ArrayList<String> stringArrayList = b4.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String e4 : stringArrayList) {
                        e(e4);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
