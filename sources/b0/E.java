package B0;

import B0.o;
import B0.s;
import E0.m;
import E0.o;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import r0.c;
import r0.e;

public class E {

    /* renamed from: i  reason: collision with root package name */
    public static final a f44i = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f45a;

    /* renamed from: b  reason: collision with root package name */
    private int f46b;

    /* renamed from: c  reason: collision with root package name */
    private final IDictionaryRepository f47c;

    /* renamed from: d  reason: collision with root package name */
    private x f48d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49e;

    /* renamed from: f  reason: collision with root package name */
    private final int f50f;

    /* renamed from: g  reason: collision with root package name */
    private final int f51g;

    /* renamed from: h  reason: collision with root package name */
    private final s f52h;

    public static final class a {
        private a() {
        }

        public final o a(float f4, float f5, e eVar, List list, int i4, String str) {
            kotlin.jvm.internal.o.e(eVar, "suggestion");
            kotlin.jvm.internal.o.e(list, "suggestions");
            kotlin.jvm.internal.o.e(str, "suggestionNoDiacritics");
            List D02 = C0718m.D0(list);
            int i5 = (f4 > f5 ? 1 : (f4 == f5 ? 0 : -1));
            if (i5 <= 0) {
                o a4 = o.a.a(o.f148f, eVar.d(), f4, C0718m.e(eVar), str, 0, 16, (Object) null);
                if (i4 == 1) {
                    if (!D02.isEmpty() && i5 < 0) {
                        D02.clear();
                    }
                    f5 = f4;
                } else if (i4 == 2) {
                    if (!D02.isEmpty() && f4 < f5 - ((float) 2)) {
                        D02.clear();
                    }
                    f5 = Math.min(((float) 1) + f4, f5);
                }
                if (f4 <= f5) {
                    D02.add(a4);
                }
            }
            return new E0.o(D02, Float.valueOf(f5));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public E(float f4, int i4, IDictionaryRepository iDictionaryRepository, x xVar, String str, ConfigHolder configHolder) {
        kotlin.jvm.internal.o.e(iDictionaryRepository, "dictionaryRepository");
        kotlin.jvm.internal.o.e(xVar, "distanceComparer");
        kotlin.jvm.internal.o.e(str, "language");
        kotlin.jvm.internal.o.e(configHolder, "configHolder");
        this.f45a = f4;
        this.f46b = i4;
        this.f47c = iDictionaryRepository;
        this.f48d = xVar;
        this.f49e = str;
        this.f50f = configHolder.c().e().j().r();
        int s4 = configHolder.c().e().j().s();
        this.f51g = s4;
        this.f52h = new s(s4, iDictionaryRepository, str);
    }

    public static /* synthetic */ F f(E e4, c cVar, e eVar, Integer num, Float f4, String str, String str2, int i4, Object obj) {
        Integer num2;
        Float f5;
        String str3;
        String str4;
        if (obj == null) {
            if ((i4 & 4) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i4 & 8) != 0) {
                f5 = null;
            } else {
                f5 = f4;
            }
            if ((i4 & 16) != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if ((i4 & 32) != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            return e4.g(cVar, eVar, num2, f5, str3, str4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lookup");
    }

    public final int a(int i4, int i5) {
        return Math.max(i4, i5);
    }

    public final int b(String str, String str2, int i4) {
        kotlin.jvm.internal.o.e(str, "phrase");
        kotlin.jvm.internal.o.e(str2, "suggestion");
        if (str2.length() != 1) {
            throw new RuntimeException("Candidate input must be length 1");
        } else if (!kotlin.text.o.K(str, str2.charAt(0), false, 2, (Object) null)) {
            return i4;
        } else {
            return i4 - 1;
        }
    }

    public final C0253a c(String str, c cVar, e eVar, Set set, float f4, float f5, int i4, int i5, List list, String str2, String str3) {
        e eVar2 = eVar;
        Set set2 = set;
        List list2 = list;
        kotlin.jvm.internal.o.e(str, "candidate");
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        kotlin.jvm.internal.o.e(eVar2, "previousWordData");
        kotlin.jvm.internal.o.e(set2, "consideredSuggestions");
        kotlin.jvm.internal.o.e(list2, "suggestions");
        List<e> i6 = this.f47c.i(str, eVar.d(), this.f49e, cVar.c(), cVar.a());
        C0253a aVar = new C0253a(set2, list2, f5, eVar2);
        for (e d4 : i6) {
            String str4 = str;
            c cVar2 = cVar;
            aVar = d(str4, cVar2, d4, aVar.a(), f4, aVar.b(), i4, i5, aVar.d(), aVar.c(), str2, str3);
        }
        return aVar;
    }

    public final C0253a d(String str, c cVar, e eVar, Set set, float f4, float f5, int i4, int i5, List list, e eVar2, String str2, String str3) {
        Set set2 = set;
        List list2 = list;
        e eVar3 = eVar2;
        kotlin.jvm.internal.o.e(str, "candidate");
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        kotlin.jvm.internal.o.e(eVar, "suggestion");
        kotlin.jvm.internal.o.e(set2, "consideredSuggestions");
        kotlin.jvm.internal.o.e(list2, "suggestions");
        kotlin.jvm.internal.o.e(eVar3, "previousWordData");
        int length = str.length();
        int length2 = cVar.b().length();
        E0.o b4 = this.f52h.b(eVar.d(), set2);
        Set set3 = (Set) b4.a();
        boolean booleanValue = ((Boolean) b4.b()).booleanValue();
        C0253a aVar = new C0253a(set3, list2, f5, eVar3);
        if (booleanValue) {
            return aVar;
        }
        int length3 = eVar.d().length();
        if (this.f52h.f(length2, f5, eVar.d(), str, i4, length, length3, this.f50f, str2, str3)) {
            return aVar;
        }
        c b5 = c.a.b(c.f16009f, eVar.d(), (String) null, cVar.c(), cVar.a(), 2, (Object) null);
        C0253a aVar2 = aVar;
        Set set4 = set3;
        E0.o k4 = k(cVar, b5, length2, length3, f4, length, f5);
        float floatValue = ((Number) k4.a()).floatValue();
        if (((Boolean) k4.b()).booleanValue()) {
            return aVar2;
        }
        E0.o a4 = f44i.a(floatValue, f5, eVar, list, i5, b5.d());
        return new C0253a(set4, (List) a4.a(), ((Number) a4.b()).floatValue(), eVar3);
    }

    /* access modifiers changed from: protected */
    public final x e() {
        return this.f48d;
    }

    public final F g(c cVar, e eVar, Integer num, Float f4, String str, String str2) {
        c cVar2 = cVar;
        e eVar2 = eVar;
        Float f5 = f4;
        kotlin.jvm.internal.o.e(cVar2, "singleWord");
        kotlin.jvm.internal.o.e(eVar2, "previousWordData");
        if (f5 != null && f4.floatValue() <= 0.0f) {
            ch.icoaching.typewise.e.l(ch.icoaching.typewise.e.f8233a, "LookupNoSplit", "Max edit distance <=0", (Throwable) null, 4, (Object) null);
        }
        E0.o i4 = i(f5, num);
        float floatValue = ((Number) i4.a()).floatValue();
        int intValue = ((Number) i4.b()).intValue();
        List j4 = C0718m.j();
        int length = cVar.b().length();
        if (this.f52h.e(length, floatValue)) {
            return this.f52h.a((F) null, cVar2, eVar2);
        }
        E0.o c4 = this.f52h.c(cVar2, eVar2, j4);
        boolean booleanValue = ((Boolean) c4.a()).booleanValue();
        List D02 = C0718m.D0((Collection) c4.b());
        F f6 = new F(D02, eVar2);
        int i5 = 2;
        if (booleanValue && intValue != 2) {
            return this.f52h.a(f6, cVar2, eVar2);
        }
        Set linkedHashSet = new LinkedHashSet();
        Set linkedHashSet2 = new LinkedHashSet();
        E0.o j5 = j(cVar.b(), length, C0718m.j());
        int intValue2 = ((Number) j5.b()).intValue();
        int i6 = 0;
        List list = D02;
        Set set = linkedHashSet;
        List list2 = (List) j5.a();
        float f7 = floatValue;
        Set set2 = linkedHashSet2;
        e eVar3 = eVar2;
        while (i6 < list2.size()) {
            String str3 = (String) m.e(list2, i6);
            int i7 = i6 + 1;
            int length2 = str3.length();
            int i8 = intValue2 - length2;
            if (s.f169d.c(i8, f7)) {
                if (intValue != i5) {
                    break;
                }
                i6 = i7;
            } else {
                List list3 = list2;
                int i9 = i5;
                int i10 = length;
                C0253a c5 = c(str3, cVar, eVar3, set2, floatValue, f7, length, intValue, list, str, str2);
                Set a4 = c5.a();
                List D03 = C0718m.D0(c5.d());
                e c6 = c5.c();
                float b4 = c5.b();
                E0.o h4 = h(i8, floatValue, length2, intValue, b4, str3, set, list3);
                set = C0718m.E0((Iterable) h4.a());
                set2 = a4;
                list = D03;
                eVar3 = c6;
                i6 = i7;
                i5 = i9;
                length = i10;
                f7 = b4;
                list2 = (List) h4.b();
            }
        }
        List list4 = list;
        s.a aVar = s.f169d;
        List D04 = C0718m.D0(aVar.a(C0718m.D0(aVar.b(list4, f7))));
        if (D04.size() > 1) {
            C0718m.w(D04);
        }
        return this.f52h.a(new F(D04, eVar3), cVar2, eVar3);
    }

    public final E0.o h(int i4, float f4, int i5, int i6, float f5, String str, Set set, List list) {
        kotlin.jvm.internal.o.e(str, "candidate");
        kotlin.jvm.internal.o.e(set, "consideredDeletes");
        kotlin.jvm.internal.o.e(list, "candidates");
        Set E02 = C0718m.E0(set);
        List D02 = C0718m.D0(list);
        float f6 = (float) i4;
        if (f6 < f4 && i5 <= this.f51g) {
            if (i6 != 2 && f6 >= f5) {
                return new E0.o(E02, D02);
            }
            int i7 = 0;
            while (i7 < i5) {
                String substring = str.substring(0, i7);
                kotlin.jvm.internal.o.d(substring, "substring(...)");
                i7++;
                String substring2 = str.substring(i7);
                kotlin.jvm.internal.o.d(substring2, "substring(...)");
                String str2 = substring + substring2;
                if (!set.contains(str2)) {
                    E02.add(str2);
                    D02.add(str2);
                }
            }
        }
        return new E0.o(E02, D02);
    }

    public final E0.o i(Float f4, Integer num) {
        if (f4 == null) {
            f4 = Float.valueOf(this.f45a);
        }
        if (f4.floatValue() <= this.f45a) {
            if (f4.floatValue() <= 0.0f) {
                f4 = Float.valueOf(0.5f);
                ch.icoaching.typewise.e.l(ch.icoaching.typewise.e.f8233a, "LookupNoSplit", "Distance too low", (Throwable) null, 4, (Object) null);
            }
            if (num == null) {
                num = Integer.valueOf(this.f46b);
            }
            if (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2) {
                return new E0.o(f4, num);
            }
            throw new RuntimeException("Incorrect verbosity");
        }
        throw new RuntimeException("Distance too large");
    }

    public final E0.o j(String str, int i4, List list) {
        kotlin.jvm.internal.o.e(str, "phrase");
        kotlin.jvm.internal.o.e(list, "candidates");
        String[] strArr = (String[]) list.toArray(new String[0]);
        List o4 = C0718m.o(Arrays.copyOf(strArr, strArr.length));
        int i5 = this.f51g;
        if (i4 > i5) {
            String substring = str.substring(0, i5);
            kotlin.jvm.internal.o.d(substring, "substring(...)");
            o4.add(substring);
            i4 = i5;
        } else {
            o4.add(str);
        }
        return new E0.o(o4, Integer.valueOf(i4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E0.o k(r0.c r8, r0.c r9, int r10, int r11, float r12, int r13, float r14) {
        /*
            r7 = this;
            java.lang.String r0 = "phrase"
            kotlin.jvm.internal.o.e(r8, r0)
            java.lang.String r0 = "suggestion"
            kotlin.jvm.internal.o.e(r9, r0)
            java.lang.String r0 = r8.b()
            java.lang.String r1 = r8.d()
            boolean r0 = kotlin.jvm.internal.o.a(r0, r1)
            java.lang.String r1 = r9.b()
            java.lang.String r2 = r9.d()
            boolean r1 = kotlin.jvm.internal.o.a(r1, r2)
            if (r13 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            java.lang.String r2 = r8.b()
            java.lang.String r3 = r9.b()
            boolean r2 = kotlin.jvm.internal.o.a(r2, r3)
            if (r2 != 0) goto L_0x003c
            int r8 = r7.a(r10, r11)
        L_0x003a:
            float r8 = (float) r8
            goto L_0x0087
        L_0x003c:
            r2 = 1
            if (r11 != r2) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            if (r1 == 0) goto L_0x0050
            java.lang.String r8 = r8.b()
            java.lang.String r9 = r9.b()
            int r8 = r7.b(r8, r9, r10)
            goto L_0x003a
        L_0x0050:
            B0.s r0 = r7.f52h
            java.lang.String r5 = r8.b()
            java.lang.String r6 = r9.b()
            r1 = r12
            r2 = r13
            r3 = r10
            r4 = r11
            boolean r10 = r0.d(r1, r2, r3, r4, r5, r6)
            r11 = 0
            if (r10 == 0) goto L_0x0071
            E0.o r8 = new E0.o
            java.lang.Float r9 = java.lang.Float.valueOf(r11)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r8.<init>(r9, r10)
            return r8
        L_0x0071:
            B0.x r10 = r7.f48d
            float r8 = r10.a(r8, r9, r14)
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0087
            E0.o r9 = new E0.o
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.<init>(r8, r10)
            return r9
        L_0x0087:
            int r9 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0097
            E0.o r9 = new E0.o
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.<init>(r8, r10)
            goto L_0x00a2
        L_0x0097:
            E0.o r9 = new E0.o
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.<init>(r8, r10)
        L_0x00a2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.E.k(r0.c, r0.c, int, int, float, int, float):E0.o");
    }

    /* access modifiers changed from: protected */
    public final int l() {
        return this.f46b;
    }
}
