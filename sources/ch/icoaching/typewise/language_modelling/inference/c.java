package ch.icoaching.typewise.language_modelling.inference;

import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f8476a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f8477a;

        public a(String str) {
            this.f8477a = str;
        }

        public final String a() {
            return this.f8477a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && o.a(this.f8477a, ((a) obj).f8477a);
        }

        public int hashCode() {
            String str = this.f8477a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f8477a;
            return "Inference(inferenceTechnique=" + str + ")";
        }
    }

    public c(a aVar) {
        o.e(aVar, "inference");
        this.f8476a = aVar;
    }

    public final a a() {
        return this.f8476a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && o.a(this.f8476a, ((c) obj).f8476a);
    }

    public int hashCode() {
        return this.f8476a.hashCode();
    }

    public String toString() {
        a aVar = this.f8476a;
        return "PredictionsTFModelConfigPartialOverride(inference=" + aVar + ")";
    }
}
