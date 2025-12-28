package ch.icoaching.wrio.ai_assistant.text_transformation;

import ch.icoaching.wrio.ai_assistant.network.ActionType;
import i.e;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import o2.C0840a;

public final class TonalityTextTransformation extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9194c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f9195a;

    /* renamed from: b  reason: collision with root package name */
    private final Tonality f9196b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lch/icoaching/wrio/ai_assistant/text_transformation/TonalityTextTransformation$Tonality;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FORMAL", "FRIENDLY", "ACADEMIC", "CASUAL", "ROMANTIC", "FUNNY", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Tonality {
        FORMAL("formal"),
        FRIENDLY("friendly"),
        ACADEMIC("academic"),
        CASUAL("casual"),
        ROMANTIC("romantic"),
        FUNNY("funny");
        
        private final String value;

        static {
            Tonality[] a4;
            f9198b = kotlin.enums.a.a(a4);
        }

        private Tonality(String str) {
            this.value = str;
        }

        public static C0840a getEntries() {
            return f9198b;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TonalityTextTransformation(String str, Tonality tonality) {
        super((i) null);
        o.e(str, "userMessage");
        o.e(tonality, "tonality");
        this.f9195a = str;
        this.f9196b = tonality;
    }

    public String a() {
        return this.f9196b.getValue();
    }

    public String b(boolean z3) {
        if (z3) {
            return this.f9195a;
        }
        return kotlin.text.o.f("\n            <input_message>\n            " + this.f9195a + "\n            </input_message>\n        ");
    }

    public ActionType c() {
        return ActionType.TONALITY;
    }

    public String d() {
        return "</adjusted_tonality_message>";
    }

    public String e() {
        return "<adjusted_tonality_message>";
    }
}
