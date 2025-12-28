package kotlin.jvm.internal;

import A2.c;
import A2.d;

public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(d dVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((f) dVar).c(), str, str2, (dVar instanceof c) ^ true ? 1 : 0);
    }

    public Object get() {
        getGetter();
        throw null;
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i4) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i4);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
