package com.google.android.material.carousel;

import A1.a;
import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final f f11796a;

    /* renamed from: b  reason: collision with root package name */
    private final List f11797b;

    /* renamed from: c  reason: collision with root package name */
    private final List f11798c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f11799d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f11800e;

    /* renamed from: f  reason: collision with root package name */
    private final float f11801f;

    /* renamed from: g  reason: collision with root package name */
    private final float f11802g;

    private g(f fVar, List list, List list2) {
        this.f11796a = fVar;
        this.f11797b = Collections.unmodifiableList(list);
        this.f11798c = Collections.unmodifiableList(list2);
        float f4 = ((f) list.get(list.size() - 1)).c().f11792a - fVar.c().f11792a;
        this.f11801f = f4;
        float f5 = fVar.h().f11792a - ((f) list2.get(list2.size() - 1)).h().f11792a;
        this.f11802g = f5;
        this.f11799d = m(f4, list, true);
        this.f11800e = m(f5, list2, false);
    }

    private f a(List list, float f4, float[] fArr) {
        float[] o4 = o(list, f4, fArr);
        if (o4[0] > 0.5f) {
            return (f) list.get((int) o4[2]);
        }
        return (f) list.get((int) o4[1]);
    }

    private static int b(f fVar) {
        for (int i4 = 0; i4 < fVar.e().size(); i4++) {
            if (((f.c) fVar.e().get(i4)).f11793b >= 0.0f) {
                return i4;
            }
        }
        return -1;
    }

    private static int c(f fVar, float f4) {
        for (int g4 = fVar.g(); g4 < fVar.e().size(); g4++) {
            if (f4 == ((f.c) fVar.e().get(g4)).f11794c) {
                return g4;
            }
        }
        return fVar.e().size() - 1;
    }

    private static int d(b bVar, f fVar) {
        int d4 = bVar.d();
        if (bVar.j()) {
            d4 = bVar.a();
        }
        for (int size = fVar.e().size() - 1; size >= 0; size--) {
            if (((f.c) fVar.e().get(size)).f11793b <= ((float) d4)) {
                return size;
            }
        }
        return -1;
    }

    private static int e(f fVar, float f4) {
        for (int b4 = fVar.b() - 1; b4 >= 0; b4--) {
            if (f4 == ((f.c) fVar.e().get(b4)).f11794c) {
                return b4;
            }
        }
        return 0;
    }

    static g f(b bVar, f fVar) {
        return new g(fVar, p(fVar), n(bVar, fVar));
    }

    private static float[] m(float f4, List list, boolean z3) {
        float f5;
        float f6;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i4 = 1; i4 < size; i4++) {
            int i5 = i4 - 1;
            f fVar = (f) list.get(i5);
            f fVar2 = (f) list.get(i4);
            if (z3) {
                f5 = fVar2.c().f11792a - fVar.c().f11792a;
            } else {
                f5 = fVar.h().f11792a - fVar2.h().f11792a;
            }
            float f7 = f5 / f4;
            if (i4 == size - 1) {
                f6 = 1.0f;
            } else {
                f6 = fArr[i5] + f7;
            }
            fArr[i4] = f6;
        }
        return fArr;
    }

    private static List n(b bVar, f fVar) {
        int i4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int d4 = d(bVar, fVar);
        if (!r(bVar, fVar) && d4 != -1) {
            int g4 = d4 - fVar.g();
            float f4 = fVar.c().f11793b - (fVar.c().f11795d / 2.0f);
            for (int i5 = 0; i5 < g4; i5++) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i6 = (d4 - i5) + 1;
                if (i6 < fVar.e().size()) {
                    i4 = e(fVar2, ((f.c) fVar.e().get(i6)).f11794c) + 1;
                } else {
                    i4 = 0;
                }
                arrayList.add(t(fVar2, d4, i4, f4, fVar.b() + i5 + 1, fVar.g() + i5 + 1));
            }
        }
        return arrayList;
    }

    private static float[] o(List list, float f4, float[] fArr) {
        int size = list.size();
        float f5 = fArr[0];
        int i4 = 1;
        while (i4 < size) {
            float f6 = fArr[i4];
            if (f4 <= f6) {
                return new float[]{a.b(0.0f, 1.0f, f5, f6, f4), (float) (i4 - 1), (float) i4};
            }
            i4++;
            f5 = f6;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(f fVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int b4 = b(fVar);
        if (!q(fVar) && b4 != -1) {
            int b5 = (fVar.b() - 1) - b4;
            float f4 = fVar.c().f11793b - (fVar.c().f11795d / 2.0f);
            for (int i4 = 0; i4 <= b5; i4++) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int size = fVar.e().size() - 1;
                int i5 = (b4 + i4) - 1;
                if (i5 >= 0) {
                    size = c(fVar2, ((f.c) fVar.e().get(i5)).f11794c) - 1;
                }
                arrayList.add(t(fVar2, b4, size, f4, (fVar.b() - i4) - 1, (fVar.g() - i4) - 1));
            }
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        if (fVar.a().f11793b - (fVar.a().f11795d / 2.0f) <= 0.0f || fVar.a() == fVar.c()) {
            return true;
        }
        return false;
    }

    private static boolean r(b bVar, f fVar) {
        int d4 = bVar.d();
        if (bVar.j()) {
            d4 = bVar.a();
        }
        if (fVar.f().f11793b + (fVar.f().f11795d / 2.0f) >= ((float) d4) || fVar.f() == fVar.h()) {
            return true;
        }
        return false;
    }

    private static f s(List list, float f4, float[] fArr) {
        float[] o4 = o(list, f4, fArr);
        return f.i((f) list.get((int) o4[1]), (f) list.get((int) o4[2]), o4[0]);
    }

    private static f t(f fVar, int i4, int i5, float f4, int i6, int i7) {
        boolean z3;
        ArrayList arrayList = new ArrayList(fVar.e());
        arrayList.add(i5, (f.c) arrayList.remove(i4));
        f.b bVar = new f.b(fVar.d());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            f.c cVar = (f.c) arrayList.get(i8);
            float f5 = cVar.f11795d;
            float f6 = (f5 / 2.0f) + f4;
            if (i8 < i6 || i8 > i7) {
                z3 = false;
            } else {
                z3 = true;
            }
            bVar.b(f6, cVar.f11794c, f5, z3);
            f4 += cVar.f11795d;
        }
        return bVar.e();
    }

    /* access modifiers changed from: package-private */
    public f g() {
        return this.f11796a;
    }

    /* access modifiers changed from: package-private */
    public f h() {
        List list = this.f11798c;
        return (f) list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public Map i(int i4, int i5, int i6, boolean z3) {
        int i7;
        int i8;
        int i9;
        float d4 = this.f11796a.d();
        HashMap hashMap = new HashMap();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = -1;
            if (i10 >= i4) {
                break;
            }
            if (z3) {
                i9 = (i4 - i10) - 1;
            } else {
                i9 = i10;
            }
            float f4 = ((float) i9) * d4;
            if (!z3) {
                i12 = 1;
            }
            if (f4 * ((float) i12) > ((float) i6) - this.f11802g || i10 >= i4 - this.f11798c.size()) {
                Integer valueOf = Integer.valueOf(i9);
                List list = this.f11798c;
                hashMap.put(valueOf, (f) list.get(I.a.b(i11, 0, list.size() - 1)));
                i11++;
            }
            i10++;
        }
        int i13 = 0;
        for (int i14 = i4 - 1; i14 >= 0; i14--) {
            if (z3) {
                i7 = (i4 - i14) - 1;
            } else {
                i7 = i14;
            }
            float f5 = ((float) i7) * d4;
            if (z3) {
                i8 = -1;
            } else {
                i8 = 1;
            }
            if (f5 * ((float) i8) < ((float) i5) + this.f11801f || i14 < this.f11797b.size()) {
                Integer valueOf2 = Integer.valueOf(i7);
                List list2 = this.f11797b;
                hashMap.put(valueOf2, (f) list2.get(I.a.b(i13, 0, list2.size() - 1)));
                i13++;
            }
        }
        return hashMap;
    }

    public f j(float f4, float f5, float f6) {
        return k(f4, f5, f6, false);
    }

    /* access modifiers changed from: package-private */
    public f k(float f4, float f5, float f6, boolean z3) {
        float[] fArr;
        List list;
        float f7;
        float f8 = this.f11801f + f5;
        float f9 = f6 - this.f11802g;
        if (f4 < f8) {
            f7 = a.b(1.0f, 0.0f, f5, f8, f4);
            list = this.f11797b;
            fArr = this.f11799d;
        } else if (f4 <= f9) {
            return this.f11796a;
        } else {
            f7 = a.b(0.0f, 1.0f, f9, f6, f4);
            list = this.f11798c;
            fArr = this.f11800e;
        }
        if (z3) {
            return a(list, f7, fArr);
        }
        return s(list, f7, fArr);
    }

    /* access modifiers changed from: package-private */
    public f l() {
        List list = this.f11797b;
        return (f) list.get(list.size() - 1);
    }
}
