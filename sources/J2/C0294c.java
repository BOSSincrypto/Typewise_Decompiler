package J2;

import A2.c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;

/* renamed from: J2.c  reason: case insensitive filesystem */
public abstract class C0294c {
    public static final Void a(c cVar, c cVar2) {
        o.e(cVar, "subClass");
        o.e(cVar2, "baseClass");
        String b4 = cVar.b();
        if (b4 == null) {
            b4 = String.valueOf(cVar);
        }
        b(b4, cVar2);
        throw new KotlinNothingValueException();
    }

    public static final Void b(String str, c cVar) {
        String str2;
        o.e(cVar, "baseClass");
        String str3 = "in the polymorphic scope of '" + cVar.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + cVar.b() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }
}
