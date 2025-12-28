package org.apache.cordova;

public final class PluginEntry {
    public final boolean onload;
    public final CordovaPlugin plugin;
    public final String pluginClass;
    public final String service;

    public PluginEntry(String str, CordovaPlugin cordovaPlugin) {
        this(str, cordovaPlugin.getClass().getName(), true, cordovaPlugin);
    }

    public PluginEntry(String str, CordovaPlugin cordovaPlugin, boolean z3) {
        this(str, cordovaPlugin.getClass().getName(), z3, cordovaPlugin);
    }

    public PluginEntry(String str, String str2, boolean z3) {
        this(str, str2, z3, (CordovaPlugin) null);
    }

    private PluginEntry(String str, String str2, boolean z3, CordovaPlugin cordovaPlugin) {
        this.service = str;
        this.pluginClass = str2;
        this.onload = z3;
        this.plugin = cordovaPlugin;
    }
}
