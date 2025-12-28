package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class c {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4319f = {0, 4, 8};

    /* renamed from: g  reason: collision with root package name */
    private static SparseIntArray f4320g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private static SparseIntArray f4321h = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f4322a = "";

    /* renamed from: b  reason: collision with root package name */
    public int f4323b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f4324c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f4325d = true;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f4326e = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4327a;

        /* renamed from: b  reason: collision with root package name */
        String f4328b;

        /* renamed from: c  reason: collision with root package name */
        public final d f4329c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final C0064c f4330d = new C0064c();

        /* renamed from: e  reason: collision with root package name */
        public final b f4331e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f4332f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap f4333g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        C0063a f4334h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        static class C0063a {

            /* renamed from: a  reason: collision with root package name */
            int[] f4335a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f4336b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f4337c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f4338d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f4339e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f4340f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f4341g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f4342h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f4343i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f4344j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f4345k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f4346l = 0;

            C0063a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i4, float f4) {
                int i5 = this.f4340f;
                int[] iArr = this.f4338d;
                if (i5 >= iArr.length) {
                    this.f4338d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f4339e;
                    this.f4339e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f4338d;
                int i6 = this.f4340f;
                iArr2[i6] = i4;
                float[] fArr2 = this.f4339e;
                this.f4340f = i6 + 1;
                fArr2[i6] = f4;
            }

            /* access modifiers changed from: package-private */
            public void b(int i4, int i5) {
                int i6 = this.f4337c;
                int[] iArr = this.f4335a;
                if (i6 >= iArr.length) {
                    this.f4335a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f4336b;
                    this.f4336b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f4335a;
                int i7 = this.f4337c;
                iArr3[i7] = i4;
                int[] iArr4 = this.f4336b;
                this.f4337c = i7 + 1;
                iArr4[i7] = i5;
            }

            /* access modifiers changed from: package-private */
            public void c(int i4, String str) {
                int i5 = this.f4343i;
                int[] iArr = this.f4341g;
                if (i5 >= iArr.length) {
                    this.f4341g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f4342h;
                    this.f4342h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f4341g;
                int i6 = this.f4343i;
                iArr2[i6] = i4;
                String[] strArr2 = this.f4342h;
                this.f4343i = i6 + 1;
                strArr2[i6] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i4, boolean z3) {
                int i5 = this.f4346l;
                int[] iArr = this.f4344j;
                if (i5 >= iArr.length) {
                    this.f4344j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f4345k;
                    this.f4345k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f4344j;
                int i6 = this.f4346l;
                iArr2[i6] = i4;
                boolean[] zArr2 = this.f4345k;
                this.f4346l = i6 + 1;
                zArr2[i6] = z3;
            }
        }

        /* access modifiers changed from: private */
        public void d(int i4, ConstraintLayout.b bVar) {
            this.f4327a = i4;
            b bVar2 = this.f4331e;
            bVar2.f4392j = bVar.f4244e;
            bVar2.f4394k = bVar.f4246f;
            bVar2.f4396l = bVar.f4248g;
            bVar2.f4398m = bVar.f4250h;
            bVar2.f4400n = bVar.f4252i;
            bVar2.f4402o = bVar.f4254j;
            bVar2.f4404p = bVar.f4256k;
            bVar2.f4406q = bVar.f4258l;
            bVar2.f4408r = bVar.f4260m;
            bVar2.f4409s = bVar.f4262n;
            bVar2.f4410t = bVar.f4264o;
            bVar2.f4411u = bVar.f4272s;
            bVar2.f4412v = bVar.f4274t;
            bVar2.f4413w = bVar.f4276u;
            bVar2.f4414x = bVar.f4278v;
            bVar2.f4415y = bVar.f4216G;
            bVar2.f4416z = bVar.f4217H;
            bVar2.f4348A = bVar.f4218I;
            bVar2.f4349B = bVar.f4266p;
            bVar2.f4350C = bVar.f4268q;
            bVar2.f4351D = bVar.f4270r;
            bVar2.f4352E = bVar.f4233X;
            bVar2.f4353F = bVar.f4234Y;
            bVar2.f4354G = bVar.f4235Z;
            bVar2.f4388h = bVar.f4240c;
            bVar2.f4384f = bVar.f4236a;
            bVar2.f4386g = bVar.f4238b;
            bVar2.f4380d = bVar.width;
            bVar2.f4382e = bVar.height;
            bVar2.f4355H = bVar.leftMargin;
            bVar2.f4356I = bVar.rightMargin;
            bVar2.f4357J = bVar.topMargin;
            bVar2.f4358K = bVar.bottomMargin;
            bVar2.f4361N = bVar.f4213D;
            bVar2.f4369V = bVar.f4222M;
            bVar2.f4370W = bVar.f4221L;
            bVar2.f4372Y = bVar.f4224O;
            bVar2.f4371X = bVar.f4223N;
            bVar2.f4401n0 = bVar.f4237a0;
            bVar2.f4403o0 = bVar.f4239b0;
            bVar2.f4373Z = bVar.f4225P;
            bVar2.f4375a0 = bVar.f4226Q;
            bVar2.f4377b0 = bVar.f4229T;
            bVar2.f4379c0 = bVar.f4230U;
            bVar2.f4381d0 = bVar.f4227R;
            bVar2.f4383e0 = bVar.f4228S;
            bVar2.f4385f0 = bVar.f4231V;
            bVar2.f4387g0 = bVar.f4232W;
            bVar2.f4399m0 = bVar.f4241c0;
            bVar2.f4363P = bVar.f4282x;
            bVar2.f4365R = bVar.f4284z;
            bVar2.f4362O = bVar.f4280w;
            bVar2.f4364Q = bVar.f4283y;
            bVar2.f4367T = bVar.f4210A;
            bVar2.f4366S = bVar.f4211B;
            bVar2.f4368U = bVar.f4212C;
            bVar2.f4407q0 = bVar.f4243d0;
            bVar2.f4359L = bVar.getMarginEnd();
            this.f4331e.f4360M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f4331e;
            bVar.f4244e = bVar2.f4392j;
            bVar.f4246f = bVar2.f4394k;
            bVar.f4248g = bVar2.f4396l;
            bVar.f4250h = bVar2.f4398m;
            bVar.f4252i = bVar2.f4400n;
            bVar.f4254j = bVar2.f4402o;
            bVar.f4256k = bVar2.f4404p;
            bVar.f4258l = bVar2.f4406q;
            bVar.f4260m = bVar2.f4408r;
            bVar.f4262n = bVar2.f4409s;
            bVar.f4264o = bVar2.f4410t;
            bVar.f4272s = bVar2.f4411u;
            bVar.f4274t = bVar2.f4412v;
            bVar.f4276u = bVar2.f4413w;
            bVar.f4278v = bVar2.f4414x;
            bVar.leftMargin = bVar2.f4355H;
            bVar.rightMargin = bVar2.f4356I;
            bVar.topMargin = bVar2.f4357J;
            bVar.bottomMargin = bVar2.f4358K;
            bVar.f4210A = bVar2.f4367T;
            bVar.f4211B = bVar2.f4366S;
            bVar.f4282x = bVar2.f4363P;
            bVar.f4284z = bVar2.f4365R;
            bVar.f4216G = bVar2.f4415y;
            bVar.f4217H = bVar2.f4416z;
            bVar.f4266p = bVar2.f4349B;
            bVar.f4268q = bVar2.f4350C;
            bVar.f4270r = bVar2.f4351D;
            bVar.f4218I = bVar2.f4348A;
            bVar.f4233X = bVar2.f4352E;
            bVar.f4234Y = bVar2.f4353F;
            bVar.f4222M = bVar2.f4369V;
            bVar.f4221L = bVar2.f4370W;
            bVar.f4224O = bVar2.f4372Y;
            bVar.f4223N = bVar2.f4371X;
            bVar.f4237a0 = bVar2.f4401n0;
            bVar.f4239b0 = bVar2.f4403o0;
            bVar.f4225P = bVar2.f4373Z;
            bVar.f4226Q = bVar2.f4375a0;
            bVar.f4229T = bVar2.f4377b0;
            bVar.f4230U = bVar2.f4379c0;
            bVar.f4227R = bVar2.f4381d0;
            bVar.f4228S = bVar2.f4383e0;
            bVar.f4231V = bVar2.f4385f0;
            bVar.f4232W = bVar2.f4387g0;
            bVar.f4235Z = bVar2.f4354G;
            bVar.f4240c = bVar2.f4388h;
            bVar.f4236a = bVar2.f4384f;
            bVar.f4238b = bVar2.f4386g;
            bVar.width = bVar2.f4380d;
            bVar.height = bVar2.f4382e;
            String str = bVar2.f4399m0;
            if (str != null) {
                bVar.f4241c0 = str;
            }
            bVar.f4243d0 = bVar2.f4407q0;
            bVar.setMarginStart(bVar2.f4360M);
            bVar.setMarginEnd(this.f4331e.f4359L);
            bVar.a();
        }

        /* renamed from: c */
        public a clone() {
            a aVar = new a();
            aVar.f4331e.a(this.f4331e);
            aVar.f4330d.a(this.f4330d);
            aVar.f4329c.a(this.f4329c);
            aVar.f4332f.a(this.f4332f);
            aVar.f4327a = this.f4327a;
            aVar.f4334h = this.f4334h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f4347r0;

        /* renamed from: A  reason: collision with root package name */
        public String f4348A = null;

        /* renamed from: B  reason: collision with root package name */
        public int f4349B = -1;

        /* renamed from: C  reason: collision with root package name */
        public int f4350C = 0;

        /* renamed from: D  reason: collision with root package name */
        public float f4351D = 0.0f;

        /* renamed from: E  reason: collision with root package name */
        public int f4352E = -1;

        /* renamed from: F  reason: collision with root package name */
        public int f4353F = -1;

        /* renamed from: G  reason: collision with root package name */
        public int f4354G = -1;

        /* renamed from: H  reason: collision with root package name */
        public int f4355H = 0;

        /* renamed from: I  reason: collision with root package name */
        public int f4356I = 0;

        /* renamed from: J  reason: collision with root package name */
        public int f4357J = 0;

        /* renamed from: K  reason: collision with root package name */
        public int f4358K = 0;

        /* renamed from: L  reason: collision with root package name */
        public int f4359L = 0;

        /* renamed from: M  reason: collision with root package name */
        public int f4360M = 0;

        /* renamed from: N  reason: collision with root package name */
        public int f4361N = 0;

        /* renamed from: O  reason: collision with root package name */
        public int f4362O = Integer.MIN_VALUE;

        /* renamed from: P  reason: collision with root package name */
        public int f4363P = Integer.MIN_VALUE;

        /* renamed from: Q  reason: collision with root package name */
        public int f4364Q = Integer.MIN_VALUE;

        /* renamed from: R  reason: collision with root package name */
        public int f4365R = Integer.MIN_VALUE;

        /* renamed from: S  reason: collision with root package name */
        public int f4366S = Integer.MIN_VALUE;

        /* renamed from: T  reason: collision with root package name */
        public int f4367T = Integer.MIN_VALUE;

        /* renamed from: U  reason: collision with root package name */
        public int f4368U = Integer.MIN_VALUE;

        /* renamed from: V  reason: collision with root package name */
        public float f4369V = -1.0f;

        /* renamed from: W  reason: collision with root package name */
        public float f4370W = -1.0f;

        /* renamed from: X  reason: collision with root package name */
        public int f4371X = 0;

        /* renamed from: Y  reason: collision with root package name */
        public int f4372Y = 0;

        /* renamed from: Z  reason: collision with root package name */
        public int f4373Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4374a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f4375a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4376b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f4377b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4378c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f4379c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4380d;

        /* renamed from: d0  reason: collision with root package name */
        public int f4381d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f4382e;

        /* renamed from: e0  reason: collision with root package name */
        public int f4383e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f4384f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f4385f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f4386g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f4387g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f4388h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f4389h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4390i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f4391i0 = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f4392j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f4393j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f4394k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f4395k0;

        /* renamed from: l  reason: collision with root package name */
        public int f4396l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f4397l0;

        /* renamed from: m  reason: collision with root package name */
        public int f4398m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f4399m0;

        /* renamed from: n  reason: collision with root package name */
        public int f4400n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f4401n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f4402o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f4403o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f4404p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f4405p0 = true;

        /* renamed from: q  reason: collision with root package name */
        public int f4406q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f4407q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f4408r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f4409s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f4410t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f4411u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f4412v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f4413w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f4414x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f4415y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f4416z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4347r0 = sparseIntArray;
            sparseIntArray.append(f.X5, 24);
            f4347r0.append(f.Y5, 25);
            f4347r0.append(f.a6, 28);
            f4347r0.append(f.b6, 29);
            f4347r0.append(f.g6, 35);
            f4347r0.append(f.f6, 34);
            f4347r0.append(f.H5, 4);
            f4347r0.append(f.G5, 3);
            f4347r0.append(f.E5, 1);
            f4347r0.append(f.m6, 6);
            f4347r0.append(f.n6, 7);
            f4347r0.append(f.O5, 17);
            f4347r0.append(f.P5, 18);
            f4347r0.append(f.Q5, 19);
            f4347r0.append(f.A5, 90);
            f4347r0.append(f.m5, 26);
            f4347r0.append(f.c6, 31);
            f4347r0.append(f.d6, 32);
            f4347r0.append(f.N5, 10);
            f4347r0.append(f.M5, 9);
            f4347r0.append(f.q6, 13);
            f4347r0.append(f.t6, 16);
            f4347r0.append(f.r6, 14);
            f4347r0.append(f.o6, 11);
            f4347r0.append(f.s6, 15);
            f4347r0.append(f.p6, 12);
            f4347r0.append(f.j6, 38);
            f4347r0.append(f.V5, 37);
            f4347r0.append(f.U5, 39);
            f4347r0.append(f.i6, 40);
            f4347r0.append(f.T5, 20);
            f4347r0.append(f.h6, 36);
            f4347r0.append(f.L5, 5);
            f4347r0.append(f.W5, 91);
            f4347r0.append(f.e6, 91);
            f4347r0.append(f.Z5, 91);
            f4347r0.append(f.F5, 91);
            f4347r0.append(f.D5, 91);
            f4347r0.append(f.p5, 23);
            f4347r0.append(f.r5, 27);
            f4347r0.append(f.t5, 30);
            f4347r0.append(f.u5, 8);
            f4347r0.append(f.q5, 33);
            f4347r0.append(f.s5, 2);
            f4347r0.append(f.n5, 22);
            f4347r0.append(f.o5, 21);
            f4347r0.append(f.k6, 41);
            f4347r0.append(f.R5, 42);
            f4347r0.append(f.C5, 41);
            f4347r0.append(f.B5, 42);
            f4347r0.append(f.u6, 76);
            f4347r0.append(f.I5, 61);
            f4347r0.append(f.K5, 62);
            f4347r0.append(f.J5, 63);
            f4347r0.append(f.l6, 69);
            f4347r0.append(f.S5, 70);
            f4347r0.append(f.y5, 71);
            f4347r0.append(f.w5, 72);
            f4347r0.append(f.x5, 73);
            f4347r0.append(f.z5, 74);
            f4347r0.append(f.v5, 75);
        }

        public void a(b bVar) {
            this.f4374a = bVar.f4374a;
            this.f4380d = bVar.f4380d;
            this.f4376b = bVar.f4376b;
            this.f4382e = bVar.f4382e;
            this.f4384f = bVar.f4384f;
            this.f4386g = bVar.f4386g;
            this.f4388h = bVar.f4388h;
            this.f4390i = bVar.f4390i;
            this.f4392j = bVar.f4392j;
            this.f4394k = bVar.f4394k;
            this.f4396l = bVar.f4396l;
            this.f4398m = bVar.f4398m;
            this.f4400n = bVar.f4400n;
            this.f4402o = bVar.f4402o;
            this.f4404p = bVar.f4404p;
            this.f4406q = bVar.f4406q;
            this.f4408r = bVar.f4408r;
            this.f4409s = bVar.f4409s;
            this.f4410t = bVar.f4410t;
            this.f4411u = bVar.f4411u;
            this.f4412v = bVar.f4412v;
            this.f4413w = bVar.f4413w;
            this.f4414x = bVar.f4414x;
            this.f4415y = bVar.f4415y;
            this.f4416z = bVar.f4416z;
            this.f4348A = bVar.f4348A;
            this.f4349B = bVar.f4349B;
            this.f4350C = bVar.f4350C;
            this.f4351D = bVar.f4351D;
            this.f4352E = bVar.f4352E;
            this.f4353F = bVar.f4353F;
            this.f4354G = bVar.f4354G;
            this.f4355H = bVar.f4355H;
            this.f4356I = bVar.f4356I;
            this.f4357J = bVar.f4357J;
            this.f4358K = bVar.f4358K;
            this.f4359L = bVar.f4359L;
            this.f4360M = bVar.f4360M;
            this.f4361N = bVar.f4361N;
            this.f4362O = bVar.f4362O;
            this.f4363P = bVar.f4363P;
            this.f4364Q = bVar.f4364Q;
            this.f4365R = bVar.f4365R;
            this.f4366S = bVar.f4366S;
            this.f4367T = bVar.f4367T;
            this.f4368U = bVar.f4368U;
            this.f4369V = bVar.f4369V;
            this.f4370W = bVar.f4370W;
            this.f4371X = bVar.f4371X;
            this.f4372Y = bVar.f4372Y;
            this.f4373Z = bVar.f4373Z;
            this.f4375a0 = bVar.f4375a0;
            this.f4377b0 = bVar.f4377b0;
            this.f4379c0 = bVar.f4379c0;
            this.f4381d0 = bVar.f4381d0;
            this.f4383e0 = bVar.f4383e0;
            this.f4385f0 = bVar.f4385f0;
            this.f4387g0 = bVar.f4387g0;
            this.f4389h0 = bVar.f4389h0;
            this.f4391i0 = bVar.f4391i0;
            this.f4393j0 = bVar.f4393j0;
            this.f4399m0 = bVar.f4399m0;
            int[] iArr = bVar.f4395k0;
            if (iArr == null || bVar.f4397l0 != null) {
                this.f4395k0 = null;
            } else {
                this.f4395k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f4397l0 = bVar.f4397l0;
            this.f4401n0 = bVar.f4401n0;
            this.f4403o0 = bVar.f4403o0;
            this.f4405p0 = bVar.f4405p0;
            this.f4407q0 = bVar.f4407q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.l5);
            this.f4376b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = f4347r0.get(index);
                switch (i5) {
                    case 1:
                        this.f4408r = c.q(obtainStyledAttributes, index, this.f4408r);
                        break;
                    case 2:
                        this.f4358K = obtainStyledAttributes.getDimensionPixelSize(index, this.f4358K);
                        break;
                    case 3:
                        this.f4406q = c.q(obtainStyledAttributes, index, this.f4406q);
                        break;
                    case 4:
                        this.f4404p = c.q(obtainStyledAttributes, index, this.f4404p);
                        break;
                    case 5:
                        this.f4348A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f4352E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4352E);
                        break;
                    case 7:
                        this.f4353F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4353F);
                        break;
                    case 8:
                        this.f4359L = obtainStyledAttributes.getDimensionPixelSize(index, this.f4359L);
                        break;
                    case 9:
                        this.f4414x = c.q(obtainStyledAttributes, index, this.f4414x);
                        break;
                    case 10:
                        this.f4413w = c.q(obtainStyledAttributes, index, this.f4413w);
                        break;
                    case 11:
                        this.f4365R = obtainStyledAttributes.getDimensionPixelSize(index, this.f4365R);
                        break;
                    case 12:
                        this.f4366S = obtainStyledAttributes.getDimensionPixelSize(index, this.f4366S);
                        break;
                    case 13:
                        this.f4362O = obtainStyledAttributes.getDimensionPixelSize(index, this.f4362O);
                        break;
                    case 14:
                        this.f4364Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f4364Q);
                        break;
                    case 15:
                        this.f4367T = obtainStyledAttributes.getDimensionPixelSize(index, this.f4367T);
                        break;
                    case 16:
                        this.f4363P = obtainStyledAttributes.getDimensionPixelSize(index, this.f4363P);
                        break;
                    case 17:
                        this.f4384f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4384f);
                        break;
                    case 18:
                        this.f4386g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4386g);
                        break;
                    case 19:
                        this.f4388h = obtainStyledAttributes.getFloat(index, this.f4388h);
                        break;
                    case 20:
                        this.f4415y = obtainStyledAttributes.getFloat(index, this.f4415y);
                        break;
                    case 21:
                        this.f4382e = obtainStyledAttributes.getLayoutDimension(index, this.f4382e);
                        break;
                    case 22:
                        this.f4380d = obtainStyledAttributes.getLayoutDimension(index, this.f4380d);
                        break;
                    case 23:
                        this.f4355H = obtainStyledAttributes.getDimensionPixelSize(index, this.f4355H);
                        break;
                    case 24:
                        this.f4392j = c.q(obtainStyledAttributes, index, this.f4392j);
                        break;
                    case 25:
                        this.f4394k = c.q(obtainStyledAttributes, index, this.f4394k);
                        break;
                    case 26:
                        this.f4354G = obtainStyledAttributes.getInt(index, this.f4354G);
                        break;
                    case 27:
                        this.f4356I = obtainStyledAttributes.getDimensionPixelSize(index, this.f4356I);
                        break;
                    case 28:
                        this.f4396l = c.q(obtainStyledAttributes, index, this.f4396l);
                        break;
                    case 29:
                        this.f4398m = c.q(obtainStyledAttributes, index, this.f4398m);
                        break;
                    case 30:
                        this.f4360M = obtainStyledAttributes.getDimensionPixelSize(index, this.f4360M);
                        break;
                    case 31:
                        this.f4411u = c.q(obtainStyledAttributes, index, this.f4411u);
                        break;
                    case 32:
                        this.f4412v = c.q(obtainStyledAttributes, index, this.f4412v);
                        break;
                    case 33:
                        this.f4357J = obtainStyledAttributes.getDimensionPixelSize(index, this.f4357J);
                        break;
                    case 34:
                        this.f4402o = c.q(obtainStyledAttributes, index, this.f4402o);
                        break;
                    case 35:
                        this.f4400n = c.q(obtainStyledAttributes, index, this.f4400n);
                        break;
                    case 36:
                        this.f4416z = obtainStyledAttributes.getFloat(index, this.f4416z);
                        break;
                    case 37:
                        this.f4370W = obtainStyledAttributes.getFloat(index, this.f4370W);
                        break;
                    case 38:
                        this.f4369V = obtainStyledAttributes.getFloat(index, this.f4369V);
                        break;
                    case 39:
                        this.f4371X = obtainStyledAttributes.getInt(index, this.f4371X);
                        break;
                    case 40:
                        this.f4372Y = obtainStyledAttributes.getInt(index, this.f4372Y);
                        break;
                    case 41:
                        c.r(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.r(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i5) {
                            case 61:
                                this.f4349B = c.q(obtainStyledAttributes, index, this.f4349B);
                                break;
                            case 62:
                                this.f4350C = obtainStyledAttributes.getDimensionPixelSize(index, this.f4350C);
                                break;
                            case 63:
                                this.f4351D = obtainStyledAttributes.getFloat(index, this.f4351D);
                                break;
                            default:
                                switch (i5) {
                                    case 69:
                                        this.f4385f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f4387g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f4389h0 = obtainStyledAttributes.getInt(index, this.f4389h0);
                                        break;
                                    case 73:
                                        this.f4391i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4391i0);
                                        break;
                                    case 74:
                                        this.f4397l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f4405p0 = obtainStyledAttributes.getBoolean(index, this.f4405p0);
                                        break;
                                    case 76:
                                        this.f4407q0 = obtainStyledAttributes.getInt(index, this.f4407q0);
                                        break;
                                    case 77:
                                        this.f4409s = c.q(obtainStyledAttributes, index, this.f4409s);
                                        break;
                                    case 78:
                                        this.f4410t = c.q(obtainStyledAttributes, index, this.f4410t);
                                        break;
                                    case 79:
                                        this.f4368U = obtainStyledAttributes.getDimensionPixelSize(index, this.f4368U);
                                        break;
                                    case 80:
                                        this.f4361N = obtainStyledAttributes.getDimensionPixelSize(index, this.f4361N);
                                        break;
                                    case 81:
                                        this.f4373Z = obtainStyledAttributes.getInt(index, this.f4373Z);
                                        break;
                                    case 82:
                                        this.f4375a0 = obtainStyledAttributes.getInt(index, this.f4375a0);
                                        break;
                                    case 83:
                                        this.f4379c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4379c0);
                                        break;
                                    case 84:
                                        this.f4377b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4377b0);
                                        break;
                                    case 85:
                                        this.f4383e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4383e0);
                                        break;
                                    case 86:
                                        this.f4381d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f4381d0);
                                        break;
                                    case 87:
                                        this.f4401n0 = obtainStyledAttributes.getBoolean(index, this.f4401n0);
                                        break;
                                    case 88:
                                        this.f4403o0 = obtainStyledAttributes.getBoolean(index, this.f4403o0);
                                        break;
                                    case 89:
                                        this.f4399m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f4390i = obtainStyledAttributes.getBoolean(index, this.f4390i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4347r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4347r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    public static class C0064c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f4417o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4418a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f4419b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f4420c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f4421d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f4422e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f4423f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f4424g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f4425h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f4426i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f4427j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f4428k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f4429l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f4430m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f4431n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4417o = sparseIntArray;
            sparseIntArray.append(f.G6, 1);
            f4417o.append(f.I6, 2);
            f4417o.append(f.M6, 3);
            f4417o.append(f.F6, 4);
            f4417o.append(f.E6, 5);
            f4417o.append(f.D6, 6);
            f4417o.append(f.H6, 7);
            f4417o.append(f.L6, 8);
            f4417o.append(f.K6, 9);
            f4417o.append(f.J6, 10);
        }

        public void a(C0064c cVar) {
            this.f4418a = cVar.f4418a;
            this.f4419b = cVar.f4419b;
            this.f4421d = cVar.f4421d;
            this.f4422e = cVar.f4422e;
            this.f4423f = cVar.f4423f;
            this.f4426i = cVar.f4426i;
            this.f4424g = cVar.f4424g;
            this.f4425h = cVar.f4425h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.C6);
            this.f4418a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f4417o.get(index)) {
                    case 1:
                        this.f4426i = obtainStyledAttributes.getFloat(index, this.f4426i);
                        break;
                    case 2:
                        this.f4422e = obtainStyledAttributes.getInt(index, this.f4422e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f4421d = A.a.f2c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f4421d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f4423f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f4419b = c.q(obtainStyledAttributes, index, this.f4419b);
                        break;
                    case 6:
                        this.f4420c = obtainStyledAttributes.getInteger(index, this.f4420c);
                        break;
                    case 7:
                        this.f4424g = obtainStyledAttributes.getFloat(index, this.f4424g);
                        break;
                    case 8:
                        this.f4428k = obtainStyledAttributes.getInteger(index, this.f4428k);
                        break;
                    case 9:
                        this.f4427j = obtainStyledAttributes.getFloat(index, this.f4427j);
                        break;
                    case 10:
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 != 1) {
                            if (i5 != 3) {
                                this.f4430m = obtainStyledAttributes.getInteger(index, this.f4431n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f4429l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f4430m = -1;
                                    break;
                                } else {
                                    this.f4431n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f4430m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f4431n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f4430m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4432a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f4433b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f4434c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f4435d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f4436e = Float.NaN;

        public void a(d dVar) {
            this.f4432a = dVar.f4432a;
            this.f4433b = dVar.f4433b;
            this.f4435d = dVar.f4435d;
            this.f4436e = dVar.f4436e;
            this.f4434c = dVar.f4434c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.X6);
            this.f4432a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.Z6) {
                    this.f4435d = obtainStyledAttributes.getFloat(index, this.f4435d);
                } else if (index == f.Y6) {
                    this.f4433b = obtainStyledAttributes.getInt(index, this.f4433b);
                    this.f4433b = c.f4319f[this.f4433b];
                } else if (index == f.b7) {
                    this.f4434c = obtainStyledAttributes.getInt(index, this.f4434c);
                } else if (index == f.a7) {
                    this.f4436e = obtainStyledAttributes.getFloat(index, this.f4436e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f4437o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4438a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f4439b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f4440c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f4441d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f4442e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f4443f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f4444g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f4445h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f4446i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f4447j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4448k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f4449l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4450m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f4451n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4437o = sparseIntArray;
            sparseIntArray.append(f.w7, 1);
            f4437o.append(f.x7, 2);
            f4437o.append(f.y7, 3);
            f4437o.append(f.u7, 4);
            f4437o.append(f.v7, 5);
            f4437o.append(f.q7, 6);
            f4437o.append(f.r7, 7);
            f4437o.append(f.s7, 8);
            f4437o.append(f.t7, 9);
            f4437o.append(f.z7, 10);
            f4437o.append(f.A7, 11);
            f4437o.append(f.B7, 12);
        }

        public void a(e eVar) {
            this.f4438a = eVar.f4438a;
            this.f4439b = eVar.f4439b;
            this.f4440c = eVar.f4440c;
            this.f4441d = eVar.f4441d;
            this.f4442e = eVar.f4442e;
            this.f4443f = eVar.f4443f;
            this.f4444g = eVar.f4444g;
            this.f4445h = eVar.f4445h;
            this.f4446i = eVar.f4446i;
            this.f4447j = eVar.f4447j;
            this.f4448k = eVar.f4448k;
            this.f4449l = eVar.f4449l;
            this.f4450m = eVar.f4450m;
            this.f4451n = eVar.f4451n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.p7);
            this.f4438a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f4437o.get(index)) {
                    case 1:
                        this.f4439b = obtainStyledAttributes.getFloat(index, this.f4439b);
                        break;
                    case 2:
                        this.f4440c = obtainStyledAttributes.getFloat(index, this.f4440c);
                        break;
                    case 3:
                        this.f4441d = obtainStyledAttributes.getFloat(index, this.f4441d);
                        break;
                    case 4:
                        this.f4442e = obtainStyledAttributes.getFloat(index, this.f4442e);
                        break;
                    case 5:
                        this.f4443f = obtainStyledAttributes.getFloat(index, this.f4443f);
                        break;
                    case 6:
                        this.f4444g = obtainStyledAttributes.getDimension(index, this.f4444g);
                        break;
                    case 7:
                        this.f4445h = obtainStyledAttributes.getDimension(index, this.f4445h);
                        break;
                    case 8:
                        this.f4447j = obtainStyledAttributes.getDimension(index, this.f4447j);
                        break;
                    case 9:
                        this.f4448k = obtainStyledAttributes.getDimension(index, this.f4448k);
                        break;
                    case 10:
                        this.f4449l = obtainStyledAttributes.getDimension(index, this.f4449l);
                        break;
                    case 11:
                        this.f4450m = true;
                        this.f4451n = obtainStyledAttributes.getDimension(index, this.f4451n);
                        break;
                    case 12:
                        this.f4446i = c.q(obtainStyledAttributes, index, this.f4446i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f4320g.append(f.f4453A0, 25);
        f4320g.append(f.f4457B0, 26);
        f4320g.append(f.f4465D0, 29);
        f4320g.append(f.f4469E0, 30);
        f4320g.append(f.f4493K0, 36);
        f4320g.append(f.f4489J0, 35);
        f4320g.append(f.f4592h0, 4);
        f4320g.append(f.f4587g0, 3);
        f4320g.append(f.f4567c0, 1);
        f4320g.append(f.f4577e0, 91);
        f4320g.append(f.f4572d0, 92);
        f4320g.append(f.f4529T0, 6);
        f4320g.append(f.f4533U0, 7);
        f4320g.append(f.f4627o0, 17);
        f4320g.append(f.f4632p0, 18);
        f4320g.append(f.f4637q0, 19);
        f4320g.append(f.f4548Y, 99);
        f4320g.append(f.f4656u, 27);
        f4320g.append(f.f4473F0, 32);
        f4320g.append(f.f4477G0, 33);
        f4320g.append(f.f4622n0, 10);
        f4320g.append(f.f4617m0, 9);
        f4320g.append(f.f4545X0, 13);
        f4320g.append(f.f4558a1, 16);
        f4320g.append(f.f4549Y0, 14);
        f4320g.append(f.f4537V0, 11);
        f4320g.append(f.f4553Z0, 15);
        f4320g.append(f.f4541W0, 12);
        f4320g.append(f.f4505N0, 40);
        f4320g.append(f.f4673y0, 39);
        f4320g.append(f.f4669x0, 41);
        f4320g.append(f.f4501M0, 42);
        f4320g.append(f.f4665w0, 20);
        f4320g.append(f.f4497L0, 37);
        f4320g.append(f.f4612l0, 5);
        f4320g.append(f.f4677z0, 87);
        f4320g.append(f.f4485I0, 87);
        f4320g.append(f.f4461C0, 87);
        f4320g.append(f.f4582f0, 87);
        f4320g.append(f.f4562b0, 87);
        f4320g.append(f.f4676z, 24);
        f4320g.append(f.f4456B, 28);
        f4320g.append(f.f4504N, 31);
        f4320g.append(f.f4508O, 8);
        f4320g.append(f.f4452A, 34);
        f4320g.append(f.f4460C, 2);
        f4320g.append(f.f4668x, 23);
        f4320g.append(f.f4672y, 21);
        f4320g.append(f.f4509O0, 95);
        f4320g.append(f.f4642r0, 96);
        f4320g.append(f.f4664w, 22);
        f4320g.append(f.f4464D, 43);
        f4320g.append(f.f4516Q, 44);
        f4320g.append(f.f4496L, 45);
        f4320g.append(f.f4500M, 46);
        f4320g.append(f.f4492K, 60);
        f4320g.append(f.f4484I, 47);
        f4320g.append(f.f4488J, 48);
        f4320g.append(f.f4468E, 49);
        f4320g.append(f.f4472F, 50);
        f4320g.append(f.f4476G, 51);
        f4320g.append(f.f4480H, 52);
        f4320g.append(f.f4512P, 53);
        f4320g.append(f.f4513P0, 54);
        f4320g.append(f.f4647s0, 55);
        f4320g.append(f.f4517Q0, 56);
        f4320g.append(f.f4652t0, 57);
        f4320g.append(f.f4521R0, 58);
        f4320g.append(f.f4657u0, 59);
        f4320g.append(f.f4597i0, 61);
        f4320g.append(f.f4607k0, 62);
        f4320g.append(f.f4602j0, 63);
        f4320g.append(f.f4520R, 64);
        f4320g.append(f.f4608k1, 65);
        f4320g.append(f.f4544X, 66);
        f4320g.append(f.f4613l1, 67);
        f4320g.append(f.f4573d1, 79);
        f4320g.append(f.f4660v, 38);
        f4320g.append(f.f4568c1, 68);
        f4320g.append(f.f4525S0, 69);
        f4320g.append(f.f4661v0, 70);
        f4320g.append(f.f4563b1, 97);
        f4320g.append(f.f4536V, 71);
        f4320g.append(f.f4528T, 72);
        f4320g.append(f.f4532U, 73);
        f4320g.append(f.f4540W, 74);
        f4320g.append(f.f4524S, 75);
        f4320g.append(f.f4578e1, 76);
        f4320g.append(f.f4481H0, 77);
        f4320g.append(f.f4618m1, 78);
        f4320g.append(f.f4557a0, 80);
        f4320g.append(f.f4552Z, 81);
        f4320g.append(f.f4583f1, 82);
        f4320g.append(f.f4603j1, 83);
        f4320g.append(f.f4598i1, 84);
        f4320g.append(f.f4593h1, 85);
        f4320g.append(f.f4588g1, 86);
        SparseIntArray sparseIntArray = f4321h;
        int i4 = f.q4;
        sparseIntArray.append(i4, 6);
        f4321h.append(i4, 7);
        f4321h.append(f.f4615l3, 27);
        f4321h.append(f.t4, 13);
        f4321h.append(f.w4, 16);
        f4321h.append(f.u4, 14);
        f4321h.append(f.r4, 11);
        f4321h.append(f.v4, 15);
        f4321h.append(f.s4, 12);
        f4321h.append(f.k4, 40);
        f4321h.append(f.d4, 39);
        f4321h.append(f.c4, 41);
        f4321h.append(f.j4, 42);
        f4321h.append(f.b4, 20);
        f4321h.append(f.i4, 37);
        f4321h.append(f.V3, 5);
        f4321h.append(f.e4, 87);
        f4321h.append(f.h4, 87);
        f4321h.append(f.f4, 87);
        f4321h.append(f.S3, 87);
        f4321h.append(f.R3, 87);
        f4321h.append(f.f4640q3, 24);
        f4321h.append(f.f4650s3, 28);
        f4321h.append(f.E3, 31);
        f4321h.append(f.F3, 8);
        f4321h.append(f.f4645r3, 34);
        f4321h.append(f.f4655t3, 2);
        f4321h.append(f.f4630o3, 23);
        f4321h.append(f.f4635p3, 21);
        f4321h.append(f.l4, 95);
        f4321h.append(f.W3, 96);
        f4321h.append(f.f4625n3, 22);
        f4321h.append(f.u3, 43);
        f4321h.append(f.H3, 44);
        f4321h.append(f.C3, 45);
        f4321h.append(f.D3, 46);
        f4321h.append(f.B3, 60);
        f4321h.append(f.z3, 47);
        f4321h.append(f.A3, 48);
        f4321h.append(f.v3, 49);
        f4321h.append(f.w3, 50);
        f4321h.append(f.x3, 51);
        f4321h.append(f.y3, 52);
        f4321h.append(f.G3, 53);
        f4321h.append(f.m4, 54);
        f4321h.append(f.X3, 55);
        f4321h.append(f.n4, 56);
        f4321h.append(f.Y3, 57);
        f4321h.append(f.o4, 58);
        f4321h.append(f.Z3, 59);
        f4321h.append(f.U3, 62);
        f4321h.append(f.T3, 63);
        f4321h.append(f.I3, 64);
        f4321h.append(f.H4, 65);
        f4321h.append(f.O3, 66);
        f4321h.append(f.I4, 67);
        f4321h.append(f.z4, 79);
        f4321h.append(f.f4620m3, 38);
        f4321h.append(f.A4, 98);
        f4321h.append(f.y4, 68);
        f4321h.append(f.p4, 69);
        f4321h.append(f.a4, 70);
        f4321h.append(f.M3, 71);
        f4321h.append(f.K3, 72);
        f4321h.append(f.L3, 73);
        f4321h.append(f.N3, 74);
        f4321h.append(f.J3, 75);
        f4321h.append(f.B4, 76);
        f4321h.append(f.g4, 77);
        f4321h.append(f.J4, 78);
        f4321h.append(f.Q3, 80);
        f4321h.append(f.P3, 81);
        f4321h.append(f.C4, 82);
        f4321h.append(f.G4, 83);
        f4321h.append(f.F4, 84);
        f4321h.append(f.E4, 85);
        f4321h.append(f.D4, 86);
        f4321h.append(f.x4, 97);
    }

    private int[] j(View view, String str) {
        int i4;
        Object g4;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            try {
                i4 = e.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i4 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g4 = ((ConstraintLayout) view.getParent()).g(0, trim)) != null && (g4 instanceof Integer)) {
                i4 = ((Integer) g4).intValue();
            }
            iArr[i6] = i4;
            i5++;
            i6++;
        }
        if (i6 != split.length) {
            return Arrays.copyOf(iArr, i6);
        }
        return iArr;
    }

    private void l(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8, int i9, int i10) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                n(iArr2[0]).f4331e.f4370W = fArr2[0];
            }
            n(iArr2[0]).f4331e.f4371X = i8;
            h(iArr2[0], i9, i4, i5, -1);
            for (int i11 = 1; i11 < iArr2.length; i11++) {
                int i12 = i11 - 1;
                h(iArr2[i11], i9, iArr2[i12], i10, -1);
                h(iArr2[i12], i10, iArr2[i11], i9, -1);
                if (fArr2 != null) {
                    n(iArr2[i11]).f4331e.f4370W = fArr2[i11];
                }
            }
            h(iArr2[iArr2.length - 1], i10, i6, i7, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    private a m(Context context, AttributeSet attributeSet, boolean z3) {
        int[] iArr;
        a aVar = new a();
        if (z3) {
            iArr = f.f4610k3;
        } else {
            iArr = f.f4651t;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        u(context, aVar, obtainStyledAttributes, z3);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a n(int i4) {
        if (!this.f4326e.containsKey(Integer.valueOf(i4))) {
            this.f4326e.put(Integer.valueOf(i4), new a());
        }
        return (a) this.f4326e.get(Integer.valueOf(i4));
    }

    /* access modifiers changed from: private */
    public static int q(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        if (resourceId == -1) {
            return typedArray.getInt(i4, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void r(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L_0x0071
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L_0x002a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L_0x0026
            r6 = -3
            if (r5 == r6) goto L_0x0020
            if (r5 == r0) goto L_0x0022
            r6 = -1
            if (r5 == r6) goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x002f
        L_0x0022:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L_0x002f
        L_0x0026:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L_0x002f
        L_0x002a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L_0x0022
        L_0x002f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L_0x003c
            r4.width = r2
            r4.f4237a0 = r5
            goto L_0x0070
        L_0x003c:
            r4.height = r2
            r4.f4239b0 = r5
            goto L_0x0070
        L_0x0041:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.b
            if (r6 == 0) goto L_0x0053
            androidx.constraintlayout.widget.c$b r4 = (androidx.constraintlayout.widget.c.b) r4
            if (r7 != 0) goto L_0x004e
            r4.f4380d = r2
            r4.f4401n0 = r5
            goto L_0x0070
        L_0x004e:
            r4.f4382e = r2
            r4.f4403o0 = r5
            goto L_0x0070
        L_0x0053:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.a.C0063a
            if (r6 == 0) goto L_0x0070
            androidx.constraintlayout.widget.c$a$a r4 = (androidx.constraintlayout.widget.c.a.C0063a) r4
            if (r7 != 0) goto L_0x0066
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L_0x0070
        L_0x0066:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r5 = r5.getString(r6)
            s(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.r(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void s(Object obj, String str, int i4) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i4 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            t(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).f4348A = trim2;
                        } else if (obj instanceof a.C0063a) {
                            ((a.C0063a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i4 == 0) {
                                    bVar2.width = 0;
                                    bVar2.f4221L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.f4222M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i4 == 0) {
                                    bVar3.f4380d = 0;
                                    bVar3.f4370W = parseFloat;
                                    return;
                                }
                                bVar3.f4382e = 0;
                                bVar3.f4369V = parseFloat;
                            } else if (obj instanceof a.C0063a) {
                                a.C0063a aVar = (a.C0063a) obj;
                                if (i4 == 0) {
                                    aVar.b(23, 0);
                                    aVar.a(39, parseFloat);
                                    return;
                                }
                                aVar.b(21, 0);
                                aVar.a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i4 == 0) {
                                bVar4.width = 0;
                                bVar4.f4231V = max;
                                bVar4.f4225P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.f4232W = max;
                            bVar4.f4226Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i4 == 0) {
                                bVar5.f4380d = 0;
                                bVar5.f4385f0 = max;
                                bVar5.f4373Z = 2;
                                return;
                            }
                            bVar5.f4382e = 0;
                            bVar5.f4387g0 = max;
                            bVar5.f4375a0 = 2;
                        } else if (obj instanceof a.C0063a) {
                            a.C0063a aVar2 = (a.C0063a) obj;
                            if (i4 == 0) {
                                aVar2.b(23, 0);
                                aVar2.b(54, 2);
                                return;
                            }
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            }
        }
    }

    static void t(ConstraintLayout.b bVar, String str) {
        float f4 = Float.NaN;
        int i4 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i5 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i4 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i4 = 1;
                }
                i5 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i5);
                if (substring2.length() > 0) {
                    f4 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i5, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f4 = i4 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.f4218I = str;
        bVar.f4219J = f4;
        bVar.f4220K = i4;
    }

    private void u(Context context, a aVar, TypedArray typedArray, boolean z3) {
        if (z3) {
            v(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (!(index == f.f4660v || f.f4504N == index || f.f4508O == index)) {
                aVar.f4330d.f4418a = true;
                aVar.f4331e.f4376b = true;
                aVar.f4329c.f4432a = true;
                aVar.f4332f.f4438a = true;
            }
            switch (f4320g.get(index)) {
                case 1:
                    b bVar = aVar.f4331e;
                    bVar.f4408r = q(typedArray, index, bVar.f4408r);
                    break;
                case 2:
                    b bVar2 = aVar.f4331e;
                    bVar2.f4358K = typedArray.getDimensionPixelSize(index, bVar2.f4358K);
                    break;
                case 3:
                    b bVar3 = aVar.f4331e;
                    bVar3.f4406q = q(typedArray, index, bVar3.f4406q);
                    break;
                case 4:
                    b bVar4 = aVar.f4331e;
                    bVar4.f4404p = q(typedArray, index, bVar4.f4404p);
                    break;
                case 5:
                    aVar.f4331e.f4348A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f4331e;
                    bVar5.f4352E = typedArray.getDimensionPixelOffset(index, bVar5.f4352E);
                    break;
                case 7:
                    b bVar6 = aVar.f4331e;
                    bVar6.f4353F = typedArray.getDimensionPixelOffset(index, bVar6.f4353F);
                    break;
                case 8:
                    b bVar7 = aVar.f4331e;
                    bVar7.f4359L = typedArray.getDimensionPixelSize(index, bVar7.f4359L);
                    break;
                case 9:
                    b bVar8 = aVar.f4331e;
                    bVar8.f4414x = q(typedArray, index, bVar8.f4414x);
                    break;
                case 10:
                    b bVar9 = aVar.f4331e;
                    bVar9.f4413w = q(typedArray, index, bVar9.f4413w);
                    break;
                case 11:
                    b bVar10 = aVar.f4331e;
                    bVar10.f4365R = typedArray.getDimensionPixelSize(index, bVar10.f4365R);
                    break;
                case 12:
                    b bVar11 = aVar.f4331e;
                    bVar11.f4366S = typedArray.getDimensionPixelSize(index, bVar11.f4366S);
                    break;
                case 13:
                    b bVar12 = aVar.f4331e;
                    bVar12.f4362O = typedArray.getDimensionPixelSize(index, bVar12.f4362O);
                    break;
                case 14:
                    b bVar13 = aVar.f4331e;
                    bVar13.f4364Q = typedArray.getDimensionPixelSize(index, bVar13.f4364Q);
                    break;
                case 15:
                    b bVar14 = aVar.f4331e;
                    bVar14.f4367T = typedArray.getDimensionPixelSize(index, bVar14.f4367T);
                    break;
                case 16:
                    b bVar15 = aVar.f4331e;
                    bVar15.f4363P = typedArray.getDimensionPixelSize(index, bVar15.f4363P);
                    break;
                case 17:
                    b bVar16 = aVar.f4331e;
                    bVar16.f4384f = typedArray.getDimensionPixelOffset(index, bVar16.f4384f);
                    break;
                case 18:
                    b bVar17 = aVar.f4331e;
                    bVar17.f4386g = typedArray.getDimensionPixelOffset(index, bVar17.f4386g);
                    break;
                case 19:
                    b bVar18 = aVar.f4331e;
                    bVar18.f4388h = typedArray.getFloat(index, bVar18.f4388h);
                    break;
                case 20:
                    b bVar19 = aVar.f4331e;
                    bVar19.f4415y = typedArray.getFloat(index, bVar19.f4415y);
                    break;
                case 21:
                    b bVar20 = aVar.f4331e;
                    bVar20.f4382e = typedArray.getLayoutDimension(index, bVar20.f4382e);
                    break;
                case 22:
                    d dVar = aVar.f4329c;
                    dVar.f4433b = typedArray.getInt(index, dVar.f4433b);
                    d dVar2 = aVar.f4329c;
                    dVar2.f4433b = f4319f[dVar2.f4433b];
                    break;
                case 23:
                    b bVar21 = aVar.f4331e;
                    bVar21.f4380d = typedArray.getLayoutDimension(index, bVar21.f4380d);
                    break;
                case 24:
                    b bVar22 = aVar.f4331e;
                    bVar22.f4355H = typedArray.getDimensionPixelSize(index, bVar22.f4355H);
                    break;
                case 25:
                    b bVar23 = aVar.f4331e;
                    bVar23.f4392j = q(typedArray, index, bVar23.f4392j);
                    break;
                case 26:
                    b bVar24 = aVar.f4331e;
                    bVar24.f4394k = q(typedArray, index, bVar24.f4394k);
                    break;
                case 27:
                    b bVar25 = aVar.f4331e;
                    bVar25.f4354G = typedArray.getInt(index, bVar25.f4354G);
                    break;
                case 28:
                    b bVar26 = aVar.f4331e;
                    bVar26.f4356I = typedArray.getDimensionPixelSize(index, bVar26.f4356I);
                    break;
                case 29:
                    b bVar27 = aVar.f4331e;
                    bVar27.f4396l = q(typedArray, index, bVar27.f4396l);
                    break;
                case 30:
                    b bVar28 = aVar.f4331e;
                    bVar28.f4398m = q(typedArray, index, bVar28.f4398m);
                    break;
                case 31:
                    b bVar29 = aVar.f4331e;
                    bVar29.f4360M = typedArray.getDimensionPixelSize(index, bVar29.f4360M);
                    break;
                case 32:
                    b bVar30 = aVar.f4331e;
                    bVar30.f4411u = q(typedArray, index, bVar30.f4411u);
                    break;
                case 33:
                    b bVar31 = aVar.f4331e;
                    bVar31.f4412v = q(typedArray, index, bVar31.f4412v);
                    break;
                case 34:
                    b bVar32 = aVar.f4331e;
                    bVar32.f4357J = typedArray.getDimensionPixelSize(index, bVar32.f4357J);
                    break;
                case 35:
                    b bVar33 = aVar.f4331e;
                    bVar33.f4402o = q(typedArray, index, bVar33.f4402o);
                    break;
                case 36:
                    b bVar34 = aVar.f4331e;
                    bVar34.f4400n = q(typedArray, index, bVar34.f4400n);
                    break;
                case 37:
                    b bVar35 = aVar.f4331e;
                    bVar35.f4416z = typedArray.getFloat(index, bVar35.f4416z);
                    break;
                case 38:
                    aVar.f4327a = typedArray.getResourceId(index, aVar.f4327a);
                    break;
                case 39:
                    b bVar36 = aVar.f4331e;
                    bVar36.f4370W = typedArray.getFloat(index, bVar36.f4370W);
                    break;
                case 40:
                    b bVar37 = aVar.f4331e;
                    bVar37.f4369V = typedArray.getFloat(index, bVar37.f4369V);
                    break;
                case 41:
                    b bVar38 = aVar.f4331e;
                    bVar38.f4371X = typedArray.getInt(index, bVar38.f4371X);
                    break;
                case 42:
                    b bVar39 = aVar.f4331e;
                    bVar39.f4372Y = typedArray.getInt(index, bVar39.f4372Y);
                    break;
                case 43:
                    d dVar3 = aVar.f4329c;
                    dVar3.f4435d = typedArray.getFloat(index, dVar3.f4435d);
                    break;
                case 44:
                    e eVar = aVar.f4332f;
                    eVar.f4450m = true;
                    eVar.f4451n = typedArray.getDimension(index, eVar.f4451n);
                    break;
                case 45:
                    e eVar2 = aVar.f4332f;
                    eVar2.f4440c = typedArray.getFloat(index, eVar2.f4440c);
                    break;
                case 46:
                    e eVar3 = aVar.f4332f;
                    eVar3.f4441d = typedArray.getFloat(index, eVar3.f4441d);
                    break;
                case 47:
                    e eVar4 = aVar.f4332f;
                    eVar4.f4442e = typedArray.getFloat(index, eVar4.f4442e);
                    break;
                case 48:
                    e eVar5 = aVar.f4332f;
                    eVar5.f4443f = typedArray.getFloat(index, eVar5.f4443f);
                    break;
                case 49:
                    e eVar6 = aVar.f4332f;
                    eVar6.f4444g = typedArray.getDimension(index, eVar6.f4444g);
                    break;
                case 50:
                    e eVar7 = aVar.f4332f;
                    eVar7.f4445h = typedArray.getDimension(index, eVar7.f4445h);
                    break;
                case 51:
                    e eVar8 = aVar.f4332f;
                    eVar8.f4447j = typedArray.getDimension(index, eVar8.f4447j);
                    break;
                case 52:
                    e eVar9 = aVar.f4332f;
                    eVar9.f4448k = typedArray.getDimension(index, eVar9.f4448k);
                    break;
                case 53:
                    e eVar10 = aVar.f4332f;
                    eVar10.f4449l = typedArray.getDimension(index, eVar10.f4449l);
                    break;
                case 54:
                    b bVar40 = aVar.f4331e;
                    bVar40.f4373Z = typedArray.getInt(index, bVar40.f4373Z);
                    break;
                case 55:
                    b bVar41 = aVar.f4331e;
                    bVar41.f4375a0 = typedArray.getInt(index, bVar41.f4375a0);
                    break;
                case 56:
                    b bVar42 = aVar.f4331e;
                    bVar42.f4377b0 = typedArray.getDimensionPixelSize(index, bVar42.f4377b0);
                    break;
                case 57:
                    b bVar43 = aVar.f4331e;
                    bVar43.f4379c0 = typedArray.getDimensionPixelSize(index, bVar43.f4379c0);
                    break;
                case 58:
                    b bVar44 = aVar.f4331e;
                    bVar44.f4381d0 = typedArray.getDimensionPixelSize(index, bVar44.f4381d0);
                    break;
                case 59:
                    b bVar45 = aVar.f4331e;
                    bVar45.f4383e0 = typedArray.getDimensionPixelSize(index, bVar45.f4383e0);
                    break;
                case 60:
                    e eVar11 = aVar.f4332f;
                    eVar11.f4439b = typedArray.getFloat(index, eVar11.f4439b);
                    break;
                case 61:
                    b bVar46 = aVar.f4331e;
                    bVar46.f4349B = q(typedArray, index, bVar46.f4349B);
                    break;
                case 62:
                    b bVar47 = aVar.f4331e;
                    bVar47.f4350C = typedArray.getDimensionPixelSize(index, bVar47.f4350C);
                    break;
                case 63:
                    b bVar48 = aVar.f4331e;
                    bVar48.f4351D = typedArray.getFloat(index, bVar48.f4351D);
                    break;
                case 64:
                    C0064c cVar = aVar.f4330d;
                    cVar.f4419b = q(typedArray, index, cVar.f4419b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f4330d.f4421d = A.a.f2c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f4330d.f4421d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f4330d.f4423f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0064c cVar2 = aVar.f4330d;
                    cVar2.f4426i = typedArray.getFloat(index, cVar2.f4426i);
                    break;
                case 68:
                    d dVar4 = aVar.f4329c;
                    dVar4.f4436e = typedArray.getFloat(index, dVar4.f4436e);
                    break;
                case 69:
                    aVar.f4331e.f4385f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f4331e.f4387g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f4331e;
                    bVar49.f4389h0 = typedArray.getInt(index, bVar49.f4389h0);
                    break;
                case 73:
                    b bVar50 = aVar.f4331e;
                    bVar50.f4391i0 = typedArray.getDimensionPixelSize(index, bVar50.f4391i0);
                    break;
                case 74:
                    aVar.f4331e.f4397l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f4331e;
                    bVar51.f4405p0 = typedArray.getBoolean(index, bVar51.f4405p0);
                    break;
                case 76:
                    C0064c cVar3 = aVar.f4330d;
                    cVar3.f4422e = typedArray.getInt(index, cVar3.f4422e);
                    break;
                case 77:
                    aVar.f4331e.f4399m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f4329c;
                    dVar5.f4434c = typedArray.getInt(index, dVar5.f4434c);
                    break;
                case 79:
                    C0064c cVar4 = aVar.f4330d;
                    cVar4.f4424g = typedArray.getFloat(index, cVar4.f4424g);
                    break;
                case 80:
                    b bVar52 = aVar.f4331e;
                    bVar52.f4401n0 = typedArray.getBoolean(index, bVar52.f4401n0);
                    break;
                case 81:
                    b bVar53 = aVar.f4331e;
                    bVar53.f4403o0 = typedArray.getBoolean(index, bVar53.f4403o0);
                    break;
                case 82:
                    C0064c cVar5 = aVar.f4330d;
                    cVar5.f4420c = typedArray.getInteger(index, cVar5.f4420c);
                    break;
                case 83:
                    e eVar12 = aVar.f4332f;
                    eVar12.f4446i = q(typedArray, index, eVar12.f4446i);
                    break;
                case 84:
                    C0064c cVar6 = aVar.f4330d;
                    cVar6.f4428k = typedArray.getInteger(index, cVar6.f4428k);
                    break;
                case 85:
                    C0064c cVar7 = aVar.f4330d;
                    cVar7.f4427j = typedArray.getFloat(index, cVar7.f4427j);
                    break;
                case 86:
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 != 1) {
                        if (i5 != 3) {
                            C0064c cVar8 = aVar.f4330d;
                            cVar8.f4430m = typedArray.getInteger(index, cVar8.f4431n);
                            break;
                        } else {
                            aVar.f4330d.f4429l = typedArray.getString(index);
                            if (aVar.f4330d.f4429l.indexOf("/") <= 0) {
                                aVar.f4330d.f4430m = -1;
                                break;
                            } else {
                                aVar.f4330d.f4431n = typedArray.getResourceId(index, -1);
                                aVar.f4330d.f4430m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f4330d.f4431n = typedArray.getResourceId(index, -1);
                        C0064c cVar9 = aVar.f4330d;
                        if (cVar9.f4431n == -1) {
                            break;
                        } else {
                            cVar9.f4430m = -2;
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4320g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f4331e;
                    bVar54.f4409s = q(typedArray, index, bVar54.f4409s);
                    break;
                case 92:
                    b bVar55 = aVar.f4331e;
                    bVar55.f4410t = q(typedArray, index, bVar55.f4410t);
                    break;
                case 93:
                    b bVar56 = aVar.f4331e;
                    bVar56.f4361N = typedArray.getDimensionPixelSize(index, bVar56.f4361N);
                    break;
                case 94:
                    b bVar57 = aVar.f4331e;
                    bVar57.f4368U = typedArray.getDimensionPixelSize(index, bVar57.f4368U);
                    break;
                case 95:
                    r(aVar.f4331e, typedArray, index, 0);
                    break;
                case 96:
                    r(aVar.f4331e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f4331e;
                    bVar58.f4407q0 = typedArray.getInt(index, bVar58.f4407q0);
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4320g.get(index));
                    break;
            }
        }
        b bVar59 = aVar.f4331e;
        if (bVar59.f4397l0 != null) {
            bVar59.f4395k0 = null;
        }
    }

    private static void v(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0063a aVar2 = new a.C0063a();
        aVar.f4334h = aVar2;
        aVar.f4330d.f4418a = false;
        aVar.f4331e.f4376b = false;
        aVar.f4329c.f4432a = false;
        aVar.f4332f.f4438a = false;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            switch (f4321h.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4358K));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f4331e.f4352E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f4331e.f4353F));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4359L));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4365R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4366S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4362O));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4364Q));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4367T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4363P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f4331e.f4384f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f4331e.f4386g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f4331e.f4388h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f4331e.f4415y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f4331e.f4382e));
                    break;
                case 22:
                    aVar2.b(22, f4319f[typedArray.getInt(index, aVar.f4329c.f4433b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f4331e.f4380d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4355H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f4331e.f4354G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4356I));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4360M));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4357J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f4331e.f4416z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f4327a);
                    aVar.f4327a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f4331e.f4370W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f4331e.f4369V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f4331e.f4371X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f4331e.f4372Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f4329c.f4435d));
                    break;
                case 44:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f4332f.f4451n));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f4332f.f4440c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f4332f.f4441d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f4332f.f4442e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f4332f.f4443f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f4332f.f4444g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f4332f.f4445h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f4332f.f4447j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f4332f.f4448k));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f4332f.f4449l));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f4331e.f4373Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f4331e.f4375a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4377b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4379c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4381d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4383e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f4332f.f4439b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4350C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f4331e.f4351D));
                    break;
                case 64:
                    aVar2.b(64, q(typedArray, index, aVar.f4330d.f4419b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, A.a.f2c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f4330d.f4426i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f4329c.f4436e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f4331e.f4389h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4391i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f4331e.f4405p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f4330d.f4422e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f4329c.f4434c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f4330d.f4424g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f4331e.f4401n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f4331e.f4403o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f4330d.f4420c));
                    break;
                case 83:
                    aVar2.b(83, q(typedArray, index, aVar.f4332f.f4446i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f4330d.f4428k));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f4330d.f4427j));
                    break;
                case 86:
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 != 1) {
                        if (i5 != 3) {
                            C0064c cVar = aVar.f4330d;
                            cVar.f4430m = typedArray.getInteger(index, cVar.f4431n);
                            aVar2.b(88, aVar.f4330d.f4430m);
                            break;
                        } else {
                            aVar.f4330d.f4429l = typedArray.getString(index);
                            aVar2.c(90, aVar.f4330d.f4429l);
                            if (aVar.f4330d.f4429l.indexOf("/") <= 0) {
                                aVar.f4330d.f4430m = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f4330d.f4431n = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f4330d.f4431n);
                                aVar.f4330d.f4430m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f4330d.f4431n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f4330d.f4431n);
                        C0064c cVar2 = aVar.f4330d;
                        if (cVar2.f4431n == -1) {
                            break;
                        } else {
                            cVar2.f4430m = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f4320g.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4361N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f4331e.f4368U));
                    break;
                case 95:
                    r(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    r(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f4331e.f4407q0));
                    break;
                case 98:
                    if (!E.b.f374y) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f4327a = typedArray.getResourceId(index, aVar.f4327a);
                            break;
                        } else {
                            aVar.f4328b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f4327a);
                        aVar.f4327a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f4328b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f4331e.f4390i));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f4320g.get(index));
                    break;
            }
        }
    }

    private String w(int i4) {
        switch (i4) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z3) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f4326e.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f4326e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + E.a.a(childAt));
            } else if (this.f4325d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f4326e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) this.f4326e.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f4331e.f4393j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f4331e.f4389h0);
                            barrier.setMargin(aVar.f4331e.f4391i0);
                            barrier.setAllowsGoneWidget(aVar.f4331e.f4405p0);
                            b bVar = aVar.f4331e;
                            int[] iArr = bVar.f4395k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f4397l0;
                                if (str != null) {
                                    bVar.f4395k0 = j(barrier, str);
                                    barrier.setReferencedIds(aVar.f4331e.f4395k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z3) {
                            ConstraintAttribute.c(childAt, aVar.f4333g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f4329c;
                        if (dVar.f4434c == 0) {
                            childAt.setVisibility(dVar.f4433b);
                        }
                        childAt.setAlpha(aVar.f4329c.f4435d);
                        childAt.setRotation(aVar.f4332f.f4439b);
                        childAt.setRotationX(aVar.f4332f.f4440c);
                        childAt.setRotationY(aVar.f4332f.f4441d);
                        childAt.setScaleX(aVar.f4332f.f4442e);
                        childAt.setScaleY(aVar.f4332f.f4443f);
                        e eVar = aVar.f4332f;
                        if (eVar.f4446i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f4332f.f4446i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f4444g)) {
                                childAt.setPivotX(aVar.f4332f.f4444g);
                            }
                            if (!Float.isNaN(aVar.f4332f.f4445h)) {
                                childAt.setPivotY(aVar.f4332f.f4445h);
                            }
                        }
                        childAt.setTranslationX(aVar.f4332f.f4447j);
                        childAt.setTranslationY(aVar.f4332f.f4448k);
                        childAt.setTranslationZ(aVar.f4332f.f4449l);
                        e eVar2 = aVar.f4332f;
                        if (eVar2.f4450m) {
                            childAt.setElevation(eVar2.f4451n);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("WARNING NO CONSTRAINTS for view ");
                    sb.append(id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f4326e.get(num);
            if (aVar2 != null) {
                if (aVar2.f4331e.f4393j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f4331e;
                    int[] iArr2 = bVar3.f4395k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f4397l0;
                        if (str2 != null) {
                            bVar3.f4395k0 = j(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f4331e.f4395k0);
                        }
                    }
                    barrier2.setType(aVar2.f4331e.f4389h0);
                    barrier2.setMargin(aVar2.f4331e.f4391i0);
                    ConstraintLayout.b e4 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar2.b(e4);
                    constraintLayout.addView(barrier2, e4);
                }
                if (aVar2.f4331e.f4374a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b e5 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(e5);
                    constraintLayout.addView(guideline, e5);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof a) {
                ((a) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i4) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i4, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f4326e.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f4325d || id != -1) {
                if (!this.f4326e.containsKey(Integer.valueOf(id))) {
                    this.f4326e.put(Integer.valueOf(id), new a());
                }
                a aVar = (a) this.f4326e.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f4333g = ConstraintAttribute.a(this.f4324c, childAt);
                    aVar.d(id, bVar);
                    aVar.f4329c.f4433b = childAt.getVisibility();
                    aVar.f4329c.f4435d = childAt.getAlpha();
                    aVar.f4332f.f4439b = childAt.getRotation();
                    aVar.f4332f.f4440c = childAt.getRotationX();
                    aVar.f4332f.f4441d = childAt.getRotationY();
                    aVar.f4332f.f4442e = childAt.getScaleX();
                    aVar.f4332f.f4443f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar.f4332f;
                        eVar.f4444g = pivotX;
                        eVar.f4445h = pivotY;
                    }
                    aVar.f4332f.f4447j = childAt.getTranslationX();
                    aVar.f4332f.f4448k = childAt.getTranslationY();
                    aVar.f4332f.f4449l = childAt.getTranslationZ();
                    e eVar2 = aVar.f4332f;
                    if (eVar2.f4450m) {
                        eVar2.f4451n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f4331e.f4405p0 = barrier.getAllowsGoneWidget();
                        aVar.f4331e.f4395k0 = barrier.getReferencedIds();
                        aVar.f4331e.f4389h0 = barrier.getType();
                        aVar.f4331e.f4391i0 = barrier.getMargin();
                    }
                }
                i4++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void g(int i4, int i5, int i6, int i7) {
        if (!this.f4326e.containsKey(Integer.valueOf(i4))) {
            this.f4326e.put(Integer.valueOf(i4), new a());
        }
        a aVar = (a) this.f4326e.get(Integer.valueOf(i4));
        if (aVar != null) {
            switch (i5) {
                case 1:
                    if (i7 == 1) {
                        b bVar = aVar.f4331e;
                        bVar.f4392j = i6;
                        bVar.f4394k = -1;
                        return;
                    } else if (i7 == 2) {
                        b bVar2 = aVar.f4331e;
                        bVar2.f4394k = i6;
                        bVar2.f4392j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + w(i7) + " undefined");
                    }
                case 2:
                    if (i7 == 1) {
                        b bVar3 = aVar.f4331e;
                        bVar3.f4396l = i6;
                        bVar3.f4398m = -1;
                        return;
                    } else if (i7 == 2) {
                        b bVar4 = aVar.f4331e;
                        bVar4.f4398m = i6;
                        bVar4.f4396l = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                case 3:
                    if (i7 == 3) {
                        b bVar5 = aVar.f4331e;
                        bVar5.f4400n = i6;
                        bVar5.f4402o = -1;
                        bVar5.f4408r = -1;
                        bVar5.f4409s = -1;
                        bVar5.f4410t = -1;
                        return;
                    } else if (i7 == 4) {
                        b bVar6 = aVar.f4331e;
                        bVar6.f4402o = i6;
                        bVar6.f4400n = -1;
                        bVar6.f4408r = -1;
                        bVar6.f4409s = -1;
                        bVar6.f4410t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                case 4:
                    if (i7 == 4) {
                        b bVar7 = aVar.f4331e;
                        bVar7.f4406q = i6;
                        bVar7.f4404p = -1;
                        bVar7.f4408r = -1;
                        bVar7.f4409s = -1;
                        bVar7.f4410t = -1;
                        return;
                    } else if (i7 == 3) {
                        b bVar8 = aVar.f4331e;
                        bVar8.f4404p = i6;
                        bVar8.f4406q = -1;
                        bVar8.f4408r = -1;
                        bVar8.f4409s = -1;
                        bVar8.f4410t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                case 5:
                    if (i7 == 5) {
                        b bVar9 = aVar.f4331e;
                        bVar9.f4408r = i6;
                        bVar9.f4406q = -1;
                        bVar9.f4404p = -1;
                        bVar9.f4400n = -1;
                        bVar9.f4402o = -1;
                        return;
                    } else if (i7 == 3) {
                        b bVar10 = aVar.f4331e;
                        bVar10.f4409s = i6;
                        bVar10.f4406q = -1;
                        bVar10.f4404p = -1;
                        bVar10.f4400n = -1;
                        bVar10.f4402o = -1;
                        return;
                    } else if (i7 == 4) {
                        b bVar11 = aVar.f4331e;
                        bVar11.f4410t = i6;
                        bVar11.f4406q = -1;
                        bVar11.f4404p = -1;
                        bVar11.f4400n = -1;
                        bVar11.f4402o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                case 6:
                    if (i7 == 6) {
                        b bVar12 = aVar.f4331e;
                        bVar12.f4412v = i6;
                        bVar12.f4411u = -1;
                        return;
                    } else if (i7 == 7) {
                        b bVar13 = aVar.f4331e;
                        bVar13.f4411u = i6;
                        bVar13.f4412v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                case 7:
                    if (i7 == 7) {
                        b bVar14 = aVar.f4331e;
                        bVar14.f4414x = i6;
                        bVar14.f4413w = -1;
                        return;
                    } else if (i7 == 6) {
                        b bVar15 = aVar.f4331e;
                        bVar15.f4413w = i6;
                        bVar15.f4414x = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(w(i5) + " to " + w(i7) + " unknown");
            }
        }
    }

    public void h(int i4, int i5, int i6, int i7, int i8) {
        if (!this.f4326e.containsKey(Integer.valueOf(i4))) {
            this.f4326e.put(Integer.valueOf(i4), new a());
        }
        a aVar = (a) this.f4326e.get(Integer.valueOf(i4));
        if (aVar != null) {
            switch (i5) {
                case 1:
                    if (i7 == 1) {
                        b bVar = aVar.f4331e;
                        bVar.f4392j = i6;
                        bVar.f4394k = -1;
                    } else if (i7 == 2) {
                        b bVar2 = aVar.f4331e;
                        bVar2.f4394k = i6;
                        bVar2.f4392j = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + w(i7) + " undefined");
                    }
                    aVar.f4331e.f4355H = i8;
                    return;
                case 2:
                    if (i7 == 1) {
                        b bVar3 = aVar.f4331e;
                        bVar3.f4396l = i6;
                        bVar3.f4398m = -1;
                    } else if (i7 == 2) {
                        b bVar4 = aVar.f4331e;
                        bVar4.f4398m = i6;
                        bVar4.f4396l = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                    aVar.f4331e.f4356I = i8;
                    return;
                case 3:
                    if (i7 == 3) {
                        b bVar5 = aVar.f4331e;
                        bVar5.f4400n = i6;
                        bVar5.f4402o = -1;
                        bVar5.f4408r = -1;
                        bVar5.f4409s = -1;
                        bVar5.f4410t = -1;
                    } else if (i7 == 4) {
                        b bVar6 = aVar.f4331e;
                        bVar6.f4402o = i6;
                        bVar6.f4400n = -1;
                        bVar6.f4408r = -1;
                        bVar6.f4409s = -1;
                        bVar6.f4410t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                    aVar.f4331e.f4357J = i8;
                    return;
                case 4:
                    if (i7 == 4) {
                        b bVar7 = aVar.f4331e;
                        bVar7.f4406q = i6;
                        bVar7.f4404p = -1;
                        bVar7.f4408r = -1;
                        bVar7.f4409s = -1;
                        bVar7.f4410t = -1;
                    } else if (i7 == 3) {
                        b bVar8 = aVar.f4331e;
                        bVar8.f4404p = i6;
                        bVar8.f4406q = -1;
                        bVar8.f4408r = -1;
                        bVar8.f4409s = -1;
                        bVar8.f4410t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                    aVar.f4331e.f4358K = i8;
                    return;
                case 5:
                    if (i7 == 5) {
                        b bVar9 = aVar.f4331e;
                        bVar9.f4408r = i6;
                        bVar9.f4406q = -1;
                        bVar9.f4404p = -1;
                        bVar9.f4400n = -1;
                        bVar9.f4402o = -1;
                        return;
                    } else if (i7 == 3) {
                        b bVar10 = aVar.f4331e;
                        bVar10.f4409s = i6;
                        bVar10.f4406q = -1;
                        bVar10.f4404p = -1;
                        bVar10.f4400n = -1;
                        bVar10.f4402o = -1;
                        return;
                    } else if (i7 == 4) {
                        b bVar11 = aVar.f4331e;
                        bVar11.f4410t = i6;
                        bVar11.f4406q = -1;
                        bVar11.f4404p = -1;
                        bVar11.f4400n = -1;
                        bVar11.f4402o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                case 6:
                    if (i7 == 6) {
                        b bVar12 = aVar.f4331e;
                        bVar12.f4412v = i6;
                        bVar12.f4411u = -1;
                    } else if (i7 == 7) {
                        b bVar13 = aVar.f4331e;
                        bVar13.f4411u = i6;
                        bVar13.f4412v = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                    aVar.f4331e.f4360M = i8;
                    return;
                case 7:
                    if (i7 == 7) {
                        b bVar14 = aVar.f4331e;
                        bVar14.f4414x = i6;
                        bVar14.f4413w = -1;
                    } else if (i7 == 6) {
                        b bVar15 = aVar.f4331e;
                        bVar15.f4413w = i6;
                        bVar15.f4414x = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + w(i7) + " undefined");
                    }
                    aVar.f4331e.f4359L = i8;
                    return;
                default:
                    throw new IllegalArgumentException(w(i5) + " to " + w(i7) + " unknown");
            }
        }
    }

    public void i(int i4, int i5, int i6, float f4) {
        b bVar = n(i4).f4331e;
        bVar.f4349B = i5;
        bVar.f4350C = i6;
        bVar.f4351D = f4;
    }

    public void k(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        l(i4, i5, i6, i7, iArr, fArr, i8, 1, 2);
    }

    public void o(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a m4 = m(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m4.f4331e.f4374a = true;
                    }
                    this.f4326e.put(Integer.valueOf(m4.f4327a), m4);
                }
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01cf, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01dc
            if (r0 == 0) goto L_0x01cc
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x006d
            if (r0 == r5) goto L_0x0015
            goto L_0x01cf
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            switch(r8) {
                case -2075718416: goto L_0x004b;
                case -190376483: goto L_0x0041;
                case 426575017: goto L_0x0037;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0026:
            goto L_0x0054
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r7
            goto L_0x0054
        L_0x0031:
            r10 = move-exception
            goto L_0x01d5
        L_0x0034:
            r10 = move-exception
            goto L_0x01d9
        L_0x0037:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r6
            goto L_0x0054
        L_0x0041:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r3
            goto L_0x0054
        L_0x004b:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r5
        L_0x0054:
            if (r4 == 0) goto L_0x006c
            if (r4 == r3) goto L_0x005e
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x005e
            goto L_0x01cf
        L_0x005e:
            java.util.HashMap r0 = r9.f4326e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r3 = r2.f4327a     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r2 = r1
            goto L_0x01cf
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            switch(r8) {
                case -2025855158: goto L_0x00d6;
                case -1984451626: goto L_0x00cc;
                case -1962203927: goto L_0x00c2;
                case -1269513683: goto L_0x00b8;
                case -1238332596: goto L_0x00ae;
                case -71750448: goto L_0x00a4;
                case 366511058: goto L_0x0099;
                case 1331510167: goto L_0x008f;
                case 1791837707: goto L_0x0084;
                case 1803088381: goto L_0x007a;
                default: goto L_0x0078;
            }     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0078:
            goto L_0x00df
        L_0x007a:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r7
            goto L_0x00df
        L_0x0084:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 8
            goto L_0x00df
        L_0x008f:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r5
            goto L_0x00df
        L_0x0099:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 9
            goto L_0x00df
        L_0x00a4:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r6
            goto L_0x00df
        L_0x00ae:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 5
            goto L_0x00df
        L_0x00b8:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 4
            goto L_0x00df
        L_0x00c2:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r3
            goto L_0x00df
        L_0x00cc:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 7
            goto L_0x00df
        L_0x00d6:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 6
        L_0x00df:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01c3;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01ab;
                case 3: goto L_0x019e;
                case 4: goto L_0x0179;
                case 5: goto L_0x0154;
                case 6: goto L_0x012e;
                case 7: goto L_0x0108;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00e6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x01cf
        L_0x00e6:
            if (r2 == 0) goto L_0x00ef
            java.util.HashMap r0 = r2.f4333g     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.ConstraintAttribute.b(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x00ef:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0108:
            if (r2 == 0) goto L_0x0115
            androidx.constraintlayout.widget.c$c r0 = r2.f4330d     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x0115:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x012e:
            if (r2 == 0) goto L_0x013b
            androidx.constraintlayout.widget.c$b r0 = r2.f4331e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x013b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0154:
            if (r2 == 0) goto L_0x0160
            androidx.constraintlayout.widget.c$e r0 = r2.f4332f     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x0160:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0179:
            if (r2 == 0) goto L_0x0185
            androidx.constraintlayout.widget.c$d r0 = r2.f4329c     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x0185:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x019e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.c$a r2 = r9.m(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.c$b r0 = r2.f4331e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.f4393j0 = r3     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01ab:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.c$a r2 = r9.m(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.c$b r0 = r2.f4331e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.f4374a = r3     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.f4376b = r3     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01ba:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.c$a r2 = r9.m(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01c3:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.c$a r2 = r9.m(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01cc:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x01cf:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x0006
        L_0x01d5:
            r10.printStackTrace()
            goto L_0x01dc
        L_0x01d9:
            r10.printStackTrace()
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.p(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
