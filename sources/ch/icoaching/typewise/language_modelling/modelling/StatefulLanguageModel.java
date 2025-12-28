package ch.icoaching.typewise.language_modelling.modelling;

import D0.E;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public abstract class StatefulLanguageModel extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatefulLanguageModel(String str, String str2) {
        super(str, str2);
        o.e(str, "kind");
        o.e(str2, "uniqueIdentifier");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object h(ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r4, D0.E r5, java.util.List r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel$statefulPredictWrapper$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel$statefulPredictWrapper$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel$statefulPredictWrapper$1) r0
            int r1 = r0.f8694c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8694c = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel$statefulPredictWrapper$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel$statefulPredictWrapper$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8692a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8694c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r7)
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.f.b(r7)
            D0.E r5 = D0.J.p(r5)
            java.util.List r5 = kotlin.collections.C0718m.e(r5)
            java.util.List r5 = kotlin.collections.C0718m.i0(r5, r6)
            r0.f8694c = r3
            java.lang.Object r7 = r4.i(r5, r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.util.List r7 = (java.util.List) r7
            r4 = 0
            java.lang.Object r4 = r7.get(r4)
            D0.E r4 = (D0.E) r4
            r5 = 2
            r6 = 0
            java.util.List r5 = E0.m.h(r7, r3, r6, r5, r6)
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel.h(ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel, D0.E, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public Object g(E e4, List list, c cVar) {
        return h(this, e4, list, cVar);
    }

    public abstract Object i(List list, c cVar);

    public abstract List j(int i4);
}
