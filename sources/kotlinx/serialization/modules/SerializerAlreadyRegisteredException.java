package kotlinx.serialization.modules;

import A2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "LA2/c;", "baseClass", "concreteClass", "(LA2/c;LA2/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String str) {
        super(str);
        o.e(str, "msg");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(c cVar, c cVar2) {
        this("Serializer for " + cVar2 + " already registered in the scope of " + cVar);
        o.e(cVar, "baseClass");
        o.e(cVar2, "concreteClass");
    }
}
