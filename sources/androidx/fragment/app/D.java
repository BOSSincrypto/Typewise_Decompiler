package androidx.fragment.app;

import java.io.Writer;
import kotlin.uuid.Uuid;

final class D extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f5658a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f5659b = new StringBuilder(Uuid.SIZE_BITS);

    D(String str) {
        this.f5658a = str;
    }

    private void a() {
        if (this.f5659b.length() > 0) {
            this.f5659b.toString();
            StringBuilder sb = this.f5659b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == 10) {
                a();
            } else {
                this.f5659b.append(c4);
            }
        }
    }
}
