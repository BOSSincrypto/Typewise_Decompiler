package i1;

import W0.a;
import W0.c;
import W0.d;
import X0.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import e1.n;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p1.g;
import p1.l;

/* renamed from: i1.a  reason: case insensitive filesystem */
public class C0679a implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final C0191a f13672f = new C0191a();

    /* renamed from: g  reason: collision with root package name */
    private static final b f13673g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f13674a;

    /* renamed from: b  reason: collision with root package name */
    private final List f13675b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13676c;

    /* renamed from: d  reason: collision with root package name */
    private final C0191a f13677d;

    /* renamed from: e  reason: collision with root package name */
    private final b f13678e;

    /* renamed from: i1.a$a  reason: collision with other inner class name */
    static class C0191a {
        C0191a() {
        }

        /* access modifiers changed from: package-private */
        public a a(a.C0031a aVar, c cVar, ByteBuffer byteBuffer, int i4) {
            return new W0.e(aVar, cVar, byteBuffer, i4);
        }
    }

    /* renamed from: i1.a$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue f13679a = l.e(0);

        b() {
        }

        /* access modifiers changed from: package-private */
        public synchronized d a(ByteBuffer byteBuffer) {
            d dVar;
            try {
                dVar = (d) this.f13679a.poll();
                if (dVar == null) {
                    dVar = new d();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
            return dVar.p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        public synchronized void b(d dVar) {
            dVar.a();
            this.f13679a.offer(dVar);
        }
    }

    public C0679a(Context context, List list, Z0.d dVar, Z0.b bVar) {
        this(context, list, dVar, bVar, f13673g, f13672f);
    }

    private e c(ByteBuffer byteBuffer, int i4, int i5, d dVar, X0.d dVar2) {
        Bitmap.Config config;
        long b4 = g.b();
        try {
            c c4 = dVar.c();
            if (c4.b() > 0) {
                if (c4.c() == 0) {
                    if (dVar2.c(i.f13719a) == DecodeFormat.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    a a4 = this.f13677d.a(this.f13678e, c4, byteBuffer, e(c4, i4, i5));
                    a4.g(config);
                    a4.c();
                    Bitmap b5 = a4.b();
                    if (b5 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(g.a(b4));
                        }
                        return null;
                    }
                    e eVar = new e(new c(this.f13674a, a4, n.c(), i4, i5, b5));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(g.a(b4));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(g.a(b4));
            }
        }
    }

    private static int e(c cVar, int i4, int i5) {
        int i6;
        int min = Math.min(cVar.a() / i5, cVar.d() / i4);
        if (min == 0) {
            i6 = 0;
        } else {
            i6 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i6);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            sb.append("], actual dimens: [");
            sb.append(cVar.d());
            sb.append("x");
            sb.append(cVar.a());
            sb.append("]");
        }
        return max;
    }

    /* renamed from: d */
    public e a(ByteBuffer byteBuffer, int i4, int i5, X0.d dVar) {
        d a4 = this.f13676c.a(byteBuffer);
        try {
            return c(byteBuffer, i4, i5, a4, dVar);
        } finally {
            this.f13676c.b(a4);
        }
    }

    /* renamed from: f */
    public boolean b(ByteBuffer byteBuffer, X0.d dVar) {
        if (((Boolean) dVar.c(i.f13720b)).booleanValue() || com.bumptech.glide.load.a.g(this.f13675b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    C0679a(Context context, List list, Z0.d dVar, Z0.b bVar, b bVar2, C0191a aVar) {
        this.f13674a = context.getApplicationContext();
        this.f13675b = list;
        this.f13677d = aVar;
        this.f13678e = new b(dVar, bVar);
        this.f13676c = bVar2;
    }
}
