package z0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import u2.r;
import z0.C0967a;

/* renamed from: z0.b  reason: case insensitive filesystem */
public final class C0968b {

    /* renamed from: a  reason: collision with root package name */
    private final r f16495a;

    /* renamed from: b  reason: collision with root package name */
    private Pair f16496b;

    /* renamed from: z0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16497a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.typewise.text.CapsMode[] r0 = ch.icoaching.typewise.text.CapsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.text.CapsMode r1 = ch.icoaching.typewise.text.CapsMode.LOWER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.typewise.text.CapsMode r1 = ch.icoaching.typewise.text.CapsMode.TITLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.typewise.text.CapsMode r1 = ch.icoaching.typewise.text.CapsMode.MIXED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f16497a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.C0968b.a.<clinit>():void");
        }
    }

    public C0968b(r rVar) {
        o.e(rVar, "getBiGrams");
        this.f16495a = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r17, boolean r18, java.lang.String r19, int r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            java.lang.String r3 = "textBefore"
            kotlin.jvm.internal.o.e(r1, r3)
            java.lang.String r3 = "language"
            kotlin.jvm.internal.o.e(r2, r3)
            E0.o r3 = E0.s.d(r17)
            java.lang.Object r4 = r3.a()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r4, r5)
            java.lang.Object r3 = r3.b()
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            kotlin.Pair r7 = r0.f16496b
            if (r7 == 0) goto L_0x004d
            kotlin.jvm.internal.o.b(r7)
            java.lang.Object r7 = r7.getFirst()
            boolean r7 = kotlin.jvm.internal.o.a(r7, r4)
            if (r7 == 0) goto L_0x004d
            kotlin.Pair r2 = r0.f16496b
            kotlin.jvm.internal.o.b(r2)
            java.lang.Object r2 = r2.getSecond()
            java.util.List r2 = (java.util.List) r2
            goto L_0x0064
        L_0x004d:
            u2.r r7 = r0.f16495a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            java.lang.Object r2 = r7.invoke(r4, r2, r8, r9)
            java.util.List r2 = (java.util.List) r2
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r2)
            r0.f16496b = r7
        L_0x0064:
            java.util.Iterator r2 = r2.iterator()
        L_0x0068:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x017e
            java.lang.Object r4 = r2.next()
            z0.a$a r4 = (z0.C0967a.C0251a) r4
            java.lang.String r7 = r4.a()
            ch.icoaching.typewise.text.CapsMode r4 = r4.b()
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x0068
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r9 = r7.toLowerCase(r8)
            kotlin.jvm.internal.o.d(r9, r5)
            java.lang.String r10 = r3.toLowerCase(r8)
            kotlin.jvm.internal.o.d(r10, r5)
            r11 = 0
            r12 = 2
            r13 = 0
            boolean r9 = kotlin.text.o.G(r9, r10, r11, r12, r13)
            if (r9 == 0) goto L_0x0068
            int r9 = r3.length()
            java.lang.String r10 = "'"
            java.lang.String r14 = "BiGramPredictor"
            if (r9 != 0) goto L_0x010f
            ch.icoaching.typewise.e r8 = ch.icoaching.typewise.e.f8233a
            java.lang.String r9 = "predict() :: No partial text"
            r8.a(r14, r9, r13)
            if (r18 == 0) goto L_0x00c6
            A0.a$a r9 = A0.a.f4a
            int r11 = r17.length()
            r15 = 16384(0x4000, float:2.2959E-41)
            int r9 = r9.a(r1, r11, r15)
            if (r9 == 0) goto L_0x00c6
            java.lang.String r7 = E0.s.a(r7)
            java.lang.String r4 = "predict() :: Start of sentence; ignoring case preference"
        L_0x00c2:
            r8.a(r14, r4, r13)
            goto L_0x010a
        L_0x00c6:
            java.lang.String r9 = "predict() :: Considering case preference"
            r8.a(r14, r9, r13)
            int[] r9 = z0.C0968b.a.f16497a
            int r4 = r4.ordinal()
            r4 = r9[r4]
            r9 = 1
            if (r4 == r9) goto L_0x0102
            if (r4 == r12) goto L_0x00e9
            r9 = 3
            if (r4 != r9) goto L_0x00e3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "predict() :: Preference: mixedcase: '"
            goto L_0x00f4
        L_0x00e3:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x00e9:
            java.lang.String r7 = E0.s.a(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "predict() :: Preference: titlecase: '"
        L_0x00f4:
            r4.append(r9)
            r4.append(r7)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            goto L_0x00c2
        L_0x0102:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "predict() :: Preference: lowercase: '"
            goto L_0x00f4
        L_0x010a:
            r6.add(r7)
            goto L_0x0068
        L_0x010f:
            ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "predict() :: Partial text: '"
            r9.append(r15)
            r9.append(r3)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.a(r14, r9, r13)
            boolean r9 = kotlin.text.o.G(r7, r3, r11, r12, r13)
            java.lang.String r11 = "substring(...)"
            if (r9 == 0) goto L_0x0157
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "predict() :: Beginning matched; prediction: '"
            r8.append(r9)
            r8.append(r7)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r4.a(r14, r8, r13)
            int r4 = r3.length()
            java.lang.String r4 = r7.substring(r4)
        L_0x014f:
            kotlin.jvm.internal.o.d(r4, r11)
            r6.add(r4)
            goto L_0x0068
        L_0x0157:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "predict() :: Beginning not matched; prediction: '"
            r9.append(r12)
            r9.append(r7)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.a(r14, r9, r13)
            java.lang.String r4 = r7.toLowerCase(r8)
            kotlin.jvm.internal.o.d(r4, r5)
            int r7 = r3.length()
            java.lang.String r4 = r4.substring(r7)
            goto L_0x014f
        L_0x017e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C0968b.a(java.lang.String, boolean, java.lang.String, int, int):java.util.List");
    }

    public final void b() {
        this.f16496b = null;
    }

    public final void c(String str) {
        Pair pair = this.f16496b;
        if (pair != null) {
            o.b(pair);
            if (kotlin.text.o.v(str, (String) pair.getFirst(), true)) {
                this.f16496b = null;
                return;
            }
            ArrayList arrayList = new ArrayList();
            Pair pair2 = this.f16496b;
            o.b(pair2);
            for (C0967a.C0251a aVar : (List) pair2.getSecond()) {
                if (!kotlin.text.o.v(str, aVar.c(), true)) {
                    arrayList.add(aVar);
                }
            }
            Pair pair3 = this.f16496b;
            o.b(pair3);
            this.f16496b = new Pair((String) pair3.getFirst(), arrayList);
        }
    }
}
