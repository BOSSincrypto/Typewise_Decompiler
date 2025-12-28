package ch.icoaching.wrio.prediction;

import c.C0489b;
import ch.icoaching.typewise.text.CapsMode;
import ch.icoaching.typewise.text.TypewiseInputType;
import ch.icoaching.typewise.word_lists.b;
import h2.C0662a;
import h2.p;
import h2.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import z0.C0967a;

public final class f implements C0967a {

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f10627a;

    /* renamed from: b  reason: collision with root package name */
    private final b f10628b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10629c = new C0662a();

    public f(C0489b bVar) {
        o.e(bVar, "databaseHandler");
        this.f10627a = bVar;
        p pVar = bVar.f7496f;
        o.d(pVar, "mainDictionaryDao");
        this.f10628b = new t(pVar);
    }

    public b a(String str) {
        o.e(str, "language");
        return this.f10629c;
    }

    public b b(String str) {
        o.e(str, "language");
        return this.f10628b;
    }

    public List c(String str, String str2, int i4) {
        o.e(str, "prefix");
        o.e(str2, "language");
        List<Pair> k4 = this.f10627a.f7496f.k(str, i4, str2);
        ArrayList arrayList = new ArrayList(C0718m.t(k4, 10));
        for (Pair pair : k4) {
            arrayList.add(new C0967a.C0251a((String) pair.getFirst(), (CapsMode) pair.getSecond()));
        }
        return arrayList;
    }

    public List d(String str) {
        o.e(str, "language");
        return C0718m.j();
    }

    public List e(String str, TypewiseInputType typewiseInputType) {
        o.e(str, "prefix");
        List h4 = this.f10627a.h(str, typewiseInputType);
        o.d(h4, "fetchSpecialFieldValues(...)");
        return h4;
    }

    public List f(String str, String str2, int i4, int i5) {
        o.e(str, "word");
        o.e(str2, "language");
        List<Pair> m4 = this.f10627a.m(str, str2, i4, i5);
        o.b(m4);
        ArrayList arrayList = new ArrayList(C0718m.t(m4, 10));
        for (Pair pair : m4) {
            Object first = pair.getFirst();
            o.d(first, "<get-first>(...)");
            Object second = pair.getSecond();
            o.d(second, "<get-second>(...)");
            arrayList.add(new C0967a.C0251a((String) first, (CapsMode) second));
        }
        return arrayList;
    }

    public List i(String str, List list, int i4) {
        o.e(str, "prefix");
        o.e(list, "languages");
        return this.f10627a.f7496f.i(str, list, i4);
    }
}
