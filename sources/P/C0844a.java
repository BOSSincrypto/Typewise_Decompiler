package p;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.T;
import androidx.core.content.res.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.C0845b;
import p.C0847d;
import q.C0856b;
import q.C0857c;
import y.C0942d;
import y.h;

/* renamed from: p.a  reason: case insensitive filesystem */
public class C0844a extends C0847d {

    /* renamed from: o  reason: collision with root package name */
    private c f15758o;

    /* renamed from: p  reason: collision with root package name */
    private g f15759p;

    /* renamed from: q  reason: collision with root package name */
    private int f15760q;

    /* renamed from: r  reason: collision with root package name */
    private int f15761r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15762s;

    /* renamed from: p.a$b */
    private static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f15763a;

        b(Animatable animatable) {
            super();
            this.f15763a = animatable;
        }

        public void c() {
            this.f15763a.start();
        }

        public void d() {
            this.f15763a.stop();
        }
    }

    /* renamed from: p.a$c */
    static class c extends C0847d.a {

        /* renamed from: K  reason: collision with root package name */
        C0942d f15764K;

        /* renamed from: L  reason: collision with root package name */
        h f15765L;

        c(c cVar, C0844a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f15764K = cVar.f15764K;
                this.f15765L = cVar.f15765L;
                return;
            }
            this.f15764K = new C0942d();
            this.f15765L = new h();
        }

        private static long D(int i4, int i5) {
            return ((long) i5) | (((long) i4) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i4) {
            int z3 = super.z(iArr, drawable);
            this.f15765L.n(z3, Integer.valueOf(i4));
            return z3;
        }

        /* access modifiers changed from: package-private */
        public int C(int i4, int i5, Drawable drawable, boolean z3) {
            long j4;
            int a4 = super.a(drawable);
            long D3 = D(i4, i5);
            if (z3) {
                j4 = 8589934592L;
            } else {
                j4 = 0;
            }
            long j5 = (long) a4;
            this.f15764K.b(D3, Long.valueOf(j5 | j4));
            if (z3) {
                this.f15764K.b(D(i5, i4), Long.valueOf(4294967296L | j5 | j4));
            }
            return a4;
        }

        /* access modifiers changed from: package-private */
        public int E(int i4) {
            if (i4 < 0) {
                return 0;
            }
            return ((Integer) this.f15765L.j(i4, 0)).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A3 = super.A(iArr);
            if (A3 >= 0) {
                return A3;
            }
            return super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i4, int i5) {
            return (int) ((Long) this.f15764K.j(D(i4, i5), -1L)).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i4, int i5) {
            if ((((Long) this.f15764K.j(D(i4, i5), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i4, int i5) {
            if ((((Long) this.f15764K.j(D(i4, i5), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable() {
            return new C0844a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.f15764K = this.f15764K.clone();
            this.f15765L = this.f15765L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C0844a(this, resources);
        }
    }

    /* renamed from: p.a$d */
    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f15766a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f15766a = cVar;
        }

        public void c() {
            this.f15766a.start();
        }

        public void d() {
            this.f15766a.stop();
        }
    }

    /* renamed from: p.a$e */
    private static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f15767a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15768b;

        e(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
            super();
            int i4;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i5 = 0;
            if (z3) {
                i4 = numberOfFrames - 1;
            } else {
                i4 = 0;
            }
            i5 = !z3 ? numberOfFrames - 1 : i5;
            f fVar = new f(animationDrawable, z3);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i4, i5});
            C0856b.a(ofInt, true);
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f15768b = z4;
            this.f15767a = ofInt;
        }

        public boolean a() {
            return this.f15768b;
        }

        public void b() {
            this.f15767a.reverse();
        }

        public void c() {
            this.f15767a.start();
        }

        public void d() {
            this.f15767a.cancel();
        }
    }

    /* renamed from: p.a$f */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f15769a;

        /* renamed from: b  reason: collision with root package name */
        private int f15770b;

        /* renamed from: c  reason: collision with root package name */
        private int f15771c;

        f(AnimationDrawable animationDrawable, boolean z3) {
            b(animationDrawable, z3);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f15771c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z3) {
            int i4;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f15770b = numberOfFrames;
            int[] iArr = this.f15769a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f15769a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f15769a;
            int i5 = 0;
            for (int i6 = 0; i6 < numberOfFrames; i6++) {
                if (z3) {
                    i4 = (numberOfFrames - i6) - 1;
                } else {
                    i4 = i6;
                }
                int duration = animationDrawable.getDuration(i4);
                iArr2[i6] = duration;
                i5 += duration;
            }
            this.f15771c = i5;
            return i5;
        }

        public float getInterpolation(float f4) {
            float f5;
            int i4 = (int) ((f4 * ((float) this.f15771c)) + 0.5f);
            int i5 = this.f15770b;
            int[] iArr = this.f15769a;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = iArr[i6];
                if (i4 < i7) {
                    break;
                }
                i4 -= i7;
                i6++;
            }
            if (i6 < i5) {
                f5 = ((float) i4) / ((float) this.f15771c);
            } else {
                f5 = 0.0f;
            }
            return (((float) i6) / ((float) i5)) + f5;
        }
    }

    /* renamed from: p.a$g */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public C0844a() {
        this((c) null, (Resources) null);
    }

    public static C0844a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0844a aVar = new C0844a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        p(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray k4 = k.k(resources, theme, attributeSet, q.e.f15908h);
        int resourceId = k4.getResourceId(q.e.f15909i, 0);
        int resourceId2 = k4.getResourceId(q.e.f15910j, -1);
        if (resourceId2 > 0) {
            drawable = T.h().j(context, resourceId2);
        } else {
            drawable = null;
        }
        k4.recycle();
        int[] j4 = j(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.h.c(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C0857c.a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            return this.f15758o.B(j4, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray k4 = k.k(resources, theme, attributeSet, q.e.f15911k);
        int resourceId = k4.getResourceId(q.e.f15914n, -1);
        int resourceId2 = k4.getResourceId(q.e.f15913m, -1);
        int resourceId3 = k4.getResourceId(q.e.f15912l, -1);
        if (resourceId3 > 0) {
            drawable = T.h().j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z3 = k4.getBoolean(q.e.f15915o, false);
        k4.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.c.b(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C0857c.a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f15758o.C(resourceId, resourceId2, drawable, z3);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean r(int i4) {
        int i5;
        int G3;
        g gVar;
        g gVar2 = this.f15759p;
        if (gVar2 == null) {
            i5 = c();
        } else if (i4 == this.f15760q) {
            return true;
        } else {
            if (i4 != this.f15761r || !gVar2.a()) {
                i5 = this.f15760q;
                gVar2.d();
            } else {
                gVar2.b();
                this.f15760q = this.f15761r;
                this.f15761r = i4;
                return true;
            }
        }
        this.f15759p = null;
        this.f15761r = -1;
        this.f15760q = -1;
        c cVar = this.f15758o;
        int E3 = cVar.E(i5);
        int E4 = cVar.E(i4);
        if (E4 == 0 || E3 == 0 || (G3 = cVar.G(E3, E4)) < 0) {
            return false;
        }
        boolean I3 = cVar.I(E3, E4);
        g(G3);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E3, E4), I3);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
            gVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.f15759p = gVar;
        this.f15761r = i5;
        this.f15760q = i4;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.f15758o;
        cVar.f15798d |= C0857c.b(typedArray);
        cVar.x(typedArray.getBoolean(q.e.f15904d, cVar.f15803i));
        cVar.t(typedArray.getBoolean(q.e.f15905e, cVar.f15806l));
        cVar.u(typedArray.getInt(q.e.f15906f, cVar.f15786A));
        cVar.v(typedArray.getInt(q.e.f15907g, cVar.f15787B));
        setDither(typedArray.getBoolean(q.e.f15902b, cVar.f15818x));
    }

    /* access modifiers changed from: package-private */
    public void h(C0845b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f15758o = (c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f15759p;
        if (gVar != null) {
            gVar.d();
            this.f15759p = null;
            g(this.f15760q);
            this.f15760q = -1;
            this.f15761r = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public c b() {
        return new c(this.f15758o, this, (Resources) null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k4 = k.k(resources, theme, attributeSet, q.e.f15901a);
        setVisible(k4.getBoolean(q.e.f15903c, true), true);
        s(k4);
        i(resources);
        k4.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    public Drawable mutate() {
        if (!this.f15762s && super.mutate() == this) {
            this.f15758o.r();
            this.f15762s = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z3;
        int F3 = this.f15758o.F(iArr);
        if (F3 == c() || (!r(F3) && !g(F3))) {
            z3 = false;
        } else {
            z3 = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z3 | current.setState(iArr);
        }
        return z3;
    }

    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        g gVar = this.f15759p;
        if (gVar != null && (visible || z4)) {
            if (z3) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C0844a(c cVar, Resources resources) {
        super((C0847d.a) null);
        this.f15760q = -1;
        this.f15761r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
