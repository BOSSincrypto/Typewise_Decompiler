package D0;

import F2.m;
import H2.f;
import J2.C0;
import J2.C0300f;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 \u00152\u00020\u0001:\u0005\u0017\u0015+$\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b\"\u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LD0/h0;", "", "LD0/h0$d;", "model", "LD0/h0$c;", "inference", "LD0/h0$e;", "preprocessing", "<init>", "(LD0/h0$d;LD0/h0$c;LD0/h0$e;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILD0/h0$d;LD0/h0$c;LD0/h0$e;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "d", "(LD0/h0;LI2/d;LH2/f;)V", "b", "(LD0/h0$d;LD0/h0$c;LD0/h0$e;)LD0/h0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LD0/h0$d;", "e", "()LD0/h0$d;", "getModel$annotations", "()V", "LD0/h0$c;", "()LD0/h0$c;", "getInference$annotations", "c", "LD0/h0$e;", "f", "()LD0/h0$e;", "getPreprocessing$annotations", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
@m
public final class h0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b f278d = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f279a;

    /* renamed from: b  reason: collision with root package name */
    private final c f280b;

    /* renamed from: c  reason: collision with root package name */
    private final e f281c;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f282a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f283b;

        static {
            a aVar = new a();
            f282a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.PredictionsTFModelConfig", aVar, 3);
            s0Var.p("model", false);
            s0Var.p("inference", false);
            s0Var.p("preprocessing", false);
            f283b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f283b;
        }

        public final F2.b[] c() {
            return new F2.b[]{d.a.f309a, c.a.f297a, e.a.f322a};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final h0 b(I2.e eVar) {
            e eVar2;
            c cVar;
            d dVar;
            int i4;
            I2.e eVar3 = eVar;
            o.e(eVar3, "decoder");
            f fVar = f283b;
            I2.c d4 = eVar3.d(fVar);
            d dVar2 = null;
            if (d4.p()) {
                dVar = (d) d4.E(fVar, 0, d.a.f309a, (Object) null);
                eVar2 = (e) d4.E(fVar, 2, e.a.f322a, (Object) null);
                cVar = (c) d4.E(fVar, 1, c.a.f297a, (Object) null);
                i4 = 7;
            } else {
                boolean z3 = true;
                int i5 = 0;
                c cVar2 = null;
                e eVar4 = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        dVar2 = (d) d4.E(fVar, 0, d.a.f309a, dVar2);
                        i5 |= 1;
                    } else if (e4 == 1) {
                        cVar2 = (c) d4.E(fVar, 1, c.a.f297a, cVar2);
                        i5 |= 2;
                    } else if (e4 == 2) {
                        eVar4 = (e) d4.E(fVar, 2, e.a.f322a, eVar4);
                        i5 |= 4;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                i4 = i5;
                dVar = dVar2;
                cVar = cVar2;
                eVar2 = eVar4;
            }
            d4.c(fVar);
            return new h0(i4, dVar, cVar, eVar2, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, h0 h0Var) {
            o.e(fVar, "encoder");
            o.e(h0Var, "value");
            f fVar2 = f283b;
            I2.d d4 = fVar.d(fVar2);
            h0.d(h0Var, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f282a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    @m
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\b\u0018\u0000 12\u00020\u0001:\u0002) B\u0001\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013B\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ¤\u0001\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R(\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u0010-\u001a\u0004\b5\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010-\u001a\u0004\b>\u0010?R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010=\u0012\u0004\bB\u0010-\u001a\u0004\bA\u0010?R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010*\u0012\u0004\bD\u0010-\u001a\u0004\bC\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00108\u0012\u0004\bE\u0010-\u001a\u0004\b7\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u00108\u0012\u0004\bF\u0010-\u001a\u0004\b<\u0010:R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u00108\u0012\u0004\bH\u0010-\u001a\u0004\bG\u0010:¨\u0006I"}, d2 = {"LD0/h0$c;", "", "", "Lch/icoaching/typewise/misc/Language;", "language", "inferenceTechnique", "", "maxStepsPerSingleWord", "seqLenTest", "", "doFilterEmptyPredictions", "", "stopTokens", "endOfSequenceTokens", "hardwareLibrary", "addStartToken", "appendStopTokenToPred", "queryAllReturnLongest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "c", "(LD0/h0$c;LI2/d;LH2/f;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)LD0/h0$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "getLanguage$annotations", "()V", "j", "getInferenceTechnique$annotations", "Ljava/lang/Integer;", "l", "()Ljava/lang/Integer;", "getMaxStepsPerSingleWord$annotations", "d", "n", "getSeqLenTest$annotations", "e", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "getDoFilterEmptyPredictions$annotations", "f", "Ljava/util/List;", "o", "()Ljava/util/List;", "getStopTokens$annotations", "h", "getEndOfSequenceTokens$annotations", "i", "getHardwareLibrary$annotations", "getAddStartToken$annotations", "getAppendStopTokenToPred$annotations", "m", "getQueryAllReturnLongest$annotations", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    public static final class c {

        /* renamed from: l  reason: collision with root package name */
        public static final b f284l = new b((i) null);
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public static final F2.b[] f285m;

        /* renamed from: a  reason: collision with root package name */
        private final String f286a;

        /* renamed from: b  reason: collision with root package name */
        private final String f287b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f288c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f289d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f290e;

        /* renamed from: f  reason: collision with root package name */
        private final List f291f;

        /* renamed from: g  reason: collision with root package name */
        private final List f292g;

        /* renamed from: h  reason: collision with root package name */
        private final String f293h;

        /* renamed from: i  reason: collision with root package name */
        private final Boolean f294i;

        /* renamed from: j  reason: collision with root package name */
        private final Boolean f295j;

        /* renamed from: k  reason: collision with root package name */
        private final Boolean f296k;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f297a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f298b;

            static {
                a aVar = new a();
                f297a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.PredictionsTFModelConfig.Inference", aVar, 11);
                s0Var.p("lang_code", false);
                s0Var.p("inference_technique", false);
                s0Var.p("max_steps_per_single_word", true);
                s0Var.p("seq_len_test", true);
                s0Var.p("do_filter_empty_predictions", true);
                s0Var.p("stop_tokens", true);
                s0Var.p("end_of_sequence_tokens", true);
                s0Var.p("hardware_library", true);
                s0Var.p("add_start_token", true);
                s0Var.p("append_stop_token_to_pred", true);
                s0Var.p("query_all_return_longest", true);
                f298b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f298b;
            }

            public final F2.b[] c() {
                F2.b[] d4 = c.f285m;
                G0 g02 = G0.f622a;
                F2.b u3 = G2.a.u(g02);
                K k4 = K.f636a;
                F2.b u4 = G2.a.u(k4);
                F2.b u5 = G2.a.u(k4);
                C0306i iVar = C0306i.f706a;
                return new F2.b[]{u3, g02, u4, u5, G2.a.u(iVar), G2.a.u(d4[5]), G2.a.u(d4[6]), G2.a.u(g02), G2.a.u(iVar), G2.a.u(iVar), G2.a.u(iVar)};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Integer} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Boolean} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final D0.h0.c b(I2.e r34) {
                /*
                    r33 = this;
                    r0 = r34
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f298b
                    I2.c r0 = r0.d(r1)
                    F2.b[] r2 = D0.h0.c.f285m
                    boolean r3 = r0.p()
                    r6 = 7
                    r7 = 3
                    r8 = 8
                    r9 = 4
                    r10 = 2
                    r11 = 6
                    r12 = 5
                    r13 = 1
                    r14 = 0
                    r15 = 0
                    if (r3 == 0) goto L_0x008c
                    J2.G0 r3 = J2.G0.f622a
                    java.lang.Object r14 = r0.m(r1, r14, r3, r15)
                    java.lang.String r14 = (java.lang.String) r14
                    java.lang.String r13 = r0.z(r1, r13)
                    J2.K r4 = J2.K.f636a
                    java.lang.Object r10 = r0.m(r1, r10, r4, r15)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    java.lang.Object r4 = r0.m(r1, r7, r4, r15)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    J2.i r7 = J2.C0306i.f706a
                    java.lang.Object r9 = r0.m(r1, r9, r7, r15)
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    r5 = r2[r12]
                    java.lang.Object r5 = r0.m(r1, r12, r5, r15)
                    java.util.List r5 = (java.util.List) r5
                    r2 = r2[r11]
                    java.lang.Object r2 = r0.m(r1, r11, r2, r15)
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Object r3 = r0.m(r1, r6, r3, r15)
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.Object r6 = r0.m(r1, r8, r7, r15)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    r8 = 9
                    java.lang.Object r8 = r0.m(r1, r8, r7, r15)
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    r11 = 10
                    java.lang.Object r7 = r0.m(r1, r11, r7, r15)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    r11 = 2047(0x7ff, float:2.868E-42)
                    r27 = r2
                    r28 = r3
                    r24 = r4
                    r26 = r5
                    r29 = r6
                    r31 = r7
                    r30 = r8
                    r25 = r9
                    r23 = r10
                    r20 = r11
                    r22 = r13
                    r21 = r14
                    goto L_0x017f
                L_0x008c:
                    r17 = r13
                    r3 = r14
                    r4 = r15
                    r5 = r4
                    r6 = r5
                    r7 = r6
                    r9 = r7
                    r10 = r9
                    r11 = r10
                    r12 = r11
                    r13 = r12
                    r14 = r13
                L_0x0099:
                    if (r17 == 0) goto L_0x0165
                    int r8 = r0.e(r1)
                    switch(r8) {
                        case -1: goto L_0x015e;
                        case 0: goto L_0x014d;
                        case 1: goto L_0x0141;
                        case 2: goto L_0x0131;
                        case 3: goto L_0x0121;
                        case 4: goto L_0x0111;
                        case 5: goto L_0x0102;
                        case 6: goto L_0x00f3;
                        case 7: goto L_0x00e2;
                        case 8: goto L_0x00cd;
                        case 9: goto L_0x00bb;
                        case 10: goto L_0x00a8;
                        default: goto L_0x00a2;
                    }
                L_0x00a2:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r8)
                    throw r0
                L_0x00a8:
                    J2.i r8 = J2.C0306i.f706a
                    r18 = r4
                    r4 = 10
                    java.lang.Object r6 = r0.m(r1, r4, r8, r6)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    r3 = r3 | 1024(0x400, float:1.435E-42)
                L_0x00b6:
                    r4 = r18
                L_0x00b8:
                    r8 = 8
                    goto L_0x0099
                L_0x00bb:
                    r18 = r4
                    r4 = 10
                    J2.i r8 = J2.C0306i.f706a
                    r4 = 9
                    java.lang.Object r8 = r0.m(r1, r4, r8, r11)
                    r11 = r8
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    r3 = r3 | 512(0x200, float:7.175E-43)
                    goto L_0x00b6
                L_0x00cd:
                    r18 = r4
                    r4 = 9
                    J2.i r8 = J2.C0306i.f706a
                    r4 = 8
                    java.lang.Object r8 = r0.m(r1, r4, r8, r12)
                    r12 = r8
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    r3 = r3 | 256(0x100, float:3.59E-43)
                    r8 = r4
                    r4 = r18
                    goto L_0x0099
                L_0x00e2:
                    r18 = r4
                    r4 = 8
                    J2.G0 r8 = J2.G0.f622a
                    r4 = 7
                    java.lang.Object r8 = r0.m(r1, r4, r8, r9)
                    r9 = r8
                    java.lang.String r9 = (java.lang.String) r9
                    r3 = r3 | 128(0x80, float:1.794E-43)
                    goto L_0x00b6
                L_0x00f3:
                    r18 = r4
                    r8 = 6
                    r4 = r2[r8]
                    java.lang.Object r4 = r0.m(r1, r8, r4, r7)
                    r7 = r4
                    java.util.List r7 = (java.util.List) r7
                    r3 = r3 | 64
                    goto L_0x00b6
                L_0x0102:
                    r18 = r4
                    r4 = 5
                    r8 = r2[r4]
                    java.lang.Object r8 = r0.m(r1, r4, r8, r10)
                    r10 = r8
                    java.util.List r10 = (java.util.List) r10
                    r3 = r3 | 32
                    goto L_0x00b6
                L_0x0111:
                    r18 = r4
                    r4 = 5
                    J2.i r8 = J2.C0306i.f706a
                    r4 = 4
                    java.lang.Object r8 = r0.m(r1, r4, r8, r13)
                    r13 = r8
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    r3 = r3 | 16
                    goto L_0x00b6
                L_0x0121:
                    r18 = r4
                    r4 = 4
                    J2.K r8 = J2.K.f636a
                    r4 = 3
                    java.lang.Object r8 = r0.m(r1, r4, r8, r14)
                    r14 = r8
                    java.lang.Integer r14 = (java.lang.Integer) r14
                    r3 = r3 | 8
                    goto L_0x00b6
                L_0x0131:
                    r18 = r4
                    r4 = 3
                    J2.K r8 = J2.K.f636a
                    r4 = 2
                    java.lang.Object r5 = r0.m(r1, r4, r8, r5)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    r3 = r3 | 4
                    goto L_0x00b6
                L_0x0141:
                    r4 = 2
                    r8 = 1
                    java.lang.String r16 = r0.z(r1, r8)
                    r3 = r3 | 2
                    r4 = r16
                    goto L_0x00b8
                L_0x014d:
                    r18 = r4
                    r8 = 1
                    J2.G0 r4 = J2.G0.f622a
                    r8 = 0
                    java.lang.Object r4 = r0.m(r1, r8, r4, r15)
                    r15 = r4
                    java.lang.String r15 = (java.lang.String) r15
                    r3 = r3 | 1
                    goto L_0x00b6
                L_0x015e:
                    r18 = r4
                    r8 = 0
                    r17 = r8
                    goto L_0x00b8
                L_0x0165:
                    r18 = r4
                    r20 = r3
                    r23 = r5
                    r31 = r6
                    r27 = r7
                    r28 = r9
                    r26 = r10
                    r30 = r11
                    r29 = r12
                    r25 = r13
                    r24 = r14
                    r21 = r15
                    r22 = r18
                L_0x017f:
                    r0.c(r1)
                    D0.h0$c r0 = new D0.h0$c
                    r32 = 0
                    r19 = r0
                    r19.<init>((int) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.Integer) r23, (java.lang.Integer) r24, (java.lang.Boolean) r25, (java.util.List) r26, (java.util.List) r27, (java.lang.String) r28, (java.lang.Boolean) r29, (java.lang.Boolean) r30, (java.lang.Boolean) r31, (J2.C0) r32)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: D0.h0.c.a.b(I2.e):D0.h0$c");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, c cVar) {
                o.e(fVar, "encoder");
                o.e(cVar, "value");
                f fVar2 = f298b;
                I2.d d4 = fVar.d(fVar2);
                c.c(cVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f297a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        static {
            G0 g02 = G0.f622a;
            f285m = new F2.b[]{null, null, null, null, null, new C0300f(g02), new C0300f(g02), null, null, null, null};
        }

        public /* synthetic */ c(int i4, String str, String str2, Integer num, Integer num2, Boolean bool, List list, List list2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, C0 c02) {
            if (3 != (i4 & 3)) {
                C0317n0.a(i4, 3, a.f297a.a());
            }
            this.f286a = str;
            this.f287b = str2;
            if ((i4 & 4) == 0) {
                this.f288c = null;
            } else {
                this.f288c = num;
            }
            if ((i4 & 8) == 0) {
                this.f289d = null;
            } else {
                this.f289d = num2;
            }
            if ((i4 & 16) == 0) {
                this.f290e = null;
            } else {
                this.f290e = bool;
            }
            if ((i4 & 32) == 0) {
                this.f291f = null;
            } else {
                this.f291f = list;
            }
            if ((i4 & 64) == 0) {
                this.f292g = null;
            } else {
                this.f292g = list2;
            }
            if ((i4 & Uuid.SIZE_BITS) == 0) {
                this.f293h = null;
            } else {
                this.f293h = str3;
            }
            if ((i4 & 256) == 0) {
                this.f294i = null;
            } else {
                this.f294i = bool2;
            }
            if ((i4 & 512) == 0) {
                this.f295j = null;
            } else {
                this.f295j = bool3;
            }
            if ((i4 & 1024) == 0) {
                this.f296k = null;
            } else {
                this.f296k = bool4;
            }
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, Integer num, Integer num2, Boolean bool, List list, List list2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, int i4, Object obj) {
            c cVar2 = cVar;
            int i5 = i4;
            return cVar.b((i5 & 1) != 0 ? cVar2.f286a : str, (i5 & 2) != 0 ? cVar2.f287b : str2, (i5 & 4) != 0 ? cVar2.f288c : num, (i5 & 8) != 0 ? cVar2.f289d : num2, (i5 & 16) != 0 ? cVar2.f290e : bool, (i5 & 32) != 0 ? cVar2.f291f : list, (i5 & 64) != 0 ? cVar2.f292g : list2, (i5 & Uuid.SIZE_BITS) != 0 ? cVar2.f293h : str3, (i5 & 256) != 0 ? cVar2.f294i : bool2, (i5 & 512) != 0 ? cVar2.f295j : bool3, (i5 & 1024) != 0 ? cVar2.f296k : bool4);
        }

        public static final /* synthetic */ void c(c cVar, I2.d dVar, f fVar) {
            F2.b[] bVarArr = f285m;
            G0 g02 = G0.f622a;
            dVar.o(fVar, 0, g02, cVar.f286a);
            dVar.p(fVar, 1, cVar.f287b);
            if (dVar.n(fVar, 2) || cVar.f288c != null) {
                dVar.o(fVar, 2, K.f636a, cVar.f288c);
            }
            if (dVar.n(fVar, 3) || cVar.f289d != null) {
                dVar.o(fVar, 3, K.f636a, cVar.f289d);
            }
            if (dVar.n(fVar, 4) || cVar.f290e != null) {
                dVar.o(fVar, 4, C0306i.f706a, cVar.f290e);
            }
            if (dVar.n(fVar, 5) || cVar.f291f != null) {
                dVar.o(fVar, 5, bVarArr[5], cVar.f291f);
            }
            if (dVar.n(fVar, 6) || cVar.f292g != null) {
                dVar.o(fVar, 6, bVarArr[6], cVar.f292g);
            }
            if (dVar.n(fVar, 7) || cVar.f293h != null) {
                dVar.o(fVar, 7, g02, cVar.f293h);
            }
            if (dVar.n(fVar, 8) || cVar.f294i != null) {
                dVar.o(fVar, 8, C0306i.f706a, cVar.f294i);
            }
            if (dVar.n(fVar, 9) || cVar.f295j != null) {
                dVar.o(fVar, 9, C0306i.f706a, cVar.f295j);
            }
            if (dVar.n(fVar, 10) || cVar.f296k != null) {
                dVar.o(fVar, 10, C0306i.f706a, cVar.f296k);
            }
        }

        public final c b(String str, String str2, Integer num, Integer num2, Boolean bool, List list, List list2, String str3, Boolean bool2, Boolean bool3, Boolean bool4) {
            o.e(str2, "inferenceTechnique");
            return new c(str, str2, num, num2, bool, list, list2, str3, bool2, bool3, bool4);
        }

        public final Boolean e() {
            return this.f294i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.a(this.f286a, cVar.f286a) && o.a(this.f287b, cVar.f287b) && o.a(this.f288c, cVar.f288c) && o.a(this.f289d, cVar.f289d) && o.a(this.f290e, cVar.f290e) && o.a(this.f291f, cVar.f291f) && o.a(this.f292g, cVar.f292g) && o.a(this.f293h, cVar.f293h) && o.a(this.f294i, cVar.f294i) && o.a(this.f295j, cVar.f295j) && o.a(this.f296k, cVar.f296k)) {
                return true;
            }
            return false;
        }

        public final Boolean f() {
            return this.f295j;
        }

        public final Boolean g() {
            return this.f290e;
        }

        public final List h() {
            return this.f292g;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            String str = this.f286a;
            int i13 = 0;
            if (str == null) {
                i4 = 0;
            } else {
                i4 = str.hashCode();
            }
            int hashCode = ((i4 * 31) + this.f287b.hashCode()) * 31;
            Integer num = this.f288c;
            if (num == null) {
                i5 = 0;
            } else {
                i5 = num.hashCode();
            }
            int i14 = (hashCode + i5) * 31;
            Integer num2 = this.f289d;
            if (num2 == null) {
                i6 = 0;
            } else {
                i6 = num2.hashCode();
            }
            int i15 = (i14 + i6) * 31;
            Boolean bool = this.f290e;
            if (bool == null) {
                i7 = 0;
            } else {
                i7 = bool.hashCode();
            }
            int i16 = (i15 + i7) * 31;
            List list = this.f291f;
            if (list == null) {
                i8 = 0;
            } else {
                i8 = list.hashCode();
            }
            int i17 = (i16 + i8) * 31;
            List list2 = this.f292g;
            if (list2 == null) {
                i9 = 0;
            } else {
                i9 = list2.hashCode();
            }
            int i18 = (i17 + i9) * 31;
            String str2 = this.f293h;
            if (str2 == null) {
                i10 = 0;
            } else {
                i10 = str2.hashCode();
            }
            int i19 = (i18 + i10) * 31;
            Boolean bool2 = this.f294i;
            if (bool2 == null) {
                i11 = 0;
            } else {
                i11 = bool2.hashCode();
            }
            int i20 = (i19 + i11) * 31;
            Boolean bool3 = this.f295j;
            if (bool3 == null) {
                i12 = 0;
            } else {
                i12 = bool3.hashCode();
            }
            int i21 = (i20 + i12) * 31;
            Boolean bool4 = this.f296k;
            if (bool4 != null) {
                i13 = bool4.hashCode();
            }
            return i21 + i13;
        }

        public final String i() {
            return this.f293h;
        }

        public final String j() {
            return this.f287b;
        }

        public final String k() {
            return this.f286a;
        }

        public final Integer l() {
            return this.f288c;
        }

        public final Boolean m() {
            return this.f296k;
        }

        public final Integer n() {
            return this.f289d;
        }

        public final List o() {
            return this.f291f;
        }

        public String toString() {
            String str = this.f286a;
            String str2 = this.f287b;
            Integer num = this.f288c;
            Integer num2 = this.f289d;
            Boolean bool = this.f290e;
            List list = this.f291f;
            List list2 = this.f292g;
            String str3 = this.f293h;
            Boolean bool2 = this.f294i;
            Boolean bool3 = this.f295j;
            Boolean bool4 = this.f296k;
            return "Inference(language=" + str + ", inferenceTechnique=" + str2 + ", maxStepsPerSingleWord=" + num + ", seqLenTest=" + num2 + ", doFilterEmptyPredictions=" + bool + ", stopTokens=" + list + ", endOfSequenceTokens=" + list2 + ", hardwareLibrary=" + str3 + ", addStartToken=" + bool2 + ", appendStopTokenToPred=" + bool3 + ", queryAllReturnLongest=" + bool4 + ")";
        }

        public c(String str, String str2, Integer num, Integer num2, Boolean bool, List list, List list2, String str3, Boolean bool2, Boolean bool3, Boolean bool4) {
            o.e(str2, "inferenceTechnique");
            this.f286a = str;
            this.f287b = str2;
            this.f288c = num;
            this.f289d = num2;
            this.f290e = bool;
            this.f291f = list;
            this.f292g = list2;
            this.f293h = str3;
            this.f294i = bool2;
            this.f295j = bool3;
            this.f296k = bool4;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ c(java.lang.String r16, java.lang.String r17, java.lang.Integer r18, java.lang.Integer r19, java.lang.Boolean r20, java.util.List r21, java.util.List r22, java.lang.String r23, java.lang.Boolean r24, java.lang.Boolean r25, java.lang.Boolean r26, int r27, kotlin.jvm.internal.i r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r18
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r19
            L_0x0013:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0019
                r8 = r2
                goto L_0x001b
            L_0x0019:
                r8 = r20
            L_0x001b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0021
                r9 = r2
                goto L_0x0023
            L_0x0021:
                r9 = r21
            L_0x0023:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0029
                r10 = r2
                goto L_0x002b
            L_0x0029:
                r10 = r22
            L_0x002b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0031
                r11 = r2
                goto L_0x0033
            L_0x0031:
                r11 = r23
            L_0x0033:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0039
                r12 = r2
                goto L_0x003b
            L_0x0039:
                r12 = r24
            L_0x003b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0041
                r13 = r2
                goto L_0x0043
            L_0x0041:
                r13 = r25
            L_0x0043:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0049
                r14 = r2
                goto L_0x004b
            L_0x0049:
                r14 = r26
            L_0x004b:
                r3 = r15
                r4 = r16
                r5 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.h0.c.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.util.List, java.util.List, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
        }
    }

    @m
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\b\u0018\u0000 22\u00020\u0001:\u0002\u001a'Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010&\u001a\u0004\b)\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u00101\u0012\u0004\b4\u0010&\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010#\u0012\u0004\b6\u0010&\u001a\u0004\b,\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010#\u0012\u0004\b8\u0010&\u001a\u0004\b7\u0010\u001dR(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u00109\u0012\u0004\b;\u0010&\u001a\u0004\b5\u0010:¨\u0006<"}, d2 = {"LD0/h0$d;", "", "", "kind", "", "embDim", "stateDim", "rnnType", "", "useEmbedding", "checkpointHash", "implementation", "", "modelNames", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "a", "(LD0/h0$d;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "getKind$annotations", "()V", "b", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "getEmbDim$annotations", "c", "h", "getStateDim$annotations", "g", "getRnnType$annotations", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "getUseEmbedding$annotations", "f", "getCheckpointHash$annotations", "getImplementation", "getImplementation$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getModelNames$annotations", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    public static final class d {

        /* renamed from: i  reason: collision with root package name */
        public static final b f299i = new b((i) null);
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public static final F2.b[] f300j = {null, null, null, null, null, null, null, new C0300f(G0.f622a)};

        /* renamed from: a  reason: collision with root package name */
        private final String f301a;

        /* renamed from: b  reason: collision with root package name */
        private final Integer f302b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f303c;

        /* renamed from: d  reason: collision with root package name */
        private final String f304d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f305e;

        /* renamed from: f  reason: collision with root package name */
        private final String f306f;

        /* renamed from: g  reason: collision with root package name */
        private final String f307g;

        /* renamed from: h  reason: collision with root package name */
        private final List f308h;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f309a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f310b;

            static {
                a aVar = new a();
                f309a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.PredictionsTFModelConfig.Model", aVar, 8);
                s0Var.p("kind", true);
                s0Var.p("emb_dim", true);
                s0Var.p("state_dim", true);
                s0Var.p("rnn_type", true);
                s0Var.p("use_embedding", true);
                s0Var.p("checkpoint_hash", true);
                s0Var.p("implementation", true);
                s0Var.p("model_names", true);
                f310b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f310b;
            }

            public final F2.b[] c() {
                F2.b[] b4 = d.f300j;
                G0 g02 = G0.f622a;
                F2.b u3 = G2.a.u(g02);
                K k4 = K.f636a;
                return new F2.b[]{u3, G2.a.u(k4), G2.a.u(k4), G2.a.u(g02), G2.a.u(C0306i.f706a), G2.a.u(g02), G2.a.u(g02), G2.a.u(b4[7])};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Integer} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final D0.h0.d b(I2.e r29) {
                /*
                    r28 = this;
                    r0 = r29
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f310b
                    I2.c r0 = r0.d(r1)
                    F2.b[] r2 = D0.h0.d.f300j
                    boolean r3 = r0.p()
                    r4 = 6
                    r5 = 5
                    r6 = 3
                    r7 = 4
                    r8 = 2
                    r9 = 7
                    r10 = 1
                    r11 = 0
                    r12 = 0
                    if (r3 == 0) goto L_0x006e
                    J2.G0 r3 = J2.G0.f622a
                    java.lang.Object r11 = r0.m(r1, r11, r3, r12)
                    java.lang.String r11 = (java.lang.String) r11
                    J2.K r13 = J2.K.f636a
                    java.lang.Object r10 = r0.m(r1, r10, r13, r12)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    java.lang.Object r8 = r0.m(r1, r8, r13, r12)
                    java.lang.Integer r8 = (java.lang.Integer) r8
                    java.lang.Object r6 = r0.m(r1, r6, r3, r12)
                    java.lang.String r6 = (java.lang.String) r6
                    J2.i r13 = J2.C0306i.f706a
                    java.lang.Object r7 = r0.m(r1, r7, r13, r12)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    java.lang.Object r5 = r0.m(r1, r5, r3, r12)
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object r3 = r0.m(r1, r4, r3, r12)
                    java.lang.String r3 = (java.lang.String) r3
                    r2 = r2[r9]
                    java.lang.Object r2 = r0.m(r1, r9, r2, r12)
                    java.util.List r2 = (java.util.List) r2
                    r4 = 255(0xff, float:3.57E-43)
                    r26 = r2
                    r25 = r3
                    r18 = r4
                    r24 = r5
                    r22 = r6
                    r23 = r7
                    r21 = r8
                    r20 = r10
                    r19 = r11
                    goto L_0x0109
                L_0x006e:
                    r16 = r10
                    r3 = r11
                    r6 = r12
                    r8 = r6
                    r10 = r8
                    r11 = r10
                    r13 = r11
                    r14 = r13
                    r15 = r14
                L_0x0078:
                    if (r16 == 0) goto L_0x00f7
                    int r7 = r0.e(r1)
                    switch(r7) {
                        case -1: goto L_0x00f3;
                        case 0: goto L_0x00e5;
                        case 1: goto L_0x00d7;
                        case 2: goto L_0x00c9;
                        case 3: goto L_0x00ba;
                        case 4: goto L_0x00ab;
                        case 5: goto L_0x009f;
                        case 6: goto L_0x0093;
                        case 7: goto L_0x0087;
                        default: goto L_0x0081;
                    }
                L_0x0081:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r7)
                    throw r0
                L_0x0087:
                    r7 = r2[r9]
                    java.lang.Object r6 = r0.m(r1, r9, r7, r6)
                    java.util.List r6 = (java.util.List) r6
                    r3 = r3 | 128(0x80, float:1.794E-43)
                L_0x0091:
                    r7 = 4
                    goto L_0x0078
                L_0x0093:
                    J2.G0 r7 = J2.G0.f622a
                    java.lang.Object r7 = r0.m(r1, r4, r7, r8)
                    r8 = r7
                    java.lang.String r8 = (java.lang.String) r8
                    r3 = r3 | 64
                    goto L_0x0091
                L_0x009f:
                    J2.G0 r7 = J2.G0.f622a
                    java.lang.Object r7 = r0.m(r1, r5, r7, r10)
                    r10 = r7
                    java.lang.String r10 = (java.lang.String) r10
                    r3 = r3 | 32
                    goto L_0x0091
                L_0x00ab:
                    J2.i r7 = J2.C0306i.f706a
                    r4 = 4
                    java.lang.Object r7 = r0.m(r1, r4, r7, r11)
                    r11 = r7
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    r3 = r3 | 16
                    r7 = r4
                    r4 = 6
                    goto L_0x0078
                L_0x00ba:
                    r4 = 4
                    J2.G0 r7 = J2.G0.f622a
                    r4 = 3
                    java.lang.Object r7 = r0.m(r1, r4, r7, r15)
                    r15 = r7
                    java.lang.String r15 = (java.lang.String) r15
                    r3 = r3 | 8
                L_0x00c7:
                    r4 = 6
                    goto L_0x0091
                L_0x00c9:
                    r4 = 3
                    J2.K r7 = J2.K.f636a
                    r4 = 2
                    java.lang.Object r7 = r0.m(r1, r4, r7, r14)
                    r14 = r7
                    java.lang.Integer r14 = (java.lang.Integer) r14
                    r3 = r3 | 4
                    goto L_0x00c7
                L_0x00d7:
                    r4 = 2
                    J2.K r7 = J2.K.f636a
                    r4 = 1
                    java.lang.Object r7 = r0.m(r1, r4, r7, r13)
                    r13 = r7
                    java.lang.Integer r13 = (java.lang.Integer) r13
                    r3 = r3 | 2
                    goto L_0x00c7
                L_0x00e5:
                    r4 = 1
                    J2.G0 r7 = J2.G0.f622a
                    r4 = 0
                    java.lang.Object r7 = r0.m(r1, r4, r7, r12)
                    r12 = r7
                    java.lang.String r12 = (java.lang.String) r12
                    r3 = r3 | 1
                    goto L_0x00c7
                L_0x00f3:
                    r4 = 0
                    r16 = r4
                    goto L_0x00c7
                L_0x00f7:
                    r18 = r3
                    r26 = r6
                    r25 = r8
                    r24 = r10
                    r23 = r11
                    r19 = r12
                    r20 = r13
                    r21 = r14
                    r22 = r15
                L_0x0109:
                    r0.c(r1)
                    D0.h0$d r0 = new D0.h0$d
                    r27 = 0
                    r17 = r0
                    r17.<init>((int) r18, (java.lang.String) r19, (java.lang.Integer) r20, (java.lang.Integer) r21, (java.lang.String) r22, (java.lang.Boolean) r23, (java.lang.String) r24, (java.lang.String) r25, (java.util.List) r26, (J2.C0) r27)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: D0.h0.d.a.b(I2.e):D0.h0$d");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, d dVar) {
                o.e(fVar, "encoder");
                o.e(dVar, "value");
                f fVar2 = f310b;
                I2.d d4 = fVar.d(fVar2);
                d.a(dVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f309a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ d(int i4, String str, Integer num, Integer num2, String str2, Boolean bool, String str3, String str4, List list, C0 c02) {
            if ((i4 & 1) == 0) {
                this.f301a = null;
            } else {
                this.f301a = str;
            }
            if ((i4 & 2) == 0) {
                this.f302b = null;
            } else {
                this.f302b = num;
            }
            if ((i4 & 4) == 0) {
                this.f303c = null;
            } else {
                this.f303c = num2;
            }
            if ((i4 & 8) == 0) {
                this.f304d = null;
            } else {
                this.f304d = str2;
            }
            if ((i4 & 16) == 0) {
                this.f305e = null;
            } else {
                this.f305e = bool;
            }
            if ((i4 & 32) == 0) {
                this.f306f = null;
            } else {
                this.f306f = str3;
            }
            if ((i4 & 64) == 0) {
                this.f307g = null;
            } else {
                this.f307g = str4;
            }
            if ((i4 & Uuid.SIZE_BITS) == 0) {
                this.f308h = null;
            } else {
                this.f308h = list;
            }
        }

        public static final /* synthetic */ void a(d dVar, I2.d dVar2, f fVar) {
            F2.b[] bVarArr = f300j;
            if (dVar2.n(fVar, 0) || dVar.f301a != null) {
                dVar2.o(fVar, 0, G0.f622a, dVar.f301a);
            }
            if (dVar2.n(fVar, 1) || dVar.f302b != null) {
                dVar2.o(fVar, 1, K.f636a, dVar.f302b);
            }
            if (dVar2.n(fVar, 2) || dVar.f303c != null) {
                dVar2.o(fVar, 2, K.f636a, dVar.f303c);
            }
            if (dVar2.n(fVar, 3) || dVar.f304d != null) {
                dVar2.o(fVar, 3, G0.f622a, dVar.f304d);
            }
            if (dVar2.n(fVar, 4) || dVar.f305e != null) {
                dVar2.o(fVar, 4, C0306i.f706a, dVar.f305e);
            }
            if (dVar2.n(fVar, 5) || dVar.f306f != null) {
                dVar2.o(fVar, 5, G0.f622a, dVar.f306f);
            }
            if (dVar2.n(fVar, 6) || dVar.f307g != null) {
                dVar2.o(fVar, 6, G0.f622a, dVar.f307g);
            }
            if (dVar2.n(fVar, 7) || dVar.f308h != null) {
                dVar2.o(fVar, 7, bVarArr[7], dVar.f308h);
            }
        }

        public final String c() {
            return this.f306f;
        }

        public final Integer d() {
            return this.f302b;
        }

        public final String e() {
            return this.f301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (o.a(this.f301a, dVar.f301a) && o.a(this.f302b, dVar.f302b) && o.a(this.f303c, dVar.f303c) && o.a(this.f304d, dVar.f304d) && o.a(this.f305e, dVar.f305e) && o.a(this.f306f, dVar.f306f) && o.a(this.f307g, dVar.f307g) && o.a(this.f308h, dVar.f308h)) {
                return true;
            }
            return false;
        }

        public final List f() {
            return this.f308h;
        }

        public final String g() {
            return this.f304d;
        }

        public final Integer h() {
            return this.f303c;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            String str = this.f301a;
            int i11 = 0;
            if (str == null) {
                i4 = 0;
            } else {
                i4 = str.hashCode();
            }
            int i12 = i4 * 31;
            Integer num = this.f302b;
            if (num == null) {
                i5 = 0;
            } else {
                i5 = num.hashCode();
            }
            int i13 = (i12 + i5) * 31;
            Integer num2 = this.f303c;
            if (num2 == null) {
                i6 = 0;
            } else {
                i6 = num2.hashCode();
            }
            int i14 = (i13 + i6) * 31;
            String str2 = this.f304d;
            if (str2 == null) {
                i7 = 0;
            } else {
                i7 = str2.hashCode();
            }
            int i15 = (i14 + i7) * 31;
            Boolean bool = this.f305e;
            if (bool == null) {
                i8 = 0;
            } else {
                i8 = bool.hashCode();
            }
            int i16 = (i15 + i8) * 31;
            String str3 = this.f306f;
            if (str3 == null) {
                i9 = 0;
            } else {
                i9 = str3.hashCode();
            }
            int i17 = (i16 + i9) * 31;
            String str4 = this.f307g;
            if (str4 == null) {
                i10 = 0;
            } else {
                i10 = str4.hashCode();
            }
            int i18 = (i17 + i10) * 31;
            List list = this.f308h;
            if (list != null) {
                i11 = list.hashCode();
            }
            return i18 + i11;
        }

        public final Boolean i() {
            return this.f305e;
        }

        public String toString() {
            String str = this.f301a;
            Integer num = this.f302b;
            Integer num2 = this.f303c;
            String str2 = this.f304d;
            Boolean bool = this.f305e;
            String str3 = this.f306f;
            String str4 = this.f307g;
            List list = this.f308h;
            return "Model(kind=" + str + ", embDim=" + num + ", stateDim=" + num2 + ", rnnType=" + str2 + ", useEmbedding=" + bool + ", checkpointHash=" + str3 + ", implementation=" + str4 + ", modelNames=" + list + ")";
        }

        public d(String str, Integer num, Integer num2, String str2, Boolean bool, String str3, String str4, List list) {
            this.f301a = str;
            this.f302b = num;
            this.f303c = num2;
            this.f304d = str2;
            this.f305e = bool;
            this.f306f = str3;
            this.f307g = str4;
            this.f308h = list;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.String r13, java.lang.Boolean r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18, kotlin.jvm.internal.i r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r10
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r11
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r12
            L_0x0018:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001e
                r5 = r2
                goto L_0x001f
            L_0x001e:
                r5 = r13
            L_0x001f:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0025
                r6 = r2
                goto L_0x0026
            L_0x0025:
                r6 = r14
            L_0x0026:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002c
                r7 = r2
                goto L_0x002d
            L_0x002c:
                r7 = r15
            L_0x002d:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0033
                r8 = r2
                goto L_0x0035
            L_0x0033:
                r8 = r16
            L_0x0035:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r2 = r17
            L_0x003c:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r16 = r7
                r17 = r8
                r18 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.h0.d.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.i):void");
        }
    }

    @m
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u0000 02\u00020\u0001:\u0002%\u001cB}\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010B\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R(\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010&\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010&\u0012\u0004\b6\u0010)\u001a\u0004\b5\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010&\u0012\u0004\b9\u0010)\u001a\u0004\b8\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010&\u0012\u0004\b:\u0010)\u001a\u0004\b%\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010&\u0012\u0004\b;\u0010)\u001a\u0004\b7\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010*\u0012\u0004\b<\u0010)\u001a\u0004\b4\u0010,¨\u0006="}, d2 = {"LD0/h0$e;", "", "", "Lch/icoaching/typewise/misc/Language;", "language", "", "lowerCase", "level", "vocabulary", "processSamplesApproach", "startToken", "unkToken", "endToken", "padToken", "mapStopTokensToSpace", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "b", "(LD0/h0$e;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getLanguage$annotations", "()V", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "getLowerCase$annotations", "d", "getLevel$annotations", "k", "getVocabulary$annotations", "h", "getProcessSamplesApproach$annotations", "f", "i", "getStartToken$annotations", "g", "j", "getUnkToken$annotations", "getEndToken$annotations", "getPadToken$annotations", "getMapStopTokensToSpace$annotations", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    public static final class e {

        /* renamed from: k  reason: collision with root package name */
        public static final b f311k = new b((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f312a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f313b;

        /* renamed from: c  reason: collision with root package name */
        private final String f314c;

        /* renamed from: d  reason: collision with root package name */
        private final String f315d;

        /* renamed from: e  reason: collision with root package name */
        private final String f316e;

        /* renamed from: f  reason: collision with root package name */
        private final String f317f;

        /* renamed from: g  reason: collision with root package name */
        private final String f318g;

        /* renamed from: h  reason: collision with root package name */
        private final String f319h;

        /* renamed from: i  reason: collision with root package name */
        private final String f320i;

        /* renamed from: j  reason: collision with root package name */
        private final Boolean f321j;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f322a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f323b;

            static {
                a aVar = new a();
                f322a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.PredictionsTFModelConfig.Preprocessing", aVar, 10);
                s0Var.p("lang_code", false);
                s0Var.p("lowercase", false);
                s0Var.p("level", false);
                s0Var.p("vocabulary", true);
                s0Var.p("process_samples_approach", true);
                s0Var.p("start_token", true);
                s0Var.p("unk_token", true);
                s0Var.p("end_token", true);
                s0Var.p("pad_token", true);
                s0Var.p("map_stop_tokens_to_space", true);
                f323b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f323b;
            }

            public final F2.b[] c() {
                G0 g02 = G0.f622a;
                F2.b u3 = G2.a.u(g02);
                C0306i iVar = C0306i.f706a;
                return new F2.b[]{u3, G2.a.u(iVar), g02, G2.a.u(g02), G2.a.u(g02), G2.a.u(g02), G2.a.u(g02), G2.a.u(g02), G2.a.u(g02), G2.a.u(iVar)};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Boolean} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final D0.h0.e b(I2.e r31) {
                /*
                    r30 = this;
                    r0 = r31
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f323b
                    I2.c r0 = r0.d(r1)
                    boolean r2 = r0.p()
                    r3 = 9
                    r4 = 7
                    r5 = 6
                    r6 = 5
                    r7 = 3
                    r8 = 8
                    r9 = 4
                    r10 = 2
                    r11 = 1
                    r12 = 0
                    r13 = 0
                    if (r2 == 0) goto L_0x0078
                    J2.G0 r2 = J2.G0.f622a
                    java.lang.Object r12 = r0.m(r1, r12, r2, r13)
                    java.lang.String r12 = (java.lang.String) r12
                    J2.i r14 = J2.C0306i.f706a
                    java.lang.Object r11 = r0.m(r1, r11, r14, r13)
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    java.lang.String r10 = r0.z(r1, r10)
                    java.lang.Object r7 = r0.m(r1, r7, r2, r13)
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.Object r9 = r0.m(r1, r9, r2, r13)
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object r6 = r0.m(r1, r6, r2, r13)
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object r5 = r0.m(r1, r5, r2, r13)
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.Object r4 = r0.m(r1, r4, r2, r13)
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r2 = r0.m(r1, r8, r2, r13)
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object r3 = r0.m(r1, r3, r14, r13)
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    r8 = 1023(0x3ff, float:1.434E-42)
                    r27 = r2
                    r28 = r3
                    r26 = r4
                    r25 = r5
                    r24 = r6
                    r22 = r7
                    r18 = r8
                    r23 = r9
                    r21 = r10
                    r20 = r11
                    r19 = r12
                    goto L_0x0136
                L_0x0078:
                    r16 = r11
                    r2 = r12
                    r5 = r13
                    r6 = r5
                    r7 = r6
                    r9 = r7
                    r10 = r9
                    r11 = r10
                    r12 = r11
                    r14 = r12
                    r15 = r14
                L_0x0084:
                    if (r16 == 0) goto L_0x0120
                    int r4 = r0.e(r1)
                    switch(r4) {
                        case -1: goto L_0x011b;
                        case 0: goto L_0x010d;
                        case 1: goto L_0x00ff;
                        case 2: goto L_0x00f6;
                        case 3: goto L_0x00e8;
                        case 4: goto L_0x00da;
                        case 5: goto L_0x00cc;
                        case 6: goto L_0x00bc;
                        case 7: goto L_0x00ac;
                        case 8: goto L_0x00a0;
                        case 9: goto L_0x0093;
                        default: goto L_0x008d;
                    }
                L_0x008d:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r4)
                    throw r0
                L_0x0093:
                    J2.i r4 = J2.C0306i.f706a
                    java.lang.Object r4 = r0.m(r1, r3, r4, r5)
                    r5 = r4
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    r2 = r2 | 512(0x200, float:7.175E-43)
                L_0x009e:
                    r4 = 7
                    goto L_0x0084
                L_0x00a0:
                    J2.G0 r4 = J2.G0.f622a
                    java.lang.Object r4 = r0.m(r1, r8, r4, r6)
                    r6 = r4
                    java.lang.String r6 = (java.lang.String) r6
                    r2 = r2 | 256(0x100, float:3.59E-43)
                    goto L_0x009e
                L_0x00ac:
                    J2.G0 r4 = J2.G0.f622a
                    r3 = 7
                    java.lang.Object r4 = r0.m(r1, r3, r4, r9)
                    r9 = r4
                    java.lang.String r9 = (java.lang.String) r9
                    r2 = r2 | 128(0x80, float:1.794E-43)
                    r4 = r3
                    r3 = 9
                    goto L_0x0084
                L_0x00bc:
                    r3 = 7
                    J2.G0 r4 = J2.G0.f622a
                    r3 = 6
                    java.lang.Object r4 = r0.m(r1, r3, r4, r7)
                    r7 = r4
                    java.lang.String r7 = (java.lang.String) r7
                    r2 = r2 | 64
                L_0x00c9:
                    r3 = 9
                    goto L_0x009e
                L_0x00cc:
                    r3 = 6
                    J2.G0 r4 = J2.G0.f622a
                    r3 = 5
                    java.lang.Object r4 = r0.m(r1, r3, r4, r10)
                    r10 = r4
                    java.lang.String r10 = (java.lang.String) r10
                    r2 = r2 | 32
                    goto L_0x00c9
                L_0x00da:
                    r3 = 5
                    J2.G0 r4 = J2.G0.f622a
                    r3 = 4
                    java.lang.Object r4 = r0.m(r1, r3, r4, r11)
                    r11 = r4
                    java.lang.String r11 = (java.lang.String) r11
                    r2 = r2 | 16
                    goto L_0x00c9
                L_0x00e8:
                    r3 = 4
                    J2.G0 r4 = J2.G0.f622a
                    r3 = 3
                    java.lang.Object r4 = r0.m(r1, r3, r4, r12)
                    r12 = r4
                    java.lang.String r12 = (java.lang.String) r12
                    r2 = r2 | 8
                    goto L_0x00c9
                L_0x00f6:
                    r3 = 3
                    r4 = 2
                    java.lang.String r15 = r0.z(r1, r4)
                    r2 = r2 | 4
                    goto L_0x00c9
                L_0x00ff:
                    r4 = 2
                    J2.i r3 = J2.C0306i.f706a
                    r4 = 1
                    java.lang.Object r3 = r0.m(r1, r4, r3, r14)
                    r14 = r3
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    r2 = r2 | 2
                    goto L_0x00c9
                L_0x010d:
                    r4 = 1
                    J2.G0 r3 = J2.G0.f622a
                    r4 = 0
                    java.lang.Object r3 = r0.m(r1, r4, r3, r13)
                    r13 = r3
                    java.lang.String r13 = (java.lang.String) r13
                    r2 = r2 | 1
                    goto L_0x00c9
                L_0x011b:
                    r4 = 0
                    r16 = r4
                    goto L_0x009e
                L_0x0120:
                    r18 = r2
                    r28 = r5
                    r27 = r6
                    r25 = r7
                    r26 = r9
                    r24 = r10
                    r23 = r11
                    r22 = r12
                    r19 = r13
                    r20 = r14
                    r21 = r15
                L_0x0136:
                    r0.c(r1)
                    D0.h0$e r0 = new D0.h0$e
                    r29 = 0
                    r17 = r0
                    r17.<init>((int) r18, (java.lang.String) r19, (java.lang.Boolean) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.Boolean) r28, (J2.C0) r29)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: D0.h0.e.a.b(I2.e):D0.h0$e");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, e eVar) {
                o.e(fVar, "encoder");
                o.e(eVar, "value");
                f fVar2 = f323b;
                I2.d d4 = fVar.d(fVar2);
                e.b(eVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f322a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ e(int i4, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, C0 c02) {
            if (7 != (i4 & 7)) {
                C0317n0.a(i4, 7, a.f322a.a());
            }
            this.f312a = str;
            this.f313b = bool;
            this.f314c = str2;
            if ((i4 & 8) == 0) {
                this.f315d = null;
            } else {
                this.f315d = str3;
            }
            if ((i4 & 16) == 0) {
                this.f316e = null;
            } else {
                this.f316e = str4;
            }
            if ((i4 & 32) == 0) {
                this.f317f = null;
            } else {
                this.f317f = str5;
            }
            if ((i4 & 64) == 0) {
                this.f318g = null;
            } else {
                this.f318g = str6;
            }
            if ((i4 & Uuid.SIZE_BITS) == 0) {
                this.f319h = null;
            } else {
                this.f319h = str7;
            }
            if ((i4 & 256) == 0) {
                this.f320i = null;
            } else {
                this.f320i = str8;
            }
            if ((i4 & 512) == 0) {
                this.f321j = null;
            } else {
                this.f321j = bool2;
            }
        }

        public static final /* synthetic */ void b(e eVar, I2.d dVar, f fVar) {
            G0 g02 = G0.f622a;
            dVar.o(fVar, 0, g02, eVar.f312a);
            C0306i iVar = C0306i.f706a;
            dVar.o(fVar, 1, iVar, eVar.f313b);
            dVar.p(fVar, 2, eVar.f314c);
            if (dVar.n(fVar, 3) || eVar.f315d != null) {
                dVar.o(fVar, 3, g02, eVar.f315d);
            }
            if (dVar.n(fVar, 4) || eVar.f316e != null) {
                dVar.o(fVar, 4, g02, eVar.f316e);
            }
            if (dVar.n(fVar, 5) || eVar.f317f != null) {
                dVar.o(fVar, 5, g02, eVar.f317f);
            }
            if (dVar.n(fVar, 6) || eVar.f318g != null) {
                dVar.o(fVar, 6, g02, eVar.f318g);
            }
            if (dVar.n(fVar, 7) || eVar.f319h != null) {
                dVar.o(fVar, 7, g02, eVar.f319h);
            }
            if (dVar.n(fVar, 8) || eVar.f320i != null) {
                dVar.o(fVar, 8, g02, eVar.f320i);
            }
            if (dVar.n(fVar, 9) || eVar.f321j != null) {
                dVar.o(fVar, 9, iVar, eVar.f321j);
            }
        }

        public final String a() {
            return this.f319h;
        }

        public final String c() {
            return this.f312a;
        }

        public final String d() {
            return this.f314c;
        }

        public final Boolean e() {
            return this.f313b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (o.a(this.f312a, eVar.f312a) && o.a(this.f313b, eVar.f313b) && o.a(this.f314c, eVar.f314c) && o.a(this.f315d, eVar.f315d) && o.a(this.f316e, eVar.f316e) && o.a(this.f317f, eVar.f317f) && o.a(this.f318g, eVar.f318g) && o.a(this.f319h, eVar.f319h) && o.a(this.f320i, eVar.f320i) && o.a(this.f321j, eVar.f321j)) {
                return true;
            }
            return false;
        }

        public final Boolean f() {
            return this.f321j;
        }

        public final String g() {
            return this.f320i;
        }

        public final String h() {
            return this.f316e;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            String str = this.f312a;
            int i12 = 0;
            if (str == null) {
                i4 = 0;
            } else {
                i4 = str.hashCode();
            }
            int i13 = i4 * 31;
            Boolean bool = this.f313b;
            if (bool == null) {
                i5 = 0;
            } else {
                i5 = bool.hashCode();
            }
            int hashCode = (((i13 + i5) * 31) + this.f314c.hashCode()) * 31;
            String str2 = this.f315d;
            if (str2 == null) {
                i6 = 0;
            } else {
                i6 = str2.hashCode();
            }
            int i14 = (hashCode + i6) * 31;
            String str3 = this.f316e;
            if (str3 == null) {
                i7 = 0;
            } else {
                i7 = str3.hashCode();
            }
            int i15 = (i14 + i7) * 31;
            String str4 = this.f317f;
            if (str4 == null) {
                i8 = 0;
            } else {
                i8 = str4.hashCode();
            }
            int i16 = (i15 + i8) * 31;
            String str5 = this.f318g;
            if (str5 == null) {
                i9 = 0;
            } else {
                i9 = str5.hashCode();
            }
            int i17 = (i16 + i9) * 31;
            String str6 = this.f319h;
            if (str6 == null) {
                i10 = 0;
            } else {
                i10 = str6.hashCode();
            }
            int i18 = (i17 + i10) * 31;
            String str7 = this.f320i;
            if (str7 == null) {
                i11 = 0;
            } else {
                i11 = str7.hashCode();
            }
            int i19 = (i18 + i11) * 31;
            Boolean bool2 = this.f321j;
            if (bool2 != null) {
                i12 = bool2.hashCode();
            }
            return i19 + i12;
        }

        public final String i() {
            return this.f317f;
        }

        public final String j() {
            return this.f318g;
        }

        public final String k() {
            return this.f315d;
        }

        public String toString() {
            String str = this.f312a;
            Boolean bool = this.f313b;
            String str2 = this.f314c;
            String str3 = this.f315d;
            String str4 = this.f316e;
            String str5 = this.f317f;
            String str6 = this.f318g;
            String str7 = this.f319h;
            String str8 = this.f320i;
            Boolean bool2 = this.f321j;
            return "Preprocessing(language=" + str + ", lowerCase=" + bool + ", level=" + str2 + ", vocabulary=" + str3 + ", processSamplesApproach=" + str4 + ", startToken=" + str5 + ", unkToken=" + str6 + ", endToken=" + str7 + ", padToken=" + str8 + ", mapStopTokensToSpace=" + bool2 + ")";
        }

        public e(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2) {
            o.e(str2, "level");
            this.f312a = str;
            this.f313b = bool;
            this.f314c = str2;
            this.f315d = str3;
            this.f316e = str4;
            this.f317f = str5;
            this.f318g = str6;
            this.f319h = str7;
            this.f320i = str8;
            this.f321j = bool2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ e(java.lang.String r15, java.lang.Boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, int r25, kotlin.jvm.internal.i r26) {
            /*
                r14 = this;
                r0 = r25
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r7 = r2
                goto L_0x000b
            L_0x0009:
                r7 = r18
            L_0x000b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0011
                r8 = r2
                goto L_0x0013
            L_0x0011:
                r8 = r19
            L_0x0013:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0019
                r9 = r2
                goto L_0x001b
            L_0x0019:
                r9 = r20
            L_0x001b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0021
                r10 = r2
                goto L_0x0023
            L_0x0021:
                r10 = r21
            L_0x0023:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0029
                r11 = r2
                goto L_0x002b
            L_0x0029:
                r11 = r22
            L_0x002b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0031
                r12 = r2
                goto L_0x0033
            L_0x0031:
                r12 = r23
            L_0x0033:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0039
                r13 = r2
                goto L_0x003b
            L_0x0039:
                r13 = r24
            L_0x003b:
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.h0.e.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
        }
    }

    public /* synthetic */ h0(int i4, d dVar, c cVar, e eVar, C0 c02) {
        if (7 != (i4 & 7)) {
            C0317n0.a(i4, 7, a.f282a.a());
        }
        this.f279a = dVar;
        this.f280b = cVar;
        this.f281c = eVar;
    }

    public static /* synthetic */ h0 c(h0 h0Var, d dVar, c cVar, e eVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            dVar = h0Var.f279a;
        }
        if ((i4 & 2) != 0) {
            cVar = h0Var.f280b;
        }
        if ((i4 & 4) != 0) {
            eVar = h0Var.f281c;
        }
        return h0Var.b(dVar, cVar, eVar);
    }

    public static final /* synthetic */ void d(h0 h0Var, I2.d dVar, f fVar) {
        dVar.f(fVar, 0, d.a.f309a, h0Var.f279a);
        dVar.f(fVar, 1, c.a.f297a, h0Var.f280b);
        dVar.f(fVar, 2, e.a.f322a, h0Var.f281c);
    }

    public final c a() {
        return this.f280b;
    }

    public final h0 b(d dVar, c cVar, e eVar) {
        o.e(dVar, "model");
        o.e(cVar, "inference");
        o.e(eVar, "preprocessing");
        return new h0(dVar, cVar, eVar);
    }

    public final d e() {
        return this.f279a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (o.a(this.f279a, h0Var.f279a) && o.a(this.f280b, h0Var.f280b) && o.a(this.f281c, h0Var.f281c)) {
            return true;
        }
        return false;
    }

    public final e f() {
        return this.f281c;
    }

    public int hashCode() {
        return (((this.f279a.hashCode() * 31) + this.f280b.hashCode()) * 31) + this.f281c.hashCode();
    }

    public String toString() {
        d dVar = this.f279a;
        c cVar = this.f280b;
        e eVar = this.f281c;
        return "PredictionsTFModelConfig(model=" + dVar + ", inference=" + cVar + ", preprocessing=" + eVar + ")";
    }

    public h0(d dVar, c cVar, e eVar) {
        o.e(dVar, "model");
        o.e(cVar, "inference");
        o.e(eVar, "preprocessing");
        this.f279a = dVar;
        this.f280b = cVar;
        this.f281c = eVar;
    }
}
