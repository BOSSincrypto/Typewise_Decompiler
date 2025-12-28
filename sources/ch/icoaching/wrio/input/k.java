package ch.icoaching.wrio.input;

import ch.icoaching.wrio.util.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C0721a;
import kotlin.text.o;

public abstract class k {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9804a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ch.icoaching.wrio.input.NumberInputType[] r0 = ch.icoaching.wrio.input.NumberInputType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.input.NumberInputType r1 = ch.icoaching.wrio.input.NumberInputType.PHONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.input.NumberInputType r1 = ch.icoaching.wrio.input.NumberInputType.OTHER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9804a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.k.a.<clinit>():void");
        }
    }

    public static final NumberInputType a(int i4) {
        if (!e.a(i4)) {
            return null;
        }
        if ((i4 & 15) == 3) {
            return NumberInputType.PHONE;
        }
        return NumberInputType.OTHER;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean b(char r4, int r5, java.lang.String r6) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = 45
            if (r0 != 0) goto L_0x0012
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 != 0) goto L_0x0029
            if (r4 != r2) goto L_0x002f
            goto L_0x0029
        L_0x0012:
            r0 = 2
            r3 = 0
            boolean r6 = kotlin.text.o.K(r6, r2, r1, r0, r3)
            if (r6 == 0) goto L_0x001f
            boolean r1 = java.lang.Character.isDigit(r4)
            goto L_0x002f
        L_0x001f:
            if (r5 != 0) goto L_0x002b
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 != 0) goto L_0x0029
            if (r4 != r2) goto L_0x002f
        L_0x0029:
            r1 = 1
            goto L_0x002f
        L_0x002b:
            boolean r1 = java.lang.Character.isDigit(r4)
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.k.b(char, int, java.lang.String):boolean");
    }

    private static final boolean c(char c4, String str) {
        if (Character.isDigit(c4) || o.K(str, '.', false, 2, (Object) null) || o.K(str, ',', false, 2, (Object) null)) {
            return Character.isDigit(c4);
        }
        if (c4 == '.' || c4 == ',') {
            return true;
        }
        return false;
    }

    public static final boolean d(NumberInputType numberInputType, char c4, int i4, String str) {
        kotlin.jvm.internal.o.e(numberInputType, "<this>");
        kotlin.jvm.internal.o.e(str, "currentText");
        int i5 = a.f9804a[numberInputType.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            } else if (b(c4, i4, str) || c(c4, str)) {
                return true;
            }
        } else if (Character.isDigit(c4) || C0721a.d(c4) || c4 == '+' || c4 == '-' || c4 == '(' || c4 == ')' || c4 == '/' || c4 == 'N' || c4 == ',' || c4 == '.' || c4 == '*' || c4 == ';' || c4 == '#') {
            return true;
        }
        return false;
    }
}
