package d0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: d0.r  reason: case insensitive filesystem */
abstract class C0627r {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f13519a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f13520b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f13521c;

    static {
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = true;
        if (i4 < 28) {
            z3 = false;
        }
        f13521c = z3;
    }

    static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C0594A.i(view, matrix);
        C0594A.j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b4 = b(view, matrix, rectF, viewGroup);
        if (b4 != null) {
            imageView.setImageBitmap(b4);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z3;
        boolean z4;
        int i4;
        ViewGroup viewGroup2;
        if (f13519a) {
            z4 = !view.isAttachedToWindow();
            if (viewGroup == null) {
                z3 = false;
            } else {
                z3 = viewGroup.isAttachedToWindow();
            }
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z5 = f13520b;
        Bitmap bitmap = null;
        if (!z5 || !z4) {
            i4 = 0;
            viewGroup2 = null;
        } else if (!z3) {
            return null;
        } else {
            viewGroup2 = (ViewGroup) view.getParent();
            i4 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int round3 = Math.round(((float) round) * min);
            int round4 = Math.round(((float) round2) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f13521c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z5 && z4) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i4);
        }
        return bitmap;
    }

    static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
