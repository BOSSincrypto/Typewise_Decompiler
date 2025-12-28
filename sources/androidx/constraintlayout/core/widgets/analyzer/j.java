package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

public class j extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f4025k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4026a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4026a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.j.a.<clinit>():void");
        }
    }

    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f3989h.f3973e = DependencyNode.Type.LEFT;
        this.f3990i.f3973e = DependencyNode.Type.RIGHT;
        this.f3987f = 0;
    }

    private void q(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 == -1) {
            int i11 = (int) ((((float) i10) * f4) + 0.5f);
            int i12 = (int) ((((float) i9) / f4) + 0.5f);
            if (i11 <= i9) {
                iArr[0] = i11;
                iArr[1] = i10;
            } else if (i12 <= i10) {
                iArr[0] = i9;
                iArr[1] = i12;
            }
        } else if (i8 == 0) {
            iArr[0] = (int) ((((float) i10) * f4) + 0.5f);
            iArr[1] = i10;
        } else if (i8 == 1) {
            iArr[0] = i9;
            iArr[1] = (int) ((((float) i9) * f4) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ba, code lost:
        if (r14 != 1) goto L_0x031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(D.a r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.j.a.f4026a
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.f3991j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3900Q
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            boolean r0 = r0.f3978j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            int r3 = r0.f3954w
            if (r3 == r1) goto L_0x0302
            if (r3 == r2) goto L_0x0046
            goto L_0x031f
        L_0x0046:
            int r1 = r0.f3956x
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.w()
            if (r0 == r3) goto L_0x007a
            if (r0 == 0) goto L_0x006b
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0088
        L_0x005a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r1.f3986e
            int r1 = r1.f3975g
            float r1 = (float) r1
            float r0 = r0.v()
        L_0x0067:
            float r1 = r1 * r0
        L_0x0068:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x0088
        L_0x006b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r1.f3986e
            int r1 = r1.f3975g
            float r1 = (float) r1
            float r0 = r0.v()
            float r1 = r1 / r0
            goto L_0x0068
        L_0x007a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r1.f3986e
            int r1 = r1.f3975g
            float r1 = (float) r1
            float r0 = r0.v()
            goto L_0x0067
        L_0x0088:
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r8.f3986e
            r1.d(r0)
            goto L_0x031f
        L_0x008f:
            androidx.constraintlayout.core.widgets.analyzer.l r1 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r1.f3989h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r1.f3990i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f3867f
            if (r1 == 0) goto L_0x009d
            r1 = r9
            goto L_0x009e
        L_0x009d:
            r1 = r10
        L_0x009e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f3899P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3867f
            if (r2 == 0) goto L_0x00a6
            r2 = r9
            goto L_0x00a7
        L_0x00a6:
            r2 = r10
        L_0x00a7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.f3900Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f3867f
            if (r4 == 0) goto L_0x00af
            r4 = r9
            goto L_0x00b0
        L_0x00af:
            r4 = r10
        L_0x00b0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.f3901R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f3867f
            if (r5 == 0) goto L_0x00b8
            r5 = r9
            goto L_0x00b9
        L_0x00b8:
            r5 = r10
        L_0x00b9:
            int r14 = r0.w()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            float r15 = r0.v()
            boolean r0 = r12.f3978j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f3978j
            if (r0 == 0) goto L_0x012e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            boolean r1 = r0.f3971c
            if (r1 == 0) goto L_0x012d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            boolean r1 = r1.f3971c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3989h
            int r1 = r1.f3974f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            int r1 = r1.f3974f
            int r3 = r0 - r1
            int r0 = r12.f3975g
            int r1 = r12.f3974f
            int r4 = r0 + r1
            int r0 = r13.f3975g
            int r1 = r13.f3974f
            int r5 = r0 - r1
            int[] r1 = f4025k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            int[] r1 = f4025k
            r1 = r1[r10]
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            int[] r1 = f4025k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            boolean r1 = r0.f3978j
            if (r1 == 0) goto L_0x018b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            boolean r2 = r1.f3978j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f3971c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f3971c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f3975g
            int r0 = r0.f3974f
            int r2 = r2 + r0
            int r0 = r1.f3975g
            int r1 = r1.f3974f
            int r3 = r0 - r1
            java.util.List r0 = r12.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            int r1 = r12.f3974f
            int r4 = r0 + r1
            java.util.List r0 = r13.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            int r1 = r13.f3974f
            int r5 = r0 - r1
            int[] r1 = f4025k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            int[] r1 = f4025k
            r1 = r1[r10]
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            int[] r1 = f4025k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            boolean r1 = r0.f3971c
            if (r1 == 0) goto L_0x01ff
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            boolean r1 = r1.f3971c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f3971c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f3971c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3989h
            int r1 = r1.f3974f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            int r1 = r1.f3974f
            int r3 = r0 - r1
            java.util.List r0 = r12.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            int r1 = r12.f3974f
            int r4 = r0 + r1
            java.util.List r0 = r13.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f3975g
            int r1 = r13.f3974f
            int r5 = r0 - r1
            int[] r1 = f4025k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            int[] r1 = f4025k
            r1 = r1[r10]
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            int[] r1 = f4025k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x031f
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x0289
            if (r4 == 0) goto L_0x0289
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            boolean r0 = r0.f3971c
            if (r0 == 0) goto L_0x0288
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            boolean r0 = r0.f3971c
            if (r0 != 0) goto L_0x0212
            goto L_0x0288
        L_0x0212:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            float r0 = r0.v()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3989h
            java.util.List r1 = r1.f3980l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f3989h
            int r2 = r2.f3974f
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f3990i
            java.util.List r2 = r2.f3980l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f3990i
            int r4 = r4.f3974f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0265
            if (r14 == 0) goto L_0x0265
            if (r14 == r9) goto L_0x0242
            goto L_0x031f
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0255
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0255:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            r0.d(r3)
            goto L_0x031f
        L_0x0265:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0278
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0278:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            r0.d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            r0.d(r3)
            goto L_0x031f
        L_0x0288:
            return
        L_0x0289:
            if (r2 == 0) goto L_0x031f
            if (r5 == 0) goto L_0x031f
            boolean r0 = r12.f3971c
            if (r0 == 0) goto L_0x0301
            boolean r0 = r13.f3971c
            if (r0 != 0) goto L_0x0296
            goto L_0x0301
        L_0x0296:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            float r0 = r0.v()
            java.util.List r1 = r12.f3980l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f3975g
            int r2 = r12.f3974f
            int r1 = r1 + r2
            java.util.List r2 = r13.f3980l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f3975g
            int r4 = r13.f3974f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02df
            if (r14 == 0) goto L_0x02bd
            if (r14 == r9) goto L_0x02df
            goto L_0x031f
        L_0x02bd:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d0
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d0:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            r0.d(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            r0.d(r1)
            goto L_0x031f
        L_0x02df:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f2
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f2:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            r0.d(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r0.f3920f
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            r0.d(r1)
            goto L_0x031f
        L_0x0301:
            return
        L_0x0302:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.K()
            if (r0 == 0) goto L_0x031f
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r0.f3918e
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r0.f3986e
            boolean r1 = r0.f3978j
            if (r1 == 0) goto L_0x031f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f3983b
            float r1 = r1.f3876B
            int r0 = r0.f3975g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r8.f3986e
            r1.d(r0)
        L_0x031f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            boolean r1 = r0.f3971c
            if (r1 == 0) goto L_0x043f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            boolean r2 = r1.f3971c
            if (r2 != 0) goto L_0x032d
            goto L_0x043f
        L_0x032d:
            boolean r0 = r0.f3978j
            if (r0 == 0) goto L_0x033c
            boolean r0 = r1.f3978j
            if (r0 == 0) goto L_0x033c
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            boolean r0 = r0.f3978j
            if (r0 == 0) goto L_0x033c
            return
        L_0x033c:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            boolean r0 = r0.f3978j
            if (r0 != 0) goto L_0x0386
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0386
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f3983b
            int r1 = r0.f3954w
            if (r1 != 0) goto L_0x0386
            boolean r0 = r0.i0()
            if (r0 != 0) goto L_0x0386
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            java.util.List r1 = r1.f3980l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f3989h
            int r3 = r2.f3974f
            int r0 = r0 + r3
            int r1 = r1.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f3990i
            int r3 = r3.f3974f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            r0.d(r1)
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            r0.d(r3)
            return
        L_0x0386:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            boolean r0 = r0.f3978j
            if (r0 != 0) goto L_0x03ea
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f3985d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ea
            int r0 = r8.f3982a
            if (r0 != r9) goto L_0x03ea
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            java.util.List r0 = r0.f3980l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            java.util.List r0 = r0.f3980l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            java.util.List r1 = r1.f3980l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f3989h
            int r2 = r2.f3974f
            int r0 = r0 + r2
            int r1 = r1.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f3990i
            int r2 = r2.f3974f
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            int r0 = r0.f4021m
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f3983b
            int r2 = r1.f3874A
            int r1 = r1.f3960z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e5
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e5:
            androidx.constraintlayout.core.widgets.analyzer.e r1 = r8.f3986e
            r1.d(r0)
        L_0x03ea:
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            boolean r0 = r0.f3978j
            if (r0 != 0) goto L_0x03f1
            return
        L_0x03f1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            java.util.List r0 = r0.f3980l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3990i
            java.util.List r1 = r1.f3980l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f3989h
            int r3 = r3.f3974f
            int r2 = r2 + r3
            int r3 = r1.f3975g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f3990i
            int r4 = r4.f3974f
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.f3983b
            float r4 = r4.y()
            if (r0 != r1) goto L_0x0420
            int r2 = r0.f3975g
            int r3 = r1.f3975g
            r4 = r11
        L_0x0420:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.e r0 = r8.f3986e
            int r0 = r0.f3975g
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f3989h
            int r1 = r1.f3975g
            androidx.constraintlayout.core.widgets.analyzer.e r2 = r8.f3986e
            int r2 = r2.f3975g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x043f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.j.a(D.a):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ConstraintWidget K3;
        ConstraintWidget K4;
        ConstraintWidget constraintWidget = this.f3983b;
        if (constraintWidget.f3910a) {
            this.f3986e.d(constraintWidget.W());
        }
        if (!this.f3986e.f3978j) {
            ConstraintWidget.DimensionBehaviour A3 = this.f3983b.A();
            this.f3985d = A3;
            if (A3 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (A3 == dimensionBehaviour && (K4 = this.f3983b.K()) != null && (K4.A() == ConstraintWidget.DimensionBehaviour.FIXED || K4.A() == dimensionBehaviour)) {
                    int W3 = (K4.W() - this.f3983b.f3898O.f()) - this.f3983b.f3900Q.f();
                    b(this.f3989h, K4.f3918e.f3989h, this.f3983b.f3898O.f());
                    b(this.f3990i, K4.f3918e.f3990i, -this.f3983b.f3900Q.f());
                    this.f3986e.d(W3);
                    return;
                } else if (this.f3985d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f3986e.d(this.f3983b.W());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f3985d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (K3 = this.f3983b.K()) != null && (K3.A() == ConstraintWidget.DimensionBehaviour.FIXED || K3.A() == dimensionBehaviour3)) {
                b(this.f3989h, K3.f3918e.f3989h, this.f3983b.f3898O.f());
                b(this.f3990i, K3.f3918e.f3990i, -this.f3983b.f3900Q.f());
                return;
            }
        }
        e eVar = this.f3986e;
        if (eVar.f3978j) {
            ConstraintWidget constraintWidget2 = this.f3983b;
            if (constraintWidget2.f3910a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f3906W;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f3867f;
                if (constraintAnchor2 == null || constraintAnchorArr[1].f3867f == null) {
                    if (constraintAnchor2 != null) {
                        DependencyNode h4 = h(constraintAnchor);
                        if (h4 != null) {
                            b(this.f3989h, h4, this.f3983b.f3906W[0].f());
                            b(this.f3990i, this.f3989h, this.f3986e.f3975g);
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                    if (constraintAnchor3.f3867f != null) {
                        DependencyNode h5 = h(constraintAnchor3);
                        if (h5 != null) {
                            b(this.f3990i, h5, -this.f3983b.f3906W[1].f());
                            b(this.f3989h, this.f3990i, -this.f3986e.f3975g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof C.a) && constraintWidget2.K() != null && this.f3983b.o(ConstraintAnchor.Type.CENTER).f3867f == null) {
                        b(this.f3989h, this.f3983b.K().f3918e.f3989h, this.f3983b.X());
                        b(this.f3990i, this.f3989h, this.f3986e.f3975g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget2.i0()) {
                    this.f3989h.f3974f = this.f3983b.f3906W[0].f();
                    this.f3990i.f3974f = -this.f3983b.f3906W[1].f();
                    return;
                } else {
                    DependencyNode h6 = h(this.f3983b.f3906W[0]);
                    if (h6 != null) {
                        b(this.f3989h, h6, this.f3983b.f3906W[0].f());
                    }
                    DependencyNode h7 = h(this.f3983b.f3906W[1]);
                    if (h7 != null) {
                        b(this.f3990i, h7, -this.f3983b.f3906W[1].f());
                    }
                    this.f3989h.f3970b = true;
                    this.f3990i.f3970b = true;
                    return;
                }
            }
        }
        if (this.f3985d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f3983b;
            int i4 = constraintWidget3.f3954w;
            if (i4 == 2) {
                ConstraintWidget K5 = constraintWidget3.K();
                if (K5 != null) {
                    e eVar2 = K5.f3920f.f3986e;
                    this.f3986e.f3980l.add(eVar2);
                    eVar2.f3979k.add(this.f3986e);
                    e eVar3 = this.f3986e;
                    eVar3.f3970b = true;
                    eVar3.f3979k.add(this.f3989h);
                    this.f3986e.f3979k.add(this.f3990i);
                }
            } else if (i4 == 3) {
                if (constraintWidget3.f3956x == 3) {
                    this.f3989h.f3969a = this;
                    this.f3990i.f3969a = this;
                    l lVar = constraintWidget3.f3920f;
                    lVar.f3989h.f3969a = this;
                    lVar.f3990i.f3969a = this;
                    eVar.f3969a = this;
                    if (constraintWidget3.k0()) {
                        this.f3986e.f3980l.add(this.f3983b.f3920f.f3986e);
                        this.f3983b.f3920f.f3986e.f3979k.add(this.f3986e);
                        l lVar2 = this.f3983b.f3920f;
                        lVar2.f3986e.f3969a = this;
                        this.f3986e.f3980l.add(lVar2.f3989h);
                        this.f3986e.f3980l.add(this.f3983b.f3920f.f3990i);
                        this.f3983b.f3920f.f3989h.f3979k.add(this.f3986e);
                        this.f3983b.f3920f.f3990i.f3979k.add(this.f3986e);
                    } else if (this.f3983b.i0()) {
                        this.f3983b.f3920f.f3986e.f3980l.add(this.f3986e);
                        this.f3986e.f3979k.add(this.f3983b.f3920f.f3986e);
                    } else {
                        this.f3983b.f3920f.f3986e.f3980l.add(this.f3986e);
                    }
                } else {
                    e eVar4 = constraintWidget3.f3920f.f3986e;
                    eVar.f3980l.add(eVar4);
                    eVar4.f3979k.add(this.f3986e);
                    this.f3983b.f3920f.f3989h.f3979k.add(this.f3986e);
                    this.f3983b.f3920f.f3990i.f3979k.add(this.f3986e);
                    e eVar5 = this.f3986e;
                    eVar5.f3970b = true;
                    eVar5.f3979k.add(this.f3989h);
                    this.f3986e.f3979k.add(this.f3990i);
                    this.f3989h.f3980l.add(this.f3986e);
                    this.f3990i.f3980l.add(this.f3986e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f3983b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f3906W;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f3867f;
        if (constraintAnchor5 == null || constraintAnchorArr2[1].f3867f == null) {
            if (constraintAnchor5 != null) {
                DependencyNode h8 = h(constraintAnchor4);
                if (h8 != null) {
                    b(this.f3989h, h8, this.f3983b.f3906W[0].f());
                    c(this.f3990i, this.f3989h, 1, this.f3986e);
                    return;
                }
                return;
            }
            ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
            if (constraintAnchor6.f3867f != null) {
                DependencyNode h9 = h(constraintAnchor6);
                if (h9 != null) {
                    b(this.f3990i, h9, -this.f3983b.f3906W[1].f());
                    c(this.f3989h, this.f3990i, -1, this.f3986e);
                }
            } else if (!(constraintWidget4 instanceof C.a) && constraintWidget4.K() != null) {
                b(this.f3989h, this.f3983b.K().f3918e.f3989h, this.f3983b.X());
                c(this.f3990i, this.f3989h, 1, this.f3986e);
            }
        } else if (constraintWidget4.i0()) {
            this.f3989h.f3974f = this.f3983b.f3906W[0].f();
            this.f3990i.f3974f = -this.f3983b.f3906W[1].f();
        } else {
            DependencyNode h10 = h(this.f3983b.f3906W[0]);
            DependencyNode h11 = h(this.f3983b.f3906W[1]);
            if (h10 != null) {
                h10.b(this);
            }
            if (h11 != null) {
                h11.b(this);
            }
            this.f3991j = WidgetRun.RunType.CENTER;
        }
    }

    public void e() {
        DependencyNode dependencyNode = this.f3989h;
        if (dependencyNode.f3978j) {
            this.f3983b.m1(dependencyNode.f3975g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f3984c = null;
        this.f3989h.c();
        this.f3990i.c();
        this.f3986e.c();
        this.f3988g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f3985d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f3983b.f3954w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f3988g = false;
        this.f3989h.c();
        this.f3989h.f3978j = false;
        this.f3990i.c();
        this.f3990i.f3978j = false;
        this.f3986e.f3978j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f3983b.t();
    }
}
