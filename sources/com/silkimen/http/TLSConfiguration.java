package com.silkimen.http;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class TLSConfiguration {
    private String[] blacklistedProtocols = new String[0];
    private HostnameVerifier hostnameVerifier = null;
    private KeyManager[] keyManagers = null;
    private SSLSocketFactory socketFactory;
    private TrustManager[] trustManagers = null;

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public SSLSocketFactory getTLSSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.socketFactory;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(this.keyManagers, this.trustManagers, new SecureRandom());
            TLSSocketFactory tLSSocketFactory = new TLSSocketFactory(instance, this.blacklistedProtocols);
            this.socketFactory = tLSSocketFactory;
            return tLSSocketFactory;
        } catch (GeneralSecurityException e4) {
            IOException iOException = new IOException("Security exception occured while configuring TLS context");
            iOException.initCause(e4);
            throw iOException;
        }
    }

    public void setBlacklistedProtocols(String[] strArr) {
        this.blacklistedProtocols = strArr;
        this.socketFactory = null;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier2) {
        this.hostnameVerifier = hostnameVerifier2;
    }

    public void setKeyManagers(KeyManager[] keyManagerArr) {
        this.keyManagers = keyManagerArr;
        this.socketFactory = null;
    }

    public void setTrustManagers(TrustManager[] trustManagerArr) {
        this.trustManagers = trustManagerArr;
        this.socketFactory = null;
    }
}
