package ch.icoaching.wrio.appnomix.data.network.suggestions;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.K;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u0019¨\u0006/"}, d2 = {"Lch/icoaching/wrio/appnomix/data/network/suggestions/SearchSuggestion;", "", "", "suggestionRank", "", "suggestionText", "url", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease", "(Lch/icoaching/wrio/appnomix/data/network/suggestions/SearchSuggestion;LI2/d;LH2/f;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lch/icoaching/wrio/appnomix/data/network/suggestions/SearchSuggestion;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSuggestionRank", "getSuggestionRank$annotations", "()V", "Ljava/lang/String;", "getSuggestionText", "getSuggestionText$annotations", "getUrl", "getUrl$annotations", "Companion", "b", "a", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class SearchSuggestion {
    public static final a Companion = new a((i) null);
    private final int suggestionRank;
    private final String suggestionText;
    private final String url;

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f9262a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9262a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9263b;

        static {
            b bVar = new b();
            f9262a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion", bVar, 3);
            s0Var.p("rank", false);
            s0Var.p("text", false);
            s0Var.p("url", false);
            f9263b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f9263b;
        }

        public final F2.b[] c() {
            G0 g02 = G0.f622a;
            return new F2.b[]{K.f636a, g02, G2.a.u(g02)};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final SearchSuggestion b(e eVar) {
            String str;
            String str2;
            int i4;
            int i5;
            e eVar2 = eVar;
            o.e(eVar2, "decoder");
            f fVar = f9263b;
            c d4 = eVar2.d(fVar);
            if (d4.p()) {
                int v3 = d4.v(fVar, 0);
                String z3 = d4.z(fVar, 1);
                i4 = v3;
                str = (String) d4.m(fVar, 2, G0.f622a, (Object) null);
                str2 = z3;
                i5 = 7;
            } else {
                boolean z4 = true;
                int i6 = 0;
                String str3 = null;
                String str4 = null;
                int i7 = 0;
                while (z4) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z4 = false;
                    } else if (e4 == 0) {
                        i6 = d4.v(fVar, 0);
                        i7 |= 1;
                    } else if (e4 == 1) {
                        str3 = d4.z(fVar, 1);
                        i7 |= 2;
                    } else if (e4 == 2) {
                        str4 = (String) d4.m(fVar, 2, G0.f622a, str4);
                        i7 |= 4;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                i4 = i6;
                i5 = i7;
                str2 = str3;
                str = str4;
            }
            d4.c(fVar);
            return new SearchSuggestion(i5, i4, str2, str, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, SearchSuggestion searchSuggestion) {
            o.e(fVar, "encoder");
            o.e(searchSuggestion, "value");
            f fVar2 = f9263b;
            d d4 = fVar.d(fVar2);
            SearchSuggestion.write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease(searchSuggestion, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ SearchSuggestion(int i4, int i5, String str, String str2, C0 c02) {
        if (7 != (i4 & 7)) {
            C0317n0.a(i4, 7, b.f9262a.a());
        }
        this.suggestionRank = i5;
        this.suggestionText = str;
        this.url = str2;
    }

    public static /* synthetic */ SearchSuggestion copy$default(SearchSuggestion searchSuggestion, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = searchSuggestion.suggestionRank;
        }
        if ((i5 & 2) != 0) {
            str = searchSuggestion.suggestionText;
        }
        if ((i5 & 4) != 0) {
            str2 = searchSuggestion.url;
        }
        return searchSuggestion.copy(i4, str, str2);
    }

    public static /* synthetic */ void getSuggestionRank$annotations() {
    }

    public static /* synthetic */ void getSuggestionText$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease(SearchSuggestion searchSuggestion, d dVar, f fVar) {
        dVar.z(fVar, 0, searchSuggestion.suggestionRank);
        dVar.p(fVar, 1, searchSuggestion.suggestionText);
        dVar.o(fVar, 2, G0.f622a, searchSuggestion.url);
    }

    public final int component1() {
        return this.suggestionRank;
    }

    public final String component2() {
        return this.suggestionText;
    }

    public final String component3() {
        return this.url;
    }

    public final SearchSuggestion copy(int i4, String str, String str2) {
        o.e(str, "suggestionText");
        return new SearchSuggestion(i4, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestion)) {
            return false;
        }
        SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
        return this.suggestionRank == searchSuggestion.suggestionRank && o.a(this.suggestionText, searchSuggestion.suggestionText) && o.a(this.url, searchSuggestion.url);
    }

    public final int getSuggestionRank() {
        return this.suggestionRank;
    }

    public final String getSuggestionText() {
        return this.suggestionText;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.suggestionText.hashCode() + (this.suggestionRank * 31)) * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SearchSuggestion(suggestionRank=" + this.suggestionRank + ", suggestionText=" + this.suggestionText + ", url=" + this.url + ')';
    }

    public SearchSuggestion(int i4, String str, String str2) {
        o.e(str, "suggestionText");
        this.suggestionRank = i4;
        this.suggestionText = str;
        this.url = str2;
    }
}
