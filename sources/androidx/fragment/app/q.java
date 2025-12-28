package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.o;
import androidx.activity.result.e;
import androidx.appcompat.app.F;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.y;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.uuid.Uuid;
import m.C0796a;

public abstract class q {

    /* renamed from: N  reason: collision with root package name */
    private static boolean f5839N;

    /* renamed from: A  reason: collision with root package name */
    private androidx.activity.result.c f5840A;

    /* renamed from: B  reason: collision with root package name */
    ArrayDeque f5841B = new ArrayDeque();

    /* renamed from: C  reason: collision with root package name */
    private boolean f5842C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f5843D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f5844E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f5845F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f5846G;

    /* renamed from: H  reason: collision with root package name */
    private ArrayList f5847H;

    /* renamed from: I  reason: collision with root package name */
    private ArrayList f5848I;

    /* renamed from: J  reason: collision with root package name */
    private ArrayList f5849J;

    /* renamed from: K  reason: collision with root package name */
    private t f5850K;

    /* renamed from: L  reason: collision with root package name */
    private FragmentStrictMode.b f5851L;

    /* renamed from: M  reason: collision with root package name */
    private Runnable f5852M = new d();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f5853a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f5854b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final x f5855c = new x();

    /* renamed from: d  reason: collision with root package name */
    ArrayList f5856d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f5857e;

    /* renamed from: f  reason: collision with root package name */
    private final n f5858f = new n(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f5859g;

    /* renamed from: h  reason: collision with root package name */
    private final o f5860h = new a(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f5861i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map f5862j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Map f5863k = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Map f5864l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f5865m;

    /* renamed from: n  reason: collision with root package name */
    private final o f5866n = new o(this);

    /* renamed from: o  reason: collision with root package name */
    private final CopyOnWriteArrayList f5867o = new CopyOnWriteArrayList();

    /* renamed from: p  reason: collision with root package name */
    int f5868p = -1;

    /* renamed from: q  reason: collision with root package name */
    private m f5869q;

    /* renamed from: r  reason: collision with root package name */
    private j f5870r;

    /* renamed from: s  reason: collision with root package name */
    private Fragment f5871s;

    /* renamed from: t  reason: collision with root package name */
    Fragment f5872t;

    /* renamed from: u  reason: collision with root package name */
    private l f5873u = null;

    /* renamed from: v  reason: collision with root package name */
    private l f5874v = new b();

    /* renamed from: w  reason: collision with root package name */
    private E f5875w = null;

    /* renamed from: x  reason: collision with root package name */
    private E f5876x = new c();

    /* renamed from: y  reason: collision with root package name */
    private androidx.activity.result.c f5877y;

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.c f5878z;

    class a extends o {
        a(boolean z3) {
            super(z3);
        }

        public void handleOnBackPressed() {
            q.this.z0();
        }
    }

    class b extends l {
        b() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            return q.this.q0().b(q.this.q0().f(), str, (Bundle) null);
        }
    }

    class c implements E {
        c() {
        }

        public SpecialEffectsController a(ViewGroup viewGroup) {
            return new C0449d(viewGroup);
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            q.this.X(true);
        }
    }

    class e implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f5883a;

        e(Fragment fragment) {
            this.f5883a = fragment;
        }

        public void a(q qVar, Fragment fragment) {
            this.f5883a.onAttachFragment(fragment);
        }
    }

    class f implements androidx.activity.result.b {
        f() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            j jVar = (j) q.this.f5841B.pollFirst();
            if (jVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = jVar.f5888a;
            int i4 = jVar.f5889b;
            Fragment i5 = q.this.f5855c.i(str);
            if (i5 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i5.onActivityResult(i4, aVar.u(), aVar.t());
        }
    }

    class g implements androidx.activity.result.b {
        g() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            j jVar = (j) q.this.f5841B.pollFirst();
            if (jVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = jVar.f5888a;
            int i4 = jVar.f5889b;
            Fragment i5 = q.this.f5855c.i(str);
            if (i5 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i5.onActivityResult(i4, aVar.u(), aVar.t());
        }
    }

    class h implements androidx.activity.result.b {
        h() {
        }

        /* renamed from: b */
        public void a(Map map) {
            int i4;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (((Boolean) arrayList.get(i5)).booleanValue()) {
                    i4 = 0;
                } else {
                    i4 = -1;
                }
                iArr[i5] = i4;
            }
            j jVar = (j) q.this.f5841B.pollFirst();
            if (jVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = jVar.f5888a;
            int i6 = jVar.f5889b;
            Fragment i7 = q.this.f5855c.i(str);
            if (i7 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i7.onRequestPermissionsResult(i6, strArr, iArr);
        }
    }

