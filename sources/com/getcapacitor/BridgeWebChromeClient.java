package com.getcapacitor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.activity.result.a;
import androidx.activity.result.c;
import androidx.appcompat.app.C0370d;
import androidx.core.content.FileProvider;
import com.getcapacitor.util.PermissionHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m.b;

public class BridgeWebChromeClient extends WebChromeClient {
    private c activityLauncher;
    private ActivityResultListener activityListener;
    private Bridge bridge;
    private c permissionLauncher;
    private PermissionListener permissionListener;

    private interface ActivityResultListener {
        void onActivityResult(a aVar);
    }

    private interface PermissionListener {
        void onPermissionSelect(Boolean bool);
    }

    public BridgeWebChromeClient(Bridge bridge2) {
        this.bridge = bridge2;
        this.permissionLauncher = bridge2.registerForActivityResult(new b(), new n(this));
        this.activityLauncher = bridge2.registerForActivityResult(new m.c(), new o(this));
    }

    private File createImageFile(Activity activity) {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return File.createTempFile("JPEG_" + format + "_", ".jpg", activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    private Uri createImageFileUri() {
        C0370d activity = this.bridge.getActivity();
        File createImageFile = createImageFile(activity);
        return FileProvider.g(activity, this.bridge.getContext().getPackageName() + ".fileprovider", createImageFile);
    }

    private String[] getValidTypes(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        for (String str : strArr) {
            if (str.startsWith(".")) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(str.substring(1));
                if (mimeTypeFromExtension != null && !arrayList.contains(mimeTypeFromExtension)) {
                    arrayList.add(mimeTypeFromExtension);
                }
            } else if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray();
        return (String[]) Arrays.copyOf(array, array.length, String[].class);
    }

    private boolean isMediaCaptureSupported() {
        if (PermissionHelper.hasPermissions(this.bridge.getContext(), new String[]{"android.permission.CAMERA"}) || !PermissionHelper.hasDefinedPermission(this.bridge.getContext(), "android.permission.CAMERA")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Map map) {
        if (this.permissionListener != null) {
            boolean z3 = true;
            for (Map.Entry value : map.entrySet()) {
                if (!((Boolean) value.getValue()).booleanValue()) {
                    z3 = false;
                }
            }
            this.permissionListener.onPermissionSelect(Boolean.valueOf(z3));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(a aVar) {
        ActivityResultListener activityResultListener = this.activityListener;
        if (activityResultListener != null) {
            activityResultListener.onActivityResult(aVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$11(GeolocationPermissions.Callback callback, String str, Boolean bool) {
        if (bool.booleanValue()) {
            callback.invoke(str, true, false);
            return;
        }
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION"};
        if (Build.VERSION.SDK_INT < 31 || !PermissionHelper.hasPermissions(this.bridge.getContext(), strArr)) {
            callback.invoke(str, false, false);
        } else {
            callback.invoke(str, true, false);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsAlert$3(JsResult jsResult, DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
        jsResult.confirm();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsAlert$4(JsResult jsResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$5(JsResult jsResult, DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
        jsResult.confirm();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$6(JsResult jsResult, DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$7(JsResult jsResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$10(JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsPromptResult.cancel();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$8(EditText editText, JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
        jsPromptResult.confirm(editText.getText().toString().trim());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$9(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i4) {
        dialogInterface.dismiss();
        jsPromptResult.cancel();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPermissionRequest$2(PermissionRequest permissionRequest, Boolean bool) {
        if (bool.booleanValue()) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onShowFileChooser$12(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z3, Boolean bool) {
        if (bool.booleanValue()) {
            showMediaCaptureOrFilePicker(valueCallback, fileChooserParams, z3);
            return;
        }
        Logger.warn(Logger.tags("FileChooser"), "Camera permission not granted");
        valueCallback.onReceiveValue((Object) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$showFilePicker$15(ValueCallback valueCallback, a aVar) {
        Uri[] uriArr;
        Intent t4 = aVar.t();
        if (aVar.u() != -1 || t4.getClipData() == null || t4.getClipData().getItemCount() <= 1) {
            uriArr = WebChromeClient.FileChooserParams.parseResult(aVar.u(), t4);
        } else {
            int itemCount = t4.getClipData().getItemCount();
            uriArr = new Uri[itemCount];
            for (int i4 = 0; i4 < itemCount; i4++) {
                uriArr[i4] = t4.getClipData().getItemAt(i4).getUri();
            }
        }
        valueCallback.onReceiveValue(uriArr);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$showImageCapturePicker$13(Uri uri, ValueCallback valueCallback, a aVar) {
        valueCallback.onReceiveValue(aVar.u() == -1 ? new Uri[]{uri} : null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$showVideoCapturePicker$14(ValueCallback valueCallback, a aVar) {
        valueCallback.onReceiveValue(aVar.u() == -1 ? new Uri[]{aVar.t().getData()} : null);
    }

    private void showFilePicker(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent = fileChooserParams.createIntent();
        if (fileChooserParams.getMode() == 1) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (fileChooserParams.getAcceptTypes().length > 1 || createIntent.getType().startsWith(".")) {
            String[] validTypes = getValidTypes(fileChooserParams.getAcceptTypes());
            createIntent.putExtra("android.intent.extra.MIME_TYPES", validTypes);
            if (createIntent.getType().startsWith(".")) {
                createIntent.setType(validTypes[0]);
            }
        }
        try {
            this.activityListener = new x(valueCallback);
            this.activityLauncher.a(createIntent);
        } catch (ActivityNotFoundException unused) {
            valueCallback.onReceiveValue((Object) null);
        }
    }

    private boolean showImageCapturePicker(ValueCallback<Uri[]> valueCallback) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.bridge.getActivity().getPackageManager()) == null) {
            return false;
        }
        try {
            Uri createImageFileUri = createImageFileUri();
            intent.putExtra("output", createImageFileUri);
            this.activityListener = new p(createImageFileUri, valueCallback);
            this.activityLauncher.a(intent);
            return true;
        } catch (Exception e4) {
            Logger.error("Unable to create temporary media capture file: " + e4.getMessage());
            return false;
        }
    }

    private void showMediaCaptureOrFilePicker(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z3) {
        boolean z4;
        boolean z5;
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || !z4) {
            z5 = showImageCapturePicker(valueCallback);
        } else {
            z5 = showVideoCapturePicker(valueCallback);
        }
        if (!z5) {
            Logger.warn(Logger.tags("FileChooser"), "Media capture intent could not be launched. Falling back to default file picker.");
            showFilePicker(valueCallback, fileChooserParams);
        }
    }

    private boolean showVideoCapturePicker(ValueCallback<Uri[]> valueCallback) {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(this.bridge.getActivity().getPackageManager()) == null) {
            return false;
        }
        this.activityListener = new i(valueCallback);
        this.activityLauncher.a(intent);
        return true;
    }

    public boolean isValidMsg(String str) {
        if (str.contains("%cresult %c") || str.contains("%cnative %c") || str.equalsIgnoreCase("[object Object]") || str.equalsIgnoreCase("console.groupEnd")) {
            return false;
        }
        return true;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String tags = Logger.tags("Console");
        if (consoleMessage.message() != null && isValidMsg(consoleMessage.message())) {
            String format = String.format("File: %s - Line %d - Msg: %s", new Object[]{consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message()});
            String name = consoleMessage.messageLevel().name();
            if ("ERROR".equalsIgnoreCase(name)) {
                Logger.error(tags, format, (Throwable) null);
            } else if ("WARNING".equalsIgnoreCase(name)) {
                Logger.warn(tags, format);
            } else if ("TIP".equalsIgnoreCase(name)) {
                Logger.debug(tags, format);
            } else {
                Logger.info(tags, format);
            }
        }
        return true;
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        Logger.debug("onGeolocationPermissionsShowPrompt: DOING IT HERE FOR ORIGIN: " + str);
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        if (!PermissionHelper.hasPermissions(this.bridge.getContext(), strArr)) {
            this.permissionListener = new m(this, callback, str);
            this.permissionLauncher.a(strArr);
            return;
        }
        callback.invoke(str, true, false);
        Logger.debug("onGeolocationPermissionsShowPrompt: has required permission");
    }

    public void onHideCustomView() {
        super.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.bridge.getActivity().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new j(jsResult)).setOnCancelListener(new k(jsResult));
        builder.create().show();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.bridge.getActivity().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new u(jsResult)).setNegativeButton("Cancel", new v(jsResult)).setOnCancelListener(new w(jsResult));
        builder.create().show();
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (this.bridge.getActivity().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        EditText editText = new EditText(webView.getContext());
        builder.setMessage(str2).setView(editText).setPositiveButton("OK", new q(editText, jsPromptResult)).setNegativeButton("Cancel", new r(jsPromptResult)).setOnCancelListener(new s(jsPromptResult));
        builder.create().show();
        return true;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!arrayList.isEmpty()) {
            this.permissionListener = new t(permissionRequest);
            this.permissionLauncher.a((String[]) arrayList.toArray(new String[0]));
            return;
        }
        permissionRequest.grant(permissionRequest.getResources());
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
        super.onShowCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z3;
        List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        boolean z4 = false;
        if (!isCaptureEnabled || !asList.contains("image/*")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (isCaptureEnabled && asList.contains("video/*")) {
            z4 = true;
        }
        if (!z3 && !z4) {
            showFilePicker(valueCallback, fileChooserParams);
        } else if (isMediaCaptureSupported()) {
            showMediaCaptureOrFilePicker(valueCallback, fileChooserParams, z4);
        } else {
            this.permissionListener = new l(this, valueCallback, fileChooserParams, z4);
            this.permissionLauncher.a(new String[]{"android.permission.CAMERA"});
        }
        return true;
    }
}
