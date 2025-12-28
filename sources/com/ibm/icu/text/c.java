package com.ibm.icu.text;

import com.ibm.icu.impl.i;
import com.ibm.icu.text.b;

public abstract class c {
    protected c() {
    }

    public static c c() {
        return i.d().f12734b;
    }

    public static c d() {
        return i.d().f12735c;
    }

    public static c e() {
        return i.e().f12734b;
    }

    public static c f() {
        return i.e().f12735c;
    }

    public abstract StringBuilder a(StringBuilder sb, CharSequence charSequence);

    public int b(int i4) {
        return 0;
    }

    public abstract boolean g(int i4);

    public abstract boolean h(int i4);

    public abstract boolean i(CharSequence charSequence);

    public String j(CharSequence charSequence) {
        if (charSequence instanceof String) {
            int n4 = n(charSequence);
            if (n4 == charSequence.length()) {
                return (String) charSequence;
            }
            if (n4 != 0) {
                StringBuilder sb = new StringBuilder(charSequence.length());
                sb.append(charSequence, 0, n4);
                return l(sb, charSequence.subSequence(n4, charSequence.length())).toString();
            }
        }
        return k(charSequence, new StringBuilder(charSequence.length())).toString();
    }

    public abstract StringBuilder k(CharSequence charSequence, StringBuilder sb);

    public abstract StringBuilder l(StringBuilder sb, CharSequence charSequence);

    public abstract b.t m(CharSequence charSequence);

    public abstract int n(CharSequence charSequence);
}
