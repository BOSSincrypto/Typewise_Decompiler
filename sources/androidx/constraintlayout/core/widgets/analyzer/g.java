package androidx.constraintlayout.core.widgets.analyzer;

import C.b;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;

public abstract class g {
    public static m a(ConstraintWidget constraintWidget, int i4, ArrayList arrayList, m mVar) {
        int i5;
        int s12;
        if (i4 == 0) {
            i5 = constraintWidget.f3891I0;
        } else {
            i5 = constraintWidget.f3893J0;
        }
        int i6 = 0;
        if (i5 != -1 && (mVar == null || i5 != mVar.f4040b)) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i7);
                if (mVar2.c() == i5) {
                    if (mVar != null) {
                        mVar.g(i4, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i7++;
                }
            }
        } else if (i5 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if ((constraintWidget instanceof b) && (s12 = ((b) constraintWidget).s1(i4)) != -1) {
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList.size()) {
                        break;
                    }
                    m mVar3 = (m) arrayList.get(i8);
                    if (mVar3.c() == s12) {
                        mVar = mVar3;
                        break;
                    }
                    i8++;
                }
            }
            if (mVar == null) {
                mVar = new m(i4);
            }
            arrayList.add(mVar);
        }
        if (mVar.a(constraintWidget)) {
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                ConstraintAnchor r12 = fVar.r1();
                if (fVar.s1() == 0) {
                    i6 = 1;
                }
                r12.c(i6, arrayList, mVar);
            }
            if (i4 == 0) {
                constraintWidget.f3891I0 = mVar.c();
                constraintWidget.f3898O.c(i4, arrayList, mVar);
                constraintWidget.f3900Q.c(i4, arrayList, mVar);
            } else {
                constraintWidget.f3893J0 = mVar.c();
                constraintWidget.f3899P.c(i4, arrayList, mVar);
                constraintWidget.f3902S.c(i4, arrayList, mVar);
                constraintWidget.f3901R.c(i4, arrayList, mVar);
            }
            constraintWidget.f3905V.c(i4, arrayList, mVar);
        }
        return mVar;
    }

    private static m b(ArrayList arrayList, int i4) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            m mVar = (m) arrayList.get(i5);
            if (i4 == mVar.f4040b) {
                return mVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0392 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(androidx.constraintlayout.core.widgets.d r16, androidx.constraintlayout.core.widgets.analyzer.b.C0061b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.r1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.A()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.T()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.A()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.T()
            boolean r6 = d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.e
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0113
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.A()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.T()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.A()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.T()
            boolean r4 = d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x0062
            androidx.constraintlayout.core.widgets.analyzer.b$a r4 = r0.f4104p1
            int r12 = androidx.constraintlayout.core.widgets.analyzer.b.a.f3997k
            r14 = r17
            androidx.constraintlayout.core.widgets.d.S1(r3, r13, r14, r4, r12)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r4 = r13 instanceof androidx.constraintlayout.core.widgets.f
            if (r4 == 0) goto L_0x008c
            r12 = r13
            androidx.constraintlayout.core.widgets.f r12 = (androidx.constraintlayout.core.widgets.f) r12
            int r15 = r12.s1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r12)
        L_0x007b:
            int r15 = r12.s1()
            r3 = 1
            if (r15 != r3) goto L_0x008c
            if (r6 != 0) goto L_0x0089
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0089:
            r6.add(r12)
        L_0x008c:
            boolean r3 = r13 instanceof C.b
            if (r3 == 0) goto L_0x00d0
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.a
            if (r3 == 0) goto L_0x00b9
            r3 = r13
            androidx.constraintlayout.core.widgets.a r3 = (androidx.constraintlayout.core.widgets.a) r3
            int r12 = r3.x1()
            if (r12 != 0) goto L_0x00a7
            if (r7 != 0) goto L_0x00a4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a4:
            r7.add(r3)
        L_0x00a7:
            int r12 = r3.x1()
            r15 = 1
            if (r12 != r15) goto L_0x00d0
            if (r9 != 0) goto L_0x00b5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b5:
            r9.add(r3)
            goto L_0x00d0
        L_0x00b9:
            r3 = r13
            C.b r3 = (C.b) r3
            if (r7 != 0) goto L_0x00c3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c3:
            r7.add(r3)
            if (r9 != 0) goto L_0x00cd
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00cd:
            r9.add(r3)
        L_0x00d0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f3867f
            if (r3 != 0) goto L_0x00ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f3900Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f3867f
            if (r3 != 0) goto L_0x00ec
            if (r4 != 0) goto L_0x00ec
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.a
            if (r3 != 0) goto L_0x00ec
            if (r10 != 0) goto L_0x00e9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00e9:
            r10.add(r13)
        L_0x00ec:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f3899P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f3867f
            if (r3 != 0) goto L_0x010e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f3901R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f3867f
            if (r3 != 0) goto L_0x010e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f3902S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f3867f
            if (r3 != 0) goto L_0x010e
            if (r4 != 0) goto L_0x010e
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.a
            if (r3 != 0) goto L_0x010e
            if (r11 != 0) goto L_0x010b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x010b:
            r11.add(r13)
        L_0x010e:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x003a
        L_0x0113:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0130
            java.util.Iterator r4 = r6.iterator()
        L_0x011e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.f) r5
            r6 = 0
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x011e
        L_0x0130:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x0151
            java.util.Iterator r4 = r7.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0151
            java.lang.Object r5 = r4.next()
            C.b r5 = (C.b) r5
            androidx.constraintlayout.core.widgets.analyzer.m r7 = a(r5, r6, r3, r12)
            r5.r1(r3, r6, r7)
            r7.b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0138
        L_0x0151:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0179
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0165:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0179
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0165
        L_0x0179:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01a1
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x018d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a1
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x018d
        L_0x01a1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01c9
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c9
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01b5
        L_0x01c9:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e1
            java.util.Iterator r4 = r10.iterator()
        L_0x01d1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e1
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            a(r5, r6, r3, r7)
            goto L_0x01d1
        L_0x01e1:
            if (r8 == 0) goto L_0x01f8
            java.util.Iterator r4 = r8.iterator()
        L_0x01e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f8
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.f) r5
            r6 = 1
            a(r5, r6, r3, r7)
            goto L_0x01e7
        L_0x01f8:
            r6 = 1
            if (r9 == 0) goto L_0x0218
            java.util.Iterator r4 = r9.iterator()
        L_0x01ff:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0218
            java.lang.Object r5 = r4.next()
            C.b r5 = (C.b) r5
            androidx.constraintlayout.core.widgets.analyzer.m r8 = a(r5, r6, r3, r7)
            r5.r1(r3, r6, r8)
            r8.b(r3)
            r6 = 1
            r7 = 0
            goto L_0x01ff
        L_0x0218:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0240
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x022c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0240
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x022c
        L_0x0240:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0268
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0254:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0268
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x0254
        L_0x0268:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0290
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x027c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0290
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x027c
        L_0x0290:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x02b8
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b8
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f3865d
            r6 = 1
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x02a4
        L_0x02b8:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02d0
            java.util.Iterator r4 = r11.iterator()
        L_0x02c0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d0
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            a(r5, r6, r3, r12)
            goto L_0x02c0
        L_0x02d0:
            r4 = 0
        L_0x02d1:
            if (r4 >= r2) goto L_0x02fd
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5.s0()
            if (r6 == 0) goto L_0x02fa
            int r6 = r5.f3891I0
            androidx.constraintlayout.core.widgets.analyzer.m r6 = b(r3, r6)
            int r5 = r5.f3893J0
            androidx.constraintlayout.core.widgets.analyzer.m r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02fa
            if (r5 == 0) goto L_0x02fa
            r7 = 0
            r6.g(r7, r5)
            r7 = 2
            r5.i(r7)
            r3.remove(r6)
        L_0x02fa:
            int r4 = r4 + 1
            goto L_0x02d1
        L_0x02fd:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0306
            r1 = 0
            return r1
        L_0x0306:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.A()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0348
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0314:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0339
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.m r4 = (androidx.constraintlayout.core.widgets.analyzer.m) r4
            int r5 = r4.d()
            r7 = 1
            if (r5 != r7) goto L_0x0328
            goto L_0x0314
        L_0x0328:
            r5 = 0
            r4.h(r5)
            androidx.constraintlayout.core.d r7 = r16.K1()
            int r7 = r4.f(r7, r5)
            if (r7 <= r6) goto L_0x0314
            r2 = r4
            r6 = r7
            goto L_0x0314
        L_0x0339:
            if (r2 == 0) goto L_0x0348
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.P0(r1)
            r0.k1(r6)
            r1 = 1
            r2.h(r1)
            goto L_0x0349
        L_0x0348:
            r2 = r12
        L_0x0349:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.T()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L_0x038d
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0357:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037c
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.m r4 = (androidx.constraintlayout.core.widgets.analyzer.m) r4
            int r5 = r4.d()
            if (r5 != 0) goto L_0x036a
            goto L_0x0357
        L_0x036a:
            r5 = 0
            r4.h(r5)
            androidx.constraintlayout.core.d r7 = r16.K1()
            r8 = 1
            int r7 = r4.f(r7, r8)
            if (r7 <= r6) goto L_0x0357
            r3 = r4
            r6 = r7
            goto L_0x0357
        L_0x037c:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.g1(r1)
            r0.L0(r6)
            r3.h(r8)
            r4 = r3
            goto L_0x0390
        L_0x038d:
            r5 = 0
            r8 = 1
        L_0x038f:
            r4 = r12
        L_0x0390:
            if (r2 != 0) goto L_0x0397
            if (r4 == 0) goto L_0x0395
            goto L_0x0397
        L_0x0395:
            r3 = r5
            goto L_0x0398
        L_0x0397:
            r3 = r8
        L_0x0398:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.g.c(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.analyzer.b$b):boolean");
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z3;
        boolean z4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4) {
            return true;
        }
        return false;
    }
}
