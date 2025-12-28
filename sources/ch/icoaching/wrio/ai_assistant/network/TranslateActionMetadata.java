package ch.icoaching.wrio.ai_assistant.network;

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
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/TranslateActionMetadata;", "", "", "targetLanguage", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/ai_assistant/network/TranslateActionMetadata;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lch/icoaching/wrio/ai_assistant/network/TranslateActionMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTargetLanguage", "getTargetLanguage$annotations", "()V", "Companion", "a", "b", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class TranslateActionMetadata {
    public static final b Companion = new b((i) null);
    private final String targetLanguage;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9171a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9172b;

        static {
            a aVar = new a();
            f9171a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.ai_assistant.network.TranslateActionMetadata", aVar, 1);
            s0Var.p("targetLanguage", false);
            f9172b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f9172b;
        }

        public final F2.b[] c() {
            return new F2.b[]{G0.f622a};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final TranslateActionMetadata b(e eVar) {
            String str;
            o.e(eVar, "decoder");
            f fVar = f9172b;
            c d4 = eVar.d(fVar);
            int i4 = 1;
            if (d4.p()) {
                str = d4.z(fVar, 0);
            } else {
                boolean z3 = true;
                int i5 = 0;
                str = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        str = d4.z(fVar, 0);
                        i5 = 1;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                i4 = i5;
            }
            d4.c(fVar);
            return new TranslateActionMetadata(i4, str, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, TranslateActionMetadata translateActionMetadata) {
            o.e(fVar, "encoder");
            o.e(translateActionMetadata, "value");
            f fVar2 = f9172b;
            d d4 = fVar.d(fVar2);
            d4.p(fVar2, 0, translateActionMetadata.targetLanguage);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f9171a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public /* synthetic */ TranslateActionMetadata(int i4, String str, C0 c02) {
        if (1 != (i4 & 1)) {
            C0317n0.a(i4, 1, a.f9171a.a());
        }
        this.targetLanguage = str;
    }

    public static /* synthetic */ TranslateActionMetadata copy$default(TranslateActionMetadata translateActionMetadata, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = translateActionMetadata.targetLanguage;
        }
        return translateActionMetadata.copy(str);
    }

    public static /* synthetic */ void getTargetLanguage$annotations() {
    }

    public final String component1() {
        return this.targetLanguage;
    }

    public final TranslateActionMetadata copy(String str) {
        o.e(str, "targetLanguage");
        return new TranslateActionMetadata(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslateActionMetadata) && o.a(this.targetLanguage, ((TranslateActionMetadata) obj).targetLanguage);
    }

    public final String getTargetLanguage() {
        return this.targetLanguage;
    }

    public int hashCode() {
        return this.targetLanguage.hashCode();
    }

    public String toString() {
        return "TranslateActionMetadata(targetLanguage=" + this.targetLanguage + ')';
    }

    public TranslateActionMetadata(String str) {
        o.e(str, "targetLanguage");
        this.targetLanguage = str;
    }
}
