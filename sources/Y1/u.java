package Y1;

public final class u implements CharSequence, Cloneable, Comparable {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f2079a;

    /* renamed from: b  reason: collision with root package name */
    private int f2080b;

    /* renamed from: c  reason: collision with root package name */
    private int f2081c;

    /* renamed from: d  reason: collision with root package name */
    private String f2082d;

    public u() {
        this.f2082d = "";
    }

    private String i(int i4, int i5) {
        StringBuilder sb = new StringBuilder(i5 - i4);
        while (i4 < i5) {
            sb.append((char) this.f2079a[this.f2080b + i4]);
            i4++;
        }
        return sb.toString();
    }

    private boolean j(int i4, CharSequence charSequence, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.f2079a[this.f2080b + i4 + i6] != charSequence.charAt(i6)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(byte[] bArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.f2079a[this.f2080b + i6] != bArr[i4 + i6]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public u clone() {
        try {
            return (u) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public int compareTo(u uVar) {
        return d(uVar);
    }

    public char charAt(int i4) {
        return (char) this.f2079a[this.f2080b + i4];
    }

    public int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = this.f2081c;
        if (i4 > length) {
            i4 = length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int charAt = charAt(i5) - charSequence.charAt(i5);
            if (charAt != 0) {
                return charAt;
            }
        }
        return this.f2081c - length;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        int i4 = this.f2081c;
        if (i4 != uVar.f2081c || !k(uVar.f2079a, uVar.f2080b, i4)) {
            return false;
        }
        return true;
    }

    public boolean g(CharSequence charSequence) {
        int i4;
        if (charSequence == null) {
            return false;
        }
        if (this == charSequence || (charSequence.length() == (i4 = this.f2081c) && j(0, charSequence, i4))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f2081c == 0) {
            return 0;
        }
        int i4 = this.f2079a[this.f2080b];
        for (int i5 = 1; i5 < this.f2081c; i5++) {
            i4 = (i4 * 37) + this.f2079a[this.f2080b];
        }
        return i4;
    }

    public u l(byte[] bArr, int i4) {
        this.f2079a = bArr;
        this.f2080b = i4;
        int i5 = 0;
        while (true) {
            this.f2081c = i5;
            int i6 = this.f2081c;
            if (bArr[i4 + i6] != 0) {
                i5 = i6 + 1;
            } else {
                this.f2082d = null;
                return this;
            }
        }
    }

    public int length() {
        return this.f2081c;
    }

    public u n(String str) {
        if (str.isEmpty()) {
            o();
        } else {
            this.f2079a = new byte[str.length()];
            int i4 = 0;
            this.f2080b = 0;
            this.f2081c = str.length();
            while (i4 < this.f2081c) {
                char charAt = str.charAt(i4);
                if (charAt <= 127) {
                    this.f2079a[i4] = (byte) charAt;
                    i4++;
                } else {
                    throw new IllegalArgumentException('\"' + str + "\" is not an ASCII string");
                }
            }
            this.f2082d = str;
        }
        return this;
    }

    public u o() {
        this.f2079a = null;
        this.f2081c = 0;
        this.f2080b = 0;
        this.f2082d = "";
        return this;
    }

    /* renamed from: p */
    public u subSequence(int i4, int i5) {
        return new u(this.f2079a, this.f2080b + i4, i5 - i4);
    }

    public String toString() {
        if (this.f2082d == null) {
            this.f2082d = i(0, this.f2081c);
        }
        return this.f2082d;
    }

    private u(byte[] bArr, int i4, int i5) {
        this.f2079a = bArr;
        this.f2080b = i4;
        this.f2081c = i5;
    }
}
