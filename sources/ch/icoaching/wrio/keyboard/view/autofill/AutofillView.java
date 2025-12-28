package ch.icoaching.wrio.keyboard.view.autofill;

import Q0.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.F;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001c"}, d2 = {"Lch/icoaching/wrio/keyboard/view/autofill/AutofillView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll2/q;", "c", "()V", "", "LQ0/f;", "inlineSuggestionItems", "b", "(Ljava/util/List;)V", "a", "", "isVisible", "setIsVisible", "(Z)V", "Landroid/widget/LinearLayout;", "pinnedSuggestionsStart", "pinnedSuggestionsEnd", "clippedSuggestions", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutofillView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f10330a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f10331b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f10332c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutofillView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    private final void c() {
        View.inflate(getContext(), F.autofill_view, this);
        this.f10330a = (LinearLayout) findViewById(E.pinned_suggestions_start);
        this.f10331b = (LinearLayout) findViewById(E.pinned_suggestions_end);
        this.f10332c = (LinearLayout) findViewById(E.scrollable_suggestions);
    }

    public final void a() {
        LinearLayout linearLayout = this.f10330a;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            o.p("pinnedSuggestionsStart");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout3 = this.f10331b;
        if (linearLayout3 == null) {
            o.p("pinnedSuggestionsEnd");
            linearLayout3 = null;
        }
        linearLayout3.removeAllViews();
        LinearLayout linearLayout4 = this.f10332c;
        if (linearLayout4 == null) {
            o.p("clippedSuggestions");
        } else {
            linearLayout2 = linearLayout4;
        }
        linearLayout2.removeAllViews();
    }

    public final void b(List list) {
        o.e(list, "inlineSuggestionItems");
        a();
        if (list.isEmpty()) {
            setIsVisible(false);
            return;
        }
        setIsVisible(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null) {
                LinearLayout linearLayout = null;
                if (fVar.b()) {
                    LinearLayout linearLayout2 = this.f10330a;
                    if (linearLayout2 == null) {
                        o.p("pinnedSuggestionsStart");
                        linearLayout2 = null;
                    }
                    if (linearLayout2.getChildCount() == 0) {
                        LinearLayout linearLayout3 = this.f10330a;
                        if (linearLayout3 == null) {
                            o.p("pinnedSuggestionsStart");
                        } else {
                            linearLayout = linearLayout3;
                        }
                        linearLayout.addView(fVar.a());
                    } else {
                        LinearLayout linearLayout4 = this.f10331b;
                        if (linearLayout4 == null) {
                            o.p("pinnedSuggestionsEnd");
                        } else {
                            linearLayout = linearLayout4;
                        }
                        linearLayout.addView(fVar.a());
                    }
                } else {
                    LinearLayout linearLayout5 = this.f10332c;
                    if (linearLayout5 == null) {
                        o.p("clippedSuggestions");
                    } else {
                        linearLayout = linearLayout5;
                    }
                    linearLayout.addView(fVar.a());
                }
            }
        }
    }

    public final void setIsVisible(boolean z3) {
        int i4;
        if (z3) {
            setZ(1.0f);
            i4 = 0;
        } else {
            setZ(0.0f);
            i4 = 8;
        }
        setVisibility(i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutofillView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        c();
    }
}
