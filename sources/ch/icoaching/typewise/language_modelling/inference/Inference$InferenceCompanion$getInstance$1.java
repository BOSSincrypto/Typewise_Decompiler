package ch.icoaching.typewise.language_modelling.inference;

import D0.Q;
import D0.h0;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion", f = "Inference.kt", l = {290}, m = "getInstance")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Inference$InferenceCompanion$getInstance$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8366a;

    /* renamed from: b  reason: collision with root package name */
    Object f8367b;

    /* renamed from: c  reason: collision with root package name */
    Object f8368c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8369d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Inference.InferenceCompanion f8370e;

    /* renamed from: f  reason: collision with root package name */
    int f8371f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Inference$InferenceCompanion$getInstance$1(Inference.InferenceCompanion inferenceCompanion, c cVar) {
        super(cVar);
        this.f8370e = inferenceCompanion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8369d = obj;
        this.f8371f |= Integer.MIN_VALUE;
        return this.f8370e.c((String) null, (h0) null, (ch.icoaching.typewise.word_lists.c) null, (Q) null, this);
    }
}
