package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import ch.icoaching.wrio.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processShortcut$2", f = "DefaultInputConnectionController.kt", l = {463}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "", "<anonymous>", "(Lkotlinx/coroutines/D;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processShortcut$2 extends SuspendLambda implements p {
    final /* synthetic */ String $replacement;
    final /* synthetic */ String $shortcut;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processShortcut$2(DefaultInputConnectionController defaultInputConnectionController, String str, String str2, c<? super DefaultInputConnectionController$processShortcut$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$shortcut = str;
        this.$replacement = str2;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processShortcut$2(this.this$0, this.$shortcut, this.$replacement, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        InputConnection E02;
        String f4;
        int i4;
        Object f5 = a.f();
        int i5 = this.label;
        if (i5 == 0) {
            f.b(obj);
            E02 = this.this$0.f9661D;
            if (E02 == null) {
                return this.this$0.f9659B.f();
            }
            this.this$0.f9685v = SystemClock.elapsedRealtime();
            f4 = this.this$0.f9659B.f();
            int i6 = this.this$0.f9659B.i();
            int h4 = this.this$0.f9659B.h();
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "processShortcut() :: FROM: '" + this.$shortcut + "' | '" + this.$replacement + "' | '" + I.a(f4, kotlin.coroutines.jvm.internal.a.d(h4)) + "' | " + h4, (Throwable) null, 4, (Object) null);
            this.this$0.f9679p = SystemClock.elapsedRealtime();
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            String str = this.$shortcut;
            String str2 = this.$replacement;
            this.L$0 = E02;
            this.L$1 = f4;
            this.I$0 = i6;
            this.label = 1;
            if (K02.o(str, str2, this) == f5) {
                return f5;
            }
            i4 = i6;
        } else if (i5 == 1) {
            i4 = this.I$0;
            f4 = (String) this.L$1;
            E02 = (InputConnection) this.L$0;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = f4;
        String f6 = this.this$0.f9659B.f();
        List g4 = this.this$0.f9659B.g();
        int h5 = this.this$0.f9659B.h();
        Log log2 = Log.f10572a;
        Log.d(log2, "DefaultInputConnectionController", "processShortcut() :: TO: '" + I.a(f6, kotlin.coroutines.jvm.internal.a.d(h5)) + "' | " + this.this$0.f9659B.i() + " | " + h5, (Throwable) null, 4, (Object) null);
        String str4 = this.$shortcut;
        f.i(E02, i4, str4, this.$replacement, i4 - (str4.length() + 1));
        this.this$0.m0(new l(str3, f6, g4, this.this$0.f9659B.i(), this.$replacement, new OnContentChangeEventFlags(false, false, OnContentChangeEventFlags.TriggerEventType.AUTOCORRECTION)));
        return f6;
    }

    public final Object invoke(D d4, c<? super String> cVar) {
        return ((DefaultInputConnectionController$processShortcut$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
