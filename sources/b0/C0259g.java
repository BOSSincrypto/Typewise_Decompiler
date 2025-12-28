package B0;

import E0.t;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.config.CompanyConfig;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.C0869a;
import r0.e;

/* renamed from: B0.g  reason: case insensitive filesystem */
public class C0259g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f106e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private int f107a;

    /* renamed from: b  reason: collision with root package name */
    private int f108b;

    /* renamed from: c  reason: collision with root package name */
    private final float f109c;

    /* renamed from: d  reason: collision with root package name */
    private final String f110d;

    /* renamed from: B0.g$a */
    public static final class a {
        private a() {
        }

        public final String a(String str, String str2, String str3) {
            o.e(str, "word");
            if (str2 != null) {
                str = str2 + str;
            }
            if (str3 == null) {
                return str;
            }
            return str + str3;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public C0259g(IDictionaryRepository iDictionaryRepository, CompanyConfig.b bVar, String str) {
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(bVar, "correctionConfig");
        o.e(str, "language");
        this.f107a = iDictionaryRepository.e();
        this.f108b = iDictionaryRepository.f(str);
        this.f109c = bVar.j().o();
        this.f110d = bVar.i().d();
    }

    public float a(e eVar, e eVar2) {
        o.e(eVar, "wordData");
        o.e(eVar2, "previousWordData");
        float max = this.f109c * ((float) Math.max(1, this.f108b));
        float a4 = ((float) eVar.a()) + this.f109c;
        int c4 = eVar2.c();
        if (o.a(eVar2.d(), this.f110d)) {
            c4 = eVar.c();
        }
        return (float) Math.log((double) (a4 / (((float) c4) + max)));
    }

    public C0256d b(List list, int i4, e eVar) {
        List list2 = list;
        int i5 = i4;
        e eVar2 = eVar;
        o.e(list2, "wordDataList");
        o.e(eVar2, "previousWordData");
        y d4 = d(list2, eVar2);
        y c4 = c(list2, i5, d4.e(), d4.a());
        y j4 = j(list2, i5, c4.e(), c4.a());
        float e4 = j4.e() / ((float) j4.a());
        E0.o f4 = f(eVar2);
        return new C0256d(d4.b(), d4.c(), d4.d(), c4.b(), c4.c(), c4.d(), j4.b(), j4.c(), j4.d(), ((Number) f4.a()).floatValue(), ((Number) f4.b()).intValue(), e4);
    }

    public y c(List list, int i4, float f4, int i5) {
        o.e(list, "wordList");
        if (i4 == 1) {
            return new y(-2.0f, -2.0f, -2, f4, i5);
        }
        float i6 = i((e) list.get(1));
        float a4 = a((e) list.get(1), (e) list.get(0));
        return new y(i6, a4, ((e) list.get(1)).b(), f4 + i6 + a4, i5 + 2);
    }

    public y d(List list, e eVar) {
        o.e(list, "wordList");
        o.e(eVar, "previousWordData");
        float i4 = i((e) list.get(0));
        float a4 = a((e) list.get(0), eVar);
        return new y(i4, a4, ((e) list.get(0)).b(), i4 + a4, 2);
    }

    public E0.o e(String str, String str2, boolean z3) {
        o.e(str, "word");
        o.e(str2, "typedWord");
        return new E0.o(Integer.valueOf(o.a(str, str2) ? 1 : 0), Integer.valueOf(z3 ? 1 : 0));
    }

    public E0.o f(e eVar) {
        o.e(eVar, "previousWordData");
        return new E0.o(Float.valueOf(i(eVar)), Integer.valueOf(eVar.b()));
    }

    public t g(String str, String str2, String str3) {
        o.e(str, "noisy");
        o.e(str2, "suggested");
        o.e(str3, "previous");
        return new t(Integer.valueOf(str.length()), Integer.valueOf(str2.length()), Integer.valueOf(str3.length()));
    }

    public final C0869a h(o oVar, e eVar, float f4, String str, boolean z3, String str2, String str3) {
        e eVar2 = eVar;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        o.e(oVar, "suggestion");
        o.e(eVar2, "previousWordData");
        o.e(str4, "typedWord");
        String f5 = oVar.f();
        a aVar = f106e;
        String a4 = aVar.a(f5, str5, str6);
        String a5 = aVar.a(str4, str5, str6);
        float a6 = oVar.a();
        t g4 = g(a5, a4, eVar.d());
        int intValue = ((Number) g4.a()).intValue();
        int intValue2 = ((Number) g4.b()).intValue();
        int intValue3 = ((Number) g4.c()).intValue();
        E0.o e4 = e(f5, str4, z3);
        int intValue4 = ((Number) e4.a()).intValue();
        int intValue5 = ((Number) e4.b()).intValue();
        int size = kotlin.text.o.t0(f5, new String[]{" "}, false, 0, 6, (Object) null).size();
        C0256d b4 = b(oVar.h(), size, eVar2);
        return new C0869a(f4, size, b4.b(), b4.f(), b4.d(), b4.g(), b4.e(), b4.h(), b4.c(), intValue2, intValue3, intValue, b4.a(), b4.i(), b4.k(), b4.l(), b4.j(), a6, intValue4, intValue5);
    }

    public float i(e eVar) {
        o.e(eVar, "wordData");
        return (float) Math.log((double) ((((float) eVar.c()) + this.f109c) / (((float) this.f107a) + (this.f109c * ((float) Math.max(1, this.f108b))))));
    }

    public y j(List list, int i4, float f4, int i5) {
        o.e(list, "wordList");
        if (i4 <= 2) {
            return new y(-2.0f, -2.0f, -2, f4, i5);
        }
        float i6 = i((e) list.get(2));
        float a4 = a((e) list.get(2), (e) list.get(1));
        return new y(i6, a4, ((e) list.get(2)).b(), f4 + i6 + a4, i5 + 2);
    }
}
