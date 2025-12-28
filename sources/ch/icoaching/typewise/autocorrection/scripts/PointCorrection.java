package ch.icoaching.typewise.autocorrection.scripts;

import B0.B;
import B0.C0254b;
import B0.C0263k;
import B0.C0264l;
import B0.n;
import B0.t;
import B0.w;
import E0.m;
import E0.p;
import E0.s;
import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.autocorrection.scripts.i;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import ch.icoaching.typewise.global_cache.GlobalCache;
import com.ibm.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.C0870b;
import r0.c;
import r0.d;
import r0.g;
import u2.l;

public class PointCorrection implements B {

    /* renamed from: z  reason: collision with root package name */
    public static final a f7944z = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final IDictionaryRepository f7945a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7946b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7947c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7948d;

    /* renamed from: e  reason: collision with root package name */
    private final ConfigHolder f7949e;

    /* renamed from: f  reason: collision with root package name */
    private final f f7950f;

    /* renamed from: g  reason: collision with root package name */
    private Map f7951g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7952h;

    /* renamed from: i  reason: collision with root package name */
    private final int f7953i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f7954j;

    /* renamed from: k  reason: collision with root package name */
    private final float f7955k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f7956l;

    /* renamed from: m  reason: collision with root package name */
    private final float f7957m;

    /* renamed from: n  reason: collision with root package name */
    private final Set f7958n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7959o;

    /* renamed from: p  reason: collision with root package name */
    private final double f7960p;

    /* renamed from: q  reason: collision with root package name */
    private Set f7961q;

    /* renamed from: r  reason: collision with root package name */
    private Set f7962r;

    /* renamed from: s  reason: collision with root package name */
    private final i f7963s;

    /* renamed from: t  reason: collision with root package name */
    private ch.icoaching.typewise.autocorrection.scripts.capitalization.a f7964t;

    /* renamed from: u  reason: collision with root package name */
    private CombinationModel f7965u;

    /* renamed from: v  reason: collision with root package name */
    private Set f7966v;

    /* renamed from: w  reason: collision with root package name */
    private String f7967w;

    /* renamed from: x  reason: collision with root package name */
    private final int f7968x;

    /* renamed from: y  reason: collision with root package name */
    private final f f7969y;

    public static final class a {
        private a() {
        }

        public final List a(int i4, d dVar, List list) {
            List list2;
            o.e(dVar, "strippedWord");
            o.e(list, "touchPoints");
            int length = i4 + dVar.d().length();
            if (dVar.g().length() == 0) {
                list2 = C0718m.j();
            } else if (dVar.f().length() > 0) {
                list2 = m.g(list, length, Integer.valueOf(-dVar.f().length()));
            } else {
                list2 = m.h(list, length, (Integer) null, 2, (Object) null);
            }
            if (list2.size() == dVar.g().length()) {
                return list2;
            }
            throw new RuntimeException("Word 1 lengths not equal to TPs " + dVar + ", " + list + " -> " + list2);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7970a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices[] r0 = ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices r1 = ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices.SINGLE_TRIGGER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices r1 = ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices.MULTI_TRIGGER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices r1 = ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices.NO_TRIGGER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices r1 = ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices.URL_FOUND     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices r1 = ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices.FIRST_LINE_NAME     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f7970a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.b.<clinit>():void");
        }
    }

