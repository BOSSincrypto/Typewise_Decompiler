package a2;

import Y1.d;
import Y1.h;
import com.ibm.icu.impl.breakiter.e;
import com.ibm.icu.impl.breakiter.i;
import com.ibm.icu.impl.breakiter.l;
import com.ibm.icu.impl.k;
import com.ibm.icu.util.CodePointTrie;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.uuid.Uuid;

/* renamed from: a2.g  reason: case insensitive filesystem */
public class C0365g extends C0359a {

    /* renamed from: q  reason: collision with root package name */
    private static final boolean f2284q;

    /* renamed from: v  reason: collision with root package name */
    private static final l f2285v;

    /* renamed from: w  reason: collision with root package name */
    private static final List f2286w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f2287x;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public CharacterIterator f2288f = new StringCharacterIterator("");

    /* renamed from: g  reason: collision with root package name */
    public k f2289g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f2290h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f2291i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f2292j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f2293k;

    /* renamed from: l  reason: collision with root package name */
    private a f2294l = new a();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f2295m = false;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f2296n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public b f2297o = new b();

    /* renamed from: p  reason: collision with root package name */
    private List f2298p;

    static {
        boolean z3;
        String str;
        if (!h.a("rbbi") || h.b("rbbi").indexOf("trace") < 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        f2284q = z3;
        l lVar = new l();
        f2285v = lVar;
        ArrayList arrayList = new ArrayList();
        f2286w = arrayList;
        arrayList.add(lVar);
        if (h.a("rbbi")) {
            str = h.b("rbbi");
        } else {
            str = null;
        }
        f2287x = str;
    }

    private C0365g() {
        List list = f2286w;
        synchronized (list) {
            this.f2298p = new ArrayList(list);
        }
    }

    protected static final void H(int i4, CharacterIterator characterIterator) {
        if (i4 < characterIterator.getBeginIndex() || i4 > characterIterator.getEndIndex()) {
            throw new IllegalArgumentException("offset out of bounds");
        }
    }

    public static C0365g J(ByteBuffer byteBuffer) {
        C0365g gVar = new C0365g();
        k e4 = k.e(byteBuffer);
        gVar.f2289g = e4;
        gVar.f2293k = new int[e4.f12776b.f12799d];
        return gVar;
    }

    static C0365g K(ByteBuffer byteBuffer, boolean z3) {
        C0365g J3 = J(byteBuffer);
        J3.f2295m = z3;
        return J3;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:40|41) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r1 = new com.ibm.icu.impl.breakiter.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1 = new com.ibm.icu.impl.breakiter.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b3, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0081 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0078=Splitter:B:42:0x0078, B:38:0x0069=Splitter:B:38:0x0069} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ibm.icu.impl.breakiter.i L(int r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f2298p
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            com.ibm.icu.impl.breakiter.i r1 = (com.ibm.icu.impl.breakiter.i) r1
            boolean r2 = r1.b(r5)
            if (r2 == 0) goto L_0x0006
            return r1
        L_0x0019:
            java.util.List r0 = f2286w
            monitor-enter(r0)
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0020:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0039 }
            com.ibm.icu.impl.breakiter.i r2 = (com.ibm.icu.impl.breakiter.i) r2     // Catch:{ all -> 0x0039 }
            boolean r3 = r2.b(r5)     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0020
            java.util.List r5 = r4.f2298p     // Catch:{ all -> 0x0039 }
            r5.add(r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r2
        L_0x0039:
            r5 = move-exception
            goto L_0x00b4
        L_0x003c:
            r1 = 4106(0x100a, float:5.754E-42)
            int r1 = Z1.c.h(r5, r1)     // Catch:{ all -> 0x0039 }
            r2 = 22
            r3 = 17
            if (r1 == r2) goto L_0x004c
            r2 = 20
            if (r1 != r2) goto L_0x004d
        L_0x004c:
            r1 = r3
        L_0x004d:
            if (r1 == r3) goto L_0x009a
            r2 = 18
            if (r1 == r2) goto L_0x0093
            r2 = 23
            if (r1 == r2) goto L_0x008d
            r2 = 24
            if (r1 == r2) goto L_0x0087
            r2 = 28
            if (r1 == r2) goto L_0x0078
            r2 = 38
            if (r1 == r2) goto L_0x0069
            com.ibm.icu.impl.breakiter.l r1 = f2285v     // Catch:{ IOException -> 0x00a1 }
            r1.c(r5)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x0069:
            com.ibm.icu.impl.breakiter.LSTMBreakEngine$d r5 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.k(r1)     // Catch:{ MissingResourceException -> 0x0072 }
            com.ibm.icu.impl.breakiter.LSTMBreakEngine r1 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.j(r1, r5)     // Catch:{ MissingResourceException -> 0x0072 }
            goto L_0x00a2
        L_0x0072:
            com.ibm.icu.impl.breakiter.k r1 = new com.ibm.icu.impl.breakiter.k     // Catch:{ IOException -> 0x00a1 }
            r1.<init>()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x0078:
            com.ibm.icu.impl.breakiter.LSTMBreakEngine$d r5 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.k(r1)     // Catch:{ MissingResourceException -> 0x0081 }
            com.ibm.icu.impl.breakiter.LSTMBreakEngine r1 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.j(r1, r5)     // Catch:{ MissingResourceException -> 0x0081 }
            goto L_0x00a2
        L_0x0081:
            com.ibm.icu.impl.breakiter.a r1 = new com.ibm.icu.impl.breakiter.a     // Catch:{ IOException -> 0x00a1 }
            r1.<init>()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x0087:
            com.ibm.icu.impl.breakiter.j r1 = new com.ibm.icu.impl.breakiter.j     // Catch:{ IOException -> 0x00a1 }
            r1.<init>()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x008d:
            com.ibm.icu.impl.breakiter.h r1 = new com.ibm.icu.impl.breakiter.h     // Catch:{ IOException -> 0x00a1 }
            r1.<init>()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x0093:
            com.ibm.icu.impl.breakiter.d r1 = new com.ibm.icu.impl.breakiter.d     // Catch:{ IOException -> 0x00a1 }
            r5 = 1
            r1.<init>(r5)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x009a:
            com.ibm.icu.impl.breakiter.d r1 = new com.ibm.icu.impl.breakiter.d     // Catch:{ IOException -> 0x00a1 }
            r5 = 0
            r1.<init>(r5)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            if (r1 == 0) goto L_0x00b2
            com.ibm.icu.impl.breakiter.l r5 = f2285v     // Catch:{ all -> 0x0039 }
            if (r1 == r5) goto L_0x00b2
            java.util.List r5 = f2286w     // Catch:{ all -> 0x0039 }
            r5.add(r1)     // Catch:{ all -> 0x0039 }
            java.util.List r5 = r4.f2298p     // Catch:{ all -> 0x0039 }
            r5.add(r1)     // Catch:{ all -> 0x0039 }
        L_0x00b2:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x00b4:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C0365g.L(int):com.ibm.icu.impl.breakiter.i");
    }

