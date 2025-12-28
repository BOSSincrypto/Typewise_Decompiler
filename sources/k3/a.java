package k3;

import ch.icoaching.wrio.keyboard.layout.Layout;
import kotlin.jvm.internal.o;

public abstract class a {

    /* renamed from: k3.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0198a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13807a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ch.icoaching.wrio.keyboard.layout.Layout[] r0 = ch.icoaching.wrio.keyboard.layout.Layout.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.AUTO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.QWERTY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.QWERTZ     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.wrio.keyboard.layout.Layout r1 = ch.icoaching.wrio.keyboard.layout.Layout.AZERTY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f13807a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.a.C0198a.<clinit>():void");
        }
    }

    public static final boolean a(Layout layout) {
        o.e(layout, "<this>");
        int i4 = C0198a.f13807a[layout.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            return false;
        }
        return true;
    }
}
