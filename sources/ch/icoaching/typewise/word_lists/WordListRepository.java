package ch.icoaching.typewise.word_lists;

import ch.icoaching.typewise.word_lists.e;
import ch.icoaching.typewise.word_lists.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import s0.C0892b;

public final class WordListRepository implements c {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f8894h = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private Map f8895a;

    /* renamed from: b  reason: collision with root package name */
    private final b f8896b;

    /* renamed from: c  reason: collision with root package name */
    private final a f8897c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f8898d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f8899e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f8900f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f8901g;

    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final List c(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                e.a aVar = e.f8944d;
                arrayList.add(new Pair(aVar.b(str), aVar.a(str)));
            }
            return arrayList;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: ch.icoaching.typewise.word_lists.WordListRepository$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[LOOP:0: B:16:0x0061->B:18:0x0067, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(ch.icoaching.typewise.word_lists.WordListRepository.b r5, ch.icoaching.typewise.word_lists.WordListRepository.a r6, kotlin.coroutines.c r7) {
            /*
                r4 = this;
                boolean r0 = r7 instanceof ch.icoaching.typewise.word_lists.WordListRepository$Companion$createInstance$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                ch.icoaching.typewise.word_lists.WordListRepository$Companion$createInstance$1 r0 = (ch.icoaching.typewise.word_lists.WordListRepository$Companion$createInstance$1) r0
                int r1 = r0.f8906e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8906e = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.word_lists.WordListRepository$Companion$createInstance$1 r0 = new ch.icoaching.typewise.word_lists.WordListRepository$Companion$createInstance$1
                r0.<init>(r4, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f8904c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f8906e
                r3 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r5 = r0.f8903b
                r6 = r5
                ch.icoaching.typewise.word_lists.WordListRepository$a r6 = (ch.icoaching.typewise.word_lists.WordListRepository.a) r6
                java.lang.Object r5 = r0.f8902a
                ch.icoaching.typewise.word_lists.WordListRepository$b r5 = (ch.icoaching.typewise.word_lists.WordListRepository.b) r5
                kotlin.f.b(r7)
                goto L_0x004a
            L_0x0032:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x003a:
                kotlin.f.b(r7)
                r0.f8902a = r5
                r0.f8903b = r6
                r0.f8906e = r3
                java.lang.Object r7 = r5.b(r0)
                if (r7 != r1) goto L_0x004a
                return r1
            L_0x004a:
                java.util.Map r7 = (java.util.Map) r7
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                int r1 = r7.size()
                int r1 = kotlin.collections.D.e(r1)
                r0.<init>(r1)
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x0061:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L_0x007f
                java.lang.Object r1 = r7.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                java.util.Map r1 = (java.util.Map) r1
                java.util.Map r1 = kotlin.collections.D.s(r1)
                r0.put(r2, r1)
                goto L_0x0061
            L_0x007f:
                ch.icoaching.typewise.word_lists.WordListRepository r7 = new ch.icoaching.typewise.word_lists.WordListRepository
                r1 = 0
                r7.<init>(r0, r5, r6, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.WordListRepository.Companion.b(ch.icoaching.typewise.word_lists.WordListRepository$b, ch.icoaching.typewise.word_lists.WordListRepository$a, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public interface a {
        Object a(String str, WordListKind wordListKind, kotlin.coroutines.c cVar);
    }

    public interface b {
        Object a(e eVar, kotlin.coroutines.c cVar);

        Object b(kotlin.coroutines.c cVar);
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8907a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ch.icoaching.typewise.word_lists.WordListKind[] r0 = ch.icoaching.typewise.word_lists.WordListKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.STANDARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.ADDITIONAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED_WITHOUT_COMPANY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED_WITHOUT_STANDARD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f8907a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.WordListRepository.c.<clinit>():void");
        }
    }

    private WordListRepository(Map map, b bVar, a aVar) {
        this.f8895a = map;
        this.f8896b = bVar;
        this.f8897c = aVar;
        this.f8898d = new LinkedHashMap();
        this.f8899e = new LinkedHashMap();
        this.f8900f = new LinkedHashMap();
        this.f8901g = new LinkedHashMap();
    }

    private final Map f() {
        return this.f8899e;
    }

    private final List g(List list) {
        List list2;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                WordListKind wordListKind = (WordListKind) pair.component2();
                Map map = (Map) this.f8895a.get((String) pair.component1());
                if (map != null) {
                    list2 = (List) map.get(wordListKind);
                    if (list2 != null) {
                        C0718m.z(arrayList, list2);
                    }
                }
                list2 = C0718m.j();
                C0718m.z(arrayList, list2);
            }
            return arrayList;
        } catch (NoSuchElementException e4) {
            ch.icoaching.typewise.e eVar = ch.icoaching.typewise.e.f8233a;
            Map map2 = this.f8895a;
            ch.icoaching.typewise.e.d(eVar, "WordListRepository", "Wordlist not found: " + list + ". Available wordlists: " + map2, (Throwable) null, 4, (Object) null);
            throw e4;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.util.List r7, kotlin.coroutines.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ch.icoaching.typewise.word_lists.WordListRepository$loadWordListFromDisk$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ch.icoaching.typewise.word_lists.WordListRepository$loadWordListFromDisk$1 r0 = (ch.icoaching.typewise.word_lists.WordListRepository$loadWordListFromDisk$1) r0
            int r1 = r0.f8929g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8929g = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.word_lists.WordListRepository$loadWordListFromDisk$1 r0 = new ch.icoaching.typewise.word_lists.WordListRepository$loadWordListFromDisk$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f8927e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8929g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r7 = r0.f8926d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r0.f8925c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f8924b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f8923a
            ch.icoaching.typewise.word_lists.WordListRepository r5 = (ch.icoaching.typewise.word_lists.WordListRepository) r5
            kotlin.f.b(r8)
            goto L_0x0092
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            kotlin.f.b(r8)
            goto L_0x0063
        L_0x0048:
            kotlin.f.b(r8)
            int r8 = r7.size()
            if (r8 != r4) goto L_0x0064
            ch.icoaching.typewise.word_lists.WordListRepository$b r8 = r6.f8896b
            r2 = 0
            java.lang.Object r7 = r7.get(r2)
            ch.icoaching.typewise.word_lists.e r7 = (ch.icoaching.typewise.word_lists.e) r7
            r0.f8929g = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r6
            r2 = r7
            r7 = r8
        L_0x0070:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0097
            java.lang.Object r8 = r2.next()
            ch.icoaching.typewise.word_lists.e r8 = (ch.icoaching.typewise.word_lists.e) r8
            java.util.List r8 = kotlin.collections.C0718m.e(r8)
            r0.f8923a = r5
            r0.f8924b = r7
            r0.f8925c = r2
            r0.f8926d = r7
            r0.f8929g = r3
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r4 = r7
        L_0x0092:
            r7.add(r8)
            r7 = r4
            goto L_0x0070
        L_0x0097:
            ch.icoaching.typewise.word_lists.f$a r8 = ch.icoaching.typewise.word_lists.f.f8948b
            ch.icoaching.typewise.word_lists.f r7 = r8.a(r7)
            ch.icoaching.typewise.e r0 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "loadWordListFromDisk() :: Created combined wordlist: "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r2 = r8.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "WordListRepository"
            r3 = 0
            ch.icoaching.typewise.e.b(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.WordListRepository.j(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    private final void m(Map map) {
        Map map2;
        this.f8899e.clear();
        this.f8899e.putAll(map);
        for (String str : this.f8895a.keySet()) {
            Map map3 = (Map) this.f8895a.get(str);
            if (map3 != null) {
                WordListKind wordListKind = WordListKind.COMBINED;
                if (map3.containsKey(wordListKind) && (map2 = (Map) this.f8895a.get(str)) != null) {
                    List list = (List) map2.remove(wordListKind);
                }
            }
        }
        ch.icoaching.typewise.e eVar = ch.icoaching.typewise.e.f8233a;
        Map f4 = f();
        ch.icoaching.typewise.e.b(eVar, "WordListRepository", "companySpecificWordLists:: Set company specific word lists to " + f4, (Throwable) null, 4, (Object) null);
    }

    private final void n(C0892b.d dVar) {
        Map c4 = dVar.c();
        Map b4 = dVar.b();
        if (c4 == null || c4.isEmpty() || b4 == null || b4.isEmpty()) {
            if (c4 != null) {
                l(c4);
            }
            if (b4 != null) {
                k(b4);
                return;
            }
            return;
        }
        throw new Exception("Please use only one of blocklist_from_wordlist_names and blocklist_from_list_of_words");
    }

    private final void o(C0892b.d dVar) {
        Map d4 = dVar.d();
        if (d4 == null) {
            d4 = D.h();
        }
        m(d4);
    }

    public Object a(List list, kotlin.coroutines.c cVar) {
        return h(g(f8894h.c(list)), cVar);
    }

    public Object b(String str, kotlin.coroutines.c cVar) {
        List list = (List) this.f8900f.get(str);
        if (list != null) {
            return h(list, cVar);
        }
        e eVar = new e(str, "0.0", WordListKind.BLOCKLIST_FROM_LIST_OF_WORDS);
        List e4 = C0718m.e(eVar);
        this.f8898d.put(e4, g.a.a(g.f8950c, C0718m.j(), eVar, (d) null, 4, (Object) null));
        return h(e4, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r12, kotlin.coroutines.c r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r13 instanceof ch.icoaching.typewise.word_lists.WordListRepository$getNamesAndSurnamesSetByLanguage$1
            if (r2 == 0) goto L_0x0015
            r2 = r13
            ch.icoaching.typewise.word_lists.WordListRepository$getNamesAndSurnamesSetByLanguage$1 r2 = (ch.icoaching.typewise.word_lists.WordListRepository$getNamesAndSurnamesSetByLanguage$1) r2
            int r3 = r2.f8915h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0015
            int r3 = r3 - r4
            r2.f8915h = r3
            goto L_0x001a
        L_0x0015:
            ch.icoaching.typewise.word_lists.WordListRepository$getNamesAndSurnamesSetByLanguage$1 r2 = new ch.icoaching.typewise.word_lists.WordListRepository$getNamesAndSurnamesSetByLanguage$1
            r2.<init>(r11, r13)
        L_0x001a:
            java.lang.Object r13 = r2.f8913f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8915h
            if (r4 == 0) goto L_0x0062
            if (r4 == r0) goto L_0x0045
            if (r4 != r1) goto L_0x003d
            java.lang.Object r12 = r2.f8911d
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r4 = r2.f8910c
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r5 = r2.f8909b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.f8908a
            ch.icoaching.typewise.word_lists.WordListRepository r6 = (ch.icoaching.typewise.word_lists.WordListRepository) r6
            kotlin.f.b(r13)
            goto L_0x00da
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0045:
            java.lang.Object r12 = r2.f8912e
            ch.icoaching.typewise.word_lists.WordListKind r12 = (ch.icoaching.typewise.word_lists.WordListKind) r12
            java.lang.Object r4 = r2.f8911d
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r2.f8910c
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r2.f8909b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.f8908a
            ch.icoaching.typewise.word_lists.WordListRepository r7 = (ch.icoaching.typewise.word_lists.WordListRepository) r7
            kotlin.f.b(r13)
            r9 = r6
            r6 = r12
            r12 = r4
            r4 = r5
            r5 = r9
            goto L_0x00ad
        L_0x0062:
            kotlin.f.b(r13)
            java.util.Map r13 = r11.f8901g
            boolean r13 = r13.containsKey(r12)
            if (r13 != 0) goto L_0x00f1
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            ch.icoaching.typewise.word_lists.WordListKind[] r4 = new ch.icoaching.typewise.word_lists.WordListKind[r1]
            ch.icoaching.typewise.word_lists.WordListKind r5 = ch.icoaching.typewise.word_lists.WordListKind.NAMES
            r6 = 0
            r4[r6] = r5
            ch.icoaching.typewise.word_lists.WordListKind r5 = ch.icoaching.typewise.word_lists.WordListKind.SURNAMES
            r4[r0] = r5
            java.util.List r4 = kotlin.collections.C0718m.m(r4)
            java.util.Iterator r4 = r4.iterator()
            r5 = r11
        L_0x0086:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00eb
            java.lang.Object r6 = r4.next()
            ch.icoaching.typewise.word_lists.WordListKind r6 = (ch.icoaching.typewise.word_lists.WordListKind) r6
            ch.icoaching.typewise.word_lists.WordListRepository$a r7 = r5.f8897c
            r2.f8908a = r5
            r2.f8909b = r12
            r2.f8910c = r13
            r2.f8911d = r4
            r2.f8912e = r6
            r2.f8915h = r0
            java.lang.Object r7 = r7.a(r12, r6, r2)
            if (r7 != r3) goto L_0x00a7
            return r3
        L_0x00a7:
            r9 = r5
            r5 = r12
            r12 = r4
            r4 = r13
            r13 = r7
            r7 = r9
        L_0x00ad:
            ch.icoaching.typewise.word_lists.WordList r13 = (ch.icoaching.typewise.word_lists.WordList) r13
            if (r13 == 0) goto L_0x00c1
            java.util.Set r13 = r13.n()
            if (r13 != 0) goto L_0x00b8
            goto L_0x00c1
        L_0x00b8:
            r6 = r7
        L_0x00b9:
            r9 = r5
            r5 = r12
            r12 = r9
            r10 = r2
            r2 = r13
            r13 = r4
            r4 = r10
            goto L_0x00e4
        L_0x00c1:
            ch.icoaching.typewise.word_lists.WordListRepository$a r13 = r7.f8897c
            r2.f8908a = r7
            r2.f8909b = r5
            r2.f8910c = r4
            r2.f8911d = r12
            r8 = 0
            r2.f8912e = r8
            r2.f8915h = r1
            java.lang.String r8 = "all"
            java.lang.Object r13 = r13.a(r8, r6, r2)
            if (r13 != r3) goto L_0x00d9
            return r3
        L_0x00d9:
            r6 = r7
        L_0x00da:
            kotlin.jvm.internal.o.b(r13)
            ch.icoaching.typewise.word_lists.WordList r13 = (ch.icoaching.typewise.word_lists.WordList) r13
            java.util.Set r13 = r13.n()
            goto L_0x00b9
        L_0x00e4:
            r13.addAll(r2)
            r2 = r4
            r4 = r5
            r5 = r6
            goto L_0x0086
        L_0x00eb:
            java.util.Map r0 = r5.f8901g
            r0.put(r12, r13)
            goto L_0x00f2
        L_0x00f1:
            r5 = r11
        L_0x00f2:
            java.util.Map r13 = r5.f8901g
            java.lang.Object r12 = r13.get(r12)
            java.util.Set r12 = (java.util.Set) r12
            if (r12 != 0) goto L_0x0100
            java.util.Set r12 = kotlin.collections.L.e()
        L_0x0100:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.WordListRepository.c(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public Object d(String str, WordListKind wordListKind, kotlin.coroutines.c cVar) {
        List i4 = i(str, wordListKind);
        Map map = (Map) this.f8895a.get(str);
        if (map != null) {
            map.put(wordListKind, i4);
        }
        return h(i4, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(java.util.List r5, kotlin.coroutines.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ch.icoaching.typewise.word_lists.WordListRepository$getWordListByInfos$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.typewise.word_lists.WordListRepository$getWordListByInfos$1 r0 = (ch.icoaching.typewise.word_lists.WordListRepository$getWordListByInfos$1) r0
            int r1 = r0.f8922g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8922g = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.word_lists.WordListRepository$getWordListByInfos$1 r0 = new ch.icoaching.typewise.word_lists.WordListRepository$getWordListByInfos$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8920e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8922g
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r5 = r0.f8919d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r0.f8918c
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r0.f8917b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.f8916a
            ch.icoaching.typewise.word_lists.WordListRepository r0 = (ch.icoaching.typewise.word_lists.WordListRepository) r0
            kotlin.f.b(r6)
            goto L_0x0063
        L_0x0039:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0041:
            kotlin.f.b(r6)
            java.util.Map r6 = r4.f8898d
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L_0x0068
            java.util.Map r6 = r4.f8898d
            r0.f8916a = r4
            r0.f8917b = r5
            r0.f8918c = r6
            r0.f8919d = r5
            r0.f8922g = r3
            java.lang.Object r0 = r4.j(r5, r0)
            if (r0 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r2 = r5
            r1 = r6
            r6 = r0
            r0 = r4
        L_0x0063:
            r1.put(r5, r6)
            r5 = r2
            goto L_0x0069
        L_0x0068:
            r0 = r4
        L_0x0069:
            java.util.Map r6 = r0.f8898d
            java.lang.Object r5 = r6.get(r5)
            kotlin.jvm.internal.o.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.WordListRepository.h(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r4 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r4 == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List i(java.lang.String r4, ch.icoaching.typewise.word_lists.WordListKind r5) {
        /*
            r3 = this;
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r4, r0)
            java.lang.String r0 = "wordlistType"
            kotlin.jvm.internal.o.e(r5, r0)
            java.util.Map r0 = r3.f8895a
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x001f
            return r0
        L_0x001f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int[] r1 = ch.icoaching.typewise.word_lists.WordListRepository.c.f8907a
            int r2 = r5.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x00b6
            r2 = 2
            if (r1 == r2) goto L_0x00ae
            r2 = 3
            if (r1 == r2) goto L_0x0099
            r2 = 4
            if (r1 == r2) goto L_0x006b
            r2 = 5
            if (r1 != r2) goto L_0x0054
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.ADDITIONAL
            r5.<init>(r4, r1)
            r0.add(r5)
            ch.icoaching.typewise.word_lists.WordListRepository$Companion r5 = f8894h
            java.util.Map r1 = r3.f()
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0054:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unrecognized wordlist_type "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L_0x006b:
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.STANDARD
            r5.<init>(r4, r1)
            r0.add(r5)
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.ADDITIONAL
            r5.<init>(r4, r1)
            r0.add(r5)
            ch.icoaching.typewise.word_lists.WordListRepository$Companion r5 = f8894h
            java.util.Map r1 = r3.f()
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0091
        L_0x008d:
            java.util.List r4 = kotlin.collections.C0718m.j()
        L_0x0091:
            java.util.List r4 = r5.c(r4)
            r0.addAll(r4)
            goto L_0x00be
        L_0x0099:
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.STANDARD
            r5.<init>(r4, r1)
            r0.add(r5)
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.ADDITIONAL
            r5.<init>(r4, r1)
        L_0x00aa:
            r0.add(r5)
            goto L_0x00be
        L_0x00ae:
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.ADDITIONAL
            r5.<init>(r4, r1)
            goto L_0x00aa
        L_0x00b6:
            kotlin.Pair r5 = new kotlin.Pair
            ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.STANDARD
            r5.<init>(r4, r1)
            goto L_0x00aa
        L_0x00be:
            java.util.List r4 = r3.g(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.WordListRepository.i(java.lang.String, ch.icoaching.typewise.word_lists.WordListKind):java.util.List");
    }

    public final void k(Map map) {
        o.e(map, "blocklists");
        ch.icoaching.typewise.e eVar = ch.icoaching.typewise.e.f8233a;
        ch.icoaching.typewise.e.b(eVar, "WordListRepository", "setBlocklistFromListOfWords() :: Setting blocklist from list of words to " + map, (Throwable) null, 4, (Object) null);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            e eVar2 = new e(str, "0.0", WordListKind.BLOCKLIST_FROM_LIST_OF_WORDS);
            this.f8898d.put(C0718m.e(eVar2), g.a.a(g.f8950c, (List) entry.getValue(), eVar2, (d) null, 4, (Object) null));
            this.f8900f.put(str, C0718m.e(eVar2));
        }
    }

    public final void l(Map map) {
        o.e(map, "blocklistNames");
        ch.icoaching.typewise.e eVar = ch.icoaching.typewise.e.f8233a;
        ch.icoaching.typewise.e.b(eVar, "WordListRepository", "setBlocklistFromWordListNames() :: Setting blocklist from wordlist names to " + map, (Throwable) null, 4, (Object) null);
        for (Map.Entry entry : map.entrySet()) {
            List a4 = f8894h.c((List) entry.getValue());
            this.f8900f.put((String) entry.getKey(), g(a4));
        }
    }

    public final void p(C0892b.d dVar) {
        o.e(dVar, "wordListsSettings");
        o(dVar);
        n(dVar);
    }

    public /* synthetic */ WordListRepository(Map map, b bVar, a aVar, i iVar) {
        this(map, bVar, aVar);
    }
}