    static class i extends C0796a {
        i() {
        }

        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent t4 = eVar.t();
            if (!(t4 == null || (bundleExtra = t4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                t4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (t4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.a(eVar.w()).b((Intent) null).c(eVar.v(), eVar.u()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        /* renamed from: e */
        public androidx.activity.result.a c(int i4, Intent intent) {
            return new androidx.activity.result.a(i4, intent);
        }
    }

    interface k {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class l implements k {

        /* renamed from: a  reason: collision with root package name */
        final String f5890a;

        /* renamed from: b  reason: collision with root package name */
        final int f5891b;

        /* renamed from: c  reason: collision with root package name */
        final int f5892c;

        l(String str, int i4, int i5) {
            this.f5890a = str;
            this.f5891b = i4;
            this.f5892c = i5;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = q.this.f5872t;
            if (fragment != null && this.f5891b < 0 && this.f5890a == null && fragment.getChildFragmentManager().T0()) {
                return false;
            }
            return q.this.V0(arrayList, arrayList2, this.f5890a, this.f5891b, this.f5892c);
        }
    }

    public static boolean D0(int i4) {
        if (f5839N || Log.isLoggable("FragmentManager", i4)) {
            return true;
        }
        return false;
    }

    private boolean E0(Fragment fragment) {
        if ((!fragment.mHasMenu || !fragment.mMenuVisible) && !fragment.mChildFragmentManager.m()) {
            return false;
        }
        return true;
    }

    private void I(Fragment fragment) {
        if (fragment != null && fragment.equals(b0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle K0() {
        Bundle bundle = new Bundle();
        Parcelable c12 = c1();
        if (c12 != null) {
            bundle.putParcelable("android:support:fragments", c12);
        }
        return bundle;
    }

    /* JADX INFO: finally extract failed */
    private void P(int i4) {
        try {
            this.f5854b = true;
            this.f5855c.d(i4);
            O0(i4, false);
            for (SpecialEffectsController j4 : q()) {
                j4.j();
            }
            this.f5854b = false;
            X(true);
        } catch (Throwable th) {
            this.f5854b = false;
            throw th;
        }
    }

    private void S() {
        if (this.f5846G) {
            this.f5846G = false;
            j1();
        }
    }

    private void U() {
        for (SpecialEffectsController j4 : q()) {
            j4.j();
        }
    }

    private boolean U0(String str, int i4, int i5) {
        X(false);
        W(true);
        Fragment fragment = this.f5872t;
        if (fragment != null && i4 < 0 && str == null && fragment.getChildFragmentManager().T0()) {
            return true;
        }
        boolean V02 = V0(this.f5847H, this.f5848I, str, i4, i5);
        if (V02) {
            this.f5854b = true;
            try {
                X0(this.f5847H, this.f5848I);
            } finally {
                o();
            }
        }
        k1();
        S();
        this.f5855c.b();
        return V02;
    }

    private void W(boolean z3) {
        if (this.f5854b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f5869q == null) {
            if (this.f5845F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f5869q.g().getLooper()) {
            if (!z3) {
                n();
            }
            if (this.f5847H == null) {
                this.f5847H = new ArrayList();
                this.f5848I = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void X0(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    if (!((C0446a) arrayList.get(i4)).f5962r) {
                        if (i5 != i4) {
                            a0(arrayList, arrayList2, i5, i4);
                        }
                        i5 = i4 + 1;
                        if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                            while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0446a) arrayList.get(i5)).f5962r) {
                                i5++;
                            }
                        }
                        a0(arrayList, arrayList2, i4, i5);
                        i4 = i5 - 1;
                    }
                    i4++;
                }
                if (i5 != size) {
                    a0(arrayList, arrayList2, i5, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private static void Z(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        while (i4 < i5) {
            C0446a aVar = (C0446a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                aVar.p(-1);
                aVar.u();
            } else {
                aVar.p(1);
                aVar.t();
            }
            i4++;
        }
    }

    private void Z0() {
        ArrayList arrayList = this.f5865m;
        if (arrayList != null && arrayList.size() > 0) {
            F.a(this.f5865m.get(0));
            throw null;
        }
    }

    private void a0(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z3 = ((C0446a) arrayList.get(i4)).f5962r;
        ArrayList arrayList3 = this.f5849J;
        if (arrayList3 == null) {
            this.f5849J = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f5849J.addAll(this.f5855c.o());
        Fragment u02 = u0();
        boolean z4 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0446a aVar = (C0446a) arrayList.get(i6);
            if (!((Boolean) arrayList2.get(i6)).booleanValue()) {
                u02 = aVar.v(this.f5849J, u02);
            } else {
                u02 = aVar.y(this.f5849J, u02);
            }
            if (z4 || aVar.f5953i) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        this.f5849J.clear();
        if (!z3 && this.f5868p >= 1) {
            for (int i7 = i4; i7 < i5; i7++) {
                Iterator it = ((C0446a) arrayList.get(i7)).f5947c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((y.a) it.next()).f5965b;
                    if (!(fragment == null || fragment.mFragmentManager == null)) {
                        this.f5855c.r(s(fragment));
                    }
                }
            }
        }
        Z(arrayList, arrayList2, i4, i5);
        boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
        for (int i8 = i4; i8 < i5; i8++) {
            C0446a aVar2 = (C0446a) arrayList.get(i8);
            if (booleanValue) {
                for (int size = aVar2.f5947c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((y.a) aVar2.f5947c.get(size)).f5965b;
                    if (fragment2 != null) {
                        s(fragment2).m();
                    }
                }
            } else {
                Iterator it2 = aVar2.f5947c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((y.a) it2.next()).f5965b;
                    if (fragment3 != null) {
                        s(fragment3).m();
                    }
                }
            }
        }
        O0(this.f5868p, true);
        for (SpecialEffectsController specialEffectsController : r(arrayList, i4, i5)) {
            specialEffectsController.r(booleanValue);
            specialEffectsController.p();
            specialEffectsController.g();
        }
        while (i4 < i5) {
            C0446a aVar3 = (C0446a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue() && aVar3.f5730v >= 0) {
                aVar3.f5730v = -1;
            }
            aVar3.x();
            i4++;
        }
        if (z4) {
            Z0();
        }
    }

    static int b1(int i4) {
        int i5 = 4097;
        if (i4 == 4097) {
            return 8194;
        }
        if (i4 != 8194) {
            i5 = 8197;
            if (i4 == 8197) {
                return 4100;
            }
            if (i4 == 4099) {
                return 4099;
            }
            if (i4 != 4100) {
                return 0;
            }
        }
        return i5;
    }

    private int c0(String str, int i4, boolean z3) {
        ArrayList arrayList = this.f5856d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i4 >= 0) {
            int size = this.f5856d.size() - 1;
            while (size >= 0) {
                C0446a aVar = (C0446a) this.f5856d.get(size);
                if ((str != null && str.equals(aVar.w())) || (i4 >= 0 && i4 == aVar.f5730v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z3) {
                while (size > 0) {
                    C0446a aVar2 = (C0446a) this.f5856d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.w())) && (i4 < 0 || i4 != aVar2.f5730v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f5856d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z3) {
            return 0;
        } else {
            return this.f5856d.size() - 1;
        }
    }

    static q g0(View view) {
        h hVar;
        Fragment h02 = h0(view);
        if (h02 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    hVar = null;
                    break;
                } else if (context instanceof h) {
                    hVar = (h) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (hVar != null) {
                return hVar.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (h02.isAdded()) {
            return h02.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + h02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    private static Fragment h0(View view) {
        while (view != null) {
            Fragment x02 = x0(view);
            if (x02 != null) {
                return x02;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void h1(Fragment fragment) {
        ViewGroup n02 = n0(fragment);
        if (n02 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i4 = Q.b.f1205c;
            if (n02.getTag(i4) == null) {
                n02.setTag(i4, fragment);
            }
            ((Fragment) n02.getTag(i4)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void i0() {
        for (SpecialEffectsController k4 : q()) {
            k4.k();
        }
    }

    private boolean j0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f5853a) {
            if (this.f5853a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f5853a.size();
                boolean z3 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    z3 |= ((k) this.f5853a.get(i4)).a(arrayList, arrayList2);
                }
                return z3;
            } finally {
                this.f5853a.clear();
                this.f5869q.g().removeCallbacks(this.f5852M);
            }
        }
    }

    private void j1() {
        for (w R02 : this.f5855c.k()) {
            R0(R02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r3.f5860h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (k0() <= 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (H0(r3.f5871s) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k1() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f5853a
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f5853a     // Catch:{ all -> 0x0013 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0013 }
            r2 = 1
            if (r1 != 0) goto L_0x0015
            androidx.activity.o r1 = r3.f5860h     // Catch:{ all -> 0x0013 }
            r1.setEnabled(r2)     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x002c
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            androidx.activity.o r0 = r3.f5860h
            int r1 = r3.k0()
            if (r1 <= 0) goto L_0x0027
            androidx.fragment.app.Fragment r1 = r3.f5871s
            boolean r1 = r3.H0(r1)
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            r0.setEnabled(r2)
            return
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.k1():void");
    }

    private t l0(Fragment fragment) {
        return this.f5850K.k(fragment);
    }

    private void n() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup n0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f5870r.d()) {
            View c4 = this.f5870r.c(fragment.mContainerId);
            if (c4 instanceof ViewGroup) {
                return (ViewGroup) c4;
            }
        }
        return null;
    }

    private void o() {
        this.f5854b = false;
        this.f5848I.clear();
        this.f5847H.clear();
    }

    private void p() {
        boolean z3;
        m mVar = this.f5869q;
        if (mVar instanceof J) {
            z3 = this.f5855c.p().o();
        } else if (mVar.f() instanceof Activity) {
            z3 = !((Activity) this.f5869q.f()).isChangingConfigurations();
        } else {
            z3 = true;
        }
        if (z3) {
            for (C0448c cVar : this.f5862j.values()) {
                for (String h4 : cVar.f5746a) {
                    this.f5855c.p().h(h4);
                }
            }
        }
    }

    private Set q() {
        HashSet hashSet = new HashSet();
        for (w k4 : this.f5855c.k()) {
            ViewGroup viewGroup = k4.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.o(viewGroup, v0()));
            }
        }
        return hashSet;
    }

    private Set r(ArrayList arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator it = ((C0446a) arrayList.get(i4)).f5947c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((y.a) it.next()).f5965b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(SpecialEffectsController.n(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    static Fragment x0(View view) {
        Object tag = view.getTag(Q.b.f1203a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.f5845F = true;
        X(true);
        U();
        p();
        P(-1);
        this.f5869q = null;
        this.f5870r = null;
        this.f5871s = null;
        if (this.f5859g != null) {
            this.f5860h.remove();
            this.f5859g = null;
        }
        androidx.activity.result.c cVar = this.f5877y;
        if (cVar != null) {
            cVar.c();
            this.f5878z.c();
            this.f5840A.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void A0(Fragment fragment) {
        if (D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            h1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        P(1);
    }

    /* access modifiers changed from: package-private */
    public void B0(Fragment fragment) {
        if (fragment.mAdded && E0(fragment)) {
            this.f5842C = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public boolean C0() {
        return this.f5845F;
    }

    /* access modifiers changed from: package-private */
    public void D(boolean z3) {
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E(Fragment fragment) {
        Iterator it = this.f5867o.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        for (Fragment fragment : this.f5855c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.F();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean F0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* access modifiers changed from: package-private */
    public boolean G(MenuItem menuItem) {
        if (this.f5868p < 1) {
            return false;
        }
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    public void H(Menu menu) {
        if (this.f5868p >= 1) {
            for (Fragment fragment : this.f5855c.o()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        q qVar = fragment.mFragmentManager;
        if (!fragment.equals(qVar.u0()) || !H0(qVar.f5871s)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean I0(int i4) {
        if (this.f5868p >= i4) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void J() {
        P(5);
    }

    public boolean J0() {
        if (this.f5843D || this.f5844E) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z3) {
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L(Menu menu) {
        boolean z3 = false;
        if (this.f5868p < 1) {
            return false;
        }
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null && G0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void L0(Fragment fragment, String[] strArr, int i4) {
        if (this.f5840A != null) {
            this.f5841B.addLast(new j(fragment.mWho, i4));
            this.f5840A.a(strArr);
            return;
        }
        this.f5869q.j(fragment, strArr, i4);
    }

    /* access modifiers changed from: package-private */
    public void M() {
        k1();
        I(this.f5872t);
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment, Intent intent, int i4, Bundle bundle) {
        if (this.f5877y != null) {
            this.f5841B.addLast(new j(fragment.mWho, i4));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f5877y.a(intent);
            return;
        }
        this.f5869q.l(fragment, intent, i4, bundle);
    }

    /* access modifiers changed from: package-private */
    public void N() {
        this.f5843D = false;
        this.f5844E = false;
        this.f5850K.q(false);
        P(7);
    }

    /* access modifiers changed from: package-private */
    public void N0(Fragment fragment, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.f5878z != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (D0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ActivityOptions ");
                    sb.append(bundle2);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent2);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            int i8 = i5;
            androidx.activity.result.e a4 = new e.a(intentSender).b(intent2).c(i6, i5).a();
            int i9 = i4;
            this.f5841B.addLast(new j(fragment2.mWho, i4));
            if (D0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
            }
            this.f5878z.a(a4);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i10 = i4;
        this.f5869q.m(fragment, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    /* access modifiers changed from: package-private */
    public void O() {
        this.f5843D = false;
        this.f5844E = false;
        this.f5850K.q(false);
        P(5);
    }

    /* access modifiers changed from: package-private */
    public void O0(int i4, boolean z3) {
        m mVar;
        if (this.f5869q == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z3 || i4 != this.f5868p) {
            this.f5868p = i4;
            this.f5855c.t();
            j1();
            if (this.f5842C && (mVar = this.f5869q) != null && this.f5868p == 7) {
                mVar.n();
                this.f5842C = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void P0() {
        if (this.f5869q != null) {
            this.f5843D = false;
            this.f5844E = false;
            this.f5850K.q(false);
            for (Fragment fragment : this.f5855c.o()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        this.f5844E = true;
        this.f5850K.q(true);
        P(4);
    }

    /* access modifiers changed from: package-private */
    public void Q0(FragmentContainerView fragmentContainerView) {
        View view;
        for (w wVar : this.f5855c.k()) {
            Fragment k4 = wVar.k();
            if (k4.mContainerId == fragmentContainerView.getId() && (view = k4.mView) != null && view.getParent() == null) {
                k4.mContainer = fragmentContainerView;
                wVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R() {
        P(2);
    }

    /* access modifiers changed from: package-private */
    public void R0(w wVar) {
        Fragment k4 = wVar.k();
        if (!k4.mDeferStart) {
            return;
        }
        if (this.f5854b) {
            this.f5846G = true;
            return;
        }
        k4.mDeferStart = false;
        wVar.m();
    }

    /* access modifiers changed from: package-private */
    public void S0(int i4, int i5, boolean z3) {
        if (i4 >= 0) {
            V(new l((String) null, i4, i5), z3);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public void T(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f5855c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f5857e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f5857e.get(i4)).toString());
            }
        }
        ArrayList arrayList2 = this.f5856d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                C0446a aVar = (C0446a) this.f5856d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5861i.get());
        synchronized (this.f5853a) {
            try {
                int size3 = this.f5853a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size3; i6++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println((k) this.f5853a.get(i6));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5869q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5870r);
        if (this.f5871s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5871s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5868p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5843D);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5844E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5845F);
        if (this.f5842C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5842C);
        }
    }

    public boolean T0() {
        return U0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void V(k kVar, boolean z3) {
        if (!z3) {
            if (this.f5869q != null) {
                n();
            } else if (this.f5845F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f5853a) {
            try {
                if (this.f5869q != null) {
                    this.f5853a.add(kVar);
                    d1();
                } else if (!z3) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean V0(ArrayList arrayList, ArrayList arrayList2, String str, int i4, int i5) {
        boolean z3;
        if ((i5 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int c02 = c0(str, i4, z3);
        if (c02 < 0) {
            return false;
        }
        for (int size = this.f5856d.size() - 1; size >= c02; size--) {
            arrayList.add((C0446a) this.f5856d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void W0(Fragment fragment) {
        if (D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (!fragment.mDetached || !isInBackStack) {
            this.f5855c.u(fragment);
            if (E0(fragment)) {
                this.f5842C = true;
            }
            fragment.mRemoving = true;
            h1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(boolean z3) {
        W(z3);
        boolean z4 = false;
        while (j0(this.f5847H, this.f5848I)) {
            z4 = true;
            this.f5854b = true;
            try {
                X0(this.f5847H, this.f5848I);
            } finally {
                o();
            }
        }
        k1();
        S();
        this.f5855c.b();
        return z4;
    }

    /* access modifiers changed from: package-private */
    public void Y(k kVar, boolean z3) {
        if (!z3 || (this.f5869q != null && !this.f5845F)) {
            W(z3);
            if (kVar.a(this.f5847H, this.f5848I)) {
                this.f5854b = true;
                try {
                    X0(this.f5847H, this.f5848I);
                } finally {
                    o();
                }
            }
            k1();
            S();
            this.f5855c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void Y0(Fragment fragment) {
        this.f5850K.p(fragment);
    }

    /* access modifiers changed from: package-private */
    public void a1(Parcelable parcelable) {
        s sVar;
        ArrayList arrayList;
        w wVar;
        if (parcelable != null && (arrayList = sVar.f5894a) != null) {
            this.f5855c.x(arrayList);
            this.f5855c.v();
            Iterator it = (sVar = (s) parcelable).f5895b.iterator();
            while (it.hasNext()) {
                v B3 = this.f5855c.B((String) it.next(), (v) null);
                if (B3 != null) {
                    Fragment j4 = this.f5850K.j(B3.f5921b);
                    if (j4 != null) {
                        if (D0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restoreSaveState: re-attaching retained ");
                            sb.append(j4);
                        }
                        wVar = new w(this.f5866n, this.f5855c, j4, B3);
                    } else {
                        wVar = new w(this.f5866n, this.f5855c, this.f5869q.f().getClassLoader(), o0(), B3);
                    }
                    Fragment k4 = wVar.k();
                    k4.mFragmentManager = this;
                    if (D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("restoreSaveState: active (");
                        sb2.append(k4.mWho);
                        sb2.append("): ");
                        sb2.append(k4);
                    }
                    wVar.o(this.f5869q.f().getClassLoader());
                    this.f5855c.r(wVar);
                    wVar.t(this.f5868p);
                }
            }
            for (Fragment fragment : this.f5850K.m()) {
                if (!this.f5855c.c(fragment.mWho)) {
                    if (D0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Discarding retained Fragment ");
                        sb3.append(fragment);
                        sb3.append(" that was not found in the set of active Fragments ");
                        sb3.append(sVar.f5895b);
                    }
                    this.f5850K.p(fragment);
                    fragment.mFragmentManager = this;
                    w wVar2 = new w(this.f5866n, this.f5855c, fragment);
                    wVar2.t(1);
                    wVar2.m();
                    fragment.mRemoving = true;
                    wVar2.m();
                }
            }
            this.f5855c.w(sVar.f5896c);
            if (sVar.f5897d != null) {
                this.f5856d = new ArrayList(sVar.f5897d.length);
                int i4 = 0;
                while (true) {
                    C0447b[] bVarArr = sVar.f5897d;
                    if (i4 >= bVarArr.length) {
                        break;
                    }
                    C0446a u3 = bVarArr[i4].u(this);
                    if (D0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("restoreAllState: back stack #");
                        sb4.append(i4);
                        sb4.append(" (index ");
                        sb4.append(u3.f5730v);
                        sb4.append("): ");
                        sb4.append(u3);
                        PrintWriter printWriter = new PrintWriter(new D("FragmentManager"));
                        u3.s("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f5856d.add(u3);
                    i4++;
                }
            } else {
                this.f5856d = null;
            }
            this.f5861i.set(sVar.f5898e);
            String str = sVar.f5899f;
            if (str != null) {
                Fragment b02 = b0(str);
                this.f5872t = b02;
                I(b02);
            }
            ArrayList arrayList2 = sVar.f5900g;
            if (arrayList2 != null) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    this.f5862j.put((String) arrayList2.get(i5), (C0448c) sVar.f5901h.get(i5));
                }
            }
            ArrayList arrayList3 = sVar.f5902i;
            if (arrayList3 != null) {
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    Bundle bundle = (Bundle) sVar.f5903j.get(i6);
                    bundle.setClassLoader(this.f5869q.f().getClassLoader());
                    this.f5863k.put((String) arrayList3.get(i6), bundle);
                }
            }
            this.f5841B = new ArrayDeque(sVar.f5904k);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment b0(String str) {
        return this.f5855c.f(str);
    }

    /* access modifiers changed from: package-private */
    public Parcelable c1() {
        int size;
        i0();
        U();
        X(true);
        this.f5843D = true;
        this.f5850K.q(true);
        ArrayList y3 = this.f5855c.y();
        ArrayList m4 = this.f5855c.m();
        C0447b[] bVarArr = null;
        if (m4.isEmpty()) {
            D0(2);
            return null;
        }
        ArrayList z3 = this.f5855c.z();
        ArrayList arrayList = this.f5856d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C0447b[size];
            for (int i4 = 0; i4 < size; i4++) {
                bVarArr[i4] = new C0447b((C0446a) this.f5856d.get(i4));
                if (D0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding back stack #");
                    sb.append(i4);
                    sb.append(": ");
                    sb.append(this.f5856d.get(i4));
                }
            }
        }
        s sVar = new s();
        sVar.f5894a = m4;
        sVar.f5895b = y3;
        sVar.f5896c = z3;
        sVar.f5897d = bVarArr;
        sVar.f5898e = this.f5861i.get();
        Fragment fragment = this.f5872t;
        if (fragment != null) {
            sVar.f5899f = fragment.mWho;
        }
        sVar.f5900g.addAll(this.f5862j.keySet());
        sVar.f5901h.addAll(this.f5862j.values());
        sVar.f5902i.addAll(this.f5863k.keySet());
        sVar.f5903j.addAll(this.f5863k.values());
        sVar.f5904k = new ArrayList(this.f5841B);
        return sVar;
    }

    public Fragment d0(int i4) {
        return this.f5855c.g(i4);
    }

    /* access modifiers changed from: package-private */
    public void d1() {
        synchronized (this.f5853a) {
            try {
                if (this.f5853a.size() == 1) {
                    this.f5869q.g().removeCallbacks(this.f5852M);
                    this.f5869q.g().post(this.f5852M);
                    k1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(C0446a aVar) {
        if (this.f5856d == null) {
            this.f5856d = new ArrayList();
        }
        this.f5856d.add(aVar);
    }

    public Fragment e0(String str) {
        return this.f5855c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void e1(Fragment fragment, boolean z3) {
        ViewGroup n02 = n0(fragment);
        if (n02 != null && (n02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) n02).setDrawDisappearingViewsLast(!z3);
        }
    }

    /* access modifiers changed from: package-private */
    public w f(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.f(fragment, str);
        }
        if (D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        w s4 = s(fragment);
        fragment.mFragmentManager = this;
        this.f5855c.r(s4);
        if (!fragment.mDetached) {
            this.f5855c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (E0(fragment)) {
                this.f5842C = true;
            }
        }
        return s4;
    }

    /* access modifiers changed from: package-private */
    public Fragment f0(String str) {
        return this.f5855c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void f1(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(b0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    public void g(u uVar) {
        this.f5867o.add(uVar);
    }

    /* access modifiers changed from: package-private */
    public void g1(Fragment fragment) {
        if (fragment == null || (fragment.equals(b0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f5872t;
            this.f5872t = fragment;
            I(fragment2);
            I(this.f5872t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        this.f5850K.f(fragment);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f5861i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public void i1(Fragment fragment) {
        if (D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.activity.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(androidx.fragment.app.m r3, androidx.fragment.app.j r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.m r0 = r2.f5869q
            if (r0 != 0) goto L_0x012d
            r2.f5869q = r3
            r2.f5870r = r4
            r2.f5871s = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.q$e r4 = new androidx.fragment.app.q$e
            r4.<init>(r5)
            r2.g(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.u
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.u r4 = (androidx.fragment.app.u) r4
            r2.g(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.f5871s
            if (r4 == 0) goto L_0x0026
            r2.k1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.q
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.q r4 = (androidx.activity.q) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f5859g = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.o r1 = r2.f5860h
            r0.h(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.q r3 = r5.mFragmentManager
            androidx.fragment.app.t r3 = r3.l0(r5)
            r2.f5850K = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.J
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.J r3 = (androidx.lifecycle.J) r3
            androidx.lifecycle.I r3 = r3.getViewModelStore()
            androidx.fragment.app.t r3 = androidx.fragment.app.t.l(r3)
            r2.f5850K = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.t r3 = new androidx.fragment.app.t
            r4 = 0
            r3.<init>(r4)
            r2.f5850K = r3
        L_0x005f:
            androidx.fragment.app.t r3 = r2.f5850K
            boolean r4 = r2.J0()
            r3.q(r4)
            androidx.fragment.app.x r3 = r2.f5855c
            androidx.fragment.app.t r4 = r2.f5850K
            r3.A(r4)
            androidx.fragment.app.m r3 = r2.f5869q
            boolean r4 = r3 instanceof Y.d
            if (r4 == 0) goto L_0x0094
            if (r5 != 0) goto L_0x0094
            Y.d r3 = (Y.d) r3
            androidx.savedstate.a r3 = r3.getSavedStateRegistry()
            androidx.fragment.app.p r4 = new androidx.fragment.app.p
            r4.<init>(r2)
            java.lang.String r0 = "android:support:fragments"
            r3.h(r0, r4)
            android.os.Bundle r3 = r3.b(r0)
            if (r3 == 0) goto L_0x0094
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r2.a1(r3)
        L_0x0094:
            androidx.fragment.app.m r3 = r2.f5869q
            boolean r4 = r3 instanceof androidx.activity.result.d
            if (r4 == 0) goto L_0x012c
            androidx.activity.result.d r3 = (androidx.activity.result.d) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x00b6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r4 = ""
        L_0x00b8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            m.c r0 = new m.c
            r0.<init>()
            androidx.fragment.app.q$f r1 = new androidx.fragment.app.q$f
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.f5877y = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.q$i r0 = new androidx.fragment.app.q$i
            r0.<init>()
            androidx.fragment.app.q$g r1 = new androidx.fragment.app.q$g
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.f5878z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            m.b r5 = new m.b
            r5.<init>()
            androidx.fragment.app.q$h r0 = new androidx.fragment.app.q$h
            r0.<init>()
            androidx.activity.result.c r3 = r3.j(r4, r5, r0)
            r2.f5840A = r3
        L_0x012c:
            return
        L_0x012d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.j(androidx.fragment.app.m, androidx.fragment.app.j, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        if (D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f5855c.a(fragment);
                if (D0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                }
                if (E0(fragment)) {
                    this.f5842C = true;
                }
            }
        }
    }

    public int k0() {
        ArrayList arrayList = this.f5856d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public y l() {
        return new C0446a(this);
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        boolean z3 = false;
        for (Fragment fragment : this.f5855c.l()) {
            if (fragment != null) {
                z3 = E0(fragment);
                continue;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public j m0() {
        return this.f5870r;
    }

    public l o0() {
        l lVar = this.f5873u;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f5871s;
        if (fragment != null) {
            return fragment.mFragmentManager.o0();
        }
        return this.f5874v;
    }

    public List p0() {
        return this.f5855c.o();
    }

    public m q0() {
        return this.f5869q;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 r0() {
        return this.f5858f;
    }

    /* access modifiers changed from: package-private */
    public w s(Fragment fragment) {
        w n4 = this.f5855c.n(fragment.mWho);
        if (n4 != null) {
            return n4;
        }
        w wVar = new w(this.f5866n, this.f5855c, fragment);
        wVar.o(this.f5869q.f().getClassLoader());
        wVar.t(this.f5868p);
        return wVar;
    }

    /* access modifiers changed from: package-private */
    public o s0() {
        return this.f5866n;
    }

    /* access modifiers changed from: package-private */
    public void t(Fragment fragment) {
        if (D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (D0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                }
                this.f5855c.u(fragment);
                if (E0(fragment)) {
                    this.f5842C = true;
                }
                h1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment t0() {
        return this.f5871s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f5871s;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5871s)));
            sb.append("}");
        } else {
            m mVar = this.f5869q;
            if (mVar != null) {
                sb.append(mVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5869q)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.f5843D = false;
        this.f5844E = false;
        this.f5850K.q(false);
        P(4);
    }

    public Fragment u0() {
        return this.f5872t;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f5843D = false;
        this.f5844E = false;
        this.f5850K.q(false);
        P(0);
    }

    /* access modifiers changed from: package-private */
    public E v0() {
        E e4 = this.f5875w;
        if (e4 != null) {
            return e4;
        }
        Fragment fragment = this.f5871s;
        if (fragment != null) {
            return fragment.mFragmentManager.v0();
        }
        return this.f5876x;
    }

    /* access modifiers changed from: package-private */
    public void w(Configuration configuration) {
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public FragmentStrictMode.b w0() {
        return this.f5851L;
    }

    /* access modifiers changed from: package-private */
    public boolean x(MenuItem menuItem) {
        if (this.f5868p < 1) {
            return false;
        }
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.f5843D = false;
        this.f5844E = false;
        this.f5850K.q(false);
        P(1);
    }

    /* access modifiers changed from: package-private */
    public I y0(Fragment fragment) {
        return this.f5850K.n(fragment);
    }

    /* access modifiers changed from: package-private */
    public boolean z(Menu menu, MenuInflater menuInflater) {
        if (this.f5868p < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (Fragment fragment : this.f5855c.o()) {
            if (fragment != null && G0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z3 = true;
            }
        }
        if (this.f5857e != null) {
            for (int i4 = 0; i4 < this.f5857e.size(); i4++) {
                Fragment fragment2 = (Fragment) this.f5857e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f5857e = arrayList;
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        X(true);
        if (this.f5860h.isEnabled()) {
            T0();
        } else {
            this.f5859g.k();
        }
    }

    static class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f5888a;

        /* renamed from: b  reason: collision with root package name */
        int f5889b;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public j createFromParcel(Parcel parcel) {
                return new j(parcel);
            }

            /* renamed from: b */
            public j[] newArray(int i4) {
                return new j[i4];
            }
        }

        j(String str, int i4) {
            this.f5888a = str;
            this.f5889b = i4;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f5888a);
            parcel.writeInt(this.f5889b);
        }

        j(Parcel parcel) {
            this.f5888a = parcel.readString();
            this.f5889b = parcel.readInt();
        }
    }
}
