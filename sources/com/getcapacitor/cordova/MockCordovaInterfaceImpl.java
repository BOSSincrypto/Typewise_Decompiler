package com.getcapacitor.cordova;

import android.util.Pair;
import androidx.appcompat.app.C0370d;
import java.util.concurrent.Executors;
import org.apache.cordova.CordovaInterfaceImpl;
import org.apache.cordova.CordovaPlugin;

public class MockCordovaInterfaceImpl extends CordovaInterfaceImpl {
    public MockCordovaInterfaceImpl(C0370d dVar) {
        super(dVar, Executors.newCachedThreadPool());
    }

    public CordovaPlugin getActivityResultCallback() {
        return this.activityResultCallback;
    }

    public boolean handlePermissionResult(int i4, String[] strArr, int[] iArr) {
        Pair<CordovaPlugin, Integer> andRemoveCallback = this.permissionResultCallbacks.getAndRemoveCallback(i4);
        if (andRemoveCallback == null) {
            return false;
        }
        ((CordovaPlugin) andRemoveCallback.first).onRequestPermissionResult(((Integer) andRemoveCallback.second).intValue(), strArr, iArr);
        return true;
    }
}
