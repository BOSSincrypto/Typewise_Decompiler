package ch.icoaching.typewise.autocorrection.scripts;

import B0.A;
import B0.I;
import B0.v;
import B0.z;
import E0.m;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class CombinationModel {

    /* renamed from: a  reason: collision with root package name */
    private final v f7927a;

    /* renamed from: b  reason: collision with root package name */
    private final float f7928b;

    /* renamed from: c  reason: collision with root package name */
    private final float f7929c;

    /* renamed from: d  reason: collision with root package name */
    private A f7930d;

    public CombinationModel(v vVar, z zVar, double d4, ConfigHolder configHolder) {
        o.e(vVar, "autocorrectionTFModel");
        o.e(zVar, "normaliserDataProvider");
        o.e(configHolder, "configHolder");
        this.f7927a = vVar;
        this.f7928b = configHolder.c().e().j().n();
        this.f7929c = configHolder.c().e().j().x();
        this.f7930d = new I(d4, zVar);
    }

    public static /* synthetic */ Object a(CombinationModel combinationModel, List list, List list2, List list3, List list4, float f4, int i4, c cVar, int i5, Object obj) {
        float f5;
        int i6;
        if (obj == null) {
            if ((i5 & 16) != 0) {
                f5 = 2.0f;
            } else {
                f5 = f4;
            }
            if ((i5 & 32) != 0) {
                i6 = 7;
            } else {
                i6 = i4;
            }
            return combinationModel.c(list, list2, list3, list4, f5, i6, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBestSuggestions");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object b(ch.icoaching.typewise.autocorrection.scripts.CombinationModel r4, java.util.List r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof ch.icoaching.typewise.autocorrection.scripts.CombinationModel$runInference$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel$runInference$1 r0 = (ch.icoaching.typewise.autocorrection.scripts.CombinationModel$runInference$1) r0
            int r1 = r0.f7943c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7943c = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel$runInference$1 r0 = new ch.icoaching.typewise.autocorrection.scripts.CombinationModel$runInference$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f7941a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f7943c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.f.b(r6)
            java.lang.Double[][] r5 = r4.f(r5)
            B0.v r4 = r4.f7927a
            r0.f7943c = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.util.List r4 = kotlin.collections.C0713h.c(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.CombinationModel.b(ch.icoaching.typewise.autocorrection.scripts.CombinationModel, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, float r18, int r19, kotlin.coroutines.c r20) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r20
            boolean r3 = r2 instanceof ch.icoaching.typewise.autocorrection.scripts.CombinationModel$getBestSuggestions$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel$getBestSuggestions$1 r3 = (ch.icoaching.typewise.autocorrection.scripts.CombinationModel$getBestSuggestions$1) r3
            int r4 = r3.f7940j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f7940j = r4
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel$getBestSuggestions$1 r3 = new ch.icoaching.typewise.autocorrection.scripts.CombinationModel$getBestSuggestions$1
            r3.<init>(r13, r2)
        L_0x001c:
            java.lang.Object r2 = r3.f7938h
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r3.f7940j
            r6 = 1
            if (r5 == 0) goto L_0x004f
            if (r5 != r6) goto L_0x0047
            int r1 = r3.f7937g
            float r4 = r3.f7936f
            java.lang.Object r5 = r3.f7935e
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r3.f7934d
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f7933c
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r3.f7932b
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r3 = r3.f7931a
            ch.icoaching.typewise.autocorrection.scripts.CombinationModel r3 = (ch.icoaching.typewise.autocorrection.scripts.CombinationModel) r3
            kotlin.f.b(r2)
            r9 = r1
            r1 = r7
            goto L_0x0078
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            kotlin.f.b(r2)
            r3.f7931a = r0
            r2 = r14
            r3.f7932b = r2
            r3.f7933c = r1
            r5 = r16
            r3.f7934d = r5
            r7 = r17
            r3.f7935e = r7
            r8 = r18
            r3.f7936f = r8
            r9 = r19
            r3.f7937g = r9
            r3.f7940j = r6
            java.lang.Object r3 = r13.d(r15, r3)
            if (r3 != r4) goto L_0x0072
            return r4
        L_0x0072:
            r6 = r5
            r5 = r7
            r4 = r8
            r8 = r2
            r2 = r3
            r3 = r0
        L_0x0078:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.C0718m.D0(r2)
            java.util.List r2 = r3.e(r1, r2)
            int r7 = r5.size()
            r10 = 0
        L_0x0087:
            if (r10 >= r7) goto L_0x00d0
            java.lang.Object r11 = r5.get(r10)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 != 0) goto L_0x0096
            goto L_0x00cd
        L_0x0096:
            java.lang.Object r11 = r2.get(r10)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            float r12 = r3.f7929c
            float r11 = r11 - r12
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.a.c(r11)
            r2.set(r10, r11)
            java.lang.Object r11 = r2.get(r10)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x00cd
            java.lang.Object r11 = r2.get(r10)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            float r11 = r11 - r12
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.a.c(r11)
            r2.set(r10, r11)
        L_0x00cd:
            int r10 = r10 + 1
            goto L_0x0087
        L_0x00d0:
            B0.C$a r3 = B0.C.f37e
            r14 = r3
            r15 = r2
            r16 = r8
            r17 = r5
            r18 = r6
            r19 = r9
            r20 = r1
            B0.C r1 = r14.b(r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.CombinationModel.c(java.util.List, java.util.List, java.util.List, java.util.List, float, int, kotlin.coroutines.c):java.lang.Object");
    }

    public Object d(List list, c cVar) {
        return b(this, list, cVar);
    }

    public final List e(List list, List list2) {
        o.e(list, "features");
        o.e(list2, "predictions");
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((Number) m.e((List) list.get(i4), -2)).doubleValue() == 1.0d) {
                list2.set(i4, Float.valueOf(((Number) list2.get(i4)).floatValue() + this.f7928b));
            }
        }
        return list2;
    }

    public final Double[][] f(List list) {
        o.e(list, "data");
        return this.f7930d.g(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinationModel(v vVar, z zVar, double d4, ConfigHolder configHolder, int i4, i iVar) {
        this(vVar, zVar, (i4 & 4) != 0 ? 1.0E-10d : d4, configHolder);
    }
}
