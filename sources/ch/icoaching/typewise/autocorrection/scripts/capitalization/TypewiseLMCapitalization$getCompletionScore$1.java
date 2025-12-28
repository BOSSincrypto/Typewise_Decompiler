package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization", f = "TypewiseLMCapitalization.kt", l = {102}, m = "getCompletionScore$typewise_autocorrect_library_3_0_19_161__release")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TypewiseLMCapitalization$getCompletionScore$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f8053a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TypewiseLMCapitalization f8054b;

    /* renamed from: c  reason: collision with root package name */
    int f8055c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseLMCapitalization$getCompletionScore$1(TypewiseLMCapitalization typewiseLMCapitalization, c cVar) {
        super(cVar);
        this.f8054b = typewiseLMCapitalization;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8053a = obj;
        this.f8055c |= Integer.MIN_VALUE;
        return this.f8054b.r((String) null, (String) null, this);
    }
}
