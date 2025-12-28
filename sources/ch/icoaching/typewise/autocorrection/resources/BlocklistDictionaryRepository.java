package ch.icoaching.typewise.autocorrection.resources;

import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.c;
import r0.e;
import r0.f;

public final class BlocklistDictionaryRepository implements IDictionaryRepository {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f7890d = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final IDictionaryRepository f7891a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7892b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f7893c;

    public static final class Companion {
        private Companion() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(ch.icoaching.typewise.config.CompanyConfig.b r5, java.lang.String r6, ch.icoaching.typewise.word_lists.c r7, kotlin.coroutines.c r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1 r0 = (ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1) r0
                int r1 = r0.f7898e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f7898e = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1 r0 = new ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getHardBlocklistFromCorrectionConfig$1
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f7896c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f7898e
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r5 = r0.f7895b
                r6 = r5
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r5 = r0.f7894a
                ch.icoaching.typewise.config.CompanyConfig$b r5 = (ch.icoaching.typewise.config.CompanyConfig.b) r5
                kotlin.f.b(r8)
                goto L_0x0065
            L_0x0032:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x003a:
                kotlin.f.b(r8)
                java.util.Map r8 = r5.d()
                if (r8 == 0) goto L_0x004a
                java.lang.Object r8 = r8.get(r6)
                java.util.Set r8 = (java.util.Set) r8
                goto L_0x004b
            L_0x004a:
                r8 = 0
            L_0x004b:
                if (r8 == 0) goto L_0x0070
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L_0x0054
                goto L_0x0070
            L_0x0054:
                java.util.List r8 = kotlin.collections.C0718m.B0(r8)
                r0.f7894a = r5
                r0.f7895b = r6
                r0.f7898e = r3
                java.lang.Object r8 = r7.a(r8, r0)
                if (r8 != r1) goto L_0x0065
                return r1
            L_0x0065:
                ch.icoaching.typewise.word_lists.WordList r8 = (ch.icoaching.typewise.word_lists.WordList) r8
                java.util.Iterator r7 = r8.l()
                java.util.Set r7 = E0.i.a(r7)
                goto L_0x0075
            L_0x0070:
                java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
                r7.<init>()
            L_0x0075:
                java.util.Map r5 = r5.c()
                java.lang.Object r5 = r5.get(r6)
                java.util.Set r5 = (java.util.Set) r5
                if (r5 != 0) goto L_0x0085
                java.util.Set r5 = kotlin.collections.L.e()
            L_0x0085:
                java.util.Set r5 = kotlin.collections.C0718m.G0(r7, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository.Companion.c(ch.icoaching.typewise.config.CompanyConfig$b, java.lang.String, ch.icoaching.typewise.word_lists.c, kotlin.coroutines.c):java.lang.Object");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(ch.icoaching.typewise.config.CompanyConfig.b r6, java.lang.String r7, ch.icoaching.typewise.word_lists.c r8, kotlin.coroutines.c r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1 r0 = (ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1) r0
                int r1 = r0.f7902d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f7902d = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1 r0 = new ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$getSoftBlocklistFromCorrectionConfig$1
                r0.<init>(r5, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f7900b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f7902d
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r6 = r0.f7899a
                java.util.Set r6 = (java.util.Set) r6
                kotlin.f.b(r9)
                goto L_0x0072
            L_0x002d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0035:
                kotlin.f.b(r9)
                java.util.Map r9 = r6.f()
                java.lang.Object r9 = r9.get(r7)
                java.util.Set r9 = (java.util.Set) r9
                if (r9 != 0) goto L_0x0048
                java.util.Set r9 = kotlin.collections.L.e()
            L_0x0048:
                java.util.Map r6 = r6.k()
                r2 = 0
                if (r6 == 0) goto L_0x0056
                java.lang.Object r6 = r6.get(r7)
                java.util.Set r6 = (java.util.Set) r6
                goto L_0x0057
            L_0x0056:
                r6 = r2
            L_0x0057:
                if (r6 == 0) goto L_0x0076
                boolean r7 = r6.isEmpty()
                if (r7 == 0) goto L_0x0060
                goto L_0x0076
            L_0x0060:
                java.util.List r6 = kotlin.collections.C0718m.B0(r6)
                r0.f7899a = r9
                r0.f7902d = r3
                java.lang.Object r6 = r8.a(r6, r0)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r4 = r9
                r9 = r6
                r6 = r4
            L_0x0072:
                r2 = r9
                ch.icoaching.typewise.word_lists.WordList r2 = (ch.icoaching.typewise.word_lists.WordList) r2
                r9 = r6
            L_0x0076:
                if (r2 == 0) goto L_0x0084
                java.util.Iterator r6 = r2.l()
                if (r6 == 0) goto L_0x0084
                java.util.Set r6 = E0.i.a(r6)
                if (r6 != 0) goto L_0x0089
            L_0x0084:
                java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
                r6.<init>()
            L_0x0089:
                java.util.Set r6 = kotlin.collections.C0718m.G0(r9, r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository.Companion.d(ch.icoaching.typewise.config.CompanyConfig$b, java.lang.String, ch.icoaching.typewise.word_lists.c, kotlin.coroutines.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object e(ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r10, ch.icoaching.typewise.word_lists.c r11, kotlinx.coroutines.CoroutineDispatcher r12, java.util.List r13, ch.icoaching.typewise.config.CompanyConfig.b r14, kotlin.coroutines.c r15) {
            /*
                r9 = this;
                boolean r0 = r15 instanceof ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$1
                if (r0 == 0) goto L_0x0013
                r0 = r15
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$1 r0 = (ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$1) r0
                int r1 = r0.f7913k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f7913k = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$1 r0 = new ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$1
                r0.<init>(r9, r15)
            L_0x0018:
                java.lang.Object r15 = r0.f7911i
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f7913k
                r3 = 1
                if (r2 == 0) goto L_0x0059
                if (r2 != r3) goto L_0x0051
                java.lang.Object r10 = r0.f7910h
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r0.f7909g
                java.util.Iterator r11 = (java.util.Iterator) r11
                java.lang.Object r12 = r0.f7908f
                java.util.Map r12 = (java.util.Map) r12
                java.lang.Object r13 = r0.f7907e
                java.util.Map r13 = (java.util.Map) r13
                java.lang.Object r14 = r0.f7906d
                ch.icoaching.typewise.config.CompanyConfig$b r14 = (ch.icoaching.typewise.config.CompanyConfig.b) r14
                java.lang.Object r2 = r0.f7905c
                kotlinx.coroutines.CoroutineDispatcher r2 = (kotlinx.coroutines.CoroutineDispatcher) r2
                java.lang.Object r4 = r0.f7904b
                ch.icoaching.typewise.word_lists.c r4 = (ch.icoaching.typewise.word_lists.c) r4
                java.lang.Object r5 = r0.f7903a
                ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r5 = (ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository) r5
                kotlin.f.b(r15)
                r7 = r4
                r4 = r12
                r12 = r7
                r8 = r15
                r15 = r13
                r13 = r2
                r2 = r0
                r0 = r8
                goto L_0x009f
            L_0x0051:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0059:
                kotlin.f.b(r15)
                java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
                r15.<init>()
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Iterator r13 = r13.iterator()
                r7 = r12
                r12 = r11
                r11 = r13
                r13 = r7
            L_0x006e:
                boolean r4 = r11.hasNext()
                r5 = 0
                if (r4 == 0) goto L_0x00b7
                java.lang.Object r4 = r11.next()
                java.lang.String r4 = (java.lang.String) r4
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$2 r6 = new ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository$Companion$invoke$2
                r6.<init>(r14, r4, r12, r5)
                r0.f7903a = r10
                r0.f7904b = r12
                r0.f7905c = r13
                r0.f7906d = r14
                r0.f7907e = r15
                r0.f7908f = r2
                r0.f7909g = r11
                r0.f7910h = r4
                r0.f7913k = r3
                java.lang.Object r5 = kotlinx.coroutines.C0738g.e(r13, r6, r0)
                if (r5 != r1) goto L_0x0099
                return r1
            L_0x0099:
                r7 = r5
                r5 = r10
                r10 = r4
                r4 = r2
                r2 = r0
                r0 = r7
            L_0x009f:
                kotlin.Pair r0 = (kotlin.Pair) r0
                java.lang.Object r6 = r0.component1()
                java.util.Set r6 = (java.util.Set) r6
                java.lang.Object r0 = r0.component2()
                java.util.Set r0 = (java.util.Set) r0
                r15.put(r10, r6)
                r4.put(r10, r0)
                r0 = r2
                r2 = r4
                r10 = r5
                goto L_0x006e
            L_0x00b7:
                ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository r11 = new ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository
                r11.<init>(r10, r15, r2, r5)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.resources.BlocklistDictionaryRepository.Companion.e(ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository, ch.icoaching.typewise.word_lists.c, kotlinx.coroutines.CoroutineDispatcher, java.util.List, ch.icoaching.typewise.config.CompanyConfig$b, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private BlocklistDictionaryRepository(IDictionaryRepository iDictionaryRepository, Map map, Map map2) {
        this.f7891a = iDictionaryRepository;
        this.f7892b = map;
        this.f7893c = map2;
    }

    public int e() {
        return this.f7891a.e();
    }

    public int f(String str) {
        o.e(str, "language");
        return this.f7891a.f(str);
    }

    public IDictionaryRepository.a g(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        if (this.f7892b.containsKey(str2)) {
            Object obj = this.f7892b.get(str2);
            o.b(obj);
            if (((Set) obj).contains(str)) {
                return new IDictionaryRepository.a(Boolean.FALSE, false, C0718m.j(), C0718m.j());
            }
        }
        return this.f7891a.g(str, str2);
    }

    public f h(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        if (this.f7892b.containsKey(str2)) {
            Object obj = this.f7892b.get(str2);
            o.b(obj);
            if (((Set) obj).contains(str)) {
                return null;
            }
        }
        return this.f7891a.h(str, str2);
    }

    public List i(String str, String str2, String str3, String str4, String str5) {
        o.e(str, "candidate");
        o.e(str2, "previousWord");
        o.e(str3, "language");
        List i4 = this.f7891a.i(str, str2, str3, str4, str5);
        if (!this.f7893c.containsKey(str3)) {
            return i4;
        }
        Object obj = this.f7893c.get(str3);
        o.b(obj);
        Set set = (Set) obj;
        ArrayList arrayList = new ArrayList();
        for (Object next : i4) {
            if (!set.contains(((e) next).d())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public e j(c cVar, String str, String str2) {
        o.e(cVar, "singleWord");
        o.e(str, "previousWord");
        o.e(str2, "language");
        if (!o.a(cVar.b(), cVar.e())) {
            if (this.f7893c.containsKey(str2)) {
                Object obj = this.f7893c.get(str2);
                o.b(obj);
                if (((Set) obj).contains(cVar.e())) {
                    return new e(cVar.b(), -2, 0, 0, cVar.e());
                }
            }
        } else if (this.f7893c.containsKey(str2)) {
            Object obj2 = this.f7893c.get(str2);
            o.b(obj2);
            if (((Set) obj2).contains(cVar.b())) {
                return new e(cVar.b(), -2, 0, 0, cVar.e());
            }
        }
        return this.f7891a.j(cVar, str, str2);
    }

    public e k(c cVar, String str) {
        o.e(cVar, "singleWord");
        o.e(str, "language");
        if (!o.a(cVar.b(), cVar.e())) {
            if (this.f7892b.containsKey(str)) {
                Object obj = this.f7892b.get(str);
                o.b(obj);
                if (((Set) obj).contains(cVar.e())) {
                    return new e(cVar.b(), -2, 0, 0, cVar.e());
                }
            }
        } else if (this.f7892b.containsKey(str)) {
            Object obj2 = this.f7892b.get(str);
            o.b(obj2);
            if (((Set) obj2).contains(cVar.b())) {
                return new e(cVar.b(), -2, 0, 0, cVar.e());
            }
        }
        return this.f7891a.k(cVar, str);
    }

    public int l(String str) {
        o.e(str, "language");
        return this.f7891a.l(str);
    }

    public boolean m(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        return !o(str, str2) && (g(str, str2).a() || n(str, str2).a());
    }

    public IDictionaryRepository.a n(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        if (this.f7892b.containsKey(str2)) {
            Object obj = this.f7892b.get(str2);
            o.b(obj);
            if (((Set) obj).contains(str)) {
                return new IDictionaryRepository.a(Boolean.FALSE, false, C0718m.j(), C0718m.j());
            }
        }
        return this.f7891a.n(str, str2);
    }

    public boolean o(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        if (this.f7892b.containsKey(str2)) {
            Object obj = this.f7892b.get(str2);
            o.b(obj);
            if (((Set) obj).contains(str)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ BlocklistDictionaryRepository(IDictionaryRepository iDictionaryRepository, Map map, Map map2, i iVar) {
        this(iDictionaryRepository, map, map2);
    }
}
