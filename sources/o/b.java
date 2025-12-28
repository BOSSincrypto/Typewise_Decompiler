package O;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
        return this;
    }

    public void g(int i4, ByteBuffer byteBuffer) {
        c(i4, byteBuffer);
    }

    public a j(a aVar, int i4) {
        int b4 = b(6);
        if (b4 != 0) {
            return aVar.f(a(d(b4) + (i4 * 4)), this.f1057b);
        }
        return null;
    }

    public int k() {
        int b4 = b(6);
        if (b4 != 0) {
            return e(b4);
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
}
