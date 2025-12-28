package f1;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: f1.a  reason: case insensitive filesystem */
public class C0648a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f13583a;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    public static class C0187a implements e.a {
        public Class a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public e b(ByteBuffer byteBuffer) {
            return new C0648a(byteBuffer);
        }
    }

    public C0648a(ByteBuffer byteBuffer) {
        this.f13583a = byteBuffer;
    }

    public void b() {
    }

    /* renamed from: c */
    public ByteBuffer a() {
        this.f13583a.position(0);
        return this.f13583a;
    }
}
