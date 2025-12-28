package P2;

import android.content.Context;
import ch.icoaching.wrio.C0560y;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.logging.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import l2.g;
import l2.q;
import u2.C0906a;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1166a;

    /* renamed from: b  reason: collision with root package name */
    private final B f1167b;

    /* renamed from: c  reason: collision with root package name */
    private final ch.icoaching.wrio.data.b f1168c;

    /* renamed from: d  reason: collision with root package name */
    private final ch.icoaching.wrio.data.c f1169d;

    /* renamed from: e  reason: collision with root package name */
    private final C0350d f1170e;

    /* renamed from: f  reason: collision with root package name */
    public ThemeModel.SmartBarTheme f1171f;

    /* renamed from: g  reason: collision with root package name */
    private b f1172g;

    /* renamed from: h  reason: collision with root package name */
    private a f1173h;

    /* renamed from: i  reason: collision with root package name */
    private E f1174i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1175j;

    public interface a {
        void a();

        void b();

        void c();
    }

    public interface b {
        void c(String str);
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1176a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.wrio.keyboard.KeyboardLayoutType[] r0 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r1 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.HEXAGON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r1 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.HEXAGON_LEGACY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r1 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.RECTANGLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f1176a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.p.c.<clinit>():void");
        }
    }

    public p(Context context, B b4, ch.icoaching.wrio.data.b bVar, ch.icoaching.wrio.data.c cVar, C0350d dVar) {
        o.e(context, "applicationContext");
        o.e(b4, "defaultKeyboardController");
        o.e(bVar, "keyboardSettings");
        o.e(cVar, "languageSettings");
        o.e(dVar, "dropdownAnimator");
        this.f1166a = context;
        this.f1167b = b4;
        this.f1168c = bVar;
        this.f1169d = cVar;
        this.f1170e = dVar;
    }

    /* access modifiers changed from: private */
    public static final q A(p pVar) {
        pVar.B();
        return q.f14567a;
    }

    private final void B() {
        w(new n(this));
    }

    /* access modifiers changed from: private */
    public static final q C(p pVar) {
        pVar.w(new C0352f(pVar));
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q D(p pVar) {
        a aVar = pVar.f1173h;
        if (aVar != null) {
            aVar.c();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q E(p pVar) {
        pVar.w(new o(pVar));
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q F(p pVar) {
        a aVar = pVar.f1173h;
        if (aVar != null) {
            aVar.a();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q G(p pVar) {
        pVar.f1175j = true;
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q H(p pVar) {
        int i4 = c.f1176a[pVar.f1168c.C().ordinal()];
        if (i4 == 1 || i4 == 2) {
            pVar.f1168c.O(KeyboardLayoutType.RECTANGLE);
        } else if (i4 == 3) {
            ch.icoaching.wrio.data.b bVar = pVar.f1168c;
            bVar.O(bVar.E());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q m(p pVar) {
        a aVar = pVar.f1173h;
        if (aVar != null) {
            aVar.b();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q n(p pVar, String str) {
        o.e(str, "languageCode");
        b bVar = pVar.f1172g;
        if (bVar != null) {
            bVar.c(str);
        }
        pVar.v(str);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q o(C0906a aVar, p pVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        pVar.y();
        pVar.f1175j = false;
        return q.f14567a;
    }

    static /* synthetic */ void r(p pVar, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        pVar.v(str);
    }

    public static /* synthetic */ void s(p pVar, C0906a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        pVar.w(aVar);
    }

    private final void t(Context context) {
        Log.d(Log.f10572a, "DropdownController", "show() :: Start", (Throwable) null, 4, (Object) null);
        E e4 = this.f1174i;
        if (e4 == null) {
            e4 = new E(context);
            e4.setDropdownAnimator(this.f1170e);
            e4.setOnCloseCallback(new C0351e(this));
            e4.setOnLayoutSwitchCallback(new g(this));
            e4.setOnTutorialClickCallback(new h(this));
            e4.setOnSettingsClickCallback(new i(this));
            e4.setOnLanguageSelectedCallback(new j(this));
            e4.setOnAddLanguageCallback(new k(this));
            this.f1174i = e4;
        }
        e4.setLayoutType(this.f1168c.C());
        e4.setTheme(l());
        e4.setTopMargin(context.getResources().getDimensionPixelSize(C0560y.smart_bar_height_offset) + this.f1167b.d());
        r(this, (String) null, 1, (Object) null);
        this.f1167b.s(e4);
        e4.J(this.f1167b.c(), new l(this));
    }

    private final void v(String str) {
        Pair pair;
        List<String> e4 = this.f1169d.e();
        if (str == null) {
            str = this.f1169d.b();
        }
        ArrayList<Pair> arrayList = new ArrayList<>(C0718m.t(e4, 10));
        for (String str2 : e4) {
            String a4 = ch.icoaching.wrio.util.a.a(this.f1166a, str2);
            if (a4 != null) {
                pair = g.a(str2, a4);
            } else {
                pair = null;
            }
            arrayList.add(pair);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair2 : arrayList) {
            if (pair2 != null) {
                arrayList2.add(pair2);
            }
        }
        Map o4 = D.o(arrayList2);
        E e5 = this.f1174i;
        if (e5 != null) {
            e5.K(o4, str);
        }
    }

    /* access modifiers changed from: private */
    public static final q x(p pVar) {
        s(pVar, (C0906a) null, 1, (Object) null);
        return q.f14567a;
    }

    private final void y() {
        E e4 = this.f1174i;
        if (e4 != null) {
            this.f1167b.B(e4);
        }
    }

    public final ThemeModel.SmartBarTheme l() {
        ThemeModel.SmartBarTheme smartBarTheme = this.f1171f;
        if (smartBarTheme != null) {
            return smartBarTheme;
        }
        o.p("smartBarTheme");
        return null;
    }

    public final void p(a aVar) {
        this.f1173h = aVar;
    }

    public final void q(b bVar) {
        this.f1172g = bVar;
    }

    public final void u(ThemeModel.SmartBarTheme smartBarTheme) {
        o.e(smartBarTheme, "<set-?>");
        this.f1171f = smartBarTheme;
    }

    public final void w(C0906a aVar) {
        E e4 = this.f1174i;
        if (e4 != null) {
            e4.L(new m(aVar, this));
        }
    }

    public final void z(Context context) {
        o.e(context, "context");
        synchronized (this) {
            try {
                if (this.f1175j) {
                    s(this, (C0906a) null, 1, (Object) null);
                } else {
                    t(context);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
