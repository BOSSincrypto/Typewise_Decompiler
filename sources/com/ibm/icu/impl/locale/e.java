package com.ibm.icu.impl.locale;

import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f12857a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12858b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12859c;

    /* renamed from: d  reason: collision with root package name */
    final int f12860d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12861e;

    public e(String str, String str2, String str3, int i4) {
        this.f12857a = str;
        this.f12858b = str2;
        this.f12859c = str3;
        this.f12860d = a(str3);
        this.f12861e = i4;
    }

    public static final int a(String str) {
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        if (str.length() == 2) {
            int charAt5 = str.charAt(0) - 'A';
            if (charAt5 < 0 || 25 < charAt5 || str.charAt(1) - 'A' < 0 || 25 < charAt4) {
                return 0;
            }
            return (charAt5 * 26) + charAt4 + 1001;
        } else if (str.length() != 3 || str.charAt(0) - '0' < 0 || 9 < charAt || str.charAt(1) - '0' < 0 || 9 < charAt2 || str.charAt(2) - '0' < 0 || 9 < charAt3) {
            return 0;
        } else {
            return (((charAt * 10) + charAt2) * 10) + charAt3 + 1;
        }
    }

    public boolean b(e eVar) {
        if (!this.f12857a.equals(eVar.f12857a) || !this.f12858b.equals(eVar.f12858b) || !this.f12859c.equals(eVar.f12859c)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == e.class) {
                e eVar = (e) obj;
                if (!this.f12857a.equals(eVar.f12857a) || !this.f12858b.equals(eVar.f12858b) || !this.f12859c.equals(eVar.f12859c) || this.f12861e != eVar.f12861e) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f12857a, this.f12858b, this.f12859c, Integer.valueOf(this.f12861e)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f12857a);
        if (!this.f12858b.isEmpty()) {
            sb.append('-');
            sb.append(this.f12858b);
        }
        if (!this.f12859c.isEmpty()) {
            sb.append('-');
            sb.append(this.f12859c);
        }
        return sb.toString();
    }
}
