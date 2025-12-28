package ch.icoaching.typewise.word_lists;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$wordToEntry$1", f = "DBSupportedWordListDataLoader.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/D;", "", "", "Lch/icoaching/typewise/word_lists/d;", "<anonymous>", "(Lkotlinx/coroutines/D;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
final class DBSupportedWordListDataLoader$loadWordList$wordToEntry$1 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f8889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DBSupportedWordListDataLoader f8890b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f8891c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DBSupportedWordListDataLoader$loadWordList$wordToEntry$1(DBSupportedWordListDataLoader dBSupportedWordListDataLoader, e eVar, c cVar) {
        super(2, cVar);
        this.f8890b = dBSupportedWordListDataLoader;
        this.f8891c = eVar;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((DBSupportedWordListDataLoader$loadWordList$wordToEntry$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new DBSupportedWordListDataLoader$loadWordList$wordToEntry$1(this.f8890b, this.f8891c, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.f8889a == 0) {
            f.b(obj);
            Iterable iterable = (Iterable) this.f8890b.f8883e.invoke(this.f8891c.b());
            LinkedHashMap linkedHashMap = new LinkedHashMap(z2.d.b(kotlin.collections.D.e(C0718m.t(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(next, new d(0, false, false, false, (String) next));
            }
            return linkedHashMap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
