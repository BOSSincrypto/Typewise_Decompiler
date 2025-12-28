package c2;

import E0.s;
import android.os.SystemClock;
import c.C0489b;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.word_lists.b;
import ch.icoaching.wrio.autocorrect.AutoCapitalizationState;
import ch.icoaching.wrio.data.a;
import ch.icoaching.wrio.language.d;
import ch.icoaching.wrio.logging.Log;
import h2.C0662a;
import h2.p;
import h2.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import r0.c;
import r0.e;
import r0.f;

/* renamed from: c2.a  reason: case insensitive filesystem */
public final class C0495a implements C0497c {

    /* renamed from: a  reason: collision with root package name */
    private final a f7623a;

    /* renamed from: b  reason: collision with root package name */
    private final d f7624b;

    /* renamed from: c  reason: collision with root package name */
    private final C0489b f7625c;

    /* renamed from: d  reason: collision with root package name */
    private final b f7626d;

    /* renamed from: e  reason: collision with root package name */
    private final b f7627e = new C0662a();

    /* renamed from: f  reason: collision with root package name */
    private final C0498d f7628f = new C0498d();

    /* renamed from: g  reason: collision with root package name */
    private final C0498d f7629g = new C0498d();

    /* renamed from: h  reason: collision with root package name */
    private int f7630h;

    /* renamed from: i  reason: collision with root package name */
    private long f7631i;

    public C0495a(a aVar, d dVar, C0489b bVar) {
        o.e(aVar, "autocorrectionSettings");
        o.e(dVar, "languageController");
        o.e(bVar, "databaseHandler");
        this.f7623a = aVar;
        this.f7624b = dVar;
        this.f7625c = bVar;
        p pVar = bVar.f7496f;
        o.d(pVar, "mainDictionaryDao");
        this.f7626d = new t(pVar);
    }

    public b a(String str) {
        o.e(str, "language");
        return this.f7627e;
    }

    public b b(String str) {
        o.e(str, "language");
        return this.f7626d;
    }

    public void c(boolean z3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z3 || elapsedRealtime - this.f7631i >= 300000) {
            Log.d(Log.f10572a, "AutocorrectionDatabaseRepository", "initializeCaches() :: initializing caches", (Throwable) null, 4, (Object) null);
            this.f7631i = elapsedRealtime;
            this.f7628f.b(this.f7625c.f7496f.d());
            this.f7629g.b(this.f7625c.f7496f.c());
            this.f7630h = this.f7625c.f7496f.b();
            return;
        }
        Log.d(Log.f10572a, "AutocorrectionDatabaseRepository", "initializeCaches() :: already initialized within last 5 minutes", (Throwable) null, 4, (Object) null);
    }

    public List d(String str) {
        o.e(str, "language");
        return C0718m.j();
    }

    public int e() {
        return this.f7629g.a(this.f7624b.c());
    }

    public int f(String str) {
        o.e(str, "language");
        String c4 = this.f7624b.c();
        if (c4.length() != 0) {
            str = c4;
        }
        return this.f7628f.a(str);
    }

    public IDictionaryRepository.a g(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        return new IDictionaryRepository.a(Boolean.FALSE, false, C0718m.j(), C0718m.j());
    }

    public f h(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        if (this.f7623a.a() != AutoCapitalizationState.FULL) {
            return null;
        }
        String c4 = this.f7624b.c();
        if (c4.length() != 0) {
            str2 = c4;
        }
        return this.f7625c.f7496f.w(str, str2);
    }

    public List i(String str, String str2, String str3, String str4, String str5) {
        String str6;
        o.e(str, "candidate");
        o.e(str2, "previousWord");
        o.e(str3, "language");
        String c4 = this.f7624b.c();
        if (c4.length() == 0) {
            str6 = str3;
        } else {
            str6 = c4;
        }
        List o4 = this.f7625c.o(str, str2, str6, str4, str5);
        o.d(o4, "getUnprocessedSuggestionsForLanguage(...)");
        return o4;
    }

    public e j(c cVar, String str, String str2) {
        o.e(cVar, "singleWord");
        o.e(str, "previousWord");
        o.e(str2, "language");
        String c4 = this.f7624b.c();
        if (c4.length() != 0) {
            str2 = c4;
        }
        e D3 = this.f7625c.D(cVar, str, str2);
        o.d(D3, "getWordDataForLanguage(...)");
        return D3;
    }

    public e k(c cVar, String str) {
        o.e(cVar, "singleWord");
        o.e(str, "language");
        String c4 = this.f7624b.c();
        if (c4.length() != 0) {
            str = c4;
        }
        return this.f7625c.f7496f.q(cVar, str);
    }

    public int l(String str) {
        o.e(str, "language");
        return this.f7630h;
    }

    public boolean m(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        throw new NotImplementedError("No need to implement this function. It is overridden in the KMP library.");
    }

    public IDictionaryRepository.a n(String str, String str2) {
        boolean z3;
        List<String> list;
        o.e(str, "word");
        o.e(str2, "language");
        String c4 = this.f7624b.c();
        if (c4.length() != 0) {
            str2 = c4;
        }
        f A3 = this.f7625c.f7496f.A(str, str2);
        boolean z4 = false;
        if (A3 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            o.b(A3);
            if (s.h(str, A3)) {
                z4 = true;
            }
        }
        if (A3 != null) {
            list = s.e(str, A3);
        } else {
            list = C0718m.j();
        }
        ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
        for (String str3 : list) {
            arrayList.add(IDictionaryRepository.DictionarySource.DICTIONARY);
        }
        return new IDictionaryRepository.a(Boolean.valueOf(z4), z3, list, arrayList);
    }
}
