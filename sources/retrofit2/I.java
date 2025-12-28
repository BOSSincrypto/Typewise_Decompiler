package retrofit2;

import com.silkimen.http.HttpRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.c;
import l3.b;
import l3.d;
import l3.e;
import l3.f;
import l3.g;
import l3.h;
import l3.i;
import l3.j;
import l3.k;
import l3.l;
import l3.m;
import l3.n;
import l3.o;
import l3.p;
import l3.q;
import l3.r;
import l3.u;
import l3.x;
import l3.y;
import okhttp3.s;
import okhttp3.t;
import okhttp3.v;
import okhttp3.w;
import retrofit2.A;

final class I {

    /* renamed from: a  reason: collision with root package name */
    private final Class f16123a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f16124b;

    /* renamed from: c  reason: collision with root package name */
    private final t f16125c;

    /* renamed from: d  reason: collision with root package name */
    final String f16126d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16127e;

    /* renamed from: f  reason: collision with root package name */
    private final s f16128f;

    /* renamed from: g  reason: collision with root package name */
    private final v f16129g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f16130h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f16131i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f16132j;

    /* renamed from: k  reason: collision with root package name */
    private final A[] f16133k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f16134l;

    static final class a {

        /* renamed from: y  reason: collision with root package name */
        private static final Pattern f16135y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z  reason: collision with root package name */
        private static final Pattern f16136z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        final K f16137a;

        /* renamed from: b  reason: collision with root package name */
        final Class f16138b;

        /* renamed from: c  reason: collision with root package name */
        final Method f16139c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[] f16140d;

        /* renamed from: e  reason: collision with root package name */
        final Annotation[][] f16141e;

        /* renamed from: f  reason: collision with root package name */
        final Type[] f16142f;

        /* renamed from: g  reason: collision with root package name */
        boolean f16143g;

        /* renamed from: h  reason: collision with root package name */
        boolean f16144h;

        /* renamed from: i  reason: collision with root package name */
        boolean f16145i;

        /* renamed from: j  reason: collision with root package name */
        boolean f16146j;

        /* renamed from: k  reason: collision with root package name */
        boolean f16147k;

        /* renamed from: l  reason: collision with root package name */
        boolean f16148l;

        /* renamed from: m  reason: collision with root package name */
        boolean f16149m;

        /* renamed from: n  reason: collision with root package name */
        boolean f16150n;

        /* renamed from: o  reason: collision with root package name */
        String f16151o;

        /* renamed from: p  reason: collision with root package name */
        boolean f16152p;

        /* renamed from: q  reason: collision with root package name */
        boolean f16153q;

        /* renamed from: r  reason: collision with root package name */
        boolean f16154r;

        /* renamed from: s  reason: collision with root package name */
        String f16155s;

        /* renamed from: t  reason: collision with root package name */
        s f16156t;

        /* renamed from: u  reason: collision with root package name */
        v f16157u;

        /* renamed from: v  reason: collision with root package name */
        Set f16158v;

        /* renamed from: w  reason: collision with root package name */
        A[] f16159w;

        /* renamed from: x  reason: collision with root package name */
        boolean f16160x;

        a(K k4, Class cls, Method method) {
            this.f16137a = k4;
            this.f16138b = cls;
            this.f16139c = method;
            this.f16140d = method.getAnnotations();
            this.f16142f = method.getGenericParameterTypes();
            this.f16141e = method.getParameterAnnotations();
        }

