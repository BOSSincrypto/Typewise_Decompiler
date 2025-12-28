package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.uuid.Uuid;

public class g extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f3838g = Uuid.SIZE_BITS;

    /* renamed from: h  reason: collision with root package name */
    private SolverVariable[] f3839h = new SolverVariable[Uuid.SIZE_BITS];

    /* renamed from: i  reason: collision with root package name */
    private SolverVariable[] f3840i = new SolverVariable[Uuid.SIZE_BITS];

    /* renamed from: j  reason: collision with root package name */
    private int f3841j = 0;

    /* renamed from: k  reason: collision with root package name */
    b f3842k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    c f3843l;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f3772c - solverVariable2.f3772c;
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        SolverVariable f3845a;

        /* renamed from: b  reason: collision with root package name */
        g f3846b;

        public b(g gVar) {
            this.f3846b = gVar;
        }

        public boolean a(SolverVariable solverVariable, float f4) {
            boolean z3 = true;
            if (this.f3845a.f3770a) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr = this.f3845a.f3778i;
                    float f5 = fArr[i4] + (solverVariable.f3778i[i4] * f4);
                    fArr[i4] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        this.f3845a.f3778i[i4] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    g.this.G(this.f3845a);
                }
                return false;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float f6 = solverVariable.f3778i[i5];
                if (f6 != 0.0f) {
                    float f7 = f6 * f4;
                    if (Math.abs(f7) < 1.0E-4f) {
                        f7 = 0.0f;
                    }
                    this.f3845a.f3778i[i5] = f7;
                } else {
                    this.f3845a.f3778i[i5] = 0.0f;
                }
            }
            return true;
        }

        public void b(SolverVariable solverVariable) {
            this.f3845a = solverVariable;
        }

        public final boolean c() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f3845a.f3778i[i4];
                if (f4 > 0.0f) {
                    return false;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(SolverVariable solverVariable) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f4 = solverVariable.f3778i[i4];
                float f5 = this.f3845a.f3778i[i4];
                if (f5 == f4) {
                    i4--;
                } else if (f5 < f4) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f3845a.f3778i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f3845a != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.f3845a.f3778i[i4] + " ";
                }
            }
            return str + "] " + this.f3845a;
        }
    }

    public g(c cVar) {
        super(cVar);
        this.f3843l = cVar;
    }

    private final void F(SolverVariable solverVariable) {
        int i4;
        int i5 = this.f3841j + 1;
        SolverVariable[] solverVariableArr = this.f3839h;
        if (i5 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f3839h = solverVariableArr2;
            this.f3840i = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f3839h;
        int i6 = this.f3841j;
        solverVariableArr3[i6] = solverVariable;
        int i7 = i6 + 1;
        this.f3841j = i7;
        if (i7 > 1 && solverVariableArr3[i6].f3772c > solverVariable.f3772c) {
            int i8 = 0;
            while (true) {
                i4 = this.f3841j;
                if (i8 >= i4) {
                    break;
                }
                this.f3840i[i8] = this.f3839h[i8];
                i8++;
            }
            Arrays.sort(this.f3840i, 0, i4, new a());
            for (int i9 = 0; i9 < this.f3841j; i9++) {
                this.f3839h[i9] = this.f3840i[i9];
            }
        }
        solverVariable.f3770a = true;
        solverVariable.a(this);
    }

    /* access modifiers changed from: private */
    public final void G(SolverVariable solverVariable) {
        int i4 = 0;
        while (i4 < this.f3841j) {
            if (this.f3839h[i4] == solverVariable) {
                while (true) {
                    int i5 = this.f3841j;
                    if (i4 < i5 - 1) {
                        SolverVariable[] solverVariableArr = this.f3839h;
                        int i6 = i4 + 1;
                        solverVariableArr[i4] = solverVariableArr[i6];
                        i4 = i6;
                    } else {
                        this.f3841j = i5 - 1;
                        solverVariable.f3770a = false;
                        return;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z3) {
        SolverVariable solverVariable = bVar.f3800a;
        if (solverVariable != null) {
            b.a aVar = bVar.f3804e;
            int c4 = aVar.c();
            for (int i4 = 0; i4 < c4; i4++) {
                SolverVariable h4 = aVar.h(i4);
                float a4 = aVar.a(i4);
                this.f3842k.b(h4);
                if (this.f3842k.a(solverVariable, a4)) {
                    F(h4);
                }
                this.f3801b += bVar.f3801b * a4;
            }
            G(solverVariable);
        }
    }

    public SolverVariable a(d dVar, boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f3841j; i5++) {
            SolverVariable solverVariable = this.f3839h[i5];
            if (!zArr[solverVariable.f3772c]) {
                this.f3842k.b(solverVariable);
                if (i4 == -1) {
                    if (!this.f3842k.c()) {
                    }
                } else if (!this.f3842k.d(this.f3839h[i4])) {
                }
                i4 = i5;
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f3839h[i4];
    }

    public void b(SolverVariable solverVariable) {
        this.f3842k.b(solverVariable);
        this.f3842k.e();
        solverVariable.f3778i[solverVariable.f3774e] = 1.0f;
        F(solverVariable);
    }

    public void clear() {
        this.f3841j = 0;
        this.f3801b = 0.0f;
    }

    public boolean isEmpty() {
        if (this.f3841j == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f3801b + ") : ";
        for (int i4 = 0; i4 < this.f3841j; i4++) {
            this.f3842k.b(this.f3839h[i4]);
            str = str + this.f3842k + " ";
        }
        return str;
    }
}
