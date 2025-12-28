package org.apache.cordova.engine;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.MimeTypeMap;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.silkimen.http.HttpRequest;
import f0.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import kotlin.uuid.Uuid;
import org.apache.cordova.AuthenticationToken;
import org.apache.cordova.CordovaClientCertRequest;
import org.apache.cordova.CordovaHttpAuthHandler;
import org.apache.cordova.CordovaPluginPathHandler;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginManager;

public class SystemWebViewClient extends WebViewClient {
    private static final String TAG = "SystemWebViewClient";
    private final d assetLoader;
    private Hashtable<String, AuthenticationToken> authenticationTokens = new Hashtable<>();
    private boolean doClearHistory = false;
    boolean isCurrentlyLoading;
    protected final SystemWebViewEngine parentEngine;

    public SystemWebViewClient(SystemWebViewEngine systemWebViewEngine) {
        this.parentEngine = systemWebViewEngine;
        d.a d4 = new d.a().c(systemWebViewEngine.preferences.getString("hostname", "localhost")).d(true);
        d4.a("/", new a(this, systemWebViewEngine));
        this.assetLoader = d4.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ WebResourceResponse lambda$new$0(SystemWebViewEngine systemWebViewEngine, String str) {
        WebResourceResponse a4;
        try {
            PluginManager pluginManager = this.parentEngine.pluginManager;
            if (pluginManager != null) {
                Iterator<CordovaPluginPathHandler> it = pluginManager.getPluginPathHandlers().iterator();
                while (it.hasNext()) {
                    CordovaPluginPathHandler next = it.next();
                    if (next.getPathHandler() != null && (a4 = next.getPathHandler().a(str)) != null) {
                        return a4;
                    }
                }
            }
            if (str.isEmpty()) {
                str = "index.html";
            }
            AssetManager assets = systemWebViewEngine.webView.getContext().getAssets();
            InputStream open = assets.open("www/" + str, 2);
            String str2 = "text/html";
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            if (fileExtensionFromUrl != null) {
                if (!str.endsWith(".js")) {
                    if (!str.endsWith(".mjs")) {
                        if (str.endsWith(".wasm")) {
                            str2 = "application/wasm";
                        } else {
                            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                        }
                    }
                }
                str2 = "application/javascript";
            }
            return new WebResourceResponse(str2, (String) null, open);
        } catch (Exception e4) {
            e4.printStackTrace();
            LOG.e(TAG, e4.getMessage());
            return null;
        }
    }

    private static boolean needsContentUrlFix(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    private static boolean needsSpecialsInAssetUrlFix(Uri uri) {
        if (CordovaResourceApi.getUriType(uri) != 1) {
            return false;
        }
        if (uri.getQuery() != null || uri.getFragment() != null) {
            return true;
        }
        uri.toString().contains("%");
        return false;
    }

    public void clearAuthenticationTokens() {
        this.authenticationTokens.clear();
    }

    public AuthenticationToken getAuthenticationToken(String str, String str2) {
        AuthenticationToken authenticationToken = this.authenticationTokens.get(str.concat(str2));
        if (authenticationToken != null) {
            return authenticationToken;
        }
        AuthenticationToken authenticationToken2 = this.authenticationTokens.get(str);
        if (authenticationToken2 == null) {
            authenticationToken2 = this.authenticationTokens.get(str2);
        }
        AuthenticationToken authenticationToken3 = authenticationToken2;
        if (authenticationToken3 == null) {
            return this.authenticationTokens.get("");
        }
        return authenticationToken3;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.isCurrentlyLoading || str.startsWith("about:")) {
            this.isCurrentlyLoading = false;
            if (this.doClearHistory) {
                webView.clearHistory();
                this.doClearHistory = false;
            }
            this.parentEngine.client.onPageFinishedLoading(str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.isCurrentlyLoading = true;
        this.parentEngine.bridge.reset();
        this.parentEngine.client.onPageStarted(str);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        PluginManager pluginManager = this.parentEngine.pluginManager;
        if (pluginManager == null || !pluginManager.onReceivedClientCertRequest((CordovaWebView) null, new CordovaClientCertRequest(clientCertRequest))) {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            this.parentEngine.client.clearLoadTimeoutTimer();
        }
    }

    public void onReceivedError(WebView webView, int i4, String str, String str2) {
        if (this.isCurrentlyLoading) {
            LOG.d(TAG, "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s", Integer.valueOf(i4), str, str2);
            if (i4 == -10) {
                this.parentEngine.client.clearLoadTimeoutTimer();
                if (webView.canGoBack()) {
                    webView.goBack();
                    return;
                }
                super.onReceivedError(webView, i4, str, str2);
            }
            this.parentEngine.client.onReceivedError(i4, str, str2);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AuthenticationToken authenticationToken = getAuthenticationToken(str, str2);
        if (authenticationToken != null) {
            httpAuthHandler.proceed(authenticationToken.getUserName(), authenticationToken.getPassword());
            return;
        }
        PluginManager pluginManager = this.parentEngine.pluginManager;
        if (pluginManager == null || !pluginManager.onReceivedHttpAuthRequest((CordovaWebView) null, new CordovaHttpAuthHandler(httpAuthHandler), str, str2)) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            this.parentEngine.client.clearLoadTimeoutTimer();
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            if ((this.parentEngine.f15700cordova.getActivity().getPackageManager().getApplicationInfo(this.parentEngine.f15700cordova.getActivity().getPackageName(), Uuid.SIZE_BITS).flags & 2) != 0) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public AuthenticationToken removeAuthenticationToken(String str, String str2) {
        return this.authenticationTokens.remove(str.concat(str2));
    }

    public void setAuthenticationToken(AuthenticationToken authenticationToken, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.authenticationTokens.put(str.concat(str2), authenticationToken);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if (!this.parentEngine.pluginManager.shouldAllowRequest(str)) {
                LOG.w(TAG, "URL blocked by allow list: " + str);
                return new WebResourceResponse("text/plain", HttpRequest.CHARSET_UTF8, (InputStream) null);
            }
            CordovaResourceApi cordovaResourceApi = this.parentEngine.resourceApi;
            Uri parse = Uri.parse(str);
            Uri remapUri = cordovaResourceApi.remapUri(parse);
            if (parse.equals(remapUri) && !needsSpecialsInAssetUrlFix(parse)) {
                if (!needsContentUrlFix(parse)) {
                    return null;
                }
            }
            CordovaResourceApi.OpenForReadResult openForRead = cordovaResourceApi.openForRead(remapUri, true);
            return new WebResourceResponse(openForRead.mimeType, HttpRequest.CHARSET_UTF8, openForRead.inputStream);
        } catch (IOException e4) {
            if (!(e4 instanceof FileNotFoundException)) {
                LOG.e(TAG, "Error occurred while loading a file (returning a 404).", (Throwable) e4);
            }
            return new WebResourceResponse("text/plain", HttpRequest.CHARSET_UTF8, (InputStream) null);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.parentEngine.client.onNavigationAttempt(str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.assetLoader.a(webResourceRequest.getUrl());
    }
}
