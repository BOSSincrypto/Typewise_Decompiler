package J2;

import F2.b;
import H2.f;
import I2.e;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;

/* renamed from: J2.e0  reason: case insensitive filesystem */
public final class C0299e0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0299e0 f695a = new C0299e0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f696b = C0297d0.f692a;

    private C0299e0() {
    }

    public f a() {
        return f696b;
    }

    /* renamed from: f */
    public Void b(e eVar) {
        o.e(eVar, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    /* renamed from: g */
    public void e(I2.f fVar, Void voidR) {
        o.e(fVar, "encoder");
        o.e(voidR, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
