package com.silkimen.cordovahttp;

import android.util.Base64;
import android.util.Log;
import com.getcapacitor.PluginMethod;
import com.silkimen.http.HttpBodyDecoder;
import com.silkimen.http.HttpRequest;
import com.silkimen.http.JsonUtils;
import com.silkimen.http.TLSConfiguration;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class CordovaHttpBase implements Runnable {
    protected static final String TAG = "Cordova-Plugin-HTTP";
    protected CordovaObservableCallbackContext callbackContext;
    protected int connectTimeout;
    protected Object data;
    protected boolean followRedirects;
    protected JSONObject headers;
    protected String method;
    protected int readTimeout;
    protected String responseType;
    protected String serializer;
    protected TLSConfiguration tlsConfiguration;
    protected String url;

    public CordovaHttpBase(String str, String str2, String str3, Object obj, JSONObject jSONObject, int i4, int i5, boolean z3, String str4, TLSConfiguration tLSConfiguration, CordovaObservableCallbackContext cordovaObservableCallbackContext) {
        this.method = str;
        this.url = str2;
        this.serializer = str3;
        this.data = obj;
        this.headers = jSONObject;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.followRedirects = z3;
        this.responseType = str4;
        this.tlsConfiguration = tLSConfiguration;
        this.callbackContext = cordovaObservableCallbackContext;
    }

    /* access modifiers changed from: protected */
    public HttpRequest createRequest() {
        return new HttpRequest((CharSequence) this.url, this.method);
    }

    /* access modifiers changed from: protected */
    public void prepareRequest(HttpRequest httpRequest) {
        httpRequest.followRedirects(this.followRedirects);
        httpRequest.connectTimeout(this.connectTimeout);
        httpRequest.readTimeout(this.readTimeout);
        httpRequest.acceptCharset(HttpRequest.CHARSET_UTF8);
        httpRequest.uncompress(true);
        if (this.tlsConfiguration.getHostnameVerifier() != null) {
            httpRequest.setHostnameVerifier(this.tlsConfiguration.getHostnameVerifier());
        }
        httpRequest.setSSLSocketFactory(this.tlsConfiguration.getTLSSocketFactory());
        setContentType(httpRequest);
        httpRequest.headers((Map<String, String>) JsonUtils.getStringMap(this.headers));
    }

    /* access modifiers changed from: protected */
    public void processResponse(HttpRequest httpRequest, CordovaHttpResponse cordovaHttpResponse) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        httpRequest.receive((OutputStream) byteArrayOutputStream);
        cordovaHttpResponse.setStatus(httpRequest.code());
        cordovaHttpResponse.setUrl(httpRequest.url().toString());
        cordovaHttpResponse.setHeaders(httpRequest.headers());
        if (httpRequest.code() < 200 || httpRequest.code() >= 300) {
            cordovaHttpResponse.setErrorMessage(HttpBodyDecoder.decodeBody(byteArrayOutputStream.toByteArray(), httpRequest.charset()));
        } else if ("text".equals(this.responseType) || "json".equals(this.responseType)) {
            cordovaHttpResponse.setBody(HttpBodyDecoder.decodeBody(byteArrayOutputStream.toByteArray(), httpRequest.charset()));
        } else {
            cordovaHttpResponse.setData(byteArrayOutputStream.toByteArray());
        }
    }

    public void run() {
        CordovaHttpResponse cordovaHttpResponse = new CordovaHttpResponse();
        HttpRequest httpRequest = null;
        try {
            httpRequest = createRequest();
            prepareRequest(httpRequest);
            sendBody(httpRequest);
            processResponse(httpRequest, cordovaHttpResponse);
            httpRequest.disconnect();
        } catch (HttpRequest.HttpRequestException e4) {
            IOException cause = e4.getCause();
            String message = cause.getMessage();
            if (cause instanceof SSLException) {
                cordovaHttpResponse.setStatus(-2);
                cordovaHttpResponse.setErrorMessage("TLS connection could not be established: " + e4.getMessage());
                Log.w(TAG, "TLS connection could not be established", e4);
            } else if (cause instanceof UnknownHostException) {
                cordovaHttpResponse.setStatus(-3);
                cordovaHttpResponse.setErrorMessage("Host could not be resolved: " + e4.getMessage());
                Log.w(TAG, "Host could not be resolved", e4);
            } else if (cause instanceof SocketTimeoutException) {
                cordovaHttpResponse.setStatus(-4);
                cordovaHttpResponse.setErrorMessage("Request timed out: " + e4.getMessage());
                Log.w(TAG, "Request timed out", e4);
            } else if (!(cause instanceof InterruptedIOException) || !"thread interrupted".equals(message.toLowerCase())) {
                cordovaHttpResponse.setStatus(-1);
                cordovaHttpResponse.setErrorMessage("There was an error with the request: " + message);
                Log.w(TAG, "Generic request error", e4);
            } else {
                setAborted(httpRequest, cordovaHttpResponse);
            }
        } catch (InterruptedException unused) {
            setAborted(httpRequest, cordovaHttpResponse);
        } catch (Exception e5) {
            cordovaHttpResponse.setStatus(-1);
            cordovaHttpResponse.setErrorMessage(e5.getMessage());
            Log.e(TAG, "An unexpected error occured", e5);
        }
        try {
            if (cordovaHttpResponse.hasFailed()) {
                this.callbackContext.error(cordovaHttpResponse.toJSON());
            } else {
                this.callbackContext.success(cordovaHttpResponse.toJSON());
            }
        } catch (JSONException e6) {
            Log.e(TAG, "An unexpected error occured while creating HTTP response object", e6);
        }
    }

    /* access modifiers changed from: protected */
    public void sendBody(HttpRequest httpRequest) {
        if (this.data != null) {
            if ("json".equals(this.serializer)) {
                httpRequest.send((CharSequence) this.data.toString());
            } else if ("utf8".equals(this.serializer)) {
                httpRequest.send((CharSequence) ((JSONObject) this.data).getString("text"));
            } else if ("raw".equals(this.serializer)) {
                httpRequest.send(Base64.decode((String) this.data, 0));
            } else if ("urlencoded".equals(this.serializer)) {
                httpRequest.form((Map<?, ?>) JsonUtils.getObjectMap((JSONObject) this.data));
            } else if ("multipart".equals(this.serializer)) {
                JSONArray jSONArray = ((JSONObject) this.data).getJSONArray("buffers");
                JSONArray jSONArray2 = ((JSONObject) this.data).getJSONArray("names");
                JSONArray jSONArray3 = ((JSONObject) this.data).getJSONArray("fileNames");
                JSONArray jSONArray4 = ((JSONObject) this.data).getJSONArray("types");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    byte[] decode = Base64.decode(jSONArray.getString(i4), 0);
                    String string = jSONArray2.getString(i4);
                    if (jSONArray3.isNull(i4)) {
                        httpRequest.part(string, new String(decode, HttpRequest.CHARSET_UTF8));
                    } else {
                        httpRequest.part(string, jSONArray3.getString(i4), jSONArray4.getString(i4), (InputStream) new ByteArrayInputStream(decode));
                    }
                }
                if (jSONArray.length() == 0) {
                    httpRequest.contentType("multipart/form-data; boundary=00content0boundary00");
                    httpRequest.send((CharSequence) "\r\n--00content0boundary00--\r\n");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setAborted(HttpRequest httpRequest, CordovaHttpResponse cordovaHttpResponse) {
        cordovaHttpResponse.setStatus(-8);
        cordovaHttpResponse.setErrorMessage("Request was aborted");
        if (httpRequest != null) {
            try {
                httpRequest.disconnect();
            } catch (Exception e4) {
                Log.w(TAG, "Failed to close aborted request", e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setContentType(HttpRequest httpRequest) {
        if ("json".equals(this.serializer)) {
            httpRequest.contentType(HttpRequest.CONTENT_TYPE_JSON, HttpRequest.CHARSET_UTF8);
        } else if ("utf8".equals(this.serializer)) {
            httpRequest.contentType("text/plain", HttpRequest.CHARSET_UTF8);
        } else if ("raw".equals(this.serializer)) {
            httpRequest.contentType("application/octet-stream");
        } else if (!"urlencoded".equals(this.serializer)) {
            "multipart".equals(this.serializer);
        }
    }

    public CordovaHttpBase(String str, String str2, JSONObject jSONObject, int i4, int i5, boolean z3, String str3, TLSConfiguration tLSConfiguration, CordovaObservableCallbackContext cordovaObservableCallbackContext) {
        this.serializer = PluginMethod.RETURN_NONE;
        this.method = str;
        this.url = str2;
        this.headers = jSONObject;
        this.connectTimeout = i4;
        this.readTimeout = i5;
        this.followRedirects = z3;
        this.responseType = str3;
        this.tlsConfiguration = tLSConfiguration;
        this.callbackContext = cordovaObservableCallbackContext;
    }
}
