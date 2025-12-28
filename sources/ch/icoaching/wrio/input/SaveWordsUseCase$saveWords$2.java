package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2", f = "SaveWordsUseCase.kt", l = {51, 81, 96, 108, 119, 131, 163}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class SaveWordsUseCase$saveWords$2 extends SuspendLambda implements p {
    final /* synthetic */ String $currentText;
    final /* synthetic */ String $dominantLanguage;
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ SaveWordsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveWordsUseCase$saveWords$2(SaveWordsUseCase saveWordsUseCase, String str, String str2, c<? super SaveWordsUseCase$saveWords$2> cVar) {
        super(2, cVar);
        this.this$0 = saveWordsUseCase;
        this.$currentText = str;
        this.$dominantLanguage = str2;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new SaveWordsUseCase$saveWords$2(this.this$0, this.$currentText, this.$dominantLanguage, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e1, code lost:
        r2 = ((java.lang.Number) r2).intValue();
        r0.this$0.f9754e.d();
        r3 = r0.this$0.f9754e;
        r4 = r0.$currentText.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.d(r4, "toLowerCase(...)");
        r3 = r3.n(r4);
        r4 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0112, code lost:
        if (r3.hasNext() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0114, code lost:
        r5 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011f, code lost:
        if (((java.lang.String) r5).length() <= 0) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0121, code lost:
        r4.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0125, code lost:
        r3 = new java.util.HashMap();
        r3.put("", kotlin.coroutines.jvm.internal.a.e(-1));
        r5 = new java.util.HashMap();
        r9 = new kotlin.text.Regex("^[a-zA-Z'\\-]+$");
        r10 = java.lang.System.currentTimeMillis();
        r35 = r3;
        r3 = r2;
        r2 = r9;
        r9 = r5;
        r5 = r4.iterator();
        r4 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0155, code lost:
        if (r5.hasNext() == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0157, code lost:
        r13 = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.d(r13, "getDefault(...)");
        r12 = ((java.lang.String) r5.next()).toLowerCase(r13);
        kotlin.jvm.internal.o.d(r12, "toLowerCase(...)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0177, code lost:
        if (r2.matches(ch.icoaching.wrio.keyboard.DiacriticsStore.f9950j.a(r12)) != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x017a, code lost:
        r13 = r0.this$0.f9752c;
        r14 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$wordId$1(r0.this$0, r12, r0.$dominantLanguage, r8);
        r0.L$0 = r4;
        r0.L$1 = r9;
        r0.L$2 = r2;
        r0.L$3 = r5;
        r0.L$4 = r12;
        r0.I$0 = r3;
        r0.J$0 = r10;
        r0.label = 2;
        r7 = kotlinx.coroutines.C0738g.e(r13, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x019e, code lost:
        if (r7 != r1) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01a0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01a1, code lost:
        r13 = r2;
        r2 = r3;
        r15 = r4;
        r14 = r9;
        r9 = r10;
        r11 = r12;
        r12 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01a8, code lost:
        r3 = ((java.lang.Number) r7).longValue();
        r26 = r0.this$0.f9754e.g(r11, 0);
        r27 = r0.this$0.f9754e.o(r11, 0);
        r28 = r0.this$0.f9754e.k(r11, 0);
        r29 = r0.this$0.f9754e.v(r11, 0);
        r30 = r0.this$0.f9754e.p(r11, 0);
        r31 = r0.this$0.f9754e.u(r11, 0);
        r32 = r0.this$0.f9754e.q(r11, 0);
        r33 = r0.this$0.f9754e.c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0203, code lost:
        if (r3 <= -1) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0205, code lost:
        r5 = r0.this$0.f9752c;
        r20 = r0.this$0;
        r21 = r11;
        r22 = r2;
        r23 = r9;
        r25 = r26;
        r26 = r27;
        r27 = r28;
        r28 = r29;
        r29 = r30;
        r30 = r31;
        r31 = r32;
        r32 = r33;
        r19 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass1((kotlin.coroutines.c<? super ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass1>) null);
        r0.L$0 = r15;
        r0.L$1 = r14;
        r0.L$2 = r13;
        r0.L$3 = r12;
        r0.L$4 = r11;
        r0.I$0 = r2;
        r0.J$0 = r9;
        r0.J$1 = r3;
        r0.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0247, code lost:
        if (kotlinx.coroutines.C0738g.e(r5, r19, r0) != r1) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0249, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x024a, code lost:
        r35 = r13;
        r13 = r11;
        r36 = r14;
        r14 = r12;
        r11 = r9;
        r9 = r3;
        r3 = r36;
        r4 = r15;
        r15 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0257, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x025a, code lost:
        r5 = true;
        r0.this$0.f9756g.c(true);
        r3 = ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker.f9584o;
        r4 = androidx.work.WorkManager.g(r0.this$0.f9750a);
        kotlin.jvm.internal.o.d(r4, "getInstance(...)");
        r3.a(r4);
        r3 = r0.this$0.f9752c;
        r20 = r0.this$0;
        r21 = r11;
        r22 = r2;
        r23 = r0.$dominantLanguage;
        r24 = r9;
        r19 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass2((kotlin.coroutines.c<? super ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass2>) null);
        r0.L$0 = r15;
        r0.L$1 = r14;
        r0.L$2 = r13;
        r0.L$3 = r12;
        r0.L$4 = r11;
        r0.I$0 = r2;
        r0.J$0 = r9;
        r0.label = 4;
        r3 = kotlinx.coroutines.C0738g.e(r3, r19, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02aa, code lost:
        if (r3 != r1) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02ac, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02ad, code lost:
        r3 = ((java.lang.Number) r3).longValue();
        r14.put(r11, kotlin.coroutines.jvm.internal.a.e(r3));
        r35 = r13;
        r13 = r11;
        r36 = r14;
        r14 = r12;
        r11 = r9;
        r9 = r3;
        r3 = r36;
        r4 = r15;
        r15 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02c7, code lost:
        r4.put(r13, kotlin.coroutines.jvm.internal.a.e(r9));
        r7 = r0.this$0.f9752c;
        r9 = r0.this$0;
        r8 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass3((kotlin.coroutines.c<? super ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass3>) null);
        r0.L$0 = r4;
        r0.L$1 = r3;
        r0.L$2 = r15;
        r0.L$3 = r14;
        r0.L$4 = null;
        r0.I$0 = r2;
        r0.J$0 = r11;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x02f1, code lost:
        if (kotlinx.coroutines.C0738g.e(r7, r8, r0) != r1) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x02f3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x02f4, code lost:
        r9 = r3;
        r10 = r11;
        r3 = r2;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x02f8, code lost:
        r7 = r5;
        r5 = r14;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0301, code lost:
        if (r9.isEmpty() != false) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0303, code lost:
        r3 = new java.util.ArrayList(r9.size());
        r5 = r9.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0318, code lost:
        if (r5.hasNext() == false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x031a, code lost:
        r6 = (java.util.Map.Entry) r5.next();
        r3.add(l2.g.a((java.lang.String) r6.getKey(), kotlin.coroutines.jvm.internal.a.d((int) ((java.lang.Number) r6.getValue()).longValue())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x033d, code lost:
        r3 = kotlin.collections.D.o(r3);
        r5 = r0.this$0.f9752c;
        r7 = r0.this$0;
        r6 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass4((kotlin.coroutines.c<? super ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass4>) null);
        r0.L$0 = r4;
        r0.L$1 = r2;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.J$0 = r10;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0360, code lost:
        if (kotlinx.coroutines.C0738g.e(r5, r6, r0) != r1) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0362, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0363, code lost:
        r6 = r4;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0365, code lost:
        r3 = r0.this$0.f9754e.b().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0377, code lost:
        if (r3.hasNext() == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0379, code lost:
        r7 = (java.lang.String) r3.next();
        r8 = ch.icoaching.wrio.keyboard.DiacriticsStore.f9950j.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0389, code lost:
        if (r2.matches(r8) == false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0390, code lost:
        if (r8.length() >= 2) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0393, code lost:
        r6.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0397, code lost:
        r35 = r4;
        r4 = r0.this$0.f9754e.a().iterator();
        r2 = r35;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x03af, code lost:
        if (r4.hasNext() == false) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x03b1, code lost:
        r6 = (java.util.Map.Entry) r4.next();
        r7 = (ch.icoaching.wrio.util.Pair) r6.getKey();
        r13 = ((java.lang.Number) r6.getValue()).intValue();
        r6 = r7.second;
        kotlin.jvm.internal.o.d(r6, "second");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x03d4, code lost:
        if (((java.lang.CharSequence) r6).length() != 0) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x03d6, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x03df, code lost:
        if (r5.containsKey(r7.first) == false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x03e7, code lost:
        if (r5.containsKey(r7.second) != false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x03ea, code lost:
        r6 = r5.get(r7.first);
        kotlin.jvm.internal.o.b(r6);
        r9 = ((java.lang.Number) r6).longValue();
        r6 = r5.get(r7.second);
        kotlin.jvm.internal.o.b(r6);
        r11 = ((java.lang.Number) r6).longValue();
        r6 = r0.this$0.f9752c;
        r8 = r0.this$0;
        r17 = r1;
        r1 = r7;
        r14 = r2;
        r7 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass5((kotlin.coroutines.c<? super ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.AnonymousClass5>) null);
        r0.L$0 = r5;
        r0.L$1 = r4;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.J$0 = r2;
        r0.label = 7;
        r1 = kotlinx.coroutines.C0738g.e(r6, r1, r0);
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0430, code lost:
        if (r1 != r6) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0432, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0433, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0436, code lost:
        r0.this$0.f9754e.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0441, code lost:
        return l2.q.f14567a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            r37 = this;
            r0 = r37
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            java.lang.String r6 = "toLowerCase(...)"
            r7 = 1
            r8 = 0
            switch(r2) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x00c0;
                case 2: goto L_0x009a;
                case 3: goto L_0x0079;
                case 4: goto L_0x0057;
                case 5: goto L_0x0035;
                case 6: goto L_0x0026;
                case 7: goto L_0x0017;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0017:
            long r2 = r0.J$0
            java.lang.Object r4 = r0.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$0
            java.util.Map r5 = (java.util.Map) r5
            kotlin.f.b(r38)
            goto L_0x03ab
        L_0x0026:
            long r4 = r0.J$0
            java.lang.Object r2 = r0.L$1
            kotlin.text.Regex r2 = (kotlin.text.Regex) r2
            java.lang.Object r6 = r0.L$0
            java.util.Map r6 = (java.util.Map) r6
            kotlin.f.b(r38)
            goto L_0x0365
        L_0x0035:
            long r9 = r0.J$0
            int r2 = r0.I$0
            java.lang.Object r11 = r0.L$3
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.L$2
            kotlin.text.Regex r12 = (kotlin.text.Regex) r12
            java.lang.Object r13 = r0.L$1
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r0.L$0
            java.util.Map r14 = (java.util.Map) r14
            kotlin.f.b(r38)
            r3 = r2
            r5 = r7
            r2 = r12
            r4 = r14
            r17 = -1
            r14 = r11
            r10 = r9
            r9 = r13
            goto L_0x02f8
        L_0x0057:
            long r9 = r0.J$0
            int r2 = r0.I$0
            java.lang.Object r11 = r0.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.L$3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r0.L$2
            kotlin.text.Regex r13 = (kotlin.text.Regex) r13
            java.lang.Object r14 = r0.L$1
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r15 = r0.L$0
            java.util.Map r15 = (java.util.Map) r15
            kotlin.f.b(r38)
            r3 = r38
            r5 = r7
            r17 = -1
            goto L_0x02ad
        L_0x0079:
            long r9 = r0.J$1
            long r11 = r0.J$0
            int r2 = r0.I$0
            java.lang.Object r13 = r0.L$4
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.L$3
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r0.L$2
            kotlin.text.Regex r15 = (kotlin.text.Regex) r15
            java.lang.Object r3 = r0.L$1
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r0.L$0
            java.util.Map r4 = (java.util.Map) r4
            kotlin.f.b(r38)
            r17 = -1
            goto L_0x0257
        L_0x009a:
            long r2 = r0.J$0
            int r4 = r0.I$0
            java.lang.Object r5 = r0.L$4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r0.L$3
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.L$2
            kotlin.text.Regex r10 = (kotlin.text.Regex) r10
            java.lang.Object r11 = r0.L$1
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r0.L$0
            java.util.Map r12 = (java.util.Map) r12
            kotlin.f.b(r38)
            r7 = r38
            r13 = r10
            r14 = r11
            r15 = r12
            r11 = r5
            r12 = r9
            r9 = r2
            r2 = r4
            goto L_0x01a8
        L_0x00c0:
            kotlin.f.b(r38)
            r2 = r38
            goto L_0x00e1
        L_0x00c6:
            kotlin.f.b(r38)
            ch.icoaching.wrio.input.SaveWordsUseCase r2 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r2 = r2.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$dominantLanguageId$1 r3 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$dominantLanguageId$1
            ch.icoaching.wrio.input.SaveWordsUseCase r4 = r0.this$0
            java.lang.String r5 = r0.$dominantLanguage
            r3.<init>(r4, r5, r8)
            r0.label = r7
            java.lang.Object r2 = kotlinx.coroutines.C0738g.e(r2, r3, r0)
            if (r2 != r1) goto L_0x00e1
            return r1
        L_0x00e1:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            ch.icoaching.wrio.input.SaveWordsUseCase r3 = r0.this$0
            ch.icoaching.wrio.input.i r3 = r3.f9754e
            r3.d()
            ch.icoaching.wrio.input.SaveWordsUseCase r3 = r0.this$0
            ch.icoaching.wrio.input.i r3 = r3.f9754e
            java.lang.String r4 = r0.$currentText
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            kotlin.jvm.internal.o.d(r4, r6)
            java.util.Set r3 = r3.n(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x010e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0125
            java.lang.Object r5 = r3.next()
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x010e
            r4.add(r5)
            goto L_0x010e
        L_0x0125:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r9 = -1
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.a.e(r9)
            java.lang.String r9 = ""
            r3.put(r9, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            kotlin.text.Regex r9 = new kotlin.text.Regex
            java.lang.String r10 = "^[a-zA-Z'\\-]+$"
            r9.<init>((java.lang.String) r10)
            long r10 = java.lang.System.currentTimeMillis()
            java.util.Iterator r4 = r4.iterator()
            r35 = r3
            r3 = r2
            r2 = r9
            r9 = r5
            r5 = r4
            r4 = r35
        L_0x0151:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x02fd
            java.lang.Object r12 = r5.next()
            java.lang.String r12 = (java.lang.String) r12
            java.util.Locale r13 = java.util.Locale.getDefault()
            java.lang.String r14 = "getDefault(...)"
            kotlin.jvm.internal.o.d(r13, r14)
            java.lang.String r12 = r12.toLowerCase(r13)
            kotlin.jvm.internal.o.d(r12, r6)
            ch.icoaching.wrio.keyboard.DiacriticsStore$a r13 = ch.icoaching.wrio.keyboard.DiacriticsStore.f9950j
            java.lang.String r13 = r13.a(r12)
            boolean r13 = r2.matches(r13)
            if (r13 != 0) goto L_0x017a
            goto L_0x0151
        L_0x017a:
            ch.icoaching.wrio.input.SaveWordsUseCase r13 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r13 = r13.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$wordId$1 r14 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$wordId$1
            ch.icoaching.wrio.input.SaveWordsUseCase r15 = r0.this$0
            java.lang.String r7 = r0.$dominantLanguage
            r14.<init>(r15, r12, r7, r8)
            r0.L$0 = r4
            r0.L$1 = r9
            r0.L$2 = r2
            r0.L$3 = r5
            r0.L$4 = r12
            r0.I$0 = r3
            r0.J$0 = r10
            r7 = 2
            r0.label = r7
            java.lang.Object r7 = kotlinx.coroutines.C0738g.e(r13, r14, r0)
            if (r7 != r1) goto L_0x01a1
            return r1
        L_0x01a1:
            r13 = r2
            r2 = r3
            r15 = r4
            r14 = r9
            r9 = r10
            r11 = r12
            r12 = r5
        L_0x01a8:
            java.lang.Number r7 = (java.lang.Number) r7
            long r3 = r7.longValue()
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            r7 = 0
            int r26 = r5.g(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            int r27 = r5.o(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            int r28 = r5.k(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            int r29 = r5.v(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            int r30 = r5.p(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            int r31 = r5.u(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            int r32 = r5.q(r11, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            ch.icoaching.wrio.input.i r5 = r5.f9754e
            java.lang.String r33 = r5.c(r11)
            r17 = -1
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x025a
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r5 = r5.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$1 r7 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$1
            ch.icoaching.wrio.input.SaveWordsUseCase r8 = r0.this$0
            r34 = 0
            r19 = r7
            r20 = r8
            r21 = r11
            r22 = r2
            r23 = r9
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.L$0 = r15
            r0.L$1 = r14
            r0.L$2 = r13
            r0.L$3 = r12
            r0.L$4 = r11
            r0.I$0 = r2
            r0.J$0 = r9
            r0.J$1 = r3
            r8 = 3
            r0.label = r8
            java.lang.Object r5 = kotlinx.coroutines.C0738g.e(r5, r7, r0)
            if (r5 != r1) goto L_0x024a
            return r1
        L_0x024a:
            r35 = r13
            r13 = r11
            r36 = r14
            r14 = r12
            r11 = r9
            r9 = r3
            r3 = r36
            r4 = r15
            r15 = r35
        L_0x0257:
            r5 = 1
            goto L_0x02c7
        L_0x025a:
            ch.icoaching.wrio.input.SaveWordsUseCase r3 = r0.this$0
            ch.icoaching.wrio.data.h r3 = r3.f9756g
            r5 = 1
            r3.c(r5)
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$a r3 = ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker.f9584o
            ch.icoaching.wrio.input.SaveWordsUseCase r4 = r0.this$0
            android.content.Context r4 = r4.f9750a
            androidx.work.WorkManager r4 = androidx.work.WorkManager.g(r4)
            java.lang.String r7 = "getInstance(...)"
            kotlin.jvm.internal.o.d(r4, r7)
            r3.a(r4)
            ch.icoaching.wrio.input.SaveWordsUseCase r3 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r3 = r3.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$2 r4 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$2
            ch.icoaching.wrio.input.SaveWordsUseCase r7 = r0.this$0
            java.lang.String r8 = r0.$dominantLanguage
            r34 = 0
            r19 = r4
            r20 = r7
            r21 = r11
            r22 = r2
            r23 = r8
            r24 = r9
            r19.<init>(r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.L$0 = r15
            r0.L$1 = r14
            r0.L$2 = r13
            r0.L$3 = r12
            r0.L$4 = r11
            r0.I$0 = r2
            r0.J$0 = r9
            r7 = 4
            r0.label = r7
            java.lang.Object r3 = kotlinx.coroutines.C0738g.e(r3, r4, r0)
            if (r3 != r1) goto L_0x02ad
            return r1
        L_0x02ad:
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.a.e(r3)
            r14.put(r11, r7)
            r35 = r13
            r13 = r11
            r36 = r14
            r14 = r12
            r11 = r9
            r9 = r3
            r3 = r36
            r4 = r15
            r15 = r35
        L_0x02c7:
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.a.e(r9)
            r4.put(r13, r7)
            ch.icoaching.wrio.input.SaveWordsUseCase r7 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$3 r8 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$3
            ch.icoaching.wrio.input.SaveWordsUseCase r9 = r0.this$0
            r10 = 0
            r8.<init>(r9, r13, r10)
            r0.L$0 = r4
            r0.L$1 = r3
            r0.L$2 = r15
            r0.L$3 = r14
            r0.L$4 = r10
            r0.I$0 = r2
            r0.J$0 = r11
            r9 = 5
            r0.label = r9
            java.lang.Object r7 = kotlinx.coroutines.C0738g.e(r7, r8, r0)
            if (r7 != r1) goto L_0x02f4
            return r1
        L_0x02f4:
            r9 = r3
            r10 = r11
            r3 = r2
            r2 = r15
        L_0x02f8:
            r7 = r5
            r5 = r14
            r8 = 0
            goto L_0x0151
        L_0x02fd:
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x0363
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r9.size()
            r3.<init>(r5)
            java.util.Set r5 = r9.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0314:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x033d
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            long r8 = r6.longValue()
            int r6 = (int) r8
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            kotlin.Pair r6 = l2.g.a(r7, r6)
            r3.add(r6)
            goto L_0x0314
        L_0x033d:
            java.util.Map r3 = kotlin.collections.D.o(r3)
            ch.icoaching.wrio.input.SaveWordsUseCase r5 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r5 = r5.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$4 r6 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$4
            ch.icoaching.wrio.input.SaveWordsUseCase r7 = r0.this$0
            r8 = 0
            r6.<init>(r7, r3, r8)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r8
            r0.L$3 = r8
            r0.J$0 = r10
            r3 = 6
            r0.label = r3
            java.lang.Object r3 = kotlinx.coroutines.C0738g.e(r5, r6, r0)
            if (r3 != r1) goto L_0x0363
            return r1
        L_0x0363:
            r6 = r4
            r4 = r10
        L_0x0365:
            ch.icoaching.wrio.input.SaveWordsUseCase r3 = r0.this$0
            ch.icoaching.wrio.input.i r3 = r3.f9754e
            java.util.List r3 = r3.b()
            java.util.Iterator r3 = r3.iterator()
        L_0x0373:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0397
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            ch.icoaching.wrio.keyboard.DiacriticsStore$a r8 = ch.icoaching.wrio.keyboard.DiacriticsStore.f9950j
            java.lang.String r8 = r8.a(r7)
            boolean r9 = r2.matches(r8)
            if (r9 == 0) goto L_0x0373
            int r8 = r8.length()
            r9 = 2
            if (r8 >= r9) goto L_0x0393
            goto L_0x0373
        L_0x0393:
            r6.remove(r7)
            goto L_0x0373
        L_0x0397:
            ch.icoaching.wrio.input.SaveWordsUseCase r2 = r0.this$0
            ch.icoaching.wrio.input.i r2 = r2.f9754e
            java.util.Set r2 = r2.a()
            java.util.Iterator r2 = r2.iterator()
            r35 = r4
            r4 = r2
            r2 = r35
            r5 = r6
        L_0x03ab:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0436
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            ch.icoaching.wrio.util.Pair r7 = (ch.icoaching.wrio.util.Pair) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r13 = r6.intValue()
            S r6 = r7.second
            java.lang.String r8 = "second"
            kotlin.jvm.internal.o.d(r6, r8)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x03d9
        L_0x03d6:
            r6 = r1
            r7 = 0
            goto L_0x0433
        L_0x03d9:
            F r6 = r7.first
            boolean r6 = r5.containsKey(r6)
            if (r6 == 0) goto L_0x03d6
            S r6 = r7.second
            boolean r6 = r5.containsKey(r6)
            if (r6 != 0) goto L_0x03ea
            goto L_0x03d6
        L_0x03ea:
            F r6 = r7.first
            java.lang.Object r6 = r5.get(r6)
            kotlin.jvm.internal.o.b(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            long r9 = r6.longValue()
            S r6 = r7.second
            java.lang.Object r6 = r5.get(r6)
            kotlin.jvm.internal.o.b(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            long r11 = r6.longValue()
            ch.icoaching.wrio.input.SaveWordsUseCase r6 = r0.this$0
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.f9752c
            ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$5 r14 = new ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$5
            ch.icoaching.wrio.input.SaveWordsUseCase r8 = r0.this$0
            r16 = 0
            r7 = r14
            r17 = r1
            r1 = r14
            r14 = r2
            r7.<init>(r8, r9, r11, r13, r14, r16)
            r0.L$0 = r5
            r0.L$1 = r4
            r7 = 0
            r0.L$2 = r7
            r0.L$3 = r7
            r0.J$0 = r2
            r8 = 7
            r0.label = r8
            java.lang.Object r1 = kotlinx.coroutines.C0738g.e(r6, r1, r0)
            r6 = r17
            if (r1 != r6) goto L_0x0433
            return r6
        L_0x0433:
            r1 = r6
            goto L_0x03ab
        L_0x0436:
            ch.icoaching.wrio.input.SaveWordsUseCase r1 = r0.this$0
            ch.icoaching.wrio.input.i r1 = r1.f9754e
            r1.c()
            l2.q r1 = l2.q.f14567a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((SaveWordsUseCase$saveWords$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
