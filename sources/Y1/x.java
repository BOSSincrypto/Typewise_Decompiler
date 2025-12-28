package Y1;

import java.nio.ByteBuffer;

public abstract class x {
    protected x() {
    }

    public abstract ByteBuffer a();

    public abstract int b();

    public abstract int[] c();

    public abstract String d();

    public abstract String[] e();

    public abstract w f();

    public abstract int g();

    public String toString() {
        int g4 = g();
        if (g4 == 0) {
            return d();
        }
        if (g4 == 1) {
            return "(binary blob)";
        }
        if (g4 == 2) {
            return "(table)";
        }
        if (g4 == 7) {
            return Integer.toString(b());
        }
        if (g4 == 8) {
            return "(array)";
        }
        if (g4 != 14) {
            return "???";
        }
        int[] c4 = c();
        StringBuilder sb = new StringBuilder("[");
        sb.append(c4.length);
        sb.append("]{");
        if (c4.length != 0) {
            sb.append(c4[0]);
            for (int i4 = 1; i4 < c4.length; i4++) {
                sb.append(", ");
                sb.append(c4[i4]);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
