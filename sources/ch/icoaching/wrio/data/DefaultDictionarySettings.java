package ch.icoaching.wrio.data;

import i2.C0680a;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import l2.q;
import u2.p;

public final class DefaultDictionarySettings implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0680a f9362a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f9363b;

    @d(c = "ch.icoaching.wrio.data.DefaultDictionarySettings$2", f = "DefaultDictionarySettings.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.data.DefaultDictionarySettings$2  reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultDictionarySettings this$0;

        {
            this.this$0 = r1;
        }

        public final c<q> create(Object obj, c<?> cVar) {
            AnonymousClass2 r02 = new AnonymousClass2(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                if (o.a((String) this.L$0, "do_run_integrity_check")) {
                    DefaultDictionarySettings defaultDictionarySettings = this.this$0;
                    defaultDictionarySettings.f9363b = defaultDictionarySettings.f9362a.v0();
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, c<? super q> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    public DefaultDictionarySettings(D d4, C0680a aVar) {
        o.e(d4, "applicationCoroutineScope");
        o.e(aVar, "defaultSharedPreferences");
        this.f9362a = aVar;
        this.f9363b = aVar.v0();
        e.j(e.k(new DefaultDictionarySettings$special$$inlined$filter$1(aVar.J0()), new AnonymousClass2(this, (c<? super AnonymousClass2>) null)), d4);
    }

    public boolean a() {
        return this.f9363b;
    }

    public void c(boolean z3) {
        this.f9362a.i0(z3);
    }
}
