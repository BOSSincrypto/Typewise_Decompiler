package com.silkimen.cordovahttp;

import java.util.Observable;
import java.util.Observer;
import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

public class CordovaObservableCallbackContext {
    private CallbackContext callbackContext;
    private Observer observer;
    private Integer requestId;

    public CordovaObservableCallbackContext(CallbackContext callbackContext2, Integer num) {
        this.callbackContext = callbackContext2;
        this.requestId = num;
    }

    public void error(JSONObject jSONObject) {
        this.callbackContext.error(jSONObject);
        notifyObserver();
    }

    public CallbackContext getCallbackContext() {
        return this.callbackContext;
    }

    public Observer getObserver() {
        return this.observer;
    }

    public Integer getRequestId() {
        return this.requestId;
    }

    /* access modifiers changed from: protected */
    public void notifyObserver() {
        Observer observer2 = this.observer;
        if (observer2 != null) {
            observer2.update((Observable) null, this);
        }
    }

    public void setObserver(Observer observer2) {
        this.observer = observer2;
    }

    public void success(JSONObject jSONObject) {
        this.callbackContext.success(jSONObject);
        notifyObserver();
    }
}
