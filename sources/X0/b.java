package X0;

import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f1934a = Charset.forName(HttpRequest.CHARSET_UTF8);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
