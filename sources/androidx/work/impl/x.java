package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.m;
import androidx.work.o;
import androidx.work.t;
import androidx.work.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m0.C0804c;

public class x extends t {

    /* renamed from: j  reason: collision with root package name */
    private static final String f7408j = m.i("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final F f7409a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7410b;

    /* renamed from: c  reason: collision with root package name */
    private final ExistingWorkPolicy f7411c;

    /* renamed from: d  reason: collision with root package name */
    private final List f7412d;

    /* renamed from: e  reason: collision with root package name */
    private final List f7413e;

    /* renamed from: f  reason: collision with root package name */
    private final List f7414f;

    /* renamed from: g  reason: collision with root package name */
    private final List f7415g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7416h;

    /* renamed from: i  reason: collision with root package name */
    private o f7417i;

    public x(F f4, List list) {
        this(f4, (String) null, ExistingWorkPolicy.KEEP, list, (List) null);
    }

    private static boolean i(x xVar, Set set) {
        set.addAll(xVar.c());
        Set l4 = l(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l4.contains((String) it.next())) {
                return true;
            }
        }
        List<x> e4 = xVar.e();
        if (e4 != null && !e4.isEmpty()) {
            for (x i4 : e4) {
                if (i(i4, set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set l(x xVar) {
        HashSet hashSet = new HashSet();
        List<x> e4 = xVar.e();
        if (e4 != null && !e4.isEmpty()) {
            for (x c4 : e4) {
                hashSet.addAll(c4.c());
            }
        }
        return hashSet;
    }

    public o a() {
        if (!this.f7416h) {
            C0804c cVar = new C0804c(this);
            this.f7409a.v().c(cVar);
            this.f7417i = cVar.d();
        } else {
            m e4 = m.e();
            String str = f7408j;
            e4.k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f7413e) + ")");
        }
        return this.f7417i;
    }

    public ExistingWorkPolicy b() {
        return this.f7411c;
    }

    public List c() {
        return this.f7413e;
    }

    public String d() {
        return this.f7410b;
    }

    public List e() {
        return this.f7415g;
    }

    public List f() {
        return this.f7412d;
    }

    public F g() {
        return this.f7409a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f7416h;
    }

    public void k() {
        this.f7416h = true;
    }

    public x(F f4, String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        this(f4, str, existingWorkPolicy, list, (List) null);
    }

    public x(F f4, String str, ExistingWorkPolicy existingWorkPolicy, List list, List list2) {
        this.f7409a = f4;
        this.f7410b = str;
        this.f7411c = existingWorkPolicy;
        this.f7412d = list;
        this.f7415g = list2;
        this.f7413e = new ArrayList(list.size());
        this.f7414f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f7414f.addAll(((x) it.next()).f7414f);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            String b4 = ((u) list.get(i4)).b();
            this.f7413e.add(b4);
            this.f7414f.add(b4);
        }
    }
}
