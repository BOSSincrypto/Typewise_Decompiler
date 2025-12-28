package d0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import d0.C0621l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d0.p  reason: case insensitive filesystem */
public class C0625p extends C0621l {

    /* renamed from: N  reason: collision with root package name */
    private ArrayList f13511N = new ArrayList();

    /* renamed from: O  reason: collision with root package name */
    private boolean f13512O = true;

    /* renamed from: P  reason: collision with root package name */
    int f13513P;

    /* renamed from: Q  reason: collision with root package name */
    boolean f13514Q = false;

    /* renamed from: R  reason: collision with root package name */
    private int f13515R = 0;

    /* renamed from: d0.p$a */
    class a extends C0622m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0621l f13516a;

        a(C0621l lVar) {
            this.f13516a = lVar;
        }

        public void e(C0621l lVar) {
            this.f13516a.X();
            lVar.T(this);
        }
    }

    /* renamed from: d0.p$b */
    static class b extends C0622m {

        /* renamed from: a  reason: collision with root package name */
        C0625p f13518a;

        b(C0625p pVar) {
            this.f13518a = pVar;
        }

        public void a(C0621l lVar) {
            C0625p pVar = this.f13518a;
            if (!pVar.f13514Q) {
                pVar.e0();
                this.f13518a.f13514Q = true;
            }
        }

        public void e(C0621l lVar) {
            C0625p pVar = this.f13518a;
            int i4 = pVar.f13513P - 1;
            pVar.f13513P = i4;
            if (i4 == 0) {
                pVar.f13514Q = false;
                pVar.t();
            }
            lVar.T(this);
        }
    }

    private void j0(C0621l lVar) {
        this.f13511N.add(lVar);
        lVar.f13491v = this;
    }

    private void s0() {
        b bVar = new b(this);
        Iterator it = this.f13511N.iterator();
        while (it.hasNext()) {
            ((C0621l) it.next()).b(bVar);
        }
        this.f13513P = this.f13511N.size();
    }

    public void R(View view) {
        super.R(view);
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0621l) this.f13511N.get(i4)).R(view);
        }
    }

    public void V(View view) {
        super.V(view);
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0621l) this.f13511N.get(i4)).V(view);
        }
    }

    /* access modifiers changed from: protected */
    public void X() {
        if (this.f13511N.isEmpty()) {
            e0();
            t();
            return;
        }
        s0();
        if (!this.f13512O) {
            for (int i4 = 1; i4 < this.f13511N.size(); i4++) {
                ((C0621l) this.f13511N.get(i4 - 1)).b(new a((C0621l) this.f13511N.get(i4)));
            }
            C0621l lVar = (C0621l) this.f13511N.get(0);
            if (lVar != null) {
                lVar.X();
                return;
            }
            return;
        }
        Iterator it = this.f13511N.iterator();
        while (it.hasNext()) {
            ((C0621l) it.next()).X();
        }
    }

    public void Z(C0621l.e eVar) {
        super.Z(eVar);
        this.f13515R |= 8;
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0621l) this.f13511N.get(i4)).Z(eVar);
        }
    }

    public void b0(C0616g gVar) {
        super.b0(gVar);
        this.f13515R |= 4;
        if (this.f13511N != null) {
            for (int i4 = 0; i4 < this.f13511N.size(); i4++) {
                ((C0621l) this.f13511N.get(i4)).b0(gVar);
            }
        }
    }

    public void c0(C0624o oVar) {
        super.c0(oVar);
        this.f13515R |= 2;
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0621l) this.f13511N.get(i4)).c0(oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String f0(String str) {
        String f02 = super.f0(str);
        for (int i4 = 0; i4 < this.f13511N.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(f02);
            sb.append("\n");
            sb.append(((C0621l) this.f13511N.get(i4)).f0(str + "  "));
            f02 = sb.toString();
        }
        return f02;
    }

    /* renamed from: g0 */
    public C0625p b(C0621l.f fVar) {
        return (C0625p) super.b(fVar);
    }

    /* renamed from: h0 */
    public C0625p c(View view) {
        for (int i4 = 0; i4 < this.f13511N.size(); i4++) {
            ((C0621l) this.f13511N.get(i4)).c(view);
        }
        return (C0625p) super.c(view);
    }

    public C0625p i0(C0621l lVar) {
        j0(lVar);
        long j4 = this.f13476c;
        if (j4 >= 0) {
            lVar.Y(j4);
        }
        if ((this.f13515R & 1) != 0) {
            lVar.a0(w());
        }
        if ((this.f13515R & 2) != 0) {
            A();
            lVar.c0((C0624o) null);
        }
        if ((this.f13515R & 4) != 0) {
            lVar.b0(z());
        }
        if ((this.f13515R & 8) != 0) {
            lVar.Z(v());
        }
        return this;
    }

    public void j(C0628s sVar) {
        if (K(sVar.f13523b)) {
            Iterator it = this.f13511N.iterator();
            while (it.hasNext()) {
                C0621l lVar = (C0621l) it.next();
                if (lVar.K(sVar.f13523b)) {
                    lVar.j(sVar);
                    sVar.f13524c.add(lVar);
                }
            }
        }
    }

    public C0621l k0(int i4) {
        if (i4 < 0 || i4 >= this.f13511N.size()) {
            return null;
        }
        return (C0621l) this.f13511N.get(i4);
    }

    /* access modifiers changed from: package-private */
    public void l(C0628s sVar) {
        super.l(sVar);
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0621l) this.f13511N.get(i4)).l(sVar);
        }
    }

    public int l0() {
        return this.f13511N.size();
    }

    /* renamed from: m0 */
    public C0625p T(C0621l.f fVar) {
        return (C0625p) super.T(fVar);
    }

    public void n(C0628s sVar) {
        if (K(sVar.f13523b)) {
            Iterator it = this.f13511N.iterator();
            while (it.hasNext()) {
                C0621l lVar = (C0621l) it.next();
                if (lVar.K(sVar.f13523b)) {
                    lVar.n(sVar);
                    sVar.f13524c.add(lVar);
                }
            }
        }
    }

    /* renamed from: n0 */
    public C0625p U(View view) {
        for (int i4 = 0; i4 < this.f13511N.size(); i4++) {
            ((C0621l) this.f13511N.get(i4)).U(view);
        }
        return (C0625p) super.U(view);
    }

    /* renamed from: o0 */
    public C0625p Y(long j4) {
        ArrayList arrayList;
        super.Y(j4);
        if (this.f13476c >= 0 && (arrayList = this.f13511N) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C0621l) this.f13511N.get(i4)).Y(j4);
            }
        }
        return this;
    }

    /* renamed from: p0 */
    public C0625p a0(TimeInterpolator timeInterpolator) {
        this.f13515R |= 1;
        ArrayList arrayList = this.f13511N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C0621l) this.f13511N.get(i4)).a0(timeInterpolator);
            }
        }
        return (C0625p) super.a0(timeInterpolator);
    }

    /* renamed from: q */
    public C0621l clone() {
        C0625p pVar = (C0625p) super.clone();
        pVar.f13511N = new ArrayList();
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.j0(((C0621l) this.f13511N.get(i4)).clone());
        }
        return pVar;
    }

    public C0625p q0(int i4) {
        if (i4 == 0) {
            this.f13512O = true;
        } else if (i4 == 1) {
            this.f13512O = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i4);
        }
        return this;
    }

    /* renamed from: r0 */
    public C0625p d0(long j4) {
        return (C0625p) super.d0(j4);
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, C0629t tVar, C0629t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long C3 = C();
        int size = this.f13511N.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0621l lVar = (C0621l) this.f13511N.get(i4);
            if (C3 > 0 && (this.f13512O || i4 == 0)) {
                long C4 = lVar.C();
                if (C4 > 0) {
                    lVar.d0(C4 + C3);
                } else {
                    lVar.d0(C3);
                }
            }
            lVar.s(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
