package p0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class g extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private TextView f15838A;

    /* renamed from: y  reason: collision with root package name */
    private ConstraintLayout f15839y;

    /* renamed from: z  reason: collision with root package name */
    private ImageView f15840z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void C() {
        View.inflate(getContext(), B.ai_assistant_prompt_item, this);
        this.f15839y = (ConstraintLayout) findViewById(A.cl_content);
        this.f15840z = (ImageView) findViewById(A.img_prompt_icon);
        this.f15838A = (TextView) findViewById(A.tv_prompt_title);
    }

    /* access modifiers changed from: private */
    public static final void D(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setBackground(int i4) {
        ConstraintLayout constraintLayout = this.f15839y;
        if (constraintLayout == null) {
            o.p("clContent");
            constraintLayout = null;
        }
        Drawable background = constraintLayout.getBackground();
        o.c(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.mutate();
        gradientDrawable.setColor(i4);
    }

    public final void setOnPromptItemClick(C0906a aVar) {
        o.e(aVar, "onPromptIconClick");
        setOnClickListener(new f(aVar));
    }

    public final void setPromptColor(int i4) {
        ImageView imageView = this.f15840z;
        TextView textView = null;
        if (imageView == null) {
            o.p("promptIcon");
            imageView = null;
        }
        imageView.setImageTintList(ColorStateList.valueOf(i4));
        TextView textView2 = this.f15838A;
        if (textView2 == null) {
            o.p("promptTitle");
        } else {
            textView = textView2;
        }
        textView.setTextColor(i4);
    }

    public final void setPromptIconDrawable(Drawable drawable) {
        o.e(drawable, "promptIconDrawable");
        ImageView imageView = this.f15840z;
        if (imageView == null) {
            o.p("promptIcon");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setPromptTitle(String str) {
        o.e(str, "promptIconTitle");
        TextView textView = this.f15838A;
        if (textView == null) {
            o.p("promptTitle");
            textView = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        C();
    }
}
