package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f11781a;

    /* renamed from: b  reason: collision with root package name */
    private final List f11782b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11783c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11784d;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f11785a;

        /* renamed from: b  reason: collision with root package name */
        private final List f11786b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private c f11787c;

        /* renamed from: d  reason: collision with root package name */
        private c f11788d;

        /* renamed from: e  reason: collision with root package name */
        private int f11789e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f11790f = -1;

        /* renamed from: g  reason: collision with root package name */
        private float f11791g = 0.0f;

        b(float f4) {
            this.f11785a = f4;
        }

        private static float f(float f4, float f5, int i4, int i5) {
            return (f4 - (((float) i4) * f5)) + (((float) i5) * f5);
        }

        /* access modifiers changed from: package-private */
        public b a(float f4, float f5, float f6) {
            return b(f4, f5, f6, false);
        }

        /* access modifiers changed from: package-private */
        public b b(float f4, float f5, float f6, boolean z3) {
            if (f6 <= 0.0f) {
                return this;
            }
            c cVar = new c(Float.MIN_VALUE, f4, f5, f6);
            if (z3) {
                if (this.f11787c == null) {
                    this.f11787c = cVar;
                    this.f11789e = this.f11786b.size();
                }
                if (this.f11790f != -1 && this.f11786b.size() - this.f11790f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                } else if (f6 == this.f11787c.f11795d) {
                    this.f11788d = cVar;
                    this.f11790f = this.f11786b.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.f11787c == null && cVar.f11795d < this.f11791g) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else if (this.f11788d != null && cVar.f11795d > this.f11791g) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
            this.f11791g = cVar.f11795d;
            this.f11786b.add(cVar);
            return this;
        }

        /* access modifiers changed from: package-private */
        public b c(float f4, float f5, float f6, int i4) {
            return d(f4, f5, f6, i4, false);
        }

        /* access modifiers changed from: package-private */
        public b d(float f4, float f5, float f6, int i4, boolean z3) {
            if (i4 > 0 && f6 > 0.0f) {
                for (int i5 = 0; i5 < i4; i5++) {
                    b((((float) i5) * f6) + f4, f5, f6, z3);
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public f e() {
            if (this.f11787c != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < this.f11786b.size(); i4++) {
                    c cVar = (c) this.f11786b.get(i4);
                    arrayList.add(new c(f(this.f11787c.f11793b, this.f11785a, this.f11789e, i4), cVar.f11793b, cVar.f11794c, cVar.f11795d));
                }
                return new f(this.f11785a, arrayList, this.f11789e, this.f11790f);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        final float f11792a;

        /* renamed from: b  reason: collision with root package name */
        final float f11793b;

        /* renamed from: c  reason: collision with root package name */
        final float f11794c;

        /* renamed from: d  reason: collision with root package name */
        final float f11795d;

        c(float f4, float f5, float f6, float f7) {
            this.f11792a = f4;
            this.f11793b = f5;
            this.f11794c = f6;
            this.f11795d = f7;
        }

        static c a(c cVar, c cVar2, float f4) {
            return new c(A1.a.a(cVar.f11792a, cVar2.f11792a, f4), A1.a.a(cVar.f11793b, cVar2.f11793b, f4), A1.a.a(cVar.f11794c, cVar2.f11794c, f4), A1.a.a(cVar.f11795d, cVar2.f11795d, f4));
        }
    }

    static f i(f fVar, f fVar2, float f4) {
        if (fVar.d() == fVar2.d()) {
            List e4 = fVar.e();
            List e5 = fVar2.e();
            if (e4.size() == e5.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < fVar.e().size(); i4++) {
                    arrayList.add(c.a((c) e4.get(i4), (c) e5.get(i4), f4));
                }
                return new f(fVar.d(), arrayList, A1.a.c(fVar.b(), fVar2.b(), f4), A1.a.c(fVar.g(), fVar2.g(), f4));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    static f j(f fVar) {
        boolean z3;
        b bVar = new b(fVar.d());
        float f4 = fVar.c().f11793b - (fVar.c().f11795d / 2.0f);
        for (int size = fVar.e().size() - 1; size >= 0; size--) {
            c cVar = (c) fVar.e().get(size);
            float f5 = (cVar.f11795d / 2.0f) + f4;
            if (size < fVar.b() || size > fVar.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            bVar.b(f5, cVar.f11794c, cVar.f11795d, z3);
            f4 += cVar.f11795d;
        }
        return bVar.e();
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return (c) this.f11782b.get(this.f11783c);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f11783c;
    }

    /* access modifiers changed from: package-private */
    public c c() {
        return (c) this.f11782b.get(0);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f11781a;
    }

    /* access modifiers changed from: package-private */
    public List e() {
        return this.f11782b;
    }

    /* access modifiers changed from: package-private */
    public c f() {
        return (c) this.f11782b.get(this.f11784d);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f11784d;
    }

    /* access modifiers changed from: package-private */
    public c h() {
        List list = this.f11782b;
        return (c) list.get(list.size() - 1);
    }

    private f(float f4, List list, int i4, int i5) {
        this.f11781a = f4;
        this.f11782b = Collections.unmodifiableList(list);
        this.f11783c = i4;
        this.f11784d = i5;
    }
}
