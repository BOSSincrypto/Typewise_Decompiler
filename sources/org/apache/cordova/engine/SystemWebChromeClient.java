package org.apache.cordova.engine;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;
import org.apache.cordova.CordovaDialogsHelper;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;

public class SystemWebChromeClient extends WebChromeClient {
    private static final int FILECHOOSER_RESULTCODE = 5173;
    private static final String LOG_TAG = "SystemWebChromeClient";
    private long MAX_QUOTA = 104857600;
    private Context appContext;
    private CordovaDialogsHelper dialogsHelper;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private View mVideoProgressView;
    protected final SystemWebViewEngine parentEngine;

    public SystemWebChromeClient(SystemWebViewEngine systemWebViewEngine) {
        this.parentEngine = systemWebViewEngine;
        Context context = systemWebViewEngine.webView.getContext();
        this.appContext = context;
        this.dialogsHelper = new CordovaDialogsHelper(context);
    }

    public void destroyLastDialog() {
        this.dialogsHelper.destroyLastDialog();
    }

    public View getVideoLoadingProgressView() {
        if (this.mVideoProgressView == null) {
            LinearLayout linearLayout = new LinearLayout(this.parentEngine.getView().getContext());
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            ProgressBar progressBar = new ProgressBar(this.parentEngine.getView().getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            progressBar.setLayoutParams(layoutParams2);
            linearLayout.addView(progressBar);
            this.mVideoProgressView = linearLayout;
        }
        return this.mVideoProgressView;
    }

    public void onExceededDatabaseQuota(String str, String str2, long j4, long j5, long j6, WebStorage.QuotaUpdater quotaUpdater) {
        LOG.d(LOG_TAG, "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j6));
        quotaUpdater.updateQuota(this.MAX_QUOTA);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
        CordovaPlugin plugin = this.parentEngine.pluginManager.getPlugin("Geolocation");
        if (plugin != null && !plugin.hasPermisssion()) {
            plugin.requestPermissions(0);
        }
    }

    public void onHideCustomView() {
        this.parentEngine.getCordovaWebView().hideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        this.dialogsHelper.showAlert(str2, new CordovaDialogsHelper.Result() {
            public void gotResult(boolean z3, String str) {
                if (z3) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
            }
        });
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        this.dialogsHelper.showConfirm(str2, new CordovaDialogsHelper.Result() {
            public void gotResult(boolean z3, String str) {
                if (z3) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
            }
        });
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        String promptOnJsPrompt = this.parentEngine.bridge.promptOnJsPrompt(str, str2, str3);
        if (promptOnJsPrompt != null) {
            jsPromptResult.confirm(promptOnJsPrompt);
            return true;
        }
        this.dialogsHelper.showPrompt(str2, str3, new CordovaDialogsHelper.Result() {
            public void gotResult(boolean z3, String str) {
                if (z3) {
                    jsPromptResult.confirm(str);
                } else {
                    jsPromptResult.cancel();
                }
            }
        });
        return true;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        LOG.d(LOG_TAG, "onPermissionRequest: " + Arrays.toString(permissionRequest.getResources()));
        permissionRequest.grant(permissionRequest.getResources());
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.parentEngine.getCordovaWebView().showCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Boolean bool = Boolean.FALSE;
        if (fileChooserParams.getMode() == 1) {
            bool = Boolean.TRUE;
        }
        Intent createIntent = fileChooserParams.createIntent();
        createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bool);
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes.length > 1) {
            createIntent.setType("*/*");
            createIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
        }
        try {
            this.parentEngine.f15700cordova.startActivityForResult(new CordovaPlugin() {
                public void onActivityResult(int i4, int i5, Intent intent) {
                    Uri[] uriArr;
                    if (i5 == -1 && intent != null) {
                        if (intent.getClipData() != null) {
                            int itemCount = intent.getClipData().getItemCount();
                            uriArr = new Uri[itemCount];
                            for (int i6 = 0; i6 < itemCount; i6++) {
                                uriArr[i6] = intent.getClipData().getItemAt(i6).getUri();
                                LOG.d(SystemWebChromeClient.LOG_TAG, "Receive file chooser URL: " + uriArr[i6]);
                            }
                        } else if (intent.getData() != null) {
                            uriArr = WebChromeClient.FileChooserParams.parseResult(i5, intent);
                            LOG.d(SystemWebChromeClient.LOG_TAG, "Receive file chooser URL: " + uriArr);
                        }
                        valueCallback.onReceiveValue(uriArr);
                    }
                    uriArr = null;
                    valueCallback.onReceiveValue(uriArr);
                }
            }, createIntent, FILECHOOSER_RESULTCODE);
        } catch (ActivityNotFoundException e4) {
            LOG.w("No activity found to handle file chooser intent.", (Throwable) e4);
            valueCallback.onReceiveValue((Object) null);
        }
        return true;
    }
}
