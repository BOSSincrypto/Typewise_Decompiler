package J2;

import F2.b;
import H2.f;
import I2.e;
import java.util.Arrays;
import kotlin.c;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;

public final class A implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Enum[] f603a;

    /* renamed from: b  reason: collision with root package name */
    private f f604b;

    /* renamed from: c  reason: collision with root package name */
    private final l2.f f605c;

    public A(String str, Enum[] enumArr) {
        o.e(str, "serialName");
        o.e(enumArr, "values");
        this.f603a = enumArr;
        this.f605c = c.b(new C0339z(this, str));
    }

    private final f g(String str) {
        C0337y yVar = new C0337y(str, this.f603a.length);
        for (Enum name : this.f603a) {
            C0326s0.q(yVar, name.name(), false, 2, (Object) null);
        }
        return yVar;
    }

    /* access modifiers changed from: private */
    public static final f h(A a4, String str) {
        f fVar = a4.f604b;
        if (fVar == null) {
            return a4.g(str);
        }
        return fVar;
    }

    public f a() {
        return (f) this.f605c.getValue();
    }

    /* renamed from: i */
    public Enum b(e eVar) {
        o.e(eVar, "decoder");
        int F3 = eVar.F(a());
        if (F3 >= 0) {
            Enum[] enumArr = this.f603a;
            if (F3 < enumArr.length) {
                return enumArr[F3];
            }
        }
        throw new SerializationException(F3 + " is not among valid " + a().b() + " enum values, values size is " + this.f603a.length);
    }

    /* renamed from: j */
    public void e(I2.f fVar, Enum enumR) {
        o.e(fVar, "encoder");
        o.e(enumR, "value");
        int J3 = C0713h.J(this.f603a, enumR);
        if (J3 != -1) {
            fVar.e(a(), J3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(enumR);
        sb.append(" is not a valid enum ");
        sb.append(a().b());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f603a);
        o.d(arrays, "toString(...)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().b() + '>';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A(String str, Enum[] enumArr, f fVar) {
        this(str, enumArr);
        o.e(str, "serialName");
        o.e(enumArr, "values");
        o.e(fVar, "descriptor");
        this.f604b = fVar;
    }
}
