package kotlinx.coroutines.flow.internal;

import E2.b;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import u2.p;
import u2.q;

public abstract class FlowCoroutineKt {

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f14110a;

        public a(q qVar) {
            this.f14110a = qVar;
        }

        public Object a(d dVar, kotlin.coroutines.c cVar) {
            Object a4 = FlowCoroutineKt.a(new FlowCoroutineKt$scopedFlow$1$1(this.f14110a, dVar, (kotlin.coroutines.c<? super FlowCoroutineKt$scopedFlow$1$1>) null), cVar);
            if (a4 == kotlin.coroutines.intrinsics.a.f()) {
                return a4;
            }
            return l2.q.f14567a;
        }
    }

    public static final Object a(p pVar, kotlin.coroutines.c cVar) {
        g gVar = new g(cVar.getContext(), cVar);
        Object e4 = b.e(gVar, gVar, pVar);
        if (e4 == kotlin.coroutines.intrinsics.a.f()) {
            f.c(cVar);
        }
        return e4;
    }

    public static final c b(q qVar) {
        return new a(qVar);
    }
}
