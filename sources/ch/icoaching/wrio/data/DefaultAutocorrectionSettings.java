package ch.icoaching.wrio.data;

import ch.icoaching.wrio.autocorrect.AutoCapitalizationState;
import ch.icoaching.wrio.subscription.a;
import i2.C0680a;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import l2.q;
import u2.p;

public final class DefaultAutocorrectionSettings implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0680a f9342a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9343b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f9344c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f9345d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f9346e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AutoCapitalizationState f9347f;

    @d(c = "ch.icoaching.wrio.data.DefaultAutocorrectionSettings$2", f = "DefaultAutocorrectionSettings.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.data.DefaultAutocorrectionSettings$2  reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultAutocorrectionSettings this$0;

        {
            this.this$0 = r1;
        }

        public final c<q> create(Object obj, c<?> cVar) {
            AnonymousClass2 r02 = new AnonymousClass2(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label == 0) {
                f.b(obj);
                String str = (String) this.L$0;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 732062513) {
                        if (hashCode != 887779227) {
                            if (hashCode != 1301722390) {
                                if (hashCode == 1424676287 && str.equals("settings_autocorrect")) {
                                    DefaultAutocorrectionSettings defaultAutocorrectionSettings = this.this$0;
                                    defaultAutocorrectionSettings.f9345d = defaultAutocorrectionSettings.f9342a.w();
                                }
                            } else if (str.equals("flickdown_to_undo")) {
                                DefaultAutocorrectionSettings defaultAutocorrectionSettings2 = this.this$0;
                                defaultAutocorrectionSettings2.f9344c = defaultAutocorrectionSettings2.f9342a.A0();
                            }
                        } else if (str.equals("settings_autospace")) {
                            DefaultAutocorrectionSettings defaultAutocorrectionSettings3 = this.this$0;
                            defaultAutocorrectionSettings3.f9346e = defaultAutocorrectionSettings3.f9342a.v();
                        }
                    } else if (str.equals("settings_autocaps_level")) {
                        DefaultAutocorrectionSettings defaultAutocorrectionSettings4 = this.this$0;
                        defaultAutocorrectionSettings4.f9347f = ch.icoaching.wrio.autocorrect.a.a(defaultAutocorrectionSettings4.f9342a.H());
                    }
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, c<? super q> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    public DefaultAutocorrectionSettings(D d4, C0680a aVar, a aVar2) {
        o.e(d4, "applicationCoroutineScope");
        o.e(aVar, "defaultSharedPreferences");
        o.e(aVar2, "subscriptionChecker");
        this.f9342a = aVar;
        this.f9343b = aVar2;
        this.f9344c = aVar.A0();
        this.f9345d = aVar.w();
        this.f9346e = aVar.v();
        this.f9347f = ch.icoaching.wrio.autocorrect.a.a(aVar.H());
        e.j(e.k(new DefaultAutocorrectionSettings$special$$inlined$filter$1(aVar.J0()), new AnonymousClass2(this, (c<? super AnonymousClass2>) null)), d4);
    }

    public AutoCapitalizationState a() {
        return this.f9347f;
    }

    public void b(boolean z3) {
        this.f9342a.l0(z3);
    }

    public boolean c() {
        if (!this.f9344c || !this.f9343b.b()) {
            return false;
        }
        return true;
    }

    public kotlinx.coroutines.flow.c d() {
        return new DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$map$1(new DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1(this.f9342a.J0()), this);
    }

    public kotlinx.coroutines.flow.c e() {
        return new DefaultAutocorrectionSettings$observeIsDominantLanguageDataLoadedChanges$$inlined$map$1(new DefaultAutocorrectionSettings$observeIsDominantLanguageDataLoadedChanges$$inlined$filter$1(this.f9342a.J0()), this);
    }

    public boolean f() {
        return this.f9346e;
    }

    public boolean g() {
        return this.f9345d;
    }

    public boolean m() {
        return this.f9342a.Q();
    }
}
