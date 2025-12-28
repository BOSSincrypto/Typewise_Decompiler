package n3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class e extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    private ImageView f15086y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void C() {
        View.inflate(getContext(), B.autocorrect_database_creation, this);
        this.f15086y = (ImageView) findViewById(A.exit);
    }

    /* access modifiers changed from: private */
    public static final void D(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void setOnExitClicked(C0906a aVar) {
        o.e(aVar, "onExitClicked");
        ImageView imageView = this.f15086y;
        if (imageView == null) {
            o.p("imgExit");
            imageView = null;
        }
        imageView.setOnClickListener(new d(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        C();
    }
}
