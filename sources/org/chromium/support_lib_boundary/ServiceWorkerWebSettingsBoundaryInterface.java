package org.chromium.support_lib_boundary;

public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    void setAllowContentAccess(boolean z3);

    void setAllowFileAccess(boolean z3);

    void setBlockNetworkLoads(boolean z3);

    void setCacheMode(int i4);
}
