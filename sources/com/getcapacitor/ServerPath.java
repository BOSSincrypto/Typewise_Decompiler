package com.getcapacitor;

public class ServerPath {
    private final String path;
    private final PathType type;

    public enum PathType {
        BASE_PATH,
        ASSET_PATH
    }

    public ServerPath(PathType pathType, String str) {
        this.type = pathType;
        this.path = str;
    }

    public String getPath() {
        return this.path;
    }

    public PathType getType() {
        return this.type;
    }
}
