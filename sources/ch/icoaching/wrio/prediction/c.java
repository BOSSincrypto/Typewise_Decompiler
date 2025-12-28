package ch.icoaching.wrio.prediction;

import E0.s;
import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.keyboard.KeyCase;
import ch.icoaching.wrio.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10620a = true;

    /* renamed from: b  reason: collision with root package name */
    private EditorInfo f10621b;

    /* renamed from: c  reason: collision with root package name */
    private KeyCase f10622c = KeyCase.LOWERCASE;

    /* renamed from: d  reason: collision with root package name */
    private final List f10623d = new ArrayList();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10624a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.wrio.keyboard.KeyCase[] r0 = ch.icoaching.wrio.keyboard.KeyCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.LOWERCASE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.UPPERCASE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.CAPS_LOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f10624a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.prediction.c.a.<clinit>():void");
        }
    }

    public final void a() {
        this.f10623d.clear();
    }

    public final void b(EditorInfo editorInfo) {
        this.f10621b = editorInfo;
    }

    public final void c(KeyCase keyCase) {
        o.e(keyCase, "<set-?>");
        this.f10622c = keyCase;
    }

    public final void d(String str) {
        o.e(str, "prediction");
        this.f10623d.add(str);
    }

    public final void e(boolean z3) {
        this.f10620a = z3;
    }

    public final String f(String str) {
        Object obj;
        o.e(str, "predictionText");
        EditorInfo editorInfo = this.f10621b;
        if (editorInfo == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            return lowerCase;
        } else if (!this.f10620a || (!b.c(editorInfo) && !b.d(editorInfo))) {
            int i4 = a.f10624a[this.f10622c.ordinal()];
            if (i4 == 1) {
                Iterator it = this.f10623d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = ((String) obj).toLowerCase(locale);
                    o.d(lowerCase2, "toLowerCase(...)");
                    String lowerCase3 = str.toLowerCase(locale);
                    o.d(lowerCase3, "toLowerCase(...)");
                    if (o.a(lowerCase2, lowerCase3)) {
                        break;
                    }
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    return str;
                }
                return str2;
            } else if (i4 == 2) {
                return s.a(str);
            } else {
                if (i4 == 3) {
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    o.d(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            String n4 = e3.c.n(str);
            o.b(n4);
            return n4;
        }
    }
}
