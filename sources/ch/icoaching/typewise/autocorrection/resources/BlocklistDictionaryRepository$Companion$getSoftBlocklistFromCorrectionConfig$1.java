package ch.icoaching.typewise.autocorrection.resources;

import ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository;
import ch.icoaching.typewise.config.CompanyConfig;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion", f = "BlocklistDictionaryRepository.kt", l = {199}, m = "getSoftBlocklistFromCorrectionConfig")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7899a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f7900b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BlocklistDictionaryRepository.Companion f7901c;

    /* renamed from: d  reason: collision with root package name */
    int f7902d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1(BlocklistDictionaryRepository.Companion companion, c cVar) {
        super(cVar);
        this.f7901c = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7900b = obj;
        this.f7902d |= Integer.MIN_VALUE;
        return this.f7901c.d((CompanyConfig.b) null, (String) null, (ch.icoaching.typewise.word_lists.c) null, this);
    }
}
