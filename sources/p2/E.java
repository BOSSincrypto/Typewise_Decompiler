package P2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.C0561z;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class E extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private u f1133A;

    /* renamed from: B  reason: collision with root package name */
    private ScrollView f1134B;

    /* renamed from: C  reason: collision with root package name */
    private LinearLayout f1135C;

    /* renamed from: D  reason: collision with root package name */
    private LinearLayout f1136D;

    /* renamed from: E  reason: collision with root package name */
    private LinearLayout f1137E;

    /* renamed from: F  reason: collision with root package name */
    private ImageView f1138F;

    /* renamed from: G  reason: collision with root package name */
    private TextView f1139G;

    /* renamed from: H  reason: collision with root package name */
    private ImageView f1140H;

    /* renamed from: I  reason: collision with root package name */
    private TextView f1141I;

    /* renamed from: J  reason: collision with root package name */
    private ImageView f1142J;

    /* renamed from: K  reason: collision with root package name */
    private TextView f1143K;

    /* renamed from: L  reason: collision with root package name */
    private ImageView f1144L;

    /* renamed from: M  reason: collision with root package name */
    private TextView f1145M;

    /* renamed from: y  reason: collision with root package name */
    private C0350d f1146y;

    /* renamed from: z  reason: collision with root package name */
    private RecyclerView f1147z;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1148a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ch.icoaching.wrio.keyboard.KeyboardLayoutType[] r0 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r1 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.HEXAGON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r1 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.HEXAGON_LEGACY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f1148a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.E.a.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public E(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void I() {
        View.inflate(getContext(), B.dropdown, this);
        this.f1134B = (ScrollView) findViewById(A.f8955A);
        this.f1147z = (RecyclerView) findViewById(A.languagesRecyclerView);
        this.f1135C = (LinearLayout) findViewById(A.layoutSwitch);
        this.f1136D = (LinearLayout) findViewById(A.settings);
        this.f1137E = (LinearLayout) findViewById(A.tutorial);
        this.f1138F = (ImageView) findViewById(A.closeButton);
        this.f1139G = (TextView) findViewById(A.chooseLanguageLabel);
        this.f1140H = (ImageView) findViewById(A.layoutSwitchButton);
        this.f1141I = (TextView) findViewById(A.layoutSwitchText);
        this.f1142J = (ImageView) findViewById(A.settingsButton);
        this.f1143K = (TextView) findViewById(A.settingsText);
        this.f1144L = (ImageView) findViewById(A.tutorialButton);
        this.f1145M = (TextView) findViewById(A.tutorialText);
        RecyclerView recyclerView = this.f1147z;
        u uVar = null;
        if (recyclerView == null) {
            o.p("recyclerView");
            recyclerView = null;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.P2(0);
        flexboxLayoutManager.R2(0);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        this.f1133A = new u();
        RecyclerView recyclerView2 = this.f1147z;
        if (recyclerView2 == null) {
            o.p("recyclerView");
            recyclerView2 = null;
        }
        u uVar2 = this.f1133A;
        if (uVar2 == null) {
            o.p("adapter");
        } else {
            uVar = uVar2;
        }
        recyclerView2.setAdapter(uVar);
    }

    /* access modifiers changed from: private */
    public static final void M(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final q N(C0906a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final void O(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final q P(C0906a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final void Q(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void R(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void S(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void J(View view, C0906a aVar) {
        o.e(view, "parentView");
        C0350d dVar = this.f1146y;
        if (dVar != null) {
            ScrollView scrollView = this.f1134B;
            if (scrollView == null) {
                o.p("scrollView");
                scrollView = null;
            }
            dVar.c(scrollView, view, new x(aVar));
        }
    }

    public final void K(Map map, String str) {
        o.e(map, "languages");
        o.e(str, "dominantLanguage");
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(C0718m.t(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new q((String) entry.getValue(), (String) entry.getKey(), o.a(entry.getKey(), str)));
        }
        List D02 = C0718m.D0(arrayList);
        D02.add(C0347a.f1149a);
        u uVar = this.f1133A;
        if (uVar == null) {
            o.p("adapter");
            uVar = null;
        }
        uVar.C(D02);
    }

    public final void L(C0906a aVar) {
        C0350d dVar = this.f1146y;
        if (dVar != null) {
            ScrollView scrollView = this.f1134B;
            if (scrollView == null) {
                o.p("scrollView");
                scrollView = null;
            }
            dVar.d(scrollView, new B(aVar));
        }
    }

    public final C0350d getDropdownAnimator() {
        return this.f1146y;
    }

    public final void setDropdownAnimator(C0350d dVar) {
        this.f1146y = dVar;
    }

    public final void setLayoutType(KeyboardLayoutType keyboardLayoutType) {
        o.e(keyboardLayoutType, "layoutType");
        int i4 = a.f1148a[keyboardLayoutType.ordinal()];
        TextView textView = null;
        if (i4 == 1 || i4 == 2) {
            ImageView imageView = this.f1140H;
            if (imageView == null) {
                o.p("layoutSwitchButton");
                imageView = null;
            }
            imageView.setImageResource(C0561z.traditional_button);
            TextView textView2 = this.f1141I;
            if (textView2 == null) {
                o.p("layoutSwitchText");
            } else {
                textView = textView2;
            }
            textView.setText(C.keyboard_dropdown_topmenu_traditionallayout);
            return;
        }
        ImageView imageView2 = this.f1140H;
        if (imageView2 == null) {
            o.p("layoutSwitchButton");
            imageView2 = null;
        }
        imageView2.setImageResource(C0561z.hexagon_button);
        TextView textView3 = this.f1141I;
        if (textView3 == null) {
            o.p("layoutSwitchText");
        } else {
            textView = textView3;
        }
        textView.setText(C.keyboard_dropdown_topmenu_hexagonlayout);
    }

    public final void setOnAddLanguageCallback(C0906a aVar) {
        o.e(aVar, "onAddLanguageCallback");
        u uVar = this.f1133A;
        if (uVar == null) {
            o.p("adapter");
            uVar = null;
        }
        uVar.G(aVar);
    }

    public final void setOnCloseCallback(C0906a aVar) {
        o.e(aVar, "onCloseCallback");
        ImageView imageView = this.f1138F;
        if (imageView == null) {
            o.p("closeButton");
            imageView = null;
        }
        imageView.setOnClickListener(new C(aVar));
        setOnClickListener(new D(aVar));
    }

    public final void setOnLanguageSelectedCallback(l lVar) {
        o.e(lVar, "onLanguageSelectedCallback");
        u uVar = this.f1133A;
        if (uVar == null) {
            o.p("adapter");
            uVar = null;
        }
        uVar.H(lVar);
    }

    public final void setOnLayoutSwitchCallback(C0906a aVar) {
        o.e(aVar, "onLayoutSwitchCallback");
        LinearLayout linearLayout = this.f1135C;
        if (linearLayout == null) {
            o.p("layoutSwitchLayout");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new z(aVar));
    }

    public final void setOnSettingsClickCallback(C0906a aVar) {
        o.e(aVar, "onSettingsClickedCallback");
        LinearLayout linearLayout = this.f1136D;
        if (linearLayout == null) {
            o.p("settingsLayout");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new y(aVar));
    }

    public final void setOnTutorialClickCallback(C0906a aVar) {
        o.e(aVar, "onTutorialClick");
        LinearLayout linearLayout = this.f1137E;
        if (linearLayout == null) {
            o.p("tutorialLayout");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new A(aVar));
    }

    public final void setTheme(ThemeModel.SmartBarTheme smartBarTheme) {
        o.e(smartBarTheme, "theme");
        u uVar = this.f1133A;
        ImageView imageView = null;
        if (uVar == null) {
            o.p("adapter");
            uVar = null;
        }
        uVar.F(smartBarTheme);
        RecyclerView recyclerView = this.f1147z;
        if (recyclerView == null) {
            o.p("recyclerView");
            recyclerView = null;
        }
        u uVar2 = this.f1133A;
        if (uVar2 == null) {
            o.p("adapter");
            uVar2 = null;
        }
        recyclerView.setAdapter(uVar2);
        TextView textView = this.f1145M;
        if (textView == null) {
            o.p("tutorialText");
            textView = null;
        }
        textView.setTextColor(smartBarTheme.getUnselectedFontColor());
        TextView textView2 = this.f1143K;
        if (textView2 == null) {
            o.p("settingsText");
            textView2 = null;
        }
        textView2.setTextColor(smartBarTheme.getUnselectedFontColor());
        TextView textView3 = this.f1139G;
        if (textView3 == null) {
            o.p("chooseLanguageLabel");
            textView3 = null;
        }
        textView3.setTextColor(smartBarTheme.getFontColor());
        TextView textView4 = this.f1141I;
        if (textView4 == null) {
            o.p("layoutSwitchText");
            textView4 = null;
        }
        textView4.setTextColor(smartBarTheme.getUnselectedFontColor());
        LinearLayout linearLayout = this.f1135C;
        if (linearLayout == null) {
            o.p("layoutSwitchLayout");
            linearLayout = null;
        }
        linearLayout.getBackground().setTint(smartBarTheme.getUnselectedBackgroundColor());
        LinearLayout linearLayout2 = this.f1137E;
        if (linearLayout2 == null) {
            o.p("tutorialLayout");
            linearLayout2 = null;
        }
        linearLayout2.getBackground().setTint(smartBarTheme.getUnselectedBackgroundColor());
        LinearLayout linearLayout3 = this.f1136D;
        if (linearLayout3 == null) {
            o.p("settingsLayout");
            linearLayout3 = null;
        }
        linearLayout3.getBackground().setTint(smartBarTheme.getUnselectedBackgroundColor());
        ImageView imageView2 = this.f1144L;
        if (imageView2 == null) {
            o.p("tutorialButton");
            imageView2 = null;
        }
        imageView2.getDrawable().setTint(smartBarTheme.getUnselectedFontColor());
        ImageView imageView3 = this.f1142J;
        if (imageView3 == null) {
            o.p("settingsButton");
            imageView3 = null;
        }
        imageView3.getDrawable().setTint(smartBarTheme.getUnselectedFontColor());
        ImageView imageView4 = this.f1140H;
        if (imageView4 == null) {
            o.p("layoutSwitchButton");
            imageView4 = null;
        }
        imageView4.getDrawable().setTint(smartBarTheme.getUnselectedFontColor());
        ScrollView scrollView = this.f1134B;
        if (scrollView == null) {
            o.p("scrollView");
            scrollView = null;
        }
        scrollView.setBackgroundColor(smartBarTheme.getBackgroundColor());
        ImageView imageView5 = this.f1138F;
        if (imageView5 == null) {
            o.p("closeButton");
        } else {
            imageView = imageView5;
        }
        imageView.setImageTintList(ColorStateList.valueOf(smartBarTheme.getArrowCloseIconFontColor()));
    }

    public final void setTopMargin(int i4) {
        View childAt = getChildAt(0);
        o.d(childAt, "getChildAt(...)");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.topMargin = i4;
            childAt.setLayoutParams(bVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        I();
    }
}
