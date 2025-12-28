package ch.icoaching.wrio;

import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$1", f = "TypewiseInputMethodService.kt", l = {227}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class TypewiseInputMethodService$onStartInputView$1 extends SuspendLambda implements p {
    final /* synthetic */ EditorInfo $editorInfo;
    final /* synthetic */ boolean $isBrowserInputField;
    int label;
    final /* synthetic */ TypewiseInputMethodService this$0;

    @d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$1$1", f = "TypewiseInputMethodService.kt", l = {229}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(typewiseInputMethodService, editorInfo, z3, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                ch.icoaching.wrio.appnomix.controller.a a12 = typewiseInputMethodService.f9063q0;
                if (a12 == null) {
                    o.p("analyticsController");
                    a12 = null;
                }
                ch.icoaching.wrio.appnomix.controller.a aVar = a12;
                String y02 = typewiseInputMethodService.y0();
                String i02 = typewiseInputMethodService.i0();
                EditorInfo editorInfo = editorInfo;
                if (editorInfo == null || (str = editorInfo.packageName) == null) {
                    str = "";
                }
                boolean z3 = z3;
                String c4 = typewiseInputMethodService.x0().c();
                this.label = 1;
                if (aVar.b(y02, i02, str, z3, c4, this) == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                try {
                    f.b(obj);
                } catch (Exception e4) {
                    Log.f10572a.e("TypewiseInputMethodService", "onStartInputView() :: Failed to send keyboard_opened event", e4);
                }
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
    TypewiseInputMethodService$onStartInputView$1(TypewiseInputMethodService typewiseInputMethodService, EditorInfo editorInfo, boolean z3, c<? super TypewiseInputMethodService$onStartInputView$1> cVar) {
        super(2, cVar);
        this.this$0 = typewiseInputMethodService;
        this.$editorInfo = editorInfo;
        this.$isBrowserInputField = z3;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new TypewiseInputMethodService$onStartInputView$1(this.this$0, this.$editorInfo, this.$isBrowserInputField, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher m02 = this.this$0.m0();
            final TypewiseInputMethodService typewiseInputMethodService = this.this$0;
            final EditorInfo editorInfo = this.$editorInfo;
            final boolean z3 = this.$isBrowserInputField;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(m02, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f9067u0 = null;
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((TypewiseInputMethodService$onStartInputView$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
