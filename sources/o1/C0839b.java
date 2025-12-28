package o1;

import X0.b;
import java.security.MessageDigest;
import p1.k;

/* renamed from: o1.b  reason: case insensitive filesystem */
public final class C0839b implements b {

    /* renamed from: b  reason: collision with root package name */
    private final Object f15093b;

    public C0839b(Object obj) {
        this.f15093b = k.d(obj);
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f15093b.toString().getBytes(b.f1934a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0839b) {
            return this.f15093b.equals(((C0839b) obj).f15093b);
        }
        return false;
    }

    public int hashCode() {
        return this.f15093b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f15093b + '}';
    }
}
