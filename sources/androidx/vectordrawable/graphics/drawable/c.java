package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import y.C0939a;

public class c extends g implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    private C0111c f6958b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6959c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f6960d;

    /* renamed from: e  reason: collision with root package name */
    d f6961e;

    /* renamed from: f  reason: collision with root package name */
    private Animator.AnimatorListener f6962f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList f6963g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable.Callback f6964h;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            c.this.scheduleSelf(runnable, j4);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f6963g);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b) arrayList.get(i4)).b(c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f6963g);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b) arrayList.get(i4)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    private static class C0111c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f6967a;

        /* renamed from: b  reason: collision with root package name */
        h f6968b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f6969c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList f6970d;

        /* renamed from: e  reason: collision with root package name */
        C0939a f6971e;

        public C0111c(Context context, C0111c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f6967a = cVar.f6967a;
                h hVar = cVar.f6968b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f6968b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f6968b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f6968b.mutate();
                    this.f6968b = hVar2;
                    hVar2.setCallback(callback);
                    this.f6968b.setBounds(cVar.f6968b.getBounds());
                    this.f6968b.h(false);
                }
                ArrayList arrayList = cVar.f6970d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6970d = new ArrayList(size);
                    this.f6971e = new C0939a(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Animator animator = (Animator) cVar.f6970d.get(i4);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f6971e.get(animator);
                        clone.setTarget(this.f6968b.d(str));
                        this.f6970d.add(clone);
                        this.f6971e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f6969c == null) {
                this.f6969c = new AnimatorSet();
            }
            this.f6969c.playTogether(this.f6970d);
        }

        public int getChangingConfigurations() {
            return this.f6967a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this((Context) null, (C0111c) null, (Resources) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.c a(android.content.Context r6, int r7) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "AnimatedVDCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0030
            androidx.vectordrawable.graphics.drawable.c r0 = new androidx.vectordrawable.graphics.drawable.c
            r0.<init>(r6)
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.h.e(r1, r7, r6)
            r0.f6975a = r6
            android.graphics.drawable.Drawable$Callback r7 = r0.f6964h
            r6.setCallback(r7)
            androidx.vectordrawable.graphics.drawable.c$d r6 = new androidx.vectordrawable.graphics.drawable.c$d
            android.graphics.drawable.Drawable r7 = r0.f6975a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f6961e = r6
            return r0
        L_0x0030:
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.XmlResourceParser r7 = r2.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
        L_0x003c:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            r4 = 2
            if (r3 == r4) goto L_0x0047
            r5 = 1
            if (r3 == r5) goto L_0x0047
            goto L_0x003c
        L_0x0047:
            if (r3 != r4) goto L_0x005a
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            android.content.res.Resources$Theme r4 = r6.getTheme()     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            androidx.vectordrawable.graphics.drawable.c r6 = b(r6, r3, r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            return r6
        L_0x0056:
            r6 = move-exception
            goto L_0x0062
        L_0x0058:
            r6 = move-exception
            goto L_0x0066
        L_0x005a:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0058, IOException -> 0x0056 }
        L_0x0062:
            android.util.Log.e(r1, r0, r6)
            goto L_0x0069
        L_0x0066:
            android.util.Log.e(r1, r0, r6)
        L_0x0069:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.c.a(android.content.Context, int):androidx.vectordrawable.graphics.drawable.c");
    }

    public static c b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable, b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void e() {
        Animator.AnimatorListener animatorListener = this.f6962f;
        if (animatorListener != null) {
            this.f6958b.f6969c.removeListener(animatorListener);
            this.f6962f = null;
        }
    }

    private void f(String str, Animator animator) {
        animator.setTarget(this.f6958b.f6968b.d(str));
        C0111c cVar = this.f6958b;
        if (cVar.f6970d == null) {
            cVar.f6970d = new ArrayList();
            this.f6958b.f6971e = new C0939a();
        }
        this.f6958b.f6970d.add(animator);
        this.f6958b.f6971e.put(animator, str);
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable, b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public void c(b bVar) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, bVar);
        } else if (bVar != null) {
            if (this.f6963g == null) {
                this.f6963g = new ArrayList();
            }
            if (!this.f6963g.contains(bVar)) {
                this.f6963g.add(bVar);
                if (this.f6962f == null) {
                    this.f6962f = new b();
                }
                this.f6958b.f6969c.addListener(this.f6962f);
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6958b.f6968b.draw(canvas);
        if (this.f6958b.f6969c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean g(b bVar) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f6963g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f6963g.size() == 0) {
            e();
        }
        return remove;
    }

    public int getAlpha() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f6958b.f6968b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f6958b.f6967a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f6958b.f6968b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f6975a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f6975a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f6958b.f6968b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f6958b.f6968b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f6958b.f6968b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k4 = k.k(resources, theme, attributeSet, a.f6948e);
                    int resourceId = k4.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b4 = h.b(resources, resourceId, theme);
                        b4.h(false);
                        b4.setCallback(this.f6964h);
                        h hVar = this.f6958b.f6968b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f6958b.f6968b = b4;
                    }
                    k4.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f6949f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6959c;
                        if (context != null) {
                            f(string, e.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f6958b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f6958b.f6968b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f6958b.f6969c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f6958b.f6968b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6958b.f6968b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        return this.f6958b.f6968b.setLevel(i4);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f6958b.f6968b.setState(iArr);
    }

    public void setAlpha(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f6958b.f6968b.setAlpha(i4);
        }
    }

    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z3);
        } else {
            this.f6958b.f6968b.setAutoMirrored(z3);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i4);
        } else {
            this.f6958b.f6968b.setTint(i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f6958b.f6968b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f6958b.f6968b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f6958b.f6968b.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    public void start() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f6958b.f6969c.isStarted()) {
            this.f6958b.f6969c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6958b.f6969c.end();
        }
    }

    private c(Context context) {
        this(context, (C0111c) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6958b.f6968b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f6972a;

        public d(Drawable.ConstantState constantState) {
            this.f6972a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f6972a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f6972a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f6972a.newDrawable();
            cVar.f6975a = newDrawable;
            newDrawable.setCallback(cVar.f6964h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f6972a.newDrawable(resources);
            cVar.f6975a = newDrawable;
            newDrawable.setCallback(cVar.f6964h);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f6972a.newDrawable(resources, theme);
            cVar.f6975a = newDrawable;
            newDrawable.setCallback(cVar.f6964h);
            return cVar;
        }
    }

    private c(Context context, C0111c cVar, Resources resources) {
        this.f6960d = null;
        this.f6962f = null;
        this.f6963g = null;
        a aVar = new a();
        this.f6964h = aVar;
        this.f6959c = context;
        if (cVar != null) {
            this.f6958b = cVar;
        } else {
            this.f6958b = new C0111c(context, cVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
