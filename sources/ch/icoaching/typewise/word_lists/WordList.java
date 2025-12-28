package ch.icoaching.typewise.word_lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.l;
import v2.C0925a;

public abstract class WordList implements Iterable, C0925a {
    public static /* synthetic */ boolean e(WordList wordList, String str, boolean z3, boolean z4, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = false;
            }
            if ((i4 & 4) != 0) {
                z4 = false;
            }
            return wordList.d(str, z3, z4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: contains");
    }

    /* access modifiers changed from: private */
    public final boolean f(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        if (!c(lowerCase)) {
            return false;
        }
        d g4 = g(lowerCase);
        o.b(g4);
        return g4.f(str);
    }

    public static /* synthetic */ int i(WordList wordList, String str, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return wordList.h(str, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWordFrequency");
    }

    public static /* synthetic */ int k(WordList wordList, String str, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return wordList.j(str, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWordFrequencyCaseSensitive");
    }

    public abstract boolean c(String str);

    public final boolean d(String str, boolean z3, boolean z4) {
        l lVar;
        String str2;
        boolean z5;
        o.e(str, "word");
        if (str.length() == 0) {
            return false;
        }
        if (z3) {
            lVar = new WordList$contains$membershipFunction$1(this);
            str2 = str;
        } else {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            str2 = lowerCase;
            lVar = new WordList$contains$membershipFunction$2(this);
        }
        if (((Boolean) lVar.invoke(str2)).booleanValue()) {
            return true;
        }
        if (!z4) {
            return false;
        }
        List<String> t02 = kotlin.text.o.t0(str, new String[]{"-"}, false, 0, 6, (Object) null);
        ArrayList<Boolean> arrayList = new ArrayList<>(C0718m.t(t02, 10));
        for (String str3 : t02) {
            if (((Boolean) lVar.invoke(str3)).booleanValue() || str3.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            arrayList.add(Boolean.valueOf(z5));
        }
        if (!arrayList.isEmpty()) {
            for (Boolean booleanValue : arrayList) {
                if (!booleanValue.booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public abstract d g(String str);

    public final int h(String str, int i4) {
        o.e(str, "word");
        if (!c(str)) {
            return i4;
        }
        d g4 = g(str);
        o.b(g4);
        return g4.a();
    }

    public abstract Iterator iterator();

    public final int j(String str, int i4) {
        o.e(str, "word");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        if (!c(lowerCase)) {
            return i4;
        }
        d g4 = g(lowerCase);
        o.b(g4);
        return g4.f(str) ? g4.a() : i4;
    }

    public abstract Iterator l();

    public abstract int m();

    public abstract Set n();
}
