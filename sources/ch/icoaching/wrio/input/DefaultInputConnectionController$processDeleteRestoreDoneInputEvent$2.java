package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2", f = "DefaultInputConnectionController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9733a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType[] r0 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r1 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r1 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9733a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        OnContentChangeEventFlags.TriggerEventType triggerEventType;
        kotlin.coroutines.intrinsics.a.f();
        if (this.label == 0) {
            f.b(obj);
            l P02 = this.this$0.f9676m;
            if (P02 == null) {
                return q.f14567a;
            }
            this.this$0.f9676m = null;
            int i4 = a.f9733a[P02.g().a().ordinal()];
            if (i4 == 1) {
                triggerEventType = OnContentChangeEventFlags.TriggerEventType.DELETE_DONE;
            } else if (i4 == 2) {
                triggerEventType = OnContentChangeEventFlags.TriggerEventType.RESTORE_DONE;
            } else {
                throw new IllegalStateException("Last non delivered delete/restore OnContentChangeVent shouldn't be of " + P02.g().a() + " TriggerEventType");
            }
            this.this$0.m0(l.a(P02, (String) null, (String) null, (List) null, 0, (String) null, OnContentChangeEventFlags.b(P02.g(), false, false, triggerEventType, 3, (Object) null), 31, (Object) null));
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processDeleteRestoreDoneInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
