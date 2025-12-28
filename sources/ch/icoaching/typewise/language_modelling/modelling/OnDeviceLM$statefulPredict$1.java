package ch.icoaching.typewise.language_modelling.modelling;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM", f = "OnDeviceLM.kt", l = {75}, m = "statefulPredict$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class OnDeviceLM$statefulPredict$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8683a;

    /* renamed from: b  reason: collision with root package name */
    Object f8684b;

    /* renamed from: c  reason: collision with root package name */
    Object f8685c;

    /* renamed from: d  reason: collision with root package name */
    Object f8686d;

    /* renamed from: e  reason: collision with root package name */
    Object f8687e;

    /* renamed from: f  reason: collision with root package name */
    Object f8688f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f8689g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ OnDeviceLM f8690h;

    /* renamed from: i  reason: collision with root package name */
    int f8691i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OnDeviceLM$statefulPredict$1(OnDeviceLM onDeviceLM, c cVar) {
        super(cVar);
        this.f8690h = onDeviceLM;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8689g = obj;
        this.f8691i |= Integer.MIN_VALUE;
        return OnDeviceLM.k(this.f8690h, (List) null, this);
    }
}
