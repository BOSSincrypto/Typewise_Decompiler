package t2;

import A2.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;

/* renamed from: t2.a  reason: case insensitive filesystem */
public abstract class C0900a {
    public static final Class a(c cVar) {
        o.e(cVar, "<this>");
        Class c4 = ((f) cVar).c();
        o.c(c4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return c4;
    }

    public static final Class b(c cVar) {
        o.e(cVar, "<this>");
        Class c4 = ((f) cVar).c();
        if (!c4.isPrimitive()) {
            o.c(c4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return c4;
        }
        String name = c4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    c4 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    c4 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    c4 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    c4 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    c4 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    c4 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    c4 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    c4 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    c4 = Short.class;
                    break;
                }
                break;
        }
        o.c(c4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return c4;
    }

    public static final c c(Class cls) {
        o.e(cls, "<this>");
        return r.b(cls);
    }
}
