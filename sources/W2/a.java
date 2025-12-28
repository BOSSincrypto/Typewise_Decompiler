package W2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0032a f1700d = new C0032a((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final ByteString f1701e;

    /* renamed from: f  reason: collision with root package name */
    public static final ByteString f1702f;

    /* renamed from: g  reason: collision with root package name */
    public static final ByteString f1703g;

    /* renamed from: h  reason: collision with root package name */
    public static final ByteString f1704h;

    /* renamed from: i  reason: collision with root package name */
    public static final ByteString f1705i;

    /* renamed from: j  reason: collision with root package name */
    public static final ByteString f1706j;

    /* renamed from: a  reason: collision with root package name */
    public final ByteString f1707a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteString f1708b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1709c;

    /* renamed from: W2.a$a  reason: collision with other inner class name */
    public static final class C0032a {
        public /* synthetic */ C0032a(i iVar) {
            this();
        }

        private C0032a() {
        }
    }

    static {
        ByteString.a aVar = ByteString.Companion;
        f1701e = aVar.d(":");
        f1702f = aVar.d(":status");
        f1703g = aVar.d(":method");
        f1704h = aVar.d(":path");
        f1705i = aVar.d(":scheme");
        f1706j = aVar.d(":authority");
    }

    public a(ByteString byteString, ByteString byteString2) {
        o.e(byteString, "name");
        o.e(byteString2, "value");
        this.f1707a = byteString;
        this.f1708b = byteString2;
        this.f1709c = byteString.size() + 32 + byteString2.size();
    }

    public final ByteString a() {
        return this.f1707a;
    }

    public final ByteString b() {
        return this.f1708b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.a(this.f1707a, aVar.f1707a) && o.a(this.f1708b, aVar.f1708b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1707a.hashCode() * 31) + this.f1708b.hashCode();
    }

    public String toString() {
        return this.f1707a.utf8() + ": " + this.f1708b.utf8();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.o.e(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.e(r3, r0)
            okio.ByteString$a r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.d(r2)
            okio.ByteString r3 = r0.d(r3)
            r1.<init>((okio.ByteString) r2, (okio.ByteString) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.a.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.d(str));
        o.e(byteString, "name");
        o.e(str, "value");
    }
}
