package com.capacitorjs.plugins.splashscreen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.C0370d;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.core.splashscreen.g;
import androidx.core.view.C0403a0;
import androidx.core.view.C0435o0;
import com.getcapacitor.Logger;

public class SplashScreen {
    private SplashScreenConfig config;
    /* access modifiers changed from: private */
    public View content;
    /* access modifiers changed from: private */
    public Context context;
    private Dialog dialog;
    /* access modifiers changed from: private */
    public boolean isHiding = false;
    /* access modifiers changed from: private */
    public boolean isVisible = false;
    /* access modifiers changed from: private */
    public ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private ProgressBar spinnerBar;
    private View splashImage;
    private WindowManager windowManager;

    SplashScreen(Context context2, SplashScreenConfig splashScreenConfig) {
        this.context = context2;
        this.config = splashScreenConfig;
    }

    private void buildViews() {
        int i4;
        if (this.splashImage == null) {
            if (this.config.getLayoutName() != null) {
                i4 = this.context.getResources().getIdentifier(this.config.getLayoutName(), "layout", this.context.getPackageName());
                if (i4 == 0) {
                    Logger.warn("Layout not found, defaulting to ImageView");
                }
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                LayoutInflater layoutInflater = ((Activity) this.context).getLayoutInflater();
                FrameLayout frameLayout = new FrameLayout(this.context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.splashImage = layoutInflater.inflate(i4, frameLayout, false);
            } else {
                Drawable splashDrawable = getSplashDrawable();
                if (splashDrawable != null) {
                    if (splashDrawable instanceof Animatable) {
                        ((Animatable) splashDrawable).start();
                    }
                    if (splashDrawable instanceof LayerDrawable) {
                        LayerDrawable layerDrawable = (LayerDrawable) splashDrawable;
                        for (int i5 = 0; i5 < layerDrawable.getNumberOfLayers(); i5++) {
                            Drawable drawable = layerDrawable.getDrawable(i5);
                            if (drawable instanceof Animatable) {
                                ((Animatable) drawable).start();
                            }
                        }
                    }
                    ImageView imageView = new ImageView(this.context);
                    this.splashImage = imageView;
                    if (Build.VERSION.SDK_INT >= 28) {
                        imageView.setLayerType(1, (Paint) null);
                    } else {
                        legacyStopFlickers(imageView);
                    }
                    imageView.setScaleType(this.config.getScaleType());
                    imageView.setImageDrawable(splashDrawable);
                }
            }
            this.splashImage.setFitsSystemWindows(true);
            if (this.config.getBackgroundColor() != null) {
                this.splashImage.setBackgroundColor(this.config.getBackgroundColor().intValue());
            }
        }
        if (this.spinnerBar == null) {
            if (this.config.getSpinnerStyle() != null) {
                this.spinnerBar = new ProgressBar(this.context, (AttributeSet) null, this.config.getSpinnerStyle().intValue());
            } else {
                this.spinnerBar = new ProgressBar(this.context);
            }
            this.spinnerBar.setIndeterminate(true);
            Integer spinnerColor = this.config.getSpinnerColor();
            if (spinnerColor != null) {
                this.spinnerBar.setIndeterminateTintList(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}}, new int[]{spinnerColor.intValue(), spinnerColor.intValue(), spinnerColor.intValue(), spinnerColor.intValue()}));
            }
        }
    }

    private Drawable getSplashDrawable() {
        try {
            return this.context.getResources().getDrawable(this.context.getResources().getIdentifier(this.config.getResourceName(), "drawable", this.context.getPackageName()), this.context.getTheme());
        } catch (Resources.NotFoundException unused) {
            Logger.warn("No splash screen found, not displaying");
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$9(int i4, Animator.AnimatorListener animatorListener) {
        ProgressBar progressBar = this.spinnerBar;
        if (progressBar != null) {
            progressBar.setAlpha(1.0f);
            this.spinnerBar.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration((long) i4).start();
        }
        this.splashImage.setAlpha(1.0f);
        this.splashImage.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration((long) i4).setListener(animatorListener).start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$hideDialog$10(C0370d dVar) {
        Dialog dialog2 = this.dialog;
        if (dialog2 != null && dialog2.isShowing()) {
            if (!dVar.isFinishing() && !dVar.isDestroyed()) {
                this.dialog.dismiss();
            }
            this.dialog = null;
            this.isHiding = false;
            this.isVisible = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$show$6(C0370d dVar) {
        C0403a0.b(dVar.getWindow(), false);
        WindowInsetsController a4 = this.splashImage.getWindowInsetsController();
        a4.hide(C0435o0.m.f());
        a4.setSystemBarsBehavior(2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$show$7(C0370d dVar) {
        C0403a0.b(dVar.getWindow(), false);
        this.splashImage.getWindowInsetsController().hide(C0435o0.m.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$show$8(C0370d dVar, SplashScreenSettings splashScreenSettings, Animator.AnimatorListener animatorListener) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 17;
        layoutParams.flags = dVar.getWindow().getAttributes().flags;
        layoutParams.format = -3;
        try {
            this.windowManager.addView(this.splashImage, layoutParams);
            if (this.config.isImmersive()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    dVar.runOnUiThread(new i(this, dVar));
                } else {
                    legacyImmersive();
                }
            } else if (this.config.isFullScreen()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    dVar.runOnUiThread(new j(this, dVar));
                } else {
                    legacyFullscreen();
                }
            }
            this.splashImage.setAlpha(0.0f);
            this.splashImage.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration((long) splashScreenSettings.getFadeInDuration().intValue()).setListener(animatorListener).start();
            this.splashImage.setVisibility(0);
            ProgressBar progressBar = this.spinnerBar;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                if (this.spinnerBar.getParent() != null) {
                    this.windowManager.removeView(this.spinnerBar);
                }
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.windowManager.addView(this.spinnerBar, layoutParams);
                if (this.config.isShowSpinner()) {
                    this.spinnerBar.setAlpha(0.0f);
                    this.spinnerBar.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration((long) splashScreenSettings.getFadeInDuration().intValue()).start();
                    this.spinnerBar.setVisibility(0);
                }
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
            Logger.debug("Could not add splash view");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$4(C0370d dVar, boolean z3, SplashListener splashListener) {
        hideDialog(dVar, z3);
        if (splashListener != null) {
            splashListener.completed();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$5(C0370d dVar, SplashScreenSettings splashScreenSettings, boolean z3, SplashListener splashListener) {
        int i4;
        if (this.config.isImmersive()) {
            this.dialog = new Dialog(dVar, R.style.capacitor_immersive_style);
        } else if (this.config.isFullScreen()) {
            this.dialog = new Dialog(dVar, R.style.capacitor_full_screen_style);
        } else {
            this.dialog = new Dialog(dVar, R.style.capacitor_default_style);
        }
        if (this.config.getLayoutName() != null) {
            i4 = this.context.getResources().getIdentifier(this.config.getLayoutName(), "layout", this.context.getPackageName());
            if (i4 == 0) {
                Logger.warn("Layout not found, using default");
            }
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            this.dialog.setContentView(i4);
        } else {
            Drawable splashDrawable = getSplashDrawable();
            LinearLayout linearLayout = new LinearLayout(this.context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            if (splashDrawable != null) {
                linearLayout.setBackground(splashDrawable);
            }
            this.dialog.setContentView(linearLayout);
        }
        this.dialog.setCancelable(false);
        if (!this.dialog.isShowing()) {
            this.dialog.show();
        }
        this.isVisible = true;
        if (splashScreenSettings.isAutoHide()) {
            new Handler(this.context.getMainLooper()).postDelayed(new k(this, dVar, z3, splashListener), (long) splashScreenSettings.getShowDuration().intValue());
        } else if (splashListener != null) {
            splashListener.completed();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showWithAndroid12API$0() {
        if (this.isVisible || this.isHiding) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAndroid12API$1(final SplashScreenViewProvider splashScreenViewProvider) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(splashScreenViewProvider.a(), View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration((long) this.config.getLaunchFadeOutDuration().intValue());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                SplashScreen.this.isHiding = false;
                splashScreenViewProvider.b();
            }
        });
        ofFloat.start();
        this.isHiding = true;
        this.isVisible = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAndroid12API$2(SplashScreenViewProvider splashScreenViewProvider) {
        this.isHiding = false;
        this.isVisible = false;
        splashScreenViewProvider.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showWithAndroid12API$3(C0370d dVar, final SplashScreenSettings splashScreenSettings) {
        g c4 = g.c(dVar);
        c4.d(new e(this));
        if (this.config.getLaunchFadeOutDuration().intValue() > 0) {
            c4.e(new f(this));
        } else {
            c4.e(new g(this));
        }
        this.content = dVar.findViewById(16908290);
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            /* access modifiers changed from: private */
            public /* synthetic */ void lambda$onPreDraw$0(SplashScreenSettings splashScreenSettings) {
                if (splashScreenSettings.isAutoHide()) {
                    SplashScreen.this.isVisible = false;
                    SplashScreen.this.onPreDrawListener = null;
                    SplashScreen.this.content.getViewTreeObserver().removeOnPreDrawListener(this);
                }
            }

            public boolean onPreDraw() {
                if (SplashScreen.this.isVisible || SplashScreen.this.isHiding) {
                    return false;
                }
                SplashScreen.this.isVisible = true;
                new Handler(SplashScreen.this.context.getMainLooper()).postDelayed(new m(this, splashScreenSettings), (long) splashScreenSettings.getShowDuration().intValue());
                return false;
            }
        };
        this.content.getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
    }

    private void legacyFullscreen() {
        this.splashImage.setSystemUiVisibility(4);
    }

    private void legacyImmersive() {
        this.splashImage.setSystemUiVisibility(5894);
    }

    private void legacyStopFlickers(ImageView imageView) {
        imageView.setDrawingCacheEnabled(true);
    }

    private void showDialog(C0370d dVar, SplashScreenSettings splashScreenSettings, SplashListener splashListener, boolean z3) {
        if (dVar != null && !dVar.isFinishing()) {
            if (this.isVisible) {
                splashListener.completed();
            } else {
                dVar.runOnUiThread(new l(this, dVar, splashScreenSettings, z3, splashListener));
            }
        }
    }

    private void showWithAndroid12API(C0370d dVar, SplashScreenSettings splashScreenSettings) {
        if (dVar != null && !dVar.isFinishing()) {
            dVar.runOnUiThread(new b(this, dVar, splashScreenSettings));
        }
    }

    /* access modifiers changed from: private */
    public void tearDown(boolean z3) {
        ProgressBar progressBar = this.spinnerBar;
        if (!(progressBar == null || progressBar.getParent() == null)) {
            this.spinnerBar.setVisibility(4);
            if (z3) {
                this.windowManager.removeView(this.spinnerBar);
            }
        }
        View view = this.splashImage;
        if (!(view == null || view.getParent() == null)) {
            this.splashImage.setVisibility(4);
            this.windowManager.removeView(this.splashImage);
        }
        if ((Build.VERSION.SDK_INT >= 30 && this.config.isFullScreen()) || this.config.isImmersive()) {
            C0403a0.b(((Activity) this.context).getWindow(), true);
        }
        this.isHiding = false;
        this.isVisible = false;
    }

    public void hide(SplashScreenSettings splashScreenSettings) {
        hide(splashScreenSettings.getFadeOutDuration().intValue(), false);
    }

    public void hideDialog(C0370d dVar) {
        hideDialog(dVar, false);
    }

    public void onDestroy() {
        tearDown(true);
    }

    public void onPause() {
        tearDown(true);
    }

    public void show(C0370d dVar, SplashScreenSettings splashScreenSettings, SplashListener splashListener) {
        if (this.config.isUsingDialog()) {
            showDialog(dVar, splashScreenSettings, splashListener, false);
        } else {
            show(dVar, splashScreenSettings, splashListener, false);
        }
    }

    public void showOnLaunch(C0370d dVar) {
        if (this.config.getLaunchShowDuration().intValue() != 0) {
            SplashScreenSettings splashScreenSettings = new SplashScreenSettings();
            splashScreenSettings.setShowDuration(this.config.getLaunchShowDuration());
            splashScreenSettings.setAutoHide(this.config.isLaunchAutoHide());
            try {
                showWithAndroid12API(dVar, splashScreenSettings);
            } catch (Exception unused) {
                Logger.warn("Android 12 Splash API failed... using previous method.");
                this.onPreDrawListener = null;
                splashScreenSettings.setFadeInDuration(this.config.getLaunchFadeInDuration());
                if (this.config.isUsingDialog()) {
                    showDialog(dVar, splashScreenSettings, (SplashListener) null, true);
                } else {
                    show(dVar, splashScreenSettings, (SplashListener) null, true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void hide(int i4, boolean z3) {
        if (z3 && this.isVisible) {
            Logger.debug("SplashScreen was automatically hidden after the launch timeout. You should call `SplashScreen.hide()` as soon as your web app is loaded (or increase the timeout).Read more at https://capacitorjs.com/docs/apis/splash-screen#hiding-the-splash-screen");
        }
        if (!this.isHiding) {
            if (this.onPreDrawListener != null) {
                if (i4 != 200) {
                    Logger.warn("fadeOutDuration parameter doesn't work on initial splash screen, use launchFadeOutDuration configuration option");
                }
                this.isVisible = false;
                View view = this.content;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
                }
                this.onPreDrawListener = null;
                return;
            }
            View view2 = this.splashImage;
            if (view2 != null && view2.getParent() != null) {
                this.isHiding = true;
                new Handler(this.context.getMainLooper()).post(new h(this, i4, new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                        SplashScreen.this.tearDown(false);
                    }

                    public void onAnimationEnd(Animator animator) {
                        SplashScreen.this.tearDown(false);
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }
                }));
            }
        }
    }

    private void hideDialog(C0370d dVar, boolean z3) {
        if (z3 && this.isVisible) {
            Logger.debug("SplashScreen was automatically hidden after the launch timeout. You should call `SplashScreen.hide()` as soon as your web app is loaded (or increase the timeout).Read more at https://capacitorjs.com/docs/apis/splash-screen#hiding-the-splash-screen");
        }
        if (!this.isHiding) {
            if (this.onPreDrawListener != null) {
                this.isVisible = false;
                View view = this.content;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
                }
                this.onPreDrawListener = null;
                return;
            }
            this.isHiding = true;
            dVar.runOnUiThread(new c(this, dVar));
        }
    }

    private void show(C0370d dVar, final SplashScreenSettings splashScreenSettings, final SplashListener splashListener, final boolean z3) {
        this.windowManager = (WindowManager) dVar.getSystemService("window");
        if (!dVar.isFinishing()) {
            buildViews();
            if (this.isVisible) {
                splashListener.completed();
                return;
            }
            new Handler(this.context.getMainLooper()).post(new d(this, dVar, splashScreenSettings, new Animator.AnimatorListener() {
                /* access modifiers changed from: private */
                public /* synthetic */ void lambda$onAnimationEnd$0(SplashScreenSettings splashScreenSettings, boolean z3, SplashListener splashListener) {
                    SplashScreen.this.hide(splashScreenSettings.getFadeOutDuration().intValue(), z3);
                    if (splashListener != null) {
                        splashListener.completed();
                    }
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    SplashScreen.this.isVisible = true;
                    if (splashScreenSettings.isAutoHide()) {
                        new Handler(SplashScreen.this.context.getMainLooper()).postDelayed(new n(this, splashScreenSettings, z3, splashListener), (long) splashScreenSettings.getShowDuration().intValue());
                        return;
                    }
                    SplashListener splashListener = splashListener;
                    if (splashListener != null) {
                        splashListener.completed();
                    }
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            }));
        }
    }
}
