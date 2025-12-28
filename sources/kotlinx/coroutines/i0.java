package kotlinx.coroutines;

public class i0 extends m0 implements C0755t {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14141b = G0();

    public i0(g0 g0Var) {
        super(true);
        Z(g0Var);
    }

    private final boolean G0() {
        r rVar;
        m0 S3;
        r rVar2;
        C0753q V3 = V();
        if (V3 instanceof r) {
            rVar = (r) V3;
        } else {
            rVar = null;
        }
        if (!(rVar == null || (S3 = rVar.S()) == null)) {
            while (!S3.S()) {
                C0753q V4 = S3.V();
                if (V4 instanceof r) {
                    rVar2 = (r) V4;
                } else {
                    rVar2 = null;
                }
                if (rVar2 != null) {
                    S3 = rVar2.S();
                    if (S3 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean S() {
        return this.f14141b;
    }

    public boolean T() {
        return true;
    }
}