    /* access modifiers changed from: private */
    public int M() {
        short s4;
        short s5;
        int i4;
        short s6;
        char c4;
        int i5;
        short s7;
        short s8;
        boolean z3 = f2284q;
        if (z3) {
            System.out.println("Handle Next   pos      char  state category");
        }
        this.f2291i = 0;
        this.f2296n = 0;
        CharacterIterator characterIterator = this.f2288f;
        k kVar = this.f2289g;
        CodePointTrie codePointTrie = kVar.f12778d;
        char[] cArr = kVar.f12776b.f12801f;
        int i6 = this.f2290h;
        characterIterator.setIndex(i6);
        int current = characterIterator.current();
        short s9 = 1;
        if (current < 55296 || (current = d.c(characterIterator, current)) != Integer.MAX_VALUE) {
            int f4 = this.f2289g.f(1);
            k.d dVar = this.f2289g.f12776b;
            int i7 = dVar.f12800e;
            int i8 = dVar.f12798c;
            if ((i7 & 2) != 0) {
                if (z3) {
                    PrintStream printStream = System.out;
                    printStream.print("            " + k.h(characterIterator.getIndex(), 5));
                    printStream.print(k.g(current, 10));
                    StringBuilder sb = new StringBuilder();
                    sb.append(k.h(1, 7));
                    s4 = 2;
                    sb.append(k.h(2, 6));
                    printStream.println(sb.toString());
                } else {
                    s4 = 2;
                }
                i4 = i6;
                c4 = 1;
                s5 = s4;
                s6 = 0;
            } else {
                s4 = 2;
                i4 = i6;
                c4 = 1;
                s6 = 1;
                s5 = 3;
            }
            while (c4 != 0) {
                if (current == Integer.MAX_VALUE) {
                    if (s6 == s4) {
                        break;
                    }
                    s5 = s9;
                    s7 = 2;
                } else if (s6 == s9) {
                    s5 = (short) codePointTrie.j(current);
                    if (s5 >= i8) {
                        this.f2296n += s9;
                    }
                    if (f2284q) {
                        PrintStream printStream2 = System.out;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("            ");
                        s8 = s6;
                        sb2.append(k.h(characterIterator.getIndex(), 5));
                        printStream2.print(sb2.toString());
                        printStream2.print(k.g(current, 10));
                        printStream2.println(k.h(c4, 7) + k.h(s5, 6));
                    } else {
                        s8 = s6;
                    }
                    int next = characterIterator.next();
                    if (next >= 55296) {
                        next = d.c(characterIterator, next);
                    }
                    current = next;
                    s7 = s8;
                } else {
                    s7 = 1;
                }
                char c5 = cArr[f4 + 3 + s5];
                int f5 = this.f2289g.f(c5);
                char c6 = cArr[f5];
                if (c6 == 1) {
                    int index = characterIterator.getIndex();
                    if (current >= 65536 && current <= 1114111) {
                        index--;
                    }
                    i4 = index;
                    this.f2291i = cArr[f5 + 2];
                } else if (c6 > 1 && (i5 = this.f2293k[c6]) >= 0) {
                    this.f2291i = cArr[f5 + 2];
                    this.f2290h = i5;
                    return i5;
                }
                char c7 = cArr[f5 + 1];
                if (c7 != 0) {
                    int index2 = characterIterator.getIndex();
                    if (current >= 65536 && current <= 1114111) {
                        index2--;
                    }
                    this.f2293k[c7] = index2;
                }
                s4 = 2;
                s9 = 1;
                char c8 = c5;
                f4 = f5;
                c4 = c8;
            }
            if (i4 == i6) {
                if (f2284q) {
                    System.out.println("Iterator did not move. Advancing by 1.");
                }
                characterIterator.setIndex(i6);
                d.b(characterIterator);
                i4 = characterIterator.getIndex();
                this.f2291i = 0;
            }
            this.f2290h = i4;
            if (f2284q) {
                System.out.println("result = " + i4);
            }
            return i4;
        }
        this.f2292j = true;
        return -1;
    }

