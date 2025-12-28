package ch.icoaching.typewise.resources.char_level_vocabs;

import E0.d;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import y0.C0945b;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0145a f8870e = new C0145a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f8871a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8872b;

    /* renamed from: c  reason: collision with root package name */
    private final CharLevelVocabCasingKind f8873c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8874d;

    /* renamed from: ch.icoaching.typewise.resources.char_level_vocabs.a$a  reason: collision with other inner class name */
    public static final class C0145a {
        private C0145a() {
        }

        public final a a(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "resourcesPath");
            if (!kotlin.text.o.L(str, "-character-", false, 2, (Object) null)) {
                List t02 = kotlin.text.o.t0(str, new String[]{"_"}, false, 0, 6, (Object) null);
                String c4 = C0945b.c("l", t02);
                String c5 = C0945b.c("v", t02);
                String upperCase = C0945b.c("c", t02).toUpperCase(Locale.ROOT);
                o.d(upperCase, "toUpperCase(...)");
                return new a(c4, c5, CharLevelVocabCasingKind.valueOf(upperCase), str2);
            }
            String a4 = d.a(str2);
            throw new Exception("Please update the declaration of the vocabulary to the 2022 naming convention and make sure you have the corresponding file in '" + a4 + "'");
        }

        public /* synthetic */ C0145a(i iVar) {
            this();
        }
    }

    public a(String str, String str2, CharLevelVocabCasingKind charLevelVocabCasingKind, String str3) {
        o.e(str, "language");
        o.e(str2, "version");
        o.e(charLevelVocabCasingKind, "casing");
        o.e(str3, "resourcesPath");
        this.f8871a = str;
        this.f8872b = str2;
        this.f8873c = charLevelVocabCasingKind;
        this.f8874d = str3;
    }

    public final String a() {
        String a4 = d.a(this.f8874d);
        if (a4 == null || a4.length() == 0) {
            String b4 = b();
            return b4 + ".json";
        }
        String b5 = b();
        return a4 + "/" + b5 + ".json";
    }

    public final String b() {
        String str = this.f8871a;
        String str2 = this.f8872b;
        String b4 = this.f8873c.b();
        return "l=" + str + "_v=" + str2 + "_c=" + b4 + "_charvocab";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o.a(this.f8871a, aVar.f8871a) && o.a(this.f8872b, aVar.f8872b) && this.f8873c == aVar.f8873c && o.a(this.f8874d, aVar.f8874d);
    }

    public int hashCode() {
        return (((((this.f8871a.hashCode() * 31) + this.f8872b.hashCode()) * 31) + this.f8873c.hashCode()) * 31) + this.f8874d.hashCode();
    }

    public String toString() {
        String str = this.f8871a;
        String str2 = this.f8872b;
        CharLevelVocabCasingKind charLevelVocabCasingKind = this.f8873c;
        String str3 = this.f8874d;
        return "CharLevelVocabInfo(language=" + str + ", version=" + str2 + ", casing=" + charLevelVocabCasingKind + ", resourcesPath=" + str3 + ")";
    }
}
