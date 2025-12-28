package com.bumptech.glide.load.engine;

import X0.b;
import java.util.HashMap;
import java.util.Map;

final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Map f11026a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f11027b = new HashMap();

    p() {
    }

    private Map b(boolean z3) {
        if (z3) {
            return this.f11027b;
        }
        return this.f11026a;
    }

    /* access modifiers changed from: package-private */
    public j a(b bVar, boolean z3) {
        return (j) b(z3).get(bVar);
    }

    /* access modifiers changed from: package-private */
    public void c(b bVar, j jVar) {
        b(jVar.p()).put(bVar, jVar);
    }

    /* access modifiers changed from: package-private */
    public void d(b bVar, j jVar) {
        Map b4 = b(jVar.p());
        if (jVar.equals(b4.get(bVar))) {
            b4.remove(bVar);
        }
    }
}
