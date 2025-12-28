package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {

    /* renamed from: a  reason: collision with root package name */
    private HashSet f3862a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f3863b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3864c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintWidget f3865d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f3866e;

    /* renamed from: f  reason: collision with root package name */
    public ConstraintAnchor f3867f;

    /* renamed from: g  reason: collision with root package name */
    public int f3868g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f3869h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    SolverVariable f3870i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3872a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3872a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f3872a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.a.<clinit>():void");
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f3865d = constraintWidget;
        this.f3866e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i4) {
        return b(constraintAnchor, i4, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i4, int i5, boolean z3) {
        if (constraintAnchor == null) {
            q();
            return true;
        } else if (!z3 && !p(constraintAnchor)) {
            return false;
        } else {
            this.f3867f = constraintAnchor;
            if (constraintAnchor.f3862a == null) {
                constraintAnchor.f3862a = new HashSet();
            }
            HashSet hashSet = this.f3867f.f3862a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f3868g = i4;
            this.f3869h = i5;
            return true;
        }
    }

    public void c(int i4, ArrayList arrayList, m mVar) {
        HashSet hashSet = this.f3862a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g.a(((ConstraintAnchor) it.next()).f3865d, i4, arrayList, mVar);
            }
        }
    }

    public HashSet d() {
        return this.f3862a;
    }

    public int e() {
        if (!this.f3864c) {
            return 0;
        }
        return this.f3863b;
    }

    public int f() {
        ConstraintAnchor constraintAnchor;
        if (this.f3865d.V() == 8) {
            return 0;
        }
        if (this.f3869h == Integer.MIN_VALUE || (constraintAnchor = this.f3867f) == null || constraintAnchor.f3865d.V() != 8) {
            return this.f3868g;
        }
        return this.f3869h;
    }

    public final ConstraintAnchor g() {
        switch (a.f3872a[this.f3866e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f3865d.f3900Q;
            case 3:
                return this.f3865d.f3898O;
            case 4:
                return this.f3865d.f3901R;
            case 5:
                return this.f3865d.f3899P;
            default:
                throw new AssertionError(this.f3866e.name());
        }
    }

    public ConstraintWidget h() {
        return this.f3865d;
    }

    public SolverVariable i() {
        return this.f3870i;
    }

    public ConstraintAnchor j() {
        return this.f3867f;
    }

    public Type k() {
        return this.f3866e;
    }

    public boolean l() {
        HashSet hashSet = this.f3862a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f3862a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return this.f3864c;
    }

    public boolean o() {
        if (this.f3867f != null) {
            return true;
        }
        return false;
    }

    public boolean p(ConstraintAnchor constraintAnchor) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type k4 = constraintAnchor.k();
        Type type = this.f3866e;
        if (k4 != type) {
            switch (a.f3872a[type.ordinal()]) {
                case 1:
                    if (k4 == Type.BASELINE || k4 == Type.CENTER_X || k4 == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (k4 == Type.LEFT || k4 == Type.RIGHT) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(constraintAnchor.h() instanceof f)) {
                        return z3;
                    }
                    if (z3 || k4 == Type.CENTER_X) {
                        z5 = true;
                    }
                    return z5;
                case 4:
                case 5:
                    if (k4 == Type.TOP || k4 == Type.BOTTOM) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!(constraintAnchor.h() instanceof f)) {
                        return z4;
                    }
                    if (z4 || k4 == Type.CENTER_Y) {
                        z5 = true;
                    }
                    return z5;
                case 6:
                    if (k4 == Type.LEFT || k4 == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f3866e.name());
            }
        } else if (type != Type.BASELINE || (constraintAnchor.h().Z() && h().Z())) {
            return true;
        } else {
            return false;
        }
    }

    public void q() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.f3867f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f3862a) == null)) {
            hashSet.remove(this);
            if (this.f3867f.f3862a.size() == 0) {
                this.f3867f.f3862a = null;
            }
        }
        this.f3862a = null;
        this.f3867f = null;
        this.f3868g = 0;
        this.f3869h = Integer.MIN_VALUE;
        this.f3864c = false;
        this.f3863b = 0;
    }

    public void r() {
        this.f3864c = false;
        this.f3863b = 0;
    }

    public void s(c cVar) {
        SolverVariable solverVariable = this.f3870i;
        if (solverVariable == null) {
            this.f3870i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.e();
        }
    }

    public void t(int i4) {
        this.f3863b = i4;
        this.f3864c = true;
    }

    public String toString() {
        return this.f3865d.t() + ":" + this.f3866e.toString();
    }

    public void u(int i4) {
        if (o()) {
            this.f3869h = i4;
        }
    }
}
