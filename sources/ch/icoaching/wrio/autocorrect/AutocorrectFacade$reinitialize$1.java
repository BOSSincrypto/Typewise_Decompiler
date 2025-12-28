package ch.icoaching.wrio.autocorrect;

import ch.icoaching.typewise.Autocorrection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.autocorrect.AutocorrectFacade$reinitialize$1", f = "AutocorrectFacade.kt", l = {119}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class AutocorrectFacade$reinitialize$1 extends SuspendLambda implements p {
    final /* synthetic */ Autocorrection $autocorrectionLocal;
    final /* synthetic */ float $distanceBetweenAdjacentKeyCenters;
    final /* synthetic */ Map<String, E0.p> $keyCenters;
    final /* synthetic */ String $selectedLanguage;
    int label;
    final /* synthetic */ AutocorrectFacade this$0;

    @d(c = "ch.icoaching.wrio.autocorrect.AutocorrectFacade$reinitialize$1$1", f = "AutocorrectFacade.kt", l = {124, 120, 137}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.autocorrect.AutocorrectFacade$reinitialize$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(str, autocorrectFacade, autocorrection, f5, map, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00c3 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00c4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r14.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0041
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r0 = r14.L$0
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r0 = (ch.icoaching.wrio.autocorrect.AutocorrectFacade) r0
                kotlin.f.b(r15)
                goto L_0x00c6
            L_0x001b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0023:
                kotlin.f.b(r15)
                goto L_0x0092
            L_0x0028:
                java.lang.Object r1 = r14.L$3
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r14.L$2
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r6 = r14.L$1
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r14.L$0
                ch.icoaching.typewise.Predictions$Companion r7 = (ch.icoaching.typewise.Predictions.Companion) r7
                kotlin.f.b(r15)
                r9 = r1
                r8 = r4
            L_0x003d:
                r13 = r7
                r7 = r6
                r6 = r13
                goto L_0x0077
            L_0x0041:
                kotlin.f.b(r15)
                ch.icoaching.typewise.Predictions$Companion r7 = ch.icoaching.typewise.Predictions.f7781m
                java.lang.String r6 = r4
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r15 = r5
                ch.icoaching.wrio.data.c r15 = r15.f9276e
                java.util.List r15 = r15.j()
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r1 = r5
                ch.icoaching.wrio.data.c r1 = r1.f9276e
                java.util.List r1 = r1.g()
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r8 = r5
                ch.icoaching.typewise.AILibrarySingletonProvider r8 = r8.f9278g
                r14.L$0 = r7
                r14.L$1 = r6
                r14.L$2 = r15
                r14.L$3 = r1
                r14.label = r4
                java.lang.Object r4 = r8.b(r14)
                if (r4 != r0) goto L_0x0073
                return r0
            L_0x0073:
                r8 = r15
                r9 = r1
                r15 = r4
                goto L_0x003d
            L_0x0077:
                r10 = r15
                ch.icoaching.typewise.a r10 = (ch.icoaching.typewise.a) r10
                ch.icoaching.wrio.prediction.e r15 = ch.icoaching.wrio.prediction.e.f10625a
                z0.a r11 = r15.a()
                r14.L$0 = r5
                r14.L$1 = r5
                r14.L$2 = r5
                r14.L$3 = r5
                r14.label = r3
                r12 = r14
                java.lang.Object r15 = r6.c(r7, r8, r9, r10, r11, r12)
                if (r15 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r11 = r15
                ch.icoaching.typewise.language_modelling.inference.b r11 = (ch.icoaching.typewise.language_modelling.inference.b) r11
                ch.icoaching.typewise.Autocorrection r6 = r6
                java.lang.String r7 = r4
                float r8 = r7
                java.util.Map<java.lang.String, E0.p> r9 = r8
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r15 = r5
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r15 = r15.f9279h
                boolean r10 = ch.icoaching.wrio.autocorrect.b.b(r15)
                r6.h(r7, r8, r9, r10, r11)
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r15 = r5
                kotlinx.coroutines.CoroutineDispatcher r1 = r15.f9274c
                ch.icoaching.wrio.autocorrect.AutocorrectFacade$reinitialize$1$1$1 r3 = new ch.icoaching.wrio.autocorrect.AutocorrectFacade$reinitialize$1$1$1
                ch.icoaching.wrio.autocorrect.AutocorrectFacade r4 = r5
                java.lang.String r6 = r4
                r3.<init>(r4, r6, r5)
                r14.L$0 = r15
                r14.label = r2
                java.lang.Object r1 = kotlinx.coroutines.C0738g.e(r1, r3, r14)
                if (r1 != r0) goto L_0x00c4
                return r0
            L_0x00c4:
                r0 = r15
                r15 = r1
            L_0x00c6:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                r0.f9284m = r15
                l2.q r15 = l2.q.f14567a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.autocorrect.AutocorrectFacade$reinitialize$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutocorrectFacade$reinitialize$1(AutocorrectFacade autocorrectFacade, String str, Autocorrection autocorrection, float f4, Map<String, E0.p> map, c<? super AutocorrectFacade$reinitialize$1> cVar) {
        super(2, cVar);
        this.this$0 = autocorrectFacade;
        this.$selectedLanguage = str;
        this.$autocorrectionLocal = autocorrection;
        this.$distanceBetweenAdjacentKeyCenters = f4;
        this.$keyCenters = map;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new AutocorrectFacade$reinitialize$1(this.this$0, this.$selectedLanguage, this.$autocorrectionLocal, this.$distanceBetweenAdjacentKeyCenters, this.$keyCenters, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher s4 = this.this$0.f9273b;
            final String str = this.$selectedLanguage;
            final AutocorrectFacade autocorrectFacade = this.this$0;
            final Autocorrection autocorrection = this.$autocorrectionLocal;
            final float f5 = this.$distanceBetweenAdjacentKeyCenters;
            final Map<String, E0.p> map = this.$keyCenters;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(s4, r32, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((AutocorrectFacade$reinitialize$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
