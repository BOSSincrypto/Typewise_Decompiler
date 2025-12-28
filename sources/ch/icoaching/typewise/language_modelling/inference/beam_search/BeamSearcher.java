package ch.icoaching.typewise.language_modelling.inference.beam_search;

import D0.C;
import D0.E;
import D0.F;
import D0.J;
import D0.k0;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.d;
import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import ch.icoaching.typewise.language_modelling.preprocessing.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.l;

public class BeamSearcher {

    /* renamed from: j  reason: collision with root package name */
    public static final a f8407j = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Regex f8408k = new Regex("-k(\\d*)");

    /* renamed from: a  reason: collision with root package name */
    private final c f8409a;

    /* renamed from: b  reason: collision with root package name */
    private final StatefulLanguageModel f8410b;

    /* renamed from: c  reason: collision with root package name */
    private final F f8411c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8412d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f8413e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8414f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8415g;

    /* renamed from: h  reason: collision with root package name */
    private final d f8416h;

    /* renamed from: i  reason: collision with root package name */
    private final float f8417i;

    public static final class a {
        private a() {
        }

        public final int a(String str) {
            List a4;
            String str2;
            o.e(str, "stringDeclaration");
            Integer num = null;
            if (kotlin.text.o.L(str, "-k", false, 2, (Object) null)) {
                l find$default = Regex.find$default(BeamSearcher.f8408k, str, 0, 2, (Object) null);
                if (!(find$default == null || (a4 = find$default.a()) == null || (str2 = (String) a4.get(1)) == null)) {
                    num = Integer.valueOf(Integer.parseInt(str2));
                }
                if (num != null) {
                    return num.intValue();
                }
                throw new IllegalArgumentException("Could not parse width from string declaration `" + str + "`");
            }
            throw new IllegalArgumentException("Please provide at least the width of the beam search. Suggested values: 5, 10, 20");
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8418f = new a((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f8419a;

        /* renamed from: b  reason: collision with root package name */
        private final List f8420b;

        /* renamed from: c  reason: collision with root package name */
        private final float f8421c;

        /* renamed from: d  reason: collision with root package name */
        private final int f8422d;

        /* renamed from: e  reason: collision with root package name */
        private final Float f8423e;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }
        }

        public b(String str, List list, float f4, int i4, Float f5) {
            o.e(str, "completion");
            o.e(list, "lls");
            this.f8419a = str;
            this.f8420b = list;
            this.f8421c = f4;
            this.f8422d = i4;
            this.f8423e = f5;
        }

        public static /* synthetic */ b a(b bVar, String str, List list, float f4, int i4, Float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = bVar.f8419a;
            }
            if ((i5 & 2) != 0) {
                list = bVar.f8420b;
            }
            List list2 = list;
            if ((i5 & 4) != 0) {
                f4 = bVar.f8421c;
            }
            float f6 = f4;
            if ((i5 & 8) != 0) {
                i4 = bVar.f8422d;
            }
            int i6 = i4;
            if ((i5 & 16) != 0) {
                f5 = bVar.f8423e;
            }
            return bVar.b(str, list2, f6, i6, f5);
        }

        public final b b(String str, List list, float f4, int i4, Float f5) {
            o.e(str, "completion");
            o.e(list, "lls");
            return new b(str, list, f4, i4, f5);
        }

        public final String c() {
            return this.f8419a;
        }

        public final Float d() {
            return this.f8423e;
        }

        public final float e() {
            return this.f8421c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return o.a(this.f8419a, bVar.f8419a) && o.a(this.f8420b, bVar.f8420b) && Float.compare(this.f8421c, bVar.f8421c) == 0 && this.f8422d == bVar.f8422d && o.a(this.f8423e, bVar.f8423e);
        }

        public int hashCode() {
            int i4;
            int hashCode = ((((((this.f8419a.hashCode() * 31) + this.f8420b.hashCode()) * 31) + Float.floatToIntBits(this.f8421c)) * 31) + this.f8422d) * 31;
            Float f4 = this.f8423e;
            if (f4 == null) {
                i4 = 0;
            } else {
                i4 = f4.hashCode();
            }
            return hashCode + i4;
        }

