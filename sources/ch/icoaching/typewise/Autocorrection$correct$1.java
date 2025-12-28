package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.Autocorrection", f = "Autocorrection.kt", l = {138}, m = "correct")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Autocorrection$correct$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7756a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f7757b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Autocorrection f7758c;

    /* renamed from: d  reason: collision with root package name */
    int f7759d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Autocorrection$correct$1(Autocorrection autocorrection, c cVar) {
        super(cVar);
        this.f7758c = autocorrection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7757b = obj;
        this.f7759d |= Integer.MIN_VALUE;
        return this.f7758c.f((String) null, (List) null, this);
    }
}
