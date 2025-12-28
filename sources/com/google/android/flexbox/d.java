package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f11506a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f11507b;

    /* renamed from: c  reason: collision with root package name */
    int[] f11508c;

    /* renamed from: d  reason: collision with root package name */
    long[] f11509d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f11510e;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        List f11511a;

        /* renamed from: b  reason: collision with root package name */
        int f11512b;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f11511a = null;
            this.f11512b = 0;
        }
    }

    private static class c implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        int f11513a;

        /* renamed from: b  reason: collision with root package name */
        int f11514b;

        private c() {
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i4 = this.f11514b;
            int i5 = cVar.f11514b;
            if (i4 != i5) {
                return i4 - i5;
            }
            return this.f11513a - cVar.f11513a;
        }

        public String toString() {
            return "Order{order=" + this.f11514b + ", index=" + this.f11513a + '}';
        }
    }

    d(a aVar) {
        this.f11506a = aVar;
    }

    private int A(int i4, b bVar, int i5) {
        a aVar = this.f11506a;
        int k4 = aVar.k(i4, aVar.getPaddingLeft() + this.f11506a.getPaddingRight() + bVar.q() + bVar.i() + i5, bVar.m());
        int size = View.MeasureSpec.getSize(k4);
        if (size > bVar.r()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.r(), View.MeasureSpec.getMode(k4));
        }
        if (size < bVar.k()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.k(), View.MeasureSpec.getMode(k4));
        }
        return k4;
    }

    private int B(b bVar, boolean z3) {
        if (z3) {
            return bVar.p();
        }
        return bVar.i();
    }

    private int C(b bVar, boolean z3) {
        if (z3) {
            return bVar.i();
        }
        return bVar.p();
    }

    private int D(b bVar, boolean z3) {
        if (z3) {
            return bVar.s();
        }
        return bVar.q();
    }

    private int E(b bVar, boolean z3) {
        if (z3) {
            return bVar.q();
        }
        return bVar.s();
    }

    private int F(b bVar, boolean z3) {
        if (z3) {
            return bVar.c();
        }
        return bVar.m();
    }

    private int G(b bVar, boolean z3) {
        if (z3) {
            return bVar.m();
        }
        return bVar.c();
    }

    private int H(boolean z3) {
        if (z3) {
            return this.f11506a.getPaddingBottom();
        }
        return this.f11506a.getPaddingEnd();
    }

    private int I(boolean z3) {
        if (z3) {
            return this.f11506a.getPaddingEnd();
        }
        return this.f11506a.getPaddingBottom();
    }

    private int J(boolean z3) {
        if (z3) {
            return this.f11506a.getPaddingTop();
        }
        return this.f11506a.getPaddingStart();
    }

    private int K(boolean z3) {
        if (z3) {
            return this.f11506a.getPaddingStart();
        }
        return this.f11506a.getPaddingTop();
    }

    private int L(View view, boolean z3) {
        if (z3) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int M(View view, boolean z3) {
        if (z3) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private boolean N(int i4, int i5, c cVar) {
        if (i4 != i5 - 1 || cVar.c() == 0) {
            return false;
        }
        return true;
    }

    private boolean P(View view, int i4, int i5, int i6, int i7, b bVar, int i8, int i9, int i10) {
        if (this.f11506a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.l()) {
            return true;
        }
        if (i4 == 0) {
            return false;
        }
        int maxLine = this.f11506a.getMaxLine();
        if (maxLine != -1 && maxLine <= i10 + 1) {
            return false;
        }
        int c4 = this.f11506a.c(view, i8, i9);
        if (c4 > 0) {
            i7 += c4;
        }
        if (i5 < i6 + i7) {
            return true;
        }
        return false;
    }

    private void T(int i4, int i5, c cVar, int i6, int i7, boolean z3) {
        int i8;
        int i9;
        int i10;
        int i11;
        c cVar2 = cVar;
        int i12 = i6;
        int i13 = cVar2.f11492e;
        float f4 = cVar2.f11498k;
        float f5 = 0.0f;
        if (f4 > 0.0f && i12 <= i13) {
            float f6 = ((float) (i13 - i12)) / f4;
            cVar2.f11492e = i7 + cVar2.f11493f;
            if (!z3) {
                cVar2.f11494g = Integer.MIN_VALUE;
            }
            int i14 = 0;
            boolean z4 = false;
            int i15 = 0;
            float f7 = 0.0f;
            while (i14 < cVar2.f11495h) {
                int i16 = cVar2.f11502o + i14;
                View i17 = this.f11506a.i(i16);
                if (i17 == null || i17.getVisibility() == 8) {
                    int i18 = i5;
                    i9 = i13;
                    i8 = i14;
                } else {
                    b bVar = (b) i17.getLayoutParams();
                    int flexDirection = this.f11506a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i9 = i13;
                        int i19 = i14;
                        int i20 = i4;
                        int measuredWidth = i17.getMeasuredWidth();
                        long[] jArr = this.f11510e;
                        if (jArr != null) {
                            measuredWidth = y(jArr[i16]);
                        }
                        int measuredHeight = i17.getMeasuredHeight();
                        long[] jArr2 = this.f11510e;
                        int i21 = i19;
                        if (jArr2 != null) {
                            measuredHeight = x(jArr2[i16]);
                        }
                        if (this.f11507b[i16] || bVar.g() <= 0.0f) {
                            int i22 = i5;
                            i11 = i21;
                        } else {
                            float g4 = ((float) measuredWidth) - (bVar.g() * f6);
                            i11 = i21;
                            if (i11 == cVar2.f11495h - 1) {
                                g4 += f7;
                                f7 = 0.0f;
                            }
                            int round = Math.round(g4);
                            if (round < bVar.k()) {
                                round = bVar.k();
                                this.f11507b[i16] = true;
                                cVar2.f11498k -= bVar.g();
                                z4 = true;
                            } else {
                                f7 += g4 - ((float) round);
                                double d4 = (double) f7;
                                if (d4 > 1.0d) {
                                    round++;
                                    f7 -= 1.0f;
                                } else if (d4 < -1.0d) {
                                    round--;
                                    f7 += 1.0f;
                                }
                            }
                            int z5 = z(i5, bVar, cVar2.f11500m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i17.measure(makeMeasureSpec, z5);
                            int measuredWidth2 = i17.getMeasuredWidth();
                            int measuredHeight2 = i17.getMeasuredHeight();
                            Z(i16, makeMeasureSpec, z5, i17);
                            this.f11506a.l(i16, i17);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i15, measuredHeight + bVar.s() + bVar.p() + this.f11506a.n(i17));
                        cVar2.f11492e += measuredWidth + bVar.q() + bVar.i();
                        i10 = max;
                    } else {
                        int measuredHeight3 = i17.getMeasuredHeight();
                        long[] jArr3 = this.f11510e;
                        if (jArr3 != null) {
                            measuredHeight3 = x(jArr3[i16]);
                        }
                        int measuredWidth3 = i17.getMeasuredWidth();
                        long[] jArr4 = this.f11510e;
                        if (jArr4 != null) {
                            measuredWidth3 = y(jArr4[i16]);
                        }
                        if (this.f11507b[i16] || bVar.g() <= f5) {
                            i9 = i13;
                            i8 = i14;
                            int i23 = i4;
                        } else {
                            float g5 = ((float) measuredHeight3) - (bVar.g() * f6);
                            if (i14 == cVar2.f11495h - 1) {
                                g5 += f7;
                                f7 = f5;
                            }
                            int round2 = Math.round(g5);
                            if (round2 < bVar.j()) {
                                round2 = bVar.j();
                                this.f11507b[i16] = true;
                                cVar2.f11498k -= bVar.g();
                                i9 = i13;
                                i8 = i14;
                                z4 = true;
                            } else {
                                f7 += g5 - ((float) round2);
                                i9 = i13;
                                i8 = i14;
                                double d5 = (double) f7;
                                if (d5 > 1.0d) {
                                    round2++;
                                    f7 -= 1.0f;
                                } else if (d5 < -1.0d) {
                                    round2--;
                                    f7 += 1.0f;
                                }
                            }
                            int A3 = A(i4, bVar, cVar2.f11500m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i17.measure(A3, makeMeasureSpec2);
                            measuredWidth3 = i17.getMeasuredWidth();
                            int measuredHeight4 = i17.getMeasuredHeight();
                            Z(i16, A3, makeMeasureSpec2, i17);
                            this.f11506a.l(i16, i17);
                            measuredHeight3 = measuredHeight4;
                        }
                        i10 = Math.max(i15, measuredWidth3 + bVar.q() + bVar.i() + this.f11506a.n(i17));
                        cVar2.f11492e += measuredHeight3 + bVar.s() + bVar.p();
                        int i24 = i5;
                    }
                    cVar2.f11494g = Math.max(cVar2.f11494g, i10);
                    i15 = i10;
                }
                i14 = i8 + 1;
                i13 = i9;
                f5 = 0.0f;
            }
            int i25 = i5;
            int i26 = i13;
            if (z4 && i26 != cVar2.f11492e) {
                T(i4, i5, cVar, i6, i7, true);
            }
        }
    }

    private int[] U(int i4, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i4];
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i6 = cVar.f11513a;
            iArr[i5] = i6;
            sparseIntArray.append(i6, cVar.f11514b);
            i5++;
        }
        return iArr;
    }

    private void V(View view, int i4, int i5) {
        int i6;
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i4 - bVar.q()) - bVar.i()) - this.f11506a.n(view), bVar.k()), bVar.r());
        long[] jArr = this.f11510e;
        if (jArr != null) {
            i6 = x(jArr[i5]);
        } else {
            i6 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i5, makeMeasureSpec2, makeMeasureSpec, view);
        this.f11506a.l(i5, view);
    }

    private void W(View view, int i4, int i5) {
        int i6;
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i4 - bVar.s()) - bVar.p()) - this.f11506a.n(view), bVar.j()), bVar.n());
        long[] jArr = this.f11510e;
        if (jArr != null) {
            i6 = y(jArr[i5]);
        } else {
            i6 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i5, makeMeasureSpec, makeMeasureSpec2, view);
        this.f11506a.l(i5, view);
    }

    private void Z(int i4, int i5, int i6, View view) {
        long[] jArr = this.f11509d;
        if (jArr != null) {
            jArr[i4] = S(i5, i6);
        }
        long[] jArr2 = this.f11510e;
        if (jArr2 != null) {
            jArr2[i4] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List list, c cVar, int i4, int i5) {
        cVar.f11500m = i5;
        this.f11506a.h(cVar);
        cVar.f11503p = i4;
        list.add(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.k()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.k()
        L_0x0019:
            r3 = r4
            goto L_0x0027
        L_0x001b:
            int r3 = r0.r()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.r()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.j()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.j()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.n()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.n()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f11506a
            r0.l(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.i(android.view.View, int):void");
    }

    private List k(List list, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        cVar.f11494g = (i4 - i5) / 2;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add((c) list.get(i6));
            if (i6 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private List l(int i4) {
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            c cVar = new c();
            cVar.f11514b = ((b) this.f11506a.b(i5).getLayoutParams()).getOrder();
            cVar.f11513a = i5;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void r(int i4) {
        boolean[] zArr = this.f11507b;
        if (zArr == null) {
            this.f11507b = new boolean[Math.max(i4, 10)];
        } else if (zArr.length < i4) {
            this.f11507b = new boolean[Math.max(zArr.length * 2, i4)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void v(CompoundButton compoundButton) {
        int i4;
        b bVar = (b) compoundButton.getLayoutParams();
        int k4 = bVar.k();
        int j4 = bVar.j();
        Drawable a4 = androidx.core.widget.d.a(compoundButton);
        int i5 = 0;
        if (a4 == null) {
            i4 = 0;
        } else {
            i4 = a4.getMinimumWidth();
        }
        if (a4 != null) {
            i5 = a4.getMinimumHeight();
        }
        if (k4 == -1) {
            k4 = i4;
        }
        bVar.o(k4);
        if (j4 == -1) {
            j4 = i5;
        }
        bVar.a(j4);
    }

    private void w(int i4, int i5, c cVar, int i6, int i7, boolean z3) {
        int i8;
        int i9;
        int i10;
        double d4;
        int i11;
        double d5;
        c cVar2 = cVar;
        int i12 = i6;
        float f4 = cVar2.f11497j;
        float f5 = 0.0f;
        if (f4 > 0.0f && i12 >= (i8 = cVar2.f11492e)) {
            float f6 = ((float) (i12 - i8)) / f4;
            cVar2.f11492e = i7 + cVar2.f11493f;
            if (!z3) {
                cVar2.f11494g = Integer.MIN_VALUE;
            }
            int i13 = 0;
            boolean z4 = false;
            int i14 = 0;
            float f7 = 0.0f;
            while (i13 < cVar2.f11495h) {
                int i15 = cVar2.f11502o + i13;
                View i16 = this.f11506a.i(i15);
                if (i16 == null || i16.getVisibility() == 8) {
                    int i17 = i5;
                    i9 = i8;
                } else {
                    b bVar = (b) i16.getLayoutParams();
                    int flexDirection = this.f11506a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i18 = i8;
                        int i19 = i4;
                        int measuredWidth = i16.getMeasuredWidth();
                        long[] jArr = this.f11510e;
                        if (jArr != null) {
                            measuredWidth = y(jArr[i15]);
                        }
                        int measuredHeight = i16.getMeasuredHeight();
                        long[] jArr2 = this.f11510e;
                        i9 = i18;
                        if (jArr2 != null) {
                            measuredHeight = x(jArr2[i15]);
                        }
                        if (this.f11507b[i15] || bVar.b() <= 0.0f) {
                            int i20 = i5;
                        } else {
                            float b4 = ((float) measuredWidth) + (bVar.b() * f6);
                            if (i13 == cVar2.f11495h - 1) {
                                b4 += f7;
                                f7 = 0.0f;
                            }
                            int round = Math.round(b4);
                            if (round > bVar.r()) {
                                round = bVar.r();
                                this.f11507b[i15] = true;
                                cVar2.f11497j -= bVar.b();
                                z4 = true;
                            } else {
                                f7 += b4 - ((float) round);
                                double d6 = (double) f7;
                                if (d6 > 1.0d) {
                                    round++;
                                    d4 = d6 - 1.0d;
                                } else if (d6 < -1.0d) {
                                    round--;
                                    d4 = d6 + 1.0d;
                                }
                                f7 = (float) d4;
                            }
                            int z5 = z(i5, bVar, cVar2.f11500m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            i16.measure(makeMeasureSpec, z5);
                            int measuredWidth2 = i16.getMeasuredWidth();
                            int measuredHeight2 = i16.getMeasuredHeight();
                            Z(i15, makeMeasureSpec, z5, i16);
                            this.f11506a.l(i15, i16);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i14, measuredHeight + bVar.s() + bVar.p() + this.f11506a.n(i16));
                        cVar2.f11492e += measuredWidth + bVar.q() + bVar.i();
                        i10 = max;
                    } else {
                        int measuredHeight3 = i16.getMeasuredHeight();
                        long[] jArr3 = this.f11510e;
                        if (jArr3 != null) {
                            measuredHeight3 = x(jArr3[i15]);
                        }
                        int measuredWidth3 = i16.getMeasuredWidth();
                        long[] jArr4 = this.f11510e;
                        if (jArr4 != null) {
                            measuredWidth3 = y(jArr4[i15]);
                        }
                        if (this.f11507b[i15] || bVar.b() <= f5) {
                            i11 = i8;
                            int i21 = i4;
                        } else {
                            float b5 = ((float) measuredHeight3) + (bVar.b() * f6);
                            if (i13 == cVar2.f11495h - 1) {
                                b5 += f7;
                                f7 = f5;
                            }
                            int round2 = Math.round(b5);
                            if (round2 > bVar.n()) {
                                round2 = bVar.n();
                                this.f11507b[i15] = true;
                                cVar2.f11497j -= bVar.b();
                                i11 = i8;
                                z4 = true;
                            } else {
                                f7 += b5 - ((float) round2);
                                i11 = i8;
                                double d7 = (double) f7;
                                if (d7 > 1.0d) {
                                    round2++;
                                    d5 = d7 - 1.0d;
                                } else if (d7 < -1.0d) {
                                    round2--;
                                    d5 = d7 + 1.0d;
                                }
                                f7 = (float) d5;
                            }
                            int A3 = A(i4, bVar, cVar2.f11500m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            i16.measure(A3, makeMeasureSpec2);
                            measuredWidth3 = i16.getMeasuredWidth();
                            int measuredHeight4 = i16.getMeasuredHeight();
                            Z(i15, A3, makeMeasureSpec2, i16);
                            this.f11506a.l(i15, i16);
                            measuredHeight3 = measuredHeight4;
                        }
                        i10 = Math.max(i14, measuredWidth3 + bVar.q() + bVar.i() + this.f11506a.n(i16));
                        cVar2.f11492e += measuredHeight3 + bVar.s() + bVar.p();
                        int i22 = i5;
                        i9 = i11;
                    }
                    cVar2.f11494g = Math.max(cVar2.f11494g, i10);
                    i14 = i10;
                }
                i13++;
                i8 = i9;
                f5 = 0.0f;
            }
            int i23 = i5;
            int i24 = i8;
            if (z4 && i24 != cVar2.f11492e) {
                w(i4, i5, cVar, i6, i7, true);
            }
        }
    }

    private int z(int i4, b bVar, int i5) {
        a aVar = this.f11506a;
        int e4 = aVar.e(i4, aVar.getPaddingTop() + this.f11506a.getPaddingBottom() + bVar.s() + bVar.p() + i5, bVar.c());
        int size = View.MeasureSpec.getSize(e4);
        if (size > bVar.n()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.n(), View.MeasureSpec.getMode(e4));
        }
        if (size < bVar.j()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.j(), View.MeasureSpec.getMode(e4));
        }
        return e4;
    }

    /* access modifiers changed from: package-private */
    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11506a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i4 = 0; i4 < flexItemCount; i4++) {
            View b4 = this.f11506a.b(i4);
            if (b4 != null && ((b) b4.getLayoutParams()).getOrder() != sparseIntArray.get(i4)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Q(View view, c cVar, int i4, int i5, int i6, int i7) {
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.f11506a.getAlignItems();
        if (bVar.f() != -1) {
            alignItems = bVar.f();
        }
        int i8 = cVar.f11494g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i8 - view.getMeasuredHeight()) + bVar.s()) - bVar.p()) / 2;
                    if (this.f11506a.getFlexWrap() != 2) {
                        int i9 = i5 + measuredHeight;
                        view.layout(i4, i9, i6, view.getMeasuredHeight() + i9);
                        return;
                    }
                    int i10 = i5 - measuredHeight;
                    view.layout(i4, i10, i6, view.getMeasuredHeight() + i10);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f11506a.getFlexWrap() != 2) {
                    int max = Math.max(cVar.f11499l - view.getBaseline(), bVar.s());
                    view.layout(i4, i5 + max, i6, i7 + max);
                    return;
                } else {
                    int max2 = Math.max((cVar.f11499l - view.getMeasuredHeight()) + view.getBaseline(), bVar.p());
                    view.layout(i4, i5 - max2, i6, i7 - max2);
                    return;
                }
            } else if (this.f11506a.getFlexWrap() != 2) {
                int i11 = i5 + i8;
                view.layout(i4, (i11 - view.getMeasuredHeight()) - bVar.p(), i6, i11 - bVar.p());
                return;
            } else {
                view.layout(i4, (i5 - i8) + view.getMeasuredHeight() + bVar.s(), i6, (i7 - i8) + view.getMeasuredHeight() + bVar.s());
                return;
            }
        }
        if (this.f11506a.getFlexWrap() != 2) {
            view.layout(i4, i5 + bVar.s(), i6, i7 + bVar.s());
        } else {
            view.layout(i4, i5 - bVar.p(), i6, i7 - bVar.p());
        }
    }

    /* access modifiers changed from: package-private */
    public void R(View view, c cVar, boolean z3, int i4, int i5, int i6, int i7) {
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.f11506a.getAlignItems();
        if (bVar.f() != -1) {
            alignItems = bVar.f();
        }
        int i8 = cVar.f11494g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i8 - view.getMeasuredWidth()) + r.b(marginLayoutParams)) - r.a(marginLayoutParams)) / 2;
                    if (!z3) {
                        view.layout(i4 + measuredWidth, i5, i6 + measuredWidth, i7);
                        return;
                    } else {
                        view.layout(i4 - measuredWidth, i5, i6 - measuredWidth, i7);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z3) {
                view.layout(((i4 + i8) - view.getMeasuredWidth()) - bVar.i(), i5, ((i6 + i8) - view.getMeasuredWidth()) - bVar.i(), i7);
                return;
            } else {
                view.layout((i4 - i8) + view.getMeasuredWidth() + bVar.q(), i5, (i6 - i8) + view.getMeasuredWidth() + bVar.q(), i7);
                return;
            }
        }
        if (!z3) {
            view.layout(i4 + bVar.q(), i5, i6 + bVar.q(), i7);
        } else {
            view.layout(i4 - bVar.i(), i5, i6 - bVar.i(), i7);
        }
    }

    /* access modifiers changed from: package-private */
    public long S(int i4, int i5) {
        return (((long) i4) & 4294967295L) | (((long) i5) << 32);
    }

    /* access modifiers changed from: package-private */
    public void X() {
        Y(0);
    }

    /* access modifiers changed from: package-private */
    public void Y(int i4) {
        int i5;
        View i6;
        int i7 = i4;
        if (i7 < this.f11506a.getFlexItemCount()) {
            int flexDirection = this.f11506a.getFlexDirection();
            if (this.f11506a.getAlignItems() == 4) {
                int[] iArr = this.f11508c;
                if (iArr != null) {
                    i5 = iArr[i7];
                } else {
                    i5 = 0;
                }
                List flexLinesInternal = this.f11506a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i5 < size) {
                    c cVar = (c) flexLinesInternal.get(i5);
                    int i8 = cVar.f11495h;
                    for (int i9 = 0; i9 < i8; i9++) {
                        int i10 = cVar.f11502o + i9;
                        if (!(i9 >= this.f11506a.getFlexItemCount() || (i6 = this.f11506a.i(i10)) == null || i6.getVisibility() == 8)) {
                            b bVar = (b) i6.getLayoutParams();
                            if (bVar.f() == -1 || bVar.f() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    W(i6, cVar.f11494g, i10);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    V(i6, cVar.f11494g, i10);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                    i5++;
                }
                return;
            }
            for (c cVar2 : this.f11506a.getFlexLinesInternal()) {
                Iterator it = cVar2.f11501n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View i11 = this.f11506a.i(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(i11, cVar2.f11494g, num.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            V(i11, cVar2.f11494g, num.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(b bVar, int i4, int i5, int i6, int i7, int i8, List list) {
        ArrayList arrayList;
        boolean z3;
        int i9;
        int i10;
        b bVar2;
        int i11;
        int i12;
        List list2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        View view;
        boolean z4;
        boolean z5;
        boolean z6;
        int i21;
        int i22;
        b bVar3 = bVar;
        int i23 = i4;
        int i24 = i5;
        int i25 = i8;
        boolean m4 = this.f11506a.m();
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        bVar3.f11511a = arrayList;
        if (i25 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int K3 = K(m4);
        int I3 = I(m4);
        int J3 = J(m4);
        int H3 = H(m4);
        c cVar = new c();
        int i26 = i7;
        cVar.f11502o = i26;
        int i27 = I3 + K3;
        cVar.f11492e = i27;
        int flexItemCount = this.f11506a.getFlexItemCount();
        boolean z7 = z3;
        int i28 = Integer.MIN_VALUE;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            if (i9 >= flexItemCount) {
                i10 = i30;
                bVar2 = bVar;
                break;
            }
            View i32 = this.f11506a.i(i9);
            if (i32 != null) {
                if (i32.getVisibility() != 8) {
                    if (i32 instanceof CompoundButton) {
                        v((CompoundButton) i32);
                    }
                    b bVar4 = (b) i32.getLayoutParams();
                    int i33 = flexItemCount;
                    if (bVar4.f() == 4) {
                        cVar.f11501n.add(Integer.valueOf(i9));
                    }
                    int G3 = G(bVar4, m4);
                    if (bVar4.e() != -1.0f && mode == 1073741824) {
                        G3 = Math.round(((float) size) * bVar4.e());
                    }
                    if (m4) {
                        int k4 = this.f11506a.k(i23, i27 + E(bVar4, true) + C(bVar4, true), G3);
                        i12 = size;
                        i11 = mode;
                        int e4 = this.f11506a.e(i24, J3 + H3 + D(bVar4, true) + B(bVar4, true) + i29, F(bVar4, true));
                        i32.measure(k4, e4);
                        Z(i9, k4, e4, i32);
                        i17 = k4;
                    } else {
                        i12 = size;
                        i11 = mode;
                        int k5 = this.f11506a.k(i24, J3 + H3 + D(bVar4, false) + B(bVar4, false) + i29, F(bVar4, false));
                        int e5 = this.f11506a.e(i23, E(bVar4, false) + i27 + C(bVar4, false), G3);
                        i32.measure(k5, e5);
                        Z(i9, k5, e5, i32);
                        i17 = e5;
                    }
                    this.f11506a.l(i9, i32);
                    i(i32, i9);
                    i30 = View.combineMeasuredStates(i30, i32.getMeasuredState());
                    int i34 = i29;
                    int i35 = i33;
                    c cVar2 = cVar;
                    int i36 = i27;
                    int i37 = i9;
                    View view2 = i32;
                    list2 = arrayList;
                    int i38 = i17;
                    if (P(i32, i11, i12, cVar.f11492e, C(bVar4, m4) + M(i32, m4) + E(bVar4, m4), bVar4, i37, i31, arrayList.size())) {
                        i9 = i37;
                        if (cVar2.c() > 0) {
                            if (i9 > 0) {
                                i22 = i9 - 1;
                            } else {
                                i22 = 0;
                            }
                            c cVar3 = cVar2;
                            a(list2, cVar3, i22, i34);
                            i29 = cVar3.f11494g + i34;
                        } else {
                            i29 = i34;
                        }
                        if (!m4) {
                            i15 = i5;
                            view = view2;
                            i19 = -1;
                            int i39 = i38;
                            if (bVar4.m() == -1) {
                                a aVar = this.f11506a;
                                view.measure(aVar.k(i15, aVar.getPaddingLeft() + this.f11506a.getPaddingRight() + bVar4.q() + bVar4.i() + i29, bVar4.m()), i39);
                                i(view, i9);
                            }
                        } else if (bVar4.c() == -1) {
                            a aVar2 = this.f11506a;
                            i15 = i5;
                            i19 = -1;
                            view = view2;
                            view.measure(i38, aVar2.e(i15, aVar2.getPaddingTop() + this.f11506a.getPaddingBottom() + bVar4.s() + bVar4.p() + i29, bVar4.c()));
                            i(view, i9);
                        } else {
                            i15 = i5;
                            view = view2;
                            i19 = -1;
                        }
                        cVar = new c();
                        z4 = true;
                        cVar.f11495h = 1;
                        i14 = i36;
                        cVar.f11492e = i14;
                        cVar.f11502o = i9;
                        i18 = Integer.MIN_VALUE;
                        i20 = 0;
                    } else {
                        i15 = i5;
                        i9 = i37;
                        view = view2;
                        i19 = -1;
                        cVar = cVar2;
                        i14 = i36;
                        z4 = true;
                        cVar.f11495h++;
                        i20 = i31 + 1;
                        i29 = i34;
                        i18 = i28;
                    }
                    boolean z8 = cVar.f11504q;
                    if (bVar4.b() != 0.0f) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    cVar.f11504q = z8 | z5;
                    boolean z9 = cVar.f11505r;
                    if (bVar4.g() != 0.0f) {
                        z6 = z4;
                    } else {
                        z6 = false;
                    }
                    cVar.f11505r = z9 | z6;
                    int[] iArr = this.f11508c;
                    if (iArr != null) {
                        iArr[i9] = list2.size();
                    }
                    cVar.f11492e += M(view, m4) + E(bVar4, m4) + C(bVar4, m4);
                    cVar.f11497j += bVar4.b();
                    cVar.f11498k += bVar4.g();
                    this.f11506a.g(view, i9, i20, cVar);
                    int max = Math.max(i18, L(view, m4) + D(bVar4, m4) + B(bVar4, m4) + this.f11506a.n(view));
                    cVar.f11494g = Math.max(cVar.f11494g, max);
                    if (m4) {
                        if (this.f11506a.getFlexWrap() != 2) {
                            cVar.f11499l = Math.max(cVar.f11499l, view.getBaseline() + bVar4.s());
                        } else {
                            cVar.f11499l = Math.max(cVar.f11499l, (view.getMeasuredHeight() - view.getBaseline()) + bVar4.p());
                        }
                    }
                    i16 = i33;
                    if (N(i9, i16, cVar)) {
                        a(list2, cVar, i9, i29);
                        i29 += cVar.f11494g;
                    }
                    i13 = i8;
                    if (i13 == i19 || list2.size() <= 0 || ((c) list2.get(list2.size() - (z4 ? 1 : 0))).f11503p < i13 || i9 < i13 || z7) {
                        i21 = i6;
                    } else {
                        i29 = -cVar.a();
                        i21 = i6;
                        z7 = z4;
                    }
                    if (i29 > i21 && z7) {
                        bVar2 = bVar;
                        i10 = i30;
                        break;
                    }
                    i31 = i20;
                    i28 = max;
                    i26 = i9 + 1;
                    i23 = i4;
                    flexItemCount = i16;
                    i24 = i15;
                    i27 = i14;
                    arrayList = list2;
                    size = i12;
                    mode = i11;
                    i25 = i13;
                    b bVar5 = bVar;
                } else {
                    cVar.f11496i++;
                    cVar.f11495h++;
                    if (N(i9, flexItemCount, cVar)) {
                        a(arrayList, cVar, i9, i29);
                    }
                }
            } else if (N(i9, flexItemCount, cVar)) {
                a(arrayList, cVar, i9, i29);
            }
            int i40 = i6;
            i12 = size;
            i11 = mode;
            i15 = i24;
            i13 = i25;
            i14 = i27;
            list2 = arrayList;
            i16 = flexItemCount;
            i26 = i9 + 1;
            i23 = i4;
            flexItemCount = i16;
            i24 = i15;
            i27 = i14;
            arrayList = list2;
            size = i12;
            mode = i11;
            i25 = i13;
            b bVar52 = bVar;
        }
        bVar2.f11512b = i10;
    }

    /* access modifiers changed from: package-private */
    public void c(b bVar, int i4, int i5) {
        b(bVar, i4, i5, Integer.MAX_VALUE, 0, -1, (List) null);
    }

    /* access modifiers changed from: package-private */
    public void d(b bVar, int i4, int i5, int i6, int i7, List list) {
        b(bVar, i4, i5, i6, i7, -1, list);
    }

    /* access modifiers changed from: package-private */
    public void e(b bVar, int i4, int i5, int i6, int i7, List list) {
        b(bVar, i4, i5, i6, 0, i7, list);
    }

    /* access modifiers changed from: package-private */
    public void f(b bVar, int i4, int i5) {
        b(bVar, i5, i4, Integer.MAX_VALUE, 0, -1, (List) null);
    }

    /* access modifiers changed from: package-private */
    public void g(b bVar, int i4, int i5, int i6, int i7, List list) {
        b(bVar, i5, i4, i6, i7, -1, list);
    }

    /* access modifiers changed from: package-private */
    public void h(b bVar, int i4, int i5, int i6, int i7, List list) {
        b(bVar, i5, i4, i6, 0, i7, list);
    }

    /* access modifiers changed from: package-private */
    public void j(List list, int i4) {
        int i5 = this.f11508c[i4];
        if (i5 == -1) {
            i5 = 0;
        }
        if (list.size() > i5) {
            list.subList(i5, list.size()).clear();
        }
        int[] iArr = this.f11508c;
        int length = iArr.length - 1;
        if (i4 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i4, length, -1);
        }
        long[] jArr = this.f11509d;
        int length2 = jArr.length - 1;
        if (i4 > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i4, length2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11506a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    public int[] n(View view, int i4, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11506a.getFlexItemCount();
        List l4 = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof b)) {
            cVar.f11514b = 1;
        } else {
            cVar.f11514b = ((b) layoutParams).getOrder();
        }
        if (i4 == -1 || i4 == flexItemCount) {
            cVar.f11513a = flexItemCount;
        } else if (i4 < this.f11506a.getFlexItemCount()) {
            cVar.f11513a = i4;
            while (i4 < flexItemCount) {
                ((c) l4.get(i4)).f11513a++;
                i4++;
            }
        } else {
            cVar.f11513a = flexItemCount;
        }
        l4.add(cVar);
        return U(flexItemCount + 1, l4, sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    public void o(int i4, int i5, int i6) {
        int i7;
        int i8;
        int flexDirection = this.f11506a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            i7 = mode;
            i8 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i7 = View.MeasureSpec.getMode(i4);
            i8 = View.MeasureSpec.getSize(i4);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<c> flexLinesInternal = this.f11506a.getFlexLinesInternal();
        if (i7 == 1073741824) {
            int sumOfCrossSize = this.f11506a.getSumOfCrossSize() + i6;
            int i9 = 0;
            if (flexLinesInternal.size() == 1) {
                ((c) flexLinesInternal.get(0)).f11494g = i8 - i6;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f11506a.getAlignContent();
                if (alignContent == 1) {
                    int i10 = i8 - sumOfCrossSize;
                    c cVar = new c();
                    cVar.f11494g = i10;
                    flexLinesInternal.add(0, cVar);
                } else if (alignContent == 2) {
                    this.f11506a.setFlexLines(k(flexLinesInternal, i8, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i8) {
                            float size2 = ((float) (i8 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f4 = 0.0f;
                            while (i9 < size3) {
                                c cVar2 = (c) flexLinesInternal.get(i9);
                                float f5 = ((float) cVar2.f11494g) + size2;
                                if (i9 == flexLinesInternal.size() - 1) {
                                    f5 += f4;
                                    f4 = 0.0f;
                                }
                                int round = Math.round(f5);
                                f4 += f5 - ((float) round);
                                if (f4 > 1.0f) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (f4 < -1.0f) {
                                    round--;
                                    f4 += 1.0f;
                                }
                                cVar2.f11494g = round;
                                i9++;
                            }
                        }
                    } else if (sumOfCrossSize >= i8) {
                        this.f11506a.setFlexLines(k(flexLinesInternal, i8, sumOfCrossSize));
                    } else {
                        int size4 = (i8 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        c cVar3 = new c();
                        cVar3.f11494g = size4;
                        for (c add : flexLinesInternal) {
                            arrayList.add(cVar3);
                            arrayList.add(add);
                            arrayList.add(cVar3);
                        }
                        this.f11506a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i8) {
                    float size5 = ((float) (i8 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f6 = 0.0f;
                    while (i9 < size6) {
                        arrayList2.add((c) flexLinesInternal.get(i9));
                        if (i9 != flexLinesInternal.size() - 1) {
                            c cVar4 = new c();
                            if (i9 == flexLinesInternal.size() - 2) {
                                cVar4.f11494g = Math.round(f6 + size5);
                                f6 = 0.0f;
                            } else {
                                cVar4.f11494g = Math.round(size5);
                            }
                            int i11 = cVar4.f11494g;
                            f6 += size5 - ((float) i11);
                            if (f6 > 1.0f) {
                                cVar4.f11494g = i11 + 1;
                                f6 -= 1.0f;
                            } else if (f6 < -1.0f) {
                                cVar4.f11494g = i11 - 1;
                                f6 += 1.0f;
                            }
                            arrayList2.add(cVar4);
                        }
                        i9++;
                    }
                    this.f11506a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i4, int i5) {
        q(i4, i5, 0);
    }

    /* access modifiers changed from: package-private */
    public void q(int i4, int i5, int i6) {
        int i7;
        int paddingLeft;
        int paddingRight;
        int i8;
        r(this.f11506a.getFlexItemCount());
        if (i6 < this.f11506a.getFlexItemCount()) {
            int flexDirection = this.f11506a.getFlexDirection();
            int flexDirection2 = this.f11506a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i4);
                int size = View.MeasureSpec.getSize(i4);
                int largestMainSize = this.f11506a.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                paddingLeft = this.f11506a.getPaddingLeft();
                paddingRight = this.f11506a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i5);
                i7 = View.MeasureSpec.getSize(i5);
                if (mode2 != 1073741824) {
                    i7 = this.f11506a.getLargestMainSize();
                }
                paddingLeft = this.f11506a.getPaddingTop();
                paddingRight = this.f11506a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i9 = paddingLeft + paddingRight;
            int[] iArr = this.f11508c;
            if (iArr != null) {
                i8 = iArr[i6];
            } else {
                i8 = 0;
            }
            List flexLinesInternal = this.f11506a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i8 < size2) {
                c cVar = (c) flexLinesInternal.get(i8);
                int i10 = cVar.f11492e;
                if (i10 < i7 && cVar.f11504q) {
                    w(i4, i5, cVar, i7, i9, false);
                } else if (i10 > i7 && cVar.f11505r) {
                    T(i4, i5, cVar, i7, i9, false);
                }
                i8++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i4) {
        int[] iArr = this.f11508c;
        if (iArr == null) {
            this.f11508c = new int[Math.max(i4, 10)];
        } else if (iArr.length < i4) {
            this.f11508c = Arrays.copyOf(this.f11508c, Math.max(iArr.length * 2, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i4) {
        long[] jArr = this.f11509d;
        if (jArr == null) {
            this.f11509d = new long[Math.max(i4, 10)];
        } else if (jArr.length < i4) {
            this.f11509d = Arrays.copyOf(this.f11509d, Math.max(jArr.length * 2, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i4) {
        long[] jArr = this.f11510e;
        if (jArr == null) {
            this.f11510e = new long[Math.max(i4, 10)];
        } else if (jArr.length < i4) {
            this.f11510e = Arrays.copyOf(this.f11510e, Math.max(jArr.length * 2, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public int x(long j4) {
        return (int) (j4 >> 32);
    }

    /* access modifiers changed from: package-private */
    public int y(long j4) {
        return (int) j4;
    }
}
