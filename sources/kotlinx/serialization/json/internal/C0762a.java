package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

/* renamed from: kotlinx.serialization.json.internal.a  reason: case insensitive filesystem */
public abstract class C0762a {

    /* renamed from: a  reason: collision with root package name */
    public int f14379a;

    /* renamed from: b  reason: collision with root package name */
    public final A f14380b = new A();

    /* renamed from: c  reason: collision with root package name */
    private String f14381c;

    /* renamed from: d  reason: collision with root package name */
    private StringBuilder f14382d = new StringBuilder();

    private final int B(CharSequence charSequence, int i4) {
        char charAt = charSequence.charAt(i4);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    private final String L() {
        String str = this.f14381c;
        o.b(str);
        this.f14381c = null;
        return str;
    }

    public static /* synthetic */ boolean O(C0762a aVar, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z3 = true;
            }
            return aVar.N(z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    private final boolean Q() {
        if (C().charAt(this.f14379a - 1) != '\"') {
            return true;
        }
        return false;
    }

    private final int a(int i4) {
        int H3 = H(i4);
        if (H3 != -1) {
            int i5 = H3 + 1;
            char charAt = C().charAt(H3);
            if (charAt == 'u') {
                return c(C(), i5);
            }
            char b4 = C0763b.b(charAt);
            if (b4 != 0) {
                this.f14382d.append(b4);
                return i5;
            }
            x(this, "Invalid escaped char '" + charAt + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
        x(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    private final int b(int i4, int i5) {
        d(i4, i5);
        return a(i5 + 1);
    }

    private final int c(CharSequence charSequence, int i4) {
        int i5 = i4 + 4;
        if (i5 >= charSequence.length()) {
            this.f14379a = i4;
            u();
            if (this.f14379a + 4 < charSequence.length()) {
                return c(charSequence, this.f14379a);
            }
            x(this, "Unexpected EOF during unicode escape", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
        this.f14382d.append((char) ((B(charSequence, i4) << 12) + (B(charSequence, i4 + 1) << 8) + (B(charSequence, i4 + 2) << 4) + B(charSequence, i4 + 3)));
        return i5;
    }

    private final boolean f(int i4) {
        int H3 = H(i4);
        if (H3 >= C().length() || H3 == -1) {
            x(this, "EOF", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
        int i5 = H3 + 1;
        char charAt = C().charAt(H3) | ' ';
        if (charAt == 'f') {
            h("alse", i5);
            return false;
        } else if (charAt == 't') {
            h("rue", i5);
            return true;
        } else {
            x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    private final void h(String str, int i4) {
        if (C().length() - i4 >= str.length()) {
            int length = str.length();
            int i5 = 0;
            while (i5 < length) {
                if (str.charAt(i5) == (C().charAt(i4 + i5) | ' ')) {
                    i5++;
                } else {
                    x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f14379a = i4 + str.length();
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    private static final double n(long j4, boolean z3) {
        if (!z3) {
            return Math.pow(10.0d, -((double) j4));
        }
        if (z3) {
            return Math.pow(10.0d, (double) j4);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String s(int i4, int i5) {
        d(i4, i5);
        String sb = this.f14382d.toString();
        o.d(sb, "toString(...)");
        this.f14382d.setLength(0);
        return sb;
    }

    public static /* synthetic */ Void x(C0762a aVar, String str, int i4, String str2, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = aVar.f14379a;
            }
            if ((i5 & 4) != 0) {
                str2 = "";
            }
            return aVar.w(str, i4, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public static /* synthetic */ Void z(C0762a aVar, byte b4, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = true;
            }
            return aVar.y(b4, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final void A(String str) {
        o.e(str, "key");
        int b02 = kotlin.text.o.b0(K(0, this.f14379a), str, 0, false, 6, (Object) null);
        w("Encountered an unknown key '" + str + '\'', b02, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence C();

    /* access modifiers changed from: protected */
    public final boolean D(char c4) {
        return (c4 == ',' || c4 == ':' || c4 == ']' || c4 == '}') ? false : true;
    }

    public abstract String E(String str, boolean z3);

    public byte F() {
        CharSequence C3 = C();
        int i4 = this.f14379a;
        while (true) {
            int H3 = H(i4);
            if (H3 != -1) {
                char charAt = C3.charAt(H3);
                if (charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ') {
                    i4 = H3 + 1;
                } else {
                    this.f14379a = H3;
                    return C0763b.a(charAt);
                }
            } else {
                this.f14379a = H3;
                return 10;
            }
        }
    }

    public final String G(boolean z3) {
        String str;
        byte F3 = F();
        if (z3) {
            if (F3 != 1 && F3 != 0) {
                return null;
            }
            str = q();
        } else if (F3 != 1) {
            return null;
        } else {
            str = o();
        }
        this.f14381c = str;
        return str;
    }

    public abstract int H(int i4);

    public final void I(boolean z3) {
        ArrayList arrayList = new ArrayList();
        byte F3 = F();
        if (F3 == 8 || F3 == 6) {
            while (true) {
                byte F4 = F();
                if (F4 != 1) {
                    if (F4 == 8 || F4 == 6) {
                        arrayList.add(Byte.valueOf(F4));
                    } else if (F4 == 9) {
                        if (((Number) C0718m.b0(arrayList)).byteValue() == 8) {
                            C0718m.F(arrayList);
                        } else {
                            int i4 = this.f14379a;
                            throw x.e(i4, "found ] instead of } at path: " + this.f14380b, C());
                        }
                    } else if (F4 == 7) {
                        if (((Number) C0718m.b0(arrayList)).byteValue() == 6) {
                            C0718m.F(arrayList);
                        } else {
                            int i5 = this.f14379a;
                            throw x.e(i5, "found } instead of ] at path: " + this.f14380b, C());
                        }
                    } else if (F4 == 10) {
                        x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                    j();
                    if (arrayList.size() == 0) {
                        return;
                    }
                } else if (z3) {
                    q();
                } else {
                    i();
                }
            }
        } else {
            q();
        }
    }

    public abstract int J();

    public String K(int i4, int i5) {
        return C().subSequence(i4, i5).toString();
    }

    public final boolean M() {
        int J3 = J();
        CharSequence C3 = C();
        if (J3 >= C3.length() || J3 == -1 || C3.charAt(J3) != ',') {
            return false;
        }
        this.f14379a++;
        return true;
    }

    public final boolean N(boolean z3) {
        int H3 = H(J());
        int length = C().length() - H3;
        if (length < 4 || H3 == -1) {
            return false;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if ("null".charAt(i4) != C().charAt(H3 + i4)) {
                return false;
            }
        }
        if (length > 4 && C0763b.a(C().charAt(H3 + 4)) == 0) {
            return false;
        }
        if (!z3) {
            return true;
        }
        this.f14379a = H3 + 4;
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void P(char c4) {
        int i4 = this.f14379a;
        if (i4 > 0 && c4 == '\"') {
            try {
                this.f14379a = i4 - 1;
                String q4 = q();
                this.f14379a = i4;
                if (o.a(q4, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f14379a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.f14379a = i4;
                throw th;
            }
        }
        z(this, C0763b.a(c4), false, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* access modifiers changed from: protected */
    public void d(int i4, int i5) {
        this.f14382d.append(C(), i4, i5);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z3;
        int J3 = J();
        if (J3 != C().length()) {
            if (C().charAt(J3) == '\"') {
                J3++;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f4 = f(J3);
            if (z3) {
                if (this.f14379a == C().length()) {
                    x(this, "EOF", 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                } else if (C().charAt(this.f14379a) == '\"') {
                    this.f14379a++;
                } else {
                    x(this, "Expected closing quotation mark", 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return f4;
        }
        x(this, "EOF", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b4) {
        byte j4 = j();
        if (j4 == b4) {
            return j4;
        }
        z(this, b4, false, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    public abstract void l(char c4);

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (r5 == r0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r0 == r5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r10 == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014d, code lost:
        if (r0 == (r5 - 1)) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        if (r1 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r3 == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015d, code lost:
        if (C().charAt(r5) != '\"') goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0162, code lost:
        x(r17, "Expected closing quotation mark", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0173, code lost:
        x(r17, "EOF", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        r6.f14379a = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        if (r9 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r0 = ((double) r11) * n(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r0 > 9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        if (r0 < -9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        if (java.lang.Math.floor(r0) != r0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a2, code lost:
        r11 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a4, code lost:
        x(r17, "Can't convert " + r0 + " to Long", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c8, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c9, code lost:
        x(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d9, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01da, code lost:
        if (r10 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r11 == Long.MIN_VALUE) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        x(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        x(r17, "Expected numeric literal", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0206, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r17.J()
            int r0 = r6.H(r0)
            java.lang.CharSequence r1 = r17.C()
            int r1 = r1.length()
            if (r0 >= r1) goto L_0x0207
            r1 = -1
            if (r0 == r1) goto L_0x0207
            java.lang.CharSequence r1 = r17.C()
            char r1 = r1.charAt(r0)
            r2 = 34
            if (r1 != r2) goto L_0x0042
            int r0 = r0 + 1
            java.lang.CharSequence r1 = r17.C()
            int r1 = r1.length()
            if (r0 == r1) goto L_0x0031
            r1 = 1
            goto L_0x0043
        L_0x0031:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0042:
            r1 = 0
        L_0x0043:
            r7 = 0
            r5 = r0
            r11 = r7
            r13 = r11
            r9 = 0
            r10 = 0
        L_0x004a:
            r15 = 0
        L_0x004b:
            java.lang.CharSequence r16 = r17.C()
            int r3 = r16.length()
            if (r5 == r3) goto L_0x0142
            java.lang.CharSequence r3 = r17.C()
            char r3 = r3.charAt(r5)
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L_0x0065
            r4 = 69
            if (r3 != r4) goto L_0x0093
        L_0x0065:
            if (r9 != 0) goto L_0x0093
            if (r5 == r0) goto L_0x006e
            int r5 = r5 + 1
            r9 = 1
        L_0x006c:
            r15 = 1
            goto L_0x004b
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0093:
            r4 = 45
            if (r3 != r4) goto L_0x00af
            if (r9 == 0) goto L_0x00af
            if (r5 == r0) goto L_0x009e
            int r5 = r5 + 1
            goto L_0x004a
        L_0x009e:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00af:
            r2 = 43
            if (r3 != r2) goto L_0x00cd
            if (r9 == 0) goto L_0x00cd
            if (r5 == r0) goto L_0x00bc
            int r5 = r5 + 1
            r2 = 34
            goto L_0x006c
        L_0x00bc:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '+' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00cd:
            if (r3 != r4) goto L_0x00e9
            if (r5 != r0) goto L_0x00d8
            int r5 = r5 + 1
            r2 = 34
            r10 = 1
            goto L_0x004b
        L_0x00d8:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00e9:
            byte r2 = kotlinx.serialization.json.internal.C0763b.a(r3)
            if (r2 != 0) goto L_0x0142
            int r5 = r5 + 1
            int r2 = r3 + -48
            if (r2 < 0) goto L_0x011d
            r4 = 10
            if (r2 >= r4) goto L_0x011d
            if (r9 == 0) goto L_0x0103
            long r3 = (long) r4
            long r13 = r13 * r3
            long r2 = (long) r2
            long r13 = r13 + r2
        L_0x00ff:
            r2 = 34
            goto L_0x004b
        L_0x0103:
            long r3 = (long) r4
            long r11 = r11 * r3
            long r2 = (long) r2
            long r11 = r11 - r2
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x010c
            goto L_0x00ff
        L_0x010c:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "' in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0142:
            if (r5 == r0) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r0 == r5) goto L_0x01f6
            if (r10 == 0) goto L_0x014f
            int r2 = r5 + -1
            if (r0 == r2) goto L_0x01f6
        L_0x014f:
            if (r1 == 0) goto L_0x0184
            if (r3 == 0) goto L_0x0173
            java.lang.CharSequence r0 = r17.C()
            char r0 = r0.charAt(r5)
            r1 = 34
            if (r0 != r1) goto L_0x0162
            int r5 = r5 + 1
            goto L_0x0184
        L_0x0162:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected closing quotation mark"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0173:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0184:
            r6.f14379a = r5
            if (r9 == 0) goto L_0x01da
            double r0 = (double) r11
            double r2 = n(r13, r15)
            double r0 = r0 * r2
            r2 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c9
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01c9
            double r2 = java.lang.Math.floor(r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            long r11 = (long) r0
            goto L_0x01da
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't convert "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " to Long"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x01c9:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x01da:
            if (r10 == 0) goto L_0x01dd
            goto L_0x01e4
        L_0x01dd:
            r0 = -9223372036854775808
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e5
            long r11 = -r11
        L_0x01e4:
            return r11
        L_0x01e5:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x01f6:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0207:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C0762a.m():long");
    }

    public final String o() {
        if (this.f14381c != null) {
            return L();
        }
        return i();
    }

    /* access modifiers changed from: protected */
    public final String p(CharSequence charSequence, int i4, int i5) {
        String str;
        int H3;
        o.e(charSequence, "source");
        char charAt = charSequence.charAt(i5);
        boolean z3 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                H3 = H(b(i4, i5));
                if (H3 == -1) {
                    x(this, "Unexpected EOF", H3, (String) null, 4, (Object) null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i5++;
                if (i5 >= charSequence.length()) {
                    d(i4, i5);
                    H3 = H(i5);
                    if (H3 == -1) {
                        x(this, "Unexpected EOF", H3, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i5);
                }
            }
            z3 = true;
            i4 = H3;
            i5 = i4;
            charAt = charSequence.charAt(i5);
        }
        if (!z3) {
            str = K(i4, i5);
        } else {
            str = s(i4, i5);
        }
        this.f14379a = i5 + 1;
        return str;
    }

    public final String q() {
        String str;
        if (this.f14381c != null) {
            return L();
        }
        int J3 = J();
        if (J3 >= C().length() || J3 == -1) {
            x(this, "EOF", J3, (String) null, 4, (Object) null);
            throw new KotlinNothingValueException();
        }
        byte a4 = C0763b.a(C().charAt(J3));
        if (a4 == 1) {
            return o();
        }
        if (a4 == 0) {
            boolean z3 = false;
            while (C0763b.a(C().charAt(J3)) == 0) {
                J3++;
                if (J3 >= C().length()) {
                    d(this.f14379a, J3);
                    int H3 = H(J3);
                    if (H3 == -1) {
                        this.f14379a = J3;
                        return s(0, 0);
                    }
                    J3 = H3;
                    z3 = true;
                }
            }
            if (!z3) {
                str = K(this.f14379a, J3);
            } else {
                str = s(this.f14379a, J3);
            }
            this.f14379a = J3;
            return str;
        }
        x(this, "Expected beginning of the string, but got " + C().charAt(J3), 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final String r() {
        String q4 = q();
        if (!o.a(q4, "null") || !Q()) {
            return q4;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final void t() {
        this.f14381c = null;
    }

    public String toString() {
        return "JsonReader(source='" + C() + "', currentPosition=" + this.f14379a + ')';
    }

    public void u() {
    }

    public final void v() {
        if (j() != 10) {
            x(this, "Expected EOF after parsing, but had " + C().charAt(this.f14379a - 1) + " instead", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final Void w(String str, int i4, String str2) {
        String str3;
        o.e(str, "message");
        o.e(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = 10 + str2;
        }
        throw x.e(i4, str + " at path: " + this.f14380b.a() + str3, C());
    }

    public final Void y(byte b4, boolean z3) {
        int i4;
        String str;
        String c4 = C0763b.c(b4);
        if (z3) {
            i4 = this.f14379a - 1;
        } else {
            i4 = this.f14379a;
        }
        int i5 = i4;
        if (this.f14379a == C().length() || i5 < 0) {
            str = "EOF";
        } else {
            str = String.valueOf(C().charAt(i5));
        }
        x(this, "Expected " + c4 + ", but had '" + str + "' instead", i5, (String) null, 4, (Object) null);
        throw new KotlinNothingValueException();
    }
}
