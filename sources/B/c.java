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

public final class c extends ConstraintLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void D() {
        View.inflate(getContext(), B.onboarding_correction_screen, this);
    }

    /* access modifiers changed from: private */
    public static final void E(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void F(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setOnClose(C0906a aVar) {
        o.e(aVar, "onClose");
        ((ImageView) findViewById(A.closeCorrectionExplanationButton)).setOnClickListener(new C0478a(aVar));
        ((ConstraintLayout) findViewById(A.background)).setOnClickListener(new b(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        D();
    }
}
