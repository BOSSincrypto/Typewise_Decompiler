package ch.icoaching.wrio.prediction;

import android.view.inputmethod.EditorInfo;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.typewise.b;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.input.j;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.prediction.d;
import i2.C0680a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.g0;
import l2.q;
import u2.p;

public final class DefaultPredictionsController implements d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f10603a;

    /* renamed from: b  reason: collision with root package name */
    private final C0680a f10604b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AILibrarySingletonProvider f10605c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ch.icoaching.wrio.tutorialmode.a f10606d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineDispatcher f10607e;

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineDispatcher f10608f;

    /* renamed from: g  reason: collision with root package name */
    private final D f10609g;

    /* renamed from: h  reason: collision with root package name */
    private d.a f10610h;

    /* renamed from: i  reason: collision with root package name */
    private a f10611i;

    /* renamed from: j  reason: collision with root package name */
    private GetPredictionsUseCase f10612j;

    /* renamed from: k  reason: collision with root package name */
    private j f10613k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public b f10614l;

    /* renamed from: m  reason: collision with root package name */
    private EditorInfo f10615m;

    @kotlin.coroutines.jvm.internal.d(c = "ch.icoaching.wrio.prediction.DefaultPredictionsController$1", f = "DefaultPredictionsController.kt", l = {43}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.prediction.DefaultPredictionsController$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;
        final /* synthetic */ DefaultPredictionsController this$0;

        {
            this.this$0 = r1;
        }

        public final kotlin.coroutines.c<q> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                b o4 = this.this$0.f10614l;
                if (o4 != null) {
                    String b4 = this.this$0.f10606d.b();
                    List j4 = this.this$0.f10603a.j();
                    List g4 = this.this$0.f10603a.g();
                    this.label = 1;
                    if (o4.f(b4, j4, g4, this) == f4) {
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

        public final Object invoke(String str, kotlin.coroutines.c<? super q> cVar) {
            return ((AnonymousClass1) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f10616a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10617b;

        public a(String str, int i4) {
            o.e(str, "content");
            this.f10616a = str;
            this.f10617b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.a(this.f10616a, aVar.f10616a) && this.f10617b == aVar.f10617b;
        }

        public int hashCode() {
            return (this.f10616a.hashCode() * 31) + this.f10617b;
        }

        public String toString() {
            return "OnContentChangeEvent(content=" + this.f10616a + ", cursorPosition=" + this.f10617b + ')';
        }
    }

    public DefaultPredictionsController(c cVar, C0680a aVar, AILibrarySingletonProvider aILibrarySingletonProvider, ch.icoaching.wrio.tutorialmode.a aVar2, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, D d4) {
        o.e(cVar, "languageSettings");
        o.e(aVar, "defaultSharedPreferences");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        o.e(aVar2, "tutorialModeCompat");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "backgroundDispatcher");
        o.e(d4, "coroutineScope");
        this.f10603a = cVar;
        this.f10604b = aVar;
        this.f10605c = aILibrarySingletonProvider;
        this.f10606d = aVar2;
        this.f10607e = coroutineDispatcher;
        this.f10608f = coroutineDispatcher2;
        this.f10609g = d4;
        e.j(e.k(aVar2.c(), new AnonymousClass1(this, (kotlin.coroutines.c<? super AnonymousClass1>) null)), d4);
    }

    /* access modifiers changed from: private */
    public final void i(GetPredictionsUseCase.b bVar) {
        Log log = Log.f10572a;
        StringBuilder sb = new StringBuilder();
        sb.append("onResult() :: ");
        sb.append(bVar.a());
        sb.append(", '");
        sb.append(bVar.c());
        sb.append("', ");
        List<PredictionsResult.Candidate> b4 = bVar.b();
        ArrayList arrayList = new ArrayList(C0718m.t(b4, 10));
        for (PredictionsResult.Candidate f4 : b4) {
            arrayList.add(f4.f());
        }
        sb.append(arrayList);
        Log.d(log, "DefaultPredictionController", sb.toString(), (Throwable) null, 4, (Object) null);
        d.a aVar = this.f10610h;
        if (aVar != null) {
            aVar.a(bVar.a(), bVar.c(), bVar.d(), bVar.b());
        }
    }

    private final void m(String str, int i4) {
        EditorInfo editorInfo;
        b bVar;
        j jVar = this.f10613k;
        if (jVar != null && (editorInfo = this.f10615m) != null && (bVar = this.f10614l) != null) {
            GetPredictionsUseCase.a aVar = new GetPredictionsUseCase.a(str, i4);
            GetPredictionsUseCase getPredictionsUseCase = this.f10612j;
            if (getPredictionsUseCase != null) {
                getPredictionsUseCase.c();
            }
            GetPredictionsUseCase getPredictionsUseCase2 = new GetPredictionsUseCase(editorInfo, jVar, bVar, this.f10603a, this.f10604b, this.f10606d, this.f10609g, this.f10607e, this.f10608f);
            getPredictionsUseCase2.d(aVar, new DefaultPredictionsController$fetchPredictions$1$1(this));
            this.f10612j = getPredictionsUseCase2;
        }
    }

    public void a() {
        this.f10615m = null;
        this.f10613k = null;
    }

    public void b() {
        g0 unused = C0739h.d(this.f10609g, (CoroutineContext) null, (CoroutineStart) null, new DefaultPredictionsController$onCreate$1(this, (kotlin.coroutines.c<? super DefaultPredictionsController$onCreate$1>) null), 3, (Object) null);
    }

    public void c(String str) {
        o.e(str, "word");
        b bVar = this.f10614l;
        if (bVar != null) {
            bVar.c(str);
        }
    }

    public void d(d.a aVar) {
        this.f10610h = aVar;
    }

    public void e() {
        this.f10611i = null;
        g0 unused = C0739h.d(this.f10609g, (CoroutineContext) null, (CoroutineStart) null, new DefaultPredictionsController$onDestroy$1(this, (kotlin.coroutines.c<? super DefaultPredictionsController$onDestroy$1>) null), 3, (Object) null);
    }

    public void f(EditorInfo editorInfo, j jVar) {
        o.e(editorInfo, "editorInfo");
        o.e(jVar, "inputSession");
        this.f10613k = jVar;
        this.f10615m = editorInfo;
    }

    public void g(String str, int i4) {
        o.e(str, "content");
        Log log = Log.f10572a;
        Log.d(log, "DefaultPredictionController", "onContentChanged() :: '" + I.a(str, Integer.valueOf(i4)) + "', " + i4, (Throwable) null, 4, (Object) null);
        a aVar = new a(str, i4);
        if (!o.a(aVar, this.f10611i)) {
            this.f10611i = aVar;
            m(str, i4);
        }
    }
}
