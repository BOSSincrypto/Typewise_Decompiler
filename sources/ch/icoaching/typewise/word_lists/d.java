package ch.icoaching.typewise.word_lists;

import E0.s;
import androidx.work.c;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import y0.C0946c;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f8938f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f8939a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8940b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8941c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8942d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8943e;

    public static final class a {
        private a() {
        }

        public static /* synthetic */ d c(a aVar, String str, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i4 = 1;
            }
            return aVar.b(str, i4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.typewise.word_lists.d a(java.util.List r11) {
            /*
                r10 = this;
                java.lang.String r0 = "wordListEntries"
                kotlin.jvm.internal.o.e(r11, r0)
                boolean r0 = r11.isEmpty()
                if (r0 != 0) goto L_0x00d8
                int r0 = r11.size()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L_0x001a
                java.lang.Object r11 = r11.get(r1)
                ch.icoaching.typewise.word_lists.d r11 = (ch.icoaching.typewise.word_lists.d) r11
                return r11
            L_0x001a:
                java.util.Iterator r0 = r11.iterator()
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00d2
                java.lang.Object r3 = r0.next()
                ch.icoaching.typewise.word_lists.d r3 = (ch.icoaching.typewise.word_lists.d) r3
                int r3 = r3.a()
            L_0x002e:
                r5 = r3
            L_0x002f:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r0.next()
                ch.icoaching.typewise.word_lists.d r3 = (ch.icoaching.typewise.word_lists.d) r3
                int r3 = r3.a()
                if (r5 >= r3) goto L_0x002f
                goto L_0x002e
            L_0x0042:
                boolean r0 = r11.isEmpty()
                if (r0 == 0) goto L_0x0049
                goto L_0x0061
            L_0x0049:
                java.util.Iterator r0 = r11.iterator()
            L_0x004d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0061
                java.lang.Object r3 = r0.next()
                ch.icoaching.typewise.word_lists.d r3 = (ch.icoaching.typewise.word_lists.d) r3
                boolean r3 = r3.b()
                if (r3 == 0) goto L_0x004d
                r6 = r2
                goto L_0x0062
            L_0x0061:
                r6 = r1
            L_0x0062:
                boolean r0 = r11.isEmpty()
                if (r0 == 0) goto L_0x0069
                goto L_0x0081
            L_0x0069:
                java.util.Iterator r0 = r11.iterator()
            L_0x006d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0081
                java.lang.Object r3 = r0.next()
                ch.icoaching.typewise.word_lists.d r3 = (ch.icoaching.typewise.word_lists.d) r3
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x006d
                r7 = r2
                goto L_0x0082
            L_0x0081:
                r7 = r1
            L_0x0082:
                boolean r0 = r11.isEmpty()
                if (r0 == 0) goto L_0x0089
                goto L_0x00a1
            L_0x0089:
                java.util.Iterator r0 = r11.iterator()
            L_0x008d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00a1
                java.lang.Object r3 = r0.next()
                ch.icoaching.typewise.word_lists.d r3 = (ch.icoaching.typewise.word_lists.d) r3
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x008d
                r8 = r2
                goto L_0x00a2
            L_0x00a1:
                r8 = r1
            L_0x00a2:
                java.util.Iterator r11 = r11.iterator()
            L_0x00a6:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x00ba
                java.lang.Object r0 = r11.next()
                r1 = r0
                ch.icoaching.typewise.word_lists.d r1 = (ch.icoaching.typewise.word_lists.d) r1
                boolean r1 = r1.c()
                if (r1 == 0) goto L_0x00a6
                goto L_0x00bb
            L_0x00ba:
                r0 = 0
            L_0x00bb:
                ch.icoaching.typewise.word_lists.d r0 = (ch.icoaching.typewise.word_lists.d) r0
                if (r0 == 0) goto L_0x00c8
                java.lang.String r11 = r0.e()
                if (r11 != 0) goto L_0x00c6
                goto L_0x00c8
            L_0x00c6:
                r9 = r11
                goto L_0x00cb
            L_0x00c8:
                java.lang.String r11 = ""
                goto L_0x00c6
            L_0x00cb:
                ch.icoaching.typewise.word_lists.d r11 = new ch.icoaching.typewise.word_lists.d
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9)
                return r11
            L_0x00d2:
                java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
                r11.<init>()
                throw r11
            L_0x00d8:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Cannot combine empty wordlist entries."
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.d.a.a(java.util.List):ch.icoaching.typewise.word_lists.d");
        }

        public final d b(String str, int i4) {
            o.e(str, "word");
            if (s.f(str)) {
                return new d(i4, true, false, false, "");
            }
            return C0946c.o(str) ? new d(i4, false, true, false, "") : new d(i4, false, false, true, str);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public d(int i4, boolean z3, boolean z4, boolean z5, String str) {
        o.e(str, "wordMixedCase");
        this.f8939a = i4;
        this.f8940b = z3;
        this.f8941c = z4;
        this.f8942d = z5;
        this.f8943e = str;
    }

    public final int a() {
        return this.f8939a;
    }

    public final boolean b() {
        return this.f8940b;
    }

    public final boolean c() {
        return this.f8942d;
    }

    public final boolean d() {
        return this.f8941c;
    }

    public final String e() {
        return this.f8943e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8939a == dVar.f8939a && this.f8940b == dVar.f8940b && this.f8941c == dVar.f8941c && this.f8942d == dVar.f8942d && o.a(this.f8943e, dVar.f8943e);
    }

    public final boolean f(String str) {
        o.e(str, "word");
        if (this.f8940b && s.f(str)) {
            return true;
        }
        s.i(str);
        if (!this.f8941c || !C0946c.o(str)) {
            return o.a(str, this.f8943e);
        }
        return true;
    }

    public final Set g(String str) {
        o.e(str, "word");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.f8940b) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            linkedHashSet.add(lowerCase);
        }
        if (this.f8941c) {
            linkedHashSet.add(s.a(str));
        }
        if (this.f8942d) {
            linkedHashSet.add(this.f8943e);
        }
        return linkedHashSet;
    }

    public int hashCode() {
        return (((((((this.f8939a * 31) + c.a(this.f8940b)) * 31) + c.a(this.f8941c)) * 31) + c.a(this.f8942d)) * 31) + this.f8943e.hashCode();
    }

    public String toString() {
        int i4 = this.f8939a;
        boolean z3 = this.f8940b;
        boolean z4 = this.f8941c;
        boolean z5 = this.f8942d;
        String str = this.f8943e;
        return "WordListEntry(frequency=" + i4 + ", lowerCase=" + z3 + ", titleCase=" + z4 + ", mixedCase=" + z5 + ", wordMixedCase=" + str + ")";
    }
}
