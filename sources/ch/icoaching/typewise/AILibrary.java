package ch.icoaching.typewise;

import android.content.Context;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import ch.icoaching.typewise.word_lists.WordListRepository;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.c;
import s0.C0892b;

public final class AILibrary extends a {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C0892b f7703e;

    /* renamed from: f  reason: collision with root package name */
    private ConfigHolder f7704f;

    /* renamed from: g  reason: collision with root package name */
    private final b f7705g = c.b(false, 1, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private List f7706h;

    /* renamed from: i  reason: collision with root package name */
    private WordListRepository f7707i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7708j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AILibrary(Context context, D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        super(context, d4, coroutineDispatcher, coroutineDispatcher2);
        o.e(context, "applicationContext");
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "ioDispatcher");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$1 r0 = (ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$1) r0
            int r1 = r0.f7731d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7731d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$1 r0 = new ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f7729b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f7731d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.f7728a
            ch.icoaching.typewise.AILibrary r0 = (ch.icoaching.typewise.AILibrary) r0
            kotlin.f.b(r7)
            goto L_0x0088
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0038:
            java.lang.Object r2 = r0.f7728a
            ch.icoaching.typewise.AILibrary r2 = (ch.icoaching.typewise.AILibrary) r2
            kotlin.f.b(r7)
            goto L_0x0059
        L_0x0040:
            kotlin.f.b(r7)
            ch.icoaching.typewise.file_handling.b r7 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r2 = ch.icoaching.typewise.file_handling.FileIO.Scope.COMMON
            ch.icoaching.typewise.file_handling.FileIO r7 = r7.a(r2)
            r0.f7728a = r6
            r0.f7731d = r4
            java.lang.String r2 = "resources/global_library_settings.json"
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r6
        L_0x0059:
            java.lang.String r7 = (java.lang.String) r7
            t0.c r4 = t0.c.f16361a
            K2.a r4 = r4.c()
            r4.a()
            s0.b$b r5 = s0.C0892b.Companion
            F2.b r5 = r5.serializer()
            java.lang.Object r7 = r4.c(r5, r7)
            s0.b r7 = (s0.C0892b) r7
            r2.f7703e = r7
            kotlinx.coroutines.CoroutineDispatcher r7 = r2.d()
            ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$2 r4 = new ch.icoaching.typewise.AILibrary$loadAndInitializeConfigs$2
            r5 = 0
            r4.<init>(r2, r5)
            r0.f7728a = r2
            r0.f7731d = r3
            java.lang.Object r7 = kotlinx.coroutines.C0738g.e(r7, r4, r0)
            if (r7 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r0 = r2
        L_0x0088:
            ch.icoaching.typewise.file_handling.ConfigHolder r7 = (ch.icoaching.typewise.file_handling.ConfigHolder) r7
            r0.f7704f = r7
            l2.q r7 = l2.q.f14567a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.AILibrary.k(kotlin.coroutines.c):java.lang.Object");
    }

    public ConfigHolder b() {
        if (this.f7708j) {
            ConfigHolder configHolder = this.f7704f;
            if (configHolder != null) {
                return configHolder;
            }
            o.p("_configHolder");
            return null;
        }
        throw new IllegalStateException("AILibrary is not initialized yet!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.util.List r17, ch.icoaching.typewise.word_lists.b r18, ch.icoaching.typewise.word_lists.b r19, u2.l r20, kotlin.coroutines.c r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            boolean r2 = r0 instanceof ch.icoaching.typewise.AILibrary$getWordListRepository$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            ch.icoaching.typewise.AILibrary$getWordListRepository$1 r2 = (ch.icoaching.typewise.AILibrary$getWordListRepository$1) r2
            int r3 = r2.f7717i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f7717i = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.AILibrary$getWordListRepository$1 r2 = new ch.icoaching.typewise.AILibrary$getWordListRepository$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f7715g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f7717i
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0069
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            java.lang.Object r3 = r2.f7711c
            ch.icoaching.typewise.AILibrary r3 = (ch.icoaching.typewise.AILibrary) r3
            java.lang.Object r4 = r2.f7710b
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.b) r4
            java.lang.Object r2 = r2.f7709a
            ch.icoaching.typewise.AILibrary r2 = (ch.icoaching.typewise.AILibrary) r2
            kotlin.f.b(r0)     // Catch:{ all -> 0x003e }
            goto L_0x00c7
        L_0x003e:
            r0 = move-exception
            goto L_0x00dd
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0049:
            java.lang.Object r4 = r2.f7714f
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.b) r4
            java.lang.Object r6 = r2.f7713e
            u2.l r6 = (u2.l) r6
            java.lang.Object r8 = r2.f7712d
            ch.icoaching.typewise.word_lists.b r8 = (ch.icoaching.typewise.word_lists.b) r8
            java.lang.Object r9 = r2.f7711c
            ch.icoaching.typewise.word_lists.b r9 = (ch.icoaching.typewise.word_lists.b) r9
            java.lang.Object r10 = r2.f7710b
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.f7709a
            ch.icoaching.typewise.AILibrary r11 = (ch.icoaching.typewise.AILibrary) r11
            kotlin.f.b(r0)
            r13 = r6
            r12 = r8
            r0 = r11
            r11 = r9
            goto L_0x0091
        L_0x0069:
            kotlin.f.b(r0)
            kotlinx.coroutines.sync.b r0 = r1.f7705g
            r2.f7709a = r1
            r4 = r17
            r2.f7710b = r4
            r8 = r18
            r2.f7711c = r8
            r9 = r19
            r2.f7712d = r9
            r10 = r20
            r2.f7713e = r10
            r2.f7714f = r0
            r2.f7717i = r6
            java.lang.Object r6 = r0.a(r7, r2)
            if (r6 != r3) goto L_0x008b
            return r3
        L_0x008b:
            r11 = r8
            r12 = r9
            r13 = r10
            r10 = r4
            r4 = r0
            r0 = r1
        L_0x0091:
            boolean r6 = r0.f7708j     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x00d5
            ch.icoaching.typewise.word_lists.WordListRepository r6 = r0.f7707i     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x00a1
            java.util.List r6 = r0.f7706h     // Catch:{ all -> 0x003e }
            boolean r6 = kotlin.jvm.internal.o.a(r6, r10)     // Catch:{ all -> 0x003e }
            if (r6 != 0) goto L_0x00cc
        L_0x00a1:
            r0.f7706h = r10     // Catch:{ all -> 0x003e }
            kotlinx.coroutines.CoroutineDispatcher r6 = r0.d()     // Catch:{ all -> 0x003e }
            ch.icoaching.typewise.AILibrary$getWordListRepository$2$2 r15 = new ch.icoaching.typewise.AILibrary$getWordListRepository$2$2     // Catch:{ all -> 0x003e }
            r14 = 0
            r8 = r15
            r9 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x003e }
            r2.f7709a = r0     // Catch:{ all -> 0x003e }
            r2.f7710b = r4     // Catch:{ all -> 0x003e }
            r2.f7711c = r0     // Catch:{ all -> 0x003e }
            r2.f7712d = r7     // Catch:{ all -> 0x003e }
            r2.f7713e = r7     // Catch:{ all -> 0x003e }
            r2.f7714f = r7     // Catch:{ all -> 0x003e }
            r2.f7717i = r5     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = kotlinx.coroutines.C0738g.e(r6, r15, r2)     // Catch:{ all -> 0x003e }
            if (r2 != r3) goto L_0x00c4
            return r3
        L_0x00c4:
            r3 = r0
            r0 = r2
            r2 = r3
        L_0x00c7:
            ch.icoaching.typewise.word_lists.WordListRepository r0 = (ch.icoaching.typewise.word_lists.WordListRepository) r0     // Catch:{ all -> 0x003e }
            r3.f7707i = r0     // Catch:{ all -> 0x003e }
            r0 = r2
        L_0x00cc:
            ch.icoaching.typewise.word_lists.WordListRepository r0 = r0.f7707i     // Catch:{ all -> 0x003e }
            kotlin.jvm.internal.o.b(r0)     // Catch:{ all -> 0x003e }
            r4.b(r7)
            return r0
        L_0x00d5:
            java.lang.String r0 = "AILibrary is not initialized yet!"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003e }
            r2.<init>(r0)     // Catch:{ all -> 0x003e }
            throw r2     // Catch:{ all -> 0x003e }
        L_0x00dd:
            r4.b(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.AILibrary.f(java.util.List, ch.icoaching.typewise.word_lists.b, ch.icoaching.typewise.word_lists.b, u2.l, kotlin.coroutines.c):java.lang.Object");
    }

    public C0892b i() {
        if (this.f7708j) {
            C0892b bVar = this.f7703e;
            if (bVar != null) {
                return bVar;
            }
            o.p("_globalLibraryConfig");
            return null;
        }
        throw new IllegalStateException("AILibrary is not initialized yet!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(kotlin.coroutines.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ch.icoaching.typewise.AILibrary$initialize$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ch.icoaching.typewise.AILibrary$initialize$1 r0 = (ch.icoaching.typewise.AILibrary$initialize$1) r0
            int r1 = r0.f7727d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7727d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.AILibrary$initialize$1 r0 = new ch.icoaching.typewise.AILibrary$initialize$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f7725b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f7727d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f7724a
            ch.icoaching.typewise.AILibrary r0 = (ch.icoaching.typewise.AILibrary) r0
            kotlin.f.b(r11)
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0035:
            kotlin.f.b(r11)
            ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
            r8 = 4
            r9 = 0
            java.lang.String r5 = "AILibrary"
            java.lang.String r6 = "initialize() :: AILibrary initialization started."
            r7 = 0
            ch.icoaching.typewise.e.b(r4, r5, r6, r7, r8, r9)
            ch.icoaching.typewise.file_handling.b r11 = ch.icoaching.typewise.file_handling.b.f8265a
            android.content.Context r2 = r10.a()
            r11.b(r2)
            r0.f7724a = r10
            r0.f7727d = r3
            java.lang.Object r11 = r10.k(r0)
            if (r11 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r0 = r10
        L_0x0059:
            s0.b r11 = r0.f7703e
            if (r11 != 0) goto L_0x0063
            java.lang.String r11 = "_globalLibraryConfig"
            kotlin.jvm.internal.o.p(r11)
            r11 = 0
        L_0x0063:
            s0.b$a r11 = r11.b()
            ch.icoaching.typewise.global_cache.a.b(r11)
            r0.f7708j = r3
            ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
            r8 = 4
            r9 = 0
            java.lang.String r5 = "AILibrary"
            java.lang.String r6 = "initialize() :: AILibrary initialization finished."
            r7 = 0
            ch.icoaching.typewise.e.b(r4, r5, r6, r7, r8, r9)
            l2.q r11 = l2.q.f14567a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.AILibrary.j(kotlin.coroutines.c):java.lang.Object");
    }
}
