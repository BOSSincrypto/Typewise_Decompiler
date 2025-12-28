package B2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.l;
import u2.p;
import v2.C0925a;

abstract class m extends l {

    public static final class a implements Iterable, C0925a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f207a;

        public a(e eVar) {
            this.f207a = eVar;
        }

        public Iterator iterator() {
            return this.f207a.iterator();
        }
    }

    public static Iterable f(e eVar) {
        o.e(eVar, "<this>");
        return new a(eVar);
    }

    public static int g(e eVar) {
        o.e(eVar, "<this>");
        Iterator it = eVar.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            it.next();
            i4++;
            if (i4 < 0) {
                C0718m.r();
            }
        }
        return i4;
    }

    public static e h(e eVar, int i4) {
        o.e(eVar, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            return eVar;
        } else {
            if (eVar instanceof c) {
                return ((c) eVar).a(i4);
            }
            return new b(eVar, i4);
        }
    }

    public static final Appendable i(e eVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(eVar, "<this>");
        o.e(appendable, "buffer");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (Object next : eVar) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            kotlin.text.o.a(appendable, next, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String j(e eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(eVar, "<this>");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        String sb = ((StringBuilder) i(eVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
        o.d(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String k(e eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return j(eVar, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    public static Object l(e eVar) {
        o.e(eVar, "<this>");
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static e m(e eVar, l lVar) {
        o.e(eVar, "<this>");
        o.e(lVar, "transform");
        return new o(eVar, lVar);
    }

    public static e n(e eVar, p pVar) {
        o.e(eVar, "<this>");
        o.e(pVar, "transform");
        return new n(eVar, pVar);
    }

    public static List o(e eVar) {
        o.e(eVar, "<this>");
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return C0718m.j();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C0718m.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
