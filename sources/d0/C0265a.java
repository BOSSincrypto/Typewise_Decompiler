package D0;

import D0.h0;
import E0.r;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt;
import ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel;
import ch.icoaching.typewise.language_modelling.preprocessing.a;
import ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult;
import ch.icoaching.typewise.word_lists.c;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.l;
import l2.q;
import y0.C0945b;

/* renamed from: D0.a  reason: case insensitive filesystem */
public final class C0265a extends Inference {

    /* renamed from: q  reason: collision with root package name */
    public static final C0002a f256q = new C0002a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Regex f257r = new Regex(".*reqprefcert(\\d.\\d*)");

    /* renamed from: m  reason: collision with root package name */
    private final SentenceCompletionNaiveModel f258m;

    /* renamed from: n  reason: collision with root package name */
    private final float f259n;

    /* renamed from: o  reason: collision with root package name */
    private final float f260o;

    /* renamed from: p  reason: collision with root package name */
    private final c f261p;

    /* renamed from: D0.a$a  reason: collision with other inner class name */
    public static final class C0002a extends Inference.InferenceCompanion {
        private C0002a() {
        }

        /* renamed from: d */
        public C0265a b(h0 h0Var, V v3, a aVar, c cVar) {
            boolean z3;
            V v4 = v3;
            o.e(h0Var, "config");
            o.e(v4, "model");
            o.e(cVar, "wordListRepository");
            if (v4 instanceof SentenceCompletionNaiveModel) {
                h0.c a4 = h0Var.a();
                String j4 = a4.j();
                float a5 = C0945b.a(j4, 1.0f);
                Boolean g4 = a4.g();
                if (g4 != null) {
                    z3 = g4.booleanValue();
                } else {
                    z3 = true;
                }
                boolean z4 = z3;
                Float e4 = e(j4);
                if (e4 == null) {
                    e.l(e.f8233a, "SentenceInferenceNaiveModel", "Please add \"reqprefcert\" parameter to inference string declaration and update the model. It will default to 20.0", (Throwable) null, 4, (Object) null);
                    e4 = Float.valueOf(20.0f);
                }
                e eVar = e.f8233a;
                e.b(eVar, "SentenceInferenceNaiveModel", "Using required_certainty_for_prefix_length = " + e4, (Throwable) null, 4, (Object) null);
                r a6 = a(j4);
                Integer num = (Integer) a6.a();
                Float f4 = (Float) a6.b();
                Float f5 = (Float) a6.c();
                boolean booleanValue = ((Boolean) a6.d()).booleanValue();
                Inference.a aVar2 = Inference.f8354k;
                boolean e5 = aVar2.e(j4);
                if (e5) {
                    e.l(eVar, "SentenceInferenceNaiveModel", "Filtering predictions that are not in vocab when using sentence inference naive model, why not filter at train time?", (Throwable) null, 4, (Object) null);
                }
                boolean d4 = aVar2.d(j4);
                if (d4) {
                    e.l(eVar, "SentenceInferenceNaiveModel", "Filtering predictions that are in blocklist when using sentence inference naive model, why not filter at train time?", (Throwable) null, 4, (Object) null);
                }
                return new C0265a(ModelsFilesHandlingKt.h(h0Var), (SentenceCompletionNaiveModel) v4, a5, e4.floatValue(), num, f4, f5, z4, e5, d4, booleanValue, U.f249a.c(j4), cVar);
            }
            throw new IllegalArgumentException("SentenceInferenceNaiveModel requires a SentenceCompletionNaiveModel");
        }

        public final Float e(String str) {
            List a4;
            String str2;
            o.e(str, "strDeclaration");
            l find$default = Regex.find$default(C0265a.f257r, str, 0, 2, (Object) null);
            if (find$default == null || (a4 = find$default.a()) == null || (str2 = (String) a4.get(1)) == null) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str2));
        }

        public /* synthetic */ C0002a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0265a(String str, SentenceCompletionNaiveModel sentenceCompletionNaiveModel, float f4, float f5, Integer num, Float f6, Float f7, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, c cVar) {
        super(str, z3, z4, num, f6, f7, z5, Boolean.valueOf(z6), z7, cVar);
        SentenceCompletionNaiveModel sentenceCompletionNaiveModel2 = sentenceCompletionNaiveModel;
        c cVar2 = cVar;
        o.e(str, "languageCode");
        o.e(sentenceCompletionNaiveModel2, "lm");
        o.e(cVar2, "wordListRepository");
        this.f258m = sentenceCompletionNaiveModel2;
        this.f259n = f4;
        this.f260o = f5;
        this.f261p = cVar2;
    }

    public Object b(String str, String str2, Float f4, Integer num, String str3, kotlin.coroutines.c cVar) {
        float f5;
        LMInferenceResult lMInferenceResult = new LMInferenceResult((List) this.f258m.n(C0718m.e(str), this.f260o).get(0), this.f258m.f() - this.f258m.f(), (List) null, 4, (i) null);
        if (f4 != null) {
            f5 = f4.floatValue();
        } else {
            f5 = this.f259n;
        }
        return lMInferenceResult.s(f5);
    }

    public Object h(kotlin.coroutines.c cVar) {
        Object b4 = this.f258m.b(cVar);
        if (b4 == kotlin.coroutines.intrinsics.a.f()) {
            return b4;
        }
        return q.f14567a;
    }
}
