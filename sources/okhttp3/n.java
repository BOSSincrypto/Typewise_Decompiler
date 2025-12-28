package okhttp3;

import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f15465a = new n();

    private n() {
    }

    public static final String a(String str, String str2, Charset charset) {
        o.e(str, "username");
        o.e(str2, "password");
        o.e(charset, HttpRequest.PARAM_CHARSET);
        return o.k("Basic ", ByteString.Companion.c(str + ':' + str2, charset).base64());
    }
}
