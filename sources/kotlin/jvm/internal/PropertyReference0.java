package kotlin.jvm.internal;

import A2.b;
import A2.g;

public abstract class PropertyReference0 extends PropertyReference implements g {
    public PropertyReference0() {
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return r.d(this);
    }

    public abstract /* synthetic */ Object get();

    public Object getDelegate() {
        return ((g) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public g.a getGetter() {
        ((g) getReflected()).getGetter();
        return null;
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
