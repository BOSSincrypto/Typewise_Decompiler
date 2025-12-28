package kotlin.uuid;

import java.io.Serializable;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.g;
import kotlin.text.h;
import l2.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u001e2\u00060\u0001j\u0002`\u0002:\u0001\u001fB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/uuid/Uuid;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "toHexString", "", "toByteArray", "()[B", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Uuid implements Serializable {
    public static final a Companion = new a((i) null);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Uuid f13981a = new Uuid(0, 0);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f13982b = new D2.a();
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Uuid a(long j4, long j5) {
            if (j4 == 0 && j5 == 0) {
                return b();
            }
            return new Uuid(j4, j5);
        }

        public final Uuid b() {
            return Uuid.f13981a;
        }

        public final Uuid c(String str) {
            String str2 = str;
            o.e(str2, "uuidString");
            if (str.length() == 36) {
                long f4 = g.f(str, 0, 8, (h) null, 4, (Object) null);
                b.d(str2, 8);
                long f5 = g.f(str, 9, 13, (h) null, 4, (Object) null);
                b.d(str2, 13);
                long f6 = g.f(str, 14, 18, (h) null, 4, (Object) null);
                b.d(str2, 18);
                long f7 = g.f(str, 19, 23, (h) null, 4, (Object) null);
                b.d(str2, 23);
                return a((f4 << 32) | (f5 << 16) | f6, g.f(str, 24, 36, (h) null, 4, (Object) null) | (f7 << 48));
            }
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }

        private a() {
        }
    }

    public Uuid(long j4, long j5) {
        this.mostSignificantBits = j4;
        this.leastSignificantBits = j5;
    }

    /* access modifiers changed from: private */
    public static final int b(Uuid uuid, Uuid uuid2) {
        long j4 = uuid.mostSignificantBits;
        if (j4 != uuid2.mostSignificantBits) {
            return Long.compare(l.b(j4) ^ Long.MIN_VALUE, l.b(uuid2.mostSignificantBits) ^ Long.MIN_VALUE);
        }
        return Long.compare(l.b(uuid.leastSignificantBits) ^ Long.MIN_VALUE, l.b(uuid2.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        if (this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits) {
            return true;
        }
        return false;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        long j4 = this.mostSignificantBits ^ this.leastSignificantBits;
        return ((int) j4) ^ ((int) (j4 >> 32));
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        b.f(this.mostSignificantBits, bArr, 0);
        b.f(this.leastSignificantBits, bArr, 8);
        return bArr;
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        b.e(this.leastSignificantBits, bArr, 16, 8);
        b.e(this.mostSignificantBits, bArr, 0, 8);
        return kotlin.text.o.s(bArr);
    }

    public String toString() {
        byte[] bArr = new byte[36];
        b.e(this.leastSignificantBits, bArr, 24, 6);
        bArr[23] = 45;
        b.e(this.leastSignificantBits >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        b.e(this.mostSignificantBits, bArr, 14, 2);
        bArr[13] = 45;
        b.e(this.mostSignificantBits >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        b.e(this.mostSignificantBits >>> 32, bArr, 0, 4);
        return kotlin.text.o.s(bArr);
    }
}
