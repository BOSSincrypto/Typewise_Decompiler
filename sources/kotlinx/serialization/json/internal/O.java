package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;

public final class O extends M {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(String str) {
        super(str);
        o.e(str, "source");
    }

    public byte F() {
        String R3 = C();
        int J3 = J();
        if (J3 >= R3.length() || J3 == -1) {
            return 10;
        }
        this.f14379a = J3;
        return C0763b.a(R3.charAt(J3));
    }

    public int J() {
        int i4;
        int i5 = this.f14379a;
        if (i5 == -1) {
            return i5;
        }
        String R3 = C();
        while (i5 < R3.length()) {
            char charAt = R3.charAt(i5);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                if (charAt != '/' || (i4 = i5 + 1) >= R3.length()) {
                    break;
                }
                char charAt2 = R3.charAt(i4);
                if (charAt2 == '*') {
                    int V3 = kotlin.text.o.V(R3, "*/", i5 + 2, false, 4, (Object) null);
                    if (V3 != -1) {
                        i5 = V3 + 2;
                    } else {
                        this.f14379a = R3.length();
                        C0762a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String) null, 6, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else if (charAt2 != '/') {
                    break;
                } else {
                    i5 = kotlin.text.o.U(R3, 10, i5 + 2, false, 4, (Object) null);
                    if (i5 == -1) {
                        i5 = R3.length();
                    }
                }
            }
            i5++;
        }
        this.f14379a = i5;
        return i5;
    }

    public boolean e() {
        int J3 = J();
        if (J3 >= C().length() || J3 == -1) {
            return false;
        }
        return D(C().charAt(J3));
    }

    public byte j() {
        String R3 = C();
        int J3 = J();
        if (J3 >= R3.length() || J3 == -1) {
            return 10;
        }
        this.f14379a = J3 + 1;
        return C0763b.a(R3.charAt(J3));
    }

    public void l(char c4) {
        String R3 = C();
        int J3 = J();
        if (J3 >= R3.length() || J3 == -1) {
            this.f14379a = -1;
            P(c4);
        }
        char charAt = R3.charAt(J3);
        this.f14379a = J3 + 1;
        if (charAt != c4) {
            P(c4);
        }
    }
}
