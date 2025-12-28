package com.silkimen.cordovahttp;

import com.silkimen.http.TLSConfiguration;
import org.json.JSONObject;

class CordovaHttpOperation extends CordovaHttpBase {
    public CordovaHttpOperation(String str, String str2, String str3, Object obj, JSONObject jSONObject, int i4, int i5, boolean z3, String str4, TLSConfiguration tLSConfiguration, CordovaObservableCallbackContext cordovaObservableCallbackContext) {
        super(str, str2, str3, obj, jSONObject, i4, i5, z3, str4, tLSConfiguration, cordovaObservableCallbackContext);
    }

    public CordovaHttpOperation(String str, String str2, JSONObject jSONObject, int i4, int i5, boolean z3, String str3, TLSConfiguration tLSConfiguration, CordovaObservableCallbackContext cordovaObservableCallbackContext) {
        super(str, str2, jSONObject, i4, i5, z3, str3, tLSConfiguration, cordovaObservableCallbackContext);
    }
}
