package ch.icoaching.wrio.input;

import ch.icoaching.wrio.Z;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DeleteWordUseCase$deleteWord$2", f = "DeleteWordUseCase.kt", l = {51}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DeleteWordUseCase$deleteWord$2 extends SuspendLambda implements p {
    final /* synthetic */ String $word;
    int label;
    final /* synthetic */ DeleteWordUseCase this$0;

    @d(c = "ch.icoaching.wrio.input.DeleteWordUseCase$deleteWord$2$1", f = "DeleteWordUseCase.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.input.DeleteWordUseCase$deleteWord$2$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(deleteWordUseCase, lowerCase, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                deleteWordUseCase.f9739e.f7496f.c(lowerCase);
                deleteWordUseCase.f9739e.f7500j.a();
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeleteWordUseCase$deleteWord$2(DeleteWordUseCase deleteWordUseCase, String str, c<? super DeleteWordUseCase$deleteWord$2> cVar) {
        super(2, cVar);
        this.this$0 = deleteWordUseCase;
        this.$word = str;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DeleteWordUseCase$deleteWord$2(this.this$0, this.$word, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            this.this$0.f9738d.r(this.$word);
            Regex regex = new Regex("^[a-zA-Z'\\-]+$");
            String str = this.$word;
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            final String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String e4 = Z.e(lowerCase);
            if (!regex.matches(e4) || e4.length() < 2) {
                return q.f14567a;
            }
            CoroutineDispatcher f5 = this.this$0.f9736b;
            final DeleteWordUseCase deleteWordUseCase = this.this$0;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(f5, r32, this) == f4) {
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
        return ((DeleteWordUseCase$deleteWord$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
