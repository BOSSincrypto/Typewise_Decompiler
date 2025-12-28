package androidx.lifecycle;

import U.a;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class F {

    /* renamed from: a  reason: collision with root package name */
    private final I f5996a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5997b;

    /* renamed from: c  reason: collision with root package name */
    private final U.a f5998c;

    public interface b {
        E a(Class cls);

        E b(Class cls, U.a aVar);
    }

    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6004a = new a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static c f6005b;

        /* renamed from: c  reason: collision with root package name */
        public static final a.b f6006c = a.C0098a.f6007a;

        public static final class a {

            /* renamed from: androidx.lifecycle.F$c$a$a  reason: collision with other inner class name */
            private static final class C0098a implements a.b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0098a f6007a = new C0098a();

                private C0098a() {
                }
            }

            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a() {
                if (c.f6005b == null) {
                    c.f6005b = new c();
                }
                c c4 = c.f6005b;
                o.b(c4);
                return c4;
            }

            private a() {
            }
        }

        public E a(Class cls) {
            o.e(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                o.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return (E) newInstance;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            }
        }

        public /* synthetic */ E b(Class cls, U.a aVar) {
            return G.b(this, cls, aVar);
        }
    }

    public static class d {
        public abstract void c(E e4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public F(I i4, b bVar) {
        this(i4, bVar, (U.a) null, 4, (i) null);
        o.e(i4, "store");
        o.e(bVar, "factory");
    }

    public E a(Class cls) {
        o.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public E b(String str, Class cls) {
        E e4;
        d dVar;
        o.e(str, "key");
        o.e(cls, "modelClass");
        E b4 = this.f5996a.b(str);
        if (cls.isInstance(b4)) {
            b bVar = this.f5997b;
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                o.b(b4);
                dVar.c(b4);
            }
            o.c(b4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b4;
        }
        U.d dVar2 = new U.d(this.f5998c);
        dVar2.c(c.f6006c, str);
        try {
            e4 = this.f5997b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            e4 = this.f5997b.a(cls);
        }
        this.f5996a.d(str, e4);
        return e4;
    }

    public static class a extends c {

        /* renamed from: e  reason: collision with root package name */
        public static final C0096a f5999e = new C0096a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static a f6000f;

        /* renamed from: g  reason: collision with root package name */
        public static final a.b f6001g = C0096a.C0097a.f6003a;

        /* renamed from: d  reason: collision with root package name */
        private final Application f6002d;

        /* renamed from: androidx.lifecycle.F$a$a  reason: collision with other inner class name */
        public static final class C0096a {

            /* renamed from: androidx.lifecycle.F$a$a$a  reason: collision with other inner class name */
            private static final class C0097a implements a.b {

                /* renamed from: a  reason: collision with root package name */
                public static final C0097a f6003a = new C0097a();

                private C0097a() {
                }
            }

            public /* synthetic */ C0096a(i iVar) {
                this();
            }

            public final a a(Application application) {
                o.e(application, "application");
                if (a.f6000f == null) {
                    a.f6000f = new a(application);
                }
                a e4 = a.f6000f;
                o.b(e4);
                return e4;
            }

            private C0096a() {
            }
        }

        private a(Application application, int i4) {
            this.f6002d = application;
        }

        private final E g(Class cls, Application application) {
            if (!C0451a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                E e4 = (E) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                o.d(e4, "{\n                try {\n…          }\n            }");
                return e4;
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        }

        public E a(Class cls) {
            o.e(cls, "modelClass");
            Application application = this.f6002d;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public E b(Class cls, U.a aVar) {
            o.e(cls, "modelClass");
            o.e(aVar, "extras");
            if (this.f6002d != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f6001g);
            if (application != null) {
                return g(cls, application);
            }
            if (!C0451a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            o.e(application, "application");
        }
    }

    public F(I i4, b bVar, U.a aVar) {
        o.e(i4, "store");
        o.e(bVar, "factory");
        o.e(aVar, "defaultCreationExtras");
        this.f5996a = i4;
        this.f5997b = bVar;
        this.f5998c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(I i4, b bVar, U.a aVar, int i5, i iVar) {
        this(i4, bVar, (i5 & 4) != 0 ? a.C0027a.f1484b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public F(J j4, b bVar) {
        this(j4.getViewModelStore(), bVar, H.a(j4));
        o.e(j4, "owner");
        o.e(bVar, "factory");
    }
}