    /* access modifiers changed from: private */
    public int N(int i4) {
        CharacterIterator characterIterator = this.f2288f;
        k kVar = this.f2289g;
        CodePointTrie codePointTrie = kVar.f12778d;
        char[] cArr = kVar.f12777c.f12801f;
        v(characterIterator, i4);
        if (f2284q) {
            System.out.print("Handle Previous   pos   char  state category");
        }
        if (characterIterator.getIndex() == characterIterator.getBeginIndex()) {
            return -1;
        }
        char c4 = 1;
        int f4 = this.f2289g.f(1);
        for (int d4 = d.d(characterIterator); d4 != Integer.MAX_VALUE; d4 = d.d(characterIterator)) {
            short j4 = (short) codePointTrie.j(d4);
            if (f2284q) {
                PrintStream printStream = System.out;
                printStream.print("            " + k.h(characterIterator.getIndex(), 5));
                printStream.print(k.g(d4, 10));
                printStream.println(k.h(c4, 7) + k.h(j4, 6));
            }
            c4 = cArr[f4 + 3 + j4];
            f4 = this.f2289g.f(c4);
            if (c4 == 0) {
                break;
            }
        }
        int index = characterIterator.getIndex();
        if (f2284q) {
            PrintStream printStream2 = System.out;
            printStream2.println("result = " + index);
        }
        return index;
    }

    private static int v(CharacterIterator characterIterator, int i4) {
        if (i4 <= characterIterator.getBeginIndex()) {
            characterIterator.first();
        } else if (i4 >= characterIterator.getEndIndex()) {
            characterIterator.setIndex(characterIterator.getEndIndex());
        } else if (Character.isLowSurrogate(characterIterator.setIndex(i4)) && !Character.isHighSurrogate(characterIterator.previous())) {
            characterIterator.next();
        }
        return characterIterator.getIndex();
    }

