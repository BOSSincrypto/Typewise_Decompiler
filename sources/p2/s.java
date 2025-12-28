package P2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.C0561z;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class s extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1181a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void b() {
        View.inflate(getContext(), B.dropdown_language_item, this);
        this.f1181a = (TextView) findViewById(A.tv_language_text);
    }

    /* access modifiers changed from: private */
    public static final void d(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void c(int i4, int i5) {
        TextView textView = this.f1181a;
        TextView textView2 = null;
        if (textView == null) {
            o.p("languageText");
            textView = null;
        }
        textView.setTextColor(i5);
        TextView textView3 = this.f1181a;
        if (textView3 == null) {
            o.p("languageText");
            textView3 = null;
        }
        textView3.setBackgroundResource(C0561z.dropdown_item_background);
        TextView textView4 = this.f1181a;
        if (textView4 == null) {
            o.p("languageText");
        } else {
            textView2 = textView4;
        }
        textView2.getBackground().setTint(i4);
    }

    public final void setLanguage(String str) {
        o.e(str, "language");
        TextView textView = this.f1181a;
        if (textView == null) {
            o.p("languageText");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setOnLanguageClick(C0906a aVar) {
        o.e(aVar, "onLanguageClick");
        setOnClickListener(new r(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        b();
    }
}
