package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.e;
import okhttp3.t;
import okhttp3.x;
import retrofit2.C0875b;
import retrofit2.C0878e;
import retrofit2.C0884k;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f16164a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    final e.a f16165b;

    /* renamed from: c  reason: collision with root package name */
    final t f16166c;

    /* renamed from: d  reason: collision with root package name */
    final List f16167d;

    /* renamed from: e  reason: collision with root package name */
    final int f16168e;

    /* renamed from: f  reason: collision with root package name */
    final List f16169f;

    /* renamed from: g  reason: collision with root package name */
    final int f16170g;

    /* renamed from: h  reason: collision with root package name */
    final Executor f16171h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f16172i;

    class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f16173a = new Object[0];

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f16174b;

        a(Class cls) {
            this.f16174b = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f16173a;
            }
            D d4 = B.f16105b;
            if (d4.c(method)) {
                return d4.b(method, this.f16174b, obj, objArr);
            }
            return K.this.c(this.f16174b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private e.a f16176a;

        /* renamed from: b  reason: collision with root package name */
        private t f16177b;

        /* renamed from: c  reason: collision with root package name */
        private final List f16178c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f16179d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private Executor f16180e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16181f;

        public b a(C0878e.a aVar) {
            List list = this.f16179d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(C0884k.a aVar) {
            List list = this.f16178c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(t.h(str));
        }

        public b d(t tVar) {
            Objects.requireNonNull(tVar, "baseUrl == null");
            List m4 = tVar.m();
            if ("".equals(m4.get(m4.size() - 1))) {
                this.f16177b = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
        }

        public K e() {
            if (this.f16177b != null) {
                e.a aVar = this.f16176a;
                if (aVar == null) {
                    aVar = new x();
                }
                e.a aVar2 = aVar;
                Executor executor = this.f16180e;
                if (executor == null) {
                    executor = B.f16104a;
                }
                Executor executor2 = executor;
                C0876c cVar = B.f16106c;
                ArrayList arrayList = new ArrayList(this.f16179d);
                List a4 = cVar.a(executor2);
                arrayList.addAll(a4);
                List b4 = cVar.b();
                int size = b4.size();
                ArrayList arrayList2 = new ArrayList(this.f16178c.size() + 1 + size);
                arrayList2.add(new C0875b());
                arrayList2.addAll(this.f16178c);
                arrayList2.addAll(b4);
                return new K(aVar2, this.f16177b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), a4.size(), executor2, this.f16181f);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b f(e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f16176a = aVar;
            return this;
        }

        public b g(x xVar) {
            Objects.requireNonNull(xVar, "client == null");
            return f(xVar);
        }
    }

    K(e.a aVar, t tVar, List list, int i4, List list2, int i5, Executor executor, boolean z3) {
        this.f16165b = aVar;
        this.f16166c = tVar;
        this.f16167d = list;
        this.f16168e = i4;
        this.f16169f = list2;
        this.f16170g = i5;
        this.f16171h = executor;
        this.f16172i = z3;
    }

    private void j(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f16172i) {
                D d4 = B.f16105b;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!d4.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                        c(cls, method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public C0878e a(Type type, Annotation[] annotationArr) {
        return d((C0878e.a) null, type, annotationArr);
    }

    public Object b(Class cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* access modifiers changed from: package-private */
    public L c(Class cls, Method method) {
        while (true) {
            Object obj = this.f16164a.get(method);
            if (obj instanceof L) {
                return (L) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.f16164a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            L b4 = L.b(this, cls, method);
                            this.f16164a.put(method, b4);
                            return b4;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.f16164a.get(method);
                    if (obj3 != null) {
                        L l4 = (L) obj3;
                        return l4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C0878e d(C0878e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f16169f.indexOf(aVar) + 1;
        int size = this.f16169f.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            C0878e a4 = ((C0878e.a) this.f16169f.get(i4)).a(type, annotationArr, this);
            if (a4 != null) {
                return a4;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < indexOf; i5++) {
                sb.append("\n   * ");
                sb.append(((C0878e.a) this.f16169f.get(i5)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f16169f.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C0878e.a) this.f16169f.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public C0884k e(C0884k.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f16167d.indexOf(aVar) + 1;
        int size = this.f16167d.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            C0884k c4 = ((C0884k.a) this.f16167d.get(i4)).c(type, annotationArr, annotationArr2, this);
            if (c4 != null) {
                return c4;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < indexOf; i5++) {
                sb.append("\n   * ");
                sb.append(((C0884k.a) this.f16167d.get(i5)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f16167d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C0884k.a) this.f16167d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public C0884k f(C0884k.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f16167d.indexOf(aVar) + 1;
        int size = this.f16167d.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            C0884k d4 = ((C0884k.a) this.f16167d.get(i4)).d(type, annotationArr, this);
            if (d4 != null) {
                return d4;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < indexOf; i5++) {
                sb.append("\n   * ");
                sb.append(((C0884k.a) this.f16167d.get(i5)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f16167d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C0884k.a) this.f16167d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public C0884k g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e((C0884k.a) null, type, annotationArr, annotationArr2);
    }

    public C0884k h(Type type, Annotation[] annotationArr) {
        return f((C0884k.a) null, type, annotationArr);
    }

    public C0884k i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f16167d.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0884k e4 = ((C0884k.a) this.f16167d.get(i4)).e(type, annotationArr, this);
            if (e4 != null) {
                return e4;
            }
        }
        return C0875b.d.f16200a;
    }
}
