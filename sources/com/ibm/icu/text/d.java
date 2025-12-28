package com.ibm.icu.text;

import a2.j;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f13127a;

    /* renamed from: b  reason: collision with root package name */
    public int f13128b;

    /* renamed from: c  reason: collision with root package name */
    public String f13129c;

    /* renamed from: d  reason: collision with root package name */
    private UnicodeSet f13130d;

    /* renamed from: e  reason: collision with root package name */
    private int f13131e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f13132f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f13133g;

    /* renamed from: h  reason: collision with root package name */
    private int f13134h;

    /* renamed from: i  reason: collision with root package name */
    private Iterator f13135i = null;

    public d(UnicodeSet unicodeSet) {
        e(unicodeSet);
    }

    private void b(int i4) {
        this.f13134h = this.f13130d.Z(i4);
        this.f13133g = this.f13130d.Y(i4);
    }

    public String a() {
        int i4 = this.f13127a;
        if (i4 != -1) {
            return j.k(i4);
        }
        return this.f13129c;
    }

    public boolean c() {
        int i4 = this.f13134h;
        if (i4 <= this.f13133g) {
            this.f13134h = i4 + 1;
            this.f13128b = i4;
            this.f13127a = i4;
            return true;
        }
        int i5 = this.f13132f;
        if (i5 < this.f13131e) {
            int i6 = i5 + 1;
            this.f13132f = i6;
            b(i6);
            int i7 = this.f13134h;
            this.f13134h = i7 + 1;
            this.f13128b = i7;
            this.f13127a = i7;
            return true;
        }
        Iterator it = this.f13135i;
        if (it == null) {
            return false;
        }
        this.f13127a = -1;
        this.f13129c = (String) it.next();
        if (!this.f13135i.hasNext()) {
            this.f13135i = null;
        }
        return true;
    }

    public void d() {
        int X3 = this.f13130d.X() - 1;
        this.f13131e = X3;
        this.f13132f = 0;
        this.f13133g = -1;
        this.f13134h = 0;
        if (X3 >= 0) {
            b(0);
        }
        if (this.f13130d.b0()) {
            this.f13135i = this.f13130d.f13070e.iterator();
        } else {
            this.f13135i = null;
        }
    }

    public void e(UnicodeSet unicodeSet) {
        this.f13130d = unicodeSet;
        d();
    }
}
