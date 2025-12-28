package com.bumptech.glide.load.engine;

import X0.b;
import X0.d;
import java.security.MessageDigest;
import java.util.Map;
import p1.k;

class l implements b {

    /* renamed from: b  reason: collision with root package name */
    private final Object f11010b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11011c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11012d;

    /* renamed from: e  reason: collision with root package name */
    private final Class f11013e;

    /* renamed from: f  reason: collision with root package name */
    private final Class f11014f;

    /* renamed from: g  reason: collision with root package name */
    private final b f11015g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f11016h;

    /* renamed from: i  reason: collision with root package name */
    private final d f11017i;

    /* renamed from: j  reason: collision with root package name */
    private int f11018j;

    l(Object obj, b bVar, int i4, int i5, Map map, Class cls, Class cls2, d dVar) {
        this.f11010b = k.d(obj);
        this.f11015g = (b) k.e(bVar, "Signature must not be null");
        this.f11011c = i4;
        this.f11012d = i5;
        this.f11016h = (Map) k.d(map);
        this.f11013e = (Class) k.e(cls, "Resource class must not be null");
        this.f11014f = (Class) k.e(cls2, "Transcode class must not be null");
        this.f11017i = (d) k.d(dVar);
    }

    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f11010b.equals(lVar.f11010b) || !this.f11015g.equals(lVar.f11015g) || this.f11012d != lVar.f11012d || this.f11011c != lVar.f11011c || !this.f11016h.equals(lVar.f11016h) || !this.f11013e.equals(lVar.f11013e) || !this.f11014f.equals(lVar.f11014f) || !this.f11017i.equals(lVar.f11017i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11018j == 0) {
            int hashCode = this.f11010b.hashCode();
            this.f11018j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f11015g.hashCode()) * 31) + this.f11011c) * 31) + this.f11012d;
            this.f11018j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f11016h.hashCode();
            this.f11018j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f11013e.hashCode();
            this.f11018j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f11014f.hashCode();
            this.f11018j = hashCode5;
            this.f11018j = (hashCode5 * 31) + this.f11017i.hashCode();
        }
        return this.f11018j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f11010b + ", width=" + this.f11011c + ", height=" + this.f11012d + ", resourceClass=" + this.f11013e + ", transcodeClass=" + this.f11014f + ", signature=" + this.f11015g + ", hashCode=" + this.f11018j + ", transformations=" + this.f11016h + ", options=" + this.f11017i + '}';
    }
}
