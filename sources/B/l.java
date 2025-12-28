package b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class l extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    private Button f7457y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void C() {
        View.inflate(getContext(), B.onboarding_welcome, this);
        this.f7457y = (Button) findViewById(A.footer_button);
    }

    /* access modifiers changed from: private */
    public static final void D(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setOnButtonClick(C0906a aVar) {
        o.e(aVar, "onButtonClick");
        Button button = this.f7457y;
        if (button == null) {
            o.p("footerButton");
            button = null;
        }
        button.setOnClickListener(new k(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        C();
    }
}
