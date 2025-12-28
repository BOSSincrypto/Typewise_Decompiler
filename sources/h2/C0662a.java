package h2;

import ch.icoaching.typewise.word_lists.b;
import ch.icoaching.typewise.word_lists.d;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.o;

/* renamed from: h2.a  reason: case insensitive filesystem */
public final class C0662a implements b {
    public int a(String str) {
        o.e(str, "language");
        return 0;
    }

    public String b(String str, int i4) {
        o.e(str, "language");
        throw new NotImplementedError("getEntryAtPosition() not implemented.");
    }

    public d c(String str, String str2) {
        o.e(str, "language");
        o.e(str2, "word");
        return null;
    }

    public boolean d(String str, String str2) {
        o.e(str, "language");
        o.e(str2, "word");
        return false;
    }

    public Pair e(String str, int i4) {
        o.e(str, "language");
        throw new NotImplementedError("getEntryAtPosition() not implemented.");
    }
}
