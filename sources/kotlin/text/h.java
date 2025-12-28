package kotlin.text;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final b f13949d = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h f13950e;

    /* renamed from: f  reason: collision with root package name */
    private static final h f13951f;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13952a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13953b;

    /* renamed from: c  reason: collision with root package name */
    private final c f13954c;

    public static final class a {

        /* renamed from: j  reason: collision with root package name */
        public static final C0201a f13955j = new C0201a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public static final a f13956k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a  reason: collision with root package name */
        private final int f13957a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13958b;

        /* renamed from: c  reason: collision with root package name */
        private final String f13959c;

        /* renamed from: d  reason: collision with root package name */
        private final String f13960d;

        /* renamed from: e  reason: collision with root package name */
        private final String f13961e;

        /* renamed from: f  reason: collision with root package name */
        private final String f13962f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f13963g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f13964h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f13965i;

        /* renamed from: kotlin.text.h$a$a  reason: collision with other inner class name */
        public static final class C0201a {
            public /* synthetic */ C0201a(i iVar) {
                this();
            }

            public final a a() {
                return a.f13956k;
            }

            private C0201a() {
            }
        }

        public a(int i4, int i5, String str, String str2, String str3, String str4) {
            boolean z3;
            boolean z4;
            o.e(str, "groupSeparator");
            o.e(str2, "byteSeparator");
            o.e(str3, "bytePrefix");
            o.e(str4, "byteSuffix");
            this.f13957a = i4;
            this.f13958b = i5;
            this.f13959c = str;
            this.f13960d = str2;
            this.f13961e = str3;
            this.f13962f = str4;
            boolean z5 = false;
            if (i4 == Integer.MAX_VALUE && i5 == Integer.MAX_VALUE) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f13963g = z3;
            if (str3.length() == 0 && str4.length() == 0 && str2.length() <= 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f13964h = z4;
            this.f13965i = (i.b(str) || i.b(str2) || i.b(str3) || i.b(str4)) ? true : z5;
        }

        public final StringBuilder b(StringBuilder sb, String str) {
            o.e(sb, "sb");
            o.e(str, "indent");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(this.f13957a);
            o.d(sb, "append(...)");
            sb.append(",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(this.f13958b);
            o.d(sb, "append(...)");
            sb.append(",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append(this.f13959c);
            o.d(sb, "append(...)");
            sb.append("\",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append(this.f13960d);
            o.d(sb, "append(...)");
            sb.append("\",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append(this.f13961e);
            o.d(sb, "append(...)");
            sb.append("\",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append(this.f13962f);
            sb.append("\"");
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            StringBuilder b4 = b(sb, "    ");
            b4.append(10);
            o.d(b4, "append(...)");
            sb.append(")");
            String sb2 = sb.toString();
            o.d(sb2, "toString(...)");
            return sb2;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final h a() {
            return h.f13950e;
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: h  reason: collision with root package name */
        public static final a f13966h = new a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final c f13967i = new c("", "", false, 1);

        /* renamed from: a  reason: collision with root package name */
        private final String f13968a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13969b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f13970c;

        /* renamed from: d  reason: collision with root package name */
        private final int f13971d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f13972e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f13973f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f13974g;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a() {
                return c.f13967i;
            }

            private a() {
            }
        }

        public c(String str, String str2, boolean z3, int i4) {
            boolean z4;
            boolean z5;
            o.e(str, "prefix");
            o.e(str2, "suffix");
            this.f13968a = str;
            this.f13969b = str2;
            this.f13970c = z3;
            this.f13971d = i4;
            boolean z6 = false;
            if (str.length() == 0 && str2.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f13972e = z4;
            if (!z4 || i4 != 1) {
                z5 = false;
            } else {
                z5 = true;
            }
            this.f13973f = z5;
            this.f13974g = (i.b(str) || i.b(str2)) ? true : z6;
        }

        public final StringBuilder b(StringBuilder sb, String str) {
            o.e(sb, "sb");
            o.e(str, "indent");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append(this.f13968a);
            o.d(sb, "append(...)");
            sb.append("\",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("suffix = \"");
            sb.append(this.f13969b);
            o.d(sb, "append(...)");
            sb.append("\",");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f13970c);
            o.d(sb, "append(...)");
            sb.append(',');
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            sb.append(str);
            sb.append("minLength = ");
            sb.append(this.f13971d);
            return sb;
        }

        public final boolean c() {
            return this.f13974g;
        }

        public final String d() {
            return this.f13968a;
        }

        public final String e() {
            return this.f13969b;
        }

        public final boolean f() {
            return this.f13972e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            o.d(sb, "append(...)");
            sb.append(10);
            o.d(sb, "append(...)");
            StringBuilder b4 = b(sb, "    ");
            b4.append(10);
            o.d(b4, "append(...)");
            sb.append(")");
            String sb2 = sb.toString();
            o.d(sb2, "toString(...)");
            return sb2;
        }
    }

    static {
        a.C0201a aVar = a.f13955j;
        a a4 = aVar.a();
        c.a aVar2 = c.f13966h;
        f13950e = new h(false, a4, aVar2.a());
        f13951f = new h(true, aVar.a(), aVar2.a());
    }

    public h(boolean z3, a aVar, c cVar) {
        o.e(aVar, "bytes");
        o.e(cVar, "number");
        this.f13952a = z3;
        this.f13953b = aVar;
        this.f13954c = cVar;
    }

    public final c b() {
        return this.f13954c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        o.d(sb, "append(...)");
        sb.append(10);
        o.d(sb, "append(...)");
        sb.append("    upperCase = ");
        sb.append(this.f13952a);
        o.d(sb, "append(...)");
        sb.append(",");
        o.d(sb, "append(...)");
        sb.append(10);
        o.d(sb, "append(...)");
        sb.append("    bytes = BytesHexFormat(");
        o.d(sb, "append(...)");
        sb.append(10);
        o.d(sb, "append(...)");
        StringBuilder b4 = this.f13953b.b(sb, "        ");
        b4.append(10);
        o.d(b4, "append(...)");
        sb.append("    ),");
        o.d(sb, "append(...)");
        sb.append(10);
        o.d(sb, "append(...)");
        sb.append("    number = NumberHexFormat(");
        o.d(sb, "append(...)");
        sb.append(10);
        o.d(sb, "append(...)");
        StringBuilder b5 = this.f13954c.b(sb, "        ");
        b5.append(10);
        o.d(b5, "append(...)");
        sb.append("    )");
        o.d(sb, "append(...)");
        sb.append(10);
        o.d(sb, "append(...)");
        sb.append(")");
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }
}
