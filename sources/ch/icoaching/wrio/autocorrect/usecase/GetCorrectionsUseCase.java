package ch.icoaching.wrio.autocorrect.usecase;

import android.view.inputmethod.CorrectionInfo;
import androidx.work.c;
import ch.icoaching.wrio.autocorrect.AutocorrectFacade;
import ch.icoaching.wrio.autocorrect.d;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;

public final class GetCorrectionsUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f9318a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AutocorrectFacade f9319b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f9320a;

        /* renamed from: b  reason: collision with root package name */
        private final List f9321b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9322c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9323d;

        /* renamed from: e  reason: collision with root package name */
        private final String f9324e;

        /* renamed from: f  reason: collision with root package name */
        private final int f9325f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f9326g;

        public a(String str, List list, String str2, int i4, String str3, int i5, boolean z3) {
            o.e(str, "text");
            o.e(list, "touchPoints");
            o.e(str2, "lastWord");
            o.e(str3, "secondLastWord");
            this.f9320a = str;
            this.f9321b = list;
            this.f9322c = str2;
            this.f9323d = i4;
            this.f9324e = str3;
            this.f9325f = i5;
            this.f9326g = z3;
        }

        public final String a() {
            return this.f9322c;
        }

        public final int b() {
            return this.f9323d;
        }

        public final String c() {
            return this.f9324e;
        }

        public final int d() {
            return this.f9325f;
        }

        public final String e() {
            return this.f9320a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.a(this.f9320a, aVar.f9320a) && o.a(this.f9321b, aVar.f9321b) && o.a(this.f9322c, aVar.f9322c) && this.f9323d == aVar.f9323d && o.a(this.f9324e, aVar.f9324e) && this.f9325f == aVar.f9325f && this.f9326g == aVar.f9326g;
        }

        public final List f() {
            return this.f9321b;
        }

        public int hashCode() {
            return (((((((((((this.f9320a.hashCode() * 31) + this.f9321b.hashCode()) * 31) + this.f9322c.hashCode()) * 31) + this.f9323d) * 31) + this.f9324e.hashCode()) * 31) + this.f9325f) * 31) + c.a(this.f9326g);
        }

        public String toString() {
            return "Request(text=" + this.f9320a + ", touchPoints=" + this.f9321b + ", lastWord=" + this.f9322c + ", lastWordOffset=" + this.f9323d + ", secondLastWord=" + this.f9324e + ", secondLastWordOffset=" + this.f9325f + ", storeCase=" + this.f9326g + ')';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final CorrectionInfo f9327a;

        /* renamed from: b  reason: collision with root package name */
        private final d f9328b;

        public b(CorrectionInfo correctionInfo, d dVar) {
            o.e(correctionInfo, "correctionInfo");
            o.e(dVar, "correctionCandidates");
            this.f9327a = correctionInfo;
            this.f9328b = dVar;
        }

        public final d a() {
            return this.f9328b;
        }

        public final CorrectionInfo b() {
            return this.f9327a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return o.a(this.f9327a, bVar.f9327a) && o.a(this.f9328b, bVar.f9328b);
        }

        public int hashCode() {
            return (this.f9327a.hashCode() * 31) + this.f9328b.hashCode();
        }

        public String toString() {
            return "Response(correctionInfo=" + this.f9327a + ", correctionCandidates=" + this.f9328b + ')';
        }
    }

    public GetCorrectionsUseCase(CoroutineDispatcher coroutineDispatcher, AutocorrectFacade autocorrectFacade) {
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(autocorrectFacade, "autocorrectFacade");
        this.f9318a = coroutineDispatcher;
        this.f9319b = autocorrectFacade;
    }

    public final Object b(a aVar, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f9318a, new GetCorrectionsUseCase$execute$2(aVar, this, (kotlin.coroutines.c<? super GetCorrectionsUseCase$execute$2>) null), cVar);
    }
}
