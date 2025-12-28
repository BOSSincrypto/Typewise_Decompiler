package androidx.fragment.app;

import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class t extends E {

    /* renamed from: k  reason: collision with root package name */
    private static final F.b f5912k = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap f5913d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f5914e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f5915f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5916g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5917h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5918i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5919j = false;

    class a implements F.b {
        a() {
        }

        public E a(Class cls) {
            return new t(true);
        }

        public /* synthetic */ E b(Class cls, U.a aVar) {
            return G.b(this, cls, aVar);
        }
    }

    t(boolean z3) {
        this.f5916g = z3;
    }

    private void i(String str) {
        t tVar = (t) this.f5914e.get(str);
        if (tVar != null) {
            tVar.d();
            this.f5914e.remove(str);
        }
        I i4 = (I) this.f5915f.get(str);
        if (i4 != null) {
            i4.a();
            this.f5915f.remove(str);
        }
    }

    static t l(I i4) {
        return (t) new F(i4, f5912k).a(t.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f5917h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f5913d.equals(tVar.f5913d) || !this.f5914e.equals(tVar.f5914e) || !this.f5915f.equals(tVar.f5915f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f5919j) {
            q.D0(2);
        } else if (!this.f5913d.containsKey(fragment.mWho)) {
            this.f5913d.put(fragment.mWho, fragment);
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        i(fragment.mWho);
    }

    /* access modifiers changed from: package-private */
    public void h(String str) {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f5913d.hashCode() * 31) + this.f5914e.hashCode()) * 31) + this.f5915f.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Fragment j(String str) {
        return (Fragment) this.f5913d.get(str);
    }

    /* access modifiers changed from: package-private */
    public t k(Fragment fragment) {
        t tVar = (t) this.f5914e.get(fragment.mWho);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f5916g);
        this.f5914e.put(fragment.mWho, tVar2);
        return tVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection m() {
        return new ArrayList(this.f5913d.values());
    }

    /* access modifiers changed from: package-private */
    public I n(Fragment fragment) {
        I i4 = (I) this.f5915f.get(fragment.mWho);
        if (i4 != null) {
            return i4;
        }
        I i5 = new I();
        this.f5915f.put(fragment.mWho, i5);
        return i5;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f5917h;
    }

    /* access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        if (this.f5919j) {
            q.D0(2);
        } else if (this.f5913d.remove(fragment.mWho) != null && q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z3) {
        this.f5919j = z3;
    }

    /* access modifiers changed from: package-private */
    public boolean r(Fragment fragment) {
        if (!this.f5913d.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f5916g) {
            return this.f5917h;
        }
        return !this.f5918i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f5913d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f5914e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f5915f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
