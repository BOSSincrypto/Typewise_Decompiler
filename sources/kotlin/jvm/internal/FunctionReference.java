package kotlin.jvm.internal;

import A2.b;
import A2.e;

public class FunctionReference extends CallableReference implements l, e {
    private final int arity;
    private final int flags;

    public FunctionReference(int i4) {
        this(i4, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return r.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !o.a(getBoundReceiver(), functionReference.getBoundReceiver()) || !o.a(getOwner(), functionReference.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i4;
        if (getOwner() == null) {
            i4 = 0;
        } else {
            i4 = getOwner().hashCode() * 31;
        }
        return ((i4 + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i4, Object obj) {
        this(i4, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public e getReflected() {
        return (e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionReference(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.arity = i4;
        this.flags = i5 >> 1;
    }
}
