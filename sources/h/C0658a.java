package h;

import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

/* renamed from: h.a  reason: case insensitive filesystem */
public final class C0658a {

    /* renamed from: a  reason: collision with root package name */
    private final TutorialModeManager f13614a;

    /* renamed from: b  reason: collision with root package name */
    private final b f13615b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f13616c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f13617d;

    /* renamed from: e  reason: collision with root package name */
    private EditorInfo f13618e;

    public C0658a(TutorialModeManager tutorialModeManager, b bVar) {
        o.e(tutorialModeManager, "tutorialModeManager");
        o.e(bVar, "keyboardSettings");
        this.f13614a = tutorialModeManager;
        this.f13615b = bVar;
        HashMap hashMap = new HashMap();
        this.f13616c = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13617d = hashMap2;
        Boolean bool = Boolean.FALSE;
        hashMap2.put(3, bool);
        hashMap2.put(0, bool);
        hashMap2.put(2, bool);
        hashMap2.put(4, bool);
        hashMap2.put(192, bool);
        hashMap2.put(524288, bool);
        Boolean bool2 = Boolean.TRUE;
        hashMap.put(176, bool2);
        hashMap.put(16, bool2);
    }

    private final boolean d(int i4) {
        Boolean bool = (Boolean) this.f13616c.get(Integer.valueOf(i4 & 4080));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean e(int i4) {
        if ((i4 & 15) == 1) {
            return true;
        }
        return false;
    }

    private final boolean f(EditorInfo editorInfo) {
        if (!this.f13615b.M() || this.f13614a.j() || editorInfo == null) {
            return false;
        }
        if (ch.icoaching.wrio.util.b.d(editorInfo)) {
            return true;
        }
        if (e(editorInfo.inputType)) {
            return d(editorInfo.inputType);
        }
        Boolean bool = (Boolean) this.f13617d.get(Integer.valueOf(editorInfo.inputType & 15));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void a(EditorInfo editorInfo) {
        this.f13618e = editorInfo;
    }

    public final void b(boolean z3) {
        Log log = Log.f10572a;
        Log.d(log, "Autofill", "Autofill is enabled " + z3, (Throwable) null, 4, (Object) null);
        this.f13616c.put(Integer.valueOf(Uuid.SIZE_BITS), Boolean.valueOf(z3));
        this.f13616c.put(144, Boolean.valueOf(z3));
        this.f13616c.put(224, Boolean.valueOf(z3));
    }

    public final boolean c() {
        return f(this.f13618e);
    }
}
