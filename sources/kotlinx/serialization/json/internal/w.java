package kotlinx.serialization.json.internal;

import H2.f;
import I2.a;
import K2.C0341a;
import L2.b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import kotlin.text.D;

public final class w extends a {

    /* renamed from: a  reason: collision with root package name */
    private final C0762a f14401a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14402b;

    public w(C0762a aVar, C0341a aVar2) {
        o.e(aVar, "lexer");
        o.e(aVar2, "json");
        this.f14401a = aVar;
        this.f14402b = aVar2.a();
    }

    public short B() {
        C0762a aVar = this.f14401a;
        String q4 = aVar.q();
        try {
            return D.j(q4);
        } catch (IllegalArgumentException unused) {
            C0762a.x(aVar, "Failed to parse type '" + "UShort" + "' for input '" + q4 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public b a() {
        return this.f14402b;
    }

    public int e(f fVar) {
        o.e(fVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    public long f() {
        C0762a aVar = this.f14401a;
        String q4 = aVar.q();
        try {
            return D.g(q4);
        } catch (IllegalArgumentException unused) {
            C0762a.x(aVar, "Failed to parse type '" + "ULong" + "' for input '" + q4 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public int t() {
        C0762a aVar = this.f14401a;
        String q4 = aVar.q();
        try {
            return D.d(q4);
        } catch (IllegalArgumentException unused) {
            C0762a.x(aVar, "Failed to parse type '" + "UInt" + "' for input '" + q4 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public byte y() {
        C0762a aVar = this.f14401a;
        String q4 = aVar.q();
        try {
            return D.a(q4);
        } catch (IllegalArgumentException unused) {
            C0762a.x(aVar, "Failed to parse type '" + "UByte" + "' for input '" + q4 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }
}
