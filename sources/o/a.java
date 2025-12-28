package O;

import java.nio.ByteBuffer;

public final class a extends c {
    public a f(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
        return this;
    }

    public void g(int i4, ByteBuffer byteBuffer) {
        c(i4, byteBuffer);
    }

    public int h(int i4) {
        int b4 = b(16);
        if (b4 != 0) {
            return this.f1057b.getInt(d(b4) + (i4 * 4));
        }
        return 0;
    }

    public int i() {
        int b4 = b(16);
        if (b4 != 0) {
            return e(b4);
        }
        return 0;
    }

    public boolean j() {
        int b4 = b(6);
        if (b4 == 0 || this.f1057b.get(b4 + this.f1056a) == 0) {
            return false;
        }
        return true;
    }

    public short k() {
        int b4 = b(14);
        if (b4 != 0) {
            return this.f1057b.getShort(b4 + this.f1056a);
        }
        return 0;
    }

    public int l() {
        int b4 = b(4);
        if (b4 != 0) {
            return this.f1057b.getInt(b4 + this.f1056a);
        }
        return 0;
    }

    public short m() {
        int b4 = b(8);
        if (b4 != 0) {
            return this.f1057b.getShort(b4 + this.f1056a);
        }
        return 0;
    }

    public short n() {
        int b4 = b(12);
        if (b4 != 0) {
            return this.f1057b.getShort(b4 + this.f1056a);
        }
        return 0;
    }
}
