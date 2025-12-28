package J2;

import F2.b;
import F2.f;
import G2.a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.D;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.uuid.Uuid;
import kotlinx.serialization.SerializationException;
import l2.h;
import l2.i;
import l2.l;
import l2.m;
import l2.q;
import t2.C0900a;

/* renamed from: J2.l0  reason: case insensitive filesystem */
public abstract class C0313l0 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final b b(Class cls, b... bVarArr) {
        o.e(cls, "<this>");
        o.e(bVarArr, "args");
        if (cls.isEnum() && k(cls)) {
            return c(cls);
        }
        b i4 = i(cls, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (i4 != null) {
            return i4;
        }
        b f4 = f(cls);
        if (f4 != null) {
            return f4;
        }
        b d4 = d(cls, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (d4 != null) {
            return d4;
        }
        if (l(cls)) {
            return new f(C0900a.c(cls));
        }
        return null;
    }

    private static final b c(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        o.d(canonicalName, "getCanonicalName(...)");
        o.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new A(canonicalName, (Enum[]) enumConstants);
    }

    private static final b d(Class cls, b... bVarArr) {
        Object obj;
        Field field;
        b h4;
        Object e4 = e(cls);
        if (e4 != null && (h4 = h(e4, (b[]) Arrays.copyOf(bVarArr, bVarArr.length))) != null) {
            return h4;
        }
        try {
            Class[] declaredClasses = cls.getDeclaredClasses();
            o.d(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i4 = 0;
            Class cls2 = null;
            boolean z3 = false;
            while (true) {
                if (i4 < length) {
                    Class cls3 = declaredClasses[i4];
                    if (o.a(cls3.getSimpleName(), "$serializer")) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        cls2 = cls3;
                    }
                    i4++;
                } else if (!z3) {
                }
            }
            cls2 = null;
            if (cls2 == null || (field = cls2.getField("INSTANCE")) == null) {
                obj = null;
            } else {
                obj = field.get((Object) null);
            }
            if (obj instanceof b) {
                return (b) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object e(Class cls) {
        Class cls2;
        Class[] declaredClasses = cls.getDeclaredClasses();
        o.d(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i4];
            if (cls2.getAnnotation(C0291a0.class) != null) {
                break;
            }
            i4++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        o.d(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r5 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r4 == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final F2.b f(java.lang.Class r11) {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.o.G(r0, r2, r3, r4, r1)
            if (r2 != 0) goto L_0x00ae
            java.lang.String r2 = "kotlin."
            boolean r0 = kotlin.text.o.G(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L_0x001b
            goto L_0x00ae
        L_0x001b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.o.d(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L_0x0028:
            r7 = 1
            if (r4 >= r2) goto L_0x0056
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.o.a(r9, r10)
            if (r9 == 0) goto L_0x0053
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.o.a(r9, r11)
            if (r9 == 0) goto L_0x0053
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x0051
        L_0x004f:
            r6 = r1
            goto L_0x0059
        L_0x0051:
            r5 = r7
            r6 = r8
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0056:
            if (r5 != 0) goto L_0x0059
            goto L_0x004f
        L_0x0059:
            if (r6 != 0) goto L_0x005c
            return r1
        L_0x005c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.o.d(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L_0x006c:
            if (r3 >= r2) goto L_0x009d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.o.a(r8, r9)
            if (r8 == 0) goto L_0x009a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.o.d(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L_0x009a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<F2.b> r9 = F2.b.class
            boolean r8 = kotlin.jvm.internal.o.a(r8, r9)
            if (r8 == 0) goto L_0x009a
            if (r4 == 0) goto L_0x0098
        L_0x0096:
            r5 = r1
            goto L_0x00a0
        L_0x0098:
            r5 = r6
            r4 = r7
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x006c
        L_0x009d:
            if (r4 != 0) goto L_0x00a0
            goto L_0x0096
        L_0x00a0:
            if (r5 != 0) goto L_0x00a3
            return r1
        L_0x00a3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof F2.b
            if (r0 == 0) goto L_0x00ae
            r1 = r11
            F2.b r1 = (F2.b) r1
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.C0313l0.f(java.lang.Class):F2.b");
    }

    public static final Map g() {
        Map c4 = D.c();
        c4.put(r.b(String.class), a.E(u.f13912a));
        c4.put(r.b(Character.TYPE), a.y(e.f13894a));
        c4.put(r.b(char[].class), a.d());
        c4.put(r.b(Double.TYPE), a.z(j.f13903a));
        c4.put(r.b(double[].class), a.e());
        c4.put(r.b(Float.TYPE), a.A(k.f13904a));
        c4.put(r.b(float[].class), a.f());
        c4.put(r.b(Long.TYPE), a.C(p.f13906a));
        c4.put(r.b(long[].class), a.i());
        c4.put(r.b(l.class), a.I(l.f14556b));
        c4.put(r.b(Integer.TYPE), a.B(n.f13905a));
        c4.put(r.b(int[].class), a.g());
        c4.put(r.b(l2.j.class), a.H(l2.j.f14551b));
        c4.put(r.b(Short.TYPE), a.D(t.f13911a));
        c4.put(r.b(short[].class), a.o());
        c4.put(r.b(l2.o.class), a.J(l2.o.f14562b));
        c4.put(r.b(Byte.TYPE), a.x(d.f13893a));
        c4.put(r.b(byte[].class), a.c());
        c4.put(r.b(h.class), a.G(h.f14546b));
        c4.put(r.b(Boolean.TYPE), a.w(c.f13892a));
        c4.put(r.b(boolean[].class), a.b());
        c4.put(r.b(q.class), a.K(q.f14567a));
        c4.put(r.b(Void.class), a.l());
        try {
            c4.put(r.b(C2.a.class), a.v(C2.a.f225b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            c4.put(r.b(m.class), a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            c4.put(r.b(l2.k.class), a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            c4.put(r.b(l2.p.class), a.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            c4.put(r.b(i.class), a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            c4.put(r.b(Uuid.class), a.F(Uuid.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return D.b(c4);
    }

    private static final b h(Object obj, b... bVarArr) {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i4 = 0; i4 < length; i4++) {
                    clsArr2[i4] = b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (invoke instanceof b) {
                return (b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e4.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e4;
        }
    }

    private static final b i(Class cls, b... bVarArr) {
        Object a4 = a(cls, "Companion");
        if (a4 == null) {
            return null;
        }
        return h(a4, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final boolean j(A2.c cVar) {
        o.e(cVar, "<this>");
        return C0900a.a(cVar).isInterface();
    }

    private static final boolean k(Class cls) {
        if (cls.getAnnotation(F2.m.class) == null && cls.getAnnotation(F2.c.class) == null) {
            return true;
        }
        return false;
    }

    private static final boolean l(Class cls) {
        if (cls.getAnnotation(F2.c.class) != null) {
            return true;
        }
        F2.m mVar = (F2.m) cls.getAnnotation(F2.m.class);
        if (mVar == null || !o.a(r.b(mVar.with()), r.b(f.class))) {
            return false;
        }
        return true;
    }

    public static final Void m(Class cls) {
        o.e(cls, "<this>");
        throw new SerializationException(C0315m0.c(C0900a.c(cls)));
    }

    public static final Object[] n(ArrayList arrayList, A2.c cVar) {
        o.e(arrayList, "<this>");
        o.e(cVar, "eClass");
        Object newInstance = Array.newInstance(C0900a.a(cVar), arrayList.size());
        o.c(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        o.d(array, "toArray(...)");
        return array;
    }
}
