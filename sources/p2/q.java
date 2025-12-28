package P2;

import androidx.work.c;
import kotlin.jvm.internal.o;

public final class q implements F {

    /* renamed from: a  reason: collision with root package name */
    private final String f1177a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1178b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1179c;

    public q(String str, String str2, boolean z3) {
        o.e(str, "language");
        o.e(str2, "languageCode");
        this.f1177a = str;
        this.f1178b = str2;
        this.f1179c = z3;
    }

    public final String a() {
        return this.f1177a;
    }

    public final String b() {
        return this.f1178b;
    }

    public final boolean c() {
        return this.f1179c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (o.a(this.f1177a, qVar.f1177a) && o.a(this.f1178b, qVar.f1178b) && this.f1179c == qVar.f1179c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f1177a.hashCode() * 31) + this.f1178b.hashCode()) * 31) + c.a(this.f1179c);
    }

    public String toString() {
        return "DropdownLanguageItem(language=" + this.f1177a + ", languageCode=" + this.f1178b + ", isDominant=" + this.f1179c + ')';
    }
}
