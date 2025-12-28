package B0;

import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.g;
import v2.C0925a;

public final class C implements Iterable, C0925a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f37e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f38a;

    /* renamed from: b  reason: collision with root package name */
    private final List f39b;

    /* renamed from: c  reason: collision with root package name */
    private final List f40c;

    /* renamed from: d  reason: collision with root package name */
    private final List f41d;

    public static final class a {
        private a() {
        }

        public final C a() {
            return new C(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        }

        public final C b(List list, List list2, List list3, List list4, int i4, List list5) {
            o.e(list, "preds");
            o.e(list2, "suggestedWords");
            o.e(list3, "whichSplitList");
            o.e(list4, "spaceSplitIndices");
            o.e(list5, "features");
            C c4 = new C(C0718m.D0(list2), C0718m.D0(list3), C0718m.D0(list), C0718m.D0(list4));
            c4.e(list5);
            c4.o();
            c4.c(i4);
            return c4;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f42a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f43b;

        b(C c4) {
            this.f43b = c4;
        }

        /* renamed from: b */
        public C0257e next() {
            if (hasNext()) {
                C0257e eVar = new C0257e((String) this.f43b.m().get(this.f42a), ((Number) this.f43b.n().get(this.f42a)).intValue(), ((Number) this.f43b.b().get(this.f42a)).floatValue(), ((Number) this.f43b.k().get(this.f42a)).intValue());
                this.f42a++;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f42a < this.f43b.m().size()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C(List list, List list2, List list3, List list4) {
        o.e(list, "bestSuggestions");
        o.e(list2, "whichSplitList");
        o.e(list3, "bestScores");
        o.e(list4, "bestSpaceSplitIndices");
        this.f38a = list;
        this.f39b = list2;
        this.f40c = list3;
        this.f41d = list4;
        if (L.h(Integer.valueOf(list.size()), Integer.valueOf(list2.size()), Integer.valueOf(list3.size()), Integer.valueOf(list4.size())).size() > 1) {
            throw new IllegalArgumentException("All lists must have the same length.");
        }
    }

    public final List b() {
        return this.f40c;
    }

    public final void c(int i4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f38a.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size && i5 < i4; i6++) {
            String str = (String) this.f38a.get(i6);
            if (!linkedHashSet.contains(str)) {
                linkedHashSet.add(str);
                arrayList.add(str);
                arrayList2.add(this.f40c.get(i6));
                arrayList3.add(this.f39b.get(i6));
                arrayList4.add(this.f41d.get(i6));
                i5++;
            }
        }
        this.f38a.clear();
        this.f39b.clear();
        this.f40c.clear();
        this.f41d.clear();
        this.f38a.addAll(arrayList);
        this.f39b.addAll(arrayList3);
        this.f40c.addAll(arrayList2);
        this.f41d.addAll(arrayList4);
    }

    public final void d(String str, double d4) {
        o.e(str, "originalWord");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f40c.size();
        for (int i4 = 0; i4 < size; i4++) {
            float floatValue = ((Number) this.f40c.get(i4)).floatValue();
            String str2 = (String) this.f38a.get(i4);
            if (((double) floatValue) < d4) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                o.d(lowerCase, "toLowerCase(...)");
                if (!o.a(lowerCase, str)) {
                    linkedHashSet.add(Integer.valueOf(i4));
                }
            }
        }
        j(linkedHashSet);
    }

    public final void e(List list) {
        o.e(list, "features");
        ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) ((List) it.next()).get(0)).doubleValue()));
        }
        List<C0260h> q02 = C0718m.q0(D.d(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (C0260h hVar : q02) {
            if (hVar.d() != null) {
                arrayList2.add(hVar.d());
            }
            if (hVar.e() != null) {
                arrayList3.add(hVar.e());
            }
            if (hVar.b() != null) {
                arrayList4.add(hVar.b());
            }
            if (hVar.c() != null) {
                arrayList5.add(hVar.c());
            }
        }
        this.f38a.clear();
        this.f39b.clear();
        this.f40c.clear();
        this.f41d.clear();
        this.f38a.addAll(arrayList2);
        this.f39b.addAll(arrayList3);
        this.f40c.addAll(arrayList4);
        this.f41d.addAll(arrayList5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c4 = (C) obj;
        if (o.a(this.f38a, c4.f38a) && o.a(this.f39b, c4.f39b) && o.a(this.f40c, c4.f40c) && o.a(this.f41d, c4.f41d)) {
            return true;
        }
        return false;
    }

    public final void f(List list, double d4, Set set, float f4, float f5, Set set2, Set set3) {
        o.e(list, "splits");
        o.e(set, "dontPredictWords");
        o.e(set2, "startElisionStrip");
        o.e(set3, "endPossessiveStrip");
        d(((g) list.get(0)).e().g(), d4);
        h(list, set);
        g(list, f4, f5);
        l(list, set2);
        i(list, set2, set3);
    }

    public final void g(List list, float f4, float f5) {
        List list2;
        Float valueOf;
        o.e(list, "splits");
        int length = ((g) list.get(0)).e().h().length();
        if (((g) list.get(0)).d() == TextCase.UPPER && length < 4) {
            int size = this.f38a.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((Number) this.f39b.get(i4)).intValue() == 0 && o.a((String) this.f38a.get(i4), ((g) list.get(0)).e().g())) {
                    if (length == 2) {
                        list2 = this.f40c;
                        valueOf = Float.valueOf(((Number) list2.get(i4)).floatValue() + f4);
                    } else if (length == 3) {
                        list2 = this.f40c;
                        valueOf = Float.valueOf(((Number) list2.get(i4)).floatValue() + f5);
                    }
                    list2.set(i4, valueOf);
                    o();
                    return;
                }
            }
        }
    }

    public final void h(List list, Set set) {
        o.e(list, "splits");
        o.e(set, "dontPredictWords");
        if (!set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = this.f38a.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = (String) this.f38a.get(i4);
                String g4 = ((g) list.get(((Number) this.f39b.get(i4)).intValue())).e().g();
                if (set.contains(str) && !o.a(str, g4)) {
                    linkedHashSet.add(Integer.valueOf(i4));
                }
            }
            j(linkedHashSet);
        }
    }

    public int hashCode() {
        return (((((this.f38a.hashCode() * 31) + this.f39b.hashCode()) * 31) + this.f40c.hashCode()) * 31) + this.f41d.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (kotlin.text.o.G(r4, r7, false, 2, (java.lang.Object) null) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.util.List r9, java.util.Set r10, java.util.Set r11) {
        /*
            r8 = this;
            java.lang.String r0 = "splits"
            kotlin.jvm.internal.o.e(r9, r0)
            java.lang.String r0 = "startElisionStrip"
            kotlin.jvm.internal.o.e(r10, r0)
            java.lang.String r0 = "endPossessiveStrip"
            kotlin.jvm.internal.o.e(r11, r0)
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x001c
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L_0x001c
            return
        L_0x001c:
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.Iterator r11 = r8.iterator()
            r0 = 0
            r1 = r0
        L_0x0027:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r11.next()
            B0.e r2 = (B0.C0257e) r2
            int r3 = r2.b()
            java.lang.Object r3 = r9.get(r3)
            r0.g r3 = (r0.g) r3
            r0.d r4 = r3.e()
            java.lang.String r4 = r4.c()
            r5 = 0
            r6 = 2
            if (r4 == 0) goto L_0x0066
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0050
            goto L_0x0066
        L_0x0050:
            java.lang.String r4 = r2.a()
            r0.d r7 = r3.e()
            java.lang.String r7 = r7.c()
            kotlin.jvm.internal.o.b(r7)
            boolean r4 = kotlin.text.o.G(r4, r7, r0, r6, r5)
            if (r4 == 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            r0.d r4 = r3.e()
            java.lang.String r4 = r4.e()
            if (r4 == 0) goto L_0x0093
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0077
            goto L_0x0093
        L_0x0077:
            java.lang.String r2 = r2.a()
            r0.d r3 = r3.e()
            java.lang.String r3 = r3.e()
            kotlin.jvm.internal.o.b(r3)
            boolean r2 = kotlin.text.o.u(r2, r3, r0, r6, r5)
            if (r2 == 0) goto L_0x0093
        L_0x008c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.add(r2)
        L_0x0093:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0096:
            r8.j(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C.i(java.util.List, java.util.Set, java.util.Set):void");
    }

    public Iterator iterator() {
        return new b(this);
    }

    public final void j(Set set) {
        o.e(set, "indices");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = this.f38a.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!set.contains(Integer.valueOf(i4))) {
                arrayList.add(this.f38a.get(i4));
                arrayList2.add(this.f39b.get(i4));
                arrayList3.add(this.f40c.get(i4));
                arrayList4.add(this.f41d.get(i4));
            }
        }
        this.f38a.clear();
        this.f39b.clear();
        this.f40c.clear();
        this.f41d.clear();
        this.f38a.addAll(arrayList);
        this.f39b.addAll(arrayList2);
        this.f40c.addAll(arrayList3);
        this.f41d.addAll(arrayList4);
    }

    public final List k() {
        return this.f41d;
    }

    public final void l(List list, Set set) {
        o.e(list, "splits");
        o.e(set, "startElisionStrip");
        if (!set.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = iterator();
            int i4 = 0;
            while (it.hasNext()) {
                C0257e eVar = (C0257e) it.next();
                String c4 = ((g) list.get(eVar.b())).e().c();
                if (!(c4 == null || c4.length() == 0 || C0258f.b().contains(Character.valueOf(ch.icoaching.typewise.autocorrection.resources.a.a(eVar.a().charAt(0)))))) {
                    linkedHashSet.add(Integer.valueOf(i4));
                }
                i4++;
            }
            j(linkedHashSet);
        }
    }

    public final List m() {
        return this.f38a;
    }

    public final List n() {
        return this.f39b;
    }

    public final void o() {
        List<C0261i> q02 = C0718m.q0(D.c(this));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C0261i iVar : q02) {
            if (iVar.d() != null) {
                arrayList.add(iVar.d());
            }
            if (iVar.e() != null) {
                arrayList2.add(iVar.e());
            }
            if (iVar.b() != null) {
                arrayList3.add(iVar.b());
            }
            if (iVar.c() != null) {
                arrayList4.add(iVar.c());
            }
        }
        this.f38a.clear();
        this.f39b.clear();
        this.f40c.clear();
        this.f41d.clear();
        this.f38a.addAll(arrayList);
        this.f39b.addAll(arrayList2);
        this.f40c.addAll(arrayList3);
        this.f41d.addAll(arrayList4);
    }

    public String toString() {
        List list = this.f38a;
        List list2 = this.f39b;
        List list3 = this.f40c;
        List list4 = this.f41d;
        return "InferenceResult(bestSuggestions=" + list + ", whichSplitList=" + list2 + ", bestScores=" + list3 + ", bestSpaceSplitIndices=" + list4 + ")";
    }
}
