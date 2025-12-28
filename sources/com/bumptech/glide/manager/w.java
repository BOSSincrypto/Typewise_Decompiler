package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import m1.h;
import p1.l;

public final class w implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Set f11235a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        for (h a4 : l.i(this.f11235a)) {
            a4.a();
        }
    }

    public void c() {
        for (h c4 : l.i(this.f11235a)) {
            c4.c();
        }
    }

    public void e() {
        for (h e4 : l.i(this.f11235a)) {
            e4.e();
        }
    }

    public void l() {
        this.f11235a.clear();
    }

    public List m() {
        return l.i(this.f11235a);
    }

    public void n(h hVar) {
        this.f11235a.add(hVar);
    }

    public void o(h hVar) {
        this.f11235a.remove(hVar);
    }
}
