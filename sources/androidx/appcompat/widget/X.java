package androidx.appcompat.widget;

import K.c;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.uuid.Uuid;
import n.C0822a;
import n.f;

class X extends c implements View.OnClickListener {

    /* renamed from: l  reason: collision with root package name */
    private final SearchView f3461l;

    /* renamed from: m  reason: collision with root package name */
    private final SearchableInfo f3462m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f3463n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap f3464o;

    /* renamed from: p  reason: collision with root package name */
    private final int f3465p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3466q = false;

    /* renamed from: r  reason: collision with root package name */
    private int f3467r = 1;

    /* renamed from: s  reason: collision with root package name */
    private ColorStateList f3468s;

    /* renamed from: t  reason: collision with root package name */
    private int f3469t = -1;

    /* renamed from: u  reason: collision with root package name */
    private int f3470u = -1;

    /* renamed from: v  reason: collision with root package name */
    private int f3471v = -1;

    /* renamed from: w  reason: collision with root package name */
    private int f3472w = -1;

    /* renamed from: x  reason: collision with root package name */
    private int f3473x = -1;

    /* renamed from: y  reason: collision with root package name */
    private int f3474y = -1;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f3475a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f3476b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f3477c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f3478d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f3479e;

        public a(View view) {
            this.f3475a = (TextView) view.findViewById(16908308);
            this.f3476b = (TextView) view.findViewById(16908309);
            this.f3477c = (ImageView) view.findViewById(16908295);
            this.f3478d = (ImageView) view.findViewById(16908296);
            this.f3479e = (ImageView) view.findViewById(f.f14793q);
        }
    }

    public X(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f3461l = searchView;
        this.f3462m = searchableInfo;
        this.f3465p = searchView.getSuggestionCommitIconResId();
        this.f3463n = context;
        this.f3464o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3464o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3464o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f3468s == null) {
            TypedValue typedValue = new TypedValue();
            this.f3463n.getTheme().resolveAttribute(C0822a.f14665I, typedValue, true);
            this.f3468s = this.f3463n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f3468s, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f3463n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, Uuid.SIZE_BITS);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("SuggestionsAdapter", e4.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f3464o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f3464o.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f3463n.getResources());
        }
        Drawable m4 = m(componentName);
        if (m4 != null) {
            constantState = m4.getConstantState();
        }
        this.f3464o.put(flattenToShortString, constantState);
        return m4;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n4 = n(this.f3462m.getSearchActivity());
        if (n4 != null) {
            return n4;
        }
        return this.f3463n.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            if (r3 == 0) goto L_0x002f
            android.graphics.drawable.Drawable r7 = r6.r(r7)     // Catch:{ NotFoundException -> 0x0018 }
            return r7
        L_0x0016:
            r0 = move-exception
            goto L_0x0087
        L_0x0018:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x002f:
            android.content.Context r3 = r6.f3463n     // Catch:{ FileNotFoundException -> 0x0016 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            if (r3 == 0) goto L_0x0070
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0057 }
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0056
        L_0x0043:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0056:
            return r4
        L_0x0057:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x006f
        L_0x005c:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0016 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x006f:
            throw r4     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0070:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0016 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0016 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0016 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0016 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0016 }
        L_0x0087:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.X.q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3463n.getPackageName() + "/" + parseInt;
            Drawable k4 = k(str2);
            if (k4 != null) {
                return k4;
            }
            Drawable d4 = androidx.core.content.a.d(this.f3463n, parseInt);
            A(str2, d4);
            return d4;
        } catch (NumberFormatException unused) {
            Drawable k5 = k(str);
            if (k5 != null) {
                return k5;
            }
            Drawable q4 = q(Uri.parse(str));
            A(str, q4);
            return q4;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private Drawable t(Cursor cursor) {
        int i4 = this.f3472w;
        if (i4 == -1) {
            return null;
        }
        Drawable s4 = s(cursor.getString(i4));
        if (s4 != null) {
            return s4;
        }
        return p();
    }

    private Drawable u(Cursor cursor) {
        int i4 = this.f3473x;
        if (i4 == -1) {
            return null;
        }
        return s(cursor.getString(i4));
    }

    private static String w(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public void a(Cursor cursor) {
        if (this.f3466q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f3469t = cursor.getColumnIndex("suggest_text_1");
                this.f3470u = cursor.getColumnIndex("suggest_text_2");
                this.f3471v = cursor.getColumnIndex("suggest_text_2_url");
                this.f3472w = cursor.getColumnIndex("suggest_icon_1");
                this.f3473x = cursor.getColumnIndex("suggest_icon_2");
                this.f3474y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    public CharSequence c(Cursor cursor) {
        String o4;
        String o5;
        if (cursor == null) {
            return null;
        }
        String o6 = o(cursor, "suggest_intent_query");
        if (o6 != null) {
            return o6;
        }
        if (this.f3462m.shouldRewriteQueryFromData() && (o5 = o(cursor, "suggest_intent_data")) != null) {
            return o5;
        }
        if (!this.f3462m.shouldRewriteQueryFromText() || (o4 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o4;
    }

    public Cursor d(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.f3461l.getVisibility() == 0 && this.f3461l.getWindowVisibility() == 0) {
            try {
                Cursor v3 = v(this.f3462m, str, 50);
                if (v3 != null) {
                    v3.getCount();
                    return v3;
                }
            } catch (RuntimeException e4) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e4);
            }
        }
        return null;
    }

    public void e(View view, Context context, Cursor cursor) {
        int i4;
        CharSequence charSequence;
        a aVar = (a) view.getTag();
        int i5 = this.f3474y;
        if (i5 != -1) {
            i4 = cursor.getInt(i5);
        } else {
            i4 = 0;
        }
        if (aVar.f3475a != null) {
            z(aVar.f3475a, w(cursor, this.f3469t));
        }
        if (aVar.f3476b != null) {
            String w3 = w(cursor, this.f3471v);
            if (w3 != null) {
                charSequence = l(w3);
            } else {
                charSequence = w(cursor, this.f3470u);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f3475a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f3475a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f3475a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f3475a.setMaxLines(1);
                }
            }
            z(aVar.f3476b, charSequence);
        }
        ImageView imageView = aVar.f3477c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f3478d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i6 = this.f3467r;
        if (i6 == 2 || (i6 == 1 && (i4 & 1) != 0)) {
            aVar.f3479e.setVisibility(0);
            aVar.f3479e.setTag(aVar.f3475a.getText());
            aVar.f3479e.setOnClickListener(this);
            return;
        }
        aVar.f3479e.setVisibility(8);
    }

    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View g4 = g(this.f3463n, b(), viewGroup);
            if (g4 != null) {
                ((a) g4.getTag()).f3475a.setText(e4.toString());
            }
            return g4;
        }
    }

    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View h4 = h(this.f3463n, b(), viewGroup);
            if (h4 != null) {
                ((a) h4.getTag()).f3475a.setText(e4.toString());
            }
            return h4;
        }
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h4 = super.h(context, cursor, viewGroup);
        h4.setTag(new a(h4));
        ((ImageView) h4.findViewById(f.f14793q)).setImageResource(this.f3465p);
        return h4;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3461l.U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable r(Uri uri) {
        int i4;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3463n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i4 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i4 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i4 != 0) {
                        return resourcesForApplication.getDrawable(i4);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor v(SearchableInfo searchableInfo, String str, int i4) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i4 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f3463n.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void x(int i4) {
        this.f3467r = i4;
    }
}
