package ch.icoaching.wrio.keyboard.view.smartbar;

import ch.icoaching.wrio.keyboard.D;
import kotlin.jvm.internal.o;

public final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    private final String f10519c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10520d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10521e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, int i4, String str2, String str3, long j4) {
        super(str3, j4);
        o.e(str, "original");
        o.e(str2, "correction");
        o.e(str3, "smartBarText");
        this.f10519c = str;
        this.f10520d = i4;
        this.f10521e = str2;
    }

    public o d() {
        return new o(D.undo, false);
    }

    public final String f() {
        return this.f10521e;
    }

    public final int g() {
        return this.f10520d;
    }

    public final String h() {
        return this.f10519c;
    }
}
