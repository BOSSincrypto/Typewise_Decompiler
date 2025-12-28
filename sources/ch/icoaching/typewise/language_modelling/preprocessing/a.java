package ch.icoaching.typewise.language_modelling.preprocessing;

import D0.i0;
import D0.j0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8790a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8791b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f8792c;

    public a(String str, String str2, boolean z3) {
        o.e(str, "level");
        o.e(str2, "processSamplesApproach");
        this.f8790a = str;
        this.f8791b = z3;
        this.f8792c = j0.a(str2);
    }

    /* access modifiers changed from: protected */
    public final i0 a() {
        return this.f8792c;
    }

    public String b(String str) {
        o.e(str, "possiblyUpperCasedPrior");
        if (!this.f8791b) {
            return str;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public abstract String c(String str, int i4);

    public String d(String str, String str2) {
        o.e(str, "context");
        o.e(str2, "missingPart");
        return this.f8792c.d(str, str2, this.f8791b);
    }

    public abstract String e(List list);

    public abstract List f(String str);
}
