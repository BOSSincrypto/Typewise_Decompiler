package com.silkimen.http;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class TLSSocketFactory extends SSLSocketFactory {
    private List<String> blacklistedProtocols = new ArrayList();
    private SSLSocketFactory delegate;

    public TLSSocketFactory(SSLContext sSLContext, String[] strArr) {
        this.delegate = sSLContext.getSocketFactory();
        for (String trim : strArr) {
            this.blacklistedProtocols.add(trim.trim());
        }
    }

    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < supportedProtocols.length; i4++) {
                if (!this.blacklistedProtocols.contains(supportedProtocols[i4])) {
                    arrayList.add(supportedProtocols[i4]);
                }
            }
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    public Socket createSocket(Socket socket, String str, int i4, boolean z3) {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, i4, z3));
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i4) {
        return enableTLSOnSocket(this.delegate.createSocket(str, i4));
    }

    public Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) {
        return enableTLSOnSocket(this.delegate.createSocket(str, i4, inetAddress, i5));
    }

    public Socket createSocket(InetAddress inetAddress, int i4) {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i4));
    }

    public Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i4, inetAddress2, i5));
    }
}
