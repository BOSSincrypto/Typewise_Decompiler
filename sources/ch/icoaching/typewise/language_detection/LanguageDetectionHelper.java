package ch.icoaching.typewise.language_detection;

import ch.icoaching.typewise.word_lists.c;
import java.util.List;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class LanguageDetectionHelper implements a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f8340j = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8341a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8342b;

    /* renamed from: c  reason: collision with root package name */
    private final List f8343c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8344d;

    /* renamed from: e  reason: collision with root package name */
    private final float f8345e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f8346f;

    /* renamed from: g  reason: collision with root package name */
    private final List f8347g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f8348h;

    /* renamed from: i  reason: collision with root package name */
    private final LanguageDetection f8349i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LanguageDetectionHelper(boolean z3, List list, List list2, List list3, boolean z4, float f4, c cVar) {
        o.e(list, "standardLanguagesDefault");
        o.e(list2, "toBeRecognizedOnlyLanguagesDefault");
        o.e(cVar, "wordListRepository");
        this.f8341a = z3;
        this.f8342b = list;
        this.f8343c = list2;
        this.f8344d = z4;
        this.f8345e = f4;
        this.f8346f = C0718m.F0(C0718m.i0(list, list2));
        this.f8347g = list3 == null ? C0718m.j() : list3;
        this.f8348h = C0718m.F0(list2);
        this.f8349i = new LanguageDetection(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r20, java.util.List r21, kotlin.coroutines.c r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_detection.LanguageDetectionHelper$recognizeLanguageFromAll$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.language_detection.LanguageDetectionHelper$recognizeLanguageFromAll$1 r2 = (ch.icoaching.typewise.language_detection.LanguageDetectionHelper$recognizeLanguageFromAll$1) r2
            int r3 = r2.f8353d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8353d = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.language_detection.LanguageDetectionHelper$recognizeLanguageFromAll$1 r2 = new ch.icoaching.typewise.language_detection.LanguageDetectionHelper$recognizeLanguageFromAll$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8351b
            java.lang.Object r14 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r2.f8353d
            r15 = 0
            java.lang.String r13 = "unknown"
            r4 = 2
            r12 = 1
            if (r3 == 0) goto L_0x0044
            if (r3 == r12) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            java.lang.Object r2 = r2.f8350a
            ch.icoaching.typewise.language_detection.LanguageDetectionHelper r2 = (ch.icoaching.typewise.language_detection.LanguageDetectionHelper) r2
            kotlin.f.b(r1)
            r18 = r12
            r12 = r13
            goto L_0x011f
        L_0x0044:
            kotlin.f.b(r1)
            if (r21 == 0) goto L_0x00bc
            boolean r1 = r21.isEmpty()
            if (r1 == 0) goto L_0x0050
            goto L_0x00bc
        L_0x0050:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r21.iterator()
        L_0x0059:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0072
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.util.Set r7 = r0.f8346f
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x0059
            r1.add(r5)
            goto L_0x0059
        L_0x0072:
            int r3 = r1.size()
            int r5 = r21.size()
            if (r3 == r5) goto L_0x00aa
            boolean r3 = r0.f8344d
            if (r3 != 0) goto L_0x00aa
            ch.icoaching.typewise.e r5 = ch.icoaching.typewise.e.f8233a
            java.util.Set r3 = kotlin.collections.C0718m.F0(r21)
            java.util.Set r6 = r0.f8346f
            java.util.Set r3 = kotlin.collections.L.i(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Languages "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " are not available for language recognition, but you didn't declare to return unknown language."
            r6.append(r3)
            java.lang.String r7 = r6.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "LanguageDetectionHelper"
            r8 = 0
            ch.icoaching.typewise.e.l(r5, r6, r7, r8, r9, r10)
        L_0x00aa:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x00ba
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r12)
            r1.<init>(r13, r2)
            return r1
        L_0x00ba:
            r5 = r1
            goto L_0x00c5
        L_0x00bc:
            java.util.List r1 = r0.f8342b
            java.util.List r3 = r0.f8343c
            java.util.List r1 = kotlin.collections.C0718m.i0(r1, r3)
            goto L_0x00ba
        L_0x00c5:
            java.util.List r1 = r0.f8347g
            r3 = 4
            r6 = 0
            r7 = r20
            java.lang.String r1 = y0.C0946c.w(r7, r1, r6, r3, r6)
            boolean r3 = r0.f8344d
            if (r3 == 0) goto L_0x0106
            int r3 = r5.size()
            if (r21 == 0) goto L_0x00de
            int r6 = r21.size()
            goto L_0x00df
        L_0x00de:
            r6 = r15
        L_0x00df:
            if (r3 == r6) goto L_0x0106
            ch.icoaching.typewise.language_detection.LanguageDetection r3 = r0.f8349i
            boolean r6 = r0.f8341a
            float r7 = r0.f8345e
            r2.f8350a = r0
            r2.f8353d = r12
            r16 = 112(0x70, float:1.57E-43)
            r17 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r1
            r11 = r2
            r18 = r12
            r12 = r16
            r1 = r13
            r13 = r17
            java.lang.Object r2 = ch.icoaching.typewise.language_detection.LanguageDetection.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 != r14) goto L_0x0102
            return r14
        L_0x0102:
            r12 = r1
            r1 = r2
        L_0x0104:
            r2 = r0
            goto L_0x011f
        L_0x0106:
            r18 = r12
            r12 = r13
            ch.icoaching.typewise.language_detection.LanguageDetection r3 = r0.f8349i
            boolean r6 = r0.f8341a
            r2.f8350a = r0
            r2.f8353d = r4
            r10 = 8
            r11 = 0
            r7 = 0
            r8 = 1
            r4 = r1
            r9 = r2
            java.lang.Object r1 = ch.icoaching.typewise.language_detection.LanguageDetection.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r14) goto L_0x0104
            return r14
        L_0x011f:
            java.lang.String r1 = (java.lang.String) r1
            kotlin.Pair r3 = new kotlin.Pair
            java.util.Set r2 = r2.f8348h
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x0131
            boolean r2 = kotlin.jvm.internal.o.a(r1, r12)
            if (r2 == 0) goto L_0x0133
        L_0x0131:
            r15 = r18
        L_0x0133:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r15)
            r3.<init>(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_detection.LanguageDetectionHelper.a(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LanguageDetectionHelper(boolean z3, List list, List list2, List list3, boolean z4, float f4, c cVar, int i4, i iVar) {
        this(z3, list, list2, (i4 & 8) != 0 ? null : list3, (i4 & 16) != 0 ? false : z4, (i4 & 32) != 0 ? 0.7f : f4, cVar);
    }
}
