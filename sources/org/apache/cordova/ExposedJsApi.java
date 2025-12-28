package org.apache.cordova;

public interface ExposedJsApi {
    String exec(int i4, String str, String str2, String str3, String str4);

    String retrieveJsMessages(int i4, boolean z3);

    void setNativeToJsBridgeMode(int i4, int i5);
}
