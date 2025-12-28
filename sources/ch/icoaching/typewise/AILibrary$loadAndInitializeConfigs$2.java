package ch.icoaching.typewise;

import ch.icoaching.typewise.file_handling.ConfigHolder;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import s0.C0892b;
import u2.p;

@d(c = "ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$2", f = "AILibrary.kt", l = {112}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/typewise/file_handling/ConfigHolder;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/typewise/file_handling/ConfigHolder;"}, k = 3, mv = {2, 0, 0})
final class AILibrary$loadAndInitializeConfigs$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f7732a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AILibrary f7733b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrary$loadAndInitializeConfigs$2(AILibrary aILibrary, c cVar) {
        super(2, cVar);
        this.f7733b = aILibrary;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((AILibrary$loadAndInitializeConfigs$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new AILibrary$loadAndInitializeConfigs$2(this.f7733b, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.f7732a;
        if (i4 == 0) {
            f.b(obj);
            ConfigHolder.Companion companion = ConfigHolder.f8239m;
            C0892b g4 = this.f7733b.f7703e;
            if (g4 == null) {
                o.p("_globalLibraryConfig");
                g4 = null;
            }
            this.f7732a = 1;
            obj = companion.a(g4, "resources", this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
