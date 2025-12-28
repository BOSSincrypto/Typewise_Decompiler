package ch.icoaching.typewise.autocorrection.resources;

import ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository;
import ch.icoaching.typewise.config.CompanyConfig;
import ch.icoaching.typewise.word_lists.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$2", f = "BlocklistDictionaryRepository.kt", l = {174, 175}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\"\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/D;", "Lkotlin/Pair;", "", "", "Lch/icoaching/typewise/text/Word;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
final class BlocklistDictionaryRepository$Companion$invoke$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    Object f7914a;

    /* renamed from: b  reason: collision with root package name */
    int f7915b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CompanyConfig.b f7916c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f7917d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f7918e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlocklistDictionaryRepository$Companion$invoke$2(CompanyConfig.b bVar, String str, c cVar, kotlin.coroutines.c cVar2) {
        super(2, cVar2);
        this.f7916c = bVar;
        this.f7917d = str;
        this.f7918e = cVar;
    }

    /* renamed from: a */
    public final Object invoke(D d4, kotlin.coroutines.c cVar) {
        return ((BlocklistDictionaryRepository$Companion$invoke$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new BlocklistDictionaryRepository$Companion$invoke$2(this.f7916c, this.f7917d, this.f7918e, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Set set;
        Object f4 = a.f();
        int i4 = this.f7915b;
        if (i4 == 0) {
            f.b(obj);
            BlocklistDictionaryRepository.Companion companion = BlocklistDictionaryRepository.f7890d;
            CompanyConfig.b bVar = this.f7916c;
            String str = this.f7917d;
            c cVar = this.f7918e;
            this.f7915b = 1;
            obj = companion.c(bVar, str, cVar, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else if (i4 == 2) {
            set = (Set) this.f7914a;
            f.b(obj);
            return new Pair(set, C0718m.G0((Iterable) obj, set));
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Set set2 = (Set) obj;
        BlocklistDictionaryRepository.Companion companion2 = BlocklistDictionaryRepository.f7890d;
        CompanyConfig.b bVar2 = this.f7916c;
        String str2 = this.f7917d;
        c cVar2 = this.f7918e;
        this.f7914a = set2;
        this.f7915b = 2;
        Object b4 = companion2.d(bVar2, str2, cVar2, this);
        if (b4 == f4) {
            return f4;
        }
        set = set2;
        obj = b4;
        return new Pair(set, C0718m.G0((Iterable) obj, set));
    }
}
