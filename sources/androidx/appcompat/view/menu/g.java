package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.C0408b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements H.a {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f2928A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f2929a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f2930b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2931c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2932d;

    /* renamed from: e  reason: collision with root package name */
    private a f2933e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f2934f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f2935g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2936h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f2937i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f2938j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2939k;

    /* renamed from: l  reason: collision with root package name */
    private int f2940l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f2941m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f2942n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f2943o;

    /* renamed from: p  reason: collision with root package name */
    View f2944p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2945q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2946r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2947s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2948t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2949u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList f2950v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList f2951w = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    private i f2952x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f2953y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f2954z;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f2929a = context;
        this.f2930b = context.getResources();
        this.f2934f = new ArrayList();
        this.f2935g = new ArrayList();
        this.f2936h = true;
        this.f2937i = new ArrayList();
        this.f2938j = new ArrayList();
        this.f2939k = true;
        b0(true);
    }

    private static int B(int i4) {
        int i5 = (-65536 & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = f2928A;
            if (i5 < iArr.length) {
                return (i4 & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i4, boolean z3) {
        if (i4 >= 0 && i4 < this.f2934f.size()) {
            this.f2934f.remove(i4);
            if (z3) {
                K(true);
            }
        }
    }

    private void W(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources C3 = C();
        if (view != null) {
            this.f2944p = view;
            this.f2942n = null;
            this.f2943o = null;
        } else {
            if (i4 > 0) {
                this.f2942n = C3.getText(i4);
            } else if (charSequence != null) {
                this.f2942n = charSequence;
            }
            if (i5 > 0) {
                this.f2943o = androidx.core.content.a.d(u(), i5);
            } else if (drawable != null) {
                this.f2943o = drawable;
            }
            this.f2944p = null;
        }
        K(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (androidx.core.view.S.f(android.view.ViewConfiguration.get(r2.f2929a), r2.f2929a) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f2930b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f2929a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f2929a
            boolean r3 = androidx.core.view.S.f(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f2932d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.b0(boolean):void");
    }

    private i g(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new i(this, i4, i5, i6, i7, charSequence, i8);
    }

    private void i(boolean z3) {
        if (!this.f2951w.isEmpty()) {
            d0();
            Iterator it = this.f2951w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f2951w.remove(weakReference);
                } else {
                    mVar.f(z3);
                }
            }
            c0();
        }
    }

    private boolean j(r rVar, m mVar) {
        boolean z3 = false;
        if (this.f2951w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z3 = mVar.e(rVar);
        }
        Iterator it = this.f2951w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null) {
                this.f2951w.remove(weakReference);
            } else if (!z3) {
                z3 = mVar2.e(rVar);
            }
        }
        return z3;
    }

    private static int n(ArrayList arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((i) arrayList.get(size)).f() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f2948t;
    }

    /* access modifiers changed from: package-private */
    public Resources C() {
        return this.f2930b;
    }

    public g D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f2936h) {
            return this.f2935g;
        }
        this.f2935g.clear();
        int size = this.f2934f.size();
        for (int i4 = 0; i4 < size; i4++) {
            i iVar = (i) this.f2934f.get(i4);
            if (iVar.isVisible()) {
                this.f2935g.add(iVar);
            }
        }
        this.f2936h = false;
        this.f2939k = true;
        return this.f2935g;
    }

    public boolean F() {
        return this.f2953y;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f2931c;
    }

    public boolean H() {
        return this.f2932d;
    }

    /* access modifiers changed from: package-private */
    public void I(i iVar) {
        this.f2939k = true;
        K(true);
    }

    /* access modifiers changed from: package-private */
    public void J(i iVar) {
        this.f2936h = true;
        K(true);
    }

    public void K(boolean z3) {
        if (!this.f2945q) {
            if (z3) {
                this.f2936h = true;
                this.f2939k = true;
            }
            i(z3);
            return;
        }
        this.f2946r = true;
        if (z3) {
            this.f2947s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i4) {
        return M(menuItem, (m) null, i4);
    }

    public boolean M(MenuItem menuItem, m mVar, int i4) {
        boolean z3;
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k4 = iVar.k();
        C0408b b4 = iVar.b();
        if (b4 == null || !b4.a()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iVar.j()) {
            k4 |= iVar.expandActionView();
            if (k4) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z3) {
            if ((i4 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z3) {
                b4.e(rVar);
            }
            k4 |= j(rVar, mVar);
            if (!k4) {
                e(true);
            }
        } else if ((i4 & 1) == 0) {
            e(true);
        }
        return k4;
    }

    public void O(m mVar) {
        Iterator it = this.f2951w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f2951w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = getItem(i4);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).P(bundle);
                }
            }
            int i5 = bundle.getInt("android:menu:expandedactionview");
            if (i5 > 0 && (findItem = findItem(i5)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f2933e = aVar;
    }

    public g S(int i4) {
        this.f2940l = i4;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        boolean z3;
        int groupId = menuItem.getGroupId();
        int size = this.f2934f.size();
        d0();
        for (int i4 = 0; i4 < size; i4++) {
            i iVar = (i) this.f2934f.get(i4);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                if (iVar == menuItem) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                iVar.s(z3);
            }
        }
        c0();
    }

    /* access modifiers changed from: protected */
    public g U(int i4) {
        W(0, (CharSequence) null, i4, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g X(int i4) {
        W(i4, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i4, int i5, int i6, CharSequence charSequence) {
        int B3 = B(i6);
        i g4 = g(i4, i5, i6, B3, charSequence, this.f2940l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2941m;
        if (contextMenuInfo != null) {
            g4.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f2934f;
        arrayList.add(n(arrayList, B3), g4);
        K(true);
        return g4;
    }

    public void a0(boolean z3) {
        this.f2954z = z3;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        Intent intent2;
        int i9;
        PackageManager packageManager = this.f2929a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i8 = queryIntentActivityOptions.size();
        } else {
            i8 = 0;
        }
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            if (i11 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i11];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = intent4;
            }
        }
        return i8;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f2929a);
    }

    public void c(m mVar, Context context) {
        this.f2951w.add(new WeakReference(mVar));
        mVar.c(context, this);
        this.f2939k = true;
    }

    public void c0() {
        this.f2945q = false;
        if (this.f2946r) {
            this.f2946r = false;
            K(this.f2947s);
        }
    }

    public void clear() {
        i iVar = this.f2952x;
        if (iVar != null) {
            f(iVar);
        }
        this.f2934f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f2943o = null;
        this.f2942n = null;
        this.f2944p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f2933e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.f2945q) {
            this.f2945q = true;
            this.f2946r = false;
            this.f2947s = false;
        }
    }

    public final void e(boolean z3) {
        if (!this.f2949u) {
            this.f2949u = true;
            Iterator it = this.f2951w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f2951w.remove(weakReference);
                } else {
                    mVar.a(this, z3);
                }
            }
            this.f2949u = false;
        }
    }

    public boolean f(i iVar) {
        boolean z3 = false;
        if (!this.f2951w.isEmpty() && this.f2952x == iVar) {
            d0();
            Iterator it = this.f2951w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f2951w.remove(weakReference);
                } else {
                    z3 = mVar.i(this, iVar);
                    if (z3) {
                        break;
                    }
                }
            }
            c0();
            if (z3) {
                this.f2952x = null;
            }
        }
        return z3;
    }

    public MenuItem findItem(int i4) {
        MenuItem findItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = (i) this.f2934f.get(i5);
            if (iVar.getItemId() == i4) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i4) {
        return (MenuItem) this.f2934f.get(i4);
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f2933e;
        if (aVar == null || !aVar.a(gVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean hasVisibleItems() {
        if (this.f2954z) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((i) this.f2934f.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        if (p(i4, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean k(i iVar) {
        boolean z3 = false;
        if (this.f2951w.isEmpty()) {
            return false;
        }
        d0();
        Iterator it = this.f2951w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f2951w.remove(weakReference);
            } else {
                z3 = mVar.j(this, iVar);
                if (z3) {
                    break;
                }
            }
        }
        c0();
        if (z3) {
            this.f2952x = iVar;
        }
        return z3;
    }

    public int l(int i4) {
        return m(i4, 0);
    }

    public int m(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (((i) this.f2934f.get(i5)).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public int o(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((i) this.f2934f.get(i5)).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public i p(int i4, KeyEvent keyEvent) {
        char c4;
        ArrayList arrayList = this.f2950v;
        arrayList.clear();
        q(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean G3 = G();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = (i) arrayList.get(i5);
            if (G3) {
                c4 = iVar.getAlphabeticShortcut();
            } else {
                c4 = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (G3 && c4 == 8 && i4 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i4, int i5) {
        return L(findItem(i4), i5);
    }

    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        boolean z3;
        i p4 = p(i4, keyEvent);
        if (p4 != null) {
            z3 = L(p4, i5);
        } else {
            z3 = false;
        }
        if ((i5 & 2) != 0) {
            e(true);
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void q(List list, int i4, KeyEvent keyEvent) {
        char c4;
        int i5;
        boolean G3 = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.f2934f.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar = (i) this.f2934f.get(i6);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i4, keyEvent);
                }
                if (G3) {
                    c4 = iVar.getAlphabeticShortcut();
                } else {
                    c4 = iVar.getNumericShortcut();
                }
                if (G3) {
                    i5 = iVar.getAlphabeticModifiers();
                } else {
                    i5 = iVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i5 & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (G3 && c4 == 8 && i4 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E3 = E();
        if (this.f2939k) {
            Iterator it = this.f2951w.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f2951w.remove(weakReference);
                } else {
                    z3 |= mVar.h();
                }
            }
            if (z3) {
                this.f2937i.clear();
                this.f2938j.clear();
                int size = E3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar = (i) E3.get(i4);
                    if (iVar.l()) {
                        this.f2937i.add(iVar);
                    } else {
                        this.f2938j.add(iVar);
                    }
                }
            } else {
                this.f2937i.clear();
                this.f2938j.clear();
                this.f2938j.addAll(E());
            }
            this.f2939k = false;
        }
    }

    public void removeGroup(int i4) {
        int l4 = l(i4);
        if (l4 >= 0) {
            int size = this.f2934f.size() - l4;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || ((i) this.f2934f.get(l4)).getGroupId() != i4) {
                    K(true);
                } else {
                    N(l4, false);
                    i5 = i6;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i4) {
        N(o(i4), true);
    }

    public ArrayList s() {
        r();
        return this.f2937i;
    }

    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        int size = this.f2934f.size();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = (i) this.f2934f.get(i5);
            if (iVar.getGroupId() == i4) {
                iVar.t(z4);
                iVar.setCheckable(z3);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z3) {
        this.f2953y = z3;
    }

    public void setGroupEnabled(int i4, boolean z3) {
        int size = this.f2934f.size();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = (i) this.f2934f.get(i5);
            if (iVar.getGroupId() == i4) {
                iVar.setEnabled(z3);
            }
        }
    }

    public void setGroupVisible(int i4, boolean z3) {
        int size = this.f2934f.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = (i) this.f2934f.get(i5);
            if (iVar.getGroupId() == i4 && iVar.y(z3)) {
                z4 = true;
            }
        }
        if (z4) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z3) {
        this.f2931c = z3;
        K(false);
    }

    public int size() {
        return this.f2934f.size();
    }

    /* access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f2929a;
    }

    public i v() {
        return this.f2952x;
    }

    public Drawable w() {
        return this.f2943o;
    }

    public CharSequence x() {
        return this.f2942n;
    }

    public View y() {
        return this.f2944p;
    }

    public ArrayList z() {
        r();
        return this.f2938j;
    }

    public MenuItem add(int i4) {
        return a(0, 0, 0, this.f2930b.getString(i4));
    }

    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f2930b.getString(i4));
    }

    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        i iVar = (i) a(i4, i5, i6, charSequence);
        r rVar = new r(this.f2929a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    public MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f2930b.getString(i7));
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, (CharSequence) this.f2930b.getString(i7));
    }
}
