package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import B0.C0258f;
import B0.n;
import E0.m;
import E0.s;
import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.autocorrection.scripts.capitalization.a;
import ch.icoaching.typewise.autocorrection.scripts.f;
import ch.icoaching.typewise.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.d;
import r0.g;
import u2.l;

public abstract class CapitalizationBase implements a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f8000h = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f8001a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8002b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8003c;

    /* renamed from: d  reason: collision with root package name */
    private final IDictionaryRepository f8004d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8005e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f8006f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f8007g;

    public static final class a {
        private a() {
        }

        public final int a(int i4, String str, String str2, String str3) {
            o.e(str, "newSuggestion");
            o.e(str2, "suggestion");
            o.e(str3, "word");
            if (i4 == 0 && !o.a(str, str2)) {
                return 1;
            }
            if (i4 != 1 || !o.a(str, str3)) {
                return i4;
            }
            return 0;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Set f8016a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f8017b;

        public b(Set set, Set set2) {
            o.e(set, "wordCasing");
            o.e(set2, "wordCasingAfterStart");
            this.f8016a = set;
            this.f8017b = set2;
        }

        public final Set a() {
            return this.f8016a;
        }

        public final Set b() {
            return this.f8017b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return o.a(this.f8016a, bVar.f8016a) && o.a(this.f8017b, bVar.f8017b);
        }

        public int hashCode() {
            return (this.f8016a.hashCode() * 31) + this.f8017b.hashCode();
        }

        public String toString() {
            Set set = this.f8016a;
            Set set2 = this.f8017b;
            return "GetWordCasingSetResult(wordCasing=" + set + ", wordCasingAfterStart=" + set2 + ")";
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8018a;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ch.icoaching.typewise.autocorrection.helpers.TextCase[] r0 = ch.icoaching.typewise.autocorrection.helpers.TextCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.LOWER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.FORCED_LOWER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.CORRECT_LOWER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.CORRECT_TITLE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.TITLE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.FIRST_TWO_CHARS_UPPER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.UPPER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.FORCED_UPPER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.MIXED     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.ELISION_TITLE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                ch.icoaching.typewise.autocorrection.helpers.TextCase r1 = ch.icoaching.typewise.autocorrection.helpers.TextCase.AFTER_ELISION_TITLE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f8018a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase.c.<clinit>():void");
        }
    }

    public CapitalizationBase(f fVar, boolean z3, boolean z4, IDictionaryRepository iDictionaryRepository, String str, Set set, Set set2) {
        o.e(fVar, "triggerHelper");
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(str, "language");
        o.e(set, "dontCorrectAwayFromWords");
        this.f8001a = fVar;
        this.f8002b = z3;
        this.f8003c = z4;
        this.f8004d = iDictionaryRepository;
        this.f8005e = str;
        this.f8006f = set;
        this.f8007g = set2 == null ? L.e() : set2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object h(ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase r15, java.lang.String r16, ch.icoaching.typewise.autocorrection.helpers.TextCase r17, java.lang.String r18, java.lang.String r19, kotlin.coroutines.c r20) {
        /*
            r6 = r15
            r0 = r20
            boolean r1 = r0 instanceof ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$autoCapsImplementation$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$autoCapsImplementation$1 r1 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$autoCapsImplementation$1) r1
            int r2 = r1.f8015h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8015h = r2
        L_0x0015:
            r7 = r1
            goto L_0x001d
        L_0x0017:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$autoCapsImplementation$1 r1 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$autoCapsImplementation$1
            r1.<init>(r15, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r0 = r7.f8013f
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f8015h
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L_0x0064
            if (r1 == r10) goto L_0x004e
            if (r1 != r9) goto L_0x0046
            java.lang.Object r1 = r7.f8012e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.f8011d
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r7.f8010c
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = (ch.icoaching.typewise.autocorrection.helpers.TextCase) r3
            java.lang.Object r4 = r7.f8009b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r7.f8008a
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase r5 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase) r5
            kotlin.f.b(r0)
            goto L_0x00dc
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            java.lang.Object r1 = r7.f8011d
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r2 = r7.f8010c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.f8009b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.f8008a
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase r4 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase) r4
            kotlin.f.b(r0)
            r13 = r2
            r12 = r3
            goto L_0x0091
        L_0x0064:
            kotlin.f.b(r0)
            ch.icoaching.typewise.autocorrection.scripts.f r0 = r6.f8001a
            r1 = r16
            java.lang.String[] r11 = r0.s(r1)
            r0 = 0
            r1 = r11[r0]
            r7.f8008a = r6
            r12 = r18
            r7.f8009b = r12
            r13 = r19
            r7.f8010c = r13
            r7.f8011d = r11
            r7.f8015h = r10
            r0 = r15
            r2 = r18
            r3 = r19
            r4 = r17
            r5 = r7
            java.lang.Object r0 = r0.l(r1, r2, r3, r4, r5)
            if (r0 != r8) goto L_0x008f
            return r8
        L_0x008f:
            r4 = r6
            r1 = r11
        L_0x0091:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a$b r0 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.a.b) r0
            java.lang.String r2 = r0.a()
            boolean r3 = r0.b()
            ch.icoaching.typewise.autocorrection.helpers.TextCase r0 = r0.c()
            java.lang.String r2 = r4.p(r2, r0, r13, r3)
            java.util.List r1 = kotlin.collections.C0713h.w(r1, r10)
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
            r5 = r4
            r4 = r12
            r14 = r2
            r2 = r1
            r1 = r14
        L_0x00b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r7.f8008a = r5
            r7.f8009b = r4
            r7.f8010c = r3
            r7.f8011d = r2
            r7.f8012e = r1
            r7.f8015h = r9
            r6 = 0
            r15 = r5
            r16 = r0
            r17 = r4
            r18 = r6
            r19 = r3
            r20 = r7
            java.lang.Object r0 = r15.l(r16, r17, r18, r19, r20)
            if (r0 != r8) goto L_0x00dc
            return r8
        L_0x00dc:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a$b r0 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.a.b) r0
            java.lang.String r0 = r0.d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = " "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r1 = r6.toString()
            goto L_0x00b1
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase.h(ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase, java.lang.String, ch.icoaching.typewise.autocorrection.helpers.TextCase, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object i(CapitalizationBase capitalizationBase, String str, String str2, String str3, TextCase textCase, kotlin.coroutines.c cVar) {
        CapitalizationBase capitalizationBase2 = capitalizationBase;
        String str4 = str;
        String str5 = str3;
        TextCase textCase2 = textCase;
        r0.f h4 = capitalizationBase2.f8004d.h(str4, capitalizationBase2.f8005e);
        e eVar = e.f8233a;
        String str6 = capitalizationBase2.f8005e;
        e.b(eVar, "CapitalizationBase", "singleWordAutoCaps() :: '" + str6 + "' | '" + str4 + "' | '" + str2 + "' | '" + str5 + "' | " + textCase2 + " | " + h4, (Throwable) null, 4, (Object) null);
        if (h4 != null) {
            if (!capitalizationBase2.q(textCase2, h4, str5) || capitalizationBase2.f8007g.contains(str4)) {
                int a4 = h4.a();
                int c4 = h4.c();
                int b4 = h4.b();
                if (a4 == 0 && c4 == 0 && b4 != 0) {
                    return new a.b(h4.d(), true, TextCase.MIXED);
                }
                if (C0713h.u(new TextCase[]{TextCase.TITLE, TextCase.CORRECT_TITLE, TextCase.FIRST_TWO_CHARS_UPPER}, textCase2)) {
                    return new a.b(capitalizationBase2.n(textCase2, h4.d(), str5, str4), true, textCase2);
                }
                return capitalizationBase.m(h4, textCase, str, str2, C0718m.m(kotlin.coroutines.jvm.internal.a.d(a4), kotlin.coroutines.jvm.internal.a.d(c4), kotlin.coroutines.jvm.internal.a.d(b4)), cVar);
            }
            if (textCase2 == TextCase.FIRST_TWO_CHARS_UPPER) {
                textCase2 = TextCase.MIXED;
            }
            return new a.b(capitalizationBase2.n(textCase2, h4.d(), str5, str4), true, textCase2);
        } else if (textCase2 == TextCase.CORRECT_LOWER) {
            String lowerCase = str4.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            return new a.b(lowerCase, false, textCase2);
        } else {
            if (!capitalizationBase2.f8002b && str5 != null) {
                String lowerCase2 = str5.toLowerCase(Locale.ROOT);
                o.d(lowerCase2, "toLowerCase(...)");
                if (o.a(lowerCase2, str4)) {
                    return new a.b(str5, false, textCase2);
                }
            }
            return new a.b(str4, false, textCase2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object j(ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23, java.lang.String r24, kotlin.coroutines.c r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$capitalizeSuggestions$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$capitalizeSuggestions$1 r1 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$capitalizeSuggestions$1) r1
            int r2 = r1.f8033o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8033o = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$capitalizeSuggestions$1 r1 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$capitalizeSuggestions$1
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f8031m
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r1.f8033o
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x006d
            if (r4 != r6) goto L_0x0065
            int r2 = r1.f8030l
            int r4 = r1.f8029k
            int r7 = r1.f8028j
            java.lang.Object r8 = r1.f8027i
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.f8026h
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r1.f8025g
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.f8024f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r1.f8023e
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r1.f8022d
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r1.f8021c
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r1.f8020b
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r6 = r1.f8019a
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase r6 = (ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase) r6
            kotlin.f.b(r0)
            r5 = r1
            r1 = r14
            r17 = r9
            r9 = r4
            r4 = r13
            r13 = r10
            r10 = r11
            r11 = r17
            goto L_0x012e
        L_0x0065:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x006d:
            kotlin.f.b(r0)
            java.util.List r0 = kotlin.collections.C0718m.D0(r19)
            java.util.List r4 = kotlin.collections.C0718m.D0(r22)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r21.iterator()
        L_0x0081:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b9
            java.lang.Object r8 = r7.next()
            r0.g r8 = (r0.g) r8
            int r9 = r24.length()
            r0.d r10 = r8.e()
            java.lang.String r10 = r10.h()
            int r10 = r10.length()
            r0.d r8 = r8.e()
            java.lang.String r8 = r8.f()
            int r8 = r8.length()
            int r10 = r10 + r8
            int r9 = r9 - r10
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r9)
            r9 = r24
            java.lang.String r8 = E0.s.n(r9, r5, r8)
            r6.add(r8)
            goto L_0x0081
        L_0x00b9:
            int r7 = r19.size()
            r10 = r0
            r12 = r4
            r8 = r5
            r11 = r6
            r9 = r7
            r0 = r19
            r4 = r21
            r6 = r23
            r7 = r1
            r1 = r20
        L_0x00cb:
            if (r8 >= r9) goto L_0x0172
            java.lang.Object r13 = r6.get(r8)
            E0.o r13 = (E0.o) r13
            java.lang.Object r14 = r1.get(r8)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.Object r15 = r10.get(r8)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r16 = r1.get(r8)
            java.lang.Number r16 = (java.lang.Number) r16
            int r5 = r16.intValue()
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r7.f8019a = r2
            r7.f8020b = r0
            r7.f8021c = r1
            r7.f8022d = r4
            r7.f8023e = r6
            r7.f8024f = r10
            r7.f8025g = r12
            r7.f8026h = r11
            r7.f8027i = r10
            r7.f8028j = r8
            r7.f8029k = r9
            r7.f8030l = r8
            r16 = r0
            r0 = 1
            r7.f8033o = r0
            r18 = r2
            r19 = r13
            r20 = r4
            r21 = r14
            r22 = r15
            r23 = r5
            r24 = r7
            java.lang.Object r0 = r18.g(r19, r20, r21, r22, r23, r24)
            if (r0 != r3) goto L_0x0125
            return r3
        L_0x0125:
            r5 = r7
            r7 = r8
            r13 = r12
            r15 = r16
            r12 = r6
            r6 = r2
            r2 = r7
            r8 = r10
        L_0x012e:
            r8.set(r2, r0)
            ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase$a r0 = f8000h
            java.lang.Object r2 = r13.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r8 = r10.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r14 = r15.get(r7)
            java.lang.String r14 = (java.lang.String) r14
            r18 = r1
            r1 = 0
            java.lang.Object r16 = r4.get(r1)
            r0.g r16 = (r0.g) r16
            r0.d r16 = r16.e()
            java.lang.String r1 = r16.h()
            int r0 = r0.a(r2, r8, r14, r1)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r13.set(r7, r0)
            r0 = 1
            int r8 = r7 + 1
            r1 = r18
            r7 = r5
            r2 = r6
            r6 = r12
            r12 = r13
            r0 = r15
            r5 = 0
            goto L_0x00cb
        L_0x0172:
            ch.icoaching.typewise.autocorrection.scripts.capitalization.a$a r0 = new ch.icoaching.typewise.autocorrection.scripts.capitalization.a$a
            r0.<init>(r10, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase.j(ch.icoaching.typewise.autocorrection.scripts.capitalization.CapitalizationBase, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public n a(List list, List list2, int i4, int i5) {
        TextCase textCase;
        o.e(list, "splitString");
        o.e(list2, "forcedCasing");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            String str = (String) next;
            if (str.length() > 0 && !this.f8001a.n(str)) {
                arrayList.add(next);
            }
        }
        TextCase textCase2 = TextCase.LOWER;
        if (!arrayList.isEmpty()) {
            textCase = e(arrayList, -1, i4, list2);
        } else {
            textCase = textCase2;
        }
        if (arrayList.size() > 1) {
            textCase2 = e(arrayList, -2, i5, list2);
        }
        return new n(textCase, textCase2);
    }

    public Object b(List list, List list2, List list3, List list4, List list5, String str, kotlin.coroutines.c cVar) {
        return j(this, list, list2, list3, list4, list5, str, cVar);
    }

    public TextCase c(String str) {
        o.e(str, "strippedWord");
        if (o.a(str, "")) {
            return TextCase.LOWER;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        o.d(lowerCase, "toLowerCase(...)");
        if (o.a(lowerCase, str)) {
            return TextCase.LOWER;
        }
        String upperCase = str.toUpperCase(locale);
        o.d(upperCase, "toUpperCase(...)");
        if (o.a(upperCase, str)) {
            return TextCase.UPPER;
        }
        if (o.a(C0258f.c(str), str)) {
            return TextCase.TITLE;
        }
        if (str.length() > 2 && o.a(C0258f.d(str), str)) {
            return TextCase.FIRST_TWO_CHARS_UPPER;
        }
        if (!this.f8002b) {
            return TextCase.MIXED;
        }
        Character f4 = C0258f.f(str);
        if (f4 == null) {
            return TextCase.LOWER;
        }
        char charValue = f4.charValue();
        if (Character.toUpperCase(charValue) == charValue) {
            return TextCase.CORRECT_TITLE;
        }
        return TextCase.CORRECT_LOWER;
    }

    public TextCase d(String str, int i4, List list, TextCase textCase) {
        o.e(str, "word");
        o.e(list, "forcedCasing");
        o.e(textCase, "wordCase");
        b f4 = f(str, i4, list);
        Set a4 = f4.a();
        Set b4 = f4.b();
        TextCase textCase2 = TextCase.FORCED_UPPER;
        TextCase textCase3 = TextCase.UPPER;
        if (L.h(textCase2, textCase3, TextCase.NONE).containsAll(a4) && str.length() > 1 && !a4.contains(TextCase.LOWER)) {
            return textCase3;
        }
        if (str.length() <= 3 || str.charAt(1) != '\'' || m.e(list, 3 + i4) != textCase2) {
            int i5 = i4 + 1;
            if ((m.e(list, i5) == textCase3 && !b4.contains(textCase3)) || m.e(list, i5) == textCase2) {
                return TextCase.TITLE;
            }
            TextCase textCase4 = TextCase.FORCED_LOWER;
            if (a4.contains(textCase4)) {
                return textCase4;
            }
            return textCase;
        } else if (m.e(list, i4 + 1) == textCase2) {
            return TextCase.ELISION_TITLE;
        } else {
            return TextCase.AFTER_ELISION_TITLE;
        }
    }

    public final TextCase e(List list, int i4, int i5, List list2) {
        o.e(list, "splitString");
        o.e(list2, "forcedCasing");
        d z3 = this.f8001a.z((String) m.e(list, i4), false);
        return d(z3.h(), i5 + z3.d().length(), list2, c(z3.h()));
    }

    public b f(String str, int i4, List list) {
        Set set;
        Set set2;
        o.e(str, "word");
        o.e(list, "forcedCasing");
        int i5 = i4 + 1;
        int length = str.length() + i5;
        if (length == 0) {
            set2 = C0718m.F0(m.g(list, i5, Integer.valueOf(list.size())));
            set = C0718m.F0(m.g(list, i4 + 2, Integer.valueOf(list.size())));
        } else {
            Set F02 = C0718m.F0(m.g(list, i5, Integer.valueOf(length)));
            set = C0718m.F0(m.g(list, i4 + 2, Integer.valueOf(length)));
            set2 = F02;
        }
        return new b(set2, set);
    }

    public final Object g(E0.o oVar, List list, int i4, String str, String str2, kotlin.coroutines.c cVar) {
        TextCase textCase;
        g gVar = (g) m.e(list, i4);
        e eVar = e.f8233a;
        e.b(eVar, "CapitalizationBase", "getSingleSplitCapitalization() :: " + oVar + " | " + gVar + " | " + i4 + " | '" + str + "' | '" + str2 + "'", (Throwable) null, 4, (Object) null);
        if (this.f8006f.contains(((g) list.get(0)).e().g()) && o.a(((g) list.get(0)).e().g(), str)) {
            return ((g) list.get(0)).e().h();
        }
        if (i4 == 0 && oVar != null && (oVar.a() != (textCase = TextCase.LOWER) || oVar.b() != textCase)) {
            return o(str, oVar, gVar);
        }
        TextCase d4 = gVar.d();
        TextCase textCase2 = TextCase.UPPER;
        if (d4 == textCase2 && ((g) list.get(0)).d() == textCase2) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            o.d(upperCase, "toUpperCase(...)");
            return upperCase;
        } else if (gVar.d() == TextCase.FORCED_LOWER) {
            return str;
        } else {
            if (gVar.d() == TextCase.ELISION_TITLE && kotlin.text.o.K(str, '\'', false, 2, (Object) null)) {
                return s.p(str);
            }
            if (gVar.d() == TextCase.AFTER_ELISION_TITLE && kotlin.text.o.K(str, '\'', false, 2, (Object) null)) {
                return C0258f.a(str);
            }
            if (this.f8003c) {
                return k(str, gVar.d(), str2, gVar.e().h(), cVar);
            } else if (gVar.d() == TextCase.CORRECT_LOWER) {
                return str;
            } else {
                if (L.h(TextCase.TITLE, TextCase.CORRECT_TITLE).contains(gVar.d())) {
                    return C0258f.c(str);
                }
                if (o.a(str, gVar.e().g())) {
                    return gVar.e().h();
                }
                return str;
            }
        }
    }

    public Object k(String str, TextCase textCase, String str2, String str3, kotlin.coroutines.c cVar) {
        return h(this, str, textCase, str2, str3, cVar);
    }

    public Object l(String str, String str2, String str3, TextCase textCase, kotlin.coroutines.c cVar) {
        return i(this, str, str2, str3, textCase, cVar);
    }

    public abstract Object m(r0.f fVar, TextCase textCase, String str, String str2, List list, kotlin.coroutines.c cVar);

    public String n(TextCase textCase, String str, String str2, String str3) {
        o.e(textCase, "stringCasing");
        o.e(str, "mixedCaseWord");
        o.e(str3, "word");
        switch (c.f8018a[textCase.ordinal()]) {
            case 1:
            case 2:
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                o.d(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 3:
                if (o.a(str2, str)) {
                    return str;
                }
                String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                o.d(lowerCase2, "toLowerCase(...)");
                return lowerCase2;
            case 4:
                if (o.a(str2, str)) {
                    return str;
                }
                return C0258f.c(str3);
            case 5:
            case 6:
                return C0258f.c(str3);
            case 7:
            case 8:
                String upperCase = str3.toUpperCase(Locale.ROOT);
                o.d(upperCase, "toUpperCase(...)");
                return upperCase;
            case 9:
                return str;
            case 10:
                return s.r(str3, false, 1, (Object) null);
            case 11:
                return C0258f.a(str3);
            default:
                throw new IllegalArgumentException("Casing not valid");
        }
    }

    public String o(String str, E0.o oVar, g gVar) {
        String o4;
        o.e(str, "suggestion");
        o.e(oVar, "overwriteSplitCap");
        o.e(gVar, "split");
        List D02 = C0718m.D0(kotlin.text.o.t0(str, new String[]{" "}, false, 0, 6, (Object) null));
        if (D02.size() == 2) {
            List m4 = C0718m.m(oVar.a(), oVar.b());
            int size = m4.size();
            for (int i4 = 0; i4 < size; i4++) {
                TextCase textCase = (TextCase) m4.get(i4);
                if (textCase == TextCase.TITLE) {
                    o4 = C0258f.c((String) D02.get(i4));
                } else if (textCase == TextCase.UPPER) {
                    o4 = ((String) D02.get(i4)).toUpperCase(Locale.ROOT);
                    o.d(o4, "toUpperCase(...)");
                } else {
                    if (textCase == TextCase.MIXED) {
                        if (i4 == 0 && kotlin.text.o.G(gVar.e().g(), (String) D02.get(i4), false, 2, (Object) null)) {
                            o4 = s.n(gVar.e().h(), 0, Integer.valueOf(((String) D02.get(i4)).length()));
                        } else if (i4 == 1 && kotlin.text.o.u(gVar.e().g(), (String) D02.get(i4), false, 2, (Object) null)) {
                            o4 = s.o(gVar.e().h(), gVar.e().h().length() - ((String) D02.get(i4)).length(), (Integer) null, 2, (Object) null);
                        }
                    }
                }
                D02.set(i4, o4);
            }
            return C0718m.Z(D02, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
        }
        throw new IllegalArgumentException(("suggestionsList size is " + D02.size() + " but should be 2.").toString());
    }

    public String p(String str, TextCase textCase, String str2, boolean z3) {
        o.e(str, "newString");
        o.e(textCase, "stringCasing");
        if (textCase == TextCase.TITLE || (s.f(str) && (textCase == TextCase.CORRECT_TITLE || textCase == TextCase.FIRST_TWO_CHARS_UPPER))) {
            return C0258f.e(str);
        }
        if (!s.f(str) || textCase != TextCase.MIXED || this.f8002b || str2 == null) {
            return str;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        if (!o.a(lowerCase, str) || z3) {
            return str;
        }
        return str2;
    }

    public boolean q(TextCase textCase, r0.f fVar, String str) {
        o.e(textCase, "textCase");
        o.e(fVar, "wordInfo");
        switch (c.f8018a[textCase.ordinal()]) {
            case 1:
            case 2:
                if (fVar.a() >= 1) {
                    return true;
                }
                break;
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                if (!o.a(str, fVar.d()) || fVar.b() < 1) {
                    return false;
                }
                return true;
            case 5:
            case 10:
            case 11:
                if (fVar.c() >= 1) {
                    return true;
                }
                break;
        }
        return false;
    }
}
