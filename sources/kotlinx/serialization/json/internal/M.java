package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;

public class M extends C0762a {

    /* renamed from: e  reason: collision with root package name */
    private final String f14374e;

    public M(String str) {
        o.e(str, "source");
        this.f14374e = str;
    }

    public String E(String str, boolean z3) {
        o.e(str, "keyToMatch");
        int i4 = this.f14379a;
        try {
            if (j() == 6) {
                if (o.a(G(z3), str)) {
                    t();
                    if (j() == 5) {
                        String G3 = G(z3);
                        this.f14379a = i4;
                        t();
                        return G3;
                    }
                }
            }
            return null;
        } finally {
            this.f14379a = i4;
            t();
        }
    }

    public int H(int i4) {
        if (i4 < C().length()) {
            return i4;
        }
        return -1;
    }

    public int J() {
        int i4 = this.f14379a;
        if (i4 == -1) {
            return i4;
        }
        String R3 = C();
        while (i4 < R3.length() && ((r2 = R3.charAt(i4)) == ' ' || r2 == 10 || r2 == 13 || r2 == 9)) {
            i4++;
        }
        this.f14379a = i4;
        return i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public String C() {
        return this.f14374e;
    }

    public boolean e() {
        int i4 = this.f14379a;
        if (i4 == -1) {
            return false;
        }
        String R3 = C();
        while (i4 < R3.length()) {
            char charAt = R3.charAt(i4);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i4++;
            } else {
                this.f14379a = i4;
                return D(charAt);
            }
        }
        this.f14379a = i4;
        return false;
    }

    public String i() {
        l('\"');
        int i4 = this.f14379a;
        int U3 = kotlin.text.o.U(C(), '\"', i4, false, 4, (Object) null);
        if (U3 != -1) {
            for (int i5 = i4; i5 < U3; i5++) {
                if (C().charAt(i5) == '\\') {
                    return p(C(), this.f14379a, i5);
                }
            }
            this.f14379a = U3 + 1;
            String substring = C().substring(i4, U3);
            o.d(substring, "substring(...)");
            return substring;
        }
        q();
        y((byte) 1, false);
        throw new KotlinNothingValueException();
    }

    public byte j() {
        String R3 = C();
        int i4 = this.f14379a;
        while (i4 != -1 && i4 < R3.length()) {
            int i5 = i4 + 1;
            char charAt = R3.charAt(i4);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i4 = i5;
            } else {
                this.f14379a = i5;
                return C0763b.a(charAt);
            }
        }
        this.f14379a = R3.length();
        return 10;
    }

    public void l(char c4) {
        if (this.f14379a == -1) {
            P(c4);
        }
        String R3 = C();
        int i4 = this.f14379a;
        while (i4 < R3.length()) {
            int i5 = i4 + 1;
            char charAt = R3.charAt(i4);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.f14379a = i5;
                if (charAt != c4) {
                    P(c4);
                } else {
                    return;
                }
            }
            i4 = i5;
        }
        this.f14379a = -1;
        P(c4);
    }
}
