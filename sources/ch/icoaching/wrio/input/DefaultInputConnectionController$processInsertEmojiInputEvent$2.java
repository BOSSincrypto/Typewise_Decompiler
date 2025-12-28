package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.I;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processInsertEmojiInputEvent$2", f = "DefaultInputConnectionController.kt", l = {628}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processInsertEmojiInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.g $it;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    @d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processInsertEmojiInputEvent$2$1", f = "DefaultInputConnectionController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "", "<anonymous>", "(Lkotlinx/coroutines/D;)Z"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.input.DefaultInputConnectionController$processInsertEmojiInputEvent$2$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(E02, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                return kotlin.coroutines.jvm.internal.a.a(E02.requestCursorUpdates(1));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processInsertEmojiInputEvent$2(DefaultInputConnectionController.a.g gVar, DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processInsertEmojiInputEvent$2> cVar) {
        super(2, cVar);
        this.$it = gVar;
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        DefaultInputConnectionController$processInsertEmojiInputEvent$2 defaultInputConnectionController$processInsertEmojiInputEvent$2 = new DefaultInputConnectionController$processInsertEmojiInputEvent$2(this.$it, this.this$0, cVar);
        defaultInputConnectionController$processInsertEmojiInputEvent$2.L$0 = obj;
        return defaultInputConnectionController$processInsertEmojiInputEvent$2;
    }

    public final Object invokeSuspend(Object obj) {
        D d4;
        final InputConnection E02;
        String str;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            d4 = (D) this.L$0;
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "processInsertEmojiInputEvent() :: " + this.$it.a(), (Throwable) null, 4, (Object) null);
            E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            j L02 = this.this$0.f9662E;
            if (L02 == null) {
                return q.f14567a;
            }
            if (L02.b() != null) {
                Log.d(log, "DefaultInputConnectionController", "processInsertEmojiInputEvent() :: Not inserting an emoji into a numeric input field", (Throwable) null, 4, (Object) null);
                return q.f14567a;
            }
            String f5 = this.this$0.f9659B.f();
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            String a4 = this.$it.a();
            this.L$0 = d4;
            this.L$1 = E02;
            this.L$2 = f5;
            this.label = 1;
            if (K02.k(a4, this) == f4) {
                return f4;
            }
            str = f5;
        } else if (i4 == 1) {
            E02 = (InputConnection) this.L$1;
            d4 = (D) this.L$0;
            f.b(obj);
            str = (String) this.L$2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        D d5 = d4;
        E02.commitText(this.$it.a(), 1);
        I unused = C0739h.b(d5, this.this$0.f9665b, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 2, (Object) null);
        this.this$0.f9679p = SystemClock.elapsedRealtime();
        this.this$0.m0(new l(str, this.this$0.f9659B.f(), this.this$0.f9659B.g(), this.this$0.f9659B.i(), this.$it.a(), new OnContentChangeEventFlags(true, true, OnContentChangeEventFlags.TriggerEventType.EMOJI)));
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processInsertEmojiInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
