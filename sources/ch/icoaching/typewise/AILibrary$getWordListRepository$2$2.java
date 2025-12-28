package ch.icoaching.typewise;

import ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader;
import ch.icoaching.typewise.word_lists.WordListKind;
import ch.icoaching.typewise.word_lists.WordListRepository;
import ch.icoaching.typewise.word_lists.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.l;
import u2.p;

@d(c = "ch.icoaching.typewise.AILibrary$getWordListRepository$2$2", f = "AILibrary.kt", l = {81}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/typewise/word_lists/WordListRepository;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/typewise/word_lists/WordListRepository;"}, k = 3, mv = {2, 0, 0})
final class AILibrary$getWordListRepository$2$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f7718a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AILibrary f7719b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f7720c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f7721d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b f7722e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l f7723f;

    public static final class a implements WordListRepository.a {
        a() {
        }

        public Object a(String str, WordListKind wordListKind, c cVar) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrary$getWordListRepository$2$2(AILibrary aILibrary, List list, b bVar, b bVar2, l lVar, c cVar) {
        super(2, cVar);
        this.f7719b = aILibrary;
        this.f7720c = list;
        this.f7721d = bVar;
        this.f7722e = bVar2;
        this.f7723f = lVar;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((AILibrary$getWordListRepository$2$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new AILibrary$getWordListRepository$2$2(this.f7719b, this.f7720c, this.f7721d, this.f7722e, this.f7723f, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = kotlin.coroutines.intrinsics.a.f();
        int i4 = this.f7718a;
        if (i4 == 0) {
            f.b(obj);
            DBSupportedWordListDataLoader dBSupportedWordListDataLoader = new DBSupportedWordListDataLoader(this.f7719b.d(), this.f7720c, this.f7721d, this.f7722e, this.f7723f);
            a aVar = new a();
            WordListRepository.Companion companion = WordListRepository.f8894h;
            this.f7718a = 1;
            obj = companion.b(dBSupportedWordListDataLoader, aVar, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        WordListRepository wordListRepository = (WordListRepository) obj;
        wordListRepository.p(this.f7719b.i().f());
        return wordListRepository;
    }
}
