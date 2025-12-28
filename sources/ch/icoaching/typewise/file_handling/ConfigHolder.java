package ch.icoaching.typewise.file_handling;

import ch.icoaching.typewise.config.CompanyConfig;
import ch.icoaching.typewise.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.g;
import s0.C0892b;
import s0.C0893c;

public final class ConfigHolder {

    /* renamed from: m  reason: collision with root package name */
    public static final Companion f8239m = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f8240a;

    /* renamed from: b  reason: collision with root package name */
    private C0892b f8241b;

    /* renamed from: c  reason: collision with root package name */
    private C0893c f8242c;

    /* renamed from: d  reason: collision with root package name */
    private CompanyConfig f8243d;

    /* renamed from: e  reason: collision with root package name */
    private List f8244e;

    /* renamed from: f  reason: collision with root package name */
    private List f8245f;

    /* renamed from: g  reason: collision with root package name */
    private Map f8246g;

    /* renamed from: h  reason: collision with root package name */
    private Map f8247h;

    /* renamed from: i  reason: collision with root package name */
    private List f8248i;

    /* renamed from: j  reason: collision with root package name */
    private Map f8249j;

    /* renamed from: k  reason: collision with root package name */
    private Map f8250k;

    /* renamed from: l  reason: collision with root package name */
    private Set f8251l;

