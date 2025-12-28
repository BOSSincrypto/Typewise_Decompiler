package kotlinx.coroutines;

final class T implements C0729b0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14007a;

    public T(boolean z3) {
        this.f14007a = z3;
    }

    public boolean a() {
        return this.f14007a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (a()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public r0 u() {
        return null;
    }
}
