package B0;

import E0.s;
import androidx.work.c;
import ch.icoaching.typewise.autocorrection.helpers.NewlineFoundState;
import ch.icoaching.typewise.autocorrection.scripts.f;
import ch.icoaching.typewise.autocorrection.scripts.g;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Triple;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import r0.C0870b;

public class m {

    /* renamed from: j  reason: collision with root package name */
    public static final a f134j = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final B f135a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f136b;

    /* renamed from: c  reason: collision with root package name */
    private final ConfigHolder f137c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f138d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f139e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f140f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f141g;

    /* renamed from: h  reason: collision with root package name */
    private final Regex f142h = new Regex("^(([1-9]\\.)|(0[1-9]\\.)|([1-2][0-9])\\.|(3[0-1])\\.){1,2}(\\d{2,4})?$");

    /* renamed from: i  reason: collision with root package name */
    private final Regex f143i = new Regex("^[0-9]+\\.-");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f144a;

        /* renamed from: b  reason: collision with root package name */
        private final NewlineFoundState f145b;

        public b(boolean z3, NewlineFoundState newlineFoundState) {
            o.e(newlineFoundState, "newlineFound");
            this.f144a = z3;
            this.f145b = newlineFoundState;
        }

        public final NewlineFoundState a() {
            return this.f145b;
        }

        public final boolean b() {
            return this.f144a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f144a == bVar.f144a && this.f145b == bVar.f145b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (c.a(this.f144a) * 31) + this.f145b.hashCode();
        }

