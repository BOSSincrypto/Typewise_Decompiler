package B0;

import B0.o;
import E0.s;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.c;
import r0.e;
import z2.d;

public class G extends E {

    /* renamed from: p  reason: collision with root package name */
    public static final a f55p = new a((i) null);

    /* renamed from: j  reason: collision with root package name */
    private final IDictionaryRepository f56j;

    /* renamed from: k  reason: collision with root package name */
    private final Set f57k;

    /* renamed from: l  reason: collision with root package name */
    private final String f58l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f59m;

    /* renamed from: n  reason: collision with root package name */
    private final float f60n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f61o;

    public static final class a {
        private a() {
        }

        public final F a(c cVar, F f4) {
            o.e(cVar, "originalSingleWord");
            o.e(f4, "lookupResult");
            List t02 = kotlin.text.o.t0(cVar.b(), new String[]{" "}, false, 0, 6, (Object) null);
            if (t02.size() != 2) {
                return f4;
            }
            String str = (String) t02.get(0);
            List c4 = f4.c();
            ArrayList arrayList = new ArrayList();
            for (Object next : c4) {
                if (!o.a(((o) next).f(), str)) {
                    arrayList.add(next);
                }
            }
            f4.b(arrayList);
            return f4;
        }

        public final List b(String str) {
            o.e(str, "phrase");
            return C0718m.B0(d.j(1, str.length()));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(float f4, int i4, IDictionaryRepository iDictionaryRepository, x xVar, Set set, String str, ConfigHolder configHolder) {
        super(f4, i4, iDictionaryRepository, xVar, str, configHolder);
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(xVar, "distanceComparer");
        o.e(set, "spaceNeighbours");
        o.e(str, "language");
        o.e(configHolder, "configHolder");
        this.f56j = iDictionaryRepository;
        this.f57k = set;
        this.f58l = str;
        this.f59m = configHolder.c().e().j().w();
        this.f60n = configHolder.c().e().j().q();
        this.f61o = configHolder.c().e().j().v();
    }

    public static /* synthetic */ F o(G g4, c cVar, e eVar, float f4, Integer num, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                f4 = 2.0f;
            }
            float f5 = f4;
            if ((i5 & 8) != 0) {
                num = null;
            }
            Integer num2 = num;
            if ((i5 & 16) != 0) {
                i4 = 1;
            }
            return g4.r(cVar, eVar, f5, num2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lookupSpaceSplit");
    }

    public static /* synthetic */ F p(G g4, c cVar, e eVar, float f4, Integer num, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                f4 = 2.0f;
            }
            if ((i4 & 8) != 0) {
                num = null;
            }
            return g4.q(cVar, eVar, f4, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lookupSpaceSplitSecondSplit");
    }

    public static /* synthetic */ E0.o t(G g4, F f4, Set set, c cVar, e eVar, int i4, int i5, float f5, int i6, boolean z3, c cVar2, int i7, Object obj) {
        boolean z4;
        c cVar3;
        int i8 = i7;
        if (obj == null) {
            if ((i8 & 256) != 0) {
                z4 = true;
            } else {
                z4 = z3;
            }
            if ((i8 & 512) != 0) {
                cVar3 = null;
            } else {
                cVar3 = cVar2;
            }
            return g4.s(f4, set, cVar, eVar, i4, i5, f5, i6, z4, cVar3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: singleSplitSuggestions");
    }

    public int m(Integer num, int i4) {
        if (num == null) {
            num = Integer.valueOf(l());
        }
        if (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 2) {
            throw new RuntimeException("Incorrect verbosity");
        } else if (i4 == 1 || i4 == 2) {
            return num.intValue();
        } else {
            throw new RuntimeException("Incorrect numberOfSpaces");
        }
    }

    public F n(F f4, c cVar, e eVar) {
        o.e(f4, "lookupResultWithValidSuggestions");
        o.e(cVar, "singleWord");
        o.e(eVar, "previousWordData");
        List c4 = f4.c();
        if (c4.isEmpty()) {
            return new F(C0718m.e(o.a.a(o.f148f, cVar.b(), -1.0f, C0718m.e(this.f56j.j(cVar, eVar.d(), this.f58l)), cVar.d(), 0, 16, (Object) null)), eVar);
        }
        Iterator it = c4.iterator();
        if (it.hasNext()) {
            float a4 = ((o) it.next()).a();
            while (it.hasNext()) {
                a4 = Math.min(a4, ((o) it.next()).a());
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : c4) {
                if (((o) next).a() == a4) {
                    arrayList.add(next);
                }
            }
            return new F(arrayList, f4.a());
        }
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public B0.F q(r0.c r17, r0.e r18, float r19, java.lang.Integer r20) {
        /*
            r16 = this;
            r11 = r16
            r12 = r17
            r13 = r18
            java.lang.String r0 = "singleWord"
            kotlin.jvm.internal.o.e(r12, r0)
            java.lang.String r0 = "previousWordData"
            kotlin.jvm.internal.o.e(r13, r0)
            r0 = 1
            r1 = r20
            int r14 = r11.m(r1, r0)
            B0.F r0 = new B0.F
            java.util.List r1 = kotlin.collections.C0718m.j()
            r0.<init>(r1, r13)
            java.util.Set r1 = kotlin.collections.L.e()
            java.util.List r2 = r16.x(r17)
            java.util.Iterator r15 = r2.iterator()
            r2 = r1
            r1 = r0
        L_0x002e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r15.next()
            E0.o r0 = (E0.o) r0
            java.lang.Object r3 = r0.a()
            r0.c r3 = (r0.c) r3
            java.lang.Object r0 = r0.b()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            float r0 = r11.f60n
            r10 = r19
            float r7 = java.lang.Math.min(r10, r0)
            r8 = 1
            r9 = 1
            r0 = r16
            r4 = r18
            r5 = r14
            r10 = r17
            E0.o r0 = r0.s(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r0.a()
            B0.F r1 = (B0.F) r1
            java.lang.Object r0 = r0.b()
            r2 = r0
            java.util.Set r2 = (java.util.Set) r2
            goto L_0x002e
        L_0x006d:
            B0.F r0 = r11.n(r1, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G.q(r0.c, r0.e, float, java.lang.Integer):B0.F");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B0.F r(r0.c r20, r0.e r21, float r22, java.lang.Integer r23, int r24) {
        /*
            r19 = this;
            r13 = r19
            r14 = r20
            r15 = r21
            java.lang.String r0 = "singleWord"
            kotlin.jvm.internal.o.e(r14, r0)
            java.lang.String r0 = "previousWordData"
            kotlin.jvm.internal.o.e(r15, r0)
            r0 = r23
            r12 = r24
            int r16 = r13.m(r0, r12)
            B0.F r0 = new B0.F
            java.util.List r1 = kotlin.collections.C0718m.j()
            r0.<init>(r1, r15)
            java.util.Set r1 = kotlin.collections.L.e()
            boolean r2 = r13.f59m
            if (r2 == 0) goto L_0x0071
            java.lang.String r2 = r20.b()
            java.util.List r2 = r13.w(r2)
            java.util.Iterator r17 = r2.iterator()
            r2 = r1
            r1 = r0
        L_0x0037:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r17.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r11 = 512(0x200, float:7.175E-43)
            r18 = 0
            r9 = 1
            r10 = 0
            r0 = r19
            r3 = r20
            r4 = r21
            r5 = r16
            r7 = r22
            r8 = r24
            r12 = r18
            E0.o r0 = t(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r0.a()
            B0.F r1 = (B0.F) r1
            java.lang.Object r0 = r0.b()
            r2 = r0
            java.util.Set r2 = (java.util.Set) r2
            r12 = r24
            goto L_0x0037
        L_0x006f:
            r0 = r1
            r1 = r2
        L_0x0071:
            boolean r2 = r13.f61o
            if (r2 == 0) goto L_0x00c1
            B0.G$a r2 = f55p
            java.lang.String r3 = r20.b()
            java.util.List r2 = r2.b(r3)
            java.util.Iterator r17 = r2.iterator()
            r2 = r1
            r1 = r0
        L_0x0085:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r17.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r0 = 1073741824(0x40000000, float:2.0)
            r12 = r22
            float r7 = java.lang.Math.min(r12, r0)
            r11 = 512(0x200, float:7.175E-43)
            r18 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r0 = r19
            r3 = r20
            r4 = r21
            r5 = r16
            r12 = r18
            E0.o r0 = t(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r0.a()
            B0.F r1 = (B0.F) r1
            java.lang.Object r0 = r0.b()
            r2 = r0
            java.util.Set r2 = (java.util.Set) r2
            goto L_0x0085
        L_0x00c0:
            r0 = r1
        L_0x00c1:
            B0.F r0 = r13.n(r0, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G.r(r0.c, r0.e, float, java.lang.Integer, int):B0.F");
    }

    public E0.o s(F f4, Set set, c cVar, e eVar, int i4, int i5, float f5, int i6, boolean z3, c cVar2) {
        F f6;
        F f7;
        F f8;
        c cVar3;
        F f9 = f4;
        Set set2 = set;
        c cVar4 = cVar;
        float f10 = f5;
        c cVar5 = cVar2;
        kotlin.jvm.internal.o.e(f9, "lookupResultWithValidSuggestions");
        kotlin.jvm.internal.o.e(set2, "considered");
        kotlin.jvm.internal.o.e(cVar4, "singleWord");
        kotlin.jvm.internal.o.e(eVar, "previousWordData");
        E0.o u3 = u(cVar4, i5, z3);
        c cVar6 = (c) u3.a();
        c cVar7 = (c) u3.b();
        if (f10 <= 0.0f) {
            ch.icoaching.typewise.e.l(ch.icoaching.typewise.e.f8233a, "LookupSpaceSplit", "Max edit distance <0", (Throwable) null, 4, (Object) null);
        }
        F f11 = E.f(this, cVar6, eVar, Integer.valueOf(i4), Float.valueOf(f5), (String) null, (String) null, 48, (Object) null);
        if (!z(f11)) {
            return new E0.o(f9, set2);
        }
        if (i6 == 2) {
            f7 = r(cVar7, eVar, Math.max(f10 - 1.0f, 0.5f), (Integer) null, 1);
            f6 = f11;
        } else {
            f6 = f11;
            f7 = E.f(this, cVar7, eVar, Integer.valueOf(i4), Float.valueOf(f5), (String) null, (String) null, 48, (Object) null);
        }
        if (!z(f7)) {
            return new E0.o(f9, set2);
        }
        if (cVar5 != null) {
            f8 = f55p.a(cVar5, f6);
        } else {
            f8 = f6;
        }
        if (f8.c().isEmpty()) {
            return new E0.o(f9, set2);
        }
        if (((o) f8.c().get(0)).a() + ((o) f7.c().get(0)).a() > f10) {
            return new E0.o(f9, set2);
        }
        if (e().a(cVar4, c.f16009f.a(((o) f8.c().get(0)).f() + " " + ((o) f7.c().get(0)).f(), ((o) f8.c().get(0)).g() + " " + ((o) f7.c().get(0)).g(), cVar.c(), cVar.a()), f10) < 0.0f) {
            return new E0.o(f9, set2);
        }
        if (cVar5 == null) {
            cVar3 = cVar;
        } else {
            cVar3 = cVar2;
        }
        return v(cVar3, f8, f7, set, f5, f4, i5);
    }

    public E0.o u(c cVar, int i4, boolean z3) {
        String b4;
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        c.a aVar = c.f16009f;
        String substring = cVar.b().substring(0, i4);
        kotlin.jvm.internal.o.d(substring, "substring(...)");
        String substring2 = cVar.d().substring(0, i4);
        kotlin.jvm.internal.o.d(substring2, "substring(...)");
        c b5 = c.a.b(aVar, substring, substring2, cVar.c(), (String) null, 8, (Object) null);
        if (z3) {
            b4 = cVar.b();
            i4++;
        } else {
            b4 = cVar.b();
        }
        String substring3 = b4.substring(i4);
        kotlin.jvm.internal.o.d(substring3, "substring(...)");
        String substring4 = cVar.d().substring(i4);
        kotlin.jvm.internal.o.d(substring4, "substring(...)");
        return new E0.o(b5, c.a.b(aVar, substring3, substring4, (String) null, cVar.a(), 4, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E0.o v(r0.c r26, B0.F r27, B0.F r28, java.util.Set r29, float r30, B0.F r31, int r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r30
            java.lang.String r3 = "singleWord"
            kotlin.jvm.internal.o.e(r1, r3)
            java.lang.String r3 = "lookupResult1"
            r4 = r27
            kotlin.jvm.internal.o.e(r4, r3)
            java.lang.String r3 = "lookupResult2"
            r5 = r28
            kotlin.jvm.internal.o.e(r5, r3)
            java.lang.String r3 = "considered"
            r6 = r29
            kotlin.jvm.internal.o.e(r6, r3)
            java.lang.String r3 = "lookupResultWithValidSuggestions"
            r7 = r31
            kotlin.jvm.internal.o.e(r7, r3)
            java.util.Set r3 = kotlin.collections.C0718m.E0(r29)
            java.util.List r6 = r31.c()
            java.util.List r6 = kotlin.collections.C0718m.D0(r6)
            java.util.List r4 = r27.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x003b:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01b4
            java.lang.Object r8 = r4.next()
            B0.o r8 = (B0.o) r8
            java.util.List r9 = r28.c()
            java.util.Iterator r9 = r9.iterator()
        L_0x004f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01ac
            java.lang.Object r10 = r9.next()
            B0.o r10 = (B0.o) r10
            float r11 = r8.a()
            float r12 = r10.a()
            float r11 = r11 + r12
            java.lang.String r12 = r8.f()
            java.lang.String r13 = r10.f()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = " "
            r14.append(r12)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            boolean r14 = r3.contains(r13)
            if (r14 == 0) goto L_0x00e5
            java.util.ArrayList r10 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C0718m.t(r6, r12)
            r10.<init>(r12)
            java.util.Iterator r12 = r6.iterator()
        L_0x0095:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00a9
            java.lang.Object r14 = r12.next()
            B0.o r14 = (B0.o) r14
            java.lang.String r14 = r14.f()
            r10.add(r14)
            goto L_0x0095
        L_0x00a9:
            boolean r12 = r10.contains(r13)
            if (r12 == 0) goto L_0x004f
            int r10 = r10.indexOf(r13)
            java.lang.Object r12 = r6.get(r10)
            B0.o r12 = (B0.o) r12
            float r12 = r12.a()
            r13 = 0
            int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r14 > 0) goto L_0x004f
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x004f
            int r11 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x004f
            java.lang.Object r11 = r6.get(r10)
            r12 = r11
            B0.o r12 = (B0.o) r12
            r18 = 15
            r19 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = r32
            B0.o r11 = B0.o.c(r12, r13, r14, r15, r16, r17, r18, r19)
            r6.set(r10, r11)
            goto L_0x004f
        L_0x00e5:
            float r11 = r8.a()
            float r14 = r10.a()
            float r11 = r11 + r14
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f4
            goto L_0x004f
        L_0x00f4:
            r3.add(r13)
            java.lang.String r11 = r8.g()
            java.lang.String r14 = r10.g()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r12)
            r15.append(r14)
            java.lang.String r11 = r15.toString()
            r0.c$a r14 = r0.c.f16009f
            java.lang.String r15 = r26.c()
            r27 = r4
            java.lang.String r4 = r26.a()
            r0.c r4 = r14.a(r13, r11, r15, r4)
            B0.x r14 = r25.e()
            float r17 = r14.a(r1, r4, r2)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0133
            r4 = r27
            goto L_0x004f
        L_0x0133:
            java.util.List r4 = r8.h()
            java.util.List r4 = kotlin.collections.C0718m.D0(r4)
            java.lang.String r18 = r10.f()
            java.lang.String[] r19 = new java.lang.String[]{r12}
            r22 = 6
            r23 = 0
            r20 = 0
            r21 = 0
            java.util.List r10 = kotlin.text.o.t0(r18, r19, r20, r21, r22, r23)
            java.lang.String r12 = r8.f()
            int r14 = r10.size()
            r15 = 0
        L_0x0158:
            if (r15 >= r14) goto L_0x0191
            ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r1 = r0.f56j
            r0.c$a r18 = r0.c.f16009f
            java.lang.Object r16 = r10.get(r15)
            r19 = r16
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r21 = r26.c()
            java.lang.String r22 = r26.a()
            r23 = 2
            r24 = 0
            r20 = 0
            r0.c r2 = r0.c.a.b(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r5 = r0.f58l
            r0.e r1 = r1.j(r2, r12, r5)
            r4.add(r1)
            java.lang.Object r1 = r10.get(r15)
            r12 = r1
            java.lang.String r12 = (java.lang.String) r12
            int r15 = r15 + 1
            r1 = r26
            r5 = r28
            r2 = r30
            goto L_0x0158
        L_0x0191:
            B0.o$a r15 = B0.o.f148f
            r16 = r13
            r18 = r4
            r19 = r11
            r20 = r32
            B0.o r1 = r15.b(r16, r17, r18, r19, r20)
            r6.add(r1)
            r1 = r26
            r4 = r27
            r5 = r28
            r2 = r30
            goto L_0x004f
        L_0x01ac:
            r1 = r26
            r5 = r28
            r2 = r30
            goto L_0x003b
        L_0x01b4:
            B0.F r1 = new B0.F
            r0.e r2 = r31.a()
            r1.<init>(r6, r2)
            E0.o r2 = new E0.o
            r2.<init>(r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.G.v(r0.c, B0.F, B0.F, java.util.Set, float, B0.F, int):E0.o");
    }

    public List w(String str) {
        kotlin.jvm.internal.o.e(str, "phrase");
        if (str.length() <= 1) {
            return C0718m.j();
        }
        ArrayList<Number> arrayList = new ArrayList<>();
        int length = str.length() - 1;
        for (int i4 = 1; i4 < length; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            String substring = str.substring(intValue2, intValue2 + 1);
            kotlin.jvm.internal.o.d(substring, "substring(...)");
            if (this.f57k.contains(substring)) {
                arrayList2.add(Integer.valueOf(intValue2));
            }
        }
        return arrayList2;
    }

    public List x(c cVar) {
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        int V3 = kotlin.text.o.V(cVar.b(), " ", 0, false, 6, (Object) null);
        if (V3 != -1) {
            int i4 = V3 - 1;
            return C0718m.m(new E0.o(y(cVar, i4), Integer.valueOf(i4)), new E0.o(y(cVar, V3), Integer.valueOf(V3 + 1)));
        }
        throw new RuntimeException("No space in word but space transposition attempted");
    }

    public c y(c cVar, int i4) {
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        String b4 = cVar.b();
        String n4 = s.n(b4, 0, Integer.valueOf(i4));
        char charAt = b4.charAt(i4 + 1);
        char charAt2 = b4.charAt(i4);
        String n5 = s.n(b4, i4 + 2, (Integer) null);
        return c.a.b(c.f16009f, n4 + charAt + charAt2 + n5, (String) null, cVar.c(), cVar.a(), 2, (Object) null);
    }

    public boolean z(F f4) {
        kotlin.jvm.internal.o.e(f4, "suggestions");
        if (f4.c().size() == 1 && ((o) f4.c().get(0)).a() == -1.0f) {
            return false;
        }
        return true;
    }
}
