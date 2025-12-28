package org.apache.cordova;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileNotFoundException;
import org.apache.cordova.CordovaResourceApi;
import org.json.JSONArray;

public class CordovaPlugin {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: cordova  reason: collision with root package name */
    public CordovaInterface f15693cordova;
    protected CordovaPreferences preferences;
    private String serviceName;
    public CordovaWebView webView;

    public boolean execute(String str, CordovaArgs cordovaArgs, CallbackContext callbackContext) {
        return false;
    }

    /* access modifiers changed from: protected */
    public Uri fromPluginUri(Uri uri) {
        return Uri.parse(uri.getQueryParameter("origUri"));
    }

    public CordovaPluginPathHandler getPathHandler() {
        return null;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public CordovaResourceApi.OpenForReadResult handleOpenForRead(Uri uri) {
        throw new FileNotFoundException("Plugin can't handle uri: " + uri);
    }

    public boolean hasPermisssion() {
        return true;
    }

    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
    }

    public void onActivityResult(int i4, int i5, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDestroy() {
    }

    public Object onMessage(String str, Object obj) {
        return null;
    }

    public void onNewIntent(Intent intent) {
    }

    public boolean onOverrideUrlLoading(String str) {
        return false;
    }

    public void onPause(boolean z3) {
    }

    public boolean onReceivedClientCertRequest(CordovaWebView cordovaWebView, ICordovaClientCertRequest iCordovaClientCertRequest) {
        return false;
    }

    public boolean onReceivedHttpAuthRequest(CordovaWebView cordovaWebView, ICordovaHttpAuthHandler iCordovaHttpAuthHandler, String str, String str2) {
        return false;
    }

    @Deprecated
    public void onRequestPermissionResult(int i4, String[] strArr, int[] iArr) {
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
    }

    public void onReset() {
    }

    public void onRestoreStateForActivityResult(Bundle bundle, CallbackContext callbackContext) {
    }

    public void onResume(boolean z3) {
    }

    public Bundle onSaveInstanceState() {
        return null;
    }

    public void onStart() {
    }

    public void onStop() {
    }

    /* access modifiers changed from: protected */
    public void pluginInitialize() {
    }

    public final void privateInitialize(String str, CordovaInterface cordovaInterface, CordovaWebView cordovaWebView, CordovaPreferences cordovaPreferences) {
        this.serviceName = str;
        this.f15693cordova = cordovaInterface;
        this.webView = cordovaWebView;
        this.preferences = cordovaPreferences;
        initialize(cordovaInterface, cordovaWebView);
        pluginInitialize();
    }

    public Uri remapUri(Uri uri) {
        return null;
    }

    public void requestPermissions(int i4) {
    }

    public Boolean shouldAllowBridgeAccess(String str) {
        return shouldAllowNavigation(str);
    }

    public Boolean shouldAllowNavigation(String str) {
        return null;
    }

    public Boolean shouldAllowRequest(String str) {
        return null;
    }

    public Boolean shouldOpenExternalUrl(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Uri toPluginUri(Uri uri) {
        return new Uri.Builder().scheme(CordovaResourceApi.PLUGIN_URI_SCHEME).authority(this.serviceName).appendQueryParameter("origUri", uri.toString()).build();
    }

    public boolean execute(String str, String str2, CallbackContext callbackContext) {
        return execute(str, new JSONArray(str2), callbackContext);
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        return execute(str, new CordovaArgs(jSONArray), callbackContext);
    }
}
