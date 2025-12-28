package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.P;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n.C0822a;

public class SearchView extends O implements androidx.appcompat.view.c {

    /* renamed from: n0  reason: collision with root package name */
    static final o f3309n0;

    /* renamed from: A  reason: collision with root package name */
    private Rect f3310A;

    /* renamed from: B  reason: collision with root package name */
    private int[] f3311B;

    /* renamed from: C  reason: collision with root package name */
    private int[] f3312C;

    /* renamed from: D  reason: collision with root package name */
    private final ImageView f3313D;

    /* renamed from: E  reason: collision with root package name */
    private final Drawable f3314E;

    /* renamed from: F  reason: collision with root package name */
    private final int f3315F;

    /* renamed from: G  reason: collision with root package name */
    private final int f3316G;

    /* renamed from: H  reason: collision with root package name */
    private final Intent f3317H;

    /* renamed from: I  reason: collision with root package name */
    private final Intent f3318I;

    /* renamed from: J  reason: collision with root package name */
    private final CharSequence f3319J;

    /* renamed from: K  reason: collision with root package name */
    View.OnFocusChangeListener f3320K;

    /* renamed from: L  reason: collision with root package name */
    private View.OnClickListener f3321L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f3322M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f3323N;

    /* renamed from: O  reason: collision with root package name */
    K.a f3324O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f3325P;

    /* renamed from: Q  reason: collision with root package name */
    private CharSequence f3326Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f3327R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f3328S;

    /* renamed from: T  reason: collision with root package name */
    private int f3329T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f3330U;

    /* renamed from: V  reason: collision with root package name */
    private CharSequence f3331V;

    /* renamed from: W  reason: collision with root package name */
    private CharSequence f3332W;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f3333a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f3334b0;

    /* renamed from: c0  reason: collision with root package name */
    SearchableInfo f3335c0;

    /* renamed from: d0  reason: collision with root package name */
    private Bundle f3336d0;

    /* renamed from: e0  reason: collision with root package name */
    private final Runnable f3337e0;

    /* renamed from: f0  reason: collision with root package name */
    private Runnable f3338f0;

    /* renamed from: g0  reason: collision with root package name */
    private final WeakHashMap f3339g0;

    /* renamed from: h0  reason: collision with root package name */
    private final View.OnClickListener f3340h0;

    /* renamed from: i0  reason: collision with root package name */
    View.OnKeyListener f3341i0;

    /* renamed from: j0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f3342j0;

    /* renamed from: k0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f3343k0;

    /* renamed from: l0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f3344l0;

    /* renamed from: m0  reason: collision with root package name */
    private TextWatcher f3345m0;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f3346p;

    /* renamed from: q  reason: collision with root package name */
    private final View f3347q;

    /* renamed from: r  reason: collision with root package name */
    private final View f3348r;

    /* renamed from: s  reason: collision with root package name */
    private final View f3349s;

    /* renamed from: t  reason: collision with root package name */
    final ImageView f3350t;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f3351u;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f3352v;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f3353w;

    /* renamed from: x  reason: collision with root package name */
    private final View f3354x;

    /* renamed from: y  reason: collision with root package name */
    private q f3355y;

    /* renamed from: z  reason: collision with root package name */
    private Rect f3356z;

    public static class SearchAutoComplete extends C0380d {

