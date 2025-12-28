package ch.icoaching.typewise.word_lists;

import B2.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class f extends WordList {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8948b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f8949a;

    public static final class a {
        private a() {
        }

        public final f a(List list) {
            o.e(list, "combinedWordLists");
            if (!list.isEmpty()) {
                return new f(list, (i) null);
            }
            throw new IllegalArgumentException("combinedWordLists must not be empty.");
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private f(List list) {
        this.f8949a = list;
    }

    public boolean c(String str) {
        o.e(str, "word");
        List<WordList> list = this.f8949a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (WordList c4 : list) {
                if (c4.c(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public d g(String str) {
        o.e(str, "word");
        List list = this.f8949a;
        ArrayList<WordList> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((WordList) next).c(str)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C0718m.t(arrayList, 10));
        for (WordList g4 : arrayList) {
            d g5 = g4.g(str);
            o.b(g5);
            arrayList2.add(g5);
        }
        if (!arrayList2.isEmpty()) {
            return d.f8938f.a(arrayList2);
        }
        throw new NoSuchElementException("No word '" + str + "' in wordlist.");
    }

    public Iterator iterator() {
        List<WordList> list = this.f8949a;
        ArrayList<Iterator> arrayList = new ArrayList<>(C0718m.t(list, 10));
        for (WordList it : list) {
            arrayList.add(it.iterator());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Iterator c4 : arrayList) {
            C0718m.y(arrayList2, h.c(c4));
        }
        return arrayList2.iterator();
    }

    public Iterator l() {
        List<WordList> list = this.f8949a;
        ArrayList<Iterator> arrayList = new ArrayList<>(C0718m.t(list, 10));
        for (WordList l4 : list) {
            arrayList.add(l4.l());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Iterator c4 : arrayList) {
            C0718m.y(arrayList2, h.c(c4));
        }
        return arrayList2.iterator();
    }

    public int m() {
        int i4 = 0;
        for (WordList m4 : this.f8949a) {
            i4 += m4.m();
        }
        return i4;
    }

    public Set n() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (WordList n4 : this.f8949a) {
            linkedHashSet.addAll(n4.n());
        }
        return linkedHashSet;
    }

    public /* synthetic */ f(List list, i iVar) {
        this(list);
    }
}
