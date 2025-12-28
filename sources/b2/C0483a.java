package b2;

import F2.a;
import kotlin.jvm.internal.o;
import okhttp3.B;
import retrofit2.C0884k;

/* renamed from: b2.a  reason: case insensitive filesystem */
public final class C0483a implements C0884k {

    /* renamed from: a  reason: collision with root package name */
    private final a f7480a;

    /* renamed from: b  reason: collision with root package name */
    private final C0487e f7481b;

    public C0483a(a aVar, C0487e eVar) {
        o.e(aVar, "loader");
        o.e(eVar, "serializer");
        this.f7480a = aVar;
        this.f7481b = eVar;
    }

    /* renamed from: b */
    public Object a(B b4) {
        o.e(b4, "value");
        return this.f7481b.a(this.f7480a, b4);
    }
}
