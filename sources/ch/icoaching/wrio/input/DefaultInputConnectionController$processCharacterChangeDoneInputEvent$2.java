package ch.icoaching.wrio.input;

import ch.icoaching.wrio.I;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2", f = "DefaultInputConnectionController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        a.f();
        if (this.label == 0) {
            f.b(obj);
            Log log = Log.f10572a;
            StringBuilder sb = new StringBuilder();
            sb.append("processCharacterChangeDone() :: FROM: '");
            String T02 = this.this$0.f9678o;
            if (T02 != null) {
                charSequence = I.b(T02, (Integer) null, 1, (Object) null);
            } else {
                charSequence = null;
            }
            sb.append(charSequence);
            sb.append("' | '");
            String R02 = this.this$0.f9677n;
            if (R02 != null) {
                charSequence2 = I.b(R02, (Integer) null, 1, (Object) null);
            } else {
                charSequence2 = null;
            }
            sb.append(charSequence2);
            sb.append('\'');
            Log.d(log, "DefaultInputConnectionController", sb.toString(), (Throwable) null, 4, (Object) null);
            String R03 = this.this$0.f9677n;
            if (R03 == null) {
                return q.f14567a;
            }
            String T03 = this.this$0.f9678o;
            if (T03 == null) {
                return q.f14567a;
            }
            this.this$0.f9677n = null;
            this.this$0.f9678o = null;
            String f4 = this.this$0.f9659B.f();
            Log.d(log, "DefaultInputConnectionController", "processCharacterChangeDone() :: TO: '" + I.a(f4, kotlin.coroutines.jvm.internal.a.d(this.this$0.f9659B.h())) + '\'', (Throwable) null, 4, (Object) null);
            if (o.a(f4, R03)) {
                return q.f14567a;
            }
            this.this$0.m0(new l(R03, f4, this.this$0.f9659B.g(), this.this$0.f9659B.i(), T03, new OnContentChangeEventFlags(false, true, OnContentChangeEventFlags.TriggerEventType.CHARACTER)));
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processCharacterChangeDoneInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
