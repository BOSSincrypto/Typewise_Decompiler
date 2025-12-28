package b2;

import F2.n;
import kotlin.jvm.internal.o;
import okhttp3.v;
import okhttp3.z;
import retrofit2.C0884k;

/* renamed from: b2.d  reason: case insensitive filesystem */
public final class C0486d implements C0884k {

    /* renamed from: a  reason: collision with root package name */
    private final v f7484a;

    /* renamed from: b  reason: collision with root package name */
    private final n f7485b;

    /* renamed from: c  reason: collision with root package name */
    private final C0487e f7486c;

    public C0486d(v vVar, n nVar, C0487e eVar) {
        o.e(vVar, "contentType");
        o.e(nVar, "saver");
        o.e(eVar, "serializer");
        this.f7484a = vVar;
        this.f7485b = nVar;
        this.f7486c = eVar;
    }

    /* renamed from: b */
    public z a(Object obj) {
        return this.f7486c.d(this.f7484a, this.f7485b, obj);
    }
}
