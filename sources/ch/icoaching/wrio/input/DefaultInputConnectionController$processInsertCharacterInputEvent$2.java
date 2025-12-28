package ch.icoaching.wrio.input;

import android.graphics.PointF;
import android.os.SystemClock;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.util.b;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processInsertCharacterInputEvent$2", f = "DefaultInputConnectionController.kt", l = {592}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processInsertCharacterInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.f $it;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processInsertCharacterInputEvent$2(DefaultInputConnectionController.a.f fVar, DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processInsertCharacterInputEvent$2> cVar) {
        super(2, cVar);
        this.$it = fVar;
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processInsertCharacterInputEvent$2(this.$it, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        InputConnection inputConnection;
        j jVar;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "processInsertCharacterInputEvent() :: " + this.$it.a() + " | " + this.$it.b(), (Throwable) null, 4, (Object) null);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            j L02 = this.this$0.f9662E;
            if (L02 == null) {
                return q.f14567a;
            }
            EditorInfo o02 = this.this$0.f9663F;
            if (o02 == null) {
                return q.f14567a;
            }
            int a4 = b.a(o02);
            Log.d(log, "DefaultInputConnectionController", "processInsertCharacterInputEvent() :: " + o02.imeOptions + " | " + a4, (Throwable) null, 4, (Object) null);
            if (this.$it.a() != 10 || a4 == 1) {
                String f5 = this.this$0.f9659B.f();
                NumberInputType b4 = L02.b();
                if (b4 == null || k.d(b4, this.$it.a(), this.this$0.f9659B.i(), f5)) {
                    if (this.this$0.f9677n == null) {
                        this.this$0.f9677n = f5;
                    }
                    this.this$0.f9678o = String.valueOf(this.$it.a());
                    DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
                    char a5 = this.$it.a();
                    PointF b5 = this.$it.b();
                    this.L$0 = E02;
                    this.L$1 = L02;
                    this.label = 1;
                    if (K02.j(a5, b5, this) == f4) {
                        return f4;
                    }
                    inputConnection = E02;
                    jVar = L02;
                } else {
                    Log.d(log, "DefaultInputConnectionController", "processInsertCharacterInputEvent() :: Not inserting a not allowed character " + this.$it.a() + " in a numeric input field of type " + L02.b(), (Throwable) null, 4, (Object) null);
                    return q.f14567a;
                }
            } else {
                Log.d(log, "DefaultInputConnectionController", "processInsertCharacterInputEvent() :: Handle '" + this.$it.a() + "' as IME_ACTION " + a4, (Throwable) null, 4, (Object) null);
                E02.performEditorAction(a4);
                this.this$0.f9679p = SystemClock.elapsedRealtime();
                return q.f14567a;
            }
        } else if (i4 == 1) {
            jVar = (j) this.L$1;
            inputConnection = (InputConnection) this.L$0;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f9679p = SystemClock.elapsedRealtime();
        if (jVar.e()) {
            this.this$0.f0(inputConnection, this.$it.a());
        } else if (Character.isDigit(this.$it.a())) {
            this.this$0.f0(inputConnection, this.$it.a());
        } else {
            kotlin.coroutines.jvm.internal.a.a(inputConnection.commitText(String.valueOf(this.$it.a()), 1));
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processInsertCharacterInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
