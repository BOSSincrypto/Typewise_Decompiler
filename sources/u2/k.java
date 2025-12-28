package U2;

import java.net.ProtocolException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.Protocol;

public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1531d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    public final Protocol f1532a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1533b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1534c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final k a(String str) {
            int i4;
            Protocol protocol;
            String str2;
            o.e(str, "statusLine");
            if (kotlin.text.o.G(str, "HTTP/1.", false, 2, (Object) null)) {
                i4 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(o.k("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException(o.k("Unexpected status line: ", str));
                }
            } else if (kotlin.text.o.G(str, "ICY ", false, 2, (Object) null)) {
                protocol = Protocol.HTTP_1_0;
                i4 = 4;
            } else {
                throw new ProtocolException(o.k("Unexpected status line: ", str));
            }
            int i5 = i4 + 3;
            if (str.length() >= i5) {
                try {
                    String substring = str.substring(i4, i5);
                    o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i5) {
                        str2 = "";
                    } else if (str.charAt(i5) == ' ') {
                        str2 = str.substring(i4 + 4);
                        o.d(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(o.k("Unexpected status line: ", str));
                    }
                    return new k(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(o.k("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(o.k("Unexpected status line: ", str));
            }
        }

        private a() {
        }
    }

    public k(Protocol protocol, int i4, String str) {
        o.e(protocol, "protocol");
        o.e(str, "message");
        this.f1532a = protocol;
        this.f1533b = i4;
        this.f1534c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f1532a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f1533b);
        sb.append(' ');
        sb.append(this.f1534c);
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
