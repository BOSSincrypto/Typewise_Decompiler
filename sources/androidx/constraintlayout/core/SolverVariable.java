package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable implements Comparable {

    /* renamed from: v  reason: collision with root package name */
    private static int f3769v = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3770a;

    /* renamed from: b  reason: collision with root package name */
    private String f3771b;

    /* renamed from: c  reason: collision with root package name */
    public int f3772c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f3773d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f3774e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f3775f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3776g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f3777h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f3778i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    Type f3779j;

    /* renamed from: k  reason: collision with root package name */
    b[] f3780k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f3781l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f3782m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f3783n = false;

    /* renamed from: o  reason: collision with root package name */
    int f3784o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f3785p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    HashSet f3786q = null;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.f3779j = type;
    }

    static void c() {
        f3769v++;
    }

    public final void a(b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f3781l;
            if (i4 >= i5) {
                b[] bVarArr = this.f3780k;
                if (i5 >= bVarArr.length) {
                    this.f3780k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3780k;
                int i6 = this.f3781l;
                bVarArr2[i6] = bVar;
                this.f3781l = i6 + 1;
                return;
            } else if (this.f3780k[i4] != bVar) {
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(SolverVariable solverVariable) {
        return this.f3772c - solverVariable.f3772c;
    }

    public final void d(b bVar) {
        int i4 = this.f3781l;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f3780k[i5] == bVar) {
                while (i5 < i4 - 1) {
                    b[] bVarArr = this.f3780k;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f3781l--;
                return;
            }
            i5++;
        }
    }

    public void e() {
        this.f3771b = null;
        this.f3779j = Type.UNKNOWN;
        this.f3774e = 0;
        this.f3772c = -1;
        this.f3773d = -1;
        this.f3775f = 0.0f;
        this.f3776g = false;
        this.f3783n = false;
        this.f3784o = -1;
        this.f3785p = 0.0f;
        int i4 = this.f3781l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3780k[i5] = null;
        }
        this.f3781l = 0;
        this.f3782m = 0;
        this.f3770a = false;
        Arrays.fill(this.f3778i, 0.0f);
    }

    public void f(d dVar, float f4) {
        this.f3775f = f4;
        this.f3776g = true;
        this.f3783n = false;
        this.f3784o = -1;
        this.f3785p = 0.0f;
        int i4 = this.f3781l;
        this.f3773d = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3780k[i5].A(dVar, this, false);
        }
        this.f3781l = 0;
    }

    public void g(Type type, String str) {
        this.f3779j = type;
    }

    public final void h(d dVar, b bVar) {
        int i4 = this.f3781l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f3780k[i5].B(dVar, bVar, false);
        }
        this.f3781l = 0;
    }

    public String toString() {
        if (this.f3771b != null) {
            return "" + this.f3771b;
        }
        return "" + this.f3772c;
    }
}
