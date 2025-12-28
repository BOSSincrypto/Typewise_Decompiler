package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.F;

abstract class i {
    private static int a(Fragment fragment, boolean z3, boolean z4) {
        if (z4) {
            if (z3) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z3) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[SYNTHETIC, Splitter:B:31:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.fragment.app.i.a b(android.content.Context r4, androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r3 = Q.b.f1205c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L_0x001e
            android.view.ViewGroup r1 = r5.mContainer
            r1.setTag(r3, r2)
        L_0x001e:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L_0x0029
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L_0x0029
            return r2
        L_0x0029:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L_0x0035
            androidx.fragment.app.i$a r4 = new androidx.fragment.app.i$a
            r4.<init>((android.view.animation.Animation) r1)
            return r4
        L_0x0035:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L_0x0041
            androidx.fragment.app.i$a r4 = new androidx.fragment.app.i$a
            r4.<init>((android.animation.Animator) r5)
            return r4
        L_0x0041:
            if (r7 != 0) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            int r7 = d(r4, r0, r6)
        L_0x0049:
            if (r7 == 0) goto L_0x0085
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0069
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch:{ NotFoundException -> 0x0067, RuntimeException -> 0x0069 }
            if (r6 == 0) goto L_0x0085
            androidx.fragment.app.i$a r0 = new androidx.fragment.app.i$a     // Catch:{ NotFoundException -> 0x0067, RuntimeException -> 0x0069 }
            r0.<init>((android.view.animation.Animation) r6)     // Catch:{ NotFoundException -> 0x0067, RuntimeException -> 0x0069 }
            return r0
        L_0x0067:
            r4 = move-exception
            throw r4
        L_0x0069:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch:{ RuntimeException -> 0x0075 }
            if (r6 == 0) goto L_0x0085
            androidx.fragment.app.i$a r0 = new androidx.fragment.app.i$a     // Catch:{ RuntimeException -> 0x0075 }
            r0.<init>((android.animation.Animator) r6)     // Catch:{ RuntimeException -> 0x0075 }
            return r0
        L_0x0075:
            r6 = move-exception
            if (r5 != 0) goto L_0x0084
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L_0x0085
            androidx.fragment.app.i$a r5 = new androidx.fragment.app.i$a
            r5.<init>((android.view.animation.Animation) r4)
            return r5
        L_0x0084:
            throw r6
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.b(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):androidx.fragment.app.i$a");
    }

    private static int c(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i4, boolean z3) {
        if (i4 != 4097) {
            if (i4 != 8194) {
                if (i4 != 8197) {
                    if (i4 != 4099) {
                        if (i4 != 4100) {
                            return -1;
                        }
                        if (z3) {
                            return c(context, 16842936);
                        }
                        return c(context, 16842937);
                    } else if (z3) {
                        return Q.a.f1199c;
                    } else {
                        return Q.a.f1200d;
                    }
                } else if (z3) {
                    return c(context, 16842938);
                } else {
                    return c(context, 16842939);
                }
            } else if (z3) {
                return Q.a.f1197a;
            } else {
                return Q.a.f1198b;
            }
        } else if (z3) {
            return Q.a.f1201e;
        } else {
            return Q.a.f1202f;
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f5819a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f5820b;

        a(Animation animation) {
            this.f5819a = animation;
            this.f5820b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f5819a = null;
            this.f5820b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f5821a;

        /* renamed from: b  reason: collision with root package name */
        private final View f5822b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5823c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5824d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f5825e = true;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f5821a = viewGroup;
            this.f5822b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j4, Transformation transformation) {
            this.f5825e = true;
            if (this.f5823c) {
                return !this.f5824d;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f5823c = true;
                F.a(this.f5821a, this);
            }
            return true;
        }

        public void run() {
            if (this.f5823c || !this.f5825e) {
                this.f5821a.endViewTransition(this.f5822b);
                this.f5824d = true;
                return;
            }
            this.f5825e = false;
            this.f5821a.post(this);
        }

        public boolean getTransformation(long j4, Transformation transformation, float f4) {
            this.f5825e = true;
            if (this.f5823c) {
                return !this.f5824d;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f5823c = true;
                F.a(this.f5821a, this);
            }
            return true;
        }
    }
}
