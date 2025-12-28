package ch.icoaching.typewise;

import D0.e0;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import kotlinx.coroutines.sync.b;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.Predictions$destroy$2", f = "Predictions.kt", l = {577, 417}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class Predictions$destroy$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    Object f7805a;

    /* renamed from: b  reason: collision with root package name */
    Object f7806b;

    /* renamed from: c  reason: collision with root package name */
    int f7807c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predictions f7808d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$destroy$2(Predictions predictions, c cVar) {
        super(2, cVar);
        this.f7808d = predictions;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((Predictions$destroy$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new Predictions$destroy$2(this.f7808d, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        Predictions predictions;
        Predictions predictions2;
        Object f4 = a.f();
        int i4 = this.f7807c;
        if (i4 == 0) {
            f.b(obj);
            e eVar = e.f8233a;
            e.f(eVar, "Predictions", "Predictions destruction started.", (Throwable) null, 4, (Object) null);
            String b4 = this.f7808d.f7791j;
            e.b(eVar, "Predictions", "destroy() :: " + b4, (Throwable) null, 4, (Object) null);
            this.f7808d.f7792k = false;
            bVar = this.f7808d.f7793l;
            predictions2 = this.f7808d;
            this.f7805a = bVar;
            this.f7806b = predictions2;
            this.f7807c = 1;
            if (bVar.a((Object) null, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            predictions2 = (Predictions) this.f7806b;
            f.b(obj);
            bVar = (b) this.f7805a;
        } else if (i4 == 2) {
            predictions = (Predictions) this.f7806b;
            bVar2 = (b) this.f7805a;
            try {
                f.b(obj);
                predictions.f7786e = null;
                q qVar = q.f14567a;
                bVar2.b((Object) null);
                this.f7808d.f7790i.b();
                this.f7808d.f7791j = null;
                e.f(e.f8233a, "Predictions", "Predictions destruction done.", (Throwable) null, 4, (Object) null);
                return qVar;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            e0 m4 = predictions2.f7786e;
            if (m4 != null) {
                this.f7805a = bVar;
                this.f7806b = predictions2;
                this.f7807c = 2;
                if (m4.c(this) == f4) {
                    return f4;
                }
            }
            predictions = predictions2;
            bVar2 = bVar;
            predictions.f7786e = null;
            q qVar2 = q.f14567a;
            bVar2.b((Object) null);
            this.f7808d.f7790i.b();
            this.f7808d.f7791j = null;
            e.f(e.f8233a, "Predictions", "Predictions destruction done.", (Throwable) null, 4, (Object) null);
            return qVar2;
        } catch (Throwable th2) {
            th = th2;
            bVar.b((Object) null);
            throw th;
        }
    }
}