        private static Class a(Class cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        private s c(String[] strArr, boolean z3) {
            s.a aVar = new s.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw O.n(this.f16139c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (HttpRequest.HEADER_CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    try {
                        this.f16157u = v.e(trim);
                    } catch (IllegalArgumentException e4) {
                        throw O.o(this.f16139c, e4, "Malformed content type: %s", trim);
                    }
                } else if (z3) {
                    aVar.e(substring, trim);
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.f();
        }

        private void d(String str, String str2, boolean z3) {
            String str3 = this.f16151o;
            if (str3 == null) {
                this.f16151o = str;
                this.f16152p = z3;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f16135y.matcher(substring).find()) {
                            throw O.n(this.f16139c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f16155s = str2;
                    this.f16158v = h(str2);
                    return;
                }
                return;
            }
            throw O.n(this.f16139c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof b) {
                d(HttpRequest.METHOD_DELETE, ((b) annotation).value(), false);
            } else if (annotation instanceof f) {
                d(HttpRequest.METHOD_GET, ((f) annotation).value(), false);
            } else if (annotation instanceof g) {
                d(HttpRequest.METHOD_HEAD, ((g) annotation).value(), false);
            } else if (annotation instanceof n) {
                d("PATCH", ((n) annotation).value(), true);
            } else if (annotation instanceof o) {
                d(HttpRequest.METHOD_POST, ((o) annotation).value(), true);
            } else if (annotation instanceof p) {
                d(HttpRequest.METHOD_PUT, ((p) annotation).value(), true);
            } else if (annotation instanceof m) {
                d(HttpRequest.METHOD_OPTIONS, ((m) annotation).value(), false);
            } else if (annotation instanceof h) {
                h hVar = (h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof k) {
                k kVar = (k) annotation;
                String[] value = kVar.value();
                if (value.length != 0) {
                    this.f16156t = c(value, kVar.allowUnsafeNonAsciiValues());
                    return;
                }
                throw O.n(this.f16139c, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof l) {
                if (!this.f16153q) {
                    this.f16154r = true;
                    return;
                }
                throw O.n(this.f16139c, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof e)) {
            } else {
                if (!this.f16154r) {
                    this.f16153q = true;
                    return;
                }
                throw O.n(this.f16139c, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        private A f(int i4, Type type, Annotation[] annotationArr, boolean z3) {
            A a4;
            if (annotationArr != null) {
                a4 = null;
                for (Annotation g4 : annotationArr) {
                    A g5 = g(i4, type, annotationArr, g4);
                    if (g5 != null) {
                        if (a4 == null) {
                            a4 = g5;
                        } else {
                            throw O.p(this.f16139c, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                a4 = null;
            }
            if (a4 != null) {
                return a4;
            }
            if (z3) {
                try {
                    if (O.h(type) == c.class) {
                        this.f16160x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw O.p(this.f16139c, i4, "No Retrofit annotation found.", new Object[0]);
        }

        private A g(int i4, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            if (annotation instanceof y) {
                j(i4, type);
                if (this.f16150n) {
                    throw O.p(this.f16139c, i4, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f16146j) {
                    throw O.p(this.f16139c, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f16147k) {
                    throw O.p(this.f16139c, i4, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f16148l) {
                    throw O.p(this.f16139c, i4, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f16149m) {
                    throw O.p(this.f16139c, i4, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f16155s == null) {
                    this.f16150n = true;
                    if (type == t.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new A.p(this.f16139c, i4);
                    }
                    throw O.p(this.f16139c, i4, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw O.p(this.f16139c, i4, "@Url cannot be used with @%s URL", this.f16151o);
                }
            } else if (annotation instanceof l3.s) {
                j(i4, type);
                if (this.f16147k) {
                    throw O.p(this.f16139c, i4, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f16148l) {
                    throw O.p(this.f16139c, i4, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f16149m) {
                    throw O.p(this.f16139c, i4, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f16150n) {
                    throw O.p(this.f16139c, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f16155s != null) {
                    this.f16146j = true;
                    l3.s sVar = (l3.s) annotation;
                    String value = sVar.value();
                    i(i4, value);
                    return new A.k(this.f16139c, i4, value, this.f16137a.i(type, annotationArr), sVar.encoded());
                } else {
                    throw O.p(this.f16139c, i4, "@Path can only be used with relative url on @%s", this.f16151o);
                }
            } else {
                Class<Iterable> cls2 = Iterable.class;
                if (annotation instanceof l3.t) {
                    j(i4, type);
                    l3.t tVar = (l3.t) annotation;
                    String value2 = tVar.value();
                    boolean encoded = tVar.encoded();
                    Class h4 = O.h(type);
                    this.f16147k = true;
                    if (cls2.isAssignableFrom(h4)) {
                        if (type instanceof ParameterizedType) {
                            return new A.l(value2, this.f16137a.i(O.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                        }
                        throw O.p(this.f16139c, i4, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h4.isArray()) {
                        return new A.l(value2, this.f16137a.i(type, annotationArr), encoded);
                    } else {
                        return new A.l(value2, this.f16137a.i(a(h4.getComponentType()), annotationArr), encoded).b();
                    }
                } else if (annotation instanceof l3.v) {
                    j(i4, type);
                    boolean encoded2 = ((l3.v) annotation).encoded();
                    Class h5 = O.h(type);
                    this.f16148l = true;
                    if (cls2.isAssignableFrom(h5)) {
                        if (type instanceof ParameterizedType) {
                            return new A.n(this.f16137a.i(O.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                        }
                        throw O.p(this.f16139c, i4, h5.getSimpleName() + " must include generic type (e.g., " + h5.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h5.isArray()) {
                        return new A.n(this.f16137a.i(type, annotationArr), encoded2);
                    } else {
                        return new A.n(this.f16137a.i(a(h5.getComponentType()), annotationArr), encoded2).b();
                    }
                } else {
                    Class<Map> cls3 = Map.class;
                    if (annotation instanceof u) {
                        j(i4, type);
                        Class h6 = O.h(type);
                        this.f16149m = true;
                        if (cls3.isAssignableFrom(h6)) {
                            Type i5 = O.i(type, h6, cls3);
                            if (i5 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i5;
                                Type g4 = O.g(0, parameterizedType);
                                if (cls == g4) {
                                    return new A.m(this.f16139c, i4, this.f16137a.i(O.g(1, parameterizedType), annotationArr), ((u) annotation).encoded());
                                }
                                throw O.p(this.f16139c, i4, "@QueryMap keys must be of type String: " + g4, new Object[0]);
                            }
                            throw O.p(this.f16139c, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw O.p(this.f16139c, i4, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof i) {
                        j(i4, type);
                        i iVar = (i) annotation;
                        String value3 = iVar.value();
                        Class h7 = O.h(type);
                        if (cls2.isAssignableFrom(h7)) {
                            if (type instanceof ParameterizedType) {
                                return new A.f(value3, this.f16137a.i(O.g(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).c();
                            }
                            throw O.p(this.f16139c, i4, h7.getSimpleName() + " must include generic type (e.g., " + h7.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!h7.isArray()) {
                            return new A.f(value3, this.f16137a.i(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                        } else {
                            return new A.f(value3, this.f16137a.i(a(h7.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).b();
                        }
                    } else if (annotation instanceof j) {
                        if (type == s.class) {
                            return new A.h(this.f16139c, i4);
                        }
                        j(i4, type);
                        Class h8 = O.h(type);
                        if (cls3.isAssignableFrom(h8)) {
                            Type i6 = O.i(type, h8, cls3);
                            if (i6 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) i6;
                                Type g5 = O.g(0, parameterizedType2);
                                if (cls == g5) {
                                    return new A.g(this.f16139c, i4, this.f16137a.i(O.g(1, parameterizedType2), annotationArr), ((j) annotation).allowUnsafeNonAsciiValues());
                                }
                                throw O.p(this.f16139c, i4, "@HeaderMap keys must be of type String: " + g5, new Object[0]);
                            }
                            throw O.p(this.f16139c, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw O.p(this.f16139c, i4, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                    } else if (annotation instanceof l3.c) {
                        j(i4, type);
                        if (this.f16153q) {
                            l3.c cVar = (l3.c) annotation;
                            String value4 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f16143g = true;
                            Class h9 = O.h(type);
                            if (cls2.isAssignableFrom(h9)) {
                                if (type instanceof ParameterizedType) {
                                    return new A.d(value4, this.f16137a.i(O.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                                }
                                throw O.p(this.f16139c, i4, h9.getSimpleName() + " must include generic type (e.g., " + h9.getSimpleName() + "<String>)", new Object[0]);
                            } else if (!h9.isArray()) {
                                return new A.d(value4, this.f16137a.i(type, annotationArr), encoded3);
                            } else {
                                return new A.d(value4, this.f16137a.i(a(h9.getComponentType()), annotationArr), encoded3).b();
                            }
                        } else {
                            throw O.p(this.f16139c, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof d) {
                        j(i4, type);
                        if (this.f16153q) {
                            Class h10 = O.h(type);
                            if (cls3.isAssignableFrom(h10)) {
                                Type i7 = O.i(type, h10, cls3);
                                if (i7 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i7;
                                    Type g6 = O.g(0, parameterizedType3);
                                    if (cls == g6) {
                                        C0884k i8 = this.f16137a.i(O.g(1, parameterizedType3), annotationArr);
                                        this.f16143g = true;
                                        return new A.e(this.f16139c, i4, i8, ((d) annotation).encoded());
                                    }
                                    throw O.p(this.f16139c, i4, "@FieldMap keys must be of type String: " + g6, new Object[0]);
                                }
                                throw O.p(this.f16139c, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            throw O.p(this.f16139c, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw O.p(this.f16139c, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else {
                        Class<w.c> cls4 = w.c.class;
                        if (annotation instanceof q) {
                            j(i4, type);
                            if (this.f16154r) {
                                q qVar = (q) annotation;
                                this.f16144h = true;
                                String value5 = qVar.value();
                                Class h11 = O.h(type);
                                if (!value5.isEmpty()) {
                                    s e4 = s.e("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                                    if (cls2.isAssignableFrom(h11)) {
                                        if (type instanceof ParameterizedType) {
                                            Type g7 = O.g(0, (ParameterizedType) type);
                                            if (!cls4.isAssignableFrom(O.h(g7))) {
                                                return new A.i(this.f16139c, i4, e4, this.f16137a.g(g7, annotationArr, this.f16140d)).c();
                                            }
                                            throw O.p(this.f16139c, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                        throw O.p(this.f16139c, i4, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (h11.isArray()) {
                                        Class a4 = a(h11.getComponentType());
                                        if (!cls4.isAssignableFrom(a4)) {
                                            return new A.i(this.f16139c, i4, e4, this.f16137a.g(a4, annotationArr, this.f16140d)).b();
                                        }
                                        throw O.p(this.f16139c, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    } else if (!cls4.isAssignableFrom(h11)) {
                                        return new A.i(this.f16139c, i4, e4, this.f16137a.g(type, annotationArr, this.f16140d));
                                    } else {
                                        throw O.p(this.f16139c, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (cls2.isAssignableFrom(h11)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw O.p(this.f16139c, i4, h11.getSimpleName() + " must include generic type (e.g., " + h11.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (cls4.isAssignableFrom(O.h(O.g(0, (ParameterizedType) type)))) {
                                        return A.o.f16100a.c();
                                    } else {
                                        throw O.p(this.f16139c, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (h11.isArray()) {
                                    if (cls4.isAssignableFrom(h11.getComponentType())) {
                                        return A.o.f16100a.b();
                                    }
                                    throw O.p(this.f16139c, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                } else if (cls4.isAssignableFrom(h11)) {
                                    return A.o.f16100a;
                                } else {
                                    throw O.p(this.f16139c, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                throw O.p(this.f16139c, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof r) {
                            j(i4, type);
                            if (this.f16154r) {
                                this.f16144h = true;
                                Class h12 = O.h(type);
                                if (cls3.isAssignableFrom(h12)) {
                                    Type i9 = O.i(type, h12, cls3);
                                    if (i9 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType4 = (ParameterizedType) i9;
                                        Type g8 = O.g(0, parameterizedType4);
                                        if (cls == g8) {
                                            Type g9 = O.g(1, parameterizedType4);
                                            if (!cls4.isAssignableFrom(O.h(g9))) {
                                                return new A.j(this.f16139c, i4, this.f16137a.g(g9, annotationArr, this.f16140d), ((r) annotation).encoding());
                                            }
                                            throw O.p(this.f16139c, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        throw O.p(this.f16139c, i4, "@PartMap keys must be of type String: " + g8, new Object[0]);
                                    }
                                    throw O.p(this.f16139c, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                throw O.p(this.f16139c, i4, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                            throw O.p(this.f16139c, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        } else if (annotation instanceof l3.a) {
                            j(i4, type);
                            if (this.f16153q || this.f16154r) {
                                throw O.p(this.f16139c, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            } else if (!this.f16145i) {
                                try {
                                    C0884k g10 = this.f16137a.g(type, annotationArr, this.f16140d);
                                    this.f16145i = true;
                                    return new A.c(this.f16139c, i4, g10);
                                } catch (RuntimeException e5) {
                                    throw O.q(this.f16139c, e5, i4, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw O.p(this.f16139c, i4, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else if (!(annotation instanceof x)) {
                            return null;
                        } else {
                            j(i4, type);
                            Class h13 = O.h(type);
                            int i10 = i4 - 1;
                            while (i10 >= 0) {
                                A a5 = this.f16159w[i10];
                                if (!(a5 instanceof A.q) || !((A.q) a5).f16103a.equals(h13)) {
                                    i10--;
                                } else {
                                    throw O.p(this.f16139c, i4, "@Tag type " + h13.getName() + " is duplicate of " + B.f16105b.a(this.f16139c, i10) + " and would always overwrite its value.", new Object[0]);
                                }
                            }
                            return new A.q(h13);
                        }
                    }
                }
            }
        }

        static Set h(String str) {
            Matcher matcher = f16135y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i4, String str) {
            if (!f16136z.matcher(str).matches()) {
                throw O.p(this.f16139c, i4, "@Path parameter name must match %s. Found: %s", f16135y.pattern(), str);
            } else if (!this.f16158v.contains(str)) {
                throw O.p(this.f16139c, i4, "URL \"%s\" does not contain \"{%s}\".", this.f16155s, str);
            }
        }

        private void j(int i4, Type type) {
            if (O.j(type)) {
                throw O.p(this.f16139c, i4, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        public I b() {
            boolean z3;
            for (Annotation e4 : this.f16140d) {
                e(e4);
            }
            if (this.f16151o != null) {
                if (!this.f16152p) {
                    if (this.f16154r) {
                        throw O.n(this.f16139c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f16153q) {
                        throw O.n(this.f16139c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f16141e.length;
                this.f16159w = new A[length];
                int i4 = length - 1;
                for (int i5 = 0; i5 < length; i5++) {
                    A[] aArr = this.f16159w;
                    Type type = this.f16142f[i5];
                    Annotation[] annotationArr = this.f16141e[i5];
                    if (i5 == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aArr[i5] = f(i5, type, annotationArr, z3);
                }
                if (this.f16155s != null || this.f16150n) {
                    boolean z4 = this.f16153q;
                    if (!z4 && !this.f16154r && !this.f16152p && this.f16145i) {
                        throw O.n(this.f16139c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z4 && !this.f16143g) {
                        throw O.n(this.f16139c, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f16154r || this.f16144h) {
                        return new I(this);
                    } else {
                        throw O.n(this.f16139c, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw O.n(this.f16139c, "Missing either @%s URL or @Url parameter.", this.f16151o);
                }
            } else {
                throw O.n(this.f16139c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    I(a aVar) {
        this.f16123a = aVar.f16138b;
        this.f16124b = aVar.f16139c;
        this.f16125c = aVar.f16137a.f16166c;
        this.f16126d = aVar.f16151o;
        this.f16127e = aVar.f16155s;
        this.f16128f = aVar.f16156t;
        this.f16129g = aVar.f16157u;
        this.f16130h = aVar.f16152p;
        this.f16131i = aVar.f16153q;
        this.f16132j = aVar.f16154r;
        this.f16133k = aVar.f16159w;
        this.f16134l = aVar.f16160x;
    }

    static I b(K k4, Class cls, Method method) {
        return new a(k4, cls, method).b();
    }

    /* access modifiers changed from: package-private */
    public okhttp3.y a(Object obj, Object[] objArr) {
        A[] aArr = this.f16133k;
        int length = objArr.length;
        if (length == aArr.length) {
            H h4 = new H(this.f16126d, this.f16125c, this.f16127e, this.f16128f, this.f16129g, this.f16130h, this.f16131i, this.f16132j);
            if (this.f16134l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add(objArr[i4]);
                aArr[i4].a(h4, objArr[i4]);
            }
            return h4.k().n(v.class, new v(this.f16123a, obj, this.f16124b, arrayList)).b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + aArr.length + ")");
    }
}
