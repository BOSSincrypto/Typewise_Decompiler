package p0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.C0560y;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import java.util.List;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class e extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private ProgressBar f15831A;

    /* renamed from: B  reason: collision with root package name */
    private TextView f15832B;

    /* renamed from: C  reason: collision with root package name */
    private i f15833C;

    /* renamed from: D  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme.AIAssistantBarTheme f15834D;

    /* renamed from: y  reason: collision with root package name */
    private RecyclerView f15835y;

    /* renamed from: z  reason: collision with root package name */
    private TextView f15836z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final q C(l lVar, PromptItemType promptItemType) {
        o.e(promptItemType, "it");
        lVar.invoke(promptItemType);
        return q.f14567a;
    }

    private final void H() {
        View.inflate(getContext(), B.ai_assistant_prompts_view, this);
        this.f15836z = (TextView) findViewById(A.tv_generating_response);
        this.f15831A = (ProgressBar) findViewById(A.pb_generating_response_bar);
        this.f15832B = (TextView) findViewById(A.tv_error_generating_response);
        RecyclerView recyclerView = (RecyclerView) findViewById(A.rv_ai_assistant_prompts);
        this.f15835y = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            o.p("aiAssistantPrompts");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView3 = this.f15835y;
        if (recyclerView3 == null) {
            o.p("aiAssistantPrompts");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.j(new C0848a(getResources().getDimensionPixelSize(C0560y.gpt_prompts_start_padding)));
    }

    public final void D() {
        ThemeModel.AIAssistantTheme.AIAssistantBarTheme aIAssistantBarTheme = this.f15834D;
        if (aIAssistantBarTheme != null) {
            setBackgroundColor(aIAssistantBarTheme.getBackgroundColor());
        }
        TextView textView = this.f15832B;
        RecyclerView recyclerView = null;
        if (textView == null) {
            o.p("errorGeneratingResponse");
            textView = null;
        }
        textView.setVisibility(8);
        RecyclerView recyclerView2 = this.f15835y;
        if (recyclerView2 == null) {
            o.p("aiAssistantPrompts");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(0);
    }

    public final void E(String str) {
        o.e(str, "errorMessage");
        TextView textView = this.f15832B;
        RecyclerView recyclerView = null;
        if (textView == null) {
            o.p("errorGeneratingResponse");
            textView = null;
        }
        textView.setText(str);
        ThemeModel.AIAssistantTheme.AIAssistantBarTheme aIAssistantBarTheme = this.f15834D;
        if (aIAssistantBarTheme != null) {
            TextView textView2 = this.f15832B;
            if (textView2 == null) {
                o.p("errorGeneratingResponse");
                textView2 = null;
            }
            Drawable[] compoundDrawables = textView2.getCompoundDrawables();
            o.d(compoundDrawables, "getCompoundDrawables(...)");
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setTint(aIAssistantBarTheme.getErrorFontColor());
                }
            }
        }
        TextView textView3 = this.f15832B;
        if (textView3 == null) {
            o.p("errorGeneratingResponse");
            textView3 = null;
        }
        textView3.setVisibility(0);
        RecyclerView recyclerView2 = this.f15835y;
        if (recyclerView2 == null) {
            o.p("aiAssistantPrompts");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(8);
    }

    public final void F(List list, l lVar) {
        o.e(list, "prompts");
        o.e(lVar, "onGptPromptClick");
        i iVar = new i(new d(lVar));
        this.f15833C = iVar;
        iVar.C(list);
        RecyclerView recyclerView = this.f15835y;
        i iVar2 = null;
        if (recyclerView == null) {
            o.p("aiAssistantPrompts");
            recyclerView = null;
        }
        i iVar3 = this.f15833C;
        if (iVar3 == null) {
            o.p("gptPromptsAdapter");
            iVar3 = null;
        }
        recyclerView.setAdapter(iVar3);
        ThemeModel.AIAssistantTheme.AIAssistantBarTheme aIAssistantBarTheme = this.f15834D;
        if (aIAssistantBarTheme != null) {
            i iVar4 = this.f15833C;
            if (iVar4 == null) {
                o.p("gptPromptsAdapter");
            } else {
                iVar2 = iVar4;
            }
            iVar2.H(aIAssistantBarTheme);
        }
    }

    public final void G() {
        TextView textView = this.f15836z;
        RecyclerView recyclerView = null;
        if (textView == null) {
            o.p("generatingResponseText");
            textView = null;
        }
        textView.setVisibility(8);
        ProgressBar progressBar = this.f15831A;
        if (progressBar == null) {
            o.p("generatingResponseProgress");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        RecyclerView recyclerView2 = this.f15835y;
        if (recyclerView2 == null) {
            o.p("aiAssistantPrompts");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(0);
    }

    public final void I() {
        i iVar = this.f15833C;
        if (iVar == null) {
            o.p("gptPromptsAdapter");
            iVar = null;
        }
        iVar.G();
    }

    public final void J() {
        TextView textView = this.f15836z;
        RecyclerView recyclerView = null;
        if (textView == null) {
            o.p("generatingResponseText");
            textView = null;
        }
        textView.setVisibility(0);
        ProgressBar progressBar = this.f15831A;
        if (progressBar == null) {
            o.p("generatingResponseProgress");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        RecyclerView recyclerView2 = this.f15835y;
        if (recyclerView2 == null) {
            o.p("aiAssistantPrompts");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(8);
    }

    public final void setTheme(ThemeModel.AIAssistantTheme.AIAssistantBarTheme aIAssistantBarTheme) {
        o.e(aIAssistantBarTheme, "theme");
        this.f15834D = aIAssistantBarTheme;
        setBackgroundColor(aIAssistantBarTheme.getBackgroundColor());
        TextView textView = this.f15836z;
        TextView textView2 = null;
        if (textView == null) {
            o.p("generatingResponseText");
            textView = null;
        }
        textView.setTextColor(aIAssistantBarTheme.getFontColor());
        ProgressBar progressBar = this.f15831A;
        if (progressBar == null) {
            o.p("generatingResponseProgress");
            progressBar = null;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(aIAssistantBarTheme.getFontColor()));
        TextView textView3 = this.f15832B;
        if (textView3 == null) {
            o.p("errorGeneratingResponse");
            textView3 = null;
        }
        textView3.setTextColor(aIAssistantBarTheme.getErrorFontColor());
        TextView textView4 = this.f15832B;
        if (textView4 == null) {
            o.p("errorGeneratingResponse");
        } else {
            textView2 = textView4;
        }
        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
        o.d(compoundDrawables, "getCompoundDrawables(...)");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setTint(aIAssistantBarTheme.getErrorFontColor());
            }
        }
        i iVar = this.f15833C;
        if (iVar != null) {
            iVar.H(aIAssistantBarTheme);
        }
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
        H();
    }
}
