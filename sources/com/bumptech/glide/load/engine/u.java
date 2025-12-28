package com.bumptech.glide.load.engine;

import X0.b;
import X0.d;
import X0.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p1.h;
import p1.l;

final class u implements b {

    /* renamed from: j  reason: collision with root package name */
    private static final h f11047j = new h(50);

    /* renamed from: b  reason: collision with root package name */
    private final Z0.b f11048b;

    /* renamed from: c  reason: collision with root package name */
    private final b f11049c;

    /* renamed from: d  reason: collision with root package name */
    private final b f11050d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11051e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11052f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f11053g;

    /* renamed from: h  reason: collision with root package name */
    private final d f11054h;

    /* renamed from: i  reason: collision with root package name */
    private final g f11055i;

    u(Z0.b bVar, b bVar2, b bVar3, int i4, int i5, g gVar, Class cls, d dVar) {
        this.f11048b = bVar;
        this.f11049c = bVar2;
        this.f11050d = bVar3;
        this.f11051e = i4;
        this.f11052f = i5;
        this.f11055i = gVar;
        this.f11053g = cls;
        this.f11054h = dVar;
    }

    private byte[] c() {
        h hVar = f11047j;
        byte[] bArr = (byte[]) hVar.g(this.f11053g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f11053g.getName().getBytes(b.f1934a);
        hVar.k(this.f11053g, bytes);
        return bytes;
    }

    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f11048b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f11051e).putInt(this.f11052f).array();
        this.f11050d.b(messageDigest);
        this.f11049c.b(messageDigest);
        messageDigest.update(bArr);
        g gVar = this.f11055i;
        if (gVar != null) {
            gVar.b(messageDigest);
        }
        this.f11054h.b(messageDigest);
        messageDigest.update(c());
        this.f11048b.d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f11052f != uVar.f11052f || this.f11051e != uVar.f11051e || !l.c(this.f11055i, uVar.f11055i) || !this.f11053g.equals(uVar.f11053g) || !this.f11049c.equals(uVar.f11049c) || !this.f11050d.equals(uVar.f11050d) || !this.f11054h.equals(uVar.f11054h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f11049c.hashCode() * 31) + this.f11050d.hashCode()) * 31) + this.f11051e) * 31) + this.f11052f;
        g gVar = this.f11055i;
        if (gVar != null) {
            hashCode = (hashCode * 31) + gVar.hashCode();
        }
        return (((hashCode * 31) + this.f11053g.hashCode()) * 31) + this.f11054h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f11049c + ", signature=" + this.f11050d + ", width=" + this.f11051e + ", height=" + this.f11052f + ", decodedResourceClass=" + this.f11053g + ", transformation='" + this.f11055i + '\'' + ", options=" + this.f11054h + '}';
    }
}
