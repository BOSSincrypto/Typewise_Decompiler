package com.appfeel.cordova.annotated.android.plugin;

import U0.a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;

public class AnnotatedCordovaPlugin extends CordovaPlugin {

    /* renamed from: b  reason: collision with root package name */
    private static String f10699b = "AnnotatedCordovaPlugin";

    /* renamed from: a  reason: collision with root package name */
    private Map f10700a;

    private Map a() {
        HashMap hashMap = new HashMap();
        for (Method method : getClass().getDeclaredMethods()) {
            a aVar = (a) method.getAnnotation(a.class);
            if (aVar != null) {
                String actionName = aVar.actionName();
                if (actionName.isEmpty()) {
                    actionName = method.getName();
                }
                hashMap.put(actionName, new a(method, aVar.thread(), aVar.isAutofinish()));
                method.setAccessible(true);
            }
        }
        return hashMap;
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        if (this.f10700a == null) {
            this.f10700a = a();
        }
        a aVar = (a) this.f10700a.get(str);
        if (aVar != null) {
            return aVar.e(this.f15693cordova, this, jSONArray, callbackContext);
        }
        LOG.d(f10699b, String.format("Unknown plugin action: %s", new Object[]{str}));
        return false;
    }
}
