package com.bumptech.glide;

import Z0.b;
import Z0.d;
import android.content.Context;
import androidx.appcompat.app.F;
import c0.C0492b;
import java.util.Iterator;
import java.util.List;
import k1.C0704a;
import p1.f;

abstract class g {

    class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f10766b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f10767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C0704a f10768d;

        a(b bVar, List list, C0704a aVar) {
            this.f10766b = bVar;
            this.f10767c = list;
            this.f10768d = aVar;
        }

        /* renamed from: a */
        public Registry get() {
            if (!this.f10765a) {
                C0492b.a("Glide registry");
                this.f10765a = true;
                try {
                    return g.a(this.f10766b, this.f10767c, this.f10768d);
                } finally {
                    this.f10765a = false;
                    C0492b.b();
                }
            } else {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
        }
    }

    static Registry a(b bVar, List list, C0704a aVar) {
        d f4 = bVar.f();
        b e4 = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e g4 = bVar.i().g();
        Registry registry = new Registry();
        b(applicationContext, registry, f4, e4, g4);
        c(applicationContext, bVar, registry, list, aVar);
        return registry;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0276  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.content.Context r24, com.bumptech.glide.Registry r25, Z0.d r26, Z0.b r27, com.bumptech.glide.e r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r4 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r4.<init>()
            r1.o(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L_0x001e
            com.bumptech.glide.load.resource.bitmap.v r5 = new com.bumptech.glide.load.resource.bitmap.v
            r5.<init>()
            r1.o(r5)
        L_0x001e:
            android.content.res.Resources r5 = r24.getResources()
            java.util.List r6 = r25.g()
            i1.a r7 = new i1.a
            r7.<init>(r0, r6, r2, r3)
            X0.e r8 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.m(r26)
            com.bumptech.glide.load.resource.bitmap.s r9 = new com.bumptech.glide.load.resource.bitmap.s
            java.util.List r10 = r25.g()
            android.util.DisplayMetrics r11 = r5.getDisplayMetrics()
            r9.<init>(r10, r11, r2, r3)
            r10 = 28
            if (r4 < r10) goto L_0x0055
            java.lang.Class<com.bumptech.glide.c$b> r11 = com.bumptech.glide.c.b.class
            r12 = r28
            boolean r11 = r12.a(r11)
            if (r11 == 0) goto L_0x0055
            com.bumptech.glide.load.resource.bitmap.z r11 = new com.bumptech.glide.load.resource.bitmap.z
            r11.<init>()
            com.bumptech.glide.load.resource.bitmap.k r12 = new com.bumptech.glide.load.resource.bitmap.k
            r12.<init>()
            goto L_0x005f
        L_0x0055:
            com.bumptech.glide.load.resource.bitmap.i r12 = new com.bumptech.glide.load.resource.bitmap.i
            r12.<init>(r9)
            com.bumptech.glide.load.resource.bitmap.D r11 = new com.bumptech.glide.load.resource.bitmap.D
            r11.<init>(r9, r3)
        L_0x005f:
            java.lang.String r13 = "Animation"
            java.lang.Class<java.nio.ByteBuffer> r14 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            r16 = r7
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            if (r4 < r10) goto L_0x0079
            X0.e r10 = g1.h.f(r6, r3)
            r1.e(r13, r7, r15, r10)
            X0.e r10 = g1.h.a(r6, r3)
            r1.e(r13, r14, r15, r10)
        L_0x0079:
            g1.l r10 = new g1.l
            r10.<init>(r0)
            r17 = r4
            com.bumptech.glide.load.resource.bitmap.c r4 = new com.bumptech.glide.load.resource.bitmap.c
            r4.<init>(r3)
            j1.a r0 = new j1.a
            r0.<init>()
            r28 = r0
            j1.d r0 = new j1.d
            r0.<init>()
            r18 = r0
            android.content.ContentResolver r0 = r24.getContentResolver()
            r19 = r0
            c1.c r0 = new c1.c
            r0.<init>()
            com.bumptech.glide.Registry r0 = r1.a(r14, r0)
            r20 = r10
            c1.u r10 = new c1.u
            r10.<init>(r3)
            com.bumptech.glide.Registry r0 = r0.a(r7, r10)
            java.lang.String r10 = "Bitmap"
            r21 = r15
            java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
            com.bumptech.glide.Registry r0 = r0.e(r10, r14, r15, r12)
            r0.e(r10, r7, r15, r11)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            r22 = r13
            java.lang.Class<android.os.ParcelFileDescriptor> r13 = android.os.ParcelFileDescriptor.class
            if (r0 == 0) goto L_0x00cc
            com.bumptech.glide.load.resource.bitmap.B r0 = new com.bumptech.glide.load.resource.bitmap.B
            r0.<init>(r9)
            r1.e(r10, r13, r15, r0)
        L_0x00cc:
            com.bumptech.glide.Registry r0 = r1.e(r10, r13, r15, r8)
            X0.e r9 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.c(r26)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            com.bumptech.glide.Registry r0 = r0.e(r10, r1, r15, r9)
            c1.w$a r9 = c1.w.a.a()
            com.bumptech.glide.Registry r0 = r0.d(r15, r15, r9)
            com.bumptech.glide.load.resource.bitmap.F r9 = new com.bumptech.glide.load.resource.bitmap.F
            r9.<init>()
            com.bumptech.glide.Registry r0 = r0.e(r10, r15, r15, r9)
            com.bumptech.glide.Registry r0 = r0.b(r15, r4)
            com.bumptech.glide.load.resource.bitmap.a r9 = new com.bumptech.glide.load.resource.bitmap.a
            r9.<init>(r5, r12)
            java.lang.String r12 = "BitmapDrawable"
            r23 = r1
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.Registry r0 = r0.e(r12, r14, r1, r9)
            com.bumptech.glide.load.resource.bitmap.a r9 = new com.bumptech.glide.load.resource.bitmap.a
            r9.<init>(r5, r11)
            com.bumptech.glide.Registry r0 = r0.e(r12, r7, r1, r9)
            com.bumptech.glide.load.resource.bitmap.a r9 = new com.bumptech.glide.load.resource.bitmap.a
            r9.<init>(r5, r8)
            com.bumptech.glide.Registry r0 = r0.e(r12, r13, r1, r9)
            com.bumptech.glide.load.resource.bitmap.b r8 = new com.bumptech.glide.load.resource.bitmap.b
            r8.<init>(r2, r4)
            com.bumptech.glide.Registry r0 = r0.b(r1, r8)
            i1.j r4 = new i1.j
            r8 = r16
            r4.<init>(r6, r8, r3)
            java.lang.Class<i1.c> r6 = i1.c.class
            r9 = r22
            com.bumptech.glide.Registry r0 = r0.e(r9, r7, r6, r4)
            com.bumptech.glide.Registry r0 = r0.e(r9, r14, r6, r8)
            i1.d r4 = new i1.d
            r4.<init>()
            com.bumptech.glide.Registry r0 = r0.b(r6, r4)
            c1.w$a r4 = c1.w.a.a()
            java.lang.Class<W0.a> r8 = W0.a.class
            com.bumptech.glide.Registry r0 = r0.d(r8, r8, r4)
            i1.h r4 = new i1.h
            r4.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.e(r10, r8, r15, r4)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r9 = r20
            r8 = r21
            com.bumptech.glide.Registry r0 = r0.c(r4, r8, r9)
            com.bumptech.glide.load.resource.bitmap.C r10 = new com.bumptech.glide.load.resource.bitmap.C
            r10.<init>(r9, r2)
            com.bumptech.glide.Registry r0 = r0.c(r4, r15, r10)
            f1.a$a r9 = new f1.a$a
            r9.<init>()
            com.bumptech.glide.Registry r0 = r0.p(r9)
            c1.d$b r9 = new c1.d$b
            r9.<init>()
            java.lang.Class<java.io.File> r10 = java.io.File.class
            com.bumptech.glide.Registry r0 = r0.d(r10, r14, r9)
            c1.g$e r9 = new c1.g$e
            r9.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r10, r7, r9)
            h1.a r9 = new h1.a
            r9.<init>()
            com.bumptech.glide.Registry r0 = r0.c(r10, r10, r9)
            c1.g$b r9 = new c1.g$b
            r9.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r10, r13, r9)
            c1.w$a r9 = c1.w.a.a()
            com.bumptech.glide.Registry r0 = r0.d(r10, r10, r9)
            com.bumptech.glide.load.data.k$a r9 = new com.bumptech.glide.load.data.k$a
            r9.<init>(r3)
            r0.p(r9)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            if (r0 == 0) goto L_0x01ad
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r3 = r25
            r9 = r23
            r3.p(r0)
            goto L_0x01b1
        L_0x01ad:
            r3 = r25
            r9 = r23
        L_0x01b1:
            c1.o r0 = c1.f.g(r24)
            c1.o r11 = c1.f.c(r24)
            c1.o r12 = c1.f.e(r24)
            r16 = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            com.bumptech.glide.Registry r2 = r3.d(r6, r7, r0)
            r20 = r1
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            com.bumptech.glide.Registry r0 = r2.d(r1, r7, r0)
            com.bumptech.glide.Registry r0 = r0.d(r6, r9, r11)
            com.bumptech.glide.Registry r0 = r0.d(r1, r9, r11)
            com.bumptech.glide.Registry r0 = r0.d(r6, r8, r12)
            com.bumptech.glide.Registry r0 = r0.d(r1, r8, r12)
            c1.o r2 = c1.t.f(r24)
            com.bumptech.glide.Registry r0 = r0.d(r4, r7, r2)
            c1.o r2 = c1.t.e(r24)
            r0.d(r4, r9, r2)
            c1.s$c r0 = new c1.s$c
            r0.<init>(r5)
            c1.s$a r2 = new c1.s$a
            r2.<init>(r5)
            c1.s$b r11 = new c1.s$b
            r11.<init>(r5)
            com.bumptech.glide.Registry r12 = r3.d(r1, r4, r0)
            com.bumptech.glide.Registry r0 = r12.d(r6, r4, r0)
            com.bumptech.glide.Registry r0 = r0.d(r1, r9, r2)
            com.bumptech.glide.Registry r0 = r0.d(r6, r9, r2)
            com.bumptech.glide.Registry r0 = r0.d(r1, r7, r11)
            r0.d(r6, r7, r11)
            c1.e$c r0 = new c1.e$c
            r0.<init>()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.bumptech.glide.Registry r0 = r3.d(r1, r7, r0)
            c1.e$c r2 = new c1.e$c
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r4, r7, r2)
            c1.v$c r2 = new c1.v$c
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r1, r7, r2)
            c1.v$b r2 = new c1.v$b
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r1, r13, r2)
            c1.v$a r2 = new c1.v$a
            r2.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r1, r9, r2)
            c1.a$c r1 = new c1.a$c
            android.content.res.AssetManager r2 = r24.getAssets()
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.d(r4, r7, r1)
            c1.a$b r1 = new c1.a$b
            android.content.res.AssetManager r2 = r24.getAssets()
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.d(r4, r9, r1)
            d1.b$a r1 = new d1.b$a
            r2 = r24
            r6 = r28
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.d(r4, r7, r1)
            d1.c$a r1 = new d1.c$a
            r1.<init>(r2)
            r0.d(r4, r7, r1)
            r0 = 29
            r1 = r17
            if (r1 < r0) goto L_0x0286
            d1.d$c r0 = new d1.d$c
            r0.<init>(r2)
            r3.d(r4, r7, r0)
            d1.d$b r0 = new d1.d$b
            r0.<init>(r2)
            r3.d(r4, r13, r0)
        L_0x0286:
            c1.x$d r0 = new c1.x$d
            r1 = r19
            r0.<init>(r1)
            com.bumptech.glide.Registry r0 = r3.d(r4, r7, r0)
            c1.x$b r11 = new c1.x$b
            r11.<init>(r1)
            com.bumptech.glide.Registry r0 = r0.d(r4, r13, r11)
            c1.x$a r11 = new c1.x$a
            r11.<init>(r1)
            com.bumptech.glide.Registry r0 = r0.d(r4, r9, r11)
            c1.y$a r1 = new c1.y$a
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r4, r7, r1)
            d1.g$a r1 = new d1.g$a
            r1.<init>()
            java.lang.Class<java.net.URL> r9 = java.net.URL.class
            com.bumptech.glide.Registry r0 = r0.d(r9, r7, r1)
            c1.l$a r1 = new c1.l$a
            r1.<init>(r2)
            com.bumptech.glide.Registry r0 = r0.d(r4, r10, r1)
            d1.a$a r1 = new d1.a$a
            r1.<init>()
            java.lang.Class<c1.h> r2 = c1.h.class
            com.bumptech.glide.Registry r0 = r0.d(r2, r7, r1)
            c1.b$a r1 = new c1.b$a
            r1.<init>()
            java.lang.Class<byte[]> r2 = byte[].class
            com.bumptech.glide.Registry r0 = r0.d(r2, r14, r1)
            c1.b$d r1 = new c1.b$d
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.d(r2, r7, r1)
            c1.w$a r1 = c1.w.a.a()
            com.bumptech.glide.Registry r0 = r0.d(r4, r4, r1)
            c1.w$a r1 = c1.w.a.a()
            com.bumptech.glide.Registry r0 = r0.d(r8, r8, r1)
            g1.m r1 = new g1.m
            r1.<init>()
            com.bumptech.glide.Registry r0 = r0.c(r8, r8, r1)
            j1.b r1 = new j1.b
            r1.<init>(r5)
            r4 = r20
            com.bumptech.glide.Registry r0 = r0.q(r15, r4, r1)
            com.bumptech.glide.Registry r0 = r0.q(r15, r2, r6)
            j1.c r1 = new j1.c
            r7 = r26
            r9 = r18
            r1.<init>(r7, r6, r9)
            com.bumptech.glide.Registry r0 = r0.q(r8, r2, r1)
            r1 = r16
            r0.q(r1, r2, r9)
            X0.e r0 = com.bumptech.glide.load.resource.bitmap.VideoDecoder.d(r26)
            r3.c(r14, r15, r0)
            com.bumptech.glide.load.resource.bitmap.a r1 = new com.bumptech.glide.load.resource.bitmap.a
            r1.<init>(r5, r0)
            r3.c(r14, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.b(android.content.Context, com.bumptech.glide.Registry, Z0.d, Z0.b, com.bumptech.glide.e):void");
    }

    private static void c(Context context, b bVar, Registry registry, List list, C0704a aVar) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        } else if (aVar != null) {
            aVar.a(context, bVar, registry);
        }
    }

    static f.b d(b bVar, List list, C0704a aVar) {
        return new a(bVar, list, aVar);
    }
}
