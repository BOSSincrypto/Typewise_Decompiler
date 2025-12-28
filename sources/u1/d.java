package U1;

import android.app.PendingIntent;

final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f1490a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1491b;

    d(PendingIntent pendingIntent, boolean z3) {
        if (pendingIntent != null) {
            this.f1490a = pendingIntent;
            this.f1491b = z3;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!this.f1490a.equals(aVar.t()) || this.f1491b != aVar.u()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.f1490a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f1491b) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        return hashCode ^ i4;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent t() {
        return this.f1490a;
    }

    public final String toString() {
        String obj = this.f1490a.toString();
        boolean z3 = this.f1491b;
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + z3 + "}";
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return this.f1491b;
    }
}
