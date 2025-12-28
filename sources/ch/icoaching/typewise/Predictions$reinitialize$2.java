package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.sync.b;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.Predictions$reinitialize$2", f = "Predictions.kt", l = {577, 74}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class Predictions$reinitialize$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    Object f7843a;

    /* renamed from: b  reason: collision with root package name */
    Object f7844b;

    /* renamed from: c  reason: collision with root package name */
    Object f7845c;

    /* renamed from: d  reason: collision with root package name */
    Object f7846d;

    /* renamed from: e  reason: collision with root package name */
    Object f7847e;

    /* renamed from: f  reason: collision with root package name */
    int f7848f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f7849g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ List f7850h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ List f7851i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Predictions f7852j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$reinitialize$2(String str, List list, List list2, Predictions predictions, c cVar) {
        super(2, cVar);
        this.f7849g = str;
        this.f7850h = list;
        this.f7851i = list2;
        this.f7852j = predictions;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((Predictions$reinitialize$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new Predictions$reinitialize$2(this.f7849g, this.f7850h, this.f7851i, this.f7852j, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        Predictions predictions;
        String str;
        List list;
        List list2;
        String str2;
        Object f4 = a.f();
        int i4 = this.f7848f;
        if (i4 == 0) {
            f.b(obj);
            e eVar = e.f8233a;
            e.f(eVar, "Predictions", "Predictions (re)initialization started.", (Throwable) null, 4, (Object) null);
            String str3 = this.f7849g;
            List list3 = this.f7850h;
            List list4 = this.f7851i;
            e.b(eVar, "Predictions", "reinitialize() :: " + str3 + " | " + list3 + " | " + list4, (Throwable) null, 4, (Object) null);
            b l4 = this.f7852j.f7793l;
            Predictions predictions2 = this.f7852j;
            str2 = this.f7849g;
            list2 = this.f7850h;
            list = this.f7851i;
            this.f7843a = l4;
            this.f7844b = predictions2;
            this.f7845c = str2;
            this.f7846d = list2;
            this.f7847e = list;
            this.f7848f = 1;
            if (l4.a((Object) null, this) == f4) {
                return f4;
            }
            Predictions predictions3 = predictions2;
            bVar = l4;
            predictions = predictions3;
        } else if (i4 == 1) {
            str2 = (String) this.f7845c;
            f.b(obj);
            b bVar3 = (b) this.f7843a;
            list = (List) this.f7847e;
            predictions = (Predictions) this.f7844b;
            list2 = (List) this.f7846d;
            bVar = bVar3;
        } else if (i4 == 2) {
            str = (String) this.f7845c;
            predictions = (Predictions) this.f7844b;
            bVar2 = (b) this.f7843a;
            try {
                f.b(obj);
                predictions.f7791j = str;
                predictions.f7792k = true;
                q qVar = q.f14567a;
                bVar2.b((Object) null);
                e.f(e.f8233a, "Predictions", "Predictions (re)initialization done.", (Throwable) null, 4, (Object) null);
                return qVar;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            if (predictions.f7792k) {
                if (!o.a(predictions.f7791j, str2)) {
                }
                bVar2 = bVar;
                str = str2;
                predictions.f7791j = str;
                predictions.f7792k = true;
                q qVar2 = q.f14567a;
                bVar2.b((Object) null);
                e.f(e.f8233a, "Predictions", "Predictions (re)initialization done.", (Throwable) null, 4, (Object) null);
                return qVar2;
            }
            this.f7843a = bVar;
            this.f7844b = predictions;
            this.f7845c = str2;
            this.f7846d = null;
            this.f7847e = null;
            this.f7848f = 2;
            if (predictions.y(str2, list2, list, this) == f4) {
                return f4;
            }
            bVar2 = bVar;
            str = str2;
            predictions.f7791j = str;
            predictions.f7792k = true;
            q qVar22 = q.f14567a;
            bVar2.b((Object) null);
            e.f(e.f8233a, "Predictions", "Predictions (re)initialization done.", (Throwable) null, 4, (Object) null);
            return qVar22;
        } catch (Throwable th2) {
            th = th2;
            bVar.b((Object) null);
            throw th;
        }
    }
}
