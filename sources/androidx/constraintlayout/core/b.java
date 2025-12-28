package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import java.util.ArrayList;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    SolverVariable f3800a = null;

    /* renamed from: b  reason: collision with root package name */
    float f3801b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f3802c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f3803d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f3804e;

    /* renamed from: f  reason: collision with root package name */
    boolean f3805f = false;

    public interface a {
        float a(int i4);

        float b(SolverVariable solverVariable, boolean z3);

        int c();

        void clear();

        float d(SolverVariable solverVariable);

        boolean e(SolverVariable solverVariable);

        float f(b bVar, boolean z3);

        void g(SolverVariable solverVariable, float f4);

        SolverVariable h(int i4);

        void i(SolverVariable solverVariable, float f4, boolean z3);

        void j(float f4);

        void k();
    }

    public b() {
    }

    private boolean u(SolverVariable solverVariable, d dVar) {
        if (solverVariable.f3782m <= 1) {
            return true;
        }
        return false;
    }

    private SolverVariable w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int c4 = this.f3804e.c();
        SolverVariable solverVariable2 = null;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < c4; i4++) {
            float a4 = this.f3804e.a(i4);
            if (a4 < 0.0f) {
                SolverVariable h4 = this.f3804e.h(i4);
                if ((zArr == null || !zArr[h4.f3772c]) && h4 != solverVariable && (((type = h4.f3779j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && a4 < f4)) {
                    f4 = a4;
                    solverVariable2 = h4;
                }
            }
        }
        return solverVariable2;
    }

    public void A(d dVar, SolverVariable solverVariable, boolean z3) {
        if (solverVariable != null && solverVariable.f3776g) {
            this.f3801b += solverVariable.f3775f * this.f3804e.d(solverVariable);
            this.f3804e.b(solverVariable, z3);
            if (z3) {
                solverVariable.d(this);
            }
            if (d.f3812t && this.f3804e.c() == 0) {
                this.f3805f = true;
                dVar.f3818a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z3) {
        this.f3801b += bVar.f3801b * this.f3804e.f(bVar, z3);
        if (z3) {
            bVar.f3800a.d(this);
        }
        if (d.f3812t && this.f3800a != null && this.f3804e.c() == 0) {
            this.f3805f = true;
            dVar.f3818a = true;
        }
    }

    public void C(d dVar, SolverVariable solverVariable, boolean z3) {
        if (solverVariable != null && solverVariable.f3783n) {
            float d4 = this.f3804e.d(solverVariable);
            this.f3801b += solverVariable.f3785p * d4;
            this.f3804e.b(solverVariable, z3);
            if (z3) {
                solverVariable.d(this);
            }
            this.f3804e.i(dVar.f3831n.f3809d[solverVariable.f3784o], d4, z3);
            if (d.f3812t && this.f3804e.c() == 0) {
                this.f3805f = true;
                dVar.f3818a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f3824g.length != 0) {
            boolean z3 = false;
            while (!z3) {
                int c4 = this.f3804e.c();
                for (int i4 = 0; i4 < c4; i4++) {
                    SolverVariable h4 = this.f3804e.h(i4);
                    if (h4.f3773d != -1 || h4.f3776g || h4.f3783n) {
                        this.f3803d.add(h4);
                    }
                }
                int size = this.f3803d.size();
                if (size > 0) {
                    for (int i5 = 0; i5 < size; i5++) {
                        SolverVariable solverVariable = (SolverVariable) this.f3803d.get(i5);
                        if (solverVariable.f3776g) {
                            A(dVar, solverVariable, true);
                        } else if (solverVariable.f3783n) {
                            C(dVar, solverVariable, true);
                        } else {
                            B(dVar, dVar.f3824g[solverVariable.f3773d], true);
                        }
                    }
                    this.f3803d.clear();
                } else {
                    z3 = true;
                }
            }
            if (d.f3812t && this.f3800a != null && this.f3804e.c() == 0) {
                this.f3805f = true;
                dVar.f3818a = true;
            }
        }
    }

    public SolverVariable a(d dVar, boolean[] zArr) {
        return w(zArr, (SolverVariable) null);
    }

    public void b(SolverVariable solverVariable) {
        int i4 = solverVariable.f3774e;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f3804e.g(solverVariable, f4);
    }

    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f3800a = null;
            this.f3804e.clear();
            for (int i4 = 0; i4 < bVar.f3804e.c(); i4++) {
                this.f3804e.i(bVar.f3804e.h(i4), bVar.f3804e.a(i4), true);
            }
        }
    }

    public void clear() {
        this.f3804e.clear();
        this.f3800a = null;
        this.f3801b = 0.0f;
    }

    public b d(d dVar, int i4) {
        this.f3804e.g(dVar.o(i4, "ep"), 1.0f);
        this.f3804e.g(dVar.o(i4, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(SolverVariable solverVariable, int i4) {
        this.f3804e.g(solverVariable, (float) i4);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z3;
        SolverVariable g4 = g(dVar);
        if (g4 == null) {
            z3 = true;
        } else {
            x(g4);
            z3 = false;
        }
        if (this.f3804e.c() == 0) {
            this.f3805f = true;
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public SolverVariable g(d dVar) {
        boolean u3;
        boolean u4;
        int c4 = this.f3804e.c();
        SolverVariable solverVariable = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        SolverVariable solverVariable2 = null;
        for (int i4 = 0; i4 < c4; i4++) {
            float a4 = this.f3804e.a(i4);
            SolverVariable h4 = this.f3804e.h(i4);
            if (h4.f3779j == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    u4 = u(h4, dVar);
                } else if (f4 > a4) {
                    u4 = u(h4, dVar);
                } else if (!z3 && u(h4, dVar)) {
                    f4 = a4;
                    solverVariable = h4;
                    z3 = true;
                }
                z3 = u4;
                f4 = a4;
                solverVariable = h4;
            } else if (solverVariable == null && a4 < 0.0f) {
                if (solverVariable2 == null) {
                    u3 = u(h4, dVar);
                } else if (f5 > a4) {
                    u3 = u(h4, dVar);
                } else if (!z4 && u(h4, dVar)) {
                    f5 = a4;
                    solverVariable2 = h4;
                    z4 = true;
                }
                z4 = u3;
                f5 = a4;
                solverVariable2 = h4;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    public SolverVariable getKey() {
        return this.f3800a;
    }

    /* access modifiers changed from: package-private */
    public b h(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, float f4, SolverVariable solverVariable3, SolverVariable solverVariable4, int i5) {
        if (solverVariable2 == solverVariable3) {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable4, 1.0f);
            this.f3804e.g(solverVariable2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
            this.f3804e.g(solverVariable3, -1.0f);
            this.f3804e.g(solverVariable4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                this.f3801b = (float) ((-i4) + i5);
            }
        } else if (f4 <= 0.0f) {
            this.f3804e.g(solverVariable, -1.0f);
            this.f3804e.g(solverVariable2, 1.0f);
            this.f3801b = (float) i4;
        } else if (f4 >= 1.0f) {
            this.f3804e.g(solverVariable4, -1.0f);
            this.f3804e.g(solverVariable3, 1.0f);
            this.f3801b = (float) (-i5);
        } else {
            float f5 = 1.0f - f4;
            this.f3804e.g(solverVariable, f5 * 1.0f);
            this.f3804e.g(solverVariable2, f5 * -1.0f);
            this.f3804e.g(solverVariable3, -1.0f * f4);
            this.f3804e.g(solverVariable4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                this.f3801b = (((float) (-i4)) * f5) + (((float) i5) * f4);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(SolverVariable solverVariable, int i4) {
        this.f3800a = solverVariable;
        float f4 = (float) i4;
        solverVariable.f3775f = f4;
        this.f3801b = f4;
        this.f3805f = true;
        return this;
    }

    public boolean isEmpty() {
        if (this.f3800a == null && this.f3801b == 0.0f && this.f3804e.c() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public b j(SolverVariable solverVariable, SolverVariable solverVariable2, float f4) {
        this.f3804e.g(solverVariable, -1.0f);
        this.f3804e.g(solverVariable2, f4);
        return this;
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f4) {
        this.f3804e.g(solverVariable, -1.0f);
        this.f3804e.g(solverVariable2, 1.0f);
        this.f3804e.g(solverVariable3, f4);
        this.f3804e.g(solverVariable4, -f4);
        return this;
    }

    public b l(float f4, float f5, float f6, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f3801b = 0.0f;
        if (f5 == 0.0f || f4 == f6) {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
            this.f3804e.g(solverVariable4, 1.0f);
            this.f3804e.g(solverVariable3, -1.0f);
        } else if (f4 == 0.0f) {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
        } else if (f6 == 0.0f) {
            this.f3804e.g(solverVariable3, 1.0f);
            this.f3804e.g(solverVariable4, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
            this.f3804e.g(solverVariable4, f7);
            this.f3804e.g(solverVariable3, -f7);
        }
        return this;
    }

    public b m(SolverVariable solverVariable, int i4) {
        if (i4 < 0) {
            this.f3801b = (float) (i4 * -1);
            this.f3804e.g(solverVariable, 1.0f);
        } else {
            this.f3801b = (float) i4;
            this.f3804e.g(solverVariable, -1.0f);
        }
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f3801b = (float) i4;
        }
        if (!z3) {
            this.f3804e.g(solverVariable, -1.0f);
            this.f3804e.g(solverVariable2, 1.0f);
        } else {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
        }
        return this;
    }

    public b o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f3801b = (float) i4;
        }
        if (!z3) {
            this.f3804e.g(solverVariable, -1.0f);
            this.f3804e.g(solverVariable2, 1.0f);
            this.f3804e.g(solverVariable3, 1.0f);
        } else {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
            this.f3804e.g(solverVariable3, -1.0f);
        }
        return this;
    }

    public b p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f3801b = (float) i4;
        }
        if (!z3) {
            this.f3804e.g(solverVariable, -1.0f);
            this.f3804e.g(solverVariable2, 1.0f);
            this.f3804e.g(solverVariable3, -1.0f);
        } else {
            this.f3804e.g(solverVariable, 1.0f);
            this.f3804e.g(solverVariable2, -1.0f);
            this.f3804e.g(solverVariable3, 1.0f);
        }
        return this;
    }

    public b q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f4) {
        this.f3804e.g(solverVariable3, 0.5f);
        this.f3804e.g(solverVariable4, 0.5f);
        this.f3804e.g(solverVariable, -0.5f);
        this.f3804e.g(solverVariable2, -0.5f);
        this.f3801b = -f4;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f4 = this.f3801b;
        if (f4 < 0.0f) {
            this.f3801b = f4 * -1.0f;
            this.f3804e.k();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        SolverVariable solverVariable = this.f3800a;
        if (solverVariable == null || (solverVariable.f3779j != SolverVariable.Type.UNRESTRICTED && this.f3801b < 0.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t(SolverVariable solverVariable) {
        return this.f3804e.e(solverVariable);
    }

    public String toString() {
        return z();
    }

    public SolverVariable v(SolverVariable solverVariable) {
        return w((boolean[]) null, solverVariable);
    }

    /* access modifiers changed from: package-private */
    public void x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f3800a;
        if (solverVariable2 != null) {
            this.f3804e.g(solverVariable2, -1.0f);
            this.f3800a.f3773d = -1;
            this.f3800a = null;
        }
        float b4 = this.f3804e.b(solverVariable, true) * -1.0f;
        this.f3800a = solverVariable;
        if (b4 != 1.0f) {
            this.f3801b /= b4;
            this.f3804e.j(b4);
        }
    }

    public void y() {
        this.f3800a = null;
        this.f3804e.clear();
        this.f3801b = 0.0f;
        this.f3805f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        r7 = r10.f3804e.a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f3800a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f3800a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f3801b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f3801b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            androidx.constraintlayout.core.b$a r5 = r10.f3804e
            int r5 = r5.c()
        L_0x005d:
            if (r3 >= r5) goto L_0x00ec
            androidx.constraintlayout.core.b$a r6 = r10.f3804e
            androidx.constraintlayout.core.SolverVariable r6 = r6.h(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            androidx.constraintlayout.core.b$a r7 = r10.f3804e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0094
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0092:
            float r7 = r7 * r9
            goto L_0x00ba
        L_0x0094:
            if (r8 <= 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0092
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = r4
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f3804e = new a(this, cVar);
    }
}
