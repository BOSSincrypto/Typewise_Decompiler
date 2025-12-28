package ch.icoaching.typewise.file_handling;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.file_handling.ConfigHolder", f = "ConfigHolder.kt", l = {141, 145, 167}, m = "load")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConfigHolder$load$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8256a;

    /* renamed from: b  reason: collision with root package name */
    Object f8257b;

    /* renamed from: c  reason: collision with root package name */
    Object f8258c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8259d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ConfigHolder f8260e;

    /* renamed from: f  reason: collision with root package name */
    int f8261f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigHolder$load$1(ConfigHolder configHolder, c cVar) {
        super(cVar);
        this.f8260e = configHolder;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8259d = obj;
        this.f8261f |= Integer.MIN_VALUE;
        return this.f8260e.h(this);
    }
}
