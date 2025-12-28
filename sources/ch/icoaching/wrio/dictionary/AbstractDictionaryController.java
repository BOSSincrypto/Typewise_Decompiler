package ch.icoaching.wrio.dictionary;

import android.content.Context;
import android.os.SystemClock;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import ch.icoaching.wrio.data.h;
import ch.icoaching.wrio.logging.Log;
import i2.C0680a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.g0;
import l2.q;
import u2.p;

public abstract class AbstractDictionaryController implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9579a;

    /* renamed from: b  reason: collision with root package name */
    private final h f9580b;

    /* renamed from: c  reason: collision with root package name */
    private final D f9581c;

    /* renamed from: d  reason: collision with root package name */
    private long f9582d = Long.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private g0 f9583e;

    @d(c = "ch.icoaching.wrio.dictionary.AbstractDictionaryController$1", f = "AbstractDictionaryController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.dictionary.AbstractDictionaryController$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractDictionaryController this$0;

        {
            this.this$0 = r1;
        }

        public final c<q> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                String str = (String) this.L$0;
                if (o.a(str, "langs") || (str != null && kotlin.text.o.G(str, "lang_config", false, 2, (Object) null))) {
                    Log.d(Log.f10572a, "AbstractDictionaryController", "Detected change in languages. Try loading new languages.", (Throwable) null, 4, (Object) null);
                    this.this$0.c(0, TimeUnit.MILLISECONDS, ExistingWorkPolicy.REPLACE);
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, c<? super q> cVar) {
            return ((AnonymousClass1) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    public AbstractDictionaryController(Context context, h hVar, D d4, C0680a aVar) {
        o.e(context, "applicationContext");
        o.e(hVar, "dictionarySettings");
        o.e(d4, "applicationCoroutineScope");
        o.e(aVar, "defaultSharedPreferences");
        this.f9579a = context;
        this.f9580b = hVar;
        this.f9581c = d4;
        e.j(e.k(aVar.J0(), new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), d4);
    }

    /* access modifiers changed from: private */
    public final void c(long j4, TimeUnit timeUnit, ExistingWorkPolicy existingWorkPolicy) {
        if (SystemClock.elapsedRealtime() >= this.f9582d + 3000) {
            this.f9582d = SystemClock.elapsedRealtime();
            f(j4, timeUnit, existingWorkPolicy);
        }
    }

    public void b() {
        Log.d(Log.f10572a, "AbstractDictionaryController", "onCreate()", (Throwable) null, 4, (Object) null);
        g0 g0Var = this.f9583e;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f9583e = C0739h.d(this.f9581c, (CoroutineContext) null, (CoroutineStart) null, new AbstractDictionaryController$onCreate$1(this, (c<? super AbstractDictionaryController$onCreate$1>) null), 3, (Object) null);
        if (this.f9580b.a()) {
            WorkManager g4 = WorkManager.g(this.f9579a);
            o.d(g4, "getInstance(...)");
            DictionaryIntegrityCheckerWorker.f9584o.a(g4);
        }
    }

    public void e() {
        Log.d(Log.f10572a, "AbstractDictionaryController", "onDestroy()", (Throwable) null, 4, (Object) null);
        g0 g0Var = this.f9583e;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
