package ch.icoaching.wrio.keyboard.view;

import P0.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import ch.icoaching.wrio.keyboard.F;
import kotlin.jvm.internal.o;

public final class E extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    private ImageView f10124y;

    /* renamed from: z  reason: collision with root package name */
    private ImageView f10125z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public E(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void B() {
        View.inflate(getContext(), F.typewise_logo_view, this);
        this.f10124y = (ImageView) findViewById(ch.icoaching.wrio.keyboard.E.iv_logo);
        this.f10125z = (ImageView) findViewById(ch.icoaching.wrio.keyboard.E.iv_flag);
    }

    public final void setFlag(int i4) {
        ImageView imageView;
        Drawable drawable;
        ImageView imageView2 = this.f10125z;
        ImageView imageView3 = null;
        if (imageView2 == null) {
            o.p("flagIcon");
            imageView = null;
        } else {
            imageView = imageView2;
        }
        c.d(imageView, 10.0f, 50, 250);
        if (i4 == 0) {
            drawable = null;
        } else {
            drawable = a.d(getContext(), i4);
        }
        ImageView imageView4 = this.f10125z;
        if (imageView4 == null) {
            o.p("flagIcon");
        } else {
            imageView3 = imageView4;
        }
        imageView3.setImageDrawable(drawable);
    }

    public final void setLanguageFlagVisible(boolean z3) {
        int i4;
        ImageView imageView = this.f10125z;
        if (imageView == null) {
            o.p("flagIcon");
            imageView = null;
        }
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        imageView.setVisibility(i4);
    }

    public final void setLogo(Drawable drawable) {
        o.e(drawable, "drawable");
        ImageView imageView = this.f10124y;
        if (imageView == null) {
            o.p("logoIcon");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        B();
    }
}
