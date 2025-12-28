package ch.icoaching.wrio.autocorrect;

import kotlin.NoWhenBranchMatchedException;

public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9310a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState[] r0 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r1 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.OFF     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r1 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.LIMITED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r1 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.FULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f9310a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.autocorrect.b.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final boolean b(AutoCapitalizationState autoCapitalizationState) {
        int i4 = a.f9310a[autoCapitalizationState.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2 || i4 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