        /* renamed from: e  reason: collision with root package name */
        private int f3357e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f3358f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3359g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f3360h;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0822a.f14680m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 >= 600) {
                return 192;
            }
            if (i4 < 640 || i5 < 480) {
                return 160;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f3309n0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f3359g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3359g = false;
            }
        }

        public boolean enoughToFilter() {
            if (this.f3357e <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3359g) {
                removeCallbacks(this.f3360h);
                post(this.f3360h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z3, int i4, Rect rect) {
            super.onFocusChanged(z3, i4, rect);
            this.f3358f.Z();
        }

        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3358f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        public void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f3358f.hasFocus() && getVisibility() == 0) {
                this.f3359g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z3) {
                this.f3359g = false;
                removeCallbacks(this.f3360h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f3359g = false;
                removeCallbacks(this.f3360h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f3359g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f3358f = searchView;
        }

        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f3357e = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f3360h = new a();
            this.f3357e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            K.a aVar = SearchView.this.f3324O;
            if (aVar instanceof X) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z3) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f3320K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z3);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f3350t) {
                searchView.V();
            } else if (view == searchView.f3352v) {
                searchView.R();
            } else if (view == searchView.f3351u) {
                searchView.W();
            } else if (view == searchView.f3353w) {
                searchView.a0();
            } else if (view == searchView.f3346p) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f3335c0 == null) {
                return false;
            }
            if (searchView.f3346p.isPopupShowing() && SearchView.this.f3346p.getListSelection() != -1) {
                return SearchView.this.X(view, i4, keyEvent);
            }
            if (SearchView.this.f3346p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.f3346p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.S(i4, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.T(i4);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i4) {
            searchAutoComplete.setInputMethodMode(i4);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a  reason: collision with root package name */
        private Method f3372a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f3373b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f3374c = null;

        o() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                this.f3372a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                this.f3373b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f3374c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f3373b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f3372a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f3374c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends M.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f3375c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            /* renamed from: c */
            public p[] newArray(int i4) {
                return new p[i4];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3375c + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f3375c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3375c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f3376a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f3377b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f3378c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f3379d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f3380e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3381f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f3380e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f3376a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f3377b.set(rect);
            this.f3379d.set(rect);
            Rect rect3 = this.f3379d;
            int i4 = this.f3380e;
            rect3.inset(-i4, -i4);
            this.f3378c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x0023
                if (r2 == r3) goto L_0x0023
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003e
            L_0x001b:
                boolean r2 = r8.f3381f
                r8.f3381f = r4
            L_0x001f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0023:
                boolean r2 = r8.f3381f
                if (r2 == 0) goto L_0x001f
                android.graphics.Rect r6 = r8.f3379d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x001f
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.f3377b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.f3381f = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0073
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.f3378c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.f3376a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f3376a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006d
            L_0x0060:
                android.graphics.Rect r2 = r8.f3378c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006d:
                android.view.View r0 = r8.f3376a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0073:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        f3309n0 = oVar;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3332W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3336d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f3335c0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i4, String str) {
        int i5;
        Uri uri;
        String o4;
        try {
            String o5 = X.o(cursor, "suggest_intent_action");
            if (o5 == null) {
                o5 = this.f3335c0.getSuggestIntentAction();
            }
            if (o5 == null) {
                o5 = "android.intent.action.SEARCH";
            }
            String str2 = o5;
            String o6 = X.o(cursor, "suggest_intent_data");
            if (o6 == null) {
                o6 = this.f3335c0.getSuggestIntentData();
            }
            if (!(o6 == null || (o4 = X.o(cursor, "suggest_intent_data_id")) == null)) {
                o6 = o6 + "/" + Uri.encode(o4);
            }
            if (o6 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o6);
            }
            return C(str2, uri, X.o(cursor, "suggest_intent_extra_data"), X.o(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                i5 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i5 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i4;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3336d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i4 = searchableInfo.getVoiceMaxResults();
        } else {
            i4 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i4);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void G() {
        this.f3346p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f3311B);
        getLocationInWindow(this.f3312C);
        int[] iArr = this.f3311B;
        int i4 = iArr[1];
        int[] iArr2 = this.f3312C;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f3322M || this.f3314E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f3346p.getTextSize()) * 1.25d);
        this.f3314E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f3314E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        Intent intent;
        SearchableInfo searchableInfo = this.f3335c0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f3335c0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f3317H;
        } else if (this.f3335c0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f3318I;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private boolean N() {
        if ((this.f3325P || this.f3330U) && !L()) {
            return true;
        }
        return false;
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e4) {
                Log.e("SearchView", "Failed launch activity: " + intent, e4);
            }
        }
    }

    private boolean Q(int i4, int i5, String str) {
        Cursor b4 = this.f3324O.b();
        if (b4 == null || !b4.moveToPosition(i4)) {
            return false;
        }
        O(D(b4, i5, str));
        return true;
    }

    private void b0() {
        post(this.f3337e0);
    }

    private void c0(int i4) {
        Editable text = this.f3346p.getText();
        Cursor b4 = this.f3324O.b();
        if (b4 != null) {
            if (b4.moveToPosition(i4)) {
                CharSequence c4 = this.f3324O.c(b4);
                if (c4 != null) {
                    setQuery(c4);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void e0() {
        boolean z3;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f3346p.getText());
        int i4 = 0;
        if (!isEmpty || (this.f3322M && !this.f3333a0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        ImageView imageView = this.f3352v;
        if (!z3) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        Drawable drawable = this.f3352v.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f3346p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(n.d.f14707e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(n.d.f14708f);
    }

    private void h0() {
        this.f3346p.setThreshold(this.f3335c0.getSuggestThreshold());
        this.f3346p.setImeOptions(this.f3335c0.getImeOptions());
        int inputType = this.f3335c0.getInputType();
        int i4 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3335c0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f3346p.setInputType(inputType);
        K.a aVar = this.f3324O;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f3335c0.getSuggestAuthority() != null) {
            X x3 = new X(getContext(), this, this.f3335c0, this.f3339g0);
            this.f3324O = x3;
            this.f3346p.setAdapter(x3);
            X x4 = (X) this.f3324O;
            if (this.f3327R) {
                i4 = 2;
            }
            x4.x(i4);
        }
    }

    private void i0() {
        int i4;
        if (!N() || !(this.f3351u.getVisibility() == 0 || this.f3353w.getVisibility() == 0)) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        this.f3349s.setVisibility(i4);
    }

    private void j0(boolean z3) {
        int i4;
        if (!this.f3325P || !N() || !hasFocus() || (!z3 && this.f3330U)) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        this.f3351u.setVisibility(i4);
    }

    private void k0(boolean z3) {
        int i4;
        int i5;
        this.f3323N = z3;
        int i6 = 8;
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f3346p.getText());
        this.f3350t.setVisibility(i4);
        j0(!isEmpty);
        View view = this.f3347q;
        if (z3) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        view.setVisibility(i5);
        if (this.f3313D.getDrawable() != null && !this.f3322M) {
            i6 = 0;
        }
        this.f3313D.setVisibility(i6);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z3) {
        int i4 = 8;
        if (this.f3330U && !L() && z3) {
            this.f3351u.setVisibility(8);
            i4 = 0;
        }
        this.f3353w.setVisibility(i4);
    }

    private void setQuery(CharSequence charSequence) {
        int i4;
        this.f3346p.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f3346p;
        if (TextUtils.isEmpty(charSequence)) {
            i4 = 0;
        } else {
            i4 = charSequence.length();
        }
        searchAutoComplete.setSelection(i4);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i4;
        int i5;
        if (this.f3354x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f3348r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b4 = n0.b(this);
            if (this.f3322M) {
                i4 = resources.getDimensionPixelSize(n.d.f14705c) + resources.getDimensionPixelSize(n.d.f14706d);
            } else {
                i4 = 0;
            }
            this.f3346p.getDropDownBackground().getPadding(rect);
            if (b4) {
                i5 = -rect.left;
            } else {
                i5 = paddingLeft - (rect.left + i4);
            }
            this.f3346p.setDropDownHorizontalOffset(i5);
            this.f3346p.setDropDownWidth((((this.f3354x.getWidth() + rect.left) + rect.right) + i4) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f3346p);
            return;
        }
        o oVar = f3309n0;
        oVar.b(this.f3346p);
        oVar.a(this.f3346p);
    }

    public boolean L() {
        return this.f3323N;
    }

    /* access modifiers changed from: package-private */
    public void P(int i4, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i4, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.f3346p.getText())) {
            this.f3346p.setText("");
            this.f3346p.requestFocus();
            this.f3346p.setImeVisibility(true);
        } else if (this.f3322M) {
            clearFocus();
            k0(true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i4, int i5, String str) {
        Q(i4, 0, (String) null);
        this.f3346p.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i4) {
        c0(i4);
        return true;
    }

    /* access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.f3346p.requestFocus();
        this.f3346p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3321L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.f3346p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f3335c0 != null) {
                P(0, (String) null, text.toString());
            }
            this.f3346p.setImeVisibility(false);
            G();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i4, KeyEvent keyEvent) {
        int i5;
        if (this.f3335c0 != null && this.f3324O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return S(this.f3346p.getListSelection(), 0, (String) null);
            }
            if (i4 == 21 || i4 == 22) {
                if (i4 == 21) {
                    i5 = 0;
                } else {
                    i5 = this.f3346p.length();
                }
                this.f3346p.setSelection(i5);
                this.f3346p.setListSelection(0);
                this.f3346p.clearListSelection();
                this.f3346p.b();
                return true;
            } else if (i4 == 19) {
                this.f3346p.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.f3346p.getText();
        this.f3332W = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        this.f3331V = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.f3346p.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        SearchableInfo searchableInfo = this.f3335c0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.f3317H, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.f3318I, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void c() {
        if (!this.f3333a0) {
            this.f3333a0 = true;
            int imeOptions = this.f3346p.getImeOptions();
            this.f3334b0 = imeOptions;
            this.f3346p.setImeOptions(imeOptions | 33554432);
            this.f3346p.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f3328S = true;
        super.clearFocus();
        this.f3346p.clearFocus();
        this.f3346p.setImeVisibility(false);
        this.f3328S = false;
    }

    public void d0(CharSequence charSequence, boolean z3) {
        this.f3346p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f3346p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f3332W = charSequence;
        }
        if (z3 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f3346p.setImeOptions(this.f3334b0);
        this.f3333a0 = false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr;
        if (this.f3346p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f3348r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3349s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f3346p.getImeOptions();
    }

    public int getInputType() {
        return this.f3346p.getInputType();
    }

    public int getMaxWidth() {
        return this.f3329T;
    }

    public CharSequence getQuery() {
        return this.f3346p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3326Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3335c0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f3319J;
        }
        return getContext().getText(this.f3335c0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f3316G;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f3315F;
    }

    public K.a getSuggestionsAdapter() {
        return this.f3324O;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3337e0);
        post(this.f3338f0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            I(this.f3346p, this.f3356z);
            Rect rect = this.f3310A;
            Rect rect2 = this.f3356z;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            q qVar = this.f3355y;
            if (qVar == null) {
                q qVar2 = new q(this.f3310A, this.f3356z, this.f3346p);
                this.f3355y = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.f3310A, this.f3356z);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        int i6;
        if (L()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f3329T;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3329T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f3329T) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.t());
        k0(pVar.f3375c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f3375c = L();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        b0();
    }

    public boolean requestFocus(int i4, Rect rect) {
        if (this.f3328S || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f3346p.requestFocus(i4, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3336d0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f3322M != z3) {
            this.f3322M = z3;
            k0(z3);
            g0();
        }
    }

    public void setImeOptions(int i4) {
        this.f3346p.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f3346p.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f3329T = i4;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3320K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3321L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3326Q = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        int i4;
        this.f3327R = z3;
        K.a aVar = this.f3324O;
        if (aVar instanceof X) {
            X x3 = (X) aVar;
            if (z3) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            x3.x(i4);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3335c0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K3 = K();
        this.f3330U = K3;
        if (K3) {
            this.f3346p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f3325P = z3;
        k0(L());
    }

    public void setSuggestionsAdapter(K.a aVar) {
        this.f3324O = aVar;
        this.f3346p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14662F);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3356z = new Rect();
        this.f3310A = new Rect();
        this.f3311B = new int[2];
        this.f3312C = new int[2];
        this.f3337e0 = new b();
        this.f3338f0 = new c();
        this.f3339g0 = new WeakHashMap();
        f fVar = new f();
        this.f3340h0 = fVar;
        this.f3341i0 = new g();
        h hVar = new h();
        this.f3342j0 = hVar;
        i iVar = new i();
        this.f3343k0 = iVar;
        j jVar = new j();
        this.f3344l0 = jVar;
        this.f3345m0 = new a();
        int[] iArr = n.j.f14971f2;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i4;
        c0 v3 = c0.v(context, attributeSet2, iArr, i5, 0);
        P.m0(this, context, iArr, attributeSet2, v3.r(), i5, 0);
        LayoutInflater.from(context).inflate(v3.n(n.j.f15021p2, n.g.f14820r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(n.f.f14764D);
        this.f3346p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3347q = findViewById(n.f.f14802z);
        View findViewById = findViewById(n.f.f14763C);
        this.f3348r = findViewById;
        View findViewById2 = findViewById(n.f.f14770J);
        this.f3349s = findViewById2;
        ImageView imageView = (ImageView) findViewById(n.f.f14800x);
        this.f3350t = imageView;
        ImageView imageView2 = (ImageView) findViewById(n.f.f14761A);
        this.f3351u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(n.f.f14801y);
        this.f3352v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(n.f.f14765E);
        this.f3353w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(n.f.f14762B);
        this.f3313D = imageView5;
        P.s0(findViewById, v3.g(n.j.f15026q2));
        P.s0(findViewById2, v3.g(n.j.f15046u2));
        int i6 = n.j.f15041t2;
        imageView.setImageDrawable(v3.g(i6));
        imageView2.setImageDrawable(v3.g(n.j.f15011n2));
        imageView3.setImageDrawable(v3.g(n.j.f14996k2));
        imageView4.setImageDrawable(v3.g(n.j.f15054w2));
        imageView5.setImageDrawable(v3.g(i6));
        this.f3314E = v3.g(n.j.f15036s2);
        h0.a(imageView, getResources().getString(n.h.f14834l));
        this.f3315F = v3.n(n.j.f15050v2, n.g.f14819q);
        this.f3316G = v3.n(n.j.f15001l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f3345m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f3341i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v3.a(n.j.f15016o2, true));
        int f4 = v3.f(n.j.f14981h2, -1);
        if (f4 != -1) {
            setMaxWidth(f4);
        }
        this.f3319J = v3.p(n.j.f15006m2);
        this.f3326Q = v3.p(n.j.f15031r2);
        int k4 = v3.k(n.j.f14991j2, -1);
        if (k4 != -1) {
            setImeOptions(k4);
        }
        int k5 = v3.k(n.j.f14986i2, -1);
        if (k5 != -1) {
            setInputType(k5);
        }
        setFocusable(v3.a(n.j.f14976g2, true));
        v3.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3317H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3318I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3354x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f3322M);
        g0();
    }
}
