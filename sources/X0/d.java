package X0;

import java.security.MessageDigest;
import p1.b;
import y.C0939a;

public final class d implements b {

    /* renamed from: b  reason: collision with root package name */
    private final C0939a f1940b = new b();

    private static void f(c cVar, Object obj, MessageDigest messageDigest) {
        cVar.g(obj, messageDigest);
    }

    public void b(MessageDigest messageDigest) {
        for (int i4 = 0; i4 < this.f1940b.size(); i4++) {
            f((c) this.f1940b.j(i4), this.f1940b.n(i4), messageDigest);
        }
    }

    public Object c(c cVar) {
        if (this.f1940b.containsKey(cVar)) {
            return this.f1940b.get(cVar);
        }
        return cVar.c();
    }

    public void d(d dVar) {
        this.f1940b.k(dVar.f1940b);
    }

    public d e(c cVar, Object obj) {
        this.f1940b.put(cVar, obj);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f1940b.equals(((d) obj).f1940b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1940b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f1940b + '}';
    }
}
