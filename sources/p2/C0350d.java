package P2;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.o;
import u2.C0906a;

/* renamed from: P2.d  reason: case insensitive filesystem */
public final class C0350d {

    /* renamed from: P2.d$a */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0906a f1152a;

        a(C0906a aVar) {
            this.f1152a = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            C0906a aVar = this.f1152a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: P2.d$b */
    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0906a f1153a;

        b(C0906a aVar) {
            this.f1153a = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            C0906a aVar = this.f1153a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    private final void a(View view, View view2, C0906a aVar) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -((float) view2.getHeight()), 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(400);
        translateAnimation.setAnimationListener(new a(aVar));
        view.setAnimation(translateAnimation);
        translateAnimation.start();
    }

    private final void b(View view, C0906a aVar) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -((float) view.getHeight()));
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(400);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new b(aVar));
        view.startAnimation(translateAnimation);
    }

    public final void c(View view, View view2, C0906a aVar) {
        o.e(view, "dropdown");
        o.e(view2, "parent");
        a(view, view2, aVar);
    }

    public final void d(View view, C0906a aVar) {
        o.e(view, "dropdown");
        b(view, aVar);
    }
}
