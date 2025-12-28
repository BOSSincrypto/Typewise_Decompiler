package org.apache.cordova;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.C0370d;
import java.util.concurrent.ExecutorService;

public interface CordovaInterface {
    C0370d getActivity();

    Context getContext();

    ExecutorService getThreadPool();

    boolean hasPermission(String str);

    Object onMessage(String str, Object obj);

    void requestPermission(CordovaPlugin cordovaPlugin, int i4, String str);

    void requestPermissions(CordovaPlugin cordovaPlugin, int i4, String[] strArr);

    void setActivityResultCallback(CordovaPlugin cordovaPlugin);

    void startActivityForResult(CordovaPlugin cordovaPlugin, Intent intent, int i4);
}
