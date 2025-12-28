package b2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;
import okhttp3.v;
import retrofit2.C0884k;
import retrofit2.K;

/* renamed from: b2.b  reason: case insensitive filesystem */
public final class C0484b extends C0884k.a {

    /* renamed from: a  reason: collision with root package name */
    private final v f7482a;

    /* renamed from: b  reason: collision with root package name */
    private final C0487e f7483b;

    public C0484b(v vVar, C0487e eVar) {
        o.e(vVar, "contentType");
        o.e(eVar, "serializer");
        this.f7482a = vVar;
        this.f7483b = eVar;
    }

    public C0884k c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, K k4) {
        o.e(type, "type");
        o.e(annotationArr, "parameterAnnotations");
        o.e(annotationArr2, "methodAnnotations");
        o.e(k4, "retrofit");
        return new C0486d(this.f7482a, this.f7483b.c(type), this.f7483b);
    }

    public C0884k d(Type type, Annotation[] annotationArr, K k4) {
        o.e(type, "type");
        o.e(annotationArr, "annotations");
        o.e(k4, "retrofit");
        return new C0483a(this.f7483b.c(type), this.f7483b);
    }
}
