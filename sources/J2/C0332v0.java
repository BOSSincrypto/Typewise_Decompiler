package J2;

/* renamed from: J2.v0  reason: case insensitive filesystem */
public abstract class C0332v0 {
    public static /* synthetic */ void c(C0332v0 v0Var, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                i4 = v0Var.d() + 1;
            }
            v0Var.b(i4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    public abstract Object a();

    public abstract void b(int i4);

    public abstract int d();
}
