package ch.icoaching.typewise.resources.char_level_vocabs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import v2.C0925a;

public final class CharLevelVocab implements Iterable, C0925a {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f8846d = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final a f8847a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8848b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f8849c;

    public static final class Companion {
        private Companion() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(ch.icoaching.typewise.resources.char_level_vocabs.a r11, java.lang.String r12, kotlin.coroutines.c r13) {
            /*
                r10 = this;
                boolean r0 = r13 instanceof ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromDisk$1
                if (r0 == 0) goto L_0x0013
                r0 = r13
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromDisk$1 r0 = (ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromDisk$1) r0
                int r1 = r0.f8852c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8852c = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromDisk$1 r0 = new ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromDisk$1
                r0.<init>(r10, r13)
            L_0x0018:
                java.lang.Object r13 = r0.f8850a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f8852c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                kotlin.f.b(r13)
                goto L_0x0061
            L_0x0029:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0031:
                kotlin.f.b(r13)
                ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r2 = "loadFromDisk() :: Loading char level vocab '"
                r13.append(r2)
                r13.append(r11)
                java.lang.String r2 = "' from disk."
                r13.append(r2)
                java.lang.String r6 = r13.toString()
                r8 = 4
                r9 = 0
                java.lang.String r5 = "CharLevelVocab"
                r7 = 0
                ch.icoaching.typewise.e.b(r4, r5, r6, r7, r8, r9)
                java.lang.String r13 = r11.a()
                r0.f8852c = r3
                java.lang.Object r13 = r10.b(r13, r11, r12, r0)
                if (r13 != r1) goto L_0x0061
                return r1
            L_0x0061:
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab r13 = (ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab) r13
                r13.e()
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab.Companion.a(ch.icoaching.typewise.resources.char_level_vocabs.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: ch.icoaching.typewise.resources.char_level_vocabs.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9 A[LOOP:0: B:24:0x00a3->B:26:0x00a9, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.lang.String r6, ch.icoaching.typewise.resources.char_level_vocabs.a r7, java.lang.String r8, kotlin.coroutines.c r9) {
            /*
                r5 = this;
                boolean r8 = r9 instanceof ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromFile$1
                if (r8 == 0) goto L_0x0013
                r8 = r9
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromFile$1 r8 = (ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromFile$1) r8
                int r0 = r8.f8857e
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L_0x0013
                int r0 = r0 - r1
                r8.f8857e = r0
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromFile$1 r8 = new ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion$loadFromFile$1
                r8.<init>(r5, r9)
            L_0x0018:
                java.lang.Object r9 = r8.f8855c
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r8.f8857e
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0046
                if (r1 == r4) goto L_0x0039
                if (r1 != r3) goto L_0x0031
                java.lang.Object r6 = r8.f8853a
                ch.icoaching.typewise.resources.char_level_vocabs.a r6 = (ch.icoaching.typewise.resources.char_level_vocabs.a) r6
                kotlin.f.b(r9)
                goto L_0x007c
            L_0x0031:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0039:
                java.lang.Object r6 = r8.f8854b
                r7 = r6
                ch.icoaching.typewise.resources.char_level_vocabs.a r7 = (ch.icoaching.typewise.resources.char_level_vocabs.a) r7
                java.lang.Object r6 = r8.f8853a
                java.lang.String r6 = (java.lang.String) r6
                kotlin.f.b(r9)
                goto L_0x005e
            L_0x0046:
                kotlin.f.b(r9)
                ch.icoaching.typewise.file_handling.b r9 = ch.icoaching.typewise.file_handling.b.f8265a
                ch.icoaching.typewise.file_handling.FileIO$Scope r1 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
                ch.icoaching.typewise.file_handling.FileIO r9 = r9.a(r1)
                r8.f8853a = r6
                r8.f8854b = r7
                r8.f8857e = r4
                java.lang.Object r9 = r9.c(r6, r8)
                if (r9 != r0) goto L_0x005e
                return r0
            L_0x005e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x00c2
                ch.icoaching.typewise.file_handling.b r9 = ch.icoaching.typewise.file_handling.b.f8265a
                ch.icoaching.typewise.file_handling.FileIO$Scope r1 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
                ch.icoaching.typewise.file_handling.FileIO r9 = r9.a(r1)
                r8.f8853a = r7
                r8.f8854b = r2
                r8.f8857e = r3
                java.lang.Object r9 = r9.a(r6, r8)
                if (r9 != r0) goto L_0x007b
                return r0
            L_0x007b:
                r6 = r7
            L_0x007c:
                java.lang.String r9 = (java.lang.String) r9
                t0.c r7 = t0.c.f16361a
                K2.a r7 = r7.c()
                r7.a()
                J2.f r8 = new J2.f
                J2.G0 r0 = J2.G0.f622a
                r8.<init>(r0)
                java.lang.Object r7 = r7.c(r8, r9)
                java.util.List r7 = (java.util.List) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r9 = 10
                int r9 = kotlin.collections.C0718m.t(r7, r9)
                r8.<init>(r9)
                java.util.Iterator r7 = r7.iterator()
            L_0x00a3:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x00bc
                java.lang.Object r9 = r7.next()
                java.lang.String r9 = (java.lang.String) r9
                r0 = 0
                char r9 = r9.charAt(r0)
                java.lang.Character r9 = kotlin.coroutines.jvm.internal.a.b(r9)
                r8.add(r9)
                goto L_0x00a3
            L_0x00bc:
                ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab r7 = new ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab
                r7.<init>(r8, r6, r2)
                return r7
            L_0x00c2:
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "File '"
                r8.append(r9)
                r8.append(r6)
                java.lang.String r6 = "' doesn't exist locally."
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab.Companion.b(java.lang.String, ch.icoaching.typewise.resources.char_level_vocabs.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f8858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CharLevelVocab f8859b;

        a(CharLevelVocab charLevelVocab) {
            this.f8859b = charLevelVocab;
        }

        /* renamed from: b */
        public Character next() {
            List c4 = this.f8859b.c();
            int i4 = this.f8858a;
            this.f8858a = i4 + 1;
            return (Character) c4.get(i4);
        }

        public boolean hasNext() {
            return this.f8858a < this.f8859b.c().size();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private CharLevelVocab(Iterable iterable, a aVar) {
        this.f8847a = aVar;
        this.f8848b = C0718m.B0(iterable);
        this.f8849c = C0718m.F0(iterable);
    }

    public final char b(int i4) {
        return ((Character) this.f8848b.get(i4)).charValue();
    }

    public final List c() {
        return this.f8848b;
    }

    public final int d() {
        return this.f8848b.size();
    }

    public final void e() {
    }

    public Iterator iterator() {
        return new a(this);
    }

    public /* synthetic */ CharLevelVocab(Iterable iterable, a aVar, i iVar) {
        this(iterable, aVar);
    }
}
