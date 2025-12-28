package ch.icoaching.wrio.autocorrect.usecase;

import E0.t;
import android.view.inputmethod.CorrectionInfo;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.Z;
import ch.icoaching.wrio.autocorrect.AutocorrectFacade;
import ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase;
import ch.icoaching.wrio.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.o;
import kotlinx.coroutines.D;
import l2.q;
import r0.C0870b;
import u2.p;

@d(c = "ch.icoaching.wrio.autocorrect.usecase.GetCorrectionsUseCase$execute$2", f = "GetCorrectionsUseCase.kt", l = {29}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/autocorrect/usecase/GetCorrectionsUseCase$b;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/autocorrect/usecase/GetCorrectionsUseCase$b;"}, k = 3, mv = {2, 0, 0})
final class GetCorrectionsUseCase$execute$2 extends SuspendLambda implements p {
    final /* synthetic */ GetCorrectionsUseCase.a $request;
    int label;
    final /* synthetic */ GetCorrectionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetCorrectionsUseCase$execute$2(GetCorrectionsUseCase.a aVar, GetCorrectionsUseCase getCorrectionsUseCase, c<? super GetCorrectionsUseCase$execute$2> cVar) {
        super(2, cVar);
        this.$request = aVar;
        this.this$0 = getCorrectionsUseCase;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new GetCorrectionsUseCase$execute$2(this.$request, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int intValue;
        int i4;
        String str;
        int b4;
        String str2;
        Object f4 = a.f();
        int i5 = this.label;
        if (i5 == 0) {
            f.b(obj);
            Log.d(Log.f10572a, "GetCorrectionsUseCase", "doWork() :: '" + I.b(this.$request.e(), (Integer) null, 1, (Object) null) + '\'', (Throwable) null, 4, (Object) null);
            AutocorrectFacade a4 = this.this$0.f9319b;
            String e4 = this.$request.e();
            List f5 = this.$request.f();
            this.label = 1;
            obj2 = a4.b(e4, f5, this);
            if (obj2 == f4) {
                return f4;
            }
        } else if (i5 == 1) {
            try {
                f.b(obj);
                obj2 = obj;
            } catch (Exception e5) {
                Log.f10572a.e("GetCorrectionsUseCase", "doWork()", e5);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0870b bVar = (C0870b) obj2;
        if (bVar == null || (intValue = ((Number) bVar.d().get(0)).intValue()) <= 0) {
            return null;
        }
        if (intValue == 1) {
            b4 = this.$request.b();
            str2 = this.$request.a() + o.T0(bVar.c());
        } else if (intValue != 2) {
            str = "";
            i4 = 0;
            Log log = Log.f10572a;
            Log.d(log, "GetCorrectionsUseCase", "doWork() :: correctionOffset = " + i4 + ", correctionOldText = '" + str + '\'', (Throwable) null, 4, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append("doWork() :: '");
            sb.append(I.b(this.$request.e(), (Integer) null, 1, (Object) null));
            sb.append('\'');
            Log.d(log, "GetCorrectionsUseCase", sb.toString(), (Throwable) null, 4, (Object) null);
            String b5 = Z.b((String[]) o.t0(bVar.c(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]), bVar.a());
            t a5 = ch.icoaching.wrio.autocorrect.f.a(bVar.e(), bVar.c());
            return new GetCorrectionsUseCase.b(new CorrectionInfo(i4, str, b5), new ch.icoaching.wrio.autocorrect.d(i4 + ((Number) a5.b()).intValue(), (String) a5.a(), C0718m.O(bVar.b())));
        } else {
            b4 = this.$request.d();
            str2 = this.$request.c() + ' ' + this.$request.a() + o.T0(bVar.c());
        }
        String str3 = str2;
        i4 = b4;
        str = str3;
        Log log2 = Log.f10572a;
        Log.d(log2, "GetCorrectionsUseCase", "doWork() :: correctionOffset = " + i4 + ", correctionOldText = '" + str + '\'', (Throwable) null, 4, (Object) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("doWork() :: '");
        sb2.append(I.b(this.$request.e(), (Integer) null, 1, (Object) null));
        sb2.append('\'');
        Log.d(log2, "GetCorrectionsUseCase", sb2.toString(), (Throwable) null, 4, (Object) null);
        String b52 = Z.b((String[]) o.t0(bVar.c(), new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]), bVar.a());
        t a52 = ch.icoaching.wrio.autocorrect.f.a(bVar.e(), bVar.c());
        return new GetCorrectionsUseCase.b(new CorrectionInfo(i4, str, b52), new ch.icoaching.wrio.autocorrect.d(i4 + ((Number) a52.b()).intValue(), (String) a52.a(), C0718m.O(bVar.b())));
    }

    public final Object invoke(D d4, c<? super GetCorrectionsUseCase.b> cVar) {
        return ((GetCorrectionsUseCase$execute$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
