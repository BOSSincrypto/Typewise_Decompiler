package ch.icoaching.wrio.language;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.language.DefaultLanguageController$addWord$1", f = "DefaultLanguageController.kt", l = {94}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultLanguageController$addWord$1 extends SuspendLambda implements p {
    final /* synthetic */ Ref$ObjectRef<String> $word;
    int label;
    final /* synthetic */ DefaultLanguageController this$0;

    @d(c = "ch.icoaching.wrio.language.DefaultLanguageController$addWord$1$1", f = "DefaultLanguageController.kt", l = {98}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.language.DefaultLanguageController$addWord$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultLanguageController, ref$ObjectRef, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                final List l4 = defaultLanguageController.n(defaultLanguageController.f10549a.e((String) ref$ObjectRef.element, defaultLanguageController.f10562n), e3.c.i((CharSequence) ref$ObjectRef.element));
                CoroutineDispatcher t4 = defaultLanguageController.f10553e;
                final DefaultLanguageController defaultLanguageController = defaultLanguageController;
                AnonymousClass1 r32 = new p((c<? super AnonymousClass1>) null) {
                    int label;

                    public final c<q> create(Object obj, c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        DefaultLanguageController$addWord$1(DefaultLanguageController defaultLanguageController, Ref$ObjectRef<String> ref$ObjectRef, c<? super DefaultLanguageController$addWord$1> cVar) {
                            super(2, cVar);
                            this.this$0 = defaultLanguageController;
                            this.$word = ref$ObjectRef;
                        }

                        public final c<q> create(Object obj, c<?> cVar) {
                            return new DefaultLanguageController$addWord$1(this.this$0, this.$word, cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object f4 = a.f();
                            int i4 = this.label;
                            if (i4 == 0) {
                                f.b(obj);
                                CoroutineDispatcher o4 = this.this$0.f10552d;
                                final DefaultLanguageController defaultLanguageController = this.this$0;
                                final Ref$ObjectRef<String> ref$ObjectRef = this.$word;
                                AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
                                this.label = 1;
                                if (C0738g.e(o4, r12, this) == f4) {
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
                            return ((DefaultLanguageController$addWord$1) create(d4, cVar)).invokeSuspend(q.f14567a);
                        }
                    }
