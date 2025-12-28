package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class m {

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f5524a;

        a(ByteBuffer byteBuffer) {
            this.f5524a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void a(int i4) {
            ByteBuffer byteBuffer = this.f5524a;
            byteBuffer.position(byteBuffer.position() + i4);
        }

        public long b() {
            return m.c(this.f5524a.getInt());
        }

        public int c() {
            return this.f5524a.getInt();
        }

        public long getPosition() {
            return (long) this.f5524a.position();
        }

        public int readUnsignedShort() {
            return m.d(this.f5524a.getShort());
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f5525a;

        /* renamed from: b  reason: collision with root package name */
        private final long f5526b;

        b(long j4, long j5) {
            this.f5525a = j4;
            this.f5526b = j5;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.f5525a;
        }
    }

    private interface c {
        void a(int i4);

        long b();

        int c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j4;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.a(6);
            int i4 = 0;
            while (true) {
                if (i4 >= readUnsignedShort) {
                    j4 = -1;
                    break;
                }
                int c4 = cVar.c();
                cVar.a(4);
                j4 = cVar.b();
                cVar.a(4);
                if (1835365473 == c4) {
                    break;
                }
                i4++;
            }
            if (j4 != -1) {
                cVar.a((int) (j4 - cVar.getPosition()));
                cVar.a(12);
                long b4 = cVar.b();
                for (int i5 = 0; ((long) i5) < b4; i5++) {
                    int c5 = cVar.c();
                    long b5 = cVar.b();
                    long b6 = cVar.b();
                    if (1164798569 == c5 || 1701669481 == c5) {
                        return new b(b5 + j4, b6);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static O.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return O.b.h(duplicate);
    }

    static long c(int i4) {
        return ((long) i4) & 4294967295L;
    }

    static int d(short s4) {
        return s4 & 65535;
    }
}
