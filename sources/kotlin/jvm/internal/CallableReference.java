package kotlin.jvm.internal;

import A2.b;
import A2.d;
import A2.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f13889a;

    /* renamed from: a  reason: collision with root package name */
    private transient b f13888a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    private static class NoReceiver implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final NoReceiver f13889a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return f13889a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public b compute() {
        b bVar = this.f13888a;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.f13888a = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return r.c(cls);
        }
        return r.b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public b getReflected() {
        b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected CallableReference(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected CallableReference(Object obj, Class cls, String str, String str2, boolean z3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z3;
    }
}
