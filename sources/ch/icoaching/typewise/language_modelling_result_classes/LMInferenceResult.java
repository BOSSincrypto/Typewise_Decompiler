package ch.icoaching.typewise.language_modelling_result_classes;

import B2.h;
import E0.s;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.word_lists.WordList;
import ch.icoaching.typewise.word_lists.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.random.Random;
import kotlin.text.Regex;
import kotlin.text.l;
import v0.C0920a;
import v2.C0925a;
import y0.C0946c;

public final class LMInferenceResult implements Iterable, C0925a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8807d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Regex f8808e = new Regex("\\b(\\w+)\\b(?:.*\\b\\1\\b)+");

    /* renamed from: f  reason: collision with root package name */
    private static final Regex f8809f = new Regex("[.?!\n]");

    /* renamed from: a  reason: collision with root package name */
    private List f8810a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8811b;

    /* renamed from: c  reason: collision with root package name */
    private final List f8812c;

    public static final class a {
        private a() {
        }

        public final LMInferenceResult a() {
            return new LMInferenceResult(C0718m.j(), 0, (List) null, 4, (i) null);
        }

        public final boolean b(String str, WordList wordList, WordList wordList2) {
            o.e(str, "text");
            for (l lVar : Regex.findAll$default(C0946c.l(), str, 0, 2, (Object) null)) {
                if (wordList != null && !wordList.d(lVar.getValue(), false, true)) {
                    return false;
                }
                if (wordList2 != null && wordList2.d(lVar.getValue(), true, true)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LMInferenceResult(List list, int i4, List list2) {
        o.e(list, "singleResults");
        o.e(list2, "thirdPartyCosts");
        this.f8810a = list;
        this.f8811b = i4;
        this.f8812c = list2;
    }

    public static /* synthetic */ LMInferenceResult c(LMInferenceResult lMInferenceResult, List list, int i4, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = lMInferenceResult.f8810a;
        }
        if ((i5 & 2) != 0) {
            i4 = lMInferenceResult.f8811b;
        }
        if ((i5 & 4) != 0) {
            list2 = lMInferenceResult.f8812c;
        }
        return lMInferenceResult.b(list, i4, list2);
    }

    public static /* synthetic */ Object h(LMInferenceResult lMInferenceResult, String str, String str2, int i4, c cVar, kotlin.coroutines.c cVar2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        return lMInferenceResult.g(str, str2, i4, cVar, cVar2);
    }

    private static final boolean i(String str, Set set, int i4) {
        for (String contains : kotlin.text.o.t0(C0946c.f(str, i4), new String[]{" "}, false, 0, 6, (Object) null)) {
            if (set.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ LMInferenceResult l(LMInferenceResult lMInferenceResult, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 3;
        }
        return lMInferenceResult.k(str, i4);
    }

    public final LMInferenceResult b(List list, int i4, List list2) {
        o.e(list, "singleResults");
        o.e(list2, "thirdPartyCosts");
        return new LMInferenceResult(list, i4, list2);
    }

    public final LMInferenceResult d(WordList wordList, WordList wordList2) {
        if (wordList == null && (wordList2 == null || wordList2.m() == 0)) {
            return this;
        }
        List list = this.f8810a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (f8807d.b(((a) next).i(), wordList, wordList2)) {
                arrayList.add(next);
            }
        }
        return new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
    }

    public final LMInferenceResult e() {
        List list = this.f8810a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!((a) next).n()) {
                arrayList.add(next);
            }
        }
        LMInferenceResult lMInferenceResult = new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
        if (lMInferenceResult.f8810a.size() < this.f8810a.size() && Random.Default.nextDouble() < 0.01d) {
            e.b(e.f8233a, "LMInferenceResult", "filterEmpty() :: Filtered out a an empty prediction (1 in a 100 print of same kind)", (Throwable) null, 4, (Object) null);
        }
        return lMInferenceResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LMInferenceResult)) {
            return false;
        }
        LMInferenceResult lMInferenceResult = (LMInferenceResult) obj;
        return o.a(this.f8810a, lMInferenceResult.f8810a) && this.f8811b == lMInferenceResult.f8811b && o.a(this.f8812c, lMInferenceResult.f8812c);
    }

    public final LMInferenceResult f(C0920a aVar, String str) {
        o.e(aVar, "toBeFilteredOutPredictions");
        o.e(str, "context");
        String B3 = kotlin.text.o.B(kotlin.text.o.B(kotlin.text.o.B(str, 160, ' ', false, 4, (Object) null), 8199, ' ', false, 4, (Object) null), 8239, ' ', false, 4, (Object) null);
        List list = this.f8810a;
        ArrayList<a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (!aVar.b().contains(((a) next).i())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (a aVar2 : arrayList) {
            String str2 = B3 + s.o(aVar2.i(), aVar2.h(), (Integer) null, 2, (Object) null);
            Iterator it = aVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList2.add(aVar2);
                    break;
                }
                l lVar = (l) h.l(Regex.findAll$default((Regex) it.next(), str2, 0, 2, (Object) null));
                if (lVar != null && lVar.b().c() + 1 > B3.length()) {
                    break;
                }
            }
        }
        return new LMInferenceResult(arrayList2, this.f8811b, this.f8812c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.String r5, java.lang.String r6, int r7, ch.icoaching.typewise.word_lists.c r8, kotlin.coroutines.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult$filterOutPredictionsAfterNames$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult$filterOutPredictionsAfterNames$1 r0 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult$filterOutPredictionsAfterNames$1) r0
            int r1 = r0.f8818f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8818f = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult$filterOutPredictionsAfterNames$1 r0 = new ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult$filterOutPredictionsAfterNames$1
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8816d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8818f
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r7 = r0.f8815c
            java.lang.Object r5 = r0.f8814b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f8813a
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r5 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r5
            kotlin.f.b(r9)
            goto L_0x004f
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003c:
            kotlin.f.b(r9)
            r0.f8813a = r4
            r0.f8814b = r6
            r0.f8815c = r7
            r0.f8818f = r3
            java.lang.Object r9 = r8.c(r5, r0)
            if (r9 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r5 = r4
        L_0x004f:
            java.util.Set r9 = (java.util.Set) r9
            boolean r6 = i(r6, r9, r7)
            if (r6 == 0) goto L_0x005c
            java.util.List r6 = kotlin.collections.C0718m.j()
            goto L_0x005e
        L_0x005c:
            java.util.List r6 = r5.f8810a
        L_0x005e:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r7 = new ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult
            int r8 = r5.f8811b
            java.util.List r5 = r5.f8812c
            r7.<init>(r6, r8, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult.g(java.lang.String, java.lang.String, int, ch.icoaching.typewise.word_lists.c, kotlin.coroutines.c):java.lang.Object");
    }

    public int hashCode() {
        return (((this.f8810a.hashCode() * 31) + this.f8811b) * 31) + this.f8812c.hashCode();
    }

    public final boolean isEmpty() {
        return this.f8810a.isEmpty();
    }

    public Iterator iterator() {
        return this.f8810a.iterator();
    }

    public final LMInferenceResult j(float f4) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f8810a) {
            if (aVar.k() > f4) {
                arrayList.add(a.c(aVar, (String) null, 0.0f, 0, (String) null, (String) null, (Float) null, (Map) null, (Float) null, false, (Float) null, Float.valueOf(f4), 1023, (Object) null));
            }
        }
        return new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
    }

    public final LMInferenceResult k(String str, int i4) {
        o.e(str, "context");
        ArrayList arrayList = new ArrayList();
        String f4 = C0946c.f(str, i4);
        int length = f4.length();
        for (a aVar : this.f8810a) {
            Regex regex = f8808e;
            String lowerCase = (f4 + s.o(aVar.i(), aVar.h(), (Integer) null, 2, (Object) null)).toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            Iterator it = Regex.findAll$default(regex, lowerCase, 0, 2, (Object) null).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((l) it.next()).b().c() + 1 >= length) {
                        e.f(e.f8233a, "LMInferenceResult", "Filtered out due to internal repetition: " + aVar.i(), (Throwable) null, 4, (Object) null);
                        break;
                    }
                } else {
                    arrayList.add(aVar);
                    break;
                }
            }
        }
        return new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
    }

    public final LMInferenceResult m(int i4) {
        List list = this.f8810a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((a) next).p() > i4) {
                arrayList.add(next);
            }
        }
        return new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
    }

    public final LMInferenceResult n(float f4) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f8810a) {
            if (aVar.j() != null) {
                Float j4 = aVar.j();
                o.b(j4);
                if (j4.floatValue() > f4) {
                    arrayList.add(a.c(aVar, (String) null, 0.0f, 0, (String) null, (String) null, (Float) null, (Map) null, (Float) null, false, Float.valueOf(f4), (Float) null, 1535, (Object) null));
                }
            }
        }
        return new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
    }

    public final a o(int i4) {
        return (a) this.f8810a.get(i4);
    }

    public final int p() {
        return this.f8811b;
    }

    public final List q() {
        return this.f8810a;
    }

    public final int r() {
        return this.f8810a.size();
    }

    public final LMInferenceResult s(float f4) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f8810a) {
            String i4 = aVar.i();
            float k4 = aVar.k();
            int h4 = aVar.h();
            String l4 = aVar.l();
            String g4 = aVar.g();
            Map d4 = aVar.d();
            Float e4 = aVar.e();
            arrayList.add(new a(i4, k4, h4, l4, g4, Float.valueOf(aVar.k() * ((float) Math.pow((double) ((float) aVar.p()), (double) f4))), d4, Float.valueOf(f4), false, aVar.f(), e4, 256, (i) null));
        }
        C0718m.o0(arrayList);
        return new LMInferenceResult(arrayList, this.f8811b, this.f8812c);
    }

    public final LMInferenceResult t(String str, String str2) {
        int U3;
        o.e(str, "context");
        if (str2 == null || (U3 = kotlin.text.o.U(str2, 10, 0, false, 6, (Object) null)) == -1) {
            return this;
        }
        String substring = str2.substring(U3);
        o.d(substring, "substring(...)");
        List s02 = kotlin.text.o.s0(substring, new char[]{10}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object next : s02) {
            if (!kotlin.text.o.X((String) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        l find$default = Regex.find$default(f8809f, kotlin.text.o.U0(str).toString(), 0, 2, (Object) null);
        if (find$default != null) {
            String substring2 = str.substring(str.length() - find$default.b().b());
            o.d(substring2, "substring(...)");
            str = kotlin.text.o.M0(substring2).toString();
        }
        for (a aVar : this.f8810a) {
            String substring3 = aVar.i().substring(aVar.h());
            o.d(substring3, "substring(...)");
            String str3 = str + substring3;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.text.o.G((String) it.next(), str3, false, 2, (Object) null)) {
                        return f8807d.a();
                    }
                }
            }
        }
        return this;
    }

    public String toString() {
        List list = this.f8810a;
        int i4 = this.f8811b;
        List list2 = this.f8812c;
        return "LMInferenceResult(singleResults=" + list + ", nrCalls=" + i4 + ", thirdPartyCosts=" + list2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LMInferenceResult(List list, int i4, List list2, int i5, i iVar) {
        this(list, i4, (i5 & 4) != 0 ? C0718m.j() : list2);
    }
}
