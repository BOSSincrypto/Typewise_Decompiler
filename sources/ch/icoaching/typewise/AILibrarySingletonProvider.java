package ch.icoaching.typewise;

import android.content.Context;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.c;

public final class AILibrarySingletonProvider {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7734a;

    /* renamed from: b  reason: collision with root package name */
    private final D f7735b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f7736c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f7737d;

    /* renamed from: e  reason: collision with root package name */
    private final b f7738e = c.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AILibrary f7739f;

    public AILibrarySingletonProvider(Context context, D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        o.e(context, "applicationContext");
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "ioDispatcher");
        this.f7734a = context;
        this.f7735b = d4;
        this.f7736c = coroutineDispatcher;
        this.f7737d = coroutineDispatcher2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$1 r0 = (ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$1) r0
            int r1 = r0.f7744e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7744e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$1 r0 = new ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f7742c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f7744e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f7741b
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
            java.lang.Object r0 = r0.f7740a
            ch.icoaching.typewise.AILibrarySingletonProvider r0 = (ch.icoaching.typewise.AILibrarySingletonProvider) r0
            kotlin.f.b(r11)     // Catch:{ all -> 0x0035 }
            goto L_0x008c
        L_0x0035:
            r11 = move-exception
            goto L_0x0095
        L_0x0037:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003f:
            java.lang.Object r2 = r0.f7741b
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.b) r2
            java.lang.Object r4 = r0.f7740a
            ch.icoaching.typewise.AILibrarySingletonProvider r4 = (ch.icoaching.typewise.AILibrarySingletonProvider) r4
            kotlin.f.b(r11)
            r11 = r2
            goto L_0x005f
        L_0x004c:
            kotlin.f.b(r11)
            kotlinx.coroutines.sync.b r11 = r10.f7738e
            r0.f7740a = r10
            r0.f7741b = r11
            r0.f7744e = r4
            java.lang.Object r2 = r11.a(r5, r0)
            if (r2 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r4 = r10
        L_0x005f:
            ch.icoaching.typewise.AILibrary r2 = r4.f7739f     // Catch:{ all -> 0x0086 }
            if (r2 != 0) goto L_0x008a
            ch.icoaching.typewise.AILibrary r2 = new ch.icoaching.typewise.AILibrary     // Catch:{ all -> 0x0086 }
            android.content.Context r6 = r4.f7734a     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.D r7 = r4.f7735b     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.CoroutineDispatcher r8 = r4.f7736c     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.CoroutineDispatcher r9 = r4.f7737d     // Catch:{ all -> 0x0086 }
            r2.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0086 }
            r4.f7739f = r2     // Catch:{ all -> 0x0086 }
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f7737d     // Catch:{ all -> 0x0086 }
            ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$2$1 r6 = new ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$2$1     // Catch:{ all -> 0x0086 }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0086 }
            r0.f7740a = r4     // Catch:{ all -> 0x0086 }
            r0.f7741b = r11     // Catch:{ all -> 0x0086 }
            r0.f7744e = r3     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = kotlinx.coroutines.C0738g.e(r2, r6, r0)     // Catch:{ all -> 0x0086 }
            if (r0 != r1) goto L_0x008a
            return r1
        L_0x0086:
            r0 = move-exception
            r1 = r11
            r11 = r0
            goto L_0x0095
        L_0x008a:
            r1 = r11
            r0 = r4
        L_0x008c:
            ch.icoaching.typewise.AILibrary r11 = r0.f7739f     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.o.b(r11)     // Catch:{ all -> 0x0035 }
            r1.b(r5)
            return r11
        L_0x0095:
            r1.b(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.AILibrarySingletonProvider.b(kotlin.coroutines.c):java.lang.Object");
    }
}
