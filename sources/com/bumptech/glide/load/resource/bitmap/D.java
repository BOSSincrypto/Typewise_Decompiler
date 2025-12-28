package com.bumptech.glide.load.resource.bitmap;

import X0.e;
import Z0.b;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.s;
import java.io.IOException;
import java.io.InputStream;
import p1.d;
import p1.i;

public class D implements e {

    /* renamed from: a  reason: collision with root package name */
    private final s f11072a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11073b;

    static class a implements s.b {

        /* renamed from: a  reason: collision with root package name */
        private final RecyclableBufferedInputStream f11074a;

        /* renamed from: b  reason: collision with root package name */
        private final d f11075b;

        a(RecyclableBufferedInputStream recyclableBufferedInputStream, d dVar) {
            this.f11074a = recyclableBufferedInputStream;
            this.f11075b = dVar;
        }

        public void a(Z0.d dVar, Bitmap bitmap) {
            IOException a4 = this.f11075b.a();
            if (a4 != null) {
                if (bitmap != null) {
                    dVar.d(bitmap);
                }
                throw a4;
            }
        }

        public void b() {
            this.f11074a.e();
        }
    }

    public D(s sVar, b bVar) {
        this.f11072a = sVar;
        this.f11073b = bVar;
    }

    /* renamed from: c */
    public com.bumptech.glide.load.engine.s a(InputStream inputStream, int i4, int i5, X0.d dVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z3;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z3 = false;
        } else {
            z3 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f11073b);
        }
        d e4 = d.e(recyclableBufferedInputStream);
        try {
            return this.f11072a.f(new i(e4), i4, i5, dVar, new a(recyclableBufferedInputStream, e4));
        } finally {
            e4.f();
            if (z3) {
                recyclableBufferedInputStream.f();
            }
        }
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, X0.d dVar) {
        return this.f11072a.p(inputStream);
    }
}
