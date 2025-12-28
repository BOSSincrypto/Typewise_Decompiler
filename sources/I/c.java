package i;

import ch.icoaching.wrio.ai_assistant.network.ActionType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13657b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13658a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super((i) null);
        o.e(str, "userMessage");
        this.f13658a = str;
    }

    public String a() {
        return "";
    }

    public String b(boolean z3) {
        if (z3) {
            return this.f13658a;
        }
        return kotlin.text.o.f("\n            <input_message>\n            " + this.f13658a + "\n            </input_message>\n        ");
    }

    public ActionType c() {
        return ActionType.PROOFREAD;
    }

    public String d() {
        return "</correct_message>";
    }

    public String e() {
        return "<correct_message>";
    }
}
