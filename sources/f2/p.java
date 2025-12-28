package F2;

import A2.c;
import G2.a;
import J2.C0313l0;
import J2.C0340z0;
import L2.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import t2.C0900a;

abstract /* synthetic */ class p {
    private static final b a(b bVar, GenericArrayType genericArrayType, boolean z3) {
        b bVar2;
        c cVar;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            o.d(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) C0713h.z(upperBounds);
        }
        o.b(genericComponentType);
        if (z3) {
            bVar2 = o.a(bVar, genericComponentType);
        } else {
            bVar2 = o.b(bVar, genericComponentType);
            if (bVar2 == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            o.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            cVar = C0900a.c((Class) rawType);
        } else if (genericComponentType instanceof c) {
            cVar = (c) genericComponentType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + r.b(genericComponentType.getClass()));
        }
        o.c(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        b a4 = a.a(cVar, bVar2);
        o.c(a4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a4;
    }

    private static final Class b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            o.d(rawType, "getRawType(...)");
            return b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            o.d(upperBounds, "getUpperBounds(...)");
            Object z3 = C0713h.z(upperBounds);
            o.d(z3, "first(...)");
            return b((Type) z3);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            o.d(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + r.b(type.getClass()));
        }
    }

    private static final b c(b bVar, Class cls, List list) {
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        b b4 = C0313l0.b(cls, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (b4 != null) {
            return b4;
        }
        c c4 = C0900a.c(cls);
        b b5 = C0340z0.b(c4);
        if (b5 != null) {
            return b5;
        }
        b b6 = bVar.b(c4, list);
        if (b6 != null) {
            return b6;
        }
        if (cls.isInterface()) {
            return new f(C0900a.c(cls));
        }
        return null;
    }

    public static final b d(b bVar, Type type) {
        o.e(bVar, "<this>");
        o.e(type, "type");
        b e4 = e(bVar, type, true);
        if (e4 != null) {
            return e4;
        }
        C0313l0.m(b(type));
        throw new KotlinNothingValueException();
    }

    private static final b e(b bVar, Type type, boolean z3) {
        ArrayList<b> arrayList;
        if (type instanceof GenericArrayType) {
            return a(bVar, (GenericArrayType) type, z3);
        }
        if (type instanceof Class) {
            return h(bVar, (Class) type, z3);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            o.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            o.b(actualTypeArguments);
            if (z3) {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    o.b(type2);
                    arrayList.add(o.a(bVar, type2));
                }
            } else {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    o.b(type3);
                    b b4 = o.b(bVar, type3);
                    if (b4 == null) {
                        return null;
                    }
                    arrayList.add(b4);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                b n4 = a.n((b) arrayList.get(0));
                o.c(n4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return n4;
            } else if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                b h4 = a.h((b) arrayList.get(0));
                o.c(h4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return h4;
            } else if (Map.class.isAssignableFrom(cls)) {
                b k4 = a.k((b) arrayList.get(0), (b) arrayList.get(1));
                o.c(k4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return k4;
            } else if (Map.Entry.class.isAssignableFrom(cls)) {
                b j4 = a.j((b) arrayList.get(0), (b) arrayList.get(1));
                o.c(j4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return j4;
            } else if (Pair.class.isAssignableFrom(cls)) {
                b m4 = a.m((b) arrayList.get(0), (b) arrayList.get(1));
                o.c(m4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return m4;
            } else if (Triple.class.isAssignableFrom(cls)) {
                b p4 = a.p((b) arrayList.get(0), (b) arrayList.get(1), (b) arrayList.get(2));
                o.c(p4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return p4;
            } else {
                ArrayList arrayList2 = new ArrayList(C0718m.t(arrayList, 10));
                for (b bVar2 : arrayList) {
                    o.c(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList2.add(bVar2);
                }
                return c(bVar, cls, arrayList2);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            o.d(upperBounds, "getUpperBounds(...)");
            Object z4 = C0713h.z(upperBounds);
            o.d(z4, "first(...)");
            return f(bVar, (Type) z4, false, 2, (Object) null);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + r.b(type.getClass()));
        }
    }

    static /* synthetic */ b f(b bVar, Type type, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return e(bVar, type, z3);
    }

    public static final b g(b bVar, Type type) {
        o.e(bVar, "<this>");
        o.e(type, "type");
        return e(bVar, type, false);
    }

    private static final b h(b bVar, Class cls, boolean z3) {
        b bVar2;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            o.c(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(bVar, cls, C0718m.j());
        }
        Class<?> componentType = cls.getComponentType();
        o.d(componentType, "getComponentType(...)");
        if (z3) {
            bVar2 = o.a(bVar, componentType);
        } else {
            bVar2 = o.b(bVar, componentType);
            if (bVar2 == null) {
                return null;
            }
        }
        c c4 = C0900a.c(componentType);
        o.c(c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        b a4 = a.a(c4, bVar2);
        o.c(a4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a4;
    }
}
