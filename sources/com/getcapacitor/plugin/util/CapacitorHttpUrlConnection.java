package com.getcapacitor.plugin.util;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.getcapacitor.Bridge;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.JSValue;
import com.getcapacitor.PluginCall;
import com.silkimen.http.HttpRequest;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

public class CapacitorHttpUrlConnection implements ICapacitorHttpUrlConnection {
    private final HttpURLConnection connection;

    public CapacitorHttpUrlConnection(HttpURLConnection httpURLConnection) {
        this.connection = httpURLConnection;
        setDefaultRequestProperties();
    }

    private String buildDefaultAcceptLanguageProperty() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(language)) {
            return "";
        }
        if (!TextUtils.isEmpty(country)) {
            return String.format("%s-%s,%s;q=0.5", new Object[]{language, country, language});
        }
        return String.format("%s;q=0.5", new Object[]{language});
    }

    private void setDefaultRequestProperties() {
        this.connection.setRequestProperty(HttpRequest.HEADER_ACCEPT_CHARSET, StandardCharsets.UTF_8.name());
        String buildDefaultAcceptLanguageProperty = buildDefaultAcceptLanguageProperty();
        if (!TextUtils.isEmpty(buildDefaultAcceptLanguageProperty)) {
            this.connection.setRequestProperty("Accept-Language", buildDefaultAcceptLanguageProperty);
        }
    }

    private void writeFormDataRequestBody(String str, JSArray jSArray) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.connection.getOutputStream());
        try {
            String str2 = str.split(";")[1].split("=")[1];
            for (Object next : jSArray.toList()) {
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    String string = jSONObject.getString("type");
                    String string2 = jSONObject.getString("key");
                    String string3 = jSONObject.getString("value");
                    if (string.equals("string")) {
                        dataOutputStream.writeBytes("--" + str2 + "\r\n");
                        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + string2 + "\"" + "\r\n" + "\r\n");
                        dataOutputStream.writeBytes(string3);
                        dataOutputStream.writeBytes("\r\n");
                    } else if (string.equals("base64File")) {
                        String string4 = jSONObject.getString("fileName");
                        String string5 = jSONObject.getString("contentType");
                        dataOutputStream.writeBytes("--" + str2 + "\r\n");
                        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + string2 + "\"; filename=\"" + string4 + "\"" + "\r\n");
                        StringBuilder sb = new StringBuilder();
                        sb.append("Content-Type: ");
                        sb.append(string5);
                        sb.append("\r\n");
                        dataOutputStream.writeBytes(sb.toString());
                        dataOutputStream.writeBytes("Content-Transfer-Encoding: binary" + "\r\n");
                        dataOutputStream.writeBytes("\r\n");
                        if (Build.VERSION.SDK_INT >= 26) {
                            dataOutputStream.write(Base64.getDecoder().decode(string3));
                        }
                        dataOutputStream.writeBytes("\r\n");
                    }
                }
            }
            dataOutputStream.writeBytes("--" + str2 + "--" + "\r\n");
            dataOutputStream.flush();
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private void writeRequestBody(String str) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.connection.getOutputStream());
        try {
            dataOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            dataOutputStream.flush();
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void connect() {
        this.connection.connect();
    }

    public InputStream getErrorStream() {
        return this.connection.getErrorStream();
    }

    public String getHeaderField(String str) {
        return this.connection.getHeaderField(str);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.connection.getHeaderFields();
    }

    public HttpURLConnection getHttpConnection() {
        return this.connection;
    }

    public InputStream getInputStream() {
        return this.connection.getInputStream();
    }

    public int getResponseCode() {
        return this.connection.getResponseCode();
    }

    public URL getURL() {
        return this.connection.getURL();
    }

    public void setAllowUserInteraction(boolean z3) {
        this.connection.setAllowUserInteraction(z3);
    }

    public void setConnectTimeout(int i4) {
        if (i4 >= 0) {
            this.connection.setConnectTimeout(i4);
            return;
        }
        throw new IllegalArgumentException("timeout can not be negative");
    }

    public void setDisableRedirects(boolean z3) {
        this.connection.setInstanceFollowRedirects(!z3);
    }

    public void setDoOutput(boolean z3) {
        this.connection.setDoOutput(z3);
    }

    public void setReadTimeout(int i4) {
        if (i4 >= 0) {
            this.connection.setReadTimeout(i4);
            return;
        }
        throw new IllegalArgumentException("timeout can not be negative");
    }

    public void setRequestBody(PluginCall pluginCall, JSValue jSValue, String str) {
        String str2;
        String requestProperty = this.connection.getRequestProperty(HttpRequest.HEADER_CONTENT_TYPE);
        if (requestProperty != null && !requestProperty.isEmpty()) {
            if (requestProperty.contains(HttpRequest.CONTENT_TYPE_JSON)) {
                JSArray jSArray = null;
                String str3 = "";
                if (jSValue != null) {
                    str2 = jSValue.toString();
                } else {
                    jSArray = pluginCall.getArray("data", (JSArray) null);
                    str2 = str3;
                }
                if (jSArray != null) {
                    str2 = jSArray.toString();
                } else if (jSValue == null) {
                    str2 = pluginCall.getString("data");
                }
                if (str2 != null) {
                    str3 = str2;
                }
                writeRequestBody(str3);
                return;
            } else if (str.equals("file")) {
                DataOutputStream dataOutputStream = new DataOutputStream(this.connection.getOutputStream());
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        dataOutputStream.write(Base64.getDecoder().decode(jSValue.toString()));
                    }
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else if (str.equals("formData")) {
                writeFormDataRequestBody(requestProperty, jSValue.toJSArray());
                return;
            } else {
                writeRequestBody(jSValue.toString());
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public void setRequestHeaders(JSObject jSObject) {
        Iterator<String> keys = jSObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.connection.setRequestProperty(next, jSObject.getString(next));
        }
    }

    public void setRequestMethod(String str) {
        this.connection.setRequestMethod(str);
    }

    public void setSSLSocketFactory(Bridge bridge) {
        try {
            Class<?> cls = Class.forName("io.ionic.sslpinning.SSLPinning");
            SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) cls.getDeclaredMethod("getSSLSocketFactory", new Class[]{Bridge.class}).invoke(cls.newInstance(), new Object[]{bridge});
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) this.connection).setSSLSocketFactory(sSLSocketFactory);
            }
        } catch (Exception unused) {
        }
    }
}
