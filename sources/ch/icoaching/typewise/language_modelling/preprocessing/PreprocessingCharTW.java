package ch.icoaching.typewise.language_modelling.preprocessing;

import D0.O;
import D0.Q;
import ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.uuid.Uuid;
import l2.g;
import u2.l;
import z2.d;

public final class PreprocessingCharTW extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final Companion f8767z = new Companion((i) null);

    /* renamed from: r  reason: collision with root package name */
    private final String f8768r;

    /* renamed from: s  reason: collision with root package name */
    private final String f8769s;

    /* renamed from: t  reason: collision with root package name */
    private final String f8770t;

    /* renamed from: u  reason: collision with root package name */
    private final String f8771u;

    /* renamed from: v  reason: collision with root package name */
    private final String f8772v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f8773w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f8774x;

    /* renamed from: y  reason: collision with root package name */
    private final CharLevelVocab f8775y;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Object a(Companion companion, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, boolean z4, Q q4, c cVar, int i4, Object obj) {
            boolean z5;
            boolean z6;
            int i5 = i4;
            if ((i5 & Uuid.SIZE_BITS) != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if ((i5 & 256) != 0) {
                z6 = true;
            } else {
                z6 = z4;
            }
            return companion.b(str, str2, str3, str4, str5, str6, str7, z5, z6, q4, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, D0.Q r28, kotlin.coroutines.c r29) {
            /*
                r18 = this;
                r0 = r18
                r1 = r29
                boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW$Companion$invoke$1
                if (r2 == 0) goto L_0x0017
                r2 = r1
                ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW$Companion$invoke$1 r2 = (ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW$Companion$invoke$1) r2
                int r3 = r2.f8787l
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.f8787l = r3
                goto L_0x001c
            L_0x0017:
                ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW$Companion$invoke$1 r2 = new ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW$Companion$invoke$1
                r2.<init>(r0, r1)
            L_0x001c:
                java.lang.Object r1 = r2.f8785j
                java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
                int r4 = r2.f8787l
                r5 = 1
                if (r4 == 0) goto L_0x005d
                if (r4 != r5) goto L_0x0055
                boolean r3 = r2.f8784i
                boolean r4 = r2.f8783h
                java.lang.Object r5 = r2.f8782g
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r2.f8781f
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r2.f8780e
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r2.f8779d
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r2.f8778c
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r2.f8777b
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r2 = r2.f8776a
                ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW$Companion r2 = (ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW.Companion) r2
                kotlin.f.b(r1)
                r15 = r3
                r14 = r4
                r13 = r5
                r12 = r6
                r11 = r7
                r6 = r9
                r5 = r10
                r10 = r8
                goto L_0x009e
            L_0x0055:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x005d:
                kotlin.f.b(r1)
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository r1 = D0.H.a()
                java.lang.String r4 = r28.a()
                r2.f8776a = r0
                r6 = r19
                r2.f8777b = r6
                r7 = r20
                r2.f8778c = r7
                r8 = r22
                r2.f8779d = r8
                r9 = r23
                r2.f8780e = r9
                r10 = r24
                r2.f8781f = r10
                r11 = r25
                r2.f8782g = r11
                r12 = r26
                r2.f8783h = r12
                r13 = r27
                r2.f8784i = r13
                r2.f8787l = r5
                r5 = r21
                java.lang.Object r1 = r1.b(r5, r4, r2)
                if (r1 != r3) goto L_0x0095
                return r3
            L_0x0095:
                r2 = r0
                r5 = r6
                r6 = r7
                r14 = r12
                r15 = r13
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
            L_0x009e:
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab r1 = (ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab) r1
                java.util.Map r8 = r2.c(r1)
                java.util.Map r9 = r2.d(r8)
                ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW r2 = new ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW
                int r7 = r1.d()
                r17 = 0
                r4 = r2
                r16 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW.Companion.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, D0.Q, kotlin.coroutines.c):java.lang.Object");
        }

        public final Map c(CharLevelVocab charLevelVocab) {
            o.e(charLevelVocab, "charVocab");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int d4 = charLevelVocab.d();
            for (int i4 = 0; i4 < d4; i4++) {
                linkedHashMap.put(Integer.valueOf(i4), String.valueOf(charLevelVocab.b(i4)));
            }
            return linkedHashMap;
        }

        public final Map d(Map map) {
            o.e(map, "id2tok");
            Set<Map.Entry> entrySet = map.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.b(D.e(C0718m.t(entrySet, 10)), 16));
            for (Map.Entry entry : entrySet) {
                Pair a4 = g.a((String) entry.getValue(), Integer.valueOf(((Number) entry.getKey()).intValue()));
                linkedHashMap.put(a4.getFirst(), a4.getSecond());
            }
            return linkedHashMap;
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PreprocessingCharTW(String str, String str2, int i4, Map map, Map map2, String str3, String str4, String str5, String str6, boolean z3, boolean z4, CharLevelVocab charLevelVocab) {
        super(str, str2, i4, map, map2, str3, str4, str5, str6, z3, z4, false, 2048, (i) null);
        this.f8768r = str2;
        this.f8769s = str3;
        this.f8770t = str4;
        this.f8771u = str5;
        this.f8772v = str6;
        this.f8773w = z3;
        this.f8774x = z4;
        this.f8775y = charLevelVocab;
        q();
    }

    private final void q() {
        if (n().size() == C0718m.F0(n()).size()) {
            if (!h().isEmpty()) {
                List<String> h4 = h();
                if (!(h4 instanceof Collection) || !h4.isEmpty()) {
                    for (String containsKey : h4) {
                        if (!m().containsKey(containsKey)) {
                            throw new NoSuchElementException("Some control tokens are not in the vocabulary");
                        }
                    }
                }
            }
            Set<String> keySet = m().keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                for (String length : keySet) {
                    if (length.length() != 1) {
                        throw new RuntimeException("character-level tokens must be length one");
                    }
                }
            }
            if (o.a(r.b(a().getClass()).b(), r.b(O.class).b()) && !n().contains("\n")) {
                throw new IllegalArgumentException("The DropDocsApproachProcessSampleApproach approach leaves the newline in the text, but you have no newline in the vocabulary");
            }
            return;
        }
        throw new RuntimeException("There are duplicate tokens in the vocabulary");
    }

    public String c(String str, int i4) {
        o.e(str, "text");
        return a().b(str, i4, p());
    }

    public String e(List list) {
        o.e(list, "tokens");
        return C0718m.Z(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public List f(String str) {
        o.e(str, "text");
        ArrayList arrayList = new ArrayList(str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            arrayList.add(String.valueOf(str.charAt(i4)));
        }
        return arrayList;
    }

    public boolean l() {
        return this.f8774x;
    }

    /* access modifiers changed from: protected */
    public boolean p() {
        return this.f8773w;
    }

    public /* synthetic */ PreprocessingCharTW(String str, String str2, int i4, Map map, Map map2, String str3, String str4, String str5, String str6, boolean z3, boolean z4, CharLevelVocab charLevelVocab, i iVar) {
        this(str, str2, i4, map, map2, str3, str4, str5, str6, z3, z4, charLevelVocab);
    }
}
