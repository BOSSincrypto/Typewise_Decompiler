package d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.P;

/* renamed from: d0.d  reason: case insensitive filesystem */
public class C0613d extends C0607N {

    /* renamed from: d0.d$a */
    class a extends C0622m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f13442a;

        a(View view) {
            this.f13442a = view;
        }

        public void e(C0621l lVar) {
            C0594A.g(this.f13442a, 1.0f);
            C0594A.a(this.f13442a);
            lVar.T(this);
        }
    }

    /* renamed from: d0.d$b */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f13444a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13445b = false;

        b(View view) {
            this.f13444a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0594A.g(this.f13444a, 1.0f);
            if (this.f13445b) {
                this.f13444a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (P.O(this.f13444a) && this.f13444a.getLayerType() == 0) {
                this.f13445b = true;
                this.f13444a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0613d(int i4) {
        m0(i4);
    }

    private Animator n0(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        C0594A.g(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0594A.f13377b, new float[]{f5});
        ofFloat.addListener(new b(view));
        b(new a(view));
        return ofFloat;
    }

    private static float o0(C0628s sVar, float f4) {
        Float f5;
        if (sVar == null || (f5 = (Float) sVar.f13522a.get("android:fade:transitionAlpha")) == null) {
            return f4;
        }
        return f5.floatValue();
    }

    public Animator i0(ViewGroup viewGroup, View view, C0628s sVar, C0628s sVar2) {
        float f4 = 0.0f;
        float o02 = o0(sVar, 0.0f);
        if (o02 != 1.0f) {
            f4 = o02;
        }
        return n0(view, f4, 1.0f);
    }

    public Animator k0(ViewGroup viewGroup, View view, C0628s sVar, C0628s sVar2) {
        C0594A.e(view);
        return n0(view, o0(sVar, 1.0f), 0.0f);
    }

    public void n(C0628s sVar) {
        super.n(sVar);
        sVar.f13522a.put("android:fade:transitionAlpha", Float.valueOf(C0594A.c(sVar.f13523b)));
    }

    public C0613d() {
    }
}
