package B0;

import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import kotlin.jvm.internal.o;

/* renamed from: B0.j  reason: case insensitive filesystem */
public final class C0262j {

    /* renamed from: a  reason: collision with root package name */
    private final String f120a;

    /* renamed from: b  reason: collision with root package name */
    private final TextCase f121b;

    public C0262j(String str, TextCase textCase) {
        o.e(str, "word");
        o.e(textCase, "stringCasing");
        this.f120a = str;
        this.f121b = textCase;
    }

    public final TextCase a() {
        return this.f121b;
    }

    public final String b() {
        return this.f120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0262j)) {
            return false;
        }
        C0262j jVar = (C0262j) obj;
        if (o.a(this.f120a, jVar.f120a) && this.f121b == jVar.f121b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f120a.hashCode() * 31) + this.f121b.hashCode();
    }

    public String toString() {
        String str = this.f120a;
        TextCase textCase = this.f121b;
        return "CasingResult(word=" + str + ", stringCasing=" + textCase + ")";
    }
}
