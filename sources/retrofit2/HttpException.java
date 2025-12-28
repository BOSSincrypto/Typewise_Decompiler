package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

public class HttpException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient J f16122a;
    private final int code;
    private final String message;

    public HttpException(J<?> j4) {
        super(a(j4));
        this.code = j4.b();
        this.message = j4.f();
        this.f16122a = j4;
    }

    private static String a(J j4) {
        Objects.requireNonNull(j4, "response == null");
        return "HTTP " + j4.b() + " " + j4.f();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public J<?> response() {
        return this.f16122a;
    }
}
