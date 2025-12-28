package androidx.lifecycle;

import Y.d;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.F;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.o;

public final class B extends F.d implements F.b {

    /* renamed from: a  reason: collision with root package name */
    private Application f5976a;

    /* renamed from: b  reason: collision with root package name */
    private final F.b f5977b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f5978c;

    /* renamed from: d  reason: collision with root package name */
    private Lifecycle f5979d;

    /* renamed from: e  reason: collision with root package name */
    private a f5980e;

    public B(Application application, d dVar, Bundle bundle) {
        F.a aVar;
        o.e(dVar, "owner");
        this.f5980e = dVar.getSavedStateRegistry();
        this.f5979d = dVar.getLifecycle();
        this.f5978c = bundle;
        this.f5976a = application;
        if (application != null) {
            aVar = F.a.f5999e.a(application);
        } else {
            aVar = new F.a();
        }
        this.f5977b = aVar;
    }

    public E a(Class cls) {
        o.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public E b(Class cls, U.a aVar) {
        Constructor constructor;
        o.e(cls, "modelClass");
        o.e(aVar, "extras");
        String str = (String) aVar.a(F.c.f6006c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(SavedStateHandleSupport.f6043a) != null && aVar.a(SavedStateHandleSupport.f6044b) != null) {
            Application application = (Application) aVar.a(F.a.f6001g);
            boolean isAssignableFrom = C0451a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = C.c(cls, C.f5982b);
            } else {
                constructor = C.c(cls, C.f5981a);
            }
            if (constructor == null) {
                return this.f5977b.b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return C.d(cls, constructor, SavedStateHandleSupport.a(aVar));
            }
            return C.d(cls, constructor, application, SavedStateHandleSupport.a(aVar));
        } else if (this.f5979d != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void c(E e4) {
        o.e(e4, "viewModel");
        if (this.f5979d != null) {
            a aVar = this.f5980e;
            o.b(aVar);
            Lifecycle lifecycle = this.f5979d;
            o.b(lifecycle);
            LegacySavedStateHandleController.a(e4, aVar, lifecycle);
        }
    }

    public final E d(String str, Class cls) {
        Constructor constructor;
        E e4;
        Application application;
        o.e(str, "key");
        o.e(cls, "modelClass");
        Lifecycle lifecycle = this.f5979d;
        if (lifecycle != null) {
            boolean isAssignableFrom = C0451a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f5976a == null) {
                constructor = C.c(cls, C.f5982b);
            } else {
                constructor = C.c(cls, C.f5981a);
            }
            if (constructor != null) {
                a aVar = this.f5980e;
                o.b(aVar);
                SavedStateHandleController b4 = LegacySavedStateHandleController.b(aVar, lifecycle, str, this.f5978c);
                if (!isAssignableFrom || (application = this.f5976a) == null) {
                    e4 = C.d(cls, constructor, b4.f());
                } else {
                    o.b(application);
                    e4 = C.d(cls, constructor, application, b4.f());
                }
                e4.e("androidx.lifecycle.savedstate.vm.tag", b4);
                return e4;
            } else if (this.f5976a != null) {
                return this.f5977b.a(cls);
            } else {
                return F.c.f6004a.a().a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
