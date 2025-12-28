package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    ArrayList f4010k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private int f4011l;

    public c(ConstraintWidget constraintWidget, int i4) {
        super(constraintWidget);
        this.f3987f = i4;
        q();
    }

    private void q() {
        ConstraintWidget constraintWidget;
        int i4;
        ConstraintWidget constraintWidget2 = this.f3983b;
        ConstraintWidget L3 = constraintWidget2.L(this.f3987f);
        while (true) {
            ConstraintWidget constraintWidget3 = L3;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            L3 = constraintWidget2.L(this.f3987f);
        }
        this.f3983b = constraintWidget;
        this.f4010k.add(constraintWidget.N(this.f3987f));
        ConstraintWidget J3 = constraintWidget.J(this.f3987f);
        while (J3 != null) {
            this.f4010k.add(J3.N(this.f3987f));
            J3 = J3.J(this.f3987f);
        }
        Iterator it = this.f4010k.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            int i5 = this.f3987f;
            if (i5 == 0) {
                widgetRun.f3983b.f3914c = this;
            } else if (i5 == 1) {
                widgetRun.f3983b.f3916d = this;
            }
        }
        if (this.f3987f == 0 && ((d) this.f3983b.K()).P1() && this.f4010k.size() > 1) {
            ArrayList arrayList = this.f4010k;
            this.f3983b = ((WidgetRun) arrayList.get(arrayList.size() - 1)).f3983b;
        }
        if (this.f3987f == 0) {
            i4 = this.f3983b.z();
        } else {
            i4 = this.f3983b.S();
        }
        this.f4011l = i4;
    }

    private ConstraintWidget r() {
        for (int i4 = 0; i4 < this.f4010k.size(); i4++) {
            WidgetRun widgetRun = (WidgetRun) this.f4010k.get(i4);
            if (widgetRun.f3983b.V() != 8) {
                return widgetRun.f3983b;
            }
        }
        return null;
    }

    private ConstraintWidget s() {
        for (int size = this.f4010k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = (WidgetRun) this.f4010k.get(size);
            if (widgetRun.f3983b.V() != 8) {
                return widgetRun.f3983b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(D.a r27) {
        /*
            r26 = this;
            r0 = r26
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f3989h
            boolean r1 = r1.f3978j
            if (r1 == 0) goto L_0x0425
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f3990i
            boolean r1 = r1.f3978j
            if (r1 != 0) goto L_0x0010
            goto L_0x0425
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f3983b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.K()
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.d
            if (r2 == 0) goto L_0x0021
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.d) r1
            boolean r1 = r1.P1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f3990i
            int r2 = r2.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f3989h
            int r4 = r4.f3975g
            int r2 = r2 - r4
            java.util.ArrayList r4 = r0.f4010k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList r8 = r0.f4010k
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.f3983b
            int r8 = r8.V()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList r10 = r0.f4010k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f3983b
            int r10 = r10.V()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList r3 = r0.f4010k
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f3983b
            int r11 = r11.V()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r3.f3989h
            int r11 = r11.f3974f
            int r14 = r14 + r11
        L_0x008e:
            androidx.constraintlayout.core.widgets.analyzer.e r11 = r3.f3986e
            int r7 = r11.f3975g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r3.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f3987f
            if (r11 != 0) goto L_0x00ac
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r3.f3983b
            androidx.constraintlayout.core.widgets.analyzer.j r12 = r12.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r12 = r12.f3986e
            boolean r12 = r12.f3978j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r11 = r11.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r11 = r11.f3986e
            boolean r11 = r11.f3978j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f3982a
            if (r7 != r12) goto L_0x00cc
            if (r9 != 0) goto L_0x00cc
            int r7 = r11.f4021m
            int r15 = r15 + 1
        L_0x00ca:
            r10 = 1
            goto L_0x00d5
        L_0x00cc:
            boolean r7 = r11.f3978j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
            goto L_0x00ca
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.f3983b
            float[] r7 = r7.f3881D0
            int r10 = r0.f3987f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f3990i
            int r3 = r3.f3974f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f3989h
            int r7 = r7.f3975g
            if (r1 == 0) goto L_0x0118
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f3990i
            int r7 = r7.f3975g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0223
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d7
            java.util.ArrayList r9 = r0.f4010k
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.f3983b
            int r11 = r11.V()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x015d
        L_0x0153:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
            goto L_0x01c5
        L_0x015d:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x0153
            androidx.constraintlayout.core.widgets.analyzer.e r11 = r9.f3986e
            boolean r14 = r11.f3978j
            if (r14 != 0) goto L_0x0153
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.f3983b
            float[] r14 = r14.f3881D0
            r21 = r7
            int r7 = r0.f3987f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0184
        L_0x0180:
            r21 = r7
            r7 = r19
        L_0x0184:
            int r14 = r0.f3987f
            if (r14 != 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r9.f3983b
            r22 = r10
            int r10 = r14.f3874A
            int r14 = r14.f3960z
            r23 = r1
            goto L_0x01a2
        L_0x0193:
            r22 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.f3983b
            int r14 = r10.f3880D
            int r10 = r10.f3878C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x01a2:
            int r1 = r9.f3982a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01b0
            int r1 = r11.f4021m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01b1
        L_0x01b0:
            r1 = r7
        L_0x01b1:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01bb
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01bb:
            if (r1 == r7) goto L_0x01c0
            int r13 = r13 + 1
            r7 = r1
        L_0x01c0:
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r9.f3986e
            r1.d(r7)
        L_0x01c5:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d7:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0214
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L_0x01e4:
            if (r1 >= r4) goto L_0x0216
            java.util.ArrayList r3 = r0.f4010k
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.f3983b
            int r7 = r7.V()
            r9 = 8
            if (r7 != r9) goto L_0x01f9
            goto L_0x0211
        L_0x01f9:
            if (r1 <= 0) goto L_0x0202
            if (r1 < r5) goto L_0x0202
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r3.f3989h
            int r7 = r7.f3974f
            int r14 = r14 + r7
        L_0x0202:
            androidx.constraintlayout.core.widgets.analyzer.e r7 = r3.f3986e
            int r7 = r7.f3975g
            int r14 = r14 + r7
            if (r1 >= r8) goto L_0x0211
            if (r1 >= r6) goto L_0x0211
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f3990i
            int r3 = r3.f3974f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x0211:
            int r1 = r1 + 1
            goto L_0x01e4
        L_0x0214:
            r14 = r20
        L_0x0216:
            int r1 = r0.f4011l
            r3 = 2
            if (r1 != r3) goto L_0x0221
            if (r13 != 0) goto L_0x0221
            r1 = 0
            r0.f4011l = r1
            goto L_0x022d
        L_0x0221:
            r1 = 0
            goto L_0x022d
        L_0x0223:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x022d:
            if (r14 <= r2) goto L_0x0231
            r0.f4011l = r3
        L_0x0231:
            if (r24 <= 0) goto L_0x0239
            if (r15 != 0) goto L_0x0239
            if (r5 != r6) goto L_0x0239
            r0.f4011l = r3
        L_0x0239:
            int r3 = r0.f4011l
            r7 = 1
            if (r3 != r7) goto L_0x02de
            r9 = r24
            if (r9 <= r7) goto L_0x0247
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x024e
        L_0x0247:
            if (r9 != r7) goto L_0x024d
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x024e
        L_0x024d:
            r2 = r1
        L_0x024e:
            if (r15 <= 0) goto L_0x0251
            r2 = r1
        L_0x0251:
            r3 = r1
            r7 = r21
        L_0x0254:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x025d
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x025e
        L_0x025d:
            r1 = r3
        L_0x025e:
            java.util.ArrayList r9 = r0.f4010k
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.f3983b
            int r9 = r9.V()
            r10 = 8
            if (r9 != r10) goto L_0x027b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            r9.d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            r1.d(r7)
            goto L_0x02da
        L_0x027b:
            if (r3 <= 0) goto L_0x0282
            if (r23 == 0) goto L_0x0281
            int r7 = r7 - r2
            goto L_0x0282
        L_0x0281:
            int r7 = r7 + r2
        L_0x0282:
            if (r3 <= 0) goto L_0x0293
            if (r3 < r5) goto L_0x0293
            if (r23 == 0) goto L_0x028e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            int r9 = r9.f3974f
            int r7 = r7 - r9
            goto L_0x0293
        L_0x028e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            int r9 = r9.f3974f
            int r7 = r7 + r9
        L_0x0293:
            if (r23 == 0) goto L_0x029b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3990i
            r9.d(r7)
            goto L_0x02a0
        L_0x029b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            r9.d(r7)
        L_0x02a0:
            androidx.constraintlayout.core.widgets.analyzer.e r9 = r1.f3986e
            int r10 = r9.f3975g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b1
            int r11 = r1.f3982a
            r12 = 1
            if (r11 != r12) goto L_0x02b1
            int r10 = r9.f4021m
        L_0x02b1:
            if (r23 == 0) goto L_0x02b5
            int r7 = r7 - r10
            goto L_0x02b6
        L_0x02b5:
            int r7 = r7 + r10
        L_0x02b6:
            if (r23 == 0) goto L_0x02bf
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            r9.d(r7)
        L_0x02bd:
            r9 = 1
            goto L_0x02c5
        L_0x02bf:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3990i
            r9.d(r7)
            goto L_0x02bd
        L_0x02c5:
            r1.f3988g = r9
            if (r3 >= r8) goto L_0x02da
            if (r3 >= r6) goto L_0x02da
            if (r23 == 0) goto L_0x02d4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            int r1 = r1.f3974f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02da
        L_0x02d4:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            int r1 = r1.f3974f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02da:
            int r3 = r3 + 1
            goto L_0x0254
        L_0x02de:
            r9 = r24
            if (r3 != 0) goto L_0x0375
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ea
            r2 = r1
        L_0x02ea:
            r3 = r1
            r7 = r21
        L_0x02ed:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x02f6
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02f7
        L_0x02f6:
            r1 = r3
        L_0x02f7:
            java.util.ArrayList r9 = r0.f4010k
            java.lang.Object r1 = r9.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r1.f3983b
            int r9 = r9.V()
            r10 = 8
            if (r9 != r10) goto L_0x0314
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            r9.d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            r1.d(r7)
            goto L_0x0371
        L_0x0314:
            if (r23 == 0) goto L_0x0318
            int r7 = r7 - r2
            goto L_0x0319
        L_0x0318:
            int r7 = r7 + r2
        L_0x0319:
            if (r3 <= 0) goto L_0x032a
            if (r3 < r5) goto L_0x032a
            if (r23 == 0) goto L_0x0325
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            int r9 = r9.f3974f
            int r7 = r7 - r9
            goto L_0x032a
        L_0x0325:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            int r9 = r9.f3974f
            int r7 = r7 + r9
        L_0x032a:
            if (r23 == 0) goto L_0x0332
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3990i
            r9.d(r7)
            goto L_0x0337
        L_0x0332:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            r9.d(r7)
        L_0x0337:
            androidx.constraintlayout.core.widgets.analyzer.e r9 = r1.f3986e
            int r10 = r9.f3975g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034c
            int r11 = r1.f3982a
            r12 = 1
            if (r11 != r12) goto L_0x034c
            int r9 = r9.f4021m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034c:
            if (r23 == 0) goto L_0x0350
            int r7 = r7 - r10
            goto L_0x0351
        L_0x0350:
            int r7 = r7 + r10
        L_0x0351:
            if (r23 == 0) goto L_0x0359
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3989h
            r9.d(r7)
            goto L_0x035e
        L_0x0359:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r1.f3990i
            r9.d(r7)
        L_0x035e:
            if (r3 >= r8) goto L_0x0371
            if (r3 >= r6) goto L_0x0371
            if (r23 == 0) goto L_0x036b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            int r1 = r1.f3974f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0371
        L_0x036b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            int r1 = r1.f3974f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0371:
            int r3 = r3 + 1
            goto L_0x02ed
        L_0x0375:
            r7 = 2
            if (r3 != r7) goto L_0x0425
            int r3 = r0.f3987f
            if (r3 != 0) goto L_0x0383
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3983b
            float r3 = r3.y()
            goto L_0x0389
        L_0x0383:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3983b
            float r3 = r3.R()
        L_0x0389:
            if (r23 == 0) goto L_0x038f
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x038f:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039a
            if (r15 <= 0) goto L_0x039b
        L_0x039a:
            r2 = r1
        L_0x039b:
            if (r23 == 0) goto L_0x03a0
            int r7 = r21 - r2
            goto L_0x03a2
        L_0x03a0:
            int r7 = r21 + r2
        L_0x03a2:
            r3 = r1
        L_0x03a3:
            if (r3 >= r4) goto L_0x0425
            if (r23 == 0) goto L_0x03ac
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03ad
        L_0x03ac:
            r1 = r3
        L_0x03ad:
            java.util.ArrayList r2 = r0.f4010k
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.f3983b
            int r2 = r2.V()
            r9 = 8
            if (r2 != r9) goto L_0x03cb
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3989h
            r2.d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            r1.d(r7)
            r12 = 1
            goto L_0x0421
        L_0x03cb:
            if (r3 <= 0) goto L_0x03dc
            if (r3 < r5) goto L_0x03dc
            if (r23 == 0) goto L_0x03d7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3989h
            int r2 = r2.f3974f
            int r7 = r7 - r2
            goto L_0x03dc
        L_0x03d7:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3989h
            int r2 = r2.f3974f
            int r7 = r7 + r2
        L_0x03dc:
            if (r23 == 0) goto L_0x03e4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3990i
            r2.d(r7)
            goto L_0x03e9
        L_0x03e4:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3989h
            r2.d(r7)
        L_0x03e9:
            androidx.constraintlayout.core.widgets.analyzer.e r2 = r1.f3986e
            int r10 = r2.f3975g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r1.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03fb
            int r11 = r1.f3982a
            r12 = 1
            if (r11 != r12) goto L_0x03fc
            int r10 = r2.f4021m
            goto L_0x03fc
        L_0x03fb:
            r12 = 1
        L_0x03fc:
            if (r23 == 0) goto L_0x0400
            int r7 = r7 - r10
            goto L_0x0401
        L_0x0400:
            int r7 = r7 + r10
        L_0x0401:
            if (r23 == 0) goto L_0x0409
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3989h
            r2.d(r7)
            goto L_0x040e
        L_0x0409:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.f3990i
            r2.d(r7)
        L_0x040e:
            if (r3 >= r8) goto L_0x0421
            if (r3 >= r6) goto L_0x0421
            if (r23 == 0) goto L_0x041b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            int r1 = r1.f3974f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0421
        L_0x041b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f3990i
            int r1 = r1.f3974f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0421:
            int r3 = r3 + 1
            goto L_0x03a3
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(D.a):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Iterator it = this.f4010k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).d();
        }
        int size = this.f4010k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = ((WidgetRun) this.f4010k.get(0)).f3983b;
            ConstraintWidget constraintWidget2 = ((WidgetRun) this.f4010k.get(size - 1)).f3983b;
            if (this.f3987f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.f3898O;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.f3900Q;
                DependencyNode i4 = i(constraintAnchor, 0);
                int f4 = constraintAnchor.f();
                ConstraintWidget r4 = r();
                if (r4 != null) {
                    f4 = r4.f3898O.f();
                }
                if (i4 != null) {
                    b(this.f3989h, i4, f4);
                }
                DependencyNode i5 = i(constraintAnchor2, 0);
                int f5 = constraintAnchor2.f();
                ConstraintWidget s4 = s();
                if (s4 != null) {
                    f5 = s4.f3900Q.f();
                }
                if (i5 != null) {
                    b(this.f3990i, i5, -f5);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.f3899P;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.f3901R;
                DependencyNode i6 = i(constraintAnchor3, 1);
                int f6 = constraintAnchor3.f();
                ConstraintWidget r5 = r();
                if (r5 != null) {
                    f6 = r5.f3899P.f();
                }
                if (i6 != null) {
                    b(this.f3989h, i6, f6);
                }
                DependencyNode i7 = i(constraintAnchor4, 1);
                int f7 = constraintAnchor4.f();
                ConstraintWidget s5 = s();
                if (s5 != null) {
                    f7 = s5.f3901R.f();
                }
                if (i7 != null) {
                    b(this.f3990i, i7, -f7);
                }
            }
            this.f3989h.f3969a = this;
            this.f3990i.f3969a = this;
        }
    }

    public void e() {
        for (int i4 = 0; i4 < this.f4010k.size(); i4++) {
            ((WidgetRun) this.f4010k.get(i4)).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f3984c = null;
        Iterator it = this.f4010k.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).f();
        }
    }

    public long j() {
        int size = this.f4010k.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            WidgetRun widgetRun = (WidgetRun) this.f4010k.get(i4);
            j4 = j4 + ((long) widgetRun.f3989h.f3974f) + widgetRun.j() + ((long) widgetRun.f3990i.f3974f);
        }
        return j4;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.f4010k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((WidgetRun) this.f4010k.get(i4)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f3987f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.f4010k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((WidgetRun) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
