package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p1.l;

class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Set f11169a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private boolean f11170b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11171c;

    a() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f11171c = true;
        for (m e4 : l.i(this.f11169a)) {
            e4.e();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f11170b = true;
        for (m a4 : l.i(this.f11169a)) {
            a4.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f11170b = false;
        for (m c4 : l.i(this.f11169a)) {
            c4.c();
        }
    }

    public void e(m mVar) {
        this.f11169a.add(mVar);
        if (this.f11171c) {
            mVar.e();
        } else if (this.f11170b) {
            mVar.a();
        } else {
            mVar.c();
        }
    }

    public void f(m mVar) {
        this.f11169a.remove(mVar);
    }
}
