package kotlinx.serialization.json.internal;

import A2.c;
import F2.b;
import H2.e;
import H2.f;
import H2.m;
import H2.n;
import kotlin.jvm.internal.o;
import kotlinx.serialization.modules.d;
import u2.l;

public final class I implements d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14345a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14346b;

    public I(boolean z3, String str) {
        o.e(str, "discriminator");
        this.f14345a = z3;
        this.f14346b = str;
    }

    private final void f(f fVar, c cVar) {
        int d4 = fVar.d();
        int i4 = 0;
        while (i4 < d4) {
            String e4 = fVar.e(i4);
            if (!o.a(e4, this.f14346b)) {
                i4++;
            } else {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + e4 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(f fVar, c cVar) {
        m c4 = fVar.c();
        if ((c4 instanceof H2.d) || o.a(c4, m.a.f573a)) {
            throw new IllegalArgumentException("Serializer for " + cVar.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + c4 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (!this.f14345a) {
            if (o.a(c4, n.b.f576a) || o.a(c4, n.c.f577a) || (c4 instanceof e) || (c4 instanceof m.b)) {
                throw new IllegalArgumentException("Serializer for " + cVar.b() + " of kind " + c4 + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    public void a(c cVar, b bVar) {
        d.a.b(this, cVar, bVar);
    }

    public void b(c cVar, l lVar) {
        o.e(cVar, "kClass");
        o.e(lVar, "provider");
    }

    public void c(c cVar, l lVar) {
        o.e(cVar, "baseClass");
        o.e(lVar, "defaultDeserializerProvider");
    }

    public void d(c cVar, c cVar2, b bVar) {
        o.e(cVar, "baseClass");
        o.e(cVar2, "actualClass");
        o.e(bVar, "actualSerializer");
        f a4 = bVar.a();
        g(a4, cVar2);
        if (!this.f14345a) {
            f(a4, cVar2);
        }
    }

    public void e(c cVar, l lVar) {
        o.e(cVar, "baseClass");
        o.e(lVar, "defaultSerializerProvider");
    }
}
