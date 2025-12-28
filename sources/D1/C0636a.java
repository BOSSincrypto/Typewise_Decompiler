package d1;

import X0.c;
import X0.d;
import c1.h;
import c1.m;
import c1.n;
import c1.o;
import c1.r;
import com.bumptech.glide.load.data.j;

/* renamed from: d1.a  reason: case insensitive filesystem */
public class C0636a implements n {

    /* renamed from: b  reason: collision with root package name */
    public static final c f13532b = c.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    private final m f13533a;

    /* renamed from: d1.a$a  reason: collision with other inner class name */
    public static class C0185a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final m f13534a = new m(500);

        public n c(r rVar) {
            return new C0636a(this.f13534a);
        }
    }

    public C0636a(m mVar) {
        this.f13533a = mVar;
    }

    /* renamed from: c */
    public n.a a(h hVar, int i4, int i5, d dVar) {
        m mVar = this.f13533a;
        if (mVar != null) {
            h hVar2 = (h) mVar.a(hVar, 0, 0);
            if (hVar2 == null) {
                this.f13533a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) dVar.c(f13532b)).intValue()));
    }

    /* renamed from: d */
    public boolean b(h hVar) {
        return true;
    }
}
