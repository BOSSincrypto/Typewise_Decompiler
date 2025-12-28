package o3;

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

public final class g extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    private Button f15110y;

    /* renamed from: z  reason: collision with root package name */
    private ImageView f15111z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void D() {
        View.inflate(getContext(), B.rating, this);
        this.f15110y = (Button) findViewById(A.footer_button);
        this.f15111z = (ImageView) findViewById(A.exit);
    }

    /* access modifiers changed from: private */
    public static final void E(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void F(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setOnExitClicked(C0906a aVar) {
        o.e(aVar, "onExitClicked");
        ImageView imageView = this.f15111z;
        if (imageView == null) {
            o.p("imgExit");
            imageView = null;
        }
        imageView.setOnClickListener(new e(aVar));
    }

    public final void setOnRateClicked(C0906a aVar) {
        o.e(aVar, "onRateClicked");
        Button button = this.f15110y;
        if (button == null) {
            o.p("footerButton");
            button = null;
        }
        button.setOnClickListener(new f(aVar));
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
        D();
    }
}
