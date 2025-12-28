package ch.icoaching.typewise.language_modelling.modelling;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.TFLiteModel", f = "TFLiteModel.kt", l = {135}, m = "destroy")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TFLiteModel$destroy$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8704a;

    /* renamed from: b  reason: collision with root package name */
    Object f8705b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8706c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TFLiteModel f8707d;

    /* renamed from: e  reason: collision with root package name */
    int f8708e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TFLiteModel$destroy$1(TFLiteModel tFLiteModel, c cVar) {
        super(cVar);
        this.f8707d = tFLiteModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8706c = obj;
        this.f8708e |= Integer.MIN_VALUE;
        return this.f8707d.b(this);
    }
}
