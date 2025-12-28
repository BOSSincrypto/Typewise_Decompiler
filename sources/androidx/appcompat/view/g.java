package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.c0;
import androidx.core.view.C0408b;
import androidx.core.view.C0441v;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class[] f2758e;

    /* renamed from: f  reason: collision with root package name */
    static final Class[] f2759f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f2760a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f2761b;

    /* renamed from: c  reason: collision with root package name */
    Context f2762c;

    /* renamed from: d  reason: collision with root package name */
    private Object f2763d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class[] f2764c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f2765a;

        /* renamed from: b  reason: collision with root package name */
        private Method f2766b;

        public a(Object obj, String str) {
            this.f2765a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2766b = cls.getMethod(str, f2764c);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2766b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2766b.invoke(this.f2765a, new Object[]{menuItem})).booleanValue();
                }
                this.f2766b.invoke(this.f2765a, new Object[]{menuItem});
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    private class b {

        /* renamed from: A  reason: collision with root package name */
        C0408b f2767A;

        /* renamed from: B  reason: collision with root package name */
        private CharSequence f2768B;

        /* renamed from: C  reason: collision with root package name */
        private CharSequence f2769C;

        /* renamed from: D  reason: collision with root package name */
        private ColorStateList f2770D = null;

        /* renamed from: E  reason: collision with root package name */
        private PorterDuff.Mode f2771E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f2773a;

        /* renamed from: b  reason: collision with root package name */
        private int f2774b;

        /* renamed from: c  reason: collision with root package name */
        private int f2775c;

        /* renamed from: d  reason: collision with root package name */
        private int f2776d;

        /* renamed from: e  reason: collision with root package name */
        private int f2777e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2778f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2779g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2780h;

        /* renamed from: i  reason: collision with root package name */
        private int f2781i;

        /* renamed from: j  reason: collision with root package name */
        private int f2782j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f2783k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f2784l;

        /* renamed from: m  reason: collision with root package name */
        private int f2785m;

        /* renamed from: n  reason: collision with root package name */
        private char f2786n;

        /* renamed from: o  reason: collision with root package name */
        private int f2787o;

        /* renamed from: p  reason: collision with root package name */
        private char f2788p;

        /* renamed from: q  reason: collision with root package name */
        private int f2789q;

        /* renamed from: r  reason: collision with root package name */
        private int f2790r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f2791s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f2792t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f2793u;

        /* renamed from: v  reason: collision with root package name */
        private int f2794v;

        /* renamed from: w  reason: collision with root package name */
        private int f2795w;

        /* renamed from: x  reason: collision with root package name */
        private String f2796x;

        /* renamed from: y  reason: collision with root package name */
        private String f2797y;

        /* renamed from: z  reason: collision with root package name */
        private String f2798z;

        public b(Menu menu) {
            this.f2773a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f2762c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z3;
            MenuItem enabled = menuItem.setChecked(this.f2791s).setVisible(this.f2792t).setEnabled(this.f2793u);
            boolean z4 = false;
            if (this.f2790r >= 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            enabled.setCheckable(z3).setTitleCondensed(this.f2784l).setIcon(this.f2785m);
            int i4 = this.f2794v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f2798z != null) {
                if (!g.this.f2762c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f2798z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f2790r >= 2) {
                if (menuItem instanceof i) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f2796x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f2758e, g.this.f2760a));
                z4 = true;
            }
            int i5 = this.f2795w;
            if (i5 > 0) {
                if (!z4) {
                    menuItem.setActionView(i5);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0408b bVar = this.f2767A;
            if (bVar != null) {
                C0441v.a(menuItem, bVar);
            }
            C0441v.c(menuItem, this.f2768B);
            C0441v.g(menuItem, this.f2769C);
            C0441v.b(menuItem, this.f2786n, this.f2787o);
            C0441v.f(menuItem, this.f2788p, this.f2789q);
            PorterDuff.Mode mode = this.f2771E;
            if (mode != null) {
                C0441v.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f2770D;
            if (colorStateList != null) {
                C0441v.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f2780h = true;
            i(this.f2773a.add(this.f2774b, this.f2781i, this.f2782j, this.f2783k));
        }

        public SubMenu b() {
            this.f2780h = true;
            SubMenu addSubMenu = this.f2773a.addSubMenu(this.f2774b, this.f2781i, this.f2782j, this.f2783k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f2780h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f2762c.obtainStyledAttributes(attributeSet, n.j.f15015o1);
            this.f2774b = obtainStyledAttributes.getResourceId(n.j.f15025q1, 0);
            this.f2775c = obtainStyledAttributes.getInt(n.j.f15035s1, 0);
            this.f2776d = obtainStyledAttributes.getInt(n.j.f15040t1, 0);
            this.f2777e = obtainStyledAttributes.getInt(n.j.f15045u1, 0);
            this.f2778f = obtainStyledAttributes.getBoolean(n.j.f15030r1, true);
            this.f2779g = obtainStyledAttributes.getBoolean(n.j.f15020p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            boolean z3;
            c0 u3 = c0.u(g.this.f2762c, attributeSet, n.j.f15049v1);
            this.f2781i = u3.n(n.j.f15061y1, 0);
            this.f2782j = (u3.k(n.j.f14845B1, this.f2775c) & -65536) | (u3.k(n.j.f14849C1, this.f2776d) & 65535);
            this.f2783k = u3.p(n.j.f14853D1);
            this.f2784l = u3.p(n.j.f14857E1);
            this.f2785m = u3.n(n.j.f15053w1, 0);
            this.f2786n = c(u3.o(n.j.f14861F1));
            this.f2787o = u3.k(n.j.f14889M1, 4096);
            this.f2788p = c(u3.o(n.j.f14865G1));
            this.f2789q = u3.k(n.j.f14905Q1, 4096);
            int i4 = n.j.f14869H1;
            if (u3.s(i4)) {
                this.f2790r = u3.a(i4, false) ? 1 : 0;
            } else {
                this.f2790r = this.f2777e;
            }
            this.f2791s = u3.a(n.j.f15065z1, false);
            this.f2792t = u3.a(n.j.f14841A1, this.f2778f);
            this.f2793u = u3.a(n.j.f15057x1, this.f2779g);
            this.f2794v = u3.k(n.j.f14909R1, -1);
            this.f2798z = u3.o(n.j.f14873I1);
            this.f2795w = u3.n(n.j.f14877J1, 0);
            this.f2796x = u3.o(n.j.f14885L1);
            String o4 = u3.o(n.j.f14881K1);
            this.f2797y = o4;
            if (o4 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.f2795w == 0 && this.f2796x == null) {
                this.f2767A = (C0408b) e(o4, g.f2759f, g.this.f2761b);
            } else {
                if (z3) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2767A = null;
            }
            this.f2768B = u3.p(n.j.f14893N1);
            this.f2769C = u3.p(n.j.f14913S1);
            int i5 = n.j.f14901P1;
            if (u3.s(i5)) {
                this.f2771E = K.d(u3.k(i5, -1), this.f2771E);
            } else {
                this.f2771E = null;
            }
            int i6 = n.j.f14897O1;
            if (u3.s(i6)) {
                this.f2770D = u3.c(i6);
            } else {
                this.f2770D = null;
            }
            u3.w();
            this.f2780h = false;
        }

        public void h() {
            this.f2774b = 0;
            this.f2775c = 0;
            this.f2776d = 0;
            this.f2777e = 0;
            this.f2778f = true;
            this.f2779g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f2758e = clsArr;
        f2759f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f2762c = context;
        Object[] objArr = {context};
        this.f2760a = objArr;
        this.f2761b = objArr;
    }

    private Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z4 && name2.equals(str)) {
                            z4 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                C0408b bVar2 = bVar.f2767A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z3 = true;
                        }
                    }
                } else if (!z4) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z4 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f2763d == null) {
            this.f2763d = a(this.f2762c);
        }
        return this.f2763d;
    }

    public void inflate(int i4, Menu menu) {
        if (!(menu instanceof H.a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2762c.getResources().getLayout(i4);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e4) {
            throw new InflateException("Error inflating menu XML", e4);
        } catch (IOException e5) {
            throw new InflateException("Error inflating menu XML", e5);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
