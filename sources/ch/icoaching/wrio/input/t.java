package ch.icoaching.wrio.input;

import java.util.List;
import kotlin.jvm.internal.o;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final String f9819a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9820b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9821c;

    public t(String str, List list, int i4) {
        o.e(str, "contentNew");
        o.e(list, "touchPointsNew");
        this.f9819a = str;
        this.f9820b = list;
        this.f9821c = i4;
    }

    public final String a() {
        return this.f9819a;
    }

    public final int b() {
        return this.f9821c;
    }

    public final List c() {
        return this.f9820b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return o.a(this.f9819a, tVar.f9819a) && o.a(this.f9820b, tVar.f9820b) && this.f9821c == tVar.f9821c;
    }

    public int hashCode() {
        return (((this.f9819a.hashCode() * 31) + this.f9820b.hashCode()) * 31) + this.f9821c;
    }

    public String toString() {
        return "UpdatedContentEvent(contentNew=" + this.f9819a + ", touchPointsNew=" + this.f9820b + ", cursorPosition=" + this.f9821c + ')';
    }
}
