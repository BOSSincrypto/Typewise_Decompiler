package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

final class p implements i {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f5021a;

    p(Object obj) {
        this.f5021a = o.a(obj);
    }

    public String a() {
        return this.f5021a.toLanguageTags();
    }

    public Object b() {
        return this.f5021a;
    }

    public boolean equals(Object obj) {
        return this.f5021a.equals(((i) obj).b());
    }

    public Locale get(int i4) {
        return this.f5021a.get(i4);
    }

    public int hashCode() {
        return this.f5021a.hashCode();
    }

    public boolean isEmpty() {
        return this.f5021a.isEmpty();
    }

    public int size() {
        return this.f5021a.size();
    }

    public String toString() {
        return this.f5021a.toString();
    }
}
