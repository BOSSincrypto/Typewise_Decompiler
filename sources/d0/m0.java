package D0;

import ch.icoaching.typewise.language_modelling.modelling.sentence_completion.PositionFilter;
import java.util.Map;
import kotlin.jvm.internal.o;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f340a;

    /* renamed from: b  reason: collision with root package name */
    private final int f341b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f342c;

    /* renamed from: d  reason: collision with root package name */
    private PositionFilter f343d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f344e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f345f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f346g;

    public m0(String str, int i4, Map map, PositionFilter positionFilter, Boolean bool, Boolean bool2, Boolean bool3) {
        PositionFilter positionFilter2;
        o.e(str, "sentPossiblyUpper");
        o.e(map, "requiredChars");
        this.f340a = str;
        this.f341b = i4;
        this.f342c = map;
        this.f343d = positionFilter;
        this.f344e = bool;
        this.f345f = bool2;
        this.f346g = bool3;
        if (positionFilter == null) {
            Boolean bool4 = Boolean.TRUE;
            if (o.a(bool, bool4)) {
                positionFilter2 = PositionFilter.BEGINNING_OF_EMAIL;
            } else if (o.a(bool3, bool4)) {
                positionFilter2 = PositionFilter.BEGINNING_OF_PARAGRAPH;
            } else if (o.a(bool2, bool4)) {
                positionFilter2 = PositionFilter.BEGINNING_OF_SENTENCE;
            } else {
                positionFilter2 = PositionFilter.ANYWHERE;
            }
            this.f343d = positionFilter2;
        }
    }

    public final int a() {
        return this.f341b;
    }

    public final PositionFilter b() {
        return this.f343d;
    }

    public final Map c() {
        return this.f342c;
    }

    public final String d() {
        return this.f340a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (o.a(this.f340a, m0Var.f340a) && this.f341b == m0Var.f341b && o.a(this.f342c, m0Var.f342c) && this.f343d == m0Var.f343d && o.a(this.f344e, m0Var.f344e) && o.a(this.f345f, m0Var.f345f) && o.a(this.f346g, m0Var.f346g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int hashCode = ((((this.f340a.hashCode() * 31) + this.f341b) * 31) + this.f342c.hashCode()) * 31;
        PositionFilter positionFilter = this.f343d;
        int i7 = 0;
        if (positionFilter == null) {
            i4 = 0;
        } else {
            i4 = positionFilter.hashCode();
        }
        int i8 = (hashCode + i4) * 31;
        Boolean bool = this.f344e;
        if (bool == null) {
            i5 = 0;
        } else {
            i5 = bool.hashCode();
        }
        int i9 = (i8 + i5) * 31;
        Boolean bool2 = this.f345f;
        if (bool2 == null) {
            i6 = 0;
        } else {
            i6 = bool2.hashCode();
        }
        int i10 = (i9 + i6) * 31;
        Boolean bool3 = this.f346g;
        if (bool3 != null) {
            i7 = bool3.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        String str = this.f340a;
        int i4 = this.f341b;
        Map map = this.f342c;
        PositionFilter positionFilter = this.f343d;
        Boolean bool = this.f344e;
        Boolean bool2 = this.f345f;
        Boolean bool3 = this.f346g;
        return "SentenceDescription(sentPossiblyUpper=" + str + ", counts=" + i4 + ", requiredChars=" + map + ", positionFilter=" + positionFilter + ", beginningOfMail=" + bool + ", beginningOfSentence=" + bool2 + ", newLine=" + bool3 + ")";
    }
}
