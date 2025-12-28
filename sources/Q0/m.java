package q0;

import android.content.Context;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import l2.g;
import l2.q;
import n2.C0830a;
import q0.C0859b;
import u2.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final c f15952a;

    /* renamed from: b  reason: collision with root package name */
    private l f15953b;

    /* renamed from: c  reason: collision with root package name */
    private i f15954c;

    /* renamed from: d  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme f15955d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f15956e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map f15957f;

    /* renamed from: g  reason: collision with root package name */
    private final List f15958g;

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0830a.a(((C0859b.a) obj).a(), ((C0859b.a) obj2).a());
        }
    }

    public static final class b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0830a.a((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
        }
    }

    public m(c cVar) {
        c cVar2 = cVar;
        o.e(cVar2, "languageSettings");
        this.f15952a = cVar2;
        Pair[] pairArr = {g.a("af", "Afrikaans"), g.a("br", "Breton"), g.a("ca", "Catalan"), g.a("cs", "Czech"), g.a("da", "Danish"), g.a("de", "German"), g.a("de-ch", "German (CH)"), g.a("en", "English (US)"), g.a("en-gb", "English (UK)"), g.a("es", "Spanish"), g.a("et", "Estonian"), g.a("eu", "Basque"), g.a("fi", "Finnish"), g.a("fil", "Filipino"), g.a("fr", "French"), g.a("fr-ca", "French (CA)"), g.a("fr-ch", "French (CH)"), g.a("ga", "Irish"), g.a("gl", "Galician"), g.a("hin-en", "Hinglish"), g.a("hr", "Croatian"), g.a("hu", "Hungarian"), g.a("id", "Indonesian"), g.a("is", "Icelandic"), g.a("it", "Italian"), g.a("lt", "Lithuanian"), g.a("lv", "Latvian"), g.a("ms", "Malaysian"), g.a("nl", "Dutch (NL)"), g.a("nl-be", "Dutch (BE)"), g.a("no", "Norwegian"), g.a("pl", "Polish"), g.a("pt", "Portuguese"), g.a("pt-br", "Portuguese (BR)"), g.a("ro", "Romanian"), g.a("sk", "Slovak"), g.a("sl", "Slovene"), g.a("sq", "Albanian"), g.a("sr", "Serbian (Latin)"), g.a("sv", "Swedish"), g.a("tr", "Turkish"), g.a("vi", "Vietnamese")};
        this.f15957f = D.j(pairArr);
        this.f15958g = C0718m.m("af", "br", "ca", "cs", "da", "de", "de-ch", "en", "en-gb", "es", "et", "eu", "fi", "fil", "fr", "fr-ca", "fr-ch", "ga", "gl", "hin-en", "hr", "hu", "id", "is", "it", "lt", "lv", "ms", "nl", "nl-be", "no", "pl", "pt", "pt-br", "ro", "sk", "sl", "sq", "sr", "sv", "tr", "vi");
    }

    /* access modifiers changed from: private */
    public static final q c(m mVar, String str) {
        int i4;
        o.e(str, "currentLanguage");
        String b4 = mVar.b(str);
        Integer num = (Integer) mVar.f15956e.get(b4);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        mVar.f15956e.put(b4, Integer.valueOf(i4 + 1));
        l e4 = mVar.e();
        if (e4 != null) {
            e4.invoke(str);
        }
        return q.f14567a;
    }

    private final void i(Context context) {
        List list;
        String str;
        this.f15956e.putAll(this.f15952a.f());
        if (this.f15956e.isEmpty()) {
            list = this.f15952a.e();
        } else {
            List<Map.Entry> r02 = C0718m.r0(this.f15956e.entrySet(), new b());
            ArrayList arrayList = new ArrayList(C0718m.t(r02, 10));
            for (Map.Entry key : r02) {
                arrayList.add((String) key.getKey());
            }
            list = arrayList;
        }
        List v02 = C0718m.v0(list, 7);
        List M3 = C0718m.M(list, 7);
        ArrayList arrayList2 = new ArrayList();
        List list2 = this.f15958g;
        ArrayList arrayList3 = new ArrayList();
        for (Object next : list2) {
            if (!list.contains((String) next)) {
                arrayList3.add(next);
            }
        }
        List<String> i02 = C0718m.i0(arrayList3, M3);
        String string = context.getString(C.frequently_used);
        o.d(string, "getString(...)");
        arrayList2.add(new C0859b.c(string));
        Iterator it = v02.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            String a4 = ch.icoaching.wrio.util.a.a(context, str2);
            if (a4 != null) {
                String str3 = (String) this.f15957f.get(str2);
                if (str3 != null) {
                    str = str3;
                }
                arrayList2.add(new C0859b.a(a4, str));
            }
        }
        String string2 = context.getString(C.all_languages);
        o.d(string2, "getString(...)");
        arrayList2.add(new C0859b.c(string2));
        ArrayList arrayList4 = new ArrayList();
        for (String str4 : i02) {
            String a5 = ch.icoaching.wrio.util.a.a(context, str4);
            if (a5 != null) {
                String str5 = (String) this.f15957f.get(str4);
                if (str5 == null) {
                    str5 = str;
                }
                arrayList4.add(new C0859b.a(a5, str5));
            }
        }
        if (arrayList4.size() > 1) {
            C0718m.x(arrayList4, new a());
        }
        arrayList2.addAll(arrayList4);
        i iVar = this.f15954c;
        if (iVar != null) {
            iVar.E(arrayList2, new l(this));
        }
    }

    public final String b(String str) {
        Object obj;
        String str2;
        o.e(str, "language");
        Iterator it = this.f15957f.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (o.a(((Map.Entry) obj).getValue(), str)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (str2 = (String) entry.getKey()) == null) {
            return "";
        }
        return str2;
    }

    public i d(Context context) {
        i iVar;
        o.e(context, "context");
        if (this.f15954c == null) {
            this.f15954c = new i(context);
        }
        ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme = this.f15955d;
        if (!(aIAssistantDropDownTheme == null || (iVar = this.f15954c) == null)) {
            iVar.setTheme(aIAssistantDropDownTheme);
        }
        i(context);
        i iVar2 = this.f15954c;
        o.b(iVar2);
        return iVar2;
    }

    public l e() {
        return this.f15953b;
    }

    public void f(ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme) {
        o.e(aIAssistantDropDownTheme, "theme");
        this.f15955d = aIAssistantDropDownTheme;
        i iVar = this.f15954c;
        if (iVar != null) {
            iVar.setTheme(aIAssistantDropDownTheme);
        }
    }

    public void g(l lVar) {
        this.f15953b = lVar;
    }

    public final void h() {
        this.f15952a.l(this.f15956e);
    }

    public final void j(String str) {
        int i4;
        o.e(str, "languageCode");
        Integer num = (Integer) this.f15956e.get(str);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        this.f15956e.put(str, Integer.valueOf(i4 + 1));
    }
}
