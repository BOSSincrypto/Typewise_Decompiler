package ch.icoaching.typewise.autocorrection.resources;

import ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository;
import ch.icoaching.typewise.config.CompanyConfig;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion", f = "BlocklistDictionaryRepository.kt", l = {217}, m = "getHardBlocklistFromCorrectionConfig")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7894a;

    /* renamed from: b  reason: collision with root package name */
    Object f7895b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f7896c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BlocklistDictionaryRepository.Companion f7897d;

    /* renamed from: e  reason: collision with root package name */
    int f7898e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1(BlocklistDictionaryRepository.Companion companion, c cVar) {
        super(cVar);
        this.f7897d = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7896c = obj;
        this.f7898e |= Integer.MIN_VALUE;
        return this.f7897d.c((CompanyConfig.b) null, (String) null, (ch.icoaching.typewise.word_lists.c) null, this);
    }
}