    public int I() {
        if (this.f2288f != null) {
            return this.f2290h;
        }
        return -1;
    }

    public boolean O(int i4) {
        H(i4, this.f2288f);
        int v3 = v(this.f2288f, i4);
        boolean z3 = false;
        if ((this.f2294l.n(v3) || this.f2294l.h(v3)) && this.f2294l.c() == i4) {
            z3 = true;
        }
        if (!z3) {
            o();
        }
        return z3;
    }

    public int P() {
        CharacterIterator characterIterator = this.f2288f;
        if (characterIterator == null) {
            return -1;
        }
        int endIndex = characterIterator.getEndIndex();
        O(endIndex);
        return endIndex;
    }

    public int b() {
        CharacterIterator characterIterator = this.f2288f;
        if (characterIterator == null) {
            return -1;
        }
        characterIterator.first();
        int index = this.f2288f.getIndex();
        if (!this.f2294l.n(index)) {
            this.f2294l.h(index);
        }
        this.f2294l.c();
        return this.f2290h;
    }

    public int c(int i4) {
        if (i4 < this.f2288f.getBeginIndex()) {
            return b();
        }
        this.f2294l.d(v(this.f2288f, i4));
        if (this.f2292j) {
            return -1;
        }
        return this.f2290h;
    }

    public Object clone() {
        C0365g gVar = (C0365g) super.clone();
        CharacterIterator characterIterator = this.f2288f;
        if (characterIterator != null) {
            gVar.f2288f = (CharacterIterator) characterIterator.clone();
        }
        List list = f2286w;
        synchronized (list) {
            gVar.f2298p = new ArrayList(list);
        }
        gVar.f2293k = new int[this.f2289g.f12776b.f12799d];
        gVar.f2294l = new a(this.f2294l);
        gVar.f2297o = new b(this.f2297o);
        return gVar;
    }

