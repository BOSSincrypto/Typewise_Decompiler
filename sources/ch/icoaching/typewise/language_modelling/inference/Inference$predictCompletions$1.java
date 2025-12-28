package ch.icoaching.typewise.language_modelling.inference;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.Inference", f = "Inference.kt", l = {66, 67}, m = "predictCompletions$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Inference$predictCompletions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8379a;

    /* renamed from: b  reason: collision with root package name */
    Object f8380b;

    /* renamed from: c  reason: collision with root package name */
    Object f8381c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8382d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Inference f8383e;

    /* renamed from: f  reason: collision with root package name */
    int f8384f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Inference$predictCompletions$1(Inference inference, c cVar) {
        super(cVar);
        this.f8383e = inference;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8382d = obj;
        this.f8384f |= Integer.MIN_VALUE;
        return Inference.e(this.f8383e, (String) null, (String) null, (Float) null, (Integer) null, (String) null, this);
    }
}
