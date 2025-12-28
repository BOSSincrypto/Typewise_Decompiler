package ch.icoaching.typewise.language_modelling.modelling;

import D0.V;
import kotlin.jvm.internal.o;

public abstract class e extends V {

    /* renamed from: c  reason: collision with root package name */
    private int f8721c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(str, str2);
        o.e(str, "kind");
        o.e(str2, "uniqueIdentifier");
    }

    /* access modifiers changed from: protected */
    public final void e(int i4) {
        this.f8721c = i4;
    }

    public final int f() {
        return this.f8721c;
    }
}
