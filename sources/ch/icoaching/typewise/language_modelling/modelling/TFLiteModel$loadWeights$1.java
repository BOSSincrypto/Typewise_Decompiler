package ch.icoaching.typewise.language_modelling.modelling;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.TFLiteModel", f = "TFLiteModel.kt", l = {135}, m = "loadWeights")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TFLiteModel$loadWeights$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8709a;

    /* renamed from: b  reason: collision with root package name */
    Object f8710b;

    /* renamed from: c  reason: collision with root package name */
    Object f8711c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8712d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TFLiteModel f8713e;

    /* renamed from: f  reason: collision with root package name */
    int f8714f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TFLiteModel$loadWeights$1(TFLiteModel tFLiteModel, c cVar) {
        super(cVar);
        this.f8713e = tFLiteModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8712d = obj;
        this.f8714f |= Integer.MIN_VALUE;
        return this.f8713e.a((String) null, this);
    }
}
