package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final o f5117d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f5118e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f5119f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f5120g;

    /* renamed from: h  reason: collision with root package name */
    static final a f5121h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5122a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5123b;

    /* renamed from: c  reason: collision with root package name */
    private final o f5124c;

    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    public static final class C0078a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5125a;

        /* renamed from: b  reason: collision with root package name */
        private int f5126b;

        /* renamed from: c  reason: collision with root package name */
        private o f5127c;

        public C0078a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z3) {
            if (z3) {
                return a.f5121h;
            }
            return a.f5120g;
        }

        private void c(boolean z3) {
            this.f5125a = z3;
            this.f5127c = a.f5117d;
            this.f5126b = 2;
        }

        public a a() {
            if (this.f5126b == 2 && this.f5127c == a.f5117d) {
                return b(this.f5125a);
            }
            return new a(this.f5125a, this.f5126b, this.f5127c);
        }
    }

    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f5128f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f5129a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5130b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5131c;

        /* renamed from: d  reason: collision with root package name */
        private int f5132d;

        /* renamed from: e  reason: collision with root package name */
        private char f5133e;

        static {
            for (int i4 = 0; i4 < 1792; i4++) {
                f5128f[i4] = Character.getDirectionality(i4);
            }
        }

        b(CharSequence charSequence, boolean z3) {
            this.f5129a = charSequence;
            this.f5130b = z3;
            this.f5131c = charSequence.length();
        }

        private static byte c(char c4) {
            if (c4 < 1792) {
                return f5128f[c4];
            }
            return Character.getDirectionality(c4);
        }

        private byte f() {
            char charAt;
            int i4 = this.f5132d;
            do {
                int i5 = this.f5132d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5129a;
                int i6 = i5 - 1;
                this.f5132d = i6;
                charAt = charSequence.charAt(i6);
                this.f5133e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f5132d = i4;
            this.f5133e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i4 = this.f5132d;
                if (i4 >= this.f5131c) {
                    return 12;
                }
                CharSequence charSequence = this.f5129a;
                this.f5132d = i4 + 1;
                charAt = charSequence.charAt(i4);
                this.f5133e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i4 = this.f5132d;
            while (true) {
                int i5 = this.f5132d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5129a;
                int i6 = i5 - 1;
                this.f5132d = i6;
                char charAt2 = charSequence.charAt(i6);
                this.f5133e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f5132d;
                        if (i7 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f5129a;
                        int i8 = i7 - 1;
                        this.f5132d = i8;
                        charAt = charSequence2.charAt(i8);
                        this.f5133e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f5132d = i4;
            this.f5133e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i4 = this.f5132d;
            while (true) {
                int i5 = this.f5132d;
                if (i5 < this.f5131c) {
                    CharSequence charSequence = this.f5129a;
                    this.f5132d = i5 + 1;
                    char charAt2 = charSequence.charAt(i5);
                    this.f5133e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i6 = this.f5132d;
                            if (i6 >= this.f5131c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f5129a;
                            this.f5132d = i6 + 1;
                            charAt = charSequence2.charAt(i6);
                            this.f5133e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f5132d = i4;
                    this.f5133e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f5129a.charAt(this.f5132d - 1);
            this.f5133e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f5129a, this.f5132d);
                this.f5132d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f5132d--;
            byte c4 = c(this.f5133e);
            if (!this.f5130b) {
                return c4;
            }
            char c5 = this.f5133e;
            if (c5 == '>') {
                return h();
            }
            if (c5 == ';') {
                return f();
            }
            return c4;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f5129a.charAt(this.f5132d);
            this.f5133e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f5129a, this.f5132d);
                this.f5132d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f5132d++;
            byte c4 = c(this.f5133e);
            if (!this.f5130b) {
                return c4;
            }
            char c5 = this.f5133e;
            if (c5 == '<') {
                return i();
            }
            if (c5 == '&') {
                return g();
            }
            return c4;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f5132d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f5132d < this.f5131c && i4 == 0) {
                byte b4 = b();
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (b4 != 9) {
                        switch (b4) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f5132d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            this.f5132d = this.f5131c;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (this.f5132d > 0) {
                    byte a4 = a();
                    if (a4 != 0) {
                        if (a4 == 1 || a4 == 2) {
                            if (i4 == 0) {
                                return 1;
                            }
                            if (i5 == 0) {
                            }
                        } else if (a4 != 9) {
                            switch (a4) {
                                case 14:
                                case 15:
                                    if (i5 == i4) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i5 == i4) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i4++;
                                    break;
                                default:
                                    if (i5 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i4--;
                        } else {
                            continue;
                        }
                    } else if (i4 == 0) {
                        return -1;
                    } else {
                        if (i5 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        o oVar = p.f5146c;
        f5117d = oVar;
        f5120g = new a(false, 2, oVar);
        f5121h = new a(true, 2, oVar);
    }

    a(boolean z3, int i4, o oVar) {
        this.f5122a = z3;
        this.f5123b = i4;
        this.f5124c = oVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0078a().a();
    }

    static boolean e(Locale locale) {
        if (q.a(locale) == 1) {
            return true;
        }
        return false;
    }

    private String f(CharSequence charSequence, o oVar) {
        boolean a4 = oVar.a(charSequence, 0, charSequence.length());
        if (!this.f5122a && (a4 || b(charSequence) == 1)) {
            return f5118e;
        }
        if (!this.f5122a) {
            return "";
        }
        if (!a4 || b(charSequence) == -1) {
            return f5119f;
        }
        return "";
    }

    private String g(CharSequence charSequence, o oVar) {
        boolean a4 = oVar.a(charSequence, 0, charSequence.length());
        if (!this.f5122a && (a4 || a(charSequence) == 1)) {
            return f5118e;
        }
        if (!this.f5122a) {
            return "";
        }
        if (!a4 || a(charSequence) == -1) {
            return f5119f;
        }
        return "";
    }

    public boolean d() {
        if ((this.f5123b & 2) != 0) {
            return true;
        }
        return false;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f5124c, true);
    }

    public CharSequence i(CharSequence charSequence, o oVar, boolean z3) {
        o oVar2;
        char c4;
        o oVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a4 = oVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z3) {
            if (a4) {
                oVar3 = p.f5145b;
            } else {
                oVar3 = p.f5144a;
            }
            spannableStringBuilder.append(g(charSequence, oVar3));
        }
        if (a4 != this.f5122a) {
            if (a4) {
                c4 = 8235;
            } else {
                c4 = 8234;
            }
            spannableStringBuilder.append(c4);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z3) {
            if (a4) {
                oVar2 = p.f5145b;
            } else {
                oVar2 = p.f5144a;
            }
            spannableStringBuilder.append(f(charSequence, oVar2));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f5124c, true);
    }

    public String k(String str, o oVar, boolean z3) {
        if (str == null) {
            return null;
        }
        return i(str, oVar, z3).toString();
    }
}
