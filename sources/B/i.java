package b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class i extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    private Button f7454y;

    /* renamed from: z  reason: collision with root package name */
    private ImageView f7455z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void D() {
        View.inflate(getContext(), B.onboarding_tutorial, this);
        this.f7454y = (Button) findViewById(A.footer_button);
        this.f7455z = (ImageView) findViewById(A.closeTutorialButton);
    }

    /* access modifiers changed from: private */
    public static final void E(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void F(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setOnButtonClick(C0906a aVar) {
        o.e(aVar, "onButtonClick");
        Button button = this.f7454y;
        if (button == null) {
            o.p("footerButton");
            button = null;
        }
        button.setOnClickListener(new g(aVar));
    }

    public final void setOnCloseClick(C0906a aVar) {
        o.e(aVar, "onCloseClick");
        ImageView imageView = this.f7455z;
        if (imageView == null) {
            o.p("imgClose");
            imageView = null;
        }
        imageView.setOnClickListener(new h(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        D();
    }
}
