package androidx.fragment.app;

import androidx.fragment.app.q;
import androidx.fragment.app.y;
import java.io.PrintWriter;
import java.util.ArrayList;
import kotlin.uuid.Uuid;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
final class C0446a extends y implements q.k {

    /* renamed from: t  reason: collision with root package name */
    final q f5728t;

    /* renamed from: u  reason: collision with root package name */
    boolean f5729u;

    /* renamed from: v  reason: collision with root package name */
    int f5730v;

    /* renamed from: w  reason: collision with root package name */
    boolean f5731w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0446a(androidx.fragment.app.q r3) {
        /*
            r2 = this;
            androidx.fragment.app.l r0 = r3.o0()
            androidx.fragment.app.m r1 = r3.q0()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.m r1 = r3.q0()
            android.content.Context r1 = r1.f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f5730v = r0
            r0 = 0
            r2.f5731w = r0
            r2.f5728t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0446a.<init>(androidx.fragment.app.q):void");
    }

    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f5953i) {
            return true;
        }
        this.f5728t.e(this);
        return true;
    }

    public int f() {
        return q(false);
    }

    public int g() {
        return q(true);
    }

    public void h() {
        j();
        this.f5728t.Y(this, false);
    }

    public void i() {
        j();
        this.f5728t.Y(this, true);
    }

    /* access modifiers changed from: package-private */
    public void k(int i4, Fragment fragment, String str, int i5) {
        super.k(i4, fragment, str, i5);
        fragment.mFragmentManager = this.f5728t;
    }

    public y l(Fragment fragment) {
        q qVar = fragment.mFragmentManager;
        if (qVar == null || qVar == this.f5728t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void p(int i4) {
        if (this.f5953i) {
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i4);
            }
            int size = this.f5947c.size();
            for (int i5 = 0; i5 < size; i5++) {
                y.a aVar = (y.a) this.f5947c.get(i5);
                Fragment fragment = aVar.f5965b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i4;
                    if (q.D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f5965b);
                        sb2.append(" to ");
                        sb2.append(aVar.f5965b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int q(boolean z3) {
        if (!this.f5729u) {
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new D("FragmentManager"));
                r("  ", printWriter);
                printWriter.close();
            }
            this.f5729u = true;
            if (this.f5953i) {
                this.f5730v = this.f5728t.i();
            } else {
                this.f5730v = -1;
            }
            this.f5728t.V(this, z3);
            return this.f5730v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5955k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5730v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5729u);
            if (this.f5952h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5952h));
            }
            if (!(this.f5948d == 0 && this.f5949e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5948d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5949e));
            }
            if (!(this.f5950f == 0 && this.f5951g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5950f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5951g));
            }
            if (!(this.f5956l == 0 && this.f5957m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5956l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5957m);
            }
            if (!(this.f5958n == 0 && this.f5959o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5958n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5959o);
            }
        }
        if (!this.f5947c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f5947c.size();
            for (int i4 = 0; i4 < size; i4++) {
                y.a aVar = (y.a) this.f5947c.get(i4);
                switch (aVar.f5964a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f5964a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f5965b);
                if (z3) {
                    if (!(aVar.f5967d == 0 && aVar.f5968e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f5967d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f5968e));
                    }
                    if (aVar.f5969f != 0 || aVar.f5970g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f5969f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f5970g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int size = this.f5947c.size();
        for (int i4 = 0; i4 < size; i4++) {
            y.a aVar = (y.a) this.f5947c.get(i4);
            Fragment fragment = aVar.f5965b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f5731w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f5952h);
                fragment.setSharedElementNames(this.f5960p, this.f5961q);
            }
            switch (aVar.f5964a) {
                case 1:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.e1(fragment, false);
                    this.f5728t.f(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.W0(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.A0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.e1(fragment, false);
                    this.f5728t.i1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.t(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.e1(fragment, false);
                    this.f5728t.k(fragment);
                    break;
                case 8:
                    this.f5728t.g1(fragment);
                    break;
                case 9:
                    this.f5728t.g1((Fragment) null);
                    break;
                case 10:
                    this.f5728t.f1(fragment, aVar.f5972i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5964a);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5730v >= 0) {
            sb.append(" #");
            sb.append(this.f5730v);
        }
        if (this.f5955k != null) {
            sb.append(" ");
            sb.append(this.f5955k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        for (int size = this.f5947c.size() - 1; size >= 0; size--) {
            y.a aVar = (y.a) this.f5947c.get(size);
            Fragment fragment = aVar.f5965b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f5731w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(q.b1(this.f5952h));
                fragment.setSharedElementNames(this.f5961q, this.f5960p);
            }
            switch (aVar.f5964a) {
                case 1:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.e1(fragment, true);
                    this.f5728t.W0(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.f(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.i1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.e1(fragment, true);
                    this.f5728t.A0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.k(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5967d, aVar.f5968e, aVar.f5969f, aVar.f5970g);
                    this.f5728t.e1(fragment, true);
                    this.f5728t.t(fragment);
                    break;
                case 8:
                    this.f5728t.g1((Fragment) null);
                    break;
                case 9:
                    this.f5728t.g1(fragment);
                    break;
                case 10:
                    this.f5728t.f1(fragment, aVar.f5971h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5964a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment v(ArrayList arrayList, Fragment fragment) {
        ArrayList arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i4 = 0;
        while (i4 < this.f5947c.size()) {
            y.a aVar = (y.a) this.f5947c.get(i4);
            int i5 = aVar.f5964a;
            if (i5 != 1) {
                if (i5 == 2) {
                    Fragment fragment3 = aVar.f5965b;
                    int i6 = fragment3.mContainerId;
                    boolean z3 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList2.get(size);
                        if (fragment4.mContainerId == i6) {
                            if (fragment4 == fragment3) {
                                z3 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f5947c.add(i4, new y.a(9, fragment4, true));
                                    i4++;
                                    fragment2 = null;
                                }
                                y.a aVar2 = new y.a(3, fragment4, true);
                                aVar2.f5967d = aVar.f5967d;
                                aVar2.f5969f = aVar.f5969f;
                                aVar2.f5968e = aVar.f5968e;
                                aVar2.f5970g = aVar.f5970g;
                                this.f5947c.add(i4, aVar2);
                                arrayList2.remove(fragment4);
                                i4++;
                            }
                        }
                    }
                    if (z3) {
                        this.f5947c.remove(i4);
                        i4--;
                    } else {
                        aVar.f5964a = 1;
                        aVar.f5966c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i5 == 3 || i5 == 6) {
                    arrayList2.remove(aVar.f5965b);
                    Fragment fragment5 = aVar.f5965b;
                    if (fragment5 == fragment2) {
                        this.f5947c.add(i4, new y.a(9, fragment5));
                        i4++;
                        fragment2 = null;
                    }
                } else if (i5 != 7) {
                    if (i5 == 8) {
                        this.f5947c.add(i4, new y.a(9, fragment2, true));
                        aVar.f5966c = true;
                        i4++;
                        fragment2 = aVar.f5965b;
                    }
                }
                i4++;
            }
            arrayList2.add(aVar.f5965b);
            i4++;
        }
        return fragment2;
    }

    public String w() {
        return this.f5955k;
    }

    public void x() {
        if (this.f5963s != null) {
            for (int i4 = 0; i4 < this.f5963s.size(); i4++) {
                ((Runnable) this.f5963s.get(i4)).run();
            }
            this.f5963s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment y(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f5947c.size() - 1; size >= 0; size--) {
            y.a aVar = (y.a) this.f5947c.get(size);
            int i4 = aVar.f5964a;
            if (i4 != 1) {
                if (i4 != 3) {
                    switch (i4) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f5965b;
                            break;
                        case 10:
                            aVar.f5972i = aVar.f5971h;
                            break;
                    }
                }
                arrayList.add(aVar.f5965b);
            }
            arrayList.remove(aVar.f5965b);
        }
        return fragment;
    }
}
