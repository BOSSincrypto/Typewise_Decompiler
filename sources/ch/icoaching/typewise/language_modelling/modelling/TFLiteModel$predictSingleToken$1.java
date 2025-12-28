package ch.icoaching.typewise.language_modelling.modelling;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.TFLiteModel", f = "TFLiteModel.kt", l = {135}, m = "predictSingleToken")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TFLiteModel$predictSingleToken$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8715a;

    /* renamed from: b  reason: collision with root package name */
    Object f8716b;

    /* renamed from: c  reason: collision with root package name */
    Object f8717c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8718d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ TFLiteModel f8719e;

    /* renamed from: f  reason: collision with root package name */
    int f8720f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TFLiteModel$predictSingleToken$1(TFLiteModel tFLiteModel, c cVar) {
        super(cVar);
        this.f8719e = tFLiteModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8718d = obj;
        this.f8720f |= Integer.MIN_VALUE;
        return this.f8719e.l((List) null, this);
    }
}
