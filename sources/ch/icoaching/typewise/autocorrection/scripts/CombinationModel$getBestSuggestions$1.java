package ch.icoaching.typewise.autocorrection.scripts;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.CombinationModel", f = "CombinationModel.kt", l = {77}, m = "getBestSuggestions")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CombinationModel$getBestSuggestions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7931a;

    /* renamed from: b  reason: collision with root package name */
    Object f7932b;

    /* renamed from: c  reason: collision with root package name */
    Object f7933c;

    /* renamed from: d  reason: collision with root package name */
    Object f7934d;

    /* renamed from: e  reason: collision with root package name */
    Object f7935e;

    /* renamed from: f  reason: collision with root package name */
    float f7936f;

    /* renamed from: g  reason: collision with root package name */
    int f7937g;

    /* renamed from: h  reason: collision with root package name */
    /* synthetic */ Object f7938h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ CombinationModel f7939i;

    /* renamed from: j  reason: collision with root package name */
    int f7940j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CombinationModel$getBestSuggestions$1(CombinationModel combinationModel, c cVar) {
        super(cVar);
        this.f7939i = combinationModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7938h = obj;
        this.f7940j |= Integer.MIN_VALUE;
        return this.f7939i.c((List) null, (List) null, (List) null, (List) null, 0.0f, 0, this);
    }
}
