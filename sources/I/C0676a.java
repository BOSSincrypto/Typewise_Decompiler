package i;

import ch.icoaching.wrio.ai_assistant.network.ActionType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: i.a  reason: case insensitive filesystem */
public final class C0676a extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final C0190a f13653b = new C0190a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13654a;

    /* renamed from: i.a$a  reason: collision with other inner class name */
    public static final class C0190a {
        public /* synthetic */ C0190a(i iVar) {
            this();
        }

        private C0190a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0676a(String str) {
        super((i) null);
        o.e(str, "userMessage");
        this.f13654a = str;
    }

    public String a() {
        return "";
    }

    public String b(boolean z3) {
        if (z3) {
            return this.f13654a;
        }
        return kotlin.text.o.f("\n            <input_message>\n            " + this.f13654a + "\n            </input_message>\n        ");
    }

    public ActionType c() {
        return ActionType.EXTEND;
    }

    public String d() {
        return "</extended_message>";
    }

    public String e() {
        return "<extended_message>";
    }
}
