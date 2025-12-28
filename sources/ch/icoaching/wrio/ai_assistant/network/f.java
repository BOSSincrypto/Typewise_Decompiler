package ch.icoaching.wrio.ai_assistant.network;

import c3.C0500b;
import com.silkimen.http.HttpRequest;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.u;
import okhttp3.v;
import okhttp3.y;
import okhttp3.z;
import org.json.JSONObject;

public final class f implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f9188a;

    public f(i iVar) {
        o.e(iVar, "symmetricEncryptor");
        this.f9188a = iVar;
    }

    public A a(u.a aVar) {
        o.e(aVar, "chain");
        y a4 = aVar.a();
        if (!o.a(a4.g(), HttpRequest.METHOD_POST) || a4.a() == null) {
            return aVar.b(a4);
        }
        z a5 = a4.a();
        C0500b bVar = new C0500b();
        if (a5 != null) {
            a5.g(bVar);
        }
        JSONObject jSONObject = new JSONObject(bVar.s0());
        String string = jSONObject.getString("message");
        i iVar = this.f9188a;
        o.b(string);
        jSONObject.put("message", iVar.a(string));
        z.a aVar2 = z.f15608a;
        String jSONObject2 = jSONObject.toString();
        o.d(jSONObject2, "toString(...)");
        return aVar.b(a4.h().g(a4.g(), aVar2.a(jSONObject2, v.f15509e.b(HttpRequest.CONTENT_TYPE_JSON))).b());
    }
}
