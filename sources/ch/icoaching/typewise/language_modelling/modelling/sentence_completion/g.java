package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import F2.m;
import H2.f;
import I2.d;
import J2.C0;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.K;
import J2.O;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u0000 ,2\u00020\u0001:\u0002\u0019&Bk\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001eR,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010%\u001a\u0004\b1\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u00104\u0012\u0004\b6\u0010%\u001a\u0004\b*\u00105R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00104\u0012\u0004\b8\u0010%\u001a\u0004\b/\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00104\u0012\u0004\b9\u0010%\u001a\u0004\b7\u00105¨\u0006:"}, d2 = {"Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/g;", "", "", "seen0", "", "sentPossiblyUpper", "counts", "", "requiredChars", "Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/PositionFilter;", "positionFilter", "", "beginningOfMail", "beginningOfSentence", "newLine", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ILjava/util/Map;Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/PositionFilter;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "a", "(Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/g;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "getSentPossiblyUpper$annotations", "()V", "b", "I", "e", "getCounts$annotations", "c", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "getRequiredChars$annotations", "d", "Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/PositionFilter;", "g", "()Lch/icoaching/typewise/language_modelling/modelling/sentence_completion/PositionFilter;", "getPositionFilter$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getBeginningOfMail$annotations", "f", "getBeginningOfSentence$annotations", "getNewLine$annotations", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
@m
final class g {

    /* renamed from: h  reason: collision with root package name */
    public static final b f8756h = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final F2.b[] f8757i = {null, null, new O(G0.f622a, K.f636a), PositionFilter.Companion.serializer(), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f8758a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8759b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8760c;

    /* renamed from: d  reason: collision with root package name */
    private final PositionFilter f8761d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f8762e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f8763f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f8764g;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8765a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f8766b;

        static {
            a aVar = new a();
            f8765a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDescriptionJson", aVar, 7);
            s0Var.p("sent_possibly_upper", false);
            s0Var.p("counts", false);
            s0Var.p("required_chars", false);
            s0Var.p("position_filter", true);
            s0Var.p("beginning_of_mail", true);
            s0Var.p("beginning_of_sentence", true);
            s0Var.p("new_line", true);
            f8766b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f8766b;
        }

        public final F2.b[] c() {
            F2.b[] b4 = g.f8757i;
            F2.b bVar = b4[2];
            F2.b u3 = G2.a.u(b4[3]);
            C0306i iVar = C0306i.f706a;
            return new F2.b[]{G0.f622a, K.f636a, bVar, u3, G2.a.u(iVar), G2.a.u(iVar), G2.a.u(iVar)};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.Map} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: ch.icoaching.typewise.language_modelling.modelling.sentence_completion.PositionFilter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b5, code lost:
            r4 = 6;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g b(I2.e r29) {
            /*
                r28 = this;
                r0 = r29
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f8766b
                I2.c r0 = r0.d(r1)
                F2.b[] r2 = ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g.f8757i
                boolean r3 = r0.p()
                r4 = 6
                r5 = 5
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                r10 = 0
                r11 = 0
                if (r3 == 0) goto L_0x005f
                java.lang.String r3 = r0.z(r1, r10)
                int r9 = r0.v(r1, r9)
                r10 = r2[r8]
                java.lang.Object r8 = r0.E(r1, r8, r10, r11)
                java.util.Map r8 = (java.util.Map) r8
                r2 = r2[r7]
                java.lang.Object r2 = r0.m(r1, r7, r2, r11)
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.PositionFilter r2 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.PositionFilter) r2
                J2.i r7 = J2.C0306i.f706a
                java.lang.Object r6 = r0.m(r1, r6, r7, r11)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                java.lang.Object r5 = r0.m(r1, r5, r7, r11)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                java.lang.Object r4 = r0.m(r1, r4, r7, r11)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                r7 = 127(0x7f, float:1.78E-43)
                r23 = r2
                r20 = r3
                r26 = r4
                r25 = r5
                r24 = r6
                r19 = r7
                r22 = r8
                r21 = r9
                goto L_0x00e3
            L_0x005f:
                r17 = r9
                r3 = r10
                r9 = r11
                r12 = r9
                r13 = r12
                r14 = r13
                r15 = r14
                r10 = r15
                r11 = r3
            L_0x0069:
                if (r17 == 0) goto L_0x00d3
                int r8 = r0.e(r1)
                switch(r8) {
                    case -1: goto L_0x00cc;
                    case 0: goto L_0x00c0;
                    case 1: goto L_0x00b7;
                    case 2: goto L_0x00a9;
                    case 3: goto L_0x009d;
                    case 4: goto L_0x0091;
                    case 5: goto L_0x0085;
                    case 6: goto L_0x0078;
                    default: goto L_0x0072;
                }
            L_0x0072:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r8)
                throw r0
            L_0x0078:
                J2.i r8 = J2.C0306i.f706a
                java.lang.Object r8 = r0.m(r1, r4, r8, r9)
                r9 = r8
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                r3 = r3 | 64
            L_0x0083:
                r8 = 2
                goto L_0x0069
            L_0x0085:
                J2.i r8 = J2.C0306i.f706a
                java.lang.Object r8 = r0.m(r1, r5, r8, r10)
                r10 = r8
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                r3 = r3 | 32
                goto L_0x0083
            L_0x0091:
                J2.i r8 = J2.C0306i.f706a
                java.lang.Object r8 = r0.m(r1, r6, r8, r15)
                r15 = r8
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                r3 = r3 | 16
                goto L_0x0083
            L_0x009d:
                r8 = r2[r7]
                java.lang.Object r8 = r0.m(r1, r7, r8, r14)
                r14 = r8
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.PositionFilter r14 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.PositionFilter) r14
                r3 = r3 | 8
                goto L_0x0083
            L_0x00a9:
                r8 = 2
                r4 = r2[r8]
                java.lang.Object r4 = r0.E(r1, r8, r4, r13)
                r13 = r4
                java.util.Map r13 = (java.util.Map) r13
                r3 = r3 | 4
            L_0x00b5:
                r4 = 6
                goto L_0x0069
            L_0x00b7:
                r4 = 1
                r8 = 2
                int r11 = r0.v(r1, r4)
                r3 = r3 | 2
                goto L_0x00b5
            L_0x00c0:
                r4 = 1
                r8 = 2
                r12 = 0
                java.lang.String r16 = r0.z(r1, r12)
                r3 = r3 | 1
                r12 = r16
                goto L_0x00b5
            L_0x00cc:
                r4 = 1
                r8 = 2
                r16 = 0
                r17 = r16
                goto L_0x00b5
            L_0x00d3:
                r19 = r3
                r26 = r9
                r25 = r10
                r21 = r11
                r20 = r12
                r22 = r13
                r23 = r14
                r24 = r15
            L_0x00e3:
                r0.c(r1)
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g r0 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g
                r27 = 0
                r18 = r0
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g.a.b(I2.e):ch.icoaching.typewise.language_modelling.modelling.sentence_completion.g");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, g gVar) {
            o.e(fVar, "encoder");
            o.e(gVar, "value");
            f fVar2 = f8766b;
            d d4 = fVar.d(fVar2);
            g.a(gVar, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f8765a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public /* synthetic */ g(int i4, String str, int i5, Map map, PositionFilter positionFilter, Boolean bool, Boolean bool2, Boolean bool3, C0 c02) {
        if (7 != (i4 & 7)) {
            C0317n0.a(i4, 7, a.f8765a.a());
        }
        this.f8758a = str;
        this.f8759b = i5;
        this.f8760c = map;
        if ((i4 & 8) == 0) {
            this.f8761d = null;
        } else {
            this.f8761d = positionFilter;
        }
        if ((i4 & 16) == 0) {
            this.f8762e = null;
        } else {
            this.f8762e = bool;
        }
        if ((i4 & 32) == 0) {
            this.f8763f = null;
        } else {
            this.f8763f = bool2;
        }
        if ((i4 & 64) == 0) {
            this.f8764g = null;
        } else {
            this.f8764g = bool3;
        }
    }

    public static final /* synthetic */ void a(g gVar, d dVar, f fVar) {
        F2.b[] bVarArr = f8757i;
        dVar.p(fVar, 0, gVar.f8758a);
        dVar.z(fVar, 1, gVar.f8759b);
        dVar.f(fVar, 2, bVarArr[2], gVar.f8760c);
        if (dVar.n(fVar, 3) || gVar.f8761d != null) {
            dVar.o(fVar, 3, bVarArr[3], gVar.f8761d);
        }
        if (dVar.n(fVar, 4) || gVar.f8762e != null) {
            dVar.o(fVar, 4, C0306i.f706a, gVar.f8762e);
        }
        if (dVar.n(fVar, 5) || gVar.f8763f != null) {
            dVar.o(fVar, 5, C0306i.f706a, gVar.f8763f);
        }
        if (dVar.n(fVar, 6) || gVar.f8764g != null) {
            dVar.o(fVar, 6, C0306i.f706a, gVar.f8764g);
        }
    }

    public final Boolean c() {
        return this.f8762e;
    }

    public final Boolean d() {
        return this.f8763f;
    }

    public final int e() {
        return this.f8759b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return o.a(this.f8758a, gVar.f8758a) && this.f8759b == gVar.f8759b && o.a(this.f8760c, gVar.f8760c) && this.f8761d == gVar.f8761d && o.a(this.f8762e, gVar.f8762e) && o.a(this.f8763f, gVar.f8763f) && o.a(this.f8764g, gVar.f8764g);
    }

    public final Boolean f() {
        return this.f8764g;
    }

    public final PositionFilter g() {
        return this.f8761d;
    }

    public final Map h() {
        return this.f8760c;
    }

    public int hashCode() {
        int hashCode = ((((this.f8758a.hashCode() * 31) + this.f8759b) * 31) + this.f8760c.hashCode()) * 31;
        PositionFilter positionFilter = this.f8761d;
        int i4 = 0;
        int hashCode2 = (hashCode + (positionFilter == null ? 0 : positionFilter.hashCode())) * 31;
        Boolean bool = this.f8762e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f8763f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f8764g;
        if (bool3 != null) {
            i4 = bool3.hashCode();
        }
        return hashCode4 + i4;
    }

    public final String i() {
        return this.f8758a;
    }

    public String toString() {
        String str = this.f8758a;
        int i4 = this.f8759b;
        Map map = this.f8760c;
        PositionFilter positionFilter = this.f8761d;
        Boolean bool = this.f8762e;
        Boolean bool2 = this.f8763f;
        Boolean bool3 = this.f8764g;
        return "SentenceDescriptionJson(sentPossiblyUpper=" + str + ", counts=" + i4 + ", requiredChars=" + map + ", positionFilter=" + positionFilter + ", beginningOfMail=" + bool + ", beginningOfSentence=" + bool2 + ", newLine=" + bool3 + ")";
    }
}
