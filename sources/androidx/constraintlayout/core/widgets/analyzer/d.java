package androidx.constraintlayout.core.widgets.analyzer;

import D.a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f4012a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4013b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4014c = true;

    /* renamed from: d  reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f4015d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f4016e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f4017f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private b.C0061b f4018g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f4019h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList f4020i = new ArrayList();

    public d(androidx.constraintlayout.core.widgets.d dVar) {
        this.f4012a = dVar;
        this.f4015d = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.constraintlayout.core.widgets.analyzer.DependencyNode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.constraintlayout.core.widgets.analyzer.DependencyNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9, int r10, int r11, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12, java.util.ArrayList r13, androidx.constraintlayout.core.widgets.analyzer.k r14) {
        /*
            r8 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = r9.f3972d
            androidx.constraintlayout.core.widgets.analyzer.k r0 = r9.f3984c
            if (r0 != 0) goto L_0x0109
            androidx.constraintlayout.core.widgets.d r0 = r8.f4012a
            androidx.constraintlayout.core.widgets.analyzer.j r1 = r0.f3918e
            if (r9 == r1) goto L_0x0109
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            if (r9 != r0) goto L_0x0012
            goto L_0x0109
        L_0x0012:
            if (r14 != 0) goto L_0x001c
            androidx.constraintlayout.core.widgets.analyzer.k r14 = new androidx.constraintlayout.core.widgets.analyzer.k
            r14.<init>(r9, r11)
            r13.add(r14)
        L_0x001c:
            r9.f3984c = r14
            r14.a(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r9.f3989h
            java.util.List r11 = r11.f3979k
            java.util.Iterator r11 = r11.iterator()
        L_0x0029:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            D.a r0 = (D.a) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L_0x0029
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x0046:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r9.f3990i
            java.util.List r11 = r11.f3979k
            java.util.Iterator r11 = r11.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r11.next()
            D.a r0 = (D.a) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L_0x004e
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x006b:
            r11 = 1
            if (r10 != r11) goto L_0x009a
            boolean r0 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.l
            if (r0 == 0) goto L_0x009a
            r0 = r9
            androidx.constraintlayout.core.widgets.analyzer.l r0 = (androidx.constraintlayout.core.widgets.analyzer.l) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f4035k
            java.util.List r0 = r0.f3979k
            java.util.Iterator r7 = r0.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.next()
            D.a r0 = (D.a) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L_0x007d
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x007d
        L_0x009a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.f3989h
            java.util.List r0 = r0.f3980l
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.next()
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            if (r1 != r12) goto L_0x00b3
            r14.f4029b = r11
        L_0x00b3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x00bd:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.f3990i
            java.util.List r0 = r0.f3980l
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r7.next()
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            if (r1 != r12) goto L_0x00d6
            r14.f4029b = r11
        L_0x00d6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00c5
        L_0x00e0:
            if (r10 != r11) goto L_0x0109
            boolean r11 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.l
            if (r11 == 0) goto L_0x0109
            androidx.constraintlayout.core.widgets.analyzer.l r9 = (androidx.constraintlayout.core.widgets.analyzer.l) r9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.f4035k
            java.util.List r9 = r9.f3980l
            java.util.Iterator r9 = r9.iterator()
        L_0x00f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0109
            java.lang.Object r11 = r9.next()
            r1 = r11
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0107 }
            goto L_0x00f0
        L_0x0107:
            r9 = move-exception
            throw r9
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.a(androidx.constraintlayout.core.widgets.analyzer.DependencyNode, int, int, androidx.constraintlayout.core.widgets.analyzer.DependencyNode, java.util.ArrayList, androidx.constraintlayout.core.widgets.analyzer.k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        r4 = r0.f3909Z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(androidx.constraintlayout.core.widgets.d r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.f219L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0338
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.f3909Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.V()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f3910a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f3876B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f3954w = r7
        L_0x0036:
            float r6 = r2.f3882E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f3956x = r7
        L_0x0042:
            float r6 = r2.v()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0078
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f3954w = r8
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f3956x = r8
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f3954w
            if (r6 != 0) goto L_0x0072
            r2.f3954w = r8
        L_0x0072:
            int r6 = r2.f3956x
            if (r6 != 0) goto L_0x0078
            r2.f3956x = r8
        L_0x0078:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r9 = r2.f3954w
            if (r9 != r10) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f3867f
            if (r9 == 0) goto L_0x008c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f3900Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f3867f
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008e:
            r9 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f3956x
            if (r5 != r10) goto L_0x00a3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f3899P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f3867f
            if (r5 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f3901R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f3867f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            androidx.constraintlayout.core.widgets.analyzer.j r4 = r2.f3918e
            r4.f3985d = r9
            int r5 = r2.f3954w
            r4.f3982a = r5
            androidx.constraintlayout.core.widgets.analyzer.l r4 = r2.f3920f
            r4.f3985d = r12
            int r13 = r2.f3956x
            r4.f3982a = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r9 == r4) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r14) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02e2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L_0x02e2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02e2
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0199
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L_0x0199
        L_0x00d8:
            if (r5 != r8) goto L_0x0113
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.x()
            float r3 = (float) r9
            float r4 = r2.f3917d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x0113:
            if (r5 != r10) goto L_0x012b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r2 = r2.W()
            r3.f4021m = r2
            goto L_0x0008
        L_0x012b:
            if (r5 != r7) goto L_0x0167
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.f3909Z
            r11 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 == r15) goto L_0x0137
            if (r11 != r4) goto L_0x0199
        L_0x0137:
            float r3 = r2.f3876B
            int r4 = r17.W()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.x()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x0167:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r11 = r2.f3906W
            r7 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f3867f
            if (r7 == 0) goto L_0x0175
            r7 = r11[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f3867f
            if (r7 != 0) goto L_0x0199
        L_0x0175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x0199:
            if (r12 != r6) goto L_0x0272
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 == r11) goto L_0x01a3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 != r7) goto L_0x0272
        L_0x01a3:
            if (r13 != r8) goto L_0x01e9
            if (r9 != r11) goto L_0x01b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x01b1:
            int r7 = r2.W()
            float r3 = r2.f3917d0
            int r4 = r2.w()
            r5 = -1
            if (r4 != r5) goto L_0x01c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x01e9:
            if (r13 != r10) goto L_0x0202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r2 = r2.x()
            r3.f4021m = r2
            goto L_0x0008
        L_0x0202:
            r7 = 2
            if (r13 != r7) goto L_0x023f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.f3909Z
            r7 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 == r8) goto L_0x020f
            if (r7 != r4) goto L_0x0272
        L_0x020f:
            float r3 = r2.f3882E
            int r7 = r2.W()
            int r4 = r17.x()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x023f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.f3906W
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r15.f3867f
            if (r7 == 0) goto L_0x024e
            r4 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f3867f
            if (r4 != 0) goto L_0x0272
        L_0x024e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x0272:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02c1
            if (r13 != r10) goto L_0x027b
            goto L_0x02c1
        L_0x027b:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f3909Z
            r3 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f3876B
            float r4 = r2.f3882E
            int r5 = r17.W()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.x()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x02c1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.f4021m = r4
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r2 = r2.x()
            r3.f4021m = r2
            goto L_0x0008
        L_0x02e2:
            int r3 = r2.W()
            if (r9 != r4) goto L_0x02fb
            int r3 = r17.W()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f3898O
            int r5 = r5.f3868g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f3900Q
            int r5 = r5.f3868g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x02fd
        L_0x02fb:
            r7 = r3
            r6 = r9
        L_0x02fd:
            int r3 = r2.x()
            if (r12 != r4) goto L_0x0316
            int r3 = r17.x()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f3899P
            int r4 = r4.f3868g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f3901R
            int r4 = r4.f3868g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0318
        L_0x0316:
            r9 = r3
            r8 = r12
        L_0x0318:
            r4 = r16
            r5 = r2
            r4.l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.j r3 = r2.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.W()
            r3.d(r4)
            androidx.constraintlayout.core.widgets.analyzer.l r3 = r2.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r3 = r3.f3986e
            int r4 = r2.x()
            r3.d(r4)
            r2.f3910a = r10
            goto L_0x0008
        L_0x0338:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.b(androidx.constraintlayout.core.widgets.d):boolean");
    }

    private int e(androidx.constraintlayout.core.widgets.d dVar, int i4) {
        int size = this.f4020i.size();
        long j4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j4 = Math.max(j4, ((k) this.f4020i.get(i5)).b(dVar, i4));
        }
        return (int) j4;
    }

    private void i(WidgetRun widgetRun, int i4, ArrayList arrayList) {
        for (a aVar : widgetRun.f3989h.f3979k) {
            if (aVar instanceof DependencyNode) {
                a((DependencyNode) aVar, i4, 0, widgetRun.f3990i, arrayList, (k) null);
            } else if (aVar instanceof WidgetRun) {
                a(((WidgetRun) aVar).f3989h, i4, 0, widgetRun.f3990i, arrayList, (k) null);
            }
        }
        for (a aVar2 : widgetRun.f3990i.f3979k) {
            if (aVar2 instanceof DependencyNode) {
                a((DependencyNode) aVar2, i4, 1, widgetRun.f3989h, arrayList, (k) null);
            } else if (aVar2 instanceof WidgetRun) {
                a(((WidgetRun) aVar2).f3990i, i4, 1, widgetRun.f3989h, arrayList, (k) null);
            }
        }
        if (i4 == 1) {
            for (a aVar3 : ((l) widgetRun).f4035k.f3979k) {
                if (aVar3 instanceof DependencyNode) {
                    a((DependencyNode) aVar3, i4, 2, (DependencyNode) null, arrayList, (k) null);
                }
            }
        }
    }

    private void l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i4, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i5) {
        b.a aVar = this.f4019h;
        aVar.f4000a = dimensionBehaviour;
        aVar.f4001b = dimensionBehaviour2;
        aVar.f4002c = i4;
        aVar.f4003d = i5;
        this.f4018g.b(constraintWidget, aVar);
        constraintWidget.k1(this.f4019h.f4004e);
        constraintWidget.L0(this.f4019h.f4005f);
        constraintWidget.K0(this.f4019h.f4007h);
        constraintWidget.A0(this.f4019h.f4006g);
    }

    public void c() {
        d(this.f4016e);
        this.f4020i.clear();
        k.f4027h = 0;
        i(this.f4012a.f3918e, 0, this.f4020i);
        i(this.f4012a.f3920f, 1, this.f4020i);
        this.f4013b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f4015d.f3918e.f();
        this.f4015d.f3920f.f();
        arrayList.add(this.f4015d.f3918e);
        arrayList.add(this.f4015d.f3920f);
        Iterator it = this.f4015d.f219L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof f) {
                arrayList.add(new h(constraintWidget));
            } else {
                if (constraintWidget.i0()) {
                    if (constraintWidget.f3914c == null) {
                        constraintWidget.f3914c = new c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f3914c);
                } else {
                    arrayList.add(constraintWidget.f3918e);
                }
                if (constraintWidget.k0()) {
                    if (constraintWidget.f3916d == null) {
                        constraintWidget.f3916d = new c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f3916d);
                } else {
                    arrayList.add(constraintWidget.f3920f);
                }
                if (constraintWidget instanceof C.b) {
                    arrayList.add(new i(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.f3983b != this.f4015d) {
                widgetRun.d();
            }
        }
    }

    public boolean f(boolean z3) {
        boolean z4;
        boolean z5 = false;
        if (this.f4013b || this.f4014c) {
            Iterator it = this.f4012a.f219L0.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.n();
                constraintWidget.f3910a = false;
                constraintWidget.f3918e.r();
                constraintWidget.f3920f.q();
            }
            this.f4012a.n();
            androidx.constraintlayout.core.widgets.d dVar = this.f4012a;
            dVar.f3910a = false;
            dVar.f3918e.r();
            this.f4012a.f3920f.q();
            this.f4014c = false;
        }
        if (b(this.f4015d)) {
            return false;
        }
        this.f4012a.m1(0);
        this.f4012a.n1(0);
        ConstraintWidget.DimensionBehaviour u3 = this.f4012a.u(0);
        ConstraintWidget.DimensionBehaviour u4 = this.f4012a.u(1);
        if (this.f4013b) {
            c();
        }
        int X3 = this.f4012a.X();
        int Y3 = this.f4012a.Y();
        this.f4012a.f3918e.f3989h.d(X3);
        this.f4012a.f3920f.f3989h.d(Y3);
        m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (u3 == dimensionBehaviour || u4 == dimensionBehaviour) {
            if (z3) {
                Iterator it2 = this.f4016e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((WidgetRun) it2.next()).m()) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z3 && u3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f4012a.P0(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.f4012a;
                dVar2.k1(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.f4012a;
                dVar3.f3918e.f3986e.d(dVar3.W());
            }
            if (z3 && u4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f4012a.g1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.f4012a;
                dVar4.L0(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.f4012a;
                dVar5.f3920f.f3986e.d(dVar5.x());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.f4012a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.f3909Z[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int W3 = dVar6.W() + X3;
            this.f4012a.f3918e.f3990i.d(W3);
            this.f4012a.f3918e.f3986e.d(W3 - X3);
            m();
            androidx.constraintlayout.core.widgets.d dVar7 = this.f4012a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.f3909Z[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int x3 = dVar7.x() + Y3;
                this.f4012a.f3920f.f3990i.d(x3);
                this.f4012a.f3920f.f3986e.d(x3 - Y3);
            }
            m();
            z4 = true;
        } else {
            z4 = false;
        }
        Iterator it3 = this.f4016e.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.f3983b != this.f4012a || widgetRun.f3988g) {
                widgetRun.e();
            }
        }
        Iterator it4 = this.f4016e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z5 = true;
                break;
            }
            WidgetRun widgetRun2 = (WidgetRun) it4.next();
            if ((z4 || widgetRun2.f3983b != this.f4012a) && (!widgetRun2.f3989h.f3978j || ((!widgetRun2.f3990i.f3978j && !(widgetRun2 instanceof h)) || (!widgetRun2.f3986e.f3978j && !(widgetRun2 instanceof c) && !(widgetRun2 instanceof h))))) {
                break;
            }
        }
        this.f4012a.P0(u3);
        this.f4012a.g1(u4);
        return z5;
    }

    public boolean g(boolean z3) {
        if (this.f4013b) {
            Iterator it = this.f4012a.f219L0.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.n();
                constraintWidget.f3910a = false;
                j jVar = constraintWidget.f3918e;
                jVar.f3986e.f3978j = false;
                jVar.f3988g = false;
                jVar.r();
                l lVar = constraintWidget.f3920f;
                lVar.f3986e.f3978j = false;
                lVar.f3988g = false;
                lVar.q();
            }
            this.f4012a.n();
            androidx.constraintlayout.core.widgets.d dVar = this.f4012a;
            dVar.f3910a = false;
            j jVar2 = dVar.f3918e;
            jVar2.f3986e.f3978j = false;
            jVar2.f3988g = false;
            jVar2.r();
            l lVar2 = this.f4012a.f3920f;
            lVar2.f3986e.f3978j = false;
            lVar2.f3988g = false;
            lVar2.q();
            c();
        }
        if (b(this.f4015d)) {
            return false;
        }
        this.f4012a.m1(0);
        this.f4012a.n1(0);
        this.f4012a.f3918e.f3989h.d(0);
        this.f4012a.f3920f.f3989h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            androidx.constraintlayout.core.widgets.d r0 = r9.f4012a
            r1 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.u(r1)
            androidx.constraintlayout.core.widgets.d r2 = r9.f4012a
            r3 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.u(r3)
            androidx.constraintlayout.core.widgets.d r4 = r9.f4012a
            int r4 = r4.X()
            androidx.constraintlayout.core.widgets.d r5 = r9.f4012a
            int r5 = r5.Y()
            if (r10 == 0) goto L_0x0088
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r6) goto L_0x0022
            if (r2 != r6) goto L_0x0088
        L_0x0022:
            java.util.ArrayList r6 = r9.f4016e
            java.util.Iterator r6 = r6.iterator()
        L_0x0028:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.f3987f
            if (r8 != r11) goto L_0x0028
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0028
            r10 = r1
        L_0x003f:
            if (r11 != 0) goto L_0x0065
            if (r10 == 0) goto L_0x0088
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r10) goto L_0x0088
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.P0(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            int r6 = r9.e(r10, r1)
            r10.k1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            androidx.constraintlayout.core.widgets.analyzer.j r6 = r10.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.f3986e
            int r10 = r10.W()
            r6.d(r10)
            goto L_0x0088
        L_0x0065:
            if (r10 == 0) goto L_0x0088
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r10) goto L_0x0088
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.g1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            int r6 = r9.e(r10, r3)
            r10.L0(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            androidx.constraintlayout.core.widgets.analyzer.l r6 = r10.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.f3986e
            int r10 = r10.x()
            r6.d(r10)
        L_0x0088:
            if (r11 != 0) goto L_0x00b2
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.f3909Z
            r5 = r5[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r6) goto L_0x0098
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0098:
            int r10 = r10.W()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.d r5 = r9.f4012a
            androidx.constraintlayout.core.widgets.analyzer.j r5 = r5.f3918e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f3990i
            r5.d(r10)
            androidx.constraintlayout.core.widgets.d r5 = r9.f4012a
            androidx.constraintlayout.core.widgets.analyzer.j r5 = r5.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r5 = r5.f3986e
            int r10 = r10 - r4
            r5.d(r10)
        L_0x00b0:
            r10 = r3
            goto L_0x00dc
        L_0x00b2:
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.f3909Z
            r4 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r6) goto L_0x00c3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r1
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.x()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.d r4 = r9.f4012a
            androidx.constraintlayout.core.widgets.analyzer.l r4 = r4.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.f3990i
            r4.d(r10)
            androidx.constraintlayout.core.widgets.d r4 = r9.f4012a
            androidx.constraintlayout.core.widgets.analyzer.l r4 = r4.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r4 = r4.f3986e
            int r10 = r10 - r5
            r4.d(r10)
            goto L_0x00b0
        L_0x00dc:
            r9.m()
            java.util.ArrayList r4 = r9.f4016e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f3987f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f3983b
            androidx.constraintlayout.core.widgets.d r7 = r9.f4012a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f3988g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList r4 = r9.f4016e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f3987f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f3983b
            androidx.constraintlayout.core.widgets.d r7 = r9.f4012a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f3989h
            boolean r6 = r6.f3978j
            if (r6 != 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f3990i
            boolean r6 = r6.f3978j
            if (r6 != 0) goto L_0x0133
            goto L_0x013f
        L_0x0133:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.c
            if (r6 != 0) goto L_0x010b
            androidx.constraintlayout.core.widgets.analyzer.e r5 = r5.f3986e
            boolean r5 = r5.f3978j
            if (r5 != 0) goto L_0x010b
            goto L_0x013f
        L_0x013e:
            r1 = r3
        L_0x013f:
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            r10.P0(r0)
            androidx.constraintlayout.core.widgets.d r10 = r9.f4012a
            r10.g1(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.h(boolean, int):boolean");
    }

    public void j() {
        this.f4013b = true;
    }

    public void k() {
        this.f4014c = true;
    }

    public void m() {
        boolean z3;
        e eVar;
        Iterator it = this.f4012a.f219L0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.f3910a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f3909Z;
                boolean z4 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i4 = constraintWidget.f3954w;
                int i5 = constraintWidget.f3956x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i4 == 1)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i5 == 1)) {
                    z4 = true;
                }
                e eVar2 = constraintWidget.f3918e.f3986e;
                boolean z5 = eVar2.f3978j;
                e eVar3 = constraintWidget.f3920f.f3986e;
                boolean z6 = eVar3.f3978j;
                if (z5 && z6) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    l(constraintWidget, dimensionBehaviour4, eVar2.f3975g, dimensionBehaviour4, eVar3.f3975g);
                    constraintWidget.f3910a = true;
                } else if (z5 && z4) {
                    l(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, eVar2.f3975g, dimensionBehaviour3, eVar3.f3975g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f3920f.f3986e.f4021m = constraintWidget.x();
                    } else {
                        constraintWidget.f3920f.f3986e.d(constraintWidget.x());
                        constraintWidget.f3910a = true;
                    }
                } else if (z6 && z3) {
                    l(constraintWidget, dimensionBehaviour3, eVar2.f3975g, ConstraintWidget.DimensionBehaviour.FIXED, eVar3.f3975g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f3918e.f3986e.f4021m = constraintWidget.W();
                    } else {
                        constraintWidget.f3918e.f3986e.d(constraintWidget.W());
                        constraintWidget.f3910a = true;
                    }
                }
                if (constraintWidget.f3910a && (eVar = constraintWidget.f3920f.f4036l) != null) {
                    eVar.d(constraintWidget.p());
                }
            }
        }
    }

    public void n(b.C0061b bVar) {
        this.f4018g = bVar;
    }
}
