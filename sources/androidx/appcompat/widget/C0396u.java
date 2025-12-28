package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.b;

/* renamed from: androidx.appcompat.widget.u  reason: case insensitive filesystem */
class C0396u {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f3663c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f3664a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f3665b;

    /* renamed from: androidx.appcompat.widget.u$a */
    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i4) {
            layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
            layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
            layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
            layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
            layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
            layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
            layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
            layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
            layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
        }
    }

    C0396u(ProgressBar progressBar) {
        this.f3664a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i4 = 0; i4 < numberOfFrames; i4++) {
            Drawable d4 = d(animationDrawable.getFrame(i4), true);
            d4.setLevel(10000);
            animationDrawable2.addFrame(d4, animationDrawable.getDuration(i4));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f3665b;
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i4) {
        c0 v3 = c0.v(this.f3664a.getContext(), attributeSet, f3663c, i4, 0);
        Drawable h4 = v3.h(0);
        if (h4 != null) {
            this.f3664a.setIndeterminateDrawable(e(h4));
        }
        Drawable h5 = v3.h(1);
        if (h5 != null) {
            this.f3664a.setProgressDrawable(d(h5, false));
        }
        v3.w();
    }

    /* access modifiers changed from: package-private */
    public Drawable d(Drawable drawable, boolean z3) {
        boolean z4;
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            Drawable b4 = bVar.b();
            if (b4 != null) {
                bVar.a(d(b4, z3));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                int id = layerDrawable.getId(i4);
                Drawable drawable2 = layerDrawable.getDrawable(i4);
                if (id == 16908301 || id == 16908303) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                drawableArr[i4] = d(drawable2, z4);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i5 = 0; i5 < numberOfLayers; i5++) {
                layerDrawable2.setId(i5, layerDrawable.getId(i5));
                a.a(layerDrawable, layerDrawable2, i5);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3665b == null) {
                this.f3665b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z3) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