        public String toString() {
            String str = this.f8419a;
            List list = this.f8420b;
            float f4 = this.f8421c;
            int i4 = this.f8422d;
            Float f5 = this.f8423e;
            return "CompletedBeam(completion=" + str + ", lls=" + list + ", scoreBeforeReScoring=" + f4 + ", nrStopTokens=" + i4 + ", scoreAfterReScoring=" + f5 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, List list, float f4, int i4, Float f5, int i5, i iVar) {
            this(str, list, f4, i4, (i5 & 16) != 0 ? null : f5);
        }
    }

    public BeamSearcher(c cVar, StatefulLanguageModel statefulLanguageModel, F f4, int i4, k0 k0Var, int i5, boolean z3, Float f5) {
        o.e(cVar, "pp");
        o.e(statefulLanguageModel, "lm");
        o.e(f4, "cachingPriorApproachType");
        o.e(k0Var, "runningBeamsScorer");
        this.f8409a = cVar;
        this.f8410b = statefulLanguageModel;
        this.f8411c = f4;
        this.f8412d = i4;
        this.f8413e = k0Var;
        this.f8414f = i5;
        this.f8415g = z3;
        this.f8416h = f4.a(cVar, statefulLanguageModel, i5, z3);
        if (f5 == null) {
            k0.a aVar = k0.f328i;
            this.f8417i = aVar.a();
            e eVar = e.f8233a;
            float a4 = aVar.a();
            e.b(eVar, "BeamSearcher", "Using default filtering threshold at " + a4, (Throwable) null, 4, (Object) null);
            return;
        }
        this.f8417i = f5.floatValue();
        e eVar2 = e.f8233a;
        e.b(eVar2, "BeamSearcher", "Using manually set filtering threshold at " + f5, (Throwable) null, 4, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: ch.icoaching.typewise.language_modelling.inference.beam_search.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object b(ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r7, ch.icoaching.typewise.language_modelling.inference.beam_search.e r8, java.lang.String r9, kotlin.coroutines.c r10) {
        /*
            boolean r0 = r10 instanceof ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$step$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$step$1 r0 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$step$1) r0
            int r1 = r0.f8444f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8444f = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$step$1 r0 = new ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$step$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f8442d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8444f
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.f8441c
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.f8440b
            r8 = r7
            ch.icoaching.typewise.language_modelling.inference.beam_search.e r8 = (ch.icoaching.typewise.language_modelling.inference.beam_search.e) r8
            java.lang.Object r7 = r0.f8439a
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r7 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher) r7
            kotlin.f.b(r10)
        L_0x0036:
            r0 = r8
            goto L_0x0060
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.f.b(r10)
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r10 = r7.f8410b
            D0.E r2 = r8.a()
            D0.E r2 = D0.J.n(r2)
            java.util.List r4 = r8.j()
            r0.f8439a = r7
            r0.f8440b = r8
            r0.f8441c = r9
            r0.f8444f = r3
            java.lang.Object r10 = r10.g(r2, r4, r0)
            if (r10 != r1) goto L_0x0036
            return r1
        L_0x0060:
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r8 = r10.component1()
            D0.E r8 = (D0.E) r8
            java.lang.Object r10 = r10.component2()
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            D0.E r4 = D0.d0.j(r8)
            D0.k0 r8 = r7.f8413e
            kotlin.Pair r8 = r8.e(r0, r4, r9)
            java.lang.Object r9 = r8.component1()
            r5 = r9
            D0.E r5 = (D0.E) r5
            java.lang.Object r8 = r8.component2()
            r6 = r8
            D0.E r6 = (D0.E) r6
            D0.E r8 = r0.b()
            D0.E r7 = r7.a(r5, r8)
            int r8 = r7.k()
            if (r8 != 0) goto L_0x009d
            ch.icoaching.typewise.language_modelling.inference.beam_search.a$a r7 = ch.icoaching.typewise.language_modelling.inference.beam_search.a.f8445h
            r8 = 0
            ch.icoaching.typewise.language_modelling.inference.beam_search.a r7 = r7.a(r8)
            return r7
        L_0x009d:
            ch.icoaching.typewise.language_modelling.inference.beam_search.a$a r8 = ch.icoaching.typewise.language_modelling.inference.beam_search.a.f8445h
            kotlin.Pair r7 = r8.b(r5, r7)
            java.lang.Object r8 = r7.component1()
            r1 = r8
            D0.E r1 = (D0.E) r1
            java.lang.Object r7 = r7.component2()
            r2 = r7
            D0.E r2 = (D0.E) r2
            ch.icoaching.typewise.language_modelling.inference.beam_search.e r7 = D0.C0268d.a(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher.b(ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher, ch.icoaching.typewise.language_modelling.inference.beam_search.e, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object c(ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.coroutines.c r31) {
        /*
            r0 = r27
            r1 = r31
            r2 = 0
            r3 = 1
            boolean r4 = r1 instanceof ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$initializeFromContext$1
            if (r4 == 0) goto L_0x001a
            r4 = r1
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$initializeFromContext$1 r4 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$initializeFromContext$1) r4
            int r5 = r4.f8429f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.f8429f = r5
        L_0x0018:
            r9 = r4
            goto L_0x0020
        L_0x001a:
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$initializeFromContext$1 r4 = new ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$initializeFromContext$1
            r4.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r9.f8427d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r9.f8429f
            if (r5 == 0) goto L_0x0046
            if (r5 != r3) goto L_0x003e
            int r0 = r9.f8426c
            java.lang.Object r4 = r9.f8425b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.f8424a
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r5 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher) r5
            kotlin.f.b(r1)
            r12 = r0
            r0 = r5
            r5 = r1
            r1 = r4
            goto L_0x0065
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            kotlin.f.b(r1)
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.d r5 = r0.f8416h
            r9.f8424a = r0
            r1 = r29
            r9.f8425b = r1
            r12 = r30
            r9.f8426c = r12
            r9.f8429f = r3
            r10 = 4
            r11 = 0
            r8 = 0
            r6 = r28
            r7 = r29
            java.lang.Object r5 = ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.d.a(r5, r6, r7, r8, r9, r10, r11)
            if (r5 != r4) goto L_0x0065
            return r4
        L_0x0065:
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r4 = r5.component1()
            D0.E r4 = (D0.E) r4
            java.lang.Object r5 = r5.component2()
            java.util.List r5 = (java.util.List) r5
            D0.E r6 = D0.d0.j(r4)
            D0.k0 r4 = r0.f8413e
            kotlin.Pair r1 = r4.c(r6, r1)
            java.lang.Object r4 = r1.component1()
            r13 = r4
            D0.E r13 = (D0.E) r13
            java.lang.Object r1 = r1.component2()
            D0.E r1 = (D0.E) r1
            D0.E r4 = D0.C.z(r12)
            D0.E r4 = r0.a(r13, r4)
            int r7 = r4.k()
            if (r7 != 0) goto L_0x009a
            r0 = 0
            return r0
        L_0x009a:
            ch.icoaching.typewise.language_modelling.inference.beam_search.a$a r7 = ch.icoaching.typewise.language_modelling.inference.beam_search.a.f8445h
            D0.E r8 = D0.J.j(r13)
            kotlin.Pair r7 = r7.b(r8, r4)
            java.lang.Object r7 = r7.component2()
            r15 = r7
            D0.E r15 = (D0.E) r15
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r7 = r15
            D0.E r6 = D0.C.L(r6, r7, r8, r9, r10, r11)
            r17 = 12
            r18 = 0
            r7 = 0
            r16 = 0
            r14 = r15
            r8 = r15
            r15 = r7
            D0.E r23 = D0.C.L(r13, r14, r15, r16, r17, r18)
            D0.E r24 = D0.D.b(r1, r8)
            int r1 = r4.k()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r3)
            r9 = 2
            java.lang.Integer[] r9 = new java.lang.Integer[r9]
            r9[r2] = r1
            r9[r3] = r7
            java.util.List r1 = kotlin.collections.C0718m.m(r9)
            D0.E r1 = D0.C.x0(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.C0718m.t(r5, r9)
            r7.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x00f1:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0109
            java.lang.Object r9 = r5.next()
            D0.E r9 = (D0.E) r9
            D0.E r9 = D0.J.j(r9)
            D0.E r9 = D0.C.A0(r9, r1)
            r7.add(r9)
            goto L_0x00f1
        L_0x0109:
            ch.icoaching.typewise.language_modelling.inference.beam_search.a r1 = new ch.icoaching.typewise.language_modelling.inference.beam_search.a
            D0.E r20 = D0.C.h0(r8, r3)
            D0.E r22 = D0.C.B(r6, r3)
            java.util.List r5 = r23.i()
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = kotlin.collections.C0718m.e(r2)
            D0.E r25 = D0.C.Z0(r2)
            int r2 = r4.k()
            int r12 = r12 - r2
            D0.E r26 = D0.C.z(r12)
            r19 = r1
            r21 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            D0.k0 r0 = r0.f8413e
            kotlin.Pair r0 = r0.f(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher.c(ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher, java.lang.String, java.lang.String, int, kotlin.coroutines.c):java.lang.Object");
    }

    public E a(E e4, E e5) {
        o.e(e4, "candidateScores");
        o.e(e5, "maxToSelect");
        return C.u0(C.w0(J.m(e4, C.y(this.f8417i)), (Integer) null, false, 6, (Object) null), e5);
    }

    public Object d(e eVar, String str, kotlin.coroutines.c cVar) {
        return b(this, eVar, str, cVar);
    }

    public Object e(String str, String str2, int i4, kotlin.coroutines.c cVar) {
        return c(this, str, str2, i4, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r12, java.lang.String r13, java.lang.Integer r14, kotlin.coroutines.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$invoke$1 r0 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$invoke$1) r0
            int r1 = r0.f8438i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8438i = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$invoke$1 r0 = new ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher$invoke$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f8436g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8438i
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            int r12 = r0.f8435f
            int r13 = r0.f8434e
            int r14 = r0.f8433d
            java.lang.Object r2 = r0.f8432c
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r0.f8431b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f8430a
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r7 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher) r7
            kotlin.f.b(r15)
            goto L_0x00d8
        L_0x0040:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0048:
            int r12 = r0.f8433d
            java.lang.Object r13 = r0.f8431b
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.f8430a
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r14 = (ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher) r14
            kotlin.f.b(r15)
            goto L_0x0081
        L_0x0056:
            kotlin.f.b(r15)
            if (r14 == 0) goto L_0x0060
            int r14 = r14.intValue()
            goto L_0x0062
        L_0x0060:
            int r14 = r11.f8412d
        L_0x0062:
            ch.icoaching.typewise.language_modelling.preprocessing.c r15 = r11.f8409a
            java.lang.String r13 = r15.b(r13)
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r15 = r11.f8410b
            int r15 = r15.f()
            r0.f8430a = r11
            r0.f8431b = r13
            r0.f8433d = r15
            r0.f8438i = r5
            java.lang.Object r12 = r11.e(r12, r13, r14, r0)
            if (r12 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r14 = r11
            r10 = r15
            r15 = r12
            r12 = r10
        L_0x0081:
            kotlin.Pair r15 = (kotlin.Pair) r15
            if (r15 != 0) goto L_0x009a
            kotlin.Pair r13 = new kotlin.Pair
            java.util.List r15 = kotlin.collections.C0718m.j()
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r14 = r14.f8410b
            int r14 = r14.f()
            int r12 = r12 - r14
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.a.d(r12)
            r13.<init>(r15, r12)
            return r13
        L_0x009a:
            java.lang.Object r2 = r15.getFirst()
            ch.icoaching.typewise.language_modelling.inference.beam_search.e r2 = (ch.icoaching.typewise.language_modelling.inference.beam_search.e) r2
            java.lang.Object r15 = r15.getSecond()
            java.util.Collection r15 = (java.util.Collection) r15
            java.util.List r15 = kotlin.collections.C0718m.D0(r15)
            D0.k0 r6 = r14.f8413e
            int r6 = r6.l()
            int r6 = r6 - r5
            r7 = r14
            r14 = r12
            r12 = r3
            r10 = r6
            r6 = r13
            r13 = r10
        L_0x00b7:
            if (r12 >= r13) goto L_0x00fe
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L_0x00c0
            goto L_0x00fe
        L_0x00c0:
            r0.f8430a = r7
            r0.f8431b = r6
            r0.f8432c = r15
            r0.f8433d = r14
            r0.f8434e = r13
            r0.f8435f = r12
            r0.f8438i = r4
            java.lang.Object r2 = r7.d(r2, r6, r0)
            if (r2 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r10 = r2
            r2 = r15
            r15 = r10
        L_0x00d8:
            ch.icoaching.typewise.language_modelling.inference.beam_search.e r15 = (ch.icoaching.typewise.language_modelling.inference.beam_search.e) r15
            boolean r8 = r15.isEmpty()
            if (r8 == 0) goto L_0x00e4
            r10 = r2
            r2 = r15
            r15 = r10
            goto L_0x00fe
        L_0x00e4:
            D0.k0 r8 = r7.f8413e
            r9 = 0
            kotlin.Pair r15 = D0.k0.d(r8, r15, r3, r4, r9)
            java.lang.Object r8 = r15.getFirst()
            ch.icoaching.typewise.language_modelling.inference.beam_search.e r8 = (ch.icoaching.typewise.language_modelling.inference.beam_search.e) r8
            java.lang.Object r15 = r15.getSecond()
            java.util.List r15 = (java.util.List) r15
            r2.addAll(r15)
            int r12 = r12 + r5
            r15 = r2
            r2 = r8
            goto L_0x00b7
        L_0x00fe:
            java.util.List r12 = r7.g(r15, r2)
            kotlin.Pair r13 = new kotlin.Pair
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r15 = r7.f8410b
            int r15 = r15.f()
            int r15 = r15 - r14
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.a.d(r15)
            r13.<init>(r12, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher.f(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.c):java.lang.Object");
    }

    public List g(List list, e eVar) {
        o.e(list, "completedBeamsCollectionsList");
        o.e(eVar, "runningBeams");
        ArrayList arrayList = new ArrayList();
        for (e eVar2 : C0718m.j0(list, eVar)) {
            if (!eVar2.isEmpty()) {
                int intValue = ((Number) eVar2.a().i().get(0)).intValue();
                for (int i4 = 0; i4 < intValue; i4++) {
                    E b4 = eVar2.a().b(i4);
                    E b5 = eVar2.f().b(i4);
                    E b6 = eVar2.c().b(i4);
                    E b7 = eVar2.d().b(i4);
                    if (this.f8413e.g(J.c(b4, -1).k())) {
                        b4 = J.h(b4, 1);
                    }
                    c cVar = this.f8409a;
                    String e4 = cVar.e(cVar.i(b4.d()));
                    if (!this.f8413e.k()) {
                        e4 = kotlin.text.o.O0(e4).toString();
                    }
                    arrayList.add(new b(e4, b5.d(), C.A(b6).j(), b7.k(), (Float) null, 16, (i) null));
                }
            }
        }
        return arrayList;
    }

    public final d i() {
        return this.f8416h;
    }

    public final StatefulLanguageModel j() {
        return this.f8410b;
    }

    public final c k() {
        return this.f8409a;
    }

    public final k0 l() {
        return this.f8413e;
    }
}
