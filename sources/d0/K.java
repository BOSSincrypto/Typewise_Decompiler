package D0;

import ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult;
import kotlin.jvm.internal.o;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    private final String f239a;

    /* renamed from: b  reason: collision with root package name */
    private final LMInferenceResult f240b;

    /* renamed from: c  reason: collision with root package name */
    private final String f241c;

    public K(String str, LMInferenceResult lMInferenceResult, String str2) {
        o.e(str, "originalText");
        o.e(lMInferenceResult, "predictionResult");
        this.f239a = str;
        this.f240b = lMInferenceResult;
        this.f241c = str2;
    }

    public final LMInferenceResult a() {
        return this.f240b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k4 = (K) obj;
        if (o.a(this.f239a, k4.f239a) && o.a(this.f240b, k4.f240b) && o.a(this.f241c, k4.f241c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((this.f239a.hashCode() * 31) + this.f240b.hashCode()) * 31;
        String str = this.f241c;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        String str = this.f239a;
        LMInferenceResult lMInferenceResult = this.f240b;
        String str2 = this.f241c;
        return "CompletionLibraryResult(originalText=" + str + ", predictionResult=" + lMInferenceResult + ", langCode=" + str2 + ")";
    }
}
