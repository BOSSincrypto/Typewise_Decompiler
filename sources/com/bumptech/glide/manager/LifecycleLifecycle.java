package com.bumptech.glide.manager;

import androidx.lifecycle.C0462l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import java.util.HashSet;
import java.util.Set;
import p1.l;

final class LifecycleLifecycle implements l, C0462l {

    /* renamed from: a  reason: collision with root package name */
    private final Set f11167a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Lifecycle f11168b;

    LifecycleLifecycle(Lifecycle lifecycle) {
        this.f11168b = lifecycle;
        lifecycle.a(this);
    }

    public void e(m mVar) {
        this.f11167a.add(mVar);
        if (this.f11168b.b() == Lifecycle.State.DESTROYED) {
            mVar.e();
        } else if (this.f11168b.b().isAtLeast(Lifecycle.State.STARTED)) {
            mVar.a();
        } else {
            mVar.c();
        }
    }

    public void f(m mVar) {
        this.f11167a.remove(mVar);
    }

    @t(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(m mVar) {
        for (m e4 : l.i(this.f11167a)) {
            e4.e();
        }
        mVar.getLifecycle().c(this);
    }

    @t(Lifecycle.Event.ON_START)
    public void onStart(m mVar) {
        for (m a4 : l.i(this.f11167a)) {
            a4.a();
        }
    }

    @t(Lifecycle.Event.ON_STOP)
    public void onStop(m mVar) {
        for (m c4 : l.i(this.f11167a)) {
            c4.c();
        }
    }
}
