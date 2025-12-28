package com.silkimen.cordovahttp;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import android.util.Log;
import com.silkimen.http.TLSConfiguration;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Future;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManagerFactory;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONObject;

public class CordovaHttpPlugin extends CordovaPlugin implements Observer {
    private static final String TAG = "Cordova-Plugin-HTTP";
    private HashMap<Integer, Future<?>> reqMap;
    private final Object reqMapLock = new Object();
    private TLSConfiguration tlsConfiguration;

    private boolean abort(JSONArray jSONArray, CallbackContext callbackContext) {
        boolean z3 = false;
        Future future = this.reqMap.get(Integer.valueOf(jSONArray.getInt(0)));
        if (future != null && !future.isDone()) {
            z3 = future.cancel(true);
        }
        callbackContext.success(new JSONObject().put("aborted", z3));
        return true;
    }

    private void addReq(Integer num, Future<?> future, CordovaObservableCallbackContext cordovaObservableCallbackContext) {
        synchronized (this.reqMapLock) {
            try {
                if (!future.isDone()) {
                    this.reqMap.put(num, future);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean downloadFile(JSONArray jSONArray, CallbackContext callbackContext) {
        boolean z3 = jSONArray.getBoolean(5);
        Integer valueOf = Integer.valueOf(jSONArray.getInt(6));
        CordovaObservableCallbackContext cordovaObservableCallbackContext = new CordovaObservableCallbackContext(callbackContext, valueOf);
        startRequest(valueOf, cordovaObservableCallbackContext, new CordovaHttpDownload(jSONArray.getString(0), jSONArray.getJSONObject(1), jSONArray.getString(2), jSONArray.getInt(3) * 1000, jSONArray.getInt(4) * 1000, z3, this.tlsConfiguration, cordovaObservableCallbackContext));
        return true;
    }

    private boolean executeHttpRequestWithData(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        JSONArray jSONArray2 = jSONArray;
        String string = jSONArray2.getString(0);
        Object obj = jSONArray2.get(1);
        String string2 = jSONArray2.getString(2);
        JSONObject jSONObject = jSONArray2.getJSONObject(3);
        int i4 = jSONArray2.getInt(4) * 1000;
        int i5 = jSONArray2.getInt(5) * 1000;
        boolean z3 = jSONArray2.getBoolean(6);
        String string3 = jSONArray2.getString(7);
        Integer valueOf = Integer.valueOf(jSONArray2.getInt(8));
        CordovaObservableCallbackContext cordovaObservableCallbackContext = new CordovaObservableCallbackContext(callbackContext, valueOf);
        CordovaHttpOperation cordovaHttpOperation = r3;
        CordovaHttpOperation cordovaHttpOperation2 = new CordovaHttpOperation(str.toUpperCase(), string, string2, obj, jSONObject, i4, i5, z3, string3, this.tlsConfiguration, cordovaObservableCallbackContext);
        startRequest(valueOf, cordovaObservableCallbackContext, cordovaHttpOperation);
        return true;
    }

    private boolean executeHttpRequestWithoutData(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        boolean z3 = jSONArray.getBoolean(4);
        String string = jSONArray.getString(5);
        Integer valueOf = Integer.valueOf(jSONArray.getInt(6));
        CordovaObservableCallbackContext cordovaObservableCallbackContext = new CordovaObservableCallbackContext(callbackContext, valueOf);
        startRequest(valueOf, cordovaObservableCallbackContext, new CordovaHttpOperation(str.toUpperCase(), jSONArray.getString(0), jSONArray.getJSONObject(1), jSONArray.getInt(2) * 1000, jSONArray.getInt(3) * 1000, z3, string, this.tlsConfiguration, cordovaObservableCallbackContext));
        return true;
    }

    private boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f15693cordova.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private void removeReq(Integer num) {
        synchronized (this.reqMapLock) {
            this.reqMap.remove(num);
        }
    }

    private boolean setClientAuthMode(JSONArray jSONArray, CallbackContext callbackContext) {
        byte[] bArr;
        String str = null;
        if (jSONArray.isNull(2)) {
            bArr = null;
        } else {
            bArr = Base64.decode(jSONArray.getString(2), 0);
        }
        String string = jSONArray.getString(0);
        if (!jSONArray.isNull(1)) {
            str = jSONArray.getString(1);
        }
        this.f15693cordova.getThreadPool().execute(new CordovaClientAuth(string, str, bArr, jSONArray.getString(3), this.f15693cordova.getActivity(), this.f15693cordova.getActivity().getApplicationContext(), this.tlsConfiguration, callbackContext));
        return true;
    }

    private boolean setServerTrustMode(JSONArray jSONArray, CallbackContext callbackContext) {
        this.f15693cordova.getThreadPool().execute(new CordovaServerTrust(jSONArray.getString(0), this.f15693cordova.getActivity(), this.tlsConfiguration, callbackContext));
        return true;
    }

    private void startRequest(Integer num, CordovaObservableCallbackContext cordovaObservableCallbackContext, CordovaHttpBase cordovaHttpBase) {
        synchronized (this.reqMapLock) {
            cordovaObservableCallbackContext.setObserver(this);
            addReq(num, this.f15693cordova.getThreadPool().submit(cordovaHttpBase), cordovaObservableCallbackContext);
        }
    }

    private boolean uploadFiles(JSONArray jSONArray, CallbackContext callbackContext) {
        JSONArray jSONArray2 = jSONArray;
        String string = jSONArray2.getString(0);
        JSONObject jSONObject = jSONArray2.getJSONObject(1);
        JSONArray jSONArray3 = jSONArray2.getJSONArray(2);
        JSONArray jSONArray4 = jSONArray2.getJSONArray(3);
        int i4 = jSONArray2.getInt(4) * 1000;
        int i5 = jSONArray2.getInt(5) * 1000;
        boolean z3 = jSONArray2.getBoolean(6);
        String string2 = jSONArray2.getString(7);
        Integer valueOf = Integer.valueOf(jSONArray2.getInt(8));
        CordovaObservableCallbackContext cordovaObservableCallbackContext = new CordovaObservableCallbackContext(callbackContext, valueOf);
        CordovaHttpUpload cordovaHttpUpload = r3;
        CordovaHttpUpload cordovaHttpUpload2 = new CordovaHttpUpload(string, jSONObject, jSONArray3, jSONArray4, i4, i5, z3, string2, this.tlsConfiguration, this.f15693cordova.getActivity().getApplicationContext(), cordovaObservableCallbackContext);
        startRequest(valueOf, cordovaObservableCallbackContext, cordovaHttpUpload);
        return true;
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        if (str == null) {
            return false;
        }
        if ("setServerTrustMode".equals(str)) {
            return setServerTrustMode(jSONArray, callbackContext);
        }
        if ("setClientAuthMode".equals(str)) {
            return setClientAuthMode(jSONArray, callbackContext);
        }
        if ("abort".equals(str)) {
            return abort(jSONArray, callbackContext);
        }
        if (!isNetworkAvailable()) {
            CordovaHttpResponse cordovaHttpResponse = new CordovaHttpResponse();
            cordovaHttpResponse.setStatus(-6);
            cordovaHttpResponse.setErrorMessage("No network connection available");
            callbackContext.error(cordovaHttpResponse.toJSON());
            return true;
        } else if ("get".equals(str)) {
            return executeHttpRequestWithoutData(str, jSONArray, callbackContext);
        } else {
            if ("head".equals(str)) {
                return executeHttpRequestWithoutData(str, jSONArray, callbackContext);
            }
            if ("delete".equals(str)) {
                return executeHttpRequestWithoutData(str, jSONArray, callbackContext);
            }
            if ("options".equals(str)) {
                return executeHttpRequestWithoutData(str, jSONArray, callbackContext);
            }
            if ("post".equals(str)) {
                return executeHttpRequestWithData(str, jSONArray, callbackContext);
            }
            if ("put".equals(str)) {
                return executeHttpRequestWithData(str, jSONArray, callbackContext);
            }
            if ("patch".equals(str)) {
                return executeHttpRequestWithData(str, jSONArray, callbackContext);
            }
            if ("uploadFiles".equals(str)) {
                return uploadFiles(jSONArray, callbackContext);
            }
            if ("downloadFile".equals(str)) {
                return downloadFile(jSONArray, callbackContext);
            }
            return false;
        }
    }

    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        this.tlsConfiguration = new TLSConfiguration();
        this.reqMap = new HashMap<>();
        try {
            KeyStore instance = KeyStore.getInstance("AndroidCAStore");
            TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.load((KeyStore.LoadStoreParameter) null);
            instance2.init(instance);
            this.tlsConfiguration.setHostnameVerifier((HostnameVerifier) null);
            this.tlsConfiguration.setTrustManagers(instance2.getTrustManagers());
            if (this.preferences.contains("androidblacklistsecuresocketprotocols")) {
                this.tlsConfiguration.setBlacklistedProtocols(this.preferences.getString("androidblacklistsecuresocketprotocols", "").split(","));
            }
        } catch (Exception e4) {
            Log.e(TAG, "An error occured while loading system's CA certificates", e4);
        }
    }

    public void update(Observable observable, Object obj) {
        synchronized (this.reqMapLock) {
            try {
                CordovaObservableCallbackContext cordovaObservableCallbackContext = (CordovaObservableCallbackContext) obj;
                if (cordovaObservableCallbackContext.getCallbackContext().isFinished()) {
                    removeReq(cordovaObservableCallbackContext.getRequestId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
