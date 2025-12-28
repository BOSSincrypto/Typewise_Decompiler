package b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class f extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    private ImageView f7451y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void D() {
        View.inflate(getContext(), B.onboarding_menu_explanation, this);
        this.f7451y = (ImageView) findViewById(A.closeMenuExplanationButton);
    }

    /* access modifiers changed from: private */
    public static final void E(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void F(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setOnClick(C0906a aVar) {
        o.e(aVar, "onClick");
        setOnClickListener(new d(aVar));
        ImageView imageView = this.f7451y;
        if (imageView == null) {
            o.p("imgClose");
            imageView = null;
        }
        imageView.setOnClickListener(new e(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        D();
    }
}
