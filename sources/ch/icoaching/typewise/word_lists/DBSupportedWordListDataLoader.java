package ch.icoaching.typewise.word_lists;

import ch.icoaching.typewise.word_lists.WordListRepository;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import l2.g;
import u2.l;

public final class DBSupportedWordListDataLoader implements WordListRepository.b {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f8879a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8880b;

    /* renamed from: c  reason: collision with root package name */
    private b f8881c;

    /* renamed from: d  reason: collision with root package name */
    private b f8882d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final l f8883e;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8884a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
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
                ch.icoaching.typewise.word_lists.WordListKind r1 = ch.icoaching.typewise.word_lists.WordListKind.BLOCKLIST_FROM_LIST_OF_WORDS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f8884a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader.a.<clinit>():void");
        }
    }

    public DBSupportedWordListDataLoader(CoroutineDispatcher coroutineDispatcher, List list, b bVar, b bVar2, l lVar) {
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(list, "availableLanguages");
        o.e(bVar, "standardWordsDBWordListDataSource");
        o.e(bVar2, "additionalWordsDBWordListDataSource");
        o.e(lVar, "getBlocklistWords");
        this.f8879a = coroutineDispatcher;
        this.f8880b = list;
        this.f8881c = bVar;
        this.f8882d = bVar2;
        this.f8883e = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(ch.icoaching.typewise.word_lists.e r6, kotlin.coroutines.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$1 r0 = (ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$1) r0
            int r1 = r0.f8888d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8888d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$1 r0 = new ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8886b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8888d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.f8885a
            ch.icoaching.typewise.word_lists.e r6 = (ch.icoaching.typewise.word_lists.e) r6
            kotlin.f.b(r7)
            goto L_0x005f
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            kotlin.f.b(r7)
            ch.icoaching.typewise.word_lists.WordListKind r7 = r6.a()
            int[] r2 = ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader.a.f8884a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r3) goto L_0x008f
            r2 = 2
            if (r7 == r2) goto L_0x0087
            r2 = 3
            if (r7 != r2) goto L_0x0067
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.f8879a
            ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$wordToEntry$1 r2 = new ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader$loadWordList$wordToEntry$1
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f8885a = r6
            r0.f8888d = r3
            java.lang.Object r7 = kotlinx.coroutines.C0738g.e(r7, r2, r0)
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            java.util.Map r7 = (java.util.Map) r7
            ch.icoaching.typewise.word_lists.g r0 = new ch.icoaching.typewise.word_lists.g
            r0.<init>(r6, r7)
            goto L_0x0096
        L_0x0067:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            ch.icoaching.typewise.word_lists.WordListKind r6 = r6.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Word list kind '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "' not supported!"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0087:
            ch.icoaching.typewise.word_lists.a r0 = new ch.icoaching.typewise.word_lists.a
            ch.icoaching.typewise.word_lists.b r7 = r5.f8882d
            r0.<init>(r6, r7)
            goto L_0x0096
        L_0x008f:
            ch.icoaching.typewise.word_lists.a r0 = new ch.icoaching.typewise.word_lists.a
            ch.icoaching.typewise.word_lists.b r7 = r5.f8881c
            r0.<init>(r6, r7)
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader.a(ch.icoaching.typewise.word_lists.e, kotlin.coroutines.c):java.lang.Object");
    }

    public Object b(c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.f8880b) {
            WordListKind wordListKind = WordListKind.STANDARD;
            Pair a4 = g.a(wordListKind, C0718m.e(new e(str, "4.0", wordListKind)));
            WordListKind wordListKind2 = WordListKind.ADDITIONAL;
            Pair a5 = g.a(wordListKind2, C0718m.e(new e(str, "4.0", wordListKind2)));
            WordListKind wordListKind3 = WordListKind.BLOCKLIST_FROM_LIST_OF_WORDS;
            linkedHashMap.put(str, D.j(a4, a5, g.a(wordListKind3, C0718m.e(new e(str, "4.0", wordListKind3)))));
        }
        return linkedHashMap;
    }
}
