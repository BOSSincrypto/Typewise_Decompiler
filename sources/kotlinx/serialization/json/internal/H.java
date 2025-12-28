package kotlinx.serialization.json.internal;

import F2.k;
import F2.n;
import H2.d;
import H2.e;
import H2.f;
import H2.m;
import J2.L;
import K2.C0341a;
import K2.C0345e;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o;

public abstract class H {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14344a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlinx.serialization.json.ClassDiscriminatorMode[] r0 = kotlinx.serialization.json.ClassDiscriminatorMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.serialization.json.ClassDiscriminatorMode r1 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.serialization.json.ClassDiscriminatorMode r1 = kotlinx.serialization.json.ClassDiscriminatorMode.POLYMORPHIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.serialization.json.ClassDiscriminatorMode r1 = kotlinx.serialization.json.ClassDiscriminatorMode.ALL_JSON_OBJECTS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f14344a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.H.a.<clinit>():void");
        }
    }

    public static final void b(m mVar) {
        o.e(mVar, "kind");
        if (mVar instanceof m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (mVar instanceof e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (mVar instanceof d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(f fVar, C0341a aVar) {
        o.e(fVar, "<this>");
        o.e(aVar, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof C0345e) {
                return ((C0345e) annotation).discriminator();
            }
        }
        return aVar.d().e();
    }

    /* access modifiers changed from: private */
    public static final void d(n nVar, n nVar2, String str) {
        if ((nVar instanceof k) && L.a(nVar2.a()).contains(str)) {
            String b4 = ((k) nVar).a().b();
            String b5 = nVar2.a().b();
            throw new IllegalStateException(("Sealed class '" + b5 + "' cannot be serialized as base class '" + b4 + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
