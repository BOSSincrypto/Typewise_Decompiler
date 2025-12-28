package kotlin;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import l2.C0792b;
import u2.q;

final class b extends C0792b implements c {

    /* renamed from: a  reason: collision with root package name */
    private q f13812a;

    /* renamed from: b  reason: collision with root package name */
    private Object f13813b;

    /* renamed from: c  reason: collision with root package name */
    private c f13814c = this;

    /* renamed from: d  reason: collision with root package name */
    private Object f13815d = a.f13811a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(q qVar, Object obj) {
        super((i) null);
        o.e(qVar, "block");
        this.f13812a = qVar;
        this.f13813b = obj;
        o.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object a(Object obj, c cVar) {
        o.c(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f13814c = cVar;
        this.f13813b = obj;
        Object f4 = a.f();
        if (f4 == a.f()) {
            f.c(cVar);
        }
        return f4;
    }

    public final Object d() {
        Object obj;
        while (true) {
            Object obj2 = this.f13815d;
            c cVar = this.f13814c;
            if (cVar == null) {
                f.b(obj2);
                return obj2;
            } else if (Result.m3equalsimpl0(a.f13811a, obj2)) {
                try {
                    q qVar = this.f13812a;
                    Object obj3 = this.f13813b;
                    if (!(qVar instanceof BaseContinuationImpl)) {
                        obj = a.e(qVar, this, obj3, cVar);
                    } else {
                        obj = ((q) v.c(qVar, 3)).invoke(this, obj3, cVar);
                    }
                    if (obj != a.f()) {
                        cVar.resumeWith(Result.m1constructorimpl(obj));
                    }
                } catch (Throwable th) {
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m1constructorimpl(f.a(th)));
                }
            } else {
                this.f13815d = a.f13811a;
                cVar.resumeWith(obj2);
            }
        }
    }

    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public void resumeWith(Object obj) {
        this.f13814c = null;
        this.f13815d = obj;
    }
}
