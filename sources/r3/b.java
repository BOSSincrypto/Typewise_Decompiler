package r3;

import kotlin.jvm.internal.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f16054a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16055b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16056c;

    public b(String str, int i4, int i5) {
        o.e(str, "languageCode");
        this.f16054a = str;
        this.f16055b = i4;
        this.f16056c = i5;
    }

    public final String a() {
        return this.f16054a;
    }

    public final int b() {
        return this.f16055b;
    }

    public final int c() {
        return this.f16056c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (o.a(this.f16054a, bVar.f16054a) && this.f16055b == bVar.f16055b && this.f16056c == bVar.f16056c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f16054a.hashCode() * 31) + this.f16055b) * 31) + this.f16056c;
    }

    public String toString() {
        return "WordDataForLanguage(languageCode=" + this.f16054a + ", timesTyped=" + this.f16055b + ", wordList=" + this.f16056c + ')';
    }
}
