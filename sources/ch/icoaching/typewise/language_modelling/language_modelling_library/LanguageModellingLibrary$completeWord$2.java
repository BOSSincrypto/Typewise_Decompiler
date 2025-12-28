package ch.icoaching.typewise.language_modelling.language_modelling_library;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary$completeWord$2", f = "LanguageModellingLibrary.kt", l = {32, 37, 39}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "LD0/K;", "<anonymous>", "(Lkotlinx/coroutines/D;)LD0/K;"}, k = 3, mv = {2, 0, 0})
final class LanguageModellingLibrary$completeWord$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    Object f8583a;

    /* renamed from: b  reason: collision with root package name */
    int f8584b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrary f8585c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f8586d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List f8587e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f8588f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Float f8589g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f8590h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f8591i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrary$completeWord$2(LanguageModellingLibrary languageModellingLibrary, String str, List list, boolean z3, Float f4, int i4, String str2, c cVar) {
        super(2, cVar);
        this.f8585c = languageModellingLibrary;
        this.f8586d = str;
        this.f8587e = list;
        this.f8588f = z3;
        this.f8589g = f4;
        this.f8590h = i4;
        this.f8591i = str2;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((LanguageModellingLibrary$completeWord$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new LanguageModellingLibrary$completeWord$2(this.f8585c, this.f8586d, this.f8587e, this.f8588f, this.f8589g, this.f8590h, this.f8591i, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f8584b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r0 = r12.f8583a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.f.b(r13)
            goto L_0x009c
        L_0x001a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0022:
            java.lang.Object r1 = r12.f8583a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.f.b(r13)
            goto L_0x007d
        L_0x002a:
            kotlin.f.b(r13)
            goto L_0x0048
        L_0x002e:
            kotlin.f.b(r13)
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary r13 = r12.f8585c
            ch.icoaching.typewise.language_modelling.language_modelling_library.a r13 = r13.a()
            ch.icoaching.typewise.language_detection.a r13 = r13.a()
            java.lang.String r1 = r12.f8586d
            java.util.List r5 = r12.f8587e
            r12.f8584b = r4
            java.lang.Object r13 = r13.a(r1, r5, r12)
            if (r13 != r0) goto L_0x0048
            return r0
        L_0x0048:
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r1 = r13.component1()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r13 = r13.component2()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x006a
            D0.K r13 = new D0.K
            java.lang.String r0 = r12.f8586d
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult$a r2 = ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult.f8807d
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r2 = r2.a()
            r13.<init>(r0, r2, r1)
            return r13
        L_0x006a:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary r13 = r12.f8585c
            ch.icoaching.typewise.language_modelling.language_modelling_library.a r13 = r13.a()
            boolean r4 = r12.f8588f
            r12.f8583a = r1
            r12.f8584b = r3
            java.lang.Object r13 = r13.e(r1, r4, r12)
            if (r13 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r3 = r13
            ch.icoaching.typewise.language_modelling.inference.b r3 = (ch.icoaching.typewise.language_modelling.inference.b) r3
            java.lang.String r4 = r12.f8586d
            java.lang.Float r6 = r12.f8589g
            int r13 = r12.f8590h
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r13)
            java.lang.String r8 = r12.f8591i
            r12.f8583a = r1
            r12.f8584b = r2
            r10 = 2
            r11 = 0
            r5 = 0
            r9 = r12
            java.lang.Object r13 = ch.icoaching.typewise.language_modelling.inference.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L_0x009b
            return r0
        L_0x009b:
            r0 = r1
        L_0x009c:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r13 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r13
            D0.K r1 = new D0.K
            java.lang.String r2 = r12.f8586d
            r1.<init>(r2, r13, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary$completeWord$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
