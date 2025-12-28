package kotlin.jvm.internal;

import A2.b;
import A2.f;

public abstract class PropertyReference extends CallableReference implements f {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    public b compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !o.a(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof f) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public abstract /* synthetic */ f.a getGetter();

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* access modifiers changed from: protected */
    public f getReflected() {
        if (!this.syntheticJavaProperty) {
            return (f) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        boolean z3 = false;
        this.syntheticJavaProperty = (i4 & 2) == 2 ? true : z3;
    }
}
