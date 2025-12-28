package Y1;

import a2.C0363e;
import a2.C0364f;
import a2.i;

public class p extends i {

    /* renamed from: a  reason: collision with root package name */
    private C0363e f2053a;

    /* renamed from: b  reason: collision with root package name */
    private int f2054b;

    public p(String str) {
        if (str != null) {
            this.f2053a = new C0364f(str);
            this.f2054b = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return this.f2054b;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int g() {
        return this.f2053a.length();
    }

    public int j() {
        if (this.f2054b >= this.f2053a.length()) {
            return -1;
        }
        C0363e eVar = this.f2053a;
        int i4 = this.f2054b;
        this.f2054b = i4 + 1;
        return eVar.charAt(i4);
    }

    public int l() {
        int i4 = this.f2054b;
        if (i4 <= 0) {
            return -1;
        }
        C0363e eVar = this.f2053a;
        int i5 = i4 - 1;
        this.f2054b = i5;
        return eVar.charAt(i5);
    }

    public void o(int i4) {
        if (i4 < 0 || i4 > this.f2053a.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.f2054b = i4;
    }
}
