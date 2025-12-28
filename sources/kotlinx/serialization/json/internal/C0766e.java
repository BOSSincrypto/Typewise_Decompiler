package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

/* renamed from: kotlinx.serialization.json.internal.e  reason: case insensitive filesystem */
public final class C0766e extends C0767f {

    /* renamed from: c  reason: collision with root package name */
    public static final C0766e f14388c = new C0766e();

    private C0766e() {
    }

    public final void c(char[] cArr) {
        o.e(cArr, "array");
        a(cArr);
    }

    public final char[] d() {
        return super.b(Uuid.SIZE_BITS);
    }
}
