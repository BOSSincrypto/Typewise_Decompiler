package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.DefaultInputConnectionController;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processPredictionInputEvent$2", f = "DefaultInputConnectionController.kt", l = {1061, 1065, 1069}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processPredictionInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.i $inputEvent;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9734a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type[] r0 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r1 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.CORRECTION_SUGGESTION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r1 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.SPECIAL_FIELD_PREDICTION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9734a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController$processPredictionInputEvent$2.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processPredictionInputEvent$2(DefaultInputConnectionController.a.i iVar, DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processPredictionInputEvent$2> cVar) {
        super(2, cVar);
        this.$inputEvent = iVar;
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processPredictionInputEvent$2(this.$inputEvent, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = kotlin.coroutines.intrinsics.a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            int i5 = a.f9734a[this.$inputEvent.d().ordinal()];
            if (i5 == 1) {
                DefaultInputConnectionController defaultInputConnectionController = this.this$0;
                int c4 = this.$inputEvent.c();
                String a4 = this.$inputEvent.a();
                String b4 = this.$inputEvent.b();
                this.label = 1;
                if (defaultInputConnectionController.D(c4, a4, b4, this) == f4) {
                    return f4;
                }
            } else if (i5 != 2) {
                DefaultInputConnectionController defaultInputConnectionController2 = this.this$0;
                int c5 = this.$inputEvent.c();
                String a5 = this.$inputEvent.a();
                String b5 = this.$inputEvent.b();
                this.label = 3;
                if (defaultInputConnectionController2.p0(c5, a5, b5, this) == f4) {
                    return f4;
                }
            } else {
                DefaultInputConnectionController defaultInputConnectionController3 = this.this$0;
                int c6 = this.$inputEvent.c();
                String a6 = this.$inputEvent.a();
                String b6 = this.$inputEvent.b();
                this.label = 2;
                if (defaultInputConnectionController3.z0(c6, a6, b6, this) == f4) {
                    return f4;
                }
            }
        } else if (i4 == 1 || i4 == 2 || i4 == 3) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processPredictionInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
