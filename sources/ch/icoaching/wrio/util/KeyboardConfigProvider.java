package ch.icoaching.wrio.util;

import K2.C0341a;
import android.content.Context;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.keyboard.layout.Layout;
import ch.icoaching.wrio.keyboard.model.config.JsonConfig;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import l2.q;
import u2.p;

public final class KeyboardConfigProvider {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final j f10687a = o.b(0, 0, (BufferOverflow) null, 7, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public JsonConfig f10688b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Layout f10689c;

    @d(c = "ch.icoaching.wrio.util.KeyboardConfigProvider$1", f = "KeyboardConfigProvider.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lch/icoaching/wrio/keyboard/layout/Layout;", "it", "Ll2/q;", "<anonymous>", "(Lch/icoaching/wrio/keyboard/layout/Layout;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.util.KeyboardConfigProvider$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ KeyboardConfigProvider this$0;

        {
            this.this$0 = r1;
        }

        public final kotlin.coroutines.c<q> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, context, aVar, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(Layout layout, kotlin.coroutines.c<? super q> cVar) {
            return ((AnonymousClass1) create(layout, cVar)).invokeSuspend(q.f14567a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                Layout layout = (Layout) this.L$0;
                if (layout != this.this$0.f10689c) {
                    this.this$0.f10689c = layout;
                    KeyboardConfigProvider keyboardConfigProvider = this.this$0;
                    keyboardConfigProvider.f10688b = f.c(f.d(keyboardConfigProvider.f10689c), context, aVar);
                    j g4 = this.this$0.f10687a;
                    JsonConfig e4 = this.this$0.f10688b;
                    this.label = 1;
                    if (g4.emit(e4, this) == f4) {
                        return f4;
                    }
                }
            } else if (i4 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return q.f14567a;
        }
    }

    public KeyboardConfigProvider(final Context context, c cVar, final C0341a aVar, D d4) {
        kotlin.jvm.internal.o.e(context, "context");
        kotlin.jvm.internal.o.e(cVar, "languageSettings");
        kotlin.jvm.internal.o.e(aVar, "json");
        kotlin.jvm.internal.o.e(d4, "coroutineScope");
        Layout k4 = cVar.k();
        this.f10689c = k4;
        this.f10688b = f.c(f.d(k4), context, aVar);
        e.j(e.k(cVar.a(), new AnonymousClass1(this, (kotlin.coroutines.c<? super AnonymousClass1>) null)), d4);
    }

    public final JsonConfig b() {
        return this.f10688b;
    }

    public final n f() {
        return this.f10687a;
    }
}
