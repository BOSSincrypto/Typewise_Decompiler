package com.ibm.icu.text;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.text.b;
import com.ibm.icu.util.ICUUncheckedIOException;
import java.io.IOException;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private c f13090a;

    /* renamed from: b  reason: collision with root package name */
    private UnicodeSet f13091b;

    public a(c cVar, UnicodeSet unicodeSet) {
        this.f13090a = cVar;
        this.f13091b = unicodeSet;
    }

    private Appendable o(CharSequence charSequence, Appendable appendable, UnicodeSet.SpanCondition spanCondition) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < charSequence.length()) {
            try {
                int q02 = this.f13091b.q0(charSequence, i4, spanCondition);
                int i5 = q02 - i4;
                UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
                if (spanCondition == spanCondition2) {
                    if (i5 != 0) {
                        appendable.append(charSequence, i4, q02);
                    }
                    spanCondition = UnicodeSet.SpanCondition.SIMPLE;
                } else {
                    if (i5 != 0) {
                        appendable.append(this.f13090a.k(charSequence.subSequence(i4, q02), sb));
                    }
                    spanCondition = spanCondition2;
                }
                i4 = q02;
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        }
        return appendable;
    }

    private StringBuilder p(StringBuilder sb, CharSequence charSequence, boolean z3) {
        if (sb == charSequence) {
            throw new IllegalArgumentException();
        } else if (sb.length() != 0) {
            UnicodeSet unicodeSet = this.f13091b;
            UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            int q02 = unicodeSet.q0(charSequence, 0, spanCondition);
            if (q02 != 0) {
                CharSequence subSequence = charSequence.subSequence(0, q02);
                int s02 = this.f13091b.s0(sb, Integer.MAX_VALUE, spanCondition);
                if (s02 != 0) {
                    StringBuilder sb2 = new StringBuilder(sb.subSequence(s02, sb.length()));
                    if (z3) {
                        this.f13090a.l(sb2, subSequence);
                    } else {
                        this.f13090a.a(sb2, subSequence);
                    }
                    sb.delete(s02, Integer.MAX_VALUE).append(sb2);
                } else if (z3) {
                    this.f13090a.l(sb, subSequence);
                } else {
                    this.f13090a.a(sb, subSequence);
                }
            }
            if (q02 < charSequence.length()) {
                CharSequence subSequence2 = charSequence.subSequence(q02, charSequence.length());
                if (z3) {
                    o(subSequence2, sb, UnicodeSet.SpanCondition.NOT_CONTAINED);
                } else {
                    sb.append(subSequence2);
                }
            }
            return sb;
        } else if (z3) {
            return k(charSequence, sb);
        } else {
            sb.append(charSequence);
            return sb;
        }
    }

    public StringBuilder a(StringBuilder sb, CharSequence charSequence) {
        return p(sb, charSequence, false);
    }

    public int b(int i4) {
        if (this.f13091b.S(i4)) {
            return this.f13090a.b(i4);
        }
        return 0;
    }

    public boolean g(int i4) {
        if (!this.f13091b.S(i4) || this.f13090a.g(i4)) {
            return true;
        }
        return false;
    }

    public boolean i(CharSequence charSequence) {
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int i4 = 0;
        while (i4 < charSequence.length()) {
            int q02 = this.f13091b.q0(charSequence, i4, spanCondition);
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
            if (spanCondition == spanCondition2) {
                spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            } else if (!this.f13090a.i(charSequence.subSequence(i4, q02))) {
                return false;
            } else {
                spanCondition = spanCondition2;
            }
            i4 = q02;
        }
        return true;
    }

    public StringBuilder k(CharSequence charSequence, StringBuilder sb) {
        if (sb != charSequence) {
            sb.setLength(0);
            o(charSequence, sb, UnicodeSet.SpanCondition.SIMPLE);
            return sb;
        }
        throw new IllegalArgumentException();
    }

    public StringBuilder l(StringBuilder sb, CharSequence charSequence) {
        return p(sb, charSequence, true);
    }

    public b.t m(CharSequence charSequence) {
        b.t tVar = b.f13106z;
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int i4 = 0;
        while (i4 < charSequence.length()) {
            int q02 = this.f13091b.q0(charSequence, i4, spanCondition);
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
            if (spanCondition == spanCondition2) {
                spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            } else {
                b.t m4 = this.f13090a.m(charSequence.subSequence(i4, q02));
                if (m4 == b.f13105y) {
                    return m4;
                }
                if (m4 == b.f13092A) {
                    tVar = m4;
                }
                spanCondition = spanCondition2;
            }
            i4 = q02;
        }
        return tVar;
    }

    public int n(CharSequence charSequence) {
        UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.SIMPLE;
        int i4 = 0;
        while (i4 < charSequence.length()) {
            int q02 = this.f13091b.q0(charSequence, i4, spanCondition);
            UnicodeSet.SpanCondition spanCondition2 = UnicodeSet.SpanCondition.NOT_CONTAINED;
            if (spanCondition == spanCondition2) {
                spanCondition = UnicodeSet.SpanCondition.SIMPLE;
            } else {
                int n4 = i4 + this.f13090a.n(charSequence.subSequence(i4, q02));
                if (n4 < q02) {
                    return n4;
                }
                spanCondition = spanCondition2;
            }
            i4 = q02;
        }
        return charSequence.length();
    }
}
