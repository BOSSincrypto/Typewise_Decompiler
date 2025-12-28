package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase", f = "CapitalizationBase.kt", l = {152, 155}, m = "autoCapsImplementation$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CapitalizationBase$autoCapsImplementation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8008a;

    /* renamed from: b  reason: collision with root package name */
    Object f8009b;

    /* renamed from: c  reason: collision with root package name */
    Object f8010c;

    /* renamed from: d  reason: collision with root package name */
    Object f8011d;

    /* renamed from: e  reason: collision with root package name */
    Object f8012e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f8013f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ CapitalizationBase f8014g;

    /* renamed from: h  reason: collision with root package name */
    int f8015h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CapitalizationBase$autoCapsImplementation$1(CapitalizationBase capitalizationBase, c cVar) {
        super(cVar);
        this.f8014g = capitalizationBase;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8013f = obj;
        this.f8015h |= Integer.MIN_VALUE;
        return CapitalizationBase.h(this.f8014g, (String) null, (TextCase) null, (String) null, (String) null, this);
    }
}
