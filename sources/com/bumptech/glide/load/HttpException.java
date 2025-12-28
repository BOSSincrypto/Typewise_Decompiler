package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int i4) {
        this("Http request failed", i4);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i4) {
        this(str, i4, (Throwable) null);
    }

    public HttpException(String str, int i4, Throwable th) {
        super(str + ", status code: " + i4, th);
        this.statusCode = i4;
    }
}
