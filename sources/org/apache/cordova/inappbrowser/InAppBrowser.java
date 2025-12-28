package org.apache.cordova.inappbrowser;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.getcapacitor.Bridge;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaHttpAuthHandler;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppBrowser extends CordovaPlugin {
    private static final String BEFORELOAD = "beforeload";
    private static final String CLEAR_ALL_CACHE = "clearcache";
    private static final String CLEAR_SESSION_CACHE = "clearsessioncache";
    private static final String CLOSE_BUTTON_CAPTION = "closebuttoncaption";
    private static final String CLOSE_BUTTON_COLOR = "closebuttoncolor";
    private static final Boolean DEFAULT_HARDWARE_BACK = Boolean.TRUE;
    private static final String EXIT_EVENT = "exit";
    private static final int FILECHOOSER_REQUESTCODE = 1;
    private static final String FOOTER = "footer";
    private static final String FOOTER_COLOR = "footercolor";
    private static final String FULLSCREEN = "fullscreen";
    private static final String HARDWARE_BACK_BUTTON = "hardwareback";
    private static final String HIDDEN = "hidden";
    private static final String HIDE_NAVIGATION = "hidenavigationbuttons";
    private static final String HIDE_URL = "hideurlbar";
    private static final String LEFT_TO_RIGHT = "lefttoright";
    private static final String LOAD_ERROR_EVENT = "loaderror";
    private static final String LOAD_START_EVENT = "loadstart";
    private static final String LOAD_STOP_EVENT = "loadstop";
    private static final String LOCATION = "location";
    protected static final String LOG_TAG = "InAppBrowser";
    private static final String MEDIA_PLAYBACK_REQUIRES_USER_ACTION = "mediaPlaybackRequiresUserAction";
    private static final String MESSAGE_EVENT = "message";
    private static final String NAVIGATION_COLOR = "navigationbuttoncolor";
    private static final String NULL = "null";
    private static final String SELF = "_self";
    private static final String SHOULD_PAUSE = "shouldPauseOnSuspend";
    private static final String SYSTEM = "_system";
    private static final String TOOLBAR_COLOR = "toolbarcolor";
    private static final String USER_WIDE_VIEW_PORT = "useWideViewPort";
    private static final String ZOOM = "zoom";
    private static final List customizableOptions = Arrays.asList(new String[]{CLOSE_BUTTON_CAPTION, TOOLBAR_COLOR, NAVIGATION_COLOR, CLOSE_BUTTON_COLOR, FOOTER_COLOR});
    /* access modifiers changed from: private */
    public String[] allowedSchemes;
    /* access modifiers changed from: private */
    public String beforeload = "";
    private CallbackContext callbackContext;
    /* access modifiers changed from: private */
    public boolean clearAllCache = false;
    /* access modifiers changed from: private */
    public boolean clearSessionCache = false;
    /* access modifiers changed from: private */
    public String closeButtonCaption = "";
    /* access modifiers changed from: private */
    public String closeButtonColor = "";
    /* access modifiers changed from: private */
    public InAppBrowserClient currentClient;
    /* access modifiers changed from: private */
    public InAppBrowserDialog dialog;
    /* access modifiers changed from: private */
    public EditText edittext;
    /* access modifiers changed from: private */
    public String footerColor = "";
    /* access modifiers changed from: private */
    public boolean fullscreen = true;
    private boolean hadwareBackButton = true;
    /* access modifiers changed from: private */
    public boolean hideNavigationButtons = false;
    /* access modifiers changed from: private */
    public boolean hideUrlBar = false;
    /* access modifiers changed from: private */
    public WebView inAppWebView;
    /* access modifiers changed from: private */
    public boolean leftToRight = false;
    /* access modifiers changed from: private */
    public ValueCallback<Uri[]> mUploadCallback;
    /* access modifiers changed from: private */
    public boolean mediaPlaybackRequiresUserGesture = false;
    /* access modifiers changed from: private */
    public String navigationButtonColor = "";
    /* access modifiers changed from: private */
    public boolean openWindowHidden = false;
    private boolean shouldPauseInAppBrowser = false;
    /* access modifiers changed from: private */
    public boolean showFooter = false;
    private boolean showLocationBar = true;
    /* access modifiers changed from: private */
    public boolean showZoomControls = true;
    /* access modifiers changed from: private */
    public int toolbarColor = -3355444;
    /* access modifiers changed from: private */
    public boolean useWideViewPort = true;

    public class InAppBrowserClient extends WebViewClient {
        String beforeload;
        EditText edittext;
        boolean waitForBeforeload;
        CordovaWebView webView;

        public InAppBrowserClient(CordovaWebView cordovaWebView, EditText editText, String str) {
            boolean z3;
            this.webView = cordovaWebView;
            this.edittext = editText;
            this.beforeload = str;
            if (str != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.waitForBeforeload = z3;
        }

        private boolean sendBeforeLoad(String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", InAppBrowser.BEFORELOAD);
                jSONObject.put("url", str);
                if (str2 != null) {
                    jSONObject.put("method", str2);
                }
                InAppBrowser.this.sendUpdate(jSONObject, true);
                return true;
            } catch (JSONException unused) {
                LOG.e(InAppBrowser.LOG_TAG, "URI passed in has caused a JSON error.");
                return false;
            }
        }

        public void onPageFinished(WebView webView2, String str) {
            super.onPageFinished(webView2, str);
            InAppBrowser.this.injectDeferredObject("window.webkit={messageHandlers:{cordova_iab:cordova_iab}}", (String) null);
            CookieManager.getInstance().flush();
            webView2.clearFocus();
            webView2.requestFocus();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", InAppBrowser.LOAD_STOP_EVENT);
                jSONObject.put("url", str);
                InAppBrowser.this.sendUpdate(jSONObject, true);
            } catch (JSONException unused) {
                LOG.d(InAppBrowser.LOG_TAG, "Should never happen");
            }
        }

        public void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
            super.onPageStarted(webView2, str, bitmap);
            if (!str.startsWith("http:") && !str.startsWith("https:") && !str.startsWith("file:")) {
                LOG.e(InAppBrowser.LOG_TAG, "Possible Uncaught/Unknown URI");
                str = "http://" + str;
            }
            if (!str.equals(this.edittext.getText().toString())) {
                this.edittext.setText(str);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", InAppBrowser.LOAD_START_EVENT);
                jSONObject.put("url", str);
                InAppBrowser.this.sendUpdate(jSONObject, true);
            } catch (JSONException unused) {
                LOG.e(InAppBrowser.LOG_TAG, "URI passed in has caused a JSON error.");
            }
        }

        public void onReceivedError(WebView webView2, int i4, String str, String str2) {
            super.onReceivedError(webView2, i4, str, str2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", InAppBrowser.LOAD_ERROR_EVENT);
                jSONObject.put("url", str2);
                jSONObject.put("code", i4);
                jSONObject.put(InAppBrowser.MESSAGE_EVENT, str);
                InAppBrowser.this.sendUpdate(jSONObject, true, PluginResult.Status.ERROR);
            } catch (JSONException unused) {
                LOG.d(InAppBrowser.LOG_TAG, "Should never happen");
            }
        }

        public void onReceivedHttpAuthRequest(WebView webView2, HttpAuthHandler httpAuthHandler, String str, String str2) {
            PluginManager pluginManager = null;
            try {
                pluginManager = (PluginManager) this.webView.getClass().getMethod("getPluginManager", (Class[]) null).invoke(this.webView, (Object[]) null);
            } catch (NoSuchMethodException e4) {
                LOG.d(InAppBrowser.LOG_TAG, e4.getLocalizedMessage());
            } catch (IllegalAccessException e5) {
                LOG.d(InAppBrowser.LOG_TAG, e5.getLocalizedMessage());
            } catch (InvocationTargetException e6) {
                LOG.d(InAppBrowser.LOG_TAG, e6.getLocalizedMessage());
            }
            if (pluginManager == null) {
                try {
                    pluginManager = (PluginManager) this.webView.getClass().getField("pluginManager").get(this.webView);
                } catch (NoSuchFieldException e7) {
                    LOG.d(InAppBrowser.LOG_TAG, e7.getLocalizedMessage());
                } catch (IllegalAccessException e8) {
                    LOG.d(InAppBrowser.LOG_TAG, e8.getLocalizedMessage());
                }
            }
            if (pluginManager == null || !pluginManager.onReceivedHttpAuthRequest(this.webView, new CordovaHttpAuthHandler(httpAuthHandler), str, str2)) {
                super.onReceivedHttpAuthRequest(webView2, httpAuthHandler, str, str2);
            }
        }

        public void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            super.onReceivedSslError(webView2, sslErrorHandler, sslError);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", InAppBrowser.LOAD_ERROR_EVENT);
                jSONObject.put("url", sslError.getUrl());
                jSONObject.put("code", 0);
                jSONObject.put("sslerror", sslError.getPrimaryError());
                int primaryError = sslError.getPrimaryError();
                if (primaryError == 0) {
                    str = "The certificate is not yet valid";
                } else if (primaryError == 1) {
                    str = "The certificate has expired";
                } else if (primaryError == 2) {
                    str = "Hostname mismatch";
                } else if (primaryError == 3) {
                    str = "The certificate authority is not trusted";
                } else if (primaryError != 4) {
                    str = "A generic error occurred";
                } else {
                    str = "The date of the certificate is invalid";
                }
                jSONObject.put(InAppBrowser.MESSAGE_EVENT, str);
                InAppBrowser.this.sendUpdate(jSONObject, true, PluginResult.Status.ERROR);
            } catch (JSONException unused) {
                LOG.d(InAppBrowser.LOG_TAG, "Should never happen");
            }
            sslErrorHandler.cancel();
        }

        public WebResourceResponse shouldInterceptRequest(String str, WebResourceResponse webResourceResponse, String str2) {
            return webResourceResponse;
        }

        public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
            return shouldOverrideUrlLoading(str, (String) null);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
            return shouldInterceptRequest(webResourceRequest.getUrl().toString(), super.shouldInterceptRequest(webView2, webResourceRequest), webResourceRequest.getMethod());
        }

        public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webResourceRequest.getUrl().toString(), webResourceRequest.getMethod());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v2, types: [int] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0249  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = r11.beforeload
                java.lang.String r1 = "yes"
                boolean r0 = r0.equals(r1)
                r2 = 1
                r3 = 0
                r4 = 0
                if (r0 == 0) goto L_0x0012
                if (r13 != 0) goto L_0x0012
            L_0x000f:
                r1 = r2
            L_0x0010:
                r0 = r4
                goto L_0x0050
            L_0x0012:
                java.lang.String r0 = r11.beforeload
                boolean r0 = r0.equals(r1)
                java.lang.String r1 = "POST"
                if (r0 == 0) goto L_0x0023
                boolean r0 = r13.equals(r1)
                if (r0 != 0) goto L_0x0023
                goto L_0x000f
            L_0x0023:
                java.lang.String r0 = r11.beforeload
                java.lang.String r5 = "get"
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x0038
                if (r13 == 0) goto L_0x000f
                java.lang.String r0 = "GET"
                boolean r0 = r13.equals(r0)
                if (r0 == 0) goto L_0x0038
                goto L_0x000f
            L_0x0038:
                java.lang.String r0 = r11.beforeload
                java.lang.String r5 = "post"
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x004e
                if (r13 == 0) goto L_0x004a
                boolean r0 = r13.equals(r1)
                if (r0 == 0) goto L_0x004e
            L_0x004a:
                java.lang.String r0 = "beforeload doesn't yet support POST requests"
                r1 = r3
                goto L_0x0050
            L_0x004e:
                r1 = r3
                goto L_0x0010
            L_0x0050:
                if (r1 == 0) goto L_0x005d
                boolean r5 = r11.waitForBeforeload
                if (r5 == 0) goto L_0x005d
                boolean r13 = r11.sendBeforeLoad(r12, r13)
                if (r13 == 0) goto L_0x005d
                return r2
            L_0x005d:
                r13 = -1
                java.lang.String r5 = "url"
                java.lang.String r6 = "type"
                java.lang.String r7 = ": "
                java.lang.String r8 = "InAppBrowser"
                if (r0 == 0) goto L_0x00a9
                org.apache.cordova.LOG.e(r8, r0)     // Catch:{ Exception -> 0x008a }
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x008a }
                r9.<init>()     // Catch:{ Exception -> 0x008a }
                java.lang.String r10 = "loaderror"
                r9.put(r6, r10)     // Catch:{ Exception -> 0x008a }
                r9.put(r5, r12)     // Catch:{ Exception -> 0x008a }
                java.lang.String r10 = "code"
                r9.put(r10, r13)     // Catch:{ Exception -> 0x008a }
                java.lang.String r10 = "message"
                r9.put(r10, r0)     // Catch:{ Exception -> 0x008a }
                org.apache.cordova.inappbrowser.InAppBrowser r0 = org.apache.cordova.inappbrowser.InAppBrowser.this     // Catch:{ Exception -> 0x008a }
                org.apache.cordova.PluginResult$Status r10 = org.apache.cordova.PluginResult.Status.ERROR     // Catch:{ Exception -> 0x008a }
                r0.sendUpdate(r9, r2, r10)     // Catch:{ Exception -> 0x008a }
                goto L_0x00a9
            L_0x008a:
                r0 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "Error sending loaderror for "
                r9.append(r10)
                r9.append(r12)
                r9.append(r7)
                java.lang.String r0 = r0.toString()
                r9.append(r0)
                java.lang.String r0 = r9.toString()
                org.apache.cordova.LOG.e(r8, r0)
            L_0x00a9:
                java.lang.String r0 = "tel:"
                boolean r0 = r12.startsWith(r0)
                if (r0 == 0) goto L_0x00ee
                android.content.Intent r13 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00cd }
                java.lang.String r0 = "android.intent.action.DIAL"
                r13.<init>(r0)     // Catch:{ ActivityNotFoundException -> 0x00cd }
                android.net.Uri r0 = android.net.Uri.parse(r12)     // Catch:{ ActivityNotFoundException -> 0x00cd }
                r13.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x00cd }
                org.apache.cordova.inappbrowser.InAppBrowser r0 = org.apache.cordova.inappbrowser.InAppBrowser.this     // Catch:{ ActivityNotFoundException -> 0x00cd }
                org.apache.cordova.CordovaInterface r0 = r0.f15693cordova     // Catch:{ ActivityNotFoundException -> 0x00cd }
                androidx.appcompat.app.d r0 = r0.getActivity()     // Catch:{ ActivityNotFoundException -> 0x00cd }
                r0.startActivity(r13)     // Catch:{ ActivityNotFoundException -> 0x00cd }
            L_0x00ca:
                r3 = r2
                goto L_0x0247
            L_0x00cd:
                r13 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "Error dialing "
                r0.append(r4)
                r0.append(r12)
                r0.append(r7)
                java.lang.String r12 = r13.toString()
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                org.apache.cordova.LOG.e(r8, r12)
                goto L_0x0247
            L_0x00ee:
                java.lang.String r0 = "geo:"
                boolean r0 = r12.startsWith(r0)
                java.lang.String r9 = "android.intent.action.VIEW"
                if (r0 != 0) goto L_0x020f
                java.lang.String r0 = "mailto:"
                boolean r0 = r12.startsWith(r0)
                if (r0 != 0) goto L_0x020f
                java.lang.String r0 = "market:"
                boolean r0 = r12.startsWith(r0)
                if (r0 != 0) goto L_0x020f
                java.lang.String r0 = "intent:"
                boolean r0 = r12.startsWith(r0)
                if (r0 == 0) goto L_0x0112
                goto L_0x020f
            L_0x0112:
                java.lang.String r0 = "sms:"
                boolean r7 = r12.startsWith(r0)
                if (r7 == 0) goto L_0x019e
                android.content.Intent r4 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x012d }
                r4.<init>(r9)     // Catch:{ ActivityNotFoundException -> 0x012d }
                r5 = 63
                int r5 = r12.indexOf(r5)     // Catch:{ ActivityNotFoundException -> 0x012d }
                r6 = 4
                if (r5 != r13) goto L_0x012f
                java.lang.String r13 = r12.substring(r6)     // Catch:{ ActivityNotFoundException -> 0x012d }
                goto L_0x014f
            L_0x012d:
                r13 = move-exception
                goto L_0x017c
            L_0x012f:
                java.lang.String r13 = r12.substring(r6, r5)     // Catch:{ ActivityNotFoundException -> 0x012d }
                android.net.Uri r5 = android.net.Uri.parse(r12)     // Catch:{ ActivityNotFoundException -> 0x012d }
                java.lang.String r5 = r5.getQuery()     // Catch:{ ActivityNotFoundException -> 0x012d }
                if (r5 == 0) goto L_0x014f
                java.lang.String r6 = "body="
                boolean r6 = r5.startsWith(r6)     // Catch:{ ActivityNotFoundException -> 0x012d }
                if (r6 == 0) goto L_0x014f
                java.lang.String r6 = "sms_body"
                r7 = 5
                java.lang.String r5 = r5.substring(r7)     // Catch:{ ActivityNotFoundException -> 0x012d }
                r4.putExtra(r6, r5)     // Catch:{ ActivityNotFoundException -> 0x012d }
            L_0x014f:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x012d }
                r5.<init>()     // Catch:{ ActivityNotFoundException -> 0x012d }
                r5.append(r0)     // Catch:{ ActivityNotFoundException -> 0x012d }
                r5.append(r13)     // Catch:{ ActivityNotFoundException -> 0x012d }
                java.lang.String r0 = r5.toString()     // Catch:{ ActivityNotFoundException -> 0x012d }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x012d }
                r4.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x012d }
                java.lang.String r0 = "address"
                r4.putExtra(r0, r13)     // Catch:{ ActivityNotFoundException -> 0x012d }
                java.lang.String r13 = "vnd.android-dir/mms-sms"
                r4.setType(r13)     // Catch:{ ActivityNotFoundException -> 0x012d }
                org.apache.cordova.inappbrowser.InAppBrowser r13 = org.apache.cordova.inappbrowser.InAppBrowser.this     // Catch:{ ActivityNotFoundException -> 0x012d }
                org.apache.cordova.CordovaInterface r13 = r13.f15693cordova     // Catch:{ ActivityNotFoundException -> 0x012d }
                androidx.appcompat.app.d r13 = r13.getActivity()     // Catch:{ ActivityNotFoundException -> 0x012d }
                r13.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x012d }
                goto L_0x00ca
            L_0x017c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "Error sending sms "
                r0.append(r4)
                r0.append(r12)
                java.lang.String r12 = ":"
                r0.append(r12)
                java.lang.String r12 = r13.toString()
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                org.apache.cordova.LOG.e(r8, r12)
                goto L_0x0247
            L_0x019e:
                java.lang.String r13 = "http:"
                boolean r13 = r12.startsWith(r13)
                if (r13 != 0) goto L_0x0247
                java.lang.String r13 = "https:"
                boolean r13 = r12.startsWith(r13)
                if (r13 != 0) goto L_0x0247
                java.lang.String r13 = "^[A-Za-z0-9+.-]*://.*?$"
                boolean r13 = r12.matches(r13)
                if (r13 == 0) goto L_0x0247
                org.apache.cordova.inappbrowser.InAppBrowser r13 = org.apache.cordova.inappbrowser.InAppBrowser.this
                java.lang.String[] r13 = r13.allowedSchemes
                if (r13 != 0) goto L_0x01d7
                org.apache.cordova.inappbrowser.InAppBrowser r13 = org.apache.cordova.inappbrowser.InAppBrowser.this
                org.apache.cordova.CordovaPreferences r13 = r13.preferences
                java.lang.String r0 = "AllowedSchemes"
                java.lang.String r13 = r13.getString(r0, r4)
                if (r13 == 0) goto L_0x01d7
                org.apache.cordova.inappbrowser.InAppBrowser r0 = org.apache.cordova.inappbrowser.InAppBrowser.this
                java.lang.String r4 = ","
                java.lang.String[] r13 = r13.split(r4)
                r0.allowedSchemes = r13
            L_0x01d7:
                org.apache.cordova.inappbrowser.InAppBrowser r13 = org.apache.cordova.inappbrowser.InAppBrowser.this
                java.lang.String[] r13 = r13.allowedSchemes
                if (r13 == 0) goto L_0x0247
                org.apache.cordova.inappbrowser.InAppBrowser r13 = org.apache.cordova.inappbrowser.InAppBrowser.this
                java.lang.String[] r13 = r13.allowedSchemes
                int r0 = r13.length
                r4 = r3
            L_0x01e7:
                if (r3 >= r0) goto L_0x020d
                r7 = r13[r3]
                boolean r7 = r12.startsWith(r7)
                if (r7 == 0) goto L_0x020a
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0205 }
                r7.<init>()     // Catch:{ JSONException -> 0x0205 }
                java.lang.String r9 = "customscheme"
                r7.put(r6, r9)     // Catch:{ JSONException -> 0x0205 }
                r7.put(r5, r12)     // Catch:{ JSONException -> 0x0205 }
                org.apache.cordova.inappbrowser.InAppBrowser r9 = org.apache.cordova.inappbrowser.InAppBrowser.this     // Catch:{ JSONException -> 0x0205 }
                r9.sendUpdate(r7, r2)     // Catch:{ JSONException -> 0x0205 }
                r4 = r2
                goto L_0x020a
            L_0x0205:
                java.lang.String r7 = "Custom Scheme URI passed in has caused a JSON error."
                org.apache.cordova.LOG.e(r8, r7)
            L_0x020a:
                int r3 = r3 + 1
                goto L_0x01e7
            L_0x020d:
                r3 = r4
                goto L_0x0247
            L_0x020f:
                android.content.Intent r13 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0228 }
                r13.<init>(r9)     // Catch:{ ActivityNotFoundException -> 0x0228 }
                android.net.Uri r0 = android.net.Uri.parse(r12)     // Catch:{ ActivityNotFoundException -> 0x0228 }
                r13.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x0228 }
                org.apache.cordova.inappbrowser.InAppBrowser r0 = org.apache.cordova.inappbrowser.InAppBrowser.this     // Catch:{ ActivityNotFoundException -> 0x0228 }
                org.apache.cordova.CordovaInterface r0 = r0.f15693cordova     // Catch:{ ActivityNotFoundException -> 0x0228 }
                androidx.appcompat.app.d r0 = r0.getActivity()     // Catch:{ ActivityNotFoundException -> 0x0228 }
                r0.startActivity(r13)     // Catch:{ ActivityNotFoundException -> 0x0228 }
                goto L_0x00ca
            L_0x0228:
                r13 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "Error with "
                r0.append(r4)
                r0.append(r12)
                r0.append(r7)
                java.lang.String r12 = r13.toString()
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                org.apache.cordova.LOG.e(r8, r12)
            L_0x0247:
                if (r1 == 0) goto L_0x024b
                r11.waitForBeforeload = r2
            L_0x024b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.inappbrowser.InAppBrowser.InAppBrowserClient.shouldOverrideUrlLoading(java.lang.String, java.lang.String):boolean");
        }
    }

    /* access modifiers changed from: private */
    public InAppBrowser getInAppBrowser() {
        return this;
    }

    /* access modifiers changed from: private */
    public boolean getShowLocationBar() {
        return this.showLocationBar;
    }

    /* access modifiers changed from: private */
    public void goForward() {
        if (this.inAppWebView.canGoForward()) {
            this.inAppWebView.goForward();
        }
    }

    /* access modifiers changed from: private */
    public void injectDeferredObject(final String str, String str2) {
        if (this.inAppWebView != null) {
            if (str2 != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                String jSONArray2 = jSONArray.toString();
                str = String.format(str2, new Object[]{jSONArray2.substring(1, jSONArray2.length() - 1)});
            }
            this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    InAppBrowser.this.inAppWebView.evaluateJavascript(str, (ValueCallback) null);
                }
            });
            return;
        }
        LOG.d(LOG_TAG, "Can't inject code into the system browser");
    }

    /* access modifiers changed from: private */
    public void navigate(String str) {
        ((InputMethodManager) this.f15693cordova.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.edittext.getWindowToken(), 0);
        if (str.startsWith(Bridge.CAPACITOR_HTTP_SCHEME) || str.startsWith("file:")) {
            this.inAppWebView.loadUrl(str);
        } else {
            WebView webView = this.inAppWebView;
            webView.loadUrl("http://" + str);
        }
        this.inAppWebView.requestFocus();
    }

    private void openExternalExcludeCurrentApp(Intent intent) {
        String packageName = this.f15693cordova.getActivity().getPackageName();
        List<ResolveInfo> queryIntentActivities = this.f15693cordova.getActivity().getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (ResolveInfo next : queryIntentActivities) {
            if (!packageName.equals(next.activityInfo.packageName)) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(next.activityInfo.packageName);
                arrayList.add(intent2);
            } else {
                z3 = true;
            }
        }
        if (!z3 || arrayList.size() == 0) {
            this.f15693cordova.getActivity().startActivity(intent);
        } else if (arrayList.size() == 1) {
            this.f15693cordova.getActivity().startActivity((Intent) arrayList.get(0));
        } else if (arrayList.size() > 0) {
            Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), (CharSequence) null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            this.f15693cordova.getActivity().startActivity(createChooser);
        }
    }

    private HashMap<String, String> parseFeature(String str) {
        if (str.equals(NULL)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken(), "=");
            if (stringTokenizer2.hasMoreElements()) {
                String nextToken = stringTokenizer2.nextToken();
                String nextToken2 = stringTokenizer2.nextToken();
                if (!customizableOptions.contains(nextToken) && !nextToken2.equals("yes") && !nextToken2.equals("no")) {
                    nextToken2 = "yes";
                }
                hashMap.put(nextToken, nextToken2);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public void sendUpdate(JSONObject jSONObject, boolean z3) {
        sendUpdate(jSONObject, z3, PluginResult.Status.OK);
    }

    public boolean canGoBack() {
        return this.inAppWebView.canGoBack();
    }

    public void closeDialog() {
        this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                WebView n4 = InAppBrowser.this.inAppWebView;
                if (n4 != null) {
                    n4.setWebViewClient(new WebViewClient() {
                        public void onPageFinished(WebView webView, String str) {
                            if (InAppBrowser.this.dialog != null && !InAppBrowser.this.f15693cordova.getActivity().isFinishing()) {
                                InAppBrowser.this.dialog.dismiss();
                                InAppBrowser.this.dialog = null;
                            }
                        }
                    });
                    n4.loadUrl("about:blank");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", InAppBrowser.EXIT_EVENT);
                        InAppBrowser.this.sendUpdate(jSONObject, false);
                    } catch (JSONException unused) {
                        LOG.d(InAppBrowser.LOG_TAG, "Should never happen");
                    }
                }
            }
        });
    }

    public boolean execute(String str, CordovaArgs cordovaArgs, CallbackContext callbackContext2) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (str.equals("open")) {
            this.callbackContext = callbackContext2;
            final String string = cordovaArgs.getString(0);
            String optString = cordovaArgs.optString(1);
            if (optString == null || optString.equals("") || optString.equals(NULL)) {
                optString = SELF;
            }
            final String str6 = optString;
            final HashMap<String, String> parseFeature = parseFeature(cordovaArgs.optString(2));
            LOG.d(LOG_TAG, "target = " + str6);
            final CallbackContext callbackContext3 = callbackContext2;
            this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    String str;
                    Boolean bool;
                    if (InAppBrowser.SELF.equals(str6)) {
                        LOG.d(InAppBrowser.LOG_TAG, "in self");
                        if (string.startsWith("javascript:")) {
                            bool = Boolean.TRUE;
                        } else {
                            bool = null;
                        }
                        Class<String> cls = String.class;
                        if (bool == null) {
                            try {
                                bool = (Boolean) Config.class.getMethod("isUrlWhiteListed", new Class[]{cls}).invoke((Object) null, new Object[]{string});
                            } catch (NoSuchMethodException e4) {
                                LOG.d(InAppBrowser.LOG_TAG, e4.getLocalizedMessage());
                            } catch (IllegalAccessException e5) {
                                LOG.d(InAppBrowser.LOG_TAG, e5.getLocalizedMessage());
                            } catch (InvocationTargetException e6) {
                                LOG.d(InAppBrowser.LOG_TAG, e6.getLocalizedMessage());
                            }
                        }
                        if (bool == null) {
                            try {
                                PluginManager pluginManager = (PluginManager) InAppBrowser.this.webView.getClass().getMethod("getPluginManager", (Class[]) null).invoke(InAppBrowser.this.webView, (Object[]) null);
                                bool = (Boolean) pluginManager.getClass().getMethod("shouldAllowNavigation", new Class[]{cls}).invoke(pluginManager, new Object[]{string});
                            } catch (NoSuchMethodException e7) {
                                LOG.d(InAppBrowser.LOG_TAG, e7.getLocalizedMessage());
                            } catch (IllegalAccessException e8) {
                                LOG.d(InAppBrowser.LOG_TAG, e8.getLocalizedMessage());
                            } catch (InvocationTargetException e9) {
                                LOG.d(InAppBrowser.LOG_TAG, e9.getLocalizedMessage());
                            }
                        }
                        if (Boolean.TRUE.equals(bool)) {
                            LOG.d(InAppBrowser.LOG_TAG, "loading in webview");
                            InAppBrowser.this.webView.loadUrl(string);
                        } else if (string.startsWith("tel:")) {
                            try {
                                LOG.d(InAppBrowser.LOG_TAG, "loading in dialer");
                                Intent intent = new Intent("android.intent.action.DIAL");
                                intent.setData(Uri.parse(string));
                                InAppBrowser.this.f15693cordova.getActivity().startActivity(intent);
                            } catch (ActivityNotFoundException e10) {
                                LOG.e(InAppBrowser.LOG_TAG, "Error dialing " + string + ": " + e10.toString());
                            }
                        } else {
                            LOG.d(InAppBrowser.LOG_TAG, "loading in InAppBrowser");
                            str = InAppBrowser.this.showWebPage(string, parseFeature);
                        }
                        str = "";
                    } else if (InAppBrowser.SYSTEM.equals(str6)) {
                        LOG.d(InAppBrowser.LOG_TAG, "in system");
                        str = InAppBrowser.this.openExternal(string);
                    } else {
                        LOG.d(InAppBrowser.LOG_TAG, "in blank");
                        str = InAppBrowser.this.showWebPage(string, parseFeature);
                    }
                    PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, str);
                    pluginResult.setKeepCallback(true);
                    callbackContext3.sendPluginResult(pluginResult);
                }
            });
        } else if (str.equals("close")) {
            closeDialog();
        } else if (str.equals("loadAfterBeforeload")) {
            if (this.beforeload == null) {
                LOG.e(LOG_TAG, "unexpected loadAfterBeforeload called without feature beforeload=yes");
            }
            final String string2 = cordovaArgs.getString(0);
            this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    if (Build.VERSION.SDK_INT < 26) {
                        InAppBrowser.this.currentClient.waitForBeforeload = false;
                        InAppBrowser.this.inAppWebView.setWebViewClient(InAppBrowser.this.currentClient);
                    } else {
                        ((InAppBrowserClient) InAppBrowser.this.inAppWebView.getWebViewClient()).waitForBeforeload = false;
                    }
                    InAppBrowser.this.inAppWebView.loadUrl(string2);
                }
            });
        } else if (str.equals("injectScriptCode")) {
            if (cordovaArgs.getBoolean(1)) {
                str5 = String.format("(function(){prompt(JSON.stringify([eval(%%s)]), 'gap-iab://%s')})()", new Object[]{callbackContext2.getCallbackId()});
            } else {
                str5 = null;
            }
            injectDeferredObject(cordovaArgs.getString(0), str5);
        } else if (str.equals("injectScriptFile")) {
            if (cordovaArgs.getBoolean(1)) {
                str4 = String.format("(function(d) { var c = d.createElement('script'); c.src = %%s; c.onload = function() { prompt('', 'gap-iab://%s'); }; d.body.appendChild(c); })(document)", new Object[]{callbackContext2.getCallbackId()});
            } else {
                str4 = "(function(d) { var c = d.createElement('script'); c.src = %s; d.body.appendChild(c); })(document)";
            }
            injectDeferredObject(cordovaArgs.getString(0), str4);
        } else if (str.equals("injectStyleCode")) {
            if (cordovaArgs.getBoolean(1)) {
                str3 = String.format("(function(d) { var c = d.createElement('style'); c.innerHTML = %%s; d.body.appendChild(c); prompt('', 'gap-iab://%s');})(document)", new Object[]{callbackContext2.getCallbackId()});
            } else {
                str3 = "(function(d) { var c = d.createElement('style'); c.innerHTML = %s; d.body.appendChild(c); })(document)";
            }
            injectDeferredObject(cordovaArgs.getString(0), str3);
        } else if (str.equals("injectStyleFile")) {
            if (cordovaArgs.getBoolean(1)) {
                str2 = String.format("(function(d) { var c = d.createElement('link'); c.rel='stylesheet'; c.type='text/css'; c.href = %%s; d.head.appendChild(c); prompt('', 'gap-iab://%s');})(document)", new Object[]{callbackContext2.getCallbackId()});
            } else {
                str2 = "(function(d) { var c = d.createElement('link'); c.rel='stylesheet'; c.type='text/css'; c.href = %s; d.head.appendChild(c); })(document)";
            }
            injectDeferredObject(cordovaArgs.getString(0), str2);
        } else if (str.equals("show")) {
            this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    if (InAppBrowser.this.dialog != null && !InAppBrowser.this.f15693cordova.getActivity().isFinishing()) {
                        InAppBrowser.this.dialog.show();
                    }
                }
            });
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
            pluginResult.setKeepCallback(true);
            this.callbackContext.sendPluginResult(pluginResult);
        } else if (!str.equals("hide")) {
            return false;
        } else {
            this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    if (InAppBrowser.this.dialog != null && !InAppBrowser.this.f15693cordova.getActivity().isFinishing()) {
                        InAppBrowser.this.dialog.hide();
                    }
                }
            });
            PluginResult pluginResult2 = new PluginResult(PluginResult.Status.OK);
            pluginResult2.setKeepCallback(true);
            this.callbackContext.sendPluginResult(pluginResult2);
        }
        return true;
    }

    public void goBack() {
        if (this.inAppWebView.canGoBack()) {
            this.inAppWebView.goBack();
        }
    }

    public boolean hardwareBack() {
        return this.hadwareBackButton;
    }

    public void onActivityResult(int i4, int i5, Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        LOG.d(LOG_TAG, "onActivityResult");
        if (i4 != 1 || (valueCallback = this.mUploadCallback) == null) {
            super.onActivityResult(i4, i5, intent);
            return;
        }
        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i5, intent));
        this.mUploadCallback = null;
    }

    public void onDestroy() {
        closeDialog();
    }

    public void onPause(boolean z3) {
        if (this.shouldPauseInAppBrowser) {
            this.inAppWebView.onPause();
        }
    }

    public void onReset() {
        closeDialog();
    }

    public void onResume(boolean z3) {
        if (this.shouldPauseInAppBrowser) {
            this.inAppWebView.onResume();
        }
    }

    public String openExternal(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if ("file".equals(parse.getScheme())) {
                intent.setDataAndType(parse, this.webView.getResourceApi().getMimeType(parse));
            } else {
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", this.f15693cordova.getActivity().getPackageName());
            openExternalExcludeCurrentApp(intent);
            return "";
        } catch (RuntimeException e4) {
            LOG.d(LOG_TAG, "InAppBrowser: Error loading url " + str + ":" + e4.toString());
            return e4.toString();
        }
    }

    public String showWebPage(final String str, HashMap<String, String> hashMap) {
        boolean z3 = true;
        this.showLocationBar = true;
        this.showZoomControls = true;
        this.openWindowHidden = false;
        this.mediaPlaybackRequiresUserGesture = false;
        if (hashMap != null) {
            String str2 = hashMap.get(LOCATION);
            if (str2 != null) {
                this.showLocationBar = str2.equals("yes");
            }
            if (this.showLocationBar) {
                String str3 = hashMap.get(HIDE_NAVIGATION);
                String str4 = hashMap.get(HIDE_URL);
                if (str3 != null) {
                    this.hideNavigationButtons = str3.equals("yes");
                }
                if (str4 != null) {
                    this.hideUrlBar = str4.equals("yes");
                }
            }
            String str5 = hashMap.get(ZOOM);
            if (str5 != null) {
                this.showZoomControls = str5.equals("yes");
            }
            String str6 = hashMap.get(HIDDEN);
            if (str6 != null) {
                this.openWindowHidden = str6.equals("yes");
            }
            String str7 = hashMap.get(HARDWARE_BACK_BUTTON);
            if (str7 != null) {
                this.hadwareBackButton = str7.equals("yes");
            } else {
                this.hadwareBackButton = DEFAULT_HARDWARE_BACK.booleanValue();
            }
            String str8 = hashMap.get(MEDIA_PLAYBACK_REQUIRES_USER_ACTION);
            if (str8 != null) {
                this.mediaPlaybackRequiresUserGesture = str8.equals("yes");
            }
            String str9 = hashMap.get(CLEAR_ALL_CACHE);
            if (str9 != null) {
                this.clearAllCache = str9.equals("yes");
            } else {
                String str10 = hashMap.get(CLEAR_SESSION_CACHE);
                if (str10 != null) {
                    this.clearSessionCache = str10.equals("yes");
                }
            }
            String str11 = hashMap.get(SHOULD_PAUSE);
            if (str11 != null) {
                this.shouldPauseInAppBrowser = str11.equals("yes");
            }
            String str12 = hashMap.get(USER_WIDE_VIEW_PORT);
            if (str12 != null) {
                this.useWideViewPort = str12.equals("yes");
            }
            String str13 = hashMap.get(CLOSE_BUTTON_CAPTION);
            if (str13 != null) {
                this.closeButtonCaption = str13;
            }
            String str14 = hashMap.get(CLOSE_BUTTON_COLOR);
            if (str14 != null) {
                this.closeButtonColor = str14;
            }
            String str15 = hashMap.get(LEFT_TO_RIGHT);
            if (str15 == null || !str15.equals("yes")) {
                z3 = false;
            }
            this.leftToRight = z3;
            String str16 = hashMap.get(TOOLBAR_COLOR);
            if (str16 != null) {
                this.toolbarColor = Color.parseColor(str16);
            }
            String str17 = hashMap.get(NAVIGATION_COLOR);
            if (str17 != null) {
                this.navigationButtonColor = str17;
            }
            String str18 = hashMap.get(FOOTER);
            if (str18 != null) {
                this.showFooter = str18.equals("yes");
            }
            String str19 = hashMap.get(FOOTER_COLOR);
            if (str19 != null) {
                this.footerColor = str19;
            }
            if (hashMap.get(BEFORELOAD) != null) {
                this.beforeload = hashMap.get(BEFORELOAD);
            }
            String str20 = hashMap.get(FULLSCREEN);
            if (str20 != null) {
                this.fullscreen = str20.equals("yes");
            }
        }
        final CordovaWebView cordovaWebView = this.webView;
        this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.ImageButton} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.widget.ImageButton} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.widget.TextView} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.widget.ImageButton} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private android.view.View createCloseButton(int r7) {
                /*
                    r6 = this;
                    org.apache.cordova.inappbrowser.InAppBrowser r0 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    org.apache.cordova.CordovaInterface r0 = r0.f15693cordova
                    androidx.appcompat.app.d r0 = r0.getActivity()
                    android.content.res.Resources r0 = r0.getResources()
                    org.apache.cordova.inappbrowser.InAppBrowser r1 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    java.lang.String r1 = r1.closeButtonCaption
                    java.lang.String r2 = ""
                    if (r1 == r2) goto L_0x005a
                    android.widget.TextView r0 = new android.widget.TextView
                    org.apache.cordova.inappbrowser.InAppBrowser r1 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    org.apache.cordova.CordovaInterface r1 = r1.f15693cordova
                    androidx.appcompat.app.d r1 = r1.getActivity()
                    r0.<init>(r1)
                    org.apache.cordova.inappbrowser.InAppBrowser r1 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    java.lang.String r1 = r1.closeButtonCaption
                    r0.setText(r1)
                    r1 = 1101004800(0x41a00000, float:20.0)
                    r0.setTextSize(r1)
                    org.apache.cordova.inappbrowser.InAppBrowser r1 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    java.lang.String r1 = r1.closeButtonColor
                    if (r1 == r2) goto L_0x0046
                    org.apache.cordova.inappbrowser.InAppBrowser r1 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    java.lang.String r1 = r1.closeButtonColor
                    int r1 = android.graphics.Color.parseColor(r1)
                    r0.setTextColor(r1)
                L_0x0046:
                    r1 = 16
                    r0.setGravity(r1)
                    r1 = 10
                    int r2 = r6.dpToPixels(r1)
                    int r1 = r6.dpToPixels(r1)
                    r3 = 0
                    r0.setPadding(r2, r3, r1, r3)
                    goto L_0x00a0
                L_0x005a:
                    android.widget.ImageButton r1 = new android.widget.ImageButton
                    org.apache.cordova.inappbrowser.InAppBrowser r3 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    org.apache.cordova.CordovaInterface r3 = r3.f15693cordova
                    androidx.appcompat.app.d r3 = r3.getActivity()
                    r1.<init>(r3)
                    org.apache.cordova.inappbrowser.InAppBrowser r3 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    org.apache.cordova.CordovaInterface r3 = r3.f15693cordova
                    androidx.appcompat.app.d r3 = r3.getActivity()
                    java.lang.String r3 = r3.getPackageName()
                    java.lang.String r4 = "ic_action_remove"
                    java.lang.String r5 = "drawable"
                    int r3 = r0.getIdentifier(r4, r5, r3)
                    android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
                    org.apache.cordova.inappbrowser.InAppBrowser r3 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    java.lang.String r3 = r3.closeButtonColor
                    if (r3 == r2) goto L_0x0094
                    org.apache.cordova.inappbrowser.InAppBrowser r2 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    java.lang.String r2 = r2.closeButtonColor
                    int r2 = android.graphics.Color.parseColor(r2)
                    r1.setColorFilter(r2)
                L_0x0094:
                    r1.setImageDrawable(r0)
                    android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
                    r1.setScaleType(r0)
                    r1.getAdjustViewBounds()
                    r0 = r1
                L_0x00a0:
                    android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
                    r2 = -2
                    r3 = -1
                    r1.<init>(r2, r3)
                    org.apache.cordova.inappbrowser.InAppBrowser r2 = org.apache.cordova.inappbrowser.InAppBrowser.this
                    boolean r2 = r2.leftToRight
                    if (r2 == 0) goto L_0x00b5
                    r2 = 9
                    r1.addRule(r2)
                    goto L_0x00ba
                L_0x00b5:
                    r2 = 11
                    r1.addRule(r2)
                L_0x00ba:
                    r0.setLayoutParams(r1)
                    r1 = 0
                    r0.setBackground(r1)
                    java.lang.String r1 = "Close Button"
                    r0.setContentDescription(r1)
                    r0.setId(r7)
                    org.apache.cordova.inappbrowser.InAppBrowser$7$1 r7 = new org.apache.cordova.inappbrowser.InAppBrowser$7$1
                    r7.<init>()
                    r0.setOnClickListener(r7)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.inappbrowser.InAppBrowser.AnonymousClass7.createCloseButton(int):android.view.View");
            }

            private int dpToPixels(int i4) {
                return (int) TypedValue.applyDimension(1, (float) i4, InAppBrowser.this.f15693cordova.getActivity().getResources().getDisplayMetrics());
            }

            public void run() {
                Integer num;
                int i4;
                boolean z3;
                if (InAppBrowser.this.dialog != null) {
                    InAppBrowser.this.dialog.dismiss();
                }
                InAppBrowser.this.dialog = new InAppBrowserDialog(InAppBrowser.this.f15693cordova.getActivity(), 16973830);
                InAppBrowser.this.dialog.getWindow().getAttributes().windowAnimations = 16973826;
                InAppBrowser.this.dialog.requestWindowFeature(1);
                if (InAppBrowser.this.fullscreen) {
                    InAppBrowser.this.dialog.getWindow().setFlags(1024, 1024);
                }
                InAppBrowser.this.dialog.setCancelable(true);
                InAppBrowser.this.dialog.setInAppBroswer(InAppBrowser.this.getInAppBrowser());
                LinearLayout linearLayout = new LinearLayout(InAppBrowser.this.f15693cordova.getActivity());
                linearLayout.setOrientation(1);
                RelativeLayout relativeLayout = new RelativeLayout(InAppBrowser.this.f15693cordova.getActivity());
                relativeLayout.setBackgroundColor(InAppBrowser.this.toolbarColor);
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, dpToPixels(44)));
                relativeLayout.setPadding(dpToPixels(2), dpToPixels(2), dpToPixels(2), dpToPixels(2));
                if (InAppBrowser.this.leftToRight) {
                    relativeLayout.setHorizontalGravity(3);
                } else {
                    relativeLayout.setHorizontalGravity(5);
                }
                relativeLayout.setVerticalGravity(48);
                RelativeLayout relativeLayout2 = new RelativeLayout(InAppBrowser.this.f15693cordova.getActivity());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (InAppBrowser.this.leftToRight) {
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(9);
                }
                relativeLayout2.setLayoutParams(layoutParams);
                relativeLayout2.setHorizontalGravity(3);
                relativeLayout2.setVerticalGravity(16);
                if (InAppBrowser.this.leftToRight) {
                    num = 5;
                } else {
                    num = 1;
                }
                relativeLayout2.setId(num.intValue());
                ImageButton imageButton = new ImageButton(InAppBrowser.this.f15693cordova.getActivity());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
                layoutParams2.addRule(5);
                imageButton.setLayoutParams(layoutParams2);
                imageButton.setContentDescription("Back Button");
                imageButton.setId(2);
                Resources resources = InAppBrowser.this.f15693cordova.getActivity().getResources();
                Drawable drawable = resources.getDrawable(resources.getIdentifier("ic_action_previous_item", "drawable", InAppBrowser.this.f15693cordova.getActivity().getPackageName()));
                if (InAppBrowser.this.navigationButtonColor != "") {
                    imageButton.setColorFilter(Color.parseColor(InAppBrowser.this.navigationButtonColor));
                }
                imageButton.setBackground((Drawable) null);
                imageButton.setImageDrawable(drawable);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                imageButton.setScaleType(scaleType);
                imageButton.setPadding(0, dpToPixels(10), 0, dpToPixels(10));
                imageButton.getAdjustViewBounds();
                imageButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        InAppBrowser.this.goBack();
                    }
                });
                ImageButton imageButton2 = new ImageButton(InAppBrowser.this.f15693cordova.getActivity());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
                layoutParams3.addRule(1, 2);
                imageButton2.setLayoutParams(layoutParams3);
                imageButton2.setContentDescription("Forward Button");
                imageButton2.setId(3);
                Drawable drawable2 = resources.getDrawable(resources.getIdentifier("ic_action_next_item", "drawable", InAppBrowser.this.f15693cordova.getActivity().getPackageName()));
                if (InAppBrowser.this.navigationButtonColor != "") {
                    imageButton2.setColorFilter(Color.parseColor(InAppBrowser.this.navigationButtonColor));
                }
                imageButton2.setBackground((Drawable) null);
                imageButton2.setImageDrawable(drawable2);
                imageButton2.setScaleType(scaleType);
                imageButton2.setPadding(0, dpToPixels(10), 0, dpToPixels(10));
                imageButton2.getAdjustViewBounds();
                imageButton2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        InAppBrowser.this.goForward();
                    }
                });
                InAppBrowser.this.edittext = new EditText(InAppBrowser.this.f15693cordova.getActivity());
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(1, 1);
                int i5 = 5;
                layoutParams4.addRule(0, 5);
                InAppBrowser.this.edittext.setLayoutParams(layoutParams4);
                InAppBrowser.this.edittext.setId(4);
                InAppBrowser.this.edittext.setSingleLine(true);
                InAppBrowser.this.edittext.setText(str);
                InAppBrowser.this.edittext.setInputType(16);
                InAppBrowser.this.edittext.setImeOptions(2);
                InAppBrowser.this.edittext.setInputType(0);
                InAppBrowser.this.edittext.setOnKeyListener(new View.OnKeyListener() {
                    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
                        if (keyEvent.getAction() != 0 || i4 != 66) {
                            return false;
                        }
                        InAppBrowser inAppBrowser = InAppBrowser.this;
                        inAppBrowser.navigate(inAppBrowser.edittext.getText().toString());
                        return true;
                    }
                });
                if (InAppBrowser.this.leftToRight) {
                    i5 = 1;
                }
                relativeLayout.addView(createCloseButton(i5));
                RelativeLayout relativeLayout3 = new RelativeLayout(InAppBrowser.this.f15693cordova.getActivity());
                if (InAppBrowser.this.footerColor != "") {
                    i4 = Color.parseColor(InAppBrowser.this.footerColor);
                } else {
                    i4 = -3355444;
                }
                relativeLayout3.setBackgroundColor(i4);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, dpToPixels(44));
                layoutParams5.addRule(12, -1);
                relativeLayout3.setLayoutParams(layoutParams5);
                if (InAppBrowser.this.closeButtonCaption != "") {
                    relativeLayout3.setPadding(dpToPixels(8), dpToPixels(8), dpToPixels(8), dpToPixels(8));
                }
                relativeLayout3.setHorizontalGravity(3);
                relativeLayout3.setVerticalGravity(80);
                relativeLayout3.addView(createCloseButton(7));
                InAppBrowser.this.inAppWebView = new WebView(InAppBrowser.this.f15693cordova.getActivity());
                InAppBrowser.this.inAppWebView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                InAppBrowser.this.inAppWebView.setId(6);
                InAppBrowser.this.inAppWebView.setWebChromeClient(new InAppChromeClient(cordovaWebView) {
                    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                        LOG.d(InAppBrowser.LOG_TAG, "File Chooser 5.0+");
                        if (InAppBrowser.this.mUploadCallback != null) {
                            InAppBrowser.this.mUploadCallback.onReceiveValue((Object) null);
                        }
                        InAppBrowser.this.mUploadCallback = valueCallback;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("*/*");
                        InAppBrowser inAppBrowser = InAppBrowser.this;
                        inAppBrowser.f15693cordova.startActivityForResult(inAppBrowser, Intent.createChooser(intent, "Select File"), 1);
                        return true;
                    }
                });
                InAppBrowser inAppBrowser = InAppBrowser.this;
                InAppBrowser inAppBrowser2 = InAppBrowser.this;
                inAppBrowser.currentClient = new InAppBrowserClient(cordovaWebView, inAppBrowser2.edittext, InAppBrowser.this.beforeload);
                InAppBrowser.this.inAppWebView.setWebViewClient(InAppBrowser.this.currentClient);
                WebSettings settings = InAppBrowser.this.inAppWebView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setBuiltInZoomControls(InAppBrowser.this.showZoomControls);
                settings.setPluginState(WebSettings.PluginState.ON);
                settings.setMediaPlaybackRequiresUserGesture(InAppBrowser.this.mediaPlaybackRequiresUserGesture);
                InAppBrowser.this.inAppWebView.addJavascriptInterface(new Object() {
                    @JavascriptInterface
                    public void postMessage(String str) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("type", InAppBrowser.MESSAGE_EVENT);
                            jSONObject.put("data", new JSONObject(str));
                            InAppBrowser.this.sendUpdate(jSONObject, true);
                        } catch (JSONException unused) {
                            LOG.e(InAppBrowser.LOG_TAG, "data object passed to postMessage has caused a JSON error.");
                        }
                    }
                }, "cordova_iab");
                String string = InAppBrowser.this.preferences.getString("OverrideUserAgent", (String) null);
                String string2 = InAppBrowser.this.preferences.getString("AppendUserAgent", (String) null);
                if (string != null) {
                    settings.setUserAgentString(string);
                }
                if (string2 != null) {
                    settings.setUserAgentString(settings.getUserAgentString() + string2);
                }
                Bundle extras = InAppBrowser.this.f15693cordova.getActivity().getIntent().getExtras();
                if (extras == null) {
                    z3 = true;
                } else {
                    z3 = extras.getBoolean("InAppBrowserStorageEnabled", true);
                }
                if (z3) {
                    settings.setDatabasePath(InAppBrowser.this.f15693cordova.getActivity().getApplicationContext().getDir("inAppBrowserDB", 0).getPath());
                    settings.setDatabaseEnabled(true);
                }
                settings.setDomStorageEnabled(true);
                if (InAppBrowser.this.clearAllCache) {
                    CookieManager.getInstance().removeAllCookie();
                } else if (InAppBrowser.this.clearSessionCache) {
                    CookieManager.getInstance().removeSessionCookie();
                }
                CookieManager.getInstance().setAcceptThirdPartyCookies(InAppBrowser.this.inAppWebView, true);
                InAppBrowser.this.inAppWebView.loadUrl(str);
                InAppBrowser.this.inAppWebView.setId(6);
                InAppBrowser.this.inAppWebView.getSettings().setLoadWithOverviewMode(true);
                InAppBrowser.this.inAppWebView.getSettings().setUseWideViewPort(InAppBrowser.this.useWideViewPort);
                InAppBrowser.this.inAppWebView.getSettings().setSupportMultipleWindows(true);
                InAppBrowser.this.inAppWebView.requestFocus();
                InAppBrowser.this.inAppWebView.requestFocusFromTouch();
                relativeLayout2.addView(imageButton);
                relativeLayout2.addView(imageButton2);
                if (!InAppBrowser.this.hideNavigationButtons) {
                    relativeLayout.addView(relativeLayout2);
                }
                if (!InAppBrowser.this.hideUrlBar) {
                    relativeLayout.addView(InAppBrowser.this.edittext);
                }
                if (InAppBrowser.this.getShowLocationBar()) {
                    linearLayout.addView(relativeLayout);
                }
                RelativeLayout relativeLayout4 = new RelativeLayout(InAppBrowser.this.f15693cordova.getActivity());
                relativeLayout4.addView(InAppBrowser.this.inAppWebView);
                linearLayout.addView(relativeLayout4);
                if (InAppBrowser.this.showFooter) {
                    relativeLayout4.addView(relativeLayout3);
                }
                WindowManager.LayoutParams layoutParams6 = new WindowManager.LayoutParams();
                layoutParams6.copyFrom(InAppBrowser.this.dialog.getWindow().getAttributes());
                layoutParams6.width = -1;
                layoutParams6.height = -1;
                if (InAppBrowser.this.dialog != null) {
                    InAppBrowser.this.dialog.setContentView(linearLayout);
                    InAppBrowser.this.dialog.show();
                    InAppBrowser.this.dialog.getWindow().setAttributes(layoutParams6);
                }
                if (InAppBrowser.this.openWindowHidden && InAppBrowser.this.dialog != null) {
                    InAppBrowser.this.dialog.hide();
                }
            }
        });
        return "";
    }

    /* access modifiers changed from: private */
    public void sendUpdate(JSONObject jSONObject, boolean z3, PluginResult.Status status) {
        if (this.callbackContext != null) {
            PluginResult pluginResult = new PluginResult(status, jSONObject);
            pluginResult.setKeepCallback(z3);
            this.callbackContext.sendPluginResult(pluginResult);
            if (!z3) {
                this.callbackContext = null;
            }
        }
    }
}
