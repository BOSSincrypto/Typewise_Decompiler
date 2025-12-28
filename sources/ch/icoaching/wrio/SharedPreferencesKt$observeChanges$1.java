package ch.icoaching.wrio;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.n;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.SharedPreferencesKt$observeChanges$1", f = "SharedPreferences.kt", l = {14}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/n;", "", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/channels/n;)V"}, k = 3, mv = {2, 0, 0})
final class SharedPreferencesKt$observeChanges$1 extends SuspendLambda implements p {
    final /* synthetic */ SharedPreferences $this_observeChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPreferencesKt$observeChanges$1(SharedPreferences sharedPreferences, c<? super SharedPreferencesKt$observeChanges$1> cVar) {
        super(2, cVar);
        this.$this_observeChanges = sharedPreferences;
    }

    /* access modifiers changed from: private */
    public static final void g(n nVar, SharedPreferences sharedPreferences, String str) {
        nVar.k(str);
    }

    /* access modifiers changed from: private */
    public static final q h(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return q.f14567a;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        SharedPreferencesKt$observeChanges$1 sharedPreferencesKt$observeChanges$1 = new SharedPreferencesKt$observeChanges$1(this.$this_observeChanges, cVar);
        sharedPreferencesKt$observeChanges$1.L$0 = obj;
        return sharedPreferencesKt$observeChanges$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            n nVar = (n) this.L$0;
            G g4 = new G(nVar);
            this.$this_observeChanges.registerOnSharedPreferenceChangeListener(g4);
            H h4 = new H(this.$this_observeChanges, g4);
            this.label = 1;
            if (ProduceKt.a(nVar, h4, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(n nVar, c<? super q> cVar) {
        return ((SharedPreferencesKt$observeChanges$1) create(nVar, cVar)).invokeSuspend(q.f14567a);
    }
}
