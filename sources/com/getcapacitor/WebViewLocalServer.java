package com.getcapacitor;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WebViewLocalServer {
    private static final String capacitorContentStart = "/_capacitor_content_";
    private static final String capacitorFileStart = "/_capacitor_file_";
    private final ArrayList<String> authorities;
    /* access modifiers changed from: private */
    public String basePath;
    /* access modifiers changed from: private */
    public final Bridge bridge;
    private final boolean html5mode;
    /* access modifiers changed from: private */
    public boolean isAsset;
    private final JSInjector jsInjector;
    /* access modifiers changed from: private */
    public final AndroidProtocolHandler protocolHandler;
    private final UriMatcher uriMatcher = new UriMatcher((Object) null);

    private static class LollipopLazyInputStream extends LazyInputStream {
        private InputStream is;
        private WebResourceRequest request;

        public LollipopLazyInputStream(PathHandler pathHandler, WebResourceRequest webResourceRequest) {
            super(pathHandler);
            this.request = webResourceRequest;
        }

        /* access modifiers changed from: protected */
        public InputStream handle() {
            return this.handler.handle(this.request);
        }
    }

    public static abstract class PathHandler {
        private String charset;
        private String encoding;
        protected String mimeType;
        private String reasonPhrase;
        private Map<String, String> responseHeaders;
        private int statusCode;

        public PathHandler() {
            this((String) null, (String) null, 200, "OK", (Map<String, String>) null);
        }

        public String getCharset() {
            return this.charset;
        }

        public String getEncoding() {
            return this.encoding;
        }

        public String getReasonPhrase() {
            return this.reasonPhrase;
        }

        public Map<String, String> getResponseHeaders() {
            return this.responseHeaders;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public abstract InputStream handle(Uri uri);

        public InputStream handle(WebResourceRequest webResourceRequest) {
            return handle(webResourceRequest.getUrl());
        }

        public PathHandler(String str, String str2, int i4, String str3, Map<String, String> map) {
            this.encoding = str;
            this.charset = str2;
            this.statusCode = i4;
            this.reasonPhrase = str3;
            map = map == null ? new HashMap<>() : map;
            map.put(HttpRequest.HEADER_CACHE_CONTROL, "no-cache");
            this.responseHeaders = map;
        }
    }

    WebViewLocalServer(Context context, Bridge bridge2, JSInjector jSInjector, ArrayList<String> arrayList, boolean z3) {
        this.html5mode = z3;
        this.protocolHandler = new AndroidProtocolHandler(context.getApplicationContext());
        this.authorities = arrayList;
        this.bridge = bridge2;
        this.jsInjector = jSInjector;
    }

    private void createHostingDetails() {
        final String str = this.basePath;
        if (str.indexOf(42) == -1) {
            AnonymousClass1 r12 = new PathHandler() {
                public InputStream handle(Uri uri) {
                    boolean z3;
                    String path = uri.getPath();
                    RouteProcessor routeProcessor = WebViewLocalServer.this.bridge.getRouteProcessor();
                    if (routeProcessor != null) {
                        ProcessedRoute process = WebViewLocalServer.this.bridge.getRouteProcessor().process("", path);
                        String path2 = process.getPath();
                        WebViewLocalServer.this.isAsset = process.isAsset();
                        String str = path2;
                        z3 = process.isIgnoreAssetPath();
                        path = str;
                    } else {
                        z3 = false;
                    }
                    try {
                        if (path.startsWith("/_capacitor_content_")) {
                            return WebViewLocalServer.this.protocolHandler.openContentUrl(uri);
                        }
                        if (path.startsWith("/_capacitor_file_")) {
                            return WebViewLocalServer.this.protocolHandler.openFile(path);
                        }
                        if (!WebViewLocalServer.this.isAsset) {
                            if (routeProcessor == null) {
                                path = WebViewLocalServer.this.basePath + uri.getPath();
                            }
                            return WebViewLocalServer.this.protocolHandler.openFile(path);
                        } else if (z3) {
                            return WebViewLocalServer.this.protocolHandler.openAsset(path);
                        } else {
                            return WebViewLocalServer.this.protocolHandler.openAsset(str + path);
                        }
                    } catch (IOException unused) {
                        Logger.error("Unable to open asset URL: " + uri);
                        return null;
                    }
                }
            };
            Iterator<String> it = this.authorities.iterator();
            while (it.hasNext()) {
                String next = it.next();
                registerUriForScheme(Bridge.CAPACITOR_HTTP_SCHEME, r12, next);
                registerUriForScheme(Bridge.CAPACITOR_HTTPS_SCHEME, r12, next);
                String scheme = this.bridge.getScheme();
                if (!scheme.equals(Bridge.CAPACITOR_HTTP_SCHEME) && !scheme.equals(Bridge.CAPACITOR_HTTPS_SCHEME)) {
                    registerUriForScheme(scheme, r12, next);
                }
            }
            return;
        }
        throw new IllegalArgumentException("assetPath cannot contain the '*' character.");
    }

    private String getMimeType(String str, InputStream inputStream) {
        String str2;
        try {
            str2 = URLConnection.guessContentTypeFromName(str);
            if (str2 != null) {
                try {
                    if (str.endsWith(".js") && str2.equals("image/x-icon")) {
                        Logger.debug("We shouldn't be here");
                    }
                } catch (Exception e4) {
                    e = e4;
                    Logger.error("Unable to get mime type" + str, e);
                    return str2;
                }
            }
            if (str2 != null) {
                return str2;
            }
            if (!str.endsWith(".js")) {
                if (!str.endsWith(".mjs")) {
                    if (str.endsWith(".wasm")) {
                        return "application/wasm";
                    }
                    return URLConnection.guessContentTypeFromStream(inputStream);
                }
            }
            return "application/javascript";
        } catch (Exception e5) {
            e = e5;
            str2 = null;
            Logger.error("Unable to get mime type" + str, e);
            return str2;
        }
    }

    private int getStatusCode(InputStream inputStream, int i4) {
        try {
            if (inputStream.available() == -1) {
                return 404;
            }
            return i4;
        } catch (IOException unused) {
            return 500;
        }
    }

    private WebResourceResponse handleLocalRequest(WebResourceRequest webResourceRequest, PathHandler pathHandler) {
        InputStream inputStream;
        int i4;
        String path = webResourceRequest.getUrl().getPath();
        if (webResourceRequest.getRequestHeaders().get("Range") != null) {
            LollipopLazyInputStream lollipopLazyInputStream = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            String mimeType = getMimeType(path, lollipopLazyInputStream);
            Map<String, String> responseHeaders = pathHandler.getResponseHeaders();
            try {
                int available = lollipopLazyInputStream.available();
                String[] split = webResourceRequest.getRequestHeaders().get("Range").split("=")[1].split("-");
                String str = split[0];
                int i5 = available - 1;
                if (split.length > 1) {
                    i5 = Integer.parseInt(split[1]);
                }
                responseHeaders.put("Accept-Ranges", "bytes");
                responseHeaders.put("Content-Range", "bytes " + str + "-" + i5 + "/" + available);
                i4 = 206;
            } catch (IOException unused) {
                i4 = 404;
            }
            return new WebResourceResponse(mimeType, pathHandler.getEncoding(), i4, pathHandler.getReasonPhrase(), responseHeaders, lollipopLazyInputStream);
        } else if (isLocalFile(webResourceRequest.getUrl()) || isErrorUrl(webResourceRequest.getUrl())) {
            LollipopLazyInputStream lollipopLazyInputStream2 = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            return new WebResourceResponse(getMimeType(webResourceRequest.getUrl().getPath(), lollipopLazyInputStream2), pathHandler.getEncoding(), getStatusCode(lollipopLazyInputStream2, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), lollipopLazyInputStream2);
        } else if (path.equals("/cordova.js")) {
            return new WebResourceResponse("application/javascript", pathHandler.getEncoding(), pathHandler.getStatusCode(), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), (InputStream) null);
        } else {
            if (path.equals("/") || (!webResourceRequest.getUrl().getLastPathSegment().contains(".") && this.html5mode)) {
                try {
                    String str2 = this.basePath + "/index.html";
                    if (this.bridge.getRouteProcessor() != null) {
                        ProcessedRoute process = this.bridge.getRouteProcessor().process(this.basePath, "/index.html");
                        String path2 = process.getPath();
                        this.isAsset = process.isAsset();
                        str2 = path2;
                    }
                    if (this.isAsset) {
                        inputStream = this.protocolHandler.openAsset(str2);
                    } else {
                        inputStream = this.protocolHandler.openFile(str2);
                    }
                    InputStream injectedStream = this.jsInjector.getInjectedStream(inputStream);
                    return new WebResourceResponse("text/html", pathHandler.getEncoding(), getStatusCode(injectedStream, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), injectedStream);
                } catch (IOException e4) {
                    Logger.error("Unable to open index.html", e4);
                    return null;
                }
            } else {
                if ("/favicon.ico".equalsIgnoreCase(path)) {
                    try {
                        return new WebResourceResponse("image/png", (String) null, (InputStream) null);
                    } catch (Exception e5) {
                        Logger.error("favicon handling failed", e5);
                    }
                }
                if (path.lastIndexOf(".") < 0) {
                    return null;
                }
                String substring = path.substring(path.lastIndexOf("."));
                InputStream lollipopLazyInputStream3 = new LollipopLazyInputStream(pathHandler, webResourceRequest);
                if (substring.equals(".html")) {
                    lollipopLazyInputStream3 = this.jsInjector.getInjectedStream(lollipopLazyInputStream3);
                }
                InputStream inputStream2 = lollipopLazyInputStream3;
                return new WebResourceResponse(getMimeType(path, inputStream2), pathHandler.getEncoding(), getStatusCode(inputStream2, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), inputStream2);
            }
        }
    }

    private WebResourceResponse handleProxyRequest(WebResourceRequest webResourceRequest, PathHandler pathHandler) {
        String method = webResourceRequest.getMethod();
        if (!method.equals(HttpRequest.METHOD_GET)) {
            return null;
        }
        try {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            for (Map.Entry next : requestHeaders.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase(HttpRequest.HEADER_ACCEPT) && ((String) next.getValue()).toLowerCase().contains("text/html")) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    for (Map.Entry next2 : requestHeaders.entrySet()) {
                        httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
                    }
                    String cookie = CookieManager.getInstance().getCookie(uri);
                    if (cookie != null) {
                        httpURLConnection.setRequestProperty("Cookie", cookie);
                    }
                    httpURLConnection.setRequestMethod(method);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setConnectTimeout(30000);
                    if (webResourceRequest.getUrl().getUserInfo() != null) {
                        String encodeToString = Base64.encodeToString(webResourceRequest.getUrl().getUserInfo().getBytes(StandardCharsets.UTF_8), 2);
                        httpURLConnection.setRequestProperty(HttpRequest.HEADER_AUTHORIZATION, "Basic " + encodeToString);
                    }
                    List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
                    if (list != null) {
                        for (String cookie2 : list) {
                            CookieManager.getInstance().setCookie(uri, cookie2);
                        }
                    }
                    return new WebResourceResponse("text/html", pathHandler.getEncoding(), pathHandler.getStatusCode(), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), this.jsInjector.getInjectedStream(httpURLConnection.getInputStream()));
                }
            }
            return null;
        } catch (Exception e4) {
            this.bridge.handleAppUrlLoadError(e4);
            return null;
        }
    }

    private boolean isAllowedUrl(Uri uri) {
        if (this.bridge.getServerUrl() != null || this.bridge.getAppAllowNavigationMask().matches(uri.getHost())) {
            return true;
        }
        return false;
    }

    private boolean isErrorUrl(Uri uri) {
        return uri.toString().equals(this.bridge.getErrorUrl());
    }

    private boolean isLocalFile(Uri uri) {
        String path = uri.getPath();
        if (path.startsWith("/_capacitor_content_") || path.startsWith("/_capacitor_file_")) {
            return true;
        }
        return false;
    }

    private boolean isMainUrl(Uri uri) {
        if (this.bridge.getServerUrl() != null || !uri.getHost().equalsIgnoreCase(this.bridge.getHost())) {
            return false;
        }
        return true;
    }

    private static Uri parseAndVerifyUrl(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            Logger.error("Malformed URL: " + str);
            return null;
        }
        String path = parse.getPath();
        if (path != null && !path.isEmpty()) {
            return parse;
        }
        Logger.error("URL does not have a path: " + str);
        return null;
    }

    private void registerUriForScheme(String str, PathHandler pathHandler, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority(str2);
        builder.path("");
        Uri build = builder.build();
        register(Uri.withAppendedPath(build, "/"), pathHandler);
        register(Uri.withAppendedPath(build, "**"), pathHandler);
    }

    public String getBasePath() {
        return this.basePath;
    }

    public void hostAssets(String str) {
        this.isAsset = true;
        this.basePath = str;
        createHostingDetails();
    }

    public void hostFiles(String str) {
        this.isAsset = false;
        this.basePath = str;
        createHostingDetails();
    }

    /* access modifiers changed from: package-private */
    public void register(Uri uri, PathHandler pathHandler) {
        synchronized (this.uriMatcher) {
            this.uriMatcher.addURI(uri.getScheme(), uri.getAuthority(), uri.getPath(), pathHandler);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        PathHandler pathHandler;
        Uri url = webResourceRequest.getUrl();
        synchronized (this.uriMatcher) {
            pathHandler = (PathHandler) this.uriMatcher.match(webResourceRequest.getUrl());
        }
        if (pathHandler == null) {
            return null;
        }
        if (!isLocalFile(url) && !isMainUrl(url) && isAllowedUrl(url) && !isErrorUrl(url)) {
            return handleProxyRequest(webResourceRequest, pathHandler);
        }
        Logger.debug("Handling local request: " + webResourceRequest.getUrl().toString());
        return handleLocalRequest(webResourceRequest, pathHandler);
    }

    private static abstract class LazyInputStream extends InputStream {
        protected final PathHandler handler;
        private InputStream is = null;

        public LazyInputStream(PathHandler pathHandler) {
            this.handler = pathHandler;
        }

        private InputStream getInputStream() {
            if (this.is == null) {
                this.is = handle();
            }
            return this.is;
        }

        public int available() {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.available();
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public abstract InputStream handle();

        public int read() {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read();
            }
            return -1;
        }

        public long skip(long j4) {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.skip(j4);
            }
            return 0;
        }

        public int read(byte[] bArr) {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr);
            }
            return -1;
        }

        public int read(byte[] bArr, int i4, int i5) {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr, i4, i5);
            }
            return -1;
        }
    }
}
