package com.ibm.icu.impl.locale;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private String f12898a;

    /* renamed from: b  reason: collision with root package name */
    private String f12899b;

    /* renamed from: c  reason: collision with root package name */
    private String f12900c;

    /* renamed from: d  reason: collision with root package name */
    private int f12901d;

    /* renamed from: e  reason: collision with root package name */
    private int f12902e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12903f;

    public k(String str, String str2) {
        this.f12898a = str;
        this.f12899b = str2;
        h(0);
    }

    private int g(int i4) {
        loop0:
        while (i4 < this.f12898a.length()) {
            char charAt = this.f12898a.charAt(i4);
            for (int i5 = 0; i5 < this.f12899b.length(); i5++) {
                if (charAt == this.f12899b.charAt(i5)) {
                    break loop0;
                }
            }
            i4++;
        }
        return i4;
    }

    public String a() {
        return this.f12900c;
    }

    public int b() {
        return this.f12902e;
    }

    public int c() {
        return this.f12901d;
    }

    public boolean d() {
        if (this.f12902e < this.f12898a.length()) {
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.f12903f;
    }

    public String f() {
        if (d()) {
            int i4 = this.f12902e + 1;
            this.f12901d = i4;
            int g4 = g(i4);
            this.f12902e = g4;
            this.f12900c = this.f12898a.substring(this.f12901d, g4);
        } else {
            this.f12901d = this.f12902e;
            this.f12900c = null;
            this.f12903f = true;
        }
        return this.f12900c;
    }

    public k h(int i4) {
        if (i4 <= this.f12898a.length()) {
            this.f12901d = i4;
            int g4 = g(i4);
            this.f12902e = g4;
            this.f12900c = this.f12898a.substring(this.f12901d, g4);
            this.f12903f = false;
            return this;
        }
        throw new IndexOutOfBoundsException();
    }
}