    public PointCorrection(IDictionaryRepository iDictionaryRepository, Map map, float f4, String str, boolean z3, boolean z4, ConfigHolder configHolder, f fVar) {
        Set set;
        Map map2 = map;
        String str2 = str;
        ConfigHolder configHolder2 = configHolder;
        f fVar2 = fVar;
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(map2, "keyPositions");
        o.e(str2, "language");
        o.e(configHolder2, "configHolder");
        o.e(fVar2, "_triggerHelper");
        this.f7945a = iDictionaryRepository;
        this.f7946b = map2;
        this.f7947c = z3;
        this.f7948d = z4;
        this.f7949e = configHolder2;
        this.f7950f = fVar2;
        Map map3 = (Map) configHolder.c().e().h().get(str2);
        this.f7951g = map3 == null ? D.h() : map3;
        this.f7952h = configHolder.c().e().j().g();
        this.f7953i = configHolder.c().e().j().k();
        this.f7954j = configHolder.c().e().j().y();
        this.f7955k = configHolder.c().e().j().z().a();
        this.f7956l = configHolder.c().e().j().j();
        this.f7957m = configHolder.c().e().j().z().b();
        this.f7958n = L.h('a', 'e', 'i', 'o', Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION), 'h');
        this.f7959o = configHolder.c().e().j().i();
        this.f7960p = configHolder.c().e().j().m();
        Set set2 = (Set) configHolder.c().e().e().get(str2);
        this.f7961q = set2 == null ? L.e() : set2;
        Set set3 = (Set) configHolder.c().e().f().get(str2);
        this.f7962r = set3 == null ? L.e() : set3;
        this.f7963s = new i(iDictionaryRepository, configHolder.c().e().j().A(), map, f4, fVar, str, configHolder);
        this.f7967w = str2;
        Map t4 = configHolder.c().e().j().t();
        if (t4.containsKey(str2)) {
            Object obj = t4.get(str2);
            o.b(obj);
            set = C0718m.F0((Iterable) obj);
        } else {
            set = L.e();
        }
        this.f7966v = set;
        this.f7968x = 23;
        this.f7969y = fVar2;
    }

    private final void A(List list, List list2, List list3, float f4) {
        String str;
        if (list.size() > 1) {
            str = (String) list.get(list.size() - 2);
        } else {
            str = "";
        }
        for (Pair pair : C0718m.J0(list2, list3)) {
            int intValue = ((Number) pair.component1()).intValue();
            String str2 = (String) pair.component2();
            if (intValue != 1) {
                if (str.length() > 0) {
                    str2 = str + " " + str2;
                } else if (str2 == null) {
                    str2 = "";
                }
                ch.icoaching.typewise.global_cache.a.a().h(new Pair("autocorrection_prev_best_score", str2), Float.valueOf(f4), new a(), new b());
            }
        }
    }

    private static final boolean B(List list, String str) {
        if (((CharSequence) list.get(1)).length() > 0 && ((String) list.get(1)).charAt(0) == '\'' && kotlin.text.o.T0(str) == '\'') {
            return true;
        }
        return false;
    }

    private static final boolean C(List list, String str, d dVar) {
        if (((CharSequence) list.get(1)).length() <= 0 || ((String) list.get(1)).charAt(0) != '\'' || str.length() <= 1 || s.l(str, -2) != '\'' || dVar.h().length() <= 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final Object H(Object obj) {
        o.e(obj, "it");
        return (Float) obj;
    }

    private final String J(d dVar) {
        return (String) this.f7951g.get(dVar.h());
    }

    /* access modifiers changed from: private */
    public static final String K(Object obj) {
        o.e(obj, "it");
        return GlobalCache.f8267c.a((Pair) obj);
    }

    /* access modifiers changed from: private */
    public static final Object L(Object obj) {
        o.e(obj, "it");
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object q(ch.icoaching.typewise.autocorrection.scripts.PointCorrection r10, B0.L r11, int r12, java.lang.String r13, kotlin.coroutines.c r14) {
        /*
            boolean r0 = r14 instanceof ch.icoaching.typewise.autocorrection.scripts.PointCorrection$pointCorrection$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$pointCorrection$1 r0 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection$pointCorrection$1) r0
            int r1 = r0.f7985c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7985c = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$pointCorrection$1 r0 = new ch.icoaching.typewise.autocorrection.scripts.PointCorrection$pointCorrection$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f7983a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f7985c
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.f.b(r14)
            goto L_0x00f2
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            kotlin.f.b(r14)
            ch.icoaching.typewise.e r14 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "pointCorrection() :: "
            r2.append(r4)
            r2.append(r11)
            java.lang.String r4 = " | "
            r2.append(r4)
            r2.append(r12)
            r2.append(r4)
            r2.append(r13)
            java.lang.String r6 = r2.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "PointCorrection"
            r7 = 0
            r4 = r14
            ch.icoaching.typewise.e.b(r4, r5, r6, r7, r8, r9)
            ch.icoaching.typewise.autocorrection.scripts.f r2 = r10.a()
            java.lang.String r4 = r11.c()
            ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices r2 = r2.q(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "pointCorrection() :: runDecision = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r6 = r4.toString()
            java.lang.String r5 = "PointCorrection"
            r4 = r14
            ch.icoaching.typewise.e.j(r4, r5, r6, r7, r8, r9)
            int[] r4 = ch.icoaching.typewise.autocorrection.scripts.PointCorrection.b.f7970a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            if (r2 == r3) goto L_0x00e9
            r10 = 2
            if (r2 == r10) goto L_0x00d6
            r10 = 3
            if (r2 == r10) goto L_0x00c4
            r10 = 4
            if (r2 == r10) goto L_0x00b2
            r10 = 5
            if (r2 != r10) goto L_0x00aa
            r4 = 4
            r5 = 0
            java.lang.String r1 = "PointCorrection"
            java.lang.String r2 = "splitWord() :: No correction: First line name"
            r3 = 0
            r0 = r14
            ch.icoaching.typewise.e.b(r0, r1, r2, r3, r4, r5)
            r0.b$a r10 = r0.C0870b.f16001h
            r0.b r10 = r10.a()
            return r10
        L_0x00aa:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unknown runDecision"
            r10.<init>(r11)
            throw r10
        L_0x00b2:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "PointCorrection"
            java.lang.String r2 = "splitWord() :: No correction: URL found"
            r3 = 0
            r0 = r14
            ch.icoaching.typewise.e.b(r0, r1, r2, r3, r4, r5)
            r0.b$a r10 = r0.C0870b.f16001h
            r0.b r10 = r10.a()
            return r10
        L_0x00c4:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "PointCorrection"
            java.lang.String r2 = "splitWord() :: No correction: No trigger"
            r3 = 0
            r0 = r14
            ch.icoaching.typewise.e.b(r0, r1, r2, r3, r4, r5)
            r0.b$a r10 = r0.C0870b.f16001h
            r0.b r10 = r10.a()
            return r10
        L_0x00d6:
            r0.b$a r10 = r0.C0870b.f16001h
            java.lang.String r11 = r11.c()
            char r11 = kotlin.text.o.T0(r11)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.b r10 = r10.b(r11)
            return r10
        L_0x00e9:
            r0.f7985c = r3
            java.lang.Object r14 = r10.G(r11, r12, r13, r0)
            if (r14 != r1) goto L_0x00f2
            return r1
        L_0x00f2:
            r0.b r14 = (r0.C0870b) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.q(ch.icoaching.typewise.autocorrection.scripts.PointCorrection, B0.L, int, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.util.List r19, float r20, kotlin.coroutines.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof ch.icoaching.typewise.autocorrection.scripts.PointCorrection$runFullInferenceProcedure$1
            if (r2 == 0) goto L_0x0018
            r2 = r1
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$runFullInferenceProcedure$1 r2 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection$runFullInferenceProcedure$1) r2
            int r3 = r2.f7991f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f7991f = r3
        L_0x0016:
            r10 = r2
            goto L_0x001e
        L_0x0018:
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$runFullInferenceProcedure$1 r2 = new ch.icoaching.typewise.autocorrection.scripts.PointCorrection$runFullInferenceProcedure$1
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r10.f7989d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r10.f7991f
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            boolean r2 = r10.f7988c
            java.lang.Object r3 = r10.f7987b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r10.f7986a
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection r4 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection) r4
            kotlin.f.b(r1)
            r5 = r3
            goto L_0x011f
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            kotlin.f.b(r1)
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel r3 = r0.f7965u
            if (r3 == 0) goto L_0x0148
            B0.w r1 = r18.F(r19)
            B0.t r5 = r1.a()
            java.util.List r7 = r1.b()
            boolean r1 = r1.c()
            ch.icoaching.typewise.e r6 = ch.icoaching.typewise.e.f8233a
            java.util.List r8 = r5.c()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "runFullInferenceProcedure() :: suggestedWords = "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r13 = r9.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "PointCorrection"
            r14 = 0
            r11 = r6
            ch.icoaching.typewise.e.j(r11, r12, r13, r14, r15, r16)
            java.util.List r8 = r5.a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "runFullInferenceProcedure() :: features = "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r13 = r9.toString()
            java.lang.String r12 = "PointCorrection"
            r11 = r6
            ch.icoaching.typewise.e.j(r11, r12, r13, r14, r15, r16)
            java.util.List r8 = r5.b()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "runFullInferenceProcedure() :: spaceSplitIndices = "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r13 = r9.toString()
            java.lang.String r12 = "PointCorrection"
            r11 = r6
            ch.icoaching.typewise.e.j(r11, r12, r13, r14, r15, r16)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "runFullInferenceProcedure() :: whichSplitList = "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r13 = r8.toString()
            java.lang.String r12 = "PointCorrection"
            ch.icoaching.typewise.e.j(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x00d1
            B0.C$a r2 = B0.C.f37e
            B0.C r2 = r2.a()
            goto L_0x0142
        L_0x00d1:
            java.util.List r6 = r5.a()
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.C0718m.t(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x00e4:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00f8
            java.lang.Object r9 = r6.next()
            r0.a r9 = (r0.C0869a) r9
            java.util.List r9 = r9.a()
            r8.add(r9)
            goto L_0x00e4
        L_0x00f8:
            java.util.List r6 = r5.c()
            java.util.List r9 = r5.b()
            r10.f7986a = r0
            r13 = r19
            r10.f7987b = r13
            r10.f7988c = r1
            r10.f7991f = r4
            r11 = 32
            r12 = 0
            r14 = 0
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r20
            r9 = r14
            java.lang.Object r3 = ch.icoaching.typewise.autocorrection.scripts.CombinationModel.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L_0x011b
            return r2
        L_0x011b:
            r4 = r0
            r2 = r1
            r1 = r3
            r5 = r13
        L_0x011f:
            B0.C r1 = (B0.C) r1
            double r6 = r4.f7960p
            java.util.Set r8 = r4.f7962r
            float r9 = r4.f7955k
            float r10 = r4.f7957m
            ch.icoaching.typewise.autocorrection.scripts.f r3 = r4.a()
            java.util.Set r11 = r3.m()
            ch.icoaching.typewise.autocorrection.scripts.f r3 = r4.a()
            java.util.Set r12 = r3.i()
            r4 = r1
            r4.f(r5, r6, r8, r9, r10, r11, r12)
            r17 = r2
            r2 = r1
            r1 = r17
        L_0x0142:
            B0.c r3 = new B0.c
            r3.<init>(r2, r1)
            return r3
        L_0x0148:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Combination Model is not initialized!"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.t(java.util.List, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final String v(Object obj) {
        o.e(obj, "it");
        return GlobalCache.f8267c.a((Pair) obj);
    }

    private final C0870b y(List list, C0264l lVar, String str) {
        d e4 = ((g) list.get(0)).e();
        String d4 = e4.d();
        String h4 = e4.h();
        String f4 = e4.f();
        char e5 = lVar.e();
        return C0870b.f16001h.c(d4 + h4 + f4 + e5, e4.h());
    }

    public final boolean D(d dVar) {
        String e4;
        o.e(dVar, "strippedWord");
        List<String> o4 = C0718m.o(dVar.g());
        String c4 = dVar.c();
        if (!(c4 == null || c4.length() == 0)) {
            String c5 = dVar.c();
            String g4 = dVar.g();
            o4.add(c5 + g4);
        }
        String e5 = dVar.e();
        if (!(e5 == null || e5.length() == 0)) {
            String g5 = dVar.g();
            String e6 = dVar.e();
            o4.add(g5 + e6);
        }
        String c6 = dVar.c();
        if (!(c6 == null || c6.length() == 0 || (e4 = dVar.e()) == null || e4.length() == 0)) {
            String c7 = dVar.c();
            String g6 = dVar.g();
            String e7 = dVar.e();
            o4.add(c7 + g6 + e7);
        }
        if (!(o4 instanceof Collection) || !o4.isEmpty()) {
            for (String contains : o4) {
                if (this.f7961q.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C0254b E(g gVar, String str, int i4, List list, List list2) {
        String str2;
        String str3 = str;
        List list3 = list;
        List list4 = list2;
        o.e(gVar, "split");
        o.e(str3, "charsToAdd");
        o.e(list3, "bestSuggestions");
        o.e(list4, "whichSplitList");
        d e4 = gVar.e();
        String str4 = str3 + gVar.e().h();
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        g c4 = g.c(gVar, d.b(e4, str4, lowerCase + gVar.e().g(), kotlin.text.o.R0(gVar.e().d(), str.length()), (String) null, (String) null, (String) null, 56, (Object) null), (String) null, (List) null, 0, (TextCase) null, 30, (Object) null);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((Number) list4.get(i5)).intValue() == i4) {
                str2 = str3 + list3.get(i5);
            } else {
                str2 = (String) list3.get(i5);
            }
            arrayList.add(str2);
        }
        return new C0254b(c4, arrayList);
    }

    public final w F(List list) {
        int i4;
        o.e(list, "splits");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = list.size();
        int i5 = 4;
        int i6 = 0;
        boolean z3 = false;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (i6 != 0 || !this.f7948d) {
                i4 = 0;
            } else {
                i4 = this.f7953i;
            }
            i.c p4 = p((g) list.get(i6), i4, i5 + 1);
            int size2 = p4.c().c().size();
            ArrayList arrayList5 = new ArrayList(size2);
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList5.add(Integer.valueOf(i6));
            }
            arrayList4.addAll(arrayList5);
            arrayList.addAll(p4.c().c());
            arrayList2.addAll(p4.c().a());
            arrayList3.addAll(p4.c().b());
            boolean a4 = p4.a();
            if (a4) {
                z3 = a4;
                break;
            }
            int ceil = (int) ((float) Math.ceil((double) p4.b()));
            if (ceil < i5) {
                i5 = ceil;
            }
            i6++;
            z3 = a4;
        }
        return new w(new t(arrayList, arrayList2, arrayList3), arrayList4, z3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(B0.L r23, int r24, java.lang.String r25, kotlin.coroutines.c r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r26
            r2 = 0
            r3 = 1
            boolean r4 = r1 instanceof ch.icoaching.typewise.autocorrection.scripts.PointCorrection$singleTriggerCorrection$1
            if (r4 == 0) goto L_0x001a
            r4 = r1
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$singleTriggerCorrection$1 r4 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection$singleTriggerCorrection$1) r4
            int r5 = r4.f7999h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.f7999h = r5
        L_0x0018:
            r13 = r4
            goto L_0x0020
        L_0x001a:
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$singleTriggerCorrection$1 r4 = new ch.icoaching.typewise.autocorrection.scripts.PointCorrection$singleTriggerCorrection$1
            r4.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r13.f7997f
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r13.f7999h
            r6 = 2
            r7 = 0
            if (r5 == 0) goto L_0x0056
            if (r5 == r3) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            kotlin.f.b(r1)
            goto L_0x0231
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r3 = r13.f7996e
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r13.f7995d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r8 = r13.f7994c
            B0.l r8 = (B0.C0264l) r8
            java.lang.Object r9 = r13.f7993b
            B0.L r9 = (B0.L) r9
            java.lang.Object r10 = r13.f7992a
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection r10 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection) r10
            kotlin.f.b(r1)
            goto L_0x017f
        L_0x0056:
            kotlin.f.b(r1)
            B0.l r8 = r22.l(r23)
            r1 = r24
            r5 = r25
            E0.o r1 = r0.n(r8, r1, r5)
            java.lang.Object r5 = r1.a()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r1.b()
            java.lang.String r1 = (java.lang.String) r1
            ch.icoaching.typewise.e r14 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "singleTriggerCorrection() :: splits = "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r16 = r9.toString()
            r18 = 4
            r19 = 0
            java.lang.String r15 = "PointCorrection"
            r17 = 0
            ch.icoaching.typewise.e.j(r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0096
            r0.b r1 = r0.y(r5, r8, r1)
            return r1
        L_0x0096:
            ch.icoaching.typewise.autocorrection.scripts.f r1 = r22.a()
            java.lang.String r9 = r8.f()
            r10 = 3
            r11 = 69
            java.util.List r1 = r1.k(r9, r10, r11)
            float r9 = r0.h(r1)
            java.lang.Object r10 = r5.get(r2)
            r0.g r10 = (r0.g) r10
            r0.d r10 = r10.e()
            boolean r10 = r0.D(r10)
            java.lang.Object r11 = r5.get(r2)
            r0.g r11 = (r0.g) r11
            r0.d r11 = r11.e()
            java.lang.String r11 = r0.J(r11)
            boolean r12 = r0.f7959o
            if (r12 != 0) goto L_0x0104
            java.util.Iterator r12 = r5.iterator()
        L_0x00cd:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0104
            java.lang.Object r14 = r12.next()
            r0.g r14 = (r0.g) r14
            r0.d r14 = r14.e()
            java.lang.String r14 = r14.h()
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            java.lang.String r15 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r14, r15)
            int r15 = r14.length()
            if (r15 != r3) goto L_0x00cd
            java.util.Set r15 = r0.f7966v
            char r14 = r14.charAt(r2)
            java.lang.Character r14 = kotlin.coroutines.jvm.internal.a.b(r14)
            boolean r14 = r15.contains(r14)
            if (r14 != 0) goto L_0x00cd
            r12 = r3
            goto L_0x0105
        L_0x0104:
            r12 = r2
        L_0x0105:
            r20 = 1065353216(0x3f800000, float:1.0)
            r14 = -1
            if (r11 == 0) goto L_0x015c
            java.lang.String r9 = " "
            boolean r9 = kotlin.text.o.L(r11, r9, r2, r6, r7)
            if (r9 == 0) goto L_0x0121
            r18 = 6
            r19 = 0
            java.lang.String r15 = " "
            r16 = 0
            r17 = 0
            r14 = r11
            int r14 = kotlin.text.o.V(r14, r15, r16, r17, r18, r19)
        L_0x0121:
            B0.C r9 = new B0.C
            java.lang.String[] r10 = new java.lang.String[]{r11}
            java.util.List r10 = kotlin.collections.C0718m.o(r10)
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.a.d(r2)
            java.lang.Integer[] r12 = new java.lang.Integer[r3]
            r12[r2] = r11
            java.util.List r11 = kotlin.collections.C0718m.o(r12)
            java.lang.Float r12 = kotlin.coroutines.jvm.internal.a.c(r20)
            java.lang.Float[] r15 = new java.lang.Float[r3]
            r15[r2] = r12
            java.util.List r12 = kotlin.collections.C0718m.o(r15)
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.a.d(r14)
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r3[r2] = r14
            java.util.List r3 = kotlin.collections.C0718m.o(r3)
            r9.<init>(r10, r11, r12, r3)
            r3 = r1
            r1 = r2
            r6 = r8
            r11 = r9
            r9 = r23
        L_0x0158:
            r8 = r5
            r5 = r0
            goto L_0x01d2
        L_0x015c:
            if (r10 != 0) goto L_0x0160
            if (r12 == 0) goto L_0x0163
        L_0x0160:
            r10 = r23
            goto L_0x018d
        L_0x0163:
            r13.f7992a = r0
            r10 = r23
            r13.f7993b = r10
            r13.f7994c = r8
            r13.f7995d = r5
            r13.f7996e = r1
            r13.f7999h = r3
            java.lang.Object r3 = r0.t(r5, r9, r13)
            if (r3 != r4) goto L_0x0178
            return r4
        L_0x0178:
            r9 = r10
            r10 = r0
            r21 = r3
            r3 = r1
            r1 = r21
        L_0x017f:
            B0.c r1 = (B0.C0255c) r1
            B0.C r11 = r1.a()
            boolean r1 = r1.b()
            r6 = r8
            r8 = r5
            r5 = r10
            goto L_0x01d2
        L_0x018d:
            B0.C r9 = new B0.C
            java.lang.Object r11 = kotlin.collections.C0718m.R(r5)
            r0.g r11 = (r0.g) r11
            r0.d r11 = r11.e()
            java.lang.String r11 = r11.g()
            java.lang.String[] r11 = new java.lang.String[]{r11}
            java.util.List r11 = kotlin.collections.C0718m.o(r11)
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.a.d(r2)
            java.lang.Integer[] r15 = new java.lang.Integer[r3]
            r15[r2] = r12
            java.util.List r12 = kotlin.collections.C0718m.o(r15)
            java.lang.Float r15 = kotlin.coroutines.jvm.internal.a.c(r20)
            java.lang.Float[] r6 = new java.lang.Float[r3]
            r6[r2] = r15
            java.util.List r6 = kotlin.collections.C0718m.o(r6)
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.a.d(r14)
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r3[r2] = r14
            java.util.List r3 = kotlin.collections.C0718m.o(r3)
            r9.<init>(r11, r12, r6, r3)
            r3 = r1
            r1 = r2
            r6 = r8
            r11 = r9
            r9 = r10
            goto L_0x0158
        L_0x01d2:
            if (r1 == 0) goto L_0x01db
            java.lang.String r1 = "No correction: Potential compound noun"
        L_0x01d6:
            r0.b r1 = r5.y(r8, r6, r1)
            return r1
        L_0x01db:
            java.util.List r1 = r11.m()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01e8
            java.lang.String r1 = "No correction: All suggestions filtered out"
            goto L_0x01d6
        L_0x01e8:
            java.util.List r1 = r11.n()
            java.util.List r10 = r11.m()
            java.util.List r12 = r11.b()
            java.lang.Object r2 = r12.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5.A(r3, r1, r10, r2)
            java.util.List r1 = r11.m()
            char r2 = r6.e()
            java.util.List r3 = r11.n()
            java.util.List r10 = r11.b()
            java.util.List r11 = r11.k()
            java.lang.String r12 = r9.c()
            r13.f7992a = r7
            r13.f7993b = r7
            r13.f7994c = r7
            r13.f7995d = r7
            r13.f7996e = r7
            r6 = 2
            r13.f7999h = r6
            r6 = r1
            r7 = r8
            r8 = r2
            r9 = r3
            java.lang.Object r1 = r5.u(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r4) goto L_0x0231
            return r4
        L_0x0231:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.G(B0.L, int, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final String I(String str) {
        o.e(str, "word");
        return f.A(a(), str, false, 2, (Object) null).g();
    }

    public f a() {
        return this.f7969y;
    }

    public String b() {
        return this.f7967w;
    }

    public Object c(B0.L l4, int i4, String str, c cVar) {
        return q(this, l4, i4, str, cVar);
    }

    public float h(List list) {
        o.e(list, "contextStringList");
        Object c4 = ch.icoaching.typewise.global_cache.a.a().c(new Pair("autocorrection_prev_best_score", C0718m.Z(m.g(list, -3, -1), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null)), new c(), new d(), Float.valueOf(this.f7949e.c().e().j().l()));
        o.c(c4, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) c4).floatValue();
    }

    public final C0254b i(g gVar, int i4, List list, List list2) {
        List list3;
        g gVar2;
        o.e(gVar, "split");
        o.e(list, "bestSuggestions");
        o.e(list2, "whichSplitList");
        E0.o o4 = o(gVar.e().d(), gVar.e().f());
        String str = (String) o4.a();
        String str2 = (String) o4.b();
        if (str.length() > 0) {
            C0254b E3 = E(gVar, str, i4, list, list2);
            g a4 = E3.a();
            list3 = E3.b();
            gVar2 = a4;
        } else {
            gVar2 = gVar;
            list3 = list;
        }
        if (str2.length() > 0) {
            C0254b j4 = j(gVar2, str2, i4, list3, list2);
            gVar2 = j4.a();
            list3 = j4.b();
        }
        return new C0254b(gVar2, list3);
    }

    public final C0254b j(g gVar, String str, int i4, List list, List list2) {
        String str2;
        String str3 = str;
        List list3 = list;
        List list4 = list2;
        o.e(gVar, "split");
        o.e(str3, "charsToAdd");
        o.e(list3, "bestSuggestions");
        o.e(list4, "whichSplitList");
        d e4 = gVar.e();
        String str4 = gVar.e().h() + str3;
        String g4 = gVar.e().g();
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        g c4 = g.c(gVar, d.b(e4, str4, g4 + lowerCase, (String) null, kotlin.text.o.Q0(gVar.e().f(), str.length()), (String) null, (String) null, 52, (Object) null), (String) null, (List) null, 0, (TextCase) null, 30, (Object) null);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((Number) list4.get(i5)).intValue() == i4) {
                str2 = list3.get(i5) + str3;
            } else {
                str2 = (String) list3.get(i5);
            }
            arrayList.add(str2);
        }
        return new C0254b(c4, arrayList);
    }

    public C0263k k(C0264l lVar, List list) {
        String str;
        Integer num;
        List list2 = list;
        o.e(lVar, "cleanedInput");
        o.e(list2, "splitString");
        String str2 = (String) C0718m.b0(list);
        int i4 = 1;
        int i5 = (-str2.length()) - 1;
        Locale locale = Locale.ROOT;
        String lowerCase = ((String) C0718m.b0(list)).toLowerCase(locale);
        o.d(lowerCase, "toLowerCase(...)");
        int i6 = -lowerCase.length();
        ch.icoaching.typewise.autocorrection.scripts.capitalization.a aVar = null;
        if (list.size() <= 1 || lVar.b()) {
            num = null;
            str = null;
        } else {
            String lowerCase2 = ((String) m.e(list2, -2)).toLowerCase(locale);
            o.d(lowerCase2, "toLowerCase(...)");
            int length = (i6 - 1) - lowerCase2.length();
            Integer valueOf = Integer.valueOf(length);
            String o4 = s.o(lVar.c(), length, (Integer) null, 2, (Object) null);
            i4 = (-o4.length()) - 1;
            str = o4;
            num = valueOf;
        }
        d z3 = z(str2);
        ch.icoaching.typewise.autocorrection.scripts.capitalization.a aVar2 = this.f7964t;
        if (aVar2 == null) {
            o.p("capitalizer");
        } else {
            aVar = aVar2;
        }
        n a4 = aVar.a(list2, lVar.a(), i5, i4);
        return new C0263k(new g(z3, a().g(lVar.f(), i6), f7944z.a(i6, z3, lVar.d()), i5, a4.a()), a4, i6, num, str, i4);
    }

    public final C0264l l(B0.L l4) {
        int i4;
        o.e(l4, "inputData");
        String c4 = l4.c();
        String lowerCase = l4.c().toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        List x3 = x(lowerCase, l4.d());
        List a4 = l4.a();
        char l5 = s.l(c4, -1);
        p pVar = (p) m.e(x3, -1);
        if (a4 == null || a4.size() != c4.length()) {
            int length = c4.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i5 = 0; i5 < length; i5++) {
                arrayList.add(TextCase.LOWER);
            }
            a4 = arrayList;
        }
        String n4 = s.n(c4, 0, -1);
        List g4 = m.g(x3, 0, -1);
        List g5 = m.g(a4, 0, -1);
        List k4 = a().k(n4, 3, 69);
        if ((l4.b() || k4.size() >= 3) && (!l4.b() || k4.size() >= 2)) {
            int i6 = -2;
            if (!l4.b()) {
                i4 = (-1 - ((String) m.e(k4, -1)).length()) - ((String) m.e(k4, -2)).length();
                i6 = -3;
            } else {
                i4 = ((String) m.e(k4, -1)).length() * -1;
            }
            int length2 = (-1 - ((String) m.e(k4, i6)).length()) + i4;
            g4 = m.h(g4, i4, (Integer) null, 2, (Object) null);
            n4 = s.o(n4, length2, (Integer) null, 2, (Object) null);
            g5 = m.h(g5, length2, (Integer) null, 2, (Object) null);
        }
        return new C0264l(n4, g4, g5, l5, pVar, l4.b());
    }

    public final E0.o m(C0264l lVar, int i4, n nVar, String str, int i5, int i6, int i7, String str2) {
        o.e(lVar, "cleanedInput");
        o.e(nVar, "stringCasing");
        o.e(str, "wordWhole");
        o.e(str2, "previousCorrectedString");
        String n4 = s.n(lVar.f(), i6, Integer.valueOf(i5 - 1));
        String o4 = s.o(lVar.f(), i5, (Integer) null, 2, (Object) null);
        if (this.f7961q.contains(n4) || this.f7961q.contains(o4) || a().e(n4) || ((CharSequence) a().v(n4, true).getSecond()).length() > 0 || ((CharSequence) a().x(o4, "").getSecond()).length() > 0) {
            return new E0.o(g.f16031f.a(), Boolean.TRUE);
        }
        d z3 = z(str);
        List a4 = f7944z.a(i6, z3, lVar.d());
        if (i4 == 0) {
            str2 = a().g(lVar.f(), i6);
        }
        return new E0.o(new g(z3, str2, a4, i7, nVar.b()), Boolean.FALSE);
    }

    public final E0.o n(C0264l lVar, int i4, String str) {
        TextCase textCase;
        C0264l lVar2 = lVar;
        o.e(lVar, "cleanedInput");
        o.e(str, "prevCorrectedString");
        String[] s4 = a().s(lVar.c());
        C0263k k4 = k(lVar, C0713h.a0(s4));
        g a4 = k4.a();
        n b4 = k4.b();
        int c4 = k4.c();
        Integer d4 = k4.d();
        String e4 = k4.e();
        int f4 = k4.f();
        List o4 = C0718m.o(a4);
        if (a().e(a4.e().g())) {
            return new E0.o(o4, "No correction: Early exit due to special characters");
        }
        if (a4.e().g().length() == 0) {
            return new E0.o(o4, "No correction: Early exit due to empty string");
        }
        if (!this.f7956l && s.j(a4.e().h())) {
            return new E0.o(o4, "No correction: Word uppercase");
        }
        if (s4.length > 1 && i4 != 2 && b4.a() != TextCase.TITLE && !lVar.b() && ((b4.b() != (textCase = TextCase.UPPER) || b4.a() == textCase) && (b4.a() != textCase || b4.b() == textCase))) {
            o.b(e4);
            o.b(d4);
            E0.o m4 = m(lVar, i4, b4, e4, c4, d4.intValue(), f4, str);
            g gVar = (g) m4.a();
            if (!((Boolean) m4.b()).booleanValue()) {
                o4.add(gVar);
            }
        }
        return new E0.o(o4, (Object) null);
    }

    public final E0.o o(String str, String str2) {
        String str3;
        String str4;
        o.e(str, "beginningSpecialChars");
        o.e(str2, "endingSpecialChars");
        Iterator it = a().m().iterator();
        while (true) {
            str3 = "";
            if (!it.hasNext()) {
                str4 = str3;
                break;
            }
            str4 = (String) it.next();
            if (kotlin.text.o.u(str, str4, false, 2, (Object) null)) {
                break;
            }
        }
        Iterator it2 = a().i().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str5 = (String) it2.next();
            if (kotlin.text.o.G(str2, str5, false, 2, (Object) null)) {
                str3 = str5;
                break;
            }
        }
        return new E0.o(str4, str3);
    }

    public final i.c p(g gVar, int i4, int i5) {
        o.e(gVar, "split");
        return this.f7963s.f(c.a.b(r0.c.f16009f, gVar.e().g(), (String) null, gVar.e().c(), gVar.e().e(), 2, (Object) null), gVar.a(), gVar.f(), i4, i5, gVar.e().g(), gVar.e().f());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: ch.icoaching.typewise.autocorrection.scripts.capitalization.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: ch.icoaching.typewise.autocorrection.scripts.capitalization.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: ch.icoaching.typewise.autocorrection.scripts.capitalization.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(java.lang.String r18, B0.v r19, B0.z r20, ch.icoaching.typewise.language_modelling.inference.b r21, kotlin.coroutines.c r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r0.f7967w = r1
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = r0.f7949e
            ch.icoaching.typewise.config.CompanyConfig r2 = r2.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            java.util.Map r2 = r2.e()
            java.lang.Object r2 = r2.get(r1)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x0020
            java.util.Set r2 = kotlin.collections.L.e()
        L_0x0020:
            r0.f7961q = r2
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = r0.f7949e
            ch.icoaching.typewise.config.CompanyConfig r2 = r2.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            java.util.Map r2 = r2.f()
            java.lang.Object r2 = r2.get(r1)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x003c
            java.util.Set r2 = kotlin.collections.L.e()
        L_0x003c:
            r0.f7962r = r2
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = r0.f7949e
            ch.icoaching.typewise.config.CompanyConfig r2 = r2.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            ch.icoaching.typewise.config.CompanyConfig$b$d r2 = r2.j()
            java.util.Map r2 = r2.t()
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto L_0x0064
            java.lang.Object r2 = r2.get(r1)
            kotlin.jvm.internal.o.b(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = kotlin.collections.C0718m.F0(r2)
            goto L_0x0068
        L_0x0064:
            java.util.Set r2 = kotlin.collections.L.e()
        L_0x0068:
            r0.f7966v = r2
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = r0.f7949e
            ch.icoaching.typewise.config.CompanyConfig r2 = r2.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            java.util.Map r2 = r2.l()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r2.get(r1)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r10 = r2
            goto L_0x008a
        L_0x0085:
            java.util.Set r2 = kotlin.collections.L.e()
            goto L_0x0083
        L_0x008a:
            ch.icoaching.typewise.autocorrection.scripts.f r2 = r0.f7950f
            r2.r(r1)
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = r0.f7949e
            ch.icoaching.typewise.config.CompanyConfig r2 = r2.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            ch.icoaching.typewise.config.CompanyConfig$b$d r2 = r2.j()
            java.lang.String r2 = r2.c()
            java.lang.String r3 = "typewise_lm"
            boolean r4 = kotlin.jvm.internal.o.a(r2, r3)
            java.lang.String r5 = "dictionary_counts"
            if (r4 == 0) goto L_0x00cf
            if (r21 != 0) goto L_0x00cf
            ch.icoaching.typewise.e r11 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "loadTools() :: LM capitalization inference not provided for language '"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "' when loading the tools. Using dictionary_counts capitalization instead."
            r2.append(r4)
            java.lang.String r13 = r2.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "PointCorrection"
            r14 = 0
            ch.icoaching.typewise.e.l(r11, r12, r13, r14, r15, r16)
            r2 = r5
        L_0x00cf:
            boolean r4 = kotlin.jvm.internal.o.a(r2, r5)
            if (r4 == 0) goto L_0x00ec
            ch.icoaching.typewise.autocorrection.scripts.capitalization.b r2 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.b
            ch.icoaching.typewise.autocorrection.scripts.f r4 = r0.f7950f
            boolean r5 = r0.f7952h
            boolean r6 = r0.f7947c
            ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r7 = r0.f7945a
            java.lang.String r8 = r0.f7967w
            java.util.Set r9 = r0.f7961q
            r12 = 128(0x80, float:1.794E-43)
            r13 = 0
            r11 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x010e
        L_0x00ec:
            boolean r2 = kotlin.jvm.internal.o.a(r2, r3)
            if (r2 == 0) goto L_0x0132
            if (r21 == 0) goto L_0x012a
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization r14 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization
            ch.icoaching.typewise.autocorrection.scripts.f r3 = r0.f7950f
            boolean r4 = r0.f7952h
            boolean r5 = r0.f7947c
            ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r6 = r0.f7945a
            java.lang.String r7 = r0.f7967w
            java.util.Set r8 = r0.f7961q
            r12 = 128(0x80, float:1.794E-43)
            r13 = 0
            r11 = 0
            r2 = r14
            r9 = r10
            r10 = r11
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x010e:
            r0.f7964t = r2
            ch.icoaching.typewise.autocorrection.scripts.i r2 = r0.f7963s
            r2.p(r1)
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel r1 = new ch.icoaching.typewise.autocorrection.scripts.CombinationModel
            ch.icoaching.typewise.file_handling.ConfigHolder r8 = r0.f7949e
            r9 = 4
            r10 = 0
            r6 = 0
            r3 = r1
            r4 = r19
            r5 = r20
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r0.f7965u = r1
            l2.q r1 = l2.q.f14567a
            return r1
        L_0x012a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "LM capitalization IInference not provided when loading the tools."
            r1.<init>(r2)
            throw r1
        L_0x0132:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = r0.f7949e
            ch.icoaching.typewise.config.CompanyConfig r2 = r2.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            ch.icoaching.typewise.config.CompanyConfig$b$d r2 = r2.j()
            java.lang.String r2 = r2.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " is not a supported capitalization implementation."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.s(java.lang.String, B0.v, B0.z, ch.icoaching.typewise.language_modelling.inference.b, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0409 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.util.List r28, java.util.List r29, char r30, java.util.List r31, java.util.List r32, java.util.List r33, java.lang.String r34, kotlin.coroutines.c r35) {
        /*
            r27 = this;
            r0 = r27
            r1 = r30
            r2 = r35
            boolean r3 = r2 instanceof ch.icoaching.typewise.autocorrection.scripts.PointCorrection$getReturnVariables$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$getReturnVariables$1 r3 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection$getReturnVariables$1) r3
            int r4 = r3.f7982l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.f7982l = r4
        L_0x0018:
            r11 = r3
            goto L_0x0020
        L_0x001a:
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection$getReturnVariables$1 r3 = new ch.icoaching.typewise.autocorrection.scripts.PointCorrection$getReturnVariables$1
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r11.f7980j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r11.f7982l
            r14 = 1
            if (r4 == 0) goto L_0x0061
            if (r4 != r14) goto L_0x0059
            char r1 = r11.f7979i
            java.lang.Object r3 = r11.f7978h
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r11.f7977g
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r11.f7976f
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r11.f7975e
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r7 = r11.f7974d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r11.f7973c
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r11.f7972b
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r11.f7971a
            ch.icoaching.typewise.autocorrection.scripts.PointCorrection r10 = (ch.icoaching.typewise.autocorrection.scripts.PointCorrection) r10
            kotlin.f.b(r2)
            r12 = r1
            r14 = r9
            r9 = r3
            r3 = r8
            r8 = r5
            goto L_0x0244
        L_0x0059:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0061:
            kotlin.f.b(r2)
            if (r28 == 0) goto L_0x04e8
            if (r32 != 0) goto L_0x006a
            goto L_0x04e8
        L_0x006a:
            java.util.List r2 = kotlin.collections.C0718m.D0(r28)
            java.util.List r10 = kotlin.collections.C0718m.D0(r31)
            java.util.List r9 = kotlin.collections.C0718m.D0(r32)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r4 = r29.size()
            r5 = r2
            r2 = 0
        L_0x0081:
            if (r2 >= r4) goto L_0x00a3
            r6 = r29
            java.lang.Object r7 = r6.get(r2)
            r0.g r7 = (r0.g) r7
            r13 = r31
            B0.b r5 = r0.i(r7, r2, r5, r13)
            r0.g r7 = r5.d()
            r8.add(r7)
            java.util.List r5 = r5.c()
            java.util.List r5 = kotlin.collections.C0718m.D0(r5)
            int r2 = r2 + 1
            goto L_0x0081
        L_0x00a3:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.element = r4
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r12 = r5.size()
            r14 = 0
        L_0x00c8:
            java.lang.String r16 = "capitalizer"
            if (r14 >= r12) goto L_0x01f8
            java.lang.Object r17 = r10.get(r14)
            java.lang.Number r17 = (java.lang.Number) r17
            int r15 = r17.intValue()
            java.lang.Object r15 = E0.m.e(r8, r15)
            r0.g r15 = (r0.g) r15
            r0.d r15 = r15.e()
            r28 = r12
            java.lang.String r12 = r15.d()
            r17 = r3
            java.lang.String r3 = r15.f()
            r29 = r6
            char r6 = (char) r1
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String[] r3 = new java.lang.String[]{r12, r3, r6}
            java.util.List r3 = kotlin.collections.C0718m.o(r3)
            r7.add(r3)
            java.lang.Object r3 = r5.get(r14)
            java.lang.String r6 = r15.g()
            boolean r3 = kotlin.jvm.internal.o.a(r3, r6)
            if (r3 == 0) goto L_0x0127
            java.lang.String r3 = r15.g()
            java.lang.String r6 = r15.h()
            boolean r3 = kotlin.jvm.internal.o.a(r3, r6)
            if (r3 == 0) goto L_0x0127
            T r3 = r2.element
            java.util.List r3 = (java.util.List) r3
            r6 = 0
        L_0x011f:
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.a.d(r6)
            r3.add(r12)
            goto L_0x013f
        L_0x0127:
            java.lang.Object r3 = r10.get(r14)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0139
            T r3 = r2.element
            java.util.List r3 = (java.util.List) r3
            r6 = 1
            goto L_0x011f
        L_0x0139:
            T r3 = r2.element
            java.util.List r3 = (java.util.List) r3
            r6 = 2
            goto L_0x011f
        L_0x013f:
            java.lang.String r3 = r15.f()
            int r3 = r3.length()
            java.lang.String r6 = r15.g()
            int r6 = r6.length()
            int r3 = -r3
            int r3 = r3 - r6
            r6 = 1
            int r3 = r3 - r6
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.a.d(r3)
            r13.add(r3)
            java.lang.Object r3 = r5.get(r14)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r6 = 0
            r12 = 0
        L_0x0162:
            int r1 = r3.length()
            if (r6 >= r1) goto L_0x017a
            char r1 = r3.charAt(r6)
            char r1 = (char) r1
            r31 = r3
            r3 = 32
            if (r1 != r3) goto L_0x0175
            int r12 = r12 + 1
        L_0x0175:
            int r6 = r6 + 1
            r3 = r31
            goto L_0x0162
        L_0x017a:
            r1 = 1
            if (r12 != r1) goto L_0x01e4
            r1 = r33
            java.lang.Object r3 = r1.get(r14)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r6 = r3 + 1
            java.lang.String r12 = r15.h()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r3)
            r31 = r7
            r7 = 0
            java.lang.String r1 = E0.s.n(r12, r7, r1)
            java.lang.Object r7 = r5.get(r14)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.length()
            java.lang.String r12 = r15.h()
            int r12 = r12.length()
            if (r7 != r12) goto L_0x01b9
            java.lang.String r3 = r15.h()
            r7 = 2
            r12 = 0
            java.lang.String r3 = E0.s.o(r3, r6, r12, r7, r12)
            goto L_0x01c3
        L_0x01b9:
            r7 = 2
            r12 = 0
            java.lang.String r6 = r15.h()
            java.lang.String r3 = E0.s.o(r6, r3, r12, r7, r12)
        L_0x01c3:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a r6 = r0.f7964t
            if (r6 != 0) goto L_0x01cb
            kotlin.jvm.internal.o.p(r16)
            r6 = 0
        L_0x01cb:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = r6.c(r1)
            E0.o r6 = new E0.o
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a r7 = r0.f7964t
            if (r7 != 0) goto L_0x01d9
            kotlin.jvm.internal.o.p(r16)
            r7 = 0
        L_0x01d9:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = r7.c(r3)
            r6.<init>(r1, r3)
            r4.add(r6)
            goto L_0x01ea
        L_0x01e4:
            r31 = r7
            r1 = 0
            r4.add(r1)
        L_0x01ea:
            int r14 = r14 + 1
            r12 = r28
            r6 = r29
            r1 = r30
            r7 = r31
            r3 = r17
            goto L_0x00c8
        L_0x01f8:
            r17 = r3
            r29 = r6
            r31 = r7
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a r1 = r0.f7964t
            if (r1 != 0) goto L_0x0206
            kotlin.jvm.internal.o.p(r16)
            r1 = 0
        L_0x0206:
            T r3 = r2.element
            java.util.List r3 = (java.util.List) r3
            r11.f7971a = r0
            r11.f7972b = r10
            r11.f7973c = r9
            r11.f7974d = r8
            r11.f7975e = r2
            r11.f7976f = r13
            r7 = r31
            r11.f7977g = r7
            r6 = r29
            r11.f7978h = r6
            r12 = r30
            r11.f7979i = r12
            r14 = 1
            r11.f7982l = r14
            r14 = r4
            r4 = r1
            r1 = r6
            r6 = r10
            r15 = r7
            r7 = r8
            r16 = r8
            r8 = r3
            r3 = r9
            r9 = r14
            r14 = r10
            r10 = r34
            java.lang.Object r4 = r4.b(r5, r6, r7, r8, r9, r10, r11)
            r5 = r17
            if (r4 != r5) goto L_0x023c
            return r5
        L_0x023c:
            r10 = r0
            r9 = r1
            r6 = r2
            r2 = r4
            r8 = r13
            r4 = r15
            r7 = r16
        L_0x0244:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a$a r2 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.a.C0128a) r2
            java.util.List r1 = r2.b()
            java.util.List r1 = kotlin.collections.C0718m.D0(r1)
            java.util.List r2 = r2.a()
            java.util.List r2 = kotlin.collections.C0718m.D0(r2)
            r6.element = r2
            java.util.List r2 = kotlin.collections.C0718m.J0(r14, r1)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
            r11 = 0
        L_0x0262:
            boolean r13 = r2.hasNext()
            java.lang.String r15 = "'"
            if (r13 == 0) goto L_0x0409
            int r13 = r11 + 1
            java.lang.Object r16 = r2.next()
            kotlin.Pair r16 = (kotlin.Pair) r16
            java.lang.Object r17 = r16.getFirst()
            java.lang.Number r17 = (java.lang.Number) r17
            int r0 = r17.intValue()
            java.lang.Object r16 = r16.getSecond()
            r28 = r1
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r4.get(r11)
            r29 = r2
            r2 = r16
            java.util.List r2 = (java.util.List) r2
            boolean r2 = B(r2, r1)
            if (r2 == 0) goto L_0x02ac
            r0 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r2 = 0
            java.lang.String r1 = E0.s.n(r1, r2, r0)
            r0 = r5
            r16 = r10
            r17 = r12
            r30 = r13
            r2 = 1
            r5 = 0
            r12 = 2
            goto L_0x03a8
        L_0x02ac:
            java.lang.Object r2 = r4.get(r11)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r16 = r7.get(r0)
            r0.g r16 = (r0.g) r16
            r30 = r13
            r0.d r13 = r16.e()
            boolean r2 = C(r2, r1, r13)
            if (r2 == 0) goto L_0x039d
            java.lang.Object r2 = r4.get(r11)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r13 = r4.get(r11)
            java.util.List r13 = (java.util.List) r13
            r16 = r10
            r10 = 1
            java.lang.Object r13 = r13.get(r10)
            java.lang.String r13 = (java.lang.String) r13
            r31 = r5
            r17 = r12
            r5 = 0
            r12 = 2
            java.lang.String r13 = E0.s.o(r13, r10, r5, r12, r5)
            r2.set(r10, r13)
            if (r11 != 0) goto L_0x0397
            java.lang.Object r0 = r7.get(r0)
            r0.g r0 = (r0.g) r0
            r0.d r0 = r0.e()
            java.lang.String r0 = r0.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r15)
            java.lang.String r13 = r2.toString()
            T r0 = r6.element
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            T r2 = r6.element
            java.util.List r2 = (java.util.List) r2
            r2.clear()
            T r2 = r6.element
            java.util.List r2 = (java.util.List) r2
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r2.add(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1}
            java.util.List r0 = kotlin.collections.C0718m.o(r0)
            r2 = 1
            java.lang.Float[] r5 = new java.lang.Float[r2]
            r2 = 0
            java.lang.Object r3 = r3.get(r2)
            r5[r2] = r3
            java.util.List r3 = kotlin.collections.C0718m.o(r5)
            java.lang.Object r5 = r8.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r8.clear()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            r8.add(r5)
            java.lang.Object r5 = r4.get(r2)
            java.util.List r5 = (java.util.List) r5
            r4.clear()
            r4.add(r5)
            java.lang.Object r5 = r4.get(r2)
            java.util.List r5 = (java.util.List) r5
            r10 = 1
            r5.add(r10, r1)
            java.lang.Object r1 = r4.get(r2)
            r18 = r1
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            r25 = 62
            r26 = 0
            java.lang.String r19 = ""
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            java.lang.String r1 = kotlin.collections.C0718m.Z(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9.add(r1)
            r2 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            r2 = 0
            java.lang.Object r4 = r14.get(r2)
            r1[r2] = r4
            java.util.List r14 = kotlin.collections.C0718m.o(r1)
            r5 = r0
            r0 = r3
            goto L_0x0416
        L_0x0397:
            r2 = 1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r11)
            goto L_0x03a8
        L_0x039d:
            r31 = r5
            r16 = r10
            r17 = r12
            r2 = 1
            r5 = 0
            r12 = 2
            r0 = r31
        L_0x03a8:
            java.lang.Object r10 = r4.get(r11)
            java.util.List r10 = (java.util.List) r10
            r10.add(r2, r1)
            int r1 = r9.size()
            if (r11 != r1) goto L_0x03db
            java.lang.Object r1 = r4.get(r11)
            r18 = r1
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            r25 = 62
            r26 = 0
            java.lang.String r19 = ""
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            java.lang.String r1 = kotlin.collections.C0718m.Z(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = r9.add(r1)
            kotlin.coroutines.jvm.internal.a.a(r1)
            goto L_0x03fa
        L_0x03db:
            java.lang.Object r1 = r4.get(r11)
            r18 = r1
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            r25 = 62
            r26 = 0
            java.lang.String r19 = ""
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            java.lang.String r1 = kotlin.collections.C0718m.Z(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9.set(r11, r1)
        L_0x03fa:
            r1 = r28
            r2 = r29
            r11 = r30
            r5 = r0
            r10 = r16
            r12 = r17
            r0 = r27
            goto L_0x0262
        L_0x0409:
            r28 = r1
            r31 = r5
            r16 = r10
            r17 = r12
            r5 = 0
            r0 = r3
            r13 = r5
            r5 = r28
        L_0x0416:
            if (r31 == 0) goto L_0x0446
            int r1 = r31.intValue()
            r9.remove(r1)
            T r1 = r6.element
            java.util.List r1 = (java.util.List) r1
            int r2 = r31.intValue()
            r1.remove(r2)
            int r1 = r31.intValue()
            r5.remove(r1)
            int r1 = r31.intValue()
            r0.remove(r1)
            int r1 = r31.intValue()
            r8.remove(r1)
            int r1 = r31.intValue()
            r14.remove(r1)
        L_0x0446:
            r1 = 0
            java.lang.Object r2 = r14.get(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r2 = r7.get(r2)
            r0.g r2 = (r0.g) r2
            T r3 = r6.element
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto L_0x0477
            java.lang.Object r3 = r5.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r12 = r17
            char r1 = (char) r12
            r10 = r16
            java.lang.String r1 = r10.w(r2, r3, r1)
            goto L_0x0488
        L_0x0477:
            r10 = r16
            r12 = r17
            r0.d r1 = r2.e()
            java.lang.String r1 = r1.h()
            char r3 = (char) r12
            java.lang.String r1 = r10.w(r2, r1, r3)
        L_0x0488:
            if (r13 != 0) goto L_0x04d9
            r0.d r3 = r2.e()
            java.lang.String r3 = r3.h()
            r0.d r4 = r2.e()
            java.lang.String r4 = r4.f()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x04d7
            r0.d r2 = r2.e()
            java.lang.String r2 = r2.f()
            r4 = 0
            char r2 = r2.charAt(r4)
            r4 = 39
            if (r2 != r4) goto L_0x04d7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x04d7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r10 = r2
            goto L_0x04da
        L_0x04d7:
            r10 = r3
            goto L_0x04da
        L_0x04d9:
            r10 = r13
        L_0x04da:
            r0.b r2 = new r0.b
            T r3 = r6.element
            r4 = r3
            java.util.List r4 = (java.util.List) r4
            r3 = r2
            r6 = r1
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r2
        L_0x04e8:
            r0.b$a r0 = r0.C0870b.f16001h
            r0.b r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.u(java.util.List, java.util.List, char, java.util.List, java.util.List, java.util.List, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final String w(g gVar, String str, char c4) {
        StringBuilder sb;
        o.e(gVar, "split");
        o.e(str, "bestSuggestion");
        d e4 = gVar.e();
        String d4 = e4.d();
        String f4 = e4.f();
        if (e4.h().length() > 1 && str.length() > 1 && f4.length() > 0 && f4.charAt(0) == '\'' && s.l(e4.h(), -2) != '\'' && s.l(str, -2) == '\'') {
            f4 = s.o(f4, 1, (Integer) null, 2, (Object) null);
        }
        if (f4.length() <= 0 || !kotlin.text.o.u(str, f4, false, 2, (Object) null)) {
            sb = new StringBuilder();
            sb.append(d4);
            sb.append(str);
            sb.append(f4);
        } else {
            sb = new StringBuilder();
            sb.append(d4);
            sb.append(str);
        }
        sb.append(c4);
        return sb.toString();
    }

    public final List x(String str, List list) {
        o.e(str, "stringInput");
        o.e(list, "touchPoints");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) list.get(i4);
            if (pVar == null && (pVar = (p) this.f7946b.get(String.valueOf(str.charAt(i4)))) == null) {
                pVar = new p(-1000.0f, -1000.0f);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }

    public final d z(String str) {
        o.e(str, "word");
        return f.A(a(), str, false, 2, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PointCorrection(ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r12, java.util.Map r13, float r14, java.lang.String r15, boolean r16, boolean r17, ch.icoaching.typewise.file_handling.ConfigHolder r18, ch.icoaching.typewise.autocorrection.scripts.f r19, int r20, kotlin.jvm.internal.i r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r8 = r1
            goto L_0x000b
        L_0x0009:
            r8 = r17
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0033
            ch.icoaching.typewise.autocorrection.scripts.f r0 = new ch.icoaching.typewise.autocorrection.scripts.f
            ch.icoaching.typewise.config.CompanyConfig r1 = r18.c()
            ch.icoaching.typewise.config.CompanyConfig$b r1 = r1.e()
            ch.icoaching.typewise.config.CompanyConfig$b$d r1 = r1.j()
            boolean r1 = r1.h()
            ch.icoaching.typewise.config.CompanyConfig r2 = r18.c()
            ch.icoaching.typewise.config.CompanyConfig$b r2 = r2.e()
            boolean r2 = r2.m()
            r6 = r15
            r0.<init>(r15, r1, r2)
            r10 = r0
            goto L_0x0036
        L_0x0033:
            r6 = r15
            r10 = r19
        L_0x0036:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.PointCorrection.<init>(ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository, java.util.Map, float, java.lang.String, boolean, boolean, ch.icoaching.typewise.file_handling.ConfigHolder, ch.icoaching.typewise.autocorrection.scripts.f, int, kotlin.jvm.internal.i):void");
    }
}
