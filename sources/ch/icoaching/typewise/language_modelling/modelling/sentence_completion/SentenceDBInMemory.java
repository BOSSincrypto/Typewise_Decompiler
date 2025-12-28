package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import D0.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.g;

public final class SentenceDBInMemory extends e {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f8743d = new Companion((i) null);

    /* renamed from: c  reason: collision with root package name */
    private final Map f8744c;

    public static final class Companion {
        private Companion() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.c r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion$invoke$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion$invoke$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion$invoke$1) r0
                int r1 = r0.f8748d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8748d = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion$invoke$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion$invoke$1
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f8746b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f8748d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r7 = r0.f8745a
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory r7 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory) r7
                kotlin.f.b(r9)
                goto L_0x006a
            L_0x0030:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0038:
                java.lang.Object r7 = r0.f8745a
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory r7 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory) r7
                kotlin.f.b(r9)
                goto L_0x005d
            L_0x0040:
                kotlin.f.b(r9)
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory r9 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory
                r2 = 0
                r9.<init>(r7, r2)
                ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin$Companion r2 = ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin.f8637c
                java.util.List r7 = kotlin.collections.C0718m.e(r7)
                r0.f8745a = r9
                r0.f8748d = r4
                java.lang.Object r7 = r2.a(r8, r7, r0)
                if (r7 != r1) goto L_0x005a
                return r1
            L_0x005a:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x005d:
                ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin r9 = (ch.icoaching.typewise.language_modelling.modelling.HashCheckedMixin) r9
                r0.f8745a = r7
                r0.f8748d = r3
                java.lang.Object r8 = r9.a(r0)
                if (r8 != r1) goto L_0x006a
                return r1
            L_0x006a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory.Companion.a(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private SentenceDBInMemory(String str) {
        super(str);
        this.f8744c = new LinkedHashMap();
    }

    public m0 b(String str) {
        o.e(str, "sentence");
        Object obj = this.f8744c.get(str);
        o.b(obj);
        return (m0) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[LOOP:0: B:17:0x007a->B:19:0x0080, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$load$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$load$1) r0
            int r1 = r0.f8752d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8752d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$load$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$load$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8750b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8752d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f8749a
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory r0 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory) r0
            kotlin.f.b(r6)
            goto L_0x0050
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            kotlin.f.b(r6)
            ch.icoaching.typewise.file_handling.b r6 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r2 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
            ch.icoaching.typewise.file_handling.FileIO r6 = r6.a(r2)
            java.lang.String r2 = r5.i()
            r0.f8749a = r5
            r0.f8752d = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0 = r5
        L_0x0050:
            java.lang.String r6 = (java.lang.String) r6
            t0.c r1 = t0.c.f16361a
            K2.a r1 = r1.c()
            r1.a()
            J2.O r2 = new J2.O
            J2.G0 r3 = J2.G0.f622a
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g$b r4 = ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g.f8756h
            F2.b r4 = r4.serializer()
            r2.<init>(r3, r4)
            java.lang.Object r6 = r1.c(r2, r6)
            java.util.Map r6 = (java.util.Map) r6
            java.util.List r6 = kotlin.collections.D.u(r6)
            java.util.List r6 = kotlin.collections.C0718m.D0(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x007a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r6.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.component2()
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g r1 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g) r1
            D0.m0 r1 = ch.icoaching.typewise.language_modelling.modelling.sentence_completion.f.b(r1)
            r0.e(r2, r1)
            goto L_0x007a
        L_0x009a:
            l2.q r6 = l2.q.f14567a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory.c(kotlin.coroutines.c):java.lang.Object");
    }

    public List d() {
        return C0718m.B0(this.f8744c.values());
    }

    public void h(String str, m0 m0Var) {
        o.e(str, "sentence");
        o.e(m0Var, "description");
        this.f8744c.put(str, m0Var);
    }

    public List j() {
        return C0718m.B0(this.f8744c.keySet());
    }

    public Map k() {
        Pair a4 = g.a("n_sentences", Integer.valueOf(this.f8744c.size()));
        Pair a5 = g.a("total_counts", Integer.valueOf(C0718m.t0(l())));
        Integer num = (Integer) C0718m.d0(l());
        Pair a6 = g.a("max_count", Integer.valueOf(num != null ? num.intValue() : 0));
        Integer num2 = (Integer) C0718m.g0(l());
        Pair a7 = g.a("min_count", Integer.valueOf(num2 != null ? num2.intValue() : 0));
        List l4 = l();
        ArrayList arrayList = new ArrayList();
        for (Object next : l4) {
            if (((Number) next).intValue() > 1) {
                arrayList.add(next);
            }
        }
        return D.j(a4, a5, a6, a7, g.a("counts_bigger_than_1", Integer.valueOf(arrayList.size())));
    }

    public List l() {
        List<m0> d4 = d();
        ArrayList arrayList = new ArrayList(C0718m.t(d4, 10));
        for (m0 a4 : d4) {
            arrayList.add(Integer.valueOf(a4.a()));
        }
        return arrayList;
    }

    public /* synthetic */ SentenceDBInMemory(String str, i iVar) {
        this(str);
    }
}
