package ch.icoaching.wrio.input;

import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$removePrediction$1", f = "DefaultInputConnectionController.kt", l = {319}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$removePrediction$1 extends SuspendLambda implements p {
    final /* synthetic */ EditorInfo $editorInfoLocal;
    final /* synthetic */ String $prediction;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    @d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$removePrediction$1$1", f = "DefaultInputConnectionController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.input.DefaultInputConnectionController$removePrediction$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultInputConnectionController, str, editorInfo, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                defaultInputConnectionController.f9668e.a(str, editorInfo);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$removePrediction$1(DefaultInputConnectionController defaultInputConnectionController, String str, EditorInfo editorInfo, c<? super DefaultInputConnectionController$removePrediction$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$prediction = str;
        this.$editorInfoLocal = editorInfo;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$removePrediction$1(this.this$0, this.$prediction, this.$editorInfoLocal, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher M02 = this.this$0.f9665b;
            final DefaultInputConnectionController defaultInputConnectionController = this.this$0;
            final String str = this.$prediction;
            final EditorInfo editorInfo = this.$editorInfoLocal;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(M02, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$removePrediction$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
