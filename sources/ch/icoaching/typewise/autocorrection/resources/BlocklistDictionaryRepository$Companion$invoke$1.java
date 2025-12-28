package ch.icoaching.typewise.autocorrection.resources;

import ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository;
import ch.icoaching.typewise.config.CompanyConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineDispatcher;

@d(c = "ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion", f = "BlocklistDictionaryRepository.kt", l = {173}, m = "invoke")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BlocklistDictionaryRepository$Companion$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7903a;

    /* renamed from: b  reason: collision with root package name */
    Object f7904b;

    /* renamed from: c  reason: collision with root package name */
    Object f7905c;

    /* renamed from: d  reason: collision with root package name */
    Object f7906d;

    /* renamed from: e  reason: collision with root package name */
    Object f7907e;

    /* renamed from: f  reason: collision with root package name */
    Object f7908f;

    /* renamed from: g  reason: collision with root package name */
    Object f7909g;

    /* renamed from: h  reason: collision with root package name */
    Object f7910h;

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ Object f7911i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ BlocklistDictionaryRepository.Companion f7912j;

    /* renamed from: k  reason: collision with root package name */
    int f7913k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlocklistDictionaryRepository$Companion$invoke$1(BlocklistDictionaryRepository.Companion companion, c cVar) {
        super(cVar);
        this.f7912j = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7911i = obj;
        this.f7913k |= Integer.MIN_VALUE;
        return this.f7912j.e((IDictionaryRepository) null, (ch.icoaching.typewise.word_lists.c) null, (CoroutineDispatcher) null, (List) null, (CompanyConfig.b) null, this);
    }
}
