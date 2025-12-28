package com.bumptech.glide.load.data;

import Z0.b;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclableBufferedInputStream f10843a;

    public static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final b f10844a;

        public a(b bVar) {
            this.f10844a = bVar;
        }

        public Class a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f10844a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f10843a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    public void b() {
        this.f10843a.f();
    }

    public void c() {
        this.f10843a.e();
    }

    /* renamed from: d */
    public InputStream a() {
        this.f10843a.reset();
        return this.f10843a;
    }
}
