package s3;

import android.content.SharedPreferences;
import ch.icoaching.wrio.logging.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r3.a;
import u2.p;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f16360a;

    public c(SharedPreferences sharedPreferences) {
        this.f16360a = sharedPreferences;
    }

    /* access modifiers changed from: private */
    public static final int d(a aVar, a aVar2) {
        o.b(aVar2);
        double a4 = aVar2.a();
        o.b(aVar);
        return Double.compare(a4, aVar.a());
    }

    /* access modifiers changed from: private */
    public static final int e(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final String f(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList arrayList = new ArrayList();
            o.b(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                o.b(aVar);
                arrayList.add(aVar.c());
            }
            jSONObject.put("countedLanguages", new JSONArray(arrayList));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                a aVar2 = (a) it2.next();
                StringBuilder sb = new StringBuilder();
                sb.append("countedLanguage_");
                o.b(aVar2);
                sb.append(aVar2.c());
                jSONObject.put(sb.toString(), aVar2.a());
            }
            String jSONObject2 = jSONObject.toString();
            o.d(jSONObject2, "toString(...)");
            Log.f10572a.c("TotalLanguageUsageRepository", jSONObject2, (Throwable) null);
            return jSONObject2;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    private final List g() {
        SharedPreferences sharedPreferences = this.f16360a;
        if (sharedPreferences == null) {
            return new ArrayList();
        }
        String string = sharedPreferences.getString("TotalLanguageUsageCounter", "");
        if (string == null || string.length() == 0) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            JSONArray jSONArray = jSONObject.getJSONArray("countedLanguages");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                String string2 = jSONArray.getString(i4);
                o.d(string2, "getString(...)");
                arrayList.add(new a(string2, jSONObject.getDouble("countedLanguage_" + jSONArray.getString(i4))));
            }
            return arrayList;
        } catch (Exception e4) {
            Log log = Log.f10572a;
            String message = e4.getMessage();
            o.b(message);
            log.e("TotalLanguageUsageRepository", message, e4);
            return new ArrayList();
        }
    }

    private final void h(List list) {
        String f4 = f(list);
        if (f4.length() > 0) {
            SharedPreferences sharedPreferences = this.f16360a;
            o.b(sharedPreferences);
            sharedPreferences.edit().putString("TotalLanguageUsageCounter", f4).apply();
        }
    }

    public void c(String str) {
        String str2;
        List D02 = C0718m.D0(get());
        Iterator it = D02.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            a aVar = (a) it.next();
            if (aVar != null) {
                str2 = aVar.c();
            } else {
                str2 = null;
            }
            if (o.a(str2, str)) {
                break;
            }
            i4++;
        }
        if (i4 != -1) {
            Object obj = D02.get(i4);
            o.b(obj);
            a aVar2 = (a) obj;
            aVar2.b(aVar2.a() + ((double) 1));
        } else {
            o.b(str);
            D02.add(new a(str, 1.0d));
        }
        h(D02);
    }

    public List get() {
        List g4 = g();
        C0718m.x(g4, new b(new a()));
        return C0718m.B0(g4);
    }
}
