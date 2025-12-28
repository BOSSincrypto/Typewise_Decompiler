package okhttp3.internal.publicsuffix;

import B2.h;
import Q2.d;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "Ll2/q;", "e", "d", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15417e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f15418f = {42};

    /* renamed from: g  reason: collision with root package name */
    private static final List f15419g = C0718m.e("*");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f15420h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f15421a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f15422b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f15423c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f15424d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i4) {
            int i5;
            int i6;
            boolean z3;
            int d4;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = (i7 + length) / 2;
                while (i8 > -1 && bArr3[i8] != 10) {
                    i8--;
                }
                int i9 = i8 + 1;
                int i10 = 1;
                while (true) {
                    i5 = i9 + i10;
                    if (bArr3[i5] == 10) {
                        break;
                    }
                    i10++;
                }
                int i11 = i5 - i9;
                int i12 = i4;
                boolean z4 = false;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (z4) {
                        i6 = 46;
                        z3 = false;
                    } else {
                        boolean z5 = z4;
                        i6 = d.d(bArr4[i12][i13], 255);
                        z3 = z5;
                    }
                    d4 = i6 - d.d(bArr3[i9 + i14], 255);
                    if (d4 == 0) {
                        i14++;
                        i13++;
                        if (i14 == i11) {
                            break;
                        } else if (bArr4[i12].length != i13) {
                            z4 = z3;
                        } else if (i12 == bArr4.length - 1) {
                            break;
                        } else {
                            i12++;
                            z4 = true;
                            i13 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (d4 >= 0) {
                    if (d4 <= 0) {
                        int i15 = i11 - i14;
                        int length2 = bArr4[i12].length - i13;
                        int length3 = bArr4.length;
                        for (int i16 = i12 + 1; i16 < length3; i16++) {
                            length2 += bArr4[i16].length;
                        }
                        if (length2 >= i15) {
                            if (length2 <= i15) {
                                Charset charset = StandardCharsets.UTF_8;
                                o.d(charset, "UTF_8");
                                return new String(bArr3, i9, i11, charset);
                            }
                        }
                    }
                    i7 = i5 + 1;
                }
                length = i8;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f15420h;
        }

        private a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List b(java.util.List r19) {
        /*
            r18 = this;
            r0 = r18
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f15421a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f15421a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r18.e()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.f15422b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.f15423c
            if (r1 == 0) goto L_0x010a
            int r1 = r19.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x0030:
            if (r5 >= r1) goto L_0x004e
            r6 = r19
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            kotlin.jvm.internal.o.d(r8, r9)
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.o.d(r7, r8)
            r4[r5] = r7
            int r5 = r5 + r3
            goto L_0x0030
        L_0x004e:
            r5 = r2
        L_0x004f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x006a
            int r8 = r5 + 1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f15417e
            byte[] r10 = r0.f15423c
            if (r10 != 0) goto L_0x0060
            kotlin.jvm.internal.o.p(r6)
            r10 = r7
        L_0x0060:
            java.lang.String r5 = r9.b(r10, r4, r5)
            if (r5 == 0) goto L_0x0068
            r9 = r5
            goto L_0x006b
        L_0x0068:
            r5 = r8
            goto L_0x004f
        L_0x006a:
            r9 = r7
        L_0x006b:
            if (r1 <= r3) goto L_0x0092
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r8 = r5.length
            int r8 = r8 - r3
            r10 = r2
        L_0x0076:
            if (r10 >= r8) goto L_0x0092
            int r11 = r10 + 1
            byte[] r12 = f15418f
            r5[r10] = r12
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r12 = f15417e
            byte[] r13 = r0.f15423c
            if (r13 != 0) goto L_0x0088
            kotlin.jvm.internal.o.p(r6)
            r13 = r7
        L_0x0088:
            java.lang.String r10 = r12.b(r13, r5, r10)
            if (r10 == 0) goto L_0x0090
            r5 = r10
            goto L_0x0093
        L_0x0090:
            r10 = r11
            goto L_0x0076
        L_0x0092:
            r5 = r7
        L_0x0093:
            if (r5 == 0) goto L_0x00b0
            int r1 = r1 - r3
            r6 = r2
        L_0x0097:
            if (r6 >= r1) goto L_0x00b0
            int r8 = r6 + 1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r10 = f15417e
            byte[] r11 = r0.f15424d
            if (r11 != 0) goto L_0x00a7
            java.lang.String r11 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.o.p(r11)
            r11 = r7
        L_0x00a7:
            java.lang.String r6 = r10.b(r11, r4, r6)
            if (r6 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r6 = r8
            goto L_0x0097
        L_0x00b0:
            r6 = r7
        L_0x00b1:
            r1 = 46
            if (r6 == 0) goto L_0x00c8
            java.lang.String r4 = "!"
            java.lang.String r7 = kotlin.jvm.internal.o.k(r4, r6)
            char[] r8 = new char[r3]
            r8[r2] = r1
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            java.util.List r1 = kotlin.text.o.s0(r7, r8, r9, r10, r11, r12)
            return r1
        L_0x00c8:
            if (r9 != 0) goto L_0x00cf
            if (r5 != 0) goto L_0x00cf
            java.util.List r1 = f15419g
            return r1
        L_0x00cf:
            if (r9 != 0) goto L_0x00d3
            r4 = r7
            goto L_0x00df
        L_0x00d3:
            char[] r10 = new char[r3]
            r10[r2] = r1
            r13 = 6
            r14 = 0
            r11 = 0
            r12 = 0
            java.util.List r4 = kotlin.text.o.s0(r9, r10, r11, r12, r13, r14)
        L_0x00df:
            if (r4 != 0) goto L_0x00e5
            java.util.List r4 = kotlin.collections.C0718m.j()
        L_0x00e5:
            if (r5 != 0) goto L_0x00e8
            goto L_0x00f7
        L_0x00e8:
            char[] r13 = new char[r3]
            r13[r2] = r1
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            r12 = r5
            java.util.List r7 = kotlin.text.o.s0(r12, r13, r14, r15, r16, r17)
        L_0x00f7:
            if (r7 != 0) goto L_0x00fd
            java.util.List r7 = kotlin.collections.C0718m.j()
        L_0x00fd:
            int r1 = r4.size()
            int r2 = r7.size()
            if (r1 <= r2) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r4 = r7
        L_0x0109:
            return r4
        L_0x010a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        s2.C0896b.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            c3.h r1 = new c3.h
            c3.w r0 = c3.k.e(r0)
            r1.<init>(r0)
            c3.d r0 = c3.k.b(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r1 = (long) r1     // Catch:{ all -> 0x0045 }
            byte[] r1 = r0.L(r1)     // Catch:{ all -> 0x0045 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r2 = (long) r2     // Catch:{ all -> 0x0045 }
            byte[] r2 = r0.L(r2)     // Catch:{ all -> 0x0045 }
            l2.q r3 = l2.q.f14567a     // Catch:{ all -> 0x0045 }
            r3 = 0
            s2.C0896b.a(r0, r3)
            monitor-enter(r4)
            kotlin.jvm.internal.o.b(r1)     // Catch:{ all -> 0x0042 }
            r4.f15423c = r1     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.o.b(r2)     // Catch:{ all -> 0x0042 }
            r4.f15424d = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.f15422b
            r0.countDown()
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r2 = move-exception
            s2.C0896b.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.d()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            X2.k$a r2 = X2.k.f1971a     // Catch:{ all -> 0x000e }
            X2.k r2 = r2.g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.j(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.e():void");
    }

    private final List f(String str) {
        List s02 = kotlin.text.o.s0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (o.a(C0718m.b0(s02), "")) {
            return C0718m.N(s02, 1);
        }
        return s02;
    }

    public final String c(String str) {
        int size;
        int size2;
        o.e(str, "domain");
        String unicode = IDN.toUnicode(str);
        o.d(unicode, "unicodeDomain");
        List f4 = f(unicode);
        List b4 = b(f4);
        if (f4.size() == b4.size() && ((String) b4.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b4.get(0)).charAt(0) == '!') {
            size = f4.size();
            size2 = b4.size();
        } else {
            size = f4.size();
            size2 = b4.size() + 1;
        }
        return h.k(h.h(C0718m.J(f(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }
}
