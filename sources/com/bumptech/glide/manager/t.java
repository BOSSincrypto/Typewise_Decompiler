package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.request.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p1.l;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final Set f11198a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Set f11199b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f11200c;

    public boolean a(c cVar) {
        boolean z3 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f11198a.remove(cVar);
        if (!this.f11199b.remove(cVar) && !remove) {
            z3 = false;
        }
        if (z3) {
            cVar.clear();
        }
        return z3;
    }

    public void b() {
        for (c a4 : l.i(this.f11198a)) {
            a(a4);
        }
        this.f11199b.clear();
    }

    public void c() {
        this.f11200c = true;
        for (c cVar : l.i(this.f11198a)) {
            if (cVar.isRunning() || cVar.k()) {
                cVar.clear();
                this.f11199b.add(cVar);
            }
        }
    }

    public void d() {
        this.f11200c = true;
        for (c cVar : l.i(this.f11198a)) {
            if (cVar.isRunning()) {
                cVar.h();
                this.f11199b.add(cVar);
            }
        }
    }

    public void e() {
        for (c cVar : l.i(this.f11198a)) {
            if (!cVar.k() && !cVar.e()) {
                cVar.clear();
                if (!this.f11200c) {
                    cVar.i();
                } else {
                    this.f11199b.add(cVar);
                }
            }
        }
    }

    public void f() {
        this.f11200c = false;
        for (c cVar : l.i(this.f11198a)) {
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        this.f11199b.clear();
    }

    public void g(c cVar) {
        this.f11198a.add(cVar);
        if (!this.f11200c) {
            cVar.i();
            return;
        }
        cVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f11199b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f11198a.size() + ", isPaused=" + this.f11200c + "}";
    }
}
