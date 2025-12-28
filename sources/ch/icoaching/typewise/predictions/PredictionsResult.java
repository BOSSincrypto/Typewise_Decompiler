package ch.icoaching.typewise.predictions;

import androidx.work.c;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.o;
import o2.C0840a;

public final class PredictionsResult {

    /* renamed from: a  reason: collision with root package name */
    private final List f8832a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f8833b;

    public static final class Candidate {

        /* renamed from: a  reason: collision with root package name */
        private final String f8834a;

        /* renamed from: b  reason: collision with root package name */
        private final float f8835b;

        /* renamed from: c  reason: collision with root package name */
        private final float f8836c;

        /* renamed from: d  reason: collision with root package name */
        private final int f8837d;

        /* renamed from: e  reason: collision with root package name */
        private final Type f8838e;

        /* renamed from: f  reason: collision with root package name */
        private final Source f8839f;

        /* renamed from: g  reason: collision with root package name */
        private final String f8840g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f8841h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lch/icoaching/typewise/predictions/PredictionsResult$Candidate$Source;", "", "<init>", "(Ljava/lang/String;I)V", "BIGRAM", "UNIGRAM", "NEURAL_NETWORK", "WORDLIST", "ID", "UNKNOWN", "CORRECTION_SUGGESTION", "SPECIAL_PREDICTION", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum Source {
            BIGRAM,
            UNIGRAM,
            NEURAL_NETWORK,
            WORDLIST,
            ID,
            UNKNOWN,
            CORRECTION_SUGGESTION,
            SPECIAL_PREDICTION;

            static {
                Source[] a4;
                f8843b = a.a(a4);
            }

            public static C0840a getEntries() {
                return f8843b;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/typewise/predictions/PredictionsResult$Candidate$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PREDICTION", "SPECIAL_FIELD_PREDICTION", "CORRECTION_SUGGESTION", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum Type {
            PREDICTION,
            SPECIAL_FIELD_PREDICTION,
            CORRECTION_SUGGESTION;

            static {
                Type[] a4;
                f8845b = a.a(a4);
            }

            public static C0840a getEntries() {
                return f8845b;
            }
        }

        public Candidate(String str, float f4, float f5, int i4, Type type, Source source, String str2, boolean z3) {
            o.e(str, "text");
            o.e(type, "type");
            o.e(source, "source");
            o.e(str2, "modelUniqueIdentifier");
            this.f8834a = str;
            this.f8835b = f4;
            this.f8836c = f5;
            this.f8837d = i4;
            this.f8838e = type;
            this.f8839f = source;
            this.f8840g = str2;
            this.f8841h = z3;
        }

        public final int a() {
            return this.f8837d;
        }

        public final String b() {
            return this.f8840g;
        }

        public final float c() {
            return this.f8835b;
        }

        public final float d() {
            return this.f8836c;
        }

        public final Source e() {
            return this.f8839f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Candidate)) {
                return false;
            }
            Candidate candidate = (Candidate) obj;
            return o.a(this.f8834a, candidate.f8834a) && Float.compare(this.f8835b, candidate.f8835b) == 0 && Float.compare(this.f8836c, candidate.f8836c) == 0 && this.f8837d == candidate.f8837d && this.f8838e == candidate.f8838e && this.f8839f == candidate.f8839f && o.a(this.f8840g, candidate.f8840g) && this.f8841h == candidate.f8841h;
        }

        public final String f() {
            return this.f8834a;
        }

        public final Type g() {
            return this.f8838e;
        }

        public final boolean h() {
            return this.f8841h;
        }

        public int hashCode() {
            return (((((((((((((this.f8834a.hashCode() * 31) + Float.floatToIntBits(this.f8835b)) * 31) + Float.floatToIntBits(this.f8836c)) * 31) + this.f8837d) * 31) + this.f8838e.hashCode()) * 31) + this.f8839f.hashCode()) * 31) + this.f8840g.hashCode()) * 31) + c.a(this.f8841h);
        }

        public String toString() {
            int i4 = this.f8837d;
            String str = this.f8834a;
            float f4 = this.f8835b;
            float f5 = this.f8836c;
            Source source = this.f8839f;
            return "Candidate(" + i4 + " |" + str + "| " + f4 + " | " + f5 + " | " + source + ")";
        }
    }

    public PredictionsResult(List list, Set set) {
        o.e(list, "candidates");
        o.e(set, "tfCandidates");
        this.f8832a = list;
        this.f8833b = set;
    }

    public final List a() {
        return this.f8832a;
    }

    public final Set b() {
        return this.f8833b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredictionsResult)) {
            return false;
        }
        PredictionsResult predictionsResult = (PredictionsResult) obj;
        return o.a(this.f8832a, predictionsResult.f8832a) && o.a(this.f8833b, predictionsResult.f8833b);
    }

    public int hashCode() {
        return (this.f8832a.hashCode() * 31) + this.f8833b.hashCode();
    }

    public String toString() {
        List list = this.f8832a;
        Set set = this.f8833b;
        return "PredictionsResult(candidates=" + list + ", tfCandidates=" + set + ")";
    }
}
