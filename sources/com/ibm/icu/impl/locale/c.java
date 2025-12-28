package com.ibm.icu.impl.locale;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private char f12845a;

    /* renamed from: b  reason: collision with root package name */
    protected String f12846b;

    protected c(char c4) {
        this.f12845a = c4;
    }

    public String a() {
        return this.f12845a + "-" + this.f12846b;
    }

    public String b() {
        return this.f12846b;
    }

    public String toString() {
        return a();
    }

    c(char c4, String str) {
        this.f12845a = c4;
        this.f12846b = str;
    }
}
