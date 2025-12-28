package ch.icoaching.wrio;

import android.view.inputmethod.CorrectionInfo;
import ch.icoaching.wrio.keyboard.view.smartbar.b;
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

@d(c = "ch.icoaching.wrio.BaseInputMethodService$undoCorrection$1", f = "BaseInputMethodService.kt", l = {1525}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$undoCorrection$1 extends SuspendLambda implements p {
    final /* synthetic */ String $correction;
    final /* synthetic */ b $correctionItem;
    final /* synthetic */ String $original;
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    @d(c = "ch.icoaching.wrio.BaseInputMethodService$undoCorrection$1$1", f = "BaseInputMethodService.kt", l = {1526}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.BaseInputMethodService$undoCorrection$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(baseInputMethodService, bVar, str, str2, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                ch.icoaching.wrio.input.c k02 = baseInputMethodService.k0();
                CorrectionInfo correctionInfo = new CorrectionInfo(((ch.icoaching.wrio.keyboard.view.smartbar.f) bVar).g(), str, str2);
                this.label = 1;
                if (k02.t(correctionInfo, false, true, this) == f4) {
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
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$undoCorrection$1(BaseInputMethodService baseInputMethodService, b bVar, String str, String str2, c<? super BaseInputMethodService$undoCorrection$1> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
        this.$correctionItem = bVar;
        this.$correction = str;
        this.$original = str2;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new BaseInputMethodService$undoCorrection$1(this.this$0, this.$correctionItem, this.$correction, this.$original, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher s02 = this.this$0.s0();
            final BaseInputMethodService baseInputMethodService = this.this$0;
            final b bVar = this.$correctionItem;
            final String str = this.$correction;
            final String str2 = this.$original;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(s02, r32, this) == f4) {
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
        return ((BaseInputMethodService$undoCorrection$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
