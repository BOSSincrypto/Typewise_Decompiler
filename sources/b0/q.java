package B0;

import E0.m;
import E0.p;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.c;

public final class q implements x {

    /* renamed from: k  reason: collision with root package name */
    public static final a f155k = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map f156a;

    /* renamed from: b  reason: collision with root package name */
    private final float f157b;

    /* renamed from: c  reason: collision with root package name */
    private final float f158c;

    /* renamed from: d  reason: collision with root package name */
    private final float f159d;

    /* renamed from: e  reason: collision with root package name */
    private final float f160e;

    /* renamed from: f  reason: collision with root package name */
    private final float f161f;

    /* renamed from: g  reason: collision with root package name */
    private final float f162g;

    /* renamed from: h  reason: collision with root package name */
    private final float f163h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f164i;

    /* renamed from: j  reason: collision with root package name */
    private final p f165j;

    public static final class a {
        private a() {
        }

        public final Pair a(Map map, p pVar) {
            o.e(map, "keyPositions");
            if (pVar == null) {
                throw new RuntimeException("touchPosition can not be null");
            } else if (map.containsKey("spacer") && map.containsKey("spacel") && map.containsKey("space_rect_l") && map.containsKey("space_rect_r")) {
                throw new IllegalStateException("Too many spaces in key position dictionary");
            } else if (map.containsKey("spacer") && map.containsKey("spacel")) {
                p.a aVar = p.f385c;
                Object obj = map.get("spacel");
                o.b(obj);
                float a4 = aVar.a((p) obj, pVar);
                Object obj2 = map.get("spacer");
                o.b(obj2);
                if (a4 < aVar.a((p) obj2, pVar)) {
                    Object obj3 = map.get("spacel");
                    o.b(obj3);
                    return new Pair(obj3, "spacel");
                }
                Object obj4 = map.get("spacer");
                o.b(obj4);
                return new Pair(obj4, "spacer");
            } else if (map.containsKey("space_rect_r") && map.containsKey("space_rect_l")) {
                float a5 = pVar.a();
                Object obj5 = map.get("space_rect_l");
                o.b(obj5);
                if (a5 < ((p) obj5).a()) {
                    Object obj6 = map.get("space_rect_l");
                    o.b(obj6);
                    return new Pair(obj6, "space_rect_l");
                }
                float a6 = pVar.a();
                Object obj7 = map.get("space_rect_r");
                o.b(obj7);
                if (a6 > ((p) obj7).a()) {
                    Object obj8 = map.get("space_rect_r");
                    o.b(obj8);
                    return new Pair(obj8, "space_rect_r");
                }
                float a7 = pVar.a();
                Object obj9 = map.get("space_rect_l");
                o.b(obj9);
                return new Pair(new p(a7, ((p) obj9).b()), null);
            } else if (map.containsKey("spacer")) {
                Object obj10 = map.get("spacer");
                o.b(obj10);
                return new Pair(obj10, "spacer");
            } else if (map.containsKey("spacel")) {
                Object obj11 = map.get("spacel");
                o.b(obj11);
                return new Pair(obj11, "spacel");
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i4 = 1; i4 < 9; i4++) {
                    linkedHashSet.add("space_" + i4);
                }
                if (map.keySet().containsAll(linkedHashSet)) {
                    Set keySet = map.keySet();
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (Object next : keySet) {
                        if (kotlin.text.o.L((String) next, "space", false, 2, (Object) null)) {
                            arrayList.add(next);
                        }
                    }
                    float f4 = 9999999.0f;
                    String str = "";
                    for (String str2 : arrayList) {
                        Object obj12 = map.get(str2);
                        o.b(obj12);
                        float a8 = p.f385c.a(pVar, (p) obj12);
                        if (a8 < f4) {
                            str = str2;
                            f4 = a8;
                        }
                    }
                    if (!o.a(str, "")) {
                        Object obj13 = map.get(str);
                        o.b(obj13);
                        return new Pair(obj13, str);
                    }
                    throw new RuntimeException("Can't find closest key");
                }
                throw new RuntimeException("Spaces not detected in key positions dictionary");
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public q(Map map, float f4, ConfigHolder configHolder) {
        o.e(map, "keyPositions");
        o.e(configHolder, "configHolder");
        this.f156a = map;
        this.f157b = f4;
        this.f158c = configHolder.c().e().g().c();
        this.f159d = configHolder.c().e().g().b();
        this.f160e = configHolder.c().e().g().e();
        this.f161f = configHolder.c().e().g().f();
        this.f162g = configHolder.c().e().g().d();
        this.f163h = configHolder.c().e().g().a();
        this.f164i = configHolder.c().e().m();
        this.f165j = new p(this, configHolder);
    }

    public float a(c cVar, c cVar2, float f4) {
        o.e(cVar, "singleWord1");
        o.e(cVar2, "singleWord2");
        return this.f165j.a(cVar, cVar2, f4);
    }

    public final float b(char c4) {
        if (c4 == '\'') {
            return this.f160e;
        }
        return this.f162g;
    }

    public final float c(char c4, char c5) {
        if (c5 == c4 && c4 != '\'') {
            return this.f163h;
        }
        return this.f159d;
    }

    public final float d(char c4, char c5, char c6, char c7, float f4) {
        float f5 = 0.0f;
        if (c7 == c6) {
            if (c4 != c6) {
                f5 = 1.0f;
            }
            if (c5 != c4) {
                f5 *= this.f158c;
            } else if (c4 == '\'' && c6 != '\'') {
                return f4 + this.f158c;
            }
        } else if (c5 != c7) {
            f5 = 1.0f;
        }
        return f4 + f5;
    }

    public float e(p pVar, p pVar2, float f4) {
        float f5 = 0.0f;
        if (pVar == null || pVar2 == null) {
            return 0.0f;
        }
        float a4 = p.f385c.a(pVar, pVar2);
        if (this.f164i) {
            float f6 = (float) 2;
            if (a4 >= f4 / f6) {
                if (a4 < (((float) 3) * f4) / f6) {
                    f5 = 0.5f;
                } else {
                    f5 = 1.0f;
                }
            }
        } else {
            f5 = a4 / f4;
        }
        return Math.min(1.0f, f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float f(r0.c r22, r0.c r23, java.util.List r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            java.lang.String r2 = "singleWord1"
            r3 = r22
            kotlin.jvm.internal.o.e(r3, r2)
            java.lang.String r2 = "singleWord2"
            r4 = r23
            kotlin.jvm.internal.o.e(r4, r2)
            java.lang.String r2 = "singleWord1TouchPoints"
            kotlin.jvm.internal.o.e(r1, r2)
            java.lang.String r2 = r23.b()
            int r2 = r2.length()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = r7
        L_0x002c:
            float r9 = (float) r2
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x003a
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r6.add(r9)
            float r8 = r8 + r7
            goto L_0x002c
        L_0x003a:
            r8 = 0
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r6.add(r9)
            java.lang.String r9 = r22.b()
            int r9 = r9.length()
            r11 = 0
            r20 = r6
            r6 = r5
            r5 = r20
        L_0x0050:
            r12 = 1
            if (r11 >= r9) goto L_0x021a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
            r14 = 0
        L_0x0059:
            if (r14 >= r2) goto L_0x0065
            java.lang.Float r15 = java.lang.Float.valueOf(r8)
            r13.add(r15)
            int r14 = r14 + 1
            goto L_0x0059
        L_0x0065:
            float r14 = (float) r11
            float r14 = r14 + r7
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13.add(r14)
            java.lang.String r14 = r22.b()
            char r14 = r14.charAt(r11)
            java.lang.String r15 = r22.d()
            char r15 = r15.charAt(r11)
            if (r14 == r15) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r12 = 0
        L_0x0082:
            java.lang.String r14 = r23.b()
            int r14 = r14.length()
            r8 = 0
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x008d:
            if (r8 >= r14) goto L_0x0208
            java.lang.String r10 = r23.b()
            char r10 = r10.charAt(r8)
            java.lang.String r15 = r23.d()
            char r15 = r15.charAt(r8)
            java.lang.Object r17 = E0.m.e(r5, r8)
            java.lang.Number r17 = (java.lang.Number) r17
            float r17 = r17.floatValue()
            float r18 = r0.c(r10, r15)
            float r7 = r17 + r18
            r17 = r2
            int r2 = r8 + -1
            java.lang.Object r18 = E0.m.e(r13, r2)
            java.lang.Number r18 = (java.lang.Number) r18
            float r18 = r18.floatValue()
            float r19 = r0.b(r10)
            float r3 = r18 + r19
            r4 = 32
            if (r10 != r4) goto L_0x00f8
            B0.q$a r4 = f155k
            java.util.Map r10 = r0.f156a
            java.lang.Object r15 = r1.get(r11)
            E0.p r15 = (E0.p) r15
            kotlin.Pair r4 = r4.a(r10, r15)
            java.lang.Object r4 = r4.getFirst()
            E0.p r4 = (E0.p) r4
            java.lang.Object r10 = E0.m.e(r5, r2)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            java.lang.Object r15 = r1.get(r11)
            E0.p r15 = (E0.p) r15
            r18 = r9
            float r9 = r0.f157b
            float r4 = r0.e(r15, r4, r9)
            float r10 = r10 + r4
        L_0x00f4:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x016d
        L_0x00f8:
            r18 = r9
            java.util.Map r4 = r0.f156a
            java.lang.String r9 = java.lang.String.valueOf(r15)
            boolean r4 = r4.containsKey(r9)
            if (r4 == 0) goto L_0x015f
            if (r12 == 0) goto L_0x011d
            java.lang.String r4 = r22.d()
            char r4 = r4.charAt(r11)
            java.lang.String r9 = r23.b()
            char r9 = r9.charAt(r8)
            if (r4 != r9) goto L_0x011d
            float r10 = r0.f158c
            goto L_0x00f4
        L_0x011d:
            java.lang.String r4 = r22.b()
            char r4 = r4.charAt(r11)
            r9 = 39
            if (r4 != r9) goto L_0x013a
            if (r10 == r9) goto L_0x013a
            java.lang.Object r4 = E0.m.e(r5, r2)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r9 = r0.f158c
            float r10 = r4 + r9
            goto L_0x00f4
        L_0x013a:
            java.util.Map r4 = r0.f156a
            java.lang.String r9 = java.lang.String.valueOf(r15)
            java.lang.Object r4 = r4.get(r9)
            E0.p r4 = (E0.p) r4
            java.lang.Object r9 = E0.m.e(r5, r2)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            java.lang.Object r10 = r1.get(r11)
            E0.p r10 = (E0.p) r10
            float r15 = r0.f157b
            float r4 = r0.e(r10, r4, r15)
            float r10 = r9 + r4
            goto L_0x00f4
        L_0x015f:
            java.lang.Object r4 = E0.m.e(r5, r2)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r4 + r9
        L_0x016d:
            float r3 = java.lang.Math.min(r7, r3)
            float r3 = java.lang.Math.min(r3, r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r13.set(r8, r3)
            if (r11 <= 0) goto L_0x01dc
            if (r8 <= 0) goto L_0x01dc
            java.lang.String r3 = r22.b()
            char r3 = E0.s.l(r3, r11)
            java.lang.String r4 = r23.b()
            char r2 = E0.s.l(r4, r2)
            if (r3 != r2) goto L_0x01dc
            java.lang.String r2 = r22.b()
            int r3 = r11 + -1
            char r2 = E0.s.l(r2, r3)
            java.lang.String r3 = r23.b()
            char r3 = E0.s.l(r3, r8)
            if (r2 != r3) goto L_0x01dc
            java.lang.String r2 = r22.b()
            char r2 = E0.s.l(r2, r11)
            java.lang.String r3 = r23.b()
            char r3 = E0.s.l(r3, r8)
            if (r2 == r3) goto L_0x01dc
            java.lang.Object r2 = E0.m.e(r13, r8)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r3 = r8 + -2
            java.lang.Object r3 = E0.m.e(r6, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r4 = r0.f161f
            float r3 = r3 + r4
            float r2 = java.lang.Math.min(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r13.set(r8, r2)
        L_0x01dc:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x01e3
            goto L_0x01f1
        L_0x01e3:
            java.lang.Object r3 = E0.m.e(r13, r8)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x01fb
        L_0x01f1:
            java.lang.Object r3 = E0.m.e(r13, r8)
            java.lang.Number r3 = (java.lang.Number) r3
            float r16 = r3.floatValue()
        L_0x01fb:
            int r8 = r8 + 1
            r3 = r22
            r4 = r23
            r7 = r9
            r2 = r17
            r9 = r18
            goto L_0x008d
        L_0x0208:
            r17 = r2
            r18 = r9
            r9 = r7
            int r11 = r11 + 1
            r3 = r22
            r4 = r23
            r6 = r5
            r5 = r13
            r9 = r18
            r8 = 0
            goto L_0x0050
        L_0x021a:
            java.lang.String r1 = r23.b()
            int r1 = r1.length()
            int r1 = r1 - r12
            java.lang.Object r1 = E0.m.e(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.q.f(r0.c, r0.c, java.util.List):float");
    }

    public float g(c cVar, c cVar2, float f4) {
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        int i9;
        q qVar = this;
        o.e(cVar, "singleWord1");
        o.e(cVar2, "singleWord2");
        ArrayList arrayList2 = new ArrayList();
        int length = cVar.b().length();
        int length2 = cVar2.b().length();
        ArrayList arrayList3 = new ArrayList();
        int i10 = length2 + 1;
        for (int i11 = 1; i11 < i10; i11++) {
            arrayList3.add(Float.valueOf((float) i11));
        }
        float f5 = 0.0f;
        arrayList3.add(Float.valueOf(0.0f));
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList3;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 - 1;
            float f6 = ((float) i13) - f4;
            int i14 = i12 + 1;
            float f7 = ((float) i14) + f4;
            ArrayList arrayList6 = new ArrayList(length2);
            for (int i15 = 0; i15 < length2; i15++) {
                arrayList6.add(Float.valueOf(f5));
            }
            arrayList6.add(Float.valueOf(((float) i12) + 1.0f));
            float f8 = -1.0f;
            int i16 = 0;
            while (i16 < length2) {
                float f9 = (float) i16;
                if (f9 < f6) {
                    i8 = i16;
                    arrayList = arrayList6;
                    i5 = i14;
                    i7 = i13;
                    i4 = length;
                    i6 = i12;
                    i9 = 1;
                } else if (f9 > f7) {
                    i8 = i16;
                    arrayList = arrayList6;
                    i5 = i14;
                    i7 = i13;
                    i4 = length;
                    i9 = 1;
                    i6 = i12;
                } else {
                    float c4 = qVar.c(cVar2.b().charAt(i16), cVar2.d().charAt(i16)) + ((Number) m.e(arrayList5, i16)).floatValue();
                    int i17 = i16 - 1;
                    float b4 = qVar.b(cVar2.b().charAt(i16)) + ((Number) m.e(arrayList6, i17)).floatValue();
                    i8 = i16;
                    arrayList = arrayList6;
                    i5 = i14;
                    i7 = i13;
                    i4 = length;
                    i6 = i12;
                    arrayList.set(i8, Float.valueOf(Math.min(Math.min(c4, b4), d(cVar.b().charAt(i12), cVar.d().charAt(i12), cVar2.b().charAt(i16), cVar2.d().charAt(i16), ((Number) m.e(arrayList5, i17)).floatValue()))));
                    if (i6 > 0 && i8 > 0 && cVar.b().charAt(i6) == cVar2.b().charAt(i17) && cVar.b().charAt(i7) == cVar2.b().charAt(i8) && cVar.b().charAt(i6) != cVar2.b().charAt(i8)) {
                        arrayList.set(i8, Float.valueOf(Math.min(((Number) arrayList.get(i8)).floatValue(), ((Number) m.e(arrayList4, i8 - 2)).floatValue() + ((float) 1))));
                    }
                    if (f8 != -1.0f && ((Number) m.e(arrayList, i8)).floatValue() >= f8) {
                        i16 = i8 + 1;
                        qVar = this;
                        arrayList6 = arrayList;
                        i13 = i7;
                        i12 = i6;
                        i14 = i5;
                        length = i4;
                        c cVar3 = cVar;
                        c cVar4 = cVar2;
                    } else {
                        f8 = ((Number) m.e(arrayList, i8)).floatValue();
                        i16 = i8 + 1;
                        qVar = this;
                        arrayList6 = arrayList;
                        i13 = i7;
                        i12 = i6;
                        i14 = i5;
                        length = i4;
                        c cVar32 = cVar;
                        c cVar42 = cVar2;
                    }
                }
                arrayList.set(i8, Float.valueOf(f4 + ((float) i9)));
                i16 = i8 + 1;
                qVar = this;
                arrayList6 = arrayList;
                i13 = i7;
                i12 = i6;
                i14 = i5;
                length = i4;
                c cVar322 = cVar;
                c cVar422 = cVar2;
            }
            ArrayList arrayList7 = arrayList6;
            int i18 = i14;
            int i19 = length;
            if (f8 > f4) {
                return -1.0f;
            }
            qVar = this;
            c cVar5 = cVar2;
            arrayList4 = arrayList5;
            i12 = i18;
            length = i19;
            f5 = 0.0f;
            arrayList5 = arrayList7;
            c cVar6 = cVar;
        }
        int i20 = length2 - 1;
        if (((Number) m.e(arrayList5, i20)).floatValue() > f4) {
            return -1.0f;
        }
        return ((Number) m.e(arrayList5, i20)).floatValue();
    }
}
