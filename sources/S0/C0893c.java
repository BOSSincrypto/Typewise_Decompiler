package s0;

import F2.m;
import H2.f;
import I2.c;
import I2.e;
import J2.C0;
import J2.C0300f;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.O;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.uuid.Uuid;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\b\u0018\u0000 F2\u00020\u0001:\u0004#73,B}\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0018\u0010\u000f\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0001\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\r\u001a\u00020\u00072\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\"R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\"R \u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010&R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00100\u001a\u0004\b9\u0010:R0\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010<\u0012\u0004\b>\u00100\u001a\u0004\b7\u0010=R \u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00108\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010:R2\u0010\u000f\u001a\u0014\u0012\b\u0012\u00060\u0003j\u0002`\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010<\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010=R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0004¢\u0006\f\n\u0004\bA\u0010-\u0012\u0004\bC\u00100R$\u0010E\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b1\u0010-\u0012\u0004\bD\u00100¨\u0006G"}, d2 = {"Ls0/c;", "", "", "", "standardLanguagesDefault", "toBeRecognizedOnlyLanguagesDefault", "noisyPrefixTechnique", "", "useTFLite", "", "Lch/icoaching/typewise/misc/Language;", "Ls0/c$b;", "languageToModelNames", "useUnknownInLanguageDetection", "Ls0/c$d;", "toBeFilteredOutFullPredictions", "regexesToCleanLangRecognitionText", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;ZLjava/util/Map;Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;ZLjava/util/Map;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "l", "(Ls0/c;LI2/d;LH2/f;)V", "Lkotlin/text/Regex;", "f", "()Ljava/util/List;", "b", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;ZLjava/util/Map;Ljava/util/List;)Ls0/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "getStandardLanguagesDefault$annotations", "()V", "i", "getToBeRecognizedOnlyLanguagesDefault$annotations", "c", "Ljava/lang/String;", "e", "getNoisyPrefixTechnique$annotations", "d", "Z", "j", "()Z", "getUseTFLite$annotations", "Ljava/util/Map;", "()Ljava/util/Map;", "getLanguageToModelNames$annotations", "k", "getUseUnknownInLanguageDetection$annotations", "h", "getToBeFilteredOutFullPredictions$annotations", "getRegexesToCleanLangRecognitionText$annotations", "getRegexesToCleanLangRecognitionTextRegexes$annotations", "regexesToCleanLangRecognitionTextRegexes", "Companion", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
@m
/* renamed from: s0.c  reason: case insensitive filesystem */
public final class C0893c {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final F2.b[] f16299j;

    /* renamed from: a  reason: collision with root package name */
    private final List f16300a;

    /* renamed from: b  reason: collision with root package name */
    private final List f16301b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16302c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16303d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f16304e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16305f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f16306g;

    /* renamed from: h  reason: collision with root package name */
    private final List f16307h;

    /* renamed from: i  reason: collision with root package name */
    private List f16308i;