    public boolean equals(Object obj) {
        CharacterIterator characterIterator;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        try {
            C0365g gVar = (C0365g) obj;
            k kVar = this.f2289g;
            k kVar2 = gVar.f2289g;
            if (kVar != kVar2 && (kVar == null || kVar2 == null)) {
                return false;
            }
            if (kVar != null && kVar2 != null && !kVar.f12779e.equals(kVar2.f12779e)) {
                return false;
            }
            CharacterIterator characterIterator2 = this.f2288f;
            if (characterIterator2 == null && gVar.f2288f == null) {
                return true;
            }
            if (characterIterator2 == null || (characterIterator = gVar.f2288f) == null) {
                return false;
            }
            if (!characterIterator2.equals(characterIterator)) {
                return false;
            }
            if (this.f2290h == gVar.f2290h) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.f2289g.f12779e.hashCode();
    }

    public CharacterIterator l() {
        return this.f2288f;
    }

    public int o() {
        this.f2294l.f();
        if (this.f2292j) {
            return -1;
        }
        return this.f2290h;
    }

    public int p(int i4) {
        int i5 = 0;
        if (i4 > 0) {
            while (i4 > 0 && i5 != -1) {
                i5 = o();
                i4--;
            }
            return i5;
        } else if (i4 >= 0) {
            return I();
        } else {
            while (i4 < 0 && i5 != -1) {
                i5 = r();
                i4++;
            }
            return i5;
        }
    }

    public int q(int i4) {
        CharacterIterator characterIterator = this.f2288f;
        if (characterIterator == null || i4 > characterIterator.getEndIndex()) {
            return P();
        }
        if (i4 < this.f2288f.getBeginIndex()) {
            return b();
        }
        this.f2294l.j(i4);
        if (this.f2292j) {
            return -1;
        }
        return this.f2290h;
    }

    public int r() {
        this.f2294l.k();
        if (this.f2292j) {
            return -1;
        }
        return this.f2290h;
    }

    public String toString() {
        k kVar = this.f2289g;
        if (kVar != null) {
            return kVar.f12779e;
        }
        return "";
    }

    public void u(CharacterIterator characterIterator) {
        if (characterIterator != null) {
            this.f2294l.m(characterIterator.getBeginIndex(), 0);
        } else {
            this.f2294l.l();
        }
        this.f2297o.d();
        this.f2288f = characterIterator;
        b();
    }

    /* renamed from: a2.g$b */
    class b {

        /* renamed from: a  reason: collision with root package name */
        e.a f2307a;

        /* renamed from: b  reason: collision with root package name */
        int f2308b;

        /* renamed from: c  reason: collision with root package name */
        int f2309c;

        /* renamed from: d  reason: collision with root package name */
        int f2310d;

        /* renamed from: e  reason: collision with root package name */
        int f2311e;

        /* renamed from: f  reason: collision with root package name */
        int f2312f;

        /* renamed from: g  reason: collision with root package name */
        int f2313g;

        /* renamed from: h  reason: collision with root package name */
        int f2314h;

        b() {
            this.f2308b = -1;
            this.f2307a = new e.a();
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            if (i4 >= this.f2310d || i4 < this.f2309c) {
                this.f2308b = -1;
                return false;
            }
            int i5 = this.f2308b;
            if (i5 < 0 || i5 >= this.f2307a.n() || this.f2307a.b(this.f2308b) != i4) {
                this.f2308b = 0;
                while (this.f2308b < this.f2307a.n()) {
                    int b4 = this.f2307a.b(this.f2308b);
                    if (b4 > i4) {
                        this.f2313g = b4;
                        this.f2314h = this.f2312f;
                        return true;
                    }
                    this.f2308b++;
                }
                this.f2308b = -1;
                return false;
            }
            int i6 = this.f2308b + 1;
            this.f2308b = i6;
            if (i6 >= this.f2307a.n()) {
                this.f2308b = -1;
                return false;
            }
            this.f2313g = this.f2307a.b(this.f2308b);
            this.f2314h = this.f2312f;
            return true;
        }

        /* access modifiers changed from: package-private */
        public void b(int i4, int i5, int i6, int i7) {
            int j4;
            if (i5 - i4 > 1) {
                d();
                this.f2311e = i6;
                this.f2312f = i7;
                C0365g.this.f2288f.setIndex(i4);
                int a4 = d.a(C0365g.this.f2288f);
                short j5 = (short) C0365g.this.f2289g.f12778d.j(a4);
                int i8 = C0365g.this.f2289g.f12776b.f12798c;
                int i9 = 0;
                while (true) {
                    int index = C0365g.this.f2288f.getIndex();
                    if (index < i5 && j5 < i8) {
                        a4 = d.b(C0365g.this.f2288f);
                        j4 = C0365g.this.f2289g.f12778d.j(a4);
                    } else if (index >= i5) {
                        break;
                    } else {
                        i x3 = C0365g.this.L(a4);
                        if (x3 != null) {
                            i9 += x3.a(C0365g.this.f2288f, i4, i5, this.f2307a, C0365g.this.f2295m);
                        }
                        a4 = d.a(C0365g.this.f2288f);
                        j4 = C0365g.this.f2289g.f12778d.j(a4);
                    }
                    j5 = (short) j4;
                }
                if (i9 > 0) {
                    if (i4 < this.f2307a.b(0)) {
                        this.f2307a.g(i4);
                    }
                    if (i5 > this.f2307a.i()) {
                        this.f2307a.k(i5);
                    }
                    this.f2308b = 0;
                    this.f2309c = this.f2307a.b(0);
                    this.f2310d = this.f2307a.i();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i4) {
            int i5;
            int i6;
            int i7;
            if (i4 <= this.f2309c || i4 > (i5 = this.f2310d)) {
                this.f2308b = -1;
                return false;
            }
            if (i4 == i5) {
                this.f2308b = this.f2307a.n() - 1;
            }
            int i8 = this.f2308b;
            if (i8 > 0 && i8 < this.f2307a.n() && this.f2307a.b(this.f2308b) == i4) {
                int i9 = this.f2308b - 1;
                this.f2308b = i9;
                int b4 = this.f2307a.b(i9);
                this.f2313g = b4;
                if (b4 == this.f2309c) {
                    i7 = this.f2311e;
                } else {
                    i7 = this.f2312f;
                }
                this.f2314h = i7;
                return true;
            } else if (this.f2308b == 0) {
                this.f2308b = -1;
                return false;
            } else {
                int n4 = this.f2307a.n();
                while (true) {
                    this.f2308b = n4 - 1;
                    int i10 = this.f2308b;
                    if (i10 >= 0) {
                        int b5 = this.f2307a.b(i10);
                        if (b5 < i4) {
                            this.f2313g = b5;
                            if (b5 == this.f2309c) {
                                i6 = this.f2311e;
                            } else {
                                i6 = this.f2312f;
                            }
                            this.f2314h = i6;
                            return true;
                        }
                        n4 = this.f2308b;
                    } else {
                        this.f2308b = -1;
                        return false;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f2308b = -1;
            this.f2309c = 0;
            this.f2310d = 0;
            this.f2311e = 0;
            this.f2312f = 0;
            this.f2307a.l();
        }

        b(b bVar) {
            try {
                this.f2307a = (e.a) bVar.f2307a.clone();
                this.f2308b = bVar.f2308b;
                this.f2309c = bVar.f2309c;
                this.f2310d = bVar.f2310d;
                this.f2311e = bVar.f2311e;
                this.f2312f = bVar.f2312f;
                this.f2313g = bVar.f2313g;
                this.f2314h = bVar.f2314h;
            } catch (CloneNotSupportedException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* renamed from: a2.g$a */
    class a {

        /* renamed from: a  reason: collision with root package name */
        int f2299a;

        /* renamed from: b  reason: collision with root package name */
        int f2300b;

        /* renamed from: c  reason: collision with root package name */
        int f2301c;

        /* renamed from: d  reason: collision with root package name */
        int f2302d;

        /* renamed from: e  reason: collision with root package name */
        int[] f2303e = new int[Uuid.SIZE_BITS];

        /* renamed from: f  reason: collision with root package name */
        short[] f2304f = new short[Uuid.SIZE_BITS];

        /* renamed from: g  reason: collision with root package name */
        e.a f2305g = new e.a();

        a() {
            l();
        }

        private final int e(int i4) {
            return i4 & 127;
        }

        /* access modifiers changed from: package-private */
        public void a(int i4, int i5, boolean z3) {
            int e4 = e(this.f2300b + 1);
            int i6 = this.f2299a;
            if (e4 == i6) {
                this.f2299a = e(i6 + 6);
            }
            this.f2303e[e4] = i4;
            this.f2304f[e4] = (short) i5;
            this.f2300b = e4;
            if (z3) {
                this.f2302d = e4;
                this.f2301c = i4;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int i4, int i5, boolean z3) {
            int e4 = e(this.f2299a - 1);
            int i6 = this.f2300b;
            if (e4 == i6) {
                if (this.f2302d == i6 && !z3) {
                    return false;
                }
                this.f2300b = e(i6 - 1);
            }
            this.f2303e[e4] = i4;
            this.f2304f[e4] = (short) i5;
            this.f2299a = e4;
            if (z3) {
                this.f2302d = e4;
                this.f2301c = i4;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            int unused = C0365g.this.f2290h = this.f2301c;
            int unused2 = C0365g.this.f2291i = this.f2304f[this.f2302d];
            boolean unused3 = C0365g.this.f2292j = false;
            return this.f2301c;
        }

        /* access modifiers changed from: package-private */
        public void d(int i4) {
            if (i4 == this.f2301c || n(i4) || h(i4)) {
                boolean unused = C0365g.this.f2292j = false;
                f();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            int i4 = this.f2302d;
            if (i4 == this.f2300b) {
                boolean unused = C0365g.this.f2292j = !g();
                int unused2 = C0365g.this.f2290h = this.f2301c;
                int unused3 = C0365g.this.f2291i = this.f2304f[this.f2302d];
                return;
            }
            int e4 = e(i4 + 1);
            this.f2302d = e4;
            this.f2301c = C0365g.this.f2290h = this.f2303e[e4];
            int unused4 = C0365g.this.f2291i = this.f2304f[this.f2302d];
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            int E3;
            int[] iArr = this.f2303e;
            int i4 = this.f2300b;
            int i5 = iArr[i4];
            short s4 = this.f2304f[i4];
            if (C0365g.this.f2297o.a(i5)) {
                a(C0365g.this.f2297o.f2313g, C0365g.this.f2297o.f2314h, true);
                return true;
            }
            int unused = C0365g.this.f2290h = i5;
            int E4 = C0365g.this.M();
            if (E4 == -1) {
                return false;
            }
            int B3 = C0365g.this.f2291i;
            if (C0365g.this.f2296n > 0) {
                C0365g.this.f2297o.b(i5, E4, s4, B3);
                if (C0365g.this.f2297o.a(i5)) {
                    a(C0365g.this.f2297o.f2313g, C0365g.this.f2297o.f2314h, true);
                    return true;
                }
            }
            a(E4, B3, true);
            for (int i6 = 0; i6 < 6 && (E3 = C0365g.this.M()) != -1 && C0365g.this.f2296n <= 0; i6++) {
                a(E3, C0365g.this.f2291i, false);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean h(int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int[] iArr = this.f2303e;
            if (i4 < iArr[this.f2299a] - 15 || i4 > iArr[this.f2300b] + 15) {
                int beginIndex = C0365g.this.f2288f.getBeginIndex();
                if (i4 > beginIndex + 20) {
                    int D3 = C0365g.this.N(i4);
                    if (D3 > beginIndex) {
                        int unused = C0365g.this.f2290h = D3;
                        beginIndex = C0365g.this.M();
                        if (beginIndex == D3 + 1 || (beginIndex == D3 + 2 && Character.isHighSurrogate(C0365g.this.f2288f.setIndex(D3)) && Character.isLowSurrogate(C0365g.this.f2288f.next()))) {
                            beginIndex = C0365g.this.M();
                        }
                    }
                    i8 = C0365g.this.f2291i;
                } else {
                    i8 = 0;
                }
                m(beginIndex, i8);
            }
            int[] iArr2 = this.f2303e;
            if (iArr2[this.f2300b] < i4) {
                do {
                    int[] iArr3 = this.f2303e;
                    int i9 = this.f2300b;
                    int i10 = iArr3[i9];
                    if (i10 >= i4) {
                        this.f2302d = i9;
                        this.f2301c = i10;
                        while (this.f2301c > i4) {
                            k();
                        }
                        return true;
                    }
                } while (g());
                return false;
            }
            if (iArr2[this.f2299a] > i4) {
                while (true) {
                    int[] iArr4 = this.f2303e;
                    i5 = this.f2299a;
                    i6 = iArr4[i5];
                    if (i6 <= i4) {
                        break;
                    }
                    i();
                }
                this.f2302d = i5;
                this.f2301c = i6;
                while (true) {
                    i7 = this.f2301c;
                    if (i7 >= i4) {
                        break;
                    }
                    f();
                }
                if (i7 > i4) {
                    k();
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            int i4;
            int i5;
            boolean z3;
            int beginIndex = C0365g.this.f2288f.getBeginIndex();
            int i6 = this.f2303e[this.f2299a];
            if (i6 == beginIndex) {
                return false;
            }
            boolean z4 = true;
            if (C0365g.this.f2297o.c(i6)) {
                b(C0365g.this.f2297o.f2313g, C0365g.this.f2297o.f2314h, true);
                return true;
            }
            int i7 = i6;
            do {
                int i8 = i7 - 30;
                if (i8 <= beginIndex) {
                    i7 = beginIndex;
                } else {
                    i7 = C0365g.this.N(i8);
                }
                if (i7 == -1 || i7 == beginIndex) {
                    i5 = beginIndex;
                    i4 = 0;
                    continue;
                } else {
                    int unused = C0365g.this.f2290h = i7;
                    i5 = C0365g.this.M();
                    if (i5 == i7 + 1 || (i5 == i7 + 2 && Character.isHighSurrogate(C0365g.this.f2288f.setIndex(i7)) && Character.isLowSurrogate(C0365g.this.f2288f.next()))) {
                        i5 = C0365g.this.M();
                    }
                    i4 = C0365g.this.f2291i;
                    continue;
                }
            } while (i5 >= i6);
            this.f2305g.l();
            this.f2305g.k(i5);
            this.f2305g.k(i4);
            while (true) {
                int A3 = C0365g.this.f2290h = i5;
                int E3 = C0365g.this.M();
                int B3 = C0365g.this.f2291i;
                if (E3 == -1) {
                    break;
                }
                if (C0365g.this.f2296n != 0) {
                    C0365g.this.f2297o.b(A3, E3, i4, B3);
                    z3 = false;
                    while (true) {
                        if (!C0365g.this.f2297o.a(A3)) {
                            break;
                        }
                        E3 = C0365g.this.f2297o.f2313g;
                        B3 = C0365g.this.f2297o.f2314h;
                        if (E3 >= i6) {
                            z3 = true;
                            break;
                        }
                        this.f2305g.k(E3);
                        this.f2305g.k(B3);
                        A3 = E3;
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                int i9 = B3;
                i5 = E3;
                if (!z3 && i5 < i6) {
                    this.f2305g.k(i5);
                    this.f2305g.k(i9);
                }
                if (i5 >= i6) {
                    break;
                }
                i4 = i9;
            }
            if (!this.f2305g.d()) {
                b(this.f2305g.j(), this.f2305g.j(), true);
            } else {
                z4 = false;
            }
            while (!this.f2305g.d()) {
                if (!b(this.f2305g.j(), this.f2305g.j(), false)) {
                    break;
                }
            }
            return z4;
        }

        /* access modifiers changed from: package-private */
        public void j(int i4) {
            if (i4 != this.f2301c && !n(i4) && !h(i4)) {
                return;
            }
            if (i4 == this.f2301c) {
                k();
            } else {
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public void k() {
            boolean z3;
            int i4 = this.f2302d;
            if (i4 == this.f2299a) {
                i();
            } else {
                int e4 = e(i4 - 1);
                this.f2302d = e4;
                this.f2301c = this.f2303e[e4];
            }
            C0365g gVar = C0365g.this;
            if (this.f2302d == i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean unused = gVar.f2292j = z3;
            int unused2 = C0365g.this.f2290h = this.f2301c;
            int unused3 = C0365g.this.f2291i = this.f2304f[this.f2302d];
        }

        /* access modifiers changed from: package-private */
        public void l() {
            m(0, 0);
        }

        /* access modifiers changed from: package-private */
        public void m(int i4, int i5) {
            this.f2299a = 0;
            this.f2300b = 0;
            this.f2301c = i4;
            this.f2302d = 0;
            this.f2303e[0] = i4;
            this.f2304f[0] = (short) i5;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r4 = r6.f2300b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean n(int r7) {
            /*
                r6 = this;
                int[] r0 = r6.f2303e
                int r1 = r6.f2299a
                r2 = r0[r1]
                r3 = 0
                if (r7 < r2) goto L_0x004e
                int r4 = r6.f2300b
                r0 = r0[r4]
                if (r7 <= r0) goto L_0x0010
                goto L_0x004e
            L_0x0010:
                r5 = 1
                if (r7 != r2) goto L_0x0018
                r6.f2302d = r1
                r6.f2301c = r2
                return r5
            L_0x0018:
                if (r7 != r0) goto L_0x001f
                r6.f2302d = r4
                r6.f2301c = r0
                return r5
            L_0x001f:
                if (r1 == r4) goto L_0x0040
                int r0 = r1 + r4
                if (r1 <= r4) goto L_0x0028
                r2 = 128(0x80, float:1.794E-43)
                goto L_0x0029
            L_0x0028:
                r2 = r3
            L_0x0029:
                int r0 = r0 + r2
                int r0 = r0 / 2
                int r0 = r6.e(r0)
                int[] r2 = r6.f2303e
                r2 = r2[r0]
                if (r2 <= r7) goto L_0x0038
                r4 = r0
                goto L_0x001f
            L_0x0038:
                int r0 = r0 + 1
                int r0 = r6.e(r0)
                r1 = r0
                goto L_0x001f
            L_0x0040:
                int r4 = r4 - r5
                int r7 = r6.e(r4)
                r6.f2302d = r7
                int[] r0 = r6.f2303e
                r7 = r0[r7]
                r6.f2301c = r7
                return r5
            L_0x004e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.C0365g.a.n(int):boolean");
        }

        a(a aVar) {
            this.f2299a = aVar.f2299a;
            this.f2300b = aVar.f2300b;
            this.f2301c = aVar.f2301c;
            this.f2302d = aVar.f2302d;
            this.f2303e = (int[]) aVar.f2303e.clone();
            this.f2304f = (short[]) aVar.f2304f.clone();
            this.f2305g = new e.a();
        }
    }
}
