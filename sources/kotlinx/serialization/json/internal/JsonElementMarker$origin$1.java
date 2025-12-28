package kotlinx.serialization.json.internal;

import H2.f;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements p {
    JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(f fVar, int i4) {
        o.e(fVar, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).e(fVar, i4));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((f) obj, ((Number) obj2).intValue());
    }
}
