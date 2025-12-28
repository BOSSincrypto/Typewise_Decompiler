package ch.icoaching.typewise.file_handling;

import ch.icoaching.typewise.file_handling.ConfigHolder;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import s0.C0892b;

@d(c = "ch.icoaching.typewise.file_handling.ConfigHolder$Companion", f = "ConfigHolder.kt", l = {355}, m = "invoke")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConfigHolder$Companion$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8252a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8253b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ConfigHolder.Companion f8254c;

    /* renamed from: d  reason: collision with root package name */
    int f8255d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigHolder$Companion$invoke$1(ConfigHolder.Companion companion, c cVar) {
        super(cVar);
        this.f8254c = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8253b = obj;
        this.f8255d |= Integer.MIN_VALUE;
        return this.f8254c.a((C0892b) null, (String) null, this);
    }
}