        public String toString() {
            boolean z3 = this.f144a;
            NewlineFoundState newlineFoundState = this.f145b;
            return "IsPreviousWordSalutationEndResult(isPreviousWordSalutationEnd=" + z3 + ", newlineFound=" + newlineFoundState + ")";
        }
    }

    public m(B b4, boolean z3, ConfigHolder configHolder) {
        o.e(b4, "pointCorrection");
        o.e(configHolder, "configHolder");
        this.f135a = b4;
        this.f136b = z3;
        this.f137c = configHolder;
        this.f138d = configHolder.c().e().i().c();
        this.f139e = configHolder.c().e().i().b();
        this.f140f = configHolder.c().e().j().d();
        this.f141g = configHolder.c().e().b();
    }

    private final String c() {
        return this.f135a.b();
    }

    public b a(String str, int i4, NewlineFoundState newlineFoundState) {
        o.e(str, "stringIn");
        o.e(newlineFoundState, "newlineFound");
        if (!this.f138d.contains(c())) {
            return new b(false, newlineFoundState);
        }
        if (newlineFoundState == NewlineFoundState.NOT_FOUND) {
            if (s.l(str, i4) == 10) {
                if (i4 == 0) {
                    return new b(false, newlineFoundState);
                }
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (s.l(str, i5) == ',') {
                        return new b(true, NewlineFoundState.JUST_FOUND);
                    }
                    if (s.l(str, i5) != ' ') {
                        return new b(false, NewlineFoundState.FOUND);
                    }
                }
            } else if (newlineFoundState == NewlineFoundState.JUST_FOUND) {
                if (s.l(str, i4) == 10) {
                    return new b(true, newlineFoundState);
                }
                return new b(false, NewlineFoundState.FOUND);
            }
        }
        return new b(false, newlineFoundState);
    }

    public final Object b(String str, List list, C0870b bVar, boolean z3, kotlin.coroutines.c cVar) {
        List list2;
        if (bVar == null) {
            bVar = C0870b.f16001h.a();
        }
        if (!this.f137c.d().d().a() || this.f137c.c().e().i().b().isEmpty() || !this.f136b) {
            list2 = C0718m.j();
        } else {
            list2 = d(str);
        }
        return this.f135a.c(new L(str, list, z3, list2), ((Number) bVar.d().get(0)).intValue(), bVar.c(), cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f3, code lost:
        if (f(E0.s.n(r1, 0, java.lang.Integer.valueOf(r3))) != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "stringIn"
            kotlin.jvm.internal.o.e(r1, r2)
            r2 = 46
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r3 = 45
            java.lang.Character r4 = java.lang.Character.valueOf(r3)
            r5 = 2
            java.lang.Character[] r6 = new java.lang.Character[r5]
            r7 = 0
            r6[r7] = r2
            r2 = 1
            r6[r2] = r4
            java.util.Set r4 = kotlin.collections.L.h(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            ch.icoaching.typewise.autocorrection.helpers.NewlineFoundState r8 = ch.icoaching.typewise.autocorrection.helpers.NewlineFoundState.NOT_FOUND
            int r9 = r18.length()
            java.lang.String r10 = ""
            r11 = r7
            r13 = r11
            r12 = r10
        L_0x0032:
            if (r11 >= r9) goto L_0x0183
            boolean r14 = r0.e(r1, r11)
            B0.m$b r8 = r0.a(r1, r11, r8)
            boolean r15 = r8.b()
            ch.icoaching.typewise.autocorrection.helpers.NewlineFoundState r8 = r8.a()
            if (r14 != 0) goto L_0x004b
            if (r15 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r14 = r7
            goto L_0x004c
        L_0x004b:
            r14 = r2
        L_0x004c:
            char r15 = r1.charAt(r11)
            boolean r15 = java.lang.Character.isDigit(r15)
            if (r15 != 0) goto L_0x006d
            int r15 = r12.length()
            if (r15 <= 0) goto L_0x006b
            char r15 = r1.charAt(r11)
            java.lang.Character r15 = java.lang.Character.valueOf(r15)
            boolean r15 = r4.contains(r15)
            if (r15 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r12 = r10
            goto L_0x0081
        L_0x006d:
            char r15 = r1.charAt(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            r12 = r3
        L_0x0081:
            if (r11 != 0) goto L_0x00a1
            boolean r3 = r0.f140f
            if (r3 == 0) goto L_0x00a1
            char r3 = r1.charAt(r11)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 == 0) goto L_0x0097
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.FORCED_UPPER
            r6.add(r3)
            goto L_0x009d
        L_0x0097:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.NONE
            r6.add(r3)
            r13 = r2
        L_0x009d:
            r15 = 45
            goto L_0x017e
        L_0x00a1:
            if (r13 == 0) goto L_0x00b4
            char r3 = r1.charAt(r11)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 == 0) goto L_0x00b4
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.FORCED_UPPER
        L_0x00af:
            r6.add(r3)
            r13 = r7
            goto L_0x009d
        L_0x00b4:
            char r3 = r1.charAt(r11)
            boolean r3 = java.lang.Character.isUpperCase(r3)
            if (r3 == 0) goto L_0x00fb
            int r3 = r18.length()
            int r13 = r11 + 1
            r14 = 39
            if (r3 <= r13) goto L_0x00dd
            char r3 = E0.s.l(r1, r13)
            if (r3 != r14) goto L_0x00dd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.String r3 = E0.s.n(r1, r7, r3)
            boolean r3 = r0.f(r3)
            if (r3 == 0) goto L_0x00dd
            goto L_0x00f5
        L_0x00dd:
            if (r11 < r5) goto L_0x00f8
            int r3 = r11 + -1
            char r13 = E0.s.l(r1, r3)
            if (r13 != r14) goto L_0x00f8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = E0.s.n(r1, r7, r3)
            boolean r3 = r0.f(r3)
            if (r3 == 0) goto L_0x00f8
        L_0x00f5:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.FORCED_UPPER
            goto L_0x00af
        L_0x00f8:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.UPPER
            goto L_0x00af
        L_0x00fb:
            char r3 = r1.charAt(r11)
            r15 = 45
            if (r3 != r15) goto L_0x0111
            boolean r3 = r0.h(r12)
            if (r3 == 0) goto L_0x0111
        L_0x0109:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.NONE
            r6.add(r3)
            r13 = r7
            goto L_0x017e
        L_0x0111:
            java.util.Set r3 = r0.f139e
            char r16 = r1.charAt(r11)
            java.lang.Character r5 = java.lang.Character.valueOf(r16)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0136
            if (r14 != 0) goto L_0x0136
            boolean r3 = r0.g(r12)
            if (r3 != 0) goto L_0x0136
            boolean r3 = r0.h(r12)
            if (r3 != 0) goto L_0x0136
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.NONE
            r6.add(r3)
            r13 = r2
            goto L_0x017e
        L_0x0136:
            if (r13 == 0) goto L_0x016b
            char r3 = r1.charAt(r11)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 != 0) goto L_0x016b
            B0.B r3 = r0.f135a
            ch.icoaching.typewise.autocorrection.scripts.f r3 = r3.a()
            char r5 = r1.charAt(r11)
            boolean r3 = ch.icoaching.typewise.autocorrection.scripts.g.a(r3, r5)
            if (r3 != 0) goto L_0x016b
            B0.B r3 = r0.f135a
            ch.icoaching.typewise.autocorrection.scripts.f r3 = r3.a()
            java.util.Set r3 = r3.f()
            char r5 = r1.charAt(r11)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x016b
            goto L_0x0109
        L_0x016b:
            char r3 = r1.charAt(r11)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 != 0) goto L_0x017b
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.NONE
        L_0x0177:
            r6.add(r3)
            goto L_0x017e
        L_0x017b:
            ch.icoaching.typewise.autocorrection.helpers.TextCase r3 = ch.icoaching.typewise.autocorrection.helpers.TextCase.LOWER
            goto L_0x0177
        L_0x017e:
            int r11 = r11 + r2
            r3 = r15
            r5 = 2
            goto L_0x0032
        L_0x0183:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.m.d(java.lang.String):java.util.List");
    }

    public boolean e(String str, int i4) {
        o.e(str, "stringIn");
        if (s.l(str, i4) != '.') {
            return false;
        }
        String str2 = (String) f.u(this.f135a.a(), (String) C0718m.b0(this.f135a.a().k(s.n(str, 0, Integer.valueOf(i4 + 1)), 1, 23)), false, 2, (Object) null).getFirst();
        Set set = (Set) this.f141g.get(c());
        if (set == null) {
            set = L.e();
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        if (set.contains(lowerCase)) {
            return true;
        }
        return false;
    }

    public boolean f(String str) {
        int i4;
        o.e(str, "stringIn");
        String obj = kotlin.text.o.U0(str).toString();
        int length = obj.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i4 = -1;
                break;
            }
            if (g.a(this.f135a.a(), obj.charAt(i5))) {
                i4 = (-i5) - 1;
                break;
            }
            i5++;
        }
        Triple u3 = f.u(this.f135a.a(), s.o(str, i4 + 1, (Integer) null, 2, (Object) null), false, 2, (Object) null);
        if (((String) u3.getFirst()).length() != 1) {
            if (!this.f135a.a().m().contains(u3.getFirst() + "'")) {
                return false;
            }
        }
        return true;
    }

    public boolean g(String str) {
        o.e(str, "stringIn");
        if (this.f142h.matchEntire(str) != null) {
            return true;
        }
        return false;
    }

    public boolean h(String str) {
        o.e(str, "stringIn");
        if (this.f143i.matchEntire(str) != null) {
            return true;
        }
        return false;
    }
}
