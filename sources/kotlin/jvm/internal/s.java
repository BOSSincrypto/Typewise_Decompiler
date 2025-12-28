package kotlin.jvm.internal;

import A2.c;
import A2.d;
import A2.e;
import A2.g;

public class s {
    public e a(FunctionReference functionReference) {
        return functionReference;
    }

    public c b(Class cls) {
        return new g(cls);
    }

    public d c(Class cls, String str) {
        return new q(cls, str);
    }

    public g d(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public String e(l lVar) {
        String obj = lVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String f(Lambda lambda) {
        return e(lambda);
    }
}
