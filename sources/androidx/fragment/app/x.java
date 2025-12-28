package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class x {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f5941a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f5942b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f5943c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private t f5944d;

    x() {
    }

    /* access modifiers changed from: package-private */
    public void A(t tVar) {
        this.f5944d = tVar;
    }

    /* access modifiers changed from: package-private */
    public v B(String str, v vVar) {
        if (vVar != null) {
            return (v) this.f5943c.put(str, vVar);
        }
        return (v) this.f5943c.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f5941a.contains(fragment)) {
            synchronized (this.f5941a) {
                this.f5941a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f5942b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        if (this.f5942b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(int i4) {
        for (w wVar : this.f5942b.values()) {
            if (wVar != null) {
                wVar.t(i4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f5942b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w wVar : this.f5942b.values()) {
                printWriter.print(str);
                if (wVar != null) {
                    Fragment k4 = wVar.k();
                    printWriter.println(k4);
                    k4.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f5941a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f5941a.get(i4)).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        w wVar = (w) this.f5942b.get(str);
        if (wVar != null) {
            return wVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i4) {
        for (int size = this.f5941a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f5941a.get(size);
            if (fragment != null && fragment.mFragmentId == i4) {
                return fragment;
            }
        }
        for (w wVar : this.f5942b.values()) {
            if (wVar != null) {
                Fragment k4 = wVar.k();
                if (k4.mFragmentId == i4) {
                    return k4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f5941a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f5941a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (w wVar : this.f5942b.values()) {
            if (wVar != null) {
                Fragment k4 = wVar.k();
                if (str.equals(k4.mTag)) {
                    return k4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (w wVar : this.f5942b.values()) {
            if (wVar != null && (findFragmentByWho = wVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f5941a.indexOf(fragment);
        for (int i4 = indexOf - 1; i4 >= 0; i4--) {
            Fragment fragment2 = (Fragment) this.f5941a.get(i4);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f5941a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f5941a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List k() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f5942b.values()) {
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List l() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f5942b.values()) {
            if (wVar != null) {
                arrayList.add(wVar.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList m() {
        return new ArrayList(this.f5943c.values());
    }

    /* access modifiers changed from: package-private */
    public w n(String str) {
        return (w) this.f5942b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List o() {
        ArrayList arrayList;
        if (this.f5941a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f5941a) {
            arrayList = new ArrayList(this.f5941a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public t p() {
        return this.f5944d;
    }

    /* access modifiers changed from: package-private */
    public v q(String str) {
        return (v) this.f5943c.get(str);
    }

    /* access modifiers changed from: package-private */
    public void r(w wVar) {
        Fragment k4 = wVar.k();
        if (!c(k4.mWho)) {
            this.f5942b.put(k4.mWho, wVar);
            if (k4.mRetainInstanceChangedWhileDetached) {
                if (k4.mRetainInstance) {
                    this.f5944d.f(k4);
                } else {
                    this.f5944d.p(k4);
                }
                k4.mRetainInstanceChangedWhileDetached = false;
            }
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(k4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(w wVar) {
        Fragment k4 = wVar.k();
        if (k4.mRetainInstance) {
            this.f5944d.p(k4);
        }
        if (((w) this.f5942b.put(k4.mWho, (Object) null)) != null && q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k4);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        Iterator it = this.f5941a.iterator();
        while (it.hasNext()) {
            w wVar = (w) this.f5942b.get(((Fragment) it.next()).mWho);
            if (wVar != null) {
                wVar.m();
            }
        }
        for (w wVar2 : this.f5942b.values()) {
            if (wVar2 != null) {
                wVar2.m();
                Fragment k4 = wVar2.k();
                if (k4.mRemoving && !k4.isInBackStack()) {
                    if (k4.mBeingSaved && !this.f5943c.containsKey(k4.mWho)) {
                        wVar2.r();
                    }
                    s(wVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Fragment fragment) {
        synchronized (this.f5941a) {
            this.f5941a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f5942b.clear();
    }

    /* access modifiers changed from: package-private */
    public void w(List list) {
        this.f5941a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f4 = f(str);
                if (f4 != null) {
                    if (q.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(str);
                        sb.append("): ");
                        sb.append(f4);
                    }
                    a(f4);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(ArrayList arrayList) {
        this.f5943c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            this.f5943c.put(vVar.f5921b, vVar);
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f5942b.size());
        for (w wVar : this.f5942b.values()) {
            if (wVar != null) {
                Fragment k4 = wVar.k();
                wVar.r();
                arrayList.add(k4.mWho);
                if (q.D0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k4);
                    sb.append(": ");
                    sb.append(k4.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList z() {
        synchronized (this.f5941a) {
            try {
                if (this.f5941a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f5941a.size());
                Iterator it = this.f5941a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.mWho);
                    if (q.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(fragment.mWho);
                        sb.append("): ");
                        sb.append(fragment);
                    }
                }
                return arrayList;
            } finally {
            }
        }
    }
}
