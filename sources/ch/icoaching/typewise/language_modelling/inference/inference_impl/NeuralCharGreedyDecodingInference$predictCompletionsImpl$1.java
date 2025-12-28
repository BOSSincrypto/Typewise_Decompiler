package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference", f = "NeuralCharGreedyDecodingInference.kt", l = {122, 171}, m = "predictCompletionsImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class NeuralCharGreedyDecodingInference$predictCompletionsImpl$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8545a;

    /* renamed from: b  reason: collision with root package name */
    Object f8546b;

    /* renamed from: c  reason: collision with root package name */
    Object f8547c;

    /* renamed from: d  reason: collision with root package name */
    Object f8548d;

    /* renamed from: e  reason: collision with root package name */
    Object f8549e;

    /* renamed from: f  reason: collision with root package name */
    Object f8550f;

    /* renamed from: g  reason: collision with root package name */
    Object f8551g;

    /* renamed from: h  reason: collision with root package name */
    int f8552h;

    /* renamed from: i  reason: collision with root package name */
    int f8553i;

    /* renamed from: j  reason: collision with root package name */
    int f8554j;

    /* renamed from: k  reason: collision with root package name */
    int f8555k;

    /* renamed from: l  reason: collision with root package name */
    /* synthetic */ Object f8556l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ NeuralCharGreedyDecodingInference f8557m;

    /* renamed from: n  reason: collision with root package name */
    int f8558n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NeuralCharGreedyDecodingInference$predictCompletionsImpl$1(NeuralCharGreedyDecodingInference neuralCharGreedyDecodingInference, c cVar) {
        super(cVar);
        this.f8557m = neuralCharGreedyDecodingInference;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8556l = obj;
        this.f8558n |= Integer.MIN_VALUE;
        return this.f8557m.b((String) null, (String) null, (Float) null, (Integer) null, (String) null, this);
    }
}
