package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import B0.C0258f;
import B0.C0262j;
import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.autocorrection.scripts.f;
import ch.icoaching.typewise.language_modelling.inference.b;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class TypewiseLMCapitalization extends CapitalizationBase {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8034k = new a((i) null);

    /* renamed from: i  reason: collision with root package name */
    private final int f8035i;

    /* renamed from: j  reason: collision with root package name */
    private final b f8036j;

    public static final class a {
        private a() {
        }

        public final C0262j a(String str, String str2, List list, List list2) {
            o.e(str, "word");
            o.e(str2, "wordMixedCase");
            o.e(list, "casingList");
            o.e(list2, "sortedCasingList");
            if (((Number) list.get(0)).intValue() == ((Number) list2.get(2)).intValue()) {
                return new C0262j(str, TextCase.LOWER);
            }
            if (((Number) list.get(1)).intValue() >= ((Number) list.get(2)).intValue()) {
                return new C0262j(C0258f.c(str), TextCase.TITLE);
            }
            return new C0262j(kotlin.text.o.C(str, str, str2, false, 4, (Object) null), TextCase.MIXED);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypewiseLMCapitalization(f fVar, boolean z3, boolean z4, IDictionaryRepository iDictionaryRepository, String str, Set set, Set set2, int i4, b bVar) {
        super(fVar, z3, z4, iDictionaryRepository, str, set, set2);
        o.e(fVar, "triggerHelper");
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(str, "language");
        o.e(set, "dontCorrectAwayFromWords");
        o.e(bVar, "inference");
        this.f8035i = i4;
        this.f8036j = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m(r0.f r9, ch.icoaching.typewise.autocorrection.helpers.TextCase r10, java.lang.String r11, java.lang.String r12, java.util.List r13, kotlin.coroutines.c r14) {
        /*
            r8 = this;
            boolean r10 = r14 instanceof ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$handleCasing$1
            if (r10 == 0) goto L_0x0014
            r10 = r14
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$handleCasing$1 r10 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$handleCasing$1) r10
            int r0 = r10.f8058c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0014
            int r0 = r0 - r1
            r10.f8058c = r0
        L_0x0012:
            r6 = r10
            goto L_0x001a
        L_0x0014:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$handleCasing$1 r10 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$handleCasing$1
            r10.<init>(r8, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r10 = r6.f8056a
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r6.f8058c
            r7 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r7) goto L_0x002b
            kotlin.f.b(r10)
            goto L_0x008c
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            kotlin.f.b(r10)
            java.util.List r3 = kotlin.collections.C0718m.p0(r13)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r3.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0043
            r10.add(r1)
            goto L_0x0043
        L_0x005a:
            int r10 = r10.size()
            r0 = 2
            if (r10 == r0) goto L_0x008f
            java.lang.Object r10 = r3.get(r7)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r8.f8035i
            int r0 = r0 / r1
            if (r10 >= r0) goto L_0x007b
            goto L_0x008f
        L_0x007b:
            java.lang.String r4 = r9.d()
            r6.f8058c = r7
            r0 = r8
            r1 = r11
            r2 = r13
            r5 = r12
            java.lang.Object r10 = r0.s(r1, r2, r3, r4, r5, r6)
            if (r10 != r14) goto L_0x008c
            return r14
        L_0x008c:
            B0.j r10 = (B0.C0262j) r10
            goto L_0x0099
        L_0x008f:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$a r10 = f8034k
            java.lang.String r9 = r9.d()
            B0.j r10 = r10.a(r11, r9, r13, r3)
        L_0x0099:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a$b r9 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.a$b
            java.lang.String r11 = r10.b()
            ch.icoaching.typewise.autocorrection.helpers.TextCase r10 = r10.a()
            r9.<init>(r11, r7, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization.m(r0.f, ch.icoaching.typewise.autocorrection.helpers.TextCase, java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.lang.String r5, java.lang.String r6, kotlin.coroutines.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$getCompletionScore$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$getCompletionScore$1 r0 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$getCompletionScore$1) r0
            int r1 = r0.f8055c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8055c = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$getCompletionScore$1 r0 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$getCompletionScore$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8053a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8055c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r7)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.f.b(r7)
            ch.icoaching.typewise.language_modelling.inference.b r7 = r4.f8036j
            r0.f8055c = r3
            java.lang.Object r7 = r7.c(r5, r6, r0)
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r5 = r7.getFirst()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization.r(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01cc A[SYNTHETIC] */
    public final java.lang.Object s(java.lang.String r27, java.util.List r28, java.util.List r29, java.lang.String r30, java.lang.String r31, kotlin.coroutines.c r32) {
        /*
            r26 = this;
            r0 = r26
            r1 = r32
            boolean r2 = r1 instanceof ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$ambiguousCasing$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$ambiguousCasing$1 r2 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$ambiguousCasing$1) r2
            int r3 = r2.f8052p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8052p = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$ambiguousCasing$1 r2 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization$ambiguousCasing$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8050n
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8052p
            java.lang.String r5 = "mixed"
            java.lang.String r6 = "upper"
            java.lang.String r7 = "lower"
            r8 = 1
            if (r4 == 0) goto L_0x0086
            if (r4 != r8) goto L_0x007e
            int r4 = r2.f8049m
            float r9 = r2.f8048l
            float r10 = r2.f8047k
            java.lang.Object r11 = r2.f8046j
            ch.icoaching.typewise.autocorrection.helpers.TextCase r11 = (ch.icoaching.typewise.autocorrection.helpers.TextCase) r11
            java.lang.Object r12 = r2.f8045i
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f8044h
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r2.f8043g
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r2.f8042f
            ch.icoaching.typewise.autocorrection.helpers.TextCase r15 = (ch.icoaching.typewise.autocorrection.helpers.TextCase) r15
            java.lang.Object r8 = r2.f8041e
            java.lang.String r8 = (java.lang.String) r8
            r27 = r4
            java.lang.Object r4 = r2.f8040d
            java.lang.String r4 = (java.lang.String) r4
            r28 = r4
            java.lang.Object r4 = r2.f8039c
            java.lang.String r4 = (java.lang.String) r4
            r29 = r4
            java.lang.Object r4 = r2.f8038b
            java.lang.String r4 = (java.lang.String) r4
            r30 = r4
            java.lang.Object r4 = r2.f8037a
            ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization r4 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization) r4
            kotlin.f.b(r1)
            r17 = r5
            r24 = r9
            r0 = r11
            r9 = r14
            r16 = r15
            r5 = r27
            r14 = r28
            r15 = r2
            r11 = r10
            r10 = r13
            r2 = r30
            r13 = r4
            r4 = r29
            goto L_0x01aa
        L_0x007e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0086:
            kotlin.f.b(r1)
            r1 = 2
            r4 = r29
            java.lang.Object r1 = r4.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            int r4 = r0.f8035i
            float r4 = (float) r4
            float r1 = r1 / r4
            ch.icoaching.typewise.autocorrection.helpers.TextCase r4 = ch.icoaching.typewise.autocorrection.helpers.TextCase.LOWER
            java.lang.String[] r8 = new java.lang.String[]{r7, r6, r5}
            java.util.List r8 = kotlin.collections.C0718m.m(r8)
            java.util.Iterator r9 = r28.iterator()
            r10 = 0
            r11 = 0
            r14 = r31
            r13 = r0
            r15 = r2
            r16 = r4
            r12 = r10
            r2 = r27
            r4 = r30
            r10 = r9
            r9 = r8
            r8 = r11
            r11 = r1
            r1 = r2
        L_0x00bb:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L_0x01cc
            r27 = r13
            int r13 = r8 + 1
            java.lang.Object r17 = r10.next()
            java.lang.Number r17 = (java.lang.Number) r17
            int r0 = r17.intValue()
            float r0 = (float) r0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00da
            r0 = r26
            r8 = r13
            r13 = r27
            goto L_0x00bb
        L_0x00da:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r0 = ch.icoaching.typewise.autocorrection.helpers.TextCase.LOWER
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r28 = r0
            int r0 = r8.hashCode()
            r17 = r9
            r9 = 103164673(0x6262b01, float:3.1252724E-35)
            if (r0 == r9) goto L_0x0152
            r9 = 103910395(0x6318bfb, float:3.339284E-35)
            if (r0 == r9) goto L_0x0124
            r9 = 111499426(0x6a558a2, float:6.2196336E-35)
            if (r0 == r9) goto L_0x0108
        L_0x00f9:
            r0 = r27
            r22 = r10
            r23 = r11
            r24 = r12
            r21 = r17
            r17 = r5
            r5 = r13
            goto L_0x0165
        L_0x0108:
            boolean r0 = r8.equals(r6)
            if (r0 != 0) goto L_0x010f
            goto L_0x00f9
        L_0x010f:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r0 = ch.icoaching.typewise.autocorrection.helpers.TextCase.TITLE
            java.lang.String r8 = B0.C0258f.c(r2)
            r22 = r10
            r23 = r11
            r24 = r12
            r21 = r17
            r11 = r0
            r17 = r5
            r5 = r13
            r0 = r27
            goto L_0x016b
        L_0x0124:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L_0x012b
            goto L_0x00f9
        L_0x012b:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r0 = ch.icoaching.typewise.autocorrection.helpers.TextCase.MIXED
            r18 = 4
            r19 = 0
            r20 = 0
            r8 = r2
            r21 = r17
            r9 = r2
            r22 = r10
            r10 = r4
            r23 = r11
            r11 = r20
            r24 = r12
            r12 = r18
            r28 = r0
            r17 = r5
            r5 = r13
            r0 = r27
            r13 = r19
            java.lang.String r8 = kotlin.text.o.C(r8, r9, r10, r11, r12, r13)
        L_0x014f:
            r11 = r28
            goto L_0x016b
        L_0x0152:
            r0 = r27
            r22 = r10
            r23 = r11
            r24 = r12
            r21 = r17
            r17 = r5
            r5 = r13
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0168
        L_0x0165:
            java.lang.String r8 = ""
            goto L_0x014f
        L_0x0168:
            r11 = r28
            r8 = r2
        L_0x016b:
            r15.f8037a = r0
            r15.f8038b = r2
            r15.f8039c = r4
            r15.f8040d = r14
            r15.f8041e = r1
            r9 = r16
            r15.f8042f = r9
            r10 = r21
            r15.f8043g = r10
            r12 = r22
            r15.f8044h = r12
            r15.f8045i = r8
            r15.f8046j = r11
            r13 = r23
            r15.f8047k = r13
            r27 = r2
            r2 = r24
            r15.f8048l = r2
            r15.f8049m = r5
            r2 = 1
            r15.f8052p = r2
            java.lang.Object r2 = r0.r(r14, r8, r15)
            if (r2 != r3) goto L_0x019b
            return r3
        L_0x019b:
            r16 = r9
            r9 = r10
            r10 = r12
            r12 = r8
            r8 = r1
            r1 = r2
            r2 = r27
            r25 = r13
            r13 = r0
            r0 = r11
            r11 = r25
        L_0x01aa:
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r18 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r18 <= 0) goto L_0x01c2
            r16 = r0
            r8 = r5
            r5 = r17
            r0 = r26
            r25 = r12
            r12 = r1
            r1 = r25
            goto L_0x00bb
        L_0x01c2:
            r0 = r26
            r1 = r8
            r12 = r24
            r8 = r5
            r5 = r17
            goto L_0x00bb
        L_0x01cc:
            r9 = r16
            B0.j r0 = new B0.j
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization.s(java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TypewiseLMCapitalization(ch.icoaching.typewise.autocorrection.scripts.f r13, boolean r14, boolean r15, ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r16, java.lang.String r17, java.util.Set r18, java.util.Set r19, int r20, ch.icoaching.typewise.language_modelling.inference.b r21, int r22, kotlin.jvm.internal.i r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r9 = r1
            goto L_0x000b
        L_0x0009:
            r9 = r19
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0013
            r0 = 1000(0x3e8, float:1.401E-42)
            r10 = r0
            goto L_0x0015
        L_0x0013:
            r10 = r20
        L_0x0015:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.TypewiseLMCapitalization.<init>(ch.icoaching.typewise.autocorrection.scripts.f, boolean, boolean, ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository, java.lang.String, java.util.Set, java.util.Set, int, ch.icoaching.typewise.language_modelling.inference.b, int, kotlin.jvm.internal.i):void");
    }
}
