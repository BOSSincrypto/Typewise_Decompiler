package com.bumptech.glide;

import n1.C0827a;
import n1.C0829c;
import p1.l;

public abstract class j implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private C0829c f10803a = C0827a.b();

    /* renamed from: b */
    public final j clone() {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* access modifiers changed from: package-private */
    public final C0829c c() {
        return this.f10803a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return l.c(this.f10803a, ((j) obj).f10803a);
        }
        return false;
    }

    public int hashCode() {
        C0829c cVar = this.f10803a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
