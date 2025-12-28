package ch.icoaching.wrio.keyboard.view.smartbar;

import androidx.work.c;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f10510a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10511b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10512c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10513d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10514e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10515f;

    /* renamed from: g  reason: collision with root package name */
    private final String f10516g;

    /* renamed from: h  reason: collision with root package name */
    private final String f10517h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10518i;

    public e(String str, String str2, float f4, float f5, int i4, String str3, String str4, String str5, boolean z3) {
        o.e(str, "value");
        o.e(str2, "original");
        o.e(str3, "type");
        o.e(str4, "source");
        o.e(str5, "modelUniqueIdentifier");
        this.f10510a = str;
        this.f10511b = str2;
        this.f10512c = f4;
        this.f10513d = f5;
        this.f10514e = i4;
        this.f10515f = str3;
        this.f10516g = str4;
        this.f10517h = str5;
        this.f10518i = z3;
    }

    public static /* synthetic */ e d(e eVar, String str, String str2, float f4, float f5, int i4, String str3, String str4, String str5, boolean z3, int i5, Object obj) {
        e eVar2 = eVar;
        int i6 = i5;
        return eVar.c((i6 & 1) != 0 ? eVar2.f10510a : str, (i6 & 2) != 0 ? eVar2.f10511b : str2, (i6 & 4) != 0 ? eVar2.f10512c : f4, (i6 & 8) != 0 ? eVar2.f10513d : f5, (i6 & 16) != 0 ? eVar2.f10514e : i4, (i6 & 32) != 0 ? eVar2.f10515f : str3, (i6 & 64) != 0 ? eVar2.f10516g : str4, (i6 & Uuid.SIZE_BITS) != 0 ? eVar2.f10517h : str5, (i6 & 256) != 0 ? eVar2.f10518i : z3);
    }

    public boolean a(g gVar) {
        o.e(gVar, "other");
        return o.a(gVar, this);
    }

    public boolean b(g gVar) {
        o.e(gVar, "other");
        if (gVar.getClass() == e.class) {
            e eVar = (e) gVar;
            if (o.a(this.f10510a, eVar.f10510a) && o.a(this.f10511b, eVar.f10511b) && this.f10512c == eVar.f10512c && this.f10513d == eVar.f10513d && this.f10514e == eVar.f10514e && this.f10518i == eVar.f10518i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final e c(String str, String str2, float f4, float f5, int i4, String str3, String str4, String str5, boolean z3) {
        o.e(str, "value");
        o.e(str2, "original");
        String str6 = str3;
        o.e(str6, "type");
        String str7 = str4;
        o.e(str7, "source");
        String str8 = str5;
        o.e(str8, "modelUniqueIdentifier");
        return new e(str, str2, f4, f5, i4, str6, str7, str8, z3);
    }

    public final String e() {
        return this.f10517h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return o.a(this.f10510a, eVar.f10510a) && o.a(this.f10511b, eVar.f10511b) && Float.compare(this.f10512c, eVar.f10512c) == 0 && Float.compare(this.f10513d, eVar.f10513d) == 0 && this.f10514e == eVar.f10514e && o.a(this.f10515f, eVar.f10515f) && o.a(this.f10516g, eVar.f10516g) && o.a(this.f10517h, eVar.f10517h) && this.f10518i == eVar.f10518i;
    }

    public final String f() {
        return this.f10511b;
    }

    public final float g() {
        return this.f10512c;
    }

    public final float h() {
        return this.f10513d;
    }

    public int hashCode() {
        return (((((((((((((((this.f10510a.hashCode() * 31) + this.f10511b.hashCode()) * 31) + Float.floatToIntBits(this.f10512c)) * 31) + Float.floatToIntBits(this.f10513d)) * 31) + this.f10514e) * 31) + this.f10515f.hashCode()) * 31) + this.f10516g.hashCode()) * 31) + this.f10517h.hashCode()) * 31) + c.a(this.f10518i);
    }

    public final String i() {
        return this.f10516g;
    }

    public final int j() {
        return this.f10514e;
    }

    public final String k() {
        return this.f10515f;
    }

    public final String l() {
        return this.f10510a;
    }

    public final boolean m() {
        return this.f10518i;
    }

    public String toString() {
        return "PredictionSmartBarItem(value=" + this.f10510a + ", original=" + this.f10511b + ", score=" + this.f10512c + ", scoreBeforeReScoring=" + this.f10513d + ", startIndex=" + this.f10514e + ", type=" + this.f10515f + ", source=" + this.f10516g + ", modelUniqueIdentifier=" + this.f10517h + ", isLocked=" + this.f10518i + ')';
    }
}
