package ch.icoaching.wrio.keyboard;

import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.j;
import ch.icoaching.wrio.logging.Log;
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

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$updateAutoCapsFromInputConnection$1", f = "DefaultKeyboardController.kt", l = {1613}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$updateAutoCapsFromInputConnection$1 extends SuspendLambda implements p {
    final /* synthetic */ InputConnection $inputConnectionLocal;
    final /* synthetic */ j $inputSessionLocal;
    Object L$0;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    @d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$updateAutoCapsFromInputConnection$1$1", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/keyboard/KeyCase;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/keyboard/KeyCase;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.keyboard.DefaultKeyboardController$updateAutoCapsFromInputConnection$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(inputConnection, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                if (inputConnection.getCursorCapsMode(16384) != 0) {
                    return KeyCase.UPPERCASE;
                }
                return KeyCase.LOWERCASE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super KeyCase> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$updateAutoCapsFromInputConnection$1(DefaultKeyboardController defaultKeyboardController, j jVar, InputConnection inputConnection, c<? super DefaultKeyboardController$updateAutoCapsFromInputConnection$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultKeyboardController;
        this.$inputSessionLocal = jVar;
        this.$inputConnectionLocal = inputConnection;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$updateAutoCapsFromInputConnection$1(this.this$0, this.$inputSessionLocal, this.$inputConnectionLocal, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        DefaultKeyboardController defaultKeyboardController;
        KeyCase keyCase;
        DefaultKeyboardController defaultKeyboardController2;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            defaultKeyboardController = this.this$0;
            if (this.$inputSessionLocal.d()) {
                Log.d(Log.f10572a, "DefaultKeyboardController", "updateAutoCaps() :: Case 1", (Throwable) null, 4, (Object) null);
                CoroutineDispatcher c12 = this.this$0.f9867c;
                final InputConnection inputConnection = this.$inputConnectionLocal;
                AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
                this.L$0 = defaultKeyboardController;
                this.label = 1;
                Object e4 = C0738g.e(c12, r32, this);
                if (e4 == f4) {
                    return f4;
                }
                defaultKeyboardController2 = defaultKeyboardController;
                obj = e4;
            } else {
                Log.d(Log.f10572a, "DefaultKeyboardController", "updateAutoCaps() :: Case 2", (Throwable) null, 4, (Object) null);
                keyCase = KeyCase.LOWERCASE;
                defaultKeyboardController.y0(keyCase);
                return q.f14567a;
            }
        } else if (i4 == 1) {
            defaultKeyboardController2 = (DefaultKeyboardController) this.L$0;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DefaultKeyboardController defaultKeyboardController3 = defaultKeyboardController2;
        keyCase = (KeyCase) obj;
        defaultKeyboardController = defaultKeyboardController3;
        defaultKeyboardController.y0(keyCase);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultKeyboardController$updateAutoCapsFromInputConnection$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
