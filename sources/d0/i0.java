package D0;

import E0.s;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import y0.C0946c;

public abstract class i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f324d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f325a;

    /* renamed from: b  reason: collision with root package name */
    private final Regex f326b;

    /* renamed from: c  reason: collision with root package name */
    private int f327c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public i0(boolean z3) {
        this.f325a = z3;
        this.f326b = new Regex(" +");
        this.f327c = 512;
    }

    public String a(String str) {
        o.e(str, "text");
        return e(this.f326b.replace((CharSequence) C0946c.t(str), " "));
    }

    public abstract String b(String str, int i4, boolean z3);

    public String c(String str, Integer num) {
        o.e(str, "context");
        if (num == null || num.intValue() == -1 || num.intValue() >= str.length()) {
            return str;
        }
        boolean z3 = this.f325a;
        int i4 = -num.intValue();
        if (!z3) {
            return s.o(str, i4, (Integer) null, 2, (Object) null);
        }
        int g4 = C0946c.g(s.n(str, 0, Integer.valueOf(i4))) + 1;
        int length = str.length() - g4;
        int i5 = this.f327c;
        if (length > i5) {
            g4 = -i5;
        }
        return kotlin.text.o.O0(s.o(str, g4, (Integer) null, 2, (Object) null)).toString();
    }

    public abstract String d(String str, String str2, boolean z3);

    /* access modifiers changed from: protected */
    public String e(String str) {
        o.e(str, "text");
        return kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(str, "‘", "'", false, 4, (Object) null), "’", "'", false, 4, (Object) null), "‚", "'", false, 4, (Object) null), "′", "'", false, 4, (Object) null), "″", "\"", false, 4, (Object) null), "“", "\"", false, 4, (Object) null), "”", "\"", false, 4, (Object) null), "„", "\"", false, 4, (Object) null), "–", "-", false, 4, (Object) null), "—", "-", false, 4, (Object) null), "‑", "-", false, 4, (Object) null), "‐", "-", false, 4, (Object) null), "−", "-", false, 4, (Object) null), "‑", "-", false, 4, (Object) null), "‒", "-", false, 4, (Object) null), "―", "-", false, 4, (Object) null), "…", "...", false, 4, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(boolean z3, int i4, i iVar) {
        this((i4 & 1) != 0 ? true : z3);
    }
}
