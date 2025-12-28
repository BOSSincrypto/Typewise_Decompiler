package ch.icoaching.typewise.language_modelling.modelling;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin", f = "HashCheckedMixin.kt", l = {28}, m = "hashCheckFiles")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HashCheckedMixin$hashCheckFiles$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8646a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8647b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HashCheckedMixin f8648c;

    /* renamed from: d  reason: collision with root package name */
    int f8649d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HashCheckedMixin$hashCheckFiles$1(HashCheckedMixin hashCheckedMixin, c cVar) {
        super(cVar);
        this.f8648c = hashCheckedMixin;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8647b = obj;
        this.f8649d |= Integer.MIN_VALUE;
        return this.f8648c.a(this);
    }
}
