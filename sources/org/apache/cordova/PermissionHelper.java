package org.apache.cordova;

import java.util.Arrays;
import org.json.JSONException;

public class PermissionHelper {
    private static final String LOG_TAG = "CordovaPermissionHelper";

    private static void deliverPermissionResult(CordovaPlugin cordovaPlugin, int i4, String[] strArr) {
        int[] iArr = new int[strArr.length];
        Arrays.fill(iArr, 0);
        try {
            cordovaPlugin.onRequestPermissionResult(i4, strArr, iArr);
            cordovaPlugin.onRequestPermissionsResult(i4, strArr, iArr);
        } catch (JSONException e4) {
            LOG.e(LOG_TAG, "JSONException when delivering permissions results", (Throwable) e4);
        }
    }

    public static boolean hasPermission(CordovaPlugin cordovaPlugin, String str) {
        return cordovaPlugin.f15693cordova.hasPermission(str);
    }

    public static void requestPermission(CordovaPlugin cordovaPlugin, int i4, String str) {
        requestPermissions(cordovaPlugin, i4, new String[]{str});
    }

    public static void requestPermissions(CordovaPlugin cordovaPlugin, int i4, String[] strArr) {
        cordovaPlugin.f15693cordova.requestPermissions(cordovaPlugin, i4, strArr);
    }
}
