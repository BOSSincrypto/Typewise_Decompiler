package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import r0.f;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization", f = "TypewiseLMCapitalization.kt", l = {43}, m = "handleCasing")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TypewiseLMCapitalization$handleCasing$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f8056a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TypewiseLMCapitalization f8057b;

    /* renamed from: c  reason: collision with root package name */
    int f8058c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseLMCapitalization$handleCasing$1(TypewiseLMCapitalization typewiseLMCapitalization, c cVar) {
        super(cVar);
        this.f8057b = typewiseLMCapitalization;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8056a = obj;
        this.f8058c |= Integer.MIN_VALUE;
        return this.f8057b.m((f) null, (TextCase) null, (String) null, (String) null, (List) null, this);
    }
}
