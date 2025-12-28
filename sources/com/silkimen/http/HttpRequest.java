package com.silkimen.http;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class HttpRequest {
    private static final String BOUNDARY = "00content0boundary00";
    public static final String CHARSET_UTF8 = "UTF-8";
    private static ConnectionFactory CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
    public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    public static final String CONTENT_TYPE_JSON = "application/json";
    private static final String CONTENT_TYPE_MULTIPART = "multipart/form-data; boundary=00content0boundary00";
    private static final String CRLF = "\r\n";
    private static final String[] EMPTY_STRINGS = new String[0];
    public static final String ENCODING_GZIP = "gzip";
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_ACCEPT_CHARSET = "Accept-Charset";
    public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_CACHE_CONTROL = "Cache-Control";
    public static final String HEADER_CONTENT_ENCODING = "Content-Encoding";
    public static final String HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_DATE = "Date";
    public static final String HEADER_ETAG = "ETag";
    public static final String HEADER_EXPIRES = "Expires";
    public static final String HEADER_IF_NONE_MATCH = "If-None-Match";
    public static final String HEADER_LAST_MODIFIED = "Last-Modified";
    public static final String HEADER_LOCATION = "Location";
    public static final String HEADER_PROXY_AUTHORIZATION = "Proxy-Authorization";
    public static final String HEADER_REFERER = "Referer";
    public static final String HEADER_SERVER = "Server";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String METHOD_DELETE = "DELETE";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_HEAD = "HEAD";
    public static final String METHOD_OPTIONS = "OPTIONS";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_TRACE = "TRACE";
    public static final String PARAM_CHARSET = "charset";
    /* access modifiers changed from: private */
    public int bufferSize = 8192;
    private HttpURLConnection connection = null;
    private boolean form;
    private String httpProxyHost;
    private int httpProxyPort;
    private boolean ignoreCloseExceptions = true;
    private boolean multipart;
    private RequestOutputStream output;
    /* access modifiers changed from: private */
    public UploadProgress progress = UploadProgress.DEFAULT;
    private final String requestMethod;
    /* access modifiers changed from: private */
    public long totalSize = -1;
    /* access modifiers changed from: private */
    public long totalWritten = 0;
    private boolean uncompress = false;
    private final URL url;

    public static class Base64 {
        private static final byte EQUALS_SIGN = 61;
        private static final String PREFERRED_ENCODING = "US-ASCII";
        private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        private Base64() {
        }

        public static String encode(String str) {
            byte[] bArr;
            try {
                bArr = str.getBytes(PREFERRED_ENCODING);
            } catch (UnsupportedEncodingException unused) {
                bArr = str.getBytes();
            }
            return encodeBytes(bArr);
        }

        private static byte[] encode3to4(byte[] bArr, int i4, int i5, byte[] bArr2, int i6) {
            int i7;
            int i8;
            byte[] bArr3 = _STANDARD_ALPHABET;
            int i9 = 0;
            if (i5 > 0) {
                i7 = (bArr[i4] << 24) >>> 8;
            } else {
                i7 = 0;
            }
            if (i5 > 1) {
                i8 = (bArr[i4 + 1] << 24) >>> 16;
            } else {
                i8 = 0;
            }
            int i10 = i7 | i8;
            if (i5 > 2) {
                i9 = (bArr[i4 + 2] << 24) >>> 24;
            }
            int i11 = i10 | i9;
            if (i5 == 1) {
                bArr2[i6] = bArr3[i11 >>> 18];
                bArr2[i6 + 1] = bArr3[(i11 >>> 12) & 63];
                bArr2[i6 + 2] = EQUALS_SIGN;
                bArr2[i6 + 3] = EQUALS_SIGN;
                return bArr2;
            } else if (i5 == 2) {
                bArr2[i6] = bArr3[i11 >>> 18];
                bArr2[i6 + 1] = bArr3[(i11 >>> 12) & 63];
                bArr2[i6 + 2] = bArr3[(i11 >>> 6) & 63];
                bArr2[i6 + 3] = EQUALS_SIGN;
                return bArr2;
            } else if (i5 != 3) {
                return bArr2;
            } else {
                bArr2[i6] = bArr3[i11 >>> 18];
                bArr2[i6 + 1] = bArr3[(i11 >>> 12) & 63];
                bArr2[i6 + 2] = bArr3[(i11 >>> 6) & 63];
                bArr2[i6 + 3] = bArr3[i11 & 63];
                return bArr2;
            }
        }

        public static String encodeBytes(byte[] bArr) {
            return encodeBytes(bArr, 0, bArr.length);
        }

        public static byte[] encodeBytesToBytes(byte[] bArr, int i4, int i5) {
            int i6;
            if (bArr == null) {
                throw new NullPointerException("Cannot serialize a null array.");
            } else if (i4 < 0) {
                throw new IllegalArgumentException("Cannot have negative offset: " + i4);
            } else if (i5 < 0) {
                throw new IllegalArgumentException("Cannot have length offset: " + i5);
            } else if (i4 + i5 <= bArr.length) {
                int i7 = (i5 / 3) * 4;
                if (i5 % 3 > 0) {
                    i6 = 4;
                } else {
                    i6 = 0;
                }
                int i8 = i7 + i6;
                byte[] bArr2 = new byte[i8];
                int i9 = i5 - 2;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    encode3to4(bArr, i10 + i4, 3, bArr2, i11);
                    i10 += 3;
                    i11 += 4;
                }
                if (i10 < i5) {
                    encode3to4(bArr, i4 + i10, i5 - i10, bArr2, i11);
                    i11 += 4;
                }
                if (i11 > i8 - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr2, 0, bArr3, 0, i11);
                return bArr3;
            } else {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(bArr.length)}));
            }
        }

        public static String encodeBytes(byte[] bArr, int i4, int i5) {
            byte[] encodeBytesToBytes = encodeBytesToBytes(bArr, i4, i5);
            try {
                return new String(encodeBytesToBytes, PREFERRED_ENCODING);
            } catch (UnsupportedEncodingException unused) {
                return new String(encodeBytesToBytes);
            }
        }
    }

    protected static abstract class CloseOperation<V> extends Operation<V> {
        private final Closeable closeable;
        private final boolean ignoreCloseExceptions;

        protected CloseOperation(Closeable closeable2, boolean z3) {
            this.closeable = closeable2;
            this.ignoreCloseExceptions = z3;
        }

        /* access modifiers changed from: protected */
        public void done() {
            Closeable closeable2 = this.closeable;
            if (closeable2 instanceof Flushable) {
                ((Flushable) closeable2).flush();
            }
            if (this.ignoreCloseExceptions) {
                try {
                    this.closeable.close();
                } catch (IOException unused) {
                }
            } else {
                this.closeable.close();
            }
        }
    }

    public interface ConnectionFactory {
        public static final ConnectionFactory DEFAULT = new ConnectionFactory() {
            public HttpURLConnection create(URL url) {
                return (HttpURLConnection) url.openConnection();
            }

            public HttpURLConnection create(URL url, Proxy proxy) {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        HttpURLConnection create(URL url);

        HttpURLConnection create(URL url, Proxy proxy);
    }

    protected static abstract class FlushOperation<V> extends Operation<V> {
        private final Flushable flushable;

        protected FlushOperation(Flushable flushable2) {
            this.flushable = flushable2;
        }

        /* access modifiers changed from: protected */
        public void done() {
            this.flushable.flush();
        }
    }

    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public HttpRequestException(IOException iOException) {
            super(iOException);
        }

        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    protected static abstract class Operation<V> implements Callable<V> {
        protected Operation() {
        }

        public V call() {
            boolean z3;
            Throwable th;
            try {
                V run = run();
                try {
                    done();
                    return run;
                } catch (IOException e4) {
                    throw new HttpRequestException(e4);
                }
            } catch (HttpRequestException e5) {
                throw e5;
            } catch (IOException e6) {
                throw new HttpRequestException(e6);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                z3 = true;
                th = th3;
                done();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void done();

        /* access modifiers changed from: protected */
        public abstract V run();
    }

    public static class RequestOutputStream extends BufferedOutputStream {
        /* access modifiers changed from: private */
        public final CharsetEncoder encoder;

        public RequestOutputStream(OutputStream outputStream, String str, int i4) {
            super(outputStream, i4);
            this.encoder = Charset.forName(HttpRequest.getValidCharset(str)).newEncoder();
        }

        public RequestOutputStream write(String str) {
            ByteBuffer encode = this.encoder.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public interface UploadProgress {
        public static final UploadProgress DEFAULT = new UploadProgress() {
            public void onUpload(long j4, long j5) {
            }
        };

        void onUpload(long j4, long j5);
    }

    public HttpRequest(CharSequence charSequence, String str) {
        try {
            this.url = new URL(charSequence.toString());
            this.requestMethod = str;
        } catch (MalformedURLException e4) {
            throw new HttpRequestException(e4);
        }
    }

    private static StringBuilder addParam(Object obj, Object obj2, StringBuilder sb) {
        if (obj2 != null && obj2.getClass().isArray()) {
            obj2 = arrayToList(obj2);
        }
        if (obj2 instanceof Iterable) {
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                sb.append(obj);
                sb.append("[]=");
                Object next = it.next();
                if (next != null) {
                    sb.append(next);
                }
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        } else {
            sb.append(obj);
            sb.append("=");
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb;
    }

    private static StringBuilder addParamPrefix(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    private static StringBuilder addPathSeparator(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    public static String append(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        addPathSeparator(charSequence2, sb);
        addParamPrefix(charSequence2, sb);
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        addParam(next.getKey().toString(), next.getValue(), sb);
        while (it.hasNext()) {
            sb.append('&');
            Map.Entry next2 = it.next();
            addParam(next2.getKey().toString(), next2.getValue(), sb);
        }
        return sb.toString();
    }

    private static List<Object> arrayToList(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Object[]) obj);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i4 < length) {
                arrayList.add(Integer.valueOf(iArr[i4]));
                i4++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i4 < length2) {
                arrayList.add(Boolean.valueOf(zArr[i4]));
                i4++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            while (i4 < length3) {
                arrayList.add(Long.valueOf(jArr[i4]));
                i4++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i4 < length4) {
                arrayList.add(Float.valueOf(fArr[i4]));
                i4++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i4 < length5) {
                arrayList.add(Double.valueOf(dArr[i4]));
                i4++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length6 = sArr.length;
            while (i4 < length6) {
                arrayList.add(Short.valueOf(sArr[i4]));
                i4++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length7 = bArr.length;
            while (i4 < length7) {
                arrayList.add(Byte.valueOf(bArr[i4]));
                i4++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length8 = cArr.length;
            while (i4 < length8) {
                arrayList.add(Character.valueOf(cArr[i4]));
                i4++;
            }
        }
        return arrayList;
    }

    private HttpURLConnection createConnection() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.httpProxyHost != null) {
                httpURLConnection = CONNECTION_FACTORY.create(this.url, createProxy());
            } else {
                httpURLConnection = CONNECTION_FACTORY.create(this.url);
            }
            httpURLConnection.setRequestMethod(this.requestMethod);
            return httpURLConnection;
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    private Proxy createProxy() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.httpProxyHost, this.httpProxyPort));
    }

    public static HttpRequest delete(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_DELETE);
    }

    public static String encode(CharSequence charSequence) {
        int i4;
        try {
            URL url2 = new URL(charSequence.toString());
            String host = url2.getHost();
            int port = url2.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url2.getProtocol(), host, url2.getPath(), url2.getQuery(), (String) null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i4 = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i4) + aSCIIString.substring(i4).replace("+", "%2B");
            } catch (URISyntaxException e4) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e4);
                throw new HttpRequestException(iOException);
            }
        } catch (IOException e5) {
            throw new HttpRequestException(e5);
        }
    }

    public static HttpRequest get(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_GET);
    }

    /* access modifiers changed from: private */
    public static String getValidCharset(String str) {
        if (str == null || str.length() <= 0) {
            return CHARSET_UTF8;
        }
        return str;
    }

    public static HttpRequest head(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_HEAD);
    }

    private HttpRequest incrementTotalSize(long j4) {
        if (this.totalSize == -1) {
            this.totalSize = 0;
        }
        this.totalSize += j4;
        return this;
    }

    public static void keepAlive(boolean z3) {
        setProperty("http.keepAlive", Boolean.toString(z3));
    }

    public static void maxConnections(int i4) {
        setProperty("http.maxConnections", Integer.toString(i4));
    }

    public static void nonProxyHosts(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            setProperty("http.nonProxyHosts", (String) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length - 1;
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(strArr[i4]);
            sb.append('|');
        }
        sb.append(strArr[length]);
        setProperty("http.nonProxyHosts", sb.toString());
    }

    public static HttpRequest options(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_OPTIONS);
    }

    public static HttpRequest post(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_POST);
    }

    public static void proxyHost(String str) {
        setProperty("http.proxyHost", str);
        setProperty("https.proxyHost", str);
    }

    public static void proxyPort(int i4) {
        String num = Integer.toString(i4);
        setProperty("http.proxyPort", num);
        setProperty("https.proxyPort", num);
    }

    public static HttpRequest put(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_PUT);
    }

    public static void setConnectionFactory(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
        } else {
            CONNECTION_FACTORY = connectionFactory;
        }
    }

    private static String setProperty(final String str, final String str2) {
        PrivilegedAction privilegedAction;
        if (str2 != null) {
            privilegedAction = new PrivilegedAction<String>() {
                public String run() {
                    return System.setProperty(str, str2);
                }
            };
        } else {
            privilegedAction = new PrivilegedAction<String>() {
                public String run() {
                    return System.clearProperty(str);
                }
            };
        }
        return (String) AccessController.doPrivileged(privilegedAction);
    }

    public static HttpRequest trace(CharSequence charSequence) {
        return new HttpRequest(charSequence, METHOD_TRACE);
    }

    public HttpRequest accept(String str) {
        return header(HEADER_ACCEPT, str);
    }

    public HttpRequest acceptCharset(String str) {
        return header(HEADER_ACCEPT_CHARSET, str);
    }

    public HttpRequest acceptEncoding(String str) {
        return header(HEADER_ACCEPT_ENCODING, str);
    }

    public HttpRequest acceptGzipEncoding() {
        return acceptEncoding(ENCODING_GZIP);
    }

    public HttpRequest acceptJson() {
        return accept(CONTENT_TYPE_JSON);
    }

    public HttpRequest authorization(String str) {
        return header(HEADER_AUTHORIZATION, str);
    }

    public boolean badRequest() {
        if (400 == code()) {
            return true;
        }
        return false;
    }

    public HttpRequest basic(String str, String str2) {
        return authorization("Basic " + Base64.encode(str + ':' + str2));
    }

    public String body(String str) {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy((InputStream) buffer(), (OutputStream) byteStream);
            return byteStream.toString(getValidCharset(str));
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public BufferedInputStream buffer() {
        return new BufferedInputStream(stream(), this.bufferSize);
    }

    public HttpRequest bufferSize(int i4) {
        if (i4 >= 1) {
            this.bufferSize = i4;
            return this;
        }
        throw new IllegalArgumentException("Size must be greater than zero");
    }

    public BufferedReader bufferedReader(String str) {
        return new BufferedReader(reader(str), this.bufferSize);
    }

    /* access modifiers changed from: protected */
    public ByteArrayOutputStream byteStream() {
        int contentLength = contentLength();
        if (contentLength > 0) {
            return new ByteArrayOutputStream(contentLength);
        }
        return new ByteArrayOutputStream();
    }

    public byte[] bytes() {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy((InputStream) buffer(), (OutputStream) byteStream);
            return byteStream.toByteArray();
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public String cacheControl() {
        return header(HEADER_CACHE_CONTROL);
    }

    public String charset() {
        return parameter(HEADER_CONTENT_TYPE, PARAM_CHARSET);
    }

    public HttpRequest chunk(int i4) {
        getConnection().setChunkedStreamingMode(i4);
        return this;
    }

    /* access modifiers changed from: protected */
    public HttpRequest closeOutput() {
        progress((UploadProgress) null);
        RequestOutputStream requestOutputStream = this.output;
        if (requestOutputStream == null) {
            return this;
        }
        if (this.multipart) {
            requestOutputStream.write("\r\n--00content0boundary00--\r\n");
        }
        if (this.ignoreCloseExceptions) {
            try {
                this.output.close();
            } catch (IOException unused) {
            }
        } else {
            this.output.close();
        }
        this.output = null;
        return this;
    }

    /* access modifiers changed from: protected */
    public HttpRequest closeOutputQuietly() {
        try {
            return closeOutput();
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public int code() {
        try {
            closeOutput();
            return getConnection().getResponseCode();
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest connectTimeout(int i4) {
        getConnection().setConnectTimeout(i4);
        return this;
    }

    public String contentEncoding() {
        return header(HEADER_CONTENT_ENCODING);
    }

    public int contentLength() {
        return intHeader(HEADER_CONTENT_LENGTH);
    }

    public HttpRequest contentType(String str) {
        return contentType(str, (String) null);
    }

    /* access modifiers changed from: protected */
    public HttpRequest copy(InputStream inputStream, OutputStream outputStream) {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        return (HttpRequest) new CloseOperation<HttpRequest>(inputStream, this.ignoreCloseExceptions) {
            public HttpRequest run() {
                byte[] bArr = new byte[HttpRequest.this.bufferSize];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    outputStream2.write(bArr, 0, read);
                    HttpRequest httpRequest = HttpRequest.this;
                    httpRequest.totalWritten = httpRequest.totalWritten + ((long) read);
                    HttpRequest.this.progress.onUpload(HttpRequest.this.totalWritten, HttpRequest.this.totalSize);
                }
            }
        }.call();
    }

    public boolean created() {
        if (201 == code()) {
            return true;
        }
        return false;
    }

    public long date() {
        return dateHeader(HEADER_DATE);
    }

    public long dateHeader(String str) {
        return dateHeader(str, -1);
    }

    public HttpRequest disconnect() {
        getConnection().disconnect();
        return this;
    }

    public String eTag() {
        return header(HEADER_ETAG);
    }

    public long expires() {
        return dateHeader(HEADER_EXPIRES);
    }

    public HttpRequest followRedirects(boolean z3) {
        getConnection().setInstanceFollowRedirects(z3);
        return this;
    }

    public HttpRequest form(Map<?, ?> map) {
        return form(map, CHARSET_UTF8);
    }

    public HttpURLConnection getConnection() {
        if (this.connection == null) {
            this.connection = createConnection();
        }
        return this.connection;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[EDGE_INSN: B:30:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    protected java.lang.String getParam(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x006f
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x006f
        L_0x000a:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x006f
            if (r3 != r1) goto L_0x001b
            goto L_0x006f
        L_0x001b:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r9 = 2
            if (r7 <= r9) goto L_0x0065
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L_0x0065
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L_0x0065
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.silkimen.http.HttpRequest.getParam(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getParams(String str) {
        int i4;
        String trim;
        int length;
        if (str == null || str.length() == 0) {
            return Collections.emptyMap();
        }
        int length2 = str.length();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf == 0 || indexOf == length2) {
            return Collections.emptyMap();
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = length2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (indexOf < i4) {
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 != -1 && indexOf3 < i4) {
                String trim2 = str.substring(indexOf, indexOf3).trim();
                if (trim2.length() > 0 && (length = trim.length()) != 0) {
                    if (length > 2 && '\"' == trim.charAt(0)) {
                        int i5 = length - 1;
                        if ('\"' == trim.charAt(i5)) {
                            linkedHashMap.put(trim2, trim.substring(1, i5));
                        }
                    }
                    linkedHashMap.put(trim2, (trim = str.substring(indexOf3 + 1, i4).trim()));
                }
            }
            indexOf = i4 + 1;
            i4 = str.indexOf(59, indexOf);
            if (i4 == -1) {
                i4 = length2;
            }
        }
        return linkedHashMap;
    }

    public HttpRequest header(String str, String str2) {
        getConnection().setRequestProperty(str, str2);
        return this;
    }

    public HttpRequest headers(Map<String, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> header : map.entrySet()) {
                header(header);
            }
        }
        return this;
    }

    public HttpRequest ifModifiedSince(long j4) {
        getConnection().setIfModifiedSince(j4);
        return this;
    }

    public HttpRequest ifNoneMatch(String str) {
        return header(HEADER_IF_NONE_MATCH, str);
    }

    public HttpRequest ignoreCloseExceptions(boolean z3) {
        this.ignoreCloseExceptions = z3;
        return this;
    }

    public int intHeader(String str) {
        return intHeader(str, -1);
    }

    public boolean isBodyEmpty() {
        if (contentLength() == 0) {
            return true;
        }
        return false;
    }

    public long lastModified() {
        return dateHeader(HEADER_LAST_MODIFIED);
    }

    public String location() {
        return header(HEADER_LOCATION);
    }

    public String message() {
        try {
            closeOutput();
            return getConnection().getResponseMessage();
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public String method() {
        return getConnection().getRequestMethod();
    }

    public boolean noContent() {
        if (204 == code()) {
            return true;
        }
        return false;
    }

    public boolean notFound() {
        if (404 == code()) {
            return true;
        }
        return false;
    }

    public boolean notModified() {
        if (304 == code()) {
            return true;
        }
        return false;
    }

    public boolean ok() {
        if (200 == code()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public HttpRequest openOutput() {
        if (this.output != null) {
            return this;
        }
        getConnection().setDoOutput(true);
        this.output = new RequestOutputStream(getConnection().getOutputStream(), getParam(getConnection().getRequestProperty(HEADER_CONTENT_TYPE), PARAM_CHARSET), this.bufferSize);
        return this;
    }

    public String parameter(String str, String str2) {
        return getParam(header(str), str2);
    }

    public Map<String, String> parameters(String str) {
        return getParams(header(str));
    }

    public HttpRequest part(String str, String str2) {
        return part(str, (String) null, str2);
    }

    public HttpRequest partHeader(String str, String str2) {
        return send((CharSequence) str).send((CharSequence) ": ").send((CharSequence) str2).send((CharSequence) CRLF);
    }

    public HttpRequest progress(UploadProgress uploadProgress) {
        if (uploadProgress == null) {
            this.progress = UploadProgress.DEFAULT;
        } else {
            this.progress = uploadProgress;
        }
        return this;
    }

    public HttpRequest proxyAuthorization(String str) {
        return header(HEADER_PROXY_AUTHORIZATION, str);
    }

    public HttpRequest proxyBasic(String str, String str2) {
        return proxyAuthorization("Basic " + Base64.encode(str + ':' + str2));
    }

    public HttpRequest readTimeout(int i4) {
        getConnection().setReadTimeout(i4);
        return this;
    }

    public InputStreamReader reader(String str) {
        try {
            return new InputStreamReader(stream(), getValidCharset(str));
        } catch (UnsupportedEncodingException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest receive(File file) {
        try {
            final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.bufferSize);
            return (HttpRequest) new CloseOperation<HttpRequest>(this.ignoreCloseExceptions, bufferedOutputStream) {
                /* access modifiers changed from: protected */
                public HttpRequest run() {
                    return HttpRequest.this.receive(bufferedOutputStream);
                }
            }.call();
        } catch (FileNotFoundException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest referer(String str) {
        return header(HEADER_REFERER, str);
    }

    public HttpRequest send(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            incrementTotalSize(file.length());
            return send((InputStream) bufferedInputStream);
        } catch (FileNotFoundException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public String server() {
        return header(HEADER_SERVER);
    }

    public boolean serverError() {
        if (500 == code()) {
            return true;
        }
        return false;
    }

    public HttpRequest setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        HttpURLConnection connection2 = getConnection();
        if (connection2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) connection2).setHostnameVerifier(hostnameVerifier);
        }
        return this;
    }

    public HttpRequest setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        HttpURLConnection connection2 = getConnection();
        if (connection2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) connection2).setSSLSocketFactory(sSLSocketFactory);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public HttpRequest startPart() {
        if (!this.multipart) {
            this.multipart = true;
            contentType(CONTENT_TYPE_MULTIPART).openOutput();
            this.output.write("--00content0boundary00\r\n");
        } else {
            this.output.write("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    public InputStream stream() {
        InputStream inputStream;
        if (code() < 400) {
            try {
                inputStream = getConnection().getInputStream();
            } catch (IOException e4) {
                throw new HttpRequestException(e4);
            }
        } else {
            inputStream = getConnection().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = getConnection().getInputStream();
                } catch (IOException e5) {
                    if (contentLength() <= 0) {
                        inputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        throw new HttpRequestException(e5);
                    }
                }
            }
        }
        if (!this.uncompress || !ENCODING_GZIP.equals(contentEncoding())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e6) {
            throw new HttpRequestException(e6);
        }
    }

    public String toString() {
        return method() + ' ' + url();
    }

    public HttpRequest uncompress(boolean z3) {
        this.uncompress = z3;
        return this;
    }

    public URL url() {
        return getConnection().getURL();
    }

    public HttpRequest useCaches(boolean z3) {
        getConnection().setUseCaches(z3);
        return this;
    }

    public HttpRequest useProxy(String str, int i4) {
        if (this.connection == null) {
            this.httpProxyHost = str;
            this.httpProxyPort = i4;
            return this;
        }
        throw new IllegalStateException("The connection has already been created. This method must be called before reading or writing to the request.");
    }

    public HttpRequest userAgent(String str) {
        return header(HEADER_USER_AGENT, str);
    }

    /* access modifiers changed from: protected */
    public HttpRequest writePartHeader(String str, String str2) {
        return writePartHeader(str, str2, (String) null);
    }

    public OutputStreamWriter writer() {
        try {
            openOutput();
            RequestOutputStream requestOutputStream = this.output;
            return new OutputStreamWriter(requestOutputStream, requestOutputStream.encoder.charset());
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public static HttpRequest delete(URL url2) {
        return new HttpRequest(url2, METHOD_DELETE);
    }

    public static HttpRequest get(URL url2) {
        return new HttpRequest(url2, METHOD_GET);
    }

    public static HttpRequest head(URL url2) {
        return new HttpRequest(url2, METHOD_HEAD);
    }

    public static HttpRequest options(URL url2) {
        return new HttpRequest(url2, METHOD_OPTIONS);
    }

    public static HttpRequest post(URL url2) {
        return new HttpRequest(url2, METHOD_POST);
    }

    public static HttpRequest put(URL url2) {
        return new HttpRequest(url2, METHOD_PUT);
    }

    public static HttpRequest trace(URL url2) {
        return new HttpRequest(url2, METHOD_TRACE);
    }

    public BufferedReader bufferedReader() {
        return bufferedReader(charset());
    }

    public HttpRequest contentLength(String str) {
        return contentLength(Integer.parseInt(str));
    }

    public HttpRequest contentType(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return header(HEADER_CONTENT_TYPE, str);
        }
        return header(HEADER_CONTENT_TYPE, str + "; charset=" + str2);
    }

    public long dateHeader(String str, long j4) {
        closeOutputQuietly();
        return getConnection().getHeaderFieldDate(str, j4);
    }

    public HttpRequest form(Map.Entry<?, ?> entry) {
        return form(entry, CHARSET_UTF8);
    }

    public HttpRequest header(String str, Number number) {
        return header(str, number != null ? number.toString() : null);
    }

    public boolean ignoreCloseExceptions() {
        return this.ignoreCloseExceptions;
    }

    public int intHeader(String str, int i4) {
        closeOutputQuietly();
        return getConnection().getHeaderFieldInt(str, i4);
    }

    public HttpRequest part(String str, String str2, String str3) {
        return part(str, str2, (String) null, str3);
    }

    /* access modifiers changed from: protected */
    public HttpRequest writePartHeader(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        partHeader("Content-Disposition", sb.toString());
        if (str3 != null) {
            partHeader(HEADER_CONTENT_TYPE, str3);
        }
        return send((CharSequence) CRLF);
    }

    public static HttpRequest delete(CharSequence charSequence, Map<?, ?> map, boolean z3) {
        String append = append(charSequence, map);
        if (z3) {
            append = encode(append);
        }
        return delete((CharSequence) append);
    }

    public static HttpRequest get(CharSequence charSequence, Map<?, ?> map, boolean z3) {
        String append = append(charSequence, map);
        if (z3) {
            append = encode(append);
        }
        return get((CharSequence) append);
    }

    public static HttpRequest head(CharSequence charSequence, Map<?, ?> map, boolean z3) {
        String append = append(charSequence, map);
        if (z3) {
            append = encode(append);
        }
        return head((CharSequence) append);
    }

    public static HttpRequest post(CharSequence charSequence, Map<?, ?> map, boolean z3) {
        String append = append(charSequence, map);
        if (z3) {
            append = encode(append);
        }
        return post((CharSequence) append);
    }

    public static HttpRequest put(CharSequence charSequence, Map<?, ?> map, boolean z3) {
        String append = append(charSequence, map);
        if (z3) {
            append = encode(append);
        }
        return put((CharSequence) append);
    }

    public int bufferSize() {
        return this.bufferSize;
    }

    public HttpRequest contentLength(int i4) {
        getConnection().setFixedLengthStreamingMode(i4);
        return this;
    }

    /* access modifiers changed from: protected */
    public HttpRequest copy(Reader reader, Writer writer) {
        final Reader reader2 = reader;
        final Writer writer2 = writer;
        return (HttpRequest) new CloseOperation<HttpRequest>(reader, this.ignoreCloseExceptions) {
            public HttpRequest run() {
                char[] cArr = new char[HttpRequest.this.bufferSize];
                while (true) {
                    int read = reader2.read(cArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    writer2.write(cArr, 0, read);
                    HttpRequest httpRequest = HttpRequest.this;
                    httpRequest.totalWritten = httpRequest.totalWritten + ((long) read);
                    HttpRequest.this.progress.onUpload(HttpRequest.this.totalWritten, -1);
                }
            }
        }.call();
    }

    public HttpRequest form(Map.Entry<?, ?> entry, String str) {
        return form(entry.getKey(), entry.getValue(), str);
    }

    public HttpRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public HttpRequest part(String str, String str2, String str3, String str4) {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            this.output.write(str4);
            return this;
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public InputStreamReader reader() {
        return reader(charset());
    }

    public HttpRequest code(AtomicInteger atomicInteger) {
        atomicInteger.set(code());
        return this;
    }

    public HttpRequest form(Object obj, Object obj2) {
        return form(obj, obj2, CHARSET_UTF8);
    }

    public String header(String str) {
        closeOutputQuietly();
        return getConnection().getHeaderField(str);
    }

    public Map<String, List<String>> headers() {
        closeOutputQuietly();
        return getConnection().getHeaderFields();
    }

    public static HttpRequest delete(CharSequence charSequence, boolean z3, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z3) {
            append = encode(append);
        }
        return delete((CharSequence) append);
    }

    public static HttpRequest get(CharSequence charSequence, boolean z3, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z3) {
            append = encode(append);
        }
        return get((CharSequence) append);
    }

    public static HttpRequest head(CharSequence charSequence, boolean z3, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z3) {
            append = encode(append);
        }
        return head((CharSequence) append);
    }

    public static HttpRequest post(CharSequence charSequence, boolean z3, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z3) {
            append = encode(append);
        }
        return post((CharSequence) append);
    }

    public static HttpRequest put(CharSequence charSequence, boolean z3, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z3) {
            append = encode(append);
        }
        return put((CharSequence) append);
    }

    public String body() {
        return body(charset());
    }

    public String contentType() {
        return header(HEADER_CONTENT_TYPE);
    }

    public HttpRequest form(Object obj, Object obj2, String str) {
        boolean z3 = this.form;
        if (!z3) {
            contentType(CONTENT_TYPE_FORM, str);
            this.form = true;
        }
        String validCharset = getValidCharset(str);
        try {
            openOutput();
            if (z3) {
                this.output.write(38);
            }
            this.output.write(URLEncoder.encode(obj.toString(), validCharset));
            this.output.write(61);
            if (obj2 != null) {
                this.output.write(URLEncoder.encode(obj2.toString(), validCharset));
            }
            return this;
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest receive(OutputStream outputStream) {
        try {
            return copy((InputStream) buffer(), outputStream);
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest send(byte[] bArr) {
        if (bArr != null) {
            incrementTotalSize((long) bArr.length);
        }
        return send((InputStream) new ByteArrayInputStream(bArr));
    }

    public HttpRequest body(AtomicReference<String> atomicReference) {
        atomicReference.set(body());
        return this;
    }

    public String[] headers(String str) {
        Map<String, List<String>> headers = headers();
        if (headers == null || headers.isEmpty()) {
            return EMPTY_STRINGS;
        }
        List list = headers.get(str);
        if (list == null || list.isEmpty()) {
            return EMPTY_STRINGS;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public HttpRequest body(AtomicReference<String> atomicReference, String str) {
        atomicReference.set(body(str));
        return this;
    }

    public HttpRequest part(String str, Number number) {
        return part(str, (String) null, number);
    }

    public HttpRequest receive(PrintStream printStream) {
        return receive((OutputStream) printStream);
    }

    public HttpRequest send(InputStream inputStream) {
        try {
            openOutput();
            copy(inputStream, (OutputStream) this.output);
            return this;
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest part(String str, String str2, Number number) {
        return part(str, str2, number != null ? number.toString() : null);
    }

    public HttpRequest receive(Appendable appendable) {
        final BufferedReader bufferedReader = bufferedReader();
        final Appendable appendable2 = appendable;
        return (HttpRequest) new CloseOperation<HttpRequest>(bufferedReader, this.ignoreCloseExceptions) {
            public HttpRequest run() {
                CharBuffer allocate = CharBuffer.allocate(HttpRequest.this.bufferSize);
                while (true) {
                    int read = bufferedReader.read(allocate);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    allocate.rewind();
                    appendable2.append(allocate, 0, read);
                    allocate.rewind();
                }
            }
        }.call();
    }

    public HttpRequest part(String str, File file) {
        return part(str, (String) null, file);
    }

    public HttpRequest part(String str, String str2, File file) {
        return part(str, str2, (String) null, file);
    }

    public HttpRequest send(final Reader reader) {
        try {
            openOutput();
            RequestOutputStream requestOutputStream = this.output;
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(requestOutputStream, requestOutputStream.encoder.charset());
            return (HttpRequest) new FlushOperation<HttpRequest>(outputStreamWriter) {
                /* access modifiers changed from: protected */
                public HttpRequest run() {
                    return HttpRequest.this.copy(reader, outputStreamWriter);
                }
            }.call();
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest part(String str, String str2, String str3, File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            incrementTotalSize(file.length());
            return part(str, str2, str3, (InputStream) bufferedInputStream);
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest receive(Writer writer) {
        final BufferedReader bufferedReader = bufferedReader();
        final Writer writer2 = writer;
        return (HttpRequest) new CloseOperation<HttpRequest>(bufferedReader, this.ignoreCloseExceptions) {
            public HttpRequest run() {
                return HttpRequest.this.copy((Reader) bufferedReader, writer2);
            }
        }.call();
    }

    public HttpRequest(URL url2, String str) {
        this.url = url2;
        this.requestMethod = str;
    }

    public static String append(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            addPathSeparator(charSequence2, sb);
            addParamPrefix(charSequence2, sb);
            addParam(objArr[0], objArr[1], sb);
            for (int i4 = 2; i4 < objArr.length; i4 += 2) {
                sb.append('&');
                addParam(objArr[i4], objArr[i4 + 1], sb);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Must specify an even number of parameter names/values");
    }

    public HttpRequest form(Map<?, ?> map, String str) {
        if (!map.isEmpty()) {
            for (Map.Entry<?, ?> form2 : map.entrySet()) {
                form(form2, str);
            }
        }
        return this;
    }

    public HttpRequest part(String str, InputStream inputStream) {
        return part(str, (String) null, (String) null, inputStream);
    }

    public HttpRequest send(CharSequence charSequence) {
        try {
            openOutput();
            this.output.write(charSequence.toString());
            return this;
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest part(String str, String str2, String str3, InputStream inputStream) {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            copy(inputStream, (OutputStream) this.output);
            return this;
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }
}
