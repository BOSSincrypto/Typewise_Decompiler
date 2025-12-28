package com.ibm.icu.util;

import java.util.NoSuchElementException;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private UResourceBundle f13330a;

    /* renamed from: b  reason: collision with root package name */
    private int f13331b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f13332c = 0;

    public g(UResourceBundle uResourceBundle) {
        this.f13330a = uResourceBundle;
        this.f13332c = uResourceBundle.p();
    }

    public boolean a() {
        if (this.f13331b < this.f13332c) {
            return true;
        }
        return false;
    }

    public UResourceBundle b() {
        int i4 = this.f13331b;
        if (i4 < this.f13332c) {
            UResourceBundle uResourceBundle = this.f13330a;
            this.f13331b = i4 + 1;
            return uResourceBundle.b(i4);
        }
        throw new NoSuchElementException();
    }

    public String c() {
        int i4 = this.f13331b;
        if (i4 < this.f13332c) {
            UResourceBundle uResourceBundle = this.f13330a;
            this.f13331b = i4 + 1;
            return uResourceBundle.r(i4);
        }
        throw new NoSuchElementException();
    }

    public void d() {
        this.f13331b = 0;
    }
}
