package ch.icoaching.wrio.keyboard;

import android.widget.FrameLayout;
import ch.icoaching.wrio.keyboard.layout.Layer;
import ch.icoaching.wrio.keyboard.view.C0537l;
import ch.icoaching.wrio.keyboard.view.KeyboardLayoutView;
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

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$showEmojisKeyboard$2", f = "DefaultKeyboardController.kt", l = {1353}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$showEmojisKeyboard$2 extends SuspendLambda implements p {
    final /* synthetic */ KeyboardLayoutView $keyboardLayoutViewLocal;
    final /* synthetic */ FrameLayout $rootViewLocal;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    @d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$showEmojisKeyboard$2$1", f = "DefaultKeyboardController.kt", l = {1372}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.keyboard.DefaultKeyboardController$showEmojisKeyboard$2$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultKeyboardController, keyboardLayoutView, frameLayout, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z3;
            int i4;
            Object f4 = a.f();
            int i5 = this.label;
            if (i5 == 0) {
                f.b(obj);
                if (defaultKeyboardController.f9873f.C() != KeyboardLayoutType.RECTANGLE) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int height = keyboardLayoutView.getHeight();
                if (!z3) {
                    i4 = keyboardLayoutView.getWidth();
                } else if (defaultKeyboardController.f9878h0 == 2 || defaultKeyboardController.E1()) {
                    i4 = (int) (((float) keyboardLayoutView.getWidth()) - (((float) keyboardLayoutView.getColumnWidth()) * 2.0f));
                } else {
                    i4 = keyboardLayoutView.getWidth();
                }
                if (defaultKeyboardController.f9906w.v()) {
                    defaultKeyboardController.f9906w.n(false);
                }
                DefaultKeyboardController defaultKeyboardController = defaultKeyboardController;
                this.label = 1;
                obj = defaultKeyboardController.b0(i4, height, this);
                if (obj == f4) {
                    return f4;
                }
            } else if (i5 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0537l lVar = (C0537l) obj;
            frameLayout.addView(lVar);
            defaultKeyboardController.f9897r = lVar;
            defaultKeyboardController.f9900s0 = Layer.EMOJI;
            return q.f14567a;
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$showEmojisKeyboard$2(DefaultKeyboardController defaultKeyboardController, KeyboardLayoutView keyboardLayoutView, FrameLayout frameLayout, c<? super DefaultKeyboardController$showEmojisKeyboard$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultKeyboardController;
        this.$keyboardLayoutViewLocal = keyboardLayoutView;
        this.$rootViewLocal = frameLayout;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$showEmojisKeyboard$2(this.this$0, this.$keyboardLayoutViewLocal, this.$rootViewLocal, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher o12 = this.this$0.f9865b;
            final DefaultKeyboardController defaultKeyboardController = this.this$0;
            final KeyboardLayoutView keyboardLayoutView = this.$keyboardLayoutViewLocal;
            final FrameLayout frameLayout = this.$rootViewLocal;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(o12, r12, this) == f4) {
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
        return ((DefaultKeyboardController$showEmojisKeyboard$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
