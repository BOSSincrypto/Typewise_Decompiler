package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.flow.internal.k;
import l2.q;
import u2.p;

@d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {243}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/g;", "", "value", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/channels/g;)V"}, k = 3, mv = {1, 6, 0})
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements p {
    final /* synthetic */ d $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, d dVar, c<? super FlowKt__DelayKt$debounceInternal$1$3$2> cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = dVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, cVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m12invokeWpGqRn0(((g) obj).j(), (c) obj2);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m12invokeWpGqRn0(Object obj, c<? super q> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(g.b(obj), cVar)).invokeSuspend(q.f14567a);
    }

    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            T j4 = ((g) this.L$0).j();
            ref$ObjectRef = this.$lastValue;
            boolean z3 = j4 instanceof g.c;
            if (!z3) {
                ref$ObjectRef.element = j4;
            }
            d dVar = this.$downstream;
            if (z3) {
                Throwable e4 = g.e(j4);
                if (e4 == null) {
                    T t4 = ref$ObjectRef.element;
                    if (t4 != null) {
                        if (t4 == k.f14124a) {
                            t4 = null;
                        }
                        this.L$0 = j4;
                        this.L$1 = ref$ObjectRef;
                        this.label = 1;
                        if (dVar.emit(t4, this) == f4) {
                            return f4;
                        }
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.element = k.f14126c;
                } else {
                    throw e4;
                }
            }
            return q.f14567a;
        } else if (i4 == 1) {
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = k.f14126c;
        return q.f14567a;
    }
}
