package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.c;

final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11172a;

    /* renamed from: b  reason: collision with root package name */
    final c.a f11173b;

    e(Context context, c.a aVar) {
        this.f11172a = context.getApplicationContext();
        this.f11173b = aVar;
    }

    private void l() {
        u.a(this.f11172a).d(this.f11173b);
    }

    private void m() {
        u.a(this.f11172a).e(this.f11173b);
    }

    public void a() {
        l();
    }

    public void c() {
        m();
    }

    public void e() {
    }
}
