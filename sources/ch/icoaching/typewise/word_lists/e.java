package ch.icoaching.typewise.word_lists;

import C0.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import y0.C0945b;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8944d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f8945a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8946b;

    /* renamed from: c  reason: collision with root package name */
    private final WordListKind f8947c;

    public static final class a {
        private a() {
        }

        public final WordListKind a(String str) {
            o.e(str, "name");
            String c4 = C0945b.c("k", kotlin.text.o.t0(str, new String[]{"_"}, false, 0, 6, (Object) null));
            int a02 = kotlin.text.o.a0(c4, '.', 0, false, 6, (Object) null);
            if (a02 != -1) {
                c4 = c4.substring(0, a02);
                o.d(c4, "substring(...)");
            }
            return d.a(c4);
        }

        public final String b(String str) {
            o.e(str, "name");
            return C0945b.c("l", kotlin.text.o.t0(str, new String[]{"_"}, false, 0, 6, (Object) null));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public e(String str, String str2, WordListKind wordListKind) {
        o.e(str, "lang");
        o.e(str2, "version");
        o.e(wordListKind, "kind");
        this.f8945a = str;
        this.f8946b = str2;
        this.f8947c = wordListKind;
    }

    public final WordListKind a() {
        return this.f8947c;
    }

    public final String b() {
        return this.f8945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return o.a(this.f8945a, eVar.f8945a) && o.a(this.f8946b, eVar.f8946b) && this.f8947c == eVar.f8947c;
    }

    public int hashCode() {
        return (((this.f8945a.hashCode() * 31) + this.f8946b.hashCode()) * 31) + this.f8947c.hashCode();
    }

    public String toString() {
        String str = this.f8945a;
        String str2 = this.f8946b;
        WordListKind wordListKind = this.f8947c;
        return "WordListInfo(lang=" + str + ", version=" + str2 + ", kind=" + wordListKind + ")";
    }
}
