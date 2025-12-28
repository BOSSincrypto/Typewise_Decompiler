package a1;

import X0.b;
import a1.h;
import com.bumptech.glide.load.engine.s;
import p1.h;

public class g extends h implements h {

    /* renamed from: e  reason: collision with root package name */
    private h.a f2236e;

    public g(long j4) {
        super(j4);
    }

    public void a(int i4) {
        if (i4 >= 40) {
            b();
        } else if (i4 >= 20 || i4 == 15) {
            m(h() / 2);
        }
    }

    public /* bridge */ /* synthetic */ s c(b bVar, s sVar) {
        return (s) super.k(bVar, sVar);
    }

    public /* bridge */ /* synthetic */ s d(b bVar) {
        return (s) super.l(bVar);
    }

    public void e(h.a aVar) {
        this.f2236e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int i(s sVar) {
        if (sVar == null) {
            return super.i((Object) null);
        }
        return sVar.a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void j(b bVar, s sVar) {
        h.a aVar = this.f2236e;
        if (aVar != null && sVar != null) {
            aVar.a(sVar);
        }
    }
}
