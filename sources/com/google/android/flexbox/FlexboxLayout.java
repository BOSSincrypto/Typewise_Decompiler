package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.P;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;
import s1.C0894a;

public class FlexboxLayout extends ViewGroup implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f11405a;

    /* renamed from: b  reason: collision with root package name */
    private int f11406b;

    /* renamed from: c  reason: collision with root package name */
    private int f11407c;

    /* renamed from: d  reason: collision with root package name */
    private int f11408d;

    /* renamed from: e  reason: collision with root package name */
    private int f11409e;

    /* renamed from: f  reason: collision with root package name */
    private int f11410f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f11411g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f11412h;

    /* renamed from: i  reason: collision with root package name */
    private int f11413i;

    /* renamed from: j  reason: collision with root package name */
    private int f11414j;

    /* renamed from: k  reason: collision with root package name */
    private int f11415k;

    /* renamed from: l  reason: collision with root package name */
    private int f11416l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f11417m;

    /* renamed from: n  reason: collision with root package name */
    private SparseIntArray f11418n;

    /* renamed from: o  reason: collision with root package name */
    private d f11419o;

    /* renamed from: p  reason: collision with root package name */
    private List f11420p;

    /* renamed from: q  reason: collision with root package name */
    private d.b f11421q;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        if (this.f11411g == null && this.f11412h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean a(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (((c) this.f11420p.get(i5)).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean d(int i4, int i5) {
        for (int i6 = 1; i6 <= i5; i6++) {
            View r4 = r(i4 - i6);
            if (r4 != null && r4.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void f(Canvas canvas, boolean z3, boolean z4) {
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f11420p.size();
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) this.f11420p.get(i8);
            for (int i9 = 0; i9 < cVar.f11495h; i9++) {
                int i10 = cVar.f11502o + i9;
                View r4 = r(i10);
                if (!(r4 == null || r4.getVisibility() == 8)) {
                    a aVar = (a) r4.getLayoutParams();
                    if (s(i10, i9)) {
                        if (z3) {
                            i7 = r4.getRight() + aVar.rightMargin;
                        } else {
                            i7 = (r4.getLeft() - aVar.leftMargin) - this.f11416l;
                        }
                        p(canvas, i7, cVar.f11489b, cVar.f11494g);
                    }
                    if (i9 == cVar.f11495h - 1 && (this.f11414j & 4) > 0) {
                        if (z3) {
                            i6 = (r4.getLeft() - aVar.leftMargin) - this.f11416l;
                        } else {
                            i6 = r4.getRight() + aVar.rightMargin;
                        }
                        p(canvas, i6, cVar.f11489b, cVar.f11494g);
                    }
                }
            }
            if (t(i8)) {
                if (z4) {
                    i5 = cVar.f11491d;
                } else {
                    i5 = cVar.f11489b - this.f11415k;
                }
                o(canvas, paddingLeft, i5, max);
            }
            if (u(i8) && (this.f11413i & 4) > 0) {
                if (z4) {
                    i4 = cVar.f11489b - this.f11415k;
                } else {
                    i4 = cVar.f11491d;
                }
                o(canvas, paddingLeft, i4, max);
            }
        }
    }

    private void j(Canvas canvas, boolean z3, boolean z4) {
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f11420p.size();
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) this.f11420p.get(i8);
            for (int i9 = 0; i9 < cVar.f11495h; i9++) {
                int i10 = cVar.f11502o + i9;
                View r4 = r(i10);
                if (!(r4 == null || r4.getVisibility() == 8)) {
                    a aVar = (a) r4.getLayoutParams();
                    if (s(i10, i9)) {
                        if (z4) {
                            i7 = r4.getBottom() + aVar.bottomMargin;
                        } else {
                            i7 = (r4.getTop() - aVar.topMargin) - this.f11415k;
                        }
                        o(canvas, cVar.f11488a, i7, cVar.f11494g);
                    }
                    if (i9 == cVar.f11495h - 1 && (this.f11413i & 4) > 0) {
                        if (z4) {
                            i6 = (r4.getTop() - aVar.topMargin) - this.f11415k;
                        } else {
                            i6 = r4.getBottom() + aVar.bottomMargin;
                        }
                        o(canvas, cVar.f11488a, i6, cVar.f11494g);
                    }
                }
            }
            if (t(i8)) {
                if (z3) {
                    i5 = cVar.f11490c;
                } else {
                    i5 = cVar.f11488a - this.f11416l;
                }
                p(canvas, i5, paddingTop, max);
            }
            if (u(i8) && (this.f11414j & 4) > 0) {
                if (z3) {
                    i4 = cVar.f11488a - this.f11416l;
                } else {
                    i4 = cVar.f11490c;
                }
                p(canvas, i4, paddingTop, max);
            }
        }
    }

    private void o(Canvas canvas, int i4, int i5, int i6) {
        Drawable drawable = this.f11411g;
        if (drawable != null) {
            drawable.setBounds(i4, i5, i6 + i4, this.f11415k + i5);
            this.f11411g.draw(canvas);
        }
    }

    private void p(Canvas canvas, int i4, int i5, int i6) {
        Drawable drawable = this.f11412h;
        if (drawable != null) {
            drawable.setBounds(i4, i5, this.f11416l + i4, i6 + i5);
            this.f11412h.draw(canvas);
        }
    }

    private boolean s(int i4, int i5) {
        if (d(i4, i5)) {
            if (m()) {
                if ((this.f11414j & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f11413i & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (m()) {
            if ((this.f11414j & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f11413i & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean t(int i4) {
        if (i4 < 0 || i4 >= this.f11420p.size()) {
            return false;
        }
        if (a(i4)) {
            if (m()) {
                if ((this.f11413i & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f11414j & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (m()) {
            if ((this.f11413i & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f11414j & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean u(int i4) {
        if (i4 < 0 || i4 >= this.f11420p.size()) {
            return false;
        }
        for (int i5 = i4 + 1; i5 < this.f11420p.size(); i5++) {
            if (((c) this.f11420p.get(i5)).c() > 0) {
                return false;
            }
        }
        if (m()) {
            if ((this.f11413i & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f11414j & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List r6 = r0.f11420p
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x022f
            java.util.List r9 = r0.f11420p
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.c r9 = (com.google.android.flexbox.c) r9
            boolean r10 = r0.t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f11415k
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f11407c
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c8
            if (r10 == r13) goto L_0x00be
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ab
            r7 = 3
            if (r10 == r7) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r7 = 5
            if (r10 != r7) goto L_0x0061
            int r7 = r9.c()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.f11492e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = r11
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cd
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11407c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r7 = r9.c()
            if (r7 == 0) goto L_0x0088
            int r10 = r9.f11492e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0089
        L_0x0088:
            r10 = r11
        L_0x0089:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00cd
        L_0x0093:
            float r7 = (float) r1
            int r10 = r9.c()
            if (r10 == r13) goto L_0x009e
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009e:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f11492e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00cd
        L_0x00ab:
            float r7 = (float) r1
            int r10 = r9.f11492e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
        L_0x00bc:
            r10 = r11
            goto L_0x00cd
        L_0x00be:
            int r7 = r9.f11492e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00bc
        L_0x00c8:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
            goto L_0x00bc
        L_0x00cd:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d2:
            int r10 = r9.f11495h
            if (r14 >= r10) goto L_0x0223
            int r10 = r9.f11502o
            int r10 = r10 + r14
            android.view.View r18 = r0.r(r10)
            if (r18 == 0) goto L_0x020f
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00f3
            r27 = r1
            r26 = r13
            r25 = r14
            r22 = 2
            r23 = 4
            goto L_0x0219
        L_0x00f3:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$a r15 = (com.google.android.flexbox.FlexboxLayout.a) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.s(r10, r14)
            if (r10 == 0) goto L_0x0112
            int r10 = r0.f11416l
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x0116
        L_0x0112:
            r19 = r12
            r20 = 0
        L_0x0116:
            int r10 = r9.f11495h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0128
            int r10 = r0.f11414j
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x012a
            int r10 = r0.f11416l
            r21 = r10
            goto L_0x012c
        L_0x0128:
            r16 = 4
        L_0x012a:
            r21 = 0
        L_0x012c:
            int r10 = r0.f11406b
            r12 = 2
            if (r10 != r12) goto L_0x0190
            if (r29 == 0) goto L_0x0166
            com.google.android.flexbox.d r10 = r0.f11419o
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r13
            r13 = r22
            r22 = r25
            r25 = r14
            r14 = r23
            r27 = r1
            r1 = r15
            r23 = r16
            r15 = r24
            r16 = r3
            r10.Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d8
        L_0x0166:
            r27 = r1
            r22 = r12
            r26 = r13
            r25 = r14
            r1 = r15
            r23 = r16
            com.google.android.flexbox.d r10 = r0.f11419o
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r3
            r10.Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d8
        L_0x0190:
            r27 = r1
            r22 = r12
            r26 = r13
            r25 = r14
            r1 = r15
            r23 = r16
            if (r29 == 0) goto L_0x01bb
            com.google.android.flexbox.d r10 = r0.f11419o
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d8
        L_0x01bb:
            com.google.android.flexbox.d r10 = r0.f11419o
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.Q(r11, r12, r13, r14, r15, r16)
        L_0x01d8:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x0200
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.d(r11, r12, r13, r14, r15)
            goto L_0x020c
        L_0x0200:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.d(r11, r12, r13, r14, r15)
        L_0x020c:
            r12 = r19
            goto L_0x0219
        L_0x020f:
            r27 = r1
            r26 = r13
            r25 = r14
            r23 = r15
            r22 = 2
        L_0x0219:
            int r14 = r25 + 1
            r15 = r23
            r13 = r26
            r1 = r27
            goto L_0x00d2
        L_0x0223:
            r27 = r1
            int r1 = r9.f11494g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r27
            goto L_0x001e
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List r3 = r0.f11420p
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x021d
            java.util.List r9 = r0.f11420p
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.c r9 = (com.google.android.flexbox.c) r9
            boolean r10 = r0.t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f11416l
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.f11407c
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c7
            if (r10 == r14) goto L_0x00be
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00aa
            r12 = 3
            if (r10 == r12) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r12 = 5
            if (r10 != r12) goto L_0x0061
            int r10 = r9.c()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.f11492e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = r11
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00cb
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11407c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r10 = r9.c()
            if (r10 == 0) goto L_0x0088
            int r12 = r9.f11492e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0089
        L_0x0088:
            r12 = r11
        L_0x0089:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00cb
        L_0x0093:
            float r10 = (float) r1
            int r7 = r9.c()
            if (r7 == r14) goto L_0x009e
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a0
        L_0x009e:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f11492e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00cb
        L_0x00aa:
            float r7 = (float) r1
            int r10 = r9.f11492e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 + r12
            int r12 = r6 - r2
            float r12 = (float) r12
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r12 - r10
            r10 = r7
        L_0x00bc:
            r12 = r11
            goto L_0x00cb
        L_0x00be:
            int r7 = r9.f11492e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
        L_0x00c5:
            float r13 = (float) r7
            goto L_0x00bc
        L_0x00c7:
            float r10 = (float) r1
            int r7 = r6 - r2
            goto L_0x00c5
        L_0x00cb:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00d0:
            int r11 = r9.f11495h
            if (r12 >= r11) goto L_0x0215
            int r11 = r9.f11502o
            int r11 = r11 + r12
            android.view.View r18 = r0.r(r11)
            if (r18 == 0) goto L_0x0207
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00ed
            r25 = r12
            r26 = 1
            r27 = 4
            goto L_0x020d
        L_0x00ed:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$a r15 = (com.google.android.flexbox.FlexboxLayout.a) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.s(r11, r12)
            if (r11 == 0) goto L_0x010e
            int r11 = r0.f11415k
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x0114
        L_0x010e:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x0114:
            int r10 = r9.f11495h
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x0127
            int r10 = r0.f11413i
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0129
            int r10 = r0.f11415k
            r22 = r10
            goto L_0x012b
        L_0x0127:
            r16 = 4
        L_0x0129:
            r22 = 0
        L_0x012b:
            if (r30 == 0) goto L_0x0186
            if (r31 == 0) goto L_0x015e
            com.google.android.flexbox.d r10 = r0.f11419o
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r13 = r18.getMeasuredHeight()
            int r23 = r11 - r13
            int r24 = java.lang.Math.round(r20)
            r13 = 1
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r14
            r14 = r17
            r28 = r15
            r27 = r16
            r15 = r23
            r16 = r5
            r17 = r24
            r10.R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cd
        L_0x015e:
            r25 = r12
            r26 = r14
            r28 = r15
            r27 = r16
            com.google.android.flexbox.d r10 = r0.f11419o
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r13 = 1
            r11 = r18
            r12 = r9
            r16 = r5
            r10.R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cd
        L_0x0186:
            r25 = r12
            r26 = r14
            r28 = r15
            r27 = r16
            if (r31 == 0) goto L_0x01af
            com.google.android.flexbox.d r10 = r0.f11419o
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            r13 = 0
            r11 = r18
            r12 = r9
            r14 = r4
            r10.R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cd
        L_0x01af:
            com.google.android.flexbox.d r10 = r0.f11419o
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r13 = 0
            r11 = r18
            r12 = r9
            r14 = r4
            r10.R(r11, r12, r13, r14, r15, r16, r17)
        L_0x01cd:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r28
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01f6
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.d(r11, r12, r13, r14, r15)
            goto L_0x0202
        L_0x01f6:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.d(r11, r12, r13, r14, r15)
        L_0x0202:
            r10 = r19
            r13 = r20
            goto L_0x020d
        L_0x0207:
            r25 = r12
            r26 = r14
            r27 = r15
        L_0x020d:
            int r12 = r25 + 1
            r14 = r26
            r15 = r27
            goto L_0x00d0
        L_0x0215:
            int r7 = r9.f11494g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i4, int i5) {
        this.f11420p.clear();
        this.f11421q.a();
        this.f11419o.c(this.f11421q, i4, i5);
        this.f11420p = this.f11421q.f11511a;
        this.f11419o.p(i4, i5);
        if (this.f11408d == 3) {
            for (c cVar : this.f11420p) {
                int i6 = Integer.MIN_VALUE;
                for (int i7 = 0; i7 < cVar.f11495h; i7++) {
                    View r4 = r(cVar.f11502o + i7);
                    if (!(r4 == null || r4.getVisibility() == 8)) {
                        a aVar = (a) r4.getLayoutParams();
                        if (this.f11406b != 2) {
                            i6 = Math.max(i6, r4.getMeasuredHeight() + Math.max(cVar.f11499l - r4.getBaseline(), aVar.topMargin) + aVar.bottomMargin);
                        } else {
                            i6 = Math.max(i6, r4.getMeasuredHeight() + aVar.topMargin + Math.max((cVar.f11499l - r4.getMeasuredHeight()) + r4.getBaseline(), aVar.bottomMargin));
                        }
                    }
                }
                cVar.f11494g = i6;
            }
        }
        this.f11419o.o(i4, i5, getPaddingTop() + getPaddingBottom());
        this.f11419o.X();
        z(this.f11405a, i4, i5, this.f11421q.f11512b);
    }

    private void y(int i4, int i5) {
        this.f11420p.clear();
        this.f11421q.a();
        this.f11419o.f(this.f11421q, i4, i5);
        this.f11420p = this.f11421q.f11511a;
        this.f11419o.p(i4, i5);
        this.f11419o.o(i4, i5, getPaddingLeft() + getPaddingRight());
        this.f11419o.X();
        z(this.f11405a, i4, i5, this.f11421q.f11512b);
    }

    private void z(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (i4 == 0 || i4 == 1) {
            i8 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i9 = getLargestMainSize();
        } else if (i4 == 2 || i4 == 3) {
            i8 = getLargestMainSize();
            i9 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i4);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i9) {
                i7 = View.combineMeasuredStates(i7, 16777216);
            } else {
                size = i9;
            }
            i10 = View.resolveSizeAndState(size, i5, i7);
        } else if (mode == 0) {
            i10 = View.resolveSizeAndState(i9, i5, i7);
        } else if (mode == 1073741824) {
            if (size < i9) {
                i7 = View.combineMeasuredStates(i7, 16777216);
            }
            i10 = View.resolveSizeAndState(size, i5, i7);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i8) {
                i7 = View.combineMeasuredStates(i7, 256);
            } else {
                size2 = i8;
            }
            i11 = View.resolveSizeAndState(size2, i6, i7);
        } else if (mode2 == 0) {
            i11 = View.resolveSizeAndState(i8, i6, i7);
        } else if (mode2 == 1073741824) {
            if (size2 < i8) {
                i7 = View.combineMeasuredStates(i7, 256);
            }
            i11 = View.resolveSizeAndState(size2, i6, i7);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i10, i11);
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (this.f11418n == null) {
            this.f11418n = new SparseIntArray(getChildCount());
        }
        this.f11417m = this.f11419o.n(view, i4, layoutParams, this.f11418n);
        super.addView(view, i4, layoutParams);
    }

    public View b(int i4) {
        return getChildAt(i4);
    }

    public int c(View view, int i4, int i5) {
        int i6;
        int i7 = 0;
        if (m()) {
            if (s(i4, i5)) {
                i7 = this.f11416l;
            }
            if ((this.f11414j & 4) <= 0) {
                return i7;
            }
            i6 = this.f11416l;
        } else {
            if (s(i4, i5)) {
                i7 = this.f11415k;
            }
            if ((this.f11413i & 4) <= 0) {
                return i7;
            }
            i6 = this.f11415k;
        }
        return i7 + i6;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public int e(int i4, int i5, int i6) {
        return ViewGroup.getChildMeasureSpec(i4, i5, i6);
    }

    public void g(View view, int i4, int i5, c cVar) {
        if (!s(i4, i5)) {
            return;
        }
        if (m()) {
            int i6 = cVar.f11492e;
            int i7 = this.f11416l;
            cVar.f11492e = i6 + i7;
            cVar.f11493f += i7;
            return;
        }
        int i8 = cVar.f11492e;
        int i9 = this.f11415k;
        cVar.f11492e = i8 + i9;
        cVar.f11493f += i9;
    }

    public int getAlignContent() {
        return this.f11409e;
    }

    public int getAlignItems() {
        return this.f11408d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f11411g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f11412h;
    }

    public int getFlexDirection() {
        return this.f11405a;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f11420p.size());
        for (c cVar : this.f11420p) {
            if (cVar.c() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public List<c> getFlexLinesInternal() {
        return this.f11420p;
    }

    public int getFlexWrap() {
        return this.f11406b;
    }

    public int getJustifyContent() {
        return this.f11407c;
    }

    public int getLargestMainSize() {
        int i4 = Integer.MIN_VALUE;
        for (c cVar : this.f11420p) {
            i4 = Math.max(i4, cVar.f11492e);
        }
        return i4;
    }

    public int getMaxLine() {
        return this.f11410f;
    }

    public int getShowDividerHorizontal() {
        return this.f11413i;
    }

    public int getShowDividerVertical() {
        return this.f11414j;
    }

    public int getSumOfCrossSize() {
        int i4;
        int i5;
        int size = this.f11420p.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = (c) this.f11420p.get(i7);
            if (t(i7)) {
                if (m()) {
                    i5 = this.f11415k;
                } else {
                    i5 = this.f11416l;
                }
                i6 += i5;
            }
            if (u(i7)) {
                if (m()) {
                    i4 = this.f11415k;
                } else {
                    i4 = this.f11416l;
                }
                i6 += i4;
            }
            i6 += cVar.f11494g;
        }
        return i6;
    }

    public void h(c cVar) {
        if (m()) {
            if ((this.f11414j & 4) > 0) {
                int i4 = cVar.f11492e;
                int i5 = this.f11416l;
                cVar.f11492e = i4 + i5;
                cVar.f11493f += i5;
            }
        } else if ((this.f11413i & 4) > 0) {
            int i6 = cVar.f11492e;
            int i7 = this.f11415k;
            cVar.f11492e = i6 + i7;
            cVar.f11493f += i7;
        }
    }

    public View i(int i4) {
        return r(i4);
    }

    public int k(int i4, int i5, int i6) {
        return ViewGroup.getChildMeasureSpec(i4, i5, i6);
    }

    public void l(int i4, View view) {
    }

    public boolean m() {
        int i4 = this.f11405a;
        if (i4 == 0 || i4 == 1) {
            return true;
        }
        return false;
    }

    public int n(View view) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z3;
        boolean z4;
        if (this.f11412h != null || this.f11411g != null) {
            if (this.f11413i != 0 || this.f11414j != 0) {
                int B3 = P.B(this);
                int i4 = this.f11405a;
                boolean z5 = false;
                boolean z6 = true;
                if (i4 == 0) {
                    if (B3 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.f11406b == 2) {
                        z5 = true;
                    }
                    f(canvas, z3, z5);
                } else if (i4 == 1) {
                    if (B3 != 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f11406b == 2) {
                        z5 = true;
                    }
                    f(canvas, z4, z5);
                } else if (i4 == 2) {
                    if (B3 != 1) {
                        z6 = false;
                    }
                    if (this.f11406b == 2) {
                        z6 = !z6;
                    }
                    j(canvas, z6, false);
                } else if (i4 == 3) {
                    if (B3 == 1) {
                        z5 = true;
                    }
                    if (this.f11406b == 2) {
                        z5 = !z5;
                    }
                    j(canvas, z5, true);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int B3 = P.B(this);
        int i8 = this.f11405a;
        boolean z8 = false;
        if (i8 == 0) {
            if (B3 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            v(z4, i4, i5, i6, i7);
        } else if (i8 == 1) {
            if (B3 != 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            v(z5, i4, i5, i6, i7);
        } else if (i8 == 2) {
            if (B3 == 1) {
                z8 = true;
            }
            if (this.f11406b == 2) {
                z6 = !z8;
            } else {
                z6 = z8;
            }
            w(z6, false, i4, i5, i6, i7);
        } else if (i8 == 3) {
            if (B3 == 1) {
                z8 = true;
            }
            if (this.f11406b == 2) {
                z7 = !z8;
            } else {
                z7 = z8;
            }
            w(z7, true, i4, i5, i6, i7);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f11405a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        if (this.f11418n == null) {
            this.f11418n = new SparseIntArray(getChildCount());
        }
        if (this.f11419o.O(this.f11418n)) {
            this.f11417m = this.f11419o.m(this.f11418n);
        }
        int i6 = this.f11405a;
        if (i6 == 0 || i6 == 1) {
            x(i4, i5);
        } else if (i6 == 2 || i6 == 3) {
            y(i4, i5);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f11405a);
        }
    }

    /* renamed from: q */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public View r(int i4) {
        if (i4 < 0) {
            return null;
        }
        int[] iArr = this.f11417m;
        if (i4 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i4]);
    }

    public void setAlignContent(int i4) {
        if (this.f11409e != i4) {
            this.f11409e = i4;
            requestLayout();
        }
    }

    public void setAlignItems(int i4) {
        if (this.f11408d != i4) {
            this.f11408d = i4;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f11411g) {
            this.f11411g = drawable;
            if (drawable != null) {
                this.f11415k = drawable.getIntrinsicHeight();
            } else {
                this.f11415k = 0;
            }
            A();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f11412h) {
            this.f11412h = drawable;
            if (drawable != null) {
                this.f11416l = drawable.getIntrinsicWidth();
            } else {
                this.f11416l = 0;
            }
            A();
            requestLayout();
        }
    }

    public void setFlexDirection(int i4) {
        if (this.f11405a != i4) {
            this.f11405a = i4;
            requestLayout();
        }
    }

    public void setFlexLines(List<c> list) {
        this.f11420p = list;
    }

    public void setFlexWrap(int i4) {
        if (this.f11406b != i4) {
            this.f11406b = i4;
            requestLayout();
        }
    }

    public void setJustifyContent(int i4) {
        if (this.f11407c != i4) {
            this.f11407c = i4;
            requestLayout();
        }
    }

    public void setMaxLine(int i4) {
        if (this.f11410f != i4) {
            this.f11410f = i4;
            requestLayout();
        }
    }

    public void setShowDivider(int i4) {
        setShowDividerVertical(i4);
        setShowDividerHorizontal(i4);
    }

    public void setShowDividerHorizontal(int i4) {
        if (i4 != this.f11413i) {
            this.f11413i = i4;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i4) {
        if (i4 != this.f11414j) {
            this.f11414j = i4;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f11410f = -1;
        this.f11419o = new d(this);
        this.f11420p = new ArrayList();
        this.f11421q = new d.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0894a.f16334b, i4, 0);
        this.f11405a = obtainStyledAttributes.getInt(C0894a.f16340h, 0);
        this.f11406b = obtainStyledAttributes.getInt(C0894a.f16341i, 0);
        this.f11407c = obtainStyledAttributes.getInt(C0894a.f16342j, 0);
        this.f11408d = obtainStyledAttributes.getInt(C0894a.f16336d, 0);
        this.f11409e = obtainStyledAttributes.getInt(C0894a.f16335c, 0);
        this.f11410f = obtainStyledAttributes.getInt(C0894a.f16343k, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0894a.f16337e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C0894a.f16338f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C0894a.f16339g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i5 = obtainStyledAttributes.getInt(C0894a.f16344l, 0);
        if (i5 != 0) {
            this.f11414j = i5;
            this.f11413i = i5;
        }
        int i6 = obtainStyledAttributes.getInt(C0894a.f16346n, 0);
        if (i6 != 0) {
            this.f11414j = i6;
        }
        int i7 = obtainStyledAttributes.getInt(C0894a.f16345m, 0);
        if (i7 != 0) {
            this.f11413i = i7;
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C0166a();

        /* renamed from: a  reason: collision with root package name */
        private int f11422a = 1;

        /* renamed from: b  reason: collision with root package name */
        private float f11423b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        private float f11424c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        private int f11425d = -1;

        /* renamed from: e  reason: collision with root package name */
        private float f11426e = -1.0f;

        /* renamed from: f  reason: collision with root package name */
        private int f11427f = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f11428g = -1;

        /* renamed from: h  reason: collision with root package name */
        private int f11429h = 16777215;

        /* renamed from: i  reason: collision with root package name */
        private int f11430i = 16777215;

        /* renamed from: j  reason: collision with root package name */
        private boolean f11431j;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a  reason: collision with other inner class name */
        class C0166a implements Parcelable.Creator {
            C0166a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i4) {
                return new a[i4];
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0894a.f16347o);
            this.f11422a = obtainStyledAttributes.getInt(C0894a.f16356x, 1);
            this.f11423b = obtainStyledAttributes.getFloat(C0894a.f16350r, 0.0f);
            this.f11424c = obtainStyledAttributes.getFloat(C0894a.f16351s, 1.0f);
            this.f11425d = obtainStyledAttributes.getInt(C0894a.f16348p, -1);
            this.f11426e = obtainStyledAttributes.getFraction(C0894a.f16349q, 1, 1, -1.0f);
            this.f11427f = obtainStyledAttributes.getDimensionPixelSize(C0894a.f16355w, -1);
            this.f11428g = obtainStyledAttributes.getDimensionPixelSize(C0894a.f16354v, -1);
            this.f11429h = obtainStyledAttributes.getDimensionPixelSize(C0894a.f16353u, 16777215);
            this.f11430i = obtainStyledAttributes.getDimensionPixelSize(C0894a.f16352t, 16777215);
            this.f11431j = obtainStyledAttributes.getBoolean(C0894a.f16357y, false);
            obtainStyledAttributes.recycle();
        }

        public void a(int i4) {
            this.f11428g = i4;
        }

        public float b() {
            return this.f11423b;
        }

        public int c() {
            return this.height;
        }

        public int describeContents() {
            return 0;
        }

        public float e() {
            return this.f11426e;
        }

        public int f() {
            return this.f11425d;
        }

        public float g() {
            return this.f11424c;
        }

        public int getOrder() {
            return this.f11422a;
        }

        public int i() {
            return this.rightMargin;
        }

        public int j() {
            return this.f11428g;
        }

        public int k() {
            return this.f11427f;
        }

        public boolean l() {
            return this.f11431j;
        }

        public int m() {
            return this.width;
        }

        public int n() {
            return this.f11430i;
        }

        public void o(int i4) {
            this.f11427f = i4;
        }

        public int p() {
            return this.bottomMargin;
        }

        public int q() {
            return this.leftMargin;
        }

        public int r() {
            return this.f11429h;
        }

        public int s() {
            return this.topMargin;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f11422a);
            parcel.writeFloat(this.f11423b);
            parcel.writeFloat(this.f11424c);
            parcel.writeInt(this.f11425d);
            parcel.writeFloat(this.f11426e);
            parcel.writeInt(this.f11427f);
            parcel.writeInt(this.f11428g);
            parcel.writeInt(this.f11429h);
            parcel.writeInt(this.f11430i);
            parcel.writeByte(this.f11431j ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public a(a aVar) {
            super(aVar);
            this.f11422a = aVar.f11422a;
            this.f11423b = aVar.f11423b;
            this.f11424c = aVar.f11424c;
            this.f11425d = aVar.f11425d;
            this.f11426e = aVar.f11426e;
            this.f11427f = aVar.f11427f;
            this.f11428g = aVar.f11428g;
            this.f11429h = aVar.f11429h;
            this.f11430i = aVar.f11430i;
            this.f11431j = aVar.f11431j;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected a(Parcel parcel) {
            super(0, 0);
            boolean z3 = false;
            this.f11422a = parcel.readInt();
            this.f11423b = parcel.readFloat();
            this.f11424c = parcel.readFloat();
            this.f11425d = parcel.readInt();
            this.f11426e = parcel.readFloat();
            this.f11427f = parcel.readInt();
            this.f11428g = parcel.readInt();
            this.f11429h = parcel.readInt();
            this.f11430i = parcel.readInt();
            this.f11431j = parcel.readByte() != 0 ? true : z3;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
