package ch.icoaching.wrio.ai_assistant;

import i.e;
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

@d(c = "ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1", f = "DefaultAiAssistantController.kt", l = {281}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultAiAssistantController$applyTextTransformation$1 extends SuspendLambda implements p {
    final /* synthetic */ e $textTransformation;
    int label;
    final /* synthetic */ DefaultAiAssistantController this$0;

    @d(c = "ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1", f = "DefaultAiAssistantController.kt", l = {284, 292, 299}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultAiAssistantController, eVar, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r12.label
                r3 = 3
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L_0x0027
                if (r2 == r0) goto L_0x0023
                if (r2 == r4) goto L_0x001f
                if (r2 != r3) goto L_0x0017
                kotlin.f.b(r13)
                goto L_0x00de
            L_0x0017:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001f:
                kotlin.f.b(r13)
                goto L_0x0095
            L_0x0023:
                kotlin.f.b(r13)
                goto L_0x0058
            L_0x0027:
                kotlin.f.b(r13)
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r13 = r3
                ch.icoaching.wrio.ai_assistant.i r13 = r13.E()
                if (r13 == 0) goto L_0x0035
                r13.b()
            L_0x0035:
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r13 = r3
                p0.e r13 = r13.f9126p
                if (r13 == 0) goto L_0x0040
                r13.J()
            L_0x0040:
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r13 = r3
                kotlinx.coroutines.CoroutineDispatcher r13 = r13.f9118h
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1 r2 = new ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r6 = r3
                i.e r7 = r4
                r2.<init>(r6, r7, r5)
                r12.label = r0
                java.lang.Object r13 = kotlinx.coroutines.C0738g.e(r13, r2, r12)
                if (r13 != r1) goto L_0x0058
                return r1
            L_0x0058:
                ch.icoaching.wrio.ai_assistant.j r13 = (ch.icoaching.wrio.ai_assistant.j) r13
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r2 = r3
                p0.e r2 = r2.f9126p
                if (r2 == 0) goto L_0x0065
                r2.G()
            L_0x0065:
                boolean r2 = r13 instanceof ch.icoaching.wrio.ai_assistant.j.b
                if (r2 == 0) goto L_0x00a1
                ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a
                r10 = 4
                r11 = 0
                java.lang.String r7 = "DefaultAiAssistantController"
                java.lang.String r8 = "Message transformed successfully"
                r9 = 0
                ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r2 = r3
                ch.icoaching.wrio.input.c r2 = r2.f9114d
                ch.icoaching.wrio.ai_assistant.j$b r13 = (ch.icoaching.wrio.ai_assistant.j.b) r13
                java.lang.String r13 = r13.a()
                char[] r0 = new char[r0]
                r3 = 34
                r6 = 0
                r0[r6] = r3
                java.lang.String r13 = kotlin.text.o.N0(r13, r0)
                r12.label = r4
                java.lang.Object r13 = r2.y(r13, r12)
                if (r13 != r1) goto L_0x0095
                return r1
            L_0x0095:
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r13 = r3
                ch.icoaching.wrio.ai_assistant.i r13 = r13.E()
                if (r13 == 0) goto L_0x00e0
                r13.a()
                goto L_0x00e0
            L_0x00a1:
                boolean r0 = r13 instanceof ch.icoaching.wrio.ai_assistant.j.a
                if (r0 == 0) goto L_0x00e8
                ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a
                r10 = 4
                r11 = 0
                java.lang.String r7 = "DefaultAiAssistantController"
                java.lang.String r8 = "Message transformation failed."
                r9 = 0
                ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r0 = r3
                p0.e r0 = r0.f9126p
                if (r0 == 0) goto L_0x00c8
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r2 = r3
                ch.icoaching.wrio.ai_assistant.j$a r13 = (ch.icoaching.wrio.ai_assistant.j.a) r13
                ch.icoaching.wrio.ai_assistant.network.d r13 = r13.a()
                java.lang.String r13 = r2.o(r13)
                r0.E(r13)
            L_0x00c8:
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r13 = r3
                kotlinx.coroutines.CoroutineDispatcher r13 = r13.f9118h
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1$1 r0 = new ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1$1
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r2 = r3
                r0.<init>(r2, r5)
                r12.label = r3
                java.lang.Object r13 = kotlinx.coroutines.C0738g.e(r13, r0, r12)
                if (r13 != r1) goto L_0x00de
                return r1
            L_0x00de:
                l2.q r13 = (l2.q) r13
            L_0x00e0:
                ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController r13 = r3
                r13.f9129s = r5
                l2.q r13 = l2.q.f14567a
                return r13
            L_0x00e8:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultAiAssistantController$applyTextTransformation$1(DefaultAiAssistantController defaultAiAssistantController, e eVar, c<? super DefaultAiAssistantController$applyTextTransformation$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultAiAssistantController;
        this.$textTransformation = eVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultAiAssistantController$applyTextTransformation$1(this.this$0, this.$textTransformation, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher F3 = this.this$0.f9119i;
            final DefaultAiAssistantController defaultAiAssistantController = this.this$0;
            final e eVar = this.$textTransformation;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(F3, r12, this) == f4) {
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
        return ((DefaultAiAssistantController$applyTextTransformation$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
