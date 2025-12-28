package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b0.C0479a;
import b0.C0480b;
import c0.C0492b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.uuid.Uuid;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f6939d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f6940e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map f6941a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set f6942b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f6943c;

    a(Context context) {
        this.f6943c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (C0492b.d()) {
            try {
                C0492b.a(cls.getSimpleName());
            } catch (Throwable th) {
                C0492b.b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f6941a.containsKey(cls)) {
                set.add(cls);
                C0479a aVar = (C0479a) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a4 = aVar.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!this.f6941a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = aVar.b(this.f6943c);
                set.remove(cls);
                this.f6941a.put(cls, obj);
            } else {
                obj = this.f6941a.get(cls);
            }
            C0492b.b();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a e(Context context) {
        if (f6939d == null) {
            synchronized (f6940e) {
                try {
                    if (f6939d == null) {
                        f6939d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6939d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            C0492b.a("Startup");
            b(this.f6943c.getPackageManager().getProviderInfo(new ComponentName(this.f6943c.getPackageName(), InitializationProvider.class.getName()), Uuid.SIZE_BITS).metaData);
            C0492b.b();
        } catch (PackageManager.NameNotFoundException e4) {
            throw new StartupException((Throwable) e4);
        } catch (Throwable th) {
            C0492b.b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f6943c.getString(C0480b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C0479a.class.isAssignableFrom(cls)) {
                            this.f6942b.add(cls);
                        }
                    }
                }
                for (Class d4 : this.f6942b) {
                    d(d4, hashSet);
                }
            } catch (ClassNotFoundException e4) {
                throw new StartupException((Throwable) e4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object c(Class cls) {
        Object obj;
        synchronized (f6940e) {
            try {
                obj = this.f6941a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f6942b.contains(cls);
    }
}
