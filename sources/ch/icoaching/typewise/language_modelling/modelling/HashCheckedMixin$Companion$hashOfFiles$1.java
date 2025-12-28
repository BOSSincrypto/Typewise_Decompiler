package ch.icoaching.typewise.language_modelling.modelling;

import ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion", f = "HashCheckedMixin.kt", l = {60}, m = "hashOfFiles")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HashCheckedMixin$Companion$hashOfFiles$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8640a;

    /* renamed from: b  reason: collision with root package name */
    Object f8641b;

    /* renamed from: c  reason: collision with root package name */
    Object f8642c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8643d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ HashCheckedMixin.Companion f8644e;

    /* renamed from: f  reason: collision with root package name */
    int f8645f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HashCheckedMixin$Companion$hashOfFiles$1(HashCheckedMixin.Companion companion, c cVar) {
        super(cVar);
        this.f8644e = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8643d = obj;
        this.f8645f |= Integer.MIN_VALUE;
        return this.f8644e.b((List) null, this);
    }
}
