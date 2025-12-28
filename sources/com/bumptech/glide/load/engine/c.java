package com.bumptech.glide.load.engine;

import X0.b;
import java.security.MessageDigest;

final class c implements b {

    /* renamed from: b  reason: collision with root package name */
    private final b f10918b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10919c;

    c(b bVar, b bVar2) {
        this.f10918b = bVar;
        this.f10919c = bVar2;
    }

    public void b(MessageDigest messageDigest) {
        this.f10918b.b(messageDigest);
        this.f10919c.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f10918b.equals(cVar.f10918b) || !this.f10919c.equals(cVar.f10919c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f10918b.hashCode() * 31) + this.f10919c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f10918b + ", signature=" + this.f10919c + '}';
    }
}
