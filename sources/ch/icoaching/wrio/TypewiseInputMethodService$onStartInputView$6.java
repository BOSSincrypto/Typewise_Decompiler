package ch.icoaching.wrio;

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

@d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6", f = "TypewiseInputMethodService.kt", l = {297}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class TypewiseInputMethodService$onStartInputView$6 extends SuspendLambda implements p {
    final /* synthetic */ boolean $isBrowserInputField;
    final /* synthetic */ String $previousPackageName;
    int label;
    final /* synthetic */ TypewiseInputMethodService this$0;

    @d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6$1", f = "TypewiseInputMethodService.kt", l = {307, 324}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(z3, typewiseInputMethodService, str, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r12.label
                r2 = 2
                java.lang.String r3 = "searchController"
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0022
                if (r1 == r4) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                kotlin.f.b(r13)
                goto L_0x009c
            L_0x0016:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001e:
                kotlin.f.b(r13)
                goto L_0x0054
            L_0x0022:
                kotlin.f.b(r13)
                boolean r13 = r3
                if (r13 == 0) goto L_0x003e
                ch.icoaching.wrio.TypewiseInputMethodService r13 = r4
                kotlinx.coroutines.D r6 = r13.u0()
                ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6$1$1 r9 = new ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6$1$1
                ch.icoaching.wrio.TypewiseInputMethodService r13 = r4
                r9.<init>(r13, r5)
                r10 = 3
                r11 = 0
                r7 = 0
                r8 = 0
                kotlinx.coroutines.g0 unused = kotlinx.coroutines.C0739h.d(r6, r7, r8, r9, r10, r11)
                goto L_0x0054
            L_0x003e:
                ch.icoaching.wrio.TypewiseInputMethodService r13 = r4
                kotlinx.coroutines.CoroutineDispatcher r13 = r13.s0()
                ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6$1$2 r1 = new ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6$1$2
                ch.icoaching.wrio.TypewiseInputMethodService r6 = r4
                r1.<init>(r6, r5)
                r12.label = r4
                java.lang.Object r13 = kotlinx.coroutines.C0738g.e(r13, r1, r12)
                if (r13 != r0) goto L_0x0054
                return r0
            L_0x0054:
                java.lang.String r13 = r5
                ch.icoaching.wrio.TypewiseInputMethodService r1 = r4
                ch.icoaching.wrio.appnomix.controller.SearchController r1 = r1.f9064r0
                if (r1 != 0) goto L_0x0062
                kotlin.jvm.internal.o.p(r3)
                r1 = r5
            L_0x0062:
                java.lang.String r1 = r1.m()
                boolean r13 = kotlin.jvm.internal.o.a(r13, r1)
                if (r13 == 0) goto L_0x0091
                ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "onStartInputView() :: Maximum height for `"
                r13.append(r0)
                java.lang.String r0 = r5
                r13.append(r0)
                java.lang.String r0 = "` already set"
                r13.append(r0)
                java.lang.String r8 = r13.toString()
                r10 = 4
                r11 = 0
                java.lang.String r7 = "TypewiseInputMethodService"
                r9 = 0
                ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)
                l2.q r13 = l2.q.f14567a
                return r13
            L_0x0091:
                r12.label = r2
                r1 = 200(0xc8, double:9.9E-322)
                java.lang.Object r13 = kotlinx.coroutines.L.a(r1, r12)
                if (r13 != r0) goto L_0x009c
                return r0
            L_0x009c:
                ch.icoaching.wrio.TypewiseInputMethodService r13 = r4
                q3.a r13 = r13.h0()
                int[] r13 = r13.a()
                r13 = r13[r4]
                ch.icoaching.wrio.TypewiseInputMethodService r0 = r4
                ch.icoaching.wrio.keyboard.B r0 = r0.n0()
                int r0 = r0.F()
                int r13 = r13 - r0
                float r13 = (float) r13
                ch.icoaching.wrio.TypewiseInputMethodService r0 = r4
                ch.icoaching.wrio.appnomix.controller.SearchController r0 = r0.f9064r0
                if (r0 != 0) goto L_0x00c0
                kotlin.jvm.internal.o.p(r3)
                r0 = r5
            L_0x00c0:
                java.lang.String r0 = r0.m()
                float r0 = L0.a.a(r0)
                float r13 = r13 * r0
                int r13 = (int) r13
                ch.icoaching.wrio.TypewiseInputMethodService r0 = r4
                ch.icoaching.wrio.appnomix.controller.SearchController r0 = r0.f9064r0
                if (r0 != 0) goto L_0x00d6
                kotlin.jvm.internal.o.p(r3)
                goto L_0x00d7
            L_0x00d6:
                r5 = r0
            L_0x00d7:
                r5.t(r13)
                l2.q r13 = l2.q.f14567a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.TypewiseInputMethodService$onStartInputView$6.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseInputMethodService$onStartInputView$6(TypewiseInputMethodService typewiseInputMethodService, boolean z3, String str, c<? super TypewiseInputMethodService$onStartInputView$6> cVar) {
        super(2, cVar);
        this.this$0 = typewiseInputMethodService;
        this.$isBrowserInputField = z3;
        this.$previousPackageName = str;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new TypewiseInputMethodService$onStartInputView$6(this.this$0, this.$isBrowserInputField, this.$previousPackageName, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher m02 = this.this$0.m0();
            final boolean z3 = this.$isBrowserInputField;
            final TypewiseInputMethodService typewiseInputMethodService = this.this$0;
            final String str = this.$previousPackageName;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(m02, r12, this) == f4) {
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
        return ((TypewiseInputMethodService$onStartInputView$6) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
