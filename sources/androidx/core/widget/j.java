package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class j {

    static class a {
        static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }

        static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    static class b {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static int b(View view) {
            return view.getLayoutDirection();
        }

        static int c(View view) {
            return view.getTextDirection();
        }

        static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        static void f(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
        }

        static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void h(View view, int i4) {
            view.setTextDirection(i4);
        }
    }

    static class c {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int i4) {
            textView.setBreakStrategy(i4);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int i4) {
            textView.setHyphenationFrequency(i4);
        }
    }

    static class d {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static void f(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        static void g(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        static void h(TextView textView, int i4) {
            textView.setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    static class f {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i4) {
            textView.setFirstBaselineToTopHeight(i4);
        }
    }

    private static class g implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f5439a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f5440b;

        /* renamed from: c  reason: collision with root package name */
        private Class f5441c;

        /* renamed from: d  reason: collision with root package name */
        private Method f5442d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f5443e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5444f = false;

        g(ActionMode.Callback callback, TextView textView) {
            this.f5439a = callback;
            this.f5440b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(a(), 0)) {
                if (f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        private void g(Menu menu) {
            Method method;
            Context context = this.f5440b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f5444f) {
                this.f5444f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f5441c = cls;
                    this.f5442d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f5443e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f5441c = null;
                    this.f5442d = null;
                    this.f5443e = false;
                }
            }
            try {
                if (!this.f5443e || !this.f5441c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f5442d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List c4 = c(context, packageManager);
                for (int i4 = 0; i4 < c4.size(); i4++) {
                    ResolveInfo resolveInfo = (ResolveInfo) c4.get(i4);
                    menu.add(0, 0, i4 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f5440b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        public ActionMode.Callback d() {
            return this.f5439a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f5439a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f5439a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f5439a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f5439a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static Drawable[] a(TextView textView) {
        return b.a(textView);
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int d(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        if (textDirectionHeuristic == textDirectionHeuristic3) {
            return 7;
        }
        return 1;
    }

    private static TextDirectionHeuristic e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z3 = true;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (b.b(textView) != 1) {
                z3 = false;
            }
            switch (b.c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z3) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(f.b(d.a(b.d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    public static n.a f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new n.a(f.c(textView));
        }
        n.a.C0080a aVar = new n.a.C0080a(new TextPaint(textView.getPaint()));
        aVar.b(c.a(textView));
        aVar.c(c.d(textView));
        aVar.d(e(textView));
        return aVar.a();
    }

    public static void g(TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i4);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    public static void h(TextView textView, ColorStateList colorStateList) {
        androidx.core.util.g.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.f(textView, colorStateList);
        } else if (textView instanceof m) {
            ((m) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void i(TextView textView, PorterDuff.Mode mode) {
        androidx.core.util.g.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.g(textView, mode);
        } else if (textView instanceof m) {
            ((m) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void k(TextView textView, int i4) {
        int i5;
        androidx.core.util.g.d(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            f.d(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i5 = fontMetricsInt.top;
        } else {
            i5 = fontMetricsInt.ascent;
        }
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void l(TextView textView, int i4) {
        int i5;
        androidx.core.util.g.d(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i5 = fontMetricsInt.bottom;
        } else {
            i5 = fontMetricsInt.descent;
        }
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void m(TextView textView, int i4) {
        androidx.core.util.g.d(i4);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i4 != fontMetricsInt) {
            textView.setLineSpacing((float) (i4 - fontMetricsInt), 1.0f);
        }
    }

    public static void n(TextView textView, n nVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        f(textView);
        throw null;
    }

    public static void o(TextView textView, int i4) {
        textView.setTextAppearance(i4);
    }

    public static void p(TextView textView, n.a aVar) {
        b.h(textView, d(aVar.d()));
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        if (!(callback instanceof g) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((g) callback).d();
    }

    public static ActionMode.Callback r(TextView textView, ActionMode.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26 || i4 > 27 || (callback instanceof g) || callback == null) {
            return callback;
        }
        return new g(callback, textView);
    }
}
