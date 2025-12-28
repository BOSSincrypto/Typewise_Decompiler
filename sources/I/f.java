package i;

import ch.icoaching.wrio.ai_assistant.network.ActionType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class f extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13661c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13662a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13663b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, String str2) {
        super((i) null);
        o.e(str, "userMessage");
        o.e(str2, "language");
        this.f13662a = str;
        this.f13663b = str2;
    }

    public String a() {
        return this.f13663b;
    }

    public String b(boolean z3) {
        if (z3) {
            return this.f13662a;
        }
        return kotlin.text.o.f("\n            <input_message>\n            " + this.f13662a + "\n            </input_message>\n            <translate_target_language>\n            " + this.f13663b + "\n            </translate_target_language>\n        ");
    }

    public ActionType c() {
        return ActionType.TRANSLATE;
    }

    public String d() {
        return "</translated_message>";
    }

    public String e() {
        return "<translated_message>";
    }
}
