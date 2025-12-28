package ch.icoaching.typewise.autocorrection;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.AutocorrectionTFModel", f = "AutocorrectionTFModel.kt", l = {55}, m = "prediction")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AutocorrectionTFModel$prediction$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7861a;

    /* renamed from: b  reason: collision with root package name */
    Object f7862b;

    /* renamed from: c  reason: collision with root package name */
    Object f7863c;

    /* renamed from: d  reason: collision with root package name */
    Object f7864d;

    /* renamed from: e  reason: collision with root package name */
    int f7865e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f7866f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AutocorrectionTFModel f7867g;

    /* renamed from: h  reason: collision with root package name */
    int f7868h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutocorrectionTFModel$prediction$1(AutocorrectionTFModel autocorrectionTFModel, c cVar) {
        super(cVar);
        this.f7867g = autocorrectionTFModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7866f = obj;
        this.f7868h |= Integer.MIN_VALUE;
        return this.f7867g.a((Double[][]) null, this);
    }
}
