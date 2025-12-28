package ch.icoaching.wrio.dictionary;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0300f;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016¨\u0006("}, d2 = {"Lch/icoaching/wrio/dictionary/LanguagesInAssets;", "", "", "", "languages", "<init>", "(Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/dictionary/LanguagesInAssets;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lch/icoaching/wrio/dictionary/LanguagesInAssets;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLanguages", "getLanguages$annotations", "()V", "Companion", "a", "b", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class LanguagesInAssets {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers = {new C0300f(G0.f622a)};
    public static final b Companion = new b((i) null);
    private final List<String> languages;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9604a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9605b;

        static {
            a aVar = new a();
            f9604a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.dictionary.LanguagesInAssets", aVar, 1);
            s0Var.p("available_languages", false);
            f9605b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f9605b;
        }

        public final F2.b[] c() {
            return new F2.b[]{LanguagesInAssets.$childSerializers[0]};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final LanguagesInAssets b(e eVar) {
            List list;
            o.e(eVar, "decoder");
            f fVar = f9605b;
            c d4 = eVar.d(fVar);
            F2.b[] access$get$childSerializers$cp = LanguagesInAssets.$childSerializers;
            int i4 = 1;
            if (d4.p()) {
                list = (List) d4.E(fVar, 0, access$get$childSerializers$cp[0], (Object) null);
            } else {
                boolean z3 = true;
                int i5 = 0;
                List list2 = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        list2 = (List) d4.E(fVar, 0, access$get$childSerializers$cp[0], list2);
                        i5 = 1;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                list = list2;
                i4 = i5;
            }
            d4.c(fVar);
            return new LanguagesInAssets(i4, list, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, LanguagesInAssets languagesInAssets) {
            o.e(fVar, "encoder");
            o.e(languagesInAssets, "value");
            f fVar2 = f9605b;
            d d4 = fVar.d(fVar2);
            d4.f(fVar2, 0, LanguagesInAssets.$childSerializers[0], languagesInAssets.languages);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f9604a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public /* synthetic */ LanguagesInAssets(int i4, List list, C0 c02) {
        if (1 != (i4 & 1)) {
            C0317n0.a(i4, 1, a.f9604a.a());
        }
        this.languages = list;
    }

    public static /* synthetic */ LanguagesInAssets copy$default(LanguagesInAssets languagesInAssets, List<String> list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = languagesInAssets.languages;
        }
        return languagesInAssets.copy(list);
    }

    public static /* synthetic */ void getLanguages$annotations() {
    }

    public final List<String> component1() {
        return this.languages;
    }

    public final LanguagesInAssets copy(List<String> list) {
        o.e(list, "languages");
        return new LanguagesInAssets(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LanguagesInAssets) && o.a(this.languages, ((LanguagesInAssets) obj).languages);
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public int hashCode() {
        return this.languages.hashCode();
    }

    public String toString() {
        return "LanguagesInAssets(languages=" + this.languages + ')';
    }

    public LanguagesInAssets(List<String> list) {
        o.e(list, "languages");
        this.languages = list;
    }
}
