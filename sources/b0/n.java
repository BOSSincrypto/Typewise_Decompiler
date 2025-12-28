package B0;

import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import kotlin.jvm.internal.o;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final TextCase f146a;

    /* renamed from: b  reason: collision with root package name */
    private final TextCase f147b;

    public n(TextCase textCase, TextCase textCase2) {
        o.e(textCase, "finalCase");
        o.e(textCase2, "penultimateCase");
        this.f146a = textCase;
        this.f147b = textCase2;
    }

    public final TextCase a() {
        return this.f146a;
    }

    public final TextCase b() {
        return this.f147b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f146a == nVar.f146a && this.f147b == nVar.f147b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f146a.hashCode() * 31) + this.f147b.hashCode();
    }

    public String toString() {
        TextCase textCase = this.f146a;
        TextCase textCase2 = this.f147b;
        return "StringCasing(finalCase=" + textCase + ", penultimateCase=" + textCase2 + ")";
    }
}
