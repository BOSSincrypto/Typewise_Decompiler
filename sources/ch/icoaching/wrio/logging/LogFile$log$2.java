package ch.icoaching.wrio.logging;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.logging.LogFile$log$2", f = "LogFile.kt", l = {146}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class LogFile$log$2 extends SuspendLambda implements p {
    final /* synthetic */ String $message;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $tag;
    final /* synthetic */ Throwable $throwable;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ LogFile this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LogFile$log$2(LogFile logFile, int i4, String str, String str2, Throwable th, c<? super LogFile$log$2> cVar) {
        super(2, cVar);
        this.this$0 = logFile;
        this.$priority = i4;
        this.$tag = str;
        this.$message = str2;
        this.$throwable = th;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new LogFile$log$2(this.this$0, this.$priority, this.$tag, this.$message, this.$throwable, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[SYNTHETIC, Splitter:B:44:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[SYNTHETIC, Splitter:B:52:0x0102] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "\n"
            java.lang.String r1 = "getBytes(...)"
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r14.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0032
            if (r3 != r4) goto L_0x002a
            int r2 = r14.I$0
            java.lang.Object r3 = r14.L$4
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r6 = r14.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r14.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r14.L$1
            ch.icoaching.wrio.logging.LogFile r8 = (ch.icoaching.wrio.logging.LogFile) r8
            java.lang.Object r9 = r14.L$0
            kotlinx.coroutines.sync.b r9 = (kotlinx.coroutines.sync.b) r9
            kotlin.f.b(r15)
            goto L_0x005b
        L_0x002a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0032:
            kotlin.f.b(r15)
            ch.icoaching.wrio.logging.LogFile r15 = r14.this$0
            kotlinx.coroutines.sync.b r9 = r15.f10580e
            ch.icoaching.wrio.logging.LogFile r8 = r14.this$0
            int r15 = r14.$priority
            java.lang.String r7 = r14.$tag
            java.lang.String r6 = r14.$message
            java.lang.Throwable r3 = r14.$throwable
            r14.L$0 = r9
            r14.L$1 = r8
            r14.L$2 = r7
            r14.L$3 = r6
            r14.L$4 = r3
            r14.I$0 = r15
            r14.label = r4
            java.lang.Object r10 = r9.a(r5, r14)
            if (r10 != r2) goto L_0x005a
            return r2
        L_0x005a:
            r2 = r15
        L_0x005b:
            java.io.File r15 = r8.f10578c     // Catch:{ all -> 0x006d }
            boolean r15 = r15.exists()     // Catch:{ all -> 0x006d }
            if (r15 != 0) goto L_0x006f
            java.io.File r15 = r8.f10578c     // Catch:{ all -> 0x006d }
            r15.createNewFile()     // Catch:{ all -> 0x006d }
            goto L_0x0090
        L_0x006d:
            r15 = move-exception
            goto L_0x008d
        L_0x006f:
            java.io.File r15 = r8.f10578c     // Catch:{ all -> 0x006d }
            long r10 = r15.length()     // Catch:{ all -> 0x006d }
            r12 = 20971520(0x1400000, double:1.03613076E-316)
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x0090
            java.io.File r15 = r8.f10578c     // Catch:{ all -> 0x006d }
            r15.delete()     // Catch:{ all -> 0x006d }
            java.io.File r15 = r8.f10578c     // Catch:{ all -> 0x006d }
            r15.createNewFile()     // Catch:{ all -> 0x006d }
            goto L_0x0090
        L_0x008d:
            r15.printStackTrace()     // Catch:{ all -> 0x00e1 }
        L_0x0090:
            java.io.File r15 = r8.f10578c     // Catch:{ all -> 0x00e1 }
            boolean r15 = r15.exists()     // Catch:{ all -> 0x00e1 }
            if (r15 != 0) goto L_0x009b
            goto L_0x00f8
        L_0x009b:
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00eb, all -> 0x00e8 }
            java.io.File r10 = r8.f10578c     // Catch:{ Exception -> 0x00eb, all -> 0x00e8 }
            r15.<init>(r10, r4)     // Catch:{ Exception -> 0x00eb, all -> 0x00e8 }
            java.lang.String r2 = r8.d(r2, r7, r6)     // Catch:{ Exception -> 0x00db }
            java.nio.charset.Charset r4 = kotlin.text.C0724d.f13927b     // Catch:{ Exception -> 0x00db }
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x00db }
            kotlin.jvm.internal.o.d(r2, r1)     // Catch:{ Exception -> 0x00db }
            r15.write(r2)     // Catch:{ Exception -> 0x00db }
            byte[] r2 = r0.getBytes(r4)     // Catch:{ Exception -> 0x00db }
            kotlin.jvm.internal.o.d(r2, r1)     // Catch:{ Exception -> 0x00db }
            r15.write(r2)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x00dd
            java.lang.String r2 = ch.icoaching.wrio.logging.a.c(r3)     // Catch:{ Exception -> 0x00db }
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x00db }
            kotlin.jvm.internal.o.d(r2, r1)     // Catch:{ Exception -> 0x00db }
            r15.write(r2)     // Catch:{ Exception -> 0x00db }
            byte[] r0 = r0.getBytes(r4)     // Catch:{ Exception -> 0x00db }
            kotlin.jvm.internal.o.d(r0, r1)     // Catch:{ Exception -> 0x00db }
            r15.write(r0)     // Catch:{ Exception -> 0x00db }
            goto L_0x00dd
        L_0x00d9:
            r0 = move-exception
            goto L_0x0100
        L_0x00db:
            r0 = move-exception
            goto L_0x00ed
        L_0x00dd:
            r15.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00f8
        L_0x00e1:
            r15 = move-exception
            goto L_0x010b
        L_0x00e3:
            r15 = move-exception
        L_0x00e4:
            r15.printStackTrace()     // Catch:{ all -> 0x00e1 }
            goto L_0x00f8
        L_0x00e8:
            r0 = move-exception
            r15 = r5
            goto L_0x0100
        L_0x00eb:
            r0 = move-exception
            r15 = r5
        L_0x00ed:
            r0.printStackTrace()     // Catch:{ all -> 0x00d9 }
            if (r15 == 0) goto L_0x00f8
            r15.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f8
        L_0x00f6:
            r15 = move-exception
            goto L_0x00e4
        L_0x00f8:
            l2.q r15 = l2.q.f14567a     // Catch:{ all -> 0x00e1 }
            r9.b(r5)
            l2.q r15 = l2.q.f14567a
            return r15
        L_0x0100:
            if (r15 == 0) goto L_0x010a
            r15.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r15 = move-exception
            r15.printStackTrace()     // Catch:{ all -> 0x00e1 }
        L_0x010a:
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x010b:
            r9.b(r5)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.logging.LogFile$log$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((LogFile$log$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
