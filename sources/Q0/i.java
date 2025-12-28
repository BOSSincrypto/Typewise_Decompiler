package q0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.C0560y;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import java.util.List;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class i extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme f15943A;

    /* renamed from: B  reason: collision with root package name */
    private C0862e f15944B;

    /* renamed from: y  reason: collision with root package name */
    private ConstraintLayout f15945y;

    /* renamed from: z  reason: collision with root package name */
    private RecyclerView f15946z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final q C(l lVar, String str) {
        o.e(str, "selectedOption");
        lVar.invoke(str);
        return q.f14567a;
    }

    private final void D() {
        View.inflate(getContext(), B.ai_assistant_propmpt_options_view, this);
        this.f15945y = (ConstraintLayout) findViewById(A.cl_content);
        RecyclerView recyclerView = (RecyclerView) findViewById(A.rv_options);
        this.f15946z = recyclerView;
        if (recyclerView == null) {
            o.p("options");
            recyclerView = null;
        }
        recyclerView.j(new C0858a(getResources().getDimensionPixelSize(C0560y.gpt_options_list_padding), getResources().getDimensionPixelSize(C0560y.gpt_options_list_margin_bottom)));
    }

    public final void E(List list, l lVar) {
        o.e(list, "optionData");
        o.e(lVar, "onOptionSelectedClick");
        C0862e eVar = new C0862e(new h(lVar));
        eVar.C(list);
        ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme = this.f15943A;
        if (aIAssistantDropDownTheme != null) {
            eVar.H(aIAssistantDropDownTheme);
        }
        this.f15944B = eVar;
        RecyclerView recyclerView = this.f15946z;
        if (recyclerView == null) {
            o.p("options");
            recyclerView = null;
        }
        recyclerView.setAdapter(eVar);
    }

    public final void setTheme(ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme) {
        o.e(aIAssistantDropDownTheme, "theme");
        this.f15943A = aIAssistantDropDownTheme;
        ConstraintLayout constraintLayout = this.f15945y;
        if (constraintLayout == null) {
            o.p("clContent");
            constraintLayout = null;
        }
        constraintLayout.setBackgroundColor(aIAssistantDropDownTheme.getBackgroundColor());
        C0862e eVar = this.f15944B;
        if (eVar != null) {
            eVar.H(aIAssistantDropDownTheme);
        }
        C0862e eVar2 = this.f15944B;
        if (eVar2 != null) {
            eVar2.i();
        }
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