    public static final class Companion {
        private Companion() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(s0.C0892b r5, java.lang.String r6, kotlin.coroutines.c r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof ch.icoaching.typewise.file_handling.ConfigHolder$Companion$invoke$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                ch.icoaching.typewise.file_handling.ConfigHolder$Companion$invoke$1 r0 = (ch.icoaching.typewise.file_handling.ConfigHolder$Companion$invoke$1) r0
                int r1 = r0.f8255d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8255d = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.file_handling.ConfigHolder$Companion$invoke$1 r0 = new ch.icoaching.typewise.file_handling.ConfigHolder$Companion$invoke$1
                r0.<init>(r4, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f8253b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f8255d
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r5 = r0.f8252a
                ch.icoaching.typewise.file_handling.ConfigHolder r5 = (ch.icoaching.typewise.file_handling.ConfigHolder) r5
                kotlin.f.b(r7)
                goto L_0x004a
            L_0x002d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0035:
                kotlin.f.b(r7)
                ch.icoaching.typewise.file_handling.ConfigHolder r7 = new ch.icoaching.typewise.file_handling.ConfigHolder
                r2 = 0
                r7.<init>(r5, r6, r2)
                r0.f8252a = r7
                r0.f8255d = r3
                java.lang.Object r5 = r7.h(r0)
                if (r5 != r1) goto L_0x0049
                return r1
            L_0x0049:
                r5 = r7
            L_0x004a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.file_handling.ConfigHolder.Companion.a(s0.b, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private ConfigHolder(C0892b bVar, String str) {
        this.f8240a = str;
        this.f8241b = bVar;
    }

    private final void b() {
        CompanyConfig companyConfig = this.f8243d;
        CompanyConfig companyConfig2 = null;
        if (companyConfig == null) {
            o.p("baseSettings");
            companyConfig = null;
        }
        List d4 = companyConfig.d();
        if (d4 == null || d4.isEmpty()) {
            throw new IllegalArgumentException("The config file must contain a list of authorized client UIDs for the new (at 11/04/23) auth via the admin platform, please update the config of the company on S3.");
        }
        String c4 = this.f8241b.c();
        CompanyConfig companyConfig3 = this.f8243d;
        if (companyConfig3 == null) {
            o.p("baseSettings");
            companyConfig3 = null;
        }
        if (!o.a(c4, companyConfig3.h().getValue())) {
            CompanyConfig companyConfig4 = this.f8243d;
            if (companyConfig4 == null) {
                o.p("baseSettings");
            } else {
                companyConfig2 = companyConfig4;
            }
            throw new IllegalArgumentException("The company name in the config file (" + companyConfig2.h().getValue() + ") does not match the one passed in the constructor (" + this.f8241b.c() + "), please update the config of the company on S3.");
        }
    }

    private final void g() {
        List f4 = f("grammar");
        if (f4.isEmpty() || j()) {
            for (String str : f("autocorrection")) {
                if (!f4.contains(str)) {
                    e eVar = e.f8233a;
                    e.l(eVar, "ConfigHolder", "Language " + str + " has autocorrection but not grammar", (Throwable) null, 4, (Object) null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Grammar correction is enabled for some languages but the grammar route is disabled");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01eb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.c r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof ch.icoaching.typewise.file_handling.ConfigHolder$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.file_handling.ConfigHolder$load$1 r2 = (ch.icoaching.typewise.file_handling.ConfigHolder$load$1) r2
            int r3 = r2.f8261f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8261f = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.file_handling.ConfigHolder$load$1 r2 = new ch.icoaching.typewise.file_handling.ConfigHolder$load$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8259d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8261f
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x005e
            if (r4 == r7) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r2 = r2.f8256a
            ch.icoaching.typewise.file_handling.ConfigHolder r2 = (ch.icoaching.typewise.file_handling.ConfigHolder) r2
            kotlin.f.b(r1)
            goto L_0x01ed
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r4 = r2.f8257b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.f8256a
            ch.icoaching.typewise.file_handling.ConfigHolder r6 = (ch.icoaching.typewise.file_handling.ConfigHolder) r6
            kotlin.f.b(r1)
            goto L_0x00ce
        L_0x004e:
            java.lang.Object r4 = r2.f8258c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.f8257b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r2.f8256a
            ch.icoaching.typewise.file_handling.ConfigHolder r9 = (ch.icoaching.typewise.file_handling.ConfigHolder) r9
            kotlin.f.b(r1)
            goto L_0x00ae
        L_0x005e:
            kotlin.f.b(r1)
            java.lang.String r1 = r0.f8240a
            if (r1 != 0) goto L_0x0068
            java.lang.String r1 = "company_config.json"
            goto L_0x0079
        L_0x0068:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "/company_config.json"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0079:
            java.lang.String r4 = r0.f8240a
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = "language_modelling_settings.json"
            goto L_0x0091
        L_0x0080:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r4 = "/language_modelling_settings.json"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
        L_0x0091:
            ch.icoaching.typewise.file_handling.b r9 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r10 = ch.icoaching.typewise.file_handling.FileIO.Scope.COMMON
            ch.icoaching.typewise.file_handling.FileIO r9 = r9.a(r10)
            r2.f8256a = r0
            r2.f8257b = r1
            r2.f8258c = r4
            r2.f8261f = r7
            java.lang.Object r7 = r9.c(r1, r2)
            if (r7 != r3) goto L_0x00a8
            return r3
        L_0x00a8:
            r9 = r0
            r20 = r7
            r7 = r1
            r1 = r20
        L_0x00ae:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x030f
            ch.icoaching.typewise.file_handling.b r1 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r10 = ch.icoaching.typewise.file_handling.FileIO.Scope.COMMON
            ch.icoaching.typewise.file_handling.FileIO r1 = r1.a(r10)
            r2.f8256a = r9
            r2.f8257b = r4
            r2.f8258c = r8
            r2.f8261f = r6
            java.lang.Object r1 = r1.a(r7, r2)
            if (r1 != r3) goto L_0x00cd
            return r3
        L_0x00cd:
            r6 = r9
        L_0x00ce:
            java.lang.String r1 = (java.lang.String) r1
            t0.c r7 = t0.c.f16361a
            K2.a r7 = r7.c()
            r7.a()
            ch.icoaching.typewise.config.CompanyConfig$a r9 = ch.icoaching.typewise.config.CompanyConfig.Companion
            F2.b r9 = r9.serializer()
            java.lang.Object r1 = r7.c(r9, r1)
            ch.icoaching.typewise.config.CompanyConfig r1 = (ch.icoaching.typewise.config.CompanyConfig) r1
            r6.f8243d = r1
            java.lang.String r7 = "baseSettings"
            if (r1 != 0) goto L_0x00f0
            kotlin.jvm.internal.o.p(r7)
            r9 = r8
            goto L_0x00f1
        L_0x00f0:
            r9 = r1
        L_0x00f1:
            ch.icoaching.typewise.config.CompanyConfig r1 = r6.f8243d
            if (r1 != 0) goto L_0x00f9
            kotlin.jvm.internal.o.p(r7)
            r1 = r8
        L_0x00f9:
            java.util.Map r1 = r1.g()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x010a:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0132
            java.lang.Object r10 = r1.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            s0.b r11 = r6.f8241b
            java.util.List r11 = r11.e()
            java.lang.Object r13 = r10.getKey()
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x010a
            java.lang.Object r11 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            r12.put(r11, r10)
            goto L_0x010a
        L_0x0132:
            ch.icoaching.typewise.config.CompanyConfig r1 = r6.f8243d
            if (r1 != 0) goto L_0x013a
            kotlin.jvm.internal.o.p(r7)
            r1 = r8
        L_0x013a:
            ch.icoaching.typewise.config.CompanyConfig$c r1 = r1.f()
            ch.icoaching.typewise.config.CompanyConfig r10 = r6.f8243d
            if (r10 != 0) goto L_0x0146
            kotlin.jvm.internal.o.p(r7)
            r10 = r8
        L_0x0146:
            ch.icoaching.typewise.config.CompanyConfig$c r10 = r10.f()
            ch.icoaching.typewise.config.CompanyConfig$c$a r10 = r10.b()
            ch.icoaching.typewise.config.CompanyConfig r11 = r6.f8243d
            if (r11 != 0) goto L_0x0156
            kotlin.jvm.internal.o.p(r7)
            r11 = r8
        L_0x0156:
            ch.icoaching.typewise.config.CompanyConfig$c r11 = r11.f()
            ch.icoaching.typewise.config.CompanyConfig$c$a r11 = r11.b()
            java.util.Map r11 = r11.c()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x016f:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0198
            java.lang.Object r14 = r11.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            s0.b r15 = r6.f8241b
            java.util.List r15 = r15.e()
            java.lang.Object r5 = r14.getKey()
            boolean r5 = r15.contains(r5)
            if (r5 == 0) goto L_0x0196
            java.lang.Object r5 = r14.getKey()
            java.lang.Object r14 = r14.getValue()
            r13.put(r5, r14)
        L_0x0196:
            r5 = 3
            goto L_0x016f
        L_0x0198:
            ch.icoaching.typewise.config.CompanyConfig$c$a r5 = r10.b(r13)
            ch.icoaching.typewise.config.CompanyConfig$c r13 = r1.a(r5)
            r16 = 51
            r17 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            ch.icoaching.typewise.config.CompanyConfig r1 = ch.icoaching.typewise.config.CompanyConfig.c(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.f8243d = r1
            if (r1 != 0) goto L_0x01b4
            kotlin.jvm.internal.o.p(r7)
            r1 = r8
        L_0x01b4:
            java.util.Map r1 = r1.g()
            java.util.Set r1 = r1.keySet()
            java.util.List r1 = kotlin.collections.C0718m.B0(r1)
            r6.f8245f = r1
            ch.icoaching.typewise.config.CompanyConfig r1 = r6.f8243d
            if (r1 != 0) goto L_0x01ca
            kotlin.jvm.internal.o.p(r7)
            r1 = r8
        L_0x01ca:
            java.util.List r1 = r1.i()
            if (r1 != 0) goto L_0x01d4
            java.util.List r1 = kotlin.collections.C0718m.j()
        L_0x01d4:
            r6.f8244e = r1
            ch.icoaching.typewise.file_handling.b r1 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r5 = ch.icoaching.typewise.file_handling.FileIO.Scope.COMMON
            ch.icoaching.typewise.file_handling.FileIO r1 = r1.a(r5)
            r2.f8256a = r6
            r2.f8257b = r8
            r5 = 3
            r2.f8261f = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L_0x01ec
            return r3
        L_0x01ec:
            r2 = r6
        L_0x01ed:
            java.lang.String r1 = (java.lang.String) r1
            t0.c r3 = t0.c.f16361a
            K2.a r3 = r3.c()
            r3.a()
            s0.c$a r4 = s0.C0893c.Companion
            F2.b r4 = r4.serializer()
            java.lang.Object r1 = r3.c(r4, r1)
            s0.c r1 = (s0.C0893c) r1
            r2.f8242c = r1
            java.lang.String r3 = "config"
            if (r1 != 0) goto L_0x020f
            kotlin.jvm.internal.o.p(r3)
            r9 = r8
            goto L_0x0210
        L_0x020f:
            r9 = r1
        L_0x0210:
            s0.c r1 = r2.f8242c
            if (r1 != 0) goto L_0x0218
            kotlin.jvm.internal.o.p(r3)
            r1 = r8
        L_0x0218:
            java.util.List r1 = r1.g()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0225:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0242
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            s0.b r6 = r2.f8241b
            java.util.List r6 = r6.e()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0225
            r10.add(r4)
            goto L_0x0225
        L_0x0242:
            s0.c r1 = r2.f8242c
            if (r1 != 0) goto L_0x024a
            kotlin.jvm.internal.o.p(r3)
            r1 = r8
        L_0x024a:
            java.util.List r1 = r1.i()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0257:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0274
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            s0.b r6 = r2.f8241b
            java.util.List r6 = r6.e()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0257
            r11.add(r4)
            goto L_0x0257
        L_0x0274:
            s0.c r1 = r2.f8242c
            if (r1 != 0) goto L_0x027c
            kotlin.jvm.internal.o.p(r3)
            r1 = r8
        L_0x027c:
            java.util.Map r1 = r1.d()
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x028d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02b5
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            s0.b r5 = r2.f8241b
            java.util.List r5 = r5.e()
            java.lang.Object r6 = r4.getKey()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x028d
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r14.put(r5, r4)
            goto L_0x028d
        L_0x02b5:
            s0.c r1 = r2.f8242c
            if (r1 != 0) goto L_0x02bd
            kotlin.jvm.internal.o.p(r3)
            r1 = r8
        L_0x02bd:
            java.util.Map r1 = r1.h()
            if (r1 == 0) goto L_0x02f8
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02d0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02f8
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            s0.b r4 = r2.f8241b
            java.util.List r4 = r4.e()
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x02d0
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r8.put(r4, r3)
            goto L_0x02d0
        L_0x02f8:
            r16 = r8
            r18 = 172(0xac, float:2.41E-43)
            r19 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            s0.c r1 = s0.C0893c.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.f8242c = r1
            r2.i()
            l2.q r1 = l2.q.f14567a
            return r1
        L_0x030f:
            ch.icoaching.typewise.misc.TypewiseFileNotFoundException r1 = new ch.icoaching.typewise.misc.TypewiseFileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The config file "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " does not exist!"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.file_handling.ConfigHolder.h(kotlin.coroutines.c):java.lang.Object");
    }

    private final void i() {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        CompanyConfig companyConfig = this.f8243d;
        if (companyConfig == null) {
            o.p("baseSettings");
            companyConfig = null;
        }
        for (Map.Entry entry : companyConfig.g().entrySet()) {
            String str = (String) entry.getKey();
            CompanyConfig.d dVar = (CompanyConfig.d) entry.getValue();
            if (dVar.d().a()) {
                arrayList.add(str);
            }
            if (dVar.a().a()) {
                arrayList2.add(str);
            }
            if (dVar.b().a()) {
                arrayList3.add(str);
            }
            if (dVar.c().a()) {
                arrayList4.add(str);
            }
        }
        this.f8247h = D.j(g.a("prediction", arrayList), g.a("autocorrection", arrayList2), g.a("grammar", arrayList3), g.a("language_detection", arrayList4));
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        CompanyConfig companyConfig2 = this.f8243d;
        if (companyConfig2 == null) {
            o.p("baseSettings");
            companyConfig2 = null;
        }
        for (Map.Entry entry2 : companyConfig2.g().entrySet()) {
            String str2 = (String) entry2.getKey();
            CompanyConfig.d dVar2 = (CompanyConfig.d) entry2.getValue();
            if (!dVar2.d().a() && dVar2.c().a()) {
                arrayList5.add(str2);
            }
            if (!dVar2.a().a() && dVar2.c().a()) {
                arrayList6.add(str2);
            }
            if (!dVar2.b().a() && dVar2.c().a()) {
                arrayList7.add(str2);
            }
            if (dVar2.c().a()) {
                arrayList8.add(str2);
            }
        }
        this.f8246g = D.j(g.a("prediction", arrayList5), g.a("autocorrection", arrayList6), g.a("grammar", arrayList7), g.a("language_detection", arrayList8));
        CompanyConfig companyConfig3 = this.f8243d;
        if (companyConfig3 == null) {
            o.p("baseSettings");
            companyConfig3 = null;
        }
        this.f8248i = C0718m.B0(companyConfig3.g().keySet());
        Map map = this.f8247h;
        if (map == null) {
            o.p("standardLanguages");
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.e(map.size()));
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashMap.put(entry3.getKey(), C0718m.F0((Iterable) entry3.getValue()));
        }
        this.f8250k = linkedHashMap;
        Map map2 = this.f8246g;
        if (map2 == null) {
            o.p("toBeRecognizedOnlyLanguages");
            map2 = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(D.e(map2.size()));
        for (Map.Entry entry4 : map2.entrySet()) {
            linkedHashMap2.put(entry4.getKey(), C0718m.F0((Iterable) entry4.getValue()));
        }
        this.f8249j = linkedHashMap2;
        List list2 = this.f8248i;
        if (list2 == null) {
            o.p("allLanguages");
            list = null;
        } else {
            list = list2;
        }
        this.f8251l = C0718m.F0(list);
        g();
        b();
    }

    public final CompanyConfig c() {
        CompanyConfig companyConfig = this.f8243d;
        if (companyConfig != null) {
            return companyConfig;
        }
        o.p("baseSettings");
        return null;
    }

    public final C0892b d() {
        return this.f8241b;
    }

    public final C0893c e() {
        C0893c cVar = this.f8242c;
        if (cVar != null) {
            return cVar;
        }
        o.p("config");
        return null;
    }

    public final List f(String str) {
        o.e(str, "feature");
        Map map = this.f8247h;
        if (map == null) {
            o.p("standardLanguages");
            map = null;
        }
        List list = (List) map.get(str);
        return list == null ? C0718m.j() : list;
    }

    public final boolean j() {
        return false;
    }

    public /* synthetic */ ConfigHolder(C0892b bVar, String str, i iVar) {
        this(bVar, str);
    }
}
