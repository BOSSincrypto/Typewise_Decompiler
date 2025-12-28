package i1;

import Z0.d;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.h;
import com.bumptech.glide.i;
import com.bumptech.glide.request.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import n1.C0828b;
import o1.C0839b;
import p1.k;
import p1.l;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final W0.a f13695a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f13696b;

    /* renamed from: c  reason: collision with root package name */
    private final List f13697c;

    /* renamed from: d  reason: collision with root package name */
    final i f13698d;

    /* renamed from: e  reason: collision with root package name */
    private final d f13699e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13700f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13701g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13702h;

    /* renamed from: i  reason: collision with root package name */
    private h f13703i;

    /* renamed from: j  reason: collision with root package name */
    private a f13704j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13705k;

    /* renamed from: l  reason: collision with root package name */
    private a f13706l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f13707m;

    /* renamed from: n  reason: collision with root package name */
    private X0.g f13708n;

    /* renamed from: o  reason: collision with root package name */
    private a f13709o;

    /* renamed from: p  reason: collision with root package name */
    private int f13710p;

    /* renamed from: q  reason: collision with root package name */
    private int f13711q;

    /* renamed from: r  reason: collision with root package name */
    private int f13712r;

    static class a extends m1.c {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f13713d;

        /* renamed from: e  reason: collision with root package name */
        final int f13714e;

        /* renamed from: f  reason: collision with root package name */
        private final long f13715f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f13716g;

        a(Handler handler, int i4, long j4) {
            this.f13713d = handler;
            this.f13714e = i4;
            this.f13715f = j4;
        }

        public void j(Drawable drawable) {
            this.f13716g = null;
        }

        /* access modifiers changed from: package-private */
        public Bitmap l() {
            return this.f13716g;
        }

        /* renamed from: m */
        public void h(Bitmap bitmap, C0828b bVar) {
            this.f13716g = bitmap;
            this.f13713d.sendMessageAtTime(this.f13713d.obtainMessage(1, this), this.f13715f);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                g.this.m((a) message.obj);
                return true;
            } else if (i4 != 2) {
                return false;
            } else {
                g.this.f13698d.o((a) message.obj);
                return false;
            }
        }
    }

    g(com.bumptech.glide.b bVar, W0.a aVar, int i4, int i5, X0.g gVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, (Handler) null, i(com.bumptech.glide.b.t(bVar.h()), i4, i5), gVar, bitmap);
    }

    private static X0.b g() {
        return new C0839b(Double.valueOf(Math.random()));
    }

    private static h i(i iVar, int i4, int i5) {
        return iVar.m().b(((e) ((e) e.j0(com.bumptech.glide.load.engine.h.f10947b).h0(true)).c0(true)).U(i4, i5));
    }

    private void l() {
        boolean z3;
        if (this.f13700f && !this.f13701g) {
            if (this.f13702h) {
                if (this.f13709o == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k.a(z3, "Pending target must be null when starting from the first frame");
                this.f13695a.h();
                this.f13702h = false;
            }
            a aVar = this.f13709o;
            if (aVar != null) {
                this.f13709o = null;
                m(aVar);
                return;
            }
            this.f13701g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f13695a.e());
            this.f13695a.c();
            this.f13706l = new a(this.f13696b, this.f13695a.a(), uptimeMillis);
            this.f13703i.b(e.k0(g())).v0(this.f13695a).q0(this.f13706l);
        }
    }

    private void n() {
        Bitmap bitmap = this.f13707m;
        if (bitmap != null) {
            this.f13699e.d(bitmap);
            this.f13707m = null;
        }
    }

    private void p() {
        if (!this.f13700f) {
            this.f13700f = true;
            this.f13705k = false;
            l();
        }
    }

    private void q() {
        this.f13700f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f13697c.clear();
        n();
        q();
        a aVar = this.f13704j;
        if (aVar != null) {
            this.f13698d.o(aVar);
            this.f13704j = null;
        }
        a aVar2 = this.f13706l;
        if (aVar2 != null) {
            this.f13698d.o(aVar2);
            this.f13706l = null;
        }
        a aVar3 = this.f13709o;
        if (aVar3 != null) {
            this.f13698d.o(aVar3);
            this.f13709o = null;
        }
        this.f13695a.clear();
        this.f13705k = true;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f13695a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f13704j;
        if (aVar != null) {
            return aVar.l();
        }
        return this.f13707m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f13704j;
        if (aVar != null) {
            return aVar.f13714e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f13707m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f13695a.d();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f13712r;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f13695a.f() + this.f13710p;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f13711q;
    }

    /* access modifiers changed from: package-private */
    public void m(a aVar) {
        this.f13701g = false;
        if (this.f13705k) {
            this.f13696b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f13700f) {
            if (aVar.l() != null) {
                n();
                a aVar2 = this.f13704j;
                this.f13704j = aVar;
                for (int size = this.f13697c.size() - 1; size >= 0; size--) {
                    ((b) this.f13697c.get(size)).a();
                }
                if (aVar2 != null) {
                    this.f13696b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        } else if (this.f13702h) {
            this.f13696b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f13709o = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void o(X0.g gVar, Bitmap bitmap) {
        this.f13708n = (X0.g) k.d(gVar);
        this.f13707m = (Bitmap) k.d(bitmap);
        this.f13703i = this.f13703i.b(new e().d0(gVar));
        this.f13710p = l.g(bitmap);
        this.f13711q = bitmap.getWidth();
        this.f13712r = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        if (this.f13705k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f13697c.contains(bVar)) {
            boolean isEmpty = this.f13697c.isEmpty();
            this.f13697c.add(bVar);
            if (isEmpty) {
                p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f13697c.remove(bVar);
        if (this.f13697c.isEmpty()) {
            q();
        }
    }

    g(d dVar, i iVar, W0.a aVar, Handler handler, h hVar, X0.g gVar, Bitmap bitmap) {
        this.f13697c = new ArrayList();
        this.f13698d = iVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f13699e = dVar;
        this.f13696b = handler;
        this.f13703i = hVar;
        this.f13695a = aVar;
        o(gVar, bitmap);
    }
}
