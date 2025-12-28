package androidx.coordinatorlayout.widget;

import androidx.core.util.d;
import androidx.core.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import y.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final d f4730a = new e(10);

    /* renamed from: b  reason: collision with root package name */
    private final g f4731b = new g();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f4732c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet f4733d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f4731b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        e(arrayList2.get(i4), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f4730a.b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    private void j(ArrayList arrayList) {
        arrayList.clear();
        this.f4730a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f4731b.containsKey(obj) || !this.f4731b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f4731b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f4731b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (!this.f4731b.containsKey(obj)) {
            this.f4731b.put(obj, (Object) null);
        }
    }

    public void c() {
        int size = this.f4731b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = (ArrayList) this.f4731b.n(i4);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.f4731b.clear();
    }

    public boolean d(Object obj) {
        return this.f4731b.containsKey(obj);
    }

    public List g(Object obj) {
        int size = this.f4731b.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList2 = (ArrayList) this.f4731b.n(i4);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f4731b.j(i4));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.f4732c.clear();
        this.f4733d.clear();
        int size = this.f4731b.size();
        for (int i4 = 0; i4 < size; i4++) {
            e(this.f4731b.j(i4), this.f4732c, this.f4733d);
        }
        return this.f4732c;
    }

    public boolean i(Object obj) {
        int size = this.f4731b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = (ArrayList) this.f4731b.n(i4);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
