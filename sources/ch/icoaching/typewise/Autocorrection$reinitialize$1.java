package ch.icoaching.typewise;

import ch.icoaching.typewise.language_modelling.inference.b;
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

@d(c = "ch.icoaching.typewise.Autocorrection$reinitialize$1", f = "Autocorrection.kt", l = {58}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class Autocorrection$reinitialize$1 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f7760a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Autocorrection f7761b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f7762c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Map f7763d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f7764e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f7765f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ b f7766g;

    @d(c = "ch.icoaching.typewise.Autocorrection$reinitialize$1$1", f = "Autocorrection.kt", l = {61, 59, 81}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.typewise.Autocorrection$reinitialize$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f7767a;

        /* renamed from: b  reason: collision with root package name */
        Object f7768b;

        /* renamed from: c  reason: collision with root package name */
        int f7769c;

        /* renamed from: a */
        public final Object invoke(D d4, c cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }

        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(autocorrection, str, map, f5, z3, bVar, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0102 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0103  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r7 = r22
                java.lang.Object r8 = kotlin.coroutines.intrinsics.a.f()
                int r0 = r7.f7769c
                r9 = 3
                r6 = 2
                r10 = 1
                if (r0 == 0) goto L_0x003a
                if (r0 == r10) goto L_0x002b
                if (r0 == r6) goto L_0x0024
                if (r0 != r9) goto L_0x001c
                java.lang.Object r0 = r7.f7767a
                ch.icoaching.typewise.autocorrection.scripts.PointCorrection r0 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection) r0
                kotlin.f.b(r23)
                goto L_0x0104
            L_0x001c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0024:
                kotlin.f.b(r23)
                r0 = r23
                goto L_0x00bb
            L_0x002b:
                java.lang.Object r0 = r7.f7768b
                ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r0 = (ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository) r0
                java.lang.Object r1 = r7.f7767a
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion r1 = (ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository.Companion) r1
                kotlin.f.b(r23)
                r12 = r0
                r0 = r23
                goto L_0x0084
            L_0x003a:
                kotlin.f.b(r23)
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion r11 = ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository.f7890d
                ch.icoaching.typewise.Autocorrection r0 = r4
                ch.icoaching.typewise.autocorrection.a r12 = r0.f7748b
                ch.icoaching.typewise.Autocorrection r0 = r4
                ch.icoaching.typewise.a r0 = r0.f7747a
                java.lang.String r1 = r5
                java.util.List r1 = kotlin.collections.C0718m.e(r1)
                ch.icoaching.typewise.Autocorrection r2 = r4
                ch.icoaching.typewise.autocorrection.a r2 = r2.f7748b
                java.lang.String r3 = r5
                ch.icoaching.typewise.word_lists.b r2 = r2.b(r3)
                ch.icoaching.typewise.Autocorrection r3 = r4
                ch.icoaching.typewise.autocorrection.a r3 = r3.f7748b
                java.lang.String r4 = r5
                ch.icoaching.typewise.word_lists.b r3 = r3.a(r4)
                ch.icoaching.typewise.Autocorrection$reinitialize$1$1$blocklistDictionaryRepository$1 r4 = new ch.icoaching.typewise.Autocorrection$reinitialize$1$1$blocklistDictionaryRepository$1
                ch.icoaching.typewise.Autocorrection r5 = r4
                ch.icoaching.typewise.autocorrection.a r5 = r5.f7748b
                r4.<init>(r5)
                r7.f7767a = r11
                r7.f7768b = r12
                r7.f7769c = r10
                r5 = r22
                java.lang.Object r0 = r0.f(r1, r2, r3, r4, r5)
                if (r0 != r8) goto L_0x0083
                return r8
            L_0x0083:
                r1 = r11
            L_0x0084:
                r2 = r0
                ch.icoaching.typewise.word_lists.c r2 = (ch.icoaching.typewise.word_lists.c) r2
                ch.icoaching.typewise.Autocorrection r0 = r4
                ch.icoaching.typewise.a r0 = r0.f7747a
                kotlinx.coroutines.CoroutineDispatcher r3 = r0.d()
                java.lang.String r0 = r5
                java.util.List r4 = kotlin.collections.C0718m.e(r0)
                ch.icoaching.typewise.Autocorrection r0 = r4
                ch.icoaching.typewise.a r0 = r0.f7747a
                ch.icoaching.typewise.file_handling.ConfigHolder r0 = r0.b()
                ch.icoaching.typewise.config.CompanyConfig r0 = r0.c()
                ch.icoaching.typewise.config.CompanyConfig$b r5 = r0.e()
                r0 = 0
                r7.f7767a = r0
                r7.f7768b = r0
                r7.f7769c = r6
                r0 = r1
                r1 = r12
                r6 = r22
                java.lang.Object r0 = r0.e(r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x00bb
                return r8
            L_0x00bb:
                r12 = r0
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository r12 = (ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository) r12
                ch.icoaching.typewise.autocorrection.scripts.PointCorrection r6 = new ch.icoaching.typewise.autocorrection.scripts.PointCorrection
                java.util.Map r13 = r6
                float r14 = r7
                java.lang.String r15 = r5
                boolean r0 = r8
                ch.icoaching.typewise.Autocorrection r1 = r4
                ch.icoaching.typewise.a r1 = r1.f7747a
                ch.icoaching.typewise.file_handling.ConfigHolder r18 = r1.b()
                r20 = 160(0xa0, float:2.24E-43)
                r21 = 0
                r17 = 0
                r19 = 0
                r11 = r6
                r16 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                ch.icoaching.typewise.Autocorrection r0 = r4
                ch.icoaching.typewise.a r0 = r0.f7747a
                kotlinx.coroutines.CoroutineDispatcher r11 = r0.d()
                ch.icoaching.typewise.Autocorrection$reinitialize$1$1$1 r12 = new ch.icoaching.typewise.Autocorrection$reinitialize$1$1$1
                ch.icoaching.typewise.Autocorrection r1 = r4
                java.lang.String r2 = r5
                ch.icoaching.typewise.language_modelling.inference.b r4 = r9
                r5 = 0
                r0 = r12
                r3 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r7.f7767a = r6
                r7.f7769c = r9
                java.lang.Object r0 = kotlinx.coroutines.C0738g.e(r11, r12, r7)
                if (r0 != r8) goto L_0x0103
                return r8
            L_0x0103:
                r0 = r6
            L_0x0104:
                ch.icoaching.typewise.Autocorrection r1 = r4
                r1.f7750d = r0
                ch.icoaching.typewise.Autocorrection r1 = r4
                B0.m r2 = new B0.m
                boolean r3 = r8
                ch.icoaching.typewise.Autocorrection r4 = r4
                ch.icoaching.typewise.a r4 = r4.f7747a
                ch.icoaching.typewise.file_handling.ConfigHolder r4 = r4.b()
                r2.<init>(r0, r3, r4)
                r1.f7749c = r2
                ch.icoaching.typewise.Autocorrection r0 = r4
                r0.f7755i = r10
                ch.icoaching.typewise.e r1 = ch.icoaching.typewise.e.f8233a
                r5 = 4
                r6 = 0
                java.lang.String r2 = "Autocorrection"
                java.lang.String r3 = "Autocorrection initialization done."
                r4 = 0
                ch.icoaching.typewise.e.f(r1, r2, r3, r4, r5, r6)
                l2.q r0 = l2.q.f14567a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.Autocorrection$reinitialize$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Autocorrection$reinitialize$1(Autocorrection autocorrection, String str, Map map, float f4, boolean z3, b bVar, c cVar) {
        super(2, cVar);
        this.f7761b = autocorrection;
        this.f7762c = str;
        this.f7763d = map;
        this.f7764e = f4;
        this.f7765f = z3;
        this.f7766g = bVar;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((Autocorrection$reinitialize$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new Autocorrection$reinitialize$1(this.f7761b, this.f7762c, this.f7763d, this.f7764e, this.f7765f, this.f7766g, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.f7760a;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher e4 = this.f7761b.f7747a.e();
            final Autocorrection autocorrection = this.f7761b;
            final String str = this.f7762c;
            final Map map = this.f7763d;
            final float f5 = this.f7764e;
            final boolean z3 = this.f7765f;
            final b bVar = this.f7766g;
            AnonymousClass1 r32 = new AnonymousClass1((c) null);
            this.f7760a = 1;
            if (C0738g.e(e4, r32, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }
}
