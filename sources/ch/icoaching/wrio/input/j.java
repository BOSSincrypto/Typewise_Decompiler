package ch.icoaching.wrio.input;

import android.view.inputmethod.EditorInfo;
import androidx.work.c;
import kotlin.jvm.internal.o;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9794a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9795b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9796c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9797d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9798e;

    /* renamed from: f  reason: collision with root package name */
    private final NumberInputType f9799f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9800a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9801b;

        /* renamed from: c  reason: collision with root package name */
        private NumberInputType f9802c;

        /* renamed from: d  reason: collision with root package name */
        private EditorInfo f9803d;

        public final a a(EditorInfo editorInfo) {
            o.e(editorInfo, "editorInfo");
            this.f9803d = editorInfo;
            return this;
        }

        public final a b(boolean z3) {
            this.f9801b = z3;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
            if (r4 != 208) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            if (r4 != 208) goto L_0x004c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.wrio.input.j c() {
            /*
                r13 = this;
                boolean r0 = r13.f9801b
                android.view.inputmethod.EditorInfo r1 = r13.f9803d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x007c
                int r4 = r1.inputType
                ch.icoaching.wrio.input.NumberInputType r4 = ch.icoaching.wrio.input.k.a(r4)
                r13.f9802c = r4
                int r4 = r1.inputType
                r5 = r4 & 15
                r6 = 112(0x70, float:1.57E-43)
                if (r5 == r6) goto L_0x006b
                r6 = 192(0xc0, float:2.69E-43)
                if (r5 == r6) goto L_0x006b
                r6 = 524288(0x80000, float:7.34684E-40)
                if (r5 == r6) goto L_0x006b
                if (r5 == 0) goto L_0x0066
                r6 = 208(0xd0, float:2.91E-43)
                r7 = 32
                r8 = 16
                r9 = 224(0xe0, float:3.14E-43)
                r10 = 144(0x90, float:2.02E-43)
                r11 = 128(0x80, float:1.794E-43)
                if (r5 == r2) goto L_0x0052
                r12 = 2
                if (r5 == r12) goto L_0x004e
                r12 = 3
                if (r5 == r12) goto L_0x004e
                r12 = 4
                if (r5 == r12) goto L_0x004e
                r4 = r4 & 4080(0xff0, float:5.717E-42)
                if (r4 == r11) goto L_0x0043
                if (r4 == r10) goto L_0x0043
                if (r4 == r9) goto L_0x0043
            L_0x0041:
                r5 = r2
                goto L_0x0046
            L_0x0043:
                r0 = r3
                r2 = r0
                goto L_0x0041
            L_0x0046:
                if (r4 == r8) goto L_0x004e
                if (r4 == r7) goto L_0x004e
                if (r4 == r6) goto L_0x004e
            L_0x004c:
                r4 = r3
                goto L_0x006d
            L_0x004e:
                r0 = r3
                r4 = r0
                r5 = r4
                goto L_0x006d
            L_0x0052:
                r4 = r4 & 4080(0xff0, float:5.717E-42)
                if (r4 == r11) goto L_0x005c
                if (r4 == r10) goto L_0x005c
                if (r4 == r9) goto L_0x005c
            L_0x005a:
                r5 = r2
                goto L_0x005f
            L_0x005c:
                r0 = r3
                r2 = r0
                goto L_0x005a
            L_0x005f:
                if (r4 == r8) goto L_0x004e
                if (r4 == r7) goto L_0x004e
                if (r4 == r6) goto L_0x004e
                goto L_0x004c
            L_0x0066:
                r4 = r2
                r0 = r3
                r2 = r0
                r5 = r2
                goto L_0x006d
            L_0x006b:
                r5 = r2
                goto L_0x004c
            L_0x006d:
                int r1 = r1.imeOptions
                r6 = 16777216(0x1000000, float:2.3509887E-38)
                r1 = r1 & r6
                r7 = r0
                r10 = r2
                if (r1 <= 0) goto L_0x0079
                r8 = r3
                r11 = r4
                goto L_0x0080
            L_0x0079:
                r11 = r4
                r8 = r5
                goto L_0x0080
            L_0x007c:
                r7 = r0
                r8 = r2
                r10 = r8
                r11 = r3
            L_0x0080:
                ch.icoaching.wrio.input.j r0 = new ch.icoaching.wrio.input.j
                boolean r9 = r13.f9800a
                ch.icoaching.wrio.input.NumberInputType r12 = r13.f9802c
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.j.a.c():ch.icoaching.wrio.input.j");
        }

        public final a d(boolean z3) {
            this.f9800a = z3;
            return this;
        }
    }

    public j(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, NumberInputType numberInputType) {
        this.f9794a = z3;
        this.f9795b = z4;
        this.f9796c = z5;
        this.f9797d = z6;
        this.f9798e = z7;
        this.f9799f = numberInputType;
    }

    public final boolean a() {
        return this.f9797d;
    }

    public final NumberInputType b() {
        return this.f9799f;
    }

    public final boolean c() {
        return this.f9794a;
    }

    public final boolean d() {
        return this.f9796c;
    }

    public final boolean e() {
        return this.f9798e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9794a == jVar.f9794a && this.f9795b == jVar.f9795b && this.f9796c == jVar.f9796c && this.f9797d == jVar.f9797d && this.f9798e == jVar.f9798e && this.f9799f == jVar.f9799f;
    }

    public final boolean f() {
        return this.f9795b;
    }

    public int hashCode() {
        int a4 = ((((((((c.a(this.f9794a) * 31) + c.a(this.f9795b)) * 31) + c.a(this.f9796c)) * 31) + c.a(this.f9797d)) * 31) + c.a(this.f9798e)) * 31;
        NumberInputType numberInputType = this.f9799f;
        return a4 + (numberInputType == null ? 0 : numberInputType.hashCode());
    }

    public String toString() {
        return "InputSession(isAutoSpaceEnabled=" + this.f9794a + ", isLearningEnabled=" + this.f9795b + ", isInputEditorAutoCaps=" + this.f9796c + ", arePredictionsSupported=" + this.f9797d + ", isInputTypeNull=" + this.f9798e + ", numberInputType=" + this.f9799f + ')';
    }
}
