package ch.icoaching.typewise.language_detection;

import B2.e;
import B2.h;
import C0.b;
import E0.s;
import ch.icoaching.typewise.word_lists.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.l;
import n2.C0830a;
import y0.C0946c;

public class LanguageDetection {

    /* renamed from: a  reason: collision with root package name */
    private final c f8274a;

    /* renamed from: b  reason: collision with root package name */
    private final Regex f8275b = new Regex("[A-Za-zÀ-ÖØ-öø-ÿ]");

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0830a.a((Float) ((Map.Entry) obj2).getValue(), (Float) ((Map.Entry) obj).getValue());
        }
    }

    public LanguageDetection(c cVar) {
        o.e(cVar, "wordlistRepository");
        this.f8274a = cVar;
    }

    public static /* synthetic */ Object a(LanguageDetection languageDetection, String str, List list, boolean z3, float f4, float f5, boolean z4, int i4, kotlin.coroutines.c cVar, int i5, Object obj) {
        boolean z5;
        float f6;
        float f7;
        boolean z6;
        int i6;
        if (obj == null) {
            if ((i5 & 4) != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if ((i5 & 8) != 0) {
                f6 = 0.5f;
            } else {
                f6 = f4;
            }
            if ((i5 & 16) != 0) {
                f7 = 0.0f;
            } else {
                f7 = f5;
            }
            if ((i5 & 32) != 0) {
                z6 = true;
            } else {
                z6 = z4;
            }
            if ((i5 & 64) != 0) {
                i6 = 3;
            } else {
                i6 = i4;
            }
            return languageDetection.h(str, list, z5, f6, f7, z6, i6, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMostProbableLanguageWithUnknown");
    }

    public static /* synthetic */ Object b(LanguageDetection languageDetection, String str, List list, boolean z3, boolean z4, boolean z5, kotlin.coroutines.c cVar, int i4, Object obj) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (obj == null) {
            if ((i4 & 4) != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            if ((i4 & 8) != 0) {
                z7 = true;
            } else {
                z7 = z4;
            }
            if ((i4 & 16) != 0) {
                z8 = false;
            } else {
                z8 = z5;
            }
            return languageDetection.j(str, list, z6, z7, z8, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMostProbableLanguage");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object d(ch.icoaching.typewise.language_detection.LanguageDetection r10, java.util.List r11, java.lang.String r12, java.util.List r13, kotlin.coroutines.c r14) {
        /*
            boolean r0 = r14 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getThresholdOfWordsInVocab$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            ch.icoaching.typewise.language_detection.LanguageDetection$getThresholdOfWordsInVocab$1 r0 = (ch.icoaching.typewise.language_detection.LanguageDetection$getThresholdOfWordsInVocab$1) r0
            int r1 = r0.f8335e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8335e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_detection.LanguageDetection$getThresholdOfWordsInVocab$1 r0 = new ch.icoaching.typewise.language_detection.LanguageDetection$getThresholdOfWordsInVocab$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f8333c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8335e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r10 = r0.f8332b
            r13 = r10
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r10 = r0.f8331a
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            kotlin.f.b(r14)
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            kotlin.f.b(r14)
            boolean r14 = r11.isEmpty()
            if (r14 == 0) goto L_0x004a
            r10 = 0
        L_0x0045:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.c(r10)
            return r10
        L_0x004a:
            ch.icoaching.typewise.word_lists.c r10 = r10.f8274a
            ch.icoaching.typewise.word_lists.WordListKind r14 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED
            r0.f8331a = r11
            r0.f8332b = r13
            r0.f8335e = r3
            java.lang.Object r14 = r10.d(r12, r14, r0)
            if (r14 != r1) goto L_0x005b
            return r1
        L_0x005b:
            ch.icoaching.typewise.word_lists.WordList r14 = (ch.icoaching.typewise.word_lists.WordList) r14
            r10 = 0
            if (r13 != 0) goto L_0x0076
            int r12 = r11.size()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r12)
            r0 = r10
        L_0x006a:
            if (r0 >= r12) goto L_0x0076
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r10)
            r13.add(r1)
            int r0 = r0 + 1
            goto L_0x006a
        L_0x0076:
            java.util.List r12 = kotlin.collections.C0718m.J0(r11, r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x007e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00aa
            java.lang.Object r13 = r12.next()
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r0 = r13.component1()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r13.component2()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r6 = r13 ^ 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r14
            boolean r13 = ch.icoaching.typewise.word_lists.WordList.e(r4, r5, r6, r7, r8, r9)
            if (r13 == 0) goto L_0x007e
            int r10 = r10 + 1
            goto L_0x007e
        L_0x00aa:
            float r10 = (float) r10
            int r11 = r11.size()
            float r11 = (float) r11
            float r10 = r10 / r11
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.d(ch.icoaching.typewise.language_detection.LanguageDetection, java.util.List, java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object f(LanguageDetection languageDetection, List list, List list2, List list3, boolean z3, boolean z4, boolean z5, kotlin.coroutines.c cVar, int i4, Object obj) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (obj == null) {
            if ((i4 & 8) != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if ((i4 & 16) != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if ((i4 & 32) != 0) {
                z8 = false;
            } else {
                z8 = z5;
            }
            return languageDetection.m(list, list2, list3, z6, z7, z8, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguageCounterByCountOrElseFrequency");
    }

    public static /* synthetic */ Object g(LanguageDetection languageDetection, List list, List list2, boolean z3, boolean z4, List list3, kotlin.coroutines.c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                z4 = true;
            }
            boolean z5 = z4;
            if ((i4 & 16) != 0) {
                list3 = null;
            }
            return languageDetection.o(list, list2, z3, z5, list3, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLanguageCounterFromTokenizedText");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.util.List r5, java.lang.String r6, float r7, java.util.List r8, kotlin.coroutines.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$isCorrectLangFromTokenized$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ch.icoaching.typewise.language_detection.LanguageDetection$isCorrectLangFromTokenized$1 r0 = (ch.icoaching.typewise.language_detection.LanguageDetection$isCorrectLangFromTokenized$1) r0
            int r1 = r0.f8339d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8339d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_detection.LanguageDetection$isCorrectLangFromTokenized$1 r0 = new ch.icoaching.typewise.language_detection.LanguageDetection$isCorrectLangFromTokenized$1
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8337b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8339d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r7 = r0.f8336a
            kotlin.f.b(r9)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.f.b(r9)
            r0.f8336a = r7
            r0.f8339d = r3
            java.lang.Object r9 = r4.l(r5, r6, r8, r0)
            if (r9 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.Number r9 = (java.lang.Number) r9
            float r5 = r9.floatValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.k(java.util.List, java.lang.String, float, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.util.List r20, java.util.List r21, java.util.List r22, boolean r23, boolean r24, boolean r25, kotlin.coroutines.c r26) {
        /*
            r19 = this;
            r7 = r19
            r0 = r26
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterByCountOrElseFrequency$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterByCountOrElseFrequency$1 r1 = (ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterByCountOrElseFrequency$1) r1
            int r2 = r1.f8294j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f8294j = r2
        L_0x0016:
            r14 = r1
            goto L_0x001e
        L_0x0018:
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterByCountOrElseFrequency$1 r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterByCountOrElseFrequency$1
            r1.<init>(r7, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r14.f8292h
            java.lang.Object r15 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r14.f8294j
            r8 = 2
            r13 = 1
            if (r1 == 0) goto L_0x0068
            if (r1 == r13) goto L_0x004b
            if (r1 != r8) goto L_0x0043
            boolean r1 = r14.f8289e
            java.lang.Object r2 = r14.f8287c
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r3 = r14.f8286b
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r14.f8285a
            ch.icoaching.typewise.language_detection.LanguageDetection r4 = (ch.icoaching.typewise.language_detection.LanguageDetection) r4
            kotlin.f.b(r0)
            r6 = r2
            r2 = r13
            goto L_0x0131
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            boolean r1 = r14.f8291g
            boolean r2 = r14.f8290f
            boolean r3 = r14.f8289e
            java.lang.Object r4 = r14.f8288d
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r14.f8287c
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r14.f8286b
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r9 = r14.f8285a
            ch.icoaching.typewise.language_detection.LanguageDetection r9 = (ch.icoaching.typewise.language_detection.LanguageDetection) r9
            kotlin.f.b(r0)
            r11 = r4
            r4 = r9
            r9 = r6
            goto L_0x00a0
        L_0x0068:
            kotlin.f.b(r0)
            r14.f8285a = r7
            r9 = r20
            r14.f8286b = r9
            r10 = r21
            r14.f8287c = r10
            r11 = r22
            r14.f8288d = r11
            r12 = r23
            r14.f8289e = r12
            r6 = r24
            r14.f8290f = r6
            r5 = r25
            r14.f8291g = r5
            r14.f8294j = r13
            r3 = 0
            r4 = 0
            r0 = r19
            r1 = r20
            r2 = r22
            r5 = r21
            r6 = r14
            java.lang.Object r0 = r0.o(r1, r2, r3, r4, r5, r6)
            if (r0 != r15) goto L_0x0099
            return r15
        L_0x0099:
            r2 = r24
            r1 = r25
            r4 = r7
            r5 = r10
            r3 = r12
        L_0x00a0:
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r6 = r0.values()
            java.lang.Float r6 = kotlin.collections.C0718m.e0(r6)
            if (r6 == 0) goto L_0x00b1
            float r6 = r6.floatValue()
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00bf:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00e7
            java.lang.Object r16 = r12.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getValue()
            java.lang.Number r17 = (java.lang.Number) r17
            float r17 = r17.floatValue()
            int r17 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r17 != 0) goto L_0x00bf
            java.lang.Object r13 = r16.getKey()
            java.lang.Object r8 = r16.getValue()
            r10.put(r13, r8)
            r8 = 2
            r13 = 1
            goto L_0x00bf
        L_0x00e7:
            java.util.Set r6 = r10.keySet()
            if (r1 == 0) goto L_0x0104
            boolean r1 = r4.t(r6)
            if (r1 == 0) goto L_0x0104
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r0)
            java.lang.String r1 = "unknown"
            kotlin.Pair r0 = l2.g.a(r1, r0)
            java.util.Map r0 = kotlin.collections.D.f(r0)
            return r0
        L_0x0104:
            if (r2 == 0) goto L_0x0107
            r11 = r6
        L_0x0107:
            java.util.List r10 = kotlin.collections.C0718m.B0(r11)
            r14.f8285a = r4
            r14.f8286b = r0
            r14.f8287c = r6
            r1 = 0
            r14.f8288d = r1
            r14.f8289e = r3
            r1 = 2
            r14.f8294j = r1
            r1 = 8
            r16 = 0
            r11 = 0
            r12 = 0
            r8 = r4
            r2 = 1
            r13 = r5
            r5 = r15
            r15 = r1
            java.lang.Object r1 = g(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 != r5) goto L_0x012b
            return r5
        L_0x012b:
            r18 = r3
            r3 = r0
            r0 = r1
            r1 = r18
        L_0x0131:
            java.util.Map r0 = (java.util.Map) r0
            int r5 = r6.size()
            if (r5 <= r2) goto L_0x013a
            r3 = r0
        L_0x013a:
            if (r1 == 0) goto L_0x0140
            java.util.Map r3 = r4.q(r3)
        L_0x0140:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.m(java.util.List, java.util.List, java.util.List, boolean, boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    private final String p(String str, boolean z3, boolean z4) {
        if (!z3) {
            str = (String) C0946c.c(str, false, 2, (Object) null).getFirst();
        }
        if (!z4) {
            return str;
        }
        return C0946c.e().replace((CharSequence) C0946c.j().replace((CharSequence) str, ""), "");
    }

    public static /* synthetic */ boolean r(LanguageDetection languageDetection, String str, int i4, float f4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            if ((i5 & 4) != 0) {
                f4 = 0.51f;
            }
            return languageDetection.s(str, i4, f4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isStringMostlyLatinScript");
    }

    private final boolean t(Set set) {
        if (set.size() <= 1) {
            return false;
        }
        List<Set> a4 = b.a();
        if ((a4 instanceof Collection) && a4.isEmpty()) {
            return false;
        }
        loop0:
        for (Set set2 : a4) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    } else if (!set2.contains((String) it.next())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013a, code lost:
        if (((java.lang.Number) r0).floatValue() < r2) goto L_0x013c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r20, java.util.List r21, boolean r22, float r23, float r24, boolean r25, int r26, kotlin.coroutines.c r27) {
        /*
            r19 = this;
            r10 = r19
            r0 = r27
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguageWithUnknown$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguageWithUnknown$1 r1 = (ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguageWithUnknown$1) r1
            int r2 = r1.f8330i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f8330i = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguageWithUnknown$1 r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguageWithUnknown$1
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.f8328g
            java.lang.Object r12 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f8330i
            r13 = 2
            r6 = 1
            java.lang.String r14 = "unknown"
            if (r1 == 0) goto L_0x0064
            if (r1 == r6) goto L_0x004d
            if (r1 != r13) goto L_0x0045
            int r1 = r11.f8327f
            float r2 = r11.f8325d
            java.lang.Object r3 = r11.f8324c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r11.f8323b
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r11.f8322a
            java.util.List r5 = (java.util.List) r5
            kotlin.f.b(r0)
            goto L_0x011e
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            int r1 = r11.f8327f
            float r2 = r11.f8326e
            float r3 = r11.f8325d
            java.lang.Object r4 = r11.f8324c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r11.f8323b
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r11.f8322a
            ch.icoaching.typewise.language_detection.LanguageDetection r6 = (ch.icoaching.typewise.language_detection.LanguageDetection) r6
            kotlin.f.b(r0)
            goto L_0x00d5
        L_0x0064:
            kotlin.f.b(r0)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r19
            r1 = r20
            boolean r0 = r(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0076
            return r14
        L_0x0076:
            r0 = r20
            r1 = r22
            r2 = r25
            kotlin.Pair r0 = r10.v(r0, r1, r2)
            java.lang.Object r1 = r0.component1()
            r15 = r1
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r0 = r0.component2()
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            java.util.Map r0 = kotlin.collections.D.h()
            int r1 = r21.size()
            if (r1 <= r6) goto L_0x00ec
            r11.f8322a = r10
            r11.f8323b = r15
            r11.f8324c = r9
            r8 = r23
            r11.f8325d = r8
            r7 = r24
            r11.f8326e = r7
            r5 = r26
            r11.f8327f = r5
            r11.f8330i = r6
            r16 = 32
            r17 = 0
            r4 = 1
            r6 = 1
            r18 = 0
            r0 = r19
            r1 = r15
            r2 = r9
            r3 = r21
            r5 = r6
            r6 = r18
            r7 = r11
            r8 = r16
            r16 = r9
            r9 = r17
            java.lang.Object r0 = f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r12) goto L_0x00cb
            return r12
        L_0x00cb:
            r3 = r23
            r2 = r24
            r1 = r26
            r6 = r10
            r5 = r15
            r4 = r16
        L_0x00d5:
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r7 = r0.keySet()
            java.lang.Object r7 = kotlin.collections.C0718m.Q(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = kotlin.jvm.internal.o.a(r7, r14)
            if (r8 == 0) goto L_0x00e8
            return r14
        L_0x00e8:
            r16 = r4
            r4 = r0
            goto L_0x00fe
        L_0x00ec:
            r16 = r9
            java.lang.Object r1 = kotlin.collections.C0718m.R(r21)
            java.lang.String r1 = (java.lang.String) r1
            r3 = r23
            r2 = r24
            r4 = r0
            r7 = r1
            r6 = r10
            r5 = r15
            r1 = r26
        L_0x00fe:
            r11.f8322a = r5
            r11.f8323b = r4
            r11.f8324c = r7
            r11.f8325d = r2
            r11.f8327f = r1
            r11.f8330i = r13
            r20 = r6
            r21 = r5
            r22 = r7
            r23 = r3
            r24 = r16
            r25 = r11
            java.lang.Object r0 = r20.k(r21, r22, r23, r24, r25)
            if (r0 != r12) goto L_0x011d
            return r12
        L_0x011d:
            r3 = r7
        L_0x011e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r4.get(r3)
            if (r0 != 0) goto L_0x0132
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r0)
        L_0x0132:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0142
        L_0x013c:
            int r0 = r5.size()
            if (r0 >= r1) goto L_0x0143
        L_0x0142:
            return r3
        L_0x0143:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.h(java.lang.String, java.util.List, boolean, float, float, boolean, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r18, java.util.List r19, boolean r20, kotlin.coroutines.c r21) {
        /*
            r17 = this;
            r0 = r21
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getIsInDictionaryCounterSingleWord$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.language_detection.LanguageDetection$getIsInDictionaryCounterSingleWord$1 r1 = (ch.icoaching.typewise.language_detection.LanguageDetection$getIsInDictionaryCounterSingleWord$1) r1
            int r2 = r1.f8284i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8284i = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            ch.icoaching.typewise.language_detection.LanguageDetection$getIsInDictionaryCounterSingleWord$1 r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$getIsInDictionaryCounterSingleWord$1
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f8282g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r1.f8284i
            r5 = 1
            if (r4 == 0) goto L_0x0054
            if (r4 != r5) goto L_0x004c
            boolean r4 = r1.f8281f
            java.lang.Object r6 = r1.f8280e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f8279d
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r1.f8278c
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.f8277b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.f8276a
            ch.icoaching.typewise.language_detection.LanguageDetection r10 = (ch.icoaching.typewise.language_detection.LanguageDetection) r10
            kotlin.f.b(r0)
            r12 = r1
            r13 = r6
            r14 = r7
            r15 = r8
            r1 = r9
            r16 = r10
            goto L_0x0096
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            kotlin.f.b(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r19.iterator()
            r8 = r0
            r10 = r2
            r7 = r4
            r0 = r18
            r4 = r1
            r1 = r20
        L_0x0068:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x00b1
            java.lang.Object r6 = r7.next()
            java.lang.String r6 = (java.lang.String) r6
            ch.icoaching.typewise.word_lists.c r9 = r10.f8274a
            ch.icoaching.typewise.word_lists.WordListKind r11 = ch.icoaching.typewise.word_lists.WordListKind.STANDARD
            r4.f8276a = r10
            r4.f8277b = r0
            r4.f8278c = r8
            r4.f8279d = r7
            r4.f8280e = r6
            r4.f8281f = r1
            r4.f8284i = r5
            java.lang.Object r9 = r9.d(r6, r11, r4)
            if (r9 != r3) goto L_0x008d
            return r3
        L_0x008d:
            r12 = r4
            r13 = r6
            r14 = r7
            r15 = r8
            r16 = r10
            r4 = r1
            r1 = r0
            r0 = r9
        L_0x0096:
            r6 = r0
            ch.icoaching.typewise.word_lists.WordList r6 = (ch.icoaching.typewise.word_lists.WordList) r6
            r10 = 4
            r11 = 0
            r9 = 0
            r7 = r1
            r8 = r4
            boolean r0 = ch.icoaching.typewise.word_lists.WordList.e(r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            r15.put(r13, r0)
            r0 = r1
            r1 = r4
            r4 = r12
            r7 = r14
            r8 = r15
            r10 = r16
            goto L_0x0068
        L_0x00b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.i(java.lang.String, java.util.List, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r13, java.util.List r14, boolean r15, boolean r16, boolean r17, kotlin.coroutines.c r18) {
        /*
            r12 = this;
            r10 = r12
            r0 = r18
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguage$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguage$1 r1 = (ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguage$1) r1
            int r2 = r1.f8321c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8321c = r2
        L_0x0015:
            r7 = r1
            goto L_0x001d
        L_0x0017:
            ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguage$1 r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$getMostProbableLanguage$1
            r1.<init>(r12, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r0 = r7.f8319a
            java.lang.Object r11 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f8321c
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            kotlin.f.b(r0)
            goto L_0x0067
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            kotlin.f.b(r0)
            int r0 = r14.size()
            if (r0 <= r2) goto L_0x0074
            r0 = r13
            r1 = r15
            r3 = r16
            kotlin.Pair r0 = r12.v(r13, r15, r3)
            java.lang.Object r1 = r0.component1()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.component2()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r7.f8321c = r2
            r8 = 24
            r9 = 0
            r4 = 0
            r5 = 0
            r0 = r12
            r2 = r3
            r3 = r14
            r6 = r17
            java.lang.Object r0 = f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r11) goto L_0x0067
            return r11
        L_0x0067:
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.keySet()
            java.lang.Object r0 = kotlin.collections.C0718m.Q(r0)
        L_0x0071:
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0081
        L_0x0074:
            int r0 = r14.size()
            if (r0 != r2) goto L_0x0082
            r0 = 0
            r1 = r14
            java.lang.Object r0 = r14.get(r0)
            goto L_0x0071
        L_0x0081:
            return r0
        L_0x0082:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "No languages specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.j(java.lang.String, java.util.List, boolean, boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    public Object l(List list, String str, List list2, kotlin.coroutines.c cVar) {
        return d(this, list, str, list2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b A[LOOP:2: B:43:0x0135->B:45:0x013b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0196 A[LOOP:3: B:48:0x0190->B:50:0x0196, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.util.List r19, java.util.List r20, boolean r21, java.util.List r22, kotlin.coroutines.c r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenized$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenized$1 r1 = (ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenized$1) r1
            int r2 = r1.f8303i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8303i = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenized$1 r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenized$1
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f8301g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r1.f8303i
            r5 = 0
            r6 = 16
            r7 = 10
            r8 = 2
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L_0x006e
            if (r4 == r10) goto L_0x0055
            if (r4 != r8) goto L_0x004d
            int r4 = r1.f8300f
            boolean r11 = r1.f8299e
            java.lang.Object r12 = r1.f8298d
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r1.f8297c
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r1.f8296b
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r1.f8295a
            ch.icoaching.typewise.language_detection.LanguageDetection r15 = (ch.icoaching.typewise.language_detection.LanguageDetection) r15
            kotlin.f.b(r0)
            goto L_0x00eb
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            int r4 = r1.f8300f
            boolean r11 = r1.f8299e
            java.lang.Object r12 = r1.f8298d
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r1.f8297c
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r1.f8296b
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r1.f8295a
            ch.icoaching.typewise.language_detection.LanguageDetection r15 = (ch.icoaching.typewise.language_detection.LanguageDetection) r15
            kotlin.f.b(r0)
            goto L_0x00d6
        L_0x006e:
            kotlin.f.b(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r4 = r20
            int r11 = kotlin.collections.C0718m.t(r4, r7)
            int r11 = kotlin.collections.D.e(r11)
            int r11 = z2.d.b(r11, r6)
            r0.<init>(r11)
            java.util.Iterator r11 = r20.iterator()
        L_0x0088:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x009d
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Float r13 = kotlin.coroutines.jvm.internal.a.c(r5)
            r0.put(r12, r13)
            goto L_0x0088
        L_0x009d:
            java.util.Map r0 = kotlin.collections.D.s(r0)
            java.util.Iterator r11 = r19.iterator()
            r13 = r0
            r15 = r2
            r12 = r11
            r0 = r21
            r11 = r9
        L_0x00ab:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x016e
            int r11 = r11 + r10
            java.lang.Object r14 = r12.next()
            java.lang.String r14 = (java.lang.String) r14
            r1.f8295a = r15
            r1.f8296b = r4
            r1.f8297c = r13
            r1.f8298d = r12
            r1.f8299e = r0
            r1.f8300f = r11
            if (r0 == 0) goto L_0x00db
            r1.f8303i = r10
            java.lang.Object r14 = r15.u(r14, r4, r9, r1)
            if (r14 != r3) goto L_0x00cf
            return r3
        L_0x00cf:
            r17 = r11
            r11 = r0
            r0 = r14
            r14 = r4
            r4 = r17
        L_0x00d6:
            java.util.Map r0 = (java.util.Map) r0
        L_0x00d8:
            r5 = r4
            r4 = r14
            goto L_0x012d
        L_0x00db:
            r1.f8303i = r8
            java.lang.Object r14 = r15.i(r14, r4, r9, r1)
            if (r14 != r3) goto L_0x00e4
            return r3
        L_0x00e4:
            r17 = r11
            r11 = r0
            r0 = r14
            r14 = r4
            r4 = r17
        L_0x00eb:
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r16 = r0.size()
            int r8 = kotlin.collections.D.e(r16)
            r5.<init>(r8)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0102:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0121
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0122
        L_0x0121:
            r8 = 0
        L_0x0122:
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.a.c(r8)
            r5.put(r9, r8)
            r9 = 0
            goto L_0x0102
        L_0x012b:
            r0 = r5
            goto L_0x00d8
        L_0x012d:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0135:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0167
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            java.lang.Object r14 = r13.get(r9)
            kotlin.jvm.internal.o.b(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            float r14 = r14 + r8
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.a.c(r14)
            r13.put(r9, r8)
            goto L_0x0135
        L_0x0167:
            r0 = r11
            r8 = 2
            r9 = 0
            r11 = r5
            r5 = 0
            goto L_0x00ab
        L_0x016e:
            java.util.Set r0 = r13.entrySet()
            ch.icoaching.typewise.language_detection.LanguageDetection$a r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$a
            r1.<init>()
            java.util.List r0 = kotlin.collections.C0718m.r0(r0, r1)
            int r1 = kotlin.collections.C0718m.t(r0, r7)
            int r1 = kotlin.collections.D.e(r1)
            int r1 = z2.d.b(r1, r6)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0190:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            kotlin.Pair r1 = l2.g.a(r4, r1)
            java.lang.Object r4 = r1.getFirst()
            java.lang.Object r1 = r1.getSecond()
            r3.put(r4, r1)
            goto L_0x0190
        L_0x01b4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.n(java.util.List, java.util.List, boolean, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.util.List r8, java.util.List r9, boolean r10, boolean r11, java.util.List r12, kotlin.coroutines.c r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenizedText$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenizedText$1 r0 = (ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenizedText$1) r0
            int r1 = r0.f8308e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f8308e = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenizedText$1 r0 = new ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterFromTokenizedText$1
            r0.<init>(r7, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r6.f8306c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f8308e
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            boolean r10 = r6.f8305b
            java.lang.Object r8 = r6.f8304a
            ch.icoaching.typewise.language_detection.LanguageDetection r8 = (ch.icoaching.typewise.language_detection.LanguageDetection) r8
            kotlin.f.b(r13)
            goto L_0x004f
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.f.b(r13)
            r6.f8304a = r7
            r6.f8305b = r10
            r6.f8308e = r2
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.n(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r8 = r7
        L_0x004f:
            java.util.Map r13 = (java.util.Map) r13
            if (r10 == 0) goto L_0x0057
            java.util.Map r13 = r8.q(r13)
        L_0x0057:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.o(java.util.List, java.util.List, boolean, boolean, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public final Map q(Map map) {
        o.e(map, "languageCounter");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry value : map.entrySet()) {
            arrayList.add(Float.valueOf(((Number) value.getValue()).floatValue()));
        }
        float s02 = C0718m.s0(arrayList);
        if (s02 == 0.0f) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Float.valueOf(((Number) entry.getValue()).floatValue() / s02));
        }
        return linkedHashMap;
    }

    public final boolean s(String str, int i4, float f4) {
        o.e(str, "inputString");
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (Character.isLetter(str.charAt(i6))) {
                i5++;
            }
        }
        if (i5 <= i4) {
            return true;
        }
        if (((float) h.g(Regex.findAll$default(this.f8275b, str, 0, 2, (Object) null))) / ((float) i5) >= f4) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.lang.String r19, java.util.List r20, boolean r21, kotlin.coroutines.c r22) {
        /*
            r18 = this;
            r0 = r22
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterSingleWord$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterSingleWord$1 r1 = (ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterSingleWord$1) r1
            int r2 = r1.f8318j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8318j = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterSingleWord$1 r1 = new ch.icoaching.typewise.language_detection.LanguageDetection$getLanguageCounterSingleWord$1
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f8316h
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r1.f8318j
            r5 = 1
            if (r4 == 0) goto L_0x0058
            if (r4 != r5) goto L_0x0050
            boolean r4 = r1.f8315g
            java.lang.Object r6 = r1.f8314f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f8313e
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r1.f8312d
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r1.f8311c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r1.f8310b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.f8309a
            ch.icoaching.typewise.language_detection.LanguageDetection r11 = (ch.icoaching.typewise.language_detection.LanguageDetection) r11
            kotlin.f.b(r0)
            r16 = r7
            r7 = r1
            r1 = r9
            r9 = r8
            r8 = r16
            goto L_0x00a1
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0058:
            kotlin.f.b(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r4 = r20.iterator()
            r8 = r0
            r6 = r1
            r11 = r2
            r7 = r4
            r0 = r19
            r1 = r20
            r4 = r21
        L_0x006e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            ch.icoaching.typewise.word_lists.c r10 = r11.f8274a
            ch.icoaching.typewise.word_lists.WordListKind r12 = ch.icoaching.typewise.word_lists.WordListKind.STANDARD
            r6.f8309a = r11
            r6.f8310b = r0
            r6.f8311c = r1
            r6.f8312d = r8
            r6.f8313e = r7
            r6.f8314f = r9
            r6.f8315g = r4
            r6.f8318j = r5
            java.lang.Object r10 = r10.d(r9, r12, r6)
            if (r10 != r3) goto L_0x0095
            return r3
        L_0x0095:
            r16 = r10
            r10 = r0
            r0 = r16
            r17 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r17
        L_0x00a1:
            ch.icoaching.typewise.word_lists.WordList r0 = (ch.icoaching.typewise.word_lists.WordList) r0
            r12 = 0
            r13 = 2
            r14 = 0
            if (r4 == 0) goto L_0x00ae
            int r0 = ch.icoaching.typewise.word_lists.WordList.k(r0, r10, r14, r13, r12)
        L_0x00ac:
            float r0 = (float) r0
            goto L_0x00be
        L_0x00ae:
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r15 = r10.toLowerCase(r15)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r15, r5)
            int r0 = ch.icoaching.typewise.word_lists.WordList.i(r0, r15, r14, r13, r12)
            goto L_0x00ac
        L_0x00be:
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r0)
            r9.put(r6, r0)
            r6 = r7
            r7 = r8
            r8 = r9
            r0 = r10
            r5 = 1
            goto L_0x006e
        L_0x00cb:
            java.util.Collection r0 = r8.values()
            float r0 = kotlin.collections.C0718m.s0(r0)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0105
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x011d
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r3 / r0
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.a.c(r3)
            r8.put(r4, r3)
            goto L_0x00e0
        L_0x0105:
            java.util.Iterator r0 = r1.iterator()
        L_0x0109:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.a.c(r3)
            r8.put(r1, r4)
            goto L_0x0109
        L_0x011d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetection.u(java.lang.String, java.util.List, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    public final Pair v(String str, boolean z3, boolean z4) {
        boolean z5;
        Boolean valueOf;
        o.e(str, "text");
        String p4 = p(str, z3, z4);
        e<l> findAll$default = Regex.findAll$default(C0946c.l(), p4, 0, 2, (Object) null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        for (l lVar : findAll$default) {
            int i6 = i4 + 1;
            arrayList.add(lVar.getValue());
            if (i4 == 0) {
                valueOf = Boolean.TRUE;
            } else {
                String substring = p4.substring(i5, lVar.b().b());
                o.d(substring, "substring(...)");
                String m4 = s.m(substring, " ");
                if (m4.length() <= 0 || !C0946c.k().contains(Character.valueOf(kotlin.text.o.T0(m4)))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                valueOf = Boolean.valueOf(z5);
            }
            arrayList2.add(valueOf);
            i5 = lVar.b().c() + 1;
            i4 = i6;
        }
        return new Pair(arrayList, arrayList2);
    }
}
