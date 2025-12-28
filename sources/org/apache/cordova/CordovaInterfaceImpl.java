package org.apache.cordova;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.appcompat.app.C0370d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

public class CordovaInterfaceImpl implements CordovaInterface {
    private static final String TAG = "CordovaInterfaceImpl";
    protected C0370d activity;
    protected CordovaPlugin activityResultCallback;
    protected int activityResultRequestCode;
    protected boolean activityWasDestroyed;
    protected String initCallbackService;
    protected CallbackMap permissionResultCallbacks;
    protected PluginManager pluginManager;
    protected Bundle savedPluginState;
    protected ActivityResultHolder savedResult;
    protected ExecutorService threadPool;

    private static class ActivityResultHolder {
        /* access modifiers changed from: private */
        public Intent intent;
        /* access modifiers changed from: private */
        public int requestCode;
        /* access modifiers changed from: private */
        public int resultCode;

        public ActivityResultHolder(int i4, int i5, Intent intent2) {
            this.requestCode = i4;
            this.resultCode = i5;
            this.intent = intent2;
        }
    }

    public CordovaInterfaceImpl(C0370d dVar) {
        this(dVar, Executors.newCachedThreadPool());
    }

    public C0370d getActivity() {
        return this.activity;
    }

    public Context getContext() {
        return this.activity;
    }

    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    public boolean hasPermission(String str) {
        if (this.activity.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public boolean onActivityResult(int i4, int i5, Intent intent) {
        String str;
        CordovaPlugin cordovaPlugin = this.activityResultCallback;
        if (cordovaPlugin == null && this.initCallbackService != null) {
            this.savedResult = new ActivityResultHolder(i4, i5, intent);
            PluginManager pluginManager2 = this.pluginManager;
            if (!(pluginManager2 == null || (cordovaPlugin = pluginManager2.getPlugin(this.initCallbackService)) == null)) {
                cordovaPlugin.onRestoreStateForActivityResult(this.savedPluginState.getBundle(cordovaPlugin.getServiceName()), new ResumeCallback(cordovaPlugin.getServiceName(), this.pluginManager));
            }
        }
        this.activityResultCallback = null;
        if (cordovaPlugin != null) {
            LOG.d(TAG, "Sending activity result to plugin");
            this.initCallbackService = null;
            this.savedResult = null;
            cordovaPlugin.onActivityResult(i4, i5, intent);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got an activity result, but no plugin was registered to receive it");
        if (this.savedResult != null) {
            str = " yet!";
        } else {
            str = ".";
        }
        sb.append(str);
        LOG.w(TAG, sb.toString());
        return false;
    }

    public void onCordovaInit(PluginManager pluginManager2) {
        CoreAndroid coreAndroid;
        this.pluginManager = pluginManager2;
        ActivityResultHolder activityResultHolder = this.savedResult;
        if (activityResultHolder != null) {
            onActivityResult(activityResultHolder.requestCode, this.savedResult.resultCode, this.savedResult.intent);
        } else if (this.activityWasDestroyed) {
            this.activityWasDestroyed = false;
            if (pluginManager2 != null && (coreAndroid = (CoreAndroid) pluginManager2.getPlugin(CoreAndroid.PLUGIN_NAME)) != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("action", "resume");
                } catch (JSONException e4) {
                    LOG.e(TAG, "Failed to create event message", (Throwable) e4);
                }
                coreAndroid.sendResumeEvent(new PluginResult(PluginResult.Status.OK, jSONObject));
            }
        }
    }

    public Object onMessage(String str, Object obj) {
        if (!"exit".equals(str)) {
            return null;
        }
        this.activity.finish();
        return null;
    }

    public void onRequestPermissionResult(int i4, String[] strArr, int[] iArr) {
        Pair<CordovaPlugin, Integer> andRemoveCallback = this.permissionResultCallbacks.getAndRemoveCallback(i4);
        if (andRemoveCallback != null) {
            ((CordovaPlugin) andRemoveCallback.first).onRequestPermissionResult(((Integer) andRemoveCallback.second).intValue(), strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        CordovaPlugin cordovaPlugin = this.activityResultCallback;
        if (cordovaPlugin != null) {
            bundle.putString("callbackService", cordovaPlugin.getServiceName());
        }
        PluginManager pluginManager2 = this.pluginManager;
        if (pluginManager2 != null) {
            bundle.putBundle("plugin", pluginManager2.onSaveInstanceState());
        }
    }

    public void requestPermission(CordovaPlugin cordovaPlugin, int i4, String str) {
        requestPermissions(cordovaPlugin, i4, new String[]{str});
    }

    public void requestPermissions(CordovaPlugin cordovaPlugin, int i4, String[] strArr) {
        getActivity().requestPermissions(strArr, this.permissionResultCallbacks.registerCallback(cordovaPlugin, i4));
    }

    public void restoreInstanceState(Bundle bundle) {
        this.initCallbackService = bundle.getString("callbackService");
        this.savedPluginState = bundle.getBundle("plugin");
        this.activityWasDestroyed = true;
    }

    public void setActivityResultCallback(CordovaPlugin cordovaPlugin) {
        CordovaPlugin cordovaPlugin2 = this.activityResultCallback;
        if (cordovaPlugin2 != null) {
            cordovaPlugin2.onActivityResult(this.activityResultRequestCode, 0, (Intent) null);
        }
        this.activityResultCallback = cordovaPlugin;
    }

    public void setActivityResultRequestCode(int i4) {
        this.activityResultRequestCode = i4;
    }

    public void startActivityForResult(CordovaPlugin cordovaPlugin, Intent intent, int i4) {
        setActivityResultCallback(cordovaPlugin);
        try {
            this.activity.startActivityForResult(intent, i4);
        } catch (RuntimeException e4) {
            this.activityResultCallback = null;
            throw e4;
        }
    }

    public CordovaInterfaceImpl(C0370d dVar, ExecutorService executorService) {
        this.activityWasDestroyed = false;
        this.activity = dVar;
        this.threadPool = executorService;
        this.permissionResultCallbacks = new CallbackMap();
    }
}
