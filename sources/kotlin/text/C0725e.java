package kotlin.text;

import B2.e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import u2.p;
import v2.C0925a;
import z2.c;
import z2.d;

/* renamed from: kotlin.text.e  reason: case insensitive filesystem */
final class C0725e implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f13935a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f13936b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f13937c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p f13938d;

    /* renamed from: kotlin.text.e$a */
    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f13939a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f13940b;

        /* renamed from: c  reason: collision with root package name */
        private int f13941c;

        /* renamed from: d  reason: collision with root package name */
        private c f13942d;

        /* renamed from: e  reason: collision with root package name */
        private int f13943e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C0725e f13944f;

        a(C0725e eVar) {
            this.f13944f = eVar;
            int f4 = d.f(eVar.f13936b, 0, eVar.f13935a.length());
            this.f13940b = f4;
            this.f13941c = f4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < kotlin.text.C0725e.d(r6.f13944f)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f13941c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f13939a = r1
                r0 = 0
                r6.f13942d = r0
                goto L_0x009e
            L_0x000c:
                kotlin.text.e r0 = r6.f13944f
                int r0 = r0.f13937c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f13943e
                int r0 = r0 + r3
                r6.f13943e = r0
                kotlin.text.e r4 = r6.f13944f
                int r4 = r4.f13937c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f13941c
                kotlin.text.e r4 = r6.f13944f
                java.lang.CharSequence r4 = r4.f13935a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                z2.c r0 = new z2.c
                int r1 = r6.f13940b
                kotlin.text.e r4 = r6.f13944f
                java.lang.CharSequence r4 = r4.f13935a
                int r4 = kotlin.text.o.P(r4)
                r0.<init>(r1, r4)
                r6.f13942d = r0
                r6.f13941c = r2
                goto L_0x009c
            L_0x0047:
                kotlin.text.e r0 = r6.f13944f
                u2.p r0 = r0.f13938d
                kotlin.text.e r4 = r6.f13944f
                java.lang.CharSequence r4 = r4.f13935a
                int r5 = r6.f13941c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0077
                z2.c r0 = new z2.c
                int r1 = r6.f13940b
                kotlin.text.e r4 = r6.f13944f
                java.lang.CharSequence r4 = r4.f13935a
                int r4 = kotlin.text.o.P(r4)
                r0.<init>(r1, r4)
                r6.f13942d = r0
                r6.f13941c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f13940b
                z2.c r4 = z2.d.j(r4, r2)
                r6.f13942d = r4
                int r2 = r2 + r0
                r6.f13940b = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f13941c = r2
            L_0x009c:
                r6.f13939a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C0725e.a.b():void");
        }

        /* renamed from: c */
        public c next() {
            if (this.f13939a == -1) {
                b();
            }
            if (this.f13939a != 0) {
                c cVar = this.f13942d;
                o.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f13942d = null;
                this.f13939a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f13939a == -1) {
                b();
            }
            if (this.f13939a == 1) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0725e(CharSequence charSequence, int i4, int i5, p pVar) {
        o.e(charSequence, "input");
        o.e(pVar, "getNextMatch");
        this.f13935a = charSequence;
        this.f13936b = i4;
        this.f13937c = i5;
        this.f13938d = pVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
