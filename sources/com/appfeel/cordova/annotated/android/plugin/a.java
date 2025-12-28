package com.appfeel.cordova.annotated.android.plugin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static String f10702d = "CordovaPluginAction";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Method f10703a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutionThread f10704b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f10705c;

    /* renamed from: com.appfeel.cordova.annotated.android.plugin.a$a  reason: collision with other inner class name */
    class C0158a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AnnotatedCordovaPlugin f10706a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object[] f10707b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CallbackContext f10708c;

        C0158a(AnnotatedCordovaPlugin annotatedCordovaPlugin, Object[] objArr, CallbackContext callbackContext) {
            this.f10706a = annotatedCordovaPlugin;
            this.f10707b = objArr;
            this.f10708c = callbackContext;
        }

        public void run() {
            try {
                a.this.f10703a.invoke(this.f10706a, this.f10707b);
                if (!this.f10708c.isFinished() && a.this.f10705c) {
                    this.f10708c.success();
                }
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = ((InvocationTargetException) th).getTargetException();
                }
                String c4 = a.f10702d;
                LOG.e(c4, "Uncaught exception at " + getClass().getSimpleName() + "@" + a.this.f10703a.getName(), th);
                this.f10708c.error(th.getMessage());
            }
        }
    }

    a(Method method, ExecutionThread executionThread, boolean z3) {
        this.f10703a = method;
        this.f10704b = executionThread;
        this.f10705c = z3;
    }

    private Runnable d(Object[] objArr, AnnotatedCordovaPlugin annotatedCordovaPlugin, CallbackContext callbackContext) {
        return new C0158a(annotatedCordovaPlugin, objArr, callbackContext);
    }

    private static Object[] f(JSONArray jSONArray, CallbackContext callbackContext) {
        int length = jSONArray.length();
        Object[] objArr = new Object[(length + 1)];
        for (int i4 = 0; i4 < length; i4++) {
            Object opt = jSONArray.opt(i4);
            if (JSONObject.NULL.equals(opt)) {
                opt = null;
            }
            objArr[i4] = opt;
        }
        objArr[length] = callbackContext;
        return objArr;
    }

    public boolean e(CordovaInterface cordovaInterface, AnnotatedCordovaPlugin annotatedCordovaPlugin, JSONArray jSONArray, CallbackContext callbackContext) {
        Runnable d4 = d(f(jSONArray, callbackContext), annotatedCordovaPlugin, callbackContext);
        ExecutionThread executionThread = this.f10704b;
        if (executionThread == ExecutionThread.WORKER) {
            cordovaInterface.getThreadPool().execute(d4);
            return true;
        } else if (executionThread == ExecutionThread.UI) {
            cordovaInterface.getActivity().runOnUiThread(d4);
            return true;
        } else {
            d4.run();
            return true;
        }
    }
}
