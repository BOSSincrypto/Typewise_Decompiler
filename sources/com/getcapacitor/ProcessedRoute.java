package com.getcapacitor;

public class ProcessedRoute {
    private boolean ignoreAssetPath;
    private boolean isAsset;
    private String path;

    public String getPath() {
        return this.path;
    }

    public boolean isAsset() {
        return this.isAsset;
    }

    public boolean isIgnoreAssetPath() {
        return this.ignoreAssetPath;
    }

    public void setAsset(boolean z3) {
        this.isAsset = z3;
    }

    public void setIgnoreAssetPath(boolean z3) {
        this.ignoreAssetPath = z3;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
