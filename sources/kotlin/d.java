package kotlin;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.f;
import u2.C0906a;

abstract class d {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13885a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f13885a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.d.a.<clinit>():void");
        }
    }

    public static f a(LazyThreadSafetyMode lazyThreadSafetyMode, C0906a aVar) {
        o.e(lazyThreadSafetyMode, "mode");
        o.e(aVar, "initializer");
        int i4 = a.f13885a[lazyThreadSafetyMode.ordinal()];
        if (i4 == 1) {
            return new SynchronizedLazyImpl(aVar, (Object) null, 2, (i) null);
        }
        if (i4 == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i4 == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static f b(C0906a aVar) {
        o.e(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar, (Object) null, 2, (i) null);
    }
}