    /* renamed from: s0.c$a */
    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return C0243c.f16321a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    @m
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 \u00132\u00020\u0001:\u0003\u001d\"\u001fB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010$\u0012\u0004\b&\u0010!\u001a\u0004\b\u001d\u0010%¨\u0006'"}, d2 = {"Ls0/c$b;", "", "", "seen0", "", "wordCompletionModelName", "sentenceCompletionModelName", "Ls0/c$b$a;", "sentenceCompletionCombinationModelSettings", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ls0/c$b$a;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "d", "(Ls0/c$b;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getWordCompletionModelName$annotations", "()V", "b", "getSentenceCompletionModelName$annotations", "Ls0/c$b$a;", "()Ls0/c$b$a;", "getSentenceCompletionCombinationModelSettings$annotations", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    /* renamed from: s0.c$b */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        public static final C0242c f16309d = new C0242c((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f16310a;

        /* renamed from: b  reason: collision with root package name */
        private final String f16311b;

        /* renamed from: c  reason: collision with root package name */
        private final a f16312c;

        @m
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001c\"B;\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Ls0/c$b$a;", "", "", "seen0", "", "queryAllReturnLongest", "", "", "modelNameToInferenceTechnique", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/util/Map;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "d", "(Ls0/c$b$a;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "getQueryAllReturnLongest$annotations", "()V", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "getModelNameToInferenceTechnique$annotations", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        /* renamed from: s0.c$b$a */
        public static final class a {

            /* renamed from: c  reason: collision with root package name */
            public static final C0240b f16313c = new C0240b((i) null);
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public static final F2.b[] f16314d;

            /* renamed from: a  reason: collision with root package name */
            private final Boolean f16315a;

            /* renamed from: b  reason: collision with root package name */
            private final Map f16316b;

            /* renamed from: s0.c$b$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0239a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final C0239a f16317a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f16318b;

                static {
                    C0239a aVar = new C0239a();
                    f16317a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.LanguageModellingConfig.ModelNames.SentenceCompletionCombinationModelSettings", aVar, 2);
                    s0Var.p("query_all_return_longest", true);
                    s0Var.p("model_name_to_inference_technique", false);
                    f16318b = s0Var;
                }

                private C0239a() {
                }

                public final f a() {
                    return f16318b;
                }

                public final F2.b[] c() {
                    F2.b[] a4 = a.f16314d;
                    return new F2.b[]{G2.a.u(C0306i.f706a), a4[1]};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final a b(e eVar) {
                    int i4;
                    Boolean bool;
                    Map map;
                    o.e(eVar, "decoder");
                    f fVar = f16318b;
                    c d4 = eVar.d(fVar);
                    F2.b[] a4 = a.f16314d;
                    if (d4.p()) {
                        bool = (Boolean) d4.m(fVar, 0, C0306i.f706a, (Object) null);
                        map = (Map) d4.E(fVar, 1, a4[1], (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        Map map2 = null;
                        Boolean bool2 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                bool2 = (Boolean) d4.m(fVar, 0, C0306i.f706a, bool2);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                map2 = (Map) d4.E(fVar, 1, a4[1], map2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        map = map2;
                        bool = bool2;
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new a(i4, bool, map, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, a aVar) {
                    o.e(fVar, "encoder");
                    o.e(aVar, "value");
                    f fVar2 = f16318b;
                    I2.d d4 = fVar.d(fVar2);
                    a.d(aVar, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            /* renamed from: s0.c$b$a$b  reason: collision with other inner class name */
            public static final class C0240b {
                private C0240b() {
                }

                public final F2.b serializer() {
                    return C0239a.f16317a;
                }

                public /* synthetic */ C0240b(i iVar) {
                    this();
                }
            }

            static {
                G0 g02 = G0.f622a;
                f16314d = new F2.b[]{null, new O(g02, g02)};
            }

            public /* synthetic */ a(int i4, Boolean bool, Map map, C0 c02) {
                if (2 != (i4 & 2)) {
                    C0317n0.a(i4, 2, C0239a.f16317a.a());
                }
                if ((i4 & 1) == 0) {
                    this.f16315a = null;
                } else {
                    this.f16315a = bool;
                }
                this.f16316b = map;
            }

            public static final /* synthetic */ void d(a aVar, I2.d dVar, f fVar) {
                F2.b[] bVarArr = f16314d;
                if (dVar.n(fVar, 0) || aVar.f16315a != null) {
                    dVar.o(fVar, 0, C0306i.f706a, aVar.f16315a);
                }
                dVar.f(fVar, 1, bVarArr[1], aVar.f16316b);
            }

            public final Map b() {
                return this.f16316b;
            }

            public final Boolean c() {
                return this.f16315a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (o.a(this.f16315a, aVar.f16315a) && o.a(this.f16316b, aVar.f16316b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int i4;
                Boolean bool = this.f16315a;
                if (bool == null) {
                    i4 = 0;
                } else {
                    i4 = bool.hashCode();
                }
                return (i4 * 31) + this.f16316b.hashCode();
            }

            public String toString() {
                Boolean bool = this.f16315a;
                Map map = this.f16316b;
                return "SentenceCompletionCombinationModelSettings(queryAllReturnLongest=" + bool + ", modelNameToInferenceTechnique=" + map + ")";
            }
        }

        /* renamed from: s0.c$b$b  reason: collision with other inner class name */
        public /* synthetic */ class C0241b implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final C0241b f16319a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f16320b;

            static {
                C0241b bVar = new C0241b();
                f16319a = bVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.LanguageModellingConfig.ModelNames", bVar, 3);
                s0Var.p("word_completion_model_name", false);
                s0Var.p("sentence_completion_model_name", false);
                s0Var.p("sentence_completion_combination_model_settings", false);
                f16320b = s0Var;
            }

            private C0241b() {
            }

            public final f a() {
                return f16320b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                return new F2.b[]{g02, G2.a.u(g02), G2.a.u(a.C0239a.f16317a)};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final b b(e eVar) {
                a aVar;
                String str;
                String str2;
                int i4;
                e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f16320b;
                c d4 = eVar2.d(fVar);
                String str3 = null;
                if (d4.p()) {
                    str2 = d4.z(fVar, 0);
                    aVar = (a) d4.m(fVar, 2, a.C0239a.f16317a, (Object) null);
                    str = (String) d4.m(fVar, 1, G0.f622a, (Object) null);
                    i4 = 7;
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    String str4 = null;
                    a aVar2 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            str3 = d4.z(fVar, 0);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            str4 = (String) d4.m(fVar, 1, G0.f622a, str4);
                            i5 |= 2;
                        } else if (e4 == 2) {
                            aVar2 = (a) d4.m(fVar, 2, a.C0239a.f16317a, aVar2);
                            i5 |= 4;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i5;
                    str2 = str3;
                    str = str4;
                    aVar = aVar2;
                }
                d4.c(fVar);
                return new b(i4, str2, str, aVar, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, b bVar) {
                o.e(fVar, "encoder");
                o.e(bVar, "value");
                f fVar2 = f16320b;
                I2.d d4 = fVar.d(fVar2);
                b.d(bVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        /* renamed from: s0.c$b$c  reason: collision with other inner class name */
        public static final class C0242c {
            private C0242c() {
            }

            public final F2.b serializer() {
                return C0241b.f16319a;
            }

            public /* synthetic */ C0242c(i iVar) {
                this();
            }
        }

        public /* synthetic */ b(int i4, String str, String str2, a aVar, C0 c02) {
            if (7 != (i4 & 7)) {
                C0317n0.a(i4, 7, C0241b.f16319a.a());
            }
            this.f16310a = str;
            this.f16311b = str2;
            this.f16312c = aVar;
        }

        public static final /* synthetic */ void d(b bVar, I2.d dVar, f fVar) {
            dVar.p(fVar, 0, bVar.f16310a);
            dVar.o(fVar, 1, G0.f622a, bVar.f16311b);
            dVar.o(fVar, 2, a.C0239a.f16317a, bVar.f16312c);
        }

        public final a a() {
            return this.f16312c;
        }

        public final String b() {
            return this.f16311b;
        }

        public final String c() {
            return this.f16310a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.a(this.f16310a, bVar.f16310a) && o.a(this.f16311b, bVar.f16311b) && o.a(this.f16312c, bVar.f16312c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i4;
            int hashCode = this.f16310a.hashCode() * 31;
            String str = this.f16311b;
            int i5 = 0;
            if (str == null) {
                i4 = 0;
            } else {
                i4 = str.hashCode();
            }
            int i6 = (hashCode + i4) * 31;
            a aVar = this.f16312c;
            if (aVar != null) {
                i5 = aVar.hashCode();
            }
            return i6 + i5;
        }

        public String toString() {
            String str = this.f16310a;
            String str2 = this.f16311b;
            a aVar = this.f16312c;
            return "ModelNames(wordCompletionModelName=" + str + ", sentenceCompletionModelName=" + str2 + ", sentenceCompletionCombinationModelSettings=" + aVar + ")";
        }
    }

    /* renamed from: s0.c$c  reason: collision with other inner class name */
    public /* synthetic */ class C0243c implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final C0243c f16321a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f16322b;

        static {
            C0243c cVar = new C0243c();
            f16321a = cVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.LanguageModellingConfig", cVar, 8);
            s0Var.p("standard_languages_default", false);
            s0Var.p("to_be_recognized_only_languages_default", false);
            s0Var.p("noisy_prefix_technique", false);
            s0Var.p("use_tf_lite", false);
            s0Var.p("lang_to_model_names", false);
            s0Var.p("use_unknown_in_language_detection", false);
            s0Var.p("to_be_filtered_out_full_predictions", false);
            s0Var.p("regexes_to_clean_lang_recognition_text", false);
            f16322b = s0Var;
        }

        private C0243c() {
        }

        public final f a() {
            return f16322b;
        }

        public final F2.b[] c() {
            F2.b[] a4 = C0893c.f16299j;
            F2.b bVar = a4[0];
            F2.b bVar2 = a4[1];
            F2.b bVar3 = a4[4];
            F2.b u3 = G2.a.u(a4[6]);
            F2.b u4 = G2.a.u(a4[7]);
            C0306i iVar = C0306i.f706a;
            return new F2.b[]{bVar, bVar2, G0.f622a, iVar, bVar3, iVar, u3, u4};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.Map} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.Map} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final s0.C0893c b(I2.e r30) {
            /*
                r29 = this;
                r0 = r30
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f16322b
                I2.c r0 = r0.d(r1)
                F2.b[] r2 = s0.C0893c.f16299j
                boolean r3 = r0.p()
                r4 = 5
                r5 = 3
                r6 = 2
                r7 = 7
                r8 = 6
                r9 = 4
                r10 = 1
                r11 = 0
                r12 = 0
                if (r3 == 0) goto L_0x006a
                r3 = r2[r11]
                java.lang.Object r3 = r0.E(r1, r11, r3, r12)
                java.util.List r3 = (java.util.List) r3
                r11 = r2[r10]
                java.lang.Object r10 = r0.E(r1, r10, r11, r12)
                java.util.List r10 = (java.util.List) r10
                java.lang.String r6 = r0.z(r1, r6)
                boolean r5 = r0.n(r1, r5)
                r11 = r2[r9]
                java.lang.Object r9 = r0.E(r1, r9, r11, r12)
                java.util.Map r9 = (java.util.Map) r9
                boolean r4 = r0.n(r1, r4)
                r11 = r2[r8]
                java.lang.Object r8 = r0.m(r1, r8, r11, r12)
                java.util.Map r8 = (java.util.Map) r8
                r2 = r2[r7]
                java.lang.Object r2 = r0.m(r1, r7, r2, r12)
                java.util.List r2 = (java.util.List) r2
                r7 = 255(0xff, float:3.57E-43)
                r27 = r2
                r20 = r3
                r25 = r4
                r23 = r5
                r22 = r6
                r19 = r7
                r26 = r8
                r24 = r9
                r21 = r10
                goto L_0x00f5
            L_0x006a:
                r17 = r10
                r3 = r11
                r13 = r3
                r6 = r12
                r10 = r6
                r14 = r10
                r15 = r14
                r16 = r15
                r11 = r16
                r12 = r13
            L_0x0077:
                if (r17 == 0) goto L_0x00e3
                int r5 = r0.e(r1)
                switch(r5) {
                    case -1: goto L_0x00df;
                    case 0: goto L_0x00d2;
                    case 1: goto L_0x00c4;
                    case 2: goto L_0x00ba;
                    case 3: goto L_0x00b2;
                    case 4: goto L_0x00a6;
                    case 5: goto L_0x009f;
                    case 6: goto L_0x0093;
                    case 7: goto L_0x0086;
                    default: goto L_0x0080;
                }
            L_0x0080:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r5)
                throw r0
            L_0x0086:
                r5 = r2[r7]
                java.lang.Object r5 = r0.m(r1, r7, r5, r6)
                r6 = r5
                java.util.List r6 = (java.util.List) r6
                r13 = r13 | 128(0x80, float:1.794E-43)
            L_0x0091:
                r5 = 3
                goto L_0x0077
            L_0x0093:
                r5 = r2[r8]
                java.lang.Object r5 = r0.m(r1, r8, r5, r10)
                r10 = r5
                java.util.Map r10 = (java.util.Map) r10
                r13 = r13 | 64
                goto L_0x0091
            L_0x009f:
                boolean r3 = r0.n(r1, r4)
                r13 = r13 | 32
                goto L_0x0091
            L_0x00a6:
                r5 = r2[r9]
                java.lang.Object r5 = r0.E(r1, r9, r5, r11)
                r11 = r5
                java.util.Map r11 = (java.util.Map) r11
                r13 = r13 | 16
                goto L_0x0091
            L_0x00b2:
                r5 = 3
                boolean r12 = r0.n(r1, r5)
                r13 = r13 | 8
                goto L_0x0077
            L_0x00ba:
                r4 = 2
                r5 = 3
                java.lang.String r16 = r0.z(r1, r4)
                r13 = r13 | 4
                r4 = 5
                goto L_0x0077
            L_0x00c4:
                r4 = 1
                r5 = r2[r4]
                java.lang.Object r5 = r0.E(r1, r4, r5, r15)
                r15 = r5
                java.util.List r15 = (java.util.List) r15
                r13 = r13 | 2
            L_0x00d0:
                r4 = 5
                goto L_0x0091
            L_0x00d2:
                r5 = 0
                r4 = r2[r5]
                java.lang.Object r4 = r0.E(r1, r5, r4, r14)
                r14 = r4
                java.util.List r14 = (java.util.List) r14
                r13 = r13 | 1
                goto L_0x00d0
            L_0x00df:
                r5 = 0
                r17 = r5
                goto L_0x0091
            L_0x00e3:
                r25 = r3
                r27 = r6
                r26 = r10
                r24 = r11
                r23 = r12
                r19 = r13
                r20 = r14
                r21 = r15
                r22 = r16
            L_0x00f5:
                r0.c(r1)
                s0.c r0 = new s0.c
                r28 = 0
                r18 = r0
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.C0893c.C0243c.b(I2.e):s0.c");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, C0893c cVar) {
            o.e(fVar, "encoder");
            o.e(cVar, "value");
            f fVar2 = f16322b;
            I2.d d4 = fVar.d(fVar2);
            C0893c.l(cVar, d4, fVar2);
            d4.c(fVar2);
        }
    }

    @m
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012!B;\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Ls0/c$d;", "", "", "seen0", "", "", "stringFilters", "regexFilters", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "a", "(Ls0/c$d;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "getStringFilters$annotations", "()V", "b", "c", "getRegexFilters$annotations", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    /* renamed from: s0.c$d */
    public static final class d {

        /* renamed from: c  reason: collision with root package name */
        public static final b f16323c = new b((i) null);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final F2.b[] f16324d;

        /* renamed from: a  reason: collision with root package name */
        private final List f16325a;

        /* renamed from: b  reason: collision with root package name */
        private final List f16326b;

        /* renamed from: s0.c$d$a */
        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16327a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f16328b;

            static {
                a aVar = new a();
                f16327a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.LanguageModellingConfig.PredictionsFilters", aVar, 2);
                s0Var.p("string_filters", false);
                s0Var.p("regex_filters", false);
                f16328b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f16328b;
            }

            public final F2.b[] c() {
                F2.b[] b4 = d.f16324d;
                return new F2.b[]{G2.a.u(b4[0]), G2.a.u(b4[1])};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final d b(e eVar) {
                int i4;
                List list;
                List list2;
                o.e(eVar, "decoder");
                f fVar = f16328b;
                c d4 = eVar.d(fVar);
                F2.b[] b4 = d.f16324d;
                if (d4.p()) {
                    list = (List) d4.m(fVar, 0, b4[0], (Object) null);
                    list2 = (List) d4.m(fVar, 1, b4[1], (Object) null);
                    i4 = 3;
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    List list3 = null;
                    List list4 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            list4 = (List) d4.m(fVar, 0, b4[0], list4);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            list3 = (List) d4.m(fVar, 1, b4[1], list3);
                            i5 |= 2;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    list2 = list3;
                    list = list4;
                    i4 = i5;
                }
                d4.c(fVar);
                return new d(i4, list, list2, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, d dVar) {
                o.e(fVar, "encoder");
                o.e(dVar, "value");
                f fVar2 = f16328b;
                I2.d d4 = fVar.d(fVar2);
                d.a(dVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        /* renamed from: s0.c$d$b */
        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f16327a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        static {
            G0 g02 = G0.f622a;
            f16324d = new F2.b[]{new C0300f(g02), new C0300f(g02)};
        }

        public /* synthetic */ d(int i4, List list, List list2, C0 c02) {
            if (3 != (i4 & 3)) {
                C0317n0.a(i4, 3, a.f16327a.a());
            }
            this.f16325a = list;
            this.f16326b = list2;
        }

        public static final /* synthetic */ void a(d dVar, I2.d dVar2, f fVar) {
            F2.b[] bVarArr = f16324d;
            dVar2.o(fVar, 0, bVarArr[0], dVar.f16325a);
            dVar2.o(fVar, 1, bVarArr[1], dVar.f16326b);
        }

        public final List c() {
            return this.f16326b;
        }

        public final List d() {
            return this.f16325a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (o.a(this.f16325a, dVar.f16325a) && o.a(this.f16326b, dVar.f16326b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i4;
            List list = this.f16325a;
            int i5 = 0;
            if (list == null) {
                i4 = 0;
            } else {
                i4 = list.hashCode();
            }
            int i6 = i4 * 31;
            List list2 = this.f16326b;
            if (list2 != null) {
                i5 = list2.hashCode();
            }
            return i6 + i5;
        }

        public String toString() {
            List list = this.f16325a;
            List list2 = this.f16326b;
            return "PredictionsFilters(stringFilters=" + list + ", regexFilters=" + list2 + ")";
        }
    }

    static {
        G0 g02 = G0.f622a;
        f16299j = new F2.b[]{new C0300f(g02), new C0300f(g02), null, null, new O(g02, b.C0241b.f16319a), null, new O(g02, d.a.f16327a), new C0300f(g02)};
    }

    public /* synthetic */ C0893c(int i4, List list, List list2, String str, boolean z3, Map map, boolean z4, Map map2, List list3, C0 c02) {
        if (255 != (i4 & 255)) {
            C0317n0.a(i4, 255, C0243c.f16321a.a());
        }
        this.f16300a = list;
        this.f16301b = list2;
        this.f16302c = str;
        this.f16303d = z3;
        this.f16304e = map;
        this.f16305f = z4;
        this.f16306g = map2;
        this.f16307h = list3;
        this.f16308i = null;
    }

    public static /* synthetic */ C0893c c(C0893c cVar, List list, List list2, String str, boolean z3, Map map, boolean z4, Map map2, List list3, int i4, Object obj) {
        List list4;
        List list5;
        String str2;
        boolean z5;
        Map map3;
        boolean z6;
        Map map4;
        List list6;
        C0893c cVar2 = cVar;
        int i5 = i4;
        if ((i5 & 1) != 0) {
            list4 = cVar2.f16300a;
        } else {
            list4 = list;
        }
        if ((i5 & 2) != 0) {
            list5 = cVar2.f16301b;
        } else {
            list5 = list2;
        }
        if ((i5 & 4) != 0) {
            str2 = cVar2.f16302c;
        } else {
            str2 = str;
        }
        if ((i5 & 8) != 0) {
            z5 = cVar2.f16303d;
        } else {
            z5 = z3;
        }
        if ((i5 & 16) != 0) {
            map3 = cVar2.f16304e;
        } else {
            map3 = map;
        }
        if ((i5 & 32) != 0) {
            z6 = cVar2.f16305f;
        } else {
            z6 = z4;
        }
        if ((i5 & 64) != 0) {
            map4 = cVar2.f16306g;
        } else {
            map4 = map2;
        }
        if ((i5 & Uuid.SIZE_BITS) != 0) {
            list6 = cVar2.f16307h;
        } else {
            list6 = list3;
        }
        return cVar.b(list4, list5, str2, z5, map3, z6, map4, list6);
    }

    public static final /* synthetic */ void l(C0893c cVar, I2.d dVar, f fVar) {
        F2.b[] bVarArr = f16299j;
        dVar.f(fVar, 0, bVarArr[0], cVar.f16300a);
        dVar.f(fVar, 1, bVarArr[1], cVar.f16301b);
        dVar.p(fVar, 2, cVar.f16302c);
        dVar.j(fVar, 3, cVar.f16303d);
        dVar.f(fVar, 4, bVarArr[4], cVar.f16304e);
        dVar.j(fVar, 5, cVar.f16305f);
        dVar.o(fVar, 6, bVarArr[6], cVar.f16306g);
        dVar.o(fVar, 7, bVarArr[7], cVar.f16307h);
    }

    public final C0893c b(List list, List list2, String str, boolean z3, Map map, boolean z4, Map map2, List list3) {
        o.e(list, "standardLanguagesDefault");
        o.e(list2, "toBeRecognizedOnlyLanguagesDefault");
        o.e(str, "noisyPrefixTechnique");
        o.e(map, "languageToModelNames");
        return new C0893c(list, list2, str, z3, map, z4, map2, list3);
    }

    public final Map d() {
        return this.f16304e;
    }

    public final String e() {
        return this.f16302c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893c)) {
            return false;
        }
        C0893c cVar = (C0893c) obj;
        if (o.a(this.f16300a, cVar.f16300a) && o.a(this.f16301b, cVar.f16301b) && o.a(this.f16302c, cVar.f16302c) && this.f16303d == cVar.f16303d && o.a(this.f16304e, cVar.f16304e) && this.f16305f == cVar.f16305f && o.a(this.f16306g, cVar.f16306g) && o.a(this.f16307h, cVar.f16307h)) {
            return true;
        }
        return false;
    }

    public final List f() {
        List<String> list = this.f16307h;
        if (list == null) {
            return null;
        }
        if (this.f16308i == null) {
            ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
            for (String regex : list) {
                arrayList.add(new Regex(regex));
            }
            this.f16308i = arrayList;
        }
        return this.f16308i;
    }

    public final List g() {
        return this.f16300a;
    }

    public final Map h() {
        return this.f16306g;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((((((((((this.f16300a.hashCode() * 31) + this.f16301b.hashCode()) * 31) + this.f16302c.hashCode()) * 31) + androidx.work.c.a(this.f16303d)) * 31) + this.f16304e.hashCode()) * 31) + androidx.work.c.a(this.f16305f)) * 31;
        Map map = this.f16306g;
        int i5 = 0;
        if (map == null) {
            i4 = 0;
        } else {
            i4 = map.hashCode();
        }
        int i6 = (hashCode + i4) * 31;
        List list = this.f16307h;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i6 + i5;
    }

    public final List i() {
        return this.f16301b;
    }

    public final boolean j() {
        return this.f16303d;
    }

    public final boolean k() {
        return this.f16305f;
    }

    public String toString() {
        List list = this.f16300a;
        List list2 = this.f16301b;
        String str = this.f16302c;
        boolean z3 = this.f16303d;
        Map map = this.f16304e;
        boolean z4 = this.f16305f;
        Map map2 = this.f16306g;
        List list3 = this.f16307h;
        return "LanguageModellingConfig(standardLanguagesDefault=" + list + ", toBeRecognizedOnlyLanguagesDefault=" + list2 + ", noisyPrefixTechnique=" + str + ", useTFLite=" + z3 + ", languageToModelNames=" + map + ", useUnknownInLanguageDetection=" + z4 + ", toBeFilteredOutFullPredictions=" + map2 + ", regexesToCleanLangRecognitionText=" + list3 + ")";
    }

    public C0893c(List list, List list2, String str, boolean z3, Map map, boolean z4, Map map2, List list3) {
        o.e(list, "standardLanguagesDefault");
        o.e(list2, "toBeRecognizedOnlyLanguagesDefault");
        o.e(str, "noisyPrefixTechnique");
        o.e(map, "languageToModelNames");
        this.f16300a = list;
        this.f16301b = list2;
        this.f16302c = str;
        this.f16303d = z3;
        this.f16304e = map;
        this.f16305f = z4;
        this.f16306g = map2;
        this.f16307h = list3;
    }
}
