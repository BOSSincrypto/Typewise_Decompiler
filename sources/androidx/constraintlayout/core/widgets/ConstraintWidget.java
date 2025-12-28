package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.j;
import androidx.constraintlayout.core.widgets.analyzer.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {

    /* renamed from: K0  reason: collision with root package name */
    public static float f3873K0 = 0.5f;

    /* renamed from: A  reason: collision with root package name */
    public int f3874A = 0;

    /* renamed from: A0  reason: collision with root package name */
    int f3875A0;

    /* renamed from: B  reason: collision with root package name */
    public float f3876B = 1.0f;

    /* renamed from: B0  reason: collision with root package name */
    boolean f3877B0;

    /* renamed from: C  reason: collision with root package name */
    public int f3878C = 0;

    /* renamed from: C0  reason: collision with root package name */
    boolean f3879C0;

    /* renamed from: D  reason: collision with root package name */
    public int f3880D = 0;

    /* renamed from: D0  reason: collision with root package name */
    public float[] f3881D0;

    /* renamed from: E  reason: collision with root package name */
    public float f3882E = 1.0f;

    /* renamed from: E0  reason: collision with root package name */
    protected ConstraintWidget[] f3883E0;

    /* renamed from: F  reason: collision with root package name */
    int f3884F = -1;

    /* renamed from: F0  reason: collision with root package name */
    protected ConstraintWidget[] f3885F0;

    /* renamed from: G  reason: collision with root package name */
    float f3886G = 1.0f;

    /* renamed from: G0  reason: collision with root package name */
    ConstraintWidget f3887G0;

    /* renamed from: H  reason: collision with root package name */
    private int[] f3888H = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: H0  reason: collision with root package name */
    ConstraintWidget f3889H0;

    /* renamed from: I  reason: collision with root package name */
    private float f3890I = 0.0f;

    /* renamed from: I0  reason: collision with root package name */
    public int f3891I0;

    /* renamed from: J  reason: collision with root package name */
    private boolean f3892J = false;

    /* renamed from: J0  reason: collision with root package name */
    public int f3893J0;

    /* renamed from: K  reason: collision with root package name */
    private boolean f3894K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f3895L = false;

    /* renamed from: M  reason: collision with root package name */
    private int f3896M = 0;

    /* renamed from: N  reason: collision with root package name */
    private int f3897N = 0;

    /* renamed from: O  reason: collision with root package name */
    public ConstraintAnchor f3898O = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);

    /* renamed from: P  reason: collision with root package name */
    public ConstraintAnchor f3899P = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);

    /* renamed from: Q  reason: collision with root package name */
    public ConstraintAnchor f3900Q = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);

    /* renamed from: R  reason: collision with root package name */
    public ConstraintAnchor f3901R = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);

    /* renamed from: S  reason: collision with root package name */
    public ConstraintAnchor f3902S = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);

    /* renamed from: T  reason: collision with root package name */
    ConstraintAnchor f3903T = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);

    /* renamed from: U  reason: collision with root package name */
    ConstraintAnchor f3904U = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    /* renamed from: V  reason: collision with root package name */
    public ConstraintAnchor f3905V;

    /* renamed from: W  reason: collision with root package name */
    public ConstraintAnchor[] f3906W;

    /* renamed from: X  reason: collision with root package name */
    protected ArrayList f3907X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean[] f3908Y;

    /* renamed from: Z  reason: collision with root package name */
    public DimensionBehaviour[] f3909Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3910a = false;

    /* renamed from: a0  reason: collision with root package name */
    public ConstraintWidget f3911a0;

    /* renamed from: b  reason: collision with root package name */
    public WidgetRun[] f3912b = new WidgetRun[2];

    /* renamed from: b0  reason: collision with root package name */
    int f3913b0;

    /* renamed from: c  reason: collision with root package name */
    public c f3914c;

    /* renamed from: c0  reason: collision with root package name */
    int f3915c0;

    /* renamed from: d  reason: collision with root package name */
    public c f3916d;

    /* renamed from: d0  reason: collision with root package name */
    public float f3917d0;

    /* renamed from: e  reason: collision with root package name */
    public j f3918e = null;

    /* renamed from: e0  reason: collision with root package name */
    protected int f3919e0;

    /* renamed from: f  reason: collision with root package name */
    public l f3920f = null;

    /* renamed from: f0  reason: collision with root package name */
    protected int f3921f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f3922g = {true, true};

    /* renamed from: g0  reason: collision with root package name */
    protected int f3923g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f3924h = false;

    /* renamed from: h0  reason: collision with root package name */
    int f3925h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3926i = true;

    /* renamed from: i0  reason: collision with root package name */
    int f3927i0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3928j = false;

    /* renamed from: j0  reason: collision with root package name */
    protected int f3929j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3930k = true;

    /* renamed from: k0  reason: collision with root package name */
    protected int f3931k0;

    /* renamed from: l  reason: collision with root package name */
    private int f3932l = -1;

    /* renamed from: l0  reason: collision with root package name */
    int f3933l0;

    /* renamed from: m  reason: collision with root package name */
    private int f3934m = -1;

    /* renamed from: m0  reason: collision with root package name */
    protected int f3935m0;

    /* renamed from: n  reason: collision with root package name */
    public B.a f3936n = new B.a(this);

    /* renamed from: n0  reason: collision with root package name */
    protected int f3937n0;

    /* renamed from: o  reason: collision with root package name */
    public String f3938o;

    /* renamed from: o0  reason: collision with root package name */
    float f3939o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3940p = false;

    /* renamed from: p0  reason: collision with root package name */
    float f3941p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3942q = false;

    /* renamed from: q0  reason: collision with root package name */
    private Object f3943q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3944r = false;

    /* renamed from: r0  reason: collision with root package name */
    private int f3945r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3946s = false;

    /* renamed from: s0  reason: collision with root package name */
    private int f3947s0;

    /* renamed from: t  reason: collision with root package name */
    public int f3948t = -1;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f3949t0;

    /* renamed from: u  reason: collision with root package name */
    public int f3950u = -1;

    /* renamed from: u0  reason: collision with root package name */
    private String f3951u0;

    /* renamed from: v  reason: collision with root package name */
    private int f3952v = 0;

    /* renamed from: v0  reason: collision with root package name */
    private String f3953v0;

    /* renamed from: w  reason: collision with root package name */
    public int f3954w = 0;

    /* renamed from: w0  reason: collision with root package name */
    boolean f3955w0;

    /* renamed from: x  reason: collision with root package name */
    public int f3956x = 0;

    /* renamed from: x0  reason: collision with root package name */
    boolean f3957x0;

    /* renamed from: y  reason: collision with root package name */
    public int[] f3958y = new int[2];

    /* renamed from: y0  reason: collision with root package name */
    boolean f3959y0;

    /* renamed from: z  reason: collision with root package name */
    public int f3960z = 0;

    /* renamed from: z0  reason: collision with root package name */
    int f3961z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3963a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3964b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3964b = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3964b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3964b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3964b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3963a = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f3963a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f3963a     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.a.<clinit>():void");
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f3905V = constraintAnchor;
        this.f3906W = new ConstraintAnchor[]{this.f3898O, this.f3900Q, this.f3899P, this.f3901R, this.f3902S, constraintAnchor};
        this.f3907X = new ArrayList();
        this.f3908Y = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f3909Z = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f3911a0 = null;
        this.f3913b0 = 0;
        this.f3915c0 = 0;
        this.f3917d0 = 0.0f;
        this.f3919e0 = -1;
        this.f3921f0 = 0;
        this.f3923g0 = 0;
        this.f3925h0 = 0;
        this.f3927i0 = 0;
        this.f3929j0 = 0;
        this.f3931k0 = 0;
        this.f3933l0 = 0;
        float f4 = f3873K0;
        this.f3939o0 = f4;
        this.f3941p0 = f4;
        this.f3945r0 = 0;
        this.f3947s0 = 0;
        this.f3949t0 = false;
        this.f3951u0 = null;
        this.f3953v0 = null;
        this.f3959y0 = false;
        this.f3961z0 = 0;
        this.f3875A0 = 0;
        this.f3881D0 = new float[]{-1.0f, -1.0f};
        this.f3883E0 = new ConstraintWidget[]{null, null};
        this.f3885F0 = new ConstraintWidget[]{null, null};
        this.f3887G0 = null;
        this.f3889H0 = null;
        this.f3891I0 = -1;
        this.f3893J0 = -1;
        d();
    }

    private void P(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i8, int i9, float f4, float f5) {
        sb.append(str);
        sb.append(" :  {\n");
        y0(sb, "      size", i4, 0);
        y0(sb, "      min", i5, 0);
        y0(sb, "      max", i6, Integer.MAX_VALUE);
        y0(sb, "      matchMin", i8, 0);
        y0(sb, "      matchDef", i9, 0);
        x0(sb, "      matchPercent", f4, 1.0f);
        sb.append("    },\n");
    }

    private void Q(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f3867f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(constraintAnchor.f3867f);
            sb.append("'");
            if (!(constraintAnchor.f3869h == Integer.MIN_VALUE && constraintAnchor.f3868g == 0)) {
                sb.append(",");
                sb.append(constraintAnchor.f3868g);
                if (constraintAnchor.f3869h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(constraintAnchor.f3869h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    private void d() {
        this.f3907X.add(this.f3898O);
        this.f3907X.add(this.f3899P);
        this.f3907X.add(this.f3900Q);
        this.f3907X.add(this.f3901R);
        this.f3907X.add(this.f3903T);
        this.f3907X.add(this.f3904U);
        this.f3907X.add(this.f3905V);
        this.f3907X.add(this.f3902S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean f0(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r3.f3906W
            r1 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f3867f
            if (r2 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3867f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.f3867f
            if (r0 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3867f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.f0(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0497, code lost:
        if ((r4 instanceof androidx.constraintlayout.core.widgets.a) != false) goto L_0x049c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0482 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0585 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:369:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:373:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(androidx.constraintlayout.core.d r38, boolean r39, boolean r40, boolean r41, boolean r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.SolverVariable r44, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r45, boolean r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, androidx.constraintlayout.core.widgets.ConstraintAnchor r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            r37 = this;
            r0 = r37
            r10 = r38
            r11 = r43
            r12 = r44
            r13 = r47
            r14 = r48
            r15 = r51
            r1 = r52
            r2 = r60
            r3 = r61
            r4 = r62
            androidx.constraintlayout.core.SolverVariable r9 = r10.q(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.q(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r47.j()
            androidx.constraintlayout.core.SolverVariable r7 = r10.q(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r48.j()
            androidx.constraintlayout.core.SolverVariable r6 = r10.q(r5)
            androidx.constraintlayout.core.d.w()
            boolean r16 = r47.o()
            boolean r17 = r48.o()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.f3905V
            boolean r18 = r5.o()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r54 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r59
        L_0x0051:
            int[] r20 = androidx.constraintlayout.core.widgets.ConstraintWidget.a.f3964b
            int r21 = r45.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f3932l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r39 == 0) goto L_0x007d
            r0.f3932l = r14
            r50 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f3934m
            if (r2 == r14) goto L_0x0088
            if (r39 != 0) goto L_0x0088
            r0.f3934m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r50
        L_0x008a:
            int r14 = r0.f3947s0
            r50 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r50
        L_0x0098:
            if (r64 == 0) goto L_0x00ba
            if (r16 != 0) goto L_0x00aa
            if (r17 != 0) goto L_0x00aa
            if (r18 != 0) goto L_0x00aa
            r2 = r49
            r10.f(r9, r2)
        L_0x00a5:
            r24 = r6
            r6 = 8
            goto L_0x00bd
        L_0x00aa:
            if (r16 == 0) goto L_0x00a5
            if (r17 != 0) goto L_0x00a5
            int r2 = r47.f()
            r24 = r6
            r6 = 8
            r10.e(r9, r7, r2, r6)
            goto L_0x00bd
        L_0x00ba:
            r24 = r6
            r6 = r2
        L_0x00bd:
            if (r19 != 0) goto L_0x00e7
            if (r46 == 0) goto L_0x00d6
            r2 = 3
            r6 = 0
            r10.e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00cd
            r10.h(r8, r9, r15, r2)
        L_0x00cd:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00da
            r10.j(r8, r9, r1, r2)
            goto L_0x00da
        L_0x00d6:
            r2 = r6
            r10.e(r8, r9, r14, r2)
        L_0x00da:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
        L_0x00e3:
            r24 = r3
            goto L_0x01d9
        L_0x00e7:
            r1 = 2
            if (r5 == r1) goto L_0x010a
            if (r54 != 0) goto L_0x010a
            r1 = 1
            if (r12 == r1) goto L_0x00f1
            if (r12 != 0) goto L_0x010a
        L_0x00f1:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00fb
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00fb:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r19 = r42
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e3
        L_0x010a:
            r1 = -2
            if (r3 != r1) goto L_0x010f
            r2 = r14
            goto L_0x0110
        L_0x010f:
            r2 = r3
        L_0x0110:
            if (r4 != r1) goto L_0x0114
            r1 = r14
            goto L_0x0115
        L_0x0114:
            r1 = r4
        L_0x0115:
            if (r14 <= 0) goto L_0x011b
            r3 = 1
            if (r12 == r3) goto L_0x011b
            r14 = 0
        L_0x011b:
            r3 = 8
            if (r2 <= 0) goto L_0x0126
            r10.h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0126:
            r4 = 1
            if (r1 <= 0) goto L_0x0135
            if (r40 == 0) goto L_0x012e
            if (r12 != r4) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r10.j(r8, r9, r1, r3)
        L_0x0131:
            int r14 = java.lang.Math.min(r14, r1)
        L_0x0135:
            if (r12 != r4) goto L_0x015c
            if (r40 == 0) goto L_0x013d
            r10.e(r8, r9, r14, r3)
            goto L_0x014e
        L_0x013d:
            if (r56 == 0) goto L_0x0147
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
            goto L_0x014e
        L_0x0147:
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
        L_0x014e:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
            r24 = r2
            r2 = r7
            goto L_0x01d9
        L_0x015c:
            r3 = 2
            if (r12 != r3) goto L_0x01c8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r47.k()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L_0x018b
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r47.k()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r6) goto L_0x0170
            goto L_0x018b
        L_0x0170:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.o(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.q(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.o(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.q(r4)
        L_0x0188:
            r14 = r3
            r6 = r4
            goto L_0x01a2
        L_0x018b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.o(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.q(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.o(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.q(r4)
            goto L_0x0188
        L_0x01a2:
            androidx.constraintlayout.core.b r3 = r38.r()
            r4 = r8
            r46 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r52 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r63
            androidx.constraintlayout.core.b r3 = r3.k(r4, r5, r6, r7, r8)
            r10.d(r3)
            if (r40 == 0) goto L_0x01bf
            r19 = 0
        L_0x01bf:
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = r42
            goto L_0x01d9
        L_0x01c8:
            r46 = r1
            r52 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = 1
        L_0x01d9:
            if (r64 == 0) goto L_0x01dd
            if (r56 == 0) goto L_0x01e8
        L_0x01dd:
            r5 = r44
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            goto L_0x0583
        L_0x01e8:
            if (r16 != 0) goto L_0x01f3
            if (r17 != 0) goto L_0x01f3
            if (r18 != 0) goto L_0x01f3
        L_0x01ee:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x0553
        L_0x01f3:
            if (r16 == 0) goto L_0x020c
            if (r17 != 0) goto L_0x020c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f3867f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f3865d
            if (r40 == 0) goto L_0x0204
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.a
            if (r1 == 0) goto L_0x0204
            r2 = 8
            goto L_0x0205
        L_0x0204:
            r2 = 5
        L_0x0205:
            r20 = r40
            r1 = r2
        L_0x0208:
            r2 = r15
        L_0x0209:
            r3 = 0
            goto L_0x0555
        L_0x020c:
            if (r16 != 0) goto L_0x023e
            if (r17 == 0) goto L_0x023e
            int r1 = r48.f()
            int r1 = -r1
            r2 = 8
            r10.e(r14, r15, r1, r2)
            if (r40 == 0) goto L_0x01ee
            boolean r1 = r0.f3928j
            if (r1 == 0) goto L_0x0234
            boolean r1 = r9.f3776g
            if (r1 == 0) goto L_0x0234
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f3911a0
            if (r1 == 0) goto L_0x0234
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.d) r1
            if (r39 == 0) goto L_0x0230
            r1.z1(r13)
            goto L_0x01ee
        L_0x0230:
            r1.E1(r13)
            goto L_0x01ee
        L_0x0234:
            r1 = 0
            r2 = 5
            r10.h(r9, r11, r1, r2)
            r3 = r1
            r1 = r2
            r2 = r15
            goto L_0x0553
        L_0x023e:
            r1 = 0
            if (r16 == 0) goto L_0x0550
            if (r17 == 0) goto L_0x0550
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f3867f
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r3.f3865d
            r6 = r48
            r7 = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f3867f
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r1.f3865d
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r37.K()
            r16 = 6
            if (r25 == 0) goto L_0x03ba
            if (r12 != 0) goto L_0x02be
            if (r4 != 0) goto L_0x0282
            if (r24 != 0) goto L_0x0282
            boolean r1 = r2.f3776g
            if (r1 == 0) goto L_0x0276
            boolean r1 = r15.f3776g
            if (r1 == 0) goto L_0x0276
            int r1 = r47.f()
            r4 = 8
            r10.e(r9, r2, r1, r4)
            int r1 = r48.f()
            int r1 = -r1
            r10.e(r14, r15, r1, r4)
            return
        L_0x0276:
            r4 = 8
            r1 = r4
            r17 = r1
            r18 = r7
            r23 = r18
            r21 = 1
            goto L_0x028d
        L_0x0282:
            r4 = 8
            r21 = r7
            r1 = 5
            r17 = 5
            r18 = 1
            r23 = 1
        L_0x028d:
            boolean r4 = r8 instanceof androidx.constraintlayout.core.widgets.a
            if (r4 != 0) goto L_0x02ac
            boolean r4 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r4 == 0) goto L_0x0296
            goto L_0x02ac
        L_0x0296:
            r4 = r44
            r20 = r16
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
        L_0x02a7:
            r23 = r1
            r1 = 3
            goto L_0x040d
        L_0x02ac:
            r4 = r44
            r20 = r16
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r22 = 4
            goto L_0x02a7
        L_0x02be:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02ed
            boolean r1 = r8 instanceof androidx.constraintlayout.core.widgets.a
            if (r1 != 0) goto L_0x02e0
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r1 == 0) goto L_0x02cc
            goto L_0x02e0
        L_0x02cc:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 5
        L_0x02d8:
            r23 = 5
        L_0x02da:
            r26 = 1
            r27 = 1
            goto L_0x040d
        L_0x02e0:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
            goto L_0x02d8
        L_0x02ed:
            r1 = 1
            if (r12 != r1) goto L_0x02ff
            r4 = r44
            r28 = r7
            r20 = r16
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
            goto L_0x02da
        L_0x02ff:
            r1 = 3
            if (r12 != r1) goto L_0x03a8
            int r1 = r0.f3884F
            r7 = -1
            if (r1 != r7) goto L_0x032d
            if (r57 == 0) goto L_0x0322
            r4 = r44
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            if (r40 == 0) goto L_0x031f
            r20 = 5
        L_0x0315:
            r22 = 5
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x040d
        L_0x031f:
            r20 = 4
            goto L_0x0315
        L_0x0322:
            r4 = r44
            r20 = r17
            r23 = r20
            r1 = 3
            r7 = 1
            r18 = 5
            goto L_0x0315
        L_0x032d:
            if (r54 == 0) goto L_0x0352
            r1 = r60
            r7 = 2
            if (r1 == r7) goto L_0x033c
            r7 = 1
            if (r1 != r7) goto L_0x0338
            goto L_0x033d
        L_0x0338:
            r1 = r17
            r4 = 5
            goto L_0x033f
        L_0x033c:
            r7 = 1
        L_0x033d:
            r1 = 5
            r4 = 4
        L_0x033f:
            r23 = r1
            r22 = r4
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r4 = r44
            goto L_0x040d
        L_0x0352:
            r7 = 1
            if (r4 <= 0) goto L_0x0368
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 5
        L_0x0364:
            r23 = 5
            goto L_0x040d
        L_0x0368:
            if (r4 != 0) goto L_0x0398
            if (r24 != 0) goto L_0x0398
            if (r57 != 0) goto L_0x037e
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r22 = r17
            r1 = 3
            r18 = 5
            goto L_0x0364
        L_0x037e:
            if (r8 == r3) goto L_0x0384
            if (r5 == r3) goto L_0x0384
            r1 = 4
            goto L_0x0385
        L_0x0384:
            r1 = 5
        L_0x0385:
            r4 = r44
            r23 = r1
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
            goto L_0x040d
        L_0x0398:
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
            goto L_0x0364
        L_0x03a8:
            r7 = 1
            r4 = r44
            r20 = r16
            r18 = 5
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
        L_0x03b7:
            r28 = 0
            goto L_0x040d
        L_0x03ba:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f3776g
            if (r1 == 0) goto L_0x03fd
            boolean r1 = r15.f3776g
            if (r1 == 0) goto L_0x03fd
            int r1 = r47.f()
            int r3 = r48.f()
            r4 = 8
            r54 = r38
            r55 = r9
            r56 = r2
            r57 = r1
            r58 = r53
            r59 = r15
            r60 = r14
            r61 = r3
            r62 = r4
            r54.c(r55, r56, r57, r58, r59, r60, r61, r62)
            if (r40 == 0) goto L_0x03fc
            if (r19 == 0) goto L_0x03fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f3867f
            if (r1 == 0) goto L_0x03f3
            int r1 = r48.f()
            r4 = r44
            goto L_0x03f6
        L_0x03f3:
            r4 = r44
            r1 = 0
        L_0x03f6:
            if (r15 == r4) goto L_0x03fc
            r2 = 5
            r10.h(r4, r14, r1, r2)
        L_0x03fc:
            return
        L_0x03fd:
            r4 = r44
            r1 = 3
            r18 = 5
            r26 = r7
            r27 = r26
            r20 = r16
            r23 = r18
            r22 = 4
            goto L_0x03b7
        L_0x040d:
            if (r26 == 0) goto L_0x0418
            if (r2 != r15) goto L_0x0418
            if (r8 == r3) goto L_0x0418
            r26 = 0
            r29 = 0
            goto L_0x041a
        L_0x0418:
            r29 = r7
        L_0x041a:
            if (r27 == 0) goto L_0x0465
            if (r25 != 0) goto L_0x042f
            if (r55 != 0) goto L_0x042f
            if (r57 != 0) goto L_0x042f
            if (r2 != r11) goto L_0x042f
            if (r15 != r4) goto L_0x042f
            r23 = r17
            r27 = r23
            r20 = 0
            r29 = 0
            goto L_0x0433
        L_0x042f:
            r27 = r20
            r20 = r40
        L_0x0433:
            int r30 = r47.f()
            int r31 = r48.f()
            r13 = r1
            r1 = r38
            r42 = r2
            r13 = r17
            r17 = 4
            r36 = r18
            r18 = r7
            r7 = r36
            r2 = r9
            r32 = r3
            r3 = r42
            r4 = r30
            r33 = r5
            r5 = r53
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0462:
            r2 = r29
            goto L_0x0478
        L_0x0465:
            r42 = r2
            r32 = r3
            r33 = r5
            r18 = r7
            r34 = r8
            r35 = r9
            r13 = r17
            r17 = 4
            r20 = r40
            goto L_0x0462
        L_0x0478:
            int r1 = r0.f3947s0
            if (r1 != r13) goto L_0x0483
            boolean r1 = r48.m()
            if (r1 != 0) goto L_0x0483
            return
        L_0x0483:
            r1 = r42
            if (r26 == 0) goto L_0x04b9
            if (r20 == 0) goto L_0x049f
            if (r1 == r15) goto L_0x049f
            if (r25 != 0) goto L_0x049f
            r3 = r34
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.a
            if (r4 != 0) goto L_0x049a
            r4 = r33
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.a
            if (r5 == 0) goto L_0x04a3
            goto L_0x049c
        L_0x049a:
            r4 = r33
        L_0x049c:
            r5 = r16
            goto L_0x04a5
        L_0x049f:
            r4 = r33
            r3 = r34
        L_0x04a3:
            r5 = r23
        L_0x04a5:
            int r6 = r47.f()
            r8 = r35
            r10.h(r8, r1, r6, r5)
            int r6 = r48.f()
            int r6 = -r6
            r10.j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x04bf
        L_0x04b9:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x04bf:
            if (r20 == 0) goto L_0x04d5
            if (r58 == 0) goto L_0x04d5
            boolean r5 = r3 instanceof androidx.constraintlayout.core.widgets.a
            if (r5 != 0) goto L_0x04d5
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.a
            if (r5 != 0) goto L_0x04d5
            r5 = r32
            if (r4 == r5) goto L_0x04d7
            r6 = r16
            r7 = r6
            r2 = r18
            goto L_0x04db
        L_0x04d5:
            r5 = r32
        L_0x04d7:
            r6 = r22
            r7 = r23
        L_0x04db:
            if (r2 == 0) goto L_0x0526
            if (r28 == 0) goto L_0x0506
            if (r57 == 0) goto L_0x04e3
            if (r41 == 0) goto L_0x0506
        L_0x04e3:
            if (r3 == r5) goto L_0x04ea
            if (r4 != r5) goto L_0x04e8
            goto L_0x04ea
        L_0x04e8:
            r2 = r6
            goto L_0x04ec
        L_0x04ea:
            r2 = r16
        L_0x04ec:
            boolean r9 = r3 instanceof androidx.constraintlayout.core.widgets.f
            if (r9 != 0) goto L_0x04f4
            boolean r9 = r4 instanceof androidx.constraintlayout.core.widgets.f
            if (r9 == 0) goto L_0x04f5
        L_0x04f4:
            r2 = 5
        L_0x04f5:
            boolean r9 = r3 instanceof androidx.constraintlayout.core.widgets.a
            if (r9 != 0) goto L_0x04fd
            boolean r9 = r4 instanceof androidx.constraintlayout.core.widgets.a
            if (r9 == 0) goto L_0x04fe
        L_0x04fd:
            r2 = 5
        L_0x04fe:
            if (r57 == 0) goto L_0x0501
            r2 = 5
        L_0x0501:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x0507
        L_0x0506:
            r2 = r6
        L_0x0507:
            if (r20 == 0) goto L_0x0517
            int r2 = java.lang.Math.min(r7, r2)
            if (r54 == 0) goto L_0x0517
            if (r57 != 0) goto L_0x0517
            if (r3 == r5) goto L_0x0515
            if (r4 != r5) goto L_0x0517
        L_0x0515:
            r2 = r17
        L_0x0517:
            int r3 = r47.f()
            r10.e(r8, r1, r3, r2)
            int r3 = r48.f()
            int r3 = -r3
            r10.e(r14, r15, r3, r2)
        L_0x0526:
            if (r20 == 0) goto L_0x0537
            if (r11 != r1) goto L_0x052f
            int r2 = r47.f()
            goto L_0x0530
        L_0x052f:
            r2 = 0
        L_0x0530:
            if (r1 == r11) goto L_0x0537
            r1 = 5
            r10.h(r8, r11, r2, r1)
            goto L_0x0538
        L_0x0537:
            r1 = 5
        L_0x0538:
            if (r20 == 0) goto L_0x0208
            if (r25 == 0) goto L_0x0208
            r2 = r15
            if (r51 != 0) goto L_0x0209
            if (r24 != 0) goto L_0x0209
            if (r25 == 0) goto L_0x054b
            r3 = 3
            if (r12 != r3) goto L_0x054b
            r3 = 0
            r10.h(r14, r8, r3, r13)
            goto L_0x0555
        L_0x054b:
            r3 = 0
            r10.h(r14, r8, r3, r1)
            goto L_0x0555
        L_0x0550:
            r3 = r1
            r2 = r15
            r1 = 5
        L_0x0553:
            r20 = r40
        L_0x0555:
            if (r20 == 0) goto L_0x0582
            if (r19 == 0) goto L_0x0582
            r4 = r48
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.f3867f
            if (r5 == 0) goto L_0x0563
            int r3 = r48.f()
        L_0x0563:
            r5 = r44
            if (r2 == r5) goto L_0x0582
            boolean r2 = r0.f3928j
            if (r2 == 0) goto L_0x057f
            boolean r2 = r14.f3776g
            if (r2 == 0) goto L_0x057f
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f3911a0
            if (r2 == 0) goto L_0x057f
            androidx.constraintlayout.core.widgets.d r2 = (androidx.constraintlayout.core.widgets.d) r2
            if (r39 == 0) goto L_0x057b
            r2.y1(r4)
            goto L_0x057e
        L_0x057b:
            r2.D1(r4)
        L_0x057e:
            return
        L_0x057f:
            r10.h(r5, r14, r3, r1)
        L_0x0582:
            return
        L_0x0583:
            if (r1 >= r7) goto L_0x05bf
            if (r40 == 0) goto L_0x05bf
            if (r19 == 0) goto L_0x05bf
            r10.h(r8, r11, r3, r13)
            if (r39 != 0) goto L_0x0597
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3902S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f3867f
            if (r1 != 0) goto L_0x0595
            goto L_0x0597
        L_0x0595:
            r2 = r3
            goto L_0x0599
        L_0x0597:
            r2 = r18
        L_0x0599:
            if (r39 != 0) goto L_0x05ba
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3902S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f3867f
            if (r1 == 0) goto L_0x05ba
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f3865d
            float r2 = r1.f3917d0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x05b9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.f3909Z
            r2 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x05b9
            r1 = r1[r18]
            if (r1 != r4) goto L_0x05b9
            r2 = r18
            goto L_0x05ba
        L_0x05b9:
            r2 = r3
        L_0x05ba:
            if (r2 == 0) goto L_0x05bf
            r10.h(r5, r14, r3, r13)
        L_0x05bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void x0(StringBuilder sb, String str, float f4, float f5) {
        if (f4 != f5) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f4);
            sb.append(",\n");
        }
    }

    private void y0(StringBuilder sb, String str, int i4, int i5) {
        if (i4 != i5) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i4);
            sb.append(",\n");
        }
    }

    private void z0(StringBuilder sb, String str, float f4, int i4) {
        if (f4 != 0.0f) {
            sb.append(str);
            sb.append(" :  [");
            sb.append(f4);
            sb.append(",");
            sb.append(i4);
            sb.append("");
            sb.append("],\n");
        }
    }

    public DimensionBehaviour A() {
        return this.f3909Z[0];
    }

    public void A0(int i4) {
        boolean z3;
        this.f3933l0 = i4;
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3892J = z3;
    }

    public int B() {
        int i4;
        ConstraintAnchor constraintAnchor = this.f3898O;
        if (constraintAnchor != null) {
            i4 = constraintAnchor.f3868g;
        } else {
            i4 = 0;
        }
        ConstraintAnchor constraintAnchor2 = this.f3900Q;
        if (constraintAnchor2 != null) {
            return i4 + constraintAnchor2.f3868g;
        }
        return i4;
    }

    public void B0(Object obj) {
        this.f3943q0 = obj;
    }

    public int C() {
        return this.f3896M;
    }

    public void C0(String str) {
        this.f3951u0 = str;
    }

    public int D() {
        return this.f3897N;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0090
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x0090
        L_0x000b:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L_0x0039
            int r6 = r1 + -1
            if (r2 >= r6) goto L_0x0039
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r5
        L_0x0036:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L_0x0039:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L_0x0077
            int r1 = r1 - r4
            if (r2 >= r1) goto L_0x0077
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0086
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0086
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            if (r5 != r4) goto L_0x0071
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0071:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0077:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0086
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r9 = r0
        L_0x0087:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            r8.f3917d0 = r9
            r8.f3919e0 = r5
        L_0x008f:
            return
        L_0x0090:
            r8.f3917d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.D0(java.lang.String):void");
    }

    public int E(int i4) {
        if (i4 == 0) {
            return W();
        }
        if (i4 == 1) {
            return x();
        }
        return 0;
    }

    public void E0(int i4) {
        if (this.f3892J) {
            int i5 = i4 - this.f3933l0;
            int i6 = this.f3915c0 + i5;
            this.f3923g0 = i5;
            this.f3899P.t(i5);
            this.f3901R.t(i6);
            this.f3902S.t(i4);
            this.f3942q = true;
        }
    }

    public int F() {
        return this.f3888H[1];
    }

    public void F0(int i4, int i5) {
        if (!this.f3940p) {
            this.f3898O.t(i4);
            this.f3900Q.t(i5);
            this.f3921f0 = i4;
            this.f3913b0 = i5 - i4;
            this.f3940p = true;
        }
    }

    public int G() {
        return this.f3888H[0];
    }

    public void G0(int i4) {
        this.f3898O.t(i4);
        this.f3921f0 = i4;
    }

    public int H() {
        return this.f3937n0;
    }

    public void H0(int i4) {
        this.f3899P.t(i4);
        this.f3923g0 = i4;
    }

    public int I() {
        return this.f3935m0;
    }

    public void I0(int i4, int i5) {
        if (!this.f3942q) {
            this.f3899P.t(i4);
            this.f3901R.t(i5);
            this.f3923g0 = i4;
            this.f3915c0 = i5 - i4;
            if (this.f3892J) {
                this.f3902S.t(i4 + this.f3933l0);
            }
            this.f3942q = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f3901R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget J(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f3900Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f3867f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3867f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3865d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f3901R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f3867f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3867f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3865d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.J(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    public void J0(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i6 - i4;
        int i11 = i7 - i5;
        this.f3921f0 = i4;
        this.f3923g0 = i5;
        if (this.f3947s0 == 8) {
            this.f3913b0 = 0;
            this.f3915c0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f3909Z;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i10 < (i9 = this.f3913b0)) {
            i10 = i9;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i11 < (i8 = this.f3915c0)) {
            i11 = i8;
        }
        this.f3913b0 = i10;
        this.f3915c0 = i11;
        int i12 = this.f3937n0;
        if (i11 < i12) {
            this.f3915c0 = i12;
        }
        int i13 = this.f3935m0;
        if (i10 < i13) {
            this.f3913b0 = i13;
        }
        int i14 = this.f3874A;
        if (i14 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f3913b0 = Math.min(this.f3913b0, i14);
        }
        int i15 = this.f3880D;
        if (i15 > 0 && this.f3909Z[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f3915c0 = Math.min(this.f3915c0, i15);
        }
        int i16 = this.f3913b0;
        if (i10 != i16) {
            this.f3932l = i16;
        }
        int i17 = this.f3915c0;
        if (i11 != i17) {
            this.f3934m = i17;
        }
    }

    public ConstraintWidget K() {
        return this.f3911a0;
    }

    public void K0(boolean z3) {
        this.f3892J = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f3899P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget L(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f3867f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3867f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3865d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f3899P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f3867f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f3867f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f3865d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.L(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    public void L0(int i4) {
        this.f3915c0 = i4;
        int i5 = this.f3937n0;
        if (i4 < i5) {
            this.f3915c0 = i5;
        }
    }

    public int M() {
        return X() + this.f3913b0;
    }

    public void M0(float f4) {
        this.f3939o0 = f4;
    }

    public WidgetRun N(int i4) {
        if (i4 == 0) {
            return this.f3918e;
        }
        if (i4 == 1) {
            return this.f3920f;
        }
        return null;
    }

    public void N0(int i4) {
        this.f3961z0 = i4;
    }

    public void O(StringBuilder sb) {
        sb.append("  " + this.f3938o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f3913b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f3915c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f3921f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f3923g0);
        sb.append("\n");
        Q(sb, "left", this.f3898O);
        Q(sb, "top", this.f3899P);
        Q(sb, "right", this.f3900Q);
        Q(sb, "bottom", this.f3901R);
        Q(sb, "baseline", this.f3902S);
        Q(sb, "centerX", this.f3903T);
        Q(sb, "centerY", this.f3904U);
        P(sb, "    width", this.f3913b0, this.f3935m0, this.f3888H[0], this.f3932l, this.f3960z, this.f3954w, this.f3876B, this.f3881D0[0]);
        P(sb, "    height", this.f3915c0, this.f3937n0, this.f3888H[1], this.f3934m, this.f3878C, this.f3956x, this.f3882E, this.f3881D0[1]);
        z0(sb, "    dimensionRatio", this.f3917d0, this.f3919e0);
        x0(sb, "    horizontalBias", this.f3939o0, f3873K0);
        x0(sb, "    verticalBias", this.f3941p0, f3873K0);
        y0(sb, "    horizontalChainStyle", this.f3961z0, 0);
        y0(sb, "    verticalChainStyle", this.f3875A0, 0);
        sb.append("  }");
    }

    public void O0(int i4, int i5) {
        this.f3921f0 = i4;
        int i6 = i5 - i4;
        this.f3913b0 = i6;
        int i7 = this.f3935m0;
        if (i6 < i7) {
            this.f3913b0 = i7;
        }
    }

    public void P0(DimensionBehaviour dimensionBehaviour) {
        this.f3909Z[0] = dimensionBehaviour;
    }

    public void Q0(int i4, int i5, int i6, float f4) {
        this.f3954w = i4;
        this.f3960z = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.f3874A = i6;
        this.f3876B = f4;
        if (f4 > 0.0f && f4 < 1.0f && i4 == 0) {
            this.f3954w = 2;
        }
    }

    public float R() {
        return this.f3941p0;
    }

    public void R0(float f4) {
        this.f3881D0[0] = f4;
    }

    public int S() {
        return this.f3875A0;
    }

    /* access modifiers changed from: protected */
    public void S0(int i4, boolean z3) {
        this.f3908Y[i4] = z3;
    }

    public DimensionBehaviour T() {
        return this.f3909Z[1];
    }

    public void T0(boolean z3) {
        this.f3894K = z3;
    }

    public int U() {
        int i4;
        if (this.f3898O != null) {
            i4 = this.f3899P.f3868g;
        } else {
            i4 = 0;
        }
        if (this.f3900Q != null) {
            return i4 + this.f3901R.f3868g;
        }
        return i4;
    }

    public void U0(boolean z3) {
        this.f3895L = z3;
    }

    public int V() {
        return this.f3947s0;
    }

    public void V0(int i4, int i5) {
        this.f3896M = i4;
        this.f3897N = i5;
        Y0(false);
    }

    public int W() {
        if (this.f3947s0 == 8) {
            return 0;
        }
        return this.f3913b0;
    }

    public void W0(int i4) {
        this.f3888H[1] = i4;
    }

    public int X() {
        ConstraintWidget constraintWidget = this.f3911a0;
        if (constraintWidget == null || !(constraintWidget instanceof d)) {
            return this.f3921f0;
        }
        return ((d) constraintWidget).f4081S0 + this.f3921f0;
    }

    public void X0(int i4) {
        this.f3888H[0] = i4;
    }

    public int Y() {
        ConstraintWidget constraintWidget = this.f3911a0;
        if (constraintWidget == null || !(constraintWidget instanceof d)) {
            return this.f3923g0;
        }
        return ((d) constraintWidget).f4082T0 + this.f3923g0;
    }

    public void Y0(boolean z3) {
        this.f3926i = z3;
    }

    public boolean Z() {
        return this.f3892J;
    }

    public void Z0(int i4) {
        if (i4 < 0) {
            this.f3937n0 = 0;
        } else {
            this.f3937n0 = i4;
        }
    }

    public boolean a0(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (i4 == 0) {
            if (this.f3898O.f3867f != null) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (this.f3900Q.f3867f != null) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (i8 + i9 < 2) {
                return true;
            }
            return false;
        }
        if (this.f3899P.f3867f != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (this.f3901R.f3867f != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i10 = i5 + i6;
        if (this.f3902S.f3867f != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i10 + i7 < 2) {
            return true;
        }
        return false;
    }

    public void a1(int i4) {
        if (i4 < 0) {
            this.f3935m0 = 0;
        } else {
            this.f3935m0 = i4;
        }
    }

    public boolean b0() {
        int size = this.f3907X.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((ConstraintAnchor) this.f3907X.get(i4)).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i4, int i5) {
        this.f3921f0 = i4;
        this.f3923g0 = i5;
    }

    public boolean c0() {
        if (this.f3932l == -1 && this.f3934m == -1) {
            return false;
        }
        return true;
    }

    public void c1(ConstraintWidget constraintWidget) {
        this.f3911a0 = constraintWidget;
    }

    public boolean d0(int i4, int i5) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i4 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f3898O.f3867f;
            if (constraintAnchor3 != null && constraintAnchor3.n() && (constraintAnchor2 = this.f3900Q.f3867f) != null && constraintAnchor2.n()) {
                if ((this.f3900Q.f3867f.e() - this.f3900Q.f()) - (this.f3898O.f3867f.e() + this.f3898O.f()) >= i5) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.f3899P.f3867f;
            if (constraintAnchor4 != null && constraintAnchor4.n() && (constraintAnchor = this.f3901R.f3867f) != null && constraintAnchor.n()) {
                if ((this.f3901R.f3867f.e() - this.f3901R.f()) - (this.f3899P.f3867f.e() + this.f3899P.f()) >= i5) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void d1(float f4) {
        this.f3941p0 = f4;
    }

    public void e(d dVar, d dVar2, HashSet hashSet, int i4, boolean z3) {
        if (z3) {
            if (hashSet.contains(this)) {
                g.a(dVar, dVar2, this);
                hashSet.remove(this);
                g(dVar2, dVar.T1(64));
            } else {
                return;
            }
        }
        if (i4 == 0) {
            HashSet d4 = this.f3898O.d();
            if (d4 != null) {
                Iterator it = d4.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).f3865d.e(dVar, dVar2, hashSet, i4, true);
                }
            }
            HashSet d5 = this.f3900Q.d();
            if (d5 != null) {
                Iterator it2 = d5.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).f3865d.e(dVar, dVar2, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet d6 = this.f3899P.d();
        if (d6 != null) {
            Iterator it3 = d6.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).f3865d.e(dVar, dVar2, hashSet, i4, true);
            }
        }
        HashSet d7 = this.f3901R.d();
        if (d7 != null) {
            Iterator it4 = d7.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).f3865d.e(dVar, dVar2, hashSet, i4, true);
            }
        }
        HashSet d8 = this.f3902S.d();
        if (d8 != null) {
            Iterator it5 = d8.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).f3865d.e(dVar, dVar2, hashSet, i4, true);
            }
        }
    }

    public void e0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i4, int i5) {
        o(type).b(constraintWidget.o(type2), i4, i5, true);
    }

    public void e1(int i4) {
        this.f3875A0 = i4;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        if ((this instanceof h) || (this instanceof f)) {
            return true;
        }
        return false;
    }

    public void f1(int i4, int i5) {
        this.f3923g0 = i4;
        int i6 = i5 - i4;
        this.f3915c0 = i6;
        int i7 = this.f3937n0;
        if (i6 < i7) {
            this.f3915c0 = i7;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0544  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x05be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(androidx.constraintlayout.core.d r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3898O
            androidx.constraintlayout.core.SolverVariable r13 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3900Q
            androidx.constraintlayout.core.SolverVariable r12 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3899P
            androidx.constraintlayout.core.SolverVariable r11 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3901R
            androidx.constraintlayout.core.SolverVariable r10 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3902S
            androidx.constraintlayout.core.SolverVariable r9 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.f3909Z
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = r7
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f3909Z
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = r7
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            int r3 = r15.f3952v
            if (r3 == r7) goto L_0x0055
            if (r3 == r8) goto L_0x0052
            if (r3 == r1) goto L_0x004f
            r5 = r0
            r4 = r2
            goto L_0x0057
        L_0x004f:
            r4 = r6
            r5 = r4
            goto L_0x0057
        L_0x0052:
            r5 = r0
            r4 = r6
            goto L_0x0057
        L_0x0055:
            r4 = r2
            r5 = r6
        L_0x0057:
            int r0 = r15.f3947s0
            r3 = 8
            if (r0 != r3) goto L_0x0072
            boolean r0 = r15.f3949t0
            if (r0 != 0) goto L_0x0072
            boolean r0 = r53.b0()
            if (r0 != 0) goto L_0x0072
            boolean[] r0 = r15.f3908Y
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0072
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r0 = r15.f3940p
            r2 = 5
            if (r0 != 0) goto L_0x007b
            boolean r8 = r15.f3942q
            if (r8 == 0) goto L_0x00f8
        L_0x007b:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f3921f0
            r14.f(r13, r0)
            int r0 = r15.f3921f0
            int r8 = r15.f3913b0
            int r0 = r0 + r8
            r14.f(r12, r0)
            if (r4 == 0) goto L_0x00aa
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x00aa
            boolean r8 = r15.f3930k
            if (r8 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f3898O
            r0.z1(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f3900Q
            r0.y1(r8)
            goto L_0x00aa
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3900Q
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r12, r6, r2)
        L_0x00aa:
            boolean r0 = r15.f3942q
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.f3923g0
            r14.f(r11, r0)
            int r0 = r15.f3923g0
            int r8 = r15.f3915c0
            int r0 = r0 + r8
            r14.f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3902S
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f3923g0
            int r8 = r15.f3933l0
            int r0 = r0 + r8
            r14.f(r9, r0)
        L_0x00cb:
            if (r5 == 0) goto L_0x00eb
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r15.f3930k
            if (r8 == 0) goto L_0x00e2
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f3899P
            r0.E1(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f3901R
            r0.D1(r8)
            goto L_0x00eb
        L_0x00e2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3901R
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r10, r6, r2)
        L_0x00eb:
            boolean r0 = r15.f3940p
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.f3942q
            if (r0 == 0) goto L_0x00f8
            r15.f3940p = r6
            r15.f3942q = r6
            return
        L_0x00f8:
            boolean r0 = androidx.constraintlayout.core.d.f3810r
            if (r55 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f3918e
            if (r0 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.l r8 = r15.f3920f
            if (r8 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f3989h
            boolean r1 = r2.f3978j
            if (r1 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            boolean r0 = r0.f3978j
            if (r0 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3989h
            boolean r0 = r0.f3978j
            if (r0 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f3990i
            boolean r0 = r0.f3978j
            if (r0 == 0) goto L_0x0180
            int r0 = r2.f3975g
            r14.f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f3918e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            int r0 = r0.f3975g
            r14.f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3989h
            int r0 = r0.f3975g
            r14.f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            int r0 = r0.f3975g
            r14.f(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f4035k
            int r0 = r0.f3975g
            r14.f(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x017b
            if (r4 == 0) goto L_0x0162
            boolean[] r0 = r15.f3922g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0162
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x0162
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3900Q
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r12, r6, r3)
        L_0x0162:
            if (r5 == 0) goto L_0x017b
            boolean[] r0 = r15.f3922g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017b
            boolean r0 = r53.k0()
            if (r0 != 0) goto L_0x017b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3901R
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r10, r6, r3)
        L_0x017b:
            r15.f3940p = r6
            r15.f3942q = r6
            return
        L_0x0180:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r15.f0(r6)
            if (r0 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.d) r0
            r0.v1(r15, r6)
            r0 = r7
            goto L_0x0197
        L_0x0193:
            boolean r0 = r53.i0()
        L_0x0197:
            boolean r1 = r15.f0(r7)
            if (r1 == 0) goto L_0x01a6
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.f3911a0
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.d) r1
            r1.v1(r15, r7)
            r1 = r7
            goto L_0x01aa
        L_0x01a6:
            boolean r1 = r53.k0()
        L_0x01aa:
            if (r0 != 0) goto L_0x01c9
            if (r4 == 0) goto L_0x01c9
            int r2 = r15.f3947s0
            if (r2 == r3) goto L_0x01c9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3867f
            if (r2 != 0) goto L_0x01c9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f3900Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3867f
            if (r2 != 0) goto L_0x01c9
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3900Q
            androidx.constraintlayout.core.SolverVariable r2 = r14.q(r2)
            r14.h(r2, r12, r6, r7)
        L_0x01c9:
            if (r1 != 0) goto L_0x01ec
            if (r5 == 0) goto L_0x01ec
            int r2 = r15.f3947s0
            if (r2 == r3) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f3899P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3867f
            if (r2 != 0) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f3901R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3867f
            if (r2 != 0) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f3902S
            if (r2 != 0) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f3901R
            androidx.constraintlayout.core.SolverVariable r2 = r14.q(r2)
            r14.h(r2, r10, r6, r7)
        L_0x01ec:
            r29 = r0
            r28 = r1
            goto L_0x01f5
        L_0x01f1:
            r28 = r6
            r29 = r28
        L_0x01f5:
            int r0 = r15.f3913b0
            int r1 = r15.f3935m0
            if (r0 >= r1) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r1 = r0
        L_0x01fd:
            int r2 = r15.f3915c0
            int r8 = r15.f3937n0
            if (r2 >= r8) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r8 = r2
        L_0x0205:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.f3909Z
            r7 = r3[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0213
            r1 = 1
        L_0x0210:
            r20 = 1
            goto L_0x0215
        L_0x0213:
            r1 = 0
            goto L_0x0210
        L_0x0215:
            r3 = r3[r20]
            r23 = r8
            r27 = r9
            if (r3 == r6) goto L_0x021f
            r8 = 1
            goto L_0x0220
        L_0x021f:
            r8 = 0
        L_0x0220:
            int r9 = r15.f3919e0
            r15.f3884F = r9
            r30 = r10
            float r10 = r15.f3917d0
            r15.f3886G = r10
            r31 = r11
            int r11 = r15.f3954w
            r32 = r12
            int r12 = r15.f3956x
            r24 = 0
            int r24 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            r33 = r13
            if (r24 <= 0) goto L_0x02a7
            int r13 = r15.f3947s0
            r14 = 8
            if (r13 == r14) goto L_0x02a7
            if (r7 != r6) goto L_0x0245
            if (r11 != 0) goto L_0x0245
            r11 = 3
        L_0x0245:
            if (r3 != r6) goto L_0x024a
            if (r12 != 0) goto L_0x024a
            r12 = 3
        L_0x024a:
            if (r7 != r6) goto L_0x0257
            if (r3 != r6) goto L_0x0257
            r13 = 3
            if (r11 != r13) goto L_0x0258
            if (r12 != r13) goto L_0x0258
            r15.o1(r4, r5, r1, r8)
            goto L_0x02a0
        L_0x0257:
            r13 = 3
        L_0x0258:
            r1 = 4
            if (r7 != r6) goto L_0x0277
            if (r11 != r13) goto L_0x0277
            r8 = 0
            r15.f3884F = r8
            float r0 = (float) r2
            float r10 = r10 * r0
            int r0 = (int) r10
            if (r3 == r6) goto L_0x026e
            r36 = r1
            r35 = r12
            r34 = r23
            r14 = 0
            r1 = r0
            goto L_0x02b0
        L_0x026e:
            r1 = r0
            r36 = r11
            r35 = r12
        L_0x0273:
            r34 = r23
        L_0x0275:
            r14 = 1
            goto L_0x02b0
        L_0x0277:
            if (r3 != r6) goto L_0x02a0
            if (r12 != r13) goto L_0x02a0
            r2 = 1
            r15.f3884F = r2
            r2 = -1
            if (r9 != r2) goto L_0x0286
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r10
            r15.f3886G = r2
        L_0x0286:
            float r2 = r15.f3886G
            float r0 = (float) r0
            float r2 = r2 * r0
            int r8 = (int) r2
            if (r7 == r6) goto L_0x0297
            r35 = r1
            r34 = r8
            r36 = r11
            r1 = r22
        L_0x0295:
            r14 = 0
            goto L_0x02b0
        L_0x0297:
            r34 = r8
            r36 = r11
            r35 = r12
            r1 = r22
            goto L_0x0275
        L_0x02a0:
            r36 = r11
            r35 = r12
            r1 = r22
            goto L_0x0273
        L_0x02a7:
            r36 = r11
            r35 = r12
            r1 = r22
            r34 = r23
            goto L_0x0295
        L_0x02b0:
            int[] r0 = r15.f3958y
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            r15.f3924h = r14
            if (r14 == 0) goto L_0x02c6
            int r0 = r15.f3884F
            r2 = -1
            if (r0 == 0) goto L_0x02c3
            if (r0 != r2) goto L_0x02c7
        L_0x02c3:
            r18 = 1
            goto L_0x02c9
        L_0x02c6:
            r2 = -1
        L_0x02c7:
            r18 = 0
        L_0x02c9:
            if (r14 == 0) goto L_0x02d5
            int r0 = r15.f3884F
            r3 = 1
            if (r0 == r3) goto L_0x02d2
            if (r0 != r2) goto L_0x02d5
        L_0x02d2:
            r37 = 1
            goto L_0x02d7
        L_0x02d5:
            r37 = 0
        L_0x02d7:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f3909Z
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e6
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.d
            if (r0 == 0) goto L_0x02e6
            r9 = 1
            goto L_0x02e7
        L_0x02e6:
            r9 = 0
        L_0x02e7:
            if (r9 == 0) goto L_0x02ec
            r22 = 0
            goto L_0x02ee
        L_0x02ec:
            r22 = r1
        L_0x02ee:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3905V
            boolean r0 = r0.o()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f3908Y
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f3948t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0373
            boolean r0 = r15.f3940p
            if (r0 != 0) goto L_0x0373
            if (r55 == 0) goto L_0x031b
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f3918e
            if (r0 == 0) goto L_0x031b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f3989h
            boolean r2 = r1.f3978j
            if (r2 == 0) goto L_0x031b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            boolean r0 = r0.f3978j
            if (r0 != 0) goto L_0x0325
        L_0x031b:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            goto L_0x0389
        L_0x0325:
            if (r55 == 0) goto L_0x0371
            int r0 = r1.f3975g
            r12 = r54
            r11 = r33
            r12.f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f3918e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            int r0 = r0.f3975g
            r10 = r32
            r12.f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x035b
            if (r4 == 0) goto L_0x035b
            boolean[] r0 = r15.f3922g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x035b
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x035b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3900Q
            androidx.constraintlayout.core.SolverVariable r0 = r12.q(r0)
            r3 = 8
            r12.h(r0, r10, r1, r3)
        L_0x035b:
            r46 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x042a
        L_0x0371:
            r12 = r54
        L_0x0373:
            r46 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
            goto L_0x042a
        L_0x0389:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x0395
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3900Q
            androidx.constraintlayout.core.SolverVariable r0 = r12.q(r0)
            r7 = r0
            goto L_0x0397
        L_0x0395:
            r7 = r40
        L_0x0397:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x03a4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3898O
            androidx.constraintlayout.core.SolverVariable r0 = r12.q(r0)
            r16 = r0
            goto L_0x03a6
        L_0x03a4:
            r16 = r40
        L_0x03a6:
            boolean[] r0 = r15.f3922g
            r19 = 0
            boolean r21 = r0[r19]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f3909Z
            r32 = r0[r19]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.f3898O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f3900Q
            r33 = r2
            int r2 = r15.f3921f0
            r41 = r2
            int r2 = r15.f3935m0
            int[] r3 = r15.f3888H
            r43 = r3[r19]
            float r3 = r15.f3939o0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03cb
            r44 = r20
            goto L_0x03cd
        L_0x03cb:
            r44 = r19
        L_0x03cd:
            int r0 = r15.f3960z
            r24 = r0
            int r0 = r15.f3874A
            r25 = r0
            float r0 = r15.f3876B
            r26 = r0
            r0 = 1
            r17 = r33
            r33 = r41
            r41 = r2
            r2 = r0
            r0 = r53
            r45 = r1
            r1 = r54
            r42 = r3
            r3 = r4
            r46 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r45
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r43
            r16 = r42
            r17 = r18
            r18 = r44
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x042a:
            if (r55 == 0) goto L_0x0490
            r15 = r53
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f3920f
            if (r0 == 0) goto L_0x0483
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f3989h
            boolean r2 = r1.f3978j
            if (r2 == 0) goto L_0x0483
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            boolean r0 = r0.f3978j
            if (r0 == 0) goto L_0x0483
            int r0 = r1.f3975g
            r14 = r54
            r13 = r51
            r14.f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f3990i
            int r0 = r0.f3975g
            r12 = r50
            r14.f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f3920f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f4035k
            int r0 = r0.f3975g
            r1 = r49
            r14.f(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x047d
            if (r28 != 0) goto L_0x047d
            if (r47 == 0) goto L_0x047d
            boolean[] r2 = r15.f3922g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0479
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3901R
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r2 = 8
            r10 = 0
            r14.h(r0, r12, r10, r2)
            goto L_0x0481
        L_0x0479:
            r2 = 8
            r10 = 0
            goto L_0x0481
        L_0x047d:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0481:
            r7 = r10
            goto L_0x049f
        L_0x0483:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x049e
        L_0x0490:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x049e:
            r7 = r11
        L_0x049f:
            int r0 = r15.f3950u
            r3 = 2
            if (r0 != r3) goto L_0x04a6
            r6 = r10
            goto L_0x04a7
        L_0x04a6:
            r6 = r7
        L_0x04a7:
            if (r6 == 0) goto L_0x0588
            boolean r0 = r15.f3942q
            if (r0 != 0) goto L_0x0588
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f3909Z
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04bb
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.d
            if (r0 == 0) goto L_0x04bb
            r9 = r11
            goto L_0x04bc
        L_0x04bb:
            r9 = r10
        L_0x04bc:
            if (r9 == 0) goto L_0x04c0
            r34 = r10
        L_0x04c0:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x04cc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3901R
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r7 = r0
            goto L_0x04ce
        L_0x04cc:
            r7 = r40
        L_0x04ce:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f3911a0
            if (r0 == 0) goto L_0x04da
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3899P
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r6 = r0
            goto L_0x04dc
        L_0x04da:
            r6 = r40
        L_0x04dc:
            int r0 = r15.f3933l0
            if (r0 > 0) goto L_0x04e4
            int r0 = r15.f3947s0
            if (r0 != r2) goto L_0x0524
        L_0x04e4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3902S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f3867f
            if (r3 == 0) goto L_0x0511
            int r0 = r53.p()
            r14.e(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3902S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f3867f
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f3902S
            int r3 = r3.f()
            r14.e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x050e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f3901R
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r1 = 5
            r14.h(r7, r0, r10, r1)
        L_0x050e:
            r27 = r10
            goto L_0x0526
        L_0x0511:
            int r3 = r15.f3947s0
            if (r3 != r2) goto L_0x051d
            int r0 = r0.f()
            r14.e(r1, r13, r0, r2)
            goto L_0x0524
        L_0x051d:
            int r0 = r53.p()
            r14.e(r1, r13, r0, r2)
        L_0x0524:
            r27 = r38
        L_0x0526:
            boolean[] r0 = r15.f3922g
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f3909Z
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.f3899P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f3901R
            int r1 = r15.f3923g0
            int r2 = r15.f3937n0
            int[] r10 = r15.f3888H
            r16 = r10[r11]
            float r10 = r15.f3941p0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0547
            r18 = 1
            goto L_0x0549
        L_0x0547:
            r18 = r17
        L_0x0549:
            int r0 = r15.f3878C
            r24 = r0
            int r0 = r15.f3880D
            r25 = r0
            float r0 = r15.f3882E
            r26 = r0
            r0 = 0
            r19 = r2
            r2 = r0
            r0 = r53
            r20 = r1
            r1 = r54
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r46
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r20
            r38 = r13
            r13 = r34
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x058c
        L_0x0588:
            r33 = r12
            r38 = r13
        L_0x058c:
            r7 = r53
            if (r32 == 0) goto L_0x05b6
            int r0 = r7.f3884F
            r6 = 8
            r1 = 1
            if (r0 != r1) goto L_0x05a7
            float r5 = r7.f3886G
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05b6
        L_0x05a7:
            float r5 = r7.f3886G
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            r0.k(r1, r2, r3, r4, r5, r6)
        L_0x05b6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.f3905V
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x05de
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.f3905V
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.j()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.h()
            float r1 = r7.f3890I
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.f3905V
            int r2 = r2.f()
            r3 = r54
            r3.b(r7, r0, r1, r2)
        L_0x05de:
            r0 = 0
            r7.f3940p = r0
            r7.f3942q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.d, boolean):void");
    }

    public boolean g0() {
        return this.f3944r;
    }

    public void g1(DimensionBehaviour dimensionBehaviour) {
        this.f3909Z[1] = dimensionBehaviour;
    }

    public boolean h() {
        if (this.f3947s0 != 8) {
            return true;
        }
        return false;
    }

    public boolean h0(int i4) {
        return this.f3908Y[i4];
    }

    public void h1(int i4, int i5, int i6, float f4) {
        this.f3956x = i4;
        this.f3878C = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.f3880D = i6;
        this.f3882E = f4;
        if (f4 > 0.0f && f4 < 1.0f && i4 == 0) {
            this.f3956x = 2;
        }
    }

    public boolean i0() {
        ConstraintAnchor constraintAnchor = this.f3898O;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f3867f;
        if (constraintAnchor2 != null && constraintAnchor2.f3867f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f3900Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f3867f;
        if (constraintAnchor4 == null || constraintAnchor4.f3867f != constraintAnchor3) {
            return false;
        }
        return true;
    }

    public void i1(float f4) {
        this.f3881D0[1] = f4;
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i4) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z3;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor o4 = o(type4);
                ConstraintAnchor o5 = constraintWidget.o(type2);
                ConstraintAnchor o6 = o(ConstraintAnchor.Type.RIGHT);
                o4.a(o5, 0);
                o6.a(o5, 0);
                o(type6).a(o5, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor o7 = constraintWidget.o(type2);
                o(type3).a(o7, 0);
                o(ConstraintAnchor.Type.BOTTOM).a(o7, 0);
                o(type7).a(o7, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                o(type8).a(constraintWidget.o(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                o(type9).a(constraintWidget.o(type9), 0);
                o(type6).a(constraintWidget.o(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                o(type10).a(constraintWidget.o(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                o(type11).a(constraintWidget.o(type11), 0);
                o(type7).a(constraintWidget.o(type2), 0);
            } else {
                ConstraintAnchor o8 = o(type);
                ConstraintAnchor o9 = constraintWidget.o(type2);
                if (o8.p(o9)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor o10 = o(ConstraintAnchor.Type.TOP);
                        ConstraintAnchor o11 = o(ConstraintAnchor.Type.BOTTOM);
                        if (o10 != null) {
                            o10.q();
                        }
                        if (o11 != null) {
                            o11.q();
                        }
                    } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor o12 = o(type12);
                        if (o12 != null) {
                            o12.q();
                        }
                        ConstraintAnchor o13 = o(type5);
                        if (o13.j() != o9) {
                            o13.q();
                        }
                        ConstraintAnchor g4 = o(type).g();
                        ConstraintAnchor o14 = o(type7);
                        if (o14.o()) {
                            g4.q();
                            o14.q();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor o15 = o(type5);
                        if (o15.j() != o9) {
                            o15.q();
                        }
                        ConstraintAnchor g5 = o(type).g();
                        ConstraintAnchor o16 = o(type6);
                        if (o16.o()) {
                            g5.q();
                            o16.q();
                        }
                    }
                    o8.a(o9, i4);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor o17 = o(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor o18 = o(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor o19 = o(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor o20 = o(type16);
            boolean z4 = true;
            if ((o17 == null || !o17.o()) && (o18 == null || !o18.o())) {
                j(type13, constraintWidget, type13, 0);
                j(type14, constraintWidget, type14, 0);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((o19 == null || !o19.o()) && (o20 == null || !o20.o())) {
                j(type15, constraintWidget, type15, 0);
                j(type16, constraintWidget, type16, 0);
            } else {
                z4 = false;
            }
            if (z3 && z4) {
                o(type5).a(constraintWidget.o(type5), 0);
            } else if (z3) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                o(type17).a(constraintWidget.o(type17), 0);
            } else if (z4) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                o(type18).a(constraintWidget.o(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                j(type19, constraintWidget, type2, 0);
                j(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                o(type5).a(constraintWidget.o(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.TOP;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                j(type20, constraintWidget, type2, 0);
                j(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                o(type5).a(constraintWidget.o(type2), 0);
            }
        }
    }

    public boolean j0() {
        return this.f3894K;
    }

    public void j1(int i4) {
        this.f3947s0 = i4;
    }

    public void k(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i4) {
        if (constraintAnchor.h() == this) {
            j(constraintAnchor.k(), constraintAnchor2.h(), constraintAnchor2.k(), i4);
        }
    }

    public boolean k0() {
        ConstraintAnchor constraintAnchor = this.f3899P;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f3867f;
        if (constraintAnchor2 != null && constraintAnchor2.f3867f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f3901R;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f3867f;
        if (constraintAnchor4 == null || constraintAnchor4.f3867f != constraintAnchor3) {
            return false;
        }
        return true;
    }

    public void k1(int i4) {
        this.f3913b0 = i4;
        int i5 = this.f3935m0;
        if (i4 < i5) {
            this.f3913b0 = i5;
        }
    }

    public void l(ConstraintWidget constraintWidget, float f4, int i4) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        e0(type, constraintWidget, type, i4, 0);
        this.f3890I = f4;
    }

    public boolean l0() {
        return this.f3895L;
    }

    public void l1(int i4) {
        if (i4 >= 0 && i4 <= 3) {
            this.f3952v = i4;
        }
    }

    public void m(d dVar) {
        dVar.q(this.f3898O);
        dVar.q(this.f3899P);
        dVar.q(this.f3900Q);
        dVar.q(this.f3901R);
        if (this.f3933l0 > 0) {
            dVar.q(this.f3902S);
        }
    }

    public boolean m0() {
        if (!this.f3926i || this.f3947s0 == 8) {
            return false;
        }
        return true;
    }

    public void m1(int i4) {
        this.f3921f0 = i4;
    }

    public void n() {
        if (this.f3918e == null) {
            this.f3918e = new j(this);
        }
        if (this.f3920f == null) {
            this.f3920f = new l(this);
        }
    }

    public boolean n0() {
        if (this.f3940p || (this.f3898O.n() && this.f3900Q.n())) {
            return true;
        }
        return false;
    }

    public void n1(int i4) {
        this.f3923g0 = i4;
    }

    public ConstraintAnchor o(ConstraintAnchor.Type type) {
        switch (a.f3963a[type.ordinal()]) {
            case 1:
                return this.f3898O;
            case 2:
                return this.f3899P;
            case 3:
                return this.f3900Q;
            case 4:
                return this.f3901R;
            case 5:
                return this.f3902S;
            case 6:
                return this.f3905V;
            case 7:
                return this.f3903T;
            case 8:
                return this.f3904U;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean o0() {
        if (this.f3942q || (this.f3899P.n() && this.f3901R.n())) {
            return true;
        }
        return false;
    }

    public void o1(boolean z3, boolean z4, boolean z5, boolean z6) {
        if (this.f3884F == -1) {
            if (z5 && !z6) {
                this.f3884F = 0;
            } else if (!z5 && z6) {
                this.f3884F = 1;
                if (this.f3919e0 == -1) {
                    this.f3886G = 1.0f / this.f3886G;
                }
            }
        }
        if (this.f3884F == 0 && (!this.f3899P.o() || !this.f3901R.o())) {
            this.f3884F = 1;
        } else if (this.f3884F == 1 && (!this.f3898O.o() || !this.f3900Q.o())) {
            this.f3884F = 0;
        }
        if (this.f3884F == -1 && (!this.f3899P.o() || !this.f3901R.o() || !this.f3898O.o() || !this.f3900Q.o())) {
            if (this.f3899P.o() && this.f3901R.o()) {
                this.f3884F = 0;
            } else if (this.f3898O.o() && this.f3900Q.o()) {
                this.f3886G = 1.0f / this.f3886G;
                this.f3884F = 1;
            }
        }
        if (this.f3884F == -1) {
            int i4 = this.f3960z;
            if (i4 > 0 && this.f3878C == 0) {
                this.f3884F = 0;
            } else if (i4 == 0 && this.f3878C > 0) {
                this.f3886G = 1.0f / this.f3886G;
                this.f3884F = 1;
            }
        }
    }

    public int p() {
        return this.f3933l0;
    }

    public boolean p0() {
        return this.f3946s;
    }

    public void p1(boolean z3, boolean z4) {
        int i4;
        int i5;
        boolean k4 = z3 & this.f3918e.k();
        boolean k5 = z4 & this.f3920f.k();
        j jVar = this.f3918e;
        int i6 = jVar.f3989h.f3975g;
        l lVar = this.f3920f;
        int i7 = lVar.f3989h.f3975g;
        int i8 = jVar.f3990i.f3975g;
        int i9 = lVar.f3990i.f3975g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i6 = 0;
            i9 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (k4) {
            this.f3921f0 = i6;
        }
        if (k5) {
            this.f3923g0 = i7;
        }
        if (this.f3947s0 == 8) {
            this.f3913b0 = 0;
            this.f3915c0 = 0;
            return;
        }
        if (k4) {
            if (this.f3909Z[0] == DimensionBehaviour.FIXED && i11 < (i5 = this.f3913b0)) {
                i11 = i5;
            }
            this.f3913b0 = i11;
            int i13 = this.f3935m0;
            if (i11 < i13) {
                this.f3913b0 = i13;
            }
        }
        if (k5) {
            if (this.f3909Z[1] == DimensionBehaviour.FIXED && i12 < (i4 = this.f3915c0)) {
                i12 = i4;
            }
            this.f3915c0 = i12;
            int i14 = this.f3937n0;
            if (i12 < i14) {
                this.f3915c0 = i14;
            }
        }
    }

    public float q(int i4) {
        if (i4 == 0) {
            return this.f3939o0;
        }
        if (i4 == 1) {
            return this.f3941p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f3944r = true;
    }

    public void q1(d dVar, boolean z3) {
        l lVar;
        j jVar;
        int x3 = dVar.x(this.f3898O);
        int x4 = dVar.x(this.f3899P);
        int x5 = dVar.x(this.f3900Q);
        int x6 = dVar.x(this.f3901R);
        if (z3 && (jVar = this.f3918e) != null) {
            DependencyNode dependencyNode = jVar.f3989h;
            if (dependencyNode.f3978j) {
                DependencyNode dependencyNode2 = jVar.f3990i;
                if (dependencyNode2.f3978j) {
                    x3 = dependencyNode.f3975g;
                    x5 = dependencyNode2.f3975g;
                }
            }
        }
        if (z3 && (lVar = this.f3920f) != null) {
            DependencyNode dependencyNode3 = lVar.f3989h;
            if (dependencyNode3.f3978j) {
                DependencyNode dependencyNode4 = lVar.f3990i;
                if (dependencyNode4.f3978j) {
                    x4 = dependencyNode3.f3975g;
                    x6 = dependencyNode4.f3975g;
                }
            }
        }
        int i4 = x6 - x4;
        if (x5 - x3 < 0 || i4 < 0 || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE || x5 == Integer.MIN_VALUE || x5 == Integer.MAX_VALUE || x6 == Integer.MIN_VALUE || x6 == Integer.MAX_VALUE) {
            x3 = 0;
            x6 = 0;
            x4 = 0;
            x5 = 0;
        }
        J0(x3, x4, x5, x6);
    }

    public int r() {
        return Y() + this.f3915c0;
    }

    public void r0() {
        this.f3946s = true;
    }

    public Object s() {
        return this.f3943q0;
    }

    public boolean s0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f3909Z;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2) {
            return true;
        }
        return false;
    }

    public String t() {
        return this.f3951u0;
    }

    public void t0() {
        this.f3898O.q();
        this.f3899P.q();
        this.f3900Q.q();
        this.f3901R.q();
        this.f3902S.q();
        this.f3903T.q();
        this.f3904U.q();
        this.f3905V.q();
        this.f3911a0 = null;
        this.f3890I = 0.0f;
        this.f3913b0 = 0;
        this.f3915c0 = 0;
        this.f3917d0 = 0.0f;
        this.f3919e0 = -1;
        this.f3921f0 = 0;
        this.f3923g0 = 0;
        this.f3929j0 = 0;
        this.f3931k0 = 0;
        this.f3933l0 = 0;
        this.f3935m0 = 0;
        this.f3937n0 = 0;
        float f4 = f3873K0;
        this.f3939o0 = f4;
        this.f3941p0 = f4;
        DimensionBehaviour[] dimensionBehaviourArr = this.f3909Z;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f3943q0 = null;
        this.f3945r0 = 0;
        this.f3947s0 = 0;
        this.f3953v0 = null;
        this.f3955w0 = false;
        this.f3957x0 = false;
        this.f3961z0 = 0;
        this.f3875A0 = 0;
        this.f3877B0 = false;
        this.f3879C0 = false;
        float[] fArr = this.f3881D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3948t = -1;
        this.f3950u = -1;
        int[] iArr = this.f3888H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f3954w = 0;
        this.f3956x = 0;
        this.f3876B = 1.0f;
        this.f3882E = 1.0f;
        this.f3874A = Integer.MAX_VALUE;
        this.f3880D = Integer.MAX_VALUE;
        this.f3960z = 0;
        this.f3878C = 0;
        this.f3924h = false;
        this.f3884F = -1;
        this.f3886G = 1.0f;
        this.f3959y0 = false;
        boolean[] zArr = this.f3922g;
        zArr[0] = true;
        zArr[1] = true;
        this.f3895L = false;
        boolean[] zArr2 = this.f3908Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3926i = true;
        int[] iArr2 = this.f3958y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f3932l = -1;
        this.f3934m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f3953v0 != null) {
            str = "type: " + this.f3953v0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f3951u0 != null) {
            str2 = "id: " + this.f3951u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f3921f0);
        sb.append(", ");
        sb.append(this.f3923g0);
        sb.append(") - (");
        sb.append(this.f3913b0);
        sb.append(" x ");
        sb.append(this.f3915c0);
        sb.append(")");
        return sb.toString();
    }

    public DimensionBehaviour u(int i4) {
        if (i4 == 0) {
            return A();
        }
        if (i4 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        ConstraintWidget K3 = K();
        if (K3 == null || !(K3 instanceof d) || !((d) K()).L1()) {
            int size = this.f3907X.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((ConstraintAnchor) this.f3907X.get(i4)).q();
            }
        }
    }

    public float v() {
        return this.f3917d0;
    }

    public void v0() {
        this.f3940p = false;
        this.f3942q = false;
        this.f3944r = false;
        this.f3946s = false;
        int size = this.f3907X.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((ConstraintAnchor) this.f3907X.get(i4)).r();
        }
    }

    public int w() {
        return this.f3919e0;
    }

    public void w0(androidx.constraintlayout.core.c cVar) {
        this.f3898O.s(cVar);
        this.f3899P.s(cVar);
        this.f3900Q.s(cVar);
        this.f3901R.s(cVar);
        this.f3902S.s(cVar);
        this.f3905V.s(cVar);
        this.f3903T.s(cVar);
        this.f3904U.s(cVar);
    }

    public int x() {
        if (this.f3947s0 == 8) {
            return 0;
        }
        return this.f3915c0;
    }

    public float y() {
        return this.f3939o0;
    }

    public int z() {
        return this.f3961z0;
    }
}
