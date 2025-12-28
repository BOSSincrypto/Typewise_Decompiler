package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.view.d;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.C0380d;
import androidx.appcompat.widget.C0382f;
import androidx.appcompat.widget.C0383g;
import androidx.appcompat.widget.C0384h;
import androidx.appcompat.widget.C0388l;
import androidx.appcompat.widget.C0392p;
import androidx.appcompat.widget.C0394s;
import androidx.appcompat.widget.C0397v;
import androidx.appcompat.widget.C0398w;
import androidx.appcompat.widget.C0400y;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.Z;
import androidx.appcompat.widget.r;
import androidx.core.view.P;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.j;
import y.g;

public class y {

    /* renamed from: b  reason: collision with root package name */
    private static final Class[] f2724b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2725c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f2726d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2727e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f2728f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f2729g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    private static final g f2730h = new g();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2731a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f2732a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2733b;

        /* renamed from: c  reason: collision with root package name */
        private Method f2734c;

        /* renamed from: d  reason: collision with root package name */
        private Context f2735d;

        public a(View view, String str) {
            this.f2732a = view;
            this.f2733b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2733b, new Class[]{View.class})) != null) {
                        this.f2734c = method;
                        this.f2735d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f2732a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f2732a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2733b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2732a.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f2734c == null) {
                a(this.f2732a.getContext());
            }
            try {
                this.f2734c.invoke(this.f2735d, new Object[]{view});
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("Could not execute method for android:onClick", e5);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2726d);
            if (obtainStyledAttributes.hasValue(0)) {
                P.p0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2727e);
            if (obtainStyledAttributes2.hasValue(0)) {
                P.r0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2728f);
            if (obtainStyledAttributes3.hasValue(0)) {
                P.E0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && P.N(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2725c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        g gVar = f2730h;
        Constructor<? extends U> constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2724b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2731a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f2731a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i4 = 0;
                while (true) {
                    String[] strArr = f2729g;
                    if (i4 < strArr.length) {
                        View s4 = s(context, str, strArr[i4]);
                        if (s4 != null) {
                            return s4;
                        }
                        i4++;
                    } else {
                        Object[] objArr2 = this.f2731a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s5 = s(context, str, (String) null);
                Object[] objArr3 = this.f2731a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s5;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f2731a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z3, boolean z4) {
        int i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f15037s3, 0, 0);
        if (z3) {
            i4 = obtainStyledAttributes.getResourceId(j.f15042t3, 0);
        } else {
            i4 = 0;
        }
        if (z4 && i4 == 0) {
            i4 = obtainStyledAttributes.getResourceId(j.u3, 0);
        }
        obtainStyledAttributes.recycle();
        if (i4 == 0) {
            return context;
        }
        if (!(context instanceof d) || ((d) context).c() != i4) {
            return new d(context, i4);
        }
        return context;
    }

    private void v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public C0380d c(Context context, AttributeSet attributeSet) {
        return new C0380d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0382f d(Context context, AttributeSet attributeSet) {
        return new C0382f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0383g e(Context context, AttributeSet attributeSet) {
        return new C0383g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0384h f(Context context, AttributeSet attributeSet) {
        return new C0384h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0388l g(Context context, AttributeSet attributeSet) {
        return new C0388l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0392p h(Context context, AttributeSet attributeSet) {
        return new C0392p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public r i(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0394s j(Context context, AttributeSet attributeSet) {
        return new C0394s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0397v k(Context context, AttributeSet attributeSet) {
        return new C0397v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0398w l(Context context, AttributeSet attributeSet) {
        return new C0398w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0400y m(Context context, AttributeSet attributeSet) {
        return new C0400y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public A n(Context context, AttributeSet attributeSet) {
        return new A(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public D o(Context context, AttributeSet attributeSet) {
        return new D(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public H p(Context context, AttributeSet attributeSet) {
        return new H(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z3, boolean z4, boolean z5, boolean z6) {
        Context context2;
        View view2;
        if (!z3 || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z4 || z5) {
            context2 = u(context2, attributeSet, z4, z5);
        }
        if (z6) {
            context2 = Z.b(context2);
        }
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c4 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c4 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c4 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c4 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c4 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c4 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c4 = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c4 = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c4 = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c4 = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c4 = 13;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                view2 = l(context2, attributeSet);
                v(view2, str);
                break;
            case 1:
                view2 = f(context2, attributeSet);
                v(view2, str);
                break;
            case 2:
                view2 = j(context2, attributeSet);
                v(view2, str);
                break;
            case 3:
                view2 = o(context2, attributeSet);
                v(view2, str);
                break;
            case 4:
                view2 = h(context2, attributeSet);
                v(view2, str);
                break;
            case 5:
                view2 = m(context2, attributeSet);
                v(view2, str);
                break;
            case 6:
                view2 = n(context2, attributeSet);
                v(view2, str);
                break;
            case 7:
                view2 = k(context2, attributeSet);
                v(view2, str);
                break;
            case 8:
                view2 = p(context2, attributeSet);
                v(view2, str);
                break;
            case 9:
                view2 = i(context2, attributeSet);
                v(view2, str);
                break;
            case 10:
                view2 = c(context2, attributeSet);
                v(view2, str);
                break;
            case 11:
                view2 = e(context2, attributeSet);
                v(view2, str);
                break;
            case 12:
                view2 = g(context2, attributeSet);
                v(view2, str);
                break;
            case 13:
                view2 = d(context2, attributeSet);
                v(view2, str);
                break;
            default:
                view2 = q(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = t(context2, str, attributeSet);
        }
        if (view2 != null) {
            b(view2, attributeSet);
            a(context2, view2, attributeSet);
        }
        return view2;
    }
}
