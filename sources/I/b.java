package i;

import ch.icoaching.wrio.ai_assistant.network.ActionType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class b extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13655b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13656a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super((i) null);
        o.e(str, "userMessage");
        this.f13656a = str;
    }

    public String a() {
        return "";
    }

    public String b(boolean z3) {
        if (z3) {
            return this.f13656a;
        }
        return kotlin.text.o.f("\n            <input_message>\n            " + this.f13656a + "\n            </input_message>\n        ");
    }

    public ActionType c() {
        return ActionType.INCLUSIVE_LANGUAGE;
    }

    public String d() {
        return "</inclusive_message>";
    }

    public String e() {
        return "<inclusive_message>";
    }
}
