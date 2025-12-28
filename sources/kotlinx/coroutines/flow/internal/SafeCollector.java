package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.j0;
import l2.q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010'\u001a\u00020&8\u0000X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/d;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/c;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/d;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/c;", "Ll2/q;", "uCont", "value", "", "e", "(Lkotlin/coroutines/c;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/f;", "exception", "g", "(Lkotlinx/coroutines/flow/internal/f;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/d;", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "completion", "Lkotlin/coroutines/c;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SafeCollector<T> extends ContinuationImpl implements d, c {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final d collector;
    private kotlin.coroutines.c<? super q> completion;
    private CoroutineContext lastEmissionContext;

    public SafeCollector(d dVar, CoroutineContext coroutineContext) {
        super(i.f14121a, EmptyCoroutineContext.INSTANCE);
        this.collector = dVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, SafeCollector$collectContextSize$1.INSTANCE)).intValue();
    }

    private final void a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof f) {
            g((f) coroutineContext2, obj);
        }
        SafeCollector_commonKt.a(this, coroutineContext);
    }

    private final Object e(kotlin.coroutines.c cVar, Object obj) {
        CoroutineContext context = cVar.getContext();
        j0.e(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            a(context, coroutineContext, obj);
            this.lastEmissionContext = context;
        }
        this.completion = cVar;
        Object invoke = SafeCollectorKt.f14111a.invoke(this.collector, obj, this);
        if (!o.a(invoke, a.f())) {
            this.completion = null;
        }
        return invoke;
    }

    private final void g(f fVar, Object obj) {
        throw new IllegalStateException(kotlin.text.o.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.f14119a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t4, kotlin.coroutines.c<? super q> cVar) {
        try {
            Object e4 = e(cVar, t4);
            if (e4 == a.f()) {
                f.c(cVar);
            }
            if (e4 == a.f()) {
                return e4;
            }
            return q.f14567a;
        } catch (Throwable th) {
            this.lastEmissionContext = new f(th, cVar.getContext());
            throw th;
        }
    }

    public c getCallerFrame() {
        kotlin.coroutines.c<? super q> cVar = this.completion;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext == null) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return coroutineContext;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable r02 = Result.m4exceptionOrNullimpl(obj);
        if (r02 != null) {
            this.lastEmissionContext = new f(r02, getContext());
        }
        kotlin.coroutines.c<? super q> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return a.f();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
